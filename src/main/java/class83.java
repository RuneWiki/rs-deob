import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class83 implements Runnable {

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    private int field1271 = 0;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    private int field1277 = 0;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Z")
    private boolean field1262 = false;

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "Z")
    private boolean field1288 = false;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Ljava/net/Socket;")
    private Socket field1267;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Lmd;")
    private class239 field1265;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Ljava/io/InputStream;")
    private InputStream field1268;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1279;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Z")
    public static boolean field1263 = false;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field1276 = new String[1000];

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "Z")
    public static boolean field1280 = false;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1264 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "Ljf;")
    public static class216 field1290 = new class216(64);

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "I")
    public static int field1291 = 0;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Lvk;")
    private class160 field1261;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "[B")
    private byte[] field1273;

    @OriginalMember(owner = "client!ua", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1266++;
        this.method567(0);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)I")
    public final int method558(int arg0) throws IOException {
        field1272++;
        if (arg0 != -23644) {
            this.field1262 = false;
        }
        return this.field1262 ? 0 : this.field1268.available();
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
    public final void method559(int arg0) {
        field1269++;
        if (this.field1262) {
            return;
        }
        this.field1268 = new class209();
        this.field1279 = new class36();
        if (arg0 != 5000) {
            method561(-50, (int[][]) null);
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
    public final void method560(int arg0) throws IOException {
        field1285++;
        if (this.field1262) {
            return;
        }
        if (this.field1288) {
            this.field1288 = false;
            throw new IOException();
        } else if (arg0 != -9634) {
            field1264 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field1277 == this.field1271) {
                            if (this.field1262) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field1271 <= this.field1277) {
                            var2 = this.field1277 - this.field1271;
                        } else {
                            var2 = 5000 - this.field1271;
                        }
                        var3 = this.field1271;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field1279.write(this.field1273, var3, var2);
                    } catch (IOException var9) {
                        this.field1288 = true;
                    }
                    this.field1271 = (this.field1271 + var2) % 5000;
                    try {
                        if (this.field1277 == this.field1271) {
                            this.field1279.flush();
                        }
                    } catch (IOException var8) {
                        this.field1288 = true;
                    }
                    continue;
                }
                try {
                    if (this.field1268 != null) {
                        this.field1268.close();
                    }
                    if (this.field1279 != null) {
                        this.field1279.close();
                    }
                    if (this.field1267 != null) {
                        this.field1267.close();
                    }
                } catch (IOException var7) {
                }
                this.field1273 = null;
                break;
            }
        } catch (Exception var12) {
            class285.method1952(var12, (byte) 71, (String) null);
        }
        field1275++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[[I)V")
    public static final void method561(int arg0, int[][] arg1) {
        if (arg0 != -25851) {
            method568(70);
        }
        class78.field1180 = arg1;
        field1270++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[BII)V")
    public final void method562(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field1278++;
        if (this.field1262) {
            return;
        }
        if (this.field1288) {
            this.field1288 = false;
            throw new IOException();
        }
        if (this.field1273 == null) {
            this.field1273 = new byte[5000];
        }
        synchronized (this) {
            int var6 = 85 % ((arg3 - 36) / 37);
            for (int var7 = 0; var7 < arg0; var7++) {
                this.field1273[this.field1277] = arg1[arg2 + var7];
                this.field1277 = (this.field1277 + 1) % 5000;
                if ((this.field1271 + 4900) % 5000 == this.field1277) {
                    throw new IOException();
                }
            }
            if (this.field1261 == null) {
                this.field1261 = this.field1265.method1684(0, this, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/String;ZII)Z")
    public static final boolean method563(String arg0, boolean arg1, int arg2, int arg3) {
        field1287++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var10 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var10 == '-') {
                    var4 = true;
                    continue;
                }
                if (var10 == '+' && arg1) {
                    continue;
                }
            }
            int var12;
            if (var10 >= '0' && var10 <= '9') {
                var12 = var10 - '0';
            } else if (var10 >= 'A' && var10 <= 'Z') {
                var12 = var10 - '7';
            } else if (var10 >= 'a' && var10 <= 'z') {
                var12 = var10 - 'W';
            } else {
                return false;
            }
            if (arg3 <= var12) {
                return false;
            }
            if (var4) {
                var12 = -var12;
            }
            int var11 = arg3 * var6 + var12;
            if ((var11 / arg3) != var6) {
                return false;
            }
            var5 = true;
            var6 = var11;
        }
        int var9 = 59 / ((arg2 + 17) / 52);
        return var5;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLvl;Lvl;)V")
    public static final void method564(byte arg0, class73 arg1, class73 arg2) {
        if (arg0 <= 68) {
            field1276 = null;
        }
        int var3 = (int) (Math.random() * 21.0D) - 10;
        field1282++;
        class140.field2002 = arg2;
        class297.field4738 = arg1;
        int var4 = (int) (Math.random() * 21.0D) - 10;
        class140.field2002.method481(2688, 34);
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 41.0D) - 20;
        class24.field304 = var5 + var6;
        class303.field4817 = var3 + var6;
        class182.field2867 = var4 + var6;
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V")
    public static final void method565(int arg0) {
        class121.field1741 = arg0;
        class31.field380 = 0;
        field1284++;
        class79.field1198 = -1;
        class3.field43 = 0;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[BZI)V")
    public final void method566(int arg0, byte[] arg1, boolean arg2, int arg3) throws IOException {
        if (arg2) {
            method565(73);
        }
        field1289++;
        if (this.field1262) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field1268.read(arg1, arg3, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg0 -= var5;
            arg3 += var5;
        }
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)V")
    public final void method567(int arg0) {
        field1281++;
        if (this.field1262 || arg0 != 0) {
            return;
        }
        synchronized (this) {
            this.field1262 = true;
            this.notifyAll();
        }
        if (this.field1261 != null) {
            while (this.field1261.field2399 == 0) {
                class7.method43(-73, 1L);
            }
            if (this.field1261.field2399 == 1) {
                try {
                    ((Thread) this.field1261.field2401).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field1261 = null;
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)V")
    public static void method568(int arg0) {
        field1290 = null;
        field1276 = null;
        field1264 = null;
        int var1 = 114 % ((arg0 - 6) / 41);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLol;II)V")
    public static final void method569(byte arg0, class220 arg1, int arg2, int arg3) {
        class249.field4048.method1544((byte) 43);
        if (arg0 != 46) {
            return;
        }
        field1286++;
        if (class86.field1316) {
            return;
        }
        for (class138 var4 = (class138) arg1.method1548(arg0 ^ 0x2E); var4 != null; var4 = (class138) arg1.method1549(-83)) {
            class152 var5 = class136.method863(var4.field1987, 0);
            if (class40.method229(-69, var5)) {
                class214.method1496(var4, var5, arg2, (byte) -115, arg3);
                if (var4.field1993) {
                    class206.method1417(var5, -4, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B[I[I[ILaj;)V")
    public static final void method570(byte arg0, int[] arg1, int[] arg2, int[] arg3, class1 arg4) {
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg3[var5];
            int var8 = arg2[var5];
            for (int var9 = 0; var8 != 0 && arg4.field3951.length > var9; var9++) {
                if ((var8 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg4.field3951[var9] = null;
                    } else {
                        class57 var10 = class174.method1241(15, var6);
                        int var11 = var10.field839;
                        class282 var12 = arg4.field3951[var9];
                        if (var12 != null) {
                            if (var12.field4586 == var6) {
                                if (var11 == 0) {
                                    var12 = arg4.field3951[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field4588 = 0;
                                    var12.field4589 = 0;
                                    var12.field4585 = var7;
                                    var12.field4584 = 1;
                                    var12.field4594 = 0;
                                    class173.method1240(arg4.field3915, arg4.field3920, -9160, class214.field3347 == arg4, var10, 0);
                                } else if (var11 == 2) {
                                    var12.field4594 = 0;
                                }
                            } else if (var10.field833 >= class174.method1241(-125, var12.field4586).field833) {
                                var12 = arg4.field3951[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class282 var13 = arg4.field3951[var9] = new class282();
                            var13.field4588 = 0;
                            var13.field4584 = 1;
                            var13.field4594 = 0;
                            var13.field4586 = var6;
                            var13.field4585 = var7;
                            var13.field4589 = 0;
                            class173.method1240(arg4.field3915, arg4.field3920, -9160, class214.field3347 == arg4, var10, 0);
                        }
                    }
                }
                var8 >>>= 0x1;
            }
        }
        field1274++;
        if (arg0 <= 61) {
            method568(18);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)I")
    public final int method571(boolean arg0) throws IOException {
        field1283++;
        if (!arg0) {
            method563((String) null, true, -59, 72);
        }
        return this.field1262 ? 0 : this.field1268.read();
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Ljava/net/Socket;Lmd;)V")
    public class83(Socket arg0, class239 arg1) throws IOException {
        this.field1267 = arg0;
        this.field1265 = arg1;
        this.field1267.setSoTimeout(30000);
        this.field1267.setTcpNoDelay(true);
        this.field1268 = this.field1267.getInputStream();
        this.field1279 = this.field1267.getOutputStream();
    }
}

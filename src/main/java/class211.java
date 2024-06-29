import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class211 implements Runnable {

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    private int field3600 = 0;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "Z")
    private boolean field3611 = false;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    private int field3620 = 0;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "Z")
    private boolean field3619 = false;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "Ljava/net/Socket;")
    private Socket field3606;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "Lmi;")
    private class100 field3613;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "Ljava/io/InputStream;")
    private InputStream field3604;

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3626;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field3598 = 0;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "[I")
    public static int[] field3610 = new int[128];

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "[I")
    public static int[] field3605 = new int[5];

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public static int field3614 = 0;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "Lia;")
    private static class257 field3621 = class28.method234(-67, "Loaded update list");

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static volatile int field3607 = 0;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "Lia;")
    public static class257 field3616 = field3621;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "Lfa;")
    private class176 field3625;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "[B")
    private byte[] field3602;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static final void method1415(int arg0) {
        field3615++;
        if (class186.field3230 == null) {
            return;
        }
        try {
            if (arg0 >= -89) {
                method1417(false, (class178) null);
            }
            byte[] var1 = class186.field3230.method1247(103);
            if (var1 != null) {
                class152 var2 = new class152(var1);
                class258.field4485 = var2.method1063(-17162);
                class171.field2936 = new class132[class258.field4485];
                for (int var3 = 0; var3 < class258.field4485; var3++) {
                    class132 var4 = class171.field2936[var3] = new class132();
                    int var5 = var2.method1063(-17162);
                    var4.field2364 = (var5 & 0x8000) != 0;
                    var4.field2375 = var5 & 0x7FFF;
                    var4.field2367 = var2.method1039(1995);
                    var4.field2361 = var2.method1075(-7903);
                    var4.field2370 = var3;
                    var4.field2359 = class179.method1232(false, var2.method1063(-17162));
                }
                class175.method1187((byte) 72, 0, class171.field2936.length - 1, class171.field2936);
                class186.field3230 = null;
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class186.field3230 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIILk;IIIZI)V")
    public static final void method1416(int arg0, int arg1, int arg2, class152 arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        field3617++;
        if (arg2 >= 0 && arg2 < 104 && arg0 >= 0 && arg0 < 104) {
            if (!arg7) {
                class233.field4007[arg1][arg2][arg0] = 0;
            }
            while (true) {
                int var9 = arg3.method1051((byte) 114);
                if (var9 == 0) {
                    if (arg7) {
                        class243.field4208[0][arg2][arg0] = class159.field2793[0][arg2][arg0];
                    } else if (arg1 == 0) {
                        class243.field4208[0][arg2][arg0] = -class189.method1272(83, arg5 + arg2 + 932731, 556238 - -arg0 + arg8) * 8;
                    } else {
                        class243.field4208[arg1][arg2][arg0] = class243.field4208[arg1 - 1][arg2][arg0] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg3.method1051((byte) 94);
                    if (arg7) {
                        class243.field4208[0][arg2][arg0] = var10 * 8 + class159.field2793[0][arg2][arg0];
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg1 == 0) {
                            class243.field4208[0][arg2][arg0] = -var10 * 8;
                        } else {
                            class243.field4208[arg1][arg2][arg0] = class243.field4208[arg1 - 1][arg2][arg0] - (var10 * 8);
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class131.field2346[arg1][arg2][arg0] = arg3.method1060((byte) -58);
                    class21.field442[arg1][arg2][arg0] = (byte) ((var9 - 2) / 4);
                    class185.field3216[arg1][arg2][arg0] = (byte) class30.method252(3, arg4 + var9 - 2);
                } else if (var9 > 81) {
                    class102.field1898[arg1][arg2][arg0] = (byte) (var9 - 81);
                } else if (!arg7) {
                    class233.field4007[arg1][arg2][arg0] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg3.method1051((byte) -37);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg3.method1051((byte) -70);
                    break;
                }
                if (var11 <= 49) {
                    arg3.method1051((byte) 98);
                }
            }
        }
        if (arg6 != -29601) {
            method1417(true, (class178) null);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZLmb;)V")
    public static final void method1417(boolean arg0, class178 arg1) {
        if (!arg0) {
            method1420(-94);
        }
        class182.field3169 = arg1.method1211(class243.field4211, (byte) -93);
        client.field1531 = arg1.method1211(class165.field2885, (byte) -86);
        class183.field3190 = arg1.method1211(class5.field137, (byte) -116);
        field3618++;
        class230.field3859 = arg1.method1211(class256.field4380, (byte) -116);
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)Lte;")
    public static final class184 method1418(int arg0) {
        int var1 = class72.field1411[0] * class193.field3287[0];
        field3627++;
        byte[] var2 = class137.field2454[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class3.field92[class30.method252(var2[var4], 255)];
        }
        class190 var5 = new class190(class20.field427, class9.field184, class57.field1212[0], class154.field2701[0], class72.field1411[0], class193.field3287[0], var3);
        if (arg0 != -10785) {
            method1417(true, (class178) null);
        }
        class126.method875(false);
        return var5;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II[BI)V")
    public final void method1419(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3608++;
        if (this.field3619) {
            return;
        }
        if (this.field3611) {
            this.field3611 = false;
            throw new IOException();
        }
        if (this.field3602 == null) {
            this.field3602 = new byte[5000];
        }
        synchronized (this) {
            int var6 = -115 % ((arg3 - 84) / 35);
            for (int var7 = 0; var7 < arg0; var7++) {
                this.field3602[this.field3620] = arg2[arg1 + var7];
                this.field3620 = (this.field3620 + 1) % 5000;
                if (((this.field3600 + 4900) % 5000) == this.field3620) {
                    throw new IOException();
                }
            }
            if (this.field3625 == null) {
                this.field3625 = this.field3613.method710(this, (byte) -121, 3);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V")
    public static void method1420(int arg0) {
        field3610 = null;
        field3621 = null;
        if (arg0 > 118) {
            field3616 = null;
            field3605 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
    public final void method1421(byte arg0) {
        field3622++;
        if (this.field3619) {
            return;
        }
        if (arg0 <= 82) {
            this.field3611 = false;
        }
        synchronized (this) {
            this.field3619 = true;
            this.notifyAll();
        }
        if (this.field3625 != null) {
            while (this.field3625.field3000 == 0) {
                class33.method283(-31, 1L);
            }
            if (this.field3625.field3000 == 1) {
                try {
                    ((Thread) this.field3625.field3001).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field3625 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)Lve;")
    public static final class115 method1422(int arg0, int arg1, int arg2) {
        class177 var3 = class75.field1463[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class115 var4 = var3.field3016;
            var3.field3016 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)I")
    public final int method1423(byte arg0) throws IOException {
        int var2 = -113 / ((-arg0 - 10) / 51);
        field3624++;
        return this.field3619 ? 0 : this.field3604.available();
    }

    @OriginalMember(owner = "client!ba", name = "run", descriptor = "()V")
    public final void run() {
        field3623++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field3620 == this.field3600) {
                        if (this.field3619) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    if (this.field3600 <= this.field3620) {
                        var2 = this.field3620 - this.field3600;
                    } else {
                        var2 = 5000 - this.field3600;
                    }
                    var3 = this.field3600;
                }
                if (var2 > 0) {
                    try {
                        this.field3626.write(this.field3602, var3, var2);
                    } catch (IOException var9) {
                        this.field3611 = true;
                    }
                    this.field3600 = (this.field3600 + var2) % 5000;
                    try {
                        if (this.field3620 == this.field3600) {
                            this.field3626.flush();
                        }
                    } catch (IOException var8) {
                        this.field3611 = true;
                    }
                }
            }
            try {
                if (this.field3604 != null) {
                    this.field3604.close();
                }
                if (this.field3626 != null) {
                    this.field3626.close();
                }
                if (this.field3606 != null) {
                    this.field3606.close();
                }
            } catch (IOException var7) {
            }
            this.field3602 = null;
        } catch (Exception var12) {
            class198.method1325((String) null, var12, -19);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([BIIB)V")
    public final void method1424(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        if (arg3 > -57) {
            return;
        }
        field3609++;
        if (this.field3619) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field3604.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)I")
    public final int method1425(int arg0) throws IOException {
        field3603++;
        if (arg0 != 0) {
            field3614 = -92;
        }
        return this.field3619 ? 0 : this.field3604.read();
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)Z")
    public static final boolean method1426(byte arg0) {
        field3599++;
        class111 var1 = class27.field524;
        synchronized (class27.field524) {
            if (class37.field738 == class258.field4489) {
                return false;
            }
            class25.field486 = class81.field1581[class258.field4489];
            class128.field2273 = class82.field1597[class258.field4489];
            class258.field4489 = class258.field4489 + 1 & 0x7F;
            if (arg0 >= -70) {
                method1415(-65);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ba", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field3601++;
        this.method1421((byte) 126);
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Ljava/net/Socket;Lmi;)V")
    public class211(Socket arg0, class100 arg1) throws IOException {
        this.field3606 = arg0;
        this.field3613 = arg1;
        this.field3606.setSoTimeout(30000);
        this.field3606.setTcpNoDelay(true);
        this.field3604 = this.field3606.getInputStream();
        this.field3626 = this.field3606.getOutputStream();
    }
}

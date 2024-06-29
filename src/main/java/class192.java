import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class192 {

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "Lph;")
    private class32 field3257 = null;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "Lph;")
    private class32 field3266 = null;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    private int field3270 = 65000;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    private int field3263;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "Lub;")
    public static class227 field3269 = class257.method1749("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", 17263);

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "Luh;")
    public static class198 field3256 = new class198();

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "I")
    public static int field3272 = 0;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
    public static int field3271 = 1;

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "Z")
    public static boolean field3273 = false;

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "I")
    public static int field3274 = 0;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "Lbe;")
    public static class74 field3258;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static final void method1218(int arg0) {
        field3264++;
        if (arg0 != -17632) {
            field3272 = 11;
        }
        int var1 = 0;
        int[] var2 = new int[class4.field83];
        for (int var3 = 0; var3 < class4.field83; var3++) {
            class178 var5 = class133.method815(var3, (byte) -70);
            if (var5.field3050 >= 0 || var5.field3008 >= 0) {
                var2[var1++] = var3;
            }
        }
        class72.field1266 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            class72.field1266[var4] = var2[var4];
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZII[BI)Z")
    private final boolean method1219(boolean arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        field3268++;
        if (arg1 != 23669) {
            return false;
        }
        class32 var6 = this.field3266;
        synchronized (this.field3266) {
            try {
                int var8;
                if (arg0) {
                    if ((long) (arg2 * 6 + 6) > this.field3257.method159(arg1 - 23754)) {
                        return false;
                    }
                    this.field3257.method161((long) (arg2 * 6), false);
                    this.field3257.method162(-115, 6, class232.field4047, 0);
                    var8 = (class232.field4047[4] & 0xFF << 8) + ((class232.field4047[3] & 0xFF) << 16) + (class232.field4047[5] & 0xFF);
                    if (var8 <= 0 || ((long) var8) > (this.field3266.method159(-126) / 520L)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field3266.method159(-122) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class232.field4047[4] = (byte) (var8 >> 8);
                class232.field4047[3] = (byte) (var8 >> 16);
                class232.field4047[5] = (byte) var8;
                int var10 = 0;
                int var11 = 0;
                class232.field4047[0] = (byte) (arg4 >> 16);
                class232.field4047[2] = (byte) arg4;
                class232.field4047[1] = (byte) (arg4 >> 8);
                this.field3257.method161((long) (arg2 * 6), false);
                this.field3257.method169(arg1 - 53670, 0, class232.field4047, 6);
                while (var10 < arg4) {
                    int var12 = 0;
                    if (arg0) {
                        label109: {
                            this.field3266.method161((long) (var8 * 520), false);
                            try {
                                this.field3266.method162(-109, 8, class232.field4047, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            int var13 = ((class232.field4047[0] & 0xFF) << 8) + (class232.field4047[1] & 0xFF);
                            int var14 = (class232.field4047[2] & 0xFF << 8) + (class232.field4047[3] & 0xFF);
                            int var15 = class232.field4047[7] & 0xFF;
                            var12 = (class232.field4047[5] & 0xFF << 8) + (((class232.field4047[4] & 0xFF) << 16) + (class232.field4047[6] & 0xFF));
                            if (arg2 == var13 && var11 == var14 && this.field3263 == var15) {
                                if (var12 >= 0 && (this.field3266.method159(arg1 ^ 0xFFFFA3F5) / 520L) >= ((long) var12)) {
                                    break label109;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field3266.method159(-118) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        arg0 = false;
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    class232.field4047[3] = (byte) var11;
                    class232.field4047[0] = (byte) (arg2 >> 8);
                    int var18 = arg4 - var10;
                    class232.field4047[7] = (byte) this.field3263;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class232.field4047[2] = (byte) (var11 >> 8);
                    class232.field4047[1] = (byte) arg2;
                    if (arg4 - var10 <= 512) {
                        var12 = 0;
                    }
                    class232.field4047[5] = (byte) (var12 >> 8);
                    class232.field4047[6] = (byte) var12;
                    class232.field4047[4] = (byte) (var12 >> 16);
                    this.field3266.method161((long) (var8 * 520), false);
                    this.field3266.method169(-30001, 0, class232.field4047, 8);
                    var8 = var12;
                    this.field3266.method169(-30001, var10, arg3, var18);
                    var10 += var18;
                    var11++;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1220(int arg0, Throwable arg1) throws IOException {
        String var2;
        if ((arg1 instanceof class69)) {
            class69 var3 = (class69) arg1;
            arg1 = var3.field1218;
            var2 = var3.field1220 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        field3262++;
        arg1.printStackTrace(var5);
        if (arg0 != 0) {
            return null;
        }
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)[B")
    public final byte[] method1221(int arg0, int arg1) {
        field3260++;
        class32 var3 = this.field3266;
        synchronized (this.field3266) {
            try {
                if (this.field3257.method159(-120) < (long) (arg0 * 6 + 6)) {
                    return null;
                }
                this.field3257.method161((long) (arg0 * 6), false);
                this.field3257.method162(-122, 6, class232.field4047, 0);
                int var5 = (class232.field4047[2] & 0xFF) + (class232.field4047[1] & 0xFF << 8) + (class232.field4047[0] & 0xFF << 16);
                int var6 = ((class232.field4047[3] & 0xFF) << 16) - (-(class232.field4047[4] & 0xFF << 8) - (class232.field4047[5] & 0xFF));
                if (var5 < 0 || this.field3270 < var5) {
                    return null;
                } else if (var6 > 0 && this.field3266.method159(-80) / 520L >= (long) var6) {
                    if (arg1 < 3) {
                        this.method1219(true, -86, -64, (byte[]) null, 85);
                    }
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    label74: while (var5 > var11) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field3266.method161((long) (var6 * 520), false);
                        int var13 = var5 - var11;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3266.method162(-124, var13 + 8, class232.field4047, 0);
                        int var14 = (class232.field4047[0] & 0xFF << 8) + (class232.field4047[1] & 0xFF);
                        int var15 = (class232.field4047[2] & 0xFF << 8) + (class232.field4047[3] & 0xFF);
                        int var16 = ((class232.field4047[4] & 0xFF) << 16) + ((class232.field4047[5] & 0xFF) << 8) + (class232.field4047[6] & 0xFF);
                        int var17 = class232.field4047[7] & 0xFF;
                        if (arg0 == var14 && var10 == var15 && this.field3263 == var17) {
                            if (var16 >= 0 && (this.field3266.method159(-114) / 520L) >= ((long) var16)) {
                                var6 = var16;
                                var10++;
                                int var20 = 0;
                                while (true) {
                                    if (var20 >= var13) {
                                        continue label74;
                                    }
                                    var9[var11++] = class232.field4047[var20 + 8];
                                    var20++;
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIB[B)Z")
    public final boolean method1222(int arg0, int arg1, byte arg2, byte[] arg3) {
        field3255++;
        int var5 = 84 / ((24 - arg2) / 53);
        class32 var6 = this.field3266;
        synchronized (this.field3266) {
            if (arg0 < 0 || this.field3270 < arg0) {
                throw new IllegalArgumentException();
            }
            boolean var7 = this.method1219(true, 23669, arg1, arg3, arg0);
            if (!var7) {
                var7 = this.method1219(false, 23669, arg1, arg3, arg0);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!jk", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3265++;
        return "Cache:" + this.field3263;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZZ)V")
    public static final void method1223(boolean arg0, boolean arg1) {
        if (!arg1) {
            method1224((byte) -42);
        }
        field3261++;
        if (class149.field2596 == null) {
            return;
        }
        try {
            class226 var2 = new class226(4);
            var2.method1443(arg0 ? 2 : 3, 0);
            var2.method1429(124, 0);
            class149.field2596.method94(4, (byte) -24, var2.field3901, 0);
        } catch (IOException var4) {
            try {
                class149.field2596.method97(0);
            } catch (Exception var3) {
            }
            class29.field469++;
            class149.field2596 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
    public static void method1224(byte arg0) {
        if (arg0 <= -61) {
            field3256 = null;
            field3258 = null;
            field3269 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(ILph;Lph;I)V")
    public class192(int arg0, class32 arg1, class32 arg2, int arg3) {
        this.field3270 = arg3;
        this.field3257 = arg2;
        this.field3266 = arg1;
        this.field3263 = arg0;
    }
}

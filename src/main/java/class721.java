import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class721 {

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "Ldg;")
    public class416 field10032 = new class416();

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "I")
    public static int field10041 = -1;

    @OriginalMember(owner = "client!dr", name = "m", descriptor = "I")
    public static int field10044 = -1;

    @OriginalMember(owner = "client!dr", name = "n", descriptor = "[Lrs;")
    public static class653[] field10045 = new class653[0];

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "Lkaa;")
    public static class47 field10034 = new class47(16, 12);

    @OriginalMember(owner = "client!dr", name = "p", descriptor = "Ljava/lang/String;")
    public static String field10047;

    @OriginalMember(owner = "client!dr", name = "s", descriptor = "Ljava/lang/String;")
    public static String field10050;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "I")
    public static int field10033;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "I")
    public static int field10035;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "I")
    public static int field10036;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
    public static int field10037;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "I")
    public static int field10038;

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
    public static int field10039;

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "I")
    public static int field10040;

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "I")
    public static int field10042;

    @OriginalMember(owner = "client!dr", name = "l", descriptor = "I")
    public static int field10043;

    @OriginalMember(owner = "client!dr", name = "o", descriptor = "I")
    public static int field10046;

    @OriginalMember(owner = "client!dr", name = "q", descriptor = "I")
    public static int field10048;

    @OriginalMember(owner = "client!dr", name = "r", descriptor = "Ldg;")
    private class416 field10049;

    static {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception var11) {
        }
        var0.toLowerCase();
        String var1 = "Unknown";
        try {
            var1 = System.getProperty("java.version").toLowerCase();
        } catch (Exception var10) {
        }
        var1.toLowerCase();
        String var2 = "Unknown";
        try {
            var2 = System.getProperty("os.name").toLowerCase();
        } catch (Exception var9) {
        }
        field10047 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field10050 = var3.toLowerCase();
        String var4 = "Unknown";
        try {
            var4 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var7) {
        }
        var4.toLowerCase();
        String var5 = "~/";
        try {
            var5 = System.getProperty("user.home").toLowerCase();
        } catch (Exception var6) {
        }
        new File(var5);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILka;ILha;IIIIIIILla;BI)Lka;", line = 8)
    public static final class475 method4048(int arg0, class475 arg1, int arg2, class59 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class456 arg11, byte arg12, int arg13) {
        field10036++;
        if (arg12 >= -51) {
            field10045 = null;
        }
        if (arg1 == null) {
            return null;
        }
        int var14 = 2055;
        if (arg11 != null) {
            int var15 = var14 | arg11.method2596((byte) -48, false, arg6, -1);
            var14 = var15 & 0xFFFFFDFF;
        }
        long var16 = ((long) arg13 << 48) + ((long) ((arg8 << 16) + arg2 + (arg9 << 24)) + ((long) arg10 << 32));
        class65 var18 = class573.field7516;
        class475 var19;
        synchronized (class573.field7516) {
            var19 = (class475) class573.field7516.method552(4, var16);
        }
        if (var19 == null || arg3.method405(var19.method214(), var14) != 0) {
            if (var19 != null) {
                var14 = arg3.method410(var14, var19.method214());
            }
            byte var20;
            if (arg2 == 1) {
                var20 = 9;
            } else if (arg2 == 2) {
                var20 = 12;
            } else if (arg2 == 3) {
                var20 = 15;
            } else if (arg2 == 4) {
                var20 = 18;
            } else {
                var20 = 21;
            }
            byte var21 = 3;
            int[] var22 = new int[] { 64, 96, 128 };
            class538 var23 = new class538(var20 * var21 + 1, var21 * 2 * var20 + -var20, 0);
            int var24 = var23.method2984(1, 0, 0, 0);
            int[][] var25 = new int[var21][var20];
            for (int var26 = 0; var26 < var21; var26++) {
                int var27 = var22[var26];
                int var28 = var22[var26];
                for (int var29 = 0; var29 < var20; var29++) {
                    int var30 = (var29 << 14) / var20;
                    int var31 = class451.field6174[var30] * var27 >> 14;
                    int var32 = class451.field6177[var30] * var28 >> 14;
                    var25[var26][var29] = var23.method2984(1, var31, var32, 0);
                }
            }
            for (int var33 = 0; var33 < var21; var33++) {
                int var34 = (var33 * 256 + 128) / var21;
                int var35 = 256 - var34;
                byte var36 = (byte) (arg8 * var35 + arg9 * var34 >> 8);
                short var37 = (short) (((arg10 & 0x7F) * var35 + (arg13 & 0x7F) * var34 & 0x7F00) + ((arg10 & 0x380) * var35 + (arg13 & 0x380) * var34 & 0x38000) + ((arg10 & 0xFC00) * var35 + (arg13 & 0xFC00) * var34 & 0xFC0000) >> 8);
                for (int var38 = 0; var38 < var20; var38++) {
                    if (var33 == 0) {
                        var23.method2980((byte) -85, (byte) -1, var36, (byte) 1, (short) -1, var25[0][(var38 + 1) % var20], var37, var25[0][var38], var24);
                    } else {
                        var23.method2980((byte) -85, (byte) -1, var36, (byte) 1, (short) -1, var25[var33 - 1][(var38 + 1) % var20], var37, var25[var33][(var38 + 1) % var20], var25[var33 - 1][var38]);
                        var23.method2980((byte) -85, (byte) -1, var36, (byte) 1, (short) -1, var25[var33][(var38 + 1) % var20], var37, var25[var33][var38], var25[var33 - 1][var38]);
                    }
                }
            }
            var19 = arg3.method401(var23, var14, class317.field4518, 64, 768);
            class65 var39 = class573.field7516;
            synchronized (class573.field7516) {
                class573.field7516.method556((byte) 0, var16, var19);
            }
        }
        int var40 = arg1.method211();
        int var41 = arg1.method175();
        int var42 = arg1.method217();
        int var43 = arg1.method205();
        class37 var44 = null;
        if (arg11 != null) {
            int var45 = arg11.field6229[arg6];
            var44 = class509.field6780.method661(-21, var45 >> 16);
            arg6 = var45 & 0xFFFF;
        }
        class475 var46;
        if (var44 == null) {
            var46 = var19.method171((byte) 3, var14, true);
            var46.method183(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method188(var40 + var41 >> 1, 0, var42 + var43 >> 1);
        } else {
            var46 = var19.method171((byte) 3, var14, true);
            var46.method183(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method188(var40 + var41 >> 1, 0, var42 + var43 >> 1);
            var46.method2674(var44, (byte) -117, arg6);
        }
        if (arg5 != 0) {
            var46.method143(arg5);
        }
        if (arg0 != 0) {
            var46.method210(arg0);
        }
        if (arg4 != 0) {
            var46.method188(0, arg4, 0);
        }
        return var46;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Z)Ldg;", line = 179)
    public final class416 method4049(boolean arg0) {
        field10038++;
        class416 var2 = this.field10049;
        if (this.field10032 == var2) {
            this.field10049 = null;
            return null;
        } else {
            this.field10049 = var2.field5748;
            return arg0 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ldg;I)V", line = 200)
    public final void method4050(class416 arg0, int arg1) {
        if (arg0.field5744 != null) {
            arg0.method2414((byte) -26);
        }
        field10035++;
        arg0.field5744 = this.field10032.field5744;
        if (arg1 > -105) {
            this.method4056(48);
        }
        arg0.field5748 = this.field10032;
        arg0.field5744.field5748 = arg0;
        arg0.field5748.field5744 = arg0;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)Ldg;", line = 218)
    public final class416 method4051(int arg0) {
        field10040++;
        class416 var2 = this.field10032.field5748;
        if (this.field10032 == var2) {
            this.field10049 = null;
            return null;
        } else {
            this.field10049 = var2.field5748;
            return arg0 == 896 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(BII)Z", line = 241)
    public static final boolean method4052(byte arg0, int arg1, int arg2) {
        int var3 = -46 % ((arg0 + 60) / 60);
        field10033++;
        return (arg2 & 0x70000) != 0 | class614.method3342(arg2, arg1, 3828) || class601.method3269(arg2, arg1, (byte) 8);
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)I", line = 251)
    public final int method4053(int arg0) {
        field10048++;
        if (arg0 <= 17) {
            method4058((byte) 63, 6, -46, 125, 116);
        }
        int var2 = 0;
        class416 var3 = this.field10032.field5748;
        while (this.field10032 != var3) {
            var3 = var3.field5748;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "()V", line = 455)
    public class721() {
        this.field10032.field5744 = this.field10032;
        this.field10032.field5748 = this.field10032;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIB)V", line = 282)
    public static final void method4054(int arg0, int arg1, byte arg2) {
        field10039++;
        class663.field8853 = arg0 - class744.field10371;
        class347.field4871 = arg1 - class744.field10370;
        if (arg2 != -87) {
            method4059(-53);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V", line = 303)
    public final void method4055(byte arg0) {
        field10042++;
        if (arg0 != -74) {
            return;
        }
        while (true) {
            class416 var2 = this.field10032.field5748;
            if (this.field10032 == var2) {
                this.field10049 = null;
                return;
            }
            var2.method2414((byte) -26);
        }
    }

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "(I)Ldg;", line = 327)
    public final class416 method4056(int arg0) {
        field10037++;
        class416 var2 = this.field10032.field5748;
        if (this.field10032 == var2) {
            return null;
        } else if (arg0 == 896) {
            var2.method2414((byte) -26);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(BIZ)V", line = 345)
    public static final void method4057(byte arg0, int arg1, boolean arg2) {
        if (arg2) {
            class583 var3 = class381.method2246(1, class128.field2105, class670.field9143);
            var3.field7637.method3831(1182, arg1);
            class42.method309(var3, 0);
        } else {
            class182.method1258(class79.field955, arg1, -1);
        }
        field10043++;
        if (arg0 >= -19) {
            field10044 = 114;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(BIIII)V", line = 373)
    public static final void method4058(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class687.field9582 = arg3;
        class87.field1055 = arg4;
        if (arg0 == 41) {
            field10046++;
            class668.field9126 = arg1;
            class307.field4419 = arg2;
        }
    }

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "(I)V", line = 393)
    public static void method4059(int arg0) {
        field10034 = null;
        field10045 = null;
        field10047 = null;
        if (arg0 != -1) {
            method4057((byte) 20, 71, true);
        }
        field10050 = null;
    }
}

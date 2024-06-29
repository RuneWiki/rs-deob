import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class49 extends class143 {

    @OriginalMember(owner = "client!en", name = "Mb", descriptor = "Lvh;")
    public static class62 field557 = new class62(64);

    @OriginalMember(owner = "client!en", name = "Rb", descriptor = "I")
    public static int field562 = 0;

    @OriginalMember(owner = "client!en", name = "Qb", descriptor = "[Ljava/lang/String;")
    public static String[] field561 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!en", name = "Vb", descriptor = "I")
    public static int field566 = 0;

    @OriginalMember(owner = "client!en", name = "Pb", descriptor = "F")
    public static float field560;

    @OriginalMember(owner = "client!en", name = "Fb", descriptor = "I")
    private int field550;

    @OriginalMember(owner = "client!en", name = "Gb", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!en", name = "Hb", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!en", name = "Ib", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!en", name = "Jb", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!en", name = "Lb", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!en", name = "Nb", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!en", name = "Sb", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!en", name = "Wb", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!en", name = "Xb", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!en", name = "Yb", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!en", name = "Ob", descriptor = "Lnk;")
    public static class16 field559;

    @OriginalMember(owner = "client!en", name = "Tb", descriptor = "Lhl;")
    public static class74 field564;

    @OriginalMember(owner = "client!en", name = "Kb", descriptor = "Lij;")
    private class95 field555;

    @OriginalMember(owner = "client!en", name = "Ub", descriptor = "[I")
    public static int[] field565;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "(Z)V", line = 9)
    public static void method298(boolean arg0) {
        field565 = null;
        if (arg0) {
            method305((byte) 86, false);
        }
        field564 = null;
        field559 = null;
        field557 = null;
        field561 = null;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIILio;IJIIII)Z", line = 23)
    public static final boolean method299(int arg0, int arg1, int arg2, int arg3, class294 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class237.method1646(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B[I)V", line = 30)
    public final void method300(byte arg0, int[] arg1) {
        if (arg0 >= -77) {
            this.field550 = 5;
        }
        field569++;
        this.field555 = new class95(arg1);
    }

    @OriginalMember(owner = "client!en", name = "s", descriptor = "(I)V", line = 42)
    public final void method301(int arg0) {
        if (arg0 != -26380) {
            field566 = -10;
        }
        this.field550 = this.field2295 * 8;
        field552++;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(III[B)V", line = 58)
    public final void method302(int arg0, int arg1, int arg2, byte[] arg3) {
        for (int var5 = arg1; var5 < arg0; var5++) {
            arg3[arg2 + var5] = (byte) (this.field2260[this.field2295++] - this.field555.method619(0));
        }
        field568++;
    }

    @OriginalMember(owner = "client!en", name = "t", descriptor = "(I)V", line = 79)
    public final void method303(int arg0) {
        field556++;
        int var2 = 18 / ((-arg0 - 10) / 37);
        this.field2295 = (this.field550 + 7) / 8;
    }

    @OriginalMember(owner = "client!en", name = "o", descriptor = "(II)V", line = 89)
    public final void method304(int arg0, int arg1) {
        this.field2260[this.field2295++] = (byte) (arg0 + this.field555.method619(0));
        field567++;
        if (arg1 != 19830) {
            this.method302(-43, -45, -89, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(BZ)V", line = 101)
    public static final void method305(byte arg0, boolean arg1) {
        field554++;
        byte[][] var2;
        byte var3;
        if (class272.field4317 && arg1) {
            var2 = class108.field1490;
            var3 = 1;
        } else {
            var2 = class316.field4951;
            var3 = 4;
        }
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int[] var6 = null;
            byte[] var7 = var2[var5];
            int var8 = class218.field3277[var5] >> 8;
            int var9 = class218.field3277[var5] & 0xFF;
            int var10 = var8 * 64 - class322.field4999;
            int var11 = var9 * 64 - class16.field160;
            if (var7 != null) {
                class108.method698(arg0 - 155);
                var6 = class290.method2073(var10, arg1, class322.field4999, class247.field3914, class16.field160, arg0 ^ 0x37, var7, var11);
            }
            if (!arg1 && class84.field1099 / 8 == var8 && class344.field5466 / 8 == var9) {
                if (var6 == null) {
                    class325.field5214 = -1;
                } else {
                    class67.field843 = var6[3];
                    class256.field4045 = var6[1];
                    class325.field5214 = var6[0];
                    class277.field4356 = var6[2];
                    class292.field4600 = var6[4];
                }
            }
        }
        if (arg0 != 51) {
            return;
        }
        for (int var12 = 0; var12 < var4; var12++) {
            int var13 = (class218.field3277[var12] >> 8) * 64 - class322.field4999;
            int var14 = (class218.field3277[var12] & 0xFF) * 64 - class16.field160;
            byte[] var15 = var2[var12];
            if (var15 == null && class344.field5466 < 800) {
                class108.method698(-128);
                for (int var16 = 0; var16 < var3; var16++) {
                    class303.method2134(var16, 64, var13, var14, 64, 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(I)V", line = 193)
    public class49(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!en", name = "i", descriptor = "(Z)I", line = 205)
    public final int method306(boolean arg0) {
        field558++;
        if (arg0) {
            field561 = (String[]) null;
        }
        return this.field2260[this.field2295++] - this.field555.method619(0) & 0xFF;
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(IZ)I", line = 223)
    public final int method307(int arg0, boolean arg1) {
        int var3 = this.field550 >> 3;
        if (!arg1) {
            this.method307(102, true);
        }
        field553++;
        int var4 = 8 - (this.field550 & 0x7);
        int var5 = 0;
        this.field550 += arg0;
        while (var4 < arg0) {
            var5 += (class241.field3697[var4] & this.field2260[var3++]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (this.field2260[var3] & class241.field3697[var4]) + var5;
        } else {
            var6 = (this.field2260[var3] >> var4 - arg0 & class241.field3697[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!en", name = "p", descriptor = "(II)I", line = 258)
    public final int method308(int arg0, int arg1) {
        if (arg1 != 64) {
            field562 = 125;
        }
        field563++;
        return arg0 * 8 - this.field550;
    }

    @OriginalMember(owner = "client!en", name = "u", descriptor = "(I)V", line = 269)
    public static final void method309(int arg0) {
        field551++;
        class289.field4553.method383((byte) -48);
        if (arg0 > -94) {
            field562 = 22;
        }
    }
}

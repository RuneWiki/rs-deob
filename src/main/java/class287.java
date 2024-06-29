import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class287 {

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "Lmh;")
    public static class128 field4913 = class22.method156(126, "(U5");

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "Lmh;")
    public static class128 field4912 = class22.method156(127, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "[Lmh;")
    public static class128[] field4903 = new class128[100];

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "Lmh;")
    public static class128 field4900 = class22.method156(127, "::replacecanvas");

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "[I")
    public static int[] field4910 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "Lmh;")
    public static class128 field4907 = class22.method156(123, "null");

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "Z")
    public static boolean field4916 = false;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "J")
    public long field4915;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "Lqh;")
    public class287 field4902;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "Lqh;")
    public class287 field4914;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "Ldj;")
    public static class314 field4904;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V", line = 17)
    public final void method1978(byte arg0) {
        int var2 = -70 / ((arg0 + 38) / 60);
        field4909++;
        if (this.field4914 != null) {
            this.field4914.field4902 = this.field4902;
            this.field4902.field4914 = this.field4914;
            this.field4914 = null;
            this.field4902 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIBI)I", line = 32)
    public static final int method1979(int arg0, int arg1, byte arg2, int arg3) {
        field4905++;
        if ((class301.field5117[arg0][arg3][arg1] & 0x8) != 0) {
            return 0;
        } else if (arg2 >= -51) {
            return 9;
        } else if (arg0 <= 0 || (class301.field5117[1][arg3][arg1] & 0x2) == 0) {
            return arg0;
        } else {
            return arg0 - 1;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIIIILjm;IZJ)Z", line = 52)
    public static final boolean method1980(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class226 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class308.field5227 == class250.field4334;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class297.field5067 || var16 >= class155.field2670) {
                    return false;
                }
                class150 var17 = class182.field3184[arg0][var15][var16];
                if (var17 != null && var17.field2576 >= 5) {
                    return false;
                }
            }
        }
        class5 var18 = new class5();
        var18.field89 = arg11;
        var18.field100 = arg0;
        var18.field107 = arg5;
        var18.field108 = arg6;
        var18.field97 = arg7;
        var18.field105 = arg8;
        var18.field103 = arg9;
        var18.field92 = arg1;
        var18.field88 = arg2;
        var18.field96 = arg1 + arg3 - 1;
        var18.field86 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class182.field3184[var22][var19][var20] == null) {
                        class182.field3184[var22][var19][var20] = new class150(var22, var19, var20);
                    }
                }
                class150 var23 = class182.field3184[arg0][var19][var20];
                var23.field2575[var23.field2576] = var18;
                var23.field2566[var23.field2576] = var21;
                var23.field2580 |= var21;
                var23.field2576++;
                if (var13 && class91.field1557[var19][var20] != 0) {
                    var14 = class91.field1557[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class91.field1557[var24][var25] == 0) {
                        class91.field1557[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class298.field5087[class134.field2335++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V", line = 179)
    public static void method1981(boolean arg0) {
        if (arg0) {
            field4904 = (class314) null;
        }
        field4907 = null;
        field4900 = null;
        field4903 = null;
        field4912 = null;
        field4904 = null;
        field4910 = null;
        field4913 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)Z", line = 199)
    public final boolean method1982(int arg0) {
        field4906++;
        if (this.field4914 == null) {
            return false;
        } else {
            if (arg0 != 1955) {
                field4900 = (class128) null;
            }
            return true;
        }
    }
}

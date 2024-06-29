import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class177 {

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public int field3103 = -1;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "Z")
    public static boolean field3104 = false;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Leb;")
    private static class230 field3101 = class68.method589(0, "Examine");

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "[I")
    public static int[] field3115 = new int[100];

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "[I")
    public static int[] field3112 = new int[2];

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    public static int field3116 = -1;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "Leb;")
    public static class230 field3117 = field3101;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public int field3102;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public int field3107;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public int field3108;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public int field3109;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public int field3110;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public int field3111;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public int field3114;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public int field3118;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "Llc;")
    public static class83 field3113;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lkk;Z)V")
    public static final void method1285(class223 arg0, boolean arg1) {
        field3100++;
        class171.field3031 = arg0;
        if (arg1) {
            field3112 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)Z")
    public static final boolean method1286(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class27.field506; var3++) {
            class221 var4 = class116.field2093[var3];
            if (var4.field3782 == 1) {
                int var5 = var4.field3790 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3791 * var5 >> 8) + var4.field3789;
                    int var7 = (var4.field3794 * var5 >> 8) + var4.field3788;
                    int var8 = (var4.field3783 * var5 >> 8) + var4.field3798;
                    int var9 = (var4.field3796 * var5 >> 8) + var4.field3784;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3782 == 2) {
                int var10 = arg0 - var4.field3790;
                if (var10 > 0) {
                    int var11 = (var4.field3791 * var10 >> 8) + var4.field3789;
                    int var12 = (var4.field3794 * var10 >> 8) + var4.field3788;
                    int var13 = (var4.field3783 * var10 >> 8) + var4.field3798;
                    int var14 = (var4.field3796 * var10 >> 8) + var4.field3784;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3782 == 3) {
                int var15 = var4.field3789 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3793 * var15 >> 8) + var4.field3790;
                    int var17 = (var4.field3800 * var15 >> 8) + var4.field3792;
                    int var18 = (var4.field3783 * var15 >> 8) + var4.field3798;
                    int var19 = (var4.field3796 * var15 >> 8) + var4.field3784;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3782 == 4) {
                int var20 = arg2 - var4.field3789;
                if (var20 > 0) {
                    int var21 = (var4.field3793 * var20 >> 8) + var4.field3790;
                    int var22 = (var4.field3800 * var20 >> 8) + var4.field3792;
                    int var23 = (var4.field3783 * var20 >> 8) + var4.field3798;
                    int var24 = (var4.field3796 * var20 >> 8) + var4.field3784;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3782 == 5) {
                int var25 = arg1 - var4.field3798;
                if (var25 > 0) {
                    int var26 = (var4.field3793 * var25 >> 8) + var4.field3790;
                    int var27 = (var4.field3800 * var25 >> 8) + var4.field3792;
                    int var28 = (var4.field3791 * var25 >> 8) + var4.field3789;
                    int var29 = (var4.field3794 * var25 >> 8) + var4.field3788;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
    public static void method1287(boolean arg0) {
        field3117 = null;
        field3113 = null;
        field3101 = null;
        if (!arg0) {
            field3112 = null;
            field3115 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)I")
    public static final int method1288(byte arg0) {
        if (arg0 >= -26) {
            field3113 = null;
        }
        field3106++;
        return ((class231.field4020 == 0 ? 0 : 1) << 22) + ((class16.field365 == 0 ? 0 : 1) << 21) + ((class97.field1790 == 0 ? 0 : 1) << 20) + ((class127.field2228 ? 1 : 0) << 19) + (class23.field437 & 0x3 << 17) + ((class246.field4377 ? 1 : 0) << 16) + ((class47.field837 ? 1 : 0) << 15) + ((class8.field126 ? 1 : 0) << 13) + ((class206.field3633 & 0x3) << 11) + ((class99.field1833 ? 1 : 0) << 9) + ((class154.field2748 ? 1 : 0) << 7) + ((class42.field774 ? 1 : 0) << 4) + ((class251.field4506 ? 1 : 0) << 3) + (class196.field3510 & 0x7) - (-((class123.field2163 ? 1 : 0) << 5) - (((class191.field3372 ? 1 : 0) << 6) - -((class249.field4425 ? 1 : 0) << 8)) + -((class263.field4672 ? 1 : 0) << 10));
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)V")
    public static final void method1289(byte arg0, int arg1) {
        field3105++;
        class102.field1866.method1121(0, arg1);
        class173.field3049.method1121(0, arg1);
        int var2 = 65 / ((-arg0 - 42) / 62);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)I")
    public static int method1290(int arg0, int arg1) {
        return arg0 | arg1;
    }
}

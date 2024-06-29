import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class49 {

    @OriginalMember(owner = "client!b", name = "j", descriptor = "J")
    public long field802 = 0L;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public static int field795 = 500;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "Lli;")
    public static class185 field810 = class245.method1649("Abbrechen", 126);

    @OriginalMember(owner = "client!b", name = "i", descriptor = "Lli;")
    public static class185 field801 = class245.method1649("<col=00ffff>", 122);

    @OriginalMember(owner = "client!b", name = "u", descriptor = "Lli;")
    public static class185 field813 = class245.method1649("Number of player models in cache:", -102);

    @OriginalMember(owner = "client!b", name = "q", descriptor = "[I")
    public static int[] field809 = new int[500];

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public int field793;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public int field794;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public int field796;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public int field797;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public int field799;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public int field804;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public int field805;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public int field808;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "I")
    public int field812;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "I")
    public int field815;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "I")
    public int field816;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "Lbb;")
    public class75 field800;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZZ)V")
    public static final void method308(boolean arg0, boolean arg1) {
        if (arg0) {
            field806++;
            class156.field2962 = arg1;
            class77.field1349 = !class17.method125(22);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
    public static final void method309(byte arg0) {
        class148.field2785.method86(0);
        class30.field495.method86(0);
        int var1 = -79 / ((-arg0 - 67) / 46);
        field811++;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IJII)Z")
    public static final boolean method310(int arg0, long arg1, int arg2, int arg3) {
        field798++;
        int var5 = ((int) arg1 & 0x3A2901) >> 20;
        int var6 = ((int) arg1 & 0x7C7CB) >> 14;
        int var7 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class135 var8 = class184.method1294(var7, -28916);
            int var9 = var8.field2528;
            int var10;
            int var11;
            if (var5 == 0 || var5 == 2) {
                var11 = var8.field2500;
                var10 = var8.field2536;
            } else {
                var10 = var8.field2500;
                var11 = var8.field2536;
            }
            if (var5 != 0) {
                var9 = (var9 >> 4 - var5) + (var9 << var5 & 0xF);
            }
            class256.method1739(arg0, 0, arg2, 2, class241.field4310.field2720[0], (byte) 125, 0, var9, var10, true, var11, class241.field4310.field2651[0]);
        } else {
            class256.method1739(arg0, var5, arg2, 2, class241.field4310.field2720[0], (byte) 60, var6 + 1, 0, 0, true, 0, class241.field4310.field2651[0]);
        }
        class123.field2230 = class161.field3041;
        class268.field4744 = 2;
        class97.field1820 = class6.field136;
        class60.field1078 = arg3;
        return true;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public static void method311(int arg0) {
        field809 = null;
        field801 = null;
        if (arg0 != -1) {
            field810 = null;
        }
        field810 = null;
        field813 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lhi;ILhi;)V")
    public static final void method312(class250 arg0, int arg1, class250 arg2) {
        class26.field449 = arg2;
        field814++;
        if (arg1 != 500) {
            method310(82, 43L, -75, -94);
        }
        class262.field4653 = arg0;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIIIIB)V")
    public static final void method313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        field803++;
        for (int var9 = 0; var9 < class215.field3955.field3133; var9++) {
            if (class215.field3955.method1211(8, var9)) {
                int var10 = class215.field3955.field3132[var9] - class252.field4481;
                int var11 = (var10 - arg0) * (arg4 - arg1) / (arg5 - arg0) + arg1;
                int var12 = class125.field2246 + class264.field4679 - class215.field3955.field3142[var9] - 1;
                int var13 = 16777215;
                int var14 = (var12 - arg2) * (arg7 - arg3) / (arg6 - arg2) + arg3;
                int var15 = class215.field3955.method1212(var9, (byte) 17);
                class114 var16 = null;
                if (var15 == 0) {
                    if ((double) class274.field4859 == 3.0D) {
                        var16 = class146.field2771;
                    }
                    if ((double) class274.field4859 == 4.0D) {
                        var16 = class240.field4278;
                    }
                    if ((double) class274.field4859 == 6.0D) {
                        var16 = class152.field2883;
                    }
                    if ((double) class274.field4859 >= 8.0D) {
                        var16 = class148.field2791;
                    }
                }
                if (var15 == 1) {
                    if ((double) class274.field4859 == 3.0D) {
                        var16 = class152.field2883;
                    }
                    if ((double) class274.field4859 == 4.0D) {
                        var16 = class148.field2791;
                    }
                    if ((double) class274.field4859 == 6.0D) {
                        var16 = class234.field4203;
                    }
                    if ((double) class274.field4859 >= 8.0D) {
                        var16 = class132.field2373;
                    }
                }
                if (var15 == 2) {
                    var13 = 16755200;
                    if ((double) class274.field4859 == 3.0D) {
                        var16 = class234.field4203;
                    }
                    if ((double) class274.field4859 == 4.0D) {
                        var16 = class132.field2373;
                    }
                    if ((double) class274.field4859 == 6.0D) {
                        var16 = class10.field198;
                    }
                    if ((double) class274.field4859 >= 8.0D) {
                        var16 = class80.field1401;
                    }
                }
                if (class215.field3955.field3135[var9] != -1) {
                    var13 = class215.field3955.field3135[var9];
                }
                if (var16 != null) {
                    int var17 = class189.field3523.method1838(class215.field3955.field3136[var9], (int[]) null, class214.field3911);
                    int var18 = var14 - var16.method788() * (var17 - 1) / 2;
                    int var19 = var18 + var16.method792() / 2;
                    for (int var20 = 0; var20 < var17; var20++) {
                        class185 var21 = class214.field3911[var20];
                        if (var17 - 1 > var20) {
                            var21.method1318(var21.method1311((byte) 49) - 4, 0);
                        }
                        var16.method796(var21, var11, var19, var13, true);
                        var19 += var16.method788();
                    }
                }
            }
        }
        if (arg8 <= 6) {
            method311(27);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class281 extends class203 {

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "Lhd;")
    public class125 field4798;

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "Lfd;")
    public static class61 field4801 = null;

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "[I")
    public static int[] field4804 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "Lmh;")
    public static class62 field4806 = class201.method1405(true, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "Lmh;")
    public static class62 field4805 = null;

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "Lmh;")
    public static class62 field4807 = class201.method1405(true, "Art");

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "[Lrk;")
    public static class201[] field4808 = new class201[6];

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "Lhi;")
    public static class26 field4800;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "Lhh;")
    public static class294 field4796;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)V", line = 5)
    public static void method1916(int arg0) {
        field4805 = null;
        field4807 = null;
        field4806 = null;
        if (arg0 != 0) {
            field4799 = 48;
        }
        field4800 = null;
        field4796 = null;
        field4801 = null;
        field4808 = null;
        field4804 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IJ)V", line = 31)
    public static final void method1917(int arg0, long arg1) {
        field4809++;
        if (arg1 == 0L) {
            return;
        }
        int var3 = 0;
        if (arg0 != 63) {
            return;
        }
        while (var3 < class141.field2269) {
            if (class55.field808[var3] == arg1) {
                class141.field2269--;
                class140.field2244++;
                for (int var4 = var3; var4 < class141.field2269; var4++) {
                    class55.field808[var4] = class55.field808[var4 + 1];
                    class184.field2952[var4] = class184.field2952[var4 + 1];
                }
                class17.field153 = class105.field1716;
                class170.field2772.method1693(81, false);
                class170.field2772.method694(arg1, (byte) -34);
                break;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lhd;)V", line = 71)
    public class281(class125 arg0) {
        this.field4798 = arg0;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBII)I", line = 83)
    public static final int method1918(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = -45 / ((-arg1 - 13) / 35);
        field4802++;
        if ((class42.field641[arg0][arg2][arg3] & 0x8) == 0) {
            return arg0 <= 0 || (class42.field641[1][arg2][arg3] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)V", line = 100)
    public static final void method1919(int arg0, int arg1, int arg2, int arg3) {
        field4797++;
        if (arg2 != -26080) {
            field4806 = (class62) null;
        }
        if (class169.field2744 == 0 || arg0 == 0 || class39.field603 >= 50 || arg3 == -1) {
            return;
        }
        class164.field2653[class39.field603] = arg3;
        class261.field4382[class39.field603] = arg0;
        class37.field524[class39.field603] = arg1;
        class162.field2624[class39.field603] = null;
        class151.field2383[class39.field603] = 0;
        class39.field603++;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II[Lwc;Z[BB)V", line = 145)
    public static final void method1920(int arg0, int arg1, class218[] arg2, boolean arg3, byte[] arg4, byte arg5) {
        class92 var6 = new class92(arg4);
        if (arg5 <= 19) {
            method1917(12, 61L);
        }
        field4803++;
        int var7 = -1;
        while (true) {
            int var8 = var6.method706((byte) 127);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method731(122);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 12;
                int var13 = var6.method702(-1);
                int var14 = var9 >> 6 & 0x3F;
                int var15 = arg0 + var14;
                int var16 = var13 & 0x3;
                int var17 = var13 >> 2;
                int var18 = arg1 + var11;
                if (var15 > 0 && var18 > 0 && var15 < 103 && var18 < 103) {
                    class218 var19 = null;
                    if (!arg3) {
                        int var20 = var12;
                        if ((class42.field641[1][var15][var18] & 0x2) == 2) {
                            var20 = var12 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg2[var20];
                        }
                    }
                    class110.method847(var15, var7, var12, var18, var12, var17, var16, (byte) 124, arg3, var19, !arg3);
                }
            }
        }
    }
}

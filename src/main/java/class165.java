import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class165 extends class167 {

    @OriginalMember(owner = "client!sj", name = "N", descriptor = "Le;")
    private static class191 field2785 = class54.method368("scroll:", 2047);

    @OriginalMember(owner = "client!sj", name = "K", descriptor = "Le;")
    public static class191 field2782 = field2785;

    @OriginalMember(owner = "client!sj", name = "S", descriptor = "Le;")
    public static class191 field2789 = field2785;

    @OriginalMember(owner = "client!sj", name = "Y", descriptor = "Le;")
    public static class191 field2795 = class54.method368("leuchten1:", 2047);

    @OriginalMember(owner = "client!sj", name = "M", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!sj", name = "O", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!sj", name = "P", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!sj", name = "T", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!sj", name = "X", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!sj", name = "Z", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!sj", name = "ab", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!sj", name = "W", descriptor = "Le;")
    public class191 field2793;

    @OriginalMember(owner = "client!sj", name = "L", descriptor = "[I")
    public int[] field2783;

    @OriginalMember(owner = "client!sj", name = "R", descriptor = "[I")
    public int[] field2788;

    @OriginalMember(owner = "client!sj", name = "U", descriptor = "[I")
    public static int[] field2791;

    @OriginalMember(owner = "client!sj", name = "bb", descriptor = "[I")
    public int[] field2798;

    @OriginalMember(owner = "client!sj", name = "cb", descriptor = "[I")
    public int[] field2799;

    @OriginalMember(owner = "client!sj", name = "V", descriptor = "[Lmh;")
    public static class232[] field2792;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIILbe;IJZ)Z")
    public static final boolean method1110(int arg0, int arg1, int arg2, int arg3, int arg4, class16 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class183.method1232(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "(I)V")
    public final void method1111(int arg0) {
        field2790++;
        if (this.field2783 != null) {
            for (int var2 = 0; var2 < this.field2783.length; var2++) {
                this.field2783[var2] = class217.method1476(this.field2783[var2], 32768);
            }
        }
        if (this.field2798 != null) {
            for (int var3 = 0; var3 < this.field2798.length; var3++) {
                this.field2798[var3] = class217.method1476(this.field2798[var3], 32768);
            }
        }
        int var4 = -84 % ((64 - arg0) / 62);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lji;II)V")
    private final void method1112(class225 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field2793 = arg0.method1596((byte) 76);
        } else if (arg2 == 2) {
            int var4 = arg0.method1580(-41);
            this.field2788 = new int[var4];
            this.field2798 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2798[var5] = arg0.method1593(true);
                int var6 = arg0.method1580(arg1 ^ 0xFFFFFFD9);
                if (var6 == 0) {
                    this.field2788[var5] = -1;
                } else {
                    this.field2788[var5] = var6;
                }
            }
        } else if (arg2 == 3) {
            int var7 = arg0.method1580(-64);
            this.field2783 = new int[var7];
            this.field2799 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2783[var8] = arg0.method1593(true);
                int var9 = arg0.method1580(-18);
                if (var9 == 0) {
                    this.field2799[var8] = -1;
                } else {
                    this.field2799[var8] = var9;
                }
            }
        }
        field2786++;
        if (arg1 != 0) {
            this.method1116(true, -63);
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(Lji;I)V")
    public final void method1113(class225 arg0, int arg1) {
        if (arg1 <= 80) {
            this.method1111(72);
        }
        while (true) {
            int var3 = arg0.method1580(-12);
            if (var3 == 0) {
                field2796++;
                return;
            }
            this.method1112(arg0, 0, var3);
        }
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(II)I")
    public final int method1114(int arg0, int arg1) {
        field2784++;
        if (this.field2783 == null) {
            return -1;
        } else if (arg0 == -1) {
            for (int var3 = 0; var3 < this.field2783.length; var3++) {
                if (this.field2799[var3] == arg1) {
                    return this.field2783[var3];
                }
            }
            return -1;
        } else {
            return -86;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZILng;Lng;)V")
    public static final void method1115(boolean arg0, int arg1, class121 arg2, class121 arg3) {
        if (arg1 >= 113) {
            class131.field2181 = arg0;
            class10.field116 = arg2;
            field2794++;
            class35.field653 = arg3;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZI)I")
    public final int method1116(boolean arg0, int arg1) {
        if (!arg0) {
            this.field2793 = null;
        }
        field2787++;
        if (this.field2798 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field2798.length; var3++) {
            if (this.field2788[var3] == arg1) {
                return this.field2798[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)V")
    public static void method1117(byte arg0) {
        field2789 = null;
        field2792 = null;
        field2785 = null;
        field2795 = null;
        field2791 = null;
        int var1 = 49 / ((arg0 + 84) / 35);
        field2782 = null;
    }
}

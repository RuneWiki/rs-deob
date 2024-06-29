import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class190 extends class264 {

    @OriginalMember(owner = "client!aa", name = "nb", descriptor = "Z")
    public static boolean field2973 = true;

    @OriginalMember(owner = "client!aa", name = "ob", descriptor = "Lma;")
    private static class5 field2974 = class12.method119("flash2:", (byte) 91);

    @OriginalMember(owner = "client!aa", name = "hb", descriptor = "Lma;")
    public static class5 field2967 = field2974;

    @OriginalMember(owner = "client!aa", name = "ib", descriptor = "Lma;")
    public static class5 field2968 = field2974;

    @OriginalMember(owner = "client!aa", name = "lb", descriptor = "Lma;")
    public static class5 field2971 = class12.method119("Spieler", (byte) 67);

    @OriginalMember(owner = "client!aa", name = "gb", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!aa", name = "jb", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!aa", name = "kb", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!aa", name = "mb", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!aa", name = "pb", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!aa", name = "fb", descriptor = "[Lla;")
    public static class178[] field2965;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)[I", line = 7)
    public final int[] method5(int arg0, int arg1) {
        field2975++;
        if (arg0 >= -58) {
            return (int[]) null;
        }
        int[] var3 = this.field4501.method1176(arg1, 123);
        if (this.field4501.field2741) {
            int[] var4 = this.method1815(0, arg1, -104);
            int[] var5 = this.method1815(1, arg1, 73);
            int[] var6 = this.method1815(2, arg1, 127);
            for (int var7 = 0; var7 < class226.field3716; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V", line = 74)
    public class190() {
        super(3, false);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lma;I)I", line = 78)
    public static final int method1244(class5 arg0, int arg1) {
        field2966++;
        if (arg0.method36(30673) == 0) {
            return -1;
        }
        if (arg1 != 1) {
            field2974 = (class5) null;
        }
        for (int var2 = 0; var2 < class46.field704.field403; var2++) {
            if (class46.field704.field397[var2].method49(class204.field3264, class219.field3556, true).method51(arg1 + 31, arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(BI)[[I", line = 113)
    public final int[][] method138(byte arg0, int arg1) {
        field2969++;
        int[][] var3 = this.field4524.method1462(-15077, arg1);
        int var4 = 47 % ((arg0 + 43) / 55);
        if (this.field4524.field3506) {
            int[] var5 = this.method1815(2, arg1, 92);
            int[][] var6 = this.method1817(-91, 0, arg1);
            int[][] var7 = this.method1817(-116, 1, arg1);
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var3[2];
            int[] var11 = var3[0];
            int[] var12 = var7[1];
            int[] var13 = var3[1];
            int[] var14 = var7[2];
            int[] var15 = var7[0];
            int[] var16 = var6[2];
            for (int var17 = 0; var17 < class226.field3716; var17++) {
                int var18 = var5[var17];
                if (var18 == 4096) {
                    var11[var17] = var8[var17];
                    var13[var17] = var9[var17];
                    var10[var17] = var16[var17];
                } else if (var18 == 0) {
                    var11[var17] = var15[var17];
                    var13[var17] = var12[var17];
                    var10[var17] = var14[var17];
                } else {
                    int var19 = 4096 - var18;
                    var11[var17] = var8[var17] * var18 + var15[var17] * var19 >> 12;
                    var13[var17] = var9[var17] * var18 + var12[var17] * var19 >> 12;
                    var10[var17] = var14[var17] * var19 + var16[var17] * var18 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILii;)V", line = 192)
    public final void method4(int arg0, int arg1, class221 arg2) {
        if (arg1 > -27) {
            field2965 = (class178[]) null;
        }
        field2970++;
        if (arg0 == 0) {
            this.field4496 = arg2.method1509(true) == 1;
        }
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(B)V", line = 209)
    public static void method1245(byte arg0) {
        field2965 = null;
        field2971 = null;
        field2974 = null;
        field2967 = null;
        if (arg0 != -7) {
            field2967 = (class5) null;
        }
        field2968 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZLma;)I", line = 237)
    public static final int method1246(boolean arg0, class5 arg1) {
        field2972++;
        if (arg0) {
            field2973 = true;
        }
        return arg1.method36(30673) + 1;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class174 extends class175 {

    @OriginalMember(owner = "client!rf", name = "K", descriptor = "Z")
    private boolean field2905 = true;

    @OriginalMember(owner = "client!rf", name = "X", descriptor = "I")
    private int field2918 = 4096;

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "I")
    public static int field2912 = 1;

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "[Lwd;")
    public static class217[] field2913 = new class217[2048];

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!rf", name = "W", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!rf", name = "M", descriptor = "Lqb;")
    public static class11 field2907;

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "Lda;")
    public static class22 field2906;

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "[[B")
    public static byte[][] field2911;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "(I)Z")
    public static final boolean method1198(int arg0) {
        ++field2910;
        if (arg0 != 0) {
            method1201(-73, -14, -122, (byte) 53, -14);
        }
        return class193.field3208;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)[[I")
    public final int[][] method32(int arg0, int arg1) {
        ++field2916;
        if (arg1 != -20740) {
            this.field2918 = 115;
        }
        int[][] var3 = super.field2920.method117(arg0, (byte) -42);
        if (super.field2920.field356) {
            int[] var4 = this.method1210(0, arg0 + -1 & class108.field1928, 16745);
            int[] var5 = this.method1210(0, arg0, 16745);
            int[] var6 = this.method1210(0, arg0 + 1 & class108.field1928, 16745);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            for (int var10 = 0; ~class211.field3514 < ~var10; ++var10) {
                int var11 = (var6[var10] - var4[var10]) * this.field2918;
                int var12 = (var5[var10 - -1 & class161.field2765] + -var5[var10 - 1 & class161.field2765]) * this.field2918;
                int var13 = var12 >> 12;
                int var14 = var13 * var13 >> 12;
                int var15 = var11 >> 12;
                int var16 = var15 * var15 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var14 - -var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var19 = var12 / var17;
                    var18 = var11 / var17;
                    var20 = 16777216 / var17;
                }
                if (this.field2905) {
                    var20 = (var20 >> 1) + 2048;
                    var19 = 2048 - -(var19 >> 1);
                    var18 = (var18 >> 1) + 2048;
                }
                var8[var10] = var19;
                var7[var10] = var18;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lda;III)[Lek;")
    public static final class169[] method1199(class22 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 22725) {
            method1200(123, (class187) null);
        }
        ++field2917;
        return !class79.method581((byte) -118, arg2, arg0, arg3) ? null : class51.method414(0);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILgi;)V")
    public static final void method1200(int arg0, class187 arg1) {
        if (arg0 != -8064) {
            method1199((class22) null, -103, 113, -18);
        }
        ++field2915;
        class60 var2 = (class60) class87.field1677.method443(arg1.field3097.method368((byte) -103), (byte) 81);
        if (var2 != null) {
            if (var2.field1102 != null) {
                field2907.method80(var2.field1102);
                var2.field1102 = null;
            }
            var2.method267(-24);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        if (!arg0) {
            field2913 = null;
        }
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field2905 = arg2.method1487(255) == 1;
            }
        } else {
            this.field2918 = arg2.method1441(-59);
        }
        ++field2909;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
    public class174() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIBI)V")
    public static final void method1201(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (class223.field3762 < 100) {
            class254.method1719(827759824);
        }
        class158.method1105(arg4, arg2, arg1 + arg4, arg0 + arg2);
        ++field2908;
        if (class223.field3762 < 100) {
            byte var5 = 20;
            int var6 = arg1 / 2 + arg4;
            int var7 = arg0 / 2 - 18 + arg2 + -var5;
            class158.method1104(arg4, arg2, arg1, arg0, 0);
            class158.method1119(var6 + -152, var7, 304, 34, 9179409);
            class158.method1119(var6 + -151, var7 + 1, 302, 32, 0);
            class158.method1104(var6 + -150, var7 + 2, class223.field3762 * 3, 30, 9179409);
            class158.method1104(var6 - (-(class223.field3762 * 3) + 150), var7 + 2, -(class223.field3762 * 3) + 300, 30, 0);
            class57.field1029.method1080(class187.field3080, var6, var5 + var7, 16777215, -1);
        } else {
            class191.field3175 = (int) ((double) (arg0 * 2) / class2.field20);
            class6.field76 = -((int) ((double) arg1 / class2.field20)) + class215.field3559;
            class100.field1846 = (int) ((double) (arg1 * 2) / class2.field20);
            class207.field3430 = -((int) ((double) arg0 / class2.field20)) + class222.field3744;
            int var8 = -((int) ((double) arg0 / class2.field20)) + class222.field3744;
            int var9 = -((int) ((double) arg1 / class2.field20)) + class215.field3559;
            int var10 = class222.field3744 - -((int) ((double) arg0 / class2.field20));
            int var11 = class215.field3559 - -((int) ((double) arg1 / class2.field20));
            class248.method1691(var8, var10, var11, (byte) 106, arg2, arg0 + arg2, arg1 + arg4, var9, arg4);
            class28.method251(var8, arg1 + arg4, arg4, var9, -469890544, var11, arg0 + arg2, var10, arg2);
            if (arg3 >= -104) {
                field2912 = 34;
            }
            if (~class126.field2205 < -1) {
                --class126.field2205;
            }
            if (class244.field4253) {
                int var12 = arg4 + -5 + arg1;
                int var13 = arg2 - -arg0 + -8;
                class36.field711.method1076(class80.method589(new class50[] { class178.field2979, class78.method579(class227.field3825, -26225) }, 28743), var12, var13, 16776960, -1);
                Runtime var14 = Runtime.getRuntime();
                int var15 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
                int var17 = var13 - 15;
                int var16 = 16776960;
                if (var15 > 65536) {
                    var16 = 16711680;
                }
                class36.field711.method1076(class80.method589(new class50[] { class24.field527, class78.method579(var15, -26225), class74.field1401 }, 28743), var12, var17, var16, -1);
                var13 = var17 - 15;
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "(I)V")
    public static void method1202(int arg0) {
        field2907 = null;
        field2906 = null;
        field2913 = null;
        field2911 = null;
        if (arg0 != 30) {
            method1199((class22) null, -23, -7, 91);
        }
    }
}

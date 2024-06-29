import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class196 {

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    private int field2886 = 0;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Lrb;")
    private class143 field2883;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "[I")
    public static int[] field2889 = new int[5];

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "Z")
    public static boolean field2888 = false;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Ltl;")
    private class259 field2885;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)Ltl;")
    public final class259 method1384(int arg0) {
        field2887++;
        if (arg0 != -20333) {
            method1390(-126, 108, 6, 75, true, 53);
        }
        if (this.field2886 > 0 && this.field2883.field2318[this.field2886 - 1] != this.field2885) {
            class259 var2 = this.field2885;
            this.field2885 = var2.field4013;
            return var2;
        }
        while (this.field2886 < this.field2883.field2312) {
            class259 var3 = this.field2883.field2318[this.field2886++].field4013;
            if (this.field2883.field2318[this.field2886 - 1] != var3) {
                this.field2885 = var3.field4013;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
    public static final void method1385(int arg0) {
        field2890++;
        if (arg0 >= -16) {
            method1389(false, 94);
        }
        if (class199.field2924 != null) {
            class238 var1 = class199.field2924;
            synchronized (class199.field2924) {
                class199.field2924 = null;
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "()V")
    public static final void method1386() {
        for (int var0 = 0; var0 < class115.field1914; var0++) {
            class156 var1 = class2.field28[var0];
            class146.method1085(var1);
            class2.field28[var0] = null;
        }
        class115.field1914 = 0;
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)V")
    public static void method1387(int arg0) {
        if (arg0 < -113) {
            field2889 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)Ltl;")
    public final class259 method1388(int arg0) {
        field2891++;
        this.field2886 = 0;
        if (arg0 > -77) {
            method1386();
        }
        return this.method1384(-20333);
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lrb;)V")
    public class196(class143 arg0) {
        this.field2883 = arg0;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)V")
    public static final void method1389(boolean arg0, int arg1) {
        field2884++;
        short var2 = 256;
        if (arg1 > var2) {
            arg1 = var2;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class1.field16 += arg1 * 128;
        if (class1.field16 > class231.field3395.length) {
            int var3 = (int) (Math.random() * 12.0D);
            class1.field16 -= class231.field3395.length;
            class98.method769(class203.field2986[var3], (byte) 112);
        }
        int var4 = arg1 * 128;
        int var5 = 0;
        int var6 = (var2 - arg1) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var26 = class237.field3464[var4 + var5] - class231.field3395[class1.field16 + var5 & class231.field3395.length + -1] * arg1 / 6;
            if (var26 < 0) {
                var26 = 0;
            }
            class237.field3464[var5++] = var26;
        }
        int var8 = var2 - arg1;
        if (!arg0) {
            method1387(30);
        }
        while (var8 < var2) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; var24++) {
                int var25 = (int) (Math.random() * 100.0D);
                if (var25 < 50 && var24 > 10 && var24 < 118) {
                    class237.field3464[var23 + var24] = 255;
                } else {
                    class237.field3464[var23 + var24] = 0;
                }
            }
            var8++;
        }
        for (int var9 = 0; var9 < var2 - arg1; var9++) {
            class286.field4589[var9] = class286.field4589[arg1 + var9];
        }
        for (int var10 = var2 - arg1; var10 < var2; var10++) {
            class286.field4589[var10] = (int) (Math.sin((double) class250.field3780 / 14.0D) * 16.0D + Math.sin((double) class250.field3780 / 15.0D) * 14.0D + Math.sin((double) class250.field3780 / 16.0D) * 12.0D);
            class250.field3780++;
        }
        class248.field3717 += arg1;
        int var11 = ((class199.field2930 & 0x1) + arg1) / 2;
        if (var11 <= 0) {
            return;
        }
        for (int var12 = 0; var12 < class248.field3717; var12++) {
            int var21 = (int) (Math.random() * 124.0D) + 2;
            int var22 = (int) (Math.random() * 128.0D) + 128;
            class237.field3464[var21 + (var22 << 7)] = 192;
        }
        class248.field3717 = 0;
        for (int var13 = 0; var13 < var2; var13++) {
            int var18 = 0;
            int var19 = var13 * 128;
            for (int var20 = -var11; var20 < 128; var20++) {
                if (var11 + var20 < 128) {
                    var18 += class237.field3464[var19 + var20 + var11];
                }
                if ((var20 - var11 - 1) >= 0) {
                    var18 -= class237.field3464[var20 - (var11 + 1 - var19)];
                }
                if (var20 >= 0) {
                    class209.field3096[var19 + var20] = var18 / (var11 * 2 + 1);
                }
            }
        }
        for (int var14 = 0; var14 < 128; var14++) {
            int var15 = 0;
            for (int var16 = -var11; var16 < var2; var16++) {
                int var17 = var16 * 128;
                if (var2 > var16 + var11) {
                    var15 += class209.field3096[var11 * 128 + (var14 + var17)];
                }
                if ((var16 - var11 - 1) >= 0) {
                    var15 -= class209.field3096[var14 + var17 - (var11 * 128) - 128];
                }
                if (var16 >= 0) {
                    class237.field3464[var14 + var17] = var15 / (var11 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIZI)V")
    public static final void method1390(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field2882++;
        int var6 = arg1 - arg0;
        int var7 = arg2 - arg5;
        if (var7 == 0) {
            if (var6 != 0) {
                client.method913(arg1, (byte) 1, arg3, arg5, arg0);
            }
        } else if (var6 == 0) {
            class99.method777(arg5, -1, arg2, arg0, arg3);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (!arg4) {
                if (var6 < 0) {
                    var6 = -var6;
                }
                boolean var8 = var7 < var6;
                if (var8) {
                    int var9 = arg5;
                    arg5 = arg0;
                    int var10 = arg2;
                    arg0 = var9;
                    arg2 = arg1;
                    arg1 = var10;
                }
                if (arg2 < arg5) {
                    int var11 = arg0;
                    arg0 = arg1;
                    int var12 = arg5;
                    arg5 = arg2;
                    arg1 = var11;
                    arg2 = var12;
                }
                int var13 = arg2 - arg5;
                int var14 = arg0;
                int var15 = arg1 - arg0;
                int var16 = -(var13 >> 1);
                if (var15 < 0) {
                    var15 = -var15;
                }
                int var17 = arg0 < arg1 ? 1 : -1;
                if (var8) {
                    for (int var19 = arg5; var19 <= arg2; var19++) {
                        class104.field1795[var19][var14] = arg3;
                        var16 += var15;
                        if (var16 > 0) {
                            var14 += var17;
                            var16 -= var13;
                        }
                    }
                } else {
                    for (int var18 = arg5; var18 <= arg2; var18++) {
                        var16 += var15;
                        class104.field1795[var14][var18] = arg3;
                        if (var16 > 0) {
                            var16 -= var13;
                            var14 += var17;
                        }
                    }
                }
            }
        }
    }
}

import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class173 extends class107 {

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "I")
    private int field2887 = 0;

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "I")
    private int field2893 = 2000;

    @OriginalMember(owner = "client!ek", name = "P", descriptor = "I")
    private int field2897 = 16;

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "I")
    private int field2889 = 4096;

    @OriginalMember(owner = "client!ek", name = "O", descriptor = "I")
    private int field2896 = 0;

    @OriginalMember(owner = "client!ek", name = "M", descriptor = "Lnb;")
    public static class223 field2894 = new class223();

    @OriginalMember(owner = "client!ek", name = "Q", descriptor = "[J")
    public static long[] field2898 = new long[32];

    @OriginalMember(owner = "client!ek", name = "S", descriptor = "Z")
    public static boolean field2900 = false;

    @OriginalMember(owner = "client!ek", name = "R", descriptor = "Leb;")
    public static class263 field2899 = class161.method1110((byte) -101);

    @OriginalMember(owner = "client!ek", name = "W", descriptor = "I")
    public static int field2904 = 0;

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!ek", name = "K", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!ek", name = "N", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!ek", name = "T", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!ek", name = "U", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!ek", name = "V", descriptor = "Lrg;")
    public static class248 field2903;

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
    public class173() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(III)I")
    public static final int method1231(int arg0, int arg1, int arg2) {
        ++field2886;
        int var3 = 1;
        while (arg2 > 1) {
            if (~(arg2 & 1) != -1) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg2 >>= 1;
        }
        if (arg0 == arg2) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIII)V")
    public static final void method1232(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class74 var5 = (class74) class57.field829.method371(-124, (long) arg3);
        if (var5 == null) {
            var5 = new class74();
            class57.field829.method368((long) arg3, var5, -125);
        }
        if (var5.field1187.length <= arg4) {
            int[] var6 = new int[arg4 + 1];
            int[] var7 = new int[arg4 + 1];
            for (int var8 = 0; ~var8 > ~var5.field1187.length; ++var8) {
                var6[var8] = var5.field1187[var8];
                var7[var8] = var5.field1188[var8];
            }
            for (int var9 = var5.field1187.length; arg4 > var9; ++var9) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field1188 = var7;
            var5.field1187 = var6;
        }
        var5.field1187[arg4] = arg0;
        if (arg2 != 1) {
            field2899 = null;
        }
        var5.field1188[arg4] = arg1;
        ++field2891;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(II)[I")
    public final int[] method189(int arg0, int arg1) {
        int var3 = -46 / ((arg0 - -34) / 49);
        ++field2890;
        int[] var4 = super.field1661.method894(-66, arg1);
        if (super.field1661.field2115) {
            int var5 = this.field2889 >> 1;
            int[][] var6 = super.field1661.method893(-129);
            Random var7 = new Random((long) this.field2887);
            for (int var8 = 0; this.field2893 > var8; ++var8) {
                int var9 = ~this.field2889 < -1 ? this.field2896 + class182.method1288(21953, var7, this.field2889) - var5 : this.field2896;
                int var10 = (var9 & 4092) >> 4;
                int var11 = class182.method1288(21953, var7, class24.field443);
                int var12 = class182.method1288(21953, var7, class153.field2452);
                int var13 = (class144.field2323[var10] * this.field2897 >> 12) + var11;
                int var14 = var12 - -(class76.field1233[var10] * this.field2897 >> 12);
                int var15 = var14 - var12;
                int var16 = -var11 + var13;
                if (~var16 != -1 || var15 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var16 < 0) {
                        var16 = -var16;
                    }
                    boolean var17 = ~var15 < ~var16;
                    if (var17) {
                        int var18 = var11;
                        var11 = var12;
                        var12 = var18;
                        int var19 = var13;
                        var13 = var14;
                        var14 = var19;
                    }
                    if (var13 < var11) {
                        int var20 = var11;
                        var11 = var13;
                        var13 = var20;
                        int var21 = var12;
                        var12 = var14;
                        var14 = var21;
                    }
                    int var22 = var12;
                    int var23 = var13 - var11;
                    int var24 = -var12 + var14;
                    if (var24 < 0) {
                        var24 = -var24;
                    }
                    int var25 = 1024 - (class182.method1288(21953, var7, 4096) >> 2);
                    int var26 = 2048 / var23;
                    int var27 = -var23 / 2;
                    int var28 = ~var14 < ~var12 ? 1 : -1;
                    for (int var29 = var11; var13 > var29; ++var29) {
                        int var30 = var25 + 1024 - -((-var11 + var29) * var26);
                        int var31 = var22 & class107.field1677;
                        int var32 = var29 & class128.field2053;
                        if (var17) {
                            var6[var31][var32] = var30;
                        } else {
                            var6[var32][var31] = var30;
                        }
                        var27 += var24;
                        if (var27 > 0) {
                            var22 += var28;
                            var27 += -var23;
                        }
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V")
    public static final void method1233(boolean arg0) {
        class229.field3584.method2085(109);
        ++field2888;
        int var1 = class229.field3584.method2087(1, (byte) -21);
        if (~var1 != -1) {
            if (!arg0) {
                method1235(-37);
            }
            int var2 = class229.field3584.method2087(2, (byte) 120);
            if (~var2 == -1) {
                class189.field3100[class57.field830++] = 2047;
            } else if (~var2 == -2) {
                int var3 = class229.field3584.method2087(3, (byte) 120);
                class217.field3408.method400(1, 32, var3);
                int var4 = class229.field3584.method2087(1, (byte) -51);
                if (~var4 == -2) {
                    class189.field3100[class57.field830++] = 2047;
                }
            } else if (var2 == 2) {
                if (~class229.field3584.method2087(1, (byte) 125) == -2) {
                    int var5 = class229.field3584.method2087(3, (byte) -98);
                    class217.field3408.method400(2, 32, var5);
                    int var6 = class229.field3584.method2087(3, (byte) -61);
                    class217.field3408.method400(2, 32, var6);
                } else {
                    int var7 = class229.field3584.method2087(3, (byte) 126);
                    class217.field3408.method400(0, 32, var7);
                }
                int var8 = class229.field3584.method2087(1, (byte) -5);
                if (var8 == 1) {
                    class189.field3100[class57.field830++] = 2047;
                }
            } else if (var2 == 3) {
                class214.field3389 = class229.field3584.method2087(2, (byte) 121);
                int var9 = class229.field3584.method2087(1, (byte) 3);
                if (~var9 == -2) {
                    class189.field3100[class57.field830++] = 2047;
                }
                int var10 = class229.field3584.method2087(7, (byte) -43);
                int var11 = class229.field3584.method2087(7, (byte) 123);
                int var12 = class229.field3584.method2087(1, (byte) 127);
                class217.field3408.method97(~var12 == -2, 512, var11, var10);
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        ++field2895;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 == -5) {
                            this.field2889 = arg1.method1837(252);
                        }
                    } else {
                        this.field2896 = arg1.method1837(252);
                    }
                } else {
                    this.field2897 = arg1.method1849(255);
                }
            } else {
                this.field2893 = arg1.method1837(arg2 ^ 224);
            }
        } else {
            this.field2887 = arg1.method1849(255);
        }
        if (arg2 != 28) {
            method1233(false);
        }
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(B)V")
    public final void method300(byte arg0) {
        class28.method220((byte) -96);
        ++field2902;
        if (arg0 != 35) {
            field2900 = false;
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(II)Lil;")
    public static final class171 method1234(int arg0, int arg1) {
        class171 var2 = (class171) class242.field3801.method1879(8887, (long) arg1);
        ++field2892;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class218.field3432.method1156(16, arg1, (byte) -16);
            class171 var4 = new class171();
            if (var3 != null) {
                var4.method1212((byte) 101, new class274(var3));
            }
            if (arg0 != 28008) {
                field2899 = null;
            }
            class242.field3801.method1883((long) arg1, -99, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "(I)V")
    public static void method1235(int arg0) {
        field2903 = null;
        field2898 = null;
        if (arg0 != 10124) {
            field2903 = null;
        }
        field2899 = null;
        field2894 = null;
    }
}

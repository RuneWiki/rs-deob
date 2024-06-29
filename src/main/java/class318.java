import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class318 extends class335 {

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "I")
    private int field4963 = 16;

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "I")
    private int field4964 = 0;

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "I")
    private int field4962 = 0;

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
    private int field4960 = 4096;

    @OriginalMember(owner = "client!lc", name = "Y", descriptor = "I")
    private int field4973 = 2000;

    @OriginalMember(owner = "client!lc", name = "W", descriptor = "I")
    public static int field4971 = 0;

    @OriginalMember(owner = "client!lc", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field4974 = "Loaded sprites";

    @OriginalMember(owner = "client!lc", name = "T", descriptor = "Lee;")
    public static class224 field4968 = new class224();

    @OriginalMember(owner = "client!lc", name = "ab", descriptor = "I")
    public static int field4975 = 64;

    @OriginalMember(owner = "client!lc", name = "cb", descriptor = "[S")
    public static short[] field4977 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!lc", name = "bb", descriptor = "I")
    public static int field4976 = 0;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!lc", name = "R", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!lc", name = "S", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!lc", name = "U", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!lc", name = "V", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!lc", name = "X", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(III)I", line = 10)
    public static final int method2159(int arg0, int arg1, int arg2) {
        class137 var3 = (class137) class281.field4320.method1222(0, (long) arg1);
        field4969++;
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && arg0 < var3.field2158.length) {
            int var4 = 124 % ((arg2 + 35) / 43);
            return var3.field2158[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V", line = 26)
    public class318() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)V", line = 31)
    public static final void method2160(int arg0) {
        class202.field3028.method2176((byte) 105);
        field4966++;
        class31.field447.method2176((byte) 98);
        if (arg0 < 57) {
            method2161(8);
        }
    }

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)V", line = 43)
    public static void method2161(int arg0) {
        field4968 = null;
        if (arg0 >= -3) {
            method2162(true, -88);
        }
        field4977 = null;
        field4974 = null;
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)V", line = 58)
    public final void method381(int arg0) {
        class117.method865(10);
        field4961++;
        int var2 = 67 / ((arg0 - 44) / 35);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZI)V", line = 69)
    public static final void method2162(boolean arg0, int arg1) {
        field4967++;
        if (arg1 != -27838) {
            return;
        }
        class250.method1736(class177.field2677, class242.field3875, class213.field3252, class11.field175);
        class250.method1730(class217.field3302, class282.field4349, arg0);
        class250.method1734((float) class264.field4105, (float) class321.field5016, (float) class333.field5219);
        class250.method1738();
        class287.field4477 = class288.field4485;
        class55.field914 = class48.field790;
        class287.field4472 = class237.field3777;
        class287.field4473 = class176.field2665;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)[I", line = 91)
    public final int[] method149(int arg0, int arg1) {
        field4965++;
        int[] var3 = this.field5233.method1110((byte) 108, arg0);
        if (arg1 != 621) {
            field4968 = (class224) null;
        }
        if (this.field5233.field2467) {
            int var4 = this.field4960 >> 1;
            int[][] var5 = this.field5233.method1107(0);
            Random var6 = new Random((long) this.field4964);
            for (int var7 = 0; var7 < this.field4973; var7++) {
                int var8 = this.field4960 > 0 ? this.field4962 + class85.method615(var6, this.field4960, true) - var4 : this.field4962;
                int var9 = class85.method615(var6, class105.field1630, true);
                int var10 = var8 >> 4 & 0xFF;
                int var11 = class85.method615(var6, class75.field1213, true);
                int var12 = (class288.field4490[var10] * this.field4963 >> 12) + var9;
                int var13 = (class128.field2009[var10] * this.field4963 >> 12) + var11;
                int var14 = var12 - var9;
                int var15 = var13 - var11;
                if (var14 != 0 || var15 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = var14 < var15;
                    if (var16) {
                        int var17 = var12;
                        var12 = var13;
                        int var18 = var9;
                        var9 = var11;
                        var13 = var17;
                        var11 = var18;
                    }
                    if (var9 > var12) {
                        int var19 = var9;
                        var9 = var12;
                        var12 = var19;
                        int var20 = var11;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = var12 - var9;
                    int var23 = -var22 / 2;
                    int var24 = var13 - var11;
                    int var25 = 2048 / var22;
                    if (var24 < 0) {
                        var24 = -var24;
                    }
                    int var26 = 1024 - (class85.method615(var6, 4096, true) >> 2);
                    int var27 = var11 < var13 ? 1 : -1;
                    for (int var28 = var9; var28 < var12; var28++) {
                        int var29 = (var28 - var9) * var25 + var26 + 1024;
                        var23 += var24;
                        int var30 = var28 & class244.field3906;
                        int var31 = class227.field3597 & var21;
                        if (var23 > 0) {
                            var21 += var27;
                            var23 += -var22;
                        }
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(JB)V", line = 241)
    public static final void method2163(long arg0, byte arg1) {
        class106.field1642.field2532 = 0;
        class106.field1642.method1132((byte) 29, 21);
        if (arg1 > -36) {
            return;
        }
        class106.field1642.method1125(8473, arg0);
        field4970++;
        class37.field558 = 0;
        class233.field3705 = 1;
        class186.field2779 = 0;
        class202.field3033 = -3;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILkh;I)V", line = 276)
    public final void method230(int arg0, class166 arg1, int arg2) {
        if (arg0 == 0) {
            this.field4964 = arg1.method1178(0);
        } else if (arg0 == 1) {
            this.field4973 = arg1.method1151(-111);
        } else if (arg0 == 2) {
            this.field4963 = arg1.method1178(0);
        } else if (arg0 == 3) {
            this.field4962 = arg1.method1151(-119);
        } else if (arg0 == 4) {
            this.field4960 = arg1.method1151(-59);
        }
        if (arg2 >= 51) {
            field4972++;
        }
    }
}

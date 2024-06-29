import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class172 extends class76 {

    @OriginalMember(owner = "client!id", name = "Y", descriptor = "I")
    private int field2943 = 4;

    @OriginalMember(owner = "client!id", name = "Z", descriptor = "I")
    private int field2944 = 4;

    @OriginalMember(owner = "client!id", name = "bb", descriptor = "I")
    public static int field2946 = 0;

    @OriginalMember(owner = "client!id", name = "ab", descriptor = "Lia;")
    public static class257 field2945 = class28.method234(79, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!id", name = "ib", descriptor = "Z")
    public static volatile boolean field2953 = false;

    @OriginalMember(owner = "client!id", name = "jb", descriptor = "S")
    public static short field2954 = 1;

    @OriginalMember(owner = "client!id", name = "db", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!id", name = "eb", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!id", name = "fb", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!id", name = "gb", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!id", name = "hb", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!id", name = "cb", descriptor = "Lti;")
    public static class128 field2947;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field2944 = arg0.method1051((byte) 127);
            }
        } else {
            this.field2943 = arg0.method1051((byte) -60);
        }
        if (arg1 >= -86) {
            method1174((byte) 84);
        }
        ++field2952;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
    public class172() {
        super(1, false);
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(II)[I")
    public final int[] method169(int arg0, int arg1) {
        ++field2950;
        int[] var3 = super.field1467.method1182((byte) -48, arg1);
        if (super.field1467.field2980) {
            int var4 = class96.field1807 / this.field2943;
            int var5 = class13.field249 / this.field2944;
            int[] var7;
            if (~var5 < -1) {
                int var6 = arg1 % var5;
                var7 = this.method562(class13.field249 * var6 / var5, 0, (byte) -104);
            } else {
                var7 = this.method562(0, 0, (byte) -104);
            }
            for (int var8 = 0; class96.field1807 > var8; ++var8) {
                if (~var4 >= -1) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class96.field1807 * var9 / var4];
                }
            }
        }
        if (arg0 != -9351) {
            this.field2943 = 71;
        }
        return var3;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(B)V")
    public static final void method1174(byte arg0) {
        ++field2949;
        if (class238.field4094 != -1 && ~class197.field3326 != 0) {
            int var1 = class198.field3357 - -((-class198.field3357 + class156.field2742) * class143.field2506 >> 16);
            class143.field2506 += var1;
            float[] var2 = new float[3];
            if (class143.field2506 >= 65535) {
                if (class15.field335) {
                    class14.field308 = false;
                } else {
                    class14.field308 = true;
                }
                class143.field2506 = 65535;
                class15.field335 = true;
            } else {
                class14.field308 = false;
                class15.field335 = false;
            }
            float var3 = (float) class143.field2506 / 65535.0F;
            int var4 = class222.field3755 * 2;
            for (int var5 = 0; ~var5 > -4; ++var5) {
                int var21 = class21.field443[class238.field4094][var4 + 1][var5] * 3;
                int var22 = class21.field443[class238.field4094][var4][var5] * 3;
                int var23 = (class21.field443[class238.field4094][var4 + 2][var5] + -class21.field443[class238.field4094][var4 + 3][var5] + class21.field443[class238.field4094][var4 + 2][var5]) * 3;
                int var24 = -(var21 * 2) + var22 - -var23;
                int var25 = -var22 + var21;
                int var26 = class21.field443[class238.field4094][var4][var5];
                int var27 = class21.field443[class238.field4094][var4 - -2][var5] + -var26 + var21 + -var23;
                var2[var5] = (((float) var27 * var3 + (float) var24) * var3 + (float) var25) * var3 + (float) var26;
            }
            class55.field1171 = (int) var2[1] * -1;
            float[] var6 = new float[3];
            if (~class244.field4232 == -1 && class231.field3878 == 0) {
                class244.field4232 = ((int) var2[0] >> 10) * 8 + -48;
                class231.field3878 = (((int) var2[2] >> 10) + -6) * 8;
            }
            class231.field3885 = (int) var2[2] - class231.field3878 * 128;
            class255.field4366 = (int) var2[0] + -(class244.field4232 * 128);
            int var7 = class2.field22 * 2;
            for (int var8 = 0; var8 < 3; ++var8) {
                int var14 = class21.field443[class197.field3326][var7][var8] * 3;
                int var15 = class21.field443[class197.field3326][var7 + 1][var8] * 3;
                int var16 = (class21.field443[class197.field3326][var7 - -2][var8] - (class21.field443[class197.field3326][var7 + 3][var8] + -class21.field443[class197.field3326][var7 + 2][var8])) * 3;
                int var17 = class21.field443[class197.field3326][var7][var8];
                int var18 = -var14 + var15;
                int var19 = -(var15 * 2) + var16 + var14;
                int var20 = class21.field443[class197.field3326][var7 - -2][var8] + -var16 - var17 + var15;
                var6[var8] = (((float) var20 * var3 + (float) var19) * var3 + (float) var18) * var3 + (float) var17;
            }
            float var9 = var6[0] - var2[0];
            float var10 = (var6[1] - var2[1]) * -1.0F;
            float var11 = var6[2] - var2[2];
            double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
            class236.field4048 = (float) Math.atan2((double) var10, var12);
            class46.field1061 = -((float) Math.atan2((double) var9, (double) var11));
            class173.field2956 = 2047 & (int) ((double) class236.field4048 * 325.949D);
            class248.field4276 = 2047 & (int) ((double) class46.field1061 * 325.949D);
            if (arg0 <= 13) {
                field2954 = 118;
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(B)V")
    public static void method1175(byte arg0) {
        field2945 = null;
        field2947 = null;
        if (arg0 > -45) {
            method1175((byte) 102);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)[[I")
    public final int[][] method157(int arg0, byte arg1) {
        ++field2951;
        if (arg1 < 2) {
            this.method157(44, (byte) -128);
        }
        int[][] var3 = super.field1485.method649(arg0, true);
        if (super.field1485.field1692) {
            int var4 = class96.field1807 / this.field2943;
            int var5 = class13.field249 / this.field2944;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method565((byte) -20, 0, class13.field249 * var6 / var5);
            } else {
                var7 = this.method565((byte) -20, 0, 0);
            }
            int[] var8 = var7[2];
            int[] var9 = var7[1];
            int[] var10 = var7[0];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class96.field1807; ++var14) {
                int var15;
                if (~var4 >= -1) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class96.field1807 * var16 / var4;
                }
                var11[var14] = var10[var15];
                var12[var14] = var9[var15];
                var13[var14] = var8[var15];
            }
        }
        return var3;
    }
}

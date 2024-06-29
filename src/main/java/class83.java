import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class83 extends class436 {

    @OriginalMember(owner = "client!d", name = "G", descriptor = "I")
    private int field1268 = 0;

    @OriginalMember(owner = "client!d", name = "U", descriptor = "[S")
    private short[] field1282 = new short[257];

    @OriginalMember(owner = "client!d", name = "M", descriptor = "Ljava/lang/String;")
    public static String field1274 = "Close";

    @OriginalMember(owner = "client!d", name = "K", descriptor = "F")
    public static float field1272;

    @OriginalMember(owner = "client!d", name = "I", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!d", name = "J", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!d", name = "L", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!d", name = "N", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!d", name = "P", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!d", name = "R", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!d", name = "S", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!d", name = "T", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!d", name = "V", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!d", name = "H", descriptor = "[I")
    private int[] field1269;

    @OriginalMember(owner = "client!d", name = "O", descriptor = "[I")
    private int[] field1276;

    @OriginalMember(owner = "client!d", name = "W", descriptor = "[[I")
    private int[][] field1284;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IILeb;)V")
    public final void method18(int arg0, int arg1, class371 arg2) {
        if (arg0 == 34) {
            ++field1277;
            if (~arg1 == -1) {
                this.field1268 = arg2.method2429(arg0 ^ 34);
                this.field1284 = new int[arg2.method2429(0)][2];
                for (int var4 = 0; ~var4 > ~this.field1284.length; ++var4) {
                    this.field1284[var4][0] = arg2.method2403((byte) 80);
                    this.field1284[var4][1] = arg2.method2403((byte) 52);
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "f", descriptor = "(I)V")
    private final void method585(int arg0) {
        int var2 = this.field1268;
        if (~var2 != -3) {
            if (~var2 == -2) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field1284.length + -1 && ~var4 <= ~this.field1284[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field1284[var5 + -1];
                    int[] var7 = this.field1284[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = 4096 - class288.field3991[(8171 & var8) >> 5] >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field1282[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field1284.length + -1) < ~var14 && ~this.field1284[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field1284[var14 + -1];
                    int[] var16 = this.field1284[var14];
                    int var17 = (var13 - var15[0] << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field1282[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~var22 > ~(this.field1284.length - 1) && ~var21 <= ~this.field1284[var22][0]; ++var22) {
                }
                int[] var23 = this.field1284[var22 - 1];
                int[] var24 = this.field1284[var22];
                int var25 = this.method589((byte) 111, var22 - 2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method589((byte) -116, var22 + 1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + var28 + -var27 + var26;
                int var32 = -var26 + var25 + -var31;
                int var33 = var27 - var25;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var26 + var37 + var35 - -var36;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field1282[var20] = (short) var38;
            }
        }
        if (arg0 != 1) {
            this.method585(105);
        }
        ++field1270;
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(B)V")
    public static void method586(byte arg0) {
        field1274 = null;
        if (arg0 != -22) {
            field1272 = 0.6476445F;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)I")
    public static final int method587(byte arg0, int arg1) {
        ++field1275;
        if (arg0 <= 82) {
            method590(5);
        }
        return 255 & arg1;
    }

    @OriginalMember(owner = "client!d", name = "g", descriptor = "(I)V")
    public static final void method588(int arg0) {
        class190 var1 = class414.field6007;
        synchronized (class414.field6007) {
            class414.field6007.method1249(1);
        }
        ++field1271;
        if (arg0 == -14496) {
            class190 var2 = class188.field2607;
            synchronized (class188.field2607) {
                class188.field2607.method1249(1);
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(BI)[I")
    private final int[] method589(byte arg0, int arg1) {
        ++field1280;
        if (arg1 < 0) {
            return this.field1269;
        } else {
            int var3 = 75 / ((arg0 - 48) / 57);
            return this.field1284.length <= arg1 ? this.field1276 : this.field1284[arg1];
        }
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(I)V")
    public final void method44(int arg0) {
        if (arg0 != -14) {
            this.field1269 = null;
        }
        if (this.field1284 == null) {
            this.field1284 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field1273;
        if (this.field1284.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field1268 == -3) {
                this.method591(1);
            }
            class105.method721(false);
            this.method585(1);
        }
    }

    @OriginalMember(owner = "client!d", name = "h", descriptor = "(I)V")
    public static final void method590(int arg0) {
        ++field1278;
        if (class199.field2749 != null) {
            class199.field2749.method1593(3);
            class199.field2749 = null;
        }
        class33.method246(-1);
        class55.method372();
        for (int var1 = 0; var1 < 4; ++var1) {
            class24.field326[var1].method24((byte) -122);
        }
        class142.method968(false, -51);
        System.gc();
        class215.method1376(2, (byte) -115);
        class1.field12 = false;
        class261.field3569 = -1;
        class67.method455(-124, true);
        class354.field4981 = 0;
        class449.field6509 = 0;
        class419.field6055 = 0;
        class64.field988 = false;
        class430.field6183 = 0;
        for (int var2 = 0; ~var2 > ~class132.field1831.length; ++var2) {
            class132.field1831[var2] = null;
        }
        class169.field2407 = 0;
        class71.field1096 = 0;
        for (int var3 = arg0; var3 < 2048; ++var3) {
            class12.field153[var3] = null;
            class257.field3502[var3] = null;
        }
        for (int var4 = 0; ~var4 > -32769; ++var4) {
            class445.field6422[var4] = null;
        }
        class272.field3718.method1418((byte) -53);
        class77.method551(-25874);
        class445.field6418 = 0;
        class97.method685(-2104068048);
        class399.method2585(true);
        class5.method41(-45);
        class276.method1694(true, (byte) 111);
        try {
            class274.method1687(class204.field2772.field4888, -5778, "loggedout");
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        ++field1279;
        int[] var3 = super.field6258.method2688((byte) -91, arg0);
        if (arg1 != 18338) {
            return null;
        } else {
            if (super.field6258.field6138) {
                int[] var4 = this.method2729(0, 0, arg0);
                for (int var5 = 0; ~class43.field653 < ~var5; ++var5) {
                    int var6 = var4[var5] >> 4;
                    if (~var6 > -1) {
                        var6 = 0;
                    }
                    if (var6 > 256) {
                        var6 = 256;
                    }
                    var3[var5] = this.field1282[var6];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!d", name = "i", descriptor = "(I)V")
    private final void method591(int arg0) {
        ++field1281;
        int[] var2 = this.field1284[0];
        int[] var3 = this.field1284[1];
        int[] var4 = this.field1284[this.field1284.length + -2];
        int[] var5 = this.field1284[this.field1284.length - 1];
        this.field1276 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] - (var5[1] - var4[1]) };
        this.field1269 = new int[] { var2[0] - (var3[0] + -var2[0]), var2[arg0] + -var3[1] + var2[1] };
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V")
    public class83() {
        super(1, true);
    }
}

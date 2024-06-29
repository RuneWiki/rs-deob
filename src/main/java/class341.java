import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class341 extends class585 {

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    private int field4759 = 4;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "I")
    private int field4760 = 4;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V", line = 7)
    public class341() {
        super(1, false);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(II)[I", line = 10)
    public final int[] method55(int arg0, int arg1) {
        ++field4758;
        int[] var3 = super.field8255.method1637(-29827, arg0);
        if (arg1 < 123) {
            method2164();
        }
        if (super.field8255.field3677) {
            int var4 = class293.field4278 / this.field4760;
            int var5 = class270.field3923 / this.field4759;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method3415(-127, 0, class270.field3923 * var6 / var5);
            } else {
                var7 = this.method3415(-128, 0, 0);
            }
            for (int var8 = 0; ~var8 > ~class293.field4278; ++var8) {
                if (~var4 >= -1) {
                    var3[var8] = var7[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class293.field4278 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lso;II)V", line = 65)
    public final void method54(class494 arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            this.field4760 = -81;
        }
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field4759 = arg0.method2964((byte) 125);
            }
        } else {
            this.field4760 = arg0.method2964((byte) 71);
        }
        ++field4757;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZI)[[I", line = 101)
    public final int[][] method58(boolean arg0, int arg1) {
        if (arg0) {
            method2164();
        }
        ++field4761;
        int[][] var3 = super.field8265.method1576((byte) 87, arg1);
        if (super.field8265.field3546) {
            int var4 = class293.field4278 / this.field4760;
            int var5 = class270.field3923 / this.field4759;
            int[][] var7;
            if (~var5 < -1) {
                int var6 = arg1 % var5;
                var7 = this.method3417(0, class270.field3923 * var6 / var5, (byte) 113);
            } else {
                var7 = this.method3417(0, 0, (byte) 113);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~class293.field4278 < ~var14; ++var14) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class293.field4278 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "()V", line = 173)
    public static final void method2164() {
        byte var0 = 10;
        byte var1 = 30;
        if (class730.field10110 != 0 && class679.field9437 != null) {
            class228.field3494.method449(class342.field4772);
            for (int var2 = 0; var2 < class189.field2915.length; ++var2) {
                class228.field3494.method547(class606.field8480[var2] + class189.field2915[var2], 48, class342.field4772[3] - class342.field4772[1], class342.field4772[1], -256);
            }
            for (int var3 = 0; var3 < class138.field2052; ++var3) {
                class478 var11 = class335.field4721[var3];
                class228.field3494.method474(var11.field6712[0], var11.field6711[0], var11.field6717[0], class318.field4525);
                class228.field3494.method474(var11.field6712[1], var11.field6711[1], var11.field6717[1], class314.field4470);
                class228.field3494.method474(var11.field6712[2], var11.field6711[2], var11.field6717[2], class468.field6584);
                class228.field3494.method474(var11.field6712[3], var11.field6711[3], var11.field6717[3], class414.field5672);
                if (class318.field4525[2] != -1 && class314.field4470[2] != -1 && class468.field6584[2] != -1 && class414.field5672[2] != -1) {
                    int var12 = -65536;
                    if (var11.field6708 == 4) {
                        var12 = -16776961;
                    }
                    class228.field3494.method446(var12, class314.field4470[1], -118, class318.field4525[1], class314.field4470[0], class318.field4525[0]);
                    class228.field3494.method446(var12, class468.field6584[1], -122, class314.field4470[1], class468.field6584[0], class314.field4470[0]);
                    class228.field3494.method446(var12, class414.field5672[1], -121, class468.field6584[1], class414.field5672[0], class468.field6584[0]);
                    class228.field3494.method446(var12, class318.field4525[1], -122, class414.field5672[1], class318.field4525[0], class414.field5672[0]);
                    class228.field3494.method446(var12, class468.field6584[1], -121, class318.field4525[1], class468.field6584[0], class318.field4525[0]);
                }
            }
            class679.field9437.method563("Dynamic: " + class309.field4423 + "/" + 5000, (byte) 59, -256, -16777216, var1 + 45, var0);
            class679.field9437.method563("Total Opaque Onscreen: " + class536.field7716 + "/" + 10000, (byte) 102, -256, -16777216, var1 + 60, var0);
            class679.field9437.method563("Total Trans Onscreen: " + class215.field3321 + "/" + 5000, (byte) -77, -256, -16777216, var1 + 75, var0);
            class679.field9437.method563("Occluders: " + (class715.field9911 + class169.field2647) + " Active: " + class138.field2052, (byte) 64, -256, -16777216, var1 + 90, var0);
            class679.field9437.method563("Occluded: Ground:" + class650.field9083 + " Walls: " + class612.field8598 + " CPs: " + class211.field3269 + " Pixels: " + class710.field9866, (byte) 96, -256, -16777216, var1 + 105, var0);
            class679.field9437.method563("Occlude Calc Took: " + class387.field5361 / 1000L + "us", (byte) -74, -256, -16777216, var1 + 120, var0);
            if (class730.field10110 == 2 && class485.field6828 != null) {
                for (int var4 = 0; var4 < class485.field6828.length; ++var4) {
                    float var6 = (float) class485.field6828[var4];
                    float var7 = var6 / 4194304.0F;
                    if (var7 > 1.0F) {
                        var7 = 1.0F;
                    }
                    float var8 = var7 * 255.0F;
                    float var9 = 255.0F - var8;
                    int var10 = (int) var9;
                    class485.field6828[var4] = var10 | var10 << 8 | var10 << 16 | -16777216;
                }
                class241 var5 = class228.field3494.method458((byte) -83, class215.field3323, class476.field6672, class485.field6828, class476.field6672, 0);
                var5.method364(var0, 170, 1, 0, 0);
            }
        }
    }
}

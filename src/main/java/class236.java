import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class236 extends class466 {

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
    private int field3304 = 0;

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "I")
    private int field3313 = 16;

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "I")
    private int field3315 = 0;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
    private int field3308 = 2000;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "I")
    private int field3309 = 4096;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "Lcba;")
    public static class471 field3306 = new class471(10, 3);

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    public static int field3312 = 0;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "[I")
    public static int[] field3314 = new int[50];

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "Lan;")
    public static class21 field3305;

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
    public class236() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLj;)Z")
    public static final boolean method1479(byte arg0, class463 arg1) {
        ++field3316;
        if (arg1 == null) {
            return false;
        } else if (!arg1.field6542) {
            return false;
        } else if (!arg1.method2709(class413.field5804, (byte) -110)) {
            return false;
        } else if (class534.field7466.method1242(0, (long) arg1.field6533) != null) {
            return false;
        } else {
            if (arg0 != -113) {
                method1479((byte) 55, (class463) null);
            }
            return class466.field6563.method1242(0, (long) arg1.field6499) == null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        ++field3310;
        if (arg1 != -5062) {
            this.method6((class11) null, 9, 41);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 == 4) {
                            this.field3309 = arg0.method93((byte) 76);
                        }
                    } else {
                        this.field3315 = arg0.method93((byte) 76);
                    }
                } else {
                    this.field3313 = arg0.method110((byte) 95);
                }
            } else {
                this.field3308 = arg0.method93((byte) 105);
            }
        } else {
            this.field3304 = arg0.method110((byte) 122);
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V")
    public static void method1480(byte arg0) {
        if (arg0 == 46) {
            field3305 = null;
            field3314 = null;
            field3306 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
    public final void method7(int arg0) {
        ++field3307;
        class225.method1442(256);
        if (arg0 != -806066388) {
            field3305 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        ++field3311;
        if (arg1 != 0) {
            field3312 = 66;
        }
        int[] var3 = super.field6557.method565(arg0, -24728);
        if (super.field6557.field1163) {
            int var4 = this.field3309 >> 1;
            int[][] var5 = super.field6557.method567(0);
            Random var6 = new Random((long) this.field3304);
            for (int var7 = 0; this.field3308 > var7; ++var7) {
                int var8 = ~this.field3309 >= -1 ? this.field3315 : this.field3315 + class303.method1924((byte) -73, var6, this.field3309) + -var4;
                int var9 = 255 & var8 >> 4;
                int var10 = class303.method1924((byte) -119, var6, class312.field4207);
                int var11 = class303.method1924((byte) -127, var6, class564.field7814);
                int var12 = var10 - -(class46.field898[var9] * this.field3313 >> 12);
                int var13 = (class566.field7828[var9] * this.field3313 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = -var10 + var12;
                if (var15 != 0 || ~var14 != -1) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (~var10 < ~var12) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 - (class303.method1924((byte) -113, var6, 4096) >> 2);
                    int var27 = var13 <= var11 ? -1 : 1;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; var28 < var12; ++var28) {
                        int var29 = (-var10 + var28) * var25 + var26 + 1024;
                        int var30 = class340.field4582 & var28;
                        int var31 = class105.field1581 & var21;
                        var24 += var23;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (~var24 < -1) {
                            var24 += -var22;
                            var21 += var27;
                        }
                    }
                }
            }
        }
        return var3;
    }
}

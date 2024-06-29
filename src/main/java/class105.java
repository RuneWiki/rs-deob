import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class105 extends class263 {

    @OriginalMember(owner = "client!si", name = "G", descriptor = "I")
    private int field1569 = 0;

    @OriginalMember(owner = "client!si", name = "P", descriptor = "I")
    private int field1577 = 16;

    @OriginalMember(owner = "client!si", name = "I", descriptor = "I")
    private int field1571 = 2000;

    @OriginalMember(owner = "client!si", name = "O", descriptor = "I")
    private int field1576 = 0;

    @OriginalMember(owner = "client!si", name = "R", descriptor = "I")
    private int field1579 = 4096;

    @OriginalMember(owner = "client!si", name = "L", descriptor = "Luv;")
    public static class2 field1573 = new class2(88, -1);

    @OriginalMember(owner = "client!si", name = "Q", descriptor = "[I")
    public static int[] field1578 = new int[5];

    @OriginalMember(owner = "client!si", name = "E", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!si", name = "F", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!si", name = "H", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!si", name = "K", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!si", name = "M", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!si", name = "N", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
    public class105() {
        super(0, true);
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(B)V")
    public static void method789(byte arg0) {
        if (arg0 != -110) {
            field1572 = 108;
        }
        field1573 = null;
        field1578 = null;
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(B)V")
    public final void method748(byte arg0) {
        if (arg0 != 110) {
            this.field1571 = -100;
        }
        class200.method1326(27);
        ++field1574;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)[I")
    public final int[] method33(int arg0, byte arg1) {
        ++field1567;
        if (arg1 < 40) {
            this.method33(16, (byte) -16);
        }
        int[] var3 = super.field3917.method41(arg0, 1);
        if (super.field3917.field91) {
            int var4 = this.field1579 >> 1;
            int[][] var5 = super.field3917.method42(0);
            Random var6 = new Random((long) this.field1576);
            for (int var7 = 0; ~this.field1571 < ~var7; ++var7) {
                int var8 = this.field1579 > 0 ? -var4 + this.field1569 + class363.method2166(22591, this.field1579, var6) : this.field1569;
                int var9 = 255 & var8 >> 4;
                int var10 = class363.method2166(22591, class367.field5597, var6);
                int var11 = class363.method2166(22591, class372.field5635, var6);
                int var12 = (class14.field188[var9] * this.field1577 >> 12) + var10;
                int var13 = (class498.field7386[var9] * this.field1577 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = var12 - var10;
                if (~var15 != -1 || var14 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = ~var15 > ~var14;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var12 = var13;
                        var11 = var17;
                        var13 = var18;
                    }
                    if (~var12 > ~var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 + -(class363.method2166(22591, 4096, var6) >> 2);
                    int var27 = ~var11 > ~var13 ? 1 : -1;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; ~var28 > ~var12; ++var28) {
                        int var29 = (-var10 + var28) * var25 + 1024 + var26;
                        int var30 = class83.field1326 & var28;
                        int var31 = class142.field2133 & var21;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        var24 += var23;
                        if (var24 > 0) {
                            var24 -= var22;
                            var21 -= -var27;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IZLgk;)V")
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        if (!arg1) {
            this.field1579 = -32;
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 == 4) {
                            this.field1579 = arg2.method2727((byte) 43);
                        }
                    } else {
                        this.field1569 = arg2.method2727((byte) 43);
                    }
                } else {
                    this.field1577 = arg2.method2765(113);
                }
            } else {
                this.field1571 = arg2.method2727((byte) 43);
            }
        } else {
            this.field1576 = arg2.method2765(59);
        }
        ++field1568;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lgk;II)Ljava/lang/String;")
    public static final String method790(class468 arg0, int arg1, int arg2) {
        ++field1575;
        try {
            if (arg1 != -1) {
                method790((class468) null, 71, 102);
            }
            int var3 = arg0.method2724(arg1 + 256);
            if (~var3 < ~arg2) {
                var3 = arg2;
            }
            byte[] var4 = new byte[var3];
            arg0.field6830 += class262.field3908.method2669(arg0.field6868, var4, 0, var3, 0, arg0.field6830);
            return class222.method1405((byte) -20, var4, 0, var3);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}

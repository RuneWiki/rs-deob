import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class491 extends class371 {

    @OriginalMember(owner = "client!vw", name = "I", descriptor = "I")
    private int field7417 = 1365;

    @OriginalMember(owner = "client!vw", name = "J", descriptor = "I")
    private int field7418 = 0;

    @OriginalMember(owner = "client!vw", name = "N", descriptor = "I")
    private int field7422 = 20;

    @OriginalMember(owner = "client!vw", name = "Q", descriptor = "I")
    private int field7425 = 0;

    @OriginalMember(owner = "client!vw", name = "P", descriptor = "[I")
    public static int[] field7424 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!vw", name = "S", descriptor = "J")
    public static long field7427 = 0L;

    @OriginalMember(owner = "client!vw", name = "R", descriptor = "Loq;")
    public static class603 field7426 = new class603();

    @OriginalMember(owner = "client!vw", name = "K", descriptor = "I")
    public static int field7419;

    @OriginalMember(owner = "client!vw", name = "L", descriptor = "I")
    public static int field7420;

    @OriginalMember(owner = "client!vw", name = "M", descriptor = "I")
    public static int field7421;

    @OriginalMember(owner = "client!vw", name = "O", descriptor = "I")
    public static int field7423;

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(B)V")
    public static void method2971(byte arg0) {
        field7426 = null;
        field7424 = null;
        if (arg0 >= -95) {
            method2971((byte) 2);
        }
    }

    @OriginalMember(owner = "client!vw", name = "<init>", descriptor = "()V")
    public class491() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(III)Llaa;")
    public static final class578 method2972(int arg0, int arg1, int arg2) {
        class415 var3 = class526.field7777[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5987;
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(BI)[I")
    public final int[] method79(byte arg0, int arg1) {
        ++field7423;
        if (arg0 >= -80) {
            field7426 = null;
        }
        int[] var3 = super.field5378.method1451(113, arg1);
        if (super.field5378.field3254) {
            for (int var4 = 0; ~class41.field455 < ~var4; ++var4) {
                int var5 = (class287.field4215[var4] << 12) / this.field7417 - -this.field7425;
                int var6 = (class614.field9004[arg1] << 12) / this.field7417 - -this.field7418;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 - -var12 < 16384 && ~this.field7422 < ~var13) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = -var12 + var7 + var11;
                    ++var13;
                    var11 = var9 * var9 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = var13 >= this.field7422 + -1 ? 0 : (var13 << 12) / this.field7422;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(IBLps;)V")
    public final void method81(int arg0, byte arg1, class428 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 == 3) {
                        this.field7418 = arg2.method2620(122);
                    }
                } else {
                    this.field7425 = arg2.method2620(39);
                }
            } else {
                this.field7422 = arg2.method2620(67);
            }
        } else {
            this.field7417 = arg2.method2620(111);
        }
        ++field7419;
        int var5 = 56 / ((arg1 - -15) / 39);
    }

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "(B)V")
    public static final void method2973(byte arg0) {
        class326.field4829 = null;
        if (arg0 < -120) {
            ++field7420;
            class225.field3320 = null;
        }
    }

    @OriginalMember(owner = "client!vw", name = "g", descriptor = "(I)V")
    public static final void method2974(int arg0) {
        ++field7421;
        if (class257.field3756) {
            if (arg0 != -1294896212) {
                method2972(90, -81, 73);
            }
            while (true) {
                while (~class541.field8100 > ~class626.field9173.length) {
                    class418 var1 = class626.field9173[class541.field8100];
                    if (var1 != null && ~var1.field6004 == 0) {
                        if (class313.field4713 == null) {
                            class313.field4713 = class470.field7161.method3443(-7571, var1.field6005);
                        }
                        int var2 = class313.field4713.field5662;
                        if (~var2 == 0) {
                            return;
                        }
                        class313.field4713 = null;
                        ++class541.field8100;
                        var1.field6004 = var2;
                    } else {
                        ++class541.field8100;
                    }
                }
                return;
            }
        }
    }
}

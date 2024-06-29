import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class283 extends class45 {

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "I")
    private int field4037 = 0;

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
    private int field4039 = 1;

    @OriginalMember(owner = "client!lg", name = "R", descriptor = "I")
    private int field4046 = 0;

    @OriginalMember(owner = "client!lg", name = "O", descriptor = "Liv;")
    public static class64 field4043 = new class64(108, 5);

    @OriginalMember(owner = "client!lg", name = "S", descriptor = "Ljv;")
    public static class55 field4047 = new class55(50);

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!lg", name = "M", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!lg", name = "N", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!lg", name = "P", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!lg", name = "Q", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!lg", name = "T", descriptor = "Lcg;")
    public static class90 field4048;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "(I)V", line = 6)
    public static void method1803(int arg0) {
        if (arg0 != 0) {
            field4043 = null;
        }
        field4043 = null;
        field4047 = null;
        field4048 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)[I", line = 18)
    public final int[] method35(int arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field4042;
            int[] var3 = super.field854.method863((byte) 12, arg1);
            if (super.field854.field1928) {
                int var4 = class433.field6429[arg1];
                int var5 = var4 + -2048 >> 1;
                for (int var6 = 0; ~class259.field3768 < ~var6; ++var6) {
                    int var7 = class69.field1199[var6];
                    int var8 = var7 + -2048 >> 1;
                    int var11;
                    if (~this.field4046 != -1) {
                        int var9 = var5 * var5 + var8 * var8 >> 12;
                        int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                        var11 = (int) ((double) (this.field4039 * var10) * 3.141592653589793D);
                    } else {
                        var11 = (-var4 + var7) * this.field4039;
                    }
                    int var12 = var11 - (var11 & -4096);
                    if (~this.field4037 != -1) {
                        if (this.field4037 == 2) {
                            var12 -= 2048;
                            if (~var12 > -1) {
                                var12 = -var12;
                            }
                            var12 = 2048 - var12 << 1;
                        }
                    } else {
                        var12 = class68.field1167[(var12 & 4085) >> 4] + 4096 >> 1;
                    }
                    var3[var6] = var12;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lli;ILjava/awt/Frame;)V", line = 87)
    public static final void method1804(class293 arg0, int arg1, Frame arg2) {
        while (true) {
            class324 var3 = arg0.method1846(arg2, 7);
            while (~var3.field4940 == -1) {
                class71.method583(10L, -84);
            }
            if (var3.field4940 == 1) {
                if (arg1 != 100) {
                    method1805(-86);
                }
                ++field4045;
                arg2.setVisible(false);
                arg2.dispose();
                return;
            }
            class71.method583(100L, 29);
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V", line = 117)
    public class283() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(I)V", line = 120)
    public final void method38(int arg0) {
        class416.method2523(4096);
        if (arg0 == 4095) {
            ++field4044;
        }
    }

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "(I)V", line = 134)
    public static final void method1805(int arg0) {
        if (arg0 != -411739327) {
            field4048 = null;
        }
        class89.field1554 = class237.method1555(-115, true, 4, 35, 0.4F, 2048, 8, 8);
        ++field4041;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIIIII)Z", line = 151)
    public static final boolean method1806(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field4040;
        if (arg1 != 1) {
            return false;
        } else if (~arg3 > ~(arg5 + arg7) && ~arg7 > ~(arg0 + arg3)) {
            return arg8 < arg4 + arg6 && ~(arg2 + arg8) < ~arg6;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lcu;II)V", line = 171)
    public final void method37(class145 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 3) {
                    this.field4039 = arg0.method1063((byte) -102);
                }
            } else {
                this.field4037 = arg0.method1063((byte) 106);
            }
        } else {
            this.field4046 = arg0.method1063((byte) 112);
        }
        if (arg1 == -26471) {
            ++field4036;
        }
    }

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "(I)V", line = 229)
    public static final void method1807(int arg0) {
        ++field4038;
        for (class271 var1 = (class271) class470.field7034.method1634(arg0 + -622499828); var1 != null; var1 = (class271) class470.field7034.method1634(92)) {
            class156.method1173(var1, (byte) -98);
        }
        int var2;
        int var3;
        if (class443.field6623.method2840(255, class169.field2624)) {
            var2 = 3;
            var3 = 0;
        } else {
            var2 = class430.field6392;
            var3 = class430.field6392;
        }
        client.method1345();
        if (arg0 != 622499940) {
            method1805(42);
        }
        for (int var4 = var3; ~var4 >= ~var2; ++var4) {
            client.method1343();
            client.method1354(var4);
            client.method1358(var4);
        }
        client.method1355();
        client.method1336();
    }
}

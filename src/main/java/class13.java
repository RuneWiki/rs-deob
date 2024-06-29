import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class13 extends class512 {

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
    private int field145 = 0;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
    private int field147 = 1;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
    private int field154 = 0;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "[I")
    public static int[] field150 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILqs;Lqs;)V", line = 3)
    public static final void method68(int arg0, class496 arg1, class496 arg2) {
        ++field152;
        class351.field5486 = arg2;
        class448.field6682 = arg1;
        if (arg0 != -1) {
            method72((byte) -41);
        }
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(I)V", line = 15)
    public static void method69(int arg0) {
        field150 = null;
        if (arg0 != 15) {
            method70(118, 70);
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(II)Z", line = 29)
    public static final boolean method70(int arg0, int arg1) {
        if (arg0 != 1001) {
            return false;
        } else {
            ++field149;
            return arg1 == 2 || ~arg1 == -4 || arg1 == 4 || arg1 == 5;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZILia;)V", line = 42)
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -4) {
                    this.field147 = arg2.method126((byte) -93);
                }
            } else {
                this.field154 = arg2.method126((byte) -87);
            }
        } else {
            this.field145 = arg2.method126((byte) -124);
        }
        ++field146;
        if (!arg0) {
            method73((byte) 100, -78, 51, -81, -57);
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V", line = 88)
    public class13() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)V", line = 92)
    public static final void method72(byte arg0) {
        int var1 = 62 % ((39 - arg0) / 33);
        ++field148;
        class280.field4594.method2525(0);
        class14.field157.method3049(2);
        class367.field5707.method3049(2);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BIIII)I", line = 106)
    public static final int method73(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field156;
        int var5 = 15 & arg3;
        int var6 = ~var5 > -9 ? arg4 : arg1;
        if (arg0 != -12) {
            field151 = -59;
        }
        int var7 = var5 >= 4 ? (~var5 != -13 && var5 != 14 ? arg2 : arg4) : arg1;
        return (~(2 & var5) != -1 ? -var7 : var7) + (~(1 & var5) == -1 ? var6 : -var6);
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)V", line = 136)
    public final void method74(int arg0) {
        class187.method1265(arg0 ^ 12644);
        if (arg0 != 12388) {
            this.method74(118);
        }
        ++field153;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)[I", line = 150)
    public final int[] method75(int arg0, byte arg1) {
        int var3 = 57 / ((43 - arg1) / 48);
        ++field144;
        int[] var4 = super.field7494.method232(arg0, true);
        if (super.field7494.field474) {
            int var5 = class412.field6233[arg0];
            int var6 = var5 + -2048 >> 1;
            for (int var7 = 0; var7 < class402.field6113; ++var7) {
                int var8 = class276.field4540[var7];
                int var9 = var8 + -2048 >> 1;
                int var12;
                if (this.field145 != 0) {
                    int var10 = var9 * var9 - -(var6 * var6) >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var12 = (int) ((double) (this.field147 * var11) * 3.141592653589793D);
                } else {
                    var12 = (-var5 + var8) * this.field147;
                }
                int var13 = var12 - (var12 & -4096);
                if (this.field154 == 0) {
                    var13 = class309.field4912[255 & var13 >> 4] + 4096 >> 1;
                } else if (~this.field154 == -3) {
                    var13 -= 2048;
                    if (~var13 > -1) {
                        var13 = -var13;
                    }
                    var13 = -var13 + 2048 << 1;
                }
                var4[var7] = var13;
            }
        }
        return var4;
    }
}

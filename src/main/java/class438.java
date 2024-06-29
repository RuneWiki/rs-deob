import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class438 extends class192 {

    @OriginalMember(owner = "client!qm", name = "M", descriptor = "I")
    private int field5663 = -1;

    @OriginalMember(owner = "client!qm", name = "R", descriptor = "I")
    public static int field5668 = 0;

    @OriginalMember(owner = "client!qm", name = "O", descriptor = "Ljava/lang/String;")
    public static String field5665 = null;

    @OriginalMember(owner = "client!qm", name = "I", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!qm", name = "J", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!qm", name = "K", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!qm", name = "N", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!qm", name = "P", descriptor = "I")
    public static int field5666;

    @OriginalMember(owner = "client!qm", name = "Q", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!qm", name = "S", descriptor = "I")
    public int field5669;

    @OriginalMember(owner = "client!qm", name = "T", descriptor = "I")
    public int field5670;

    @OriginalMember(owner = "client!qm", name = "U", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!qm", name = "V", descriptor = "I")
    public static int field5672;

    @OriginalMember(owner = "client!qm", name = "L", descriptor = "[I")
    public int[] field5662;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lpca;I)V")
    public static final void method2488(class532 arg0, int arg1) {
        if (arg1 == 22299) {
            ++field5666;
            for (class118 var2 = (class118) class253.field3444.method2090(true); var2 != null; var2 = (class118) class253.field3444.method2088(-152)) {
                if (var2.field1518 == arg0) {
                    if (var2.field1530 != null) {
                        class690.field9426.method2236(var2.field1530);
                        var2.field1530 = null;
                    }
                    var2.method2438((byte) -18);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V")
    public class438() {
        super(0, false);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIII)V")
    public static final void method2489(int arg0, int arg1, int arg2, int arg3) {
        ++field5659;
        if (arg1 != -1011358554) {
            method2490(-34);
        }
        String var4 = "tele " + arg2 + "," + (arg0 >> 6) + "," + (arg3 >> 6) + "," + (63 & arg0) + "," + (arg3 & 63);
        System.out.println(var4);
        class640.method3528(var4, true, -4, false);
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V")
    public static void method2490(int arg0) {
        if (arg0 != -14547) {
            field5668 = 50;
        }
        field5665 = null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
    public final void method1255(int arg0) {
        super.method1255(70);
        ++field5672;
        this.field5662 = null;
        int var2 = -110 % ((11 - arg0) / 54);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILfd;I)V")
    public final void method109(int arg0, class418 arg1, int arg2) {
        if (~arg0 == -1) {
            this.field5663 = arg1.method2393(-30727);
        }
        if (arg2 == -12160) {
            ++field5660;
        }
    }

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "(I)Z")
    public final boolean method2491(int arg0) {
        ++field5661;
        if (this.field5662 != null) {
            return true;
        } else if (this.field5663 >= 0) {
            class506 var2 = ~class54.field734 > -1 ? class506.method2724(class512.field6696, this.field5663) : class506.method2732(class512.field6696, class54.field734, this.field5663);
            var2.method2734();
            this.field5662 = var2.method2730();
            this.field5669 = var2.field6650;
            this.field5670 = var2.field6651;
            return true;
        } else {
            if (arg0 != -1) {
                this.method1257((byte) 42);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(IB)[[I")
    public int[][] method107(int arg0, byte arg1) {
        ++field5667;
        int var3 = 32 / ((arg1 - -14) / 34);
        int[][] var4 = super.field2467.method2466(arg0, 0);
        if (super.field2467.field5565 && this.method2491(-1)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = this.field5670 * (~class505.field6643 != ~this.field5669 ? this.field5669 * arg0 / class505.field6643 : arg0);
            if (class561.field7319 != this.field5670) {
                for (int var9 = 0; var9 < class561.field7319; ++var9) {
                    int var10 = this.field5670 * var9 / class561.field7319;
                    int var11 = this.field5662[var8 + var10];
                    var7[var9] = class597.method3238(4080, var11 << 4);
                    var6[var9] = class597.method3238(var11 >> 4, 4080);
                    var5[var9] = class597.method3238(var11, 16711680) >> 12;
                }
            } else {
                for (int var12 = 0; ~var12 > ~class561.field7319; ++var12) {
                    int var13 = this.field5662[var8++];
                    var7[var12] = class597.method3238(4080, var13 << 4);
                    var6[var12] = class597.method3238(var13 >> 4, 4080);
                    var5[var12] = class597.method3238(var13, 16711680) >> 12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "(B)I")
    public final int method1257(byte arg0) {
        int var2 = -100 % ((-30 - arg0) / 58);
        ++field5664;
        return this.field5663;
    }
}

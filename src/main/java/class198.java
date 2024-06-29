import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class198 extends class325 {

    @OriginalMember(owner = "client!ffa", name = "D", descriptor = "I")
    private int field2643 = 20;

    @OriginalMember(owner = "client!ffa", name = "C", descriptor = "I")
    private int field2642 = 1365;

    @OriginalMember(owner = "client!ffa", name = "E", descriptor = "I")
    private int field2644 = 0;

    @OriginalMember(owner = "client!ffa", name = "K", descriptor = "I")
    private int field2649 = 0;

    @OriginalMember(owner = "client!ffa", name = "F", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!ffa", name = "G", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!ffa", name = "H", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!ffa", name = "L", descriptor = "Luu;")
    public static class303 field2650;

    @OriginalMember(owner = "client!ffa", name = "J", descriptor = "Z")
    public static boolean field2648;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Ljp;IB)V")
    public final void method95(class376 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 == -4) {
                        this.field2644 = arg0.method2359(-1);
                    }
                } else {
                    this.field2649 = arg0.method2359(-1);
                }
            } else {
                this.field2643 = arg0.method2359(-1);
            }
        } else {
            this.field2642 = arg0.method2359(-1);
        }
        if (arg2 > -41) {
            method1358(-101);
        }
        ++field2645;
    }

    @OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "()V")
    public class198() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Lwea;ZZ)V")
    public static final void method1357(class167 arg0, boolean arg1, boolean arg2) {
        arg0.field2255 = arg2;
        if (class238.field3214) {
            if (arg1) {
                class398.field5838[class398.field5838.length - 1].method3135(arg0, (byte) 109);
            } else {
                int var3 = class566.method3164(arg0.field2245);
                int var4 = class319.field4598[2] * arg0.method28(-13878) / arg0.field2253;
                int var5 = class566.method3164(arg0.field2245 - var4);
                int var6 = class566.method3164(arg0.field2245 + var4);
                if (var5 == var6) {
                    class398.field5838[var3].method3135(arg0, (byte) 109);
                } else if (var6 - var5 == 1) {
                    class398.field5838[class458.field6353 + var5].method3135(arg0, (byte) 109);
                } else {
                    class398.field5838[class398.field5838.length - 1].method3135(arg0, (byte) 109);
                }
            }
        } else {
            class586.method3257(arg0, class720.field10034);
        }
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)V")
    public static void method1358(int arg0) {
        field2650 = null;
        if (arg0 != 16384) {
            method1357((class167) null, true, true);
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BI)[I")
    public final int[] method100(byte arg0, int arg1) {
        ++field2646;
        int[] var3 = super.field4727.method2603(arg1, -13476);
        if (arg0 < 21) {
            this.field2643 = -10;
        }
        if (super.field4727.field6067) {
            for (int var4 = 0; class261.field3874 > var4; ++var4) {
                int var5 = (class556.field7498[var4] << 12) / this.field2642 + this.field2649;
                int var6 = (class621.field8370[arg1] << 12) / this.field2642 + this.field2644;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13;
                for (var13 = 0; var11 + var12 < 16384 && ~this.field2643 < ~var13; ++var13) {
                    var10 = (var9 * var10 >> 12) * 2 - -var8;
                    var9 = var7 + var11 + -var12;
                    var11 = var9 * var9 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = ~(this.field2643 + -1) >= ~var13 ? 0 : (var13 << 12) / this.field2643;
            }
        }
        return var3;
    }
}

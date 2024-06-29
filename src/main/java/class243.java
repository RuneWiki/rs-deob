import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class243 extends class330 {

    @OriginalMember(owner = "client!hr", name = "J", descriptor = "I")
    private int field3601 = 2048;

    @OriginalMember(owner = "client!hr", name = "D", descriptor = "I")
    private int field3596 = 3072;

    @OriginalMember(owner = "client!hr", name = "N", descriptor = "I")
    private int field3605 = 1024;

    @OriginalMember(owner = "client!hr", name = "K", descriptor = "Lfea;")
    public static class678 field3602 = new class678("WTI", "office", "_wti", 5);

    @OriginalMember(owner = "client!hr", name = "E", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!hr", name = "F", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!hr", name = "H", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!hr", name = "I", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!hr", name = "L", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!hr", name = "M", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)V", line = 3)
    public static void method1628(int arg0) {
        if (arg0 != 0) {
            field3602 = null;
        }
        field3602 = null;
    }

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "(B)V", line = 15)
    public final void method653(byte arg0) {
        this.field3601 = this.field3596 - this.field3605;
        int var2 = -81 / ((50 - arg0) / 41);
        ++field3600;
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "()V", line = 28)
    public class243() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lgga;IB)V", line = 31)
    public final void method466(class511 arg0, int arg1, byte arg2) {
        ++field3604;
        int var4 = 37 / ((arg2 - -41) / 42);
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field4636 = arg0.method3013(84) == 1;
                }
            } else {
                this.field3596 = arg0.method3002(-1);
            }
        } else {
            this.field3605 = arg0.method3002(-1);
        }
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(II)V", line = 82)
    public static final void method1629(int arg0, int arg1) {
        if (class688.field9602.field8504.method1300((byte) -98) == 0) {
            arg0 = -1;
        }
        ++field3599;
        if (~class392.field5586 != ~arg0) {
            if (arg0 != -1) {
                class606 var2 = class315.field4514.method1869(arg0, 33);
                class279 var3 = var2.method3497(false);
                if (var3 != null) {
                    class129.field1674.method4239(true, var3.method1818(), class749.field10341, var3.method1813(), var3.method1816(), new Point(var2.field8494, var2.field8491));
                    class392.field5586 = arg0;
                } else {
                    arg0 = -1;
                }
            }
            if (arg1 == 4592) {
                if (~arg0 == 0 && class392.field5586 != -1) {
                    class129.field1674.method4239(true, (int[]) null, class749.field10341, -1, -1, new Point());
                    class392.field5586 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IZ)[I", line = 127)
    public final int[] method464(int arg0, boolean arg1) {
        ++field3603;
        int[] var3 = super.field4630.method2475(arg0, 30011);
        if (arg1) {
            this.field3596 = -77;
        }
        if (super.field4630.field5704) {
            int[] var4 = this.method2084(0, arg0, (byte) 21);
            for (int var5 = 0; class80.field901 > var5; ++var5) {
                var3[var5] = this.field3605 - -(var4[var5] * this.field3601 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)[[I", line = 164)
    public final int[][] method537(int arg0, int arg1) {
        ++field3597;
        if (arg0 != 0) {
            this.field3605 = 76;
        }
        int[][] var3 = super.field4621.method1597(arg1, true);
        if (super.field4621.field3510) {
            int[][] var4 = this.method2082(arg1, 0, 124);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class80.field901 > var11; ++var11) {
                var8[var11] = (var5[var11] * this.field3601 >> 12) + this.field3605;
                var9[var11] = this.field3605 - -(var6[var11] * this.field3601 >> 12);
                var10[var11] = (var7[var11] * this.field3601 >> 12) + this.field3605;
            }
        }
        return var3;
    }
}

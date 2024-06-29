import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class546 extends class292 {

    @OriginalMember(owner = "client!eba", name = "q", descriptor = "I")
    public static int field7760;

    @OriginalMember(owner = "client!eba", name = "r", descriptor = "I")
    public static int field7761;

    @OriginalMember(owner = "client!eba", name = "s", descriptor = "I")
    public static int field7762;

    @OriginalMember(owner = "client!eba", name = "t", descriptor = "I")
    public static int field7763;

    @OriginalMember(owner = "client!eba", name = "u", descriptor = "I")
    public static int field7764;

    @OriginalMember(owner = "client!eba", name = "v", descriptor = "I")
    public static int field7765;

    @OriginalMember(owner = "client!eba", name = "w", descriptor = "I")
    public static int field7766;

    @OriginalMember(owner = "client!eba", name = "x", descriptor = "I")
    public static int field7767;

    @OriginalMember(owner = "client!eba", name = "d", descriptor = "(I)Z")
    public final boolean method604(int arg0) {
        if (arg0 != 24561) {
            this.method602(true, (byte) 87);
        }
        ++field7763;
        return true;
    }

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "(III)I")
    public static final int method3152(int arg0, int arg1, int arg2) {
        ++field7762;
        if (class438.field6314 == -1) {
            return 1;
        } else {
            if (class90.field1654 != arg1) {
                class240.method1590(class265.field3888.method1733(arg0 ^ 255, class140.field2466), 3, arg1);
                if (~class90.field1654 != ~arg1) {
                    return -1;
                }
            }
            try {
                Dimension var3 = class699.field9853.getSize();
                class341.method2191(class623.field9017, class265.field3888.method1733(255, class140.field2466), true, class363.field5394, class612.field8916, (byte) -127);
                class519 var4 = class79.method826(class438.field6314, 0, arg0 ^ 4096, class344.field5127);
                long var5 = class525.method3074((byte) -101);
                class623.field9017.method107();
                class608.field8854.method905(0, class271.field4068, 0);
                class623.field9017.method145(class608.field8854);
                class623.field9017.method62(var3.width / 2, var3.height / 2, 512, 512);
                class623.field9017.method143(1.0F);
                class623.field9017.method95(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
                class55 var7 = class623.field9017.method37(var4, 2048, 64, 64, 768);
                int var8 = arg0;
                label41: for (int var9 = 0; ~var9 > -501; ++var9) {
                    class623.field9017.method42(0);
                    class623.field9017.method28();
                    for (int var10 = 15; var10 >= 0; --var10) {
                        for (int var11 = 0; var10 >= var11; ++var11) {
                            class241.field3647.method905((int) (((float) var11 - (float) var10 / 2.0F) * (float) class576.field8369), 0, (var10 - -1) * class576.field8369);
                            var7.method334(class241.field3647, (class684) null, 0);
                            ++var8;
                            if ((long) arg2 <= -var5 + class525.method3074((byte) -101)) {
                                break label41;
                            }
                        }
                    }
                }
                class623.field9017.method2();
                long var12 = (long) (var8 * 1000) / (-var5 + class525.method3074((byte) -101));
                class623.field9017.method42(0);
                class623.field9017.method28();
                return (int) var12;
            } catch (Throwable var15) {
                var15.printStackTrace();
                return -1;
            }
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(III)V")
    public final void method600(int arg0, int arg1, int arg2) {
        ++field7761;
        int var4 = -55 % ((arg1 - -45) / 59);
    }

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(ZB)V")
    public final void method599(boolean arg0, byte arg1) {
        if (arg1 != -116) {
            this.method599(true, (byte) -110);
        }
        ++field7764;
        super.field4393.method3188(false, true);
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lcf;)V")
    public class546(class562 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(I)V")
    public final void method601(int arg0) {
        if (arg0 > 27) {
            ++field7765;
            super.field4393.method3188(false, false);
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(BILhw;)V")
    public final void method603(byte arg0, int arg1, class116 arg2) {
        if (arg0 < 28) {
            this.method603((byte) -31, -122, (class116) null);
        }
        super.field4393.method3266(-2, arg2);
        ++field7767;
        super.field4393.method3195(-12, arg1);
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZB)V")
    public final void method602(boolean arg0, byte arg1) {
        if (arg1 != 54) {
            this.method602(true, (byte) -71);
        }
        ++field7766;
    }
}

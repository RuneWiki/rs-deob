import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aha")
public abstract class class380 extends class361 {

    @OriginalMember(owner = "client!aha", name = "A", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!aha", name = "B", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!aha", name = "C", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!aha", name = "D", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!aha", name = "E", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!aha", name = "F", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!aha", name = "G", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!aha", name = "H", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!aha", name = "J", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lha;ZJ)V")
    public static final void method2335(class58 arg0, boolean arg1, long arg2) {
        ++field5207;
        class324.field4144 = class313.field3890;
        class179.field2106 = 0;
        class90.field940 = 0;
        if (!arg1) {
            method2335((class58) null, false, 91L);
        }
        class313.field3890 = 0;
        long var4 = class652.method3700(-1);
        for (class257 var6 = (class257) class125.field1310.method2790(106); var6 != null; var6 = (class257) class125.field1310.method2794(52)) {
            if (var6.method1537(arg0, arg2)) {
                ++class179.field2106;
            }
        }
        if (class606.field8614 && ~(arg2 % 100L) == -1L) {
            System.out.println("Particle system count: " + class125.field1310.method2791(0) + ", running: " + class179.field2106);
            System.out.println("Emitters: " + class90.field940 + " Particles: " + class313.field3890 + ". Time taken: " + (-var4 + class652.method3700(-1)) + "ms");
        }
    }

    @OriginalMember(owner = "client!aha", name = "d", descriptor = "(I)Z")
    public final boolean method1152(int arg0) {
        ++field5200;
        class398 var2 = class624.method3576(super.field4628, super.field4635 >> class748.field10430, super.field4629 >> class748.field10430);
        if (arg0 != -4) {
            this.method987(false, (class58) null, (class361) null, 38, -76, -51, -116);
        }
        return var2 != null && var2.field5449.field4385 ? class234.method1387(super.field4628, (byte) -56, super.field4635 >> class748.field10430, super.field4629 >> class748.field10430, var2.field5449.method985(4) + this.method985(4)) : class240.method1414(30633, super.field4635 >> class748.field10430, super.field4629 >> class748.field10430, super.field4628);
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(ZLha;Lrr;IIII)V")
    public final void method987(boolean arg0, class58 arg1, class361 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 == 0) {
            ++field5203;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!aha", name = "h", descriptor = "(I)Z")
    public final boolean method991(int arg0) {
        int var2 = 67 / ((65 - arg0) / 48);
        ++field5201;
        return false;
    }

    @OriginalMember(owner = "client!aha", name = "<init>", descriptor = "(IIIII)V")
    public class380(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super.field4635 = arg0;
        super.field4627 = arg1;
        super.field4629 = arg2;
        super.field4633 = (byte) arg4;
        super.field4628 = (byte) arg3;
    }

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "(I)V")
    public final void method982(int arg0) {
        ++field5206;
        if (arg0 == 2) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(III)Z")
    public static final boolean method2336(int arg0, int arg1, int arg2) {
        ++field5205;
        return arg2 != 0 ? true : (class147.method915(arg0, arg1, (byte) 101) | ~(8192 & arg1) != -1 | class102.method709(arg1, arg0, -111)) & class619.method3531(true, arg1, arg0);
    }

    @OriginalMember(owner = "client!aha", name = "i", descriptor = "(I)Z")
    public static final boolean method2337(int arg0) {
        ++field5204;
        class36 var1 = (class36) class559.field7984.method1719(65280);
        if (var1 == null) {
            return false;
        } else {
            if (arg0 > -103) {
                method2335((class58) null, true, 119L);
            }
            for (int var2 = 0; ~var1.field386 < ~var2; ++var2) {
                if (var1.field384[var2] != null && ~var1.field384[var2].field3573 == -1) {
                    return false;
                }
                if (var1.field395[var2] != null && ~var1.field395[var2].field3573 == -1) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(B[Lada;)I")
    public final int method1150(byte arg0, class163[] arg1) {
        if (arg0 >= -44) {
            return 45;
        } else {
            ++field5202;
            return this.method2121(super.field4629 >> class748.field10430, arg1, -13, super.field4635 >> class748.field10430);
        }
    }

    @OriginalMember(owner = "client!aha", name = "e", descriptor = "(I)Z")
    public final boolean method1154(int arg0) {
        ++field5199;
        return arg0 != -1 ? true : class233.field2770[(super.field4635 >> class748.field10430) + -class440.field6387 + class626.field8992][(super.field4629 >> class748.field10430) + -class444.field6433 + class626.field8992];
    }
}

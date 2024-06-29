import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public abstract class class306 extends class204 {

    @OriginalMember(owner = "client!vea", name = "A", descriptor = "S")
    public short field4270;

    @OriginalMember(owner = "client!vea", name = "z", descriptor = "S")
    public short field4269;

    @OriginalMember(owner = "client!vea", name = "t", descriptor = "D")
    public static double field4263 = -1.0D;

    @OriginalMember(owner = "client!vea", name = "s", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!vea", name = "u", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!vea", name = "v", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!vea", name = "x", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!vea", name = "y", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!vea", name = "B", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!vea", name = "w", descriptor = "[Lmq;")
    public static class71[] field4266;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(I[Lam;)I")
    public final int method591(int arg0, class289[] arg1) {
        ++field4265;
        if (arg0 != -1) {
            field4266 = null;
        }
        return this.method1413(super.field3154 >> class49.field637, -6813, super.field3155 >> class49.field637, arg1);
    }

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "(B)Z")
    public final boolean method587(byte arg0) {
        if (arg0 >= -22) {
            return false;
        } else {
            ++field4268;
            return class678.field9661[(super.field3155 >> class49.field637) - (-class668.field9389 + class371.field5135)][(super.field3154 >> class49.field637) + class668.field9389 + -class22.field303];
        }
    }

    @OriginalMember(owner = "client!vea", name = "g", descriptor = "(I)Z")
    public final boolean method592(int arg0) {
        if (arg0 != -15258) {
            return true;
        } else {
            ++field4271;
            return false;
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lvj;IZLr;IIB)V")
    public final void method590(class204 arg0, int arg1, boolean arg2, class98 arg3, int arg4, int arg5, byte arg6) {
        if (arg6 < 22) {
            field4263 = 0.9324787698915663D;
        }
        ++field4267;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vea", name = "f", descriptor = "(I)Z")
    public final boolean method588(int arg0) {
        ++field4262;
        if (arg0 != 0) {
            this.method585(109);
        }
        return class365.method2190(-106, super.field3155 >> class49.field637, super.field3163, super.field3154 >> class49.field637, this.method626(arg0 ^ -32768));
    }

    @OriginalMember(owner = "client!vea", name = "j", descriptor = "(I)V")
    public final void method585(int arg0) {
        if (arg0 == 96) {
            ++field4264;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(IIIIIII)V")
    public class306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super.field3163 = (byte) arg4;
        super.field3158 = (byte) arg3;
        super.field3154 = arg2;
        this.field4270 = (short) arg5;
        super.field3155 = arg0;
        this.field4269 = (short) arg6;
        super.field3160 = arg1;
    }

    @OriginalMember(owner = "client!vea", name = "k", descriptor = "(I)V")
    public static void method1862(int arg0) {
        if (arg0 == -10183) {
            field4266 = null;
        }
    }
}

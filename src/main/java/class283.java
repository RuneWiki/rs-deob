import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class283 {

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "F")
    public float field4238 = 0.25F;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "F")
    public float field4241 = 1.0F;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "F")
    public float field4232 = 1.0F;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "F")
    public float field4242;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "F")
    public float field4239;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public int field4237;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "Lqi;")
    public class207 field4240;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public int field4234;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public int field4246;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public int field4244;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public int field4243;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public int field4245;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "F")
    public float field4236;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "Ldj;")
    public static class304 field4235;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILbc;)Z", line = 3)
    public final boolean method2005(int arg0, class283 arg1) {
        if (arg0 != 32) {
            this.method2005(55, (class283) null);
        }
        field4248++;
        return this.field4246 == arg1.field4246 && this.field4236 == arg1.field4236 && this.field4239 == arg1.field4239 && this.field4242 == arg1.field4242 && this.field4238 == arg1.field4238 && this.field4232 == arg1.field4232 && this.field4241 == arg1.field4241 && this.field4234 == arg1.field4234 && this.field4244 == arg1.field4244 && this.field4240 == arg1.field4240;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 19)
    public static final void method2006(String arg0, int arg1) {
        field4233++;
        if (!arg0.equals("")) {
            class129.field2103++;
            class13.field216.method2781(false, arg1);
            class13.field216.method267(class429.method2677(arg0, arg1 ^ 0xAF), false);
            class13.field216.method265((byte) -79, arg0);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lec;I)V", line = 43)
    public final void method2007(class37 arg0, int arg1) {
        this.field4232 = (float) (arg0.method271((byte) 110) * 8) / 255.0F;
        field4247++;
        if (arg1 != 2955) {
            method2008(true);
        }
        this.field4238 = (float) (arg0.method271((byte) 110) * 8) / 255.0F;
        this.field4241 = (float) (arg0.method271((byte) 113) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V", line = 60)
    public static void method2008(boolean arg0) {
        if (arg0) {
            field4235 = null;
        }
        field4235 = null;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V", line = 84)
    public class283() {
        this.field4242 = 1.2F;
        this.field4239 = 0.69921875F;
        this.field4237 = -50;
        this.field4240 = class281.field4217;
        this.field4234 = class435.field6341;
        this.field4246 = class284.field4256;
        this.field4244 = 0;
        this.field4243 = -60;
        this.field4245 = -50;
        this.field4236 = 1.1523438F;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lec;)V", line = 100)
    public class283(class37 arg0) {
        int var2 = arg0.method271((byte) 103);
        if (class169.field2515 && class122.field1928.method757() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field4246 = class284.field4256;
            } else {
                this.field4246 = arg0.method278(-125);
            }
            if ((var2 & 0x2) == 0) {
                this.field4236 = 1.1523438F;
            } else {
                this.field4236 = (float) arg0.method320((byte) -87) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field4239 = 0.69921875F;
            } else {
                this.field4239 = (float) arg0.method320((byte) -87) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field4242 = 1.2F;
            } else {
                this.field4242 = (float) arg0.method320((byte) -87) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method278(-113);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method320((byte) -87);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method320((byte) -87);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method320((byte) -87);
            }
            this.field4242 = 1.2F;
            this.field4236 = 1.1523438F;
            this.field4239 = 0.69921875F;
            this.field4246 = class284.field4256;
        }
        if ((var2 & 0x10) == 0) {
            this.field4237 = -50;
            this.field4245 = -50;
            this.field4243 = -60;
        } else {
            this.field4237 = arg0.method321((byte) 121);
            this.field4243 = arg0.method321((byte) 93);
            this.field4245 = arg0.method321((byte) 92);
        }
        if ((var2 & 0x20) == 0) {
            this.field4234 = class435.field6341;
        } else {
            this.field4234 = arg0.method278(-125);
        }
        if ((var2 & 0x40) == 0) {
            this.field4244 = 0;
        } else {
            this.field4244 = arg0.method320((byte) -87);
        }
        if ((var2 & 0x80) == 0) {
            this.field4240 = class281.field4217;
        } else {
            this.field4240 = class92.method781((byte) -113, arg0.method320((byte) -87), arg0.method320((byte) -87), arg0.method320((byte) -87), arg0.method320((byte) -87), arg0.method320((byte) -87), arg0.method320((byte) -87));
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class284 {

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "F")
    public float field4609;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "F")
    public float field4608;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    public int field4618;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
    public int field4621;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public int field4605;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
    public int field4619;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "F")
    public float field4604;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public int field4606;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public int field4612;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "Lok;")
    private static class41 field4607 = class137.method956("purple:", 45);

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "[S")
    public static short[] field4614 = new short[256];

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "Lok;")
    public static class41 field4616 = class137.method956("_", 45);

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "Lok;")
    public static class41 field4615 = field4607;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public static int field4610 = 0;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
    public static int field4613 = 0;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "Lok;")
    public static class41 field4611 = field4607;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "Lbc;")
    public static class302 field4622;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V", line = 16)
    public static void method1995(int arg0) {
        field4607 = null;
        field4622 = null;
        field4611 = null;
        field4616 = null;
        field4615 = null;
        if (arg0 >= 40) {
            field4614 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILmh;ZLmh;)V", line = 44)
    public static final void method1996(int arg0, class65 arg1, boolean arg2, class65 arg3) {
        class269.field4343 = arg3;
        class33.field506 = arg2;
        class138.field2069 = arg1;
        field4603++;
        if (arg0 != 10573) {
            method1996(70, (class65) null, false, (class65) null);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lpk;I)V", line = 59)
    public static final void method1997(class44 arg0, int arg1) {
        field4620++;
        if (arg1 == -1) {
            class186.field3041 = arg0;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lmh;IIZ)Laf;", line = 84)
    public static final class72 method1998(class65 arg0, int arg1, int arg2, boolean arg3) {
        field4617++;
        if (arg3) {
            return (class72) null;
        } else if (class10.method40(arg1, true, arg2, arg0)) {
            return class265.method1875(36);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V", line = 108)
    public class284() {
        this.field4609 = 1.1523438F;
        this.field4608 = 1.2F;
        this.field4618 = 0;
        this.field4621 = -60;
        this.field4605 = class58.field835;
        this.field4619 = class58.field831;
        this.field4604 = 0.69921875F;
        this.field4606 = -50;
        this.field4612 = -50;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Llb;)V", line = 129)
    public class284(class112 arg0) {
        int var2 = arg0.method792(2);
        if ((var2 & 0x1) == 0) {
            this.field4619 = class58.field831;
        } else {
            this.field4619 = arg0.method779(-27100);
        }
        if ((var2 & 0x2) == 0) {
            this.field4609 = 1.1523438F;
        } else {
            this.field4609 = (float) arg0.method759((byte) -82) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field4604 = 0.69921875F;
        } else {
            this.field4604 = (float) arg0.method759((byte) -44) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field4608 = 1.2F;
        } else {
            this.field4608 = (float) arg0.method759((byte) -64) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field4612 = -50;
            this.field4606 = -50;
            this.field4621 = -60;
        } else {
            this.field4606 = arg0.method771(-69);
            this.field4621 = arg0.method771(-87);
            this.field4612 = arg0.method771(-75);
        }
        if ((var2 & 0x20) == 0) {
            this.field4605 = class58.field835;
        } else {
            this.field4605 = arg0.method779(-27100);
        }
        if ((var2 & 0x40) == 0) {
            this.field4618 = 0;
        } else {
            this.field4618 = arg0.method759((byte) -92);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class342 {

    @OriginalMember(owner = "client!po", name = "i", descriptor = "F")
    public float field4660 = 0.25F;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "F")
    public float field4654 = 1.0F;

    @OriginalMember(owner = "client!po", name = "p", descriptor = "F")
    public float field4667 = 1.0F;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    public int field4653;

    @OriginalMember(owner = "client!po", name = "j", descriptor = "I")
    public int field4661;

    @OriginalMember(owner = "client!po", name = "h", descriptor = "I")
    public int field4659;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "I")
    public int field4656;

    @OriginalMember(owner = "client!po", name = "m", descriptor = "Lts;")
    public class33 field4664;

    @OriginalMember(owner = "client!po", name = "l", descriptor = "F")
    public float field4663;

    @OriginalMember(owner = "client!po", name = "o", descriptor = "I")
    public int field4666;

    @OriginalMember(owner = "client!po", name = "k", descriptor = "F")
    public float field4662;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "I")
    public int field4652;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "F")
    public float field4658;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    public static int field4655 = 0;

    @OriginalMember(owner = "client!po", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4668;

    @OriginalMember(owner = "client!po", name = "r", descriptor = "Laq;")
    public static class453 field4669;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!po", name = "n", descriptor = "I")
    public static int field4665;

    static {
        new class108(64);
        field4668 = "";
        field4669 = null;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V", line = 13)
    public static void method2185(int arg0) {
        field4669 = null;
        if (arg0 != -24855) {
            field4669 = null;
        }
        field4668 = null;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ILbg;)V", line = 30)
    public final void method2186(int arg0, class242 arg1) {
        this.field4654 = (float) (arg0 * arg1.method1563(-128)) / 255.0F;
        field4665++;
        this.field4660 = (float) (arg1.method1563(-128) * 8) / 255.0F;
        this.field4667 = (float) (arg1.method1563(-128) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(BLpo;)Z", line = 41)
    public final boolean method2187(byte arg0, class342 arg1) {
        field4657++;
        if (arg0 > -52) {
            method2188(-92, -92, -118);
        }
        return this.field4659 == arg1.field4659 && this.field4662 == arg1.field4662 && this.field4658 == arg1.field4658 && this.field4663 == arg1.field4663 && this.field4660 == arg1.field4660 && this.field4654 == arg1.field4654 && this.field4667 == arg1.field4667 && this.field4661 == arg1.field4661 && this.field4652 == arg1.field4652 && this.field4664 == arg1.field4664;
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "()V", line = 74)
    public class342() {
        this.field4653 = -50;
        this.field4661 = class319.field4293;
        this.field4659 = class314.field4231;
        this.field4656 = -50;
        this.field4664 = class190.field2227;
        this.field4663 = 1.2F;
        this.field4666 = -60;
        this.field4662 = 1.1523438F;
        this.field4652 = 0;
        this.field4658 = 0.69921875F;
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lbg;)V", line = 111)
    public class342(class242 arg0) {
        int var2 = arg0.method1563(-128);
        if (class252.field3298 && class276.field3581.method788() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field4659 = class314.field4231;
            } else {
                this.field4659 = arg0.method1576((byte) 122);
            }
            if ((var2 & 0x2) == 0) {
                this.field4662 = 1.1523438F;
            } else {
                this.field4662 = (float) arg0.method1587((byte) -102) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field4658 = 0.69921875F;
            } else {
                this.field4658 = (float) arg0.method1587((byte) -102) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field4663 = 1.2F;
            } else {
                this.field4663 = (float) arg0.method1587((byte) -102) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method1576((byte) 125);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method1587((byte) -102);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method1587((byte) -102);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method1587((byte) -102);
            }
            this.field4663 = 1.2F;
            this.field4658 = 0.69921875F;
            this.field4659 = class314.field4231;
            this.field4662 = 1.1523438F;
        }
        if ((var2 & 0x10) == 0) {
            this.field4656 = -50;
            this.field4653 = -50;
            this.field4666 = -60;
        } else {
            this.field4656 = arg0.method1582(false);
            this.field4666 = arg0.method1582(false);
            this.field4653 = arg0.method1582(false);
        }
        if ((var2 & 0x20) == 0) {
            this.field4661 = class319.field4293;
        } else {
            this.field4661 = arg0.method1576((byte) 127);
        }
        if ((var2 & 0x40) == 0) {
            this.field4652 = 0;
        } else {
            this.field4652 = arg0.method1587((byte) -102);
        }
        if ((var2 & 0x80) == 0) {
            this.field4664 = class190.field2227;
        } else {
            this.field4664 = class162.method1032((byte) -24, arg0.method1587((byte) -102), arg0.method1587((byte) -102), arg0.method1587((byte) -102), arg0.method1587((byte) -102), arg0.method1587((byte) -102), arg0.method1587((byte) -102));
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(III)V", line = 95)
    public static final void method2188(int arg0, int arg1, int arg2) {
        class316 var3 = class347.field4722[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field4259 != null) {
            var3.field4259 = null;
        }
        if (var3.field4266 != null) {
            var3.field4266 = null;
        }
    }
}

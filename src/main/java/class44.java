import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class44 {

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "F")
    public float field670 = 1.0F;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "F")
    public float field663 = 1.0F;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "F")
    public float field672 = 0.25F;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
    public int field679;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public int field666;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    public int field674;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "F")
    public float field668;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public int field669;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "F")
    public float field661;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
    public int field677;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public int field664;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "F")
    public float field662;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "Lvm;")
    public class407 field665;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
    public static int field675 = 0;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "Ljava/lang/String;")
    public static String field678 = "Loaded update list";

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public static int field673 = 0;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BLqj;)I")
    public static final int method314(byte arg0, class296 arg1) {
        field671++;
        if (arg0 != -56) {
            return -74;
        }
        int var2 = 0;
        if (arg1.method1898(class94.field1407, 125)) {
            var2++;
        }
        if (arg1.method1898(class326.field4450, 123)) {
            var2++;
        }
        if (arg1.method1898(class60.field838, arg0 ^ 0xFFFFFFB7)) {
            var2++;
        }
        if (arg1.method1898(class169.field2406, 125)) {
            var2++;
        }
        if (arg1.method1898(client.field2331, 124)) {
            var2++;
        }
        if (arg1.method1898(class237.field3226, 127)) {
            var2++;
        }
        if (arg1.method1898(class48.field734, 123)) {
            var2++;
        }
        if (arg1.method1898(class9.field140, 126)) {
            var2++;
        }
        if (arg1.method1898(class24.field321, 126)) {
            var2++;
        }
        if (arg1.method1898(class232.field3122, 125)) {
            var2++;
        }
        if (arg1.method1898(class305.field4196, 125)) {
            var2++;
        }
        if (arg1.method1898(class427.field6122, arg0 ^ 0xFFFFFFB3)) {
            var2++;
        }
        if (arg1.method1898(class424.field6094, 126)) {
            var2++;
        }
        if (arg1.method1898(class431.field6204, 126)) {
            var2++;
        }
        if (arg1.method1898(class166.field2373, 125)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static void method315(int arg0) {
        if (arg0 != -1453) {
            field678 = null;
        }
        field678 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Leb;I)V")
    public final void method316(class371 arg0, int arg1) {
        field676++;
        this.field670 = (float) (arg0.method2429(0) * 8) / 255.0F;
        this.field672 = (float) (arg0.method2429(0) * 8) / 255.0F;
        this.field663 = (float) (arg1 * arg0.method2429(0)) / 255.0F;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lsh;I)Z")
    public final boolean method317(class44 arg0, int arg1) {
        field667++;
        if (arg1 == -526) {
            return this.field674 == arg0.field674 && this.field661 == arg0.field661 && this.field668 == arg0.field668 && this.field662 == arg0.field662 && this.field672 == arg0.field672 && this.field670 == arg0.field670 && this.field663 == arg0.field663 && this.field666 == arg0.field666 && this.field669 == arg0.field669 && this.field665 == arg0.field665;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
    public class44() {
        this.field679 = -50;
        this.field666 = class138.field1971;
        this.field674 = class262.field3584;
        this.field668 = 0.69921875F;
        this.field669 = 0;
        this.field661 = 1.1523438F;
        this.field677 = -50;
        this.field664 = -60;
        this.field662 = 1.2F;
        this.field665 = class236.field3215;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Leb;)V")
    public class44(class371 arg0) {
        int var2 = arg0.method2429(0);
        if (class412.field5977 && class308.field4230.method1797() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field674 = class262.field3584;
            } else {
                this.field674 = arg0.method2413((byte) -30);
            }
            if ((var2 & 0x2) == 0) {
                this.field661 = 1.1523438F;
            } else {
                this.field661 = (float) arg0.method2403((byte) 124) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field668 = 0.69921875F;
            } else {
                this.field668 = (float) arg0.method2403((byte) 95) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field662 = 1.2F;
            } else {
                this.field662 = (float) arg0.method2403((byte) 123) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method2413((byte) -30);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method2403((byte) 99);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method2403((byte) 52);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method2403((byte) 111);
            }
            this.field674 = class262.field3584;
            this.field662 = 1.2F;
            this.field661 = 1.1523438F;
            this.field668 = 0.69921875F;
        }
        if ((var2 & 0x10) == 0) {
            this.field679 = -50;
            this.field677 = -50;
            this.field664 = -60;
        } else {
            this.field679 = arg0.method2378(-1);
            this.field664 = arg0.method2378(-1);
            this.field677 = arg0.method2378(-1);
        }
        if ((var2 & 0x20) == 0) {
            this.field666 = class138.field1971;
        } else {
            this.field666 = arg0.method2413((byte) -30);
        }
        if ((var2 & 0x40) == 0) {
            this.field669 = 0;
        } else {
            this.field669 = arg0.method2403((byte) 90);
        }
        if ((var2 & 0x80) == 0) {
            this.field665 = class236.field3215;
        } else {
            this.field665 = class451.method2820((byte) 111, arg0.method2403((byte) 105), arg0.method2403((byte) 50), arg0.method2403((byte) 79), arg0.method2403((byte) 53), arg0.method2403((byte) 89), arg0.method2403((byte) 69));
        }
    }
}

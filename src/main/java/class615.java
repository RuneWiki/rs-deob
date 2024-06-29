import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class615 extends class155 {

    @OriginalMember(owner = "client!eba", name = "n", descriptor = "Z")
    private boolean field8565 = false;

    @OriginalMember(owner = "client!eba", name = "p", descriptor = "[Ljava/awt/Color;")
    public static Color[] field8567 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

    @OriginalMember(owner = "client!eba", name = "u", descriptor = "I")
    public static int field8572 = 0;

    @OriginalMember(owner = "client!eba", name = "m", descriptor = "I")
    public static int field8564;

    @OriginalMember(owner = "client!eba", name = "o", descriptor = "I")
    public static int field8566;

    @OriginalMember(owner = "client!eba", name = "q", descriptor = "I")
    public static int field8568;

    @OriginalMember(owner = "client!eba", name = "r", descriptor = "I")
    public static int field8569;

    @OriginalMember(owner = "client!eba", name = "s", descriptor = "I")
    public static int field8570;

    @OriginalMember(owner = "client!eba", name = "t", descriptor = "I")
    public static int field8571;

    @OriginalMember(owner = "client!eba", name = "v", descriptor = "I")
    public static int field8573;

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(I)Z", line = 4)
    public final boolean method250(int arg0) {
        int var2 = 49 % ((-8 - arg0) / 41);
        ++field8569;
        return true;
    }

    @OriginalMember(owner = "client!eba", name = "g", descriptor = "(I)V", line = 15)
    public static void method3481(int arg0) {
        field8567 = null;
        if (arg0 != 16741381) {
            method3481(-51);
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lbr;II)V", line = 25)
    public final void method259(class416 arg0, int arg1, int arg2) {
        super.field2533.method3090(arg0, (byte) -106);
        ++field8566;
        super.field2533.method3113(-3334, arg2);
        if (arg1 >= -71) {
            this.method258(-118, true);
        }
    }

    @OriginalMember(owner = "client!eba", name = "e", descriptor = "(I)V", line = 38)
    public final void method255(int arg0) {
        ++field8568;
        if (arg0 >= -119) {
            this.method250(-75);
        }
        if (!this.field8565) {
            super.field2533.method3168((byte) 71, 0, class327.field4459);
        } else {
            super.field2533.method3114(1, false);
            super.field2533.method853(class110.field1712, (byte) -22);
            super.field2533.method3118(class671.field9318, class671.field9318, 0);
            super.field2533.method3143(class633.field8767, true, 2);
            super.field2533.method3168((byte) 90, 0, class327.field4459);
            super.field2533.method3108(3);
            super.field2533.method3090((class416) null, (byte) 60);
            super.field2533.method3114(0, false);
            this.field8565 = false;
        }
        super.field2533.method3118(class671.field9318, class671.field9318, 0);
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IZ)V", line = 68)
    public final void method258(int arg0, boolean arg1) {
        ++field8564;
        class158 var3 = super.field2533.method3097(0);
        if (var3 != null && arg1) {
            super.field2533.method3114(1, false);
            super.field2533.method3090(var3, (byte) -73);
            super.field2533.method853(class519.field7045, (byte) -22);
            super.field2533.method3114(1, false);
            super.field2533.method3118(class371.field5051, class34.field565, 0);
            super.field2533.method841(class606.field8459, true, 2, false, 18680);
            super.field2533.method3168((byte) 84, 0, class620.field8626);
            class421 var4 = super.field2533.method3125(arg0 ^ 205);
            var4.method2485(0, super.field2533.method3158(arg0 + -205));
            super.field2533.method3099(-127, class758.field10447);
            super.field2533.method3114(0, false);
            this.field8565 = true;
        } else {
            super.field2533.method3168((byte) 72, 0, class620.field8626);
        }
        if (arg0 != 205) {
            field8567 = null;
        }
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lsf;)V", line = 99)
    public class615(class551 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IIB)V", line = 104)
    public final void method254(int arg0, int arg1, byte arg2) {
        if (arg2 == -92) {
            ++field8570;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZZ)V", line = 114)
    public final void method257(boolean arg0, boolean arg1) {
        ++field8573;
        super.field2533.method3118(class371.field5051, class671.field9318, 0);
        if (arg0) {
            field8567 = null;
        }
    }
}

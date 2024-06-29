import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class183 {

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public int field2735;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public int field2730;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public int field2742;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public int field2736;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "F")
    public float field2732;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public int field2733;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "F")
    public float field2731;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "F")
    public float field2740;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public int field2737;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Lhb;")
    public static class318 field2734 = new class318(64);

    @OriginalMember(owner = "client!af", name = "i", descriptor = "[I")
    public static int[] field2738 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field2739 = 0;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public static int field2744 = 0;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "[S")
    public static short[] field2745 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V", line = 6)
    public static void method1267(int arg0) {
        int var1 = -121 / ((arg0 + 78) / 39);
        field2745 = null;
        field2734 = null;
        field2738 = null;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V", line = 37)
    public class183() {
        this.field2735 = 0;
        this.field2730 = class280.field4260;
        this.field2742 = -50;
        this.field2736 = -60;
        this.field2732 = 0.69921875F;
        this.field2733 = class280.field4255;
        this.field2731 = 1.2F;
        this.field2740 = 1.1523438F;
        this.field2737 = -50;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lre;)V", line = 52)
    public class183(class263 arg0) {
        int var2 = arg0.method1787(false);
        if ((var2 & 0x1) == 0) {
            this.field2730 = class280.field4260;
        } else {
            this.field2730 = arg0.method1826(-206227536);
        }
        if ((var2 & 0x2) == 0) {
            this.field2740 = 1.1523438F;
        } else {
            this.field2740 = (float) arg0.method1830((byte) -77) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field2732 = 0.69921875F;
        } else {
            this.field2732 = (float) arg0.method1830((byte) -77) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field2731 = 1.2F;
        } else {
            this.field2731 = (float) arg0.method1830((byte) -77) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field2736 = -60;
            this.field2742 = -50;
            this.field2737 = -50;
        } else {
            this.field2737 = arg0.method1845((byte) -124);
            this.field2736 = arg0.method1845((byte) -120);
            this.field2742 = arg0.method1845((byte) -124);
        }
        if ((var2 & 0x20) == 0) {
            this.field2733 = class280.field4255;
        } else {
            this.field2733 = arg0.method1826(-206227536);
        }
        if ((var2 & 0x40) == 0) {
            this.field2735 = 0;
        } else {
            this.field2735 = arg0.method1830((byte) -77);
        }
    }
}

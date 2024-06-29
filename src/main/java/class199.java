import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class199 {

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "F")
    public float field2805 = 1.0F;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "F")
    public float field2812 = 0.25F;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "F")
    public float field2815 = 1.0F;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public int field2809;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public int field2802;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public int field2816;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public int field2811;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public int field2813;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "F")
    public float field2819;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public int field2808;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "F")
    public float field2800;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "Lsd;")
    public class71 field2798;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "F")
    public float field2807;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "Lbn;")
    public static class160 field2814 = new class160(70, 7);

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "Lct;")
    public static class104 field2810;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "Lct;")
    public static class104 field2820;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "Llf;")
    public static class350 field2818;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)Z")
    public static final boolean method1378(int arg0) {
        field2806++;
        if (arg0 != -50) {
            method1380((byte) -14);
        }
        return class342.field5039;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lfc;I)Z")
    public final boolean method1379(class199 arg0, int arg1) {
        field2799++;
        if (arg1 == 16) {
            return this.field2809 == arg0.field2809 && this.field2819 == arg0.field2819 && this.field2807 == arg0.field2807 && this.field2800 == arg0.field2800 && this.field2812 == arg0.field2812 && this.field2805 == arg0.field2805 && this.field2815 == arg0.field2815 && this.field2808 == arg0.field2808 && this.field2811 == arg0.field2811 && this.field2798 == arg0.field2798;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
    public static void method1380(byte arg0) {
        if (arg0 == 127) {
            field2810 = null;
            field2814 = null;
            field2820 = null;
            field2818 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLat;)V")
    public final void method1381(byte arg0, class256 arg1) {
        field2803++;
        this.field2805 = (float) (arg1.method1738((byte) 104) * 8) / 255.0F;
        this.field2812 = (float) (arg1.method1738((byte) 87) * 8) / 255.0F;
        this.field2815 = (float) (arg1.method1738((byte) 102) * 8) / 255.0F;
        if (arg0 >= -53) {
            method1378(48);
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
    public class199() {
        this.field2809 = class159.field2135;
        this.field2802 = -50;
        this.field2816 = -60;
        this.field2811 = 0;
        this.field2813 = -50;
        this.field2819 = 1.1523438F;
        this.field2808 = class57.field695;
        this.field2800 = 1.2F;
        this.field2798 = class332.field4933;
        this.field2807 = 0.69921875F;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lat;)V")
    public class199(class256 arg0) {
        int var2 = arg0.method1738((byte) 98);
        if (class307.field4535 && class388.field5677.method103() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field2809 = class159.field2135;
            } else {
                this.field2809 = arg0.method1746(20972);
            }
            if ((var2 & 0x2) == 0) {
                this.field2819 = 1.1523438F;
            } else {
                this.field2819 = (float) arg0.method1767(1930493576) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field2807 = 0.69921875F;
            } else {
                this.field2807 = (float) arg0.method1767(1930493576) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field2800 = 1.2F;
            } else {
                this.field2800 = (float) arg0.method1767(1930493576) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method1746(20972);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method1767(1930493576);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method1767(1930493576);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method1767(1930493576);
            }
            this.field2800 = 1.2F;
            this.field2807 = 0.69921875F;
            this.field2809 = class159.field2135;
            this.field2819 = 1.1523438F;
        }
        if ((var2 & 0x10) == 0) {
            this.field2816 = -60;
            this.field2802 = -50;
            this.field2813 = -50;
        } else {
            this.field2813 = arg0.method1747((byte) 12);
            this.field2816 = arg0.method1747((byte) 12);
            this.field2802 = arg0.method1747((byte) 12);
        }
        if ((var2 & 0x20) == 0) {
            this.field2808 = class57.field695;
        } else {
            this.field2808 = arg0.method1746(20972);
        }
        if ((var2 & 0x40) == 0) {
            this.field2811 = 0;
        } else {
            this.field2811 = arg0.method1767(1930493576);
        }
        if ((var2 & 0x80) == 0) {
            this.field2798 = class332.field4933;
        } else {
            this.field2798 = class58.method443(arg0.method1767(1930493576), arg0.method1767(1930493576), arg0.method1767(1930493576), arg0.method1767(1930493576), arg0.method1767(1930493576), arg0.method1767(1930493576), 0);
        }
    }
}

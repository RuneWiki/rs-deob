import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class176 {

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    public int field2813;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "F")
    public float field2800;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "F")
    public float field2799;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public int field2805;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "F")
    public float field2802;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public int field2803;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public int field2806;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public int field2804;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public int field2807;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "Lvk;")
    public static class67 field2809 = new class67(64);

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "Lck;")
    public static class119 field2814 = class298.method1987((byte) 89, "um");

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "Lck;")
    public static class119 field2810 = class298.method1987((byte) 46, " x ");

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "Ljd;")
    public static class93 field2811;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V", line = 9)
    public static void method1124(boolean arg0) {
        field2811 = null;
        field2814 = null;
        field2810 = null;
        field2809 = null;
        if (!arg0) {
            method1126(-113, (byte) -84);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)I", line = 36)
    public static final int method1125(int arg0, int arg1) {
        if (arg1 != 191) {
            method1124(true);
        }
        field2801++;
        if (class65.field1022 == 1) {
            return 7;
        } else if (arg0 == 77) {
            return 1;
        } else if (arg0 == 38) {
            return 2;
        } else if (arg0 == 16) {
            return 3;
        } else if (arg0 == 161) {
            return 4;
        } else if (arg0 == 191) {
            return 5;
        } else if (arg0 == 69) {
            return 6;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IB)V", line = 107)
    public static final void method1126(int arg0, byte arg1) {
        if (arg1 >= -8) {
            field2814 = (class119) null;
        }
        class86.field1304[1] = (float) (class19.method151(65484, arg0) >> 8) / 255.0F;
        field2808++;
        class86.field1304[2] = (float) class19.method151(255, arg0) / 255.0F;
        class86.field1304[0] = (float) (class19.method151(16756928, arg0) >> 16) / 255.0F;
        class265.method1741((byte) 127, 3);
        class265.method1741((byte) 126, 4);
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V", line = 132)
    public class176() {
        this.field2813 = -50;
        this.field2800 = 0.69921875F;
        this.field2799 = 1.2F;
        this.field2805 = class178.field2838;
        this.field2802 = 1.1523438F;
        this.field2803 = -50;
        this.field2806 = -60;
        this.field2804 = 0;
        this.field2807 = class178.field2843;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lfj;)V", line = 151)
    public class176(class3 arg0) {
        int var2 = arg0.method64((byte) 80);
        if ((var2 & 0x1) == 0) {
            this.field2805 = class178.field2838;
        } else {
            this.field2805 = arg0.method71(-668527048);
        }
        if ((var2 & 0x2) == 0) {
            this.field2802 = 1.1523438F;
        } else {
            this.field2802 = (float) arg0.method63((byte) 1) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field2800 = 0.69921875F;
        } else {
            this.field2800 = (float) arg0.method63((byte) 1) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field2799 = 1.2F;
        } else {
            this.field2799 = (float) arg0.method63((byte) 1) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field2803 = -50;
            this.field2806 = -60;
            this.field2813 = -50;
        } else {
            this.field2813 = arg0.method59((byte) -68);
            this.field2806 = arg0.method59((byte) -68);
            this.field2803 = arg0.method59((byte) -68);
        }
        if ((var2 & 0x20) == 0) {
            this.field2807 = class178.field2843;
        } else {
            this.field2807 = arg0.method71(-668527048);
        }
        if ((var2 & 0x40) == 0) {
            this.field2804 = 0;
        } else {
            this.field2804 = arg0.method63((byte) 1);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class144 {

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "F")
    public float field2602;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public int field2615;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public int field2620;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "F")
    public float field2607;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "F")
    public float field2616;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public int field2614;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
    public int field2618;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public int field2609;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public int field2617;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field2606 = 0;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field2603 = 50;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "[B")
    public static byte[] field2605 = new byte[520];

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "Z")
    public static boolean field2608 = false;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public static int field2612 = -1;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "[I")
    public static int[] field2619 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "Lud;")
    private static class279 field2613 = class130.method1024("Close", 255);

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "Lud;")
    public static class279 field2610 = field2613;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "Lud;")
    public static class279 field2621 = class130.method1024("::setparticles", 255);

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1100(int arg0) {
        field2611++;
        if (arg0 == -1) {
            class103.field1928 = new class69(32);
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V", line = 31)
    public static void method1101(int arg0) {
        if (arg0 != 0) {
            field2613 = (class279) null;
        }
        field2619 = null;
        field2605 = null;
        field2613 = null;
        field2610 = null;
        field2621 = null;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V", line = 85)
    public class144() {
        this.field2602 = 0.69921875F;
        this.field2615 = -50;
        this.field2620 = class219.field3878;
        this.field2607 = 1.2F;
        this.field2616 = 1.1523438F;
        this.field2614 = 0;
        this.field2618 = class219.field3870;
        this.field2609 = -50;
        this.field2617 = -60;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lvh;)V", line = 110)
    public class144(class53 arg0) {
        int var2 = arg0.method483(-119);
        if ((var2 & 0x1) == 0) {
            this.field2620 = class219.field3878;
        } else {
            this.field2620 = arg0.method453(1);
        }
        if ((var2 & 0x2) == 0) {
            this.field2616 = 1.1523438F;
        } else {
            this.field2616 = (float) arg0.method468(28214) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field2602 = 0.69921875F;
        } else {
            this.field2602 = (float) arg0.method468(28214) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field2607 = 1.2F;
        } else {
            this.field2607 = (float) arg0.method468(28214) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field2617 = -60;
            this.field2609 = -50;
            this.field2615 = -50;
        } else {
            this.field2609 = arg0.method495((byte) 125);
            this.field2617 = arg0.method495((byte) -111);
            this.field2615 = arg0.method495((byte) -105);
        }
        if ((var2 & 0x20) == 0) {
            this.field2618 = class219.field3870;
        } else {
            this.field2618 = arg0.method453(1);
        }
        if ((var2 & 0x40) == 0) {
            this.field2614 = 0;
        } else {
            this.field2614 = arg0.method468(28214);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class36 {

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public int field619 = 0;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public int field620 = -1;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public int field611 = -1;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "Z")
    public boolean field606 = true;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "Lhh;")
    private static class163 field609 = class137.method1065("level)2", 17);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "Lhh;")
    public static class163 field605 = class137.method1065(": ", 17);

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field608 = 0;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Lhh;")
    public static class163 field610 = field609;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Lhh;")
    private static class163 field612 = class137.method1065("wave2:", 17);

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "Lhh;")
    public static class163 field615 = field612;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Lhh;")
    public static class163 field616 = field612;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "Lki;")
    public static class184 field613;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILpg;I)V")
    public final void method262(int arg0, class81 arg1, int arg2) {
        field614++;
        while (true) {
            int var4 = arg1.method622(true);
            if (var4 == 0) {
                if (arg0 == -9010) {
                    return;
                } else {
                    field613 = null;
                    return;
                }
            }
            this.method263(arg2, var4, (byte) -110, arg1);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIBLpg;)V")
    private final void method263(int arg0, int arg1, byte arg2, class81 arg3) {
        if (arg1 == 1) {
            this.field619 = class72.method534(arg3.method615(arg2 ^ 0x1C), -1);
        } else if (arg1 == 2) {
            this.field611 = arg3.method622(true);
        } else if (arg1 == 3) {
            this.field611 = arg3.method658(87);
            if (this.field611 == 65535) {
                this.field611 = -1;
            }
        } else if (arg1 == 5) {
            this.field606 = false;
        } else if (arg1 == 7) {
            this.field620 = class72.method534(arg3.method615(-122), -1);
        } else if (arg1 == 8) {
            class6.field108 = arg0;
        } else if (arg1 == 9) {
            arg3.method658(-102);
        } else if (arg1 != 10) {
            if (arg1 == 11) {
                arg3.method622(true);
            } else if (arg1 != 12) {
                if (arg1 == 13) {
                    arg3.method615(arg2 ^ 0x1F);
                } else if (arg1 == 14) {
                    arg3.method622(true);
                }
            }
        }
        if (arg2 == -110) {
            field618++;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public static void method264(byte arg0) {
        field613 = null;
        field610 = null;
        field609 = null;
        field612 = null;
        field616 = null;
        if (arg0 != -90) {
            field612 = null;
        }
        field615 = null;
        field605 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lpa;III)[Lne;")
    public static final class94[] method265(class123 arg0, int arg1, int arg2, int arg3) {
        field617++;
        if (class85.method677(arg2, arg0, 20888, arg1)) {
            if (arg3 != -1) {
                method265((class123) null, 8, 50, -20);
            }
            return class157.method1161(arg3 ^ 0xFFFFFF84);
        } else {
            return null;
        }
    }
}

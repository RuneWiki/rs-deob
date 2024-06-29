import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class29 implements Runnable {

    @OriginalMember(owner = "client!e", name = "i", descriptor = "Z")
    public boolean field603 = true;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "Ljava/lang/Object;")
    public Object field605 = new Object();

    @OriginalMember(owner = "client!e", name = "t", descriptor = "[I")
    public int[] field614 = new int[500];

    @OriginalMember(owner = "client!e", name = "u", descriptor = "I")
    public int field615 = 0;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "[I")
    public int[] field616 = new int[500];

    @OriginalMember(owner = "client!e", name = "a", descriptor = "J")
    public static volatile long field595 = 0L;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "Lv;")
    public static class146 field598 = class159.method1226((byte) -37, ")3runescape)3com");

    @OriginalMember(owner = "client!e", name = "e", descriptor = "Lv;")
    public static class146 field599 = class159.method1226((byte) -37, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

    @OriginalMember(owner = "client!e", name = "j", descriptor = "[I")
    public static int[] field604 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!e", name = "n", descriptor = "Lv;")
    private static class146 field608 = class159.method1226((byte) -37, "Please check your message)2centre for details)3");

    @OriginalMember(owner = "client!e", name = "o", descriptor = "Lv;")
    public static class146 field609 = field608;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "Z")
    public static boolean field600 = false;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "Lv;")
    public static class146 field610 = class159.method1226((byte) -37, "Mem:");

    @OriginalMember(owner = "client!e", name = "b", descriptor = "Lv;")
    public static class146 field596 = class159.method1226((byte) -37, "hel");

    @OriginalMember(owner = "client!e", name = "c", descriptor = "Lfd;")
    public static class40 field597 = new class40(5000);

    @OriginalMember(owner = "client!e", name = "s", descriptor = "Lv;")
    public static class146 field613 = class159.method1226((byte) -37, "Weiter");

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "Lfc;")
    public static class39 field602;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "[[[B")
    public static byte[][][] field611;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    public static final void method198(int arg0) {
        Object var1 = class119.field2764;
        synchronized (class119.field2764) {
            if (class117.field2724 == 0) {
                class145.field3293.method123(new class58(), 5, arg0 + 13578);
            }
            class117.field2724 = 600;
        }
        field601++;
        if (arg0 != -13455) {
            field599 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field603) {
            Object var1 = this.field605;
            synchronized (this.field605) {
                if (this.field615 < 500) {
                    this.field614[this.field615] = class2.field45;
                    this.field616[this.field615] = class151.field3491;
                    this.field615++;
                }
            }
            class6.method51(50L, -14344);
        }
        field612++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lv;Lv;Lla;I)Lue;")
    public static final class144 method199(class146 arg0, class146 arg1, class77 arg2, int arg3) {
        field607++;
        int var4 = arg2.method593(73, arg1);
        int var5 = 49 % ((52 - arg3) / 52);
        int var6 = arg2.method592(arg0, 118, var4);
        return class57.method398((byte) 60, var6, arg2, var4);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IBLje;I)V")
    public static final void method200(int arg0, byte arg1, class67 arg2, int arg3) {
        if (arg2.field753 == arg3 && arg3 != -1) {
            int var4 = class141.method1052(true, arg3).field1672;
            if (var4 == 1) {
                arg2.field791 = arg0;
                arg2.field747 = 0;
                arg2.field799 = 0;
                arg2.field789 = 0;
            }
            if (var4 == 2) {
                arg2.field799 = 0;
            }
        } else if (arg3 == -1 || arg2.field753 == -1 || class141.method1052(true, arg3).field1656 >= class141.method1052(true, arg2.field753).field1656) {
            arg2.field799 = 0;
            arg2.field747 = 0;
            arg2.field753 = arg3;
            arg2.field791 = arg0;
            arg2.field773 = arg2.field811;
            arg2.field789 = 0;
        }
        field606++;
        if (arg1 < 101) {
            field613 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
    public static void method201(byte arg0) {
        field604 = null;
        field608 = null;
        field598 = null;
        field597 = null;
        field602 = null;
        field613 = null;
        field611 = null;
        field599 = null;
        field609 = null;
        field596 = null;
        if (arg0 >= -114) {
            field595 = 115L;
        }
        field610 = null;
    }
}

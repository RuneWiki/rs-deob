import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class480 extends class449 {

    @OriginalMember(owner = "client!au", name = "q", descriptor = "[B")
    public byte[] field6794;

    @OriginalMember(owner = "client!au", name = "t", descriptor = "Lrc;")
    public static class108 field6797 = new class108(19, 10);

    @OriginalMember(owner = "client!au", name = "v", descriptor = "Ljd;")
    public static class383 field6799 = new class383("LIVE", 0);

    @OriginalMember(owner = "client!au", name = "y", descriptor = "I")
    public static int field6802 = -1;

    @OriginalMember(owner = "client!au", name = "r", descriptor = "I")
    public static int field6795;

    @OriginalMember(owner = "client!au", name = "s", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!au", name = "u", descriptor = "I")
    public static int field6798;

    @OriginalMember(owner = "client!au", name = "w", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!au", name = "x", descriptor = "I")
    public static int field6801;

    @OriginalMember(owner = "client!au", name = "z", descriptor = "I")
    public static int field6803;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IB)Lol;")
    public static final class264 method2832(int arg0, byte arg1) {
        if (arg1 <= 117) {
            field6797 = null;
        }
        field6796++;
        if (arg0 == 0) {
            return new class363();
        } else if (arg0 == 1) {
            return new class1();
        } else if (arg0 == 2) {
            return new class318();
        } else if (arg0 == 3) {
            return new class289();
        } else if (arg0 == 4) {
            return new class350();
        } else if (arg0 == 5) {
            return new class124();
        } else if (arg0 == 6) {
            return new class467();
        } else if (arg0 == 7) {
            return new class387();
        } else if (arg0 == 8) {
            return new class369();
        } else if (arg0 == 9) {
            return new class213();
        } else if (arg0 == 10) {
            return new class154();
        } else if (arg0 == 11) {
            return new class166();
        } else if (arg0 == 12) {
            return new class75();
        } else if (arg0 == 13) {
            return new class139();
        } else if (arg0 == 14) {
            return new class278();
        } else if (arg0 == 15) {
            return new class130();
        } else if (arg0 == 16) {
            return new class433();
        } else if (arg0 == 17) {
            return new class486();
        } else if (arg0 == 18) {
            return new class256();
        } else if (arg0 == 19) {
            return new class218();
        } else if (arg0 == 20) {
            return new class274();
        } else if (arg0 == 21) {
            return new class259();
        } else if (arg0 == 22) {
            return new class68();
        } else if (arg0 == 23) {
            return new class221();
        } else if (arg0 == 24) {
            return new class339();
        } else if (arg0 == 25) {
            return new class227();
        } else if (arg0 == 26) {
            return new class482();
        } else if (arg0 == 27) {
            return new class490();
        } else if (arg0 == 28) {
            return new class343();
        } else if (arg0 == 29) {
            return new class142();
        } else if (arg0 == 30) {
            return new class284();
        } else if (arg0 == 31) {
            return new class136();
        } else if (arg0 == 32) {
            return new class119();
        } else if (arg0 == 33) {
            return new class77();
        } else if (arg0 == 34) {
            return new class15();
        } else if (arg0 == 35) {
            return new class141();
        } else if (arg0 == 36) {
            return new class296();
        } else if (arg0 == 37) {
            return new class41();
        } else if (arg0 == 38) {
            return new class163();
        } else if (arg0 == 39) {
            return new class239();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(B)V")
    public static void method2833(byte arg0) {
        field6797 = null;
        field6799 = null;
        int var1 = 62 % ((arg0 - 38) / 32);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Ljava/awt/Frame;Lis;I)V")
    public static final void method2834(Frame arg0, class65 arg1, int arg2) {
        while (true) {
            class275 var3 = arg1.method597(10479, arg0);
            while (var3.field3979 == 0) {
                class89.method752(0, 10L);
            }
            if (var3.field3979 == 1) {
                field6803++;
                arg0.setVisible(false);
                arg0.dispose();
                if (arg2 != 0) {
                    method2836(5);
                    return;
                }
                return;
            }
            class89.method752(arg2, 100L);
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(II)Z")
    public static final boolean method2835(int arg0, int arg1) {
        field6795++;
        if (arg0 == 8 || arg0 == 9 || arg0 == 50 || arg0 == 30 || arg0 == 46) {
            return true;
        } else if (arg0 == 18 || arg0 == 1011) {
            return true;
        } else {
            int var2 = 85 / ((arg1 - 28) / 54);
            return false;
        }
    }

    @OriginalMember(owner = "client!au", name = "d", descriptor = "(I)V")
    public static final void method2836(int arg0) {
        field6798++;
        if (class409.field5606 > 0) {
            class370.method2263(arg0 ^ 0xFFFFEA70);
            return;
        }
        class427.field5959 = class394.field5440;
        class394.field5440 = null;
        class237.method1649(40, false);
        if (arg0 != -5517) {
            method2832(-1, (byte) 89);
        }
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "([B)V")
    public class480(byte[] arg0) {
        this.field6794 = arg0;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class353 extends class735 {

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "Lam;")
    public static class660 field4702 = new class660();

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    private int field4700;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    private int field4703;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)V", line = 6)
    public static void method2159(byte arg0) {
        if (arg0 >= -82) {
            field4702 = null;
        }
        field4702 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lrh;Z)V", line = 20)
    public final void method624(class280 arg0, boolean arg1) {
        if (arg1) {
            this.field4703 = -27;
        }
        arg0.method1797(41, this.field4700, this.field4703);
        field4699++;
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(B)V", line = 31)
    public static final void method2160(byte arg0) {
        field4701++;
        int var1 = -18 % ((arg0 - 18) / 33);
        class696.field9624 = 0;
        for (int var2 = 0; var2 < 2048; var2++) {
            class341.field4601[var2] = null;
            class104.field1679[var2] = 1;
            class606.field8464[var2] = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)I", line = 52)
    public static final int method2161(int arg0) {
        field4705++;
        int var1 = -2 / ((arg0 + 40) / 48);
        if ((double) class64.field890 == 3.0D) {
            return 37;
        } else if ((double) class64.field890 == 4.0D) {
            return 50;
        } else if ((double) class64.field890 == 6.0D) {
            return 75;
        } else if ((double) class64.field890 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILfca;)V", line = 82)
    public final void method627(int arg0, class93 arg1) {
        this.field4700 = arg1.method773(arg0 - 2);
        field4704++;
        if (arg0 != 5) {
            this.field4703 = -22;
        }
        this.field4703 = arg1.method773(3);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZI)Lng;", line = 97)
    public static final class362 method2162(boolean arg0, int arg1) {
        field4706++;
        if (arg1 == 0) {
            return new class532();
        } else if (arg1 == 1) {
            return new class139();
        } else if (arg1 == 2) {
            return new class739();
        } else if (arg1 == 3) {
            return new class169();
        } else if (arg1 == 4) {
            return new class398();
        } else if (arg1 == 5) {
            return new class135();
        } else if (arg1 == 6) {
            return new class501();
        } else if (arg1 == 7) {
            return new class770();
        } else if (arg1 == 8) {
            return new class427();
        } else if (arg1 == 9) {
            return new class108();
        } else if (arg1 == 10) {
            return new class672();
        } else if (arg1 == 11) {
            return new class248();
        } else if (arg1 == 12) {
            return new class324();
        } else if (arg1 == 13) {
            return new class671();
        } else if (arg1 == 14) {
            return new class695();
        } else if (arg1 == 15) {
            return new class473();
        } else if (arg1 == 16) {
            return new class331();
        } else if (arg1 == 17) {
            return new class664();
        } else if (arg1 == 18) {
            return new class179();
        } else if (arg1 == 19) {
            return new class220();
        } else if (arg1 == 20) {
            return new class204();
        } else if (arg1 == 21) {
            return new class590();
        } else if (arg1 == 22) {
            return new class62();
        } else if (arg1 == 23) {
            return new class99();
        } else if (arg1 == 24) {
            return new class518();
        } else if (arg1 == 25) {
            return new class180();
        } else if (arg1 == 26) {
            return new class661();
        } else if (arg1 == 27) {
            return new class629();
        } else if (arg1 == 28) {
            return new class288();
        } else if (arg1 == 29) {
            return new class148();
        } else if (arg1 == 30) {
            return new class23();
        } else if (arg1 == 31) {
            return new class696();
        } else if (arg1 == 32) {
            return new class586();
        } else if (arg1 == 33) {
            return new class456();
        } else if (arg1 == 34) {
            return new class471();
        } else if (arg1 == 35) {
            return new class475();
        } else if (arg1 == 36) {
            return new class707();
        } else if (arg1 == 37) {
            return new class681();
        } else if (arg1 == 38) {
            return new class258();
        } else if (arg1 == 39) {
            return new class55();
        } else if (arg0) {
            return null;
        } else {
            return null;
        }
    }
}

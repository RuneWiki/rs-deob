import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public abstract class class606 {

    @OriginalMember(owner = "client!raa", name = "g", descriptor = "Lsr;")
    public class251 field8525;

    @OriginalMember(owner = "client!raa", name = "f", descriptor = "Lpca;")
    public static class714 field8524 = new class714(64);

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "I")
    public static int field8519;

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "I")
    public static int field8520;

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "I")
    public static int field8521;

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "I")
    public static int field8522;

    @OriginalMember(owner = "client!raa", name = "e", descriptor = "I")
    public static int field8523;

    @OriginalMember(owner = "client!raa", name = "h", descriptor = "I")
    public static int field8526;

    @OriginalMember(owner = "client!raa", name = "j", descriptor = "I")
    public static int field8528;

    @OriginalMember(owner = "client!raa", name = "k", descriptor = "I")
    public static int field8529;

    @OriginalMember(owner = "client!raa", name = "m", descriptor = "I")
    public static int field8531;

    @OriginalMember(owner = "client!raa", name = "n", descriptor = "J")
    public static long field8532;

    @OriginalMember(owner = "client!raa", name = "l", descriptor = "Lle;")
    public static class307 field8530;

    @OriginalMember(owner = "client!raa", name = "i", descriptor = "Lfp;")
    public static class323 field8527;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(II)I")
    public static final int method3412(int arg0, int arg1) {
        int var2 = 105 / ((12 - arg0) / 57);
        field8521++;
        int var3 = arg1 & 0x3F;
        int var4 = arg1 >> 6 & 0x3;
        if (var3 == 18) {
            if (var4 == 0) {
                return 1;
            }
            if (var4 == 1) {
                return 2;
            }
            if (var4 == 2) {
                return 4;
            }
            if (var4 == 3) {
                return 8;
            }
        } else if (var3 == 19 || var3 == 21) {
            if (var4 == 0) {
                return 16;
            }
            if (var4 == 1) {
                return 32;
            }
            if (var4 == 2) {
                return 64;
            }
            if (var4 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)V")
    public abstract void method521(byte arg0);

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(ZI)V")
    public abstract void method517(boolean arg0, int arg1);

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(B)V")
    public void method1988(byte arg0) {
        if (arg0 > -111) {
            this.method521((byte) -74);
        }
        field8522++;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lma;II)V")
    public abstract void method523(class12 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(IZ)V")
    public abstract void method518(int arg0, boolean arg1);

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Z)V")
    public void method1985(boolean arg0) {
        field8526++;
        if (!arg0) {
            method3412(-65, -86);
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)V")
    public void method1989(int arg0) {
        if (arg0 >= -62) {
            field8532 = -69L;
        }
        field8529++;
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(I)V")
    public void method1984(int arg0) {
        if (arg0 != 25411) {
            method3412(22, 53);
        }
        field8523++;
    }

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "(I)Z")
    public abstract boolean method525(int arg0);

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "(I)V")
    public void method1986(int arg0) {
        if (arg0 != 64) {
            this.method1985(true);
        }
        field8519++;
    }

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "(B)V")
    public void method1052(byte arg0) {
        field8520++;
        if (arg0 != -122) {
            field8532 = 49L;
        }
    }

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(Lsr;)V")
    public class606(class251 arg0) {
        this.field8525 = arg0;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(III)V")
    public abstract void method516(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!raa", name = "e", descriptor = "(I)V")
    public static void method3413(int arg0) {
        field8530 = null;
        field8524 = null;
        field8527 = null;
        if (arg0 < 65) {
            field8524 = null;
        }
    }
}

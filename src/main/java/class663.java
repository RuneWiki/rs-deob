import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class663 {

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "Lrga;")
    public static class280 field9372 = new class280(40, -1);

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field9370;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field9371;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field9373;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Lpl;")
    public static class612 field9374;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([[BLgl;B)V")
    public static final void method3735(byte[][] arg0, class646 arg1, byte arg2) {
        field9371++;
        int var3 = class209.field2635.length;
        int var4 = 0;
        if (arg2 <= 15) {
            field9372 = null;
        }
        while (var4 < var3) {
            byte[] var5 = arg0[var4];
            if (var5 != null) {
                int var6 = (class564.field7842[var4] >> 8) * 64 - class145.field1879;
                int var7 = (class564.field7842[var4] & 0xFF) * 64 - class630.field8817;
                class671.method3767((byte) 76);
                arg1.method3605(var6, true, class32.field452, var7, var5, class154.field1991);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method3736(int arg0) {
        if (arg0 != -26) {
            field9372 = null;
        }
        field9374 = null;
        field9372 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Lmca;")
    public static final class5 method3737(int arg0, int arg1) {
        field9370++;
        if (arg1 == 0) {
            return new class366();
        } else if (arg1 == 1) {
            return new class550();
        } else if (arg1 == 2) {
            return new class175();
        } else if (arg1 == 3) {
            return new class8();
        } else if (arg1 == 4) {
            return new class632();
        } else if (arg1 == 5) {
            return new class61();
        } else if (arg1 == 6) {
            return new class157();
        } else if (arg1 == 7) {
            return new class17();
        } else if (arg1 == 8) {
            return new class105();
        } else if (arg1 == 9) {
            return new class467();
        } else if (arg1 == 10) {
            return new class472();
        } else if (arg1 == 11) {
            return new class641();
        } else if (arg1 == 12) {
            return new class370();
        } else if (arg1 == 13) {
            return new class341();
        } else if (arg1 == 14) {
            return new class56();
        } else if (arg1 == 15) {
            return new class35();
        } else if (arg1 == 16) {
            return new class91();
        } else if (arg1 == 17) {
            return new class402();
        } else if (arg1 == 18) {
            return new class418();
        } else if (arg1 == 19) {
            return new class78();
        } else if (arg1 == 20) {
            return new class634();
        } else if (arg1 == 21) {
            return new class129();
        } else if (arg1 == 22) {
            return new class253();
        } else if (arg1 == 23) {
            return new class579();
        } else if (arg1 == 24) {
            return new class367();
        } else if (arg1 == 25) {
            return new class276();
        } else if (arg1 == 26) {
            return new class383();
        } else if (arg1 == 27) {
            return new class394();
        } else if (arg1 == 28) {
            return new class686();
        } else if (arg1 == 29) {
            return new class109();
        } else if (arg1 == 30) {
            return new class603();
        } else if (arg1 == 31) {
            return new class58();
        } else if (arg1 == 32) {
            return new class198();
        } else if (arg1 == 33) {
            return new class92();
        } else if (arg1 == 34) {
            return new class354();
        } else if (arg1 == 35) {
            return new class360();
        } else if (arg1 == 36) {
            return new class160();
        } else if (arg1 == 37) {
            return new class505();
        } else if (arg1 == 38) {
            return new class429();
        } else if (arg1 == 39) {
            return new class604();
        } else {
            if (arg0 != -29) {
                method3735(null, null, (byte) 15);
            }
            return null;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class200 extends class195 {

    @OriginalMember(owner = "client!rf", name = "W", descriptor = "[I")
    public static int[] field3188 = new int[1000];

    @OriginalMember(owner = "client!rf", name = "Y", descriptor = "Lvk;")
    public static class67 field3190 = new class67(50);

    @OriginalMember(owner = "client!rf", name = "ab", descriptor = "Lck;")
    private static class119 field3192 = class298.method1987((byte) 9, "Select a world");

    @OriginalMember(owner = "client!rf", name = "bb", descriptor = "Lck;")
    public static class119 field3193 = field3192;

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!rf", name = "X", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!rf", name = "Z", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)Lwb;", line = 6)
    public static final class195 method1274(int arg0, byte arg1) {
        if (arg1 != 9) {
            return (class195) null;
        }
        field3186++;
        if (arg0 == 0) {
            return new class4();
        } else if (arg0 == 1) {
            return new class189();
        } else if (arg0 == 2) {
            return new class63();
        } else if (arg0 == 3) {
            return new class200();
        } else if (arg0 == 4) {
            return new class299();
        } else if (arg0 == 5) {
            return new class30();
        } else if (arg0 == 6) {
            return new class221();
        } else if (arg0 == 7) {
            return new class70();
        } else if (arg0 == 8) {
            return new class227();
        } else if (arg0 == 9) {
            return new class26();
        } else if (arg0 == 10) {
            return new class91();
        } else if (arg0 == 11) {
            return new class109();
        } else if (arg0 == 12) {
            return new class232();
        } else if (arg0 == 13) {
            return new class205();
        } else if (arg0 == 14) {
            return new class128();
        } else if (arg0 == 15) {
            return new class111();
        } else if (arg0 == 16) {
            return new class255();
        } else if (arg0 == 17) {
            return new class269();
        } else if (arg0 == 18) {
            return new class203();
        } else if (arg0 == 19) {
            return new class244();
        } else if (arg0 == 20) {
            return new class6();
        } else if (arg0 == 21) {
            return new class90();
        } else if (arg0 == 22) {
            return new class102();
        } else if (arg0 == 23) {
            return new class114();
        } else if (arg0 == 24) {
            return new class161();
        } else if (arg0 == 25) {
            return new class144();
        } else if (arg0 == 26) {
            return new class7();
        } else if (arg0 == 27) {
            return new class215();
        } else if (arg0 == 28) {
            return new class151();
        } else if (arg0 == 29) {
            return new class257();
        } else if (arg0 == 30) {
            return new class2();
        } else if (arg0 == 31) {
            return new class35();
        } else if (arg0 == 32) {
            return new class85();
        } else if (arg0 == 33) {
            return new class84();
        } else if (arg0 == 34) {
            return new class103();
        } else if (arg0 == 35) {
            return new class237();
        } else if (arg0 == 36) {
            return new class171();
        } else if (arg0 == 37) {
            return new class208();
        } else if (arg0 == 38) {
            return new class167();
        } else if (arg0 == 39) {
            return new class46();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(B)V", line = 331)
    public static void method1275(byte arg0) {
        field3192 = null;
        field3193 = null;
        if (arg0 < 73) {
            field3188 = (int[]) null;
        }
        field3190 = null;
        field3188 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)I", line = 344)
    public static final int method1276(int arg0, int arg1) {
        field3189++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        if (arg0 < 59) {
            method1276(103, -11);
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZ)[I", line = 397)
    public final int[] method11(int arg0, boolean arg1) {
        if (arg1) {
            field3188 = (int[]) null;
        }
        field3191++;
        int[] var3 = this.field3106.method924(100, arg0);
        if (this.field3106.field2260) {
            class213.method1340(var3, 0, class157.field2504, class215.field3424[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V", line = 437)
    public class200() {
        super(0, true);
    }
}

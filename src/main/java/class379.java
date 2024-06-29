import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class379 {

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "I")
    public static int field5082 = 0;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!taa", name = "e", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!taa", name = "d", descriptor = "[Lxa;")
    public static class468[] field5083;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(B)V", line = 4)
    public static void method2220(byte arg0) {
        if (arg0 == 88) {
            field5083 = null;
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(IB)Z", line = 15)
    public static final boolean method2221(int arg0, byte arg1) {
        field5084++;
        int var2 = 11 % ((21 - arg1) / 40);
        for (class117 var3 = (class117) class480.field6411.method3257(-62); var3 != null; var3 = (class117) class480.field6411.method3263((byte) -74)) {
            if (class264.method1611(var3.field1993, false) && ((long) arg0) == var3.field1996) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(BI)Lqp;", line = 39)
    public static final class615 method2222(byte arg0, int arg1) {
        field5081++;
        if (arg1 == 0) {
            return new class39();
        } else if (arg1 == 1) {
            return new class97();
        } else if (arg1 == 2) {
            return new class128();
        } else if (arg1 == 3) {
            return new class301();
        } else if (arg1 == 4) {
            return new class308();
        } else if (arg1 == 5) {
            return new class150();
        } else if (arg1 == 6) {
            return new class250();
        } else if (arg1 == 7) {
            return new class107();
        } else if (arg1 == 8) {
            return new class2();
        } else if (arg1 == 9) {
            return new class450();
        } else if (arg1 == 10) {
            return new class284();
        } else if (arg1 == 11) {
            return new class549();
        } else if (arg1 == 12) {
            return new class327();
        } else if (arg1 == 13) {
            return new class705();
        } else if (arg1 == 14) {
            return new class208();
        } else if (arg1 == 15) {
            return new class16();
        } else if (arg1 == 16) {
            return new class237();
        } else if (arg1 == 17) {
            return new class407();
        } else if (arg1 == 18) {
            return new class216();
        } else if (arg1 == 19) {
            return new class25();
        } else if (arg1 == 20) {
            return new class148();
        } else if (arg1 == 21) {
            return new class145();
        } else if (arg1 == 22) {
            return new class191();
        } else if (arg1 == 23) {
            return new class619();
        } else if (arg1 == 24) {
            return new class508();
        } else if (arg1 == 25) {
            return new class295();
        } else if (arg1 == 26) {
            return new class565();
        } else if (arg1 == 27) {
            return new class162();
        } else if (arg1 == 28) {
            return new class547();
        } else if (arg1 == 29) {
            return new class383();
        } else if (arg1 == 30) {
            return new class426();
        } else if (arg1 == 31) {
            return new class406();
        } else if (arg1 == 32) {
            return new class138();
        } else if (arg1 == 33) {
            return new class569();
        } else if (arg1 == 34) {
            return new class63();
        } else if (arg1 == 35) {
            return new class95();
        } else if (arg1 == 36) {
            return new class572();
        } else if (arg1 == 37) {
            return new class265();
        } else if (arg1 == 38) {
            return new class223();
        } else if (arg1 == 39) {
            return new class637();
        } else {
            if (arg0 >= -18) {
                field5082 = -12;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(I[B)[B", line = 361)
    public static final byte[] method2223(int arg0, byte[] arg1) {
        field5080++;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class83.method686(arg1, 0, var2, arg0, arg1.length);
            return var2;
        }
    }
}

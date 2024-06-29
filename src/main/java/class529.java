import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class529 {

    @OriginalMember(owner = "client!aaa", name = "j", descriptor = "I")
    public int field7416;

    @OriginalMember(owner = "client!aaa", name = "i", descriptor = "I")
    public int field7415;

    @OriginalMember(owner = "client!aaa", name = "d", descriptor = "I")
    public int field7410;

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "I")
    public int field7409;

    @OriginalMember(owner = "client!aaa", name = "h", descriptor = "Lh;")
    public static class571 field7414 = new class571(4);

    @OriginalMember(owner = "client!aaa", name = "k", descriptor = "F")
    public static float field7417;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "I")
    public static int field7407;

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!aaa", name = "e", descriptor = "I")
    public static int field7411;

    @OriginalMember(owner = "client!aaa", name = "f", descriptor = "I")
    public static int field7412;

    @OriginalMember(owner = "client!aaa", name = "g", descriptor = "I")
    public static int field7413;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IZ)Laaa;")
    public final class529 method3034(int arg0, boolean arg1) {
        field7411++;
        if (arg1) {
            this.field7410 = 108;
        }
        return new class529(this.field7415, arg0, this.field7416, this.field7409);
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)Lbk;")
    public static final class314 method3035(int arg0) {
        int var1 = -120 / ((55 - arg0) / 52);
        field7413++;
        class314 var2 = (class314) class526.field7393.method2197(0);
        if (var2 != null) {
            var2.method1117(0);
            var2.method896(0);
            return var2;
        }
        class314 var3;
        do {
            var3 = (class314) class451.field6368.method2197(0);
            if (var3 == null) {
                return null;
            }
            if (var3.method1957(50) > class488.method2835(30160)) {
                return null;
            }
            var3.method1117(0);
            var3.method896(0);
        } while ((Long.MIN_VALUE & var3.field2110) == 0L);
        return var3;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(II)Lnd;")
    public static final class466 method3036(int arg0, int arg1) {
        field7412++;
        if (arg1 == 0) {
            return new class402();
        } else if (arg1 == 1) {
            return new class5();
        } else if (arg1 == 2) {
            return new class245();
        } else if (arg1 == 3) {
            return new class95();
        } else if (arg1 == 4) {
            return new class213();
        } else if (arg1 == 5) {
            return new class57();
        } else if (arg1 == 6) {
            return new class490();
        } else if (arg1 == 7) {
            return new class547();
        } else if (arg1 == 8) {
            return new class646();
        } else if (arg1 == 9) {
            return new class350();
        } else if (arg1 == 10) {
            return new class330();
        } else if (arg1 == 11) {
            return new class61();
        } else if (arg1 == 12) {
            return new class472();
        } else if (arg1 == 13) {
            return new class507();
        } else if (arg1 == 14) {
            return new class311();
        } else if (arg1 == 15) {
            return new class522();
        } else if (arg1 == 16) {
            return new class487();
        } else if (arg1 == 17) {
            return new class512();
        } else if (arg1 == 18) {
            return new class56();
        } else if (arg1 == 19) {
            return new class13();
        } else if (arg1 == 20) {
            return new class459();
        } else if (arg1 == 21) {
            return new class390();
        } else if (arg1 == 22) {
            return new class387();
        } else if (arg1 == 23) {
            return new class533();
        } else if (arg1 == 24) {
            return new class75();
        } else if (arg1 == 25) {
            return new class428();
        } else if (arg1 == 26) {
            return new class441();
        } else if (arg1 == 27) {
            return new class515();
        } else if (arg1 == 28) {
            return new class493();
        } else if (arg1 == 29) {
            return new class612();
        } else if (arg1 == 30) {
            return new class65();
        } else if (arg1 == 31) {
            return new class331();
        } else if (arg1 == 32) {
            return new class1();
        } else if (arg1 == 33) {
            return new class526();
        } else if (arg1 == 34) {
            return new class168();
        } else if (arg1 == 35) {
            return new class90();
        } else if (arg1 == 36) {
            return new class181();
        } else if (arg1 == 37) {
            return new class404();
        } else if (arg1 == 38) {
            return new class236();
        } else if (arg1 == 39) {
            return new class169();
        } else {
            if (arg0 != -4564) {
                field7408 = 59;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(IIII)V")
    public class529(int arg0, int arg1, int arg2, int arg3) {
        this.field7416 = arg2;
        this.field7415 = arg0;
        this.field7410 = arg1;
        this.field7409 = arg3;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method3037(byte arg0, String arg1) {
        if (arg0 < 84) {
            method3035(-126);
        }
        field7407++;
        String var2 = class380.method2245(class639.method3697((byte) 80, arg1), 21629);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)V")
    public static void method3038(byte arg0) {
        if (arg0 <= -40) {
            field7414 = null;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class221 extends class134 {

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public int field3542;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3543 = "Walk here";

    @OriginalMember(owner = "client!se", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field3544 = new String[100];

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZI)Lda;")
    public static final class198 method1551(boolean arg0, int arg1) {
        if (arg0) {
            field3544 = null;
        }
        field3545++;
        if (arg1 == 0) {
            return new class10();
        } else if (arg1 == 1) {
            return new class179();
        } else if (arg1 == 2) {
            return new class147();
        } else if (arg1 == 3) {
            return new class6();
        } else if (arg1 == 4) {
            return new class182();
        } else if (arg1 == 5) {
            return new class65();
        } else if (arg1 == 6) {
            return new class275();
        } else if (arg1 == 7) {
            return new class300();
        } else if (arg1 == 8) {
            return new class118();
        } else if (arg1 == 9) {
            return new class199();
        } else if (arg1 == 10) {
            return new class307();
        } else if (arg1 == 11) {
            return new class305();
        } else if (arg1 == 12) {
            return new class48();
        } else if (arg1 == 13) {
            return new class52();
        } else if (arg1 == 14) {
            return new class60();
        } else if (arg1 == 15) {
            return new class152();
        } else if (arg1 == 16) {
            return new class121();
        } else if (arg1 == 17) {
            return new class278();
        } else if (arg1 == 18) {
            return new class34();
        } else if (arg1 == 19) {
            return new class268();
        } else if (arg1 == 20) {
            return new class243();
        } else if (arg1 == 21) {
            return new class45();
        } else if (arg1 == 22) {
            return new class137();
        } else if (arg1 == 23) {
            return new class287();
        } else if (arg1 == 24) {
            return new class181();
        } else if (arg1 == 25) {
            return new class123();
        } else if (arg1 == 26) {
            return new class104();
        } else if (arg1 == 27) {
            return new class24();
        } else if (arg1 == 28) {
            return new class84();
        } else if (arg1 == 29) {
            return new class148();
        } else if (arg1 == 30) {
            return new class183();
        } else if (arg1 == 31) {
            return new class258();
        } else if (arg1 == 32) {
            return new class214();
        } else if (arg1 == 33) {
            return new class87();
        } else if (arg1 == 34) {
            return new class41();
        } else if (arg1 == 35) {
            return new class186();
        } else if (arg1 == 36) {
            return new class107();
        } else if (arg1 == 37) {
            return new class57();
        } else if (arg1 == 38) {
            return new class246();
        } else if (arg1 == 39) {
            return new class263();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
    public class221() {
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(I)V")
    public class221(int arg0) {
        this.field3542 = arg0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public static void method1552(byte arg0) {
        field3543 = null;
        field3544 = null;
        if (arg0 != 98) {
            field3543 = null;
        }
    }
}

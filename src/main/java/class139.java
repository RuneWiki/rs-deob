import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class139 extends class273 {

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "J")
    public long field2118;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    public static int field2119 = 10;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "[Lnl;")
    public static class30[] field2121;

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V", line = 3)
    public class139() {
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(J)V", line = 5)
    public class139(long arg0) {
        this.field2118 = arg0;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZI)Lpk;", line = 17)
    public static final class112 method877(boolean arg0, int arg1) {
        field2120++;
        if (arg1 == 0) {
            return new class57();
        } else if (arg1 == 1) {
            return new class199();
        } else if (arg1 == 2) {
            return new class26();
        } else if (arg1 == 3) {
            return new class283();
        } else if (arg1 == 4) {
            return new class232();
        } else if (arg1 == 5) {
            return new class155();
        } else if (arg1 == 6) {
            return new class278();
        } else if (arg1 == 7) {
            return new class101();
        } else if (arg1 == 8) {
            return new class237();
        } else if (arg1 == 9) {
            return new class128();
        } else if (arg1 == 10) {
            return new class202();
        } else if (arg1 == 11) {
            return new class164();
        } else if (arg1 == 12) {
            return new class321();
        } else if (arg1 == 13) {
            return new class267();
        } else if (arg1 == 14) {
            return new class219();
        } else if (arg1 == 15) {
            return new class134();
        } else if (arg1 == 16) {
            return new class239();
        } else if (arg1 == 17) {
            return new class306();
        } else if (arg1 == 18) {
            return new class216();
        } else if (arg1 == 19) {
            return new class310();
        } else if (arg1 == 20) {
            return new class11();
        } else if (arg1 == 21) {
            return new class70();
        } else if (arg1 == 22) {
            return new class224();
        } else if (arg1 == 23) {
            return new class60();
        } else if (arg1 == 24) {
            return new class17();
        } else if (arg1 == 25) {
            return new class125();
        } else if (arg1 == 26) {
            return new class324();
        } else if (arg1 == 27) {
            return new class100();
        } else if (arg1 == 28) {
            return new class194();
        } else if (arg1 == 29) {
            return new class196();
        } else if (arg1 == 30) {
            return new class173();
        } else if (arg1 == 31) {
            return new class228();
        } else if (arg1 == 32) {
            return new class288();
        } else if (arg1 == 33) {
            return new class146();
        } else if (arg1 == 34) {
            return new class252();
        } else if (arg1 == 35) {
            return new class131();
        } else if (arg1 == 36) {
            return new class113();
        } else if (arg1 == 37) {
            return new class185();
        } else if (arg1 == 38) {
            return new class116();
        } else if (arg1 == 39) {
            return new class170();
        } else {
            if (!arg0) {
                method878(126);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V", line = 338)
    public static void method878(int arg0) {
        if (arg0 != 27) {
            method878(7);
        }
        field2121 = null;
    }
}

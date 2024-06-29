import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class390 {

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "Lba;")
    public class107 field4994;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "Lw;")
    public class605 field4995;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "Llc;")
    public static class656 field4990;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V", line = 6)
    public static void method2228(boolean arg0) {
        field4990 = null;
        if (arg0) {
            method2229(-118, -20);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)Lku;", line = 18)
    public static final class192 method2229(int arg0, int arg1) {
        if (arg1 != -34) {
            method2230(-5, null, -77);
        }
        field4993++;
        if (arg0 == 0) {
            return new class662();
        } else if (arg0 == 1) {
            return new class111();
        } else if (arg0 == 2) {
            return new class228();
        } else if (arg0 == 3) {
            return new class663();
        } else if (arg0 == 4) {
            return new class392();
        } else if (arg0 == 5) {
            return new class276();
        } else if (arg0 == 6) {
            return new class91();
        } else if (arg0 == 7) {
            return new class580();
        } else if (arg0 == 8) {
            return new class267();
        } else if (arg0 == 9) {
            return new class223();
        } else if (arg0 == 10) {
            return new class533();
        } else if (arg0 == 11) {
            return new class69();
        } else if (arg0 == 12) {
            return new class671();
        } else if (arg0 == 13) {
            return new class445();
        } else if (arg0 == 14) {
            return new class398();
        } else if (arg0 == 15) {
            return new class164();
        } else if (arg0 == 16) {
            return new class505();
        } else if (arg0 == 17) {
            return new class482();
        } else if (arg0 == 18) {
            return new class521();
        } else if (arg0 == 19) {
            return new class460();
        } else if (arg0 == 20) {
            return new class524();
        } else if (arg0 == 21) {
            return new class601();
        } else if (arg0 == 22) {
            return new class377();
        } else if (arg0 == 23) {
            return new class221();
        } else if (arg0 == 24) {
            return new class516();
        } else if (arg0 == 25) {
            return new class26();
        } else if (arg0 == 26) {
            return new class468();
        } else if (arg0 == 27) {
            return new class82();
        } else if (arg0 == 28) {
            return new class190();
        } else if (arg0 == 29) {
            return new class630();
        } else if (arg0 == 30) {
            return new class76();
        } else if (arg0 == 31) {
            return new class21();
        } else if (arg0 == 32) {
            return new class290();
        } else if (arg0 == 33) {
            return new class19();
        } else if (arg0 == 34) {
            return new class240();
        } else if (arg0 == 35) {
            return new class522();
        } else if (arg0 == 36) {
            return new class299();
        } else if (arg0 == 37) {
            return new class456();
        } else if (arg0 == 38) {
            return new class585();
        } else if (arg0 == 39) {
            return new class438();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I[BI)[B", line = 344)
    public static final byte[] method2230(int arg0, byte[] arg1, int arg2) {
        if (arg2 == -11983) {
            field4992++;
            byte[] var3 = new byte[arg0];
            class443.method2514(arg1, 0, var3, 0, arg0);
            return var3;
        } else {
            return null;
        }
    }
}

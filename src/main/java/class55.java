import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class55 {

    @OriginalMember(owner = "client!th", name = "f", descriptor = "Lgd;")
    public static class170 field917 = new class170(16);

    @OriginalMember(owner = "client!th", name = "n", descriptor = "Z")
    public static boolean field925 = false;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field919 = 0;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public int field920;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public int field923;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    private int field926;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "Lsn;")
    public static class319 field914;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "[Lin;")
    public static class168[] field922;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ll;I)V", line = 4)
    public static final void method446(class133 arg0, int arg1) {
        class31.field452 = arg0;
        field916++;
        if (arg1 <= 123) {
            method451((byte) 81);
        }
        class97.field1549 = class31.field452.method954(-24001, 4);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IILkh;I)V", line = 19)
    private final void method447(int arg0, int arg1, class166 arg2, int arg3) {
        if (arg3 == 1) {
            this.field926 = arg2.method1151(-67);
        } else if (arg3 == 2) {
            this.field923 = arg2.method1178(0);
            this.field920 = arg2.method1178(arg0 ^ 0xFFFFFFFD);
        }
        field924++;
        if (arg0 != -3) {
            method446((class133) null, -41);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)Lgm;", line = 42)
    public final class249 method448(byte arg0) {
        field915++;
        class249 var2 = (class249) class326.field5081.method2179(false, (long) this.field926);
        if (arg0 >= -53) {
            return (class249) null;
        } else if (var2 == null) {
            class249 var3 = class61.method480(0, class182.field2737, -10353, this.field926);
            if (var3 != null) {
                class326.field5081.method2173(var3, true, (long) this.field926);
            }
            return var3;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILkh;I)V", line = 66)
    public final void method449(int arg0, class166 arg1, int arg2) {
        field913++;
        while (true) {
            int var4 = arg1.method1178(0);
            if (var4 == 0) {
                if (arg0 != -3) {
                    method451((byte) -85);
                }
                return;
            }
            this.method447(-3, arg2, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIZII)V", line = 96)
    public static final void method450(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field912++;
        for (int var5 = 0; var5 < class169.field2560; var5++) {
            if (arg0 < (class80.field1270[var5] + class342.field5326[var5]) && (arg0 + arg3) > class342.field5326[var5] && (class43.field693[var5] + class116.field1780[var5]) > arg1 && (arg1 + arg4) > class43.field693[var5]) {
                class34.field510[var5] = true;
            }
        }
        if (!arg2) {
            method446((class133) null, 38);
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V", line = 118)
    public static void method451(byte arg0) {
        if (arg0 != 90) {
            field925 = false;
        }
        field922 = null;
        field917 = null;
        field914 = null;
    }
}

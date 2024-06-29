import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class141 {

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field3388 = 0;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "J")
    public static long field3390 = 0L;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Lgd;")
    public static class44 field3387 = new class44(30);

    @OriginalMember(owner = "client!we", name = "i", descriptor = "Lkc;")
    private static class67 field3394 = class19.method144("as it was used to break our rules)3", 98);

    @OriginalMember(owner = "client!we", name = "j", descriptor = "Lkc;")
    public static class67 field3395 = field3394;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "Lkc;")
    public static class67 field3401 = class19.method144(": ", 69);

    @OriginalMember(owner = "client!we", name = "r", descriptor = "Lkc;")
    public static class67 field3403 = class19.method144("null", 94);

    @OriginalMember(owner = "client!we", name = "u", descriptor = "Lkc;")
    private static class67 field3406 = class19.method144("You are standing in a members)2only area)3", 70);

    @OriginalMember(owner = "client!we", name = "q", descriptor = "Lkc;")
    private static class67 field3402 = class19.method144("Accept trade", 97);

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field3393 = 0;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Lkc;")
    public static class67 field3396 = field3402;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "Lkc;")
    private static class67 field3400 = class19.method144("Prepared visibility map", 86);

    @OriginalMember(owner = "client!we", name = "n", descriptor = "Lkc;")
    public static class67 field3399 = class19.method144(" )2> @whi@", 89);

    @OriginalMember(owner = "client!we", name = "m", descriptor = "Lkc;")
    public static class67 field3398 = field3400;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Lkc;")
    public static class67 field3392 = field3406;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "Lkc;")
    private static class67 field3408 = class19.method144("Close", 125);

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Lkc;")
    public static class67 field3397 = field3408;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "Lta;")
    public static class119 field3405;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "Lcc;")
    public static class18 field3407;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 13)
    public static void method1123(int arg0) {
        field3395 = null;
        field3394 = null;
        field3398 = null;
        field3400 = null;
        field3405 = null;
        field3408 = null;
        if (arg0 <= 84) {
            return;
        }
        field3396 = null;
        field3402 = null;
        field3387 = null;
        field3401 = null;
        field3392 = null;
        field3397 = null;
        field3406 = null;
        field3399 = null;
        field3407 = null;
        field3403 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)Lsb;", line = 54)
    public static final class114 method1124(byte arg0, int arg1) {
        field3386++;
        class114 var2 = (class114) class69.field1644.method373((byte) 108, (long) arg1);
        if (arg0 < 54) {
            field3408 = null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class14.field299.method27(arg1, true, 1);
        class114 var4 = new class114();
        if (var3 != null) {
            var4.method915(new class140(var3), (byte) -108, arg1);
        }
        var4.method918((byte) -65);
        class69.field1644.method374(0, var4, (long) arg1);
        return var4;
    }
}

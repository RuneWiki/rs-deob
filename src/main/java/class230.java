import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class230 {

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "I")
    public int field3505;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "[I")
    public int[] field3503;

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "[I")
    public int[] field3506;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "[I")
    public static int[] field3499 = new int[4096];

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "Lnd;")
    public static class366 field3502 = new class366(13, 7);

    @OriginalMember(owner = "client!ws", name = "j", descriptor = "Lia;")
    public static class399 field3508 = new class399(5000);

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!ws", name = "i", descriptor = "Lqi;")
    public static class382 field3507;

    @OriginalMember(owner = "client!ws", name = "k", descriptor = "[I")
    public static int[] field3509;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method1384(boolean arg0) {
        if (!arg0) {
            field3499 = null;
        }
        field3500++;
        class458.field7049.method1761(-110);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)V", line = 25)
    public static void method1385(byte arg0) {
        field3502 = null;
        field3508 = null;
        field3509 = null;
        field3507 = null;
        field3499 = null;
        int var1 = 92 % ((arg0 - 33) / 42);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)V", line = 39)
    public static final void method1386(int arg0, int arg1) {
        field3504++;
        class494.field7521 = arg0;
        class288 var2 = class475.field7250;
        synchronized (class475.field7250) {
            class475.field7250.method1761(-125);
        }
        if (arg1 > -72) {
            field3499 = null;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IBI)Ljt;", line = 57)
    public static final class64 method1387(int arg0, byte arg1, int arg2) {
        if (arg1 != 40) {
            method1385((byte) -37);
        }
        field3501++;
        class64 var3 = (class64) class50.field762.method2409(false, (long) arg0 | (long) arg2 << 32);
        if (var3 == null) {
            var3 = new class64(arg2, arg0);
            class50.field762.method2413(var3.field2798, arg1 ^ 0xFFFFFFD7, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(I)V", line = 77)
    public class230(int arg0) {
        this.field3505 = arg0;
        this.field3503 = new int[this.field3505];
        this.field3506 = new int[this.field3505];
    }
}

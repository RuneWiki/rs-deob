import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class60 extends class288 {

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "Lc;")
    public static class284 field715 = new class284(16);

    @OriginalMember(owner = "client!ci", name = "A", descriptor = "Z")
    public static boolean field721 = false;

    @OriginalMember(owner = "client!ci", name = "B", descriptor = "I")
    public static volatile int field722 = -1;

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "B")
    public byte field717;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public int field706;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "Lee;")
    public static class69 field720;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "Ljava/lang/String;")
    public String field709;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "Ljava/lang/String;")
    public String field714;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "[Lwj;")
    public static class130[] field707;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "[Lpg;")
    public static class187[] field711;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "[Z")
    public static boolean[] field719;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILlc;)V")
    public static final void method369(int arg0, class290 arg1) {
        field712++;
        int var2 = arg1.field4564 - class198.field2819;
        int var3 = arg1.field4522 * 128 + arg1.method1556(3888) * 64;
        int var4 = arg1.field4582 * 128 + arg1.method1556(3888) * 64;
        arg1.field4553 += (var4 - arg1.field4553) / var2;
        arg1.field4523 = 0;
        int var5 = 19 / ((-arg0 - 26) / 61);
        arg1.field4563 += (var3 - arg1.field4563) / var2;
        if (arg1.field4570 == 0) {
            arg1.field4534 = 1024;
        }
        if (arg1.field4570 == 1) {
            arg1.field4534 = 1536;
        }
        if (arg1.field4570 == 2) {
            arg1.field4534 = 0;
        }
        if (arg1.field4570 == 3) {
            arg1.field4534 = 512;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static final long method370(byte arg0, String arg1) {
        field708++;
        long var2 = 0L;
        int var4 = arg1.length();
        int var5 = 0;
        if (arg0 != -8) {
            method374(126);
        }
        while (var5 < var4) {
            char var6 = arg1.charAt(var5);
            var2 *= 37L;
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 - 64);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
            var5++;
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)Lmc;")
    public static final class176 method371(int arg0, int arg1) {
        field713++;
        if (arg1 != 128) {
            field715 = null;
        }
        return class94.field1265 && class33.field387 <= arg0 && arg0 <= class167.field2402 ? class280.field4257[arg0 - class33.field387] : null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)V")
    public static final void method372(byte arg0, int arg1) {
        class15.method91(111);
        class220.method1434((byte) 124);
        field718++;
        int var2 = class169.method1108((byte) 110, arg1).field2825;
        if (var2 == 0) {
            return;
        }
        int var3 = class164.field2358[arg1];
        if (var2 == 9) {
            class196.field2794 = var3;
        }
        if (arg0 != -114) {
            field716 = -50;
        }
        if (var2 == 6) {
            class6.field78 = var3;
        }
        if (var2 == 5) {
            class59.field704 = var3;
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)Lel;")
    public static final class77 method373(int arg0, int arg1) {
        field710++;
        class77 var2 = (class77) class72.field857.method65((byte) -127, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class30.field360.method1861(arg0, 3, 1);
        if (arg1 != 0) {
            field707 = null;
        }
        class77 var4 = new class77();
        if (var3 != null) {
            var4.method473(new class216(var3), 14);
        }
        class72.field857.method64((long) arg0, -1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)V")
    public static void method374(int arg0) {
        field711 = null;
        field720 = null;
        field715 = null;
        field719 = null;
        if (arg0 == 37) {
            field707 = null;
        }
    }
}

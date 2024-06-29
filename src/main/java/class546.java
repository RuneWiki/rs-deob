import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class546 extends class539 implements class109 {

    @OriginalMember(owner = "client!th", name = "x", descriptor = "J")
    public static long field7401 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!th", name = "w", descriptor = "Lfw;")
    public static class52 field7400 = new class52();

    @OriginalMember(owner = "client!th", name = "C", descriptor = "I")
    public static int field7406 = -1;

    @OriginalMember(owner = "client!th", name = "A", descriptor = "C")
    public char field7404;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field7391;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field7392;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    public static int field7393;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    public static int field7394;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "I")
    public int field7396;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "I")
    public static int field7397;

    @OriginalMember(owner = "client!th", name = "u", descriptor = "I")
    public int field7398;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "I")
    public static int field7399;

    @OriginalMember(owner = "client!th", name = "y", descriptor = "I")
    public static int field7402;

    @OriginalMember(owner = "client!th", name = "z", descriptor = "I")
    public static int field7403;

    @OriginalMember(owner = "client!th", name = "B", descriptor = "I")
    public int field7405;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "J")
    public long field7395;

    @OriginalMember(owner = "client!th", name = "D", descriptor = "Lhe;")
    public static class338 field7407;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "Lraa;")
    public static class556 field7390;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)Z")
    public static final boolean method3002(int arg0, int arg1) {
        class384.field5379 = arg0 + 1 & 0xFFFF;
        field7394++;
        class542.field7372 = true;
        if (arg1 != 0) {
            method3003(-85, 47, null, -4);
        }
        return true;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)C")
    public final char method817(byte arg0) {
        if (arg0 == -100) {
            field7402++;
            return this.field7404;
        } else {
            return '\u0004';
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)I")
    public final int method820(int arg0) {
        if (arg0 != -25607) {
            this.method816(71);
        }
        field7391++;
        return this.field7398;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IILkw;I)V")
    public static final void method3003(int arg0, int arg1, class225 arg2, int arg3) {
        field7399++;
        if (arg2.field6398 == arg1 && arg1 != -1) {
            class131 var4 = class301.field4465.method2763(arg1, 31696);
            int var5 = var4.field1801;
            if (var5 == 1) {
                arg2.field6450 = 0;
                arg2.field6393 = 1;
                arg2.field6427 = arg0;
                arg2.field6413 = 0;
                arg2.field6444 = 0;
                class99.method769(false, arg2.field509, arg2.field520, var4, arg2.field514, arg3 - 9646, arg2.field6450);
            }
            if (var5 == 2) {
                arg2.field6444 = 0;
            }
        } else if (arg1 == -1 || arg2.field6398 == -1 || class301.field4465.method2763(arg1, 31696).field1799 >= class301.field4465.method2763(arg2.field6398, 31696).field1799) {
            arg2.field6427 = arg0;
            arg2.field6393 = 1;
            arg2.field6444 = 0;
            arg2.field6450 = 0;
            arg2.field6413 = 0;
            arg2.field6398 = arg1;
            arg2.field6484 = arg2.field6485;
            if (arg2.field6398 != -1) {
                class99.method769(false, arg2.field509, arg2.field520, class301.field4465.method2763(arg2.field6398, arg3 + 22000), arg2.field514, 50, arg2.field6450);
            }
        }
        if (arg3 != 9696) {
            method3002(-53, 6);
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)I")
    public final int method818(byte arg0) {
        field7392++;
        int var2 = 37 % ((arg0 - 36) / 59);
        return this.field7396;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I[Lxa;)V")
    public static final void method3004(int arg0, class461[] arg1) {
        class508.field6966 = arg1.length;
        field7403++;
        class124.field1721 = new int[class508.field6966 - arg0];
        class206.field3038 = new class461[class508.field6966 + 10];
        class282.method1708(arg1, 0, class206.field3038, 0, class508.field6966);
        for (int var2 = 0; var2 < class508.field6966; var2++) {
            class124.field1721[var2] = class206.field3038[var2].method29();
        }
        for (int var3 = class508.field6966; var3 < class206.field3038.length; var3++) {
            class124.field1721[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(B)V")
    public static void method3005(byte arg0) {
        field7400 = null;
        if (arg0 <= -56) {
            field7407 = null;
            field7390 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)I")
    public final int method816(int arg0) {
        if (arg0 != 12377) {
            this.field7395 = -4L;
        }
        field7397++;
        return this.field7405;
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(B)J")
    public final long method819(byte arg0) {
        field7393++;
        int var2 = 118 % ((54 - arg0) / 55);
        return this.field7395;
    }
}

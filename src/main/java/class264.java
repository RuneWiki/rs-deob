import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class264 implements Runnable {

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "Lqk;")
    private class1 field4563 = new class1();

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "Z")
    private boolean field4566 = false;

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "I")
    public int field4572 = 0;

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "Ljava/lang/Thread;")
    private Thread field4573;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field4553 = 0;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public static int field4557 = 0;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "Ltl;")
    private static class59 field4556 = class85.method639("Unable to find ", 9588);

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "[I")
    public static int[] field4569 = new int[5];

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "Ltl;")
    private static class59 field4568 = class85.method639("Please wait )2 attempting to reestablish)3", 9588);

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
    public static int field4555 = 0;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Ltl;")
    public static class59 field4550 = field4568;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "Ltl;")
    public static class59 field4562 = field4556;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "Lme;")
    public static class295 field4554;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "Lme;")
    public static class295 field4570;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "[I")
    public static int[] field4567;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ltg;II)Lbd;", line = 5)
    public final class197 method1825(class154 arg0, int arg1, int arg2) {
        field4551++;
        class197 var4 = new class197();
        var4.field1569 = false;
        var4.field2264 = (long) arg1;
        var4.field3260 = arg2;
        var4.field3248 = arg0;
        this.method1828(var4, arg2 ^ 0x3);
        return var4;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIII)V", line = 20)
    public static final void method1826(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class69.field1061 = arg2;
        class153.field2504 = arg4;
        if (arg0 != 18952) {
            method1831(24);
        }
        field4558++;
        class28.field369 = arg3;
        class62.field957 = arg1;
    }

    @OriginalMember(owner = "client!ja", name = "run", descriptor = "()V", line = 36)
    public final void run() {
        while (!this.field4566) {
            class1 var1 = this.field4563;
            class197 var2;
            synchronized (this.field4563) {
                var2 = (class197) this.field4563.method3(0);
                if (var2 == null) {
                    try {
                        this.field4563.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field4572--;
            }
            try {
                if (var2.field3260 == 2) {
                    var2.field3248.method1102(var2.field3253, -10728, (int) var2.field2264, var2.field3253.length);
                } else if (var2.field3260 == 3) {
                    var2.field3253 = var2.field3248.method1105((int) var2.field2264, 8);
                }
            } catch (Exception var6) {
                class306.method2126((String) null, -13, var6);
            }
            var2.field1577 = false;
        }
        field4561++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([BILtg;B)Lbd;", line = 85)
    public final class197 method1827(byte[] arg0, int arg1, class154 arg2, byte arg3) {
        field4552++;
        class197 var5 = new class197();
        var5.field3260 = 2;
        if (arg3 != 3) {
            return (class197) null;
        }
        var5.field2264 = (long) arg1;
        var5.field1569 = false;
        var5.field3248 = arg2;
        var5.field3253 = arg0;
        this.method1828(var5, arg3 ^ 0x3);
        return var5;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lbd;I)V", line = 107)
    private final void method1828(class197 arg0, int arg1) {
        field4564++;
        class1 var3 = this.field4563;
        synchronized (this.field4563) {
            if (arg1 != 0) {
                this.method1827((byte[]) null, 12, (class154) null, (byte) 103);
            }
            this.field4563.method6(arg0, arg1 - 43);
            this.field4572++;
            this.field4563.notifyAll();
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BLtg;I)Lbd;", line = 124)
    public final class197 method1829(byte arg0, class154 arg1, int arg2) {
        field4565++;
        class197 var4 = new class197();
        var4.field3260 = 1;
        class1 var5 = this.field4563;
        synchronized (this.field4563) {
            if (arg0 != 122) {
                method1833(-10);
            }
            class197 var6 = (class197) this.field4563.method7(-112);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg2) == var6.field2264 && var6.field3248 == arg1 && var6.field3260 == 2) {
                    var4.field3253 = var6.field3253;
                    var4.field1577 = false;
                    return var4;
                }
                var6 = (class197) this.field4563.method1((byte) 101);
            }
        }
        var4.field3253 = arg1.method1105(arg2, arg0 ^ 0x72);
        var4.field1577 = false;
        var4.field1569 = true;
        return var4;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V", line = 162)
    public final void method1830(int arg0) {
        this.field4566 = true;
        class1 var2 = this.field4563;
        synchronized (this.field4563) {
            this.field4563.notifyAll();
        }
        try {
            this.field4573.join();
        } catch (InterruptedException var5) {
        }
        field4560++;
        if (arg0 > -111) {
            method1826(-44, -8, -17, -32, 21);
        }
        this.field4573 = null;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V", line = 181)
    public static void method1831(int arg0) {
        field4569 = null;
        field4570 = null;
        field4568 = null;
        field4554 = null;
        if (arg0 <= -120) {
            field4556 = null;
            field4550 = null;
            field4567 = null;
            field4562 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)V", line = 198)
    public static final void method1832(int arg0, int arg1) {
        class231.field3803--;
        field4571++;
        if (class231.field3803 == arg1) {
            return;
        }
        class63.method519(class93.field1440, arg1 + 1, class93.field1440, arg1, class231.field3803 - arg1);
        if (arg0 >= -32) {
            return;
        }
        class63.method519(class294.field5015, arg1 + 1, class294.field5015, arg1, class231.field3803 - arg1);
        class63.method521(class27.field363, arg1 + 1, class27.field363, arg1, class231.field3803 - arg1);
        class63.method516(class281.field4843, arg1 + 1, class281.field4843, arg1, class231.field3803 - arg1);
        class63.method518(class29.field393, arg1 + 1, class29.field393, arg1, class231.field3803 - arg1);
        class63.method518(class40.field598, arg1 + 1, class40.field598, arg1, class231.field3803 - arg1);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V", line = 229)
    public static final void method1833(int arg0) {
        for (int var1 = 0; var1 < class185.field3107; var1++) {
            int var2 = class232.field3816[var1];
            class23 var3 = class23.field311[var2];
            if (var3 != null) {
                class150.method1083((byte) 122, var3.field314.field1948, var3);
            }
        }
        field4559++;
        if (arg0 < 44) {
            method1832(-51, 31);
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V", line = 292)
    public class264() {
        class257 var1 = class308.field5222.method1290(5, this, 114);
        while (var1.field4256 == 0) {
            class183.method1360(false, 10L);
        }
        if (var1.field4256 == 2) {
            throw new RuntimeException();
        }
        this.field4573 = (Thread) var1.field4255;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class65 implements Runnable {

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "Lbg;")
    private class275 field875 = new class275();

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "Z")
    private boolean field879 = false;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public int field882 = 0;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "Ljava/lang/Thread;")
    private Thread field887;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "Luv;")
    public static class2 field880 = new class2(104, -1);

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field884 = -1;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public static int field885 = 0;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "Ljava/lang/String;")
    public static String field886 = null;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "J")
    public static long field883 = -1L;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V", line = 8)
    public static void method454(byte arg0) {
        int var1 = -113 % ((55 - arg0) / 46);
        field880 = null;
        field886 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILnp;)V", line = 18)
    private final void method455(int arg0, class86 arg1) {
        field874++;
        class275 var3 = this.field875;
        synchronized (this.field875) {
            if (arg0 < 4) {
                field886 = null;
            }
            this.field875.method1708((byte) -8, arg1);
            this.field882++;
            this.field875.notifyAll();
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILur;B)Lnp;", line = 33)
    public final class86 method456(int arg0, class292 arg1, byte arg2) {
        field870++;
        class86 var4 = new class86();
        var4.field1349 = arg1;
        var4.field7419 = false;
        if (arg2 >= -14) {
            method454((byte) -128);
        }
        var4.field6102 = arg0;
        var4.field1351 = 3;
        this.method455(117, var4);
        return var4;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lur;[BIB)Lnp;", line = 51)
    public final class86 method457(class292 arg0, byte[] arg1, int arg2, byte arg3) {
        field877++;
        int var5 = 84 / ((11 - arg3) / 46);
        class86 var6 = new class86();
        var6.field1351 = 2;
        var6.field6102 = arg2;
        var6.field1352 = arg1;
        var6.field1349 = arg0;
        var6.field7419 = false;
        this.method455(113, var6);
        return var6;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILla;ILya;IZ)V", line = 69)
    public static final void method458(int arg0, int arg1, class307 arg2, int arg3, class11 arg4, int arg5, boolean arg6) {
        field876++;
        if (arg6) {
            class525.field7771.method936((class155.field2347 - class525.field7771.method468()) / 2, (class413.field6241 - class525.field7771.method467()) / 2);
            class482.field7121.method936((class155.field2347 - class482.field7121.method468()) / 2, 18);
        }
        String var7 = "";
        if (class488.field7276 == class251.field3433) {
            var7 = class426.field6350.method2103(class30.field430, (byte) 34);
        } else if (class251.field3433 == class214.field3057) {
            var7 = class324.field5059.method2103(class30.field430, (byte) 34);
        }
        arg2.method1922(23063, -1, arg1, var7, class155.field2347 / 2, class413.field6241 / 2 - 26);
        int var8 = class413.field6241 / 2 - 18;
        arg4.method69(class155.field2347 / arg3 - 152, var8, 304, 34, arg5, 0);
        arg4.method69(class155.field2347 / 2 - 151, var8 + 1, 302, 32, 0, 0);
        arg4.method162(class155.field2347 / 2 - 150, var8 + 2, class448.field6608 * 3, 30, arg0, 0);
        arg4.method162(class155.field2347 / 2 + class448.field6608 * 3 - 150, var8 + 2, 300 - (class448.field6608 * 3), 30, 0, 0);
        arg2.method1922(23063, -1, arg1, class192.field2829, class155.field2347 / 2, class413.field6241 / 2 + 4);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lur;BI)Lnp;", line = 102)
    public final class86 method459(class292 arg0, byte arg1, int arg2) {
        if (arg1 > -119) {
            return null;
        }
        field873++;
        class86 var4 = new class86();
        var4.field1351 = 1;
        class275 var5 = this.field875;
        synchronized (this.field875) {
            class86 var6 = (class86) this.field875.method1713(105);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg2) == var6.field6102 && var6.field1349 == arg0 && var6.field1351 == 2) {
                    var4.field1352 = var6.field1352;
                    var4.field7421 = false;
                    return var4;
                }
                var6 = (class86) this.field875.method1711(61);
            }
        }
        var4.field1352 = arg0.method1811(-424700720, arg2);
        var4.field7421 = false;
        var4.field7419 = true;
        return var4;
    }

    @OriginalMember(owner = "client!cd", name = "run", descriptor = "()V", line = 138)
    public final void run() {
        field871++;
        while (!this.field879) {
            class275 var1 = this.field875;
            class86 var2;
            synchronized (this.field875) {
                var2 = (class86) this.field875.method1718((byte) -128);
                if (var2 == null) {
                    try {
                        this.field875.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field882--;
            }
            try {
                if (var2.field1351 == 2) {
                    var2.field1349.method1809(var2.field1352, var2.field1352.length, 0, (int) var2.field6102);
                } else if (var2.field1351 == 3) {
                    var2.field1352 = var2.field1349.method1811(-424700720, (int) var2.field6102);
                }
            } catch (Exception var6) {
                class488.method2913(0, var6, null);
            }
            var2.field7421 = false;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 183)
    public final void method460(int arg0) {
        if (arg0 != 0) {
            this.method456(72, null, (byte) -39);
        }
        field878++;
        this.field879 = true;
        class275 var2 = this.field875;
        synchronized (this.field875) {
            this.field875.notifyAll();
        }
        try {
            this.field887.join();
        } catch (InterruptedException var3) {
        }
        this.field887 = null;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lec;)V", line = 251)
    public class65(class109 arg0) {
        class533 var2 = arg0.method828(this, 61, 5);
        while (var2.field7848 == 0) {
            class389.method2332(98, 10L);
        }
        if (var2.field7848 == 2) {
            throw new RuntimeException();
        }
        this.field887 = (Thread) var2.field7849;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V", line = 213)
    public static final void method461(byte arg0) {
        field881++;
        if (arg0 == 88) {
            class48.method366();
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class116 implements Runnable {

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "Ltj;")
    private class10 field1939 = new class10();

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "Z")
    private boolean field1943 = false;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public int field1958 = 0;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field1952;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "Z")
    public static boolean field1945 = false;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "Lmj;")
    public static class144 field1948 = new class144(16);

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "[I")
    public static int[] field1959 = new int[50];

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "Lsb;")
    public static class124 field1950;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "Lph;")
    public static class203 field1956;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "Z")
    public static boolean field1949;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "Z")
    public static boolean field1955;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "[I")
    public static int[] field1957;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLek;I)Loi;")
    public final class96 method855(byte arg0, class239 arg1, int arg2) {
        class96 var4 = new class96();
        field1941++;
        var4.field1500 = 1;
        class10 var5 = this.field1939;
        synchronized (this.field1939) {
            class96 var6 = (class96) this.field1939.method62(0);
            while (true) {
                if (var6 == null) {
                    if (arg0 >= -2) {
                        field1945 = false;
                    }
                    break;
                }
                if (((long) arg2) == var6.field1727 && var6.field1492 == arg1 && var6.field1500 == 2) {
                    var4.field3756 = false;
                    var4.field1490 = var6.field1490;
                    return var4;
                }
                var6 = (class96) this.field1939.method66((byte) 114);
            }
        }
        var4.field1490 = arg1.method1581(-4229, arg2);
        var4.field3756 = false;
        var4.field3753 = true;
        return var4;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(CI)Z")
    public static final boolean method856(char arg0, int arg1) {
        if (arg1 != -7586) {
            method858(33);
        }
        field1954++;
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public static final void method857(int arg0) {
        if (arg0 > -108) {
            field1940 = 121;
        }
        class229.method1525(false, 301);
        System.gc();
        field1946++;
        class274.method1856(25, 5);
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
    public static void method858(int arg0) {
        int var1 = 51 / ((-arg0 - 52) / 37);
        field1950 = null;
        field1956 = null;
        field1959 = null;
        field1948 = null;
        field1957 = null;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
    public final void method859(int arg0) {
        this.field1943 = true;
        field1944++;
        class10 var2 = this.field1939;
        synchronized (this.field1939) {
            this.field1939.notifyAll();
        }
        try {
            this.field1952.join();
        } catch (InterruptedException var3) {
        }
        if (arg0 != 12363) {
            field1949 = true;
        }
        this.field1952 = null;
    }

    @OriginalMember(owner = "client!ra", name = "run", descriptor = "()V")
    public final void run() {
        field1953++;
        while (!this.field1943) {
            class10 var1 = this.field1939;
            class96 var2;
            synchronized (this.field1939) {
                var2 = (class96) this.field1939.method67(10136);
                if (var2 == null) {
                    try {
                        this.field1939.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field1958--;
            }
            try {
                if (var2.field1500 == 2) {
                    var2.field1492.method1577(false, var2.field1490.length, (int) var2.field1727, var2.field1490);
                } else if (var2.field1500 == 3) {
                    var2.field1490 = var2.field1492.method1581(-4229, (int) var2.field1727);
                }
            } catch (Exception var6) {
                class161.method1167(var6, -121, (String) null);
            }
            var2.field3756 = false;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILek;)Loi;")
    public final class96 method860(int arg0, int arg1, class239 arg2) {
        class96 var4 = new class96();
        var4.field1727 = (long) arg0;
        var4.field3753 = false;
        field1942++;
        var4.field1492 = arg2;
        var4.field1500 = arg1;
        this.method861((byte) 124, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLoi;)V")
    private final void method861(byte arg0, class96 arg1) {
        class10 var3 = this.field1939;
        synchronized (this.field1939) {
            this.field1939.method70(3, arg1);
            this.field1958++;
            if (arg0 <= 86) {
                this.method860(-42, -90, (class239) null);
            }
            this.field1939.notifyAll();
        }
        field1947++;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lek;II[B)Loi;")
    public final class96 method862(class239 arg0, int arg1, int arg2, byte[] arg3) {
        field1951++;
        class96 var5 = new class96();
        var5.field1727 = (long) arg1;
        if (arg2 >= -78) {
            field1955 = true;
        }
        var5.field1500 = 2;
        var5.field1490 = arg3;
        var5.field1492 = arg0;
        var5.field3753 = false;
        this.method861((byte) 98, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class116() {
        class115 var1 = class205.field3294.method628(5, this, (byte) 82);
        while (var1.field1937 == 0) {
            class234.method1550(-28773, 10L);
        }
        if (var1.field1937 == 2) {
            throw new RuntimeException();
        }
        this.field1952 = (Thread) var1.field1936;
    }
}

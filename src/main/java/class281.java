import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class281 {

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public int field4241 = 8;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public int field4245 = 16777215;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "Ls;")
    public static class186 field4237 = new class186(110, -2);

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "[Lei;")
    public static class119[] field4251 = new class119[14];

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "Z")
    public static boolean field4250 = false;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public int field4234;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public int field4236;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public int field4238;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public int field4242;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public int field4244;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "Log;")
    public static class462 field4249;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "Ljava/lang/Object;")
    public static Object field4247;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "Z")
    public boolean field4240;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "[[I")
    public static int[][] field4248;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "([SI)[S", line = 9)
    public static final short[] method1758(short[] arg0, int arg1) {
        field4232++;
        if (arg0 == null) {
            return null;
        }
        short[] var2 = new short[arg0.length];
        class394.method2450(arg0, 0, var2, 0, arg0.length);
        if (arg1 <= 75) {
            method1764(-90);
        }
        return var2;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)Z", line = 28)
    public static final boolean method1759(int arg0, int arg1, int arg2) {
        field4235++;
        if (arg1 >= -24) {
            field4249 = null;
        }
        return (arg2 & 0x800) != 0 | class31.method217(arg0, arg2, -20008) || class181.method1237(arg2, 0, arg0);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lnn;I)V", line = 40)
    public final void method1760(class289 arg0, int arg1) {
        field4239++;
        if (arg1 >= -110) {
            this.field4245 = 49;
        }
        while (true) {
            int var3 = arg0.method1858(-3256);
            if (var3 == 0) {
                return;
            }
            this.method1762(arg0, var3, (byte) -115);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V", line = 61)
    public static final void method1761(int arg0) {
        class399 var1 = class262.field4002;
        synchronized (class262.field4002) {
            if (arg0 > -43) {
                return;
            }
            class262.field4002.method2475((byte) 67);
        }
        field4233++;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lnn;IB)V", line = 76)
    private final void method1762(class289 arg0, int arg1, byte arg2) {
        field4246++;
        if (arg1 == 1) {
            this.field4241 = arg0.method1841((byte) 81);
        } else if (arg1 == 2) {
            this.field4240 = true;
        } else if (arg1 == 3) {
            this.field4234 = arg0.method1848((byte) 113);
            this.field4236 = arg0.method1848((byte) 124);
            this.field4238 = arg0.method1848((byte) 112);
        } else if (arg1 == 4) {
            this.field4244 = arg0.method1858(-3256);
        } else if (arg1 == 5) {
            this.field4242 = arg0.method1841((byte) -12);
        } else if (arg1 == 6) {
            this.field4245 = arg0.method1863(117);
        }
        if (arg2 > -59) {
            this.field4236 = 59;
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)I", line = 127)
    public static final int method1763(int arg0) {
        field4243++;
        if (arg0 <= 88) {
            field4250 = false;
        }
        return 6;
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V", line = 138)
    public static void method1764(int arg0) {
        field4247 = null;
        field4251 = null;
        field4248 = null;
        field4249 = null;
        field4237 = null;
        if (arg0 < 119) {
            field4249 = null;
        }
    }
}

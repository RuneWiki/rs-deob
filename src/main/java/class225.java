import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class225 implements Runnable {

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "Lwh;")
    private class9 field3723 = new class9();

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "Z")
    private boolean field3730 = false;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
    public int field3728 = 0;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "Ljava/lang/Thread;")
    private Thread field3729;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "Lqd;")
    public static class40 field3713 = class147.method1106("T", (byte) -76);

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "Lqd;")
    public static class40 field3714 = class147.method1106(")1 ", (byte) -45);

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "[I")
    public static int[] field3720 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "Z")
    public static boolean field3712 = false;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "Z")
    public static boolean field3727 = false;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    public static int field3722 = 0;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "[J")
    public static long[] field3719 = new long[32];

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "Lqd;")
    public static class40 field3735 = class147.method1106("(U0a )2 via: ", (byte) -63);

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "[I")
    public static int[] field3726 = new int[32];

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "[[[B")
    public static byte[][][] field3734;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILfk;I[B)Lwl;", line = 4)
    public final class83 method1575(int arg0, class41 arg1, int arg2, byte[] arg3) {
        field3718++;
        class83 var5 = new class83();
        var5.field1447 = arg3;
        var5.field2112 = (long) arg0;
        var5.field1441 = arg1;
        if (arg2 != 9835) {
            field3714 = (class40) null;
        }
        var5.field1445 = 2;
        var5.field4523 = false;
        this.method1583(var5, (byte) 114);
        return var5;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)V", line = 36)
    public static final void method1576(int arg0, int arg1) {
        field3731++;
        class177 var2 = class177.method1310(arg0 + 48, arg0, arg1);
        var2.method1303((byte) 87);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IILfk;)Lwl;", line = 54)
    public final class83 method1577(int arg0, int arg1, class41 arg2) {
        field3717++;
        class83 var4 = new class83();
        var4.field4523 = false;
        var4.field1441 = arg2;
        var4.field1445 = arg1;
        var4.field2112 = (long) arg0;
        this.method1583(var4, (byte) 116);
        return var4;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)Z", line = 69)
    public static final boolean method1578(int arg0, int arg1) {
        field3721++;
        if (arg0 != 324710711) {
            field3722 = -29;
        }
        return (arg1 & 0x135AB137) >> 28 != 0;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)V", line = 83)
    public static void method1579(boolean arg0) {
        field3713 = null;
        field3726 = null;
        if (!arg0) {
            return;
        }
        field3714 = null;
        field3734 = (byte[][][]) null;
        field3735 = null;
        field3719 = null;
        field3720 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V", line = 111)
    public final void method1580(byte arg0) {
        int var2 = 64 / ((66 - arg0) / 43);
        field3732++;
        this.field3730 = true;
        class9 var3 = this.field3723;
        synchronized (this.field3723) {
            this.field3723.notifyAll();
        }
        try {
            this.field3729.join();
        } catch (InterruptedException var6) {
        }
        this.field3729 = null;
    }

    @OriginalMember(owner = "client!kk", name = "run", descriptor = "()V", line = 142)
    public final void run() {
        field3724++;
        while (!this.field3730) {
            class9 var1 = this.field3723;
            class83 var2;
            synchronized (this.field3723) {
                var2 = (class83) this.field3723.method48(1);
                if (var2 == null) {
                    try {
                        this.field3723.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field3728--;
            }
            try {
                if (var2.field1445 == 2) {
                    var2.field1441.method379(var2.field1447.length, var2.field1447, true, (int) var2.field2112);
                } else if (var2.field1445 == 3) {
                    var2.field1447 = var2.field1441.method382((int) var2.field2112, -1);
                }
            } catch (Exception var6) {
                class44.method412(var6, -14997, (String) null);
            }
            var2.field4515 = false;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILfk;I)Lwl;", line = 185)
    public final class83 method1581(int arg0, class41 arg1, int arg2) {
        field3715++;
        class83 var4 = new class83();
        var4.field1445 = 1;
        class9 var5 = this.field3723;
        synchronized (this.field3723) {
            if (arg2 != -2943) {
                return (class83) null;
            }
            class83 var6 = (class83) this.field3723.method49((byte) 122);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if (((long) arg0) == var6.field2112 && var6.field1441 == arg1 && var6.field1445 == 2) {
                    var4.field4515 = false;
                    var4.field1447 = var6.field1447;
                    return var4;
                }
                var6 = (class83) this.field3723.method54(0);
            }
        }
        var4.field1447 = arg1.method382(arg0, -1);
        var4.field4523 = true;
        var4.field4515 = false;
        return var4;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIIIIIII)V", line = 221)
    public static final void method1582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 2) {
            return;
        }
        class65 var10 = null;
        field3733++;
        for (class65 var11 = (class65) class121.field2086.method1971(arg3 + 98); var11 != null; var11 = (class65) class121.field2086.method1967(100)) {
            if (var11.field1224 == arg0 && var11.field1205 == arg1 && var11.field1228 == arg4 && var11.field1219 == arg7) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class65();
            var10.field1224 = arg0;
            var10.field1228 = arg4;
            var10.field1205 = arg1;
            var10.field1219 = arg7;
            class20.method129(var10, true);
            class121.field2086.method1972(var10, -99);
        }
        var10.field1210 = arg2;
        var10.field1208 = arg8;
        var10.field1227 = arg5;
        var10.field1215 = arg9;
        var10.field1207 = arg6;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V", line = 312)
    public class225() {
        class70 var1 = class275.field4573.method800(-53, this, 5);
        while (var1.field1258 == 0) {
            class160.method1227(10L, false);
        }
        if (var1.field1258 == 2) {
            throw new RuntimeException();
        }
        this.field3729 = (Thread) var1.field1260;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lwl;B)V", line = 283)
    private final void method1583(class83 arg0, byte arg1) {
        class9 var3 = this.field3723;
        synchronized (this.field3723) {
            this.field3723.method55(arg0, 112);
            this.field3728++;
            this.field3723.notifyAll();
        }
        field3716++;
        if (arg1 < 111) {
            method1584((byte) -55, 76, (class239) null, 24);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BILce;I)[Lcm;", line = 338)
    public static final class185[] method1584(byte arg0, int arg1, class239 arg2, int arg3) {
        if (arg0 != -46) {
            field3735 = (class40) null;
        }
        field3725++;
        return class272.method1881(arg2, arg3, arg1, arg0 ^ 0xFFFFFC73) ? class27.method265(0) : null;
    }
}

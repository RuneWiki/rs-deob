import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public abstract class class450 {

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "Lbf;")
    public static class158 field6285 = new class158(100);

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "I")
    public static int field6291 = 0;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
    public static int field6288;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "Lgd;")
    public static class172 field6292;

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "Z")
    public static boolean field6293;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IB)Lkd;", line = 13)
    public static final class354 method2783(int arg0, byte arg1) {
        field6286++;
        class354 var2 = (class354) class288.field3791.method648(1, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class14.field175.method1794(5860, 11, arg0);
        class354 var4 = new class354();
        if (var3 != null) {
            var4.method2247(0, new class242(var3));
        }
        class288.field3791.method643((long) arg0, var4, (byte) 122);
        int var5 = -101 % ((13 - arg1) / 55);
        return var4;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)V", line = 36)
    public static void method2784(byte arg0) {
        field6292 = null;
        field6285 = null;
        if (arg0 > -18) {
            method2787((class453) null, 29, (class118) null);
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIBII)Lvp;", line = 51)
    public static final class76 method2785(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field6288++;
        class193[] var5 = null;
        if (arg2 != 15) {
            field6292 = null;
        }
        class389 var6 = class223.method1359(true, arg3);
        if (var6.field5306 != null) {
            var5 = new class193[var6.field5306.length];
            for (int var7 = 0; var7 < var5.length; var7++) {
                class299 var8 = class104.method622((byte) 104, var6.field5306[var7]);
                var5[var7] = new class193(var8.field3993, var8.field3992, var8.field3999, var8.field3986, var8.field3997, var8.field3994, var8.field3989, var8.field3987);
            }
        }
        return new class76(var6.field5307, var5, var6.field5308, arg4, arg1, arg0);
    }

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "(I)I", line = 93)
    public static final int method2786(int arg0) {
        field6289++;
        if (arg0 >= -70) {
            field6292 = null;
        }
        if (class229.field2937) {
            return 0;
        } else if (class98.method602(65280)) {
            return class147.field1727 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Laq;ILuo;)V", line = 110)
    public static final void method2787(class453 arg0, int arg1, class118 arg2) {
        field6284++;
        if (arg1 > 116) {
            boolean var3 = class126.method816(arg0.field6358, 8, arg0.field6443, arg2, arg0.field6359, arg0.field6376 ? class143.field1684.field1466 : null, arg0.field6473 | 0xFF000000, arg0.field6453) == null;
            if (var3) {
                class333.field4544.method1696(false, new class101(arg0.field6358, arg0.field6453, arg0.field6359, arg0.field6473 | 0xFF000000, arg0.field6443, arg0.field6376));
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V")
    public abstract void method937(int arg0);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIIII)V")
    public abstract void method928(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V")
    public abstract void method932(int arg0);

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(I)V")
    public abstract void method934(int arg0);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lwr;)V")
    public abstract void method923(class450 arg0);

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "(I)V")
    public abstract void method930(int arg0);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(III)V")
    public abstract void method929(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(III)V")
    public abstract void method933(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "()V")
    public abstract void method931();

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(III[I)V")
    public abstract void method924(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "([I)V")
    public abstract void method926(int[] arg0);

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "(I)V")
    public abstract void method938(int arg0);
}

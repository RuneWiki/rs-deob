import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class152 {

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "Leea;")
    private class132 field2293;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "J")
    public long field2291;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field2285 = 0;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "Lqaa;")
    public static class27 field2287 = new class27(1, 8);

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field2290 = 0;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "Lnt;")
    public static class220 field2292 = new class220();

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lgs;III)V")
    public static final void method1166(class43 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class613.field8871) {
            class416 var4 = class390.field5454[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field5846 != null && var4.field5846.method402((byte) 66)) {
                arg0.method405((byte) -81, class546.field7701, class497.field7089, var4.field5846, true, 0, 0);
            }
        }
        if (arg3 < class613.field8871) {
            class416 var5 = class390.field5454[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field5846 != null && var5.field5846.method402((byte) 62)) {
                arg0.method405((byte) -59, 0, class497.field7089, var5.field5846, true, 0, class546.field7701);
            }
        }
        if (arg2 < class613.field8871 && arg3 < class453.field6328) {
            class416 var6 = class390.field5454[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field5846 != null && var6.field5846.method402((byte) 66)) {
                arg0.method405((byte) -78, class546.field7701, class497.field7089, var6.field5846, true, 0, class546.field7701);
            }
        }
        if (arg2 < class613.field8871 && arg3 > 0) {
            class416 var7 = class390.field5454[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field5846 != null && var7.field5846.method402((byte) 126)) {
                arg0.method405((byte) -35, class546.field7701, class497.field7089, var7.field5846, true, 0, -class546.field7701);
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1167(int arg0, int arg1, byte arg2) {
        field2286++;
        if (arg2 != 84) {
            method1169(true);
        }
        return (arg1 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)V")
    public static final void method1168(int arg0, int arg1, int arg2, int arg3) {
        field2288++;
        int var4 = arg2 + class115.field1845;
        int var5 = arg3 + class64.field1160;
        if (class390.field5454 == null || arg2 < 0 || arg3 < 0 || arg2 >= class174.field2540 || arg3 >= class716.field9999 || class471.field6781.field6704.method2015(27669) == 0 && class468.field6748.field649 != arg0) {
            return;
        }
        long var6 = (long) (var5 << 14 | arg0 << 28 | var4);
        class694 var8 = (class694) class136.field2123.method4203(true, var6);
        if (var8 == null) {
            class416.method2538(arg0, arg2, arg3);
            return;
        }
        class332 var9 = (class332) var8.field9759.method1522(true);
        if (var9 == null) {
            class416.method2538(arg0, arg2, arg3);
            return;
        }
        class218 var10 = (class218) class416.method2538(arg0, arg2, arg3);
        if (var10 == null) {
            var10 = new class218(arg2 << 9, class138.field2153[arg0].method1825(arg3, -128, arg2), arg3 << 9, arg0, arg0);
        } else {
            var10.field3098 = var10.field3115 = -1;
        }
        var10.field3108 = var9.field4685;
        var10.field3106 = var9.field4683;
        label57: while (true) {
            class332 var11 = (class332) var8.field9759.method1527((byte) 71);
            if (var11 == null) {
                break;
            }
            if (var10.field3108 != var11.field4685) {
                var10.field3098 = var11.field4685;
                var10.field3101 = var11.field4683;
                while (true) {
                    class332 var12 = (class332) var8.field9759.method1527((byte) 66);
                    if (var12 == null) {
                        break label57;
                    }
                    if (var10.field3108 != var12.field4685 && var10.field3098 != var12.field4685) {
                        var10.field3115 = var12.field4685;
                        var10.field3122 = var12.field4683;
                    }
                }
            }
        }
        int var13 = class534.method3136(1, arg0, (arg2 << 9) + 256, (arg3 << 9) + arg1);
        var10.field648 = arg3 << 9;
        var10.field659 = (byte) arg0;
        var10.field644 = arg2 << 9;
        var10.field649 = (byte) arg0;
        var10.field3104 = 0;
        var10.field651 = var13;
        if (class634.method3647(arg1 - 318, arg3, arg2)) {
            var10.field659++;
        }
        class118.method954(arg0, arg2, arg3, var13, var10);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
    public static void method1169(boolean arg0) {
        field2287 = null;
        if (!arg0) {
            field2292 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field2293.method1005(false, this.field2291);
        field2289++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Leea;JI)V")
    public class152(class132 arg0, long arg1, int arg2) {
        this.field2293 = arg0;
        this.field2291 = arg1;
    }
}

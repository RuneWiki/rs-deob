import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class132 {

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "Lij;")
    public class194 field2291 = new class194();

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Lqk;")
    public static class207 field2282 = class24.method212(255, "showVideoAd");

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Lqk;")
    public static class207 field2281 = class24.method212(255, "titlebg");

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "Lqk;")
    public static class207 field2275 = class24.method212(255, "Wordpack geladen)3");

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "Lqk;")
    public static class207 field2287 = class24.method212(255, ")3runescape)3com)4l=");

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field2293 = 0;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "Lij;")
    private class194 field2292;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)I")
    public static final int method921(int arg0) {
        field2288++;
        class105.field1855 = arg0;
        return class59.method434(true);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)Lij;")
    public final class194 method922(byte arg0) {
        field2277++;
        class194 var2 = this.field2291.field3410;
        if (this.field2291 == var2) {
            this.field2292 = null;
            return null;
        } else if (arg0 <= 27) {
            return null;
        } else {
            this.field2292 = var2.field3410;
            return var2;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIILwd;)V")
    public static final void method923(int arg0, int arg1, int arg2, int arg3, class22 arg4) {
        field2283++;
        if (arg1 > -79) {
            return;
        }
        for (class79 var5 = (class79) class78.field1415.method922((byte) 35); var5 != null; var5 = (class79) class78.field1415.method928(-94)) {
            if (var5.field1456 == arg3 && (arg2 * 128) == var5.field1445 && arg0 * 128 == var5.field1450 && var5.field1457.field375 == arg4.field375) {
                if (var5.field1438 != null) {
                    class65.field1177.method661(var5.field1438);
                    var5.field1438 = null;
                }
                if (var5.field1434 != null) {
                    class65.field1177.method661(var5.field1434);
                    var5.field1434 = null;
                }
                var5.method1346((byte) -16);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
    public final void method924(int arg0) {
        while (true) {
            class194 var2 = this.field2291.field3410;
            if (this.field2291 == var2) {
                this.field2292 = null;
                field2278++;
                if (arg0 != -30865) {
                    field2279 = -97;
                    return;
                }
                return;
            }
            var2.method1346((byte) -16);
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)Lij;")
    public final class194 method925(int arg0) {
        class194 var2 = this.field2292;
        field2276++;
        if (this.field2291 == var2) {
            this.field2292 = null;
            return null;
        }
        this.field2292 = var2.field3408;
        if (arg0 < 23) {
            this.method930(121);
        }
        return var2;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method926(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class124.field2158 <= arg1 && class88.field1599 >= arg7 && class204.field3580 <= arg5 && class204.field3602 >= arg3) {
            class267.method1830(arg0, arg7, arg5, arg3, arg2, arg6, arg4 + 13794, arg1);
        } else {
            class1.method2(arg6, arg5, arg1, arg0, arg2, arg4 + 13787, arg3, arg7);
        }
        if (arg4 != -13794) {
            field2293 = -8;
        }
        field2286++;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)Lij;")
    public final class194 method927(boolean arg0) {
        if (arg0) {
            return null;
        }
        field2289++;
        class194 var2 = this.field2291.field3410;
        if (this.field2291 == var2) {
            return null;
        } else {
            var2.method1346((byte) -16);
            return var2;
        }
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)Lij;")
    public final class194 method928(int arg0) {
        field2284++;
        class194 var2 = this.field2292;
        if (this.field2291 == var2) {
            this.field2292 = null;
            return null;
        } else {
            int var3 = -42 / ((arg0 - 13) / 61);
            this.field2292 = var2.field3410;
            return var2;
        }
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)V")
    public static void method929(int arg0) {
        field2287 = null;
        field2275 = null;
        field2281 = null;
        field2282 = null;
        if (arg0 < 47) {
            method921(20);
        }
    }

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "(I)Lij;")
    public final class194 method930(int arg0) {
        if (arg0 != 128) {
            field2275 = null;
        }
        field2294++;
        class194 var2 = this.field2291.field3408;
        if (this.field2291 == var2) {
            this.field2292 = null;
            return null;
        } else {
            this.field2292 = var2.field3408;
            return var2;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lij;I)V")
    public final void method931(class194 arg0, int arg1) {
        if (arg1 < 111) {
            this.field2292 = null;
        }
        field2285++;
        if (arg0.field3408 != null) {
            arg0.method1346((byte) -16);
        }
        arg0.field3408 = this.field2291.field3408;
        arg0.field3410 = this.field2291;
        arg0.field3408.field3410 = arg0;
        arg0.field3410.field3408 = arg0;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lij;Z)V")
    public final void method932(class194 arg0, boolean arg1) {
        if (arg0.field3408 != null) {
            arg0.method1346((byte) -16);
        }
        arg0.field3410 = this.field2291.field3410;
        if (arg1) {
            field2280++;
            arg0.field3408 = this.field2291;
            arg0.field3408.field3410 = arg0;
            arg0.field3410.field3408 = arg0;
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
    public class132() {
        this.field2291.field3410 = this.field2291;
        this.field2291.field3408 = this.field2291;
    }
}

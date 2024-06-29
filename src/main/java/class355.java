import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class355 {

    @OriginalMember(owner = "client!od", name = "e", descriptor = "Lwi;")
    private class330 field5489 = new class330(16);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "Luu;")
    private class191 field5485;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "Lni;")
    public static class367 field5490 = new class367(29, 7);

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static int field5494;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "Ltr;")
    public static class195 field5495;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "Lwt;")
    public static class206 field5491;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "Laa;")
    public static class341 field5488;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZI)Led;")
    public final class506 method2279(boolean arg0, int arg1) {
        field5492++;
        class330 var3 = this.field5489;
        class506 var4;
        synchronized (this.field5489) {
            var4 = (class506) this.field5489.method2133((long) arg1, (byte) 81);
        }
        if (var4 != null) {
            return var4;
        }
        class191 var5 = this.field5485;
        byte[] var6;
        synchronized (this.field5485) {
            var6 = this.field5485.method1281(30, arg1, 90);
        }
        class506 var7 = new class506();
        if (var6 != null) {
            var7.method3032(-1, new class164(var6));
        }
        class330 var8 = this.field5489;
        synchronized (this.field5489) {
            this.field5489.method2131(var7, (long) arg1, false);
        }
        if (!arg0) {
            field5493 = 42;
        }
        return var7;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static void method2280(int arg0) {
        field5495 = null;
        field5491 = null;
        if (arg0 >= 111) {
            field5488 = null;
            field5490 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method2281(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class162.field2116[arg0][var8][var14] == -class121.field1654) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class10.field179) + 1;
            int var10 = (arg3 << class10.field179) + 2;
            int var11 = class306.field4447[arg0].method222(arg1, arg3) + arg5;
            if (!class127.method869(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class10.field179) - 1;
            if (!class127.method869(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class10.field179) - 1;
            if (!class127.method869(var9, var11, var13)) {
                return false;
            } else if (class127.method869(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class286.method1840(arg0, arg1, arg3)) {
            int var6 = arg1 << class10.field179;
            int var7 = arg3 << class10.field179;
            return class127.method869(var6 + 1, class306.field4447[arg0].method222(arg1, arg3) + arg5, var7 + 1) && class127.method869(class264.field3697 + var6 - 1, class306.field4447[arg0].method222(arg1 + 1, arg3) + arg5, var7 + 1) && class127.method869(class264.field3697 + var6 - 1, class306.field4447[arg0].method222(arg1 + 1, arg3 + 1) + arg5, class264.field3697 + var7 - 1) && class127.method869(var6 + 1, class306.field4447[arg0].method222(arg1, arg3 + 1) + arg5, class264.field3697 + var7 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BLav;Lqa;)I")
    public static final int method2282(byte arg0, class459 arg1, class165 arg2) {
        if (arg0 >= -24) {
            method2284(-61, 45, 100, 40, null, -70, true);
        }
        field5496++;
        if (arg1.field6878 != -1) {
            return arg1.field6878;
        }
        if (arg1.field6871 != -1) {
            class107 var3 = arg2.field2235.method157((byte) 114, arg2.method755() ? arg1.field6871 : arg1.field6869);
            if (!var3.field1515) {
                return var3.field1499;
            }
        }
        return arg1.field6864;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(ZI)V")
    public final void method2283(boolean arg0, int arg1) {
        class330 var3 = this.field5489;
        synchronized (this.field5489) {
            if (!arg0) {
                return;
            }
            this.field5489.method2140(-109, arg1);
        }
        field5497++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIILuu;IZ)V")
    public static final void method2284(int arg0, int arg1, int arg2, int arg3, class191 arg4, int arg5, boolean arg6) {
        class433.field6577 = arg6;
        class474.field7042 = arg1;
        class372.field5667 = arg3;
        field5486++;
        class342.field5271 = arg2;
        class162.field2114 = arg0;
        class445.field6686 = arg4;
        class406.field6164 = arg5;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
    public final void method2285(byte arg0) {
        int var2 = -56 % ((arg0 + 47) / 56);
        class330 var3 = this.field5489;
        synchronized (this.field5489) {
            this.field5489.method2135(0);
        }
        field5494++;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
    public final void method2286(int arg0) {
        field5487++;
        class330 var2 = this.field5489;
        synchronized (this.field5489) {
            if (arg0 != 1) {
                field5488 = null;
            }
            this.field5489.method2127((byte) -14);
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Liv;ILuu;)V")
    public class355(class65 arg0, int arg1, class191 arg2) {
        this.field5485 = arg2;
        this.field5485.method1290(false, 30);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class179 {

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "Llm;")
    public class49 field2266 = new class49();

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field2258 = 0;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "Lv;")
    public static class165 field2264 = new class165();

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field2270 = 0;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "F")
    public static float field2267;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "Llm;")
    private class49 field2273;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static void method1135(int arg0) {
        if (arg0 == -1690834428) {
            field2264 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIZ[BLpq;II)Liq;")
    public static final class227 method1136(int arg0, int arg1, int arg2, boolean arg3, byte[] arg4, class194 arg5, int arg6, int arg7) {
        field2260++;
        if (arg7 != -25900) {
            field2264 = null;
        }
        if (!arg5.field2735 && (!class65.method506(arg2, 30440) || !class65.method506(arg6, arg7 + 56340))) {
            return arg5.field2736 ? new class227(arg5, 34037, arg0, arg2, arg6, arg3, arg4, arg1) : new class227(arg5, arg0, arg2, arg6, method1142(arg2, 70), method1142(arg6, -84), arg4, arg1);
        } else {
            return new class227(arg5, 3553, arg0, arg2, arg6, arg3, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)Llm;")
    public final class49 method1137(byte arg0) {
        field2272++;
        if (arg0 <= 14) {
            return null;
        }
        class49 var2 = this.field2266.field591;
        if (this.field2266 == var2) {
            return null;
        } else {
            var2.method416(9867);
            return var2;
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)Llm;")
    public final class49 method1138(int arg0) {
        field2259++;
        class49 var2 = this.field2273;
        if (arg0 <= 107) {
            return null;
        } else if (this.field2266 == var2) {
            this.field2273 = null;
            return null;
        } else {
            this.field2273 = var2.field591;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLlm;)V")
    public final void method1139(byte arg0, class49 arg1) {
        field2261++;
        if (arg0 != -84) {
            field2258 = -108;
        }
        if (arg1.field586 != null) {
            arg1.method416(9867);
        }
        arg1.field586 = this.field2266.field586;
        arg1.field591 = this.field2266;
        arg1.field586.field591 = arg1;
        arg1.field591.field586 = arg1;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)Llm;")
    public final class49 method1140(int arg0) {
        if (arg0 >= -73) {
            method1136(-9, -36, -91, true, null, null, -119, -125);
        }
        field2265++;
        class49 var2 = this.field2266.field591;
        if (this.field2266 == var2) {
            this.field2273 = null;
            return null;
        } else {
            this.field2273 = var2.field591;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)I")
    public final int method1141(byte arg0) {
        int var2 = -60 % ((11 - arg0) / 48);
        field2269++;
        int var3 = 0;
        for (class49 var4 = this.field2266.field591; var4 != this.field2266; var4 = var4.field591) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I")
    public static final int method1142(int arg0, int arg1) {
        int var2 = -90 % ((arg1 - 10) / 41);
        field2271++;
        int var8 = arg0 - 1;
        int var3 = var8 | var8 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return var7 + 1;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
    public class179() {
        this.field2266.field591 = this.field2266;
        this.field2266.field586 = this.field2266;
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V")
    public final void method1143(int arg0) {
        while (true) {
            class49 var2 = this.field2266.field591;
            if (this.field2266 == var2) {
                field2268++;
                this.field2273 = null;
                if (arg0 >= -86) {
                    method1135(-78);
                    return;
                }
                return;
            }
            var2.method416(9867);
        }
    }
}

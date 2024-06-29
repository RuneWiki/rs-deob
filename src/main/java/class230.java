import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class230 {

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "Lti;")
    private class5 field4206 = new class5();

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "Lhj;")
    public static class69 field4212 = class181.method1318("leuchten2:", (byte) -117);

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    public static int field4213 = 0;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "Lhj;")
    public static class69 field4211 = class181.method1318("Art", (byte) -105);

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "[Lug;")
    public static class193[] field4208 = new class193[27];

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field4209 = 0;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "[I")
    public static int[] field4216 = new int[4096];

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "Lti;")
    private class5 field4217;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "[[B")
    public static byte[][] field4204;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public final void method1638(int arg0) {
        field4210++;
        while (true) {
            class5 var2 = this.field4206.field37;
            if (this.field4206 == var2) {
                this.field4217 = null;
                if (arg0 == 64) {
                    return;
                } else {
                    this.field4217 = null;
                    return;
                }
            }
            var2.method24(true);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)Lti;")
    public final class5 method1639(boolean arg0) {
        class5 var2 = this.field4206.field37;
        if (!arg0) {
            return null;
        }
        field4207++;
        if (this.field4206 == var2) {
            this.field4217 = null;
            return null;
        } else {
            this.field4217 = var2.field37;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(Z)Lti;")
    public final class5 method1640(boolean arg0) {
        field4218++;
        class5 var2 = this.field4217;
        if (this.field4206 == var2) {
            this.field4217 = null;
            return null;
        }
        if (!arg0) {
            method1646(-14, 117, -54, -18, (class177) null, (class177) null, 99, -80, 118L);
        }
        this.field4217 = var2.field37;
        return var2;
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(Z)Lti;")
    public final class5 method1641(boolean arg0) {
        field4205++;
        class5 var2 = this.field4206.field37;
        if (this.field4206 == var2) {
            return null;
        } else {
            var2.method24(arg0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V")
    public static final void method1642(int arg0) {
        class206.field3761.method1713(53);
        int var1 = 112 / ((arg0 - 62) / 59);
        field4215++;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lti;I)V")
    public final void method1643(class5 arg0, int arg1) {
        if (arg0.field47 != null) {
            arg0.method24(true);
        }
        field4214++;
        arg0.field47 = this.field4206.field47;
        if (arg1 != 4096) {
            field4211 = null;
        }
        arg0.field37 = this.field4206;
        arg0.field47.field37 = arg0;
        arg0.field37.field47 = arg0;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)I")
    public static int method1644(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
    public class230() {
        this.field4206.field47 = this.field4206;
        this.field4206.field37 = this.field4206;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)V")
    public static final void method1645(int arg0, int arg1) {
        if (arg0 != 0) {
            field4208 = null;
        }
        field4219++;
        if (class194.field3534 == 0) {
            class49.field724.method379((byte) -126, arg1);
        } else {
            class38.field534 = arg1;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIILed;Led;IIJ)V")
    public static final void method1646(int arg0, int arg1, int arg2, int arg3, class177 arg4, class177 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class118 var10 = new class118();
        var10.field2238 = arg8;
        var10.field2239 = arg1 * 128 + 64;
        var10.field2229 = arg2 * 128 + 64;
        var10.field2231 = arg3;
        var10.field2235 = arg4;
        var10.field2227 = arg5;
        var10.field2234 = arg6;
        var10.field2228 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class158.field2935[var11][arg1][arg2] == null) {
                class158.field2935[var11][arg1][arg2] = new class217(var11, arg1, arg2);
            }
        }
        class158.field2935[arg0][arg1][arg2].field3932 = var10;
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)V")
    public static void method1647(int arg0) {
        field4212 = null;
        field4211 = null;
        if (arg0 < 100) {
            method1642(-84);
        }
        field4204 = null;
        field4216 = null;
        field4208 = null;
    }
}

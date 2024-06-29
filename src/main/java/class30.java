import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class30 {

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "Lvi;")
    private class560 field292 = new class560(64);

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "Lpq;")
    public class159 field299;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "Lpq;")
    private class159 field298;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
    public static int field297 = -1;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "Ljj;")
    public static class398 field288 = new class398(78, 7);

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
    public static int field300 = -1;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
    public final void method181(int arg0) {
        class560 var2 = this.field292;
        synchronized (this.field292) {
            this.field292.method3142(false);
            if (arg0 != 78) {
                method183((byte) -77);
            }
        }
        field286++;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)Lna;")
    public final class625 method182(int arg0, int arg1) {
        field295++;
        class560 var3 = this.field292;
        class625 var4;
        synchronized (this.field292) {
            var4 = (class625) this.field292.method3134((long) arg0, arg1 - 92);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1 != 7) {
            this.method185(-118);
        }
        class159 var5 = this.field298;
        byte[] var6;
        synchronized (this.field298) {
            var6 = this.field298.method1087(3, arg0, 1);
        }
        class625 var7 = new class625();
        var7.field8498 = this;
        if (var6 != null) {
            var7.method3415(false, new class138(var6));
        }
        class560 var8 = this.field292;
        synchronized (this.field292) {
            this.field292.method3130((long) arg0, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
    public static void method183(byte arg0) {
        field288 = null;
        if (arg0 != -52) {
            method187(-103, -71);
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(II)V")
    public final void method184(int arg0, int arg1) {
        class560 var3 = this.field292;
        synchronized (this.field292) {
            if (arg1 != -1) {
                this.method185(-127);
            }
            this.field292.method3129(arg0, arg1 ^ 0xFFFFC708);
        }
        field294++;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V")
    public final void method185(int arg0) {
        field296++;
        int var2 = 43 / ((arg0 + 24) / 61);
        class560 var3 = this.field292;
        synchronized (this.field292) {
            this.field292.method3144(true);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIFIFLue;FIFF)[B")
    public static final byte[] method186(int arg0, int arg1, int arg2, float arg3, int arg4, float arg5, class531 arg6, float arg7, int arg8, float arg9, float arg10) {
        field293++;
        if (arg1 >= -51) {
            method183((byte) 64);
        }
        byte[] var11 = new byte[arg2 * arg4 * arg8];
        class333.method2127(arg4, arg5, arg3, arg10, arg8, arg0, 1, 0, arg7, arg6, arg9, var11, arg2);
        return var11;
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(II)Z")
    public static final boolean method187(int arg0, int arg1) {
        if (arg0 < 120) {
            method183((byte) -48);
        }
        field290++;
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Luea;ILpq;Lpq;)V")
    public class30(class484 arg0, int arg1, class159 arg2, class159 arg3) {
        this.field299 = arg3;
        this.field298 = arg2;
        this.field298.method1076(3, 0);
    }
}

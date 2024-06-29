import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class25 {

    @OriginalMember(owner = "client!fba", name = "e", descriptor = "Lada;")
    private class164 field256;

    @OriginalMember(owner = "client!fba", name = "j", descriptor = "I")
    public static int field261 = 0;

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "Lmia;")
    public static class63 field257 = new class63(29, -1);

    @OriginalMember(owner = "client!fba", name = "l", descriptor = "D")
    public static double field263;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!fba", name = "g", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!fba", name = "i", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!fba", name = "k", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!fba", name = "h", descriptor = "Lefa;")
    private class184 field259;

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "[Lpga;")
    public static class536[] field253;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)Lefa;", line = 3)
    public final class184 method123(int arg0) {
        if (arg0 != 29) {
            this.method124(33, null);
        }
        field254++;
        class184 var2 = this.field259;
        if (this.field256.field2590 == var2) {
            this.field259 = null;
            return null;
        } else {
            this.field259 = var2.field2812;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(ILada;)V", line = 29)
    public final void method124(int arg0, class164 arg1) {
        field260++;
        this.field256 = arg1;
        if (arg0 != 128) {
            this.field256 = null;
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", line = 41)
    public static final void method125(int arg0, String arg1, int arg2, String arg3, int arg4, String arg5, String arg6) {
        class707.method4020(null, arg4, arg6, (byte) 105, arg5, -1, arg3, arg1, arg0);
        field258++;
        if (arg2 != 0) {
            method125(-85, null, 77, null, -9, null, null);
        }
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(I)Lefa;", line = 56)
    public final class184 method126(int arg0) {
        field252++;
        if (arg0 != -14656) {
            return null;
        }
        class184 var2 = this.field256.field2590.field2812;
        if (this.field256.field2590 == var2) {
            this.field259 = null;
            return null;
        } else {
            this.field259 = var2.field2812;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)V", line = 78)
    public static void method127(byte arg0) {
        int var1 = 89 / ((arg0 - 1) / 32);
        field257 = null;
        field253 = null;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lwh;Z)V", line = 97)
    public static final void method128(class148 arg0, boolean arg1) {
        field255++;
        if (class595.field8438 == null) {
            class642 var2 = new class642();
            byte[] var3 = var2.method3677(128, (byte) 75, 16, 128);
            class595.field8438 = class597.method3477(false, var3, (byte) 114);
        }
        if (class454.field6694 == null) {
            class246 var4 = new class246();
            byte[] var5 = var4.method1640(16, 128, 100, 128);
            class454.field6694 = class597.method3477(false, var5, (byte) 91);
        }
        class309 var6 = arg0.field2169;
        if (!arg1) {
            method128(null, false);
        }
        if (var6.method1959(-31793) && class691.field9557 == null) {
            byte[] var7 = class578.method3348(0.6F, new class712(419684), 128, (byte) -24, 8, 4.0F, 16, 0.5F, 4.0F, 16.0F, 128);
            class691.field9557 = class597.method3477(false, var7, (byte) 85);
        }
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "()V", line = 138)
    public class25() {
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Lada;)V", line = 140)
    public class25(class164 arg0) {
        this.field256 = arg0;
    }
}

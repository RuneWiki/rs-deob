import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class212 {

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "Lig;")
    private class102 field3252;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Lb;")
    private class144 field3246;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "Llb;")
    private class243 field3255;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "Log;")
    public static class295 field3257 = new class295();

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
    public static int field3261 = 0;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "Lwm;")
    private class254 field3248;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "[I")
    public static int[] field3259;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "[Lrg;")
    private class292[] field3260;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V", line = 8)
    public final void method1515(byte arg0) {
        field3256++;
        if (this.field3260 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3260.length; var2++) {
            if (this.field3260[var2] != null) {
                this.field3260[var2].method2023(false);
            }
        }
        int var3 = 0;
        if (arg0 != 45) {
            field3257 = (class295) null;
        }
        while (var3 < this.field3260.length) {
            if (this.field3260[var3] != null) {
                this.field3260[var3].method2017(2);
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBIII)I", line = 47)
    public static final int method1516(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field3250++;
        if (arg1 < 2) {
            field3259 = (int[]) null;
        }
        int var5 = 65536 - class164.field2664[arg4 * 1024 / arg2] >> 1;
        return ((65536 - var5) * arg3 >> 16) + (arg0 * var5 >> 16);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILwm;)Lsk;", line = 60)
    public static final class284 method1517(int arg0, class254 arg1) {
        if (arg0 != 7435) {
            method1517(115, (class254) null);
        }
        field3251++;
        return new class284(arg1.method1768(65536), arg1.method1768(65536), arg1.method1768(arg0 + 58101), arg1.method1768(65536), arg1.method1758((byte) 113), arg1.method1758((byte) 92), arg1.method1774((byte) -99));
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)Z", line = 73)
    public final boolean method1518(int arg0) {
        field3247++;
        if (arg0 >= -121) {
            field3261 = -3;
        }
        if (this.field3248 != null) {
            return true;
        }
        if (this.field3255 == null) {
            if (this.field3252.method775(true)) {
                return false;
            }
            this.field3255 = this.field3252.method770(9, (byte) 0, true, 255, 255);
        }
        if (this.field3255.field3139) {
            return false;
        } else {
            this.field3248 = new class254(this.field3255.method1477((byte) -9));
            this.field3260 = new class292[(this.field3248.field3840.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V", line = 108)
    public static void method1519(boolean arg0) {
        field3257 = null;
        if (!arg0) {
            field3259 = (int[]) null;
        }
        field3259 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLco;ILco;)Lrg;", line = 120)
    public final class292 method1520(byte arg0, class48 arg1, int arg2, class48 arg3) {
        field3253++;
        return arg0 <= 32 ? (class292) null : this.method1522(arg1, arg3, true, arg2, -1077569055);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZII)V", line = 133)
    public static final void method1521(boolean arg0, int arg1, int arg2) {
        field3258++;
        int var3 = class59.field783 * arg2 >> 8;
        if (arg1 == -1 && !class132.field2016) {
            class281.method1947(160);
        } else if (arg1 != -1 && (class276.field4284 != arg1 || !class232.method1632(-128)) && var3 != 0 && !class132.field2016) {
            class318.method2215(0, false, arg1, arg0, var3, 2, class222.field3389);
        }
        class276.field4284 = arg1;
        if (!arg0) {
            field3257 = (class295) null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lco;Lco;ZII)Lrg;", line = 161)
    private final class292 method1522(class48 arg0, class48 arg1, boolean arg2, int arg3, int arg4) {
        if (arg4 != -1077569055) {
            field3257 = (class295) null;
        }
        field3249++;
        if (this.field3248 == null) {
            throw new RuntimeException();
        }
        this.field3248.field3866 = arg3 * 8 + 5;
        if (this.field3248.field3866 >= this.field3248.field3840.length) {
            throw new RuntimeException();
        } else if (this.field3260[arg3] == null) {
            int var6 = this.field3248.method1741(-32769);
            int var7 = this.field3248.method1741(-32769);
            class292 var8 = new class292(arg3, arg1, arg0, this.field3252, this.field3246, var6, var7, arg2);
            this.field3260[arg3] = var8;
            return var8;
        } else {
            return this.field3260[arg3];
        }
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lig;Lb;)V", line = 205)
    public class212(class102 arg0, class144 arg1) {
        this.field3252 = arg0;
        this.field3246 = arg1;
        if (!this.field3252.method775(true)) {
            this.field3255 = this.field3252.method770(9, (byte) 0, true, 255, 255);
        }
    }
}

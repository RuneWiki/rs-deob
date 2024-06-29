import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class377 {

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "Lnga;")
    private class510 field5268 = new class510(64);

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "Leq;")
    private class209 field5265;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public int field5275;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "[I")
    public static int[] field5271 = new int[64];

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field5266 = -1;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "Z")
    public static boolean field5273 = false;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "[I")
    public static int[] field5274 = new int[2];

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "Lkk;")
    public static class188 field5263;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIILha;IIIII[[[B)V")
    public static final void method2363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class58 arg6, int arg7, int arg8, int arg9, int arg10, int arg11, byte[][][] arg12) {
        field5270++;
        if (arg9 == 0 || arg8 == 0) {
            return;
        }
        if (arg9 == 9) {
            arg1 = arg1 + 1 & 0x3;
            arg9 = 1;
        }
        if (arg4 != 1) {
            field5266 = 90;
        }
        if (arg9 == 10) {
            arg1 = arg1 + 3 & 0x3;
            arg9 = 1;
        }
        if (arg9 == 11) {
            arg1 = arg1 + 3 & 0x3;
            arg9 = 8;
        }
        arg6.method603(arg11, arg0, arg2, arg5, arg3, arg7, arg12[arg9 - 1][arg1], arg8, arg10);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Leo;Z)V")
    public static final void method2364(class296 arg0, boolean arg1) {
        if (!arg1) {
            field5266 = -67;
        }
        field5269++;
        arg0.field4129 = null;
        if (class592.field8310 < 20) {
            class359.field5043.method4152(arg0, 0);
            class592.field8310++;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BI)Len;")
    public final class318 method2365(byte arg0, int arg1) {
        field5262++;
        class510 var3 = this.field5268;
        class318 var4;
        synchronized (this.field5268) {
            var4 = (class318) this.field5268.method3054((byte) -120, (long) arg1);
        }
        if (arg0 < 52) {
            this.field5268 = null;
        }
        if (var4 != null) {
            return var4;
        }
        class209 var5 = this.field5265;
        byte[] var6;
        synchronized (this.field5265) {
            var6 = this.field5265.method1453(arg1, -117, 16);
        }
        class318 var7 = new class318();
        if (var6 != null) {
            var7.method2047(new class35(var6), -65);
        }
        class510 var8 = this.field5268;
        synchronized (this.field5268) {
            this.field5268.method3047(false, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
    public final void method2366(int arg0) {
        if (arg0 != 15674) {
            field5266 = 72;
        }
        field5267++;
        class510 var2 = this.field5268;
        synchronized (this.field5268) {
            this.field5268.method3048(false);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
    public static void method2367(byte arg0) {
        if (arg0 == -116) {
            field5271 = null;
            field5274 = null;
            field5263 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZI)Z")
    public static final boolean method2368(int arg0, boolean arg1, int arg2) {
        field5276++;
        if (!arg1) {
            method2367((byte) -25);
        }
        return (arg2 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
    public final void method2369(int arg0) {
        class510 var2 = this.field5268;
        synchronized (this.field5268) {
            if (arg0 != -30410) {
                return;
            }
            this.field5268.method3050(false);
        }
        field5272++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)V")
    public final void method2370(int arg0, int arg1) {
        field5264++;
        if (arg1 > 70) {
            class510 var3 = this.field5268;
            synchronized (this.field5268) {
                this.field5268.method3049(arg0, (byte) 127);
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lcw;ILeq;)V")
    public class377(class179 arg0, int arg1, class209 arg2) {
        this.field5265 = arg2;
        if (this.field5265 == null) {
            this.field5275 = 0;
        } else {
            this.field5275 = this.field5265.method1477(0, 16);
        }
    }
}

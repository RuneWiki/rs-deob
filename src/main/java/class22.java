import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class22 {

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "Z")
    public boolean field273 = false;

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "Lnga;")
    private class510 field287 = new class510(64);

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "Lnga;")
    public class510 field288 = new class510(500);

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "Lnga;")
    public class510 field290 = new class510(30);

    @OriginalMember(owner = "client!qo", name = "u", descriptor = "Lnga;")
    public class510 field291 = new class510(50);

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "Z")
    public boolean field282;

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "Leq;")
    private class209 field281;

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "Leq;")
    public class209 field275;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "Lqaa;")
    public static class27 field271 = new class27(53, 2);

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "Lap;")
    public static class474 field283 = new class474("WIP", 2);

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "F")
    public static float field277;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!qo", name = "v", descriptor = "I")
    public int field292;

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "[B")
    public static byte[] field285;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(II)V")
    public final void method127(int arg0, int arg1) {
        if (arg1 != 2) {
            this.method128(119, 110);
        }
        this.field292 = arg0;
        field286++;
        class510 var3 = this.field288;
        synchronized (this.field288) {
            this.field288.method3048(false);
        }
        class510 var4 = this.field290;
        synchronized (this.field290) {
            this.field290.method3048(false);
        }
        class510 var5 = this.field291;
        synchronized (this.field291) {
            this.field291.method3048(false);
        }
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(II)V")
    public final void method128(int arg0, int arg1) {
        field279++;
        class510 var3 = this.field287;
        synchronized (this.field287) {
            this.field287.method3049(arg0, (byte) 127);
        }
        class510 var4 = this.field288;
        synchronized (this.field288) {
            this.field288.method3049(arg0, (byte) 126);
        }
        class510 var5 = this.field290;
        synchronized (this.field290) {
            this.field290.method3049(arg0, (byte) 127);
        }
        class510 var6 = this.field291;
        synchronized (this.field291) {
            this.field291.method3049(arg0, (byte) 127);
            if (arg1 != 18152) {
                this.method132(127, false);
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V")
    public final void method129(byte arg0) {
        field276++;
        class510 var2 = this.field287;
        synchronized (this.field287) {
            this.field287.method3050(false);
        }
        class510 var3 = this.field288;
        synchronized (this.field288) {
            this.field288.method3050(false);
        }
        class510 var4 = this.field290;
        synchronized (this.field290) {
            this.field290.method3050(false);
            if (arg0 <= 93) {
                this.method130(-25);
            }
        }
        class510 var5 = this.field291;
        synchronized (this.field291) {
            this.field291.method3050(false);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
    public final void method130(int arg0) {
        class510 var2 = this.field287;
        synchronized (this.field287) {
            this.field287.method3048(false);
            if (arg0 > -41) {
                this.method129((byte) 114);
            }
        }
        field280++;
        class510 var3 = this.field288;
        synchronized (this.field288) {
            this.field288.method3048(false);
        }
        class510 var4 = this.field290;
        synchronized (this.field290) {
            this.field290.method3048(false);
        }
        class510 var5 = this.field291;
        synchronized (this.field291) {
            this.field291.method3048(false);
        }
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(II)Luw;")
    public final class414 method131(int arg0, int arg1) {
        field272++;
        class510 var3 = this.field287;
        class414 var4;
        synchronized (this.field287) {
            var4 = (class414) this.field287.method3054((byte) -100, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class209 var5 = this.field281;
        byte[] var6;
        synchronized (this.field281) {
            var6 = this.field281.method1453(class512.method3062(-100, arg1), -128, class511.method3055((byte) 76, arg1));
        }
        class414 var7 = new class414();
        var7.field5711 = arg1;
        var7.field5775 = this;
        if (var6 != null) {
            var7.method2511(new class35(var6), false);
        }
        var7.method2517((byte) 6);
        if (!this.field282 && var7.field5786) {
            var7.field5727 = null;
            var7.field5771 = null;
        }
        if (var7.field5762) {
            var7.field5803 = 0;
            var7.field5748 = false;
        }
        class510 var8 = this.field287;
        synchronized (this.field287) {
            if (arg0 == 2) {
                this.field287.method3047(false, var7, (long) arg1);
                return var7;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZ)V")
    public final void method132(int arg0, boolean arg1) {
        field289++;
        if (arg1 == this.field273) {
            return;
        }
        if (arg0 > -41) {
            this.method130(-116);
        }
        this.field273 = arg1;
        this.method130(-127);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I[SI)[S")
    public static final short[] method133(int arg0, short[] arg1, int arg2) {
        field284++;
        if (arg2 != 26575) {
            field283 = null;
        }
        short[] var3 = new short[arg0];
        class622.method3593(arg1, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZI)V")
    public final void method134(boolean arg0, int arg1) {
        if (arg1 != 0) {
            this.method128(-33, 11);
        }
        field278++;
        if (arg0 != this.field282) {
            this.field282 = arg0;
            this.method130(arg1 - 88);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IB)V")
    public final void method135(int arg0, byte arg1) {
        if (arg1 >= -102) {
            this.method129((byte) 88);
        }
        field274++;
        this.field287 = new class510(arg0);
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)V")
    public static void method136(int arg0) {
        if (arg0 != 2) {
            method133(-74, null, -48);
        }
        field271 = null;
        field285 = null;
        field283 = null;
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lcw;IZLeq;Leq;)V")
    public class22(class179 arg0, int arg1, boolean arg2, class209 arg3, class209 arg4) {
        this.field282 = arg2;
        this.field281 = arg3;
        this.field275 = arg4;
        if (this.field281 != null) {
            int var6 = this.field281.method1454(-1) - 1;
            this.field281.method1477(0, var6);
        }
    }
}

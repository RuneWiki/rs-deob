import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class28 {

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "Lof;")
    private class620 field298 = new class620(64);

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "Lof;")
    public class620 field315 = new class620(50);

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "Lof;")
    public class620 field316 = new class620(5);

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Loh;")
    private class404 field304;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "Loh;")
    public class404 field303;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "Z")
    public boolean field309;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "Lnb;")
    public class301 field297;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "Lso;")
    public static class468 field308 = new class468(11, 19);

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "F")
    public static float field313;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
    public int field317;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)Z", line = 4)
    public static final boolean method135(int arg0, int arg1) {
        field306++;
        if (arg0 != -752) {
            field313 = 0.9380028F;
        }
        return arg1 == 10 || arg1 == 11 || arg1 == 12;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)Lsaa;", line = 16)
    public final class326 method136(int arg0, int arg1) {
        if (arg0 != 245) {
            return null;
        }
        field299++;
        class620 var3 = this.field298;
        class326 var4;
        synchronized (this.field298) {
            var4 = (class326) this.field298.method3538((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class404 var5 = this.field304;
        byte[] var6;
        synchronized (this.field304) {
            var6 = this.field304.method2481(class11.method47(true, arg1), class510.method3015(32767, arg1), (byte) 127);
        }
        class326 var7 = new class326();
        var7.field4182 = this;
        var7.field4196 = arg1;
        if (var6 != null) {
            var7.method1951(new class244(var6), 16383);
        }
        var7.method1941(false);
        class620 var8 = this.field298;
        synchronized (this.field298) {
            this.field298.method3537(-69, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V", line = 52)
    public final void method137(boolean arg0) {
        class620 var2 = this.field315;
        synchronized (this.field315) {
            this.field315.method3549(0);
        }
        field310++;
        class620 var3 = this.field316;
        synchronized (this.field316) {
            this.field316.method3549(0);
            if (!arg0) {
                this.field316 = null;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)V", line = 70)
    public final void method138(int arg0, byte arg1) {
        field311++;
        if (arg1 != -120) {
            this.field297 = null;
        }
        this.field317 = arg0;
        class620 var3 = this.field315;
        synchronized (this.field315) {
            this.field315.method3549(0);
        }
        class620 var4 = this.field316;
        synchronized (this.field316) {
            this.field316.method3549(0);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZB)V", line = 92)
    public final void method139(boolean arg0, byte arg1) {
        field300++;
        int var3 = -8 % ((arg1 - 3) / 34);
        if (this.field309 != arg0) {
            this.field309 = arg0;
            this.method142((byte) 122);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 108)
    public final void method140(int arg0) {
        field305++;
        class620 var2 = this.field298;
        synchronized (this.field298) {
            this.field298.method3541(-647);
        }
        class620 var3 = this.field315;
        synchronized (this.field315) {
            this.field315.method3541(-647);
        }
        class620 var4 = this.field316;
        synchronized (this.field316) {
            this.field316.method3541(-647);
        }
        if (arg0 != 228) {
            this.method142((byte) 11);
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(II)V", line = 128)
    public final void method141(int arg0, int arg1) {
        field301++;
        if (arg1 != -10170) {
            this.method136(127, 76);
        }
        class620 var3 = this.field298;
        synchronized (this.field298) {
            this.field298.method3539((byte) -95, arg0);
        }
        class620 var4 = this.field315;
        synchronized (this.field315) {
            this.field315.method3539((byte) 121, arg0);
        }
        class620 var5 = this.field316;
        synchronized (this.field316) {
            this.field316.method3539((byte) -50, arg0);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V", line = 149)
    public final void method142(byte arg0) {
        field307++;
        int var2 = -64 / ((arg0 - 63) / 57);
        class620 var3 = this.field298;
        synchronized (this.field298) {
            this.field298.method3549(0);
        }
        class620 var4 = this.field315;
        synchronized (this.field315) {
            this.field315.method3549(0);
        }
        class620 var5 = this.field316;
        synchronized (this.field316) {
            this.field316.method3549(0);
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V", line = 171)
    public static void method143(byte arg0) {
        field308 = null;
        if (arg0 < 98) {
            field312 = -65;
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lnb;IZLoh;Loh;)V", line = 600)
    public class28(class301 arg0, int arg1, boolean arg2, class404 arg3, class404 arg4) {
        this.field304 = arg3;
        this.field303 = arg4;
        this.field309 = arg2;
        this.field297 = arg0;
        if (this.field304 != null) {
            int var6 = this.field304.method2478((byte) -76) - 1;
            this.field304.method2482(0, var6);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IC)C", line = 191)
    public static final char method144(int arg0, char arg1) {
        field296++;
        int var2 = 22 / ((-arg0 - 92) / 34);
        if (arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-') {
            return '_';
        } else if (arg1 == '[' || arg1 == ']' || arg1 == '#') {
            return arg1;
        } else if (arg1 == 'à' || arg1 == 'á' || arg1 == 'â' || arg1 == 'ä' || arg1 == 'ã' || arg1 == 'À' || arg1 == 'Á' || arg1 == 'Â' || arg1 == 'Ä' || arg1 == 'Ã') {
            return 'a';
        } else if (arg1 == 'è' || arg1 == 'é' || arg1 == 'ê' || arg1 == 'ë' || arg1 == 'È' || arg1 == 'É' || arg1 == 'Ê' || arg1 == 'Ë') {
            return 'e';
        } else if (arg1 == 'í' || arg1 == 'î' || arg1 == 'ï' || arg1 == 'Í' || arg1 == 'Î' || arg1 == 'Ï') {
            return 'i';
        } else if (arg1 == 'ò' || arg1 == 'ó' || arg1 == 'ô' || arg1 == 'ö' || arg1 == 'õ' || arg1 == 'Ò' || arg1 == 'Ó' || arg1 == 'Ô' || arg1 == 'Ö' || arg1 == 'Õ') {
            return 'o';
        } else if (arg1 == 'ù' || arg1 == 'ú' || arg1 == 'û' || arg1 == 'ü' || arg1 == 'Ù' || arg1 == 'Ú' || arg1 == 'Û' || arg1 == 'Ü') {
            return 'u';
        } else if (arg1 == 'ç' || arg1 == 'Ç') {
            return 'c';
        } else if (arg1 == 'ÿ' || arg1 == 'Ÿ') {
            return 'y';
        } else if (arg1 == 'ñ' || arg1 == 'Ñ') {
            return 'n';
        } else if (arg1 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg1);
        }
    }
}

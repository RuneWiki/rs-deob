import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class414 {

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "Ldha;")
    private class83 field5667 = new class83();

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    private int field5664;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    private int field5665;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "Ljo;")
    private class353 field5675;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "[I")
    public static int[] field5672 = new int[3];

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field5663;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public static int field5666;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
    public static int field5673;

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ldr;B)V")
    private final void method2511(class750 arg0, byte arg1) {
        if (arg1 != 52) {
            this.field5667 = null;
        }
        field5670++;
        long var3 = arg0.method654(31671);
        for (class89 var5 = (class89) this.field5675.method2242(var3, -1); var5 != null; var5 = (class89) this.field5675.method2250(true)) {
            if (var5.field1003.method657(arg0, 31022)) {
                this.method2518(true, var5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)V")
    public final void method2512(int arg0, int arg1) {
        if (arg0 != -31028) {
            return;
        }
        if (class433.field5863 != null) {
            for (class89 var3 = (class89) this.field5667.method636(arg0 ^ 0xFFFF87CC); var3 != null; var3 = (class89) this.field5667.method637(false)) {
                if (var3.method664(101)) {
                    if (var3.method666(arg0 ^ 0x792D) == null) {
                        var3.method3387((byte) -85);
                        var3.method827(3);
                        this.field5665 += var3.field1005;
                    }
                } else if (((long) arg1) < (++var3.field1597)) {
                    class89 var4 = class433.field5863.method2795(var3, -127);
                    this.field5675.method2241(61, var3.field8133, var4);
                    class715.method4016(var3, var4, (byte) -128);
                    var3.method3387((byte) -92);
                    var3.method827(arg0 + 31031);
                }
            }
        }
        field5662++;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
    public final void method2513(int arg0) {
        field5671++;
        for (class89 var2 = (class89) this.field5667.method636(256); var2 != null; var2 = (class89) this.field5667.method637(false)) {
            if (var2.method664(112)) {
                var2.method3387((byte) -32);
                var2.method827(3);
                this.field5665 += var2.field1005;
            }
        }
        if (arg0 != -23408) {
            field5672 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ldr;ZILjava/lang/Object;)V")
    private final void method2514(class750 arg0, boolean arg1, int arg2, Object arg3) {
        field5676++;
        if (this.field5664 < arg2) {
            throw new IllegalStateException("s>cs");
        } else if (arg1) {
            this.method2511(arg0, (byte) 52);
            this.field5665 -= arg2;
            while (this.field5665 < 0) {
                class89 var6 = (class89) this.field5667.method633(18801);
                this.method2518(true, var6);
            }
            class650 var5 = new class650(arg0, arg3, arg2);
            this.field5675.method2241(-42, arg0.method654(31671), var5);
            this.field5667.method626((byte) -118, var5);
            var5.field1597 = 0L;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2515(String arg0, int arg1) {
        class357.field5022 = arg0;
        field5673++;
        if (class319.field4527 == null) {
            return;
        }
        try {
            if (arg1 == 25799) {
                String var2 = class319.field4527.getParameter("cookieprefix");
                String var3 = class319.field4527.getParameter("cookiehost");
                String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
                String var5;
                if (arg0.length() == 0) {
                    var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var4 + "; Expires=" + class23.method232(-111, class459.method2731(arg1 ^ 0x64A3) + 94608000000L) + "; Max-Age=" + 94608000L;
                }
                class323.method2081((byte) 25, "document.cookie=\"" + var5 + "\"", class319.field4527);
            }
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)V")
    public static void method2516(boolean arg0) {
        if (arg0) {
            field5672 = null;
        }
        field5672 = null;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
    public final void method2517(int arg0) {
        if (arg0 == -15647) {
            field5666++;
            this.field5667.method629(false);
            this.field5675.method2240(arg0 + 15524);
            this.field5665 = this.field5664;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZLkca;)V")
    private final void method2518(boolean arg0, class89 arg1) {
        if (!arg0) {
            method2521(-101);
        }
        field5668++;
        if (arg1 != null) {
            arg1.method3387((byte) 106);
            arg1.method827(3);
            this.field5665 += arg1.field1005;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/lang/Object;Ldr;I)V")
    public final void method2519(Object arg0, class750 arg1, int arg2) {
        if (arg2 == -12548) {
            field5677++;
            this.method2514(arg1, true, 1, arg0);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)I")
    public final int method2520(byte arg0) {
        if (arg0 != 6) {
            this.method2511(null, (byte) 102);
        }
        field5663++;
        return this.field5665;
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)Leo;")
    public static final class312 method2521(int arg0) {
        field5674++;
        return class689.field9593 == arg0 ? new class312() : class161.field2562[--class689.field9593];
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)I")
    public final int method2522(int arg0) {
        if (arg0 != 0) {
            field5672 = null;
        }
        field5678++;
        return this.field5664;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILdr;)Ljava/lang/Object;")
    public final Object method2523(int arg0, class750 arg1) {
        field5669++;
        long var3 = arg1.method654(31671);
        if (arg0 != 0) {
            this.method2520((byte) 60);
        }
        for (class89 var5 = (class89) this.field5675.method2242(var3, -1); var5 != null; var5 = (class89) this.field5675.method2250(true)) {
            if (var5.field1003.method657(arg1, 31022)) {
                Object var6 = var5.method666(-104);
                if (var6 != null) {
                    if (var5.method664(105)) {
                        class650 var7 = new class650(arg1, var6, var5.field1005);
                        this.field5675.method2241(124, var5.field8133, var7);
                        this.field5667.method626((byte) -119, var7);
                        var7.field1597 = 0L;
                        var5.method3387((byte) 119);
                        var5.method827(3);
                    } else {
                        this.field5667.method626((byte) -7, var5);
                        var5.field1597 = 0L;
                    }
                    return var6;
                }
                var5.method3387((byte) -66);
                var5.method827(3);
                this.field5665 += var5.field1005;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(I)V")
    public class414(int arg0) {
        this.field5664 = arg0;
        this.field5665 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field5675 = new class353(var2);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class348 {

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "Lld;")
    private class114 field4695 = new class114();

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
    private int field4689;

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "I")
    private int field4697;

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "Lub;")
    private class18 field4698;

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "[I")
    public static int[] field4702 = new int[4];

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "Lvj;")
    public static class304 field4693 = new class304("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!ko", name = "s", descriptor = "I")
    public static int field4706 = -1;

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "I")
    public static int field4704 = -50;

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "Lvj;")
    public static class304 field4705 = new class304("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!ko", name = "t", descriptor = "F")
    public static float field4707;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "I")
    public static int field4703;

    static {
        new class304(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)I", line = 3)
    public final int method2026(byte arg0) {
        field4701++;
        if (arg0 <= 56) {
            this.method2033(-59, null, null);
        }
        return this.field4697;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)V", line = 17)
    public static void method2027(byte arg0) {
        field4705 = null;
        field4693 = null;
        field4702 = null;
        if (arg0 != 122) {
            field4693 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)V", line = 30)
    public final void method2028(int arg0, int arg1) {
        if (arg0 != 1) {
            return;
        }
        field4692++;
        if (class101.field1498 == null) {
            return;
        }
        for (class432 var3 = (class432) this.field4695.method786(arg0); var3 != null; var3 = (class432) this.field4695.method780((byte) -78)) {
            if (var3.method1620((byte) -48)) {
                if (var3.method1621((byte) -80) == null) {
                    var3.method300(false);
                    var3.method2856(0);
                    this.field4697 += var3.field5902;
                }
            } else if ((++var3.field6896) > ((long) arg1)) {
                class432 var4 = class101.field1498.method2274(var3, arg0 - 128);
                this.field4698.method173(var3.field622, var4, (byte) 122);
                class51.method383((byte) -126, var3, var4);
                var3.method300(false);
                var3.method2856(0);
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILji;)V", line = 82)
    private final void method2029(int arg0, class432 arg1) {
        if (arg1 != null) {
            arg1.method300(false);
            arg1.method2856(0);
            this.field4697 += arg1.field5902;
        }
        if (arg0 == 9164) {
            field4688++;
        }
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(B)I", line = 99)
    public final int method2030(byte arg0) {
        if (arg0 != 94) {
            this.method2033(-87, null, null);
        }
        field4703++;
        return this.field4689;
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "(B)V", line = 110)
    public final void method2031(byte arg0) {
        field4699++;
        for (class432 var2 = (class432) this.field4695.method786(1); var2 != null; var2 = (class432) this.field4695.method780((byte) -78)) {
            if (var2.method1620((byte) -48)) {
                var2.method300(false);
                var2.method2856(0);
                this.field4697 += var2.field5902;
            }
        }
        if (arg0 > -69) {
            this.method2026((byte) -34);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lkr;B)V", line = 141)
    private final void method2032(class524 arg0, byte arg1) {
        field4700++;
        long var3 = arg0.method2734(false);
        int var5 = -57 / ((arg1 - 18) / 55);
        for (class432 var6 = (class432) this.field4698.method182(var3, (byte) 80); var6 != null; var6 = (class432) this.field4698.method177(false)) {
            if (var6.field5901.method2738(arg0, (byte) -125)) {
                this.method2029(9164, var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILkr;Ljava/lang/Object;)V", line = 167)
    public final void method2033(int arg0, class524 arg1, Object arg2) {
        this.method2034(-1, arg2, arg1, 1);
        if (arg0 >= 41) {
            field4694++;
        }
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(I)V", line = 216)
    public class348(int arg0) {
        this.field4689 = arg0;
        this.field4697 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field4698 = new class18(var2);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILjava/lang/Object;Lkr;I)V", line = 185)
    private final void method2034(int arg0, Object arg1, class524 arg2, int arg3) {
        field4690++;
        if (this.field4689 < arg3) {
            throw new IllegalStateException("s>cs");
        }
        this.method2032(arg2, (byte) 92);
        this.field4697 -= arg3;
        if (arg0 != -1) {
            return;
        }
        while (this.field4697 < 0) {
            class432 var6 = (class432) this.field4695.method787((byte) 127);
            this.method2029(arg0 ^ 0xFFFFDC33, var6);
        }
        class436 var5 = new class436(arg2, arg1, arg3);
        this.field4698.method173(arg2.method2734(false), var5, (byte) 69);
        this.field4695.method783(var5, (byte) -73);
        var5.field6896 = 0L;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lkr;I)Ljava/lang/Object;", line = 232)
    public final Object method2035(class524 arg0, int arg1) {
        field4691++;
        long var3 = arg0.method2734(false);
        class432 var5 = (class432) this.field4698.method182(var3, (byte) 93);
        if (arg1 != 0) {
            this.method2032(null, (byte) -1);
        }
        while (var5 != null) {
            if (var5.field5901.method2738(arg0, (byte) 17)) {
                Object var6 = var5.method1621((byte) -96);
                if (var6 != null) {
                    if (var5.method1620((byte) -48)) {
                        class436 var7 = new class436(arg0, var6, var5.field5902);
                        this.field4698.method173(var5.field622, var7, (byte) 112);
                        this.field4695.method783(var7, (byte) -72);
                        var7.field6896 = 0L;
                        var5.method300(false);
                        var5.method2856(0);
                    } else {
                        this.field4695.method783(var5, (byte) -125);
                        var5.field6896 = 0L;
                    }
                    return var6;
                }
                var5.method300(false);
                var5.method2856(0);
                this.field4697 += var5.field5902;
            }
            var5 = (class432) this.field4698.method177(false);
        }
        return null;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V", line = 294)
    public final void method2036(int arg0) {
        field4696++;
        this.field4695.method784(101);
        this.field4698.method176(arg0 - 16197);
        this.field4697 = this.field4689;
        if (arg0 != 16196) {
            this.field4698 = null;
        }
    }
}

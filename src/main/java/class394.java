import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class394 {

    @OriginalMember(owner = "client!rba", name = "i", descriptor = "Z")
    public boolean field5249;

    @OriginalMember(owner = "client!rba", name = "h", descriptor = "Lfv;")
    public static class108 field5248 = new class108(7, 0, 1, 1);

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!rba", name = "f", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!rba", name = "g", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!rba", name = "j", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!rba", name = "e", descriptor = "Ltj;")
    public class180 field5245;

    @OriginalMember(owner = "client!rba", name = "l", descriptor = "Ltj;")
    public class180 field5252;

    @OriginalMember(owner = "client!rba", name = "k", descriptor = "Lqr;")
    public static class60 field5251;

    @OriginalMember(owner = "client!rba", name = "d", descriptor = "Z")
    public boolean field5244;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)V")
    public final void method2146(int arg0) {
        if (arg0 <= 121) {
            method2151(105, 104, -81, -120, -13, -100, -3, 67, -12, -119);
        }
        if (this.field5245 != null) {
            this.field5245.method166((byte) 61);
        }
        field5247++;
        this.field5244 = false;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(I[Lep;I)V")
    public static final void method2147(int arg0, class382[] arg1, int arg2) {
        field5243++;
        if (arg2 != 16105) {
            return;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class382 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field5112 == 0) {
                    if (var4.field4989 != null) {
                        method2147(arg0, var4.field4989, 16105);
                    }
                    class454 var5 = (class454) class234.field2982.method3234((byte) -42, (long) var4.field5055);
                    if (var5 != null) {
                        class62.method422((byte) -114, var5.field6291, arg0);
                    }
                }
                if (arg0 == 0 && var4.field5077 != null) {
                    class676 var6 = new class676();
                    var6.field9580 = var4.field5077;
                    var6.field9585 = var4;
                    class364.method1998(var6);
                }
                if (arg0 == 1 && var4.field5118 != null) {
                    if (var4.field5073 >= 0) {
                        class382 var7 = class505.method2903(var4.field5055, arg2 + 49430);
                        if (var7 == null || var7.field4989 == null || var7.field4989.length <= var4.field5073 || var7.field4989[var4.field5073] != var4) {
                            continue;
                        }
                    }
                    class676 var8 = new class676();
                    var8.field9580 = var4.field5118;
                    var8.field9585 = var4;
                    class364.method1998(var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "(I)Z")
    public final boolean method2148(int arg0) {
        if (arg0 != 1) {
            this.method2146(-97);
        }
        field5241++;
        return this.field5244 && !this.field5249;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(ZI)V")
    public static final void method2149(boolean arg0, int arg1) {
        field5242++;
        if (class366.field4782 == null || class366.field4782.length < arg1) {
            class366.field4782 = new int[arg1];
        }
        if (arg0) {
            field5248 = null;
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)V")
    public static final void method2150(byte arg0) {
        field5246++;
        class265.field3347.method3687((byte) -10);
        if (arg0 != -58) {
            field5251 = null;
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg9 != -15955) {
            return;
        }
        field5250++;
        class595 var10 = null;
        for (class595 var11 = (class595) class454.field6292.method3174((byte) 49); var11 != null; var11 = (class595) class454.field6292.method3168(false)) {
            if (var11.field8443 == arg8 && var11.field8445 == arg3 && var11.field8448 == arg7 && var11.field8447 == arg6) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class595();
            var10.field8443 = arg8;
            var10.field8448 = arg7;
            var10.field8447 = arg6;
            var10.field8445 = arg3;
            if (arg3 >= 0 && arg7 >= 0 && class399.field5338 > arg3 && class349.field4567 > arg7) {
                class517.method2949((byte) 75, var10);
            }
            class454.field6292.method3164(var10, arg9 ^ 0xFFFFC0AD);
        }
        var10.field8438 = arg0;
        var10.field8439 = arg5;
        var10.field8444 = arg4;
        var10.field8450 = arg2;
        var10.field8437 = arg1;
    }

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "(I)V")
    public static void method2152(int arg0) {
        field5251 = null;
        field5248 = null;
        if (arg0 != 1) {
            method2150((byte) -19);
        }
    }

    @OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Z)V")
    public class394(boolean arg0) {
        this.field5249 = arg0;
    }
}

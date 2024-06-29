import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class193 {

    @OriginalMember(owner = "client!jda", name = "r", descriptor = "Ltf;")
    private class248 field2562 = new class248();

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "I")
    private int field2546;

    @OriginalMember(owner = "client!jda", name = "f", descriptor = "I")
    private int field2550;

    @OriginalMember(owner = "client!jda", name = "q", descriptor = "Lsd;")
    private class80 field2561;

    @OriginalMember(owner = "client!jda", name = "h", descriptor = "Lkca;")
    public static class73 field2552 = new class73(40, 0);

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!jda", name = "d", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!jda", name = "e", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!jda", name = "g", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!jda", name = "i", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!jda", name = "j", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!jda", name = "l", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!jda", name = "m", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!jda", name = "n", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!jda", name = "o", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!jda", name = "p", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!jda", name = "s", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!jda", name = "k", descriptor = "Lfm;")
    public static class636 field2555;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(B)V")
    public final void method1162(byte arg0) {
        field2563++;
        for (class269 var2 = (class269) this.field2562.method1644((byte) -128); var2 != null; var2 = (class269) this.field2562.method1642(0)) {
            if (var2.method1430(120)) {
                var2.method2108(true);
                var2.method199(-32);
                this.field2546 += var2.field3770;
            }
        }
        int var3 = 122 % ((arg0 - 91) / 35);
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)V")
    public static void method1163(int arg0) {
        if (arg0 >= -52) {
            method1163(22);
        }
        field2555 = null;
        field2552 = null;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Ljava/lang/Object;Luk;II)V")
    private final void method1164(Object arg0, class221 arg1, int arg2, int arg3) {
        field2553++;
        if (this.field2550 < arg3) {
            throw new IllegalStateException("s>cs");
        }
        this.method1172(arg1, 105);
        if (arg2 != 23076) {
            return;
        }
        this.field2546 -= arg3;
        while (this.field2546 < 0) {
            class269 var6 = (class269) this.field2562.method1645(94);
            this.method1169(-28584, var6);
        }
        class341 var5 = new class341(arg1, arg0, arg3);
        this.field2561.method520((byte) -57, var5, arg1.method1428(95));
        this.field2562.method1646(79, var5);
        var5.field401 = 0L;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(BLuk;)Ljava/lang/Object;")
    public final Object method1165(byte arg0, class221 arg1) {
        field2545++;
        long var3 = arg1.method1428(-114);
        for (class269 var5 = (class269) this.field2561.method524((byte) 121, var3); var5 != null; var5 = (class269) this.field2561.method526(2)) {
            if (var5.field3772.method1427(arg1, 23593)) {
                Object var7 = var5.method1429(-77);
                if (var7 != null) {
                    if (var5.method1430(120)) {
                        class341 var8 = new class341(arg1, var7, var5.field3770);
                        this.field2561.method520((byte) -66, var8, var5.field4676);
                        this.field2562.method1646(-128, var8);
                        var8.field401 = 0L;
                        var5.method2108(true);
                        var5.method199(-31);
                    } else {
                        this.field2562.method1646(-103, var5);
                        var5.field401 = 0L;
                    }
                    return var7;
                }
                var5.method2108(true);
                var5.method199(-78);
                this.field2546 += var5.field3770;
            }
        }
        int var6 = -126 % ((11 - arg0) / 59);
        return null;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(II)V")
    public final void method1166(int arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        field2560++;
        if (class194.field2636 == null) {
            return;
        }
        for (class269 var3 = (class269) this.field2562.method1644((byte) -127); var3 != null; var3 = (class269) this.field2562.method1642(0)) {
            if (var3.method1430(120)) {
                if (var3.method1429(-91) == null) {
                    var3.method2108(true);
                    var3.method199(-29);
                    this.field2546 += var3.field3770;
                }
            } else if ((++var3.field401) > ((long) arg0)) {
                class269 var4 = class194.field2636.method1(var3, (byte) -30);
                this.field2561.method520((byte) -65, var4, var3.field4676);
                class195.method1242(var3, var4, 76);
                var3.method2108(true);
                var3.method199(-82);
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Luk;ILjava/lang/Object;)V")
    public final void method1167(class221 arg0, int arg1, Object arg2) {
        field2547++;
        if (arg1 != -29355) {
            this.field2562 = null;
        }
        this.method1164(arg2, arg0, 23076, 1);
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(I)I")
    public final int method1168(int arg0) {
        int var2 = 90 % ((-arg0 - 31) / 61);
        field2554++;
        return this.field2550;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILen;)V")
    private final void method1169(int arg0, class269 arg1) {
        if (arg0 != -28584) {
            this.field2562 = null;
        }
        if (arg1 != null) {
            arg1.method2108(true);
            arg1.method199(-62);
            this.field2546 += arg1.field3770;
        }
        field2557++;
    }

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "(I)I")
    public final int method1170(int arg0) {
        field2556++;
        if (arg0 != 1) {
            this.field2562 = null;
        }
        return this.field2546;
    }

    @OriginalMember(owner = "client!jda", name = "d", descriptor = "(I)V")
    public final void method1171(int arg0) {
        if (arg0 != 0) {
            field2548 = -123;
        }
        this.field2562.method1641(-5681);
        field2558++;
        this.field2561.method528(-519011192);
        this.field2546 = this.field2550;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(Luk;I)V")
    private final void method1172(class221 arg0, int arg1) {
        field2551++;
        long var3 = arg0.method1428(79);
        int var5 = -97 % ((67 - arg1) / 33);
        for (class269 var6 = (class269) this.field2561.method524((byte) 100, var3); var6 != null; var6 = (class269) this.field2561.method526(2)) {
            if (var6.field3772.method1427(arg0, 23593)) {
                this.method1169(-28584, var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(I)V")
    public class193(int arg0) {
        this.field2546 = arg0;
        this.field2550 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field2561 = new class80(var2);
    }

    @OriginalMember(owner = "client!jda", name = "e", descriptor = "(I)V")
    public static final void method1173(int arg0) {
        class608.field8879 = new class631(class514.field7492.method2902(class35.field396, -20139), "", class595.field8697, 1004, -1, 0L, 0, arg0, true, false);
        field2549++;
    }
}

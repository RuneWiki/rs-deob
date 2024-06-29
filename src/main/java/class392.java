import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class392 {

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "Lfi;")
    public static class166 field5496 = new class166();

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field5501 = 0;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field5494;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "Lrk;")
    public static class427 field5499;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "[[I")
    public static int[][] field5495;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V", line = 9)
    public static final void method2415(int arg0, int arg1) {
        field5500++;
        class329 var2 = (class329) class19.field374.method614(-115, (long) arg0);
        if (var2 == null) {
            return;
        }
        int var3 = 64 % ((arg1 - 52) / 34);
        for (int var4 = 0; var4 < var2.field4472.length; var4++) {
            var2.field4472[var4] = -1;
            var2.field4473[var4] = 0;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)I", line = 37)
    public static final int method2416(boolean arg0) {
        if (!arg0) {
            field5499 = null;
        }
        field5502++;
        return class404.field5625;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILjava/awt/Canvas;ILpg;)Lpe;", line = 48)
    public static final class391 method2417(int arg0, Canvas arg1, int arg2, class112 arg3) {
        field5493++;
        return arg2 == 1584852583 ? new class425(arg1, arg3, arg0) : null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLrk;Lrk;Z)V", line = 59)
    public static final void method2418(byte arg0, class427 arg1, class427 arg2, boolean arg3) {
        field5497++;
        class124.field1742 = arg2;
        class328.field4457 = arg3;
        int var4 = 56 % ((11 - arg0) / 51);
        class291.field3954 = arg1;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIII)V", line = 75)
    public static final void method2419(int arg0, int arg1, int arg2, int arg3) {
        field5494++;
        if (class118.field1653 == null) {
            return;
        }
        long var4 = (long) (arg2 | arg1 << 28 | arg0 << 14);
        class396 var6 = (class396) class451.field6514.method614(-93, var4);
        if (var6 == null) {
            class190.method1364(arg1, arg2, arg0);
            return;
        }
        class346 var7 = (class346) var6.field5549.method1240((byte) -83);
        if (var7 == null) {
            class190.method1364(arg1, arg2, arg0);
            return;
        }
        class352 var8 = (class352) class190.method1364(arg1, arg2, arg0);
        if (arg3 >= -22) {
            method2420(25);
        }
        if (var8 == null) {
            var8 = new class352();
        } else {
            var8.field4804 = var8.field4807 = -1;
        }
        var8.field4809 = var7.field4688;
        var8.field4811 = var7.field4684;
        label48: while (true) {
            class346 var9 = (class346) var6.field5549.method1245(1);
            if (var9 == null) {
                break;
            }
            if (var8.field4811 != var9.field4684) {
                var8.field4804 = var9.field4684;
                var8.field4812 = var9.field4688;
                while (true) {
                    class346 var10 = (class346) var6.field5549.method1245(1);
                    if (var10 == null) {
                        break label48;
                    }
                    if (var8.field4811 != var10.field4684 && var8.field4804 != var10.field4684) {
                        var8.field4807 = var10.field4684;
                        var8.field4806 = var10.field4688;
                    }
                }
            }
        }
        int var11 = class22.method281(1, arg1, (arg0 << 7) + 64, (arg2 << 7) + 64);
        class256.method1670(arg1, arg2, arg0, var11, var8);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V", line = 153)
    public static void method2420(int arg0) {
        field5496 = null;
        field5495 = null;
        field5499 = null;
        if (arg0 != 1584852583) {
            field5495 = null;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class525 {

    @OriginalMember(owner = "client!aaa", name = "i", descriptor = "Lsw;")
    private class641 field7356 = new class641(16);

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "Ldn;")
    private class438 field7350;

    @OriginalMember(owner = "client!aaa", name = "e", descriptor = "Lcea;")
    public static class180 field7352 = new class180("Loaded SW3D", "SW3D geladen", "SW3D chargé", "SW3D carregado");

    @OriginalMember(owner = "client!aaa", name = "g", descriptor = "Lrg;")
    public static class548 field7354 = new class548(31, -1);

    @OriginalMember(owner = "client!aaa", name = "j", descriptor = "I")
    public static int field7357 = 1;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "I")
    public static int field7348;

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "I")
    public static int field7349;

    @OriginalMember(owner = "client!aaa", name = "d", descriptor = "I")
    public static int field7351;

    @OriginalMember(owner = "client!aaa", name = "f", descriptor = "I")
    public static int field7353;

    @OriginalMember(owner = "client!aaa", name = "h", descriptor = "I")
    public static int field7355;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)V", line = 5)
    public static void method2981(byte arg0) {
        field7354 = null;
        field7352 = null;
        if (arg0 < 32) {
            field7357 = 18;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)V", line = 16)
    public final void method2982(int arg0) {
        class641 var2 = this.field7356;
        synchronized (this.field7356) {
            this.field7356.method3694(0);
        }
        field7348++;
        int var3 = -43 % ((72 - arg0) / 34);
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Ltca;IIIII)Ldd;", line = 33)
    public final class601 method2983(class148 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7353++;
        class465[] var7 = null;
        if (arg5 != -20980) {
            this.method2983(null, 7, 52, -5, -118, 27);
        }
        class605 var8 = this.method2985(-1, arg1);
        if (var8.field8730 != null) {
            var7 = new class465[var8.field8730.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class405 var10 = arg0.method813(30, var8.field8730[var9]);
                var7[var9] = new class465(var10.field5318, var10.field5328, var10.field5320, var10.field5324, var10.field5325, var10.field5323, var10.field5329, var10.field5327);
            }
        }
        return new class601(var8.field8733, var7, var8.field8728, arg4, arg3, arg2);
    }

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(B)V", line = 67)
    public final void method2984(byte arg0) {
        class641 var2 = this.field7356;
        synchronized (this.field7356) {
            this.field7356.method3687(1402);
            int var3 = 109 / ((arg0 + 52) / 32);
        }
        field7355++;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(II)Lki;", line = 86)
    private final class605 method2985(int arg0, int arg1) {
        field7349++;
        if (arg0 != -1) {
            this.method2984((byte) -124);
        }
        class641 var3 = this.field7356;
        class605 var4;
        synchronized (this.field7356) {
            var4 = (class605) this.field7356.method3682(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class438 var5 = this.field7350;
        byte[] var6;
        synchronized (this.field7350) {
            var6 = this.field7350.method2558(arg0 ^ 0xFFFFFF9B, arg1, 29);
        }
        class605 var7 = new class605();
        if (var6 != null) {
            var7.method3482(new class374(var6), false);
        }
        class641 var8 = this.field7356;
        synchronized (this.field7356) {
            this.field7356.method3684(var7, 0, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZI)V", line = 115)
    public final void method2986(boolean arg0, int arg1) {
        field7351++;
        if (arg0) {
            this.method2985(73, 73);
        }
        class641 var3 = this.field7356;
        synchronized (this.field7356) {
            this.field7356.method3686((byte) 53, arg1);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lre;ILdn;)V", line = 138)
    public class525(class515 arg0, int arg1, class438 arg2) {
        this.field7350 = arg2;
        this.field7350.method2554(29, 124);
    }
}

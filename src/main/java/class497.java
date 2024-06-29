import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class497 {

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Lht;")
    private class410 field7315;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "J")
    public long field7320;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "J")
    public static long field7316 = 0L;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "[[F")
    public static float[][] field7321 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "Ltk;")
    public static class228 field7319 = new class228(14, 0, 4, 1);

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "[[B")
    public static byte[][] field7323 = new byte[250][];

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field7317;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field7318;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field7322;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "Luf;")
    public static class310 field7324;

    static {
        new class83("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lss;I)V", line = 3)
    public static final void method2932(class295 arg0, int arg1) {
        if (arg1 <= 46) {
            return;
        }
        field7317++;
        if (!class297.field4101) {
            return;
        }
        class322.field4450++;
        if (arg0.field3962 != null) {
            class295 var2 = class12.method106(class401.field5585, (byte) 78, class455.field6651);
            if (var2 != null) {
                class44 var3 = new class44();
                var3.field613 = arg0;
                var3.field610 = var2;
                var3.field612 = arg0.field3962;
                class475.method2798(var3);
            }
        }
        class356.method1978((byte) 108, class154.field2211);
        class244.field3395.method2074(false, arg0.field4073);
        class244.field3395.method2072(-733958872, class20.field202);
        class244.field3395.method2072(-733958872, arg0.field3936);
        class244.field3395.method2096(-186970568, class401.field5585);
        class244.field3395.method2072(-733958872, class455.field6651);
        class244.field3395.method2061(arg0.field4072, (byte) 99);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V", line = 43)
    public static void method2933(byte arg0) {
        field7321 = null;
        if (arg0 > -35) {
            method2933((byte) 2);
        }
        field7323 = null;
        field7319 = null;
        field7324 = null;
    }

    @OriginalMember(owner = "client!ed", name = "finalize", descriptor = "()V", line = 56)
    protected final void finalize() throws Throwable {
        this.field7315.method2436((byte) -65, this.field7320);
        field7322++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIII)V", line = 67)
    public static final void method2934(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class437 var7 = new class437();
        var7.field6371 = arg1 >> class34.field484;
        var7.field6378 = arg2 >> class34.field484;
        var7.field6380 = arg3 >> class34.field484;
        var7.field6376 = arg4 >> class34.field484;
        var7.field6375 = arg0;
        var7.field6382 = arg1;
        var7.field6363 = arg2;
        var7.field6369 = arg3;
        var7.field6387 = arg4;
        var7.field6368 = arg5;
        var7.field6386 = arg6;
        class300.field4131[class61.field835++] = var7;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIII)I", line = 92)
    public static final int method2935(int arg0, int arg1, int arg2, int arg3) {
        field7318++;
        if (arg3 > -124) {
            field7324 = null;
        }
        if (arg2 <= arg1) {
            return arg0 >= arg1 ? arg1 : arg0;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lht;J[Llo;)V", line = 108)
    public class497(class410 arg0, long arg1, class528[] arg2) {
        this.field7315 = arg0;
        this.field7320 = arg1;
    }
}

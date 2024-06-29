import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class268 extends class165 {

    @OriginalMember(owner = "client!sda", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field3766 = new String[100];

    @OriginalMember(owner = "client!sda", name = "t", descriptor = "Ljo;")
    public static class351 field3764 = new class351(62, 1);

    @OriginalMember(owner = "client!sda", name = "p", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!sda", name = "q", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!sda", name = "r", descriptor = "I")
    private int field3762;

    @OriginalMember(owner = "client!sda", name = "s", descriptor = "I")
    private int field3763;

    @OriginalMember(owner = "client!sda", name = "u", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!sda", name = "w", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!sda", name = "x", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(ILmia;)V")
    public final void method612(int arg0, class69 arg1) {
        arg1.method545(this.field3762, 4, this.field3763);
        if (arg0 > -100) {
            this.field3762 = -91;
        }
        field3761++;
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)V")
    public static void method1753(int arg0) {
        if (arg0 != 32296) {
            field3764 = null;
        }
        field3766 = null;
        field3764 = null;
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1754(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3767++;
        if (arg3 != 0) {
            method1756(-72, false, null);
        }
        if (class450.field6463 <= arg1 - arg4 && class285.field4372 >= (arg1 + arg4) && class738.field10297 <= (arg6 - arg4) && (arg4 + arg6) <= class414.field5846) {
            class727.method4084(arg2, arg6, arg0, arg1, -5833, arg4, arg5);
        } else {
            class690.method3885(arg4, arg5, -1, arg1, arg0, arg2, arg6);
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(Lrv;I)V")
    public final void method614(class120 arg0, int arg1) {
        field3768++;
        if (arg1 != 1070) {
            method1755(114);
        }
        this.field3762 = arg0.method871(23995);
        this.field3763 = arg0.method871(arg1 ^ 0x5995);
    }

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)V")
    public static final void method1755(int arg0) {
        if (arg0 == 24638) {
            class179.field2711 = false;
            field3765++;
            class149.method1028(-19376);
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(IZ[B)[B")
    public static final byte[] method1756(int arg0, boolean arg1, byte[] arg2) {
        field3760++;
        byte[] var3 = new byte[arg0];
        class42.method288(arg2, 0, var3, 0, arg0);
        if (!arg1) {
            field3766 = null;
        }
        return var3;
    }
}

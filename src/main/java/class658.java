import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class658 extends class289 {

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "Lik;")
    public static class207 field9019 = new class207();

    @OriginalMember(owner = "client!sv", name = "j", descriptor = "I")
    public static int field9021;

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "Lfv;")
    public static class120 field9018;

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "Lda;")
    public static class59 field9020;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V", line = 17)
    public static void method3615(int arg0) {
        field9019 = null;
        field9020 = null;
        if (arg0 != 1388) {
            field9018 = null;
        }
        field9018 = null;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIZLfp;I)V", line = 30)
    public static final void method3616(int arg0, int arg1, int arg2, boolean arg3, class323 arg4, int arg5) {
        field9021++;
        class737.method4122(arg3, arg0, (long) arg2, (byte) -105, arg1, arg5, arg4);
    }
}

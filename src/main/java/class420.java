import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class420 extends class689 {

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "I")
    public int field5515;

    @OriginalMember(owner = "client!mc", name = "C", descriptor = "I")
    public int field5519;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    public static int field5510 = -1;

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
    public static int field5513 = 0;

    @OriginalMember(owner = "client!mc", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field5517 = new String[100];

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!mc", name = "z", descriptor = "I")
    public static int field5516;

    @OriginalMember(owner = "client!mc", name = "D", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "[Lrc;")
    public static class29[] field5512;

    @OriginalMember(owner = "client!mc", name = "B", descriptor = "[[[Z")
    public static boolean[][][] field5518;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V", line = 10)
    public static final void method2371(int arg0) {
        if (class104.field1239 == null || class245.field3211 == null) {
            class245.field3211 = new int[256];
            class104.field1239 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class104.field1239[var1] = (int) (Math.sin(var2) * 4096.0D);
                class245.field3211[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 != 10779) {
            field5517 = null;
        }
        field5520++;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Ltl;Lfn;IIIIIIIIII)V", line = 43)
    public class420(class566 arg0, class286 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field5515 = arg11;
        this.field5519 = arg10;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)Ltca;", line = 63)
    public final class141 method421(int arg0) {
        if (arg0 == 4) {
            field5521++;
            return class692.field9759;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V", line = 80)
    public static void method2372(int arg0) {
        field5518 = null;
        field5512 = null;
        field5517 = null;
        if (arg0 != -611) {
            field5512 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(I)V", line = 92)
    public static final void method2373(int arg0) {
        field5516++;
        class223.field2892.method2512(-11558);
        class315.field4229 = 0;
        if (arg0 < 95) {
            field5512 = null;
        }
    }
}

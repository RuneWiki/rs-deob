import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class187 extends class404 {

    @OriginalMember(owner = "client!cu", name = "t", descriptor = "I")
    public int field2787 = -1;

    @OriginalMember(owner = "client!cu", name = "w", descriptor = "Lada;")
    public static class144 field2790;

    @OriginalMember(owner = "client!cu", name = "x", descriptor = "Z")
    public static boolean field2791;

    @OriginalMember(owner = "client!cu", name = "p", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!cu", name = "q", descriptor = "I")
    public int field2784;

    @OriginalMember(owner = "client!cu", name = "r", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!cu", name = "s", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!cu", name = "u", descriptor = "Ljava/lang/String;")
    public String field2788;

    @OriginalMember(owner = "client!cu", name = "v", descriptor = "Ljava/lang/String;")
    public String field2789;

    static {
        new class572("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
        field2790 = new class144(57, -1);
        field2791 = true;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IZIIZII)V", line = 4)
    public static final void method1288(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (~arg0 < ~arg3) {
            int var7 = (arg0 + arg3) / 2;
            int var8 = arg3;
            class187 var9 = class348.field4775[var7];
            class348.field4775[var7] = class348.field4775[arg0];
            class348.field4775[arg0] = var9;
            for (int var10 = arg3; ~arg0 < ~var10; ++var10) {
                if (class541.method3290(class348.field4775[var10], arg6, arg5, var9, arg1, arg4, 0) <= 0) {
                    class187 var11 = class348.field4775[var10];
                    class348.field4775[var10] = class348.field4775[var8];
                    class348.field4775[var8++] = var11;
                }
            }
            class348.field4775[arg0] = class348.field4775[var8];
            class348.field4775[var8] = var9;
            method1288(var8 + -1, arg1, 57, arg3, arg4, arg5, arg6);
            method1288(arg0, arg1, 57, var8 + 1, arg4, arg5, arg6);
        }
        if (arg2 != 57) {
            field2791 = true;
        }
        ++field2785;
    }

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "(I)V", line = 48)
    public static void method1289(int arg0) {
        field2790 = null;
        if (arg0 != -1) {
            field2790 = null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "(I)Lmn;", line = 64)
    public final class309 method1290(int arg0) {
        ++field2786;
        if (arg0 != -22585) {
            this.field2788 = null;
        }
        return class24.field227[super.field5518];
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(III)Z", line = 86)
    public static final boolean method1291(int arg0, int arg1, int arg2) {
        if (arg1 != 32768) {
            return true;
        } else {
            ++field2783;
            return (32768 & arg2) != 0;
        }
    }
}

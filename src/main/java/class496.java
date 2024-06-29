import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class496 implements class339 {

    @OriginalMember(owner = "client!va", name = "h", descriptor = "Lrea;")
    private class205 field7137;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public int field7136;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public int field7138;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "[I")
    public int[] field7134;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "Ltba;")
    private class160 field7135;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "[F")
    public float[] field7141;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "Lgda;")
    public static class53 field7131 = new class53(55, 6);

    @OriginalMember(owner = "client!va", name = "k", descriptor = "[Lhha;")
    public static class519[] field7140 = new class519[300];

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field7132;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field7133;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public static int field7139;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "Lqfa;")
    public static class98 field7130;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IZ)V")
    public static final void method2962(int arg0, boolean arg1) {
        field7139++;
        if (arg1) {
            return;
        }
        if (class549.field7670 == 1) {
            class79.field1013 = arg0;
        } else if (class549.field7670 == 2) {
            class62.field759 = arg0;
            return;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(IIIIIIZZ)V")
    public final void method2195(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        class635.method3532(arg0, arg3, this.field7137.field2666.field8349, this.field7137.field2666.field8351, arg6 ? this.field7134 : null, this.field7138, arg7 ? this.field7137.field2683 : null, arg1, arg2, -122, arg7 ? this.field7141 : null, arg4, arg5);
        field7133++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIIZZ)V")
    public final void method2194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        class635.method3532(arg0, arg3, this.field7134, this.field7138, arg6 ? this.field7137.field2666.field8349 : null, this.field7137.field2666.field8351, arg7 ? this.field7141 : null, arg1, arg2, -101, arg7 ? this.field7137.field2683 : null, arg4, arg5);
        field7132++;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public static void method2963(int arg0) {
        field7140 = null;
        field7130 = null;
        field7131 = null;
        if (arg0 != -7045) {
            field7131 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lrea;Loia;Ltba;)V")
    public class496(class205 arg0, class88 arg1, class160 arg2) {
        this.field7137 = arg0;
        if (arg1 instanceof class574) {
            class574 var4 = (class574) arg1;
            this.field7136 = var4.field6146;
            this.field7138 = var4.field6154;
            this.field7134 = var4.field8112;
        } else if ((arg1 instanceof class520)) {
            class520 var5 = (class520) arg1;
            this.field7136 = var5.field6146;
            this.field7134 = var5.field7386;
            this.field7138 = var5.field6154;
        } else {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            this.field7135 = arg2;
            if (this.field7135.field2204 != this.field7138 || this.field7135.field2205 != this.field7136) {
                throw new RuntimeException();
            }
            this.field7141 = this.field7135.field2207;
        }
    }
}

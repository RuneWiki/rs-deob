import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class465 extends class393 {

    @OriginalMember(owner = "client!vs", name = "m", descriptor = "Leo;")
    public static class423 field6838 = null;

    @OriginalMember(owner = "client!vs", name = "n", descriptor = "Lvi;")
    public static class476 field6839 = new class476();

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "I")
    public int field6834;

    @OriginalMember(owner = "client!vs", name = "k", descriptor = "I")
    public int field6836;

    @OriginalMember(owner = "client!vs", name = "l", descriptor = "I")
    public static int field6837;

    @OriginalMember(owner = "client!vs", name = "p", descriptor = "I")
    public int field6841;

    @OriginalMember(owner = "client!vs", name = "q", descriptor = "I")
    public static int field6842;

    @OriginalMember(owner = "client!vs", name = "s", descriptor = "I")
    public static int field6844;

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "Lrn;")
    public class242 field6835;

    @OriginalMember(owner = "client!vs", name = "r", descriptor = "[Laq;")
    public class530[] field6843;

    @OriginalMember(owner = "client!vs", name = "o", descriptor = "[[Z")
    public static boolean[][] field6840;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IILas;I)V", line = 5)
    public static final void method2805(int arg0, int arg1, class17 arg2, int arg3) {
        if (arg0 == 2092) {
            class521.field7736[arg3][arg1] = arg2;
            field6837++;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(III)V", line = 17)
    public static final void method2806(int arg0, int arg1, int arg2) {
        field6844++;
        class436 var3 = class459.method2712(7, arg0, -1759243680);
        var3.method2574((byte) 92);
        if (arg2 != 0) {
            field6839 = null;
        }
        var3.field5980 = arg1;
    }

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "(B)V", line = 33)
    public static void method2807(byte arg0) {
        field6838 = null;
        field6840 = null;
        field6839 = null;
        if (arg0 != 107) {
            method2807((byte) 84);
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIZLqa;)Z", line = 48)
    public final boolean method2808(int arg0, int arg1, boolean arg2, class129 arg3) {
        field6842++;
        if (this.field6843 != null) {
            for (int var5 = 0; var5 < this.field6843.length; var5++) {
                if (this.field6843[var5].method3142(arg1, arg0) && this.field6835.method179(arg1, false, arg0, arg3)) {
                    return true;
                }
            }
        }
        if (arg2) {
            this.field6836 = -10;
        }
        return false;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class604 extends class775 {

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "I")
    private int field8208 = -1;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "Lmga;")
    public static class739 field8205 = new class739(77, -1);

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
    public static int field8206;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "I")
    public static int field8207;

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
    public static int field8209;

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "[Lkaa;")
    public static class51[] field8210;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILjp;)V", line = 6)
    public final void method2934(int arg0, class376 arg1) {
        field8206++;
        this.field8208 = arg1.method2359(-1);
        if (arg0 != 3) {
            return;
        }
        arg1.method2398(arg0 ^ 0xAE2D8A0B);
        if (arg1.method2398(arg0 - 1372747259) != 255) {
            arg1.field5459--;
            arg1.method2366(true);
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V", line = 34)
    public static void method3354(int arg0) {
        if (arg0 != -1) {
            method3354(85);
        }
        field8210 = null;
        field8205 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BLhka;)V", line = 46)
    public final void method2935(byte arg0, class56 arg1) {
        arg1.method403(-1, this.field8208);
        field8209++;
        int var3 = 13 % ((arg0 + 58) / 57);
    }
}

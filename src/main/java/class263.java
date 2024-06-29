import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class263 {

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public static int field3816 = -1;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "Z")
    public static boolean field3809 = false;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public int field3817;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public int field3818;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    public int field3819;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "[I")
    public static int[] field3808;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "[I")
    public static int[] field3815;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "[[[B")
    public static byte[][][] field3812;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lqi;I)V")
    public final void method1683(class216 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1407(112);
            if (var3 == 0) {
                if (arg1 != -1) {
                    this.field3818 = 43;
                }
                field3813++;
                return;
            }
            this.method1684(var3, arg0, false);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILqi;Z)V")
    private final void method1684(int arg0, class216 arg1, boolean arg2) {
        if (arg0 == 1) {
            this.field3818 = arg1.method1380(!arg2);
            this.field3819 = arg1.method1407(118);
            this.field3817 = arg1.method1407(118);
        }
        if (arg2) {
            method1685(-41);
        }
        field3820++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public static void method1685(int arg0) {
        field3808 = null;
        field3812 = null;
        if (arg0 == 29999) {
            field3815 = null;
        }
    }
}

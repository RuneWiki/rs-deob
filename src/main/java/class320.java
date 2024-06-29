import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class320 extends class435 {

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "I")
    public int field4263 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!sl", name = "t", descriptor = "I")
    public int field4270 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!sl", name = "s", descriptor = "I")
    public int field4269 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "I")
    public int field4264 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!sl", name = "q", descriptor = "I")
    public int field4267 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "I")
    public int field4266 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!sl", name = "w", descriptor = "I")
    public int field4273 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
    public int field4262 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!sl", name = "v", descriptor = "Lql;")
    public class519 field4272;

    @OriginalMember(owner = "client!sl", name = "r", descriptor = "Lhn;")
    public static class509 field4268 = new class509(50);

    @OriginalMember(owner = "client!sl", name = "u", descriptor = "[[[I")
    public static int[][][] field4271 = new int[2][][];

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)V")
    public static void method1897(int arg0) {
        if (arg0 != Integer.MAX_VALUE) {
            method1897(29);
        }
        field4268 = null;
        field4271 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IZI)Z")
    public final boolean method1898(int arg0, boolean arg1, int arg2) {
        field4265++;
        if (arg1) {
            this.field4264 = -11;
        }
        if (arg0 >= this.field4264 && this.field4273 >= arg0 && this.field4266 <= arg2 && arg2 <= this.field4267) {
            return true;
        } else {
            return arg0 >= this.field4262 && this.field4269 >= arg0 && this.field4270 <= arg2 && arg2 <= this.field4263;
        }
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lql;)V")
    public class320(class519 arg0) {
        this.field4272 = arg0;
    }
}

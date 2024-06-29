import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class408 extends class5 {

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public int field6190 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    public int field6195 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public int field6189 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    public int field6191 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public int field6192 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    public int field6196 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
    public int field6200 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    public int field6197 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "Lfb;")
    public class484 field6198;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "S")
    public static short field6193 = 256;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)Z")
    public final boolean method2519(int arg0, int arg1, int arg2) {
        field6199++;
        if (this.field6190 <= arg0 && this.field6191 >= arg0 && arg2 >= this.field6192 && this.field6189 >= arg2) {
            return true;
        } else if (arg0 >= this.field6195 && arg0 <= this.field6200 && arg2 >= this.field6196 && this.field6197 >= arg2) {
            return true;
        } else {
            if (arg1 != 0) {
                this.method2519(-1, -20, -43);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II[B)I")
    public static final int method2520(int arg0, int arg1, byte[] arg2) {
        if (arg0 == 8679) {
            field6194++;
            return class534.method3162(105, 0, arg1, arg2);
        } else {
            return -108;
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lfb;)V")
    public class408(class484 arg0) {
        this.field6198 = arg0;
    }
}

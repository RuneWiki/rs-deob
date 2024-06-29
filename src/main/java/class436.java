import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class436 extends class435 {

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    public int field6269 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
    public int field6274 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public int field6272 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    public int field6275 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    public int field6276 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public int field6273 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public int field6270 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "I")
    public int field6283 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "Lfu;")
    public class66 field6280;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "Z")
    public static boolean field6278 = false;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    public static int field6277 = 2;

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
    public static int field6282 = -1;

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "Lod;")
    public static class673 field6281;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "[[B")
    public static byte[][] field6271;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)Z")
    public final boolean method2556(int arg0, int arg1, int arg2) {
        field6279++;
        if (this.field6273 <= arg2 && arg2 <= this.field6269 && arg0 >= this.field6283 && arg0 <= this.field6274) {
            return true;
        } else if (arg2 >= this.field6270 && this.field6275 >= arg2 && this.field6276 <= arg0 && arg0 <= this.field6272) {
            return true;
        } else {
            if (arg1 > -18) {
                this.field6276 = 11;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static void method2557(int arg0) {
        if (arg0 != Integer.MAX_VALUE) {
            field6282 = 93;
        }
        field6271 = null;
        field6281 = null;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lfu;)V")
    public class436(class66 arg0) {
        this.field6280 = arg0;
    }
}

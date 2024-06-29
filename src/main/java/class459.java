import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class459 extends class504 {

    @OriginalMember(owner = "client!np", name = "i", descriptor = "I")
    public int field6221 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!np", name = "j", descriptor = "I")
    public int field6222 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!np", name = "m", descriptor = "I")
    public int field6225 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!np", name = "r", descriptor = "I")
    public int field6230 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!np", name = "p", descriptor = "I")
    public int field6228 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!np", name = "k", descriptor = "I")
    public int field6223 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!np", name = "o", descriptor = "I")
    public int field6227 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!np", name = "s", descriptor = "I")
    public int field6231 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!np", name = "l", descriptor = "Lub;")
    public class20 field6224;

    @OriginalMember(owner = "client!np", name = "n", descriptor = "I")
    public static int field6226;

    @OriginalMember(owner = "client!np", name = "q", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IBI)Z")
    public final boolean method2613(int arg0, byte arg1, int arg2) {
        field6226++;
        if (arg0 >= this.field6231 && arg0 <= this.field6222 && arg2 >= this.field6225 && arg2 <= this.field6221) {
            return true;
        } else if (arg0 >= this.field6230 && arg0 <= this.field6227 && arg2 >= this.field6223 && this.field6228 >= arg2) {
            return true;
        } else {
            int var4 = -87 % ((arg1 - 38) / 56);
            return false;
        }
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(IBI)Z")
    public static final boolean method2614(int arg0, byte arg1, int arg2) {
        if (arg1 >= -92) {
            return false;
        } else {
            field6229++;
            return (arg0 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lub;)V")
    public class459(class20 arg0) {
        this.field6224 = arg0;
    }
}

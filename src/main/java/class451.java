import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class451 {

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "B")
    private byte field6631;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public int field6634;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public int field6628;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public int field6629;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public int field6636;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public int field6627;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "[I")
    public static int[] field6632 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field6633;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field6635;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "[I")
    public static int[] field6630;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)I")
    public final int method2626(boolean arg0) {
        if (arg0) {
            field6633++;
            return (this.field6631 & 0x8) == 8 ? 1 : 0;
        } else {
            return -50;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static void method2627(byte arg0) {
        if (arg0 != -35) {
            field6630 = null;
        }
        field6630 = null;
        field6632 = null;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
    public class451() {
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lgk;)V")
    public class451(class468 arg0) {
        this.field6631 = arg0.method2714((byte) -53);
        this.field6634 = arg0.method2727((byte) 43);
        this.field6628 = arg0.method2722(false);
        this.field6629 = arg0.method2722(false);
        this.field6636 = arg0.method2722(false);
        this.field6627 = arg0.method2722(false);
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)I")
    public final int method2628(byte arg0) {
        field6635++;
        if (arg0 > -96) {
            method2627((byte) -58);
        }
        return this.field6631 & 0x7;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class381 extends class329 {

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public int field4809 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public int field4812 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public int field4810 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public int field4805 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public int field4811 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public int field4814 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public int field4813 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
    public int field4816 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "Lvb;")
    public class316 field4807;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "Z")
    public static boolean field4815 = false;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "Ljda;")
    public static class300 field4817;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "Lpl;")
    public static class612 field4806;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2063(int arg0, byte arg1, int arg2) {
        field4818++;
        if (arg1 >= -118) {
            field4806 = null;
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)Z")
    public final boolean method2064(int arg0, int arg1, int arg2) {
        field4808++;
        if (arg0 != 0) {
            this.method2064(116, 31, -78);
        }
        if (arg1 >= this.field4811 && this.field4810 >= arg1 && this.field4814 <= arg2 && arg2 <= this.field4812) {
            return true;
        } else {
            return this.field4809 <= arg1 && this.field4816 >= arg1 && this.field4805 <= arg2 && this.field4813 >= arg2;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method2065(int arg0) {
        field4817 = null;
        field4806 = null;
        if (arg0 >= -52) {
            method2063(-62, (byte) -102, 112);
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lvb;)V")
    public class381(class316 arg0) {
        this.field4807 = arg0;
    }
}

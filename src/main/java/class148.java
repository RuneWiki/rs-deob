import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class148 extends class6 {

    @OriginalMember(owner = "client!tba", name = "B", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!tba", name = "Lb", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!tba", name = "Mb", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!tba", name = "Nb", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!tba", name = "Ob", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!tba", name = "Pb", descriptor = "Ljava/lang/String;")
    public static String field2467;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Ljava/lang/String;CI)I", line = 4)
    public static final int method1240(String arg0, char arg1, int arg2) {
        if (arg2 != 1165985528) {
            field2467 = null;
        }
        ++field2466;
        int var3 = 0;
        int var4 = arg0.length();
        for (int var5 = 0; ~var4 < ~var5; ++var5) {
            if (~arg0.charAt(var5) == ~arg1) {
                ++var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(BF)V", line = 31)
    public final void method1241(byte arg0, float arg1) {
        if (arg0 < -55) {
            ++field2464;
            int var3 = Stream.floatToRawIntBits(arg1);
            super.field96[super.field57++] = (byte) (var3 >> 24);
            super.field96[super.field57++] = (byte) (var3 >> 16);
            super.field96[super.field57++] = (byte) (var3 >> 8);
            super.field96[super.field57++] = (byte) var3;
        }
    }

    @OriginalMember(owner = "client!tba", name = "f", descriptor = "(Z)V", line = 48)
    public static final void method1242(boolean arg0) {
        class437.field6663.method1562((byte) -127);
        if (arg0) {
            method1240((String) null, (char) 65463, -41);
        }
        ++field2463;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(IF)V", line = 60)
    public final void method1243(int arg0, float arg1) {
        ++field2462;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field96[super.field57++] = (byte) var3;
        super.field96[super.field57++] = (byte) (var3 >> 8);
        if (arg0 >= -55) {
            field2465 = -96;
        }
        super.field96[super.field57++] = (byte) (var3 >> 16);
        super.field96[super.field57++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!tba", name = "w", descriptor = "(I)V", line = 76)
    public static void method1244(int arg0) {
        field2467 = null;
        if (arg0 != -5471) {
            field2467 = null;
        }
    }

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(I)V", line = 87)
    public class148(int arg0) {
        super(arg0);
    }
}

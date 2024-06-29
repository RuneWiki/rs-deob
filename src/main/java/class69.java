import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class69 extends class160 {

    @OriginalMember(owner = "client!rc", name = "Z", descriptor = "J")
    public static long field1118 = 0L;

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!rc", name = "U", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!rc", name = "V", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!rc", name = "W", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!rc", name = "X", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!rc", name = "Y", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!rc", name = "S", descriptor = "[I")
    public static int[] field1111;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)[I")
    public final int[] method1(int arg0, byte arg1) {
        ++field1112;
        if (arg1 != 57) {
            field1118 = -69L;
        }
        int[] var3 = super.field2488.method15((byte) 125, arg0);
        if (super.field2488.field42) {
            class175.method1191(var3, 0, class240.field3896, class103.field1713[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(II)Lma;")
    public static final class193 method501(int arg0, int arg1) {
        ++field1116;
        class193 var2 = (class193) class8.field163.method1887(arg0, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class218.field3372.method1590(class62.method468(arg1, (byte) 100), (byte) -25, class116.method822(arg1, -1));
            class193 var4 = new class193();
            var4.field3024 = arg1;
            if (var3 != null) {
                var4.method1307(-41, new class88(var3));
            }
            var4.method1313(8009);
            if (var4.field3045) {
                var4.field3057 = 0;
                var4.field3058 = false;
            }
            if (!class97.field1632 && var4.field3041) {
                var4.field3035 = null;
            }
            class8.field163.method1886(-118, (long) arg1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
    public class69() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)V")
    public static void method502(int arg0) {
        field1111 = null;
        if (arg0 != 0) {
            method501(-49, 127);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[BI)I")
    public static final int method503(int arg0, byte[] arg1, int arg2) {
        if (arg2 != 0) {
            return -17;
        } else {
            ++field1113;
            return class104.method751(0, arg1, arg0, arg2 ^ -1904512632);
        }
    }
}

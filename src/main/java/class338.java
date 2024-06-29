import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class338 extends class96 {

    @OriginalMember(owner = "client!jq", name = "M", descriptor = "[B")
    public static byte[] field4929 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!jq", name = "E", descriptor = "Lgn;")
    public static class475 field4921 = new class475(5, -1);

    @OriginalMember(owner = "client!jq", name = "B", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!jq", name = "C", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!jq", name = "D", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!jq", name = "F", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!jq", name = "H", descriptor = "I")
    public int field4924;

    @OriginalMember(owner = "client!jq", name = "I", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!jq", name = "J", descriptor = "I")
    public int field4926;

    @OriginalMember(owner = "client!jq", name = "K", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!jq", name = "L", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!jq", name = "N", descriptor = "I")
    public int field4930;

    @OriginalMember(owner = "client!jq", name = "G", descriptor = "Ljava/lang/String;")
    public String field4923;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
    public final void method2048(int arg0) {
        ++field4928;
        super.field1291 = Long.MIN_VALUE & super.field1291 | class109.method653(false) - -500L;
        class151.field1952.method2342((byte) 49, this);
        int var2 = -62 / ((arg0 - 81) / 40);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method2049(String arg0, int arg1) {
        if (arg1 >= -49) {
            return null;
        } else {
            ++field4919;
            String var2 = class340.method2065(0, class422.method2505(65, arg0));
            if (var2 == null) {
                var2 = "";
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)V")
    public static final void method2050(int arg0, int arg1) {
        ++field4925;
        if (arg0 <= 67) {
            method2049((String) null, 3);
        }
        class338 var2 = class380.method2294((byte) 106, arg1, 2);
        var2.method2048(-121);
    }

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "(I)J")
    public final long method2051(int arg0) {
        if (arg0 != 0) {
            return 127L;
        } else {
            ++field4920;
            return super.field1291 & Long.MAX_VALUE;
        }
    }

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "(B)V")
    public final void method2052(byte arg0) {
        super.field1291 |= Long.MIN_VALUE;
        ++field4918;
        int var2 = -39 / ((38 - arg0) / 33);
        if (~this.method2051(0) == -1L) {
            class134.field1710.method2342((byte) 48, this);
        }
    }

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "(B)I")
    public final int method2053(byte arg0) {
        if (arg0 >= -93) {
            method2055(-5);
        }
        ++field4927;
        return (int) super.field1177;
    }

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "(Z)I")
    public final int method2054(boolean arg0) {
        ++field4922;
        return arg0 ? -111 : (int) (super.field1177 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(II)V")
    public class338(int arg0, int arg1) {
        super.field1177 = (long) arg1 | (long) arg0 << 32;
    }

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "(I)V")
    public static void method2055(int arg0) {
        int var1 = 29 / ((arg0 - -33) / 38);
        field4929 = null;
        field4921 = null;
    }
}

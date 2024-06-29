import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class399 extends class447 {

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
    public static int field5832 = 0;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
    public int field5829;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
    public static int field5833;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
    public static int field5836;

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "I")
    public int field5837;

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "I")
    public static int field5838;

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "I")
    public int field5842;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "Ljava/lang/String;")
    public static String field5830;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "Ljava/lang/String;")
    public String field5834;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "[[[B")
    public static byte[][][] field5841;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(B)J", line = 8)
    public final long method2579(byte arg0) {
        ++field5836;
        if (arg0 != -89) {
            method2581('P', 21);
        }
        return Long.MAX_VALUE & super.field6446;
    }

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "(B)I", line = 19)
    public final int method2580(byte arg0) {
        if (arg0 != 8) {
            return 95;
        } else {
            ++field5835;
            return (int) (super.field5363 >>> 32 & 255L);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(CI)C", line = 30)
    public static final char method2581(char arg0, int arg1) {
        int var2 = -38 % ((85 - arg1) / 37);
        ++field5833;
        return arg0 != 181 && arg0 != 402 ? Character.toTitleCase(arg0) : arg0;
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V", line = 46)
    public final void method2582(int arg0) {
        ++field5838;
        if (arg0 != 0) {
            method2581('y', -91);
        }
        super.field6446 = Long.MIN_VALUE & super.field6446 | class224.method1425(arg0 ^ -26805) - -500L;
        class61.field879.method1530(this, true);
    }

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "(B)V", line = 59)
    public final void method2583(byte arg0) {
        super.field6446 |= Long.MIN_VALUE;
        ++field5831;
        if (this.method2579((byte) -89) == 0L) {
            class103.field1556.method1530(this, true);
        }
        if (arg0 != 71) {
            field5830 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)I", line = 83)
    public final int method2584(int arg0) {
        ++field5839;
        int var2 = -117 % ((-15 - arg0) / 52);
        return (int) super.field5363;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V", line = 100)
    public static final void method2585(boolean arg0) {
        class142.method968(false, -43);
        if (arg0) {
            ++field5840;
            if (class340.field4751 >= 0 && ~class340.field4751 != -1) {
                class99.method702(-17666, class340.field4751);
                class340.field4751 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(II)V", line = 117)
    public class399(int arg0, int arg1) {
        super.field5363 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "(B)V", line = 125)
    public static void method2586(byte arg0) {
        field5830 = null;
        field5841 = null;
        if (arg0 != -28) {
            field5832 = -127;
        }
    }
}

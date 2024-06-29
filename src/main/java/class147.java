import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class147 extends class86 {

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "[I")
    public static int[] field2246 = new int[1000];

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
    public int field2240;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
    public int field2241;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!ab", name = "E", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "I")
    public int field2249;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "Ljava/lang/String;")
    public String field2244;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)I", line = 4)
    public final int method1092(int arg0) {
        field2248++;
        return arg0 == 9279 ? (int) this.field3418 : -99;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)I", line = 15)
    public final int method1093(int arg0) {
        field2242++;
        return arg0 == 2128688288 ? (int) (this.field3418 >>> 32 & 0xFFL) : -14;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZLlb;Llb;Lqf;)V", line = 34)
    public static final void method1094(boolean arg0, class211 arg1, class211 arg2, class148 arg3) {
        class137.field2133 = arg1;
        if (arg0) {
            method1097((byte) 81);
        }
        class326.field5070 = arg2;
        field2243++;
        class10.field102 = arg3;
        if (class137.field2133 != null) {
            class310.field4835 = class137.field2133.method1523(9271, 1);
        }
        if (class326.field5070 != null) {
            class178.field2673 = class326.field5070.method1523(9271, 1);
        }
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V", line = 55)
    public final void method1095(int arg0) {
        field2239++;
        if (arg0 >= 68) {
            this.field1262 |= Long.MIN_VALUE;
            if (this.method1100(false) == 0L) {
                class230.field3563.method1076(this, (byte) -63);
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(III)V", line = 69)
    public static final void method1096(int arg0, int arg1, int arg2) {
        class244.field3682 = true;
        class116.field1817 = arg0;
        class63.field952 = arg1;
        class91.field1318 = arg2;
        class207.field3265 = -1;
        class160.field2385 = -1;
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(B)V", line = 79)
    public static void method1097(byte arg0) {
        if (arg0 != 75) {
            field2245 = -8;
        }
        field2246 = null;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(II)I", line = 89)
    public static int method1098(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)V", line = 97)
    public final void method1099(int arg0) {
        field2247++;
        if (arg0 >= -68) {
            this.method1092(106);
        }
        this.field1262 = class234.method1650((byte) 127) + 500L | this.field1262 & Long.MIN_VALUE;
        class227.field3508.method1076(this, (byte) -114);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)J", line = 110)
    public final long method1100(boolean arg0) {
        field2238++;
        if (arg0) {
            this.method1092(103);
        }
        return Long.MAX_VALUE & this.field1262;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(II)V", line = 127)
    public class147(int arg0, int arg1) {
        this.field3418 = (long) arg1 | (long) arg0 << 32;
    }
}

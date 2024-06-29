import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class383 extends class207 {

    @OriginalMember(owner = "client!uv", name = "m", descriptor = "[I")
    public static int[] field5567 = new int[1000];

    @OriginalMember(owner = "client!uv", name = "g", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!uv", name = "h", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!uv", name = "i", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!uv", name = "j", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!uv", name = "k", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!uv", name = "l", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!uv", name = "n", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!uv", name = "o", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V")
    public final void method37(int arg0) {
        if (super.field2668.method2254(48)) {
            super.field2669 = 0;
        }
        ++field5561;
        int var2 = 85 / ((arg0 - -58) / 48);
        if (super.field2669 < 0 && ~super.field2669 < -3) {
            super.field2669 = this.method36(-120);
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)Z")
    public final boolean method2376(byte arg0) {
        ++field5565;
        if (super.field2668.method2254(62)) {
            return false;
        } else {
            return arg0 != 8 ? true : true;
        }
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(I)I")
    public final int method36(int arg0) {
        ++field5568;
        if (arg0 > -14) {
            field5567 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "(I)I")
    public final int method2377(int arg0) {
        ++field5566;
        if (arg0 != 43) {
            this.method39(126, (byte) 48);
        }
        return super.field2669;
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lrd;)V")
    public class383(class355 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(IB)I")
    public final int method39(int arg0, byte arg1) {
        ++field5562;
        if (super.field2668.method2254(124)) {
            return 3;
        } else if (arg0 != 0 && ~super.field2668.field5147.method3686(43) != -2) {
            if (arg1 != 69) {
                field5567 = null;
            }
            return 2;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(ILrd;)V")
    public class383(int arg0, class355 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(B)V")
    public static void method2378(byte arg0) {
        int var1 = 53 / ((68 - arg0) / 51);
        field5567 = null;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IB)V")
    public final void method41(int arg0, byte arg1) {
        ++field5569;
        if (arg1 > -7) {
            field5567 = null;
        }
        super.field2669 = arg0;
    }

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "(I)V")
    public static final void method2379(int arg0) {
        class125.field1721.method2255(true, 1, class125.field1721.field5170);
        ++field5563;
        class125.field1721.method2255(true, 1, class125.field1721.field5155);
        class125.field1721.method2255(true, 2, class125.field1721.field5168);
        class125.field1721.method2255(true, 2, class125.field1721.field5172);
        class125.field1721.method2255(true, 1, class125.field1721.field5166);
        class125.field1721.method2255(true, 1, class125.field1721.field5147);
        class125.field1721.method2255(true, 1, class125.field1721.field5163);
        class125.field1721.method2255(true, 1, class125.field1721.field5153);
        class125.field1721.method2255(true, 1, class125.field1721.field5134);
        class125.field1721.method2255(true, 1, class125.field1721.field5167);
        class125.field1721.method2255(true, 1, class125.field1721.field5156);
        class125.field1721.method2255(true, 1, class125.field1721.field5160);
        class125.field1721.method2255(true, 0, class125.field1721.field5188);
        class125.field1721.method2255(true, 1, class125.field1721.field5171);
        if (arg0 != -2) {
            field5567 = null;
        }
        class125.field1721.method2255(true, 0, class125.field1721.field5174);
        class125.field1721.method2255(true, 0, class125.field1721.field5184);
        class125.field1721.method2255(true, 1, class125.field1721.field5175);
        class125.field1721.method2255(true, 0, class125.field1721.field5144);
        class125.field1721.method2255(true, 0, class125.field1721.field5164);
        class87.method698((byte) 101);
        class125.field1721.method2255(true, 1, class125.field1721.field5182);
        class125.field1721.method2255(true, 3, class125.field1721.field5137);
        class380.method2369((byte) 22);
        class697.method3787(-89);
        class130.field1794 = true;
    }
}

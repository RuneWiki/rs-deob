import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class456 extends class334 {

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
    public static int field7043 = 0;

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "[Lhw;")
    public static class208[] field7044 = new class208[2048];

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "I")
    public static int field7034;

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
    public static int field7035;

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
    public static int field7036;

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "I")
    public static int field7038;

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "I")
    public int field7039;

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
    public static int field7040;

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
    public int field7041;

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "I")
    public int field7042;

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "I")
    public static int field7045;

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "Ljava/lang/String;")
    public String field7037;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
    public final void method2858(int arg0) {
        super.field5226 |= Long.MIN_VALUE;
        if (arg0 != 10250) {
            this.field7041 = 82;
        }
        ++field7038;
        if (this.method2864((byte) 73) == 0L) {
            class209.field3224.method2731(this, (byte) 49);
        }
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V")
    public static void method2859(int arg0) {
        field7044 = null;
        if (arg0 != 0) {
            method2860(-22, 117);
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)V")
    public static final void method2860(int arg0, int arg1) {
        int var2 = 94 / ((arg1 - 24) / 34);
        ++field7040;
        if (!class141.field1911.field6115) {
            arg0 = -1;
        }
        if (~class96.field1396 != ~arg0) {
            if (arg0 != -1) {
                class335 var3 = class359.field5569.method1765(arg0, 64);
                class175 var4 = var3.method2227((byte) 61);
                if (var4 != null) {
                    class339.field5294.method33(var4.method1113(), class320.field4980, var4.method1105(), (byte) 113, var4.method1107(), new Point(var3.field5236, var3.field5233));
                    class96.field1396 = arg0;
                } else {
                    arg0 = -1;
                }
            }
            if (~arg0 == 0 && ~class96.field1396 != 0) {
                class339.field5294.method33(-1, class320.field4980, -1, (byte) 113, (int[]) null, new Point());
                class96.field1396 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)I")
    public final int method2861(byte arg0) {
        ++field7036;
        return arg0 <= 121 ? -15 : (int) super.field7780;
    }

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "(I)V")
    public final void method2862(int arg0) {
        super.field5226 = 500L + class246.method1705((byte) 28) | super.field5226 & Long.MIN_VALUE;
        ++field7045;
        if (arg0 != 0) {
            this.method2862(-21);
        }
        class183.field2656.method2731(this, (byte) 49);
    }

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "(I)I")
    public final int method2863(int arg0) {
        ++field7035;
        if (arg0 != -1647452576) {
            this.method2861((byte) -49);
        }
        return (int) (super.field7780 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)J")
    public final long method2864(byte arg0) {
        ++field7034;
        int var2 = 112 % ((arg0 - -8) / 40);
        return super.field5226 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(II)V")
    public class456(int arg0, int arg1) {
        super.field7780 = (long) arg0 << 32 | (long) arg1;
    }
}

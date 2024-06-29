import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class294 extends class27 {

    @OriginalMember(owner = "client!li", name = "L", descriptor = "Ljava/lang/String;")
    public static String field3847 = "";

    @OriginalMember(owner = "client!li", name = "F", descriptor = "B")
    public byte field3842;

    @OriginalMember(owner = "client!li", name = "E", descriptor = "I")
    public int field3841;

    @OriginalMember(owner = "client!li", name = "I", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!li", name = "J", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!li", name = "K", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!li", name = "M", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!li", name = "N", descriptor = "Lmd;")
    public class379 field3849;

    @OriginalMember(owner = "client!li", name = "G", descriptor = "[I")
    public static int[] field3843;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V", line = 5)
    public static void method1719(int arg0) {
        field3847 = null;
        field3843 = null;
        if (arg0 != -25231) {
            method1720((byte) 17, -126);
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BI)I", line = 19)
    public static final int method1720(byte arg0, int arg1) {
        ++field3844;
        if (arg1 == 16711935) {
            return -1;
        } else {
            if (arg0 != -101) {
                method1719(-49);
            }
            return class227.method1419(arg0 + -14068, arg1);
        }
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(B)[B", line = 38)
    public final byte[] method227(byte arg0) {
        ++field3848;
        if (arg0 != 41) {
            return null;
        } else if (!super.field456 && ~(this.field3849.field5152.length + -this.field3842) >= ~this.field3849.field5173) {
            return this.field3849.field5152;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III)Z", line = 56)
    public static final boolean method1721(int arg0, int arg1, int arg2) {
        ++field3846;
        if (arg1 != -15363) {
            method1720((byte) -70, 83);
        }
        return ~(2048 & arg2) != -1 && ~(arg0 & 55) != -1;
    }

    @OriginalMember(owner = "client!li", name = "f", descriptor = "(B)I", line = 68)
    public final int method229(byte arg0) {
        ++field3845;
        if (this.field3849 == null) {
            return 0;
        } else {
            if (arg0 >= -99) {
                method1721(37, 20, 14);
            }
            return this.field3849.field5173 * 100 / (this.field3849.field5152.length + -this.field3842);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class99 extends class384 implements class630 {

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    private int field1186;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)I", line = 4)
    public final int method720(boolean arg0) {
        if (!arg0) {
            return 80;
        } else {
            ++field1191;
            return this.field1186;
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Leea;I[BI)V", line = 15)
    public class99(class131 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field1186 = arg1;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)I", line = 26)
    public final int method721(int arg0) {
        if (arg0 != -23198) {
            method723(-1, -9, false, 37, 87, -109);
        }
        ++field1187;
        return 0;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)J", line = 37)
    public final long method722(byte arg0) {
        ++field1188;
        if (arg0 != -27) {
            this.method721(-12);
        }
        return super.field5474.getAddress();
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIZIII)V", line = 50)
    public static final void method723(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        ++field1189;
        int var6 = -arg0 + arg1;
        int var7 = -arg5 + arg4;
        if (~var6 != -1) {
            if (~var7 == -1) {
                class682.method3819(arg3, arg1, arg5, -114, arg0);
            } else {
                int var8 = (var7 << 12) / var6;
                int var9 = -(arg0 * var8 >> 12) + arg5;
                int var10;
                int var11;
                if (~class71.field960 < ~arg0) {
                    var10 = class71.field960;
                    var11 = (class71.field960 * var8 >> 12) + var9;
                } else if (class549.field7665 >= arg0) {
                    var11 = arg5;
                    var10 = arg0;
                } else {
                    var10 = class549.field7665;
                    var11 = (class549.field7665 * var8 >> 12) + var9;
                }
                int var12;
                int var13;
                if (class71.field960 <= arg1) {
                    if (class549.field7665 < arg1) {
                        var12 = class549.field7665;
                        var13 = (class549.field7665 * var8 >> 12) + var9;
                    } else {
                        var12 = arg1;
                        var13 = arg4;
                    }
                } else {
                    var13 = (class71.field960 * var8 >> 12) + var9;
                    var12 = class71.field960;
                }
                if (var11 < class143.field2050) {
                    var10 = (-var9 + class143.field2050 << 12) / var8;
                    var11 = class143.field2050;
                } else if (~var11 < ~class461.field6495) {
                    var11 = class461.field6495;
                    var10 = (class461.field6495 - var9 << 12) / var8;
                }
                if (var13 < class143.field2050) {
                    var13 = class143.field2050;
                    var12 = (-var9 + class143.field2050 << 12) / var8;
                } else if (~var13 < ~class461.field6495) {
                    var13 = class461.field6495;
                    var12 = (class461.field6495 - var9 << 12) / var8;
                }
                class172.method1109(var11, var10, var13, arg3, var12, 38);
                if (arg2) {
                    ;
                }
            }
        } else {
            if (~var7 != -1) {
                class430.method2624(arg3, arg5, arg4, arg0, (byte) -77);
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II[BI)V", line = 153)
    public final void method724(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field1190;
        this.method2435(arg2, arg1);
        this.field1186 = arg0;
        if (arg3 >= -40) {
            this.field1186 = -111;
        }
    }
}

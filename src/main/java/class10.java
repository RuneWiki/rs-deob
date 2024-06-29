import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class10 extends class101 {

    @OriginalMember(owner = "client!ds", name = "K", descriptor = "I")
    public static int field116 = 0;

    @OriginalMember(owner = "client!ds", name = "I", descriptor = "Ljava/lang/String;")
    public static String field114 = "Please remove ";

    @OriginalMember(owner = "client!ds", name = "P", descriptor = "Ljava/lang/String;")
    public static String field121 = "Loading title screen - ";

    @OriginalMember(owner = "client!ds", name = "O", descriptor = "I")
    public static int field120 = 0;

    @OriginalMember(owner = "client!ds", name = "M", descriptor = "S")
    public static short field118 = 32767;

    @OriginalMember(owner = "client!ds", name = "G", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!ds", name = "H", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!ds", name = "J", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!ds", name = "L", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!ds", name = "Q", descriptor = "I")
    public int field122;

    @OriginalMember(owner = "client!ds", name = "S", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!ds", name = "R", descriptor = "Lwq;")
    public class93 field123;

    @OriginalMember(owner = "client!ds", name = "N", descriptor = "[B")
    public byte[] field119;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(BI)V")
    public static final void method83(byte arg0, int arg1) {
        int var2 = 19 / ((arg0 - -74) / 37);
        ++field115;
        class348 var3 = class385.method2464(8, 1302, arg1);
        var3.method2214((byte) 121);
    }

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "(I)[B")
    public final byte[] method84(int arg0) {
        if (arg0 != -5714) {
            return null;
        } else {
            ++field112;
            if (super.field1141) {
                throw new RuntimeException();
            } else {
                return this.field119;
            }
        }
    }

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "(B)I")
    public final int method85(byte arg0) {
        if (arg0 < 124) {
            this.method85((byte) -45);
        }
        ++field117;
        return super.field1141 ? 0 : 100;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIIII)I")
    public static final int method86(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg2 & arg3;
        ++field124;
        if ((arg0 & 1) == 1) {
            int var8 = arg5;
            arg5 = arg4;
            arg4 = var8;
        }
        if (~var7 == -1) {
            return arg1;
        } else if (~var7 == -2) {
            return arg6;
        } else {
            return ~var7 == -3 ? 7 - arg1 - (arg5 + -1) : -arg4 - (-1 - -arg6 - 7);
        }
    }

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "(B)V")
    public static void method87(byte arg0) {
        field121 = null;
        if (arg0 != 92) {
            field113 = 0;
        }
        field114 = null;
    }
}

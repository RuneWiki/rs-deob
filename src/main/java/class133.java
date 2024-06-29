import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class133 {

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "[I")
    public static int[] field1736 = new int[32];

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "[B")
    public byte[] field1744;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "[S")
    public short[] field1735;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "[S")
    public short[] field1741;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "[S")
    public short[] field1742;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZLtc;)V", line = 4)
    public static final void method965(int arg0, boolean arg1, class477 arg2) {
        if (arg0 != 1900077296) {
            field1740 = -88;
        }
        field1743++;
        int var3 = arg2.field6225 == 0 ? arg2.field6372 : arg2.field6225;
        int var4 = arg2.field6252 == 0 ? arg2.field6224 : arg2.field6252;
        class64.method538(class322.field4179[arg2.field6234 >> 16], (byte) -115, var3, arg2.field6234, var4, arg1);
        if (arg2.field6258 != null) {
            class64.method538(arg2.field6258, (byte) -102, var3, arg2.field6234, var4, arg1);
        }
        class270 var5 = (class270) class700.field9763.method39((long) arg2.field6234, 31750);
        if (var5 != null) {
            class344.method1984(var5.field3588, arg1, var4, var3, (byte) 103);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIILlga;Llga;)V", line = 30)
    public static final void method966(int arg0, int arg1, int arg2, class17 arg3, class17 arg4) {
        class530 var5 = class331.method1910(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field6879 = arg3;
            var5.field6886 = arg4;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V", line = 39)
    public static void method967(byte arg0) {
        field1736 = null;
        if (arg0 < 85) {
            method968((byte) -106, -73);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BI)Z", line = 49)
    public static final boolean method968(byte arg0, int arg1) {
        field1739++;
        if (arg0 != 1) {
            method969(-13, -95, 75, 44, 95);
        }
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIII)Z", line = 67)
    public static final boolean method969(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1737++;
        if ((class159.field1994[0][arg4][arg3] & 0x2) != 0) {
            return true;
        } else if ((class159.field1994[arg0][arg4][arg3] & 0x10) != 0) {
            return false;
        } else if (arg1 == class549.method2910(arg4, arg0, arg3, -1)) {
            return true;
        } else {
            if (arg2 <= 82) {
                method970(null, -114);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lpe;I)V", line = 92)
    public static final void method970(class615 arg0, int arg1) {
        class398.field5072 = arg0;
        field1738++;
        if (arg1 != 2) {
            field1740 = -106;
        }
    }
}

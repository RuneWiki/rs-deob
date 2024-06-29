import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class319 {

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "Lbi;")
    public static class104 field4969 = new class104(4, 1);

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field4974 = -1;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "Lld;")
    public static class82 field4975;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lza;BLmn;Lmn;)V")
    public static final void method2134(class497 arg0, byte arg1, class162 arg2, class162 arg3) {
        field4972++;
        class240.field3905 = class310.method2082((byte) 121, 0, arg2, class136.field1872);
        class315.field4923 = arg0.method1246(class240.field3905, class175.method1110(arg3, class136.field1872, 0), true);
        class378.field5807 = class310.method2082((byte) 121, 0, arg2, class68.field1040);
        if (arg1 != -37) {
            method2134(null, (byte) 9, null, null);
        }
        class128.field1741 = arg0.method1246(class378.field5807, class175.method1110(arg3, class68.field1040, 0), true);
        class306.field4807 = class310.method2082((byte) 121, 0, arg2, class164.field2376);
        class289.field4571 = arg0.method1246(class306.field4807, class175.method1110(arg3, class164.field2376, 0), true);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB)V")
    public static final void method2135(int arg0, byte arg1) {
        field4968++;
        if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
        }
        class359.field5567 = arg0;
        if (arg1 != -117) {
            field4974 = 65;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIBLoq;Lza;I)V")
    public static final void method2136(int arg0, int arg1, byte arg2, class156 arg3, class497 arg4, int arg5) {
        field4970++;
        class114 var6 = class453.field7020.method2736(arg3.field2104, (byte) -45);
        if (var6.field1601 == -1) {
            return;
        }
        int var7;
        if (arg3.field2138) {
            int var8 = arg3.field2081 + arg1;
            var7 = var8 & 0x3;
        } else {
            var7 = 0;
        }
        class139 var9 = var6.method738(arg3.field2124, var7, arg4, arg2 - 99);
        if (var9 == null || arg2 != 101) {
            return;
        }
        int var10 = arg3.field2139;
        int var11 = arg3.field2123;
        if ((var7 & 0x1) == 1) {
            var10 = arg3.field2123;
            var11 = arg3.field2139;
        }
        int var12 = var9.method623();
        int var13 = var9.method618();
        if (var6.field1596) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field1598 == 0) {
            var9.method851(arg0, arg5 - ((var11 - 1) * 4), var12, var13);
        } else {
            var9.method630(arg0, arg5 + 4 - var11 * 4, var12, var13, 0, var6.field1598 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public static void method2137(int arg0) {
        field4969 = null;
        field4975 = null;
        if (arg0 != 4) {
            field4969 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
    public static final void method2138(byte arg0) {
        if (arg0 >= -123) {
            field4969 = null;
        }
        class94.method642(17795, false);
        field4973++;
        if (class396.field5991 >= 0 && class396.field5991 != 0) {
            class196.method1341(class396.field5991, 6670);
            class396.field5991 = -1;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZI)V")
    public static final void method2139(boolean arg0, int arg1) {
        field4976++;
        if (!arg0) {
            method2140(null, -103);
        }
        if (class334.field5227 == 1) {
            class162.field2354 = arg1;
        } else if (class334.field5227 == 2 || class334.field5227 == 3) {
            class390.field5935 = arg1;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lkj;I)V")
    public static final void method2140(class55 arg0, int arg1) {
        field4966++;
        int var2 = arg0.field796 - class88.field1278;
        int var3 = arg0.field821 * 128 + (arg0.method415(-4) * 64);
        if (arg1 != -24689) {
            return;
        }
        int var4 = arg0.field870 * 128 + arg0.method415(-4) * 64;
        arg0.field6410 += (var4 - arg0.field6410) / var2;
        arg0.field900 = 0;
        arg0.field6417 += (var3 - arg0.field6417) / var2;
        if (arg0.field811 == 0) {
            arg0.method428(8192, (byte) -122);
        }
        if (arg0.field811 == 1) {
            arg0.method428(12288, (byte) -127);
        }
        if (arg0.field811 == 2) {
            arg0.method428(0, (byte) 37);
        }
        if (arg0.field811 == 3) {
            arg0.method428(4096, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2141(int arg0, int arg1, byte arg2) {
        field4967++;
        if (arg2 >= -49) {
            method2137(-70);
        }
        return false;
    }
}

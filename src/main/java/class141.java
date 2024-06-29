import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class141 {

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field2066 = 0;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Z")
    public static boolean field2068 = false;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field2067 = 1;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "[I")
    public static int[] field2070 = new int[2];

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field2074 = 0;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "C")
    public static char field2069;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "Lhi;")
    public class219 field2073;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "Lph;")
    public static class78 field2065;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public static void method945(byte arg0) {
        field2070 = null;
        field2065 = null;
        int var1 = -29 % ((arg0 - 59) / 50);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZIIILld;I)V")
    public static final void method946(int arg0, boolean arg1, int arg2, int arg3, int arg4, class79 arg5, int arg6) {
        field2072++;
        boolean var7 = true;
        long var8 = 0L;
        if (arg6 == 0) {
            var8 = class224.method1529(arg3, arg4, arg2);
        } else if (arg6 == 1) {
            var8 = class90.method607(arg3, arg4, arg2);
        } else if (arg6 == 2) {
            var8 = class23.method161(arg3, arg4, arg2);
        } else if (arg6 == 3) {
            var8 = class87.method600(arg3, arg4, arg2);
        }
        int var10 = Integer.MAX_VALUE & (int) (var8 >>> 32);
        boolean var11 = false;
        class181 var12 = class25.method224(var10, 0);
        if (var12.method1267(20372)) {
            class116.method774(var12, arg3, arg4, true, arg2);
        }
        int var13 = ((int) var8 & 0x7CF56) >> 14;
        boolean var14 = false;
        if (arg1) {
            field2071 = -85;
        }
        int var15 = (int) var8 >> 20 & 0x3;
        if (var8 == 0L) {
            return;
        }
        if (arg6 != 0) {
            if (arg6 == 1) {
                class140.method940(arg3, arg4, arg2);
            } else if (arg6 == 2) {
                class18.method121(arg3, arg4, arg2);
                if (var12.field2834 != 0 && (var12.field2829 + arg4) < 104 && (var12.field2829 + arg2) < 104 && (var12.field2813 + arg4) < 104 && (var12.field2813 + arg2) < 104) {
                    arg5.method540(var12.field2813, arg2, arg4, var15, var12.field2829, 0, var12.field2845);
                    return;
                }
            } else {
                if (arg6 == 3) {
                    class124.method845(arg3, arg4, arg2);
                    if (var12.field2834 == 1) {
                        arg5.method537(arg2, -1, arg4);
                        return;
                    }
                }
                return;
            }
            return;
        }
        class31.method246(arg3, arg4, arg2);
        if (var12.field2834 != 0) {
            arg5.method535(var12.field2845, arg4, var15, var13, arg2, 5120);
            return;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILef;IB)V")
    public static final void method947(int arg0, class214 arg1, int arg2, byte arg3) {
        field2075++;
        if (class243.field3885 != null || class286.field4542 || arg1 == null || class191.method1339(-95, arg1) == null) {
            return;
        }
        if (arg3 != 115) {
            method946(99, false, 21, 23, -43, (class79) null, -84);
        }
        class243.field3885 = arg1;
        class105.field1622 = class191.method1339(121, arg1);
        class1.field5 = arg0;
        class248.field3969 = 0;
        class1.field12 = arg2;
        class91.field1390 = false;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class38 implements class74 {

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "Loh;")
    public static class263 field862 = class253.method1681(-121, "Sprites geladen)3");

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "Loh;")
    private static class263 field869 = class253.method1681(-119, "Choose Option");

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "Loh;")
    public static class263 field864 = field869;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "Llb;")
    public static class127 field865 = new class127(50);

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "[J")
    public static long[] field871 = new long[200];

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "Loh;")
    public static class263 field873 = class253.method1681(-124, ")4p=");

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "[[I")
    public static int[][] field870;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "[[[I")
    public static int[][][] field872;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public static void method238(int arg0) {
        field873 = null;
        field865 = null;
        field871 = null;
        if (arg0 != 1) {
            return;
        }
        field862 = null;
        field872 = null;
        field870 = null;
        field869 = null;
        field864 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)I")
    public static int method239(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILue;)V")
    public static final void method240(int arg0, class86 arg1) {
        field863++;
        class160.field2921 = arg1;
        if (arg0 < 79) {
            field870 = null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B[IIJ)Loh;")
    public final class263 method241(byte arg0, int[] arg1, int arg2, long arg3) {
        field861++;
        if (arg0 > -48) {
            return null;
        } else if (arg2 == 0) {
            class36 var6 = class115.method757(1, arg1[0]);
            return var6.method227(-100, (int) arg3);
        } else if (arg2 == 1 || arg2 == 10) {
            class72 var7 = class92.method649(-32508, (int) arg3);
            return var7.field1467;
        } else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
            return class115.method757(1, arg1[0]).method227(-121, (int) arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BIIIILpc;II)V")
    public static final void method242(byte arg0, int arg1, int arg2, int arg3, int arg4, class21 arg5, int arg6, int arg7) {
        if (arg0 != -81) {
            field865 = null;
        }
        field867++;
        if (class109.field2054) {
            class85.field1679 = 32;
        } else {
            class85.field1679 = 0;
        }
        class109.field2054 = false;
        if (class11.field247 != 0) {
            if (arg3 <= arg2 && arg2 < arg3 + 16 && arg4 >= arg1 && arg4 < (arg1 + 16)) {
                arg5.field530 -= 4;
                class220.method1508(arg5, (byte) -81);
            } else if (arg3 <= arg2 && arg2 < arg3 + 16 && arg4 >= (arg1 + arg7 - 16) && arg1 + arg7 > arg4) {
                arg5.field530 += 4;
                class220.method1508(arg5, (byte) -50);
            } else if (arg2 >= (arg3 - class85.field1679) && arg2 < arg3 + class85.field1679 + 16 && (arg1 + 16) <= arg4 && arg7 + arg1 - 16 > arg4) {
                int var8 = (arg7 - 32) * arg7 / arg6;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg4 - arg1 - (var8 / 2) - 16;
                int var10 = arg7 - var8 - 32;
                arg5.field530 = (arg6 - arg7) * var9 / var10;
                class220.method1508(arg5, (byte) -57);
                class109.field2054 = true;
            }
        }
        if (class117.field2189 == 0) {
            return;
        }
        int var11 = arg5.field539;
        if (arg2 >= (arg3 - var11) && arg4 >= arg1 && arg3 + 16 > arg2 && arg4 <= arg1 + arg7) {
            arg5.field530 += class117.field2189 * 45;
            class220.method1508(arg5, (byte) -65);
            return;
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V")
    public static final void method243(int arg0) {
        field868++;
        if (arg0 >= -87) {
            method240(-81, (class86) null);
        }
        if (class236.field4122 != null) {
            class117 var1 = class236.field4122;
            synchronized (class236.field4122) {
                class236.field4122 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)Lsi;")
    public static final class194 method244(int arg0) {
        field866++;
        if (arg0 != -6939) {
            field870 = null;
        }
        class194 var1 = new class194(30);
        var1.method1288((byte) -120, 7);
        var1.method1288((byte) -77, class183.field3310);
        var1.method1288((byte) -49, class1.field14 ? 1 : 0);
        var1.method1288((byte) -62, class7.field135 ? 1 : 0);
        var1.method1288((byte) -105, class146.field2670 ? 1 : 0);
        var1.method1288((byte) -80, class101.field1930 ? 1 : 0);
        var1.method1288((byte) -59, class159.field2896 ? 1 : 0);
        var1.method1288((byte) -54, class1.field9 ? 1 : 0);
        var1.method1288((byte) -58, class107.field2028 ? 1 : 0);
        var1.method1288((byte) -52, class125.field2322 ? 1 : 0);
        var1.method1288((byte) -60, class277.field4853);
        var1.method1288((byte) -24, class126.field2331 ? 1 : 0);
        var1.method1288((byte) -26, class17.field394 ? 1 : 0);
        var1.method1288((byte) -39, class187.field3372 ? 1 : 0);
        var1.method1288((byte) -127, class126.field2335);
        var1.method1288((byte) -55, class253.field4397 ? 1 : 0);
        var1.method1288((byte) -10, class265.field4632);
        var1.method1288((byte) -31, class95.field1866);
        var1.method1288((byte) -9, class214.field3798);
        var1.method1276(class2.field51, -78);
        var1.method1276(class64.field1292, -58);
        var1.method1288((byte) -112, 2);
        var1.method1286(-11740, class232.field4061);
        var1.method1288((byte) -88, class107.field2027);
        var1.method1288((byte) -76, class245.field4319 ? 1 : 0);
        return var1;
    }
}

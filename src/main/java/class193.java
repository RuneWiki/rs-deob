import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class193 extends class279 {

    @OriginalMember(owner = "client!q", name = "v", descriptor = "[Lhb;")
    public class331[] field3065;

    @OriginalMember(owner = "client!q", name = "G", descriptor = "I")
    public static int field3076 = 0;

    @OriginalMember(owner = "client!q", name = "H", descriptor = "I")
    public static int field3077 = 0;

    @OriginalMember(owner = "client!q", name = "I", descriptor = "Ljava/lang/String;")
    public static String field3078 = "shake:";

    @OriginalMember(owner = "client!q", name = "L", descriptor = "I")
    public static int field3081 = 0;

    @OriginalMember(owner = "client!q", name = "C", descriptor = "I")
    public static int field3072 = 0;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!q", name = "x", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!q", name = "y", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!q", name = "z", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!q", name = "B", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!q", name = "D", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!q", name = "E", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!q", name = "J", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!q", name = "K", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!q", name = "M", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!q", name = "O", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!q", name = "P", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!q", name = "N", descriptor = "[[B")
    public static byte[][] field3083;

    @OriginalMember(owner = "client!q", name = "A", descriptor = "[[I")
    public static int[][] field3070;

    @OriginalMember(owner = "client!q", name = "F", descriptor = "[[[B")
    public static byte[][][] field3075;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(B)V", line = 4)
    public static void method1424(byte arg0) {
        field3083 = (byte[][]) null;
        field3078 = null;
        field3075 = (byte[][][]) null;
        field3070 = (int[][]) null;
        if (arg0 > -96) {
            method1425(60, -87, -75);
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(III)I", line = 20)
    public static final int method1425(int arg0, int arg1, int arg2) {
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg2 >>= 0x1;
        }
        field3071++;
        if (arg2 == 1) {
            return arg1 * var3;
        } else {
            if (arg0 != 0) {
                method1427(9);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)Z", line = 49)
    public final boolean method1426(int arg0, int arg1) {
        field3082++;
        if (arg0 != 1) {
            field3075 = (byte[][][]) ((byte[][][]) null);
        }
        return this.field3065[arg1].field5163;
    }

    @OriginalMember(owner = "client!q", name = "e", descriptor = "(I)Ljava/lang/String;", line = 62)
    public static final String method1427(int arg0) {
        String var1 = "www";
        if (arg0 != 4398) {
            return (String) null;
        }
        String var2 = "";
        if (class6.field109 != 0) {
            var1 = "www-wtqa";
        }
        field3066++;
        if (class315.field4933 != null) {
            var2 = "/p=" + class315.field4933;
        }
        return "http://" + var1 + ".runescape.com/l=" + class141.field2240 + "/a=" + class105.field1393 + var2 + "/";
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(II)Z", line = 89)
    public final boolean method1428(int arg0, int arg1) {
        field3069++;
        int var3 = -108 / ((arg0 + 24) / 34);
        return this.field3065[arg1].field5161;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lug;Lug;IZ)V", line = 99)
    public class193(class253 arg0, class253 arg1, int arg2, boolean arg3) {
        class5 var5 = new class5();
        int var6 = arg0.method1826(0, arg2);
        this.field3065 = new class331[var6];
        int[] var7 = arg0.method1842((byte) -127, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            class276 var9 = null;
            byte[] var10 = arg0.method1813(var7[var8], arg2, true);
            int var11 = var10[1] & 0xFF | var10[0] & 0xFF << 8;
            for (class276 var12 = (class276) var5.method22((byte) 122); var12 != null; var12 = (class276) var5.method26((byte) -117)) {
                if (var12.field4255 == var11) {
                    var9 = var12;
                    break;
                }
            }
            if (var9 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1830(536, var11, 0);
                } else {
                    var13 = arg1.method1830(536, 0, var11);
                }
                var9 = new class276(var11, var13);
                var5.method19(var9, -1058);
            }
            this.field3065[var7[var8]] = new class331(var10, var9);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 160)
    public static final long method1429(String arg0, int arg1) {
        int var2 = arg0.length();
        long var3 = 0L;
        if (arg1 != -29370) {
            return 46L;
        }
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (long) arg0.charAt(var5) + ((var3 << 5) - var3);
        }
        field3074++;
        return var3;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)V", line = 181)
    public static final void method1430(int arg0, byte arg1) {
        field3064++;
        if (arg1 <= 124) {
            method1431((byte) 6);
        }
        class37.field541.method1353(-1, arg0);
        class34.field498.method1353(-1, arg0);
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(B)I", line = 198)
    public static final int method1431(byte arg0) {
        field3084++;
        if (arg0 != -76) {
            method1430(84, (byte) -96);
        }
        return 6;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZI)V", line = 223)
    public static final void method1432(boolean arg0, int arg1) {
        int var2 = 93 / ((arg1 + 15) / 38);
        field3080++;
        for (class166 var3 = (class166) class81.field1109.method22((byte) 121); var3 != null; var3 = (class166) class81.field1109.method26((byte) -123)) {
            if (var3.field2721 != null) {
                class86.field1174.method1313(var3.field2721);
                var3.field2721 = null;
            }
            if (var3.field2729 != null) {
                class86.field1174.method1313(var3.field2729);
                var3.field2729 = null;
            }
            var3.method2028(13329);
        }
        if (!arg0) {
            return;
        }
        for (class166 var4 = (class166) class284.field4394.method22((byte) 123); var4 != null; var4 = (class166) class284.field4394.method26((byte) -114)) {
            if (var4.field2721 != null) {
                class86.field1174.method1313(var4.field2721);
                var4.field2721 = null;
            }
            var4.method2028(13329);
        }
        for (class166 var5 = (class166) class99.field1304.method2174(256); var5 != null; var5 = (class166) class99.field1304.method2164((byte) 116)) {
            if (var5.field2721 != null) {
                class86.field1174.method1313(var5.field2721);
                var5.field2721 = null;
            }
            var5.method2028(13329);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class342 extends class96 {

    @OriginalMember(owner = "client!e", name = "h", descriptor = "[I")
    public static int[] field5326 = new int[100];

    @OriginalMember(owner = "client!e", name = "k", descriptor = "Ljava/lang/String;")
    public static String field5329 = "level: ";

    @OriginalMember(owner = "client!e", name = "l", descriptor = "[I")
    public static int[] field5330 = new int[50];

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public static int field5333 = 0;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "[I")
    public static int[] field5336 = new int[14];

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)I", line = 7)
    public static final int method2365(int arg0, int arg1, int arg2, int arg3) {
        field5331++;
        if ((class92.field1468[arg3][arg2][arg0] & 0x8) != 0) {
            return 0;
        } else if (arg3 <= 0 || (class92.field1468[1][arg2][arg0] & 0x2) == 0) {
            return arg1 == 1 ? arg3 : 29;
        } else {
            return arg3 - 1;
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V", line = 31)
    public static final void method2366(int arg0) {
        class26.method241(arg0 + 3098, class222.field3537);
        class339.field5303++;
        field5335++;
        if (class188.field2817 && class136.field2153) {
            int var1 = class253.field3984;
            int var2 = var1 - class77.field1245;
            if (var2 < class165.field2471) {
                var2 = class165.field2471;
            }
            int var3 = class119.field1815;
            if (arg0 != -3) {
                method2367(91, (class180) null);
            }
            if ((class222.field3537.field3458 + var2) > (class165.field2471 + class125.field1957.field3458)) {
                var2 = class165.field2471 + class125.field1957.field3458 - class222.field3537.field3458;
            }
            int var4 = var2 - class252.field3974;
            int var5 = class222.field3537.field3369;
            int var6 = var3 - class136.field2152;
            if (class70.field1144 > var6) {
                var6 = class70.field1144;
            }
            if ((class222.field3537.field3526 + var6) > (class70.field1144 + class125.field1957.field3526)) {
                var6 = class70.field1144 + class125.field1957.field3526 - class222.field3537.field3526;
            }
            int var7 = var6 - class288.field4489;
            int var8 = var6 + class125.field1957.field3367 - class70.field1144;
            int var9 = var2 + class125.field1957.field3426 - class165.field2471;
            if (class339.field5303 > class222.field3537.field3495 && (var7 > var5 || -var5 > var7 || var4 > var5 || var4 < -var5)) {
                class203.field3041 = true;
            }
            if (class222.field3537.field3362 != null && class203.field3041) {
                class240 var10 = new class240();
                var10.field3834 = class222.field3537;
                var10.field3824 = var8;
                var10.field3826 = class222.field3537.field3362;
                var10.field3821 = var9;
                class336.method2337(var10, (byte) -71);
            }
            if (class256.field4016 == 0) {
                if (class203.field3041) {
                    if (class222.field3537.field3415 != null) {
                        class240 var11 = new class240();
                        var11.field3821 = var9;
                        var11.field3826 = class222.field3537.field3415;
                        var11.field3838 = class191.field2865;
                        var11.field3824 = var8;
                        var11.field3834 = class222.field3537;
                        class336.method2337(var11, (byte) -71);
                    }
                    if (class191.field2865 != null && client.method388(class222.field3537) != null) {
                        class294.field4549++;
                        class106.field1642.method753(-114, 237);
                        class106.field1642.method1174((byte) -32, class222.field3537.field3404);
                        class106.field1642.method1161(class222.field3537.field3383, 128);
                        class106.field1642.method1171(class191.field2865.field3404, arg0 - 86);
                        class106.field1642.method1130(-120, class191.field2865.field3383);
                    }
                } else if ((class251.field3969 == 1 || class17.method139(class301.field4706 - 1, 19193)) && class301.field4706 > 2) {
                    class208.method1482(true);
                } else if (class301.field4706 > 0) {
                    class30.method256(47);
                }
                class222.field3537 = null;
            }
        } else if (class339.field5303 > 1) {
            class222.field3537 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILki;)[Lmi;", line = 151)
    public static final class12[] method2367(int arg0, class180 arg1) {
        field5332++;
        if (!arg1.method1287(arg0 ^ arg0)) {
            return new class12[0];
        }
        class197 var2 = arg1.method1294(15);
        while (var2.field2956 == 0) {
            class5.method26(0, 10L);
        }
        if (var2.field2956 == 2) {
            return new class12[0];
        }
        int[] var3 = (int[]) ((int[]) var2.field2959);
        class12[] var4 = new class12[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class12 var6 = new class12();
            var4[var5] = var6;
            var6.field189 = var3[var5 << 2];
            var6.field193 = var3[(var5 << 2) + 1];
            var6.field186 = var3[(var5 << 2) + 2];
            var6.field183 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)Lcf;", line = 190)
    public static final class70 method2368(int arg0, int arg1) {
        field5334++;
        class70 var2 = (class70) class154.field2319.method443(-2, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class332.field5169.method980(class52.method436(-122, arg0), class238.method1662(arg0, -17999), 5);
        class70 var4 = new class70();
        if (var3 != null) {
            var4.method535(-1, new class166(var3));
        }
        class154.field2319.method439(var4, (long) arg0, (byte) 18);
        int var5 = 97 % ((arg1 - 14) / 44);
        return var4;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V", line = 213)
    public static void method2369(int arg0) {
        field5326 = null;
        field5330 = null;
        int var1 = -19 % ((66 - arg0) / 51);
        field5336 = null;
        field5329 = null;
    }
}

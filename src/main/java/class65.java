import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class65 {

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field965 = 0;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "Ljava/lang/String;")
    public static String field967 = "Loading world list data";

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "[[[B")
    public static byte[][][] field963;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 3)
    public static final void method554(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class107 var20 = new class107(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class250.field3746[var21][arg1][arg2] == null) {
                    class250.field3746[var21][arg1][arg2] = new class99(var21, arg1, arg2);
                }
            }
            class250.field3746[arg0][arg1][arg2].field1489 = var20;
        } else if (arg3 == 1) {
            class107 var22 = new class107(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class250.field3746[var23][arg1][arg2] == null) {
                    class250.field3746[var23][arg1][arg2] = new class99(var23, arg1, arg2);
                }
            }
            class250.field3746[arg0][arg1][arg2].field1489 = var22;
        } else {
            class24 var24 = new class24(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class250.field3746[var25][arg1][arg2] == null) {
                    class250.field3746[var25][arg1][arg2] = new class99(var25, arg1, arg2);
                }
            }
            class250.field3746[arg0][arg1][arg2].field1490 = var24;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V", line = 53)
    public static final void method555(byte arg0) {
        if (arg0 != 17) {
            method560(19);
        }
        field964++;
        class171.field2547 = new class29(32);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V", line = 68)
    public static void method556(boolean arg0) {
        field967 = null;
        field963 = (byte[][][]) null;
        if (arg0) {
            method555((byte) -72);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)V", line = 79)
    public static final void method557(int arg0, int arg1) {
        class99 var2 = class250.field3746[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class99 var4 = class250.field3746[var3][arg0][arg1] = class250.field3746[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field1469--;
                for (int var5 = 0; var5 < var4.field1488; var5++) {
                    class91 var6 = var4.field1471[var5];
                    if ((var6.field1327 >> 29 & 0x3L) == 2L && var6.field1329 == arg0 && var6.field1323 == arg1) {
                        var6.field1331--;
                    }
                }
            }
        }
        if (class250.field3746[0][arg0][arg1] == null) {
            class250.field3746[0][arg0][arg1] = new class99(0, arg0, arg1);
        }
        class250.field3746[0][arg0][arg1].field1476 = var2;
        class250.field3746[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(JI)V", line = 116)
    public static final void method558(long arg0, int arg1) {
        field968++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class314.field4873 < 100 || class184.field2938) || class314.field4873 >= 200) {
            class38.method352(false, 0, class242.field3646, "");
            return;
        }
        String var3 = class188.method1358(95, arg0);
        for (int var4 = 0; var4 < class314.field4873; var4++) {
            if (class37.field549[var4] == arg0) {
                class38.method352(false, 0, var3 + class83.field1160, "");
                return;
            }
        }
        for (int var5 = 0; var5 < class291.field4577; var5++) {
            if (class302.field4742[var5] == arg0) {
                class38.method352(false, 0, class132.field2045 + var3 + class260.field3855, "");
                return;
            }
        }
        if (var3.equals(class235.field3602.field1895)) {
            class38.method352(false, 0, class10.field93, "");
            return;
        }
        class249.field3741++;
        class119.field1874[class314.field4873] = var3;
        if (arg1 != 16077) {
            method556(true);
        }
        class37.field549[class314.field4873] = arg0;
        class299.field4709[class314.field4873] = 0;
        class34.field430[class314.field4873] = "";
        class171.field2541[class314.field4873] = 0;
        class270.field4077[class314.field4873] = false;
        class271.field4090 = class319.field4980;
        class314.field4873++;
        class159.field2372.method59(191, (byte) 73);
        class159.field2372.method261(arg1 ^ 0x5ACC0125, arg0);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZZIIZ)Llb;", line = 188)
    public static final class211 method559(boolean arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        class137 var5 = null;
        field969++;
        if (class176.field2626 != null) {
            var5 = new class137(arg2, class176.field2626, class77.field1090[arg2], 1000000);
        }
        if (arg3 < 5) {
            field965 = -2;
        }
        class142.field2204[arg2] = class277.field4264.method1421(class225.field3501, arg2, (byte) -50, var5);
        if (arg4) {
            class142.field2204[arg2].method749(124);
        }
        return new class211(class142.field2204[arg2], arg0, arg1);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 220)
    public static final void method560(int arg0) {
        class190.field3020++;
        field966++;
        if (arg0 <= 70) {
            field962 = -98;
        }
    }
}

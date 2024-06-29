import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class103 extends class28 {

    @OriginalMember(owner = "client!ho", name = "z", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!ho", name = "C", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!ho", name = "D", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!ho", name = "F", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!ho", name = "G", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!ho", name = "I", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!ho", name = "E", descriptor = "Luu;")
    public static class191 field1486;

    @OriginalMember(owner = "client!ho", name = "H", descriptor = "Lws;")
    public static class244 field1489;

    @OriginalMember(owner = "client!ho", name = "B", descriptor = "Z")
    public static boolean field1483;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(BF)V")
    public final void method256(byte arg0, float arg1) {
        if (arg0 == 101) {
            ++field1490;
            super.field414 = arg1;
        }
    }

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "(I)V")
    public static final void method670(int arg0) {
        class510.field7489 = class291.method1862(35, arg0, 8, 8, 0.4F, -2024, true, 4);
        ++field1487;
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(IIIIIF)V")
    public class103(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(IIII)V")
    public static final void method671(int arg0, int arg1, int arg2, int arg3) {
        ++field1485;
        int var4 = class331.field5162 + arg1;
        int var5 = class328.field5099 + arg2;
        if (class443.field6672 != null && arg1 >= 0 && ~arg2 <= -1 && ~class398.field6071 < ~arg1 && arg2 < class528.field7734) {
            long var6 = (long) (var4 | var5 << 14 | arg0 << 28);
            class247 var8 = (class247) class392.field6005.method1747(var6, false);
            if (var8 == null) {
                class539.method3182(arg0, arg1, arg2);
            } else if (arg3 <= -109) {
                class274 var9 = (class274) var8.field3448.method445(33);
                if (var9 == null) {
                    class539.method3182(arg0, arg1, arg2);
                } else {
                    class13 var10 = (class13) class539.method3182(arg0, arg1, arg2);
                    if (var10 == null) {
                        var10 = new class13();
                    } else {
                        var10.field251 = var10.field253 = -1;
                    }
                    var10.field256 = var9.field3810;
                    var10.field248 = var9.field3808;
                    label51: while (true) {
                        class274 var11 = (class274) var8.field3448.method451(false);
                        if (var11 == null) {
                            break;
                        }
                        if (~var10.field256 != ~var11.field3810) {
                            var10.field251 = var11.field3810;
                            var10.field252 = var11.field3808;
                            while (true) {
                                class274 var12 = (class274) var8.field3448.method451(false);
                                if (var12 == null) {
                                    break label51;
                                }
                                if (~var10.field256 != ~var12.field3810 && ~var10.field251 != ~var12.field3810) {
                                    var10.field255 = var12.field3808;
                                    var10.field253 = var12.field3810;
                                }
                            }
                        }
                    }
                    int var13 = class352.method2264(-105, arg0, (arg2 << 7) + 64, (arg1 << 7) + 64);
                    class453.method2760(arg0, arg1, arg2, var13, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIII)V")
    public final void method259(int arg0, int arg1, int arg2, int arg3) {
        ++field1488;
        super.field406 = arg1;
        super.field401 = arg0;
        super.field402 = arg3;
        if (arg2 != 2) {
            method671(62, 111, -9, -56);
        }
    }

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "(I)V")
    public static void method672(int arg0) {
        field1489 = null;
        field1486 = null;
        if (arg0 <= 112) {
            method671(-121, -105, 15, -81);
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Ljava/lang/String;IZJ)V")
    public static final void method673(String arg0, int arg1, boolean arg2, long arg3) {
        ++field1482;
        if (arg2) {
            class170.method1156(false);
            if (class33.field512.equals("")) {
                class342.field5272 = 39;
                return;
            }
        }
        class164 var5 = new class164(128);
        var5.method1072((byte) 102, 10);
        var5.method1114((int) (Math.random() * 65535.0D), arg1 + 8227);
        var5.method1054(arg3, -713416072);
        var5.method1114(class331.field5167, 89);
        var5.method1073(arg1 + 326178297, (int) (9.9999999E7D * Math.random()));
        var5.method1071(-25643, arg0);
        var5.method1073(326170192, (int) (9.9999999E7D * Math.random()));
        if (arg2) {
            var5.method1054(class133.method904(class33.field512, 37), arg1 ^ 713409071);
            try {
                var5.method1054(Long.parseLong(class109.field1537), -713416072);
            } catch (Exception var6) {
                class342.field5272 = 39;
                return;
            }
        } else {
            var5.method1073(arg1 + 326178297, (int) (9.9999999E7D * Math.random()));
            var5.method1073(326170192, (int) (9.9999999E7D * Math.random()));
            var5.method1073(326170192, (int) (9.9999999E7D * Math.random()));
            var5.method1073(326170192, (int) (Math.random() * 9.9999999E7D));
        }
        var5.method1073(326170192, (int) (9.9999999E7D * Math.random()));
        var5.method1102(class135.field1807, arg1 ^ arg1, class279.field3965);
        class538.field7879.field2185 = 0;
        class538.field7879.method1072((byte) 102, arg2 ? class198.field2634.field6547 : class198.field2631.field6547);
        class538.field7879.method1114(var5.field2185 + 28, 99);
        class538.field7879.method1114(603, arg1 + 8204);
        class538.field7879.method1072((byte) 102, class257.field3556);
        class538.field7879.method1072((byte) 102, class67.field957.field930);
        class136.method915(arg1 ^ 13681, class538.field7879);
        class538.field7879.method1089(0, var5.field2219, -4516, var5.field2185);
        class290.field4252 = 0;
        class342.field5272 = -3;
        class439.field6620 = 0;
        class351.field5430 = 1;
    }
}

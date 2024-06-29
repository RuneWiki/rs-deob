import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class182 {

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field2925 = -1;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field2938 = new String[100];

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "[I")
    public static int[] field2933 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
    public static int field2939 = 0;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public int field2926;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public int field2930;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public int field2931;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    public int field2932;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    public int field2934;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public int field2935;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public int field2936;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "[B")
    public byte[] field2927;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "[B")
    public byte[] field2928;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IILv;)Ljava/lang/String;")
    public static final String method1352(int arg0, int arg1, class152 arg2) {
        field2937++;
        try {
            int var3 = arg2.method1103(3);
            if (arg1 <= 26) {
                method1357((class152) null, -10, -24);
            }
            if (var3 > arg0) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg2.field2511 += class132.field2181.method569(arg2.field2523, var3, 0, arg2.field2511, true, var4);
            return class83.method605(var4, 0, var3, 120);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIIIBI)V")
    public static final void method1353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field2942++;
        int var9 = arg6 - arg2;
        int var10 = (arg4 - arg5 << 16) / var9;
        if (arg7 > -26) {
            field2925 = 71;
        }
        int var11 = arg1 - arg0;
        int var12 = (arg8 - arg3 << 16) / var11;
        class227.method1624(arg5, var12, arg6, arg1, 0, arg0, arg3, arg2, var10, 16777215, 0);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
    public static final void method1354(byte arg0) {
        class274.method1896(class16.field184, 10);
        field2941++;
        class50.field735++;
        if (class128.field1981 && class196.field3187) {
            int var1 = class169.field2731;
            int var2 = var1 - class58.field829;
            int var3 = class296.field4680;
            if (var2 < class62.field893) {
                var2 = class62.field893;
            }
            if ((class16.field184.field2102 + var2) > (class62.field893 + class294.field4674.field2102)) {
                var2 = class62.field893 + class294.field4674.field2102 - class16.field184.field2102;
            }
            int var4 = var3 - class209.field3356;
            int var5 = var2 - class73.field1069;
            if (class145.field2358 > var4) {
                var4 = class145.field2358;
            }
            if (arg0 > 48) {
                if ((class145.field2358 + class294.field4674.field2167) < (var4 + class16.field184.field2167)) {
                    var4 = class145.field2358 + class294.field4674.field2167 - class16.field184.field2167;
                }
                int var6 = var4 - class98.field1442;
                int var7 = var4 + class294.field4674.field1995 - class145.field2358;
                int var8 = class16.field184.field2100;
                int var9 = var2 + class294.field4674.field2065 - class62.field893;
                if (class50.field735 > class16.field184.field2082 && (var5 > var8 || -var8 > var5 || var6 > var8 || -var8 > var6)) {
                    class290.field4594 = true;
                }
                if (class16.field184.field2099 != null && class290.field4594) {
                    class294 var10 = new class294();
                    var10.field4668 = class16.field184;
                    var10.field4667 = var9;
                    var10.field4661 = var7;
                    var10.field4664 = class16.field184.field2099;
                    class266.method1852(var10, 1);
                }
                if (class243.field3921 == 0) {
                    if (class290.field4594) {
                        if (class16.field184.field2004 != null) {
                            class294 var11 = new class294();
                            var11.field4668 = class16.field184;
                            var11.field4661 = var7;
                            var11.field4664 = class16.field184.field2004;
                            var11.field4667 = var9;
                            var11.field4671 = class169.field2720;
                            class266.method1852(var11, 1);
                        }
                        if (class169.field2720 != null && client.method1167(class16.field184) != null) {
                            class41.field579++;
                            class220.field3532.method557(117, 8);
                            class220.field3532.method1108(class169.field2720.field2061, (byte) 75);
                            class220.field3532.method1087(-1228597208, class16.field184.field2061);
                            class220.field3532.method1112((byte) 3, class16.field184.field2073);
                            class220.field3532.method1089(class169.field2720.field2073, -117);
                        }
                    } else if ((class247.field4125 == 1 || class253.method1793(123, class243.field3890 - 1)) && class243.field3890 > 2) {
                        class43.method330((byte) -32);
                    } else if (class243.field3890 > 0) {
                        class49.method375(29353);
                    }
                    class16.field184 = null;
                }
            }
        } else if (class50.field735 > 1) {
            class16.field184 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V")
    public static final void method1355(byte arg0) {
        class184.method1371(10);
        class99.method756((byte) 102);
        field2929++;
        class39.method303(false);
        class97.method747(124);
        class88.method665(32768);
        class136.method975(false);
        class38.method293(15896);
        class130.method935(-1);
        class238.method1671(29621);
        class240.method1680((byte) 110);
        class257.method1818(50);
        class190.method1418(31616);
        class241.method1687((byte) -10);
        class281.method1925((byte) -40);
        class126.method910(true);
        client.method1170((byte) -115);
        class56.method416((byte) -43);
        class152.method1105(778481904);
        class153.method1139((byte) -88);
        class143.method1021(-2061127966);
        if (arg0 <= 88) {
            field2933 = null;
        }
        class161.field2635.method1558(-71);
        class168.field2703.method1558(-86);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
    public static void method1356(int arg0) {
        field2938 = null;
        if (arg0 != 2) {
            field2925 = -103;
        }
        field2933 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lv;II)Lhb;")
    public static final class222 method1357(class152 arg0, int arg1, int arg2) {
        field2940++;
        class222 var3 = new class222(arg1, arg0.method1078(-1), arg0.method1078(-1), arg0.method1097(arg2 ^ 0x7F), arg0.method1097(127), arg0.method1111(255) == 1, arg0.method1111(arg2 + 255));
        int var4 = arg0.method1111(arg2 + 255);
        for (int var5 = arg2; var5 < var4; var5++) {
            var3.field3556.method1385(new class184(arg0.method1111(255), arg0.method1111(255), arg0.method1126(false), arg0.method1126(false), arg0.method1126(false), arg0.method1126(false), arg0.method1126(false), arg0.method1126(false), arg0.method1126(false), arg0.method1126(false)), true);
        }
        var3.method1588(arg2 ^ 0x4C);
        return var3;
    }
}

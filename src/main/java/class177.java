import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class177 extends class299 {

    @OriginalMember(owner = "client!cfa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2867 = new String[] { method1695(method1694("eJ\n6")), method1695(method1694("hY\u0007t>#")), method1695(method1694("p\u0011Ht\u000b")), method1695(method1694("hY\u0007t3#")), method1695(method1694("hY\u0007t2#")), method1695(method1694("hY\u0007t0#")), method1695(method1694("hY\u0007t7#")), method1695(method1694("hY\u0007t4#")), method1695(method1694("hY\u0007t5#")), method1695(method1694("hY\u0007t1#")) };

    @OriginalMember(owner = "client!cfa", name = "j", descriptor = "I")
    public static int field2860 = 0;

    @OriginalMember(owner = "client!cfa", name = "k", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!cfa", name = "o", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!cfa", name = "n", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!cfa", name = "g", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!cfa", name = "l", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!cfa", name = "h", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!cfa", name = "m", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!cfa", name = "i", descriptor = "Lgda;")
    public static class58 field2861;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(I)I", line = 6)
    public final int method847(int arg0) {
        try {
            if (arg0 != 0) {
                this.method846(-65, false);
            }
            ++field2863;
            return 3;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2867[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(ILes;)V", line = 17)
    public class177(int arg0, class404 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(II)I", line = 20)
    public final int method852(int arg0, int arg1) {
        try {
            if (arg0 != 1) {
                method1692(22, (class77) null);
            }
            ++field2859;
            return 1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2867[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "(Z)I", line = 33)
    public final int method1690(boolean arg0) {
        try {
            if (!arg0) {
                field2860 = -89;
            }
            ++field2862;
            return super.field4849;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2867[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IZ)V", line = 45)
    public final void method846(int arg0, boolean arg1) {
        try {
            super.field4849 = arg0;
            ++field2864;
            if (arg1) {
                this.method1690(false);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2867[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(B)V", line = 56)
    public static void method1691(byte arg0) {
        try {
            if (arg0 >= 58) {
                field2861 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2867[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "(I)V", line = 70)
    public final void method848(int arg0) {
        try {
            ++field2866;
            if (arg0 != -20456) {
                field2861 = null;
            }
            if (super.field4849 < 0 || super.field4849 > 4) {
                super.field4849 = this.method847(0);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2867[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ILoi;)V", line = 83)
    public static final void method1692(int arg0, class77 arg1) {
        try {
            ++field2858;
            boolean var2 = false;
            if (class431.field6776 != arg1.field1115 && arg1.field1167 != -1 && arg1.field1186 == 0) {
                class210 var3 = class397.field6293.method2058(arg1.field1167, (byte) 1);
                if (var3.field3312 || ~var3.field3334[arg1.field1125] > ~(arg1.field1164 + 1)) {
                    var2 = true;
                }
            } else {
                var2 = true;
            }
            if (arg0 <= -99) {
                if (var2) {
                    int var4 = -arg1.field1195 + arg1.field1115;
                    int var5 = -arg1.field1195 + class431.field6776;
                    int var6 = arg1.field1187 * 512 + 256 * arg1.method804(true);
                    int var7 = arg1.field1107 * 512 + arg1.method804(true) * 256;
                    int var8 = arg1.field1153 * 512 + arg1.method804(true) * 256;
                    int var9 = arg1.field1136 * 512 + arg1.method804(true) * 256;
                    arg1.field9983 = ((-var5 + var4) * var7 + var5 * var9) / var4;
                    arg1.field9985 = ((-var5 + var4) * var6 + var5 * var8) / var4;
                }
                arg1.field1206 = 0;
                if (~arg1.field1170 == -1) {
                    arg1.method808(false, -107, 8192);
                }
                if (~arg1.field1170 == -2) {
                    arg1.method808(false, 123, 12288);
                }
                if (arg1.field1170 == 2) {
                    arg1.method808(false, -4, 0);
                }
                if (~arg1.field1170 == -4) {
                    arg1.method808(false, -18, 4096);
                }
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field2867[1] + arg0 + ',' + (arg1 != null ? field2867[2] : field2867[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(Les;)V", line = 140)
    public class177(class404 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "(II)I", line = 144)
    public static final int method1693(int arg0, int arg1) {
        try {
            if (arg1 != -4) {
                method1693(-105, -31);
            }
            ++field2865;
            return arg0 >>> 8;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2867[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1694(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 118);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1695(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 11;
                    break;
                case 1:
                    var10005 = 63;
                    break;
                case 2:
                    var10005 = 102;
                    break;
                case 3:
                    var10005 = 90;
                    break;
                default:
                    var10005 = 118;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

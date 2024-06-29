import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public abstract class class6 extends class202 {

    @OriginalMember(owner = "client!jea", name = "K", descriptor = "[Ljava/lang/String;")
    private static final String[] field85 = new String[] { method48(method47("/V\u0013\u001d/")), method48(method47(":\rQ_")), method48(method47(">\u001d\\\u001d\u0015\u0015P")), method48(method47(">\u001d\\\u001d\u0017|")), method48(method47(">\u001d\\\u001d\u0016|")), method48(method47(">\u001d\\\u001d\u0014|")), method48(method47(">\u001d\\\u001d\u0015|")), method48(method47(">\u001d\\\u001dn=\u0016TGl|")), method48(method47(">\u001d\\\u001d\u001b\u0015P")), method48(method47(">\u001d\\\u001d\u0010|")), method48(method47(">\u001d\\\u001d\u001a\u0015P")) };

    @OriginalMember(owner = "client!jea", name = "D", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!jea", name = "I", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!jea", name = "C", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!jea", name = "G", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!jea", name = "F", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!jea", name = "B", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!jea", name = "E", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!jea", name = "H", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!jea", name = "J", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(Ljava/lang/String;Z)I", line = 3)
    public static final int method39(String arg0, boolean arg1) {
        try {
            ++field83;
            int var2 = arg0.length();
            int var3 = 0;
            if (!arg1) {
                field81 = 99;
            }
            for (int var4 = 0; ~var4 > ~var2; ++var4) {
                var3 = (var3 << 5) + -var3 + arg0.charAt(var4);
            }
            return var3;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field85[5] + (arg0 != null ? field85[0] : field85[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(IBILrfa;ZILha;)V", line = 25)
    public final void method40(int arg0, byte arg1, int arg2, class202 arg3, boolean arg4, int arg5, class18 arg6) {
        try {
            ++field84;
            int var8 = -25 / ((arg1 - 9) / 35);
            throw new IllegalStateException();
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field85[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field85[0] : field85[1]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field85[0] : field85[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(B[Lta;)I", line = 38)
    public final int method41(byte arg0, class330[] arg1) {
        try {
            ++field80;
            int var3 = -125 / ((45 - arg0) / 33);
            return this.method1732(super.field2969 >> class179.field2328, super.field2984 >> class179.field2328, arg1, 16);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field85[2] + arg0 + ',' + (arg1 != null ? field85[0] : field85[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(IIIII)V", line = 48)
    public class6(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            super.field2971 = (byte) arg4;
            super.field2969 = arg0;
            super.field2981 = (byte) arg3;
            super.field2984 = arg2;
            super.field2975 = arg1;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field85[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(IIIZIIIII)V", line = 61)
    public static final void method42(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            ++field82;
            if (class314.method2496(arg8, (byte) -31)) {
                int var10 = 0;
                int var11 = 0;
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                if (class212.field3119) {
                    var11 = class560.field8148;
                    var10 = class665.field9397;
                    var13 = class387.field5646;
                    var14 = class183.field2371;
                    var12 = class151.field1932;
                    class183.field2371 = 1;
                }
                if (class646.field9185[arg8] == null) {
                    class133.method1155(arg1, -1, arg7, (byte) 63, arg6, arg0, arg4, arg4 < 0, arg2, arg5, class9.field117[arg8]);
                } else {
                    class133.method1155(arg1, -1, arg7, (byte) 100, arg6, arg0, arg4, arg4 < 0, arg2, arg5, class646.field9185[arg8]);
                }
                if (class212.field3119) {
                    if (~arg4 <= -1 && class183.field2371 == 2) {
                        class232.method1925(class560.field8148, class665.field9397, class387.field5646, class151.field1932, (byte) 108);
                    }
                    class151.field1932 = var12;
                    class560.field8148 = var11;
                    class387.field5646 = var13;
                    class183.field2371 = var14;
                    class665.field9397 = var10;
                }
                if (!arg3) {
                    method42(2, 123, 49, false, -4, 70, -117, 108, -34);
                }
            } else if (~arg4 != 0) {
                class752.field10742[arg4] = true;
            } else {
                for (int var9 = 0; var9 < 100; ++var9) {
                    class752.field10742[var9] = true;
                }
            }
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field85[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(B)Z", line = 128)
    public final boolean method43(byte arg0) {
        try {
            ++field79;
            int var2 = -73 / ((-37 - arg0) / 55);
            return class30.field385[(super.field2969 >> class179.field2328) + -class269.field3812 + class501.field7316][(super.field2984 >> class179.field2328) - (-class501.field7316 + class98.field1331)];
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field85[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jea", name = "d", descriptor = "(B)V", line = 138)
    public final void method44(byte arg0) {
        try {
            ++field76;
            if (arg0 < 111) {
                field81 = -72;
            }
            throw new IllegalStateException();
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field85[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(Lha;B)Z", line = 151)
    public final boolean method45(class18 arg0, byte arg1) {
        try {
            ++field77;
            if (arg1 >= -76) {
                this.method41((byte) -93, (class330[]) null);
            }
            class219 var3 = class732.method5328(super.field2981, super.field2969 >> class179.field2328, super.field2984 >> class179.field2328);
            return var3 != null && var3.field3188.field8667 ? class86.method861(super.field2981, var3.field3188.method575(false) - -this.method575(false), super.field2984 >> class179.field2328, (byte) 79, super.field2969 >> class179.field2328) : class499.method3829(-1, super.field2981, super.field2984 >> class179.field2328, super.field2969 >> class179.field2328);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field85[10] + (arg0 != null ? field85[0] : field85[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jea", name = "g", descriptor = "(I)Z", line = 169)
    public final boolean method46(int arg0) {
        try {
            ++field78;
            if (arg0 > -97) {
                this.method40(-51, (byte) -5, -106, (class202) null, true, -83, (class18) null);
            }
            return false;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field85[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method47(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 82);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method48(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 84;
                    break;
                case 1:
                    var10005 = 120;
                    break;
                case 2:
                    var10005 = 61;
                    break;
                case 3:
                    var10005 = 51;
                    break;
                default:
                    var10005 = 82;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class750 extends class497 {

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10689 = new String[] { method5435(method5434("#\u0001\u001b\u001b\u001a")), method5435(method5434("#\u0001\u001b\u001f\u001a")), method5435(method5434("#\u0001\u001b\u0018\u001a")), method5435(method5434("#\u0001\u001b\u0016\u001a")), method5435(method5434("#\u0001\u001b\u0013\u001a")), method5435(method5434("#\u0001\u001b\u0019\u001a")), method5435(method5434("#\u0001\u001b\u0012\u001a")), method5435(method5434("#\u0001\u001b\u001d\u001a")), method5435(method5434("#\u0001\u001b\u0017\u001a")), method5435(method5434("#\u0001\u001b\u001a\u001a")), method5435(method5434("#\u0001\u001b\u001c\u001a")), method5435(method5434("#\u0001\u001b\u0010\u001a")) };

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field10676 = 1338;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public static int field10684 = 0;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field10675;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field10677;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field10679;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public static int field10680;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field10681;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field10682;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    public static int field10683;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    public static int field10685;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    public static int field10686;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    public static int field10687;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field10688;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "Lo;")
    public static class484 field10678;

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(ILpp;)V")
    public class750(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZJII)Ljava/lang/String;")
    public static final String method5426(boolean arg0, long arg1, int arg2, int arg3) {
        try {
            ++field10687;
            Calendar var5;
            if (arg0) {
                class419.method3265(arg1, true);
                var5 = class267.field3791;
            } else {
                class635.method4635(true, arg1);
                var5 = class267.field3785;
            }
            if (arg3 != 3675) {
                field10684 = -67;
            }
            int var6 = var5.get(5);
            int var7 = var5.get(2);
            int var8 = var5.get(1);
            int var9 = var5.get(11);
            int var10 = var5.get(12);
            return arg2 == 3 ? class477.method3695(arg0, arg3 + -3767, arg2, arg1) : Integer.toString(var6 / 10) + var6 % 10 + "-" + class604.field8670[arg2][var7] + "-" + var8 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field10689[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)I")
    public final int method1029(byte arg0, int arg1) {
        try {
            if (arg0 != -73) {
                method5426(false, -30L, -79, -125);
            }
            ++field10683;
            return 3;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10689[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)I")
    public final int method5427(int arg0) {
        try {
            if (arg0 != 3) {
                method5428(-128, 96, -60);
            }
            ++field10677;
            return super.field7292;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10689[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)Z")
    public static final boolean method5428(int arg0, int arg1, int arg2) {
        try {
            ++field10675;
            return arg2 > -57 ? false : ~(arg1 & 544) == -545 | (arg1 & 24) != 0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10689[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)I")
    public final int method1032(int arg0) {
        try {
            ++field10679;
            if (arg0 > -101) {
                method5426(false, 93L, 75, 24);
            }
            return super.field7293.method4684(8) == class378.field5530 && super.field7293.method4677(78) ? 0 : 1;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10689[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(II)S")
    public static final short method5429(int arg0, int arg1) {
        try {
            ++field10680;
            int var2 = arg1 >> 10 & 63;
            int var3 = (903 & arg1) >> 3;
            int var4 = arg1 & 127;
            int var5 = var4 <= 64 ? var3 * var4 >> 7 : (-var4 + 127) * var3 >> 7;
            int var6 = 14 % ((50 - arg0) / 50);
            int var7 = var4 + var5;
            int var8;
            if (var7 == 0) {
                var8 = var5 << 1;
            } else {
                var8 = (var5 << 8) / var7;
            }
            return (short) (var7 | var8 >> 4 << 7 | var2 << 10);
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field10689[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)Lld;")
    public static final class87 method5430(byte arg0) {
        try {
            ++field10686;
            if (arg0 != 1) {
                return null;
            } else {
                class87 var1 = (class87) class304.field4230.method3611(-126);
                if (var1 != null) {
                    --class7.field96;
                    return var1;
                } else {
                    return new class87();
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10689[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
    public final void method1031(byte arg0) {
        try {
            super.field7292 = this.method1032(-117);
            ++field10681;
            if (arg0 > -70) {
                this.method1032(108);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10689[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IBIII)V")
    public static final void method5431(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        try {
            ++field10685;
            if (arg3 != 8 && arg3 != 16) {
                class621 var7 = class608.field8715[arg2][arg0][arg4];
                if (var7 != null) {
                    if (arg3 == 1) {
                        var7.field8843 = 0;
                    } else if (~arg3 == -3) {
                        var7.field8853 = 0;
                    }
                }
                class258.method2152(105);
            } else {
                for (int var5 = 0; var5 < class151.field1936; ++var5) {
                    class182 var6 = class503.field7357[var5];
                    if (~var6.field2347 == ~arg3 && var6.field2354 == arg0 && ~var6.field2357 == ~arg4 || ~var6.field2348 == ~arg0 && ~var6.field2357 == ~arg4) {
                        if (class151.field1936 != var5) {
                            class569.method4246(class503.field7357, var5 + 1, class503.field7357, var5, -var5 + -1 + class503.field7357.length);
                        }
                        --class151.field1936;
                        return;
                    }
                }
            }
            if (arg1 > -44) {
                field10684 = -18;
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field10689[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)V")
    public static void method5432(int arg0) {
        try {
            if (arg0 != 1313245319) {
                method5430((byte) 70);
            }
            field10678 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10689[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lpp;)V")
    public class750(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V")
    public final void method1030(int arg0, int arg1) {
        try {
            if (arg0 != 64) {
                field10676 = 76;
            }
            super.field7292 = arg1;
            ++field10688;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10689[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)[Lrj;")
    public static final class252[] method5433(byte arg0) {
        try {
            ++field10682;
            int var1 = 116 % ((arg0 - -8) / 63);
            return new class252[] { class783.field11302, class632.field8982, class790.field11490 };
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10689[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5434(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 50);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5435(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 64;
                    break;
                case 1:
                    var10005 = 102;
                    break;
                case 2:
                    var10005 = 53;
                    break;
                case 3:
                    var10005 = 94;
                    break;
                default:
                    var10005 = 50;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

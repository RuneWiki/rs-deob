import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public class class252 extends class232 {

    @OriginalMember(owner = "client!eia", name = "H", descriptor = "I")
    private int field3852 = 1;

    @OriginalMember(owner = "client!eia", name = "O", descriptor = "I")
    private int field3856 = 1;

    @OriginalMember(owner = "client!eia", name = "M", descriptor = "I")
    private int field3854 = 204;

    @OriginalMember(owner = "client!eia", name = "I", descriptor = "[Ljava/lang/String;")
    private static final String[] field3858 = new String[] { method2142(method2141("ujoh@8")), method2142(method2141("ujohE8")), method2142(method2141("ujohB8")), method2142(method2141("k- hy")), method2142(method2141("~vb*")), method2142(method2141("ujohA8")), method2142(method2141("ujohH8")) };

    @OriginalMember(owner = "client!eia", name = "L", descriptor = "I")
    public static int field3850 = 0;

    @OriginalMember(owner = "client!eia", name = "P", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!eia", name = "N", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!eia", name = "J", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!eia", name = "G", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!eia", name = "K", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!eia", name = "d", descriptor = "(II)Z")
    public static final boolean method2138(int arg0, int arg1) {
        try {
            ++field3851;
            if (arg1 != 50 && ~arg1 != -24 && arg1 != 44 && ~arg1 != -26 && ~arg1 != -1010) {
                if (arg0 != -1) {
                    field3850 = -84;
                }
                return ~arg1 == -46 || ~arg1 == -1002;
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3858[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(IIIIIILha;)V")
    public static final void method2139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class63 arg6) {
        try {
            if ((class486.field7354 == null || class338.field5513 == null || class789.field11531 == null) && class550.field8065.method595(-2, class578.field8316) && class550.field8065.method595(-2, class173.field2763) && class550.field8065.method595(-2, class227.field3551)) {
                class174 var7 = class174.method1608(class550.field8065, class173.field2763, 0);
                class338.field5513 = arg6.method213(var7, true);
                var7.method1606();
                class433.field6804 = arg6.method213(var7, true);
                class486.field7354 = arg6.method213(class174.method1608(class550.field8065, class578.field8316, 0), true);
                class174 var8 = class174.method1608(class550.field8065, class227.field3551, 0);
                class789.field11531 = arg6.method213(var8, true);
                var8.method1606();
                class461.field7107 = arg6.method213(var8, true);
            }
            int var9 = -77 / ((arg3 - 22) / 45);
            ++field3857;
            if (class486.field7354 != null && class338.field5513 != null && class789.field11531 != null) {
                int var10 = (arg1 + -(class789.field11531.method7() * 2)) / class486.field7354.method7();
                for (int var11 = 0; ~var10 < ~var11; ++var11) {
                    class486.field7354.method1001(class789.field11531.method7() + arg4 + class486.field7354.method7() * var11, -class486.field7354.method13() + arg2 + arg0);
                }
                int var12 = (arg2 + (-arg5 - class789.field11531.method13())) / class338.field5513.method13();
                for (int var13 = 0; ~var12 < ~var13; ++var13) {
                    class338.field5513.method1001(arg4, arg0 + arg5 + class338.field5513.method13() * var13);
                    class433.field6804.method1001(-class433.field6804.method7() + arg4 + arg1, arg0 - (-arg5 - var13 * class338.field5513.method13()));
                }
                class789.field11531.method1001(arg4, arg0 + arg2 + -class789.field11531.method13());
                class461.field7107.method1001(-class789.field11531.method7() + arg4 + arg1, -class789.field11531.method13() + (arg0 - -arg2));
            }
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field3858[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field3858[3] : field3858[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(ILwq;I)V")
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (~arg2 == -3) {
                        this.field3854 = arg1.method1687((byte) -103);
                    }
                } else {
                    this.field3852 = arg1.method1645((byte) -126);
                }
            } else {
                this.field3856 = arg1.method1645((byte) -82);
            }
            if (arg0 <= 96) {
                this.field3856 = 58;
            }
            ++field3849;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field3858[5] + arg0 + ',' + (arg1 != null ? field3858[3] : field3858[4]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!eia", name = "<init>", descriptor = "()V")
    public class252() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        try {
            ++field3853;
            if (arg1 != 123) {
                this.field3852 = -60;
            }
            int[] var3 = super.field3601.method3467(arg0, (byte) -61);
            if (super.field3601.field6907) {
                for (int var4 = 0; ~var4 > ~class449.field6969; ++var4) {
                    int var5 = class788.field11518[var4];
                    int var6 = class100.field1467[arg0];
                    int var7 = this.field3856 * var5 >> 12;
                    int var8 = this.field3852 * var6 >> 12;
                    int var9 = var5 % (4096 / this.field3856) * this.field3856;
                    int var10 = var6 % (4096 / this.field3852) * this.field3852;
                    if (~this.field3854 < ~var10) {
                        for (var7 -= var8; var7 < 0; var7 += 4) {
                        }
                        while (var7 > 3) {
                            var7 -= 4;
                        }
                        if (var7 != 1) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (var9 < this.field3854) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (~this.field3854 < ~var9) {
                        int var11;
                        for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                        }
                        while (~var11 < -4) {
                            var11 -= 4;
                        }
                        if (~var11 < -1) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    var3[var4] = 4096;
                }
            }
            return var3;
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field3858[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eia", name = "c", descriptor = "(II)V")
    public static final void method2140(int arg0, int arg1) {
        try {
            if (arg1 >= -127) {
                field3850 = 0;
            }
            if (~class193.field3048 == -2) {
                class223.field3502 = arg0;
            } else if (~class193.field3048 == -3) {
                class632.field9086 = arg0;
            }
            ++field3855;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3858[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2141(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 4);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2142(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 16;
                    break;
                case 1:
                    var10005 = 3;
                    break;
                case 2:
                    var10005 = 14;
                    break;
                case 3:
                    var10005 = 70;
                    break;
                default:
                    var10005 = 4;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

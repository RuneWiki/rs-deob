import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class40 extends class593 {

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "F")
    private float field610 = 0.0F;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "Ljd;")
    private class130 field606;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field618 = new String[] { method465(method464("\u001f=EKy")), method465(method464("\nf\u0007\t")), method465(method464("\u0017rE&,")), method465(method464("\u0017rE#,")), method465(method464("\u0017rE ,")), method465(method464("\u0017rEYm\nz\u001f[,")), method465(method464("\u0017rE5,")), method465(method464("\u0017rE$,")), method465(method464("\u0017rE,,")), method465(method464("\u0017rE*,")), method465(method464("\u0017rE',")), method465(method464("\u0010q\u0019\u0000b\u0016v\u0018\r")), method465(method464("\u0017rE-,")), method465(method464("\u0017rE!,")), method465(method464("\u0017rE(,")), method465(method464("\u0017rE\",")) };

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IBLah;)V")
    public final void method452(int arg0, byte arg1, class764 arg2) {
        try {
            ++field617;
            super.field8530.method2668(24, arg2);
            if (arg1 != -106) {
                this.field610 = 2.13772F;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field618[15] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field618[0] : field618[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BIZI)I")
    public static final int method453(byte arg0, int arg1, boolean arg2, int arg3) {
        try {
            ++field612;
            class375 var4 = class279.method2276(arg2, 0, arg1);
            if (var4 == null) {
                return -1;
            } else if (arg0 > -16) {
                return -33;
            } else {
                return arg3 >= 0 && var4.field5476.length > arg3 ? var4.field5476[arg3] : -1;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field618[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZ)V")
    public final void method454(int arg0, boolean arg1) {
        try {
            super.field8530.method2661(127, 1);
            ++field607;
            super.field8530.method2624(class647.field9205, (byte) 120, class256.field3668);
            super.field8530.method2096(true, false, (byte) -73, class784.field11325, 0);
            super.field8530.method2670(-128, 0, class514.field7551);
            super.field8530.method2124((byte) 122, 0);
            super.field8530.method2661(80, 0);
            super.field8530.method2658(-16777216, -8793);
            super.field8530.method2670(-128, 0, class659.field9335);
            int var3 = -78 / ((-51 - arg0) / 39);
            this.method456(30824);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field618[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
    public final void method455(int arg0) {
        try {
            super.field8530.method2661(arg0 + 15264, 1);
            ++field604;
            super.field8530.method2624(class539.field7920, (byte) 104, class539.field7920);
            super.field8530.method2655(1, 0, class784.field11325);
            super.field8530.method2670(-128, 0, class784.field11325);
            super.field8530.method2124((byte) 127, 1);
            super.field8530.method2668(24, (class764) null);
            if (arg0 != -15226) {
                method457((byte) 96);
            }
            super.field8530.method2661(arg0 ^ -15171, 0);
            super.field8530.method2670(-128, 0, class784.field11325);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field618[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "(I)V")
    public final void method456(int arg0) {
        try {
            ++field613;
            if (~super.field8530.method2635(false) == -1) {
                class639 var2 = super.field8530.method2680((byte) -77);
                super.field8530.method2661(122, 1);
                class639 var3 = super.field8530.method2642(true);
                var3.method733(var2);
                var3.method4663(1.0F, -1, 0.125F, 0.125F);
                var3.method4650(this.field610, 109, 0.0F, 0.0F);
                super.field8530.method2650(class433.field6275, -95);
                super.field8530.method2661(36, 0);
            }
            if (arg0 != 30824) {
                this.method454(65, true);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field618[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
    public static final void method457(byte arg0) {
        try {
            class430.field6243 = null;
            ++field609;
            if (class212.field3119 && ~class680.method4883(51) != -2) {
                class283.method2298(0, class111.method1042(-79), class559.field8139 == 3 || class559.field8139 == 7, 0, -17832, class38.method443(true));
            }
            int var1 = 0;
            int var2 = 0;
            if (class212.field3119) {
                var1 = class784.method5647((byte) 105);
                var2 = class30.method328(-17233);
            }
            class6.method42(var2 - -class711.field9998, var2, var2, true, -1, var1, class391.field5700 + var1, var1, class572.field8291);
            if (arg0 != 4) {
                field615 = 22;
            }
            if (class430.field6243 != null) {
                class133.method1155(class693.field9686, -1412584499, var1, (byte) 64, var1 - -class391.field5700, class711.field9998 + var2, class198.field2936.field11130, true, var2, class51.field727, class430.field6243);
                class430.field6243 = null;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field618[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Ljj;Ljd;)V")
    public class40(class334 arg0, class130 arg1) {
        super(arg0);
        try {
            this.field606 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field618[5] + (arg0 != null ? field618[0] : field618[1]) + ',' + (arg1 != null ? field618[0] : field618[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)Z")
    public final boolean method458(int arg0) {
        try {
            ++field608;
            if (arg0 <= 70) {
                this.field610 = -1.4466015F;
            }
            return this.field606.method1142((byte) -112);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field618[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLjc;)Lgca;")
    public static final class51 method459(byte arg0, class711 arg1) {
        try {
            ++field614;
            int var2 = arg1.method5116((byte) -109);
            if (arg0 < 123) {
                field615 = -39;
            }
            return new class51(var2);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field618[2] + arg0 + ',' + (arg1 != null ? field618[0] : field618[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BZ)V")
    public final void method460(byte arg0, boolean arg1) {
        try {
            if (arg0 != -20) {
                method457((byte) -104);
            }
            super.field8530.method2624(class539.field7920, (byte) 105, class256.field3668);
            ++field603;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field618[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIJ)Ljava/lang/String;")
    public static final String method461(int arg0, int arg1, long arg2) {
        try {
            class635.method4635(true, arg2);
            ++field611;
            int var4 = class267.field3785.get(5);
            int var5 = 1 + class267.field3785.get(2);
            if (arg0 != -21905) {
                method453((byte) 51, -108, true, 8);
            }
            int var6 = class267.field3785.get(1);
            return Integer.toString(var4 / 10) + var4 % 10 + "/" + var5 / 10 + var5 % 10 + "/" + var6 % 100 / 10 + var6 % 10;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field618[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)V")
    public static final void method462(boolean arg0) {
        try {
            ++field605;
            if (class581.field8393 != class35.field426) {
                if (arg0) {
                    method453((byte) 119, 118, false, 11);
                }
                try {
                    class192.method1601(field618[11], class572.field8287, 4368);
                } catch (Throwable var2) {
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field618[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIB)V")
    public final void method463(int arg0, int arg1, byte arg2) {
        try {
            ++field616;
            super.field8530.method2661(97, 1);
            if (arg2 > -98) {
                method461(-45, -18, 16L);
            }
            if (~(128 & arg0) != -1) {
                super.field8530.method2668(24, (class764) null);
            } else if (~(arg1 & 1) != -2) {
                if (!this.field606.field1621) {
                    super.field8530.method2668(24, this.field606.field1615[0]);
                } else {
                    super.field8530.method2668(24, this.field606.field1618);
                }
            } else if (this.field606.field1621) {
                this.field610 = (float) (super.field8530.field4774 % 4000) / 4000.0F;
                super.field8530.method2668(24, this.field606.field1618);
            } else {
                int var4 = super.field8530.field4774 % 4000 * 16 / 4000;
                super.field8530.method2668(24, this.field606.field1615[var4]);
            }
            super.field8530.method2661(41, 0);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field618[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method464(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 4);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method465(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 100;
                    break;
                case 1:
                    var10005 = 19;
                    break;
                case 2:
                    var10005 = 107;
                    break;
                case 3:
                    var10005 = 101;
                    break;
                default:
                    var10005 = 4;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

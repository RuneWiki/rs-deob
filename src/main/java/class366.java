import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class366 extends class211 {

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
    private int field5592 = 5;

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "I")
    private int field5594 = 2;

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "I")
    private int field5602 = 2048;

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "I")
    private int field5593 = 0;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
    private int field5606 = 5;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "[B")
    private byte[] field5603 = new byte[512];

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "[S")
    private short[] field5595 = new short[512];

    @OriginalMember(owner = "client!sc", name = "T", descriptor = "I")
    private int field5605 = 1;

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "[Ljava/lang/String;")
    private static final String[] field5609 = new String[] { method2971(method2970("\nSRT@")), method2971(method2970("\u0017E\u0010r")), method2971(method2970("\u0002\u001eR0\u0015")), method2971(method2970("\nSRR@")), method2971(method2970("\nSRV@")), method2971(method2970("\nSR\\@")), method2971(method2970("\nSR_@")), method2971(method2970("\nSR[@")), method2971(method2970("\nSRX@")), method2971(method2970("\nSR]@")), method2971(method2970("\nSRU@")) };

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "Lla;")
    public static class476 field5598;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V")
    private final void method2962(int arg0) {
        try {
            ++field5600;
            Random var2 = new Random((long) this.field5593);
            this.field5595 = new short[512];
            int var3 = 6 % ((-54 - arg0) / 35);
            if (~this.field5602 < -1) {
                for (int var4 = 0; ~var4 > -513; ++var4) {
                    this.field5595[var4] = (short) class656.method4817(this.field5602, var2, (byte) -92);
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field5609[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(III)V")
    public static final void method2963(int arg0, int arg1, int arg2) {
        boolean var3 = class734.field10683[0][arg1][arg2] != null && class734.field10683[0][arg1][arg2].field1088 != null;
        for (int var4 = arg0; var4 >= 0; --var4) {
            if (class734.field10683[var4][arg1][arg2] == null) {
                class96 var5 = class734.field10683[var4][arg1][arg2] = new class96(var4);
                if (var3) {
                    ++var5.field1083;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(CZI)I")
    public static final int method2964(char arg0, boolean arg1, int arg2) {
        try {
            if (arg1) {
                field5598 = null;
            }
            ++field5607;
            int var3 = arg0 << 4;
            if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
                char var6 = Character.toLowerCase(arg0);
                var3 = (var6 << 4) + 1;
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5609[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Laaa;)V")
    public static final void method2965(class643 arg0) {
        if (class559.field8328 < 65535) {
            class471 var1 = arg0.field9313;
            class96.field1076[class559.field8328] = arg0;
            class192.field2596[class559.field8328] = false;
            ++class559.field8328;
            int var2 = arg0.field9330;
            if (arg0.field9320) {
                var2 = 0;
            }
            int var3 = arg0.field9330;
            if (arg0.field9317) {
                var3 = class501.field7246 - 1;
            }
            for (int var4 = var2; var4 <= var3; ++var4) {
                int var5 = 0;
                int var6 = var1.method3580((byte) -123) - var1.method3579((byte) 126) + class578.field8582 >> class602.field8828;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = var1.method3580((byte) -124) + var1.method3579((byte) 126) - class578.field8582 >> class602.field8828;
                if (var7 >= class216.field3296) {
                    var7 = class216.field3296 - 1;
                }
                for (int var8 = var6; var8 <= var7; ++var8) {
                    short var9 = arg0.field9327[var5++];
                    int var10 = (var1.method3577(-32630) - var1.method3579((byte) 127) + class578.field8582 >> class602.field8828) + (var9 >>> 8);
                    int var11 = (var9 & 255) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 >= class132.field1543) {
                        var11 = class132.field1543 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; ++var12) {
                        long var13 = class546.field8158[var4][var12][var8];
                        if ((var13 & 65535L) == 0L) {
                            class546.field8158[var4][var12][var8] = var13 | (long) class559.field8328;
                        } else if ((var13 & 4294901760L) == 0L) {
                            class546.field8158[var4][var12][var8] = var13 | (long) class559.field8328 << 16;
                        } else if ((var13 & 281470681743360L) == 0L) {
                            class546.field8158[var4][var12][var8] = var13 | (long) class559.field8328 << 32;
                        } else if ((var13 & -281474976710656L) == 0L) {
                            class546.field8158[var4][var12][var8] = var13 | (long) class559.field8328 << 48;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "(I)V")
    public static void method2966(int arg0) {
        try {
            field5598 = null;
            if (arg0 != -3) {
                field5598 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5609[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBIILjava/lang/String;III)V")
    public static final void method2967(int arg0, byte arg1, int arg2, int arg3, String arg4, int arg5, int arg6, int arg7) {
        try {
            ++field5608;
            int var8 = -98 % ((arg1 - 68) / 41);
            class14 var9 = new class14();
            var9.field180 = class375.field5711 + arg2;
            var9.field177 = arg5;
            var9.field182 = arg6;
            var9.field174 = arg3;
            var9.field173 = arg7;
            var9.field183 = arg4;
            var9.field175 = arg0;
            class712.field10331.method4541((byte) -118, var9);
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field5609[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field5609[2] : field5609[1]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)I")
    public static final int method2968(int arg0, boolean arg1) {
        try {
            ++field5597;
            if (arg1) {
                method2966(118);
            }
            int var2 = 63 & arg0;
            int var3 = arg0 >> 6 & 3;
            if (~var2 == -19) {
                if (~var3 == -1) {
                    return 1;
                }
                if (~var3 == -2) {
                    return 2;
                }
                if (var3 == 2) {
                    return 4;
                }
                if (var3 == 3) {
                    return 8;
                }
            } else if (~var2 == -20 || var2 == 21) {
                if (var3 == 0) {
                    return 16;
                }
                if (var3 == 1) {
                    return 32;
                }
                if (~var3 == -3) {
                    return 64;
                }
                if (var3 == 3) {
                    return 128;
                }
            }
            return 0;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5609[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BILib;)V")
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            if (arg0 <= 67) {
                this.method437(-27);
            }
            ++field5596;
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (~arg1 != -3) {
                        if (~arg1 != -4) {
                            if (arg1 != 4) {
                                if (~arg1 != -6) {
                                    if (arg1 == 6) {
                                        this.field5592 = arg2.method1455((byte) 62);
                                    }
                                } else {
                                    this.field5606 = arg2.method1455((byte) 62);
                                }
                            } else {
                                this.field5605 = arg2.method1455((byte) 62);
                            }
                        } else {
                            this.field5594 = arg2.method1455((byte) 62);
                        }
                    } else {
                        this.field5602 = arg2.method1445((byte) 122);
                    }
                } else {
                    this.field5593 = arg2.method1455((byte) 62);
                }
            } else {
                this.field5606 = this.field5592 = arg2.method1455((byte) 62);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field5609[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5609[2] : field5609[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
    public class366() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public final void method437(int arg0) {
        try {
            this.field5603 = class705.method5154(this.field5593, (byte) 67);
            if (arg0 != 27132) {
                method2965((class643) null);
            }
            ++field5599;
            this.method2962(-119);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5609[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)[I")
    public final int[] method197(int arg0, int arg1) {
        try {
            ++field5604;
            int[] var3 = super.field3231.method34((byte) -64, arg1);
            if (super.field3231.field57) {
                int var4 = class302.field4735[arg1] * this.field5592 + 2048;
                int var5 = var4 >> 12;
                int var6 = var5 + 1;
                for (int var7 = 0; var7 < class343.field5332; ++var7) {
                    class594.field8713 = Integer.MAX_VALUE;
                    class194.field2610 = Integer.MAX_VALUE;
                    class582.field8614 = Integer.MAX_VALUE;
                    class724.field10466 = Integer.MAX_VALUE;
                    int var8 = class88.field997[var7] * this.field5606 + 2048;
                    int var9 = var8 >> 12;
                    int var10 = var9 + 1;
                    for (int var11 = var5 + -1; var11 <= var6; ++var11) {
                        int var12 = 255 & this.field5603[255 & (~var11 <= ~this.field5592 ? -this.field5592 + var11 : var11)];
                        for (int var13 = var9 + -1; var10 >= var13; ++var13) {
                            int var14 = (this.field5603[(~var13 <= ~this.field5606 ? -this.field5606 + var13 : var13) + var12 & 255] & 255) * 2;
                            int var29 = var14 + 1;
                            int var15 = -this.field5595[var14] + -(var13 << 12) + var8;
                            int var16 = -(var11 << 12) + -this.field5595[var29] + var4;
                            int var17 = this.field5605;
                            int var18;
                            if (var17 != 1) {
                                if (~var17 != -4) {
                                    if (var17 != 4) {
                                        if (~var17 != -6) {
                                            if (~var17 == -3) {
                                                var18 = (var15 < 0 ? -var15 : var15) - -(var16 < 0 ? -var16 : var16);
                                            } else {
                                                var18 = (int) (Math.sqrt((double) ((float) (var15 * var15 - -(var16 * var16)) / 1.6777216E7F)) * 4096.0D);
                                            }
                                        } else {
                                            int var24 = var16 * var16;
                                            int var25 = var15 * var15;
                                            var18 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var24 + var25) / 1.6777216E7F))) * 4096.0D);
                                        }
                                    } else {
                                        int var21 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 >= 0 ? var15 : -var15) / 4096.0F)));
                                        int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                        int var23 = var21 + var22;
                                        var18 = var23 * var23 >> 12;
                                    }
                                } else {
                                    int var19 = ~var15 <= -1 ? var15 : -var15;
                                    int var20 = ~var16 > -1 ? -var16 : var16;
                                    var18 = var19 > var20 ? var19 : var20;
                                }
                            } else {
                                var18 = var15 * var15 + var16 * var16 >> 12;
                            }
                            if (var18 < class724.field10466) {
                                class594.field8713 = class194.field2610;
                                class194.field2610 = class582.field8614;
                                class582.field8614 = class724.field10466;
                                class724.field10466 = var18;
                            } else if (class582.field8614 > var18) {
                                class594.field8713 = class194.field2610;
                                class194.field2610 = class582.field8614;
                                class582.field8614 = var18;
                            } else if (var18 < class194.field2610) {
                                class594.field8713 = class194.field2610;
                                class194.field2610 = var18;
                            } else if (var18 < class594.field8713) {
                                class594.field8713 = var18;
                            }
                        }
                    }
                    int var26 = this.field5594;
                    if (~var26 != -1) {
                        if (var26 != 1) {
                            if (~var26 != -4) {
                                if (~var26 != -5) {
                                    if (var26 == 2) {
                                        var3[var7] = class582.field8614 - class724.field10466;
                                    }
                                } else {
                                    var3[var7] = class594.field8713;
                                }
                            } else {
                                var3[var7] = class194.field2610;
                            }
                        } else {
                            var3[var7] = class582.field8614;
                        }
                    } else {
                        var3[var7] = class724.field10466;
                    }
                }
            }
            if (arg0 != 8217) {
                method2967(125, (byte) 5, -124, -52, (String) null, 26, 18, 80);
            }
            return var3;
        } catch (RuntimeException var28) {
            throw class759.method5498(var28, field5609[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZB)I")
    public static final int method2969(boolean arg0, byte arg1) {
        try {
            ++field5601;
            if (arg1 <= 75) {
                method2965((class643) null);
            }
            int var2 = class166.field2283;
            if (~var2 != -1) {
                if (~var2 != -2) {
                    return ~var2 == -3 ? 0 : 0;
                } else {
                    return class738.field10736;
                }
            } else {
                return arg0 ? 0 : class738.field10736;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5609[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2970(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 104);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2971(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 121;
                    break;
                case 1:
                    var10005 = 48;
                    break;
                case 2:
                    var10005 = 124;
                    break;
                case 3:
                    var10005 = 30;
                    break;
                default:
                    var10005 = 104;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

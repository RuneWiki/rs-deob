import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class688 extends class182 {

    @OriginalMember(owner = "client!dv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9940 = new String[] { method5013(method5012("\r\th\ff")), method5013(method5012("\r\th\u000ff")), method5013(method5012("\r\th\bf")), method5013(method5012("\r\th\u000ef")), method5013(method5012("\r\th\u0013f")), method5013(method5012("\r\th\rf")) };

    @OriginalMember(owner = "client!dv", name = "l", descriptor = "I")
    public static int field9933;

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "I")
    public static int field9934;

    @OriginalMember(owner = "client!dv", name = "i", descriptor = "I")
    public static int field9935;

    @OriginalMember(owner = "client!dv", name = "m", descriptor = "I")
    public static int field9936;

    @OriginalMember(owner = "client!dv", name = "n", descriptor = "I")
    public static int field9937;

    @OriginalMember(owner = "client!dv", name = "j", descriptor = "Ldv;")
    public class688 field9938;

    @OriginalMember(owner = "client!dv", name = "k", descriptor = "Ldv;")
    public class688 field9939;

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "[[I")
    public static int[][] field9932;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
    public final void method5006(int arg0) {
        try {
            field9933++;
            if (this.field9938 != null) {
                this.field9938.field9939 = this.field9939;
                this.field9939.field9938 = this.field9938;
                if (arg0 == 0) {
                    this.field9938 = null;
                    this.field9939 = null;
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9940[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "(I)V")
    public static final void method5007(int arg0) {
        try {
            class452.field6991.method862(-45);
            field9937++;
            class295.field4813.method5242(1);
            class6.field55.method956((byte) 69);
            class370.field5999.method4000(30402);
            class395.field6267.method3139((byte) -20);
            class229.field3563.method527(false);
            class397.field6293.method2054((byte) -105);
            class779.field11366.method1863(1);
            class581.field8375.method721(true);
            class531.field7801.method2076((byte) -97);
            class519.field7687.method3205(false);
            class46.field518.method3009(-11187);
            class78.field1216.method3183((byte) 71);
            class179.field2874.method3728(-4587);
            class362.field5915.method2324((byte) 15);
            class161.field2548.method4535(-12203);
            class289.field4655.method93(0);
            class716.field10360.method4313(true);
            class653.field9349.method1284((byte) -124);
            class199.field3154.method5691(31);
            class100.field1465.method1844(256);
            class539.field7911.method1359((byte) 88);
            class723.field10619.method876(-3561);
            class236.method2042(4);
            class25.method274(22901);
            if (arg0 >= -15) {
                field9932 = null;
            }
            class7.method59(117);
            class304.method2609(2);
            if (class710.field10281 != class417.field6596) {
                for (int var1 = 0; var1 < class380.field6120.length; var1++) {
                    class380.field6120[var1] = null;
                }
                class252.field3850 = 0;
            }
            class121.method1178((byte) 101);
            class149.method1358(-1);
            class204.method1840(64);
            class494.method3737(false);
            class618.method4521(-85);
            class598.field8667.method304(1);
            class662.field9437.method194();
            class14.method101((byte) -3);
            class513.method3854(true);
            class404.field6396.method608(false);
            class37.field423.method608(false);
            class672.field9530.method608(false);
            class424.field6685.method608(false);
            class551.field8080.method608(false);
            class686.field9915.method608(false);
            class747.field11028.method608(false);
            class480.field7311.method608(false);
            class550.field8065.method608(false);
            class643.field9224.method608(false);
            class432.field6787.method608(false);
            class748.field11040.method608(false);
            class546.field8029.method608(false);
            class242.field3745.method608(false);
            class289.field4651.method608(false);
            class345.field5607.method608(false);
            class423.field6671.method608(false);
            class618.field8924.method608(false);
            class42.field473.method608(false);
            class659.field9417.method608(false);
            class374.field6062.method608(false);
            class719.field10519.method608(false);
            class58.field744.method608(false);
            class40.field467.method608(false);
            class793.field11598.method608(false);
            class104.field1526.method608(false);
            class200.field3160.method608(false);
            class233.field3609.method608(false);
            class362.field5846.method608(false);
            class440.field6872.method608(false);
            class453.field6996.method608(false);
            class177.field2861.method608(false);
            class599.field8684.method608(false);
            class82.field1252.method304(1);
            class738.field10844.method304(1);
            class320.field5210.method304(1);
            class607.field8753.method304(1);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9940[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIIIII)V")
    public static final void method5008(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            field9936++;
            class52.method542(0, arg5);
            int var7 = 0;
            int var8 = -34 % ((-arg2 - 15) / 48);
            int var9 = arg5 - arg6;
            if (var9 < 0) {
                var9 = 0;
            }
            int var10 = arg5;
            int var11 = -arg5;
            int var12 = var9;
            int var13 = -var9;
            int var14 = -1;
            int var15 = -1;
            if (class310.field5088 <= arg4 && arg4 <= class478.field7264) {
                int[] var16 = class193.field3047[arg4];
                int var17 = class694.method5039(class779.field11374, class546.field8030, 0, arg0 - arg5);
                int var18 = class694.method5039(class779.field11374, class546.field8030, 0, arg0 + arg5);
                int var19 = class694.method5039(class779.field11374, class546.field8030, 0, arg0 - var9);
                int var20 = class694.method5039(class779.field11374, class546.field8030, 0, arg0 + var9);
                class545.method4051(var17, arg3, var19, var16, -118);
                class545.method4051(var19, arg1, var20, var16, -124);
                class545.method4051(var20, arg3, var18, var16, -123);
            }
            while (var10 > var7) {
                var15 += 2;
                var14 += 2;
                var13 += var15;
                var11 += var14;
                if (var13 >= 0 && var12 >= 1) {
                    var12--;
                    var13 -= var12 << 1;
                    class30.field329[var12] = var7;
                }
                var7++;
                if (var11 >= 0) {
                    var10--;
                    var11 -= var10 << 1;
                    int var21 = arg4 - var10;
                    int var22 = arg4 + var10;
                    if (var22 >= class310.field5088 && class478.field7264 >= var21) {
                        if (var10 >= var9) {
                            int var23 = class694.method5039(class779.field11374, class546.field8030, 0, arg0 + var7);
                            int var24 = class694.method5039(class779.field11374, class546.field8030, 0, arg0 - var7);
                            if (var22 <= class478.field7264) {
                                class545.method4051(var24, arg3, var23, class193.field3047[var22], -122);
                            }
                            if (class310.field5088 <= var21) {
                                class545.method4051(var24, arg3, var23, class193.field3047[var21], -110);
                            }
                        } else {
                            int var25 = class30.field329[var10];
                            int var26 = class694.method5039(class779.field11374, class546.field8030, 0, arg0 + var7);
                            int var27 = class694.method5039(class779.field11374, class546.field8030, 0, arg0 - var7);
                            int var28 = class694.method5039(class779.field11374, class546.field8030, 0, arg0 + var25);
                            int var29 = class694.method5039(class779.field11374, class546.field8030, 0, arg0 - var25);
                            if (var22 <= class478.field7264) {
                                int[] var30 = class193.field3047[var22];
                                class545.method4051(var27, arg3, var29, var30, -117);
                                class545.method4051(var29, arg1, var28, var30, -118);
                                class545.method4051(var28, arg3, var26, var30, -116);
                            }
                            if (var21 >= class310.field5088) {
                                int[] var31 = class193.field3047[var21];
                                class545.method4051(var27, arg3, var29, var31, -110);
                                class545.method4051(var29, arg1, var28, var31, -127);
                                class545.method4051(var28, arg3, var26, var31, -124);
                            }
                        }
                    }
                }
                int var32 = arg4 - var7;
                int var33 = arg4 + var7;
                if (var33 >= class310.field5088 && var32 <= class478.field7264) {
                    int var34 = arg0 + var10;
                    int var35 = arg0 - var10;
                    if (var34 >= class546.field8030 && class779.field11374 >= var35) {
                        int var36 = class694.method5039(class779.field11374, class546.field8030, 0, var34);
                        int var37 = class694.method5039(class779.field11374, class546.field8030, 0, var35);
                        if (var7 < var9) {
                            int var38 = var12 >= var7 ? var12 : class30.field329[var7];
                            int var39 = class694.method5039(class779.field11374, class546.field8030, 0, arg0 + var38);
                            int var40 = class694.method5039(class779.field11374, class546.field8030, 0, arg0 - var38);
                            if (class478.field7264 >= var33) {
                                int[] var41 = class193.field3047[var33];
                                class545.method4051(var37, arg3, var40, var41, -122);
                                class545.method4051(var40, arg1, var39, var41, -126);
                                class545.method4051(var39, arg3, var36, var41, -108);
                            }
                            if (class310.field5088 <= var32) {
                                int[] var42 = class193.field3047[var32];
                                class545.method4051(var37, arg3, var40, var42, -116);
                                class545.method4051(var40, arg1, var39, var42, -109);
                                class545.method4051(var39, arg3, var36, var42, -117);
                            }
                        } else {
                            if (var33 <= class478.field7264) {
                                class545.method4051(var37, arg3, var36, class193.field3047[var33], -121);
                            }
                            if (class310.field5088 <= var32) {
                                class545.method4051(var37, arg3, var36, class193.field3047[var32], -128);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var44) {
            throw class590.method4333(var44, field9940[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Z)V")
    public static final void method5009(boolean arg0) {
        try {
            class121.method1178((byte) 73);
            field9934++;
            class617.field8910 = null;
            class603.field8714 = null;
            class214.field3370 = null;
            class55.field695 = null;
            if (!arg0) {
                field9932 = null;
            }
            class628.field9042 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9940[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "(I)V")
    public static final void method5010(int arg0) {
        try {
            if (arg0 == -1) {
                field9935++;
                class198.field3146 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9940[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)V")
    public static void method5011(int arg0) {
        try {
            if (arg0 != -1493089599) {
                method5011(-6);
            }
            field9932 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9940[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5012(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5013(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 105;
                    break;
                case 1:
                    var10005 = 127;
                    break;
                case 2:
                    var10005 = 70;
                    break;
                case 3:
                    var10005 = 67;
                    break;
                default:
                    var10005 = 78;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

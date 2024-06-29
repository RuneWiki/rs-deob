import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class517 {

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "I")
    public int field7661 = -1;

    @OriginalMember(owner = "client!hca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7669 = new String[] { method3883(method3882("dRh[")), method3883(method3882("q\t*\u0019z")), method3883(method3882("bDe\u0019A\"")), method3883(method3882("bDe\u0019D\"")), method3883(method3882("bDe\u0019E\"")), method3883(method3882("bDe\u0019B\"")), method3883(method3882("bDe\u0019C\"")), method3883(method3882("bDe\u0019F\"")) };

    @OriginalMember(owner = "client!hca", name = "o", descriptor = "I")
    public static int field7644;

    @OriginalMember(owner = "client!hca", name = "q", descriptor = "I")
    public static int field7645;

    @OriginalMember(owner = "client!hca", name = "s", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!hca", name = "x", descriptor = "I")
    public static int field7655;

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "I")
    public static int field7656;

    @OriginalMember(owner = "client!hca", name = "h", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "I")
    public static int field7666;

    @OriginalMember(owner = "client!hca", name = "u", descriptor = "Lqr;")
    private class69 field7665;

    @OriginalMember(owner = "client!hca", name = "p", descriptor = "Ljava/awt/Frame;")
    public static Frame field7660;

    @OriginalMember(owner = "client!hca", name = "i", descriptor = "Ljava/lang/String;")
    private String field7650;

    @OriginalMember(owner = "client!hca", name = "v", descriptor = "Ljava/lang/String;")
    private String field7668;

    @OriginalMember(owner = "client!hca", name = "l", descriptor = "[I")
    private int[] field7646;

    @OriginalMember(owner = "client!hca", name = "w", descriptor = "[I")
    private int[] field7647;

    @OriginalMember(owner = "client!hca", name = "f", descriptor = "[I")
    private int[] field7648;

    @OriginalMember(owner = "client!hca", name = "r", descriptor = "[I")
    private int[] field7651;

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "[I")
    private int[] field7657;

    @OriginalMember(owner = "client!hca", name = "k", descriptor = "[I")
    private int[] field7659;

    @OriginalMember(owner = "client!hca", name = "g", descriptor = "[I")
    private int[] field7663;

    @OriginalMember(owner = "client!hca", name = "y", descriptor = "[I")
    private int[] field7667;

    @OriginalMember(owner = "client!hca", name = "n", descriptor = "[Ljava/lang/String;")
    private String[] field7654;

    @OriginalMember(owner = "client!hca", name = "e", descriptor = "[Ljava/lang/String;")
    private String[] field7662;

    @OriginalMember(owner = "client!hca", name = "m", descriptor = "[[I")
    private int[][] field7649;

    @OriginalMember(owner = "client!hca", name = "j", descriptor = "[[I")
    private int[][] field7652;

    @OriginalMember(owner = "client!hca", name = "t", descriptor = "[[I")
    private int[][] field7664;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(BLwq;)V")
    public final void method3876(byte arg0, class176 arg1) {
        try {
            if (arg0 <= 36) {
                method3878(98, -34, 92);
            }
            while (true) {
                int var3 = arg1.method1645((byte) -72);
                if (var3 == 0) {
                    field7653++;
                    return;
                }
                this.method3879(30069, arg1, var3);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7669[2] + arg0 + ',' + (arg1 == null ? field7669[0] : field7669[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(ZZI)V")
    public static final void method3877(boolean arg0, boolean arg1, int arg2) {
        try {
            if (arg1) {
                class715.field10352++;
                class196.method1804((byte) -83);
            }
            field7658++;
            if (arg0) {
                class57.field708++;
                class161.method1515((byte) 114);
            }
            if (arg2 != 1) {
                method3881(-29);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7669[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(III)Z")
    public static final boolean method3878(int arg0, int arg1, int arg2) {
        try {
            field7666++;
            if (arg2 > -61) {
                field7644 = 16;
            }
            return (arg1 & 0x100) != 0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7669[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(ILwq;I)V")
    private final void method3879(int arg0, class176 arg1, int arg2) {
        try {
            if (arg0 != 30069) {
                this.field7668 = null;
            }
            field7655++;
            if (arg2 == 1) {
                this.field7668 = arg1.method1629(0);
            } else if (arg2 == 2) {
                this.field7650 = arg1.method1629(0);
            } else if (arg2 == 3) {
                int var22 = arg1.method1645((byte) -71);
                this.field7652 = new int[var22][3];
                for (int var23 = 0; var23 < var22; var23++) {
                    this.field7652[var23][0] = arg1.method1687((byte) -122);
                    this.field7652[var23][1] = arg1.method1622(-18712);
                    this.field7652[var23][2] = arg1.method1622(-18712);
                }
            } else if (arg2 == 4) {
                int var20 = arg1.method1645((byte) -115);
                this.field7664 = new int[var20][3];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field7664[var21][0] = arg1.method1687((byte) -51);
                    this.field7664[var21][1] = arg1.method1622(class251.method2133(arg0, -15459));
                    this.field7664[var21][2] = arg1.method1622(-18712);
                }
            } else if (arg2 == 5) {
                arg1.method1687((byte) -101);
            } else if (arg2 == 6) {
                arg1.method1645((byte) -93);
            } else if (arg2 == 7) {
                arg1.method1645((byte) -107);
                return;
            } else if (arg2 != 8) {
                if (arg2 == 9) {
                    arg1.method1645((byte) -100);
                    return;
                }
                if (arg2 == 10) {
                    int var4 = arg1.method1645((byte) -123);
                    this.field7659 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field7659[var5] = arg1.method1622(class251.method2133(arg0, -15459));
                    }
                    return;
                }
                if (arg2 == 12) {
                    arg1.method1622(-18712);
                    return;
                }
                if (arg2 != 13) {
                    if (arg2 != 14) {
                        if (arg2 == 15) {
                            arg1.method1687((byte) -107);
                            return;
                        }
                        if (arg2 == 17) {
                            this.field7661 = arg1.method1687((byte) -98);
                            return;
                        }
                        if (arg2 != 18) {
                            if (arg2 == 19) {
                                int var12 = arg1.method1645((byte) -82);
                                this.field7647 = new int[var12];
                                this.field7646 = new int[var12];
                                this.field7667 = new int[var12];
                                this.field7662 = new String[var12];
                                for (int var13 = 0; var13 < var12; var13++) {
                                    this.field7647[var13] = arg1.method1622(class251.method2133(arg0, -15459));
                                    this.field7646[var13] = arg1.method1622(-18712);
                                    this.field7667[var13] = arg1.method1622(-18712);
                                    this.field7662[var13] = arg1.method1635((byte) 78);
                                }
                            } else if (arg2 == 249) {
                                int var6 = arg1.method1645((byte) -96);
                                if (this.field7665 == null) {
                                    int var7 = class90.method883((byte) 103, var6);
                                    this.field7665 = new class69(var7);
                                }
                                for (int var8 = 0; var8 < var6; var8++) {
                                    boolean var9 = arg1.method1645((byte) -82) == 1;
                                    int var10 = arg1.method1685(false);
                                    class568 var11;
                                    if (var9) {
                                        var11 = new class525(arg1.method1635((byte) 103));
                                    } else {
                                        var11 = new class272(arg1.method1622(-18712));
                                    }
                                    this.field7665.method738(var11, (long) var10, arg0 - 42071);
                                }
                                return;
                            }
                            return;
                        }
                        int var14 = arg1.method1645((byte) -114);
                        this.field7654 = new String[var14];
                        this.field7663 = new int[var14];
                        this.field7657 = new int[var14];
                        this.field7648 = new int[var14];
                        for (int var15 = 0; var15 < var14; var15++) {
                            this.field7663[var15] = arg1.method1622(-18712);
                            this.field7657[var15] = arg1.method1622(-18712);
                            this.field7648[var15] = arg1.method1622(-18712);
                            this.field7654[var15] = arg1.method1635((byte) 111);
                        }
                        return;
                    }
                    int var16 = arg1.method1645((byte) -114);
                    this.field7649 = new int[var16][2];
                    for (int var17 = 0; var17 < var16; var17++) {
                        this.field7649[var17][0] = arg1.method1645((byte) -91);
                        this.field7649[var17][1] = arg1.method1645((byte) -128);
                    }
                    return;
                }
                int var18 = arg1.method1645((byte) -127);
                this.field7651 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field7651[var19] = arg1.method1687((byte) -60);
                }
                return;
            }
        } catch (RuntimeException var25) {
            throw class590.method4333(var25, field7669[3] + arg0 + ',' + (arg1 == null ? field7669[0] : field7669[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(B)V")
    public final void method3880(byte arg0) {
        try {
            field7645++;
            if (arg0 != -37) {
                this.field7663 = null;
            }
            if (this.field7650 == null) {
                this.field7650 = this.field7668;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7669[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)V")
    public static void method3881(int arg0) {
        try {
            field7660 = null;
            if (arg0 >= -32) {
                method3878(4, 30, -118);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7669[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3882(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3883(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 10;
                    break;
                case 1:
                    var10005 = 39;
                    break;
                case 2:
                    var10005 = 4;
                    break;
                case 3:
                    var10005 = 55;
                    break;
                default:
                    var10005 = 7;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

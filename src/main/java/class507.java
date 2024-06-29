import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class507 implements class515 {

    @OriginalMember(owner = "client!ae", name = "V", descriptor = "[Ljava/lang/String;")
    private static final String[] field7454 = new String[] { method3881(method3880("CEu39")), method3881(method3880("CEu=9")), method3881(method3880("CEu?9")), method3881(method3880("LU7\u0014")), method3881(method3880("CEu19")), method3881(method3880("Y\u000euVl")), method3881(method3880("CEu99")), method3881(method3880("CEu29")), method3881(method3880("CEu>9")), method3881(method3880("CEu79")), method3881(method3880("CEu;9")), method3881(method3880("CEu59")), method3881(method3880("CEu:9")), method3881(method3880("CEu09")), method3881(method3880("CEu<9")), method3881(method3880("CEu(9")), method3881(method3880("@O/\f~O")), method3881(method3880("AO7\u0017dPT>\u0000e")), method3881(method3880("VE#\fHmF=\u000btV")), method3881(method3880("@A8\u0013vPO.\u0016u")), method3881(method3880("[m2\u001cuNE")), method3881(method3880("@F")), method3881(method3880("@O?\u0001WKL7")), method3881(method3880("NB")), method3881(method3880("[o=\u001ebGT")), method3881(method3880("MF=\u000btVp>\nEGN\u0018\u0001rNE(")), method3881(method3880("CEu49")), method3881(method3880("@A)")), method3881(method3880("NE=\f")), method3881(method3880("Zm2\u001cuNE")), method3881(method3880("UI?\fy")), method3881(method3880("@O# ^DF(\u001de")), method3881(method3880("@F6")), method3881(method3880("VO+")), method3881(method3880("@O?\u0001CKG3\f")), method3881(method3880("@O?\u0001]GF/")), method3881(method3880("@O#/xFT3")), method3881(method3880("PI<\u0010e")), method3881(method3880("@O#!^DF(\u001de")), method3881(method3880("Zo=\u001ebGT")), method3881(method3880("JE2\u001fyV")), method3881(method3880("CEu69")) };

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "Llf;")
    public static class260 field7432 = new class260(14, 16);

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "[I")
    public static int[] field7446 = new int[4];

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "[[S")
    private static short[][] field7447 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "[[S")
    private static short[][] field7449 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "[[S")
    private static short[][] field7451 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "[[[S")
    public static short[][][] field7448 = new short[][][] { field7449, field7447, field7451 };

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "I")
    public static int field7453 = 100;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
    public static int field7407;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "I")
    public static int field7413;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    private int field7414;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field7415;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field7416;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
    public static int field7417;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    private int field7418;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "I")
    public static int field7420;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    private int field7421;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    private int field7422;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    private int field7425;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    public static int field7426;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "I")
    private int field7431;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "I")
    public static int field7433;

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "I")
    public static int field7435;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field7436;

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
    private int field7438;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
    public static int field7440;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
    public static int field7441;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    private int field7442;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    private int field7450;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "I")
    public static int field7452;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "Ljava/awt/Color;")
    private Color field7430;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "Ljava/awt/Font;")
    private Font field7423;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field7427;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "Ljava/awt/Image;")
    private Image field7409;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "Ljava/awt/Image;")
    private Image field7410;

    @OriginalMember(owner = "client!ae", name = "U", descriptor = "Ljava/awt/Image;")
    private Image field7412;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "Ljava/awt/Image;")
    private Image field7424;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "Ljava/awt/Image;")
    private Image field7429;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "Ljava/awt/Image;")
    private Image field7434;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "Ljava/awt/Image;")
    private Image field7437;

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "Ljava/awt/Image;")
    private Image field7439;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "Ljava/awt/Image;")
    private Image field7443;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "Ljava/awt/Image;")
    private Image field7445;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "Z")
    private boolean field7411;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "Z")
    private boolean field7419;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "Z")
    private boolean field7444;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
    public final void method804(boolean arg0) {
        try {
            field7415++;
            class765.method5527((byte) 31);
            if (arg0) {
                this.field7430 = null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7454[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)I")
    private final int method3870(int arg0, int arg1) {
        try {
            field7408++;
            if (this.field7411) {
                return (class391.field5700 - arg0) / 2;
            } else {
                if (arg1 != 2) {
                    this.field7423 = null;
                }
                return 0;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7454[13] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V")
    private final void method3871(int arg0) throws IllegalAccessException, NoSuchFieldException {
        try {
            field7407++;
            Class var2 = class290.field4091.getClass();
            this.field7412 = (Image) this.method3873(var2, -127, field7454[27]);
            this.field7409 = (Image) this.method3873(var2, 52, field7454[19]);
            this.field7434 = (Image) this.method3873(var2, -127, field7454[28]);
            this.field7410 = (Image) this.method3873(var2, 99, field7454[37]);
            this.field7445 = (Image) this.method3873(var2, -128, field7454[33]);
            this.field7424 = (Image) this.method3873(var2, 49, field7454[16]);
            this.field7443 = (Image) this.method3873(var2, 83, field7454[35]);
            this.field7437 = (Image) this.method3873(var2, -110, field7454[34]);
            this.field7429 = (Image) this.method3873(var2, -112, field7454[22]);
            this.field7423 = (Font) this.method3873(var2, -112, field7454[21]);
            this.field7427 = (FontMetrics) this.method3873(var2, 85, field7454[32]);
            this.field7430 = (Color) this.method3873(var2, -124, field7454[17]);
            Object var3 = this.method3873(var2, 104, field7454[23]);
            Class var4 = var3.getClass();
            int var5 = -33 / ((arg0 + 29) / 42);
            this.field7411 = this.method3872(field7454[29], var4, true, var3);
            this.field7419 = this.method3872(field7454[20], var4, true, var3);
            this.field7438 = this.method3876(var3, field7454[39], var4, 1);
            this.field7418 = this.method3876(var3, field7454[24], var4, -113);
            this.field7414 = this.method3876(var3, field7454[30], var4, -103);
            this.field7421 = this.method3876(var3, field7454[40], var4, 107);
            this.field7431 = this.method3876(var3, field7454[31], var4, -112);
            this.field7450 = this.method3876(var3, field7454[38], var4, -110);
            this.field7442 = this.method3876(var3, field7454[36], var4, 51);
            this.field7425 = this.method3876(var3, field7454[18], var4, -125);
            this.field7422 = this.method3876(var3, field7454[25], var4, -110);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field7454[26] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;ZLjava/lang/Object;)Z")
    private final boolean method3872(String arg0, Class arg1, boolean arg2, Object arg3) throws IllegalAccessException, NoSuchFieldException {
        try {
            field7426++;
            if (!arg2) {
                this.method805((byte) 118);
            }
            Field var5 = arg1.getDeclaredField(arg0);
            return var5.getBoolean(arg3);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field7454[41] + (arg0 == null ? field7454[3] : field7454[5]) + ',' + (arg1 == null ? field7454[3] : field7454[5]) + ',' + arg2 + ',' + (arg3 == null ? field7454[3] : field7454[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)I")
    public final int method805(byte arg0) {
        try {
            field7416++;
            return arg0 > -94 ? 117 : 0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7454[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Ljava/lang/Object;")
    private final Object method3873(Class arg0, int arg1, String arg2) throws IllegalAccessException, NoSuchFieldException {
        try {
            field7452++;
            int var4 = 76 / ((arg1 + 58) / 45);
            Field var5 = arg0.getDeclaredField(arg2);
            Object var6 = var5.get(class290.field4091);
            var5.set(class290.field4091, null);
            return var6;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field7454[11] + (arg0 == null ? field7454[3] : field7454[5]) + ',' + arg1 + ',' + (arg2 == null ? field7454[3] : field7454[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZJ)Z")
    public final boolean method809(boolean arg0, long arg1) {
        try {
            field7436++;
            if (!arg0) {
                method3875(-41, 38);
            }
            return true;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7454[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)I")
    private final int method3874(int arg0, byte arg1) {
        try {
            if (arg1 > -80) {
                return 26;
            } else {
                field7417++;
                return this.field7419 ? (class711.field9998 - arg0) / 2 : 0;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7454[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)I")
    public static final int method3875(int arg0, int arg1) {
        try {
            field7435++;
            if (arg0 == 6406) {
                return 1;
            } else if (arg0 == 6409) {
                return 1;
            } else if (arg0 == 32841) {
                return 1;
            } else if (arg0 == 6410) {
                return 2;
            } else if (arg0 == 6407) {
                return 3;
            } else if (arg0 == 6408) {
                return 4;
            } else {
                int var2 = -93 % ((64 - arg1) / 41);
                throw new IllegalArgumentException("");
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7454[15] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)I")
    public final int method807(byte arg0) {
        try {
            if (arg0 <= 119) {
                return 85;
            } else {
                field7413++;
                return 100;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7454[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BZ)V")
    public final void method810(byte arg0, boolean arg1) {
        try {
            field7428++;
            if (!this.field7444) {
                if (class290.field4091 == null) {
                    this.field7444 = true;
                } else if (this.field7423 == null) {
                    try {
                        this.method3871(33);
                    } catch (Exception var44) {
                        this.field7444 = true;
                    }
                }
            }
            if (this.field7444) {
                this.method3878(-105);
            } else {
                Graphics var3 = class560.field8153.getGraphics();
                if (var3 == null) {
                    class560.field8153.repaint();
                } else {
                    try {
                        int var4 = class298.field4155.method2232(-35);
                        String var5 = class298.field4155.method2226(20);
                        if (class123.field1554 == null) {
                            class123.field1554 = class560.field8153.createImage(class391.field5700, class711.field9998);
                        }
                        Graphics var6 = class123.field1554.getGraphics();
                        var6.clearRect(0, 0, class391.field5700, class711.field9998);
                        int var7 = this.field7443.getWidth(null);
                        int var8 = this.field7437.getWidth(null);
                        int var9 = this.field7429.getWidth(null);
                        int var10 = this.field7443.getHeight(null);
                        int var11 = this.field7437.getHeight(null);
                        int var12 = this.field7429.getHeight(null);
                        var6.drawImage(this.field7443, this.method3870(var7, 2) + this.field7431 - (this.field7442 / 2), this.method3874(var10, (byte) -108) - -this.field7450, null);
                        int var13 = this.field7431 + var7 - this.field7442 / 2;
                        int var14 = this.field7442 / 2 + this.field7431;
                        for (int var15 = var13; var15 <= var14; var15 += var9) {
                            var6.drawImage(this.field7429, var15 + (this.method3870(var7, 2) + this.field7431), this.method3874(var12, (byte) -115) - -this.field7450, null);
                        }
                        var6.drawImage(this.field7437, this.method3870(var8, 2) + this.field7431 + this.field7442 / 2, this.method3874(var11, (byte) -113) - -this.field7450, null);
                        int var16 = this.field7434.getWidth(null);
                        int var17 = this.field7434.getHeight(null);
                        int var18 = this.field7410.getWidth(null);
                        int var19 = this.field7410.getHeight(null);
                        int var20 = this.field7424.getHeight(null);
                        int var21 = this.field7445.getWidth(null);
                        int var22 = this.field7445.getHeight(null);
                        int var23 = this.field7424.getWidth(null);
                        int var24 = this.field7412.getWidth(null);
                        int var25 = this.field7409.getWidth(null);
                        int var26 = this.method3870(this.field7414, 2) + this.field7438;
                        int var27 = this.method3874(this.field7421, (byte) -117) + this.field7418;
                        var6.drawImage(this.field7434, var26, var27 + ((this.field7421 - var17) / 2), null);
                        var6.drawImage(this.field7410, var26 + this.field7414 - var18, (-var19 + this.field7421) / 2 + var27, null);
                        if (this.field7439 == null) {
                            this.field7439 = class560.field8153.createImage(this.field7414 - var16 - var18, this.field7421);
                        }
                        Graphics var28 = this.field7439.getGraphics();
                        for (int var29 = 0; var29 < (this.field7414 - var18 - var16); var29 += var21) {
                            var28.drawImage(this.field7445, var29, 0, null);
                        }
                        for (int var30 = 0; var30 < this.field7414 - var16 - var18; var30 += var23) {
                            var28.drawImage(this.field7424, var30, this.field7421 - var20, null);
                        }
                        int var31 = (this.field7414 - var16 - var18) * var4 / 100;
                        if (var31 > 0) {
                            Image var32 = class560.field8153.createImage(var31, this.field7421 - var20 - var22);
                            int var33 = var32.getWidth(null);
                            Graphics var34 = var32.getGraphics();
                            int var35 = this.field7422 * class87.method867(101) / 10 % var24;
                            for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                                var34.drawImage(this.field7412, var36, 0, null);
                            }
                            var28.drawImage(var32, 0, var22, null);
                        }
                        int var38 = this.field7414 - var16 - var18 - var31;
                        if (var38 > 0) {
                            Image var39 = class560.field8153.createImage(var38, this.field7421 - var22 - var20);
                            int var40 = var39.getWidth(null);
                            Graphics var41 = var39.getGraphics();
                            for (int var42 = 0; var42 < var40; var42 += var25) {
                                var41.drawImage(this.field7409, var42, 0, null);
                            }
                            var28.drawImage(var39, var31, var22, null);
                        }
                        var6.drawImage(this.field7439, var16 + var26, var27, null);
                        var6.setFont(this.field7423);
                        var6.setColor(this.field7430);
                        var6.drawString(var5, (this.field7414 - this.field7427.stringWidth(var5)) / 2 + var26, var27 - -this.field7425 + this.field7421 / 2 + 4);
                        var3.drawImage(class123.field1554, 0, 0, null);
                    } catch (Exception var45) {
                        this.field7444 = true;
                    }
                }
                if (arg0 >= -12) {
                    this.field7437 = null;
                }
            }
        } catch (RuntimeException var46) {
            throw class665.method4799(var46, field7454[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;I)I")
    private final int method3876(Object arg0, String arg1, Class arg2, int arg3) throws IllegalAccessException, NoSuchFieldException {
        try {
            int var5 = 6 / ((arg3 + 59) / 37);
            field7441++;
            Field var6 = arg2.getDeclaredField(arg1);
            return var6.getInt(arg0);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field7454[7] + (arg0 == null ? field7454[3] : field7454[5]) + ',' + (arg1 == null ? field7454[3] : field7454[5]) + ',' + (arg2 == null ? field7454[3] : field7454[5]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljka;B)V")
    public static final void method3877(class228 arg0, byte arg1) {
        try {
            field7433++;
            if (arg0 != null) {
                class45.field644.method3984(arg0, 0);
                if (arg1 != -11) {
                    field7449 = null;
                }
                class72.field1049++;
                Object var2 = null;
                class801 var3;
                if (arg0.field3301 || "".equals(arg0.field3294)) {
                    var3 = new class801(arg0.field3294);
                    class17.field221++;
                } else {
                    long var4 = arg0.field3303;
                    for (var3 = (class801) class603.field8646.method3693(false, var4); var3 != null && !var3.field11650.equals(arg0.field3294); var3 = (class801) class603.field8646.method3699(-1)) {
                    }
                    if (var3 == null) {
                        var3 = (class801) class721.field10264.method2053(0, var4);
                        if (var3 != null && !var3.field11650.equals(arg0.field3294)) {
                            var3 = null;
                        }
                        if (var3 == null) {
                            var3 = new class801(arg0.field3294);
                        }
                        class603.field8646.method3691(var3, var4, -1);
                        class17.field221++;
                    }
                }
                if (var3.method5774((byte) 52, arg0)) {
                    class132.method1150(var3, 0);
                }
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field7454[4] + (arg0 == null ? field7454[3] : field7454[5]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
    private final void method3878(int arg0) {
        try {
            class145.method1253(class298.field4155.method2232(74), class160.field2052[class784.field11322], class298.field4155.method2226(20), class529.field7680[class784.field11322], class111.field1443[class784.field11322], -17146);
            if (arg0 <= -97) {
                field7440++;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7454[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public final void method806(int arg0) {
        try {
            if (arg0 != 31428) {
                this.field7444 = false;
            }
            field7420++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7454[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)V")
    public static void method3879(byte arg0) {
        try {
            field7449 = null;
            field7446 = null;
            if (arg0 != -42) {
                method3875(-31, 20);
            }
            field7432 = null;
            field7451 = null;
            field7447 = null;
            field7448 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7454[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3880(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x11);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3881(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 34;
                    break;
                case 1:
                    var10005 = 32;
                    break;
                case 2:
                    var10005 = 91;
                    break;
                case 3:
                    var10005 = 120;
                    break;
                default:
                    var10005 = 17;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

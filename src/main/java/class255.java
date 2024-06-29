import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class255 extends class640 {

    @OriginalMember(owner = "client!bj", name = "D", descriptor = "I")
    private int field3964 = 0;

    @OriginalMember(owner = "client!bj", name = "E", descriptor = "Z")
    public boolean field3963 = false;

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "Loj;")
    public class399 field3957 = new class399();

    @OriginalMember(owner = "client!bj", name = "L", descriptor = "Loj;")
    private class399 field3965 = new class399();

    @OriginalMember(owner = "client!bj", name = "A", descriptor = "Z")
    private boolean field3968 = false;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "Lkq;")
    public class619 field3958;

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "J")
    private long field3948;

    @OriginalMember(owner = "client!bj", name = "C", descriptor = "Ljk;")
    public class659 field3960;

    @OriginalMember(owner = "client!bj", name = "I", descriptor = "Ljd;")
    public class242 field3955;

    @OriginalMember(owner = "client!bj", name = "F", descriptor = "Leba;")
    public class614 field3962;

    @OriginalMember(owner = "client!bj", name = "M", descriptor = "[Ljava/lang/String;")
    private static final String[] field3974 = new String[] { method2165(method2164("\r*Qm\n")), method2165(method2164("\u0014nQ\u0007_")), method2165(method2164("\u0018q\u0013/")), method2165(method2164("\u0014nQ\u007f\u001e\u0018m\u000b}_")), method2165(method2164("\u0014nQ\u0006_")), method2165(method2164("\u0014nQ\u0005_")), method2165(method2164("\u0011t\u0016rW\u0006k\fy")), method2165(method2164("Vt\f*\r\u0013>")), method2165(method2164("[)R&\u0019\u0012c\u000f3Z[)")), method2165(method2164("\u0014nQ\u0000_")), method2165(method2164("\u0014nQ\u0002_")), method2165(method2164(">a\u00135\u0012\u0002m\u001c\"")), method2165(method2164("\u0014nQ\u0001_")) };

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "Z")
    public static boolean field3954 = false;

    @OriginalMember(owner = "client!bj", name = "G", descriptor = "Lvea;")
    public static class288 field3952 = new class288();

    @OriginalMember(owner = "client!bj", name = "K", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "I")
    public int field3956;

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!bj", name = "J", descriptor = "I")
    private int field3966;

    @OriginalMember(owner = "client!bj", name = "H", descriptor = "I")
    private int field3967;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "I")
    private int field3969;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
    private int field3970;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
    private int field3971;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "I")
    private int field3972;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
    private int field3973;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IILub;)V")
    public static final void method2158(int arg0, int arg1, class22 arg2) {
        try {
            class624.field9124 = false;
            class426.field6270 = arg1;
            field3953++;
            class784.method5674((byte) -111, arg2);
            class547.method4127(arg2, arg1 ^ 0x10);
            if (class624.field9124) {
                System.out.println(field3974[8]);
            }
            if (arg2.field2201 != arg0) {
                throw new RuntimeException(field3974[6] + arg2.field2201 + field3974[7] + arg0);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3974[9] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field3974[2] : field3974[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public final void method2159(int arg0) {
        try {
            this.field3957.field5966 = this.field3960.field9515;
            this.field3957.field5958 = this.field3960.field9499;
            this.field3957.field5959 = this.field3960.field9505;
            this.field3957.field5961 = this.field3960.field9518;
            if (arg0 == 0) {
                this.field3957.field5965 = this.field3960.field9507;
                this.field3957.field5956 = this.field3960.field9516;
                this.field3957.field5955 = this.field3960.field9520;
                field3959++;
                this.field3957.field5952 = this.field3960.field9519;
                this.field3957.field5964 = this.field3960.field9514;
                if (this.field3957.field5964 == this.field3957.field5956 && this.field3957.field5966 == this.field3957.field5956 && this.field3957.field5958 == this.field3957.field5955 && this.field3957.field5959 == this.field3957.field5955 && this.field3957.field5965 == this.field3957.field5952 && this.field3957.field5965 == this.field3957.field5961) {
                    this.field3968 = true;
                } else if (this.field3968) {
                    this.field3965.field5961 = this.field3957.field5961;
                    this.field3968 = false;
                    this.field3965.field5965 = this.field3957.field5965;
                    this.field3965.field5955 = this.field3957.field5955;
                    this.field3965.field5959 = this.field3957.field5959;
                    this.field3965.field5966 = this.field3957.field5966;
                    this.field3965.field5952 = this.field3957.field5952;
                    this.field3965.field5956 = this.field3957.field5956;
                    this.field3965.field5958 = this.field3957.field5958;
                    this.field3965.field5964 = this.field3957.field5964;
                }
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3974[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/lang/String;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;II)V")
    public static final void method2160(String arg0, Color arg1, Color arg2, Color arg3, int arg4, int arg5) {
        try {
            field3961++;
            try {
                Graphics var6 = class502.field7252.getGraphics();
                if (class624.field9125 == null) {
                    class624.field9125 = new Font(field3974[11], 1, 13);
                }
                if (arg2 == null) {
                    arg2 = new Color(140, 17, 17);
                }
                if (arg1 == null) {
                    arg1 = new Color(140, 17, 17);
                }
                if (arg3 == null) {
                    arg3 = new Color(255, 255, 255);
                }
                try {
                    if (class330.field5191 == null) {
                        class330.field5191 = class502.field7252.createImage(class179.field2489, class94.field1062);
                    }
                    Graphics var7 = class330.field5191.getGraphics();
                    var7.setColor(Color.black);
                    var7.fillRect(0, 0, class179.field2489, class94.field1062);
                    int var8 = class179.field2489 / 2 - 152;
                    int var9 = class94.field1062 / 2 - 18;
                    var7.setColor(arg1);
                    var7.drawRect(var8, var9, 303, 33);
                    var7.setColor(arg2);
                    var7.fillRect(var8 + 2, var9 + 2, arg5 * 3, 30);
                    var7.setColor(Color.black);
                    var7.drawRect(var8 + 1, var9 + 1, 301, 31);
                    var7.fillRect(arg5 * 3 + (var8 + 2), var9 + 2, 300 - (arg5 * 3), 30);
                    var7.setFont(class624.field9125);
                    if (arg4 == -1769725272) {
                        var7.setColor(arg3);
                        var7.drawString(arg0, var8 + (304 - (arg0.length() * 6)) / 2, var9 + 22);
                        if (class353.field5447 != null) {
                            var7.setFont(class624.field9125);
                            var7.setColor(arg3);
                            var7.drawString(class353.field5447, class179.field2489 / 2 - class353.field5447.length() * 6 / 2, class94.field1062 / 2 + -26);
                        }
                        var6.drawImage(class330.field5191, 0, 0, null);
                    }
                } catch (Exception var13) {
                    var6.setColor(Color.black);
                    var6.fillRect(0, 0, class179.field2489, class94.field1062);
                    int var10 = class179.field2489 / 2 - 152;
                    int var11 = class94.field1062 / 2 - 18;
                    var6.setColor(arg1);
                    var6.drawRect(var10, var11, 303, 33);
                    var6.setColor(arg2);
                    var6.fillRect(var10 + 2, var11 + 2, arg5 * 3, 30);
                    var6.setColor(Color.black);
                    var6.drawRect(var10 + 1, var11 + 1, 301, 31);
                    var6.fillRect(var10 + (arg5 * 3) + 2, var11 + 2, 300 - (arg5 * 3), 30);
                    var6.setFont(class624.field9125);
                    var6.setColor(arg3);
                    if (class353.field5447 != null) {
                        var6.setFont(class624.field9125);
                        var6.setColor(arg3);
                        var6.drawString(class353.field5447, class179.field2489 / 2 - (class353.field5447.length() * 6 / 2), class94.field1062 / 2 - 26);
                    }
                    var6.drawString(arg0, var10 + ((304 - (arg0.length() * 6)) / 2), var11 + 22);
                }
            } catch (Exception var14) {
                class502.field7252.repaint();
            }
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field3974[10] + (arg0 == null ? field3974[2] : field3974[0]) + ',' + (arg1 == null ? field3974[2] : field3974[0]) + ',' + (arg2 == null ? field3974[2] : field3974[0]) + ',' + (arg3 == null ? field3974[2] : field3974[0]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lha;JB)V")
    public final void method2161(class66 arg0, long arg1, byte arg2) {
        try {
            field3949++;
            if (arg2 != 116) {
                this.method2161(null, -48L, (byte) -80);
            }
            for (class392 var5 = (class392) this.field3962.method4538(false); var5 != null; var5 = (class392) this.field3962.method4543(0)) {
                var5.method3113(arg0, arg1);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field3974[1] + (arg0 == null ? field3974[2] : field3974[0]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZLha;IIJ)V")
    public final void method2162(boolean arg0, class66 arg1, int arg2, int arg3, long arg4) {
        try {
            field3951++;
            if (this.field3963) {
                arg0 = false;
            } else if (this.field3955.field3658 > class222.field3408) {
                arg0 = false;
            } else if (class156.field1913[class222.field3408] < class599.field8811) {
                arg0 = false;
            } else if (this.field3968) {
                arg0 = false;
            } else if (this.field3955.field3697 != -1) {
                int var7 = (int) (arg4 - this.field3948);
                if (this.field3955.field3657 || var7 <= this.field3955.field3697) {
                    var7 %= this.field3955.field3697;
                } else {
                    arg0 = false;
                }
                if (!this.field3955.field3704 && this.field3955.field3711 > var7) {
                    arg0 = false;
                }
                if (this.field3955.field3704 && var7 >= this.field3955.field3711) {
                    arg0 = false;
                }
            }
            int var8 = -9 % ((73 - arg2) / 41);
            if (arg0) {
                class12.field143++;
                int var9 = (this.field3957.field5964 + this.field3957.field5966 + this.field3957.field5956) / 3;
                int var10 = (this.field3957.field5958 + this.field3957.field5955 + this.field3957.field5959) / 3;
                int var11 = (this.field3957.field5965 + this.field3957.field5961 + this.field3957.field5952) / 3;
                if (this.field3957.field5957 != var9 || this.field3957.field5962 != var10 || this.field3957.field5963 != var11) {
                    this.field3957.field5962 = var10;
                    this.field3957.field5957 = var9;
                    this.field3957.field5963 = var11;
                    int var12 = this.field3957.field5956 - this.field3957.field5964;
                    int var13 = this.field3957.field5955 - this.field3957.field5958;
                    int var14 = this.field3957.field5965 - this.field3957.field5952;
                    int var15 = this.field3957.field5966 - this.field3957.field5964;
                    int var16 = this.field3957.field5959 - this.field3957.field5958;
                    int var17 = this.field3957.field5961 - this.field3957.field5952;
                    this.field3969 = var13 * var17 - (var14 * var16);
                    this.field3966 = var12 * var16 - (var13 * var15);
                    this.field3967 = var14 * var15 - var12 * var17;
                    while (true) {
                        if (this.field3969 <= 32767 && this.field3967 <= 32767 && this.field3966 <= 32767 && this.field3969 >= -32767 && this.field3967 >= -32767 && this.field3966 >= -32767) {
                            int var18 = (int) Math.sqrt((double) (this.field3969 * this.field3969 + this.field3967 * this.field3967 + (this.field3966 * this.field3966)));
                            if (var18 <= 0) {
                                var18 = 1;
                            }
                            this.field3966 = this.field3966 * 32767 / var18;
                            this.field3969 = this.field3969 * 32767 / var18;
                            this.field3967 = this.field3967 * 32767 / var18;
                            if (this.field3955.field3674 > 0 || this.field3955.field3716 > 0) {
                                int var19 = (int) (Math.atan2((double) this.field3966, (double) this.field3969) * 2607.5945876176133D);
                                int var20 = (int) (Math.atan2((double) this.field3967, Math.sqrt((double) (this.field3969 * this.field3969 + this.field3966 * this.field3966))) * 2607.5945876176133D);
                                this.field3973 = this.field3955.field3674 - this.field3955.field3649;
                                this.field3972 = this.field3955.field3649 + var19 - (this.field3973 >> 1);
                                this.field3971 = this.field3955.field3716 - this.field3955.field3668;
                                this.field3970 = var20 - ((this.field3971 >> 1) - this.field3955.field3668);
                            }
                            break;
                        }
                        this.field3969 >>= 0x1;
                        this.field3967 >>= 0x1;
                        this.field3966 >>= 0x1;
                    }
                }
                this.field3964 += (int) (((double) (this.field3955.field3662 - this.field3955.field3686) * Math.random() + (double) this.field3955.field3686) * (double) arg3);
                if (this.field3964 > 63) {
                    int var21 = this.field3964 >> 6;
                    this.field3964 &= 0x3F;
                    for (int var22 = 0; var22 < var21; var22++) {
                        int var32;
                        int var33;
                        int var34;
                        if (this.field3955.field3674 <= 0 && this.field3955.field3716 <= 0) {
                            var33 = this.field3967;
                            var34 = this.field3966;
                            var32 = this.field3969;
                        } else {
                            int var23 = this.field3972 + ((int) (Math.random() * (double) this.field3973));
                            int var24 = var23 & 0x3FFF;
                            int var25 = class298.field4704[var24];
                            int var26 = class298.field4703[var24];
                            int var27 = (int) ((double) this.field3971 * Math.random()) + this.field3970;
                            int var28 = var27 & 0x1FFF;
                            int var29 = class298.field4704[var28];
                            int var30 = class298.field4703[var28];
                            byte var31 = 13;
                            var32 = var26 * var29 >> var31;
                            var33 = (var30 << 1) * -1;
                            var34 = var25 * var29 >> var31;
                        }
                        float var35 = (float) Math.random();
                        float var36 = (float) Math.random();
                        if (var35 + var36 > 1.0F) {
                            var35 = 1.0F - var35;
                            var36 = 1.0F - var36;
                        }
                        float var37 = 1.0F - var35 - var36;
                        int var38 = (int) ((float) this.field3957.field5966 * var37 + (float) this.field3957.field5964 * var35 + (float) this.field3957.field5956 * var36);
                        int var39 = (int) ((float) this.field3957.field5959 * var37 + (float) this.field3957.field5958 * var35 + (float) this.field3957.field5955 * var36);
                        int var40 = (int) ((float) this.field3957.field5961 * var37 + (float) this.field3957.field5965 * var36 + (float) this.field3957.field5952 * var35);
                        int var41 = (int) ((float) this.field3965.field5966 * var37 + (float) this.field3965.field5964 * var35 + (float) this.field3965.field5956 * var36);
                        int var42 = (int) ((float) this.field3965.field5959 * var37 + (float) this.field3965.field5958 * var35 + (float) this.field3965.field5955 * var36);
                        int var43 = (int) ((float) this.field3965.field5961 * var37 + (float) this.field3965.field5965 * var36 + (float) this.field3965.field5952 * var35);
                        int var44 = var38 - var41;
                        int var45 = var39 - var42;
                        int var46 = var40 - var43;
                        int var47 = (int) ((double) var41 + Math.random() * (double) var44);
                        int var48 = (int) (Math.random() * (double) var45 + (double) var42);
                        int var49 = (int) ((double) var43 + (double) var46 * Math.random());
                        int var50 = this.field3955.field3670 + ((int) (Math.random() * (double) (this.field3955.field3661 - this.field3955.field3670)));
                        int var51 = (int) (Math.random() * (double) (this.field3955.field3655 - this.field3955.field3683)) + this.field3955.field3683;
                        int var52 = this.field3955.field3677 + (int) (Math.random() * (double) (this.field3955.field3679 - this.field3955.field3677));
                        int var55;
                        if (this.field3955.field3721) {
                            double var53 = Math.random();
                            var55 = (int) ((double) this.field3955.field3678 * var53 + (double) this.field3955.field3714) << 16 | (int) ((double) this.field3955.field3715 * var53 + (double) this.field3955.field3720) << 8 | (int) ((double) this.field3955.field3648 * var53 + (double) this.field3955.field3691) | (int) ((double) this.field3955.field3659 + (double) this.field3955.field3687 * Math.random()) << 24;
                        } else {
                            var55 = (int) (Math.random() * (double) this.field3955.field3687 + (double) this.field3955.field3659) << 24 | (int) (Math.random() * (double) this.field3955.field3648 + (double) this.field3955.field3691) | (int) ((double) this.field3955.field3720 + (double) this.field3955.field3715 * Math.random()) << 8 | (int) ((double) this.field3955.field3678 * Math.random() + (double) this.field3955.field3714) << 16;
                        }
                        int var56 = this.field3955.field3666;
                        if (!arg1.method472() && !this.field3955.field3703) {
                            var56 = -1;
                        }
                        if (class274.field4143 == class143.field1723) {
                            new class392(this, var47, var48, var49, var32, var33, var34, var50, var51, var55, var52, var56, this.field3955.field3712, this.field3955.field3695);
                        } else {
                            class392 var57 = class783.field11411[class143.field1723];
                            class143.field1723 = class143.field1723 + 1 & 0x3FF;
                            var57.method3114(this, var47, var48, var49, var32, var33, var34, var50, var51, var55, var52, var56, this.field3955.field3712, this.field3955.field3695);
                        }
                    }
                }
            }
            if (!this.field3957.method3144(26732, this.field3965)) {
                class399 var59 = this.field3965;
                this.field3965 = this.field3957;
                this.field3957 = var59;
                this.field3957.field5964 = this.field3960.field9514;
                this.field3957.field5966 = this.field3960.field9515;
                this.field3957.field5958 = this.field3960.field9499;
                this.field3957.field5959 = this.field3960.field9505;
                this.field3957.field5965 = this.field3960.field9507;
                this.field3957.field5952 = this.field3960.field9519;
                this.field3957.field5961 = this.field3960.field9518;
                this.field3957.field5963 = this.field3965.field5963;
                this.field3957.field5955 = this.field3960.field9520;
                this.field3957.field5956 = this.field3960.field9516;
                this.field3957.field5962 = this.field3965.field5962;
                this.field3957.field5957 = this.field3965.field5957;
            }
            this.field3956 = 0;
            for (class392 var60 = (class392) this.field3962.method4538(false); var60 != null; var60 = (class392) this.field3962.method4543(0)) {
                var60.method3115(arg4, arg3);
                this.field3956++;
            }
            class384.field5811 += this.field3956;
        } catch (RuntimeException var62) {
            throw class759.method5498(var62, field3974[4] + arg0 + ',' + (arg1 == null ? field3974[2] : field3974[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V")
    public static void method2163(byte arg0) {
        try {
            if (arg0 >= 99) {
                field3952 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3974[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lha;Ljk;Lkq;J)V")
    public class255(class66 arg0, class659 arg1, class619 arg2, long arg3) {
        try {
            this.field3958 = arg2;
            this.field3948 = arg3;
            this.field3960 = arg1;
            this.field3955 = this.field3960.method4830((byte) 109);
            if (!arg0.method472() && this.field3955.field3689 != -1) {
                this.field3955 = class256.method2166((byte) 87, this.field3955.field3689);
            }
            this.field3962 = new class614();
            this.field3964 = (int) ((double) this.field3964 + Math.random() * 64.0D);
            this.method2159(0);
            this.field3965.field5961 = this.field3957.field5961;
            this.field3965.field5956 = this.field3957.field5956;
            this.field3965.field5959 = this.field3957.field5959;
            this.field3965.field5952 = this.field3957.field5952;
            this.field3965.field5964 = this.field3957.field5964;
            this.field3965.field5966 = this.field3957.field5966;
            this.field3965.field5955 = this.field3957.field5955;
            this.field3965.field5958 = this.field3957.field5958;
            this.field3965.field5965 = this.field3957.field5965;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field3974[3] + (arg0 == null ? field3974[2] : field3974[0]) + ',' + (arg1 == null ? field3974[2] : field3974[0]) + ',' + (arg2 == null ? field3974[2] : field3974[0]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2164(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x77);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2165(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 118;
                    break;
                case 1:
                    var10005 = 4;
                    break;
                case 2:
                    var10005 = 127;
                    break;
                case 3:
                    var10005 = 67;
                    break;
                default:
                    var10005 = 119;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

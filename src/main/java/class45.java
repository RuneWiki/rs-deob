import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class45 extends class160 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!tm", name = "J", descriptor = "I")
    public static int field559 = 0;

    @OriginalMember(owner = "client!tm", name = "O", descriptor = "[I")
    public static int[] field564 = new int[1000];

    @OriginalMember(owner = "client!tm", name = "B", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!tm", name = "C", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!tm", name = "D", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!tm", name = "F", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!tm", name = "G", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!tm", name = "H", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!tm", name = "I", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!tm", name = "K", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!tm", name = "L", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!tm", name = "M", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!tm", name = "P", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!tm", name = "Q", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!tm", name = "R", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!tm", name = "S", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!tm", name = "T", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!tm", name = "U", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!tm", name = "E", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field554;

    @OriginalMember(owner = "client!tm", name = "N", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field563;

    @OriginalMember(owner = "client!tm", name = "A", descriptor = "[I")
    public static int[] field550;

    @OriginalMember(owner = "client!tm", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 5)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        field560++;
        this.field563 = arg0;
        arg0.setDimensions(this.field2285, this.field2284);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field554);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!tm", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 19)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field568++;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZIIILjava/awt/Graphics;I)V", line = 32)
    public final void method316(boolean arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        this.method324(arg5, arg1, (byte) 123, arg2, arg3);
        Shape var7 = arg4.getClip();
        if (!arg0) {
            this.startProduction((ImageConsumer) null);
        }
        arg4.clipRect(arg5, arg2, arg1, arg3);
        field567++;
        arg4.drawImage(this.field2279, 0, 0, this);
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V", line = 47)
    private final synchronized void method317(byte arg0) {
        field551++;
        if (this.field563 != null) {
            int var2 = -35 % ((arg0 - 2) / 50);
            this.field563.setPixels(0, 0, this.field2285, this.field2284, this.field554, this.field2283, 0, this.field2285);
            this.field563.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILqc;)V", line = 62)
    public static final void method318(int arg0, class331 arg1) {
        field555++;
        if (arg1.field4903 == 0) {
            return;
        }
        class91 var2 = arg1.method2300((byte) 90);
        if (arg1.field4870 != -1 && arg1.field4870 < 32768) {
            class169 var3 = class251.field3688[arg1.field4870];
            if (var3 != null) {
                int var4 = arg1.field4855 - var3.field4855;
                int var5 = arg1.field4893 - var3.field4893;
                if (var4 != 0 || var5 != 0) {
                    arg1.field4912 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0 <= 119) {
            field564 = (int[]) null;
        }
        if (arg1.field4870 >= 32768) {
            int var6 = arg1.field4870 - 32768;
            if (class103.field1333 == var6) {
                var6 = 2047;
            }
            class239 var7 = class311.field4574[var6];
            if (var7 != null) {
                int var8 = arg1.field4855 - var7.field4855;
                int var9 = arg1.field4893 - var7.field4893;
                if (var8 != 0 || var9 != 0) {
                    arg1.field4912 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field4909 != 0 || arg1.field4895 != 0) && (arg1.field4845 == 0 || arg1.field4932 > 0)) {
            int var10 = arg1.field4893 - ((arg1.field4895 - (class355.field5556 + class355.field5556)) * 64);
            int var11 = arg1.field4855 - (arg1.field4909 - class331.field4867 - class331.field4867) * 64;
            if (var11 != 0 || var10 != 0) {
                arg1.field4912 = (int) (Math.atan2((double) var11, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field4909 = 0;
            arg1.field4895 = 0;
        }
        int var12 = arg1.field4912 - arg1.field4926 & 0x7FF;
        if (var12 == 0) {
            arg1.field4915 = 0;
            arg1.field4910 = 0;
        } else if (var2.field1148 == 0) {
            arg1.field4910++;
            if (var12 <= 1024) {
                arg1.field4926 += arg1.field4903;
                boolean var20 = true;
                if (arg1.field4903 > var12 || var12 > 2048 - arg1.field4903) {
                    var20 = false;
                    arg1.field4926 = arg1.field4912;
                }
                if (arg1.field4910 > 25 || var20) {
                    arg1.field4897 = var2.field1166;
                    if (arg1.field4845 > 0) {
                        if (arg1.field4860[arg1.field4845 - 1] == 2) {
                            if (var2.field1173 != -1) {
                                arg1.field4897 = var2.field1173;
                            } else if (var2.field1149 != -1) {
                                arg1.field4897 = var2.field1149;
                            }
                        } else if (arg1.field4860[arg1.field4845 - 1] == 0) {
                            if (var2.field1158 != -1) {
                                arg1.field4897 = var2.field1158;
                            } else if (var2.field1174 != -1) {
                                arg1.field4897 = var2.field1174;
                            }
                        } else if (var2.field1187 != -1) {
                            arg1.field4897 = var2.field1187;
                        }
                    } else if (var2.field1150 != -1) {
                        arg1.field4897 = var2.field1150;
                    }
                }
            } else {
                arg1.field4926 -= arg1.field4903;
                boolean var21 = true;
                if (var12 < arg1.field4903 || 2048 - arg1.field4903 < var12) {
                    var21 = false;
                    arg1.field4926 = arg1.field4912;
                }
                if (arg1.field4910 > 25 || var21) {
                    arg1.field4897 = var2.field1166;
                    if (arg1.field4845 <= 0) {
                        if (var2.field1152 != -1) {
                            arg1.field4897 = var2.field1152;
                        }
                    } else if (arg1.field4860[arg1.field4845 - 1] == 2) {
                        if (var2.field1153 != -1) {
                            arg1.field4897 = var2.field1153;
                        } else if (var2.field1149 != -1) {
                            arg1.field4897 = var2.field1149;
                        }
                    } else if (arg1.field4860[arg1.field4845 - 1] == 0) {
                        if (var2.field1163 != -1) {
                            arg1.field4897 = var2.field1163;
                        } else if (var2.field1174 != -1) {
                            arg1.field4897 = var2.field1174;
                        }
                    } else if (var2.field1162 != -1) {
                        arg1.field4897 = var2.field1162;
                    }
                }
            }
            arg1.field4926 &= 0x7FF;
        } else {
            arg1.field4897 = -1;
            int var13 = arg1.field4912 << 5;
            if (arg1.field4872 != var13) {
                arg1.field4924 = 0;
                arg1.field4872 = var13;
                int var14 = var13 - arg1.field4878 & 0xFFFF;
                int var15 = arg1.field4915 * arg1.field4915 / (var2.field1148 * 2);
                if (arg1.field4915 > 0 && var15 <= var14 && var14 - var15 < 32768) {
                    arg1.field4889 = true;
                    arg1.field4881 = var14 / 2;
                    int var16 = var2.field1184 * var2.field1184 / (var2.field1148 * 2);
                    if (var16 > 32767) {
                        var16 = 32767;
                    }
                    if (arg1.field4881 > var16) {
                        arg1.field4881 = var14 - var16;
                    }
                } else if (arg1.field4915 < 0 && var15 <= 65536 - var14 && (65536 - var14 - var15) < 32768) {
                    arg1.field4881 = (65536 - var14) / 2;
                    arg1.field4889 = true;
                    int var17 = var2.field1184 * var2.field1184 / (var2.field1148 * 2);
                    if (var17 > 32767) {
                        var17 = 32767;
                    }
                    if (arg1.field4881 > var17) {
                        arg1.field4881 = 65536 - var17 - var14;
                    }
                } else {
                    arg1.field4889 = false;
                }
            }
            if (arg1.field4915 == 0) {
                int var18 = arg1.field4872 - arg1.field4878 & 0xFFFF;
                if (var18 < var2.field1148) {
                    arg1.field4878 = arg1.field4872;
                } else {
                    arg1.field4924 = 0;
                    arg1.field4889 = true;
                    int var19 = var2.field1184 * var2.field1184 / (var2.field1148 * 2);
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    if (var18 >= 32768) {
                        arg1.field4881 = (65536 - var18) / 2;
                        if (var19 < arg1.field4881) {
                            arg1.field4881 = 65536 - var18 - var19;
                        }
                        arg1.field4915 = -var2.field1148;
                    } else {
                        arg1.field4881 = var18 / 2;
                        arg1.field4915 = var2.field1148;
                        if (arg1.field4881 > var19) {
                            arg1.field4881 = var18 - var19;
                        }
                    }
                }
            } else if (arg1.field4915 > 0) {
                if (arg1.field4924 >= arg1.field4881) {
                    arg1.field4889 = false;
                }
                if (!arg1.field4889) {
                    arg1.field4915 -= var2.field1148;
                    if (arg1.field4915 < 0) {
                        arg1.field4915 = 0;
                    }
                } else if (arg1.field4915 < var2.field1184) {
                    arg1.field4915 += var2.field1148;
                }
            } else {
                if (arg1.field4924 >= arg1.field4881) {
                    arg1.field4889 = false;
                }
                if (!arg1.field4889) {
                    arg1.field4915 += var2.field1148;
                    if (arg1.field4915 > 0) {
                        arg1.field4915 = 0;
                    }
                } else if ((-var2.field1184) < arg1.field4915) {
                    arg1.field4915 -= var2.field1148;
                }
            }
            arg1.field4878 += arg1.field4915;
            arg1.field4878 &= 0xFFFF;
            arg1.field4926 = arg1.field4878 >> 5;
            if (arg1.field4915 <= 0) {
                arg1.field4924 -= arg1.field4915;
            } else {
                arg1.field4924 += arg1.field4915;
            }
            if (arg1.field4915 < 0) {
                if (arg1.field4845 > 0) {
                    if (arg1.field4860[arg1.field4845 - 1] == 2) {
                        if (var2.field1153 != -1) {
                            arg1.field4897 = var2.field1153;
                        } else if (var2.field1149 != -1) {
                            arg1.field4897 = var2.field1149;
                        }
                    } else if (arg1.field4860[arg1.field4845 - 1] == 0) {
                        if (var2.field1163 != -1) {
                            arg1.field4897 = var2.field1163;
                        } else if (var2.field1174 != -1) {
                            arg1.field4897 = var2.field1174;
                        }
                    }
                }
                if (arg1.field4897 == -1) {
                    if (var2.field1162 != -1) {
                        arg1.field4897 = var2.field1162;
                    } else if (var2.field1152 != -1) {
                        arg1.field4897 = var2.field1152;
                    }
                }
            } else {
                if (arg1.field4845 > 0) {
                    if (arg1.field4860[arg1.field4845 - 1] == 2) {
                        if (var2.field1173 != -1) {
                            arg1.field4897 = var2.field1173;
                        } else if (var2.field1149 != -1) {
                            arg1.field4897 = var2.field1149;
                        }
                    } else if (arg1.field4860[arg1.field4845 - 1] == 0) {
                        if (var2.field1158 != -1) {
                            arg1.field4897 = var2.field1158;
                        } else if (var2.field1174 != -1) {
                            arg1.field4897 = var2.field1174;
                        }
                    }
                }
                if (arg1.field4897 == -1) {
                    if (var2.field1187 != -1) {
                        arg1.field4897 = var2.field1187;
                    } else if (var2.field1150 != -1) {
                        arg1.field4897 = var2.field1150;
                    }
                }
            }
            if (arg1.field4897 == -1) {
                arg1.field4897 = var2.field1166;
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z[Lch;IIIII[B)[I", line = 501)
    public static final int[] method319(boolean arg0, class8[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7) {
        field565++;
        byte var8;
        if (arg0) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg0) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (arg5 + var10 > 0 && (arg5 + var10) < 103 && arg4 + var11 > 0 && (arg4 + var11) < 103) {
                            arg1[var9].field89[arg5 + var10][arg4 + var11] = class335.method2339(arg1[var9].field89[arg5 + var10][arg4 + var11], -2097153);
                        }
                    }
                }
            }
        }
        int var12 = arg5 + arg6;
        class299 var13 = new class299(arg7);
        int var14 = arg3 + arg4;
        int var15 = 0;
        if (arg2 != -24017) {
            return (int[]) null;
        }
        while (var8 > var15) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    class134.method1018(var13, false, false, arg0, var15, var12 + var16, var14 + var17, arg4 + var17, 0, 0, 0, arg5 + var16);
                }
            }
            var15++;
        }
        boolean var18 = false;
        boolean var19 = false;
        while (var13.field4350.length > var13.field4351) {
            int var20 = var13.method2096((byte) -122);
            if (var20 == 128) {
                var18 = true;
                class83.field1070[0] = var13.method2083((byte) -36);
                class83.field1070[1] = var13.method2043(true);
                class83.field1070[2] = var13.method2043(true);
                class83.field1070[3] = var13.method2043(true);
                class83.field1070[4] = var13.method2083((byte) -66);
            } else {
                if (var20 != 129) {
                    var13.field4351--;
                    break;
                }
                for (int var21 = 0; var21 < 4; var21++) {
                    byte var22 = var13.method2104(109);
                    if (var22 == 0) {
                        int var23 = arg5 + 64;
                        if (var23 < 0) {
                            var23 = 0;
                        } else if (var23 >= 104) {
                            var23 = 104;
                        }
                        int var24 = arg5;
                        int var25 = arg4;
                        if (arg4 < 0) {
                            var25 = 0;
                        } else if (arg4 >= 104) {
                            var25 = 104;
                        }
                        int var26 = arg4 + 64;
                        if (arg5 < 0) {
                            var24 = 0;
                        } else if (arg5 >= 104) {
                            var24 = 104;
                        }
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 >= 104) {
                            var26 = 104;
                        }
                        while (var23 > var24) {
                            while (var25 < var26) {
                                class9.field100[var21][var24][var25] = 0;
                                var25++;
                            }
                            var24++;
                        }
                    } else if (var22 == 1) {
                        for (int var27 = 0; var27 < 64; var27 += 4) {
                            for (int var28 = 0; var28 < 64; var28 += 4) {
                                byte var29 = var13.method2104(123);
                                for (int var30 = arg5 + var27; var30 < var27 - (-arg5 - 4); var30++) {
                                    for (int var31 = arg4 + var28; var31 < var28 + arg4 + 4; var31++) {
                                        if (var30 >= 0 && var30 < 104 && var31 >= 0 && var31 < 104) {
                                            class9.field100[var21][var30][var31] = var29;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var22 == 2 && var21 > 0) {
                        int var32 = arg5 + 64;
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 >= 104) {
                            var32 = 104;
                        }
                        int var33 = arg4;
                        if (arg4 < 0) {
                            var33 = 0;
                        } else if (arg4 >= 104) {
                            var33 = 104;
                        }
                        int var34 = arg5;
                        int var35 = arg4 + 64;
                        if (arg5 < 0) {
                            var34 = 0;
                        } else if (arg5 >= 104) {
                            var34 = 104;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 >= 104) {
                            var35 = 104;
                        }
                        while (var32 > var34) {
                            while (var35 > var33) {
                                class9.field100[var21][var34][var33] = class9.field100[var21 - 1][var34][var33];
                                var33++;
                            }
                            var34++;
                        }
                    }
                }
                var19 = true;
            }
        }
        if (class47.field623 && !arg0) {
            class80 var36 = null;
            while (true) {
                while (var13.field4351 < var13.field4350.length) {
                    int var37 = var13.method2096((byte) -122);
                    if (var37 == 0) {
                        var36 = new class80(var13);
                    } else if (var37 == 1) {
                        int var38 = var13.method2096((byte) -122);
                        if (var38 > 0) {
                            for (int var39 = 0; var39 < var38; var39++) {
                                class339 var40 = new class339(var13);
                                if (var40.field5285 == 31) {
                                    class355 var41 = class335.method2340(var13.method2083((byte) -57), (byte) -72);
                                    var40.method2356(var41.field5561, 1056, var41.field5557, var41.field5559, var41.field5558);
                                }
                                var40.field5309 += arg5 << 7;
                                var40.field5282 += arg4 << 7;
                                int var42 = var40.field5309 >> 7;
                                int var43 = var40.field5282 >> 7;
                                if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
                                    var40.field5295 = (class9.field101[1][var42][var43] & 0x2) != 0;
                                    var40.field5284 = class74.field978[var40.field5293][var42][var43] - var40.field5284;
                                    class22.method138(var40);
                                }
                            }
                        }
                    } else if (var37 == 2) {
                        if (var36 == null) {
                            var36 = new class80();
                        }
                        var36.method566(var13, -27409);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var36 == null) {
                    var36 = new class80();
                }
                for (int var44 = 0; var44 < 8; var44++) {
                    for (int var45 = 0; var45 < 8; var45++) {
                        int var46 = (arg5 >> 3) + var44;
                        int var47 = (arg4 >> 3) + var45;
                        if (var46 >= 0 && var46 < 13 && var47 >= 0 && var47 < 13) {
                            class25.field295[var46][var47] = var36;
                        }
                    }
                }
                break;
            }
        }
        if (!var19) {
            for (int var48 = 0; var48 < 4; var48++) {
                for (int var49 = 0; var49 < 16; var49++) {
                    for (int var50 = 0; var50 < 16; var50++) {
                        int var51 = (arg4 >> 2) + var50;
                        int var52 = (arg5 >> 2) + var49;
                        if (var52 >= 0 && var52 < 26 && var51 >= 0 && var51 < 26) {
                            class9.field100[var48][var52][var51] = 0;
                        }
                    }
                }
            }
        }
        return var18 ? class83.field1070 : null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V", line = 924)
    public final void method320(int arg0, Graphics arg1, byte arg2, int arg3) {
        this.method317((byte) 114);
        if (arg2 > -122) {
            field556 = 94;
        }
        field562++;
        arg1.drawImage(this.field2279, arg0, arg3, this);
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)V", line = 937)
    public static void method321(int arg0) {
        field550 = null;
        field564 = null;
        if (arg0 != -1) {
            method322(-97, 89, (byte) -55, -120, 58, -53, -53, -56);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIBIIIII)V", line = 948)
    public static final void method322(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 >= 0 && arg4 >= 0 && arg1 < 103 && arg4 < 103) {
            if (arg5 == 0) {
                class231 var8 = class54.method414(arg3, arg1, arg4);
                if (var8 != null) {
                    int var9 = (int) (var8.field3302 >>> 32) & Integer.MAX_VALUE;
                    if (arg7 == 2) {
                        var8.field3309 = new class291(var9, 2, arg6 + 4, arg3, arg1, arg4, arg0, false, var8.field3309);
                        var8.field3305 = new class291(var9, 2, arg6 + 1 & 0x3, arg3, arg1, arg4, arg0, false, var8.field3305);
                    } else {
                        var8.field3309 = new class291(var9, arg7, arg6, arg3, arg1, arg4, arg0, false, var8.field3309);
                    }
                }
            }
            if (arg5 == 1) {
                class66 var10 = class362.method2519(arg3, arg1, arg4);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field851 >>> 32);
                    if (arg7 == 4 || arg7 == 5) {
                        var10.field848 = new class291(var11, 4, arg6, arg3, arg1, arg4, arg0, false, var10.field848);
                    } else if (arg7 == 6) {
                        var10.field848 = new class291(var11, 4, arg6 + 4, arg3, arg1, arg4, arg0, false, var10.field848);
                    } else if (arg7 == 7) {
                        var10.field848 = new class291(var11, 4, (arg6 + 2 & 0x3) + 4, arg3, arg1, arg4, arg0, false, var10.field848);
                    } else if (arg7 == 8) {
                        var10.field848 = new class291(var11, 4, arg6 + 4, arg3, arg1, arg4, arg0, false, var10.field848);
                        var10.field845 = new class291(var11, 4, (arg6 + 2 & 0x3) + 4, arg3, arg1, arg4, arg0, false, var10.field845);
                    }
                }
            }
            if (arg5 == 2) {
                if (arg7 == 11) {
                    arg7 = 10;
                }
                class294 var12 = class347.method2412(arg3, arg1, arg4);
                if (var12 != null) {
                    var12.field4275 = new class291((int) (var12.field4289 >>> 32) & Integer.MAX_VALUE, arg7, arg6, arg3, arg1, arg4, arg0, false, var12.field4275);
                }
            }
            if (arg5 == 3) {
                class24 var13 = class154.method1189(arg3, arg1, arg4);
                if (var13 != null) {
                    var13.field269 = new class291(Integer.MAX_VALUE & (int) (var13.field267 >>> 32), 22, arg6, arg3, arg1, arg4, arg0, false, var13.field269);
                }
            }
        }
        if (arg2 > -16) {
            method321(91);
        }
        field570++;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZZLwf;)V", line = 1041)
    public static final void method323(boolean arg0, boolean arg1, class333 arg2) {
        int var3 = arg2.field5037 == 0 ? arg2.field5056 : arg2.field5037;
        int var4 = arg2.field5044 == 0 ? arg2.field5172 : arg2.field5044;
        class126.method933(class26.field308[arg2.field5109 >> 16], arg0, var3, arg2.field5109, var4, -120);
        if (arg1) {
            return;
        }
        field561++;
        if (arg2.field5187 != null) {
            class126.method933(arg2.field5187, arg0, var3, arg2.field5109, var4, -106);
        }
        class74 var5 = (class74) class272.field3900.method2279((long) arg2.field5109, 1);
        if (var5 != null) {
            class214.method1562(arg0, -6090, var3, var5.field982, var4);
        }
    }

    @OriginalMember(owner = "client!tm", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 1065)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field569++;
        return true;
    }

    @OriginalMember(owner = "client!tm", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 1075)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        field553++;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIBII)V", line = 1086)
    private final synchronized void method324(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field557++;
        if (arg2 < 115) {
            field559 = -67;
        }
        if (this.field563 != null) {
            this.field563.setPixels(arg0, arg3, arg1, arg4, this.field554, this.field2283, this.field2285 * arg3 + arg0, this.field2285);
            this.field563.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!tm", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 1109)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field566++;
        return this.field563 == arg0;
    }

    @OriginalMember(owner = "client!tm", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 1118)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        field558++;
        if (this.field563 == arg0) {
            this.field563 = null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljava/awt/Component;IIB)V", line = 1130)
    public final void method325(Component arg0, int arg1, int arg2, byte arg3) {
        this.field2285 = arg1;
        this.field2284 = arg2;
        field552++;
        this.field2283 = new int[arg1 * arg2 + 1];
        this.field554 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field2279 = arg0.createImage(this);
        this.method317((byte) -65);
        arg0.prepareImage(this.field2279, this);
        this.method317((byte) -128);
        arg0.prepareImage(this.field2279, this);
        this.method317((byte) -90);
        arg0.prepareImage(this.field2279, this);
        if (arg3 != 0) {
            this.field563 = (ImageConsumer) null;
        }
        this.method1224(84167136);
    }
}

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class785 implements class441 {

    @OriginalMember(owner = "client!lo", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field11467 = new String[] { method5690(method5689("\u001cV~V8")), method5690(method5689("\u001cV~T8")), method5690(method5689("\u001eL<u")), method5690(method5689("\u001cV~P8")), method5690(method5689("\u000b\u0017~7m")), method5690(method5689("\u001cV~R8")), method5690(method5689("\u001cV~\\8")), method5690(method5689("\u001cV~I8")), method5690(method5689("\u001cV~Q8")), method5690(method5689("\u001cV~[8")), method5690(method5689("\u001c\\6m")), method5690(method5689("\u0018\\9~x\u0004")), method5690(method5689("\u0002P7qd")), method5690(method5689("\tv6\u007fc\u0015M")), method5690(method5689("\u0004\\(mI?_6ju\u0004")), method5690(method5689("\u001cV~^8")), method5690(method5689("\u0012_")), method5690(method5689("\u0007P4mx")), method5690(method5689("\u0012V(@_\u0016_#|d")), method5690(method5689("\u0012X\"")), method5690(method5689("\u001c[")), method5690(method5689("\u0012V4`B\u0019^8m")), method5690(method5689("\tt9}t\u001c\\")), method5690(method5689("\u0012_=")), method5690(method5689("\u0012V$m\u007f\u001d")), method5690(method5689("\u0012V(Ny\u0014M8")), method5690(method5689("\u001f_6ju\u0004i5kD\u0015W\u0013`s\u001c\\#")), method5690(method5689("\bt9}t\u001c\\")), method5690(method5689("\u0012V4`V\u0019U<")), method5690(method5689("\u0012V(A_\u0016_#|d")), method5690(method5689("\u0012X3rw\u0002V%wt")), method5690(method5689("\u0012V4`\\\u0015_$")), method5690(method5689("\u0004V ")), method5690(method5689("\u0013V<ve\u0002M5ad")), method5690(method5689("\bv6\u007fc\u0015M")), method5690(method5689("\u001cV~]8")), method5690(method5689("\u001cV~Z8")), method5690(method5689("\u001cV~W8")), method5690(method5689("\u001cV~S8")), method5690(method5689("\u001cV~U8")), method5690(method5689("\u001cV~_8")), method5690(method5689("\u001cV~H8")), method5690(method5689("\u001cV~X8")) };

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "Lwia;")
    public static class790 field11441 = new class790(31, 3);

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
    public static int field11425;

    @OriginalMember(owner = "client!lo", name = "w", descriptor = "I")
    public static int field11427;

    @OriginalMember(owner = "client!lo", name = "m", descriptor = "I")
    public static int field11428;

    @OriginalMember(owner = "client!lo", name = "B", descriptor = "I")
    public static int field11429;

    @OriginalMember(owner = "client!lo", name = "L", descriptor = "I")
    public static int field11430;

    @OriginalMember(owner = "client!lo", name = "R", descriptor = "I")
    public static int field11433;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public static int field11434;

    @OriginalMember(owner = "client!lo", name = "s", descriptor = "I")
    public static int field11435;

    @OriginalMember(owner = "client!lo", name = "r", descriptor = "I")
    private int field11437;

    @OriginalMember(owner = "client!lo", name = "K", descriptor = "I")
    public static int field11438;

    @OriginalMember(owner = "client!lo", name = "N", descriptor = "I")
    public static int field11439;

    @OriginalMember(owner = "client!lo", name = "v", descriptor = "I")
    public static int field11440;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    private int field11444;

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "I")
    private int field11446;

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "I")
    private int field11447;

    @OriginalMember(owner = "client!lo", name = "n", descriptor = "I")
    public static int field11449;

    @OriginalMember(owner = "client!lo", name = "O", descriptor = "I")
    private int field11451;

    @OriginalMember(owner = "client!lo", name = "y", descriptor = "I")
    public static int field11454;

    @OriginalMember(owner = "client!lo", name = "F", descriptor = "I")
    public static int field11457;

    @OriginalMember(owner = "client!lo", name = "u", descriptor = "I")
    private int field11458;

    @OriginalMember(owner = "client!lo", name = "G", descriptor = "I")
    public static int field11459;

    @OriginalMember(owner = "client!lo", name = "z", descriptor = "I")
    private int field11462;

    @OriginalMember(owner = "client!lo", name = "Q", descriptor = "I")
    private int field11463;

    @OriginalMember(owner = "client!lo", name = "p", descriptor = "I")
    public static int field11464;

    @OriginalMember(owner = "client!lo", name = "E", descriptor = "I")
    private int field11466;

    @OriginalMember(owner = "client!lo", name = "D", descriptor = "Lca;")
    public static class321 field11442;

    @OriginalMember(owner = "client!lo", name = "A", descriptor = "Ljava/awt/Color;")
    private Color field11424;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "Ljava/awt/Font;")
    private Font field11448;

    @OriginalMember(owner = "client!lo", name = "q", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field11453;

    @OriginalMember(owner = "client!lo", name = "M", descriptor = "Ljava/awt/Image;")
    private Image field11426;

    @OriginalMember(owner = "client!lo", name = "x", descriptor = "Ljava/awt/Image;")
    private Image field11431;

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "Ljava/awt/Image;")
    private Image field11432;

    @OriginalMember(owner = "client!lo", name = "P", descriptor = "Ljava/awt/Image;")
    private Image field11436;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "Ljava/awt/Image;")
    private Image field11450;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "Ljava/awt/Image;")
    private Image field11452;

    @OriginalMember(owner = "client!lo", name = "J", descriptor = "Ljava/awt/Image;")
    private Image field11455;

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "Ljava/awt/Image;")
    private Image field11456;

    @OriginalMember(owner = "client!lo", name = "o", descriptor = "Ljava/awt/Image;")
    private Image field11460;

    @OriginalMember(owner = "client!lo", name = "I", descriptor = "Ljava/awt/Image;")
    private Image field11461;

    @OriginalMember(owner = "client!lo", name = "t", descriptor = "Z")
    private boolean field11443;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "Z")
    private boolean field11445;

    @OriginalMember(owner = "client!lo", name = "C", descriptor = "Z")
    private boolean field11465;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lffa;B)V", line = 5)
    public static final void method5678(class197 arg0, byte arg1) {
        try {
            if (class176.field2455 == null) {
                class693 var2 = new class693();
                byte[] var3 = var2.method5067(127, 16, 128, 128);
                class176.field2455 = class94.method801(var3, false, 136);
            }
            field11433++;
            if (class238.field3613 == null) {
                class579 var4 = new class579();
                byte[] var5 = var4.method4328(16, 17968, 128, 128);
                class238.field3613 = class94.method801(var5, false, 136);
            }
            class587 var6 = arg0.field2851;
            if (var6.method4378(-128) && class568.field8410 == null) {
                byte[] var7 = class117.method1031(4.0F, 0, 0.5F, 16, 16.0F, 4.0F, 8, 0.6F, 128, new class722(419684), 128);
                class568.field8410 = class94.method801(var7, false, 136);
            }
            if (arg1 > -94) {
                field11442 = null;
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field11467[7] + (arg0 == null ? field11467[2] : field11467[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "(I)V", line = 45)
    private final void method5679(int arg0) {
        try {
            if (arg0 == 1024) {
                class255.method2160(class768.field11101.method5228(false), class362.field5543[class50.field566], class195.field2616[class50.field566], class121.field1430[class50.field566], -1769725272, class768.field11101.method5226((byte) -76));
                field11439++;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11467[35] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lla;I)V", line = 57)
    public static final void method5680(class476 arg0, int arg1) {
        try {
            class274.field4143 = 0;
            field11434++;
            class143.field1723 = 0;
            if (arg1 != 21809) {
                field11442 = null;
            }
            class253.field3926 = new class614();
            class783.field11411 = new class392[1024];
            class784.field11420 = new class619[class211.field3243[class222.field3408] + 1];
            class139.field1657 = 0;
            class648.field9382 = 0;
            class267.method2223(arg0, true);
            class715.method5205(arg0, false);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11467[41] + (arg0 == null ? field11467[2] : field11467[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)I", line = 78)
    public final int method3388(int arg0) {
        try {
            field11427++;
            if (arg0 != -31112) {
                method5680(null, 20);
            }
            return 0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11467[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "(I)V", line = 93)
    public static void method5681(int arg0) {
        try {
            field11441 = null;
            if (arg0 != 419684) {
                method5681(65);
            }
            field11442 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field11467[39] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)I", line = 106)
    private final int method5682(int arg0, int arg1) {
        try {
            if (arg1 != 0) {
                this.field11432 = null;
            }
            field11428++;
            return this.field11443 ? (class94.field1062 - arg0) / 2 : 0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field11467[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;B)I", line = 120)
    private final int method5683(Class arg0, String arg1, Object arg2, byte arg3) throws IllegalAccessException, NoSuchFieldException {
        try {
            field11464++;
            Field var5 = arg0.getDeclaredField(arg1);
            if (arg3 != 11) {
                this.field11424 = null;
            }
            return var5.getInt(arg2);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field11467[42] + (arg0 == null ? field11467[2] : field11467[4]) + ',' + (arg1 == null ? field11467[2] : field11467[4]) + ',' + (arg2 == null ? field11467[2] : field11467[4]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)I", line = 133)
    public final int method3386(int arg0) {
        try {
            if (arg0 != 19607) {
                method5685(110, false, -88, -41, 68, -101, -70, 80);
            }
            field11435++;
            return 100;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11467[37] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "(I)V", line = 150)
    private final void method5684(int arg0) throws IllegalAccessException, NoSuchFieldException {
        try {
            field11457++;
            if (arg0 == 4) {
                Class var2 = class629.field9206.getClass();
                this.field11431 = (Image) this.method5686(-92, var2, field11467[19]);
                this.field11455 = (Image) this.method5686(-128, var2, field11467[30]);
                this.field11426 = (Image) this.method5686(arg0 ^ 0xFFFFFF98, var2, field11467[10]);
                this.field11436 = (Image) this.method5686(-123, var2, field11467[12]);
                this.field11460 = (Image) this.method5686(-100, var2, field11467[32]);
                this.field11452 = (Image) this.method5686(-97, var2, field11467[24]);
                this.field11461 = (Image) this.method5686(arg0 - 104, var2, field11467[31]);
                this.field11456 = (Image) this.method5686(-103, var2, field11467[21]);
                this.field11432 = (Image) this.method5686(arg0 - 116, var2, field11467[28]);
                this.field11448 = (Font) this.method5686(-103, var2, field11467[16]);
                this.field11453 = (FontMetrics) this.method5686(arg0 - 120, var2, field11467[23]);
                this.field11424 = (Color) this.method5686(-114, var2, field11467[33]);
                Object var3 = this.method5686(-110, var2, field11467[20]);
                Class var4 = var3.getClass();
                this.field11445 = this.method5687(field11467[27], var4, var3, 2);
                this.field11443 = this.method5687(field11467[22], var4, var3, arg0 - 2);
                this.field11463 = this.method5683(var4, field11467[34], var3, (byte) 11);
                this.field11451 = this.method5683(var4, field11467[13], var3, (byte) 11);
                this.field11437 = this.method5683(var4, field11467[17], var3, (byte) 11);
                this.field11446 = this.method5683(var4, field11467[11], var3, (byte) 11);
                this.field11444 = this.method5683(var4, field11467[29], var3, (byte) 11);
                this.field11447 = this.method5683(var4, field11467[18], var3, (byte) 11);
                this.field11462 = this.method5683(var4, field11467[25], var3, (byte) 11);
                this.field11466 = this.method5683(var4, field11467[14], var3, (byte) 11);
                this.field11458 = this.method5683(var4, field11467[26], var3, (byte) 11);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field11467[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IZIIIIII)V", line = 189)
    public static final void method5685(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            field11438++;
            if (arg4 == arg6) {
                class291.method2361(-18264, arg5, arg0, arg7, arg6, arg2, arg3);
            } else {
                if (!arg1) {
                    field11441 = null;
                }
                if ((arg3 - arg6) >= class200.field3119 && class676.field9797 >= arg3 + arg6 && arg2 - arg4 >= class676.field9807 && arg2 + arg4 <= class381.field5786) {
                    class548.method4131((byte) 41, arg2, arg7, arg0, arg5, arg6, arg4, arg3);
                } else {
                    class85.method723(arg3, arg5, arg6, arg4, (byte) 39, arg0, arg2, arg7);
                }
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field11467[36] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", line = 224)
    private final Object method5686(int arg0, Class arg1, String arg2) throws IllegalAccessException, NoSuchFieldException {
        try {
            field11429++;
            if (arg0 > -89) {
                return null;
            } else {
                Field var4 = arg1.getDeclaredField(arg2);
                Object var5 = var4.get(class629.field9206);
                var4.set(class629.field9206, null);
                return var5;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field11467[3] + arg0 + ',' + (arg1 == null ? field11467[2] : field11467[4]) + ',' + (arg2 == null ? field11467[2] : field11467[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(B)V", line = 247)
    public final void method3387(byte arg0) {
        try {
            field11440++;
            class729.method5316(116);
            if (arg0 != -96) {
                method5685(107, false, -18, -26, 45, 50, -126, -84);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11467[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZJ)Z", line = 258)
    public final boolean method3390(boolean arg0, long arg1) {
        try {
            field11425++;
            if (arg0) {
                method5678(null, (byte) 17);
            }
            return true;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field11467[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IZ)V", line = 269)
    public final void method3389(int arg0, boolean arg1) {
        try {
            if (!this.field11465) {
                if (class629.field9206 == null) {
                    this.field11465 = true;
                } else if (this.field11448 == null) {
                    try {
                        this.method5684(4);
                    } catch (Exception var44) {
                        this.field11465 = true;
                    }
                }
            }
            field11454++;
            if (this.field11465) {
                this.method5679(1024);
            } else {
                Graphics var3 = class502.field7252.getGraphics();
                if (var3 == null) {
                    class502.field7252.repaint();
                } else {
                    try {
                        int var4 = class768.field11101.method5226((byte) -76);
                        String var5 = class768.field11101.method5228(false);
                        if (class330.field5191 == null) {
                            class330.field5191 = class502.field7252.createImage(class179.field2489, class94.field1062);
                        }
                        Graphics var6 = class330.field5191.getGraphics();
                        var6.clearRect(0, 0, class179.field2489, class94.field1062);
                        int var7 = this.field11461.getWidth(null);
                        int var8 = this.field11456.getWidth(null);
                        int var9 = this.field11432.getWidth(null);
                        int var10 = this.field11461.getHeight(null);
                        int var11 = this.field11456.getHeight(null);
                        int var12 = this.field11432.getHeight(null);
                        var6.drawImage(this.field11461, this.method5688(false, var7) + this.field11444 - this.field11462 / 2, this.method5682(var10, 0) - -this.field11447, null);
                        int var13 = this.field11444 - (this.field11462 / 2 - var7);
                        int var14 = this.field11462 / 2 + this.field11444;
                        for (int var15 = var13; var15 <= var14; var15 += var9) {
                            var6.drawImage(this.field11432, var15 + this.method5688(false, var7) + this.field11444, this.method5682(var12, 0) - -this.field11447, null);
                        }
                        var6.drawImage(this.field11456, this.method5688(false, var8) + this.field11444 + this.field11462 / 2, this.method5682(var11, 0) + this.field11447, null);
                        int var16 = this.field11426.getWidth(null);
                        int var17 = this.field11426.getHeight(null);
                        int var18 = this.field11436.getWidth(null);
                        int var19 = this.field11436.getHeight(null);
                        int var20 = this.field11452.getHeight(null);
                        int var21 = this.field11460.getWidth(null);
                        int var22 = this.field11460.getHeight(null);
                        int var23 = this.field11452.getWidth(null);
                        int var24 = this.field11431.getWidth(null);
                        int var25 = this.field11455.getWidth(null);
                        int var26 = this.method5688(false, this.field11437) + this.field11463;
                        int var27 = this.method5682(this.field11446, 0) + this.field11451;
                        var6.drawImage(this.field11426, var26, var27 + ((this.field11446 - var17) / 2), null);
                        var6.drawImage(this.field11436, this.field11437 + var26 - var18, (-var19 + this.field11446) / 2 + var27, null);
                        if (this.field11450 == null) {
                            this.field11450 = class502.field7252.createImage(this.field11437 - var18 - var16, this.field11446);
                        }
                        Graphics var28 = this.field11450.getGraphics();
                        for (int var29 = 0; var29 < this.field11437 - var16 - var18; var29 += var21) {
                            var28.drawImage(this.field11460, var29, 0, null);
                        }
                        for (int var30 = 0; var30 < (this.field11437 - var16 - var18); var30 += var23) {
                            var28.drawImage(this.field11452, var30, this.field11446 - var20, null);
                        }
                        int var31 = (this.field11437 - var18 - var16) * var4 / 100;
                        if (var31 > 0) {
                            Image var32 = class502.field7252.createImage(var31, this.field11446 - var20 - var22);
                            int var33 = var32.getWidth(null);
                            Graphics var34 = var32.getGraphics();
                            int var35 = this.field11458 * class540.method4070((byte) 67) / 10 % var24;
                            for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                                var34.drawImage(this.field11431, var36, 0, null);
                            }
                            var28.drawImage(var32, 0, var22, null);
                        }
                        int var38 = this.field11437 - var16 - var18 - var31;
                        if (var38 > 0) {
                            Image var39 = class502.field7252.createImage(var38, this.field11446 - var20 - var22);
                            int var40 = var39.getWidth(null);
                            Graphics var41 = var39.getGraphics();
                            for (int var42 = 0; var42 < var40; var42 += var25) {
                                var41.drawImage(this.field11455, var42, 0, null);
                            }
                            var28.drawImage(var39, var31, var22, null);
                        }
                        var6.drawImage(this.field11450, var26 + var16, var27, null);
                        var6.setFont(this.field11448);
                        var6.setColor(this.field11424);
                        var6.drawString(var5, (this.field11437 - this.field11453.stringWidth(var5)) / 2 + var26, this.field11446 / 2 + this.field11466 + 4 + var27);
                        var3.drawImage(class330.field5191, 0, 0, null);
                    } catch (Exception var45) {
                        this.field11465 = true;
                    }
                }
                if (arg0 >= -76) {
                    this.method3385((byte) -75);
                }
            }
        } catch (RuntimeException var46) {
            throw class759.method5498(var46, field11467[40] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;I)Z", line = 463)
    private final boolean method5687(String arg0, Class arg1, Object arg2, int arg3) throws IllegalAccessException, NoSuchFieldException {
        try {
            if (arg3 == 2) {
                field11459++;
                Field var5 = arg1.getDeclaredField(arg0);
                return var5.getBoolean(arg2);
            } else {
                return true;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field11467[8] + (arg0 == null ? field11467[2] : field11467[4]) + ',' + (arg1 == null ? field11467[2] : field11467[4]) + ',' + (arg2 == null ? field11467[2] : field11467[4]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V", line = 477)
    public final void method3385(byte arg0) {
        try {
            field11430++;
            if (arg0 != -17) {
                this.field11452 = null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field11467[38] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZI)I", line = 488)
    private final int method5688(boolean arg0, int arg1) {
        try {
            field11449++;
            if (this.field11445) {
                return (class179.field2489 - arg1) / 2;
            } else {
                if (arg0) {
                    this.method5679(-117);
                }
                return 0;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field11467[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lo", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5689(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x10);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lo", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5690(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 112;
                    break;
                case 1:
                    var10005 = 57;
                    break;
                case 2:
                    var10005 = 80;
                    break;
                case 3:
                    var10005 = 25;
                    break;
                default:
                    var10005 = 16;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

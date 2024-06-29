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

@OriginalClass("client!hi")
public class class318 extends class175 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!hi", name = "D", descriptor = "I")
    public static int field5056 = 0;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!hi", name = "A", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!hi", name = "B", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!hi", name = "C", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!hi", name = "E", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "Lcg;")
    public static class49 field5050;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field5047;

    @OriginalMember(owner = "client!hi", name = "F", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field5058;

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "[I")
    public static int[] field5048;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BIILjava/awt/Component;)V", line = 4)
    public final void method958(byte arg0, int arg1, int arg2, Component arg3) {
        this.field2994 = arg1;
        this.field2992 = arg2;
        field5040++;
        this.field2990 = new int[arg1 * arg2 + 1];
        this.field5047 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field2986 = arg3.createImage(this);
        this.method2192((byte) -59);
        arg3.prepareImage(this.field2986, this);
        this.method2192((byte) 118);
        if (arg0 > -112) {
            field5048 = (int[]) null;
        }
        arg3.prepareImage(this.field2986, this);
        this.method2192((byte) 95);
        arg3.prepareImage(this.field2986, this);
        this.method1358(2);
    }

    @OriginalMember(owner = "client!hi", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 27)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field5044++;
        return this.field5058 == arg0;
    }

    @OriginalMember(owner = "client!hi", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 35)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field5045++;
    }

    @OriginalMember(owner = "client!hi", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 47)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        this.field5058 = arg0;
        arg0.setDimensions(this.field2994, this.field2992);
        field5053++;
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field5047);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lwc;I)V", line = 62)
    public static final void method2186(class116 arg0, int arg1) {
        if (arg1 > -89) {
            field5042 = 44;
        }
        field5055++;
        if (arg0.field1979 == 0) {
            return;
        }
        class346 var2 = arg0.method980((byte) 73);
        if (arg0.field1941 != -1 && arg0.field1941 < 32768) {
            class278 var3 = class320.field5071[arg0.field1941];
            if (var3 != null) {
                int var4 = arg0.field2036 - var3.field2036;
                int var5 = arg0.field1985 - var3.field1985;
                if (var4 != 0 || var5 != 0) {
                    arg0.field1951 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field1941 >= 32768) {
            int var6 = arg0.field1941 - 32768;
            if (class316.field5010 == var6) {
                var6 = 2047;
            }
            class205 var7 = class135.field2359[var6];
            if (var7 != null) {
                int var8 = arg0.field2036 - var7.field2036;
                int var9 = arg0.field1985 - var7.field1985;
                if (var8 != 0 || var9 != 0) {
                    arg0.field1951 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field1992 != 0 || arg0.field2017 != 0) && (arg0.field1957 == 0 || arg0.field2020 > 0)) {
            int var10 = arg0.field1985 - ((arg0.field2017 - class34.field484 - class34.field484) * 64);
            int var11 = arg0.field2036 - ((arg0.field1992 - class24.field345 - class24.field345) * 64);
            if (var11 != 0 || var10 != 0) {
                arg0.field1951 = (int) (Math.atan2((double) var11, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field1992 = 0;
            arg0.field2017 = 0;
        }
        int var12 = arg0.field1951 - arg0.field1946 & 0x7FF;
        if (var12 == 0) {
            arg0.field1947 = 0;
            arg0.field2022 = 0;
        } else if (var2.field5513 == 0) {
            arg0.field2022++;
            if (var12 <= 1024) {
                arg0.field1946 += arg0.field1979;
                boolean var20 = true;
                if (arg0.field1979 > var12 || var12 > 2048 - arg0.field1979) {
                    var20 = false;
                    arg0.field1946 = arg0.field1951;
                }
                if (arg0.field2022 > 25 || var20) {
                    arg0.field2000 = var2.field5492;
                    if (arg0.field1957 <= 0) {
                        if (var2.field5498 != -1) {
                            arg0.field2000 = var2.field5498;
                        }
                    } else if (arg0.field2037[arg0.field1957 - 1] == 2) {
                        if (var2.field5493 != -1) {
                            arg0.field2000 = var2.field5493;
                        } else if (var2.field5503 != -1) {
                            arg0.field2000 = var2.field5503;
                        }
                    } else if (arg0.field2037[arg0.field1957 - 1] == 0) {
                        if (var2.field5502 != -1) {
                            arg0.field2000 = var2.field5502;
                        } else if (var2.field5522 != -1) {
                            arg0.field2000 = var2.field5522;
                        }
                    } else if (var2.field5489 != -1) {
                        arg0.field2000 = var2.field5489;
                    }
                }
            } else {
                arg0.field1946 -= arg0.field1979;
                boolean var21 = true;
                if (var12 < arg0.field1979 || var12 > (2048 - arg0.field1979)) {
                    arg0.field1946 = arg0.field1951;
                    var21 = false;
                }
                if (arg0.field2022 > 25 || var21) {
                    arg0.field2000 = var2.field5492;
                    if (arg0.field1957 > 0) {
                        if (arg0.field2037[arg0.field1957 - 1] == 2) {
                            if (var2.field5486 != -1) {
                                arg0.field2000 = var2.field5486;
                            } else if (var2.field5503 != -1) {
                                arg0.field2000 = var2.field5503;
                            }
                        } else if (arg0.field2037[arg0.field1957 - 1] == 0) {
                            if (var2.field5512 != -1) {
                                arg0.field2000 = var2.field5512;
                            } else if (var2.field5522 != -1) {
                                arg0.field2000 = var2.field5522;
                            }
                        } else if (var2.field5526 != -1) {
                            arg0.field2000 = var2.field5526;
                        }
                    } else if (var2.field5517 != -1) {
                        arg0.field2000 = var2.field5517;
                    }
                }
            }
            arg0.field1946 &= 0x7FF;
        } else {
            arg0.field2000 = -1;
            int var13 = arg0.field1951 << 5;
            if (arg0.field1939 != var13) {
                arg0.field1943 = 0;
                arg0.field1939 = var13;
                int var14 = var13 - arg0.field1952 & 0xFFFF;
                int var15 = arg0.field1947 * arg0.field1947 / (var2.field5513 * 2);
                if (arg0.field1947 > 0 && var14 >= var15 && (var14 - var15) < 32768) {
                    arg0.field1931 = true;
                    int var16 = var2.field5501 * var2.field5501 / (var2.field5513 * 2);
                    arg0.field2016 = var14 / 2;
                    if (var16 > 32767) {
                        var16 = 32767;
                    }
                    if (var16 < arg0.field2016) {
                        arg0.field2016 = var14 - var16;
                    }
                } else if (arg0.field1947 < 0 && var15 <= (65536 - var14) && 65536 - var14 - var15 < 32768) {
                    arg0.field2016 = (65536 - var14) / 2;
                    arg0.field1931 = true;
                    int var17 = var2.field5501 * var2.field5501 / (var2.field5513 * 2);
                    if (var17 > 32767) {
                        var17 = 32767;
                    }
                    if (arg0.field2016 > var17) {
                        arg0.field2016 = 65536 - var14 - var17;
                    }
                } else {
                    arg0.field1931 = false;
                }
            }
            if (arg0.field1947 == 0) {
                int var18 = arg0.field1939 - arg0.field1952 & 0xFFFF;
                if (var2.field5513 > var18) {
                    arg0.field1952 = arg0.field1939;
                } else {
                    arg0.field1931 = true;
                    arg0.field1943 = 0;
                    int var19 = var2.field5501 * var2.field5501 / (var2.field5513 * 2);
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    if (var18 >= 32768) {
                        arg0.field1947 = -var2.field5513;
                        arg0.field2016 = (65536 - var18) / 2;
                        if (var19 < arg0.field2016) {
                            arg0.field2016 = 65536 - var18 - var19;
                        }
                    } else {
                        arg0.field1947 = var2.field5513;
                        arg0.field2016 = var18 / 2;
                        if (var19 < arg0.field2016) {
                            arg0.field2016 = var18 - var19;
                        }
                    }
                }
            } else if (arg0.field1947 > 0) {
                if (arg0.field1943 >= arg0.field2016) {
                    arg0.field1931 = false;
                }
                if (!arg0.field1931) {
                    arg0.field1947 -= var2.field5513;
                    if (arg0.field1947 < 0) {
                        arg0.field1947 = 0;
                    }
                } else if (arg0.field1947 < var2.field5501) {
                    arg0.field1947 += var2.field5513;
                }
            } else {
                if (arg0.field2016 <= arg0.field1943) {
                    arg0.field1931 = false;
                }
                if (!arg0.field1931) {
                    arg0.field1947 += var2.field5513;
                    if (arg0.field1947 > 0) {
                        arg0.field1947 = 0;
                    }
                } else if ((-var2.field5501) < arg0.field1947) {
                    arg0.field1947 -= var2.field5513;
                }
            }
            if (arg0.field1947 <= 0) {
                arg0.field1943 -= arg0.field1947;
            } else {
                arg0.field1943 += arg0.field1947;
            }
            arg0.field1952 += arg0.field1947;
            arg0.field1952 &= 0xFFFF;
            arg0.field1946 = arg0.field1952 >> 5;
            if (arg0.field1947 >= 0) {
                if (arg0.field1957 > 0) {
                    if (arg0.field2037[arg0.field1957 - 1] == 2) {
                        if (var2.field5493 != -1) {
                            arg0.field2000 = var2.field5493;
                        } else if (var2.field5503 != -1) {
                            arg0.field2000 = var2.field5503;
                        }
                    } else if (arg0.field2037[arg0.field1957 - 1] == 0) {
                        if (var2.field5502 != -1) {
                            arg0.field2000 = var2.field5502;
                        } else if (var2.field5522 != -1) {
                            arg0.field2000 = var2.field5522;
                        }
                    }
                }
                if (arg0.field2000 == -1) {
                    if (var2.field5489 != -1) {
                        arg0.field2000 = var2.field5489;
                    } else if (var2.field5498 != -1) {
                        arg0.field2000 = var2.field5498;
                    }
                }
            } else {
                if (arg0.field1957 > 0) {
                    if (arg0.field2037[arg0.field1957 - 1] == 2) {
                        if (var2.field5486 != -1) {
                            arg0.field2000 = var2.field5486;
                        } else if (var2.field5503 != -1) {
                            arg0.field2000 = var2.field5503;
                        }
                    } else if (arg0.field2037[arg0.field1957 - 1] == 0) {
                        if (var2.field5512 != -1) {
                            arg0.field2000 = var2.field5512;
                        } else if (var2.field5522 != -1) {
                            arg0.field2000 = var2.field5522;
                        }
                    }
                }
                if (arg0.field2000 == -1) {
                    if (var2.field5526 != -1) {
                        arg0.field2000 = var2.field5526;
                    } else if (var2.field5517 != -1) {
                        arg0.field2000 = var2.field5517;
                    }
                }
            }
            if (arg0.field2000 == -1) {
                arg0.field2000 = var2.field5492;
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V", line = 500)
    public static void method2187(byte arg0) {
        int var1 = -16 / ((arg0 - 3) / 51);
        field5048 = null;
        field5050 = null;
    }

    @OriginalMember(owner = "client!hi", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 513)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5054++;
        return true;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLjl;)V", line = 521)
    public static final void method2188(byte arg0, class287 arg1) {
        if (arg0 <= 67) {
            method2188((byte) 96, (class287) null);
        }
        field5046++;
        long var2 = 0L;
        int var4 = 0;
        if (arg1.field4577 == 0) {
            var2 = class290.method1980(arg1.field4580, arg1.field4578, arg1.field4566);
        }
        if (arg1.field4577 == 1) {
            var2 = class100.method865(arg1.field4580, arg1.field4578, arg1.field4566);
        }
        int var5 = -1;
        int var6 = 0;
        if (arg1.field4577 == 2) {
            var2 = class143.method1156(arg1.field4580, arg1.field4578, arg1.field4566);
        }
        if (arg1.field4577 == 3) {
            var2 = class271.method1850(arg1.field4580, arg1.field4578, arg1.field4566);
        }
        if (var2 != 0L) {
            var5 = Integer.MAX_VALUE & (int) (var2 >>> 32);
            var6 = ((int) var2 & 0x38F146) >> 20;
            var4 = (int) var2 >> 14 & 0x1F;
        }
        arg1.field4569 = var6;
        arg1.field4587 = var4;
        arg1.field4571 = var5;
    }

    @OriginalMember(owner = "client!hi", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 565)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        field5051++;
        if (this.field5058 == arg0) {
            this.field5058 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIII)V", line = 579)
    private final synchronized void method2189(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5043++;
        if (this.field5058 == null) {
            return;
        }
        this.field5058.setPixels(arg2, arg3, arg4, arg1, this.field5047, this.field2990, this.field2994 * arg3 + arg2, this.field2994);
        if (arg0 != 31) {
            this.addConsumer((ImageConsumer) null);
        }
        this.field5058.imageComplete(2);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)Lqh;", line = 594)
    public static final class325 method2190(int arg0, int arg1) {
        field5052++;
        if (arg0 != -11947) {
            field5042 = -64;
        }
        return (class325) class137.field2370.method732((long) arg1, true);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILjava/awt/Graphics;IZII)V", line = 607)
    public final void method957(int arg0, Graphics arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field5041++;
        this.method2189(31, arg0, arg5, arg2, arg4);
        if (arg3) {
            Shape var7 = arg1.getClip();
            arg1.clipRect(arg5, arg2, arg4, arg0);
            arg1.drawImage(this.field2986, 0, 0, this);
            arg1.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZIIIBIZ)V", line = 626)
    public static final void method2191(int arg0, boolean arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, boolean arg7) {
        field5039++;
        if (!arg1 && class144.field2626 == arg4 && class181.field3047 == arg2 && class321.field5086 == arg6 || class56.method499(-107)) {
            return;
        }
        class181.field3047 = arg2;
        class144.field2626 = arg4;
        class321.field5086 = arg6;
        if (class56.method499(39)) {
            class321.field5086 = 0;
        }
        if (arg7) {
            class33.method302((byte) 81, 28);
        } else {
            class33.method302((byte) -75, 25);
        }
        if (arg5 >= -21) {
            return;
        }
        class120.method1019(23516, class30.field437, true);
        int var8 = class34.field484;
        class34.field484 = arg2 * 8 - 48;
        int var9 = class24.field345;
        class24.field345 = arg4 * 8 - 48;
        class21.field329 = class194.method1456(class181.field3047 * 8, (byte) -67, class144.field2626 * 8);
        int var10 = class24.field345 - var9;
        int var11 = class34.field484 - var8;
        int var12 = class24.field345;
        class133.field2271 = null;
        int var13 = class34.field484;
        if (arg7) {
            class191.field3200 = 0;
            for (int var17 = 0; var17 < 32768; var17++) {
                class278 var18 = class320.field5071[var17];
                if (var18 != null) {
                    var18.field1985 -= var11 * 128;
                    var18.field2036 -= var10 * 128;
                    if (var18.field2036 >= 0 && var18.field2036 <= 13184 && var18.field1985 >= 0 && var18.field1985 <= 13184) {
                        for (int var19 = 0; var19 < 10; var19++) {
                            var18.field1975[var19] -= var10;
                            var18.field2034[var19] -= var11;
                        }
                        class33.field468[class191.field3200++] = var17;
                    } else {
                        class320.field5071[var17].method1908((class12) null, 24717);
                        class320.field5071[var17] = null;
                    }
                }
            }
        } else {
            for (int var14 = 0; var14 < 32768; var14++) {
                class278 var15 = class320.field5071[var14];
                if (var15 != null) {
                    for (int var16 = 0; var16 < 10; var16++) {
                        var15.field1975[var16] -= var10;
                        var15.field2034[var16] -= var11;
                    }
                    var15.field2036 -= var10 * 128;
                    var15.field1985 -= var11 * 128;
                }
            }
        }
        for (int var20 = 0; var20 < 2048; var20++) {
            class205 var21 = class135.field2359[var20];
            if (var21 != null) {
                for (int var22 = 0; var22 < 10; var22++) {
                    var21.field1975[var22] -= var10;
                    var21.field2034[var22] -= var11;
                }
                var21.field1985 -= var11 * 128;
                var21.field2036 -= var10 * 128;
            }
        }
        byte var23 = 0;
        class205.field3497 = arg6;
        class218.field3632.method1536(arg0, false, arg3, (byte) 101);
        byte var24 = 0;
        byte var25 = 104;
        byte var26 = 1;
        if (var10 < 0) {
            var23 = 103;
            var26 = -1;
            var25 = -1;
        }
        byte var27 = 1;
        byte var28 = 104;
        if (var11 < 0) {
            var24 = 103;
            var27 = -1;
            var28 = -1;
        }
        for (int var29 = var23; var29 != var25; var29 += var26) {
            for (int var30 = var24; var30 != var28; var30 += var27) {
                int var31 = var10 + var29;
                int var32 = var11 + var30;
                for (int var33 = 0; var33 < 4; var33++) {
                    if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                        class214.field3591[var33][var29][var30] = class214.field3591[var33][var31][var32];
                    } else {
                        class214.field3591[var33][var29][var30] = null;
                    }
                }
            }
        }
        for (class287 var34 = (class287) class203.field3460.method2297(14204); var34 != null; var34 = (class287) class203.field3460.method2291(84)) {
            var34.field4578 -= var10;
            var34.field4566 -= var11;
            if (var34.field4578 < 0 || var34.field4566 < 0 || var34.field4578 >= 104 || var34.field4566 >= 104) {
                var34.method2195(-1);
            }
        }
        if (class338.field5408 != 0) {
            class338.field5408 -= var10;
            class332.field5287 -= var11;
        }
        class131.field2256 = 0;
        if (arg7) {
            class81.field1325 -= var10;
            class248.field4028 -= var11;
            class32.field454 -= var11 * 128;
            class168.field2930 -= var10;
            class215.field3613 -= var11;
            class269.field4309 -= var10 * 128;
        } else {
            class191.field3194 = 1;
        }
        if (class43.field680 && arg7 && (Math.abs(var10) > 104 || Math.abs(var11) > 104)) {
            class351.method2446(73);
        }
        class68.field1123 = -1;
        class238.field3897.method2302(128);
        class178.field3018.method2302(128);
        class65.method619();
    }

    @OriginalMember(owner = "client!hi", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 873)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        field5038++;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(B)V", line = 881)
    private final synchronized void method2192(byte arg0) {
        field5057++;
        int var2 = 120 / ((arg0 - 21) / 50);
        if (this.field5058 != null) {
            this.field5058.setPixels(0, 0, this.field2994, this.field2992, this.field5047, this.field2990, 0, this.field2994);
            this.field5058.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V", line = 902)
    public final void method959(Graphics arg0, int arg1, int arg2, byte arg3) {
        field5049++;
        if (arg3 > 56) {
            this.method2192((byte) 84);
            arg0.drawImage(this.field2986, arg2, arg1, this);
        }
    }
}

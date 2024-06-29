import java.awt.Component;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class134 {

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    private int field3273 = 32;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "J")
    private long field3271 = class60.method535(2);

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
    private int field3291 = 0;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "J")
    private long field3284 = 0L;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
    private int field3290 = 0;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "J")
    private long field3292 = 0L;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
    private int field3293 = 0;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "Z")
    private boolean field3288 = true;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "[Lre;")
    private class120[] field3289 = new class120[8];

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "[Lre;")
    private class120[] field3294 = new class120[8];

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
    private int field3295 = 0;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "Lod;")
    public static class101 field3276 = new class101(5000);

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "Loc;")
    private static class99 field3296 = class48.method402((byte) -104, "purple:");

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "Loc;")
    public static class99 field3298 = class48.method402((byte) -104, " @whi@(X");

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "Loc;")
    public static class99 field3302 = class48.method402((byte) -104, "mapmarker");

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "Loc;")
    public static class99 field3297 = class48.method402((byte) -104, "oder ung-Ultiges Passwort)3");

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "Loc;")
    public static class99 field3299 = field3296;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
    public static int field3304 = 10;

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "Loc;")
    public static class99 field3303 = field3296;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "Loc;")
    public static class99 field3300 = class48.method402((byte) -104, "Benutzen Sie bitte eine andere Welt)3");

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "[I")
    public static int[] field3301 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
    private int field3285;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    public int field3286;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
    public int field3287;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "Lre;")
    private class120 field3266;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "[I")
    public int[] field3265;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "()V")
    public void method549() {
        field3281++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public final synchronized void method1085(int arg0) {
        field3275++;
        if (class67.field1730 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class67.field1730.field1787[var3] == this) {
                    class67.field1730.field1787[var3] = null;
                }
                if (class67.field1730.field1787[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class67.field1730.field1776 = true;
                while (class67.field1730.field1779) {
                    class57.method509(-128, 50L);
                }
                class67.field1730 = null;
            }
        }
        this.method549();
        if (arg0 >= 24) {
            this.field3265 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)I")
    public static final int method1086(int arg0, int arg1, int arg2) {
        if (arg2 < arg0) {
            int var3 = arg2;
            arg2 = arg0;
            arg0 = var3;
        }
        field3283++;
        int var4 = -75 / ((arg1 - 30) / 35);
        while (arg0 != 0) {
            int var5 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var5;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
    public final synchronized void method1087(boolean arg0) {
        field3282++;
        this.field3288 = arg0;
        try {
            this.method550();
        } catch (Exception var2) {
            this.method549();
            this.field3284 = class60.method535(2) + 2000L;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
    public void method545(int arg0) throws Exception {
        field3269++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BII)I")
    public static final int method1088(byte arg0, int arg1, int arg2) {
        field3274++;
        int var3 = 11 % ((arg0 + 87) / 36);
        class36 var4 = (class36) class14.field327.method1001((long) arg2, (byte) -126);
        if (var4 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var4.field923.length) {
            return var4.field923[arg1];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)V")
    private final void method1089(int arg0, int arg1) {
        field3263++;
        this.field3290 -= arg1;
        if (this.field3290 < arg0) {
            this.field3290 = 0;
        }
        if (this.field3266 != null) {
            this.field3266.method105(arg1);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "()V")
    public void method550() throws Exception {
        field3262++;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
    private final void method1090(int arg0) {
        field3277++;
        this.field3288 = true;
        if (arg0 != 25524) {
            method1086(-12, 81, 94);
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "()V")
    public void method547() throws Exception {
        field3278++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILre;)V")
    private final void method1091(int arg0, int arg1, class120 arg2) {
        field3264++;
        int var4 = arg1 >> 5;
        class120 var5 = this.field3289[var4];
        if (var5 == null) {
            this.field3294[var4] = arg2;
        } else {
            var5.field2940 = arg2;
        }
        int var6 = -114 / ((70 - arg0) / 44);
        this.field3289[var4] = arg2;
        arg2.field2941 = arg1;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lre;I)V")
    public final synchronized void method1092(class120 arg0, int arg1) {
        field3267++;
        if (arg1 == 0) {
            this.field3266 = arg0;
        }
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
    public final synchronized void method1093(int arg0) {
        int var2 = 62 % ((arg0 + 57) / 62);
        field3280++;
        if (this.field3265 == null) {
            return;
        }
        long var3 = class60.method535(2);
        try {
            if (this.field3284 != 0L) {
                if (this.field3284 > var3) {
                    return;
                }
                this.method545(this.field3286);
                this.field3284 = 0L;
                this.field3288 = true;
            }
            int var5 = this.method546();
            if (this.field3293 - var5 > this.field3291) {
                this.field3291 = this.field3293 - var5;
            }
            int var6 = this.field3287 + this.field3285;
            if (var6 + 256 > 16384) {
                var6 = 16128;
            }
            if (var6 + 256 > this.field3286) {
                var5 = 0;
                this.field3286 += 1024;
                if (this.field3286 > 16384) {
                    this.field3286 = 16384;
                }
                this.method549();
                this.method545(this.field3286);
                this.field3288 = true;
                if (this.field3286 < var6 + 256) {
                    var6 = this.field3286 - 256;
                    this.field3285 = var6 - this.field3287;
                }
            }
            while (var5 < var6) {
                var5 += 256;
                this.method1095(this.field3265, 256);
                this.method547();
            }
            if (var3 > this.field3292) {
                if (this.field3288) {
                    this.field3288 = false;
                } else if (this.field3291 == 0 && this.field3295 == 0) {
                    this.method549();
                    this.field3284 = var3 + 2000L;
                    return;
                } else {
                    this.field3285 = Math.min(this.field3295, this.field3291);
                    this.field3295 = this.field3291;
                }
                this.field3291 = 0;
                this.field3292 = var3 + 2000L;
            }
            this.field3293 = var5;
        } catch (Exception var8) {
            this.method549();
            this.field3284 = var3 + 2000L;
        }
        try {
            if (this.field3271 + 500000L < var3) {
                var3 = this.field3271;
            }
            while (var3 > this.field3271 + 5000L) {
                this.method1089(0, 256);
                this.field3271 += 256000 / class33.field792;
            }
        } catch (Exception var7) {
            this.field3271 = var3;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method551(Component arg0) throws Exception {
        field3272++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
    public static final void method1094(byte arg0) {
        field3279++;
        try {
            if (class12.field265 == 0) {
                if (class104.field2536 != null) {
                    class104.field2536.method1215(false);
                    class104.field2536 = null;
                }
                class47.field1149 = null;
                class3.field54 = false;
                class12.field265 = 1;
                class18.field481 = 0;
            }
            if (class12.field265 == 1) {
                if (class47.field1149 == null) {
                    class47.field1149 = class43.field1058.method415(class30.field720, class122.field2968, 8);
                }
                if (class47.field1149.field688 == 2) {
                    throw new IOException();
                }
                if (class47.field1149.field688 == 1) {
                    class104.field2536 = new class150((Socket) class47.field1149.field685, class43.field1058);
                    class47.field1149 = null;
                    class12.field265 = 2;
                }
            }
            if (class12.field265 == 2) {
                long var1 = class110.field2720 = class109.field2709.method834(-97);
                field3276.field1477 = 0;
                field3276.method514((byte) 73, 14);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                field3276.method514((byte) 73, var3);
                class104.field2536.method1214(0, true, field3276.field1469, 2);
                class39.field965.field1477 = 0;
                class12.field265 = 3;
            }
            if (class12.field265 == 3) {
                if (class114.field2853 != null) {
                    class114.field2853.method1090(arg0 + 25526);
                }
                if (class47.field1142 != null) {
                    class47.field1142.method1090(25524);
                }
                int var4 = class104.field2536.method1211((byte) -64);
                if (class114.field2853 != null) {
                    class114.field2853.method1090(25524);
                }
                if (class47.field1142 != null) {
                    class47.field1142.method1090(25524);
                }
                if (var4 != 0) {
                    class53.method438(false, var4);
                    return;
                }
                class39.field965.field1477 = 0;
                class12.field265 = 4;
            }
            if (class12.field265 == 4) {
                if (class39.field965.field1477 < 8) {
                    int var5 = class104.field2536.method1216(arg0 - 12318);
                    if (8 - class39.field965.field1477 < var5) {
                        var5 = 8 - class39.field965.field1477;
                    }
                    if (var5 > 0) {
                        class104.field2536.method1218(class39.field965.field1477, class39.field965.field1469, -12219, var5);
                        class39.field965.field1477 += var5;
                    }
                }
                if (class39.field965.field1477 == 8) {
                    class39.field965.field1477 = 0;
                    class12.field283 = class39.field965.method466(-2066);
                    class12.field265 = 5;
                }
            }
            if (class12.field265 == 5) {
                field3276.field1477 = 0;
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class12.field283 >> 32), (int) class12.field283 };
                field3276.method514((byte) 73, 10);
                field3276.method507(25135, var6[0]);
                field3276.method507(arg0 + 25137, var6[1]);
                field3276.method507(25135, var6[2]);
                field3276.method507(25135, var6[3]);
                field3276.method507(25135, class43.field1058.field1222);
                field3276.method490(true, class109.field2709.method834(arg0 - 95));
                field3276.method498(class109.field2702, 32478);
                field3276.method474(class82.field2029, 100, class126.field3054);
                class34.field808.field1477 = 0;
                if (class66.field1699 == 40) {
                    class34.field808.method514((byte) 73, 18);
                } else {
                    class34.field808.method514((byte) 73, 16);
                }
                class34.field808.method514((byte) 73, field3276.field1477 + 69);
                class34.field808.method507(25135, 453);
                class34.field808.method514((byte) 73, class27.field684 ? 1 : 0);
                class34.field808.method507(25135, class5.field114.field2586);
                class34.field808.method507(25135, class135.field3342.field2586);
                class34.field808.method507(arg0 + 25137, class94.field2298.field2586);
                class34.field808.method507(25135, class110.field2743.field2586);
                class34.field808.method507(25135, class150.field3726.field2586);
                class34.field808.method507(25135, class16.field410.field2586);
                class34.field808.method507(25135, class99.field2372.field2586);
                class34.field808.method507(arg0 ^ 0xFFFF9DD1, class49.field1198.field2586);
                class34.field808.method507(25135, class144.field3603.field2586);
                class34.field808.method507(25135, class148.field3653.field2586);
                class34.field808.method507(25135, class61.field1633.field2586);
                class34.field808.method507(25135, class138.field3451.field2586);
                class34.field808.method507(25135, class111.field2756.field2586);
                class34.field808.method507(25135, class93.field2276.field2586);
                class34.field808.method507(25135, class126.field3049.field2586);
                class34.field808.method507(25135, class136.field3401.field2586);
                class34.field808.method492(0, field3276.field1469, field3276.field1477, -128);
                class104.field2536.method1214(0, true, class34.field808.field1469, class34.field808.field1477);
                field3276.method871(-1, var6);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class39.field965.method871(-1, var6);
                class12.field265 = 6;
            }
            if (class12.field265 == 6 && class104.field2536.method1216(-12320) > 0) {
                int var8 = class104.field2536.method1211((byte) -96);
                if (var8 == 21 && class66.field1699 == 20) {
                    class12.field265 = 7;
                } else if (var8 == 2) {
                    class12.field265 = 9;
                } else if (var8 == 15 && class66.field1699 == 40) {
                    class79.method685(0);
                    return;
                } else if (var8 == 23 && class35.field894 < 1) {
                    class35.field894++;
                    class12.field265 = 0;
                } else {
                    class53.method438(false, var8);
                    return;
                }
            }
            if (class12.field265 == 7 && class104.field2536.method1216(-12320) > 0) {
                class67.field1742 = class104.field2536.method1211((byte) -54) * 60 + 180;
                class12.field265 = 8;
            }
            if (arg0 != -2) {
                method1096((byte) 0);
            }
            if (class12.field265 == 8) {
                class18.field481 = 0;
                class91.method754(class20.method189(new class99[] { class5.method31(class67.field1742 / 60, arg0 + 12), class49.field1201 }, arg0 + 10), arg0 - 75, class77.field1915, class12.field267);
                if (--class67.field1742 <= 0) {
                    class12.field265 = 0;
                }
            } else {
                if (class12.field265 == 9 && class104.field2536.method1216(arg0 - 12318) >= 8) {
                    class57.field1483 = class104.field2536.method1211((byte) -89);
                    class69.field1766 = class104.field2536.method1211((byte) -105) == 1;
                    class94.field2292 = class104.field2536.method1211((byte) -60);
                    class94.field2292 <<= 0x8;
                    class94.field2292 += class104.field2536.method1211((byte) -117);
                    class11.field254 = class104.field2536.method1211((byte) -56);
                    class104.field2536.method1218(0, class39.field965.field1469, arg0 - 12217, 1);
                    class39.field965.field1477 = 0;
                    class148.field3670 = class39.field965.method873(255);
                    class104.field2536.method1218(0, class39.field965.field1469, -12219, 2);
                    class39.field965.field1477 = 0;
                    class77.field1903 = class39.field965.method506(-1);
                    class12.field265 = 10;
                }
                if (class12.field265 != 10) {
                    class18.field481++;
                    if (class18.field481 > 2000) {
                        if (class35.field894 < 1) {
                            if (class72.field1829 == class30.field720) {
                                class30.field720 = class118.field2905;
                            } else {
                                class30.field720 = class72.field1829;
                            }
                            class35.field894++;
                            class12.field265 = 0;
                        } else {
                            class53.method438(false, -3);
                        }
                    }
                } else if (class104.field2536.method1216(-12320) >= class77.field1903) {
                    class39.field965.field1477 = 0;
                    class104.field2536.method1218(0, class39.field965.field1469, arg0 - 12217, class77.field1903);
                    class39.method322(arg0 ^ 0xFFFFFE33);
                    class54.field1294 = -1;
                    class132.method1066(false, arg0 ^ 0xFFFFFFFA);
                    class148.field3670 = -1;
                }
            }
        } catch (IOException var9) {
            if (class35.field894 < 1) {
                class12.field265 = 0;
                if (class72.field1829 == class30.field720) {
                    class30.field720 = class118.field2905;
                } else {
                    class30.field720 = class72.field1829;
                }
                class35.field894++;
            } else {
                class53.method438(false, -2);
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "()I")
    public int method546() throws Exception {
        field3270++;
        return this.field3286;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([II)V")
    private final void method1095(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class130.field3203) {
            var3 = arg1 << 1;
        }
        int var4 = 0;
        var3 -= 7;
        while (var4 < var3) {
            arg0[var4++] = 0;
            arg0[var4++] = 0;
            arg0[var4++] = 0;
            arg0[var4++] = 0;
            arg0[var4++] = 0;
            arg0[var4++] = 0;
            arg0[var4++] = 0;
            arg0[var4++] = 0;
        }
        var3 += 7;
        while (var4 < var3) {
            arg0[var4++] = 0;
        }
        this.field3290 -= arg1;
        if (this.field3266 != null && this.field3290 <= 0) {
            this.field3290 += class33.field792 >> 4;
            class121.method1008(this.field3266, (byte) 30);
            this.method1091(122, this.field3266.method648(), this.field3266);
            int var5 = 0;
            int var6 = 255;
            int var7 = 7;
            label114: while (var6 != 0) {
                int var8;
                int var9;
                if (var7 < 0) {
                    var8 = var7 & 0x3;
                    var9 = -(var7 >> 2);
                } else {
                    var8 = var7;
                    var9 = 0;
                }
                for (int var10 = var6 >>> var8 & 0x11111111; var10 != 0; var10 >>>= 0x4) {
                    if ((var10 & 0x1) != 0) {
                        var6 &= ~(0x1 << var8);
                        class120 var11 = null;
                        class120 var12 = this.field3294[var8];
                        label108: while (true) {
                            while (true) {
                                if (var12 == null) {
                                    break label108;
                                }
                                class78 var13 = var12.field2943;
                                if (var13 == null || var13.field1925 <= var9) {
                                    var12.field2942 = true;
                                    int var14 = var12.method102();
                                    var5 += var14;
                                    if (var13 != null) {
                                        var13.field1925 += var14;
                                    }
                                    if (var5 >= this.field3273) {
                                        break label114;
                                    }
                                    class120 var15 = var12.method100();
                                    if (var15 != null) {
                                        int var16 = var12.field2941;
                                        while (var15 != null) {
                                            this.method1091(114, var16 * var15.method648() >> 8, var15);
                                            var15 = var12.method106();
                                        }
                                    }
                                    class120 var17 = var12.field2940;
                                    var12.field2940 = null;
                                    if (var11 == null) {
                                        this.field3294[var8] = var17;
                                    } else {
                                        var11.field2940 = var17;
                                    }
                                    if (var17 == null) {
                                        this.field3289[var8] = var11;
                                    }
                                    var12 = var17;
                                } else {
                                    var6 |= 0x1 << var8;
                                    var11 = var12;
                                    var12 = var12.field2940;
                                }
                            }
                        }
                    }
                    var8 += 4;
                    var9++;
                }
                var7--;
            }
            for (int var18 = 0; var18 < 8; var18++) {
                class120 var19 = this.field3294[var18];
                this.field3294[var18] = this.field3289[var18] = null;
                while (var19 != null) {
                    class120 var20 = var19.field2940;
                    var19.field2940 = null;
                    var19 = var20;
                }
            }
        }
        if (this.field3290 < 0) {
            this.field3290 = 0;
        }
        if (this.field3266 != null) {
            this.field3266.method95(arg0, 0, arg1);
        }
        this.field3271 = class60.method535(2);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
    public static void method1096(byte arg0) {
        field3301 = null;
        field3299 = null;
        field3298 = null;
        field3302 = null;
        field3297 = null;
        field3296 = null;
        field3303 = null;
        int var1 = 82 % ((-arg0 - 3) / 34);
        field3276 = null;
        field3300 = null;
    }
}

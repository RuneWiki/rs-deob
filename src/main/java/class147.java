import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public abstract class class147 {

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Ljg;")
    public static class89 field3000 = new class89(8);

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "Led;")
    private static class43 field3009 = class191.method1219(" seconds)3", false);

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "Led;")
    public static class43 field3008 = field3009;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "Ljava/util/Random;")
    public static Random field3010 = new Random();

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "[Lqh;")
    public static class153[] field3011 = new class153[4];

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "[I")
    public static int[] field3012 = new int[4000];

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "[[I")
    public static int[][] field3014 = new int[][] { { 1, 1 }, { -1, 1 }, { 1, -1 }, { -1, -1 } };

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "Led;")
    public static class43 field3015 = class191.method1219("60 Sekunden noch einmal)3)3)3", false);

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public int field3002;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public int field3005;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "Ljava/awt/Image;")
    public Image field3004;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "[I")
    public int[] field3007;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
    public final void method921(byte arg0) {
        int var2 = -95 / ((arg0 - 36) / 56);
        class168.method1047(this.field3007, this.field3005, this.field3002);
        field3003++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public abstract void method279(int arg0, int arg1, Component arg2, int arg3);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public abstract void method277(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIII)V")
    public static final void method922(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3001++;
        class4.field92 = 0;
        for (int var5 = -1; var5 < class170.field3399 + class95.field1864; var5++) {
            class119 var21;
            if (var5 == -1) {
                var21 = class67.field1348;
            } else if (var5 < class170.field3399) {
                var21 = class12.field183[class125.field2472[var5]];
            } else {
                var21 = class172.field3433[class158.field3202[var5 - class170.field3399]];
            }
            if (var21 != null && var21.method4(arg2 ^ 0x4A)) {
                if (var21 instanceof class77) {
                    class59 var22 = ((class77) var21).field1539;
                    if (var22.field1209 != null) {
                        var22 = var22.method372((byte) -82);
                    }
                    if (var22 == null) {
                        continue;
                    }
                }
                if (class170.field3399 <= var5) {
                    class59 var23 = ((class77) var21).field1539;
                    if (var23.field1209 != null) {
                        var23 = var23.method372((byte) -82);
                    }
                    if (var23.field1203 >= 0 && class27.field489.length > var23.field1203) {
                        class57.method341(var21, var21.method763(arg2 ^ 0xCD) + 15, true);
                        if (class200.field3933 > -1) {
                            class27.field489[var23.field1203].method788(class200.field3933 + arg4 - 12, class19.field333 + arg3 - 30);
                        }
                    }
                    if (class7.field147 == 1 && class158.field3202[var5 - class170.field3399] == class171.field3417 && client.field559 % 20 < 10) {
                        class57.method341(var21, var21.method763(200) + 15, true);
                        if (class200.field3933 > -1) {
                            class136.field2834[0].method788(class200.field3933 + arg4 - 12, class19.field333 + arg3 - 28);
                        }
                    }
                } else {
                    int var24 = 30;
                    class1 var25 = (class1) var21;
                    if (var25.field13 != -1 || var25.field25 != -1) {
                        class57.method341(var21, var21.method763(200) + 15, true);
                        if (class200.field3933 > -1) {
                            if (var25.field13 != -1) {
                                class207.field4053[var25.field13].method788(arg4 + class200.field3933 - 12, class19.field333 + arg3 - var24);
                                var24 += 25;
                            }
                            if (var25.field25 != -1) {
                                class27.field489[var25.field25].method788(arg4 + class200.field3933 - 12, -var24 + arg3 + class19.field333);
                                var24 += 25;
                            }
                        }
                    }
                    if (var5 >= 0 && class7.field147 == 10 && class125.field2472[var5] == class164.field3279) {
                        class57.method341(var21, var21.method763(200) + 15, true);
                        if (class200.field3933 > -1) {
                            class136.field2834[1].method788(class200.field3933 + arg4 - 12, arg3 - (-class19.field333 + var24));
                        }
                    }
                }
                if (var21.field2340 != null && (class170.field3399 <= var5 || class1.field30 == 0 || class1.field30 == 3 || class1.field30 == 1 && class131.method851(((class1) var21).field23, (byte) -89))) {
                    class57.method341(var21, var21.method763(200), true);
                    if (class200.field3933 > -1 && class115.field2242 > class4.field92) {
                        class115.field2253[class4.field92] = class118.field2294.method952(var21.field2340) / 2;
                        class115.field2245[class4.field92] = class118.field2294.field3071;
                        class115.field2244[class4.field92] = class200.field3933;
                        class115.field2234[class4.field92] = class19.field333;
                        class115.field2229[class4.field92] = var21.field2367;
                        class115.field2236[class4.field92] = var21.field2319;
                        class115.field2248[class4.field92] = var21.field2353;
                        class115.field2250[class4.field92] = var21.field2340;
                        class4.field92++;
                    }
                }
                if (client.field559 < var21.field2312) {
                    class57.method341(var21, var21.method763(200) + 15, true);
                    if (class200.field3933 > -1) {
                        int var26 = var21.field2363 * 30 / var21.field2337;
                        if (var26 > 30) {
                            var26 = 30;
                        }
                        class168.method1046(arg4 + class200.field3933 - 15, class19.field333 + arg3 + -3, var26, 5, 65280);
                        class168.method1046(arg4 + class200.field3933 + var26 - 15, arg3 + -3 - -class19.field333, 30 - var26, 5, 16711680);
                    }
                }
                for (int var27 = 0; var27 < 4; var27++) {
                    if (var21.field2314[var27] > client.field559) {
                        class57.method341(var21, var21.method763(200) / 2, true);
                        if (class200.field3933 > -1) {
                            if (var27 == 1) {
                                class19.field333 -= 20;
                            }
                            if (var27 == 2) {
                                class200.field3933 -= 15;
                                class19.field333 -= 10;
                            }
                            if (var27 == 3) {
                                class19.field333 -= 10;
                                class200.field3933 += 15;
                            }
                            class173.field3445[var21.field2332[var27]].method788(arg4 + class200.field3933 - 12, class19.field333 + -12 + arg3);
                            class89.field1729.method935(class30.method161(var21.field2342[var27], arg2 + 5), class200.field3933 + arg4 - 1, class19.field333 + 3 + arg3, 16777215, 0);
                        }
                    }
                }
            }
        }
        if (arg2 != 5) {
            method922(-10, 0, -27, -71, -39);
        }
        for (int var6 = 0; var6 < class4.field92; var6++) {
            int var7 = class115.field2234[var6];
            int var8 = class115.field2244[var6];
            int var9 = class115.field2253[var6];
            int var10 = class115.field2245[var6];
            boolean var11 = true;
            while (var11) {
                var11 = false;
                for (int var20 = 0; var20 < var6; var20++) {
                    if (class115.field2234[var20] - class115.field2245[var20] < var7 + 2 && var7 - var10 < class115.field2234[var20] - -2 && class115.field2253[var20] + class115.field2244[var20] > -var9 + var8 && var8 + var9 > class115.field2244[var20] + -class115.field2253[var20] && var7 > class115.field2234[var20] - class115.field2245[var20]) {
                        var11 = true;
                        var7 = class115.field2234[var20] - class115.field2245[var20];
                    }
                }
            }
            class200.field3933 = class115.field2244[var6];
            class19.field333 = class115.field2234[var6] = var7;
            class43 var12 = class115.field2250[var6];
            if (class166.field3289 == 0) {
                int var13 = 16776960;
                if (class115.field2229[var6] < 6) {
                    var13 = class115.field2235[class115.field2229[var6]];
                }
                if (class115.field2229[var6] == 6) {
                    var13 = class115.field2256 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class115.field2229[var6] == 7) {
                    var13 = class115.field2256 % 20 < 10 ? 255 : 65535;
                }
                if (class115.field2229[var6] == 8) {
                    var13 = class115.field2256 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class115.field2229[var6] == 9) {
                    int var14 = 150 - class115.field2248[var6];
                    if (var14 < 50) {
                        var13 = var14 * 1280 + 16711680;
                    } else if (var14 < 100) {
                        var13 = 16776960 - (var14 - 50) * 327680;
                    } else if (var14 < 150) {
                        var13 = (var14 - 100) * 5 + 65280;
                    }
                }
                if (class115.field2229[var6] == 10) {
                    int var15 = 150 - class115.field2248[var6];
                    if (var15 < 50) {
                        var13 = var15 * 5 + 16711680;
                    } else if (var15 < 100) {
                        var13 = 33095935 - var15 * 327680;
                    } else if (var15 < 150) {
                        var13 = (var15 + -100) * 327680 + 255 + 500 - var15 * 5;
                    }
                }
                if (class115.field2229[var6] == 11) {
                    int var16 = 150 - class115.field2248[var6];
                    if (var16 < 50) {
                        var13 = 16777215 - var16 * 327685;
                    } else if (var16 < 100) {
                        var13 = var16 * 327685 + 65280 - 16384250;
                    } else if (var16 < 150) {
                        var13 = 16777215 - (var16 - 100) * 327680;
                    }
                }
                if (class115.field2236[var6] == 0) {
                    class118.field2294.method935(var12, class200.field3933 + arg4, class19.field333 + arg3, var13, 0);
                }
                if (class115.field2236[var6] == 1) {
                    class118.field2294.method960(var12, class200.field3933 + arg4, class19.field333 + arg3, var13, 0, class115.field2256);
                }
                if (class115.field2236[var6] == 2) {
                    class118.field2294.method931(var12, class200.field3933 + arg4, arg3 - -class19.field333, var13, 0, class115.field2256);
                }
                if (class115.field2236[var6] == 3) {
                    class118.field2294.method933(var12, class200.field3933 + arg4, class19.field333 + arg3, var13, 0, class115.field2256, 150 - class115.field2248[var6]);
                }
                if (class115.field2236[var6] == 4) {
                    int var17 = (150 - class115.field2248[var6]) * (class118.field2294.method952(var12) + 100) / 150;
                    class168.method1039(class200.field3933 + arg4 - 50, arg3, arg4 + class200.field3933 + 50, arg3 - -arg0);
                    class118.field2294.method954(var12, class200.field3933 + arg4 + 50 - var17, class19.field333 + arg3, var13, 0);
                    class168.method1044(arg4, arg3, arg1 + arg4, arg0 + arg3);
                }
                if (class115.field2236[var6] == 5) {
                    int var18 = 150 - class115.field2248[var6];
                    class168.method1039(arg4, class19.field333 + arg3 - class118.field2294.field3071 - 1, arg1 + arg4, class19.field333 + arg3 + 5);
                    int var19 = 0;
                    if (var18 < 25) {
                        var19 = var18 - 25;
                    } else if (var18 > 125) {
                        var19 = var18 - 125;
                    }
                    class118.field2294.method935(var12, class200.field3933 + arg4, arg3 - -class19.field333 + var19, var13, 0);
                    class168.method1044(arg4, arg3, arg1 + arg4, arg3 - -arg0);
                }
            } else {
                class118.field2294.method935(var12, arg4 + class200.field3933, class19.field333 + arg3, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static void method923(int arg0) {
        int var1 = -109 / ((-arg0 - 39) / 54);
        field3014 = null;
        field3012 = null;
        field3011 = null;
        field3009 = null;
        field3000 = null;
        field3010 = null;
        field3008 = null;
        field3015 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BLed;)I")
    public static final int method924(byte arg0, class43 arg1) {
        field3006++;
        if (class40.field776 == 1) {
            return 7;
        } else if (arg1.method240(-1, class86.field1681)) {
            return 1;
        } else if (arg1.method240(arg0 + 66, class117.field2283)) {
            return 1;
        } else if (arg1.method240(-1, class48.field971)) {
            return 2;
        } else if (arg1.method240(arg0 + 66, class139.field2876)) {
            return 2;
        } else if (arg1.method240(-1, class159.field3222)) {
            return 3;
        } else if (arg1.method240(-1, class4.field98)) {
            return 4;
        } else if (arg1.method240(-1, client.field558)) {
            return 4;
        } else if (arg1.method240(-1, class17.field286)) {
            return 5;
        } else {
            if (arg0 != -67) {
                field3015 = null;
            }
            return arg1.method240(-1, class7.field135) ? 6 : 0;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public abstract void method278(Graphics arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
    protected class147() {
    }
}

import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class191 implements class259 {

    @OriginalMember(owner = "client!e", name = "hb", descriptor = "Z")
    private boolean field3403 = true;

    @OriginalMember(owner = "client!e", name = "cb", descriptor = "[I")
    public static int[] field3398 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!e", name = "bb", descriptor = "Lef;")
    public static class175 field3397 = new class175();

    @OriginalMember(owner = "client!e", name = "ob", descriptor = "Le;")
    public static class191 field3410 = class54.method368("cookieprefix", 2047);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!e", name = "B", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!e", name = "F", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!e", name = "G", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!e", name = "H", descriptor = "I")
    private int field3377;

    @OriginalMember(owner = "client!e", name = "I", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "I")
    public int field3379;

    @OriginalMember(owner = "client!e", name = "K", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!e", name = "L", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!e", name = "M", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!e", name = "N", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!e", name = "O", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!e", name = "P", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!e", name = "R", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!e", name = "S", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!e", name = "T", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!e", name = "U", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!e", name = "V", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!e", name = "X", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!e", name = "ab", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!e", name = "db", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!e", name = "eb", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!e", name = "fb", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!e", name = "gb", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!e", name = "ib", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!e", name = "jb", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!e", name = "kb", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!e", name = "lb", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!e", name = "pb", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!e", name = "nb", descriptor = "Lng;")
    public static class121 field3409;

    @OriginalMember(owner = "client!e", name = "mb", descriptor = "Lwa;")
    public static class226 field3408;

    // $FF: synthetic field
    @OriginalMember(owner = "client!e", name = "qb", descriptor = "Ljava/lang/Class;")
    public static Class field3412;

    @OriginalMember(owner = "client!e", name = "W", descriptor = "[B")
    public byte[] field3392;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)I")
    public final int method1304(int arg0) {
        if (arg0 != 63) {
            this.method1344((byte) -81, -9);
        }
        field3393++;
        return this.field3379;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)I")
    public final int method1305(int arg0, int arg1, int arg2) {
        field3383++;
        byte var4 = (byte) arg0;
        for (int var5 = arg2; var5 < this.field3379; var5++) {
            if (this.field3392[var5] == var4) {
                return var5;
            }
        }
        int var6 = -81 / ((arg1 - 3) / 47);
        return -1;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method1306(int arg0, int arg1, Graphics arg2, int arg3) {
        field3345++;
        String var5;
        try {
            var5 = new String(this.field3392, arg0, this.field3379, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field3392, 0, this.field3379);
        }
        arg2.drawString(var5, arg1, arg3);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)Le;")
    public final class191 method1307(byte arg0) {
        field3374++;
        if (!this.field3403) {
            throw new IllegalArgumentException();
        } else if (arg0 <= 70) {
            return null;
        } else {
            this.field3377 = 0;
            if (this.field3392.length != this.field3379) {
                byte[] var2 = new byte[this.field3379];
                class58.method390(this.field3392, 0, var2, 0, this.field3379);
                this.field3392 = var2;
            }
            return this;
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)[B")
    public final byte[] method1308(int arg0) {
        field3357++;
        byte[] var2 = new byte[this.field3379];
        class58.method390(this.field3392, 0, var2, 0, this.field3379);
        if (arg0 <= 22) {
            this.method1335((class191) null, false);
        }
        return var2;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILji;)V")
    public static final void method1309(int arg0, class225 arg1) {
        field3387++;
        while (true) {
            while (arg1.field3996 < arg1.field3995.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1580(arg0 ^ 0xA23C4285) == 1) {
                    var4 = arg1.method1580(-22);
                    var3 = arg1.method1580(arg0 ^ 0xA23C42BA);
                    var2 = true;
                }
                int var5 = arg1.method1580(-11);
                int var6 = arg1.method1580(arg0 - 1573109122);
                int var7 = var5 * 64 - class54.field1009;
                int var8 = class76.field1319 + class161.field2728 - (var6 * 64) - 1;
                if (var7 >= 0 && (var8 - 63) >= 0 && class189.field3327 > (var7 + 63) && class161.field2728 > var8) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var4 * 8 && var4 * 8 + 8 > var11 && var12 >= (var3 * 8) && var3 * 8 + 8 > var12) {
                                byte var13 = arg1.method1575(false);
                                if (var13 != 0) {
                                    if (class81.field1362[var10][var9] == null) {
                                        class81.field1362[var10][var9] = new byte[4096];
                                    }
                                    class81.field1362[var10][var9][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method1575(false);
                                    if (class145.field2443[var10][var9] == null) {
                                        class145.field2443[var10][var9] = new byte[4096];
                                    }
                                    class145.field2443[var10][var9][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method1575(false);
                        if (var16 != 0) {
                            arg1.field3996++;
                        }
                    }
                }
            }
            if (arg0 != 1573109094) {
                method1311(-52, 15);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILjava/applet/Applet;)Le;")
    public final class191 method1310(int arg0, Applet arg1) {
        String var3 = new String(this.field3392, 0, this.field3379);
        field3375++;
        String var4 = arg1.getParameter(var3);
        if (var4 == null) {
            return null;
        } else {
            if (arg0 <= 72) {
                this.field3392 = null;
            }
            return class41.method273(var4, (byte) 121);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)Lvg;")
    public static final class20 method1311(int arg0, int arg1) {
        field3400++;
        if (arg0 != -2488) {
            field3409 = null;
        }
        class20 var2 = (class20) class269.field4743.method991((long) arg1, -25858);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class46.field814.method826((byte) 35, 4, arg1);
        class20 var4 = new class20();
        if (var3 != null) {
            var4.method151(new class225(var3), arg1, (byte) 127);
        }
        class269.field4743.method987(var4, (long) arg1, -2438);
        return var4;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)[B")
    public final byte[] method1312(int arg0) {
        field3390++;
        if (this.field3379 == 0) {
            return new byte[0];
        }
        int var2 = this.field3379 + 3 & 0xFFFFFFFC;
        int var3 = var2 / 4 * 3;
        if (var2 - 2 >= this.field3379 || class66.method434((byte) 81, this.field3392[var2 - 2]) == -1) {
            var3 -= 2;
        } else if (this.field3379 <= (var2 - 1) || class66.method434((byte) 85, this.field3392[var2 - 1]) == -1) {
            var3--;
        }
        byte[] var4 = new byte[var3];
        this.method1331(var4, 3, 0);
        if (arg0 >= -14) {
            this.method1358(7);
        }
        return var4;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(II)I")
    public final int method1313(int arg0, int arg1) {
        byte var3 = (byte) arg0;
        field3356++;
        int var4 = 0;
        if (arg1 != 102) {
            return 114;
        }
        for (int var5 = 0; var5 < this.field3379; var5++) {
            if (this.field3392[var5] == var3) {
                var4++;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILe;I)I")
    public final int method1314(int arg0, class191 arg1, int arg2) {
        field3364++;
        int[] var4 = new int[arg1.field3379];
        int[] var5 = new int[256];
        int[] var6 = new int[arg1.field3379];
        for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = arg1.field3379;
        }
        for (int var8 = arg0; var8 <= arg1.field3379; var8++) {
            var4[var8 - 1] = (arg1.field3379 << 1) - var8;
            var5[class167.method1128(arg1.field3392[var8 - 1], 255)] = arg1.field3379 - var8;
        }
        int var9 = arg1.field3379 + 1;
        for (int var10 = arg1.field3379; var10 > 0; var10--) {
            var6[var10 - 1] = var9;
            while (arg1.field3379 >= var9 && arg1.field3392[var9 - 1] != arg1.field3392[var10 - 1]) {
                if (var4[var9 - 1] >= (arg1.field3379 - var10)) {
                    var4[var9 - 1] = arg1.field3379 - var10;
                }
                var9 = var6[var9 - 1];
            }
            var9--;
        }
        int var11 = var9;
        int var12 = arg1.field3379 + 1 - var9;
        int var13 = 1;
        int var14 = 0;
        for (int var15 = 1; var15 <= var12; var15++) {
            var6[var15 - 1] = var14;
            while (var14 >= 1 && arg1.field3392[var14 - 1] != arg1.field3392[var15 - 1]) {
                var14 = var6[var14 - 1];
            }
            var14++;
        }
        while (var11 < arg1.field3379) {
            for (int var18 = var13; var18 <= var11; var18++) {
                if ((arg1.field3379 + var11 - var18) <= var4[var18 - 1]) {
                    var4[var18 - 1] = arg1.field3379 + var11 - var18;
                }
            }
            var13 = var11 + 1;
            var11 = var11 + var12 - var6[var12 - 1];
            var12 = var6[var12 - 1];
        }
        int var17;
        for (int var16 = arg1.field3379 + arg2 - 1; var16 < this.field3379; var16 += Math.max(var5[this.field3392[var16] & 0xFF], var4[var17])) {
            for (var17 = arg1.field3379 - 1; var17 >= 0 && this.field3392[var16] == arg1.field3392[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)Le;")
    public final class191 method1315(int arg0, byte arg1) {
        int var3 = 125 / ((arg1 + 29) / 56);
        field3386++;
        return this.method1330(arg0, 55, this.field3379);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZLjb;)V")
    public static final void method1316(boolean arg0, class176 arg1) {
        field3365++;
        arg1.field2978 = arg0;
        if (arg1.field2977 != -1) {
            class248 var2 = class67.method445((byte) -61, arg1.field2977);
            if (var2 == null || var2.field4419 == null) {
                arg1.field2977 = -1;
            } else {
                arg1.field2986++;
                if (var2.field4419.length > arg1.field2976 && var2.field4406[arg1.field2976] < arg1.field2986) {
                    arg1.field2976++;
                    arg1.field2986 = 1;
                    class252.method1750((byte) -8, arg1.field3003, arg1.field2972, var2, class175.field2946 == arg1, arg1.field2976);
                }
                if (arg1.field2976 >= var2.field4419.length) {
                    arg1.field2986 = 0;
                    arg1.field2976 = 0;
                    class252.method1750((byte) -8, arg1.field3003, arg1.field2972, var2, class175.field2946 == arg1, arg1.field2976);
                }
            }
        }
        if (arg1.field3009 != -1 && class135.field2267 >= arg1.field3013) {
            int var3 = class47.method323(-4453, arg1.field3009).field170;
            if (var3 == -1) {
                arg1.field3009 = -1;
            } else {
                class248 var4 = class67.method445((byte) -61, var3);
                if (var4 == null || var4.field4419 == null) {
                    arg1.field3009 = -1;
                } else {
                    if (arg1.field2959 < 0) {
                        arg1.field2959 = 0;
                        class252.method1750((byte) -8, arg1.field3003, arg1.field2972, var4, class175.field2946 == arg1, 0);
                    }
                    arg1.field3000++;
                    if (arg1.field2959 < var4.field4419.length && arg1.field3000 > var4.field4406[arg1.field2959]) {
                        arg1.field3000 = 1;
                        arg1.field2959++;
                        class252.method1750((byte) -8, arg1.field3003, arg1.field2972, var4, class175.field2946 == arg1, arg1.field2959);
                    }
                    if (arg1.field2959 >= var4.field4419.length) {
                        arg1.field3009 = -1;
                    }
                }
            }
        }
        if (arg1.field3019 != -1 && arg1.field3016 <= 1) {
            class248 var5 = class67.method445((byte) -61, arg1.field3019);
            if (var5.field4396 == 1 && arg1.field3010 > 0 && arg1.field2984 <= class135.field2267 && class135.field2267 > arg1.field2962) {
                arg1.field3016 = 1;
                return;
            }
        }
        if (arg1.field3019 != -1 && arg1.field3016 == 0) {
            class248 var6 = class67.method445((byte) -61, arg1.field3019);
            if (var6 == null || var6.field4419 == null) {
                arg1.field3019 = -1;
            } else {
                arg1.field3020++;
                if (var6.field4419.length > arg1.field2958 && var6.field4406[arg1.field2958] < arg1.field3020) {
                    arg1.field3020 = 1;
                    arg1.field2958++;
                    class252.method1750((byte) -8, arg1.field3003, arg1.field2972, var6, class175.field2946 == arg1, arg1.field2958);
                }
                if (var6.field4419.length <= arg1.field2958) {
                    arg1.field2957++;
                    arg1.field2958 -= var6.field4402;
                    if (arg1.field2957 >= var6.field4404) {
                        arg1.field3019 = -1;
                    } else if (arg1.field2958 >= 0 && var6.field4419.length > arg1.field2958) {
                        class252.method1750((byte) -8, arg1.field3003, arg1.field2972, var6, class175.field2946 == arg1, arg1.field2958);
                    } else {
                        arg1.field3019 = -1;
                    }
                }
                arg1.field2978 = var6.field4389;
            }
        }
        if (arg1.field3016 > 0) {
            arg1.field3016--;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILe;)Z")
    public final boolean method1317(int arg0, class191 arg1) {
        field3380++;
        if (arg1 == null) {
            return false;
        } else if (this.field3379 == arg1.field3379) {
            if (!this.field3403 || !arg1.field3403) {
                if (this.field3377 == 0) {
                    this.field3377 = this.method1347(arg0 ^ 0xFFFF94F0);
                    if (this.field3377 == 0) {
                        this.field3377 = 1;
                    }
                }
                if (arg1.field3377 == 0) {
                    arg1.field3377 = arg1.method1347(120);
                    if (arg1.field3377 == 0) {
                        arg1.field3377 = 1;
                    }
                }
                if (this.field3377 != arg1.field3377) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field3379; var3++) {
                if (this.field3392[var3] != arg1.field3392[var3]) {
                    return false;
                }
            }
            return arg0 == -27518;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Le;I)Z")
    public final boolean method1318(class191 arg0, int arg1) {
        field3404++;
        if (this.field3379 < arg0.field3379) {
            return false;
        }
        if (arg1 != 15056) {
            this.method1344((byte) 117, -63);
        }
        for (int var3 = 0; var3 < arg0.field3379; var3++) {
            if (this.field3392[var3] != arg0.field3392[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(II)I")
    public final int method1319(int arg0, int arg1) {
        if (arg1 != 10209) {
            field3398 = null;
        }
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        field3367++;
        boolean var3 = false;
        int var4 = 0;
        boolean var5 = false;
        for (int var6 = 0; var6 < this.field3379; var6++) {
            int var7 = this.field3392[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var3 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                throw new NumberFormatException();
            }
            if (arg0 <= var7) {
                throw new NumberFormatException();
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg0 * var4 + var7;
            if (var8 / arg0 != var4) {
                throw new NumberFormatException();
            }
            var4 = var8;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var4;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III[BI)I")
    public final int method1320(int arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        field3395++;
        class58.method390(this.field3392, arg1, arg3, arg4, arg0 - arg1);
        if (arg2 != 0) {
            this.method1325((byte) -98);
        }
        return arg0 - arg1;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZLe;Le;)Le;")
    public final class191 method1321(boolean arg0, class191 arg1, class191 arg2) {
        field3366++;
        if (arg0) {
            return null;
        }
        int var4 = 0;
        int var5 = arg1.field3379 - arg2.field3379;
        int var6 = this.field3379;
        while (true) {
            int var7 = this.method1314(1, arg2, var4);
            if (var7 < 0) {
                int var8 = 0;
                class191 var9 = class167.method1123(-4636, var6);
                while (true) {
                    int var10 = this.method1314(1, arg2, var8);
                    if (var10 < 0) {
                        while (this.field3379 > var8) {
                            var9.method1353((byte) 72, this.field3392[var8++] & 0xFF);
                        }
                        return var9;
                    }
                    while (var10 > var8) {
                        var9.method1353((byte) 72, this.field3392[var8++] & 0xFF);
                    }
                    var9.method1326((byte) -9, arg1);
                    var8 += arg2.field3379;
                }
            }
            var6 += var5;
            var4 = arg2.field3379 + var7;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Le;IBI)Le;")
    public final class191 method1322(class191 arg0, int arg1, byte arg2, int arg3) {
        int var5 = -3 / ((arg2 + 50) / 49);
        field3358++;
        if (!this.field3403) {
            throw new IllegalArgumentException();
        } else if (arg3 >= 0 && arg1 >= arg3 && arg0.field3379 >= arg1) {
            this.field3377 = 0;
            if (this.field3392.length < this.field3379 + arg1 - arg3) {
                int var6;
                for (var6 = 1; var6 < (this.field3379 + arg0.field3379); var6 += var6) {
                }
                byte[] var7 = new byte[var6];
                class58.method390(this.field3392, 0, var7, 0, this.field3379);
                this.field3392 = var7;
            }
            class58.method390(arg0.field3392, arg3, this.field3392, this.field3379, arg1 - arg3);
            this.field3379 += arg1 - arg3;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIII)V")
    public static final void method1323(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class241.field4297[0].method404(arg2, arg4);
        field3385++;
        int var6 = (arg5 - 32) * arg5 / arg3;
        class241.field4297[1].method404(arg2, arg4 + arg5 - 16);
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg5 - var6 - 32) * arg0 / (arg3 - arg5);
        if (arg1 != 10) {
            return;
        }
        class7.method55(arg2, arg4 + 16, 16, arg5 - 32, class220.field3857);
        class7.method55(arg2, arg4 + var7 + 16, 16, var6, class122.field2019);
        class7.method51(arg2, arg4 + var7 + 16, var6, class268.field4733);
        class7.method51(arg2 + 1, arg4 - -var7 + 16, var6, class268.field4733);
        class7.method41(arg2, arg4 + var7 + 16, 16, class268.field4733);
        class7.method41(arg2, var7 + arg4 + 17, 16, class268.field4733);
        class7.method51(arg2 + 15, arg4 + 16 + var7, var6, class154.field2634);
        class7.method51(arg2 + 14, arg4 + 17 + var7, var6 - 1, class154.field2634);
        class7.method41(arg2, arg4 + var7 + var6 + 15, 16, class154.field2634);
        class7.method41(arg2 + 1, arg4 + 14 - -var7 - -var6, 15, class154.field2634);
    }

    @OriginalMember(owner = "client!e", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field3401++;
        return this.method1347(121);
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(I)Le;")
    public final class191 method1324(int arg0) {
        field3391++;
        class191 var2 = new class191();
        var2.field3379 = this.field3379;
        var2.field3392 = new byte[this.field3379];
        for (int var3 = arg0; var3 < this.field3379; var3++) {
            byte var4 = this.field3392[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field3392[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V")
    public final void method1325(byte arg0) {
        field3370++;
        if (arg0 > -32) {
            this.method1344((byte) -56, -41);
        }
        String var2;
        try {
            var2 = new String(this.field3392, 0, this.field3379, "ISO-8859-1");
        } catch (UnsupportedEncodingException var3) {
            var2 = new String(this.field3392, 0, this.field3379);
        }
        System.out.println(var2);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BLe;)Le;")
    public final class191 method1326(byte arg0, class191 arg1) {
        field3347++;
        if (arg0 != -9) {
            this.field3377 = -106;
        }
        if (!this.field3403) {
            throw new IllegalArgumentException();
        }
        this.field3377 = 0;
        if (this.field3392.length < this.field3379 + arg1.field3379) {
            int var3;
            for (var3 = 1; var3 < (this.field3379 + arg1.field3379); var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class58.method390(this.field3392, 0, var4, 0, this.field3379);
            this.field3392 = var4;
        }
        class58.method390(arg1.field3392, 0, this.field3392, this.field3379, arg1.field3379);
        this.field3379 += arg1.field3379;
        return this;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(B)Le;")
    public final class191 method1327(byte arg0) {
        field3381++;
        if (arg0 == 40) {
            class191 var2 = class33.method225(this.method1352(65), false);
            return var2 == null ? class138.field2322 : var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(I)Ljava/net/URL;")
    public final URL method1328(int arg0) throws MalformedURLException {
        if (arg0 == -7598) {
            field3363++;
            return new URL(new String(this.field3392, 0, this.field3379));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(B)J")
    public final long method1329(byte arg0) {
        field3406++;
        long var2 = 0L;
        if (arg0 == 118) {
            for (int var4 = 0; var4 < this.field3379; var4++) {
                var2 = (var2 << 5) + (long) (this.field3392[var4] & 0xFF) - var2;
            }
            return var2;
        } else {
            return -80L;
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(III)Le;")
    public final class191 method1330(int arg0, int arg1, int arg2) {
        class191 var4 = new class191();
        int var5 = -55 / ((-arg1 - 20) / 46);
        field3384++;
        var4.field3379 = arg2 - arg0;
        var4.field3392 = new byte[arg2 - arg0];
        class58.method390(this.field3392, arg0, var4.field3392, 0, var4.field3379);
        return var4;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([BII)I")
    private final int method1331(byte[] arg0, int arg1, int arg2) {
        if (arg1 != 3) {
            field3409 = null;
        }
        field3362++;
        int var4 = arg2;
        for (int var5 = 0; var5 < this.field3379; var5 += 4) {
            int var6 = class66.method434((byte) 98, this.field3392[var5]);
            int var7 = var5 + 1 >= this.field3379 ? -1 : class66.method434((byte) 121, this.field3392[var5 + 1]);
            int var8 = this.field3379 <= var5 + 2 ? -1 : class66.method434((byte) 81, this.field3392[var5 + 2]);
            int var9 = this.field3379 > (var5 + 3) ? class66.method434((byte) 92, this.field3392[var5 + 3]) : -1;
            arg0[arg2++] = (byte) class217.method1476(var6 << 2, var7 >>> 4);
            if (var8 == -1) {
                break;
            }
            arg0[arg2++] = (byte) class217.method1476(class167.method1128(15, var7) << 4, var8 >>> 2);
            if (var9 == -1) {
                break;
            }
            arg0[arg2++] = (byte) class217.method1476(class167.method1128(var8, 3) << 6, var9);
        }
        return arg2 - var4;
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(II)Z")
    private final boolean method1332(int arg0, int arg1) {
        boolean var3 = false;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        if (arg0 != 47) {
            return false;
        }
        boolean var4 = false;
        int var5 = 0;
        field3360++;
        for (int var6 = 0; var6 < this.field3379; var6++) {
            int var7 = this.field3392[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var3 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                return false;
            }
            if (arg1 <= var7) {
                return false;
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
                return false;
            }
            var4 = true;
            var5 = var8;
        }
        return var4;
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(B)Le;")
    public final class191 method1333(byte arg0) {
        field3353++;
        class191 var2 = new class191();
        var2.field3379 = this.field3379;
        var2.field3392 = new byte[var2.field3379];
        for (int var3 = 0; var3 < this.field3379; var3++) {
            var2.field3392[this.field3379 - var3 - 1] = this.field3392[var3];
        }
        if (arg0 != 32) {
            this.method1340((byte) 102, (FontMetrics) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/applet/Applet;Z)V")
    public final void method1334(Applet arg0, boolean arg1) throws Throwable {
        String var3 = new String(this.field3392, 0, this.field3379);
        field3369++;
        if (arg1) {
            this.field3392 = null;
        }
        class120.method793(-24992, var3, arg0);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Le;Z)Z")
    public final boolean method1335(class191 arg0, boolean arg1) {
        if (!arg1) {
            this.field3403 = true;
        }
        field3402++;
        if (arg0.field3379 > this.field3379) {
            return false;
        }
        int var3 = this.field3379 - arg0.field3379;
        for (int var4 = 0; var4 < arg0.field3379; var4++) {
            if (this.field3392[var3 + var4] != arg0.field3392[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "(I)V")
    public static void method1336(int arg0) {
        field3397 = null;
        field3398 = null;
        field3410 = null;
        field3408 = null;
        if (arg0 >= -72) {
            method1316(true, (class176) null);
        }
        field3409 = null;
    }

    @OriginalMember(owner = "client!e", name = "g", descriptor = "(I)Z")
    public final boolean method1337(int arg0) {
        field3376++;
        return arg0 == 0 ? this.method1332(arg0 + 47, 10) : true;
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(II)I")
    public final int method1338(int arg0, int arg1) {
        field3378++;
        return arg1 == 1476 ? this.method1305(arg0, arg1 ^ 0xFFFFFA10, 0) : 38;
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "(B)Le;")
    public final class191 method1339(byte arg0) {
        field3389++;
        byte var2 = 2;
        class191 var3 = new class191();
        if (arg0 != -59) {
            this.method1350((class191) null, 44);
        }
        var3.field3379 = this.field3379;
        var3.field3392 = new byte[this.field3379];
        for (int var4 = 0; var4 < this.field3379; var4++) {
            byte var5 = this.field3392[var4];
            if (!(var5 < 97 || var5 > 122) || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var2 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var2 = 0;
            } else if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                if (var2 == 0) {
                    var5 = (byte) (var5 + 32);
                }
                var2 = 0;
            } else if (var5 == 46 || var5 == 33 || var5 == 63) {
                var2 = 2;
            } else if (var5 != 32) {
                var2 = 1;
            } else if (var2 != 2) {
                var2 = 1;
            }
            var3.field3392[var4] = var5;
        }
        return var3;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BLjava/awt/FontMetrics;)I")
    public final int method1340(byte arg0, FontMetrics arg1) {
        String var3;
        try {
            var3 = new String(this.field3392, 0, this.field3379, "ISO-8859-1");
            int var4 = -44 % ((arg0 + 57) / 44);
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field3392, 0, this.field3379);
        }
        field3372++;
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IZ)Le;")
    public final class191 method1341(int arg0, boolean arg1) {
        field3361++;
        if (arg1) {
            this.method1349(-23);
        }
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class191 var3 = new class191();
        var3.field3392 = new byte[this.field3379 + 1];
        var3.field3379 = this.field3379 + 1;
        class58.method390(this.field3392, 0, var3.field3392, 0, this.field3379);
        var3.field3392[this.field3379] = (byte) arg0;
        return var3;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(ILe;)Z")
    public final boolean method1342(int arg0, class191 arg1) {
        field3355++;
        if (this.field3379 < arg1.field3379) {
            return false;
        }
        if (arg0 != 90) {
            method1323(12, -73, 89, -93, -44, -34);
        }
        for (int var3 = 0; var3 < arg1.field3379; var3++) {
            byte var4 = this.field3392[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            byte var5 = arg1.field3392[var3];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 != var5) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(ILe;)I")
    public final int method1343(int arg0, class191 arg1) {
        int var3 = 0;
        field3405++;
        int var4 = this.field3379;
        int var5 = 0;
        int var6 = arg1.field3379;
        int var7 = this.field3379;
        int var8 = arg1.field3379;
        int var9 = 0;
        if (arg0 <= 95) {
            field3408 = null;
        }
        int var10 = 0;
        while (var4 != 0 && var6 != 0) {
            if (var3 == 156 || var3 == 230) {
                var3 = 101;
            } else if (var3 == 140 || var3 == 198) {
                var3 = 69;
            } else if (var3 == 223) {
                var3 = 115;
            } else {
                var3 = this.field3392[var9] & 0xFF;
                var9++;
            }
            if (class33.method227(var3, false)) {
                var7++;
            } else {
                var4--;
            }
            if (var5 == 156 || var5 == 230) {
                var5 = 101;
            } else if (var5 == 140 || var5 == 198) {
                var5 = 69;
            } else if (var5 == 223) {
                var5 = 115;
            } else {
                var5 = arg1.field3392[var10] & 0xFF;
                var10++;
            }
            if (class33.method227(var5, false)) {
                var8++;
            } else {
                var6--;
            }
            if (class229.field4115[var5] > class229.field4115[var3]) {
                return -1;
            }
            if (class229.field4115[var5] < class229.field4115[var3]) {
                return 1;
            }
        }
        if (var7 < var8) {
            return -1;
        } else if (var8 < var7) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BI)[Le;")
    public final class191[] method1344(byte arg0, int arg1) {
        int var3 = 39 / ((arg0 - 60) / 36);
        field3394++;
        int var4 = 0;
        for (int var5 = 0; var5 < this.field3379; var5++) {
            if (this.field3392[var5] == arg1) {
                var4++;
            }
        }
        class191[] var6 = new class191[var4 + 1];
        if (var4 == 0) {
            var6[0] = this;
            return var6;
        }
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var4; var9++) {
            int var10;
            for (var10 = 0; this.field3392[var7 + var10] != arg1; var10++) {
            }
            var6[var8++] = this.method1330(var7, 28, var7 + var10);
            var7 += var10 + 1;
        }
        var6[var4] = this.method1330(var7, 95, this.field3379);
        return var6;
    }

    @OriginalMember(owner = "client!e", name = "g", descriptor = "(B)Le;")
    public final class191 method1345(byte arg0) {
        field3373++;
        class191 var2 = new class191();
        boolean var3 = true;
        var2.field3379 = this.field3379;
        var2.field3392 = new byte[this.field3379];
        for (int var4 = 0; var4 < this.field3379; var4++) {
            byte var5 = this.field3392[var4];
            if (var5 == 95) {
                var2.field3392[var4] = 32;
                var3 = true;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var3 = false;
                var2.field3392[var4] = (byte) (var5 - 32);
            } else {
                var3 = false;
                var2.field3392[var4] = var5;
            }
        }
        if (arg0 != -18) {
            this.field3377 = -62;
        }
        return var2;
    }

    @OriginalMember(owner = "client!e", name = "h", descriptor = "(B)Le;")
    public final class191 method1346(byte arg0) {
        int var2;
        for (var2 = 0; this.field3379 > var2 && (this.field3392[var2] >= 0 && this.field3392[var2] <= 32 || (this.field3392[var2] & 0xFF) == 160); var2++) {
        }
        field3399++;
        int var3;
        for (var3 = this.field3379; var2 < var3 && (this.field3392[var3 - 1] >= 0 && this.field3392[var3 - 1] <= 32 || (this.field3392[var3 - 1] & 0xFF) == 160); var3--) {
        }
        if (var2 == 0 && this.field3379 == var3) {
            return this;
        } else if (arg0 <= 13) {
            return null;
        } else {
            class191 var4 = new class191();
            var4.field3379 = var3 - var2;
            var4.field3392 = new byte[var4.field3379];
            for (int var5 = 0; var5 < var4.field3379; var5++) {
                var4.field3392[var5] = this.field3392[var2 + var5];
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!e", name = "h", descriptor = "(I)I")
    public final int method1347(int arg0) {
        field3359++;
        if (arg0 < 106) {
            field3407 = -110;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3379; var3++) {
            var2 = (var2 << 5) + (this.field3392[var3] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(Le;I)I")
    public final int method1348(class191 arg0, int arg1) {
        if (arg1 != 27400) {
            field3408 = null;
        }
        int var3;
        if (arg0.field3379 < this.field3379) {
            var3 = arg0.field3379;
        } else {
            var3 = this.field3379;
        }
        field3346++;
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg0.field3392[var4] & 0xFF) > (this.field3392[var4] & 0xFF)) {
                return -1;
            }
            if ((arg0.field3392[var4] & 0xFF) < (this.field3392[var4] & 0xFF)) {
                return 1;
            }
        }
        if (this.field3379 < arg0.field3379) {
            return -1;
        } else if (arg0.field3379 < this.field3379) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!e", name = "i", descriptor = "(I)Le;")
    public final class191 method1349(int arg0) {
        field3371++;
        long var2 = this.method1329((byte) 118);
        if (arg0 != 4096) {
            return null;
        }
        synchronized (field3412 == null ? (field3412 = method1359("e")) : field3412) {
            if (class254.field4494 == null) {
                class254.field4494 = new class97(4096);
            } else {
                for (class166 var5 = (class166) class254.field4494.method612(var2, true); var5 != null; var5 = (class166) class254.field4494.method608((byte) -118)) {
                    if (this.method1317(-27518, var5.field2810)) {
                        return var5.field2810;
                    }
                }
            }
            class166 var7 = new class166();
            var7.field2810 = this;
            this.field3403 = false;
            class254.field4494.method605(var2, -3, var7);
            return this;
        }
    }

    @OriginalMember(owner = "client!e", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field3396++;
        if (!arg0 instanceof class191) {
            throw new IllegalArgumentException();
        }
        return this.method1317(-27518, (class191) arg0);
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(Le;I)I")
    public final int method1350(class191 arg0, int arg1) {
        field3349++;
        if (arg1 <= 100) {
            this.method1339((byte) 104);
        }
        return this.method1314(1, arg0, 0);
    }

    @OriginalMember(owner = "client!e", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3354++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(ILe;)Z")
    public final boolean method1351(int arg0, class191 arg1) {
        field3348++;
        if (arg1 == null) {
            return false;
        } else if (this.field3379 == arg1.field3379) {
            int var3 = 0;
            if (arg0 != -23098) {
                this.field3403 = false;
            }
            while (var3 < this.field3379) {
                byte var4 = arg1.field3392[var3];
                byte var5 = this.field3392[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
                var3++;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!e", name = "j", descriptor = "(I)J")
    public final long method1352(int arg0) {
        field3352++;
        long var2 = 0L;
        if (arg0 != 65) {
            this.field3403 = false;
        }
        for (int var4 = 0; this.field3379 > var4 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field3392[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += (long) (var5 + 1 - 65);
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += (long) (var5 + 1 - 97);
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += (long) (var5 + 27 - 48);
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(BI)Le;")
    public final class191 method1353(byte arg0, int arg1) {
        field3350++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        } else if (this.field3403) {
            this.field3377 = 0;
            if (arg0 != 72) {
                return null;
            }
            if (this.field3392.length == this.field3379) {
                int var3;
                for (var3 = 1; var3 <= this.field3379; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class58.method390(this.field3392, 0, var4, 0, this.field3379);
                this.field3392 = var4;
            }
            this.field3392[this.field3379++] = (byte) arg1;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(IB)I")
    public final int method1354(int arg0, byte arg1) {
        if (arg1 != -89) {
            this.field3377 = -83;
        }
        field3368++;
        return this.field3392[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZLjava/net/URL;)Ljava/net/URL;")
    public final URL method1355(boolean arg0, URL arg1) throws MalformedURLException {
        if (arg0) {
            this.toString();
        }
        field3411++;
        return new URL(arg1, new String(this.field3392, 0, this.field3379));
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(IB)V")
    public final void method1356(int arg0, byte arg1) {
        field3388++;
        this.field3377 = 0;
        if (!this.field3403) {
            throw new IllegalArgumentException();
        } else if (arg0 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg0 > this.field3392.length) {
                int var3;
                for (var3 = 1; var3 < arg0; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class58.method390(this.field3392, 0, var4, 0, this.field3379);
                this.field3392 = var4;
            }
            for (int var5 = this.field3379; var5 < arg0; var5++) {
                this.field3392[var5] = 32;
            }
            if (arg1 < 69) {
                this.field3377 = -10;
            }
            this.field3379 = arg0;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZLjava/applet/Applet;)Ljava/lang/Object;")
    public final Object method1357(boolean arg0, Applet arg1) throws Throwable {
        field3351++;
        String var3 = new String(this.field3392, 0, this.field3379);
        Object var4 = class120.method792((byte) 122, (Object[]) null, arg1, var3);
        if (arg0) {
            return null;
        }
        if (var4 instanceof String) {
            byte[] var5 = ((String) var4).getBytes();
            var4 = class76.method491(var5.length, var5, 0, -1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!e", name = "k", descriptor = "(I)I")
    public final int method1358(int arg0) {
        if (arg0 != -16880) {
            field3408 = null;
        }
        field3382++;
        return this.method1319(10, 10209);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1359(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

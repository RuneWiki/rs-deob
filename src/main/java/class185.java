import java.io.IOException;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class185 {

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "Lcc;")
    private class237 field3164 = new class237();

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "Lcc;")
    private class237 field3176 = new class237();

    @OriginalMember(owner = "client!rl", name = "A", descriptor = "Lcc;")
    private class237 field3186 = new class237();

    @OriginalMember(owner = "client!rl", name = "C", descriptor = "Lcc;")
    private class237 field3188 = new class237();

    @OriginalMember(owner = "client!rl", name = "G", descriptor = "Lkh;")
    private class13 field3192 = new class13(4);

    @OriginalMember(owner = "client!rl", name = "H", descriptor = "I")
    public volatile int field3193 = 0;

    @OriginalMember(owner = "client!rl", name = "K", descriptor = "I")
    public volatile int field3196 = 0;

    @OriginalMember(owner = "client!rl", name = "I", descriptor = "B")
    private byte field3194 = 0;

    @OriginalMember(owner = "client!rl", name = "J", descriptor = "Lkh;")
    private class13 field3195 = new class13(8);

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "[I")
    public static int[] field3171 = new int[256];

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "Lcd;")
    public static class64 field3167 = class44.method335((byte) 71, ":allyreq:");

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "Lcd;")
    private static class64 field3185 = class44.method335((byte) 71, "Take");

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "Lcd;")
    public static class64 field3170 = field3185;

    @OriginalMember(owner = "client!rl", name = "B", descriptor = "Lcd;")
    public static class64 field3187 = class44.method335((byte) 71, "Nehmen");

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!rl", name = "r", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!rl", name = "s", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!rl", name = "t", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!rl", name = "u", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!rl", name = "v", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!rl", name = "x", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!rl", name = "y", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!rl", name = "D", descriptor = "I")
    private int field3189;

    @OriginalMember(owner = "client!rl", name = "F", descriptor = "J")
    private long field3191;

    @OriginalMember(owner = "client!rl", name = "L", descriptor = "Lhg;")
    private class163 field3197;

    @OriginalMember(owner = "client!rl", name = "E", descriptor = "Lod;")
    private class24 field3190;

    @OriginalMember(owner = "client!rl", name = "w", descriptor = "Lqd;")
    public static class40 field3182;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)I", line = 5)
    private final int method1297(byte arg0) {
        field3162++;
        if (arg0 > -12) {
            this.method1299(121);
        }
        return this.field3186.method1695((byte) -28) + this.field3188.method1695((byte) -53);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)Z", line = 16)
    public final boolean method1298(int arg0) {
        field3177++;
        int var2 = 97 / ((44 - arg0) / 45);
        return this.method1297((byte) -23) >= 20;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V", line = 31)
    public final void method1299(int arg0) {
        this.field3194 = (byte) ((int) ((double) arg0 + Math.random() * 255.0D));
        this.field3193++;
        field3181++;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)Z", line = 41)
    public final boolean method1300(boolean arg0) {
        if (!arg0) {
            return false;
        }
        if (this.field3190 != null) {
            long var2 = class154.method1114(true);
            int var4 = (int) (var2 - this.field3191);
            this.field3191 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field3189 += var4;
            if (this.field3189 > 30000) {
                try {
                    this.field3190.method225(1);
                } catch (Exception var30) {
                }
                this.field3190 = null;
            }
        }
        field3161++;
        if (this.field3190 == null) {
            return this.method1307(-31382) == 0 && this.method1297((byte) -35) == 0;
        }
        try {
            for (class163 var6 = (class163) this.field3164.method1698((byte) -126); var6 != null; var6 = (class163) this.field3164.method1693(18)) {
                this.field3192.field281 = 0;
                this.field3192.method130(-1, 1);
                this.field3192.method131((int) var6.field2312, (byte) 100);
                this.field3190.method227(this.field3192.field254, 0, 3, 4);
                this.field3176.method1694(var6, 0);
            }
            for (class163 var7 = (class163) this.field3186.method1698((byte) -115); var7 != null; var7 = (class163) this.field3186.method1693(26)) {
                this.field3192.field281 = 0;
                this.field3192.method130(-1, 0);
                this.field3192.method131((int) var7.field2312, (byte) 118);
                this.field3190.method227(this.field3192.field254, 0, 3, 4);
                this.field3188.method1694(var7, 0);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field3190.method219(0);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field3189 = 0;
                byte var10 = 0;
                if (this.field3197 == null) {
                    var10 = 8;
                } else if (this.field3197.field2863 == 0) {
                    var10 = 1;
                }
                if (var10 > 0) {
                    int var11 = var10 - this.field3195.field281;
                    if (var9 < var11) {
                        var11 = var9;
                    }
                    this.field3190.method221(this.field3195.field254, this.field3195.field281, 80, var11);
                    if (this.field3194 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field3195.field254[this.field3195.field281 + var12] = (byte) class74.method597(this.field3195.field254[this.field3195.field281 + var12], this.field3194);
                        }
                    }
                    this.field3195.field281 += var11;
                    if (this.field3195.field281 >= var10) {
                        if (this.field3197 == null) {
                            this.field3195.field281 = 0;
                            int var13 = this.field3195.method152((byte) -90);
                            int var14 = this.field3195.method112((byte) 92);
                            int var15 = this.field3195.method152((byte) -93);
                            int var16 = this.field3195.method105((byte) 87);
                            boolean var17 = (var15 & 0x80) != 0;
                            long var18 = (long) ((var13 << 16) + var14);
                            int var20 = var15 & 0x7F;
                            Object var21 = null;
                            class163 var22;
                            if (var17) {
                                for (var22 = (class163) this.field3188.method1698((byte) -126); var22 != null && var22.field2312 != var18; var22 = (class163) this.field3188.method1693(-1)) {
                                }
                            } else {
                                for (var22 = (class163) this.field3176.method1698((byte) -116); var22 != null && var22.field2312 != var18; var22 = (class163) this.field3176.method1693(-128)) {
                                }
                            }
                            if (var22 == null) {
                                throw new IOException();
                            }
                            this.field3197 = var22;
                            int var23 = var20 == 0 ? 5 : 9;
                            this.field3197.field2866 = new class13(var16 + this.field3197.field2859 + var23);
                            this.field3197.field2866.method130(-1, var20);
                            this.field3197.field2866.method128((byte) -21, var16);
                            this.field3197.field2863 = 8;
                            this.field3195.field281 = 0;
                        } else if (this.field3197.field2863 != 0) {
                            throw new IOException();
                        } else if (this.field3195.field254[0] == -1) {
                            this.field3195.field281 = 0;
                            this.field3197.field2863 = 1;
                        } else {
                            this.field3197 = null;
                        }
                    }
                } else {
                    int var24 = 512 - this.field3197.field2863;
                    int var25 = this.field3197.field2866.field254.length - this.field3197.field2859;
                    if (var25 - this.field3197.field2866.field281 < var24) {
                        var24 = var25 - this.field3197.field2866.field281;
                    }
                    if (var9 < var24) {
                        var24 = var9;
                    }
                    this.field3190.method221(this.field3197.field2866.field254, this.field3197.field2866.field281, 105, var24);
                    if (this.field3194 != 0) {
                        for (int var26 = 0; var26 < var24; var26++) {
                            this.field3197.field2866.field254[this.field3197.field2866.field281 + var26] = (byte) class74.method597(this.field3197.field2866.field254[this.field3197.field2866.field281 + var26], this.field3194);
                        }
                    }
                    this.field3197.field2866.field281 += var24;
                    this.field3197.field2863 += var24;
                    if (this.field3197.field2866.field281 == var25) {
                        this.field3197.method938(0);
                        this.field3197.field961 = false;
                        this.field3197 = null;
                    } else if (this.field3197.field2863 == 512) {
                        this.field3197.field2863 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field3190.method225(1);
            } catch (Exception var29) {
            }
            this.field3190 = null;
            this.field3196++;
            return this.method1307(-31382) == 0 && this.method1297((byte) -112) == 0;
        }
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)V", line = 316)
    public final void method1301(int arg0) {
        if (arg0 <= 116) {
            this.field3190 = (class24) null;
        }
        if (this.field3190 != null) {
            this.field3190.method225(1);
        }
        field3178++;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(III)I", line = 331)
    public static final int method1302(int arg0, int arg1, int arg2) {
        int var3 = -63 / ((61 - arg2) / 41);
        field3175++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var4 = (arg0 & 0x7F) * arg1 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 126) {
            var4 = 126;
        }
        return (arg0 & 0xFF80) + var4;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZLod;)V", line = 351)
    public final void method1303(int arg0, boolean arg1, class24 arg2) {
        if (this.field3190 != null) {
            try {
                this.field3190.method225(1);
            } catch (Exception var11) {
            }
            this.field3190 = null;
        }
        this.field3190 = arg2;
        field3183++;
        this.method1310(-92);
        this.method1313((byte) 25, arg1);
        this.field3195.field281 = 0;
        this.field3197 = null;
        while (true) {
            class163 var5 = (class163) this.field3176.method1697(87);
            if (var5 == null) {
                while (true) {
                    class163 var6 = (class163) this.field3188.method1697(121);
                    if (var6 == null) {
                        if (this.field3194 != 0) {
                            try {
                                this.field3192.field281 = 0;
                                this.field3192.method130(-1, 4);
                                this.field3192.method130(-1, this.field3194);
                                this.field3192.method145(arg0 + 8883, 0);
                                this.field3190.method227(this.field3192.field254, 0, 3, 4);
                            } catch (IOException var10) {
                                try {
                                    this.field3190.method225(arg0 + 8790);
                                } catch (Exception var9) {
                                }
                                this.field3196++;
                                this.field3190 = null;
                            }
                        }
                        if (arg0 != -8789) {
                            method1302(-33, 25, 54);
                        }
                        this.field3189 = 0;
                        this.field3191 = class154.method1114(true);
                        return;
                    }
                    this.field3186.method1694(var6, 0);
                }
            }
            this.field3164.method1694(var5, 0);
        }
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)V", line = 421)
    public final void method1304(int arg0) {
        field3179++;
        if (this.field3190 == null) {
            return;
        }
        try {
            this.field3192.field281 = 0;
            this.field3192.method130(-1, 7);
            this.field3192.method131(arg0, (byte) 108);
            this.field3190.method227(this.field3192.field254, 0, 3, 4);
        } catch (IOException var5) {
            try {
                this.field3190.method225(1);
            } catch (Exception var4) {
            }
            this.field3196++;
            this.field3190 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZIIIB)Lhg;", line = 454)
    public final class163 method1305(boolean arg0, int arg1, int arg2, int arg3, byte arg4) {
        field3184++;
        long var6 = (long) ((arg1 << 16) + arg3);
        class163 var8 = new class163();
        var8.field965 = arg0;
        var8.field2312 = var6;
        var8.field2859 = arg4;
        if (arg0) {
            if (this.method1307(-31382) >= 20) {
                throw new RuntimeException();
            }
            this.field3164.method1694(var8, arg2 ^ 0xA43);
        } else if (this.method1297((byte) -15) < 20) {
            this.field3186.method1694(var8, 0);
        } else {
            throw new RuntimeException();
        }
        return arg2 == 2627 ? var8 : (class163) null;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZ)V", line = 495)
    public static final void method1306(int arg0, boolean arg1) {
        field3163++;
        byte var2;
        byte[][] var3;
        if (class123.field2216 && arg1) {
            var2 = 1;
            var3 = class134.field2384;
        } else {
            var3 = class71.field1360;
            var2 = 4;
        }
        int var4 = 0;
        int var5 = -41 / ((arg0 + 5) / 61);
        while (var2 > var4) {
            class246.method1778(5);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    int var8 = class131.field2339[var4][var6][var7];
                    if (var8 != -1) {
                        int var9 = (var8 & 0x358EC5B) >> 24;
                        if (!arg1 || var9 == 0) {
                            int var10 = (var8 & 0x6) >> 1;
                            int var11 = (var8 & 0x3FFB) >> 3;
                            int var12 = var8 >> 14 & 0x3FF;
                            int var13 = (var12 / 8 << 8) + var11 / 8;
                            for (int var14 = 0; var14 < class89.field1611.length; var14++) {
                                if (class89.field1611[var14] == var13 && var3[var14] != null) {
                                    class97.method726(0, var9, arg1, class91.field1637, var6 * 8, var7 * 8, var3[var14], var4, (var11 & 0x7) * 8, var10, (var12 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "(I)I", line = 580)
    public final int method1307(int arg0) {
        if (arg0 != -31382) {
            this.field3188 = (class237) null;
        }
        field3174++;
        return this.field3164.method1695((byte) -25) + this.field3176.method1695((byte) -33);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(III[[[BIBII)V", line = 606)
    public static final void method1308(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class226.field3837++;
        class104.field1933 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class138.field2461; var12 < class183.field3140; var12++) {
            class295[][] var13 = class304.field5203[var12];
            for (int var14 = class69.field1323; var14 < class278.field4797; var14++) {
                for (int var15 = class246.field4290; var15 < class265.field4550; var15++) {
                    class295 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class147.field2593[var14 + field3180 - class89.field1614][var15 + field3180 - class172.field2968] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field5096 = true;
                            var16.field5078 = true;
                            if (var16.field5075 > 0) {
                                var16.field5081 = true;
                            } else {
                                var16.field5081 = false;
                            }
                            class104.field1933++;
                        } else {
                            var16.field5096 = false;
                            var16.field5078 = false;
                            var16.field5077 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field5092 != null) {
                                    class162 var17 = var16.field5092;
                                    var17.field2852.method1522(var17.field2849, 8, var17.field2854, var17.field2849, var17.field2854);
                                    if (var17.field2842 != null) {
                                        var17.field2842.method1522(var17.field2849, 8, var17.field2854, var17.field2849, var17.field2854);
                                    }
                                }
                                if (var16.field5079 != null) {
                                    class184 var18 = var16.field5079;
                                    var18.field3151.method1522(var18.field3145, 8, var18.field3152, var18.field3145, var18.field3152);
                                    if (var18.field3143 != null) {
                                        var18.field3143.method1522(var18.field3145, 8, var18.field3152, var18.field3145, var18.field3152);
                                    }
                                }
                                if (var16.field5095 != null) {
                                    class37 var19 = var16.field5095;
                                    var19.field599.method1522(var19.field594, 8, var19.field596, var19.field594, var19.field596);
                                }
                                if (var16.field5090 != null) {
                                    for (int var20 = 0; var20 < var16.field5075; var20++) {
                                        class195 var21 = var16.field5090[var20];
                                        var21.field3330.method1522(var21.field3322, 8, var21.field3328, var21.field3323, var21.field3313);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class96.field1764 == class184.field3155;
        if (class123.field2216) {
            GL var23 = class123.field2212;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class114.method817();
                class125.method908(3, -5, -1);
                class223.field3808 = true;
                class68.method558();
                class104.field1923 = -1;
                class193.field3295 = -1;
                for (int var24 = 0; var24 < class85.field1567[0].length; var24++) {
                    class204 var25 = class85.field1567[0][var24];
                    float var26 = 251.5F - (var25.field3478 ? 1.0F : 0.5F);
                    if (class104.field1923 != var25.field3488) {
                        class104.field1923 = var25.field3488;
                        class122.method860(var25.field3488, -104);
                        class52.method394(class223.method1611(0));
                    }
                    var25.method1425(class304.field5203, var26, false);
                }
                class68.method553();
            } else {
                int var27 = class138.field2461;
                while (true) {
                    if (var27 >= class183.field3140) {
                        class177.method1246(class89.field1614, class172.field2968, class304.field5203);
                        break;
                    }
                    for (int var28 = 0; var28 < class85.field1567[var27].length; var28++) {
                        class204 var29 = class85.field1567[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field3478 ? 1.0F : 0.5F);
                        if (var29.field3472 != -1 && class50.field816.method664(var29.field3472, 65) == 4 && class250.field4342) {
                            class122.method860(var29.field3488, -106);
                        }
                        var29.method1425(class304.field5203, var30, false);
                    }
                    if (var27 == 0 && class244.field4251 > 0) {
                        class123.method875(101.5F);
                        class302.method2113(class89.field1614, class172.field2968, field3180, arg1, class147.field2593, class96.field1764[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class138.field2461; var31 < class183.field3140; var31++) {
            class295[][] var32 = class304.field5203[var31];
            for (int var33 = -field3180; var33 <= 0; var33++) {
                int var34 = class89.field1614 + var33;
                int var35 = class89.field1614 - var33;
                if (var34 >= class69.field1323 || var35 < class278.field4797) {
                    for (int var36 = -field3180; var36 <= 0; var36++) {
                        int var37 = class172.field2968 + var36;
                        int var38 = class172.field2968 - var36;
                        if (var34 >= class69.field1323) {
                            if (var37 >= class246.field4290) {
                                class295 var39 = var32[var34][var37];
                                if (var39 != null && var39.field5096) {
                                    class230.method1661(var39, true);
                                }
                            }
                            if (var38 < class265.field4550) {
                                class295 var40 = var32[var34][var38];
                                if (var40 != null && var40.field5096) {
                                    class230.method1661(var40, true);
                                }
                            }
                        }
                        if (var35 < class278.field4797) {
                            if (var37 >= class246.field4290) {
                                class295 var41 = var32[var35][var37];
                                if (var41 != null && var41.field5096) {
                                    class230.method1661(var41, true);
                                }
                            }
                            if (var38 < class265.field4550) {
                                class295 var42 = var32[var35][var38];
                                if (var42 != null && var42.field5096) {
                                    class230.method1661(var42, true);
                                }
                            }
                        }
                        if (class104.field1933 == 0) {
                            if (!var22) {
                                class156.field2761 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class138.field2461; var43 < class183.field3140; var43++) {
            class295[][] var44 = class304.field5203[var43];
            for (int var45 = -field3180; var45 <= 0; var45++) {
                int var46 = class89.field1614 + var45;
                int var47 = class89.field1614 - var45;
                if (var46 >= class69.field1323 || var47 < class278.field4797) {
                    for (int var48 = -field3180; var48 <= 0; var48++) {
                        int var49 = class172.field2968 + var48;
                        int var50 = class172.field2968 - var48;
                        if (var46 >= class69.field1323) {
                            if (var49 >= class246.field4290) {
                                class295 var51 = var44[var46][var49];
                                if (var51 != null && var51.field5096) {
                                    class230.method1661(var51, false);
                                }
                            }
                            if (var50 < class265.field4550) {
                                class295 var52 = var44[var46][var50];
                                if (var52 != null && var52.field5096) {
                                    class230.method1661(var52, false);
                                }
                            }
                        }
                        if (var47 < class278.field4797) {
                            if (var49 >= class246.field4290) {
                                class295 var53 = var44[var47][var49];
                                if (var53 != null && var53.field5096) {
                                    class230.method1661(var53, false);
                                }
                            }
                            if (var50 < class265.field4550) {
                                class295 var54 = var44[var47][var50];
                                if (var54 != null && var54.field5096) {
                                    class230.method1661(var54, false);
                                }
                            }
                        }
                        if (class104.field1933 == 0) {
                            if (!var22) {
                                class156.field2761 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class156.field2761 = false;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(Z)Z", line = 972)
    public final boolean method1309(boolean arg0) {
        field3165++;
        if (arg0) {
            this.field3176 = (class237) null;
        }
        return this.method1307(-31382) >= 20;
    }

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "(I)V", line = 987)
    private final void method1310(int arg0) {
        if (arg0 >= -65) {
            return;
        }
        field3160++;
        if (this.field3190 == null) {
            return;
        }
        try {
            this.field3192.field281 = 0;
            this.field3192.method130(-1, 6);
            this.field3192.method131(3, (byte) 114);
            this.field3190.method227(this.field3192.field254, 0, 3, 4);
        } catch (IOException var5) {
            try {
                this.field3190.method225(1);
            } catch (Exception var4) {
            }
            this.field3190 = null;
            this.field3196++;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILqm;)Lqd;", line = 1019)
    public static final class40 method1311(int arg0, int arg1, class222 arg2) {
        field3172++;
        if (class56.method432(arg2, arg0, 2011695404)) {
            if (arg1 > -97) {
                method1311(29, 34, (class222) null);
            }
            return class190.method1341(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)V", line = 1035)
    public static void method1312(byte arg0) {
        field3187 = null;
        field3185 = null;
        field3167 = null;
        field3170 = null;
        field3182 = null;
        if (arg0 < 84) {
            field3173 = -86;
        }
        field3171 = null;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BZ)V", line = 1050)
    public final void method1313(byte arg0, boolean arg1) {
        if (arg0 != 25) {
            return;
        }
        field3169++;
        if (this.field3190 == null) {
            return;
        }
        try {
            this.field3192.field281 = 0;
            this.field3192.method130(-1, arg1 ? 2 : 3);
            this.field3192.method131(0, (byte) 119);
            this.field3190.method227(this.field3192.field254, 0, arg0 ^ 0x1A, 4);
        } catch (IOException var6) {
            try {
                this.field3190.method225(1);
            } catch (Exception var5) {
            }
            this.field3196++;
            this.field3190 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(III)V", line = 1085)
    public static final void method1314(int arg0, int arg1, int arg2) {
        class156.field2761 = true;
        class193.field3294 = arg0;
        class264.field4541 = arg1;
        class227.field3859 = arg2;
        class252.field4383 = -1;
        class202.field3457 = -1;
    }
}

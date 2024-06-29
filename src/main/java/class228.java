import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class228 extends class438 {

    @OriginalMember(owner = "client!fo", name = "n", descriptor = "Z")
    public boolean field3162 = false;

    @OriginalMember(owner = "client!fo", name = "t", descriptor = "Z")
    private boolean field3168 = false;

    @OriginalMember(owner = "client!fo", name = "I", descriptor = "I")
    private int field3183 = 0;

    @OriginalMember(owner = "client!fo", name = "L", descriptor = "Lkg;")
    public class217 field3186;

    @OriginalMember(owner = "client!fo", name = "Q", descriptor = "J")
    private long field3191;

    @OriginalMember(owner = "client!fo", name = "s", descriptor = "Lrs;")
    public class240 field3167;

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "Loh;")
    public class432 field3157;

    @OriginalMember(owner = "client!fo", name = "y", descriptor = "Lcp;")
    public class399 field3173;

    @OriginalMember(owner = "client!fo", name = "N", descriptor = "I")
    public static int field3188 = 2;

    @OriginalMember(owner = "client!fo", name = "x", descriptor = "I")
    public static int field3172 = 0;

    @OriginalMember(owner = "client!fo", name = "M", descriptor = "[I")
    public static int[] field3187 = new int[1024];

    @OriginalMember(owner = "client!fo", name = "A", descriptor = "Lhc;")
    public static class368 field3175 = new class368("Loaded fonts", "Schriftsätze geladen.", "Polices chargées", "Fontes carregadas");

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
    private int field3156;

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "I")
    public int field3158;

    @OriginalMember(owner = "client!fo", name = "k", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!fo", name = "l", descriptor = "I")
    public int field3160;

    @OriginalMember(owner = "client!fo", name = "m", descriptor = "I")
    private int field3161;

    @OriginalMember(owner = "client!fo", name = "o", descriptor = "I")
    private int field3163;

    @OriginalMember(owner = "client!fo", name = "p", descriptor = "I")
    public int field3164;

    @OriginalMember(owner = "client!fo", name = "q", descriptor = "I")
    private int field3165;

    @OriginalMember(owner = "client!fo", name = "r", descriptor = "I")
    private int field3166;

    @OriginalMember(owner = "client!fo", name = "u", descriptor = "I")
    private int field3169;

    @OriginalMember(owner = "client!fo", name = "v", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!fo", name = "w", descriptor = "I")
    private int field3171;

    @OriginalMember(owner = "client!fo", name = "z", descriptor = "I")
    private int field3174;

    @OriginalMember(owner = "client!fo", name = "B", descriptor = "I")
    private int field3176;

    @OriginalMember(owner = "client!fo", name = "C", descriptor = "I")
    private int field3177;

    @OriginalMember(owner = "client!fo", name = "D", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!fo", name = "E", descriptor = "I")
    private int field3179;

    @OriginalMember(owner = "client!fo", name = "F", descriptor = "I")
    private int field3180;

    @OriginalMember(owner = "client!fo", name = "G", descriptor = "I")
    public int field3181;

    @OriginalMember(owner = "client!fo", name = "H", descriptor = "I")
    private int field3182;

    @OriginalMember(owner = "client!fo", name = "J", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!fo", name = "K", descriptor = "I")
    private int field3185;

    @OriginalMember(owner = "client!fo", name = "O", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!fo", name = "P", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!fo", name = "R", descriptor = "I")
    private int field3192;

    @OriginalMember(owner = "client!fo", name = "S", descriptor = "I")
    private int field3193;

    @OriginalMember(owner = "client!fo", name = "T", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(JILea;ZI)V", line = 7)
    public final void method1486(long arg0, int arg1, class58 arg2, boolean arg3, int arg4) {
        if (this.field3162) {
            arg3 = false;
        } else if (this.field3157.field6075 > class268.field3672) {
            arg3 = false;
        } else if (class246.field3472[class268.field3672] < class249.field3495) {
            arg3 = false;
        } else if (this.field3168) {
            arg3 = false;
        } else if (this.field3157.field6077 != -1) {
            int var7 = (int) (arg0 - this.field3191);
            if (this.field3157.field6115 || var7 <= this.field3157.field6077) {
                var7 %= this.field3157.field6077;
            } else {
                arg3 = false;
            }
            if (!this.field3157.field6070 && var7 < this.field3157.field6052) {
                arg3 = false;
            }
            if (this.field3157.field6070 && var7 >= this.field3157.field6052) {
                arg3 = false;
            }
        }
        if (arg1 != -6164) {
            field3172 = 87;
        }
        field3194++;
        if (arg3) {
            this.field3183 += (int) ((double) arg4 * ((double) this.field3157.field6078 + Math.random() * (double) (this.field3157.field6058 - this.field3157.field6078)));
            if (this.field3183 > 63) {
                int var8 = this.field3183 >> 6;
                this.field3183 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field3157.field6112 <= 0 && this.field3157.field6056 <= 0) {
                        var10 = this.field3166;
                        var11 = this.field3179;
                        var12 = this.field3185;
                    } else {
                        int var13 = (int) ((double) this.field3182 * Math.random()) + this.field3171;
                        int var14 = var13 & 0x3FFF;
                        int var15 = class136.field2021[var14];
                        int var16 = class136.field2020[var14];
                        int var17 = (int) ((double) this.field3193 * Math.random()) + this.field3176;
                        int var18 = var17 & 0x1FFF;
                        int var19 = class136.field2021[var18];
                        var10 = var16 * var19 >> 15;
                        int var20 = class136.field2020[var18];
                        var12 = var15 * var19 >> 15;
                        var11 = var20 * -1;
                    }
                    int var21 = (int) (Math.random() * 65535.0D);
                    int var22 = (int) (Math.random() * 65535.0D);
                    if ((var21 + var22) > 65535) {
                        var22 = 65535 - var22;
                        var21 = 65535 - var21;
                    }
                    int var23 = 65535 - var21 - var22;
                    int var24 = this.field3165 * var23 + this.field3192 * var21 + this.field3180 * var22 >> 16;
                    int var25 = this.field3161 * var22 + this.field3163 * var23 + this.field3156 * var21 >> 16;
                    int var26 = this.field3169 * var22 + this.field3177 * var21 + this.field3174 * var23 >> 16;
                    int var27 = (int) (Math.random() * (double) (this.field3157.field6108 - this.field3157.field6079)) + this.field3157.field6079;
                    int var28 = (int) (Math.random() * (double) (this.field3157.field6082 - this.field3157.field6064)) + this.field3157.field6064;
                    int var29 = (int) ((double) (this.field3157.field6084 - this.field3157.field6083) * Math.random()) + this.field3157.field6083;
                    int var30;
                    if (this.field3157.field6090) {
                        double var31 = Math.random();
                        var30 = (int) ((double) this.field3157.field6062 * var31 + (double) this.field3157.field6114) | (int) ((double) this.field3157.field6055 * var31 + (double) this.field3157.field6118) << 16 | (int) ((double) this.field3157.field6066 * var31 + (double) this.field3157.field6099) << 8 | (int) ((double) this.field3157.field6065 * var31 + (double) this.field3157.field6094) << 24;
                    } else {
                        var30 = (int) ((double) this.field3157.field6118 + (double) this.field3157.field6055 * Math.random()) << 16 | (int) ((double) this.field3157.field6099 + (double) this.field3157.field6066 * Math.random()) << 8 | (int) (Math.random() * (double) this.field3157.field6062 + (double) this.field3157.field6114) | (int) ((double) this.field3157.field6094 + (double) this.field3157.field6065 * Math.random()) << 24;
                    }
                    int var33 = this.field3157.field6104;
                    if (!arg2.method211() && !this.field3157.field6102) {
                        var33 = -1;
                    }
                    if (class29.field406 == class21.field271) {
                        new class308(this, var24, var25, var26, var10, var11, var12, var27, var28, var30, var29, var33, this.field3157.field6072);
                    } else {
                        class308 var35 = class55.field724[class21.field271];
                        class21.field271 = class21.field271 + 1 & 0x3FF;
                        var35.method1853(this, var24, var25, var26, var10, var11, var12, var27, var28, var30, var29, var33, this.field3157.field6072);
                    }
                }
            }
        }
        this.field3158 = 0;
        for (class308 var36 = (class308) this.field3173.method2480(7904); var36 != null; var36 = (class308) this.field3173.method2482(50)) {
            var36.method1854(arg0, arg4);
            this.field3158++;
        }
        class354.field4767 += this.field3158;
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)V", line = 171)
    public static void method1487(int arg0) {
        if (arg0 != 32767) {
            method1489((class316) null, false);
        }
        field3187 = null;
        field3175 = null;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)V", line = 184)
    public static final void method1488(int arg0, int arg1) {
        field3178++;
        class19.field259 = arg0;
        if (arg1 != -30455) {
            return;
        }
        class408 var2 = class218.field3060;
        synchronized (class218.field3060) {
            class218.field3060.method2530((byte) -82);
        }
        class408 var3 = class445.field6237;
        synchronized (class445.field6237) {
            class445.field6237.method2530((byte) -113);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lij;Z)V", line = 204)
    public static final void method1489(class316 arg0, boolean arg1) {
        class451.field6492 = arg0;
        field3189++;
        if (!arg1) {
            method1488(97, 40);
        }
        class149.field2168 = class451.field6492.method1934((byte) 28, 16);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(JZ)V", line = 218)
    public final void method1490(long arg0, boolean arg1) {
        field3159++;
        if (!arg1) {
            this.field3171 = -98;
        }
        for (class308 var4 = (class308) this.field3173.method2480(7904); var4 != null; var4 = (class308) this.field3173.method2482(50)) {
            var4.method1855(arg0);
        }
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lea;Lkg;Lrs;J)V", line = 434)
    public class228(class58 arg0, class217 arg1, class240 arg2, long arg3) {
        this.field3186 = arg1;
        this.field3191 = arg3;
        this.field3167 = arg2;
        this.field3157 = class428.method2636(this.field3186.field3037, false);
        if (!arg0.method211() && this.field3157.field6068 != -1) {
            this.field3157 = class428.method2636(this.field3157.field6068, false);
        }
        this.field3173 = new class399();
        this.field3183 = (int) ((double) this.field3183 + Math.random() * 64.0D);
        this.method1493((byte) 17);
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(II)Z", line = 246)
    public static final boolean method1491(int arg0, int arg1) {
        field3184++;
        class277 var2 = class117.method921(-104, arg1);
        if (var2 == null) {
            return false;
        } else if (class76.field1085 == 3) {
            String var3 = "";
            if (class314.field4259 != 0) {
                var3 = ":" + (var2.field3769 + 7000);
            }
            String var4 = "";
            if (class101.field1400 != null) {
                var4 = "/p=" + class101.field1400;
            }
            if (arg0 != 63) {
                field3188 = -48;
            }
            String var5 = "http://" + var2.field3773 + var3 + "/l=" + class445.field6241 + "/a=" + class47.field606 + var4 + "/j" + (class95.field1316 ? "1" : "0") + ",o" + (class2.field15 ? "1" : "0") + ",a2";
            try {
                class352.field4737.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        } else {
            class399.field5517 = var2.field3769;
            class403.field5562 = var2.field3773;
            if (class314.field4259 != 0) {
                class189.field2729 = class399.field5517 + 50000;
                class418.field5780 = class399.field5517 + 40000;
                class111.field1704 = class418.field5780;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "(II)V", line = 306)
    public static final void method1492(int arg0, int arg1) {
        if (arg0 != 32767) {
            field3175 = null;
        }
        field3190++;
        class104.field1452 = 1000 / arg1;
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(B)V", line = 326)
    public final void method1493(byte arg0) {
        this.field3161 = this.field3186.field3049;
        this.field3156 = this.field3186.field3029;
        if (arg0 != 17) {
            this.field3165 = 31;
        }
        field3170++;
        this.field3163 = this.field3186.field3046;
        this.field3180 = this.field3186.field3043;
        this.field3165 = this.field3186.field3041;
        this.field3177 = this.field3186.field3033;
        this.field3174 = this.field3186.field3035;
        this.field3192 = this.field3186.field3044;
        this.field3169 = this.field3186.field3042;
        if (this.field3192 == this.field3180 && this.field3180 == this.field3165 && this.field3161 == this.field3156 && this.field3163 == this.field3161 && this.field3177 == this.field3169 && this.field3174 == this.field3169) {
            this.field3168 = true;
            return;
        }
        this.field3168 = false;
        int var2 = (this.field3192 + this.field3165 + this.field3180) / 3;
        int var3 = (this.field3163 + this.field3156 + this.field3161) / 3;
        int var4 = (this.field3177 + this.field3169 + this.field3174) / 3;
        if (this.field3181 == var2 && this.field3160 == var3 && this.field3164 == var4) {
            return;
        }
        this.field3164 = var4;
        this.field3160 = var3;
        this.field3181 = var2;
        int var5 = this.field3180 - this.field3192;
        int var6 = this.field3161 - this.field3156;
        int var7 = this.field3169 - this.field3177;
        int var8 = this.field3165 - this.field3192;
        int var9 = this.field3163 - this.field3156;
        int var10 = this.field3174 - this.field3177;
        this.field3166 = var6 * var10 - (var7 * var9);
        this.field3179 = var7 * var8 - (var5 * var10);
        this.field3185 = var5 * var9 - (var6 * var8);
        while (this.field3166 > 32767 || this.field3179 > 32767 || this.field3185 > 32767 || this.field3166 < -32767 || this.field3179 < -32767 || this.field3185 < -32767) {
            this.field3185 >>= 0x1;
            this.field3166 >>= 0x1;
            this.field3179 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field3185 * this.field3185 + this.field3179 * this.field3179 + this.field3166 * this.field3166));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field3166 = this.field3166 * 32767 / var11;
        this.field3185 = this.field3185 * 32767 / var11;
        this.field3179 = this.field3179 * 32767 / var11;
        if (this.field3157.field6112 <= 0 && this.field3157.field6056 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field3185, (double) this.field3166) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field3179, Math.sqrt((double) (this.field3185 * this.field3185 + this.field3166 * this.field3166))) * 2607.5945876176133D);
        this.field3182 = this.field3157.field6112 - this.field3157.field6100;
        this.field3193 = this.field3157.field6056 - this.field3157.field6113;
        this.field3171 = var12 + this.field3157.field6100 - (this.field3182 >> 1);
        this.field3176 = this.field3157.field6113 + var13 - (this.field3193 >> 1);
    }
}

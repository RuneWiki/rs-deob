import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class169 {

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    private int field3238 = 32;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "J")
    private long field3235 = class100.method748((byte) 35);

    @OriginalMember(owner = "client!sg", name = "G", descriptor = "I")
    private int field3258 = 0;

    @OriginalMember(owner = "client!sg", name = "J", descriptor = "[Ltb;")
    private class173[] field3261 = new class173[8];

    @OriginalMember(owner = "client!sg", name = "F", descriptor = "Z")
    private boolean field3257 = true;

    @OriginalMember(owner = "client!sg", name = "K", descriptor = "J")
    private long field3262 = 0L;

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "I")
    private int field3259 = 0;

    @OriginalMember(owner = "client!sg", name = "R", descriptor = "[Ltb;")
    private class173[] field3269 = new class173[8];

    @OriginalMember(owner = "client!sg", name = "T", descriptor = "I")
    private int field3271 = 0;

    @OriginalMember(owner = "client!sg", name = "S", descriptor = "J")
    private long field3270 = 0L;

    @OriginalMember(owner = "client!sg", name = "W", descriptor = "I")
    private int field3273 = 0;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "Lsd;")
    public static class166 field3227 = class135.method935("Startseite auf (WSpielkonto wiederherstellen(W)3", 0);

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "Lsd;")
    private static class166 field3239 = class135.method935("Service unavailable)3", 0);

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    public static int field3240 = 0;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "Lsd;")
    public static class166 field3247 = class135.method935("M", 0);

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field3236 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "[Lsd;")
    public static class166[] field3253 = new class166[100];

    @OriginalMember(owner = "client!sg", name = "C", descriptor = "Lsd;")
    public static class166 field3254 = field3239;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
    public static int field3245 = 0;

    @OriginalMember(owner = "client!sg", name = "N", descriptor = "[[B")
    public static byte[][] field3265 = new byte[1000][];

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!sg", name = "D", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!sg", name = "E", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!sg", name = "I", descriptor = "I")
    public int field3260;

    @OriginalMember(owner = "client!sg", name = "L", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!sg", name = "M", descriptor = "I")
    private int field3264;

    @OriginalMember(owner = "client!sg", name = "O", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!sg", name = "P", descriptor = "I")
    public int field3267;

    @OriginalMember(owner = "client!sg", name = "Q", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "Ltb;")
    private class173 field3246;

    @OriginalMember(owner = "client!sg", name = "U", descriptor = "Lcb;")
    public static class22 field3272;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "[I")
    public int[] field3251;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILvd;)Z")
    public static final boolean method1168(int arg0, class193 arg1) {
        field3241++;
        if (arg1.field3811 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < arg1.field3811.length; var2++) {
            int var3 = class37.method262(arg1, -48, var2);
            int var4 = arg1.field3833[var2];
            if (arg1.field3811[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg1.field3811[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg1.field3811[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "()I")
    public int method47() throws Exception {
        field3263++;
        return this.field3267;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)Z")
    public static final boolean method1169(int arg0, int arg1) {
        field3231++;
        if (class199.field3943[arg0]) {
            return true;
        } else if (class72.field1431.method371((byte) -28, arg0)) {
            int var2 = class72.field1431.method358(arg0, -1);
            if (var2 == 0) {
                class199.field3943[arg0] = true;
                return true;
            }
            if (class63.field1309[arg0] == null) {
                class63.field1309[arg0] = new class193[var2];
            }
            for (int var3 = arg1; var3 < var2; var3++) {
                if (class63.field1309[arg0][var3] == null) {
                    byte[] var4 = class72.field1431.method353(arg0, var3, -127);
                    if (var4 != null) {
                        class63.field1309[arg0][var3] = new class193();
                        class63.field1309[arg0][var3].field3715 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            class63.field1309[arg0][var3].method1295(true, new class53(var4));
                        } else {
                            class63.field1309[arg0][var3].method1291((byte) -128, new class53(var4));
                        }
                    }
                }
            }
            class199.field3943[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V")
    public final synchronized void method1170(boolean arg0) {
        field3228++;
        if (this.field3251 == null) {
            return;
        }
        long var2 = class100.method748((byte) 35);
        if (arg0) {
            method1174(null, 59, false);
        }
        try {
            if (this.field3270 != 0L) {
                if (var2 < this.field3270) {
                    return;
                }
                this.method45(this.field3267);
                this.field3270 = 0L;
                this.field3257 = true;
            }
            int var4 = this.method47();
            int var5 = this.field3264 + this.field3260;
            if (this.field3271 - var4 > this.field3273) {
                this.field3273 = this.field3271 - var4;
            }
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field3267 < var5 + 256) {
                this.field3267 += 1024;
                if (this.field3267 > 16384) {
                    this.field3267 = 16384;
                }
                var4 = 0;
                this.method50();
                this.method45(this.field3267);
                this.field3257 = true;
                if (this.field3267 < var5 + 256) {
                    var5 = this.field3267 - 256;
                    this.field3264 = var5 - this.field3260;
                }
            }
            while (var4 < var5) {
                this.method1175(this.field3251, 256);
                this.method49();
                var4 += 256;
            }
            if (var2 > this.field3262) {
                if (this.field3257) {
                    this.field3257 = false;
                } else if (this.field3273 == 0 && this.field3259 == 0) {
                    this.method50();
                    this.field3270 = var2 + 2000L;
                    return;
                } else {
                    this.field3264 = Math.min(this.field3259, this.field3273);
                    this.field3259 = this.field3273;
                }
                this.field3273 = 0;
                this.field3262 = var2 + 2000L;
            }
            this.field3271 = var4;
        } catch (Exception var7) {
            this.method50();
            this.field3270 = var2 + 2000L;
        }
        try {
            if (this.field3235 + 500000L < var2) {
                var2 = this.field3235;
            }
            while (var2 > this.field3235 + 5000L) {
                this.method1176(256, (byte) -122);
                this.field3235 += 256000 / class161.field3075;
            }
        } catch (Exception var6) {
            this.field3235 = var2;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public final synchronized void method1171(int arg0) {
        if (class189.field3583 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class189.field3583.field3314[var3] == this) {
                    class189.field3583.field3314[var3] = null;
                }
                if (class189.field3583.field3314[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class189.field3583.field3323 = true;
                while (class189.field3583.field3325) {
                    class189.method1260(50L, 1);
                }
                class189.field3583 = null;
            }
        }
        if (arg0 != 0) {
            field3236 = 96;
        }
        field3237++;
        this.method50();
        this.field3251 = null;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
    public final synchronized void method1172(int arg0) {
        this.field3257 = true;
        field3242++;
        if (arg0 != 0) {
            this.method1171(15);
        }
        try {
            this.method51();
        } catch (Exception var2) {
            this.method50();
            this.field3270 = class100.method748((byte) 35) + 2000L;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "()V")
    public void method51() throws Exception {
        field3250++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public static final void method1173(byte arg0) {
        field3230++;
        if (class47.field861 != null) {
            class47.field861.method12((byte) -96);
            class47.field861 = null;
        }
        class22.method153((byte) 118);
        class131.field2556.method624();
        for (int var1 = 0; var1 < 4; var1++) {
            class46.field822[var1].method959(-8974);
        }
        int var2 = 108 / ((arg0 - 64) / 33);
        System.gc();
        class53.method418(0, 2);
        class185.field3567 = -1;
        class49.field913 = false;
        class151.method1025((byte) 44);
        class88.method695((byte) -125, 10);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lf;IZ)Z")
    public static final boolean method1174(class47 arg0, int arg1, boolean arg2) {
        field3249++;
        byte[] var3 = arg0.method352(arg1, 0);
        if (arg2) {
            method1178((byte) -125);
        }
        if (var3 == null) {
            return false;
        } else {
            class125.method894(-1, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "()V")
    public void method50() {
        field3229++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "([II)V")
    private final void method1175(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class139.field2713) {
            var3 = arg1 << 1;
        }
        class71.method567(arg0, 0, var3);
        this.field3258 -= arg1;
        if (this.field3246 != null && this.field3258 <= 0) {
            this.field3258 += class161.field3075 >> 4;
            class200.method1318(this.field3246, 91);
            this.method1182(true, this.field3246.method330(), this.field3246);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class173 var10 = null;
                        class173 var11 = this.field3261[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class205 var12 = var11.field3301;
                                if (var12 == null || var12.field4038 <= var8) {
                                    var11.field3303 = true;
                                    int var13 = var11.method313();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field4038 += var13;
                                    }
                                    if (var4 >= this.field3238) {
                                        break label107;
                                    }
                                    class173 var14 = var11.method312();
                                    if (var14 != null) {
                                        int var15 = var11.field3304;
                                        while (var14 != null) {
                                            this.method1182(true, var15 * var14.method330() >> 8, var14);
                                            var14 = var11.method304();
                                        }
                                    }
                                    class173 var16 = var11.field3302;
                                    var11.field3302 = null;
                                    if (var10 == null) {
                                        this.field3261[var7] = var16;
                                    } else {
                                        var10.field3302 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3269[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3302;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class173 var18 = this.field3261[var17];
                this.field3261[var17] = this.field3269[var17] = null;
                while (var18 != null) {
                    class173 var19 = var18.field3302;
                    var18.field3302 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3258 < 0) {
            this.field3258 = 0;
        }
        if (this.field3246 != null) {
            this.field3246.method311(arg0, 0, arg1);
        }
        this.field3235 = class100.method748((byte) 35);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)V")
    private final void method1176(int arg0, byte arg1) {
        this.field3258 -= arg0;
        if (this.field3258 < 0) {
            this.field3258 = 0;
        }
        if (this.field3246 != null) {
            this.field3246.method327(arg0);
        }
        field3252++;
        if (arg1 != -122) {
            this.field3271 = -32;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZ)Lnc;")
    public static final class120 method1177(int arg0, boolean arg1) {
        field3244++;
        class120 var2 = (class120) class5.field106.method64((byte) 28, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        class120 var3 = class189.method1257(arg0, class61.field1241, arg1, class203.field4010, (byte) 127);
        if (var3 != null) {
            class5.field106.method67(var3, 15266, (long) arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V")
    public static void method1178(byte arg0) {
        field3227 = null;
        field3239 = null;
        if (arg0 > -108) {
            return;
        }
        field3253 = null;
        field3254 = null;
        field3247 = null;
        field3272 = null;
        field3265 = null;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(B)V")
    public final void method1179(byte arg0) {
        this.field3257 = true;
        if (arg0 != -29) {
            this.method1176(91, (byte) 50);
        }
        field3256++;
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "()V")
    public void method49() throws Exception {
        field3226++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method48(Component arg0) throws Exception {
        field3268++;
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V")
    public static final void method1180(int arg0) {
        if (arg0 != -27053) {
            method1177(60, true);
        }
        for (class54 var1 = (class54) class103.field2017.method221(0); var1 != null; var1 = (class54) class103.field2017.method222(-83)) {
            int var2 = var1.field1023;
            if (method1169(var2, arg0 + 27053)) {
                boolean var3 = true;
                class193[] var4 = class63.field1309[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field3841;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field2541;
                    class193 var7 = class90.method701(-31355, var6);
                    if (var7 != null) {
                        class68.method550(var7, 15);
                    }
                }
            }
        }
        field3255++;
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(I)V")
    public void method45(int arg0) throws Exception {
        field3243++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIII)V")
    public static final void method1181(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 1) {
            method1168(33, null);
        }
        field3232++;
        class134 var5 = (class134) class79.field1606.method224(-1, (long) arg4);
        if (var5 == null) {
            var5 = new class134();
            class79.field1606.method216(var5, 12682, (long) arg4);
        }
        if (arg2 >= var5.field2595.length) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var8 < var5.field2595.length; var8++) {
                var6[var8] = var5.field2595[var8];
                var7[var8] = var5.field2594[var8];
            }
            for (int var9 = var5.field2595.length; var9 < arg2; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field2595 = var6;
            var5.field2594 = var7;
        }
        var5.field2595[arg2] = arg1;
        var5.field2594[arg2] = arg3;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZILtb;)V")
    private final void method1182(boolean arg0, int arg1, class173 arg2) {
        field3233++;
        int var4 = arg1 >> 5;
        class173 var5 = this.field3269[var4];
        if (var5 == null) {
            this.field3261[var4] = arg2;
        } else {
            var5.field3302 = arg2;
        }
        this.field3269[var4] = arg2;
        if (arg0) {
            arg2.field3304 = arg1;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILtb;)V")
    public final synchronized void method1183(int arg0, class173 arg1) {
        field3266++;
        this.field3246 = arg1;
        if (arg0 != 16128) {
            field3227 = null;
        }
    }
}

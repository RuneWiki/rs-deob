import java.awt.Component;
import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class120 {

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "Lca;")
    private class16 field3143 = null;

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "Lca;")
    private class16 field3148 = null;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    private int field3144 = 65000;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    private int field3125;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "Lfc;")
    private static class39 field3121 = class90.method774("slide:", -103);

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field3126 = 0;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public static int field3131 = 0;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "Lfc;")
    public static class39 field3137 = field3121;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "Lfc;")
    public static class39 field3132 = class90.method774(": ", -120);

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Lfc;")
    private static class39 field3124 = class90.method774("Error connecting to server)3", -99);

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "Lfc;")
    public static class39 field3135 = class90.method774("W-=hlen Sie eine Welt", -81);

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "Lfc;")
    private static class39 field3139 = class90.method774("Loaded interfaces", -106);

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "Lfc;")
    public static class39 field3136 = field3124;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "Lfc;")
    public static class39 field3146 = class90.method774("hel", -100);

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "Lfc;")
    public static class39 field3133 = field3121;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "Lfc;")
    public static class39 field3149 = field3139;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "Lfc;")
    public static class39 field3145 = class90.method774("backbase1", -96);

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "Lfc;")
    public static class39 field3134 = class90.method774("jolt", -99);

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "[I")
    public static int[] field3150 = new int[1000];

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "Llf;")
    public static class82 field3141;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "[[B")
    public static byte[][] field3119;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V", line = 36)
    public static final void method1025(boolean arg0) {
        if (arg0) {
            field3141 = null;
        }
        field3140++;
        for (class131 var1 = (class131) class43.field1162.method8(-1); var1 != null; var1 = (class131) class43.field1162.method9(1)) {
            if (var1.field3298 > 0) {
                var1.field3298--;
            }
            if (var1.field3298 != 0) {
                if (var1.field3305 > 0) {
                    var1.field3305--;
                }
                if (var1.field3305 == 0 && var1.field3295 >= 1 && var1.field3288 >= 1 && var1.field3295 <= 102 && var1.field3288 <= 102 && (var1.field3311 < 0 || class6.method91(10, var1.field3311, var1.field3307))) {
                    class17.method211(var1.field3303, var1.field3292, var1.field3311, var1.field3289, var1.field3307, var1.field3295, var1.field3288, -119);
                    var1.field3305 = -1;
                    if (var1.field3311 == var1.field3304 && var1.field3304 == -1) {
                        var1.method1170(85);
                    } else if (var1.field3311 == var1.field3304 && var1.field3294 == var1.field3289 && var1.field3312 == var1.field3307) {
                        var1.method1170(56);
                    }
                }
            } else if (var1.field3304 < 0 || class6.method91(10, var1.field3304, var1.field3312)) {
                class17.method211(var1.field3303, var1.field3292, var1.field3304, var1.field3294, var1.field3312, var1.field3295, var1.field3288, -21);
                var1.method1170(31);
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ltc;IIILjava/awt/Component;)Lve;", line = 105)
    public static final class147 method1026(class133 arg0, int arg1, int arg2, int arg3, Component arg4) {
        field3123++;
        if (class93.field2181 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class147 var5 = (class147) Class.forName("w").getDeclaredConstructor().newInstance();
                var5.field3668 = new int[(class12.field319 ? 2 : 1) * 256];
                var5.field3689 = arg3;
                var5.method783(arg4);
                var5.field3684 = (arg3 & 0xFFFFFC00) + 1024;
                if (var5.field3684 > 16384) {
                    var5.field3684 = 16384;
                }
                var5.method781(var5.field3684);
                if (class151.field3738 > 0 && class43.field1173 == null) {
                    class43.field1173 = new class30();
                    arg0.method1087(class151.field3738, class43.field1173, (byte) 125);
                }
                if (class43.field1173 != null) {
                    if (class43.field1173.field847[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class43.field1173.field847[arg2] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class91 var6 = new class91(arg0, arg2);
                    var6.field3668 = new int[(class12.field319 ? 2 : 1) * 256];
                    var6.field3689 = arg3;
                    var6.method783(arg4);
                    var6.field3684 = 16384;
                    var6.method781(var6.field3684);
                    if (class151.field3738 > 0 && class43.field1173 == null) {
                        class43.field1173 = new class30();
                        arg0.method1087(class151.field3738, class43.field1173, (byte) 125);
                    }
                    if (class43.field1173 != null) {
                        if (class43.field1173.field847[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class43.field1173.field847[arg2] = var6;
                    }
                    if (arg1 != 2) {
                        method1027((byte) -9);
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class147();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V", line = 189)
    public static void method1027(byte arg0) {
        field3145 = null;
        field3149 = null;
        field3139 = null;
        field3132 = null;
        field3136 = null;
        field3133 = null;
        if (arg0 != -29) {
            method1026(null, -88, 123, -78, null);
        }
        field3119 = null;
        field3141 = null;
        field3150 = null;
        field3146 = null;
        field3135 = null;
        field3121 = null;
        field3137 = null;
        field3124 = null;
        field3134 = null;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(ILca;Lca;I)V", line = 654)
    public class120(int arg0, class16 arg1, class16 arg2, int arg3) {
        this.field3125 = arg0;
        this.field3148 = arg2;
        this.field3143 = arg1;
        this.field3144 = arg3;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 228)
    public static final void method1028(int arg0) {
        field3127++;
        class147.field3662++;
        class89.method763(true, 33538048);
        class43.method503(true, 1000000);
        class89.method763(false, 33538048);
        class43.method503(false, arg0 + 1013968);
        class5.method82((byte) -118);
        class3.method24(-82);
        if (!class97.field2292) {
            int var1 = class114.field2990;
            if (var1 < class115.field3012 / 256) {
                var1 = class115.field3012 / 256;
            }
            if (class90.field2134[4] && class15.field394[4] + 128 > var1) {
                var1 = class15.field394[4] + 128;
            }
            int var2 = class62.field1532 + class116.field3063 & 0x7FF;
            class3.method29(var1, class153.method1225(128, class94.field2197.field2909, class24.field661, class94.field2197.field2916) - 50, class139.field3520, var1 * 3 + 600, var2, class124.field3186, (byte) -119);
        }
        int var3;
        if (class97.field2292) {
            var3 = class38.method427(-1146);
        } else {
            var3 = class35.method408(-114);
        }
        int var4 = class87.field2022;
        int var5 = class104.field2631;
        int var6 = class78.field1778;
        int var7 = class39.field1104;
        int var8 = class121.field3160;
        for (int var9 = 0; var9 < 5; var9++) {
            if (class90.field2134[var9]) {
                int var10 = (int) (Math.random() * (double) (class88.field2061[var9] * 2 + 1) + Math.sin((double) class71.field1665[var9] / 100.0D * (double) class13.field342[var9]) * (double) class15.field394[var9] - (double) class88.field2061[var9]);
                if (var9 == 2) {
                    class78.field1778 += var10;
                }
                if (var9 == 4) {
                    class39.field1104 += var10;
                    if (class39.field1104 < 128) {
                        class39.field1104 = 128;
                    }
                    if (class39.field1104 > 383) {
                        class39.field1104 = 383;
                    }
                }
                if (var9 == 3) {
                    class121.field3160 = class121.field3160 + var10 & 0x7FF;
                }
                if (var9 == 1) {
                    class104.field2631 += var10;
                }
                if (var9 == 0) {
                    class87.field2022 += var10;
                }
            }
        }
        class35.method403(arg0 ^ arg0);
        class23.field624 = class131.field3322 - 4;
        class23.field630 = 0;
        class23.field616 = true;
        class23.field617 = class12.field314 - 4;
        class121.method1036((byte) 61);
        class152.method1217();
        class121.method1036((byte) 61);
        class139.field3503.method66(class87.field2022, class104.field2631, class78.field1778, class39.field1104, class121.field3160, var3);
        class121.method1036((byte) 61);
        class139.field3503.method69();
        class36.method419((byte) 20);
        class142.method1161((byte) -103);
        ((class87) class40.field1110).method736((byte) -123, client.field547);
        class117.method1020((byte) -87);
        if (class107.field2703 && class80.method688(114, false, true) == 0) {
            class107.field2703 = false;
        }
        if (class107.field2703) {
            class35.method403(0);
            class152.method1217();
            class131.method1066(null, class2.field45, false, 257);
        }
        class121.method1036((byte) 61);
        class10.method138(-1);
        class104.field2631 = var5;
        class87.field2022 = var4;
        class121.field3160 = var8;
        class39.field1104 = var7;
        class78.field1778 = var6;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[BIIZ)Z", line = 349)
    private final boolean method1029(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        field3130++;
        class16 var6 = this.field3143;
        synchronized (this.field3143) {
            try {
                int var7;
                if (arg4) {
                    if (this.field3148.method204(arg3) < (long) (arg2 * 6 + 6)) {
                        return false;
                    }
                    this.field3148.method205((byte) -75, (long) (arg2 * 6));
                    this.field3148.method198(6, (byte) 0, 0, class137.field3438);
                    var7 = ((class137.field3438[4] & 0xFF) << 8) + ((class137.field3438[3] & 0xFF) << 16) + (class137.field3438[5] & 0xFF);
                    if (var7 <= 0 || this.field3143.method204(arg3) / 520L < (long) var7) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field3143.method204(-1) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class137.field3438[0] = (byte) (arg0 >> 16);
                int var10 = 0;
                class137.field3438[5] = (byte) var7;
                class137.field3438[1] = (byte) (arg0 >> 8);
                class137.field3438[4] = (byte) (var7 >> 8);
                class137.field3438[3] = (byte) (var7 >> 16);
                class137.field3438[2] = (byte) arg0;
                this.field3148.method205((byte) 110, (long) (arg2 * 6));
                int var11 = 0;
                if (arg3 != -1) {
                    field3121 = null;
                }
                this.field3148.method202(class137.field3438, (byte) 115, 6, 0);
                while (arg0 > var10) {
                    int var12 = 0;
                    if (arg4) {
                        label109: {
                            this.field3143.method205((byte) 95, (long) (var7 * 520));
                            try {
                                this.field3143.method198(8, (byte) 0, 0, class137.field3438);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = ((class137.field3438[4] & 0xFF) << 16) + (class137.field3438[6] & 0xFF) + ((class137.field3438[5] & 0xFF) << 8);
                            int var13 = ((class137.field3438[2] & 0xFF) << 8) + (class137.field3438[3] & 0xFF);
                            int var14 = ((class137.field3438[0] & 0xFF) << 8) + (class137.field3438[1] & 0xFF);
                            int var15 = class137.field3438[7] & 0xFF;
                            if (arg2 == var14 && var11 == var13 && this.field3125 == var15) {
                                if (var12 >= 0 && this.field3143.method204(arg3) / 520L >= (long) var12) {
                                    break label109;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        var12 = (int) ((this.field3143.method204(arg3) + 519L) / 520L);
                        arg4 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class137.field3438[0] = (byte) (arg2 >> 8);
                    class137.field3438[1] = (byte) arg2;
                    int var18 = arg0 - var10;
                    class137.field3438[3] = (byte) var11;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    if (arg0 - var10 <= 512) {
                        var12 = 0;
                    }
                    class137.field3438[5] = (byte) (var12 >> 8);
                    class137.field3438[6] = (byte) var12;
                    class137.field3438[4] = (byte) (var12 >> 16);
                    class137.field3438[2] = (byte) (var11 >> 8);
                    class137.field3438[7] = (byte) this.field3125;
                    this.field3143.method205((byte) -36, (long) (var7 * 520));
                    var11++;
                    var7 = var12;
                    this.field3143.method202(class137.field3438, (byte) -117, 8, 0);
                    this.field3143.method202(arg1, (byte) 56, var18, var10);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)[B", line = 474)
    public final byte[] method1030(int arg0, int arg1) {
        field3122++;
        class16 var3 = this.field3143;
        synchronized (this.field3143) {
            try {
                if (this.field3148.method204(-1) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field3148.method205((byte) 62, (long) (arg1 * 6));
                this.field3148.method198(6, (byte) 0, 0, class137.field3438);
                int var5 = (class137.field3438[2] & 0xFF) + ((class137.field3438[1] & 0xFF) << 8) + ((class137.field3438[0] & 0xFF) << 16);
                int var6 = ((class137.field3438[4] & 0xFF) << 8) + ((class137.field3438[3] & 0xFF) << 16) + (class137.field3438[5] & 0xFF);
                if (var5 < arg0 || this.field3144 < var5) {
                    return null;
                } else if (var6 > 0 && this.field3143.method204(-1) / 520L >= (long) var6) {
                    byte[] var9 = new byte[var5];
                    int var10 = 0;
                    int var11 = 0;
                    while (var5 > var10) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field3143.method205((byte) 41, (long) (var6 * 520));
                        int var13 = var5 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3143.method198(var13 + 8, (byte) 0, 0, class137.field3438);
                        int var14 = class137.field3438[7] & 0xFF;
                        int var15 = (class137.field3438[6] & 0xFF) + ((class137.field3438[5] & 0xFF) << 8) + ((class137.field3438[4] & 0xFF) << 16);
                        int var16 = ((class137.field3438[2] & 0xFF) << 8) + (class137.field3438[3] & 0xFF);
                        int var17 = ((class137.field3438[0] & 0xFF) << 8) + (class137.field3438[1] & 0xFF);
                        if (arg1 == var17 && var11 == var16 && this.field3125 == var14) {
                            if (var15 >= 0 && this.field3143.method204(-1) / 520L >= (long) var15) {
                                var6 = var15;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class137.field3438[var20 + 8];
                                }
                                var11++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "toString", descriptor = "()Ljava/lang/String;", line = 553)
    public final String toString() {
        field3129++;
        return "Cache:" + this.field3125;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)Lue;", line = 563)
    public static final class141 method1031(int arg0) {
        field3120++;
        class141 var1 = new class141();
        var1.field3545 = class72.field1686[0];
        var1.field3543 = class101.field2515[0];
        var1.field3544 = class15.field395[0];
        var1.field3542 = class1.field3;
        int var2 = 1 % ((14 - arg0) / 46);
        var1.field3548 = class44.field1189;
        var1.field3546 = class115.field3026[0];
        var1.field3547 = class131.field3287[0];
        var1.field3549 = class1.field27;
        class114.method994(-78);
        return var1;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[BII)Z", line = 615)
    public final boolean method1032(int arg0, byte[] arg1, int arg2, int arg3) {
        field3128++;
        class16 var5 = this.field3143;
        synchronized (this.field3143) {
            if (arg0 < 0 || arg0 > this.field3144) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1029(arg0, arg1, arg3, arg2, true);
            if (!var6) {
                var6 = this.method1029(arg0, arg1, arg3, arg2, false);
            }
            return var6;
        }
    }
}

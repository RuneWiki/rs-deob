import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class137 implements class26 {

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Z")
    private boolean field3143 = true;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field3136 = 0;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "Lvc;")
    public static class137 field3138 = class45.method325("Unerwartete Antwort vom Anmelde)2Server)3", -46);

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "Lvc;")
    private static class137 field3159 = class45.method325("Login", -46);

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "Lvc;")
    public static class137 field3178 = class45.method325("Bitte versuchen Sie es erneut)3", -46);

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "Lvc;")
    public static class137 field3160 = field3159;

    @OriginalMember(owner = "client!vc", name = "cb", descriptor = "I")
    public static int field3188 = 0;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "I")
    private int field3175;

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!vc", name = "U", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!vc", name = "V", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!vc", name = "W", descriptor = "I")
    public int field3182;

    @OriginalMember(owner = "client!vc", name = "X", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!vc", name = "Y", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!vc", name = "Z", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!vc", name = "ab", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!vc", name = "bb", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!vc", name = "db", descriptor = "I")
    public static int field3189;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vc", name = "eb", descriptor = "Ljava/lang/Class;")
    public static Class field3190;

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "[B")
    public byte[] field3176;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "[Lvd;")
    public static class138[] field3163;

    @OriginalMember(owner = "client!vc", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
    public final boolean equals(Object arg0) {
        field3169++;
        if (!(arg0 instanceof class137)) {
            throw new IllegalArgumentException();
        }
        return this.method1026(-1, (class137) arg0);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static void method994(int arg0) {
        field3178 = null;
        field3163 = null;
        field3160 = null;
        int var1 = 23 % ((arg0 - 36) / 49);
        field3138 = null;
        field3159 = null;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)I")
    public final int method995(int arg0) {
        field3153++;
        if (arg0 > -106) {
            field3138 = null;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3182; var3++) {
            var2 = (var2 << 5) + (this.field3176[var3] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)Z")
    public static final boolean method996(int arg0, int arg1, int arg2) {
        field3151++;
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        class126 var3 = class114.method886(6, arg2);
        return arg1 == 17413 ? var3.method942((byte) 15, arg0) : false;
    }

    @OriginalMember(owner = "client!vc", name = "hashCode", descriptor = "()I")
    public final int hashCode() {
        field3171++;
        return this.method995(-114);
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)I")
    public final int method997(int arg0) {
        int var2 = -58 / ((56 - arg0) / 48);
        field3134++;
        return this.field3182;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILvc;)Z")
    public final boolean method998(int arg0, class137 arg1) {
        field3141++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 != 4204) {
            field3136 = 121;
        }
        if (this.field3182 != arg1.field3182) {
            return false;
        }
        for (int var3 = 0; var3 < this.field3182; var3++) {
            byte var4 = this.field3176[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            byte var5 = arg1.field3176[var3];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 != var5) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)J")
    private final long method999(int arg0) {
        field3135++;
        long var2 = 0L;
        if (arg0 < 53) {
            this.method997(-70);
        }
        for (int var4 = 0; var4 < this.field3182; var4++) {
            var2 = (var2 << 5) + (long) (this.field3176[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)Lvc;")
    public final class137 method1000(int arg0) {
        if (arg0 < 1) {
            this.field3176 = null;
        }
        field3144++;
        class137 var2 = new class137();
        var2.field3182 = this.field3182;
        var2.field3176 = new byte[this.field3182];
        for (int var3 = 0; var3 < this.field3182; var3++) {
            var2.field3176[var3] = 42;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lvc;I)Z")
    public final boolean method1001(class137 arg0, int arg1) {
        field3158++;
        if (this.field3182 < arg0.field3182) {
            return false;
        }
        int var3 = this.field3182 - arg0.field3182;
        if (arg1 >= -1) {
            this.field3175 = 121;
        }
        for (int var4 = 0; var4 < arg0.field3182; var4++) {
            if (this.field3176[var3 + var4] != arg0.field3176[var4]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)Lvc;")
    public final class137 method1002(byte arg0) {
        field3172++;
        long var2 = this.method999(arg0 ^ 0xFFFFFFE2);
        synchronized (field3190 == null ? (field3190 = method1036("vc")) : field3190) {
            if (class91.field2159 == null) {
                class91.field2159 = new class112(4096);
            } else {
                for (class119 var5 = (class119) class91.field2159.method867(var2, false); var5 != null; var5 = (class119) class91.field2159.method869(-29726)) {
                    if (this.method1026(-1, var5.field2787)) {
                        return var5.field2787;
                    }
                }
            }
            class119 var7 = new class119();
            if (arg0 != -95) {
                this.method1027(null, 106);
            }
            this.field3143 = false;
            var7.field2787 = this;
            class91.field2159.method873(var2, 124, var7);
            return this;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lvc;B)I")
    public final int method1003(class137 arg0, byte arg1) {
        field3173++;
        if (arg1 >= -47) {
            this.method1014(null, (byte) 28);
        }
        return this.method1012(arg0, (byte) 115, 0);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)Lvc;")
    public final class137 method1004(int arg0, int arg1) {
        field3157++;
        if (~arg1 >= arg0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class137 var3 = new class137();
        var3.field3176 = new byte[this.field3182 + 1];
        var3.field3182 = this.field3182 + 1;
        class130.method962(this.field3176, 0, var3.field3176, 0, this.field3182);
        var3.field3176[this.field3182] = (byte) arg1;
        return var3;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)Lvc;")
    public final class137 method1005(byte arg0) {
        class137 var2 = new class137();
        var2.field3182 = this.field3182;
        field3164++;
        var2.field3176 = new byte[this.field3182];
        if (arg0 != 98) {
            method994(-55);
        }
        for (int var3 = 0; var3 < this.field3182; var3++) {
            byte var4 = this.field3176[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field3176[var3] = var4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(B)[B")
    public final byte[] method1006(byte arg0) {
        field3155++;
        int var2 = -79 / ((arg0 + 39) / 38);
        byte[] var3 = new byte[this.field3182];
        class130.method962(this.field3176, 0, var3, 0, this.field3182);
        return var3;
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(B)Lvc;")
    public final class137 method1007(byte arg0) {
        field3183++;
        if (arg0 >= -11) {
            this.field3143 = true;
        }
        if (!this.field3143) {
            throw new IllegalArgumentException();
        }
        this.field3175 = 0;
        if (this.field3176.length != this.field3182) {
            byte[] var2 = new byte[this.field3182];
            class130.method962(this.field3176, 0, var2, 0, this.field3182);
            this.field3176 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILve;II)V")
    public static final void method1008(int arg0, int arg1, class139 arg2, int arg3, int arg4) {
        field3147++;
        if (class59.field1270 >= 400) {
            return;
        }
        if (arg2.field3218 != null) {
            arg2 = arg2.method1065(false);
        }
        if (arg2 == null || !arg2.field3209) {
            return;
        }
        class137 var5 = arg2.field3202;
        if (arg2.field3252 != 0) {
            var5 = class88.method666(118, new class137[] { var5, class132.method968(arg2.field3252, (byte) 116, class104.field2412.field2877), class29.field641, class10.field199, class61.method435(arg2.field3252, 78), class45.field987 });
        }
        if (class98.field2288 == 1) {
            class131.field3050++;
            class71.method498(31, class88.method666(119, new class137[] { class111.field2644, class129.field3033, var5 }), arg4, arg0, 2916, arg1, class37.field825);
        } else if (!class39.field865) {
            class137[] var6 = arg2.field3227;
            if (class129.field3025) {
                var6 = class80.method592(var6, false);
            }
            class2.field42++;
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method998(4204, class40.field918)) {
                        class56.field1199++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 42;
                        }
                        if (var7 == 1) {
                            var8 = 1;
                        }
                        if (var7 == 2) {
                            var8 = 23;
                        }
                        if (var7 == 3) {
                            var8 = 22;
                        }
                        if (var7 == 4) {
                            var8 = 9;
                        }
                        class71.method498(var8, class88.method666(-48, new class137[] { class123.field2844, var5 }), arg4, arg0, 2916, arg1, var6[var7]);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method998(4204, class40.field918)) {
                        class119.field2778++;
                        short var10 = 0;
                        if (arg2.field3252 > class104.field2412.field2877) {
                            var10 = 2000;
                        }
                        int var11 = 0;
                        if (var9 == 0) {
                            var11 = var10 + 42;
                        }
                        if (var9 == 1) {
                            var11 = var10 + 1;
                        }
                        if (var9 == 2) {
                            var11 = var10 + 23;
                        }
                        if (var9 == 3) {
                            var11 = var10 + 22;
                        }
                        if (var9 == 4) {
                            var11 = var10 + 9;
                        }
                        class71.method498(var11, class88.method666(-62, new class137[] { class123.field2844, var5 }), arg4, arg0, 2916, arg1, var6[var9]);
                    }
                }
            }
            class71.method498(1004, class88.method666(114, new class137[] { class123.field2844, var5 }), arg4, arg0, 2916, arg1, class86.field2054);
        } else if ((class29.field653 & 0x2) == 2) {
            class77.field1708++;
            class71.method498(12, class88.method666(-27, new class137[] { class13.field281, class129.field3033, var5 }), arg4, arg0, 2916, arg1, class99.field2302);
        }
        if (arg3 < 92) {
            field3163 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)Lvc;")
    public final class137 method1009(int arg0) {
        field3180++;
        class137 var2 = new class137();
        var2.field3176 = new byte[12];
        int var3 = 0;
        var2.field3182 = 0;
        if (arg0 != 327) {
            field3188 = -20;
        }
        for (int var4 = 0; var4 < this.field3182; var4++) {
            if (this.field3176[var4] >= 65 && this.field3176[var4] <= 90) {
                var2.field3176[var3++] = (byte) (this.field3176[var4] + 97 - 65);
                var2.field3182 = var3;
            } else if (this.field3176[var4] >= 97 && this.field3176[var4] <= 122 || this.field3176[var4] >= 48 && this.field3176[var4] <= 57) {
                var2.field3176[var3++] = this.field3176[var4];
                var2.field3182 = var3;
            } else if (var3 > 0) {
                var2.field3176[var3++] = 95;
            }
            if (var3 == 12) {
                break;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "(I)Lvc;")
    public final class137 method1010(int arg0) {
        field3177++;
        if (arg0 <= 45) {
            this.method1001(null, -1);
        }
        boolean var2 = true;
        class137 var3 = new class137();
        var3.field3182 = this.field3182;
        var3.field3176 = new byte[this.field3182];
        for (int var4 = 0; var4 < this.field3182; var4++) {
            byte var5 = this.field3176[var4];
            if (var5 >= 97 && var5 <= 122 || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var2) {
                    var5 = (byte) (var5 - 32);
                }
                var2 = false;
            } else if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                if (!var2) {
                    var5 = (byte) (var5 + 32);
                }
                var2 = false;
            }
            if (var5 == 46 || var5 == 33 || var5 == 63) {
                var2 = true;
            }
            var3.field3176[var4] = var5;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIBII)V")
    public static final void method1011(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class82 var5 = (class82) class84.field1899.method867((long) arg1, false);
        field3168++;
        if (var5 == null) {
            var5 = new class82();
            class84.field1899.method873((long) arg1, 126, var5);
        }
        if (arg3 >= var5.field1849.length) {
            int[] var6 = new int[arg3 + 1];
            int[] var7 = new int[arg3 + 1];
            for (int var8 = 0; var8 < var5.field1849.length; var8++) {
                var6[var8] = var5.field1849[var8];
                var7[var8] = var5.field1847[var8];
            }
            for (int var9 = var5.field1849.length; var9 < arg3; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field1847 = var7;
            var5.field1849 = var6;
        }
        var5.field1849[arg3] = arg4;
        if (arg2 >= -18) {
            field3159 = null;
        }
        var5.field1847[arg3] = arg0;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lvc;BI)I")
    private final int method1012(class137 arg0, byte arg1, int arg2) {
        field3166++;
        int[] var4 = new int[arg0.field3182];
        int[] var5 = new int[arg0.field3182];
        int[] var6 = new int[256];
        if (arg1 < 111) {
            return -21;
        }
        for (int var7 = 0; var7 < var6.length; var7++) {
            var6[var7] = arg0.field3182;
        }
        for (int var8 = 1; var8 <= arg0.field3182; var8++) {
            var4[var8 - 1] = (arg0.field3182 << 1) - var8;
            var6[class45.method323(arg0.field3176[var8 - 1], 255)] = arg0.field3182 - var8;
        }
        int var9 = arg0.field3182 + 1;
        for (int var10 = arg0.field3182; var10 > 0; var10--) {
            var5[var10 - 1] = var9;
            while (var9 <= arg0.field3182 && arg0.field3176[var9 - 1] != arg0.field3176[var10 - 1]) {
                if (arg0.field3182 - var10 <= var4[var9 + -1]) {
                    var4[var9 - 1] = arg0.field3182 - var10;
                }
                var9 = var5[var9 - 1];
            }
            var9--;
        }
        int var11 = var9;
        int var12 = 1;
        int var13 = arg0.field3182 + 1 - var9;
        int var14 = 0;
        for (int var15 = 1; var15 <= var13; var15++) {
            var5[var15 - 1] = var14;
            while (var14 >= 1 && arg0.field3176[var14 - 1] != arg0.field3176[var15 - 1]) {
                var14 = var5[var14 - 1];
            }
            var14++;
        }
        while (var11 < arg0.field3182) {
            for (int var18 = var12; var18 <= var11; var18++) {
                if (arg0.field3182 + var11 - var18 <= var4[var18 + -1]) {
                    var4[var18 - 1] = var11 + arg0.field3182 - var18;
                }
            }
            var12 = var11 + 1;
            var11 = var11 + var13 - var5[var13 + -1];
            var13 = var5[var13 - 1];
        }
        int var17;
        for (int var16 = arg2 + arg0.field3182 - 1; var16 < this.field3182; var16 += Math.max(var6[this.field3176[var16] & 0xFF], var4[var17])) {
            for (var17 = arg0.field3182 - 1; var17 >= 0 && this.field3176[var16] == arg0.field3176[var17]; var17--) {
                var16--;
            }
            if (var17 == -1) {
                return var16 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIB)Lvc;")
    public final class137 method1013(int arg0, int arg1, byte arg2) {
        field3184++;
        class137 var4 = new class137();
        var4.field3176 = new byte[arg0 - arg1];
        var4.field3182 = arg0 - arg1;
        if (arg2 < 21) {
            return null;
        } else {
            class130.method962(this.field3176, arg1, var4.field3176, 0, var4.field3182);
            return var4;
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(Lvc;B)Z")
    public final boolean method1014(class137 arg0, byte arg1) {
        field3165++;
        if (arg1 < 16) {
            field3160 = null;
        }
        if (this.field3182 < arg0.field3182) {
            return false;
        }
        for (int var3 = 0; var3 < arg0.field3182; var3++) {
            if (this.field3176[var3] != arg0.field3176[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "(I)V")
    public static final void method1015(int arg0) {
        int var1 = -56 / ((arg0 - 45) / 38);
        field3162++;
        try {
            Graphics var2 = class124.field2871.getGraphics();
            class4.field104.method61(4, var2, 4, (byte) -32);
        } catch (Exception var3) {
            class124.field2871.repaint();
        }
    }

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(B)Lvc;")
    public final class137 method1016(byte arg0) {
        field3145++;
        class137 var2 = new class137();
        var2.field3182 = this.field3182;
        boolean var3 = true;
        if (arg0 < 106) {
            this.method1033((byte) -68, 98, 120);
        }
        var2.field3176 = new byte[this.field3182];
        for (int var4 = 0; var4 < this.field3182; var4++) {
            byte var5 = this.field3176[var4];
            if (var5 == 95) {
                var2.field3176[var4] = 32;
                var3 = true;
            } else if (var5 >= 97 && var5 <= 122 && var3) {
                var2.field3176[var4] = (byte) (var5 - 32);
                var3 = false;
            } else {
                var3 = false;
                var2.field3176[var4] = var5;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)I")
    public final int method1017(int arg0, int arg1) {
        field3149++;
        if (arg1 < 18) {
            this.field3182 = -76;
        }
        return this.field3176[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([BIIII)I")
    public final int method1018(byte[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field3137++;
        class130.method962(this.field3176, arg4, arg0, arg2, arg1 - arg4);
        return arg3 == 65 ? arg1 - arg4 : -42;
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(II)Z")
    private final boolean method1019(int arg0, int arg1) {
        boolean var3 = false;
        if (arg1 < 34) {
            return false;
        }
        field3187++;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        boolean var4 = false;
        int var5 = 0;
        for (int var6 = 0; var6 < this.field3182; var6++) {
            int var7 = this.field3176[var6] & 0xFF;
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
            if (var7 >= arg0) {
                return false;
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg0 * var5 + var7;
            if (var8 / arg0 != var5) {
                return false;
            }
            var4 = true;
            var5 = var8;
        }
        return var4;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZB[B)Ljava/lang/Object;")
    public static final Object method1020(boolean arg0, byte arg1, byte[] arg2) {
        field3170++;
        if (arg1 != 10) {
            field3188 = 14;
        }
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136) {
            try {
                class32 var3 = (class32) Class.forName("jd").getDeclaredConstructor().newInstance();
                var3.method237(56, arg2);
                return var3;
            } catch (Throwable var4) {
            }
        }
        return arg0 ? class35.method254(false, arg2) : arg2;
    }

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "(I)I")
    public final int method1021(int arg0) {
        if (arg0 != 48) {
            this.field3175 = -123;
        }
        field3150++;
        return this.method1023(-9568, 10);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I")
    public final int method1022(int arg0, FontMetrics arg1) {
        String var3;
        try {
            var3 = new String(this.field3176, arg0, this.field3182, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var3 = new String(this.field3176, 0, this.field3182);
        }
        field3142++;
        return arg1.stringWidth(var3);
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(II)I")
    private final int method1023(int arg0, int arg1) {
        field3140++;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        if (arg0 != -9568) {
            field3160 = null;
        }
        for (int var6 = 0; var6 < this.field3182; var6++) {
            int var7 = this.field3176[var6] & 0xFF;
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
            if (arg1 <= var7) {
                throw new NumberFormatException();
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
                throw new NumberFormatException();
            }
            var5 = var8;
            var4 = true;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(II)Lvc;")
    public final class137 method1024(int arg0, int arg1) {
        field3139++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        } else if (this.field3143) {
            this.field3175 = arg1;
            if (this.field3176.length == this.field3182) {
                int var3;
                for (var3 = 1; var3 <= this.field3182; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class130.method962(this.field3176, 0, var4, 0, this.field3182);
                this.field3176 = var4;
            }
            this.field3176[this.field3182++] = (byte) arg0;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILvc;)Lvc;")
    public final class137 method1025(int arg0, int arg1, class137 arg2) {
        field3152++;
        if (!this.field3143) {
            throw new IllegalArgumentException();
        }
        if (arg1 < 89) {
            this.method1002((byte) -37);
        }
        if (this.field3182 < arg0) {
            throw new IllegalArgumentException();
        }
        this.field3175 = 0;
        if (arg0 + arg2.field3182 > this.field3176.length) {
            int var4;
            for (var4 = 1; var4 < arg0 + arg2.field3182; var4 += var4) {
            }
            byte[] var5 = new byte[var4];
            class130.method962(this.field3176, 0, var5, 0, this.field3182);
            this.field3176 = var5;
        }
        class130.method962(arg2.field3176, 0, this.field3176, arg0, arg2.field3182);
        if (arg2.field3182 + arg0 > this.field3182) {
            this.field3182 = arg0 + arg2.field3182;
        }
        return this;
    }

    @OriginalMember(owner = "client!vc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3181++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(ILvc;)Z")
    public final boolean method1026(int arg0, class137 arg1) {
        if (arg0 != -1) {
            return false;
        }
        field3156++;
        if (arg1 == null) {
            return false;
        } else if (this.field3182 == arg1.field3182) {
            if (!this.field3143 || !arg1.field3143) {
                if (this.field3175 == 0) {
                    this.field3175 = this.method995(-125);
                    if (this.field3175 == 0) {
                        this.field3175 = 1;
                    }
                }
                if (arg1.field3175 == 0) {
                    arg1.field3175 = arg1.method995(-119);
                    if (arg1.field3175 == 0) {
                        arg1.field3175 = 1;
                    }
                }
                if (this.field3175 != arg1.field3175) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field3182; var3++) {
                if (this.field3176[var3] != arg1.field3176[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(Lvc;I)Lvc;")
    public final class137 method1027(class137 arg0, int arg1) {
        field3189++;
        if (!this.field3143) {
            throw new IllegalArgumentException();
        }
        this.field3175 = 0;
        if (this.field3176.length < this.field3182 + arg0.field3182) {
            int var3;
            for (var3 = 1; var3 < this.field3182 + arg0.field3182; var3 += var3) {
            }
            byte[] var4 = new byte[var3];
            class130.method962(this.field3176, 0, var4, 0, this.field3182);
            this.field3176 = var4;
        }
        if (arg1 == 30241) {
            class130.method962(arg0.field3176, 0, this.field3176, this.field3182, arg0.field3182);
            this.field3182 += arg0.field3182;
            return this;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "(I)Z")
    public final boolean method1028(int arg0) {
        if (arg0 != 14247) {
            this.method1034(23);
        }
        field3154++;
        return this.method1019(10, 73);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILjava/awt/Graphics;IB)V")
    public final void method1029(int arg0, Graphics arg1, int arg2, byte arg3) {
        String var5;
        try {
            var5 = new String(this.field3176, 0, this.field3182, "ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var5 = new String(this.field3176, 0, this.field3182);
        }
        field3186++;
        if (arg3 == -3) {
            arg1.drawString(var5, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "(I)J")
    public final long method1030(int arg0) {
        long var2 = 0L;
        if (arg0 != 65) {
            field3136 = -82;
        }
        for (int var4 = 0; var4 < this.field3182 && var4 < 12; var4++) {
            var2 *= 37L;
            byte var5 = this.field3176[var4];
            if (var5 >= 65 && var5 <= 90) {
                var2 += var5 - 64;
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += var5 - 96;
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += var5 + 27 - 48;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        field3161++;
        return var2;
    }

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "(II)I")
    public final int method1031(int arg0, int arg1) {
        if (arg1 == 0) {
            field3179++;
            return this.method1033((byte) 0, 0, arg0);
        } else {
            return -122;
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(Lvc;B)I")
    public final int method1032(class137 arg0, byte arg1) {
        field3185++;
        int var3;
        if (this.field3182 <= arg0.field3182) {
            var3 = this.field3182;
        } else {
            var3 = arg0.field3182;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (class32.field687[arg0.field3176[var4] & 0xFF] > class32.field687[this.field3176[var4] & 0xFF]) {
                return -1;
            }
            if (class32.field687[arg0.field3176[var4] & 0xFF] < class32.field687[this.field3176[var4] & 0xFF]) {
                return 1;
            }
        }
        if (arg1 >= -27) {
            return -13;
        } else if (this.field3182 < arg0.field3182) {
            return -1;
        } else if (this.field3182 > arg0.field3182) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BII)I")
    private final int method1033(byte arg0, int arg1, int arg2) {
        field3167++;
        int var4 = -35 % ((67 - arg0) / 58);
        byte var5 = (byte) arg2;
        for (int var6 = arg1; var6 < this.field3182; var6++) {
            if (this.field3176[var6] == var5) {
                return var6;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "(I)Lvc;")
    public final class137 method1034(int arg0) {
        field3148++;
        int var2 = this.field3182;
        if (arg0 <= 35) {
            field3178 = null;
        }
        int var3;
        for (var3 = 0; var3 < this.field3182 && (this.field3176[var3] >= 0 && this.field3176[var3] <= 32 || (this.field3176[var3] & 0xFF) == 160); var3++) {
        }
        while (var3 < var2 && (this.field3176[var2 - 1] >= 0 && this.field3176[var2 - 1] <= 32 || (this.field3176[var2 - 1] & 0xFF) == 160)) {
            var2--;
        }
        if (var3 == 0 && this.field3182 == var2) {
            return this;
        }
        class137 var4 = new class137();
        var4.field3182 = var2 - var3;
        var4.field3176 = new byte[var4.field3182];
        for (int var5 = 0; var5 < var4.field3182; var5++) {
            var4.field3176[var5] = this.field3176[var3 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "(II)Lvc;")
    public final class137 method1035(int arg0, int arg1) {
        if (arg0 != 1) {
            this.method1027(null, -38);
        }
        field3146++;
        return this.method1013(this.field3182, arg1, (byte) 114);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1036(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

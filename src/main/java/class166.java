import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class166 extends class35 {

    @OriginalMember(owner = "client!qg", name = "rb", descriptor = "I")
    private int field3205;

    @OriginalMember(owner = "client!qg", name = "cb", descriptor = "I")
    private int field3190;

    @OriginalMember(owner = "client!qg", name = "pb", descriptor = "I")
    private int field3203;

    @OriginalMember(owner = "client!qg", name = "nb", descriptor = "I")
    private int field3201;

    @OriginalMember(owner = "client!qg", name = "hb", descriptor = "I")
    private int field3195;

    @OriginalMember(owner = "client!qg", name = "tb", descriptor = "I")
    private int field3207;

    @OriginalMember(owner = "client!qg", name = "ab", descriptor = "Lri;")
    private class178 field3188;

    @OriginalMember(owner = "client!qg", name = "vb", descriptor = "I")
    private int field3209;

    @OriginalMember(owner = "client!qg", name = "eb", descriptor = "I")
    private int field3192;

    @OriginalMember(owner = "client!qg", name = "fb", descriptor = "Lrd;")
    public static class173 field3193 = class133.method843("hint_mapedge", 121);

    @OriginalMember(owner = "client!qg", name = "qb", descriptor = "Lrd;")
    private static class173 field3204 = class133.method843("Press (Wchange your password(W on front page)3", 43);

    @OriginalMember(owner = "client!qg", name = "ob", descriptor = "I")
    public static int field3202 = 0;

    @OriginalMember(owner = "client!qg", name = "db", descriptor = "Lrd;")
    private static class173 field3191 = class133.method843("No reply from loginserver)3", -79);

    @OriginalMember(owner = "client!qg", name = "mb", descriptor = "Lrd;")
    public static class173 field3200 = field3191;

    @OriginalMember(owner = "client!qg", name = "wb", descriptor = "I")
    public static int field3210 = 0;

    @OriginalMember(owner = "client!qg", name = "xb", descriptor = "Lrd;")
    public static class173 field3211 = field3204;

    @OriginalMember(owner = "client!qg", name = "bb", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!qg", name = "gb", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!qg", name = "ib", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!qg", name = "jb", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!qg", name = "kb", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!qg", name = "lb", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!qg", name = "sb", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!qg", name = "Z", descriptor = "Lbc;")
    public static class14 field3187;

    @OriginalMember(owner = "client!qg", name = "ub", descriptor = "Lsa;")
    public static class180 field3208;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lrd;ILrd;I)V")
    public static final void method1074(class173 arg0, int arg1, class173 arg2, int arg3) {
        field3197++;
        class97.method597(arg2, null, arg1, arg0, false);
        int var4 = -58 / ((arg3 - 6) / 62);
    }

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "(I)V")
    public static void method1075(int arg0) {
        field3204 = null;
        if (arg0 > -33) {
            method1076(false);
        }
        field3187 = null;
        field3208 = null;
        field3200 = null;
        field3193 = null;
        field3191 = null;
        field3211 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V")
    public static final void method1076(boolean arg0) {
        field3194++;
        if (!arg0) {
            field3211 = null;
        }
        for (int var1 = 0; var1 < class73.field1421; var1++) {
            int var10002 = class164.field3027[var1]--;
            if (class164.field3027[var1] >= -10) {
                class154 var3 = class178.field3490[var1];
                if (var3 == null) {
                    var3 = class154.method1017(class74.field1444, class92.field1741[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class164.field3027[var1] += var3.method1019();
                    class178.field3490[var1] = var3;
                }
                if (class164.field3027[var1] < 0) {
                    int var10;
                    if (class119.field2187[var1] == 0) {
                        var10 = class7.field133;
                    } else {
                        int var4 = (class119.field2187[var1] & 0xFF) * 128;
                        int var5 = class119.field2187[var1] >> 8 & 0xFF;
                        int var6 = var5 * 128 + 64 - class175.field3447.field2801;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var7 = class119.field2187[var1] >> 16 & 0xFF;
                        int var8 = var7 * 128 + 64 - class175.field3447.field2820;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var6 + var8 - 128;
                        if (var9 > var4) {
                            class164.field3027[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class31.field667 / var4;
                    }
                    if (var10 > 0) {
                        class142 var11 = var3.method1016().method901(class182.field3573);
                        class146 var12 = class146.method955(var11, 100, var10);
                        var12.method944(class20.field456[var1] - 1);
                        class171.field3308.method685(var12);
                    }
                    class164.field3027[var1] = -100;
                }
            } else {
                class73.field1421--;
                for (int var2 = var1; var2 < class73.field1421; var2++) {
                    class92.field1741[var2] = class92.field1741[var2 + 1];
                    class178.field3490[var2] = class178.field3490[var2 + 1];
                    class20.field456[var2] = class20.field456[var2 + 1];
                    class164.field3027[var2] = class164.field3027[var2 + 1];
                    class119.field2187[var2] = class119.field2187[var2 + 1];
                }
                var1--;
            }
        }
        if (class138.field2588 && !class114.method705(!arg0)) {
            if (class211.field4079 != 0 && class170.field3282 != -1) {
                class103.method642(false, class114.field2106, false, class211.field4079, 0, class170.field3282);
            }
            class138.field2588 = false;
        } else if (class211.field4079 != 0 && class170.field3282 != -1 && !class114.method705(false)) {
            class165.field3175.method1023(167, -21822);
            class163.field3025++;
            class165.field3175.method775(732495312, class170.field3282);
            class170.field3282 = -1;
        }
    }

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "(B)[Lsa;")
    public static final class180[] method1077(byte arg0) {
        field3199++;
        class180[] var1 = new class180[class71.field1387];
        int var2 = 0;
        if (arg0 < 24) {
            return null;
        }
        while (class71.field1387 > var2) {
            class180 var3 = new class180();
            var3.field3542 = class197.field3845;
            var3.field3548 = field3189;
            var3.field3545 = class55.field1099[var2];
            var3.field3544 = class20.field458[var2];
            var3.field3547 = class97.field1775[var2];
            var3.field3543 = class30.field622[var2];
            byte[] var4 = class188.field3676[var2];
            int var5 = var3.field3547 * var3.field3543;
            var3.field3546 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                var3.field3546[var6] = class112.field2074[class209.method1383(255, var4[var6])];
            }
            var1[var2] = var3;
            var2++;
        }
        class184.method1246((byte) 31);
        return var1;
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)Lvf;")
    public final class213 method274(int arg0) {
        if (this.field3188 != null) {
            int var2 = class217.field4203 - this.field3209;
            if (var2 > 100 && this.field3188.field3497 > 0) {
                var2 = 100;
            }
            label52: {
                do {
                    do {
                        if (var2 <= this.field3188.field3498[this.field3192]) {
                            break label52;
                        }
                        var2 -= this.field3188.field3498[this.field3192];
                        this.field3192++;
                    } while (this.field3192 < this.field3188.field3496.length);
                    this.field3192 -= this.field3188.field3497;
                } while (this.field3192 >= 0 && this.field3188.field3496.length > this.field3192);
                this.field3188 = null;
            }
            this.field3209 = class217.field4203 - var2;
        }
        field3198++;
        class4 var3 = class182.method1237(true, this.field3205);
        if (var3.field84 != null) {
            var3 = var3.method37(false);
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field3207 == 1 || this.field3207 == 3) {
            var4 = var3.field61;
            var5 = var3.field67;
        } else {
            var4 = var3.field67;
            var5 = var3.field61;
        }
        int var6 = this.field3201 + (var5 >> 1);
        int var7 = (var5 + 1 >> 1) + this.field3201;
        int var8 = (var4 >> 1) + this.field3203;
        int[][] var9 = class46.field975[this.field3195];
        int var10 = (var4 + 1 >> 1) + this.field3203;
        int var11 = (this.field3203 << 7) + (var4 << 6);
        int var12 = (this.field3201 << 7) + (var5 << 6);
        if (arg0 != -32768) {
            method1077((byte) 125);
        }
        int var13 = var9[var6][var8] + var9[var6][var10] + var9[var7][var10] + var9[var7][var8] >> 2;
        return var3.method28((byte) -54, var11, var9, var13, this.field3207, var12, this.field3188, this.field3190, this.field3192);
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(IIIIIIIZLdd;)V")
    public class166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class35 arg8) {
        this.field3205 = arg0;
        this.field3190 = arg1;
        this.field3203 = arg5;
        this.field3201 = arg4;
        this.field3195 = arg3;
        this.field3207 = arg2;
        if (arg6 != -1) {
            this.field3188 = class167.method1080(11098, arg6);
            this.field3209 = class217.field4203 - 1;
            this.field3192 = 0;
            if (this.field3188.field3503 == 0 && arg8 != null && arg8 instanceof class166) {
                class166 var10 = (class166) arg8;
                if (this.field3188 == var10.field3188) {
                    this.field3192 = var10.field3192;
                    this.field3209 = var10.field3209;
                    return;
                }
            }
            if (arg7 && this.field3188.field3497 != -1) {
                this.field3192 = (int) (Math.random() * (double) this.field3188.field3496.length);
                this.field3209 -= (int) (Math.random() * (double) this.field3188.field3498[this.field3192]);
                return;
            }
        }
    }
}

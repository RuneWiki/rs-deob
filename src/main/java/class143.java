import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class143 {

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
    private int field3306 = 0;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "[Ls;")
    private class125[] field3283;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
    private int field3304;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "[I")
    public static int[] field3285 = new int[2048];

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "Lod;")
    public static class101 field3287 = class46.method335(75, "<col=ff7000>");

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Lod;")
    private static class101 field3284 = class46.method335(99, "Ok");

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "Lod;")
    public static class101 field3286 = class46.method335(-122, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    public static int field3290 = 0;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "[I")
    public static int[] field3292 = new int[5];

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "Lod;")
    public static class101 field3293 = field3284;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
    public static int field3305 = 0;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "J")
    private long field3291;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "Ls;")
    private class125 field3282;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "Ls;")
    private class125 field3307;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "Lke;")
    public static class74 field3299;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "[Lrd;")
    public static class122[] field3301;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILbe;BII)V")
    public static final void method1135(int arg0, class13 arg1, byte arg2, int arg3, int arg4) {
        field3289++;
        if (class82.field1778 == arg1 || class54.field1244 >= 400) {
            return;
        }
        class101 var5;
        if (arg1.field267 == 0) {
            var5 = class15.method101(-50, new class101[] { arg1.field276, class153.method1187(arg1.field265, class82.field1778.field265, (byte) -71), class119.field2628, class49.field1161, class82.method592(false, arg1.field265), class53.field1214 });
        } else {
            var5 = class15.method101(89, new class101[] { arg1.field276, class119.field2628, class142.field3270, class82.method592(false, arg1.field267), class53.field1214 });
        }
        if (class49.field1158 == 1) {
            class120.field2641++;
            class138.method1096(class15.method101(-78, new class101[] { class132.field3036, class65.field1474, var5 }), class101.field2208, arg0, -1, 22, arg3, arg4);
        } else if (!class106.field2292) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class97.field2106[var6] != null) {
                    class34.field869++;
                    short var7 = 0;
                    if (class97.field2106[var6].method710(class112.field2400, 6587)) {
                        if (class82.field1778.field265 < arg1.field265) {
                            var7 = 2000;
                        }
                        if (class82.field1778.field285 != 0 && arg1.field285 != 0) {
                            if (class82.field1778.field285 == arg1.field285) {
                                var7 = 2000;
                            } else {
                                var7 = 0;
                            }
                        }
                    } else if (class26.field659[var6]) {
                        var7 = 2000;
                    }
                    boolean var8 = false;
                    int var9 = class52.field1189[var6] + var7;
                    class138.method1096(class15.method101(73, new class101[] { class90.field1948, var5 }), class97.field2106[var6], arg0, -1, var9, arg3, arg4);
                }
            }
        } else if ((class135.field3095 & 0x8) == 8) {
            class82.field1793++;
            class138.method1096(class15.method101(-49, new class101[] { class15.field302, class65.field1474, var5 }), class149.field3395, arg0, -1, 35, arg3, arg4);
        }
        int var10 = -79 % ((-arg2 - 15) / 54);
        for (int var11 = 0; var11 < class54.field1244; var11++) {
            if (class100.field2173[var11] == 29) {
                class153.field3500[var11] = class15.method101(-19, new class101[] { class90.field1948, var5 });
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)Ls;")
    public final class125 method1136(int arg0) {
        field3288++;
        if (this.field3306 > 0 && this.field3283[this.field3306 - 1] != this.field3307) {
            class125 var2 = this.field3307;
            this.field3307 = var2.field2731;
            return var2;
        }
        if (arg0 != -9485) {
            this.method1142((byte) 86);
        }
        while (this.field3304 > this.field3306) {
            class125 var3 = this.field3283[this.field3306++].field2731;
            if (this.field3283[this.field3306 - 1] != var3) {
                this.field3307 = var3.field2731;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BJLs;)V")
    public final void method1137(byte arg0, long arg1, class125 arg2) {
        if (arg2.field2724 != null) {
            arg2.method959(11835);
        }
        class125 var5 = this.field3283[(int) ((long) (this.field3304 - 1) & arg1)];
        arg2.field2731 = var5;
        arg2.field2724 = var5.field2724;
        field3296++;
        if (arg0 == -89) {
            arg2.field2723 = arg1;
            arg2.field2724.field2731 = arg2;
            arg2.field2731.field2724 = arg2;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
    public static void method1138(boolean arg0) {
        field3293 = null;
        field3301 = null;
        if (!arg0) {
            method1135(-39, null, (byte) -45, -63, -98);
        }
        field3299 = null;
        field3287 = null;
        field3286 = null;
        field3285 = null;
        field3292 = null;
        field3284 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)Z")
    public static final boolean method1139(int arg0, int arg1) {
        field3294++;
        if (class67.field1501[arg1]) {
            return true;
        } else if (class35.field892.method120(arg1, 45)) {
            int var2 = class35.field892.method112(arg1, 1);
            if (var2 == 0) {
                class67.field1501[arg1] = true;
                return true;
            }
            if (class100.field2161[arg1] == null) {
                class100.field2161[arg1] = new class126[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class100.field2161[arg1][var3] == null) {
                    byte[] var4 = class35.field892.method114((byte) -121, arg1, var3);
                    if (var4 != null) {
                        class100.field2161[arg1][var3] = new class126();
                        class100.field2161[arg1][var3].field2780 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            class100.field2161[arg1][var3].method970(false, new class138(var4));
                        } else {
                            class100.field2161[arg1][var3].method965(false, new class138(var4));
                        }
                    }
                }
            }
            if (arg0 <= 15) {
                field3293 = null;
            }
            class67.field1501[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
    public static final void method1140(int arg0) {
        if (arg0 != 2048) {
            field3293 = null;
        }
        for (class157 var1 = (class157) class20.field425.method523(false); var1 != null; var1 = (class157) class20.field425.method527(true)) {
            if (var1.field3607 != null) {
                var1.method1215(arg0 + 12230);
            }
        }
        field3281++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(JI)Ls;")
    public final class125 method1141(long arg0, int arg1) {
        this.field3291 = arg0;
        class125 var4 = this.field3283[(int) (arg0 & (long) (this.field3304 + arg1))];
        this.field3282 = var4.field2731;
        field3297++;
        while (this.field3282 != var4) {
            if (this.field3282.field2723 == arg0) {
                class125 var5 = this.field3282;
                this.field3282 = this.field3282.field2731;
                return var5;
            }
            this.field3282 = this.field3282.field2731;
        }
        this.field3282 = null;
        return null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)Ls;")
    public final class125 method1142(byte arg0) {
        this.field3306 = 0;
        field3302++;
        return arg0 > -42 ? null : this.method1136(-9485);
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)I")
    public static final int method1143(int arg0) {
        field3300++;
        int var1 = class65.method449(class133.field3048, class120.field2637, class95.field2040, true);
        if (var1 - class26.field692 >= 800 || (class86.field1905[class95.field2040][class120.field2637 >> 7][class133.field3048 >> 7] & 0x4) == 0) {
            if (arg0 != 3) {
                method1138(false);
            }
            return 3;
        } else {
            return class95.field2040;
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)Ls;")
    public final class125 method1144(byte arg0) {
        field3303++;
        if (arg0 >= -113) {
            this.field3291 = 80L;
        }
        if (this.field3282 == null) {
            return null;
        }
        class125 var2 = this.field3283[(int) ((long) (this.field3304 - 1) & this.field3291)];
        while (this.field3282 != var2) {
            if (this.field3282.field2723 == this.field3291) {
                class125 var3 = this.field3282;
                this.field3282 = this.field3282.field2731;
                return var3;
            }
            this.field3282 = this.field3282.field2731;
        }
        this.field3282 = null;
        return null;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(I)V")
    public class143(int arg0) {
        this.field3283 = new class125[arg0];
        this.field3304 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class125 var3 = this.field3283[var2] = new class125();
            var3.field2731 = var3;
            var3.field2724 = var3;
        }
    }
}

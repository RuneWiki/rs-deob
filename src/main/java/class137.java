import java.awt.Graphics;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class137 extends class4 {

    @OriginalMember(owner = "client!uc", name = "fb", descriptor = "I")
    private int field3318 = 128;

    @OriginalMember(owner = "client!uc", name = "cb", descriptor = "I")
    public int field3315 = -1;

    @OriginalMember(owner = "client!uc", name = "lb", descriptor = "I")
    public int field3324 = -1;

    @OriginalMember(owner = "client!uc", name = "ub", descriptor = "I")
    public int field3333 = 1;

    @OriginalMember(owner = "client!uc", name = "hb", descriptor = "Z")
    public boolean field3320 = true;

    @OriginalMember(owner = "client!uc", name = "Eb", descriptor = "I")
    private int field3343 = -1;

    @OriginalMember(owner = "client!uc", name = "yb", descriptor = "I")
    public int field3337 = -1;

    @OriginalMember(owner = "client!uc", name = "Mb", descriptor = "Z")
    public boolean field3351 = true;

    @OriginalMember(owner = "client!uc", name = "Fb", descriptor = "Z")
    public boolean field3344 = false;

    @OriginalMember(owner = "client!uc", name = "jb", descriptor = "I")
    public int field3322 = -1;

    @OriginalMember(owner = "client!uc", name = "Cb", descriptor = "I")
    private int field3341 = 0;

    @OriginalMember(owner = "client!uc", name = "Kb", descriptor = "I")
    private int field3349 = 0;

    @OriginalMember(owner = "client!uc", name = "ib", descriptor = "I")
    public int field3321 = -1;

    @OriginalMember(owner = "client!uc", name = "Vb", descriptor = "I")
    private int field3360 = 128;

    @OriginalMember(owner = "client!uc", name = "Bb", descriptor = "I")
    public int field3340 = -1;

    @OriginalMember(owner = "client!uc", name = "Qb", descriptor = "I")
    public int field3355 = -1;

    @OriginalMember(owner = "client!uc", name = "Wb", descriptor = "[Loa;")
    public class98[] field3361 = new class98[5];

    @OriginalMember(owner = "client!uc", name = "Tb", descriptor = "I")
    private int field3358 = -1;

    @OriginalMember(owner = "client!uc", name = "Ob", descriptor = "Z")
    public boolean field3353 = true;

    @OriginalMember(owner = "client!uc", name = "gb", descriptor = "Loa;")
    public class98 field3319 = class147.field3592;

    @OriginalMember(owner = "client!uc", name = "Pb", descriptor = "I")
    public int field3354 = -1;

    @OriginalMember(owner = "client!uc", name = "Lb", descriptor = "I")
    public int field3350 = -1;

    @OriginalMember(owner = "client!uc", name = "Zb", descriptor = "I")
    public int field3364 = 32;

    @OriginalMember(owner = "client!uc", name = "bb", descriptor = "Loa;")
    public static class98 field3314 = class38.method349(255, "Hidden)2");

    @OriginalMember(owner = "client!uc", name = "ab", descriptor = "I")
    public static int field3313 = 1;

    @OriginalMember(owner = "client!uc", name = "Gb", descriptor = "Loa;")
    private static class98 field3345 = class38.method349(255, "Prepared sound engine");

    @OriginalMember(owner = "client!uc", name = "Db", descriptor = "Loa;")
    public static class98 field3342 = class38.method349(255, "sl_stars");

    @OriginalMember(owner = "client!uc", name = "Nb", descriptor = "Loa;")
    public static class98 field3352 = class38.method349(255, "Texturen geladen)3");

    @OriginalMember(owner = "client!uc", name = "nb", descriptor = "Loa;")
    public static class98 field3326 = field3345;

    @OriginalMember(owner = "client!uc", name = "tb", descriptor = "Z")
    public static boolean field3332 = false;

    @OriginalMember(owner = "client!uc", name = "Z", descriptor = "Loa;")
    private static class98 field3312 = class38.method349(255, "as it was used to break our rules)3");

    @OriginalMember(owner = "client!uc", name = "X", descriptor = "Loa;")
    public static class98 field3310 = field3312;

    @OriginalMember(owner = "client!uc", name = "zb", descriptor = "Loa;")
    public static class98 field3338 = class38.method349(255, "Wen m-Ochten Sie hinzuf-Ugen?");

    @OriginalMember(owner = "client!uc", name = "kb", descriptor = "[Lwc;")
    public static class149[] field3323 = new class149[4];

    @OriginalMember(owner = "client!uc", name = "Xb", descriptor = "[I")
    public static int[] field3362 = new int[2000];

    @OriginalMember(owner = "client!uc", name = "Y", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!uc", name = "db", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!uc", name = "eb", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!uc", name = "mb", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!uc", name = "ob", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!uc", name = "pb", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!uc", name = "rb", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!uc", name = "sb", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!uc", name = "wb", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!uc", name = "xb", descriptor = "I")
    public int field3336;

    @OriginalMember(owner = "client!uc", name = "Ib", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!uc", name = "Rb", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!uc", name = "Sb", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!uc", name = "Yb", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!uc", name = "Jb", descriptor = "Loc;")
    public static class100 field3348;

    @OriginalMember(owner = "client!uc", name = "qb", descriptor = "[I")
    private int[] field3329;

    @OriginalMember(owner = "client!uc", name = "vb", descriptor = "[I")
    public int[] field3334;

    @OriginalMember(owner = "client!uc", name = "Ab", descriptor = "[I")
    private int[] field3339;

    @OriginalMember(owner = "client!uc", name = "Hb", descriptor = "[S")
    private short[] field3346;

    @OriginalMember(owner = "client!uc", name = "Ub", descriptor = "[S")
    private short[] field3359;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)Lbd;")
    public final class12 method1106(int arg0) {
        field3335++;
        if (this.field3334 != null) {
            class137 var2 = this.method1113(932);
            return var2 == null ? null : var2.method1106(0);
        } else if (this.field3339 == null) {
            return null;
        } else {
            boolean var3 = false;
            for (int var4 = 0; var4 < this.field3339.length; var4++) {
                if (!class139.field3398.method1049(0, this.field3339[var4], 0)) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class12[] var5 = new class12[this.field3339.length];
            for (int var6 = arg0; var6 < this.field3339.length; var6++) {
                var5[var6] = class12.method133(class139.field3398, this.field3339[var6], 0);
            }
            class12 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class12(var5, var5.length);
            }
            if (this.field3346 != null) {
                for (int var8 = 0; var8 < this.field3346.length; var8++) {
                    var7.method134(this.field3346[var8], this.field3359[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
    public static final void method1107(boolean arg0) {
        if (!arg0) {
            method1117((byte) 106);
        }
        field3325++;
        if (class63.field1344 == 0) {
            return;
        }
        class45 var1 = class97.field2231;
        int var2 = 0;
        if (class127.field2844 != 0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < 100; var3++) {
            if (class141.field3449[var3] != null) {
                int var4 = class148.field3670[var3];
                byte var5 = 0;
                class98 var6 = class65.field1397[var3];
                if (var6 != null && var6.method792((byte) -84, class48.field1093)) {
                    var5 = 1;
                    var6 = var6.method781(0, 5);
                }
                if (var6 != null && var6.method792((byte) -84, class52.field1165)) {
                    var5 = 2;
                    var6 = var6.method781(0, 5);
                }
                if ((var4 == 3 || var4 == 7) && (var4 == 7 || class54.field1193 == 0 || class54.field1193 == 1 && class129.method1036(0, var6))) {
                    byte var7 = 4;
                    int var8 = 329 - var2 * 13;
                    var1.method391(class114.field2574, var7, var8, 0);
                    var1.method391(class114.field2574, var7, var8 - 1, 65535);
                    var2++;
                    int var9 = var7 + var1.method398(class114.field2574);
                    int var10 = var9 + var1.method396(32);
                    if (var5 == 1) {
                        class87.field1984[0].method830(var10, var8 - 12);
                        var10 += 14;
                    }
                    if (var5 == 2) {
                        class87.field1984[1].method830(var10, var8 - 12);
                        var10 += 14;
                    }
                    var1.method391(class102.method840(new class98[] { var6, class4.field69, class141.field3449[var3] }, 10), var10, var8, 0);
                    var1.method391(class102.method840(new class98[] { var6, class4.field69, class141.field3449[var3] }, 10), var10, var8 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var4 == 5 && class54.field1193 < 2) {
                    int var11 = 329 - var2 * 13;
                    var2++;
                    var1.method391(class141.field3449[var3], 4, var11, 0);
                    var1.method391(class141.field3449[var3], 4, var11 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var4 == 6 && class54.field1193 < 2) {
                    int var12 = 329 - var2 * 13;
                    var1.method391(class102.method840(new class98[] { class73.field1540, class36.field900, var6, class4.field69, class141.field3449[var3] }, 10), 4, var12, 0);
                    var2++;
                    var1.method391(class102.method840(new class98[] { class73.field1540, class36.field900, var6, class4.field69, class141.field3449[var3] }, 10), 4, var12 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)V")
    public static final void method1108(int arg0, boolean arg1) {
        if (arg0 != 13170) {
            return;
        }
        field3328++;
        if (class10.field203.field1497 == null) {
            return;
        }
        for (int var2 = 0; var2 < 50 && class10.field203.field1497.peekEvent() != null; var2++) {
            class82.method691(1L, (byte) -96);
        }
        if (arg1) {
            class10.field203.field1497.postEvent(new ActionEvent(class73.field1506, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBLed;ILed;)Lt;")
    public final class128 method1109(int arg0, byte arg1, class33 arg2, int arg3, class33 arg4) {
        field3363++;
        if (arg1 != 38) {
            this.method1106(-27);
        }
        if (this.field3334 != null) {
            class137 var6 = this.method1113(932);
            return var6 == null ? null : var6.method1109(arg0, (byte) 38, arg2, arg3, arg4);
        }
        class128 var7 = (class128) class18.field386.method730((byte) 35, (long) this.field3336);
        if (var7 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field3329.length; var9++) {
                if (!class139.field3398.method1049(0, this.field3329[var9], 0)) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class12[] var10 = new class12[this.field3329.length];
            for (int var11 = 0; var11 < this.field3329.length; var11++) {
                var10[var11] = class12.method133(class139.field3398, this.field3329[var11], 0);
            }
            class12 var12;
            if (var10.length == 1) {
                var12 = var10[0];
            } else {
                var12 = new class12(var10, var10.length);
            }
            if (this.field3346 != null) {
                for (int var13 = 0; var13 < this.field3346.length; var13++) {
                    var12.method134(this.field3346[var13], this.field3359[var13]);
                }
            }
            var7 = var12.method126(this.field3341 + 64, this.field3349 + 850, -30, -50, -30);
            class18.field386.method732(-1, var7, (long) this.field3336);
        }
        class128 var14;
        if (arg4 != null && arg2 != null) {
            var14 = arg4.method324(-1661049136, arg0, var7, arg2, arg3);
        } else if (arg4 != null) {
            var14 = arg4.method327(arg0, var7, 895665520);
        } else if (arg2 == null) {
            var14 = var7.method1019(true);
        } else {
            var14 = arg2.method327(arg3, var7, 895665520);
        }
        if (this.field3360 != 128 || this.field3318 != 128) {
            var14.method1016(this.field3360, this.field3318, this.field3360);
        }
        return var14;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBI)V")
    public static final void method1110(int arg0, byte arg1, int arg2) {
        int var3 = 0;
        if (arg1 != 101) {
            method1118(56);
        }
        field3330++;
        for (int var4 = 0; var4 < 100; var4++) {
            if (class141.field3449[var4] != null) {
                int var5 = class148.field3670[var4];
                int var6 = class44.field999 + 70 + 4 - var3 * 14;
                if (var6 < -20) {
                    break;
                }
                class98 var7 = class65.field1397[var4];
                if (var5 == 0) {
                    var3++;
                }
                if (var7 != null && var7.method792((byte) -84, class48.field1093)) {
                    var7 = var7.method781(arg1 - 101, 5);
                }
                if (var7 != null && var7.method792((byte) -84, class52.field1165)) {
                    var7 = var7.method781(arg1 - 101, 5);
                }
                if ((var5 == 1 || var5 == 2) && (var5 == 1 || class80.field1749 == 0 || class80.field1749 == 1 && class129.method1036(0, var7))) {
                    if (arg0 > var6 - 14 && arg0 <= var6 && !var7.method801((byte) -98, class73.field1536.field1212)) {
                        class67.field1427++;
                        class118.field2645++;
                        if (class33.field823 >= 1) {
                            class91.field2086++;
                            class118.method935(0, class75.field1630, 4, -23060, 0, class102.method840(new class98[] { class146.field3549, var7 }, 10), 0);
                        }
                        class118.method935(0, class105.field2412, 57, arg1 ^ 0xFFFFA589, 0, class102.method840(new class98[] { class146.field3549, var7 }, arg1 - 91), 0);
                        class118.method935(0, class91.field2089, 18, -23060, 0, class102.method840(new class98[] { class146.field3549, var7 }, 10), 0);
                    }
                    var3++;
                }
                if ((var5 == 3 || var5 == 7) && class63.field1344 == 0 && (var5 == 7 || class54.field1193 == 0 || class54.field1193 == 1 && class129.method1036(0, var7))) {
                    if (var6 - 14 < arg0 && arg0 <= var6) {
                        class118.field2645++;
                        if (class33.field823 >= 1) {
                            class118.method935(0, class75.field1630, 4, arg1 - 23161, 0, class102.method840(new class98[] { class146.field3549, var7 }, 10), 0);
                            class91.field2086++;
                        }
                        class67.field1427++;
                        class118.method935(0, class105.field2412, 57, -23060, 0, class102.method840(new class98[] { class146.field3549, var7 }, arg1 - 91), 0);
                        class118.method935(0, class91.field2089, 18, arg1 ^ 0xFFFFA589, 0, class102.method840(new class98[] { class146.field3549, var7 }, 10), 0);
                    }
                    var3++;
                }
                if (var5 == 4 && (class67.field1433 == 0 || class67.field1433 == 1 && class129.method1036(0, var7))) {
                    if (arg0 > var6 - 14 && var6 >= arg0) {
                        class51.field1130++;
                        class118.method935(0, class80.field1774, 7, arg1 ^ 0xFFFFA589, 0, class102.method840(new class98[] { class146.field3549, var7 }, 10), 0);
                    }
                    var3++;
                }
                if ((var5 == 5 || var5 == 6) && class63.field1344 == 0 && class54.field1193 < 2) {
                    var3++;
                }
                if (var5 == 8 && (class67.field1433 == 0 || class67.field1433 == 1 && class129.method1036(0, var7))) {
                    var3++;
                    if (var6 - 14 < arg0 && arg0 <= var6) {
                        class118.method935(0, class145.field3509, 40, -23060, 0, class102.method840(new class98[] { class146.field3549, var7 }, 10), 0);
                        class94.field2148++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lb;Z)V")
    public final void method1111(class8 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method62((byte) 107);
            if (var3 == 0) {
                field3356++;
                if (!arg1) {
                    this.method1111(null, true);
                    return;
                }
                return;
            }
            this.method1116(!arg1, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lgb;ZLgb;)V")
    public static final void method1112(class45 arg0, boolean arg1, class45 arg2) {
        field3331++;
        if (client.field488 == null) {
            client.field488 = class150.method1200(class80.field1760, 2, class15.field303, class135.field3290);
        }
        if (class147.field3581 == null) {
            class147.field3581 = class147.method1175(class135.field3290, class80.field1760, class24.field581, false);
        }
        if (class6.field103 == null) {
            class6.field103 = class147.method1175(class135.field3290, class80.field1760, class150.field3705, false);
        }
        if (class123.field2740 == null) {
            class123.field2740 = class147.method1175(class135.field3290, class80.field1760, field3342, !arg1);
        }
        class7.method41(0, 23, 765, 480, 0);
        class7.method45(0, 0, 125, 23, 12425273, 9135624);
        class7.method45(125, 0, 640, 23, 5197647, 2697513);
        if (!arg1) {
            return;
        }
        arg2.method388(class129.field2987, 62, 15, 0);
        if (class123.field2740 != null) {
            class123.field2740[1].method830(140, 1);
            arg0.method391(class25.field607, 152, 10, 16777215);
            class123.field2740[0].method830(140, 12);
            arg0.method391(class140.field3428, 152, 21, 16777215);
        }
        if (class6.field103 != null) {
            short var3 = 280;
            short var4 = 390;
            short var5 = 610;
            short var6 = 500;
            if (class101.field2336[0] == 0 && class102.field2350[0] == 0) {
                class6.field103[2].method830(var3, 4);
            } else {
                class6.field103[0].method830(var3, 4);
            }
            if (class101.field2336[0] == 0 && class102.field2350[0] == 1) {
                class6.field103[3].method830(var3 + 15, 4);
            } else {
                class6.field103[1].method830(var3 + 15, 4);
            }
            arg2.method391(class73.field1519, var3 + 32, 17, 16777215);
            if (class101.field2336[0] == 1 && class102.field2350[0] == 0) {
                class6.field103[2].method830(var4, 4);
            } else {
                class6.field103[0].method830(var4, 4);
            }
            if (class101.field2336[0] == 1 && class102.field2350[0] == 1) {
                class6.field103[3].method830(var4 + 15, 4);
            } else {
                class6.field103[1].method830(var4 + 15, 4);
            }
            arg2.method391(class8.field187, var4 + 32, 17, 16777215);
            if (class101.field2336[0] == 2 && class102.field2350[0] == 0) {
                class6.field103[2].method830(var6, 4);
            } else {
                class6.field103[0].method830(var6, 4);
            }
            if (class101.field2336[0] == 2 && class102.field2350[0] == 1) {
                class6.field103[3].method830(var6 + 15, 4);
            } else {
                class6.field103[1].method830(var6 + 15, 4);
            }
            arg2.method391(class75.field1657, var6 + 32, 17, 16777215);
            if (class101.field2336[0] == 3 && class102.field2350[0] == 0) {
                class6.field103[2].method830(var5, 4);
            } else {
                class6.field103[0].method830(var5, 4);
            }
            if (class101.field2336[0] == 3 && class102.field2350[0] == 1) {
                class6.field103[3].method830(var5 + 15, 4);
            } else {
                class6.field103[1].method830(var5 + 15, 4);
            }
            arg2.method391(class79.field1727, var5 + 32, 17, 16777215);
        }
        class7.method41(708, 4, 50, 16, 0);
        arg0.method388(class24.field590, 733, 16, 16777215);
        class24.field594 = -1;
        if (client.field488 != null) {
            byte var7 = 88;
            byte var8 = 19;
            int var9 = 480 / (var8 + 1);
            int var10 = 765 / (var7 + 1);
            int var11;
            int var12;
            do {
                var11 = var9;
                var12 = var10;
                if ((var10 - 1) * var9 >= class147.field3588) {
                    var10--;
                }
                if ((var9 - 1) * var10 >= class147.field3588) {
                    var9--;
                }
                if ((var9 - 1) * var10 >= class147.field3588) {
                    var9--;
                }
            } while (var9 != var11 || var10 != var12);
            int var13 = (765 - var7 * var10) / (var10 - -1);
            if (var13 > 5) {
                var13 = 5;
            }
            int var14 = (480 - var8 * var9) / (var9 - -1);
            if (var14 > 5) {
                var14 = 5;
            }
            int var15 = (765 - var7 * var10 - (var10 + -1) * var13) / 2;
            int var16 = (480 - (var9 - 1) * var14 - var8 * var9) / 2;
            int var17 = var15;
            int var18 = var16 + 23;
            int var19 = 0;
            for (int var20 = 0; var20 < class147.field3588; var20++) {
                class140 var21 = class19.field427[var20];
                class98 var22 = class132.method1074(var21.field3421, (byte) 102);
                boolean var23 = true;
                if (var21.field3421 == -1) {
                    var23 = false;
                    var22 = class57.field1259;
                } else if (var21.field3421 > 1980) {
                    var23 = false;
                    var22 = class105.field2420;
                }
                if (var17 <= class42.field990 && class123.field2749 >= var18 && class42.field990 < var7 + var17 && class123.field2749 < var18 + var8 && var23) {
                    class24.field594 = var20;
                    client.field488[var21.field3414 ? 1 : 0].method487(var17, var18, 128, 16777215);
                } else {
                    client.field488[var21.field3414 ? 1 : 0].method486(var17, var18);
                }
                if (class147.field3581 != null) {
                    class147.field3581[var21.field3412 + (var21.field3414 ? 8 : 0)].method830(var17 + 29, var18);
                }
                arg2.method388(class132.method1074(var21.field3417, (byte) -123), var17 + 15, var18 - -(var8 / 2) - -5, 0);
                arg0.method388(var22, var17 + 60, var8 / 2 + var18 + 5, 268435455);
                var18 += var8 + var14;
                int var10000 = ~var9;
                var19++;
                if (var10000 >= ~var19) {
                    var19 = 0;
                    var18 = var16 + 23;
                    var17 += var7 + var13;
                }
            }
        }
        try {
            Graphics var24 = class73.field1506.getGraphics();
            class58.field1303.method406(32, 0, 0, var24);
        } catch (Exception var25) {
            class73.field1506.repaint();
        }
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)Luc;")
    public final class137 method1113(int arg0) {
        field3317++;
        int var2 = -1;
        if (this.field3343 != -1) {
            var2 = class90.method731((byte) 108, this.field3343);
        } else if (this.field3358 != -1) {
            var2 = field3362[this.field3358];
        }
        if (var2 < 0 || var2 >= this.field3334.length || this.field3334[var2] == -1) {
            return null;
        } else {
            if (arg0 != 932) {
                this.method1109(-27, (byte) -125, null, 78, null);
            }
            return class11.method122(this.field3334[var2], 110);
        }
    }

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)Z")
    public final boolean method1114(int arg0) {
        field3316++;
        if (this.field3334 == null) {
            return true;
        }
        int var2 = -1;
        if (this.field3343 != -1) {
            var2 = class90.method731((byte) 87, this.field3343);
        } else if (this.field3358 != -1) {
            var2 = field3362[this.field3358];
        }
        if (var2 < 0 || var2 >= this.field3334.length || this.field3334[var2] == -1) {
            return false;
        } else if (arg0 < 66) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "(I)V")
    public final void method1115(int arg0) {
        field3311++;
        if (arg0 != 1766) {
            this.field3334 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZILb;)V")
    private final void method1116(boolean arg0, int arg1, class8 arg2) {
        if (arg0) {
            return;
        }
        field3347++;
        if (arg1 == 1) {
            int var4 = arg2.method62((byte) 101);
            this.field3329 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3329[var5] = arg2.method68(-2);
            }
        } else if (arg1 == 2) {
            this.field3319 = arg2.method93(73);
        } else if (arg1 == 12) {
            this.field3333 = arg2.method62((byte) 98);
        } else if (arg1 == 13) {
            this.field3315 = arg2.method68(-2);
        } else if (arg1 == 14) {
            this.field3354 = arg2.method68(-2);
        } else if (arg1 == 15) {
            this.field3322 = arg2.method68(-2);
        } else if (arg1 == 16) {
            this.field3355 = arg2.method68(-2);
        } else if (arg1 == 17) {
            this.field3354 = arg2.method68(-2);
            this.field3340 = arg2.method68(-2);
            this.field3321 = arg2.method68(-2);
            this.field3324 = arg2.method68(-2);
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3361[arg1 - 30] = arg2.method93(35);
            if (this.field3361[arg1 - 30].method782(-1, class18.field399)) {
                this.field3361[arg1 - 30] = null;
                return;
            }
        } else if (arg1 == 40) {
            int var10 = arg2.method62((byte) 101);
            this.field3346 = new short[var10];
            this.field3359 = new short[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field3346[var11] = (short) arg2.method68(-2);
                this.field3359[var11] = (short) arg2.method68(-2);
            }
        } else if (arg1 == 60) {
            int var8 = arg2.method62((byte) 102);
            this.field3339 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3339[var9] = arg2.method68(-2);
            }
            return;
        } else if (arg1 == 93) {
            this.field3353 = false;
            return;
        } else if (arg1 == 95) {
            this.field3337 = arg2.method68(-2);
            return;
        } else if (arg1 == 97) {
            this.field3360 = arg2.method68(-2);
            return;
        } else if (arg1 == 98) {
            this.field3318 = arg2.method68(-2);
            return;
        } else if (arg1 == 99) {
            this.field3344 = true;
            return;
        } else if (arg1 == 100) {
            this.field3341 = arg2.method57(51);
            return;
        } else if (arg1 == 101) {
            this.field3349 = arg2.method57(29) * 5;
            return;
        } else if (arg1 == 102) {
            this.field3350 = arg2.method68(-2);
            return;
        } else if (arg1 == 103) {
            this.field3364 = arg2.method68(-2);
            return;
        } else if (arg1 == 106) {
            this.field3343 = arg2.method68(-2);
            if (this.field3343 == 65535) {
                this.field3343 = -1;
            }
            this.field3358 = arg2.method68(-2);
            if (this.field3358 == 65535) {
                this.field3358 = -1;
            }
            int var6 = arg2.method62((byte) 91);
            this.field3334 = new int[var6 + 1];
            for (int var7 = 0; var7 <= var6; var7++) {
                this.field3334[var7] = arg2.method68(-2);
                if (this.field3334[var7] == 65535) {
                    this.field3334[var7] = -1;
                }
            }
            return;
        } else {
            if (arg1 == 107) {
                this.field3351 = false;
            } else if (arg1 == 109) {
                this.field3320 = false;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(B)V")
    public static final void method1117(byte arg0) {
        if (arg0 > -120) {
            field3348 = null;
        }
        field3327++;
        client.field481.method734(-224779128);
    }

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "(I)V")
    public static void method1118(int arg0) {
        field3323 = null;
        field3338 = null;
        field3342 = null;
        field3310 = null;
        field3352 = null;
        field3326 = null;
        field3345 = null;
        if (arg0 != -3843) {
            field3338 = null;
        }
        field3362 = null;
        field3314 = null;
        field3312 = null;
        field3348 = null;
    }
}

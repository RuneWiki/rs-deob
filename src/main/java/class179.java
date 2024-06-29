import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class179 {

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Lbd;")
    private class14 field3618 = new class14();

    @OriginalMember(owner = "client!u", name = "a", descriptor = "[I")
    public static int[] field3613 = new int[1000];

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field3617 = 0;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field3620 = 0;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "[[I")
    public static int[][] field3622 = new int[104][104];

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field3615 = -1;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "Lef;")
    public static class43 field3625 = null;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "Z")
    public static boolean field3627 = false;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "Lea;")
    public static class38 field3623 = class9.method46((byte) 106, "und die Schaltfl-=che (WSpielkonto erstellen(W am");

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(III)I")
    public static final int method1227(int arg0, int arg1, int arg2) {
        field3624++;
        int var3 = arg2 >>> 31;
        if (arg0 != 256) {
            field3613 = null;
        }
        return (arg2 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILbd;)V")
    public final void method1228(int arg0, class14 arg1) {
        field3616++;
        if (arg1.field293 != null) {
            arg1.method85(false);
        }
        arg1.field293 = this.field3618;
        arg1.field292 = this.field3618.field292;
        arg1.field293.field292 = arg1;
        if (arg0 == -1454) {
            arg1.field292.field293 = arg1;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)Lbd;")
    public final class14 method1229(byte arg0) {
        class14 var2 = this.field3618.field292;
        field3614++;
        if (arg0 != -49) {
            return null;
        } else if (this.field3618 == var2) {
            return null;
        } else {
            var2.method85(false);
            return var2;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIII)V")
    public static final void method1230(int arg0, int arg1, int arg2, int arg3) {
        field3619++;
        class167.method1188(2);
        class71.method569(arg2, arg1, class80.field1893.field1147 + arg2, arg1 - -class80.field1893.field1144);
        if (class194.field3827 == 2 || class194.field3827 == 5) {
            class71.method573(arg2 + 25, arg1 + 5, 0, class103.field2321, class175.field3542);
        } else {
            int var4 = class205.field4028 + class114.field2534 & 0x7FF;
            int var5 = class195.field3842.field406 / 32 + 48;
            int var6 = 464 - class195.field3842.field382 / 32;
            class100.field2237.method745(arg2 + 25, arg1 + 5, 146, 151, var5, var6, var4, class183.field3658 + 256, class103.field2321, class175.field3542);
            for (int var7 = 0; var7 < class66.field1597; var7++) {
                int var37 = field3613[var7] * 4 + 2 - class195.field3842.field406 / 32;
                int var38 = class187.field3717[var7] * 4 + 2 - class195.field3842.field382 / 32;
                class203.method1331(arg1, var37, class59.field1481[var7], 94, arg2, var38);
            }
            for (int var8 = 0; var8 < 104; var8++) {
                for (int var33 = 0; var33 < 104; var33++) {
                    class141 var34 = class122.field2615[class10.field224][var8][var33];
                    if (var34 != null) {
                        int var35 = var33 * 4 + 2 - class195.field3842.field382 / 32;
                        int var36 = var8 * 4 + 2 - class195.field3842.field406 / 32;
                        class203.method1331(arg1, var36, class167.field3447[0], 94, arg2, var35);
                    }
                }
            }
            for (int var9 = 0; var9 < class177.field3593; var9++) {
                class102 var29 = class105.field2343[class170.field3488[var9]];
                if (var29 != null && var29.method108(20542)) {
                    class152 var30 = var29.field2298;
                    if (var30 != null && var30.field3139 != null) {
                        var30 = var30.method1068((byte) 43);
                    }
                    if (var30 != null && var30.field3138 && var30.field3126) {
                        int var31 = var29.field406 / 32 - class195.field3842.field406 / 32;
                        int var32 = var29.field382 / 32 - class195.field3842.field382 / 32;
                        class203.method1331(arg1, var31, class167.field3447[1], 94, arg2, var32);
                    }
                }
            }
            for (int var10 = 0; var10 < class50.field1247; var10++) {
                class144 var21 = class175.field3550[class65.field1556[var10]];
                if (var21 != null && var21.method108(20542)) {
                    int var22 = var21.field382 / 32 - class195.field3842.field382 / 32;
                    int var23 = var21.field406 / 32 - class195.field3842.field406 / 32;
                    boolean var24 = false;
                    long var25 = var21.field3022.method256(-86);
                    for (int var27 = 0; var27 < class22.field468; var27++) {
                        if (class166.field3430[var27] == var25 && class22.field471[var27] != 0) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var28 = false;
                    if (class195.field3842.field3017 != 0 && var21.field3017 != 0 && class195.field3842.field3017 == var21.field3017) {
                        var28 = true;
                    }
                    if (var24) {
                        class203.method1331(arg1, var23, class167.field3447[3], 94, arg2, var22);
                    } else if (var28) {
                        class203.method1331(arg1, var23, class167.field3447[4], 94, arg2, var22);
                    } else {
                        class203.method1331(arg1, var23, class167.field3447[2], 94, arg2, var22);
                    }
                }
            }
            if (class136.field2865 != 0 && class45.field1098 % 20 < 10) {
                if (class136.field2865 == 1 && class128.field2743 >= 0 && class128.field2743 < class105.field2343.length) {
                    class102 var11 = class105.field2343[class128.field2743];
                    if (var11 != null) {
                        int var12 = var11.field382 / 32 - class195.field3842.field382 / 32;
                        int var13 = var11.field406 / 32 - class195.field3842.field406 / 32;
                        class11.method59(arg2, var13, false, arg1, var12, class125.field2689[1]);
                    }
                }
                if (class136.field2865 == 2) {
                    int var14 = (class101.field2272 - class135.field2845) * 4 + 2 - class195.field3842.field406 / 32;
                    int var15 = (class166.field3432 - class127.field2712) * 4 + 2 - class195.field3842.field382 / 32;
                    class11.method59(arg2, var14, false, arg1, var15, class125.field2689[1]);
                }
                if (class136.field2865 == 10 && class6.field161 >= 0 && class6.field161 < class175.field3550.length) {
                    class144 var16 = class175.field3550[class6.field161];
                    if (var16 != null) {
                        int var17 = var16.field406 / 32 - class195.field3842.field406 / 32;
                        int var18 = var16.field382 / 32 - class195.field3842.field382 / 32;
                        class11.method59(arg2, var17, false, arg1, var18, class125.field2689[1]);
                    }
                }
            }
            if (class185.field3674 != 0) {
                int var19 = class191.field3763 * 4 + 2 - class195.field3842.field382 / 32;
                int var20 = class185.field3674 * 4 + 2 - class195.field3842.field406 / 32;
                class203.method1331(arg1, var20, class125.field2689[0], 94, arg2, var19);
            }
            class71.method558(arg2 + 93 + 4, arg1 - 4 + 82, 3, 3, 16777215);
        }
        if (arg3 != 6853) {
            method1232(16);
        }
        if (class194.field3827 < 3) {
            class165.field3414.method745(arg2, arg1, 33, 33, 25, 25, class114.field2534, 256, class3.field110, class163.field3381);
        } else {
            class71.method573(arg2, arg1, 0, class3.field110, class163.field3381);
        }
        if (class194.field3830[arg0]) {
            class80.field1893.method335(arg2, arg1);
        }
        class10.field228[arg0] = true;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(B)Lbd;")
    public final class14 method1231(byte arg0) {
        field3626++;
        class14 var2 = this.field3618.field292;
        if (this.field3618 == var2) {
            return null;
        } else {
            if (arg0 < 42) {
                field3613 = null;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public static void method1232(int arg0) {
        int var1 = -115 / ((-arg0 - 55) / 42);
        field3613 = null;
        field3623 = null;
        field3625 = null;
        field3622 = null;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(ILbd;)V")
    public final void method1233(int arg0, class14 arg1) {
        field3621++;
        if (arg1.field293 != null) {
            arg1.method85(false);
        }
        arg1.field292 = this.field3618;
        arg1.field293 = this.field3618.field293;
        arg1.field293.field292 = arg1;
        if (arg0 != 464) {
            field3627 = true;
        }
        arg1.field292.field293 = arg1;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
    public class179() {
        this.field3618.field292 = this.field3618;
        this.field3618.field293 = this.field3618;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class60 extends class189 {

    @OriginalMember(owner = "client!hl", name = "Q", descriptor = "Lfg;")
    public class203 field941 = new class203();

    @OriginalMember(owner = "client!hl", name = "T", descriptor = "Li;")
    public class204 field944 = new class204();

    @OriginalMember(owner = "client!hl", name = "B", descriptor = "Lca;")
    private class90 field926;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "Lve;")
    private static class255 field920 = class87.method607(29, "Thu");

    @OriginalMember(owner = "client!hl", name = "E", descriptor = "Lve;")
    private static class255 field929 = class87.method607(34, "Tue");

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "Lve;")
    private static class255 field922 = class87.method607(62, "Drop");

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
    public static int field919 = 1;

    @OriginalMember(owner = "client!hl", name = "C", descriptor = "Lve;")
    private static class255 field927 = class87.method607(53, "Mon");

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "Lve;")
    private static class255 field916 = class87.method607(46, "Sun");

    @OriginalMember(owner = "client!hl", name = "L", descriptor = "Lve;")
    private static class255 field936 = class87.method607(88, "Wed");

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "Lve;")
    private static class255 field925 = class87.method607(55, "Sat");

    @OriginalMember(owner = "client!hl", name = "M", descriptor = "Lve;")
    public static class255 field937 = field922;

    @OriginalMember(owner = "client!hl", name = "N", descriptor = "Lve;")
    private static class255 field938 = class87.method607(121, "Fri");

    @OriginalMember(owner = "client!hl", name = "I", descriptor = "[Lne;")
    public static class224[] field933 = new class224[6];

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "[Lve;")
    public static class255[] field935 = new class255[] { field916, field927, field929, field936, field920, field938, field925 };

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "Lmb;")
    public static class97 field917 = new class97();

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!hl", name = "x", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!hl", name = "y", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!hl", name = "F", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!hl", name = "G", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!hl", name = "H", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!hl", name = "J", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!hl", name = "O", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!hl", name = "P", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!hl", name = "S", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!hl", name = "R", descriptor = "Lqe;")
    public static class176 field942;

    @OriginalMember(owner = "client!hl", name = "D", descriptor = "[Lud;")
    public static class269[] field928;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "([III)V", line = 16)
    public final void method364(int[] arg0, int arg1, int arg2) {
        field931++;
        this.field944.method364(arg0, arg1, arg2);
        for (class109 var4 = (class109) this.field941.method1471((byte) -61); var4 != null; var4 = (class109) this.field941.method1475((byte) 83)) {
            if (!this.field926.method681(var4, -30928)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field1853 >= var5) {
                        this.method370(var5, var5 + var6, var4, 262144, var6, arg0);
                        var4.field1853 -= var5;
                        break;
                    }
                    this.method370(var4.field1853, var5 + var6, var4, 262144, var6, arg0);
                    var6 += var4.field1853;
                    var5 -= var4.field1853;
                } while (!this.field926.method649(var5, arg0, var6, var4, (byte) -118));
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "()Lci;", line = 58)
    public final class189 method365() {
        field915++;
        class109 var1;
        do {
            var1 = (class109) this.field941.method1475((byte) 83);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1837 == null);
        return var1.field1837;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILrg;IB)Lpc;", line = 79)
    public static final class83 method366(int arg0, class88 arg1, int arg2, byte arg3) {
        field924++;
        if (class96.method763((byte) 65, arg0, arg2, arg1)) {
            return arg3 == -45 ? class271.method1890(0) : (class83) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BILic;)V", line = 95)
    private final void method367(byte arg0, int arg1, class109 arg2) {
        field923++;
        if ((this.field926.field1506[arg2.field1857] & 0x4) != 0 && arg2.field1845 < 0) {
            int var4 = this.field926.field1482[arg2.field1857] / class92.field1584;
            int var5 = (var4 + 1048575 - arg2.field1842) / var4;
            arg2.field1842 = arg2.field1842 + (arg1 * var4) & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field926.field1489[arg2.field1857] == 0) {
                    arg2.field1837 = class94.method702(arg2.field1843, arg2.field1837.method727(), arg2.field1837.method725(), arg2.field1837.method715());
                } else {
                    arg2.field1837 = class94.method702(arg2.field1843, arg2.field1837.method727(), 0, arg2.field1837.method715());
                    this.field926.method661(arg2, arg2.field1844.field1770[arg2.field1836] < 0, -119);
                }
                if (arg2.field1844.field1770[arg2.field1836] < 0) {
                    arg2.field1837.method700(-1);
                }
                arg1 = arg2.field1842 / var4;
            }
        }
        int var6 = -36 % ((arg0 - 54) / 52);
        arg2.field1837.method369(arg1);
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "()I", line = 140)
    public final int method368() {
        field921++;
        return 0;
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)V", line = 151)
    public final void method369(int arg0) {
        this.field944.method369(arg0);
        field918++;
        for (class109 var2 = (class109) this.field941.method1471((byte) -77); var2 != null; var2 = (class109) this.field941.method1475((byte) 83)) {
            if (!this.field926.method681(var2, -30928)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1853) {
                        this.method367((byte) 121, var3, var2);
                        var2.field1853 -= var3;
                        break;
                    }
                    this.method367((byte) -62, var2.field1853, var2);
                    var3 -= var2.field1853;
                } while (!this.field926.method649(var3, (int[]) null, 0, var2, (byte) -104));
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IILic;II[I)V", line = 185)
    private final void method370(int arg0, int arg1, class109 arg2, int arg3, int arg4, int[] arg5) {
        field914++;
        if ((this.field926.field1506[arg2.field1857] & 0x4) != 0 && arg2.field1845 < 0) {
            int var7 = this.field926.field1482[arg2.field1857] / class92.field1584;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field1842) / var7;
                if (arg0 < var8) {
                    arg2.field1842 += arg0 * var7;
                    break;
                }
                arg2.field1837.method364(arg5, arg4, var8);
                arg2.field1842 += var7 * var8 - 1048576;
                arg0 -= var8;
                arg4 += var8;
                int var9 = class92.field1584 / 100;
                class94 var10 = arg2.field1837;
                int var11 = 262144 / var7;
                if (var11 < var9) {
                    var9 = var11;
                }
                if (this.field926.field1489[arg2.field1857] == 0) {
                    arg2.field1837 = class94.method702(arg2.field1843, var10.method727(), var10.method725(), var10.method715());
                } else {
                    arg2.field1837 = class94.method702(arg2.field1843, var10.method727(), 0, var10.method715());
                    this.field926.method661(arg2, arg2.field1844.field1770[arg2.field1836] < 0, -110);
                    arg2.field1837.method722(var9, var10.method725());
                }
                if (arg2.field1844.field1770[arg2.field1836] < 0) {
                    arg2.field1837.method700(-1);
                }
                var10.method703(var9);
                var10.method364(arg5, arg4, arg1 - arg4);
                if (var10.method739()) {
                    this.field944.method1484(var10);
                }
            }
        }
        arg2.field1837.method364(arg5, arg4, arg0);
        if (arg3 != 262144) {
            this.method370(50, -21, (class109) null, 70, 16, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V", line = 259)
    public static void method371(boolean arg0) {
        field916 = null;
        if (arg0) {
            method371(false);
        }
        field922 = null;
        field929 = null;
        field917 = null;
        field936 = null;
        field942 = null;
        field928 = null;
        field937 = null;
        field935 = null;
        field927 = null;
        field938 = null;
        field933 = null;
        field920 = null;
        field925 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIII)V", line = 282)
    public static final void method372(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class242.field4051 == 1) {
            class37.field569[class16.field237 / 100].method291(class113.field1916 - 8, class144.field2408 + -8);
        }
        field940++;
        if (class242.field4051 == 2) {
            class37.field569[class16.field237 / 100 + 4].method291(class113.field1916 - 8, class144.field2408 + -8);
        }
        if (arg0 != -8) {
            method372(-9, 57, -82, 14, 117);
        }
        class132.method975(3062);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZI)I", line = 308)
    public static final int method373(boolean arg0, int arg1) {
        field932++;
        return arg0 ? -117 : arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "()Lci;", line = 334)
    public final class189 method374() {
        class109 var1 = (class109) this.field941.method1471((byte) 91);
        field939++;
        if (var1 == null) {
            return null;
        } else if (var1.field1837 == null) {
            return this.method365();
        } else {
            return var1.field1837;
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(B)V", line = 365)
    public static final void method375(byte arg0) {
        field934++;
        int var1 = class236.field3923.length;
        int var2 = -82 % ((arg0 - 48) / 63);
        for (int var3 = 0; var3 < var1; var3++) {
            if (class236.field3923[var3] != null) {
                int var4 = -1;
                for (int var5 = 0; var5 < class74.field1227; var5++) {
                    if (class165.field2788[var5] == class116.field1976[var3]) {
                        var4 = var5;
                        break;
                    }
                }
                if (var4 == -1) {
                    class165.field2788[class74.field1227] = class116.field1976[var3];
                    var4 = class74.field1227++;
                }
                int var6 = 0;
                class70 var7 = new class70(class236.field3923[var3]);
                while (var7.field1068 < class236.field3923[var3].length && var6 < 511) {
                    int var8 = var7.method423(255);
                    int var9 = var6++ << 6 | var4;
                    int var10 = var8 >> 14;
                    int var11 = (var8 & 0x1FA5) >> 7;
                    int var12 = (class116.field1976[var3] >> 8) * 64 + var11 - class197.field3355;
                    int var13 = var8 & 0x3F;
                    int var14 = (class116.field1976[var3] & 0xFF) * 64 + var13 - class268.field4615;
                    class236 var15 = class143.method1068(-85, var7.method423(255));
                    if (class82.field1334[var9] == null && (var15.field3914 & 0x1) > 0 && class87.field1415 == var10 && var12 >= 0 && var15.field3933 + var12 < 104 && var14 >= 0 && (var15.field3933 + var14) < 104) {
                        class82.field1334[var9] = new class186();
                        class186 var16 = class82.field1334[var9];
                        class84.field1356[class282.field4858++] = var9;
                        var16.field5122 = class277.field4768;
                        var16.field2996 = var15;
                        var16.method2102(70, var16.field2996.field3933);
                        var16.field5121 = var16.field2996.field3928;
                        var16.field5120 = var16.field2996.field3903;
                        var16.field5167 = var16.field2996.field3883;
                        var16.field5146 = var16.field2996.field3942;
                        var16.field5118 = var16.field2996.field3937;
                        var16.field5138 = var16.field2996.field3881;
                        var16.field5148 = var16.field2996.field3920;
                        if (var16.field5148 == 0) {
                            var16.field5157 = 0;
                        }
                        var16.field5113 = var16.field2996.field3897;
                        var16.method2104(var14, -6572, var12, true, var16.method1680(-108));
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lca;)V", line = 480)
    public class60(class90 arg0) {
        this.field926 = arg0;
    }
}

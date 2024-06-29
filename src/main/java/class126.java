import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class126 {

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "I")
    private int field2196 = 0;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "I")
    public int field2191;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "[Lh;")
    public class206[] field2173;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "Lwa;")
    private static class75 field2171 = class66.method560("Walk here", false);

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "Lre;")
    public static class262 field2175 = null;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "Lwa;")
    public static class75 field2185 = class66.method560("Hierhin gehen", false);

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    public static int field2188 = 0;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "Lwa;")
    public static class75 field2174 = field2171;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public static volatile int field2184 = -1;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "J")
    private long field2176;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "Lcl;")
    public static class124 field2193;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "Lh;")
    private class206 field2177;

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "Lh;")
    private class206 field2195;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "Lcb;")
    public static class267 field2187;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)I", line = 6)
    public final int method999(boolean arg0) {
        field2178++;
        int var2 = 0;
        if (arg0) {
            return 30;
        }
        for (int var3 = 0; var3 < this.field2191; var3++) {
            class206 var4 = this.field2173[var3];
            class206 var5 = var4.field3483;
            while (var4 != var5) {
                var5 = var5.field3483;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(Z)V", line = 47)
    public final void method1000(boolean arg0) {
        field2192++;
        int var2 = 0;
        if (!arg0) {
            this.field2176 = 115L;
        }
        while (this.field2191 > var2) {
            class206 var3 = this.field2173[var2];
            while (true) {
                class206 var4 = var3.field3483;
                if (var3 == var4) {
                    var2++;
                    break;
                }
                var4.method1527(108);
            }
        }
        this.field2195 = null;
        this.field2177 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)Lh;", line = 79)
    public final class206 method1001(byte arg0) {
        field2172++;
        if (arg0 != 33) {
            this.method1002((byte) 18);
        }
        this.field2196 = 0;
        return this.method1009(-125);
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)I", line = 97)
    public final int method1002(byte arg0) {
        field2180++;
        int var2 = 118 % ((4 - arg0) / 44);
        return this.field2191;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V", line = 118)
    public static void method1003(int arg0) {
        field2193 = null;
        field2187 = null;
        field2185 = null;
        field2174 = null;
        field2175 = null;
        field2171 = null;
        if (arg0 != 22567) {
            method1005(118, 50);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BJLh;)V", line = 143)
    public final void method1004(byte arg0, long arg1, class206 arg2) {
        field2179++;
        if (arg2.field3490 != null) {
            arg2.method1527(-94);
        }
        class206 var5 = this.field2173[(int) ((long) (this.field2191 - 1) & arg1)];
        arg2.field3488 = arg1;
        arg2.field3490 = var5.field3490;
        arg2.field3483 = var5;
        if (arg0 != 73) {
            field2193 = (class124) null;
        }
        arg2.field3490.field3483 = arg2;
        arg2.field3483.field3490 = arg2;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V", line = 169)
    public static final void method1005(int arg0, int arg1) {
        field2186++;
        class25.field325 = arg1;
        if (arg0 != 23053) {
            field2174 = (class75) null;
        }
        class137.field2342 = 50;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILwa;)V", line = 182)
    public static final void method1006(int arg0, int arg1, class75 arg2) {
        class156 var3 = class206.method1525(3, -32701, arg1);
        if (arg0 <= 2) {
            field2184 = -24;
        }
        var3.method1183(true);
        field2190++;
        var3.field2685 = arg2;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(JI)Lh;", line = 197)
    public final class206 method1007(long arg0, int arg1) {
        this.field2176 = arg0;
        class206 var4 = this.field2173[(int) (arg0 & (long) (this.field2191 - 1))];
        field2183++;
        for (this.field2177 = var4.field3483; this.field2177 != var4; this.field2177 = this.field2177.field3483) {
            if (this.field2177.field3488 == arg0) {
                class206 var5 = this.field2177;
                this.field2177 = this.field2177.field3483;
                return var5;
            }
        }
        if (arg1 != -17004) {
            this.field2176 = -39L;
        }
        this.field2177 = null;
        return null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BJ)V", line = 228)
    public static final void method1008(byte arg0, long arg1) {
        field2189++;
        if (arg1 == 0L) {
            return;
        }
        if (class205.field3472 >= 100) {
            class162.method1216((byte) 38, 0, class45.field734, class121.field2037);
        } else if (arg0 == 41) {
            class75 var3 = class260.method1855(arg1, false).method613(122);
            for (int var4 = 0; var4 < class205.field3472; var4++) {
                if (class66.field1152[var4] == arg1) {
                    class162.method1216((byte) 38, 0, class66.method562((byte) -76, new class75[] { var3, class237.field3988 }), class121.field2037);
                    return;
                }
            }
            for (int var5 = 0; var5 < class40.field628; var5++) {
                if (class120.field2026[var5] == arg1) {
                    class162.method1216((byte) 38, 0, class66.method562((byte) 121, new class75[] { class86.field1418, var3, class216.field3690 }), class121.field2037);
                    return;
                }
            }
            if (var3.method660(class279.field4831.field1561, -116)) {
                class162.method1216((byte) 38, 0, class253.field4259, class121.field2037);
            } else {
                class66.field1152[class205.field3472] = arg1;
                class232.field3936++;
                class244.field4114[class205.field3472++] = class260.method1855(arg1, false);
                class166.field2793 = class187.field3128;
                class89.field1470.method87(arg0 + 65239, 121);
                class89.field1470.method514(30009, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)Lh;", line = 292)
    public final class206 method1009(int arg0) {
        field2194++;
        if (this.field2196 > 0 && this.field2173[this.field2196 - 1] != this.field2195) {
            class206 var2 = this.field2195;
            this.field2195 = var2.field3483;
            return var2;
        }
        if (arg0 >= -117) {
            this.method1009(84);
        }
        class206 var3;
        do {
            if (this.field2196 >= this.field2191) {
                return null;
            }
            var3 = this.field2173[this.field2196++].field3483;
        } while (this.field2173[this.field2196 - 1] == var3);
        this.field2195 = var3.field3483;
        return var3;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)Lh;", line = 325)
    public final class206 method1010(int arg0) {
        if (arg0 != 0) {
            field2171 = (class75) null;
        }
        field2197++;
        if (this.field2177 == null) {
            return null;
        }
        class206 var2 = this.field2173[(int) (this.field2176 & (long) (this.field2191 - 1))];
        while (this.field2177 != var2) {
            if (this.field2177.field3488 == this.field2176) {
                class206 var3 = this.field2177;
                this.field2177 = this.field2177.field3483;
                return var3;
            }
            this.field2177 = this.field2177.field3483;
        }
        this.field2177 = null;
        return null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([Lh;B)I", line = 357)
    public final int method1011(class206[] arg0, byte arg1) {
        field2182++;
        if (arg1 <= 104) {
            method1006(-85, -17, (class75) null);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2191; var4++) {
            class206 var5 = this.field2173[var4];
            for (class206 var6 = var5.field3483; var6 != var5; var6 = var6.field3483) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(I)V", line = 395)
    public class126(int arg0) {
        this.field2191 = arg0;
        this.field2173 = new class206[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class206 var3 = this.field2173[var2] = new class206();
            var3.field3490 = var3;
            var3.field3483 = var3;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIII)V", line = 421)
    public static final void method1012(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class290 var5 = (class290) class54.field890.method1250(true); var5 != null; var5 = (class290) class54.field890.method1256((byte) -123)) {
            class232.method1696(arg0, arg2, var5, (byte) -111, arg4, arg1);
        }
        field2181++;
        for (class290 var6 = (class290) class166.field2794.method1250(true); var6 != null; var6 = (class290) class166.field2794.method1256((byte) -123)) {
            byte var7 = 1;
            if (var6.field4962.field3228 == var6.field4962.field3215) {
                var7 = 0;
            } else if (var6.field4962.field3244 == var6.field4962.field3215) {
                var7 = 2;
            }
            if (var6.field4964 != var7) {
                int var8 = class213.method1570(var6.field4962, (byte) -120);
                if (var6.field4961 != var8) {
                    if (var6.field4975 != null) {
                        class94.field1527.method1790(var6.field4975);
                        var6.field4975 = null;
                    }
                    var6.field4961 = var8;
                }
                var6.field4964 = var7;
            }
            var6.field4968 = var6.field4962.field3259;
            var6.field4972 = var6.field4962.field3259 + (var6.field4962.method739(0) * 64);
            var6.field4974 = var6.field4962.field3218;
            var6.field4979 = var6.field4962.field3218 + var6.field4962.method739(0) * 64;
            class232.method1696(arg0, arg2, var6, (byte) -111, arg4, arg1);
        }
        class290 var9 = (class290) class2.field18.method1001((byte) 33);
        if (arg3 != 64) {
            field2175 = (class262) null;
        }
        while (var9 != null) {
            byte var10 = 1;
            if (var9.field4970.field3228 == var9.field4970.field3215) {
                var10 = 0;
            } else if (var9.field4970.field3244 == var9.field4970.field3215) {
                var10 = 2;
            }
            if (var9.field4964 != var10) {
                int var11 = class133.method1034((byte) 126, var9.field4970);
                if (var9.field4961 != var11) {
                    if (var9.field4975 != null) {
                        class94.field1527.method1790(var9.field4975);
                        var9.field4975 = null;
                    }
                    var9.field4961 = var11;
                }
                var9.field4964 = var10;
            }
            var9.field4968 = var9.field4970.field3259;
            var9.field4972 = var9.field4970.field3259 + (var9.field4970.method739(0) * 64);
            var9.field4974 = var9.field4970.field3218;
            var9.field4979 = var9.field4970.field3218 + var9.field4970.method739(0) * 64;
            class232.method1696(arg0, arg2, var9, (byte) -111, arg4, arg1);
            var9 = (class290) class2.field18.method1009(-118);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class143 {

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
    private int field2329 = 0;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public int field2312;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "[Ltl;")
    public class259[] field2318;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "J")
    public static long field2319 = 0L;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2310 = "Choose Option";

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "J")
    private long field2324;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "Ltl;")
    private class259 field2313;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "Ltl;")
    private class259 field2330;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "Lmh;")
    public static class263 field2325;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "Lib;")
    public static class61 field2314;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static final long method1064(byte arg0, String arg1) {
        field2322++;
        int var2 = arg1.length();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var3 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var3 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var3 += (long) (var6 + 27 - 48);
            }
            if (var3 >= 177917621779460413L) {
                break;
            }
        }
        if (arg0 >= -67) {
            field2325 = null;
        }
        while ((var3 % 37L) == 0L && var3 != 0L) {
            var3 /= 37L;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BJ)V")
    public static final void method1065(byte arg0, long arg1) {
        if (arg0 <= 57) {
            return;
        }
        field2327++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class47.field659; var3++) {
            if (class203.field3007[var3] == arg1) {
                class47.field659--;
                for (int var4 = var3; var4 < class47.field659; var4++) {
                    class203.field3007[var4] = class203.field3007[var4 + 1];
                    class292.field4639[var4] = class292.field4639[var4 + 1];
                    class221.field3226[var4] = class221.field3226[var4 + 1];
                }
                class142.field2283++;
                class135.field2210 = class248.field3705;
                class144.field2338.method683(true, 142);
                class144.field2338.method382(902642416, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)I")
    public final int method1066(byte arg0) {
        field2320++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2312; var3++) {
            class259 var4 = this.field2318[var3];
            class259 var5 = var4.field4013;
            while (var4 != var5) {
                var5 = var5.field4013;
                var2++;
            }
        }
        if (arg0 >= -29) {
            this.field2312 = 55;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIZILdk;)V")
    public static final void method1067(int arg0, int arg1, boolean arg2, int arg3, class207 arg4) {
        field2323++;
        if (class213.field3139 == arg4 || class147.field2360 >= 400) {
            return;
        }
        String var11;
        if (arg4.field3061 == 0) {
            boolean var5 = true;
            if (class213.field3139.field3048 != -1 && arg4.field3048 != -1) {
                int var6 = class213.field3139.field3068 > arg4.field3068 ? class213.field3139.field3068 : arg4.field3068;
                int var7 = class213.field3139.field3048 >= arg4.field3048 ? arg4.field3048 : class213.field3139.field3048;
                int var8 = var6 * 10 / 100 + var7 + 5;
                int var9 = class213.field3139.field3068 - arg4.field3068;
                if (var9 < 0) {
                    var9 = -var9;
                }
                if (var8 < var9) {
                    var5 = false;
                }
            }
            String var10 = class121.field1986 == 1 ? class194.field2856 : class1.field21;
            if (arg4.field3068 < arg4.field3071) {
                var11 = arg4.method1469((byte) -4) + (var5 ? class303.method2063(-12685, class213.field3139.field3068, arg4.field3068) : "<col=ffffff>") + " (" + var10 + arg4.field3068 + "+" + (arg4.field3071 - arg4.field3068) + ")";
            } else {
                var11 = arg4.method1469((byte) -4) + (var5 ? class303.method2063(-12685, class213.field3139.field3068, arg4.field3068) : "<col=ffffff>") + " (" + var10 + arg4.field3068 + ")";
            }
        } else {
            var11 = arg4.method1469((byte) -4) + " (" + class249.field3771 + arg4.field3061 + ")";
        }
        if (class165.field2539 == 1) {
            class63.method481((long) arg0, arg3, class298.field4788, arg1, class260.field4026, (short) 2, -1, class221.field3221 + " -> <col=ffffff>" + var11);
            class304.field4917++;
        } else if (!class6.field57) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class206.field3036[var12] != null) {
                    class255.field3847++;
                    boolean var13 = false;
                    short var14 = 0;
                    if (class121.field1986 == 0 && class206.field3036[var12].equalsIgnoreCase(class167.field2553)) {
                        if (class213.field3139.field3068 < arg4.field3068) {
                            var14 = 2000;
                        }
                        if (class213.field3139.field3058 != 0 && arg4.field3058 != 0) {
                            if (class213.field3139.field3058 == arg4.field3058) {
                                var14 = 2000;
                            } else {
                                var14 = 0;
                            }
                        }
                    } else if (class200.field2948[var12]) {
                        var14 = 2000;
                    }
                    short var15 = class259.field4012[var12];
                    short var16 = (short) (var14 + var15);
                    class63.method481((long) arg0, arg3, class120.field1948[var12], arg1, class206.field3036[var12], var16, -1, "<col=ffffff>" + var11);
                }
            }
        } else if ((class69.field1111 & 0x8) != 0) {
            class63.method481((long) arg0, arg3, class87.field1380, arg1, class169.field2567, (short) 47, -1, class136.field2220 + " -> <col=ffffff>" + var11);
            class11.field130++;
        }
        for (int var17 = 0; var17 < class147.field2360; var17++) {
            if (class204.field3009[var17] == 11) {
                class221.field3219[var17] = "<col=ffffff>" + var11;
                break;
            }
        }
        if (!arg2) {
            method1064((byte) -34, (String) null);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)I")
    public final int method1068(int arg0) {
        if (arg0 == 5) {
            field2321++;
            return this.field2312;
        } else {
            return -4;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)Ltl;")
    public final class259 method1069(int arg0) {
        field2311++;
        if (this.field2329 > 0 && this.field2318[this.field2329 - 1] != this.field2330) {
            class259 var2 = this.field2330;
            this.field2330 = var2.field4013;
            return var2;
        }
        while (this.field2329 < this.field2312) {
            class259 var3 = this.field2318[this.field2329++].field4013;
            if (this.field2318[this.field2329 - 1] != var3) {
                this.field2330 = var3.field4013;
                return var3;
            }
        }
        if (arg0 != -123) {
            this.method1073(56, -55L);
        }
        return null;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)Ltl;")
    public final class259 method1070(byte arg0) {
        if (arg0 <= 0) {
            this.method1074((byte) -80, (class259) null, -91L);
        }
        field2328++;
        if (this.field2313 == null) {
            return null;
        }
        class259 var2 = this.field2318[(int) ((long) (this.field2312 - 1) & this.field2324)];
        while (this.field2313 != var2) {
            if (this.field2313.field4008 == this.field2324) {
                class259 var3 = this.field2313;
                this.field2313 = this.field2313.field4013;
                return var3;
            }
            this.field2313 = this.field2313.field4013;
        }
        this.field2313 = null;
        return null;
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)Ltl;")
    public final class259 method1071(int arg0) {
        this.field2329 = 0;
        field2317++;
        return arg0 >= -123 ? null : this.method1069(-123);
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V")
    public final void method1072(int arg0) {
        for (int var2 = 0; var2 < this.field2312; var2++) {
            class259 var3 = this.field2318[var2];
            while (true) {
                class259 var4 = var3.field4013;
                if (var3 == var4) {
                    break;
                }
                var4.method1781(5250);
            }
        }
        if (arg0 == 0) {
            field2315++;
            this.field2313 = null;
            this.field2330 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IJ)Ltl;")
    public final class259 method1073(int arg0, long arg1) {
        field2316++;
        this.field2324 = arg1;
        class259 var4 = this.field2318[(int) (arg1 & (long) (this.field2312 + arg0))];
        for (this.field2313 = var4.field4013; this.field2313 != var4; this.field2313 = this.field2313.field4013) {
            if (this.field2313.field4008 == arg1) {
                class259 var5 = this.field2313;
                this.field2313 = this.field2313.field4013;
                return var5;
            }
        }
        this.field2313 = null;
        return null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLtl;J)V")
    public final void method1074(byte arg0, class259 arg1, long arg2) {
        if (arg1.field4014 != null) {
            arg1.method1781(arg0 ^ 0x14A5);
        }
        field2326++;
        if (arg0 != 39) {
            this.method1068(-70);
        }
        class259 var5 = this.field2318[(int) (arg2 & (long) (this.field2312 - 1))];
        arg1.field4013 = var5;
        arg1.field4014 = var5.field4014;
        arg1.field4008 = arg2;
        arg1.field4014.field4013 = arg1;
        arg1.field4013.field4014 = arg1;
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(B)V")
    public static void method1075(byte arg0) {
        field2314 = null;
        field2310 = null;
        field2325 = null;
        if (arg0 < 33) {
            field2319 = 47L;
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(I)V")
    public class143(int arg0) {
        this.field2312 = arg0;
        this.field2318 = new class259[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class259 var3 = this.field2318[var2] = new class259();
            var3.field4013 = var3;
            var3.field4014 = var3;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class520 {

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "Lifa;")
    private class487 field7202 = new class487();

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    private int field7214;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    private int field7204;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "Lnj;")
    private class436 field7209;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field7203;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field7205;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field7206;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field7207;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public static int field7210;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    public static int field7212;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
    public static int field7215;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public static int field7216;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
    public static int field7218;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILrl;BLjava/lang/Object;)V")
    private final void method2964(int arg0, class153 arg1, byte arg2, Object arg3) {
        field7211++;
        if (this.field7214 < arg0) {
            throw new IllegalStateException("s>cs");
        }
        this.method2968(arg1, -8196);
        this.field7204 -= arg0;
        if (arg2 != -10) {
            this.field7202 = null;
        }
        while (this.field7204 < 0) {
            class673 var6 = (class673) this.field7202.method2714(arg2 + 10);
            this.method2965(-1, var6);
        }
        class668 var5 = new class668(arg1, arg3, arg0);
        this.field7209.method2504(arg1.method555(-11918), 118, var5);
        this.field7202.method2713(-82, var5);
        var5.field6449 = 0L;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILlfa;)V")
    private final void method2965(int arg0, class673 arg1) {
        if (arg1 != null) {
            arg1.method175(30604);
            arg1.method2669(-29226);
            this.field7204 += arg1.field9535;
        }
        if (arg0 != -1) {
            this.field7204 = 16;
        }
        field7206++;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IBI)V")
    public static final void method2966(int arg0, byte arg1, int arg2) {
        field7215++;
        int var3 = 18 % ((61 - arg1) / 63);
        class19 var4 = class364.method2236(1248116640, arg0, 6);
        var4.method110(12142);
        var4.field171 = arg2;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)I")
    public final int method2967(int arg0) {
        if (arg0 != -9117) {
            this.field7202 = null;
        }
        field7208++;
        return this.field7214;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lrl;I)V")
    private final void method2968(class153 arg0, int arg1) {
        field7219++;
        long var3 = arg0.method555(-11918);
        for (class673 var5 = (class673) this.field7209.method2506(90, var3); var5 != null; var5 = (class673) this.field7209.method2507(-1)) {
            if (var5.field9538.method557(arg0, 11933)) {
                this.method2965(arg1 + 8195, var5);
                break;
            }
        }
        if (arg1 != -8196) {
            this.field7214 = -65;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)I")
    public final int method2969(boolean arg0) {
        field7213++;
        if (!arg0) {
            this.method2964(79, null, (byte) -63, null);
        }
        return this.field7204;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V")
    public final void method2970(int arg0) {
        this.field7202.method2711(-14886);
        field7218++;
        this.field7209.method2510(arg0);
        this.field7204 = this.field7214;
        if (arg0 != -1) {
            this.method2975(77, 64);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILrl;)Ljava/lang/Object;")
    public final Object method2971(int arg0, class153 arg1) {
        field7216++;
        long var3 = arg1.method555(-11918);
        class673 var5 = (class673) this.field7209.method2506(92, var3);
        if (arg0 != 100) {
            field7217 = -128;
        }
        while (var5 != null) {
            if (var5.field9538.method557(arg1, 11933)) {
                Object var6 = var5.method2207((byte) 84);
                if (var6 != null) {
                    if (var5.method2206(-1842)) {
                        class668 var7 = new class668(arg1, var6, var5.field9535);
                        this.field7209.method2504(var5.field272, -126, var7);
                        this.field7202.method2713(-82, var7);
                        var7.field6449 = 0L;
                        var5.method175(30604);
                        var5.method2669(-29226);
                    } else {
                        this.field7202.method2713(-82, var5);
                        var5.field6449 = 0L;
                    }
                    return var6;
                }
                var5.method175(30604);
                var5.method2669(arg0 ^ 0xFFFF8DB2);
                this.field7204 += var5.field9535;
            }
            var5 = (class673) this.field7209.method2507(-1);
        }
        return null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/Object;ILrl;)V")
    public final void method2972(Object arg0, int arg1, class153 arg2) {
        if (arg1 != -17079) {
            this.field7204 = -47;
        }
        field7203++;
        this.method2964(1, arg2, (byte) -10, arg0);
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(Z)V")
    public final void method2973(boolean arg0) {
        for (class673 var2 = (class673) this.field7202.method2715((byte) 127); var2 != null; var2 = (class673) this.field7202.method2712(0)) {
            if (var2.method2206(-1842)) {
                var2.method175(30604);
                var2.method2669(-29226);
                this.field7204 += var2.field9535;
            }
        }
        if (!arg0) {
            field7217 = -107;
        }
        field7212++;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZLud;I)V")
    public static final void method2974(boolean arg0, class519 arg1, int arg2) {
        field7210++;
        if (class179.field2242 >= 400) {
            return;
        }
        if (class596.field8164 != arg1) {
            if (arg2 != 2000) {
                field7217 = 45;
            }
            String var3;
            if (arg1.field7168 == 0) {
                boolean var4 = true;
                if (class596.field8164.field7183 != -1 && arg1.field7183 != -1) {
                    int var5 = arg1.field7197 >= class596.field8164.field7197 ? arg1.field7197 : class596.field8164.field7197;
                    int var6 = class596.field8164.field7183 < arg1.field7183 ? class596.field8164.field7183 : arg1.field7183;
                    int var7 = var5 * 10 / 100 + var6 + 5;
                    int var8 = class596.field8164.field7197 - arg1.field7197;
                    if (var8 < 0) {
                        var8 = -var8;
                    }
                    if (var7 < var8) {
                        var4 = false;
                    }
                }
                String var9 = class411.field5764 == class33.field322 ? class243.field3241.method1491(class350.field5121, (byte) 125) : class243.field3239.method1491(class350.field5121, (byte) 125);
                if (arg1.field7197 < arg1.field7170) {
                    var3 = arg1.method2957(true, true) + (var4 ? class365.method2240(arg1.field7197, (byte) 50, class596.field8164.field7197) : "<col=ffffff>") + " (" + var9 + arg1.field7197 + "+" + (arg1.field7170 - arg1.field7197) + ")";
                } else {
                    var3 = arg1.method2957(true, true) + (var4 ? class365.method2240(arg1.field7197, (byte) 117, class596.field8164.field7197) : "<col=ffffff>") + " (" + var9 + arg1.field7197 + ")";
                }
            } else if (arg1.field7168 == -1) {
                var3 = arg1.method2957(true, true);
            } else {
                var3 = arg1.method2957(true, true) + " (" + class243.field3240.method1491(class350.field5121, (byte) 125) + arg1.field7168 + ")";
            }
            if (class613.field8378 && !arg0 && (class525.field7268 & 0x8) != 0) {
                class166.field2079++;
                class606.method3350(0, (long) arg1.field463, false, 0, class306.field4114, class413.field5798, 20, class665.field9444 + " -> <col=ffffff>" + var3, -1, true, false);
            }
            if (arg0) {
                class606.method3350(0, 0L, false, 0, "<col=cccccc>" + var3, -1, -1, "", 0, false, true);
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class270.field3679[var10] != null) {
                        short var12 = 0;
                        if (class369.field5313 == class33.field322 && class270.field3679[var10].equalsIgnoreCase(class243.field3234.method1491(class350.field5121, (byte) 126))) {
                            if (arg1.field7197 > class596.field8164.field7197) {
                                var12 = 2000;
                            }
                            if (class596.field8164.field7161 != 0 && arg1.field7161 != 0) {
                                if (class596.field8164.field7161 == arg1.field7161) {
                                    var12 = 2000;
                                } else {
                                    var12 = 0;
                                }
                            }
                        } else if (class629.field8556[var10]) {
                            var12 = 2000;
                        }
                        short var13 = (short) (class659.field9294[var10] + var12);
                        int var14 = class536.field7369[var10] == -1 ? class30.field300 : class536.field7369[var10];
                        class606.method3350(0, (long) arg1.field463, false, 0, class270.field3679[var10], var14, var13, "<col=ffffff>" + var3, -1, true, false);
                        class484.field6550++;
                    }
                }
            }
            if (!arg0) {
                for (class69 var11 = (class69) class37.field371.method374((byte) 118); var11 != null; var11 = (class69) class37.field371.method372(-20740)) {
                    if (var11.field902 == 58) {
                        var11.field907 = "<col=ffffff>" + var3;
                        return;
                    }
                }
            }
        } else if (class613.field8378 && (class525.field7268 & 0x10) != 0) {
            class606.method3350(0, 0L, false, 0, class306.field4114, class413.field5798, 50, class665.field9444 + " -> <col=ffffff>" + class243.field3248.method1491(class350.field5121, (byte) 127), -1, true, false);
            class218.field2809++;
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(I)V")
    public class520(int arg0) {
        this.field7214 = arg0;
        this.field7204 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field7209 = new class436(var2);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)V")
    public final void method2975(int arg0, int arg1) {
        field7205++;
        if (class521.field7221 != null) {
            for (class673 var3 = (class673) this.field7202.method2715((byte) 125); var3 != null; var3 = (class673) this.field7202.method2712(0)) {
                if (var3.method2206(-1842)) {
                    if (var3.method2207((byte) -104) == null) {
                        var3.method175(arg1 + 30604);
                        var3.method2669(-29226);
                        this.field7204 += var3.field9535;
                    }
                } else if (++var3.field6449 > (long) arg0) {
                    class673 var4 = class521.field7221.method2882((byte) -90, var3);
                    this.field7209.method2504(var3.field272, -14, var4);
                    class73.method432(8091, var3, var4);
                    var3.method175(30604);
                    var3.method2669(-29226);
                }
            }
        }
        if (arg1 != 0) {
            this.method2969(true);
        }
    }
}

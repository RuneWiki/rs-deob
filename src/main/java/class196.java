import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class196 {

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    private int field2735 = 0;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
    private int field2747 = -1;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "Lhi;")
    private class192 field2737 = new class192();

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "Z")
    public boolean field2751 = false;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
    private int field2746;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    private int field2736;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "[Lmf;")
    private class166[] field2733;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "[[I")
    private int[][] field2745;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field2734 = 0;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "Ljava/lang/String;")
    public static String field2742 = " from your ignore list first.";

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "[I")
    public static int[] field2743 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
    public static int field2749 = -1;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field2738 = 0;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2748 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "Lrj;")
    public static class249 field2731;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 9)
    public final void method1384(int arg0) {
        for (int var2 = 0; var2 < this.field2736; var2++) {
            this.field2745[var2] = null;
        }
        if (arg0 != -23561) {
            method1390(-86, (Component) null, (class80) null, 124, 118);
        }
        field2741++;
        this.field2733 = null;
        this.field2745 = (int[][]) null;
        this.field2737.method1345(-47);
        this.field2737 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(CB)C", line = 32)
    public static final char method1385(char arg0, byte arg1) {
        int var2 = -32 % ((-arg1 - 84) / 32);
        field2750++;
        return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V", line = 47)
    public static void method1386(int arg0) {
        field2742 = null;
        if (arg0 != 402) {
            method1385((char) 65440, (byte) 32);
        }
        field2731 = null;
        field2748 = null;
        field2743 = null;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(III)V", line = 430)
    public class196(int arg0, int arg1, int arg2) {
        this.field2746 = arg1;
        this.field2736 = arg0;
        this.field2733 = new class166[this.field2746];
        this.field2745 = new int[this.field2736][arg2];
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IB)[I", line = 88)
    public final int[] method1387(int arg0, byte arg1) {
        if (arg1 > -27) {
            this.field2747 = -87;
        }
        field2732++;
        if (this.field2746 == this.field2736) {
            this.field2751 = this.field2733[arg0] == null;
            this.field2733[arg0] = class271.field4041;
            return this.field2745[arg0];
        } else if (this.field2736 == 1) {
            this.field2751 = this.field2747 != arg0;
            this.field2747 = arg0;
            return this.field2745[0];
        } else {
            class166 var3 = this.field2733[arg0];
            if (var3 == null) {
                this.field2751 = true;
                if (this.field2735 < this.field2736) {
                    var3 = new class166(arg0, this.field2735);
                    this.field2735++;
                } else {
                    class166 var4 = (class166) this.field2737.method1338(-1);
                    var3 = new class166(arg0, var4.field2273);
                    this.field2733[var4.field2274] = null;
                    var4.method1274((byte) -26);
                }
                this.field2733[arg0] = var3;
            } else {
                this.field2751 = false;
            }
            this.field2737.method1343(var3, -48);
            return this.field2745[var3.field2273];
        }
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)[[I", line = 156)
    public final int[][] method1388(int arg0) {
        field2740++;
        if (this.field2746 != this.field2736) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field2736; var2++) {
            this.field2733[var2] = class271.field4041;
        }
        return arg0 >= -123 ? (int[][]) ((int[][]) null) : this.field2745;
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)V", line = 177)
    public static final void method1389(int arg0) {
        field2744++;
        if (!class67.field908 || class33.field391) {
            return;
        }
        class202[][][] var1 = class142.field1940;
        if (arg0 != 38) {
            field2738 = -24;
        }
        for (int var2 = 0; var2 < var1.length; var2++) {
            class202[][] var3 = var1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class202 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field2869 != null && var6.field2869.field4586 instanceof class267) {
                            class267 var7 = (class267) var6.field2869.field4586;
                            if ((var6.field2869.field4580 & Long.MIN_VALUE) == 0L) {
                                var7.method1817(false, true, true, true, false, true, true);
                            } else {
                                var7.method1817(true, true, true, true, true, true, true);
                            }
                        }
                        if (var6.field2879 != null) {
                            if (var6.field2879.field3987 instanceof class267) {
                                class267 var8 = (class267) var6.field2879.field3987;
                                if ((var6.field2879.field3992 & Long.MIN_VALUE) == 0L) {
                                    var8.method1817(false, true, true, true, false, true, true);
                                } else {
                                    var8.method1817(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field2879.field3995 instanceof class267) {
                                class267 var9 = (class267) var6.field2879.field3995;
                                if ((Long.MIN_VALUE & var6.field2879.field3992) == 0L) {
                                    var9.method1817(false, true, true, true, false, true, true);
                                } else {
                                    var9.method1817(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        if (var6.field2873 != null) {
                            if (var6.field2873.field57 instanceof class267) {
                                class267 var10 = (class267) var6.field2873.field57;
                                if ((var6.field2873.field69 & Long.MIN_VALUE) == 0L) {
                                    var10.method1817(false, true, true, true, false, true, true);
                                } else {
                                    var10.method1817(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field2873.field55 instanceof class267) {
                                class267 var11 = (class267) var6.field2873.field55;
                                if ((var6.field2873.field69 & Long.MIN_VALUE) == 0L) {
                                    var11.method1817(false, true, true, true, false, true, true);
                                } else {
                                    var11.method1817(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        for (int var12 = 0; var12 < var6.field2875; var12++) {
                            if (var6.field2896[var12].field4199 instanceof class267) {
                                class267 var13 = (class267) var6.field2896[var12].field4199;
                                if ((Long.MIN_VALUE & var6.field2896[var12].field4203) == 0L) {
                                    var13.method1817(false, true, true, true, false, true, true);
                                } else {
                                    var13.method1817(true, true, true, true, true, true, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        class33.field391 = true;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILjava/awt/Component;Lwa;II)Lvi;", line = 340)
    public static final class257 method1390(int arg0, Component arg1, class80 arg2, int arg3, int arg4) {
        field2739++;
        if (class273.field4085 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                if (arg4 <= 95) {
                    return (class257) null;
                }
                class257 var5 = (class257) Class.forName("ga").getDeclaredConstructor().newInstance();
                var5.field3791 = arg0;
                var5.field3775 = new int[(class10.field93 ? 2 : 1) * 256];
                var5.method765(arg1);
                var5.field3803 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field3803 > 16384) {
                    var5.field3803 = 16384;
                }
                var5.method763(var5.field3803);
                if (class98.field1325 > 0 && class252.field3622 == null) {
                    class252.field3622 = new class20();
                    class252.field3622.field251 = arg2;
                    arg2.method612(class252.field3622, -31, class98.field1325);
                }
                if (class252.field3622 != null) {
                    if (class252.field3622.field256[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class252.field3622.field256[arg3] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    class228 var7 = new class228(arg2, arg3);
                    var7.field3791 = arg0;
                    var7.field3775 = new int[(class10.field93 ? 2 : 1) * 256];
                    var7.method765(arg1);
                    var7.field3803 = 16384;
                    var7.method763(var7.field3803);
                    if (class98.field1325 > 0 && class252.field3622 == null) {
                        class252.field3622 = new class20();
                        class252.field3622.field251 = arg2;
                        arg2.method612(class252.field3622, 102, class98.field1325);
                    }
                    if (class252.field3622 != null) {
                        if (class252.field3622.field256[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class252.field3622.field256[arg3] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class257();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public abstract class class170 extends class36 {

    @OriginalMember(owner = "client!pn", name = "C", descriptor = "[Lgk;")
    public static class52[] field2321 = new class52[14];

    @OriginalMember(owner = "client!pn", name = "I", descriptor = "[I")
    public static int[] field2327 = new int[1000];

    @OriginalMember(owner = "client!pn", name = "B", descriptor = "I")
    public static int field2320 = -2;

    @OriginalMember(owner = "client!pn", name = "F", descriptor = "Ljava/lang/String;")
    public static String field2324 = "scroll:";

    @OriginalMember(owner = "client!pn", name = "v", descriptor = "I")
    public int field2314;

    @OriginalMember(owner = "client!pn", name = "w", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!pn", name = "x", descriptor = "I")
    public int field2316;

    @OriginalMember(owner = "client!pn", name = "y", descriptor = "I")
    public int field2317;

    @OriginalMember(owner = "client!pn", name = "z", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!pn", name = "A", descriptor = "I")
    public int field2319;

    @OriginalMember(owner = "client!pn", name = "D", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!pn", name = "E", descriptor = "I")
    public int field2323;

    @OriginalMember(owner = "client!pn", name = "G", descriptor = "I")
    public int field2325;

    @OriginalMember(owner = "client!pn", name = "H", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!pn", name = "J", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!pn", name = "K", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!pn", name = "L", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)V", line = 6)
    public static void method1196(boolean arg0) {
        if (arg0) {
            method1200((byte) -63, 5, -23);
        }
        field2327 = null;
        field2324 = null;
        field2321 = null;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lsc;I)I", line = 22)
    public static final int method1197(class329 arg0, int arg1) {
        int var2 = -76 % ((33 - arg1) / 62);
        field2318++;
        class181 var3 = arg0.field4961;
        if (var3.field2476 != null) {
            var3 = var3.method1266((byte) -48);
            if (var3 == null) {
                return -1;
            }
        }
        int var4 = var3.field2446;
        class194 var5 = arg0.method1753(-1);
        if (arg0.field3719 == var5.field2665) {
            var4 = var3.field2443;
        } else if (arg0.field3719 == var5.field2682 || arg0.field3719 == var5.field2691 || arg0.field3719 == var5.field2680 || arg0.field3719 == var5.field2701) {
            var4 = var3.field2438;
        } else if (arg0.field3719 == var5.field2699 || arg0.field3719 == var5.field2667 || arg0.field3719 == var5.field2670 || arg0.field3719 == var5.field2685) {
            var4 = var3.field2422;
        }
        return var4;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B[B)[B", line = 68)
    public static final byte[] method1198(byte arg0, byte[] arg1) {
        if (arg0 <= 25) {
            method1198((byte) -110, (byte[]) null);
        }
        field2329++;
        class316 var2 = new class316(arg1);
        int var3 = var2.method2219(16448);
        int var4 = var2.method2172((byte) 71);
        if (var4 < 0 || !(class219.field3147 == 0 || class219.field3147 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method2207(var7, var4, (byte) 114, 0);
            return var7;
        } else {
            int var5 = var2.method2172((byte) 71);
            if (var5 < 0 || class219.field3147 != 0 && class219.field3147 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class158.method1147(var6, var5, arg1, var4, 9);
            } else {
                class138.field1897.method2073(var6, (byte) 126, var2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 123)
    public static final String method1199(boolean arg0, String arg1, String arg2, String arg3) {
        int var4 = arg2.length();
        field2330++;
        int var5 = arg3.length();
        int var6 = arg1.length();
        if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
        }
        int var7 = var4;
        int var8 = var6 - var5;
        if (var8 != 0) {
            int var9 = 0;
            while (true) {
                int var10 = arg2.indexOf(arg3, var9);
                if (var10 < 0) {
                    break;
                }
                var9 = var5 + var10;
                var7 += var8;
            }
        }
        StringBuffer var11 = new StringBuffer(var7);
        if (!arg0) {
            field2321 = (class52[]) null;
        }
        int var12 = 0;
        while (true) {
            int var13 = arg2.indexOf(arg3, var12);
            if (var13 < 0) {
                var11.append(arg2.substring(var12));
                return var11.toString();
            }
            var11.append(arg2.substring(var12, var13));
            var11.append(arg1);
            var12 = var13 + var5;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(BII)Ljava/lang/String;", line = 184)
    public static final String method1200(byte arg0, int arg1, int arg2) {
        field2322++;
        int var3 = arg2 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 <= 9) {
            int var4 = -109 % ((arg0 - 68) / 38);
            if (var3 > 6) {
                return "<col=40ff00>";
            } else if (var3 > 3) {
                return "<col=80ff00>";
            } else if (var3 <= 0) {
                return "<col=ffff00>";
            } else {
                return "<col=c0ff00>";
            }
        } else {
            return "<col=00ff00>";
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIII)V", line = 226)
    public final void method1201(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2328++;
        int var6 = this.field2319 << 3;
        int var7 = (arg1 << 4) + (var6 & 0xF);
        if (arg3 <= 34) {
            field2327 = (int[]) null;
        }
        int var8 = this.field2325 << 3;
        int var9 = (arg2 << 4) + (var8 & 0xF);
        this.method846(var6, var8, var7, var9, arg0, arg4);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Ldn;IIIII)V", line = 250)
    public static final void method1202(class132 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class313.field4724 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class245.field3524) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class99.field1356 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class202 var14 = class142.field1940[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class333.field5020[var11][var12 + 1][var13] + class333.field5020[var11][var12][var13] + class333.field5020[var11][var12][var13 + 1] + class333.field5020[var11][var12 + 1][var13 + 1]) / 4 - (class333.field5020[arg1][arg2 + 1][arg3] + class333.field5020[arg1][arg2][arg3] + class333.field5020[arg1][arg2][arg3 + 1] + class333.field5020[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class7 var16 = var14.field2873;
                                    if (var16 != null) {
                                        if (var16.field57.method943()) {
                                            arg0.method941(var16.field57, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field55 != null && var16.field55.method943()) {
                                            arg0.method941(var16.field55, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field2875; var17++) {
                                        class280 var18 = var14.field2896[var17];
                                        if (var18 != null && var18.field4199.method943() && (var18.field4204 == var12 || var7 == var12) && (var18.field4200 == var13 || var9 == var13)) {
                                            int var19 = var18.field4205 + 1 - var18.field4204;
                                            int var20 = var18.field4198 + 1 - var18.field4200;
                                            arg0.method941(var18.field4199, (var18.field4204 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field4200 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)V")
    public abstract void method841(int arg0, int arg1);

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(IIIIII)V")
    public abstract void method846(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(II)V")
    public abstract void method844(int arg0, int arg1);

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIII)V")
    public abstract void method837(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)V")
    public abstract void method836(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(IIIII)V")
    public abstract void method838(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "(II)V")
    public abstract void method840(int arg0, int arg1);
}

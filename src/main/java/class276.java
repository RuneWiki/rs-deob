import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class276 extends class287 {

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public int field4255;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    public int field4259;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "[I")
    public int[] field4258;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "[Z")
    public boolean[] field4261;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "[[I")
    public int[][] field4260;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "[I")
    public int[] field4263;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "I")
    public static int field4262 = 0;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "Ljava/lang/String;")
    public static String field4265 = "slide:";

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "Ljava/lang/String;")
    public static String field4264 = "Drop";

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V", line = 9)
    public static void method1937(int arg0) {
        field4265 = null;
        if (arg0 != -1) {
            method1937(103);
        }
        field4264 = null;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(I[B)V", line = 31)
    public class276(int arg0, byte[] arg1) {
        this.field4255 = arg0;
        class6 var3 = new class6(arg1);
        this.field4259 = var3.method58(-288140008);
        this.field4258 = new int[this.field4259];
        this.field4261 = new boolean[this.field4259];
        this.field4260 = new int[this.field4259][];
        this.field4263 = new int[this.field4259];
        for (int var4 = 0; var4 < this.field4259; var4++) {
            this.field4263[var4] = var3.method58(-288140008);
        }
        for (int var5 = 0; var5 < this.field4259; var5++) {
            this.field4261[var5] = var3.method58(-288140008) == 1;
        }
        for (int var6 = 0; var6 < this.field4259; var6++) {
            this.field4258[var6] = var3.method39((byte) 37);
        }
        for (int var7 = 0; var7 < this.field4259; var7++) {
            this.field4260[var7] = new int[var3.method58(-288140008)];
        }
        for (int var8 = 0; var8 < this.field4259; var8++) {
            for (int var9 = 0; var9 < this.field4260[var8].length; var9++) {
                this.field4260[var8][var9] = var3.method58(-288140008);
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZB)V", line = 90)
    public static final void method1938(boolean arg0, byte arg1) {
        field4257++;
        class115.method811(class158.field2455, class117.field1629, class32.field471, class25.field382);
        class115.method807(class60.field882, class154.field2382, arg0);
        class115.method808((float) class240.field3751, (float) class56.field773, (float) class170.field2802);
        class115.method816();
        class300.field4617 = class84.field1149;
        class33.field491 = class110.field1521;
        if (arg1 <= 64) {
            method1938(true, (byte) 46);
        }
        class300.field4618 = class7.field142;
        class300.field4615 = class249.field3929;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lql;BIII)V", line = 108)
    public static final void method1939(class337 arg0, byte arg1, int arg2, int arg3, int arg4) {
        field4256++;
        if (class146.field2310 == arg0 || class78.field1046 >= 400) {
            return;
        }
        String var5;
        if (arg0.field5265 == 0) {
            boolean var6 = true;
            if (class146.field2310.field5247 != -1 && arg0.field5247 != -1) {
                int var7 = class146.field2310.field5247 < arg0.field5247 ? class146.field2310.field5247 : arg0.field5247;
                int var8 = arg0.field5259 >= class146.field2310.field5259 ? arg0.field5259 : class146.field2310.field5259;
                int var9 = var8 * 10 / 100 + (var7 + 5);
                int var10 = class146.field2310.field5259 - arg0.field5259;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (var10 > var9) {
                    var6 = false;
                }
            }
            String var11 = class27.field409 == 1 ? class59.field853 : class1.field1;
            if (arg0.field5259 >= arg0.field5266) {
                var5 = arg0.method2335((byte) 117) + (var6 ? class125.method912(true, class146.field2310.field5259, arg0.field5259) : "<col=ffffff>") + " (" + var11 + arg0.field5259 + ")";
            } else {
                var5 = arg0.method2335((byte) 127) + (var6 ? class125.method912(true, class146.field2310.field5259, arg0.field5259) : "<col=ffffff>") + " (" + var11 + arg0.field5259 + "+" + (arg0.field5266 - arg0.field5259) + ")";
            }
        } else {
            var5 = arg0.method2335((byte) 104) + " (" + class129.field1893 + arg0.field5265 + ")";
        }
        if (class244.field3811 == 1) {
            class230.field3598++;
            class342.method2368(class78.field1054 + " -> <col=ffffff>" + var5, class24.field366, arg4, (byte) -68, class3.field32, (short) 16, (long) arg3, arg2);
        } else if (!class56.field783) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class259.field4079[var12] != null) {
                    class316.field4953++;
                    short var13 = 0;
                    boolean var14 = false;
                    if (class27.field409 == 0 && class259.field4079[var12].equalsIgnoreCase(class48.field628)) {
                        if (arg0.field5259 > class146.field2310.field5259) {
                            var13 = 2000;
                        }
                        if (class146.field2310.field5246 != 0 && arg0.field5246 != 0) {
                            if (class146.field2310.field5246 == arg0.field5246) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class255.field4032[var12]) {
                        var13 = 2000;
                    }
                    short var15 = class70.field971[var12];
                    short var16 = (short) (var13 + var15);
                    class342.method2368("<col=ffffff>" + var5, class259.field4079[var12], arg4, (byte) -68, class105.field1387[var12], var16, (long) arg3, arg2);
                }
            }
        } else if ((class301.field4631 & 0x8) != 0) {
            class179.field2904++;
            class342.method2368(class249.field3931 + " -> <col=ffffff>" + var5, class133.field1957, arg4, (byte) -68, class33.field488, (short) 29, (long) arg3, arg2);
        }
        for (int var17 = 0; var17 < class78.field1046; var17++) {
            if (class282.field4365[var17] == 21) {
                class342.field5324[var17] = "<col=ffffff>" + var5;
                break;
            }
        }
        if (arg1 > -100) {
            method1937(-31);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class470 extends class544 {

    @OriginalMember(owner = "client!nl", name = "L", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "I")
    public int field6564;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
    public int field6565;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "I")
    public int field6566;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
    public int field6567;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "I")
    public static int field6568;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    public int field6569;

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "I")
    public int field6571;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "I")
    public int field6572;

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "I")
    public int field6574;

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "I")
    public int field6576;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "I")
    public int field6577;

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "I")
    public int field6578;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "I")
    public int field6580;

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "I")
    public int field6581;

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "I")
    public int field6582;

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "I")
    public int field6584;

    @OriginalMember(owner = "client!nl", name = "H", descriptor = "I")
    public int field6585;

    @OriginalMember(owner = "client!nl", name = "I", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!nl", name = "J", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!nl", name = "M", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!nl", name = "N", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!nl", name = "O", descriptor = "I")
    public int field6592;

    @OriginalMember(owner = "client!nl", name = "K", descriptor = "Lmr;")
    public class123 field6588;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "Ltc;")
    public class294 field6575;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "Lbn;")
    public class375 field6573;

    @OriginalMember(owner = "client!nl", name = "F", descriptor = "Lsj;")
    public class388 field6583;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V")
    public final void method2738(byte arg0) {
        if (arg0 >= -30) {
            this.field6578 = -78;
        }
        this.field6575 = null;
        this.field6588 = null;
        this.field6573 = null;
        this.field6583 = null;
        field6568++;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;)V")
    public static final void method2739(int arg0, String arg1, byte arg2, String arg3) {
        class91.field1121 = 2;
        field6570++;
        if (arg2 <= 36) {
            method2742(-73);
        }
        class184.field2230 = arg0;
        class81.method476(false, -126, arg1, arg3);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lkj;B)V")
    public static final void method2740(class484 arg0, byte arg1) {
        for (int var2 = 0; var2 < class306.field3893; var2++) {
            int var3 = class42.field334[var2];
            class545 var4 = class459.field6329[var3];
            int var5 = arg0.method2129(arg1 - 58);
            if ((var5 & 0x2) != 0) {
                var5 += arg0.method2129(-110) << 8;
            }
            if ((var5 & 0x1000) != 0) {
                var5 += arg0.method2129(-82) << 16;
            }
            class514.method2948(var5, var4, (byte) -124, arg0, var3);
        }
        if (arg1 != -17) {
            field6589 = 37;
        }
        field6591++;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
    public static final void method2741(int arg0) {
        field6587++;
        if (class565.field8299.method3587((byte) 22, class529.field7429) != 2) {
            return;
        }
        byte var1 = (byte) (class631.field9087 - 4 & 0xFF);
        int var2 = class631.field9087 % class106.field1289;
        int var3 = 0;
        if (arg0 <= 16) {
            return;
        }
        while (var3 < 4) {
            for (int var16 = 0; var16 < class422.field5452; var16++) {
                class250.field3223[var3][var2][var16] = var1;
            }
            var3++;
        }
        if (class442.field6099 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class7.field60[var4] = -1000000;
            class462.field6375[var4] = 1000000;
            class318.field4053[var4] = 0;
            class194.field2351[var4] = 1000000;
            class329.field4301[var4] = 0;
        }
        if (class617.field8931 != 1) {
            int var15 = class426.method2400(-1, class39.field303, class286.field3729, class442.field6099);
            if ((var15 - class521.field7321) >= 800 || (class330.field4304[class442.field6099][class286.field3729 >> 7][class39.field303 >> 7] & 0x4) == 0) {
                return;
            }
            class414.method2363(class39.field303 >> 7, class286.field3729 >> 7, class383.field5070, (byte) 62, 1, false);
            return;
        }
        if ((class330.field4304[class442.field6099][class103.field1265.field8661 >> 7][class103.field1265.field8652 >> 7] & 0x4) != 0) {
            class414.method2363(class103.field1265.field8652 >> 7, class103.field1265.field8661 >> 7, class383.field5070, (byte) 123, 0, false);
        }
        if (class482.field6748 >= 2560) {
            return;
        }
        int var5 = class286.field3729 >> 7;
        int var6 = class39.field303 >> 7;
        int var7 = class103.field1265.field8661 >> 7;
        int var8 = class103.field1265.field8652 >> 7;
        int var9;
        if (var5 >= var7) {
            var9 = var5 - var7;
        } else {
            var9 = var7 - var5;
        }
        int var10;
        if (var8 <= var6) {
            var10 = var6 - var8;
        } else {
            var10 = var8 - var6;
        }
        if ((var9 != 0 || var10 != 0) && var9 > -class106.field1289 && class106.field1289 > var9 && var10 > -class422.field5452 && class422.field5452 > var10) {
            if (var10 < var9) {
                int var11 = var10 * 65536 / var9;
                int var12 = 32768;
                while (var5 != var7) {
                    if (var7 > var5) {
                        var5++;
                    } else if (var7 < var5) {
                        var5--;
                    }
                    if ((class330.field4304[class442.field6099][var5][var6] & 0x4) != 0) {
                        class414.method2363(var6, var5, class383.field5070, (byte) 121, 1, false);
                        return;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        if (var8 > var6) {
                            var6++;
                        } else if (var8 < var6) {
                            var6--;
                        }
                        var12 -= 65536;
                        if ((class330.field4304[class442.field6099][var5][var6] & 0x4) != 0) {
                            class414.method2363(var6, var5, class383.field5070, (byte) 35, 1, false);
                            return;
                        }
                    }
                }
                return;
            }
            int var13 = var9 * 65536 / var10;
            int var14 = 32768;
            while (var6 != var8) {
                if (var6 < var8) {
                    var6++;
                } else if (var6 > var8) {
                    var6--;
                }
                if ((class330.field4304[class442.field6099][var5][var6] & 0x4) != 0) {
                    class414.method2363(var6, var5, class383.field5070, (byte) 91, 1, false);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    var14 -= 65536;
                    if (var5 < var7) {
                        var5++;
                    } else if (var7 < var5) {
                        var5--;
                    }
                    if ((class330.field4304[class442.field6099][var5][var6] & 0x4) != 0) {
                        class414.method2363(var6, var5, class383.field5070, (byte) 78, 1, false);
                        return;
                    }
                }
            }
            return;
        }
        class443.method2597(null, "RC: " + var5 + "," + var6 + " " + var7 + "," + var8 + " " + class632.field9113 + "," + class119.field1504, (byte) 127);
        return;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V")
    public static final void method2742(int arg0) {
        class641 var1 = class341.field4398;
        synchronized (class341.field4398) {
            class341.field4398.method3687(1402);
            if (arg0 != -2) {
                method2740(null, (byte) 70);
            }
        }
        field6590++;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z[B)Lpj;")
    public static final class126 method2743(boolean arg0, byte[] arg1) {
        field6579++;
        class126 var2 = new class126();
        class374 var3 = new class374(arg1);
        var3.field4966 = var3.field4929.length - 2;
        int var4 = var3.method2136(false);
        int var5 = var3.field4929.length - var4 - 2 - 12;
        var3.field4966 = var5;
        int var6 = var3.method2123(arg0);
        var2.field1545 = var3.method2136(arg0);
        var2.field1543 = var3.method2136(false);
        var2.field1540 = var3.method2136(false);
        var2.field1542 = var3.method2136(false);
        int var7 = var3.method2129(-101);
        if (var7 > 0) {
            var2.field1541 = new class451[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method2136(false);
                class451 var10 = new class451(class129.method731(var9, -27265));
                var2.field1541[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method2123(false);
                    int var12 = var3.method2123(false);
                    var10.method2640(1, (long) var11, new class171(var12));
                }
            }
        }
        var3.field4966 = 0;
        var2.field1544 = var3.method2105(arg0);
        var2.field1547 = new int[var6];
        var2.field1539 = new int[var6];
        var2.field1551 = new String[var6];
        int var13 = 0;
        while (var5 > var3.field4966) {
            int var14 = var3.method2136(arg0);
            if (var14 == 3) {
                var2.field1551[var13] = var3.method2133(arg0).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field1547[var13] = var3.method2129(-90);
            } else {
                var2.field1547[var13] = var3.method2123(false);
            }
            var2.field1539[var13++] = var14;
        }
        return var2;
    }

    static {
        new class180("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
        field6589 = 0;
    }
}

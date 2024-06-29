import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class155 {

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "Lqfa;")
    public static class85 field2615 = new class85(26, 0);

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!gw", name = "f", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!gw", name = "h", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!gw", name = "g", descriptor = "[Lcu;")
    public static class202[] field2619;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V")
    public static final void method1198(int arg0) {
        field2620++;
        if (class527.field7429.method2820((byte) -90, class90.field1654) != 2) {
            return;
        }
        byte var1 = (byte) (class705.field9922 - 4 & 0xFF);
        int var2 = class705.field9922 % class675.field9604;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var18 = 0; var18 < class218.field3316; var18++) {
                class483.field6917[var3][var2][var18] = var1;
            }
        }
        if (class37.field1046 == 3) {
            return;
        }
        if (arg0 != 22575) {
            field2617 = 84;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class314.field4643[var4] = -1000000;
            class263.field3848[var4] = 1000000;
            class706.field9941[var4] = 0;
            class70.field1468[var4] = 1000000;
            class129.field2341[var4] = 0;
        }
        int var5 = class532.field7456.field9806;
        int var6 = class532.field7456.field9815;
        if (class423.field6123 != 1 && class266.field3950 == -1) {
            int var7 = class460.method2757(0, class537.field7518, class37.field1046, class206.field3158);
            if (var7 - class1.field97 < 3200 && (class517.field7301[class37.field1046][class206.field3158 >> 9][class537.field7518 >> 9] & 0x4) != 0) {
                class344.method2234(class206.field3158 >> 9, false, false, class257.field3792, class537.field7518 >> 9, 1);
                return;
            }
            return;
        }
        if (class423.field6123 != 1) {
            var5 = class266.field3950;
            var6 = class488.field6995;
        }
        if ((class517.field7301[class37.field1046][var5 >> 9][var6 >> 9] & 0x4) != 0) {
            class344.method2234(var5 >> 9, false, false, class257.field3792, var6 >> 9, 0);
        }
        if (class499.field7113 >= 2560) {
            return;
        }
        int var8 = class206.field3158 >> 9;
        int var9 = class537.field7518 >> 9;
        int var10 = var5 >> 9;
        int var11 = var6 >> 9;
        int var12;
        if (var10 > var8) {
            var12 = var10 - var8;
        } else {
            var12 = var8 - var10;
        }
        int var13;
        if (var9 < var11) {
            var13 = var11 - var9;
        } else {
            var13 = var9 - var11;
        }
        if (var12 == 0 && var13 == 0 || (-class675.field9604) >= var12 || class675.field9604 <= var12 || var13 <= -class218.field3316 || class218.field3316 <= var13) {
            class374.method2357("RC: " + var8 + "," + var9 + " " + var10 + "," + var11 + " " + class33.field967 + "," + class323.field4749, 127, null);
            return;
        }
        if (var12 > var13) {
            int var14 = var13 * 65536 / var12;
            int var15 = 32768;
            while (var8 != var10) {
                if (var10 > var8) {
                    var8++;
                } else if (var8 > var10) {
                    var8--;
                }
                if ((class517.field7301[class37.field1046][var8][var9] & 0x4) != 0) {
                    class344.method2234(var8, false, false, class257.field3792, var9, 1);
                    return;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var11 > var9) {
                        var9++;
                    } else if (var9 > var11) {
                        var9--;
                    }
                    if ((class517.field7301[class37.field1046][var8][var9] & 0x4) != 0) {
                        class344.method2234(var8, false, false, class257.field3792, var9, 1);
                        return;
                    }
                }
            }
            return;
        }
        int var16 = var12 * 65536 / var13;
        int var17 = 32768;
        while (var9 != var11) {
            if (var11 > var9) {
                var9++;
            } else if (var9 > var11) {
                var9--;
            }
            if ((class517.field7301[class37.field1046][var8][var9] & 0x4) != 0) {
                class344.method2234(var8, false, false, class257.field3792, var9, 1);
                return;
            }
            var17 += var16;
            if (var17 >= 65536) {
                var17 -= 65536;
                if (var10 > var8) {
                    var8++;
                } else if (var8 > var10) {
                    var8--;
                }
                if ((class517.field7301[class37.field1046][var8][var9] & 0x4) != 0) {
                    class344.method2234(var8, false, false, class257.field3792, var9, 1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gw", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2613++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)[Lfca;")
    public static final class76[] method1199(int arg0) {
        if (arg0 >= -93) {
            return null;
        } else {
            field2618++;
            return new class76[] { class168.field2803, class168.field2807, class168.field2808, class168.field2809, class168.field2810, class168.field2811, class168.field2812, class168.field2813, class168.field2814, class168.field2815, class168.field2816, class168.field2817, class168.field2818, class168.field2819 };
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lqh;B)Lmr;")
    public static final class129 method1200(class61 arg0, byte arg1) {
        field2616++;
        int var2 = arg0.method732(-559537960);
        class320 var3 = class653.method3723(false)[arg0.method732(-559537960)];
        class547 var4 = class641.method3657((byte) -119)[arg0.method732(-559537960)];
        int var5 = arg0.method721(-461515024);
        int var6 = arg0.method721(-461515024);
        int var7 = arg0.method723((byte) -25);
        int var8 = arg0.method723((byte) -25);
        int var9 = arg0.method730(-54);
        int var10 = arg0.method730(-98);
        int var11 = -1 % ((arg1 - 26) / 53);
        int var12 = arg0.method730(124);
        boolean var13 = arg0.method732(-559537960) == 1;
        return new class129(var2, var3, var4, var5, var6, var7, var8, var9, var10, var12, var13);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)V")
    public static void method1201(byte arg0) {
        int var1 = 65 / ((-arg0 - 27) / 43);
        field2619 = null;
        field2615 = null;
    }
}

import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public abstract class class201 {

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "[I")
    public static int[] field2383 = new int[13];

    @OriginalMember(owner = "client!rfa", name = "g", descriptor = "Llga;")
    public static class712 field2389 = new class712(68, 3);

    @OriginalMember(owner = "client!rfa", name = "h", descriptor = "Lea;")
    public static class547 field2390 = new class547(116, 8);

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!rfa", name = "d", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!rfa", name = "e", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!rfa", name = "f", descriptor = "I")
    public static int field2388;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rfa", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field2391;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ZILjava/lang/String;ILjava/lang/String;ZI)V")
    public static final void method1110(boolean arg0, int arg1, String arg2, int arg3, String arg4, boolean arg5, int arg6) {
        class645.field8984.field7039 = 1;
        field2387++;
        String var7 = arg2.toLowerCase();
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (arg1 != -1) {
            class135 var11 = class482.field6654.method296((byte) 31, arg1);
            if (var11 == null || arg5 != var11.method843(false)) {
                return;
            }
            if (var11.method843(false)) {
                var10 = var11.field1719;
            } else {
                var9 = var11.field1718;
            }
        }
        int var12 = 0;
        for (int var13 = 0; var13 < class761.field10628.field10364; var13++) {
            class697 var16 = class761.field10628.method4169(var13, (byte) -119);
            if ((!arg0 || var16.field9798) && var16.field9735 == -1 && var16.field9793 == -1 && var16.field9801 == 0 && var16.field9780.toLowerCase().indexOf(var7) != -1) {
                if (arg1 != -1) {
                    if (arg5) {
                        if (!arg4.equals(var16.method3940(var10, -1, arg1))) {
                            continue;
                        }
                    } else if (var16.method3939(arg1, (byte) -90, var9) != arg6) {
                        continue;
                    }
                }
                if (var12 >= 250) {
                    class421.field5899 = null;
                    class360.field4769 = -1;
                    return;
                }
                if (var8.length <= var12) {
                    short[] var17 = new short[var8.length * 2];
                    for (int var18 = 0; var18 < var12; var18++) {
                        var17[var18] = var8[var18];
                    }
                    var8 = var17;
                }
                var8[var12++] = (short) var13;
            }
        }
        class421.field5899 = var8;
        class360.field4769 = var12;
        class382.field5392 = 0;
        String[] var14 = new String[class360.field4769];
        for (int var15 = 0; var15 < class360.field4769; var15++) {
            var14[var15] = class761.field10628.method4169(var8[var15], (byte) -127).field9780;
        }
        class103.method707(true, class421.field5899, var14);
        class645.field8984.method2900((byte) -116);
        class645.field8984.field7039 = arg3;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIILha;IZII)V")
    public static final void method1111(int arg0, int arg1, int arg2, int arg3, class60 arg4, int arg5, boolean arg6, int arg7, int arg8) {
        field2386++;
        class722 var9 = (class722) class537.method2958(arg0, arg7, arg2);
        if (var9 != null) {
            class685 var10 = class707.field9894.method4109(var9.method680(30472), (byte) 119);
            int var11 = var9.method685(4657) & 0x3;
            int var12 = var9.method686((byte) 20);
            if (var10.field9602 == -1) {
                int var13 = arg8;
                if (var10.field9610 > 0) {
                    var13 = arg3;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg4.method361(8479, arg5, arg1, var13, 4);
                    } else if (var11 == 1) {
                        arg4.method359(22294, 4, var13, arg5, arg1);
                    } else if (var11 == 2) {
                        arg4.method361(8479, arg5, arg1 + 3, var13, 4);
                    } else if (var11 == 3) {
                        arg4.method359(22294, 4, var13, arg5 + 3, arg1);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg4.method368(1, 1, arg5, var13, (byte) -66, arg1);
                    } else if (var11 == 1) {
                        arg4.method368(1, 1, arg5, var13, (byte) -66, arg1 + 3);
                    } else if (var11 == 2) {
                        arg4.method368(1, 1, arg5 + 3, var13, (byte) -66, arg1 + 3);
                    } else if (var11 == 3) {
                        arg4.method368(1, 1, arg5 + 3, var13, (byte) -66, arg1);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg4.method359(22294, 4, var13, arg5, arg1);
                    } else if (var11 == 1) {
                        arg4.method361(8479, arg5, arg1 + 3, var13, 4);
                    } else if (var11 == 2) {
                        arg4.method359(22294, 4, var13, arg5 + 3, arg1);
                    } else if (var11 == 3) {
                        arg4.method361(8479, arg5, arg1, var13, 4);
                    }
                }
            } else {
                class663.method3750(var11, var10, arg1, arg4, arg5, (byte) 70);
            }
        }
        class722 var14 = (class722) class300.method1797(arg0, arg7, arg2, field2391 == null ? (field2391 = method1116("rl")) : field2391);
        if (var14 != null) {
            class685 var15 = class707.field9894.method4109(var14.method680(30472), (byte) 119);
            int var16 = var14.method685(4657) & 0x3;
            int var17 = var14.method686((byte) 20);
            if (var15.field9602 != -1) {
                class663.method3750(var16, var15, arg1, arg4, arg5, (byte) 70);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field9610 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg4.method405(arg5 + 3, var18, arg5, arg1 + 3, -10550, arg1);
                } else {
                    arg4.method405(arg5, var18, arg5 + 3, arg1 + 3, -10550, arg1);
                }
            }
        }
        class722 var19 = (class722) class531.method2936(arg0, arg7, arg2);
        if (!arg6) {
            field2384 = -91;
        }
        if (var19 == null) {
            return;
        }
        class685 var20 = class707.field9894.method4109(var19.method680(30472), (byte) 119);
        int var21 = var19.method685(4657) & 0x3;
        if (var20.field9602 != -1) {
            class663.method3750(var21, var20, arg1, arg4, arg5, (byte) 70);
            return;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lnaa;B)Lnaa;")
    public abstract class73 method1112(class73 arg0, byte arg1);

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)V")
    public static void method1113(int arg0) {
        field2390 = null;
        field2389 = null;
        field2383 = null;
        if (arg0 < 113) {
            field2389 = null;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)V")
    public static final void method1114(byte arg0) {
        int var1 = 90 / ((arg0 - 19) / 47);
        field2385++;
        if (class21.field142.method375()) {
            class21.field142.method399(class725.field10121);
            class638.method3592(28837);
            if (class247.field3206) {
                class278.method1657(class725.field10121, 7);
            } else {
                Dimension var2 = class725.field10121.getSize();
                class21.field142.method340(class725.field10121, var2.width, var2.height);
            }
            class21.field142.method353(class725.field10121);
        } else {
            class479.method2689(class11.field68.field5503.method741((byte) 123), false, 65);
        }
        class340.method2004(2);
        class315.field4252 = true;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ILcea;)I")
    public static final int method1115(int arg0, class215 arg1) {
        field2388++;
        class274 var2 = arg1.field2589;
        if (arg0 <= 119) {
            field2383 = null;
        }
        if (var2.field3616 != null) {
            var2 = var2.method1637(class386.field5455, (byte) 64);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field3607;
        class351 var4 = arg1.method548(1);
        if (arg1.field837 == -1 || arg1.field803) {
            var3 = var2.field3629;
        } else if (arg1.field837 == var4.field4682 || arg1.field837 == var4.field4650 || arg1.field837 == var4.field4697 || arg1.field837 == var4.field4645) {
            var3 = var2.field3661;
        } else if (arg1.field837 == var4.field4657 || arg1.field837 == var4.field4689 || arg1.field837 == var4.field4698 || arg1.field837 == var4.field4667) {
            var3 = var2.field3644;
        }
        return var3;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1116(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

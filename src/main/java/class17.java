import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class17 {

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    public static int field201 = 3353893;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(BI)[B", line = 5)
    public static final synchronized byte[] method126(byte arg0, int arg1) {
        field204++;
        if (arg1 == 100 && class292.field4589 > 0) {
            byte[] var2 = class344.field5468[--class292.field4589];
            class344.field5468[class292.field4589] = null;
            return var2;
        } else if (arg1 == 5000 && class290.field4569 > 0) {
            byte[] var3 = class308.field4787[--class290.field4569];
            class308.field4787[class290.field4569] = null;
            return var3;
        } else {
            if (arg0 != -117) {
                field201 = 5;
            }
            if (arg1 == 30000 && class203.field3083 > 0) {
                byte[] var4 = class205.field3103[--class203.field3083];
                class205.field3103[class203.field3083] = null;
                return var4;
            } else {
                return new byte[arg1];
            }
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V", line = 49)
    public static final void method127(int arg0) {
        field206++;
        if (class192.method1308((byte) -39) != 2) {
            return;
        }
        byte var1 = (byte) (class182.field2745 - 4 & 0xFF);
        int var2 = class182.field2745 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class349.field5569[var3][var2][var4] = var1;
            }
        }
        if (arg0 != 2552) {
            field201 = 24;
        }
        if (class219.field3290 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class274.field4338[var5] = -1000000;
            class201.field3054[var5] = 1000000;
            class187.field2828[var5] = 0;
            class131.field1894[var5] = 1000000;
            class238.field3664[var5] = 0;
        }
        if (class120.field1667 != 1) {
            int var6 = class14.method80(class280.field4415, class219.field3290, class10.field96, (byte) -126);
            if ((var6 - class119.field1657) < 800 && (class225.field3398[class219.field3290][class10.field96 >> 7][class280.field4415 >> 7] & 0x4) != 0) {
                class246.method1751(1, class280.field4415 >> 7, class194.field2947, class10.field96 >> 7, -1, false);
            }
            return;
        }
        if ((class225.field3398[class219.field3290][class11.field113.field3767 >> 7][class11.field113.field3763 >> 7] & 0x4) != 0) {
            class246.method1751(0, class11.field113.field3763 >> 7, class194.field2947, class11.field113.field3767 >> 7, -1, false);
        }
        if (class283.field4508 >= 310) {
            return;
        }
        int var7 = class10.field96 >> 7;
        int var8 = class280.field4415 >> 7;
        int var9 = class11.field113.field3763 >> 7;
        int var10;
        if (var8 < var9) {
            var10 = var9 - var8;
        } else {
            var10 = var8 - var9;
        }
        int var11 = class11.field113.field3767 >> 7;
        int var12;
        if (var7 >= var11) {
            var12 = var7 - var11;
        } else {
            var12 = var11 - var7;
        }
        if (var12 == 0 && var10 == 0 || var12 <= -104 || var12 >= 104 || var10 <= -104 || var10 >= 104) {
            class27.method198((Throwable) null, (byte) 62, "RC: " + var7 + "," + var8 + " " + var11 + "," + var9 + " " + class322.field4999 + "," + class16.field160);
            return;
        }
        if (var12 > var10) {
            int var15 = 32768;
            int var16 = var10 * 65536 / var12;
            while (var7 != var11) {
                if (var7 < var11) {
                    var7++;
                } else if (var7 > var11) {
                    var7--;
                }
                if ((class225.field3398[class219.field3290][var7][var8] & 0x4) != 0) {
                    class246.method1751(1, var8, class194.field2947, var7, -1, false);
                    break;
                }
                var15 += var16;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var8 < var9) {
                        var8++;
                    } else if (var8 > var9) {
                        var8--;
                    }
                    if ((class225.field3398[class219.field3290][var7][var8] & 0x4) != 0) {
                        class246.method1751(1, var8, class194.field2947, var7, arg0 ^ 0xFFFFF607, false);
                        break;
                    }
                }
            }
            return;
        }
        int var13 = var12 * 65536 / var10;
        int var14 = 32768;
        while (var8 != var9) {
            if (var8 < var9) {
                var8++;
            } else if (var8 > var9) {
                var8--;
            }
            if ((class225.field3398[class219.field3290][var7][var8] & 0x4) != 0) {
                class246.method1751(1, var8, class194.field2947, var7, -1, false);
                break;
            }
            var14 += var13;
            if (var14 >= 65536) {
                if (var11 > var7) {
                    var7++;
                } else if (var7 > var11) {
                    var7--;
                }
                var14 -= 65536;
                if ((class225.field3398[class219.field3290][var7][var8] & 0x4) != 0) {
                    class246.method1751(1, var8, class194.field2947, var7, -1, false);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lhi;BLjava/lang/String;)Ljava/lang/String;", line = 244)
    public static final String method128(class323 arg0, byte arg1, String arg2) {
        field205++;
        if (arg2.indexOf("%") == -1) {
            return arg1 == 63 ? arg2 : (String) null;
        }
        while (true) {
            int var3 = arg2.indexOf("%1");
            if (var3 == -1) {
                while (true) {
                    int var4 = arg2.indexOf("%2");
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg2.indexOf("%3");
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg2.indexOf("%4");
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg2.indexOf("%5");
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg2.indexOf("%dns");
                                                    if (var8 == -1) {
                                                        return arg1 == 63 ? arg2 : (String) null;
                                                    }
                                                    String var9 = "";
                                                    if (class244.field3845 != null) {
                                                        if (class244.field3845.field2421 == null) {
                                                            var9 = class222.method1554(-109, class244.field3845.field2422);
                                                        } else {
                                                            var9 = (String) class244.field3845.field2421;
                                                        }
                                                    }
                                                    arg2 = arg2.substring(0, var8) + var9 + arg2.substring(var8 + 4);
                                                }
                                            }
                                            arg2 = arg2.substring(0, var7) + class102.method645(class333.method2302((byte) -75, arg0, 4), (byte) 119) + arg2.substring(var7 + 2);
                                        }
                                    }
                                    arg2 = arg2.substring(0, var6) + class102.method645(class333.method2302((byte) -75, arg0, 3), (byte) 124) + arg2.substring(var6 + 2);
                                }
                            }
                            arg2 = arg2.substring(0, var5) + class102.method645(class333.method2302((byte) -75, arg0, 2), (byte) 115) + arg2.substring(var5 + 2);
                        }
                    }
                    arg2 = arg2.substring(0, var4) + class102.method645(class333.method2302((byte) -75, arg0, 1), (byte) 123) + arg2.substring(var4 + 2);
                }
            }
            arg2 = arg2.substring(0, var3) + class102.method645(class333.method2302((byte) -75, arg0, 0), (byte) 120) + arg2.substring(var3 + 2);
        }
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(I)Lpa;", line = 341)
    public static final class2 method129(int arg0) {
        field207++;
        int var1 = class259.field4093[0] * class245.field3855[0];
        byte[] var2 = class14.field145[0];
        int[] var3 = new int[var1];
        int var4 = 0;
        int var5 = 107 % ((arg0 + 75) / 41);
        while (var1 > var4) {
            var3[var4] = class251.field3978[class261.method1840(var2[var4], 255)];
            var4++;
        }
        class2 var6;
        if (class272.field4317) {
            var6 = new class200(class122.field1683, class253.field4004, class110.field1518[0], class33.field392[0], class245.field3855[0], class259.field4093[0], var3);
        } else {
            var6 = new class158(class122.field1683, class253.field4004, class110.field1518[0], class33.field392[0], class245.field3855[0], class259.field4093[0], var3);
        }
        class99.method627(3735);
        return var6;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lnk;II)[Lfe;", line = 371)
    public static final class270[] method130(class16 arg0, int arg1, int arg2) {
        field203++;
        if (arg1 == -51) {
            return class313.method2208(arg0, (byte) -89, arg2) ? class303.method2139((byte) 7) : null;
        } else {
            return (class270[]) null;
        }
    }
}

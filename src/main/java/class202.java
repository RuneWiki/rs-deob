import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class202 {

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "Lqe;")
    public static class465 field2886 = new class465(78, 6);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "J")
    public static long field2885;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sa", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field2890;

    // $FF: synthetic method
    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1415(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII)Z", line = 8)
    public static final boolean method1410(int arg0, int arg1, int arg2, int arg3) {
        field2889++;
        if (arg0 != -1) {
            method1413(null, null, null, (byte) -92, null, null);
        }
        class141 var4 = (class141) class654.method3688(arg3, arg1, arg2);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class711.method3972((byte) -125, var4);
        }
        class141 var6 = (class141) class470.method2853(arg3, arg1, arg2, field2890 == null ? (field2890 = method1415("wk")) : field2890);
        if (var6 != null) {
            var5 &= class711.method3972((byte) -127, var6);
        }
        class141 var7 = (class141) class158.method1202(arg3, arg1, arg2);
        if (var7 != null) {
            var5 &= class711.method3972((byte) -124, var7);
        }
        return var5;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V", line = 40)
    public static void method1411(int arg0) {
        field2886 = null;
        if (arg0 != 2) {
            method1414((byte) -8);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILdm;)Ldm;", line = 53)
    public static final class50 method1412(int arg0, class50 arg1) {
        field2883++;
        if (arg1.field791 != -1) {
            return class545.method3220(65535, arg1.field791);
        }
        int var2 = arg1.field792 >>> 16;
        if (arg0 != 13493) {
            return null;
        }
        class310 var3 = new class310(class310.field4383);
        for (class548 var4 = (class548) var3.method2013((byte) 96); var4 != null; var4 = (class548) var3.method2012(-1)) {
            if (var4.field7723 == var2) {
                return class545.method3220(arg0 ^ 0xCB4A, (int) var4.field8991);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lvo;Leq;Leq;BLeq;Lae;)Z", line = 84)
    public static final boolean method1413(class41 arg0, class209 arg1, class209 arg2, byte arg3, class209 arg4, class250 arg5) {
        class454.field6579 = new int[16];
        class284.field4029 = arg5;
        class409.field5685 = arg2;
        class708.field9903 = arg0;
        class623.field8965 = arg1;
        field2884++;
        class752.field10484 = arg4;
        int var6 = 124 / ((arg3 + 28) / 32);
        for (int var7 = 0; var7 < 16; var7++) {
            class454.field6579[var7] = 255;
        }
        return true;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V", line = 110)
    public static final void method1414(byte arg0) {
        if (!class34.field450) {
            class653.field9200 = class710.field9929 != -1 && class710.field9929 <= class409.field5682 || ((class214.field3067 ? 26 : 22) + class409.field5682 * 16) > class363.field5105;
        }
        field2888++;
        if (!class653.field9200) {
            class283.field4025.method1530((byte) 109);
            class440.field6132.method1530((byte) 118);
            for (class66 var1 = (class66) class288.field4066.method1522(true); var1 != null; var1 = (class66) class288.field4066.method1527((byte) 61)) {
                int var2 = var1.field1198;
                if (var2 < 1000) {
                    var1.method3617(1);
                    if (var2 == 21 || var2 == 57 || var2 == 10 || var2 == 50 || var2 == 25 || var2 == 46 || var2 == 51) {
                        class440.field6132.method1526(var1, -127);
                    } else {
                        class283.field4025.method1526(var1, -103);
                    }
                }
            }
            class283.field4025.method1529(52, class288.field4066);
            class440.field6132.method1529(arg0 - 32, class288.field4066);
            if (class409.field5682 <= 1) {
                class522.field7394 = null;
                class43.field657 = null;
            } else {
                if (class630.field9043 && class167.field2461.method1540(125, 81) && class409.field5682 > 2) {
                    class522.field7394 = (class66) class288.field4066.field3131.field8989.field8989;
                } else {
                    class522.field7394 = (class66) class288.field4066.field3131.field8989;
                }
                class43.field657 = (class66) class288.field4066.field3131.field8989;
            }
        } else if (class409.field5682 > 1) {
            class522.field7394 = null;
            class241 var3 = (class241) class211.field3046.field2357.field3201;
            if (class630.field9043 && class167.field2461.method1540(121, 81) && class173.field2513 > 1) {
                class241 var4 = (class241) class211.field3046.field2357.field3201.field3201;
                if (var3.field3382 > 1 && ((class66) var3.field3388.field2357.field3201.field3201).field1198 < var4.method1622(-1)) {
                    class522.field7394 = (class66) var3.field3388.field2357.field3201.field3201;
                } else {
                    class522.field7394 = (class66) var4.field3388.field2357.field3201;
                }
            }
            if (class522.field7394 == null) {
                class522.field7394 = (class66) var3.field3388.field2357.field3201;
            }
            class43.field657 = (class66) var3.field3388.field2357.field3201;
        }
        if (arg0 != 84) {
            field2885 = -114L;
        }
        int var5 = -1;
        class709 var6 = (class709) class119.field1862.method1522(true);
        if (var6 != null) {
            var5 = var6.method2003(-4);
        }
        if (!class34.field450) {
            if (var5 == 0 && (class552.field7737 == 1 && class409.field5682 > 2 || class98.method878((byte) 112))) {
                var5 = 2;
            }
            if (var5 == 2 && class409.field5682 > 0 && var6 != null) {
                if (class755.field10512 == null && class513.field7316 == 0) {
                    class419.method2563(var6.method2002((byte) -106), var6.method2007(-24956), true);
                } else {
                    class152.field2285 = 2;
                }
            }
            if (var5 == 0) {
                if (class522.field7394 != null) {
                    class544.method3216((byte) 87);
                } else if (class737.field10375) {
                    class249.method1662((byte) 122);
                }
            }
            if (class755.field10512 != null || class513.field7316 != 0) {
                return;
            }
            class594.field8486 = null;
            class152.field2285 = 0;
            return;
        }
        if (var5 == -1) {
            int var7 = class422.field5917.method1597(117);
            int var8 = class422.field5917.method1592(true);
            boolean var9 = false;
            if (class316.field4485 != null) {
                if (var7 >= (class138.field2148 - 10) && var7 <= class167.field2468 + class138.field2148 + 10 && (class114.field1826 - 10) <= var8 && class610.field8829 + class114.field1826 + 10 >= var8) {
                    var9 = true;
                } else {
                    class729.method4068(true);
                }
            }
            if (!var9) {
                if ((class396.field5544 - 10) > var7 || var7 > (class396.field5544 + class380.field5300 + 10) || class321.field4557 - 10 > var8 || var8 > class681.field9590 + class321.field4557 + 10) {
                    class361.method2248(-16874);
                } else if (class653.field9200) {
                    int var10 = -1;
                    int var11 = -1;
                    for (int var12 = 0; var12 < class173.field2513; var12++) {
                        if (class214.field3067) {
                            int var14 = class321.field4557 + (var12 * 16) + 33;
                            if (var14 - 13 < var8 && var8 < (var14 + 4)) {
                                var11 = var14 - 13;
                                var10 = var12;
                                break;
                            }
                        } else {
                            int var13 = var12 * 16 + class321.field4557 + 31;
                            if (var13 - 13 < var8 && (var13 + 3) > var8) {
                                var10 = var12;
                                var11 = var13 - 13;
                                break;
                            }
                        }
                    }
                    if (var10 != -1) {
                        int var15 = 0;
                        class467 var16 = new class467(class211.field3046);
                        for (class241 var17 = (class241) var16.method2834(-111); var17 != null; var17 = (class241) var16.method2835((byte) -96)) {
                            if (var10 == var15) {
                                if (var17.field3382 > 1) {
                                    class42.method387(var11, var8, -104, var17);
                                }
                                break;
                            }
                            var15++;
                        }
                    }
                }
            }
        }
        if (var5 != 0) {
            return;
        }
        int var18 = var6.method2007(-24956);
        int var19 = var6.method2002((byte) -108);
        if (class316.field4485 != null && var18 >= class138.field2148 && (class167.field2468 + class138.field2148) >= var18 && var19 >= class114.field1826 && var19 <= (class610.field8829 + class114.field1826)) {
            int var20 = -1;
            for (int var21 = 0; var21 < class316.field4485.field3382; var21++) {
                if (class214.field3067) {
                    int var26 = class114.field1826 + (var21 * 16) + 33;
                    if (var19 > (var26 - 13) && (var26 + 4) > var19) {
                        var20 = var21;
                    }
                } else {
                    int var25 = var21 * 16 + class114.field1826 + 31;
                    if (var25 - 13 < var19 && var25 + 3 > var19) {
                        var20 = var21;
                    }
                }
            }
            if (var20 != -1) {
                int var22 = 0;
                class467 var23 = new class467(class316.field4485.field3388);
                for (class66 var24 = (class66) var23.method2834(-111); var24 != null; var24 = (class66) var23.method2835((byte) -96)) {
                    if (var20 == var22) {
                        class320.method2062(var18, var24, (byte) -72, var19);
                        break;
                    }
                    var22++;
                }
            }
            class361.method2248(-16874);
            return;
        }
        if (class396.field5544 > var18 || var18 > (class396.field5544 + class380.field5300) || class321.field4557 > var19 || var19 > (class681.field9590 + class321.field4557)) {
            return;
        }
        if (class653.field9200) {
            int var27 = -1;
            int var28 = -1;
            for (int var29 = 0; var29 < class173.field2513; var29++) {
                if (class214.field3067) {
                    int var31 = var29 * 16 + (class321.field4557 + 33);
                    if ((var31 - 13) < var19 && var19 < (var31 + 4)) {
                        var28 = var31 - 13;
                        var27 = var29;
                        break;
                    }
                } else {
                    int var30 = var29 * 16 + class321.field4557 + 31;
                    if (var19 > var30 - 13 && var30 + 3 > var19) {
                        var28 = var30 - 13;
                        var27 = var29;
                        break;
                    }
                }
            }
            if (var27 != -1) {
                int var32 = 0;
                class467 var33 = new class467(class211.field3046);
                for (class241 var34 = (class241) var33.method2834(-31); var34 != null; var34 = (class241) var33.method2835((byte) -96)) {
                    if (var27 == var32) {
                        if (var34.field3382 == 1) {
                            class320.method2062(var18, (class66) var34.field3388.field2357.field3201, (byte) -72, var19);
                            class361.method2248(arg0 ^ 0xFFFFBE42);
                            return;
                        }
                        class42.method387(var28, var19, -111, var34);
                        return;
                    }
                    var32++;
                }
                return;
            }
        } else {
            int var35 = -1;
            for (int var36 = 0; var36 < class409.field5682; var36++) {
                if (class214.field3067) {
                    int var41 = class321.field4557 - (-((class409.field5682 - var36 - 1) * 16) - 33);
                    if ((var41 - 13) < var19 && (var41 + 4) > var19) {
                        var35 = var36;
                    }
                } else {
                    int var40 = class321.field4557 + ((-var36 + class409.field5682 + -1) * 16) + 31;
                    if (var40 - 13 < var19 && (var40 + 3) > var19) {
                        var35 = var36;
                    }
                }
            }
            if (var35 != -1) {
                int var37 = 0;
                class468 var38 = new class468(class288.field4066);
                for (class66 var39 = (class66) var38.method2841(1); var39 != null; var39 = (class66) var38.method2840(arg0 - 6418)) {
                    if (var35 == var37) {
                        class320.method2062(var18, var39, (byte) -72, var19);
                        break;
                    }
                    var37++;
                }
            }
            class361.method2248(-16874);
        }
        return;
    }
}

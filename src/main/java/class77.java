import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class77 extends RuntimeException {

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "Ljava/lang/Throwable;")
    public Throwable field864;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "Ljava/lang/String;")
    public String field862;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "Ljava/lang/String;")
    public static String field863 = "Loading fonts - ";

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "Z")
    public static boolean field870 = false;

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "[Lja;")
    public static class152[] field866 = new class152[14];

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class77(Throwable arg0, String arg1) {
        this.field864 = arg0;
        this.field862 = arg1;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(BZ)V")
    public static final void method435(byte arg0, boolean arg1) {
        if (arg1) {
            if (class424.field6086 != -1) {
                class242.method1534(arg0 + 72, class424.field6086);
            }
            for (class201 var2 = (class201) class396.field5783.method1212(arg0 - 88); var2 != null; var2 = (class201) class396.field5783.method1207(false)) {
                if (!var2.method2289(118)) {
                    var2 = (class201) class396.field5783.method1212(-20);
                    if (var2 == null) {
                        break;
                    }
                }
                class164.method1057(true, var2, arg0 ^ 0xE, false);
            }
            class424.field6086 = -1;
            class396.field5783 = new class189(8);
            class369.method2328((byte) -87);
            class424.field6086 = class267.field3737;
            class151.method902(true, false);
            class109.method609(-76);
            class387.method2472(class424.field6086);
        }
        field868++;
        class148.method887(7066);
        if (arg0 != 14) {
            return;
        }
        class410.field5936 = -1;
        class326.method2009(class225.field3076, (byte) -105);
        class390.field5715 = new class133();
        class390.field5715.field1304 = 6656;
        class390.field5715.field1311 = 6656;
        class390.field5715.field6351[0] = 52;
        class272.field3852 = 0;
        class272.field3853 = 0;
        class390.field5715.field6350[0] = 52;
        if (class231.field3128 == 2) {
            class272.field3853 = class228.field3114 << 7;
            class272.field3852 = class402.field5872 << 7;
        } else {
            class160.method1050((byte) 115);
        }
        class6.method58(-125);
        if (class272.field3853 == 0 || class272.field3852 == 0) {
            class266.method1695(10, (byte) 119);
        } else {
            class388.method2478(-1046088316);
            class266.method1695(28, (byte) -81);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
    public static void method436(int arg0) {
        field863 = null;
        field866 = null;
        if (arg0 != 18866) {
            field866 = null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)V")
    public static final void method437(int arg0) {
        field867++;
        if (class93.method501((byte) 125) != 2) {
            return;
        }
        byte var1 = (byte) (class54.field606 - 4 & 0xFF);
        int var2 = -91 % ((arg0 + 42) / 36);
        int var3 = class54.field606 % class279.field3935;
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var17 = 0; var17 < class164.field2287; var17++) {
                class266.field3716[var4][var3][var17] = var1;
            }
        }
        if (class410.field5931 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class217.field2969[var5] = -1000000;
            class245.field3332[var5] = 1000000;
            class173.field2413[var5] = 0;
            class123.field1638[var5] = 1000000;
            class366.field5349[var5] = 0;
        }
        if (class231.field3128 != 1) {
            int var6 = class372.method2335(class272.field3852, class410.field5931, (byte) 84, class272.field3853);
            if ((var6 - class164.field2289) < 800 && (class166.field2327[class410.field5931][class272.field3853 >> 7][class272.field3852 >> 7] & 0x4) != 0) {
                class343.method2197(4095, 1, false, class19.field202, class272.field3853 >> 7, class272.field3852 >> 7);
            }
            return;
        }
        if ((class166.field2327[class410.field5931][class390.field5715.field1304 >> 7][class390.field5715.field1311 >> 7] & 0x4) != 0) {
            class343.method2197(4095, 0, false, class19.field202, class390.field5715.field1304 >> 7, class390.field5715.field1311 >> 7);
        }
        if (class314.field4472 >= 2560) {
            return;
        }
        int var7 = class272.field3853 >> 7;
        int var8 = class272.field3852 >> 7;
        int var9 = class390.field5715.field1304 >> 7;
        int var10 = class390.field5715.field1311 >> 7;
        int var11;
        if (var9 > var7) {
            var11 = var9 - var7;
        } else {
            var11 = var7 - var9;
        }
        int var12;
        if (var8 < var10) {
            var12 = var10 - var8;
        } else {
            var12 = var8 - var10;
        }
        if (!(var11 != 0 || var12 != 0) || var11 <= (-class279.field3935) || var11 >= class279.field3935 || var12 <= (-class164.field2287) || class164.field2287 <= var12) {
            class411.method2578((Throwable) null, "RC: " + var7 + "," + var8 + " " + var9 + "," + var10 + " " + class40.field427 + "," + class217.field2975, (byte) -68);
        } else if (var12 >= var11) {
            int var13 = var11 * 65536 / var12;
            int var14 = 32768;
            while (var8 != var10) {
                if (var8 < var10) {
                    var8++;
                } else if (var8 > var10) {
                    var8--;
                }
                if ((class166.field2327[class410.field5931][var7][var8] & 0x4) != 0) {
                    class343.method2197(4095, 1, false, class19.field202, var7, var8);
                    return;
                }
                var14 += var13;
                if (var14 >= 65536) {
                    var14 -= 65536;
                    if (var9 > var7) {
                        var7++;
                    } else if (var7 > var9) {
                        var7--;
                    }
                    if ((class166.field2327[class410.field5931][var7][var8] & 0x4) != 0) {
                        class343.method2197(4095, 1, false, class19.field202, var7, var8);
                        return;
                    }
                }
            }
        } else {
            int var15 = var12 * 65536 / var11;
            int var16 = 32768;
            while (var7 != var9) {
                if (var9 > var7) {
                    var7++;
                } else if (var9 < var7) {
                    var7--;
                }
                if ((class166.field2327[class410.field5931][var7][var8] & 0x4) != 0) {
                    class343.method2197(4095, 1, false, class19.field202, var7, var8);
                    return;
                }
                var16 += var15;
                if (var16 >= 65536) {
                    if (var8 < var10) {
                        var8++;
                    } else if (var8 > var10) {
                        var8--;
                    }
                    var16 -= 65536;
                    if ((class166.field2327[class410.field5931][var7][var8] & 0x4) != 0) {
                        class343.method2197(4095, 1, false, class19.field202, var7, var8);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)Z")
    public static final boolean method438(int arg0, int arg1) {
        field865++;
        if (~arg1 == arg0 || arg1 == 42 || arg1 == 32 || arg1 == 24 || arg1 == 1005) {
            return true;
        } else {
            return arg1 == 4 || arg1 == 33 || arg1 == 1002;
        }
    }
}

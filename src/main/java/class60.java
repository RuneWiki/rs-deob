import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class60 {

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "Ljp;")
    private class236 field932 = new class236(64);

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "Lpc;")
    private class473 field935;

    @OriginalMember(owner = "client!tt", name = "m", descriptor = "I")
    public int field944;

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "I")
    public static int field939 = 0;

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "Lvj;")
    public static class304 field940 = new class304("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!tt", name = "k", descriptor = "I")
    public static int field942 = 0;

    @OriginalMember(owner = "client!tt", name = "o", descriptor = "I")
    public static int field946 = 500;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!tt", name = "j", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!tt", name = "n", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!tt", name = "l", descriptor = "Lpc;")
    public static class473 field943;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method420(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field937++;
        if (class497.field6886 == null) {
            class370.field4984.method1093(arg4, arg1, arg2, 3, arg0, -16777216);
        } else if (class385.field5232.field584 >= 0 && class385.field5232.field584 < class12.field251 * 128 && class385.field5232.field574 >= 0 && (class289.field3782 * 128) > class385.field5232.field574) {
            class33.field531++;
            if (class385.field5232 != null && class385.field5232.field584 - ((class385.field5232.method2590(0) - 1) * 64) >> 7 == class11.field239 && class385.field5232.field574 - ((class385.field5232.method2590(0) - 1) * 64) >> 7 == class497.field6888) {
                class11.field239 = -1;
                class497.field6888 = -1;
                class56.method404(0);
            }
            class449.method2573(0);
            if (!arg5) {
                class356.method2083(0);
            }
            class523.method3083(-6906);
            class528.method3108(true, arg4, (byte) -56, arg2, arg1, arg0);
            int var6 = class258.field3418;
            int var7 = class438.field6010;
            int var8 = class381.field5208;
            int var9 = class484.field6733;
            if (class42.field623 == 1) {
                int var10 = (int) class426.field5820;
                if (class366.field4952 >> 8 > var10) {
                    var10 = class366.field4952 >> 8;
                }
                if (class265.field3504[4] && (class222.field2990[4] + 128) > var10) {
                    var10 = class222.field2990[4] + 128;
                }
                int var11 = (int) class184.field2621 + class336.field4405 & 0x3FFF;
                class170.method1137(var9, 890660175, class429.field5883, var11, var10, class210.method1330(class411.field5656, (byte) -60, class385.field5232.field584, class385.field5232.field574) - 50, (var10 >> 3) * 3 + 600 << 0, class150.field2135);
            } else if (class42.field623 == 4) {
                int var12 = (int) class426.field5820;
                if (class366.field4952 >> 8 > var12) {
                    var12 = class366.field4952 >> 8;
                }
                if (class265.field3504[4] && class222.field2990[4] + 128 > var12) {
                    var12 = class222.field2990[4] + 128;
                }
                int var13 = (int) class184.field2621 & 0x3FFF;
                class170.method1137(var9, 890660175, class429.field5883, var13, var12, class210.method1330(class411.field5656, (byte) -79, class375.field5094, class183.field2610) - 50, (var12 >> 3) * 3 + 600 << 0, class150.field2135);
            } else if (class42.field623 == 5) {
                class522.method3080(-9765, var9);
            }
            int var14 = class430.field5888;
            int var15 = class365.field4937;
            int var16 = class168.field2438;
            int var17 = class168.field2439;
            int var18 = class207.field2854;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class265.field3504[var19]) {
                    int var22 = (int) ((double) (-class65.field1013[var19]) + Math.random() * (double) (class65.field1013[var19] * 2 + 1) + Math.sin((double) class225.field3045[var19] / 100.0D * (double) class189.field2665[var19]) * (double) class222.field2990[var19]);
                    if (var19 == 4) {
                        class168.field2439 += var22;
                        if (class168.field2439 < 1024) {
                            class168.field2439 = 1024;
                        } else if (class168.field2439 > 3072) {
                            class168.field2439 = 3072;
                        }
                    }
                    if (var19 == 0) {
                        class430.field5888 += var22;
                    }
                    if (var19 == 3) {
                        class207.field2854 = class207.field2854 + var22 & 0x3FFF;
                    }
                    if (var19 == 1) {
                        class365.field4937 += var22;
                    }
                    if (var19 == 2) {
                        class168.field2438 += var22;
                    }
                }
            }
            if (class430.field5888 < 0) {
                class430.field5888 = 0;
            }
            if ((class439.field6036 << 7) - 1 < class430.field5888) {
                class430.field5888 = (class439.field6036 << 7) - 1;
            }
            if (class168.field2438 < 0) {
                class168.field2438 = 0;
            }
            if (class168.field2438 > ((class318.field4170 << 7) - 1)) {
                class168.field2438 = (class318.field4170 << 7) - 1;
            }
            client.method1262((byte) -124);
            class493.method2837(-1980137565);
            class370.field4984.method572(var7, var8, var7 + var6, var8 + var9);
            class370.field4984.method600();
            int var20 = class154.field2241;
            if (class121.field1775 == null) {
                class370.field4984.method550(var20);
            } else {
                class121.field1775.method774(var6, class370.field4984, class205.field2831 << 3, 80, var7, var8, class207.field2854, var20, class168.field2439, var9);
            }
            class88.method641((byte) 127);
            if (arg3 > -67) {
                field943 = null;
            }
            class130.field1895.method958(class430.field5888, class365.field4937, class168.field2438, -class168.field2439 & 0x3FFF, -class207.field2854 & 0x3FFF, -class47.field699 & 0x3FFF);
            class370.field4984.method603(class130.field1895);
            class370.field4984.method573(var7 + (var6 / 2), var9 / 2 + var8, class427.field5834 << 1, class427.field5834 << 1);
            class33.method258(var9 / 2 + var8, -96, var6 / 2 + var7, class427.field5834 << 1, class427.field5834 << 1);
            class342.method1986((byte) -39, -class47.field699 & 0x3FFF, class168.field2438, class430.field5888, class365.field4937, -class168.field2439 & 0x3FFF, -class207.field2854 & 0x3FFF);
            byte var21 = class154.field2244.method1849(class166.field2414, (byte) -103) == 2 ? (byte) class33.field531 : 1;
            class118.method820(class370.field4984, class31.field516, class22.field391, class130.field1895, class430.field5888, class365.field4937, class168.field2438, class99.field1482, class196.field2752, class199.field2760, class457.field6298, class426.field5818, class125.field1845, class385.field5232.field573 + 1, var21, class385.field5232.field584 >> 7, class385.field5232.field574 >> 7, !class154.field2244.field7758);
            class88.method641((byte) 112);
            if (class454.field6161 == 30) {
                class364.method2123(256, var9, 256, var6, var7, var8, -21109);
                class356.method2084(var8, (byte) -8, var6, 256, 256, var7, var9);
                class507.method2899(var9, var8, 10, var7, 256, 256, var6);
                class40.method295(var7, var9, var8, (byte) 95, var6);
            }
            class297.method1735();
            class430.field5888 = var14;
            class365.field4937 = var15;
            class168.field2438 = var16;
            class207.field2854 = var18;
            class168.field2439 = var17;
            if (class433.field5938 && class287.field3760.method1550((byte) 28) == 0) {
                class433.field5938 = false;
            }
            if (class433.field5938) {
                class370.field4984.method1093(var9, var7, var8, 3, var6, -16777216);
                class253.method1525(class299.field3960.method1764(class489.field6789, false), class302.field3995, 1, false);
            }
        } else {
            class370.field4984.method1093(arg4, arg1, arg2, 3, arg0, -16777216);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V")
    public final void method421(int arg0) {
        class236 var2 = this.field932;
        synchronized (this.field932) {
            if (arg0 != 16383) {
                method424(-9, 5, 43, -127, -54, 10, 6, -114, 104, -99);
            }
            this.field932.method1458((byte) 125);
        }
        field941++;
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)V")
    public final void method422(int arg0) {
        class236 var2 = this.field932;
        synchronized (this.field932) {
            this.field932.method1459(19088);
        }
        if (arg0 > 30) {
            field938++;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZI)Lom;")
    public final class251 method423(boolean arg0, int arg1) {
        if (!arg0) {
            method426((byte) -109);
        }
        field936++;
        class236 var3 = this.field932;
        class251 var4;
        synchronized (this.field932) {
            var4 = (class251) this.field932.method1456((long) arg1, 119);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field935.method2708(16, arg1, (byte) 54);
        class251 var6 = new class251();
        if (var5 != null) {
            var6.method1511(68, new class379(var5));
        }
        class236 var7 = this.field932;
        synchronized (this.field932) {
            this.field932.method1462(var6, (long) arg1, -115);
            return var6;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method424(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 >= class308.field4055 && class71.field1077 >= arg4 && arg2 >= class308.field4055 && class71.field1077 >= arg2 && class308.field4055 <= arg0 && arg0 <= class71.field1077 && arg3 >= class308.field4055 && arg3 <= class71.field1077 && class353.field4777 <= arg8 && class300.field3971 >= arg8 && class353.field4777 <= arg7 && class300.field3971 >= arg7 && arg5 >= class353.field4777 && arg5 <= class300.field3971 && class353.field4777 <= arg1 && arg1 <= class300.field3971) {
            class268.method1613(arg3, arg1, arg7, arg0, arg6, arg4, arg5, arg2, 3, arg8);
        } else {
            class420.method2421(arg5, arg3, arg4, 3, arg8, arg2, arg6, arg1, arg0, arg7);
        }
        field933++;
        int var10 = -18 % ((-arg9 - 2) / 46);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)V")
    public final void method425(int arg0, int arg1) {
        field934++;
        int var3 = 28 / ((arg0 - 70) / 49);
        class236 var4 = this.field932;
        synchronized (this.field932) {
            this.field932.method1461(-5, arg1);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)V")
    public static void method426(byte arg0) {
        field940 = null;
        field943 = null;
        if (arg0 != 88) {
            method424(115, 9, -97, -62, -87, -70, -26, 91, -70, -30);
        }
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lrb;ILpc;)V")
    public class60(class234 arg0, int arg1, class473 arg2) {
        this.field935 = arg2;
        if (this.field935 == null) {
            this.field944 = 0;
        } else {
            this.field944 = this.field935.method2710(16, (byte) -123);
        }
    }
}

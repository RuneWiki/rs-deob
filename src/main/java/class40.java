import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class40 {

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field575 = -1;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "Ljava/lang/String;")
    public static String field572 = "yellow:";

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "Ljava/lang/String;")
    public static String field573 = "Loaded input handler";

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "[B")
    public static byte[] field584;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "[I")
    public static int[] field576;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V", line = 4)
    public static void method289(byte arg0) {
        field584 = null;
        field573 = null;
        if (arg0 > -7) {
            field584 = (byte[]) null;
        }
        field572 = null;
        field576 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)V", line = 22)
    public static final void method290(int arg0, int arg1) {
        field578++;
        class113.field1726[0] = (float) (class311.method2135(arg0, arg1) >> 16) / 255.0F;
        class113.field1726[2] = (float) class311.method2135(255, arg1) / 255.0F;
        class113.field1726[1] = (float) (class311.method2135(65422, arg1) >> 8) / 255.0F;
        class329.method2227(3, -100);
        class329.method2227(4, arg0 ^ 0xFF0081B8);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 40)
    public static final void method291(int arg0) {
        field580++;
        if (class19.field265 == 0) {
            return;
        }
        try {
            if (++class109.field1693 > 2000) {
                if (class308.field4851 != null) {
                    class308.field4851.method596(false);
                    class308.field4851 = null;
                }
                if (class286.field4385 >= 1) {
                    class285.field4375 = -5;
                    class19.field265 = 0;
                    return;
                }
                if (class43.field610 == class23.field292) {
                    class23.field292 = class221.field3506;
                } else {
                    class23.field292 = class43.field610;
                }
                class109.field1693 = 0;
                class19.field265 = 1;
                class286.field4385++;
            }
            if (class19.field265 == 1) {
                class84.field1266 = class89.field1359.method1508(-119, class23.field292, class82.field1229);
                class19.field265 = 2;
            }
            if (class19.field265 == 2) {
                if (class84.field1266.field3931 == 2) {
                    throw new IOException();
                }
                if (class84.field1266.field3931 != 1) {
                    return;
                }
                class308.field4851 = new class88((Socket) class84.field1266.field3929, class89.field1359);
                class84.field1266 = null;
                class308.field4851.method598(0, class265.field4095.field4679, 1, class265.field4095.field4716);
                if (class228.field3654 != null) {
                    class228.field3654.method1192(false);
                }
                if (class196.field2944 != null) {
                    class196.field2944.method1192(false);
                }
                int var1 = class308.field4851.method602(69);
                if (class228.field3654 != null) {
                    class228.field3654.method1192(false);
                }
                if (class196.field2944 != null) {
                    class196.field2944.method1192(false);
                }
                if (var1 != 21) {
                    class285.field4375 = var1;
                    class19.field265 = 0;
                    class308.field4851.method596(false);
                    class308.field4851 = null;
                    return;
                }
                class19.field265 = 3;
            }
            if (class19.field265 == 3) {
                if (class308.field4851.method607(-121) < 1) {
                    return;
                }
                class172.field2626 = new String[class308.field4851.method602(83)];
                class19.field265 = 4;
            }
            if (class19.field265 == 4) {
                if (class308.field4851.method607(105) < class172.field2626.length * 8) {
                    return;
                }
                class230.field3713.field4679 = 0;
                class308.field4851.method604(84, class172.field2626.length * 8, 0, class230.field3713.field4716);
                for (int var2 = 0; var2 < class172.field2626.length; var2++) {
                    class172.field2626[var2] = class97.method665(50, class230.field3713.method2047((byte) -84));
                }
                class285.field4375 = 21;
                class19.field265 = 0;
                class308.field4851.method596(false);
                class308.field4851 = null;
                return;
            }
            int var3 = -88 / ((-arg0 - 61) / 47);
        } catch (IOException var5) {
            if (class308.field4851 != null) {
                class308.field4851.method596(false);
                class308.field4851 = null;
            }
            if (class286.field4385 >= 1) {
                class19.field265 = 0;
                class285.field4375 = -4;
            } else {
                if (class43.field610 == class23.field292) {
                    class23.field292 = class221.field3506;
                } else {
                    class23.field292 = class43.field610;
                }
                class109.field1693 = 0;
                class286.field4385++;
                class19.field265 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lte;BI)V", line = 198)
    public static final void method292(class38 arg0, byte arg1, int arg2) {
        if (class343.field5341 < arg0.field553) {
            class10.method59((byte) 112, arg0);
        } else if (arg0.field466 >= class343.field5341) {
            class83.method574(arg0, (byte) 71);
        } else {
            class105.method714(64, arg0);
        }
        if (arg0.field537 < 128 || arg0.field519 < 128 || arg0.field537 >= 13184 || arg0.field519 >= 13184) {
            arg0.field553 = 0;
            arg0.field466 = 0;
            arg0.field530 = -1;
            arg0.field507 = -1;
            arg0.field537 = arg0.field476[0] * 128 + arg0.method271((byte) 72) * 64;
            arg0.field519 = arg0.field505[0] * 128 + arg0.method271((byte) 59) * 64;
            arg0.method284(105);
        }
        if (arg1 != 46) {
            method290(-115, -58);
        }
        field582++;
        if (class79.field1173 == arg0 && (arg0.field537 < 1536 || arg0.field519 < 1536 || arg0.field537 >= 11776 || arg0.field519 >= 11776)) {
            arg0.field466 = 0;
            arg0.field530 = -1;
            arg0.field507 = -1;
            arg0.field553 = 0;
            arg0.field537 = arg0.field476[0] * 128 + (arg0.method271((byte) 44) * 64);
            arg0.field519 = arg0.field505[0] * 128 + arg0.method271((byte) 107) * 64;
            arg0.method284(48);
        }
        class112.method748((byte) 101, arg0);
        class106.method718(100, arg0);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IZ)V", line = 254)
    public static final void method293(int arg0, boolean arg1) {
        class150.field2371 = 0;
        class284.field4354 = arg1;
        class85.field1289 = null;
        class160.field2483 = -1;
        class278.field4286 = 1;
        class283.field4341 = arg0;
        class82.field1219 = -1;
        field579++;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V", line = 270)
    public static final void method294(int arg0) {
        field574++;
        int var1 = class269.field4147 * 128 + 64;
        if (arg0 < 47) {
            method296(-82);
        }
        int var2 = class131.field2067 * 128 + 64;
        int var3 = class39.method286(class77.field1154, (byte) 82, var2, var1) - class184.field2821;
        if (class84.field1270 < 100) {
            if (class298.field4598 < var2) {
                class298.field4598 += (var2 - class298.field4598) * class84.field1270 / 1000 + class284.field4357;
                if (class298.field4598 > var2) {
                    class298.field4598 = var2;
                }
            }
            if (var2 < class298.field4598) {
                class298.field4598 -= class284.field4357 + ((class298.field4598 - var2) * class84.field1270 / 1000);
                if (var2 > class298.field4598) {
                    class298.field4598 = var2;
                }
            }
            if (class169.field2579 < var3) {
                class169.field2579 += (var3 - class169.field2579) * class84.field1270 / 1000 + class284.field4357;
                if (var3 < class169.field2579) {
                    class169.field2579 = var3;
                }
            }
            if (class225.field3592 < var1) {
                class225.field3592 += (var1 - class225.field3592) * class84.field1270 / 1000 + class284.field4357;
                if (class225.field3592 > var1) {
                    class225.field3592 = var1;
                }
            }
            if (var3 < class169.field2579) {
                class169.field2579 -= (class169.field2579 - var3) * class84.field1270 / 1000 + class284.field4357;
                if (class169.field2579 < var3) {
                    class169.field2579 = var3;
                }
            }
            if (var1 < class225.field3592) {
                class225.field3592 -= (class225.field3592 - var1) * class84.field1270 / 1000 + class284.field4357;
                if (class225.field3592 < var1) {
                    class225.field3592 = var1;
                }
            }
        } else {
            class225.field3592 = class269.field4147 * 128 + 64;
            class298.field4598 = class131.field2067 * 128 + 64;
            class169.field2579 = class39.method286(class77.field1154, (byte) 82, class298.field4598, class225.field3592) - class184.field2821;
        }
        int var4 = class29.field365 * 128 + 64;
        int var5 = class213.field3379 * 128 + 64;
        int var6 = class39.method286(class77.field1154, (byte) 82, var4, var5) - class160.field2491;
        int var7 = var5 - class225.field3592;
        int var8 = var6 - class169.field2579;
        int var9 = var4 - class298.field4598;
        int var10 = (int) Math.sqrt((double) (var9 * var9 + (var7 * var7)));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var9, (double) var7)) & 0x7FF;
        int var13 = var12 - class305.field4781;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var11 > class199.field2989) {
            class199.field2989 += (var11 - class199.field2989) * class90.field1364 / 1000 + class27.field348;
            if (var11 < class199.field2989) {
                class199.field2989 = var11;
            }
        }
        if (class199.field2989 > var11) {
            class199.field2989 -= (class199.field2989 - var11) * class90.field1364 / 1000 + class27.field348;
            if (var11 > class199.field2989) {
                class199.field2989 = var11;
            }
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class305.field4781 += class90.field1364 * var13 / 1000 + class27.field348;
            class305.field4781 &= 0x7FF;
        }
        if (var13 < 0) {
            class305.field4781 -= -var13 * class90.field1364 / 1000 + class27.field348;
            class305.field4781 &= 0x7FF;
        }
        int var14 = var12 - class305.field4781;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class305.field4781 = var12;
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(II)Ltj;", line = 423)
    public static final class273 method295(int arg0, int arg1) {
        field581++;
        if (arg0 != 13) {
            return (class273) null;
        } else if (arg1 == 0) {
            return new class194();
        } else if (arg1 == 1) {
            return new class22();
        } else if (arg1 == 2) {
            return new class78();
        } else if (arg1 == 3) {
            return new class50();
        } else if (arg1 == 4) {
            return new class100();
        } else if (arg1 == 5) {
            return new class158();
        } else if (arg1 == 6) {
            return new class74();
        } else if (arg1 == 7) {
            return new class297();
        } else if (arg1 == 8) {
            return new class230();
        } else if (arg1 == 9) {
            return new class104();
        } else if (arg1 == 10) {
            return new class99();
        } else if (arg1 == 11) {
            return new class59();
        } else if (arg1 == 12) {
            return new class155();
        } else if (arg1 == 13) {
            return new class115();
        } else if (arg1 == 14) {
            return new class274();
        } else if (arg1 == 15) {
            return new class51();
        } else if (arg1 == 16) {
            return new class204();
        } else if (arg1 == 17) {
            return new class87();
        } else if (arg1 == 18) {
            return new class266();
        } else if (arg1 == 19) {
            return new class154();
        } else if (arg1 == 20) {
            return new class206();
        } else if (arg1 == 21) {
            return new class151();
        } else if (arg1 == 22) {
            return new class173();
        } else if (arg1 == 23) {
            return new class93();
        } else if (arg1 == 24) {
            return new class219();
        } else if (arg1 == 25) {
            return new class160();
        } else if (arg1 == 26) {
            return new class47();
        } else if (arg1 == 27) {
            return new class72();
        } else if (arg1 == 28) {
            return new class324();
        } else if (arg1 == 29) {
            return new class248();
        } else if (arg1 == 30) {
            return new class184();
        } else if (arg1 == 31) {
            return new class162();
        } else if (arg1 == 32) {
            return new class124();
        } else if (arg1 == 33) {
            return new class85();
        } else if (arg1 == 34) {
            return new class190();
        } else if (arg1 == 35) {
            return new class81();
        } else if (arg1 == 36) {
            return new class268();
        } else if (arg1 == 37) {
            return new class255();
        } else if (arg1 == 38) {
            return new class71();
        } else if (arg1 == 39) {
            return new class211();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)V", line = 748)
    public static final void method296(int arg0) {
        field577++;
        if (class138.field2147) {
            return;
        }
        class171.field2602 = true;
        if (arg0 != -16) {
            field575 = 43;
        }
        if (class298.field4569) {
            class309.field4866 = (float) ((int) class309.field4866 + 47 & 0xFFFFFFF0);
        } else {
            class207.field3125 += (12.0F - class207.field3125) / 2.0F;
        }
        class138.field2147 = true;
    }
}

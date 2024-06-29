import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class55 {

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "Lwd;")
    private class153 field1129 = new class153(256);

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Ljb;")
    private class64 field1124;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "Ljb;")
    private class64 field1135;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "Lqf;")
    public static class117 field1130 = class72.method514(116, "sl_stars");

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "Lqf;")
    public static class117 field1128 = class72.method514(125, "Regelversto-8 melden");

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "Lqf;")
    private static class117 field1126 = class72.method514(113, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "Lqf;")
    public static class117 field1131 = field1126;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "Lqf;")
    public static class117 field1139 = class72.method514(126, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "[Lub;")
    public static class139[] field1141 = new class139[50];

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "Z")
    public static boolean field1144 = false;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "Lqf;")
    public static class117 field1145 = class72.method514(110, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "Ljava/awt/Image;")
    public static Image field1138;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[III)Lfc;")
    private final class39 method403(int arg0, int[] arg1, int arg2, int arg3) {
        field1132++;
        if (arg0 != 15) {
            field1145 = null;
        }
        int var5 = (arg3 >>> 12 | arg3 << 4 & 0xFFF8) ^ arg2;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class39 var9 = (class39) this.field1129.method1221(121, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class123 var10 = class123.method981(this.field1135, arg3, arg2);
            if (var10 == null) {
                return null;
            }
            class39 var11 = var10.method979();
            this.field1129.method1219(var11, (byte) -97, var7);
            if (arg1 != null) {
                arg1[0] -= var11.field790.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public static void method404(int arg0) {
        field1145 = null;
        field1126 = null;
        field1130 = null;
        field1141 = null;
        if (arg0 != 120) {
            field1145 = null;
        }
        field1139 = null;
        field1131 = null;
        field1128 = null;
        field1138 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([IBI)Lfc;")
    public final class39 method405(int[] arg0, byte arg1, int arg2) {
        field1123++;
        if (arg1 != 51) {
            return null;
        } else if (this.field1124.method439(-111) == 1) {
            return this.method409(arg0, true, arg2, 0);
        } else if (this.field1124.method440(arg2, false) == 1) {
            return this.method409(arg0, true, 0, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
    public static final void method406(byte arg0) {
        field1140++;
        if (arg0 < 40 || class133.field3142 != 1) {
            return;
        }
        if (class153.field3788 >= 6 && class153.field3788 <= 106 && class102.field2462 >= 467 && class102.field2462 <= 499) {
            class32.field695 = (class32.field695 + 1) % 4;
            class97.field2351++;
            class87.field1993 = true;
            class103.field2498 = true;
            class99.field2373.method961(120, -1198);
            class99.field2373.method571(class32.field695, -11124);
            class99.field2373.method571(class70.field1475, -11124);
            class99.field2373.method571(class75.field1646, -11124);
        }
        if (class153.field3788 >= 135 && class153.field3788 <= 235 && class102.field2462 >= 467 && class102.field2462 <= 499) {
            class97.field2351++;
            class87.field1993 = true;
            class103.field2498 = true;
            class70.field1475 = (class70.field1475 + 1) % 3;
            class99.field2373.method961(120, -1198);
            class99.field2373.method571(class32.field695, -11124);
            class99.field2373.method571(class70.field1475, -11124);
            class99.field2373.method571(class75.field1646, -11124);
        }
        if (class153.field3788 >= 273 && class153.field3788 <= 373 && class102.field2462 >= 467 && class102.field2462 <= 499) {
            class97.field2351++;
            class103.field2498 = true;
            class75.field1646 = (class75.field1646 + 1) % 3;
            class87.field1993 = true;
            class99.field2373.method961(120, -1198);
            class99.field2373.method571(class32.field695, -11124);
            class99.field2373.method571(class70.field1475, -11124);
            class99.field2373.method571(class75.field1646, -11124);
        }
        if (class153.field3788 < 412 || class153.field3788 > 512 || class102.field2462 < 467 || class102.field2462 > 499) {
            return;
        }
        if (class96.field2316 != -1) {
            class93.method739(0, 0, class132.field3132, class141.field3351);
            if (class87.field2023 != null) {
                class93.method739(0, 0, class87.field2023, class141.field3351);
                return;
            }
            return;
        }
        class93.method735(true);
        if (class82.field1895 != -1) {
            class4.field74 = false;
            class141.field3384 = class141.field3351;
            class16.field246 = class96.field2316 = class82.field1895;
            return;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II[I)Lfc;")
    public final class39 method407(int arg0, int arg1, int[] arg2) {
        field1134++;
        if (this.field1135.method439(-100) == 1) {
            return this.method403(arg1 ^ 0xF, arg2, arg0, 0);
        } else if (this.field1135.method440(arg0, false) == 1) {
            return this.method403(arg1 ^ 0xF, arg2, 0, arg0);
        } else {
            if (arg1 != 0) {
                method410((byte) -99);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)Lp;")
    public static final class104 method408(int arg0) {
        field1143++;
        try {
            if (arg0 < 37) {
                method404(-97);
            }
            return (class104) Class.forName("ie").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([IZII)Lfc;")
    private final class39 method409(int[] arg0, boolean arg1, int arg2, int arg3) {
        field1127++;
        int var5 = ((arg3 & 0x40000FFF) << 4 | arg3 >>> 12) ^ arg2;
        if (!arg1) {
            field1130 = null;
        }
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class39 var9 = (class39) this.field1129.method1221(14, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class108 var10 = class108.method816(this.field1124, arg3, arg2);
            if (var10 == null) {
                return null;
            }
            class39 var11 = var10.method819();
            this.field1129.method1219(var11, (byte) -84, var7);
            if (arg0 != null) {
                arg0[0] -= var11.field790.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)V")
    public static final void method410(byte arg0) {
        class130.field3087 = 0;
        if (arg0 >= -61) {
            method408(-30);
        }
        field1137++;
        for (int var1 = -1; var1 < class66.field1387 + class25.field483; var1++) {
            class87 var18;
            if (var1 == -1) {
                var18 = class141.field3395;
            } else if (var1 < class66.field1387) {
                var18 = class149.field3709[class20.field326[var1]];
            } else {
                var18 = class72.field1533[class150.field3724[var1 - class66.field1387]];
            }
            if (var18 != null && var18.method162(true)) {
                if (var18 instanceof class58) {
                    class134 var19 = ((class58) var18).field1172;
                    if (var19.field3163 != null) {
                        var19 = var19.method1037(-42);
                    }
                    if (var19 == null) {
                        continue;
                    }
                }
                if (class66.field1387 <= var1) {
                    class134 var20 = ((class58) var18).field1172;
                    if (var20.field3163 != null) {
                        var20 = var20.method1037(-49);
                    }
                    if (var20.field3167 >= 0 && class29.field590.length > var20.field3167) {
                        class135.method1055(var18, var18.field1962 + 15, 21395);
                        if (class79.field1787 > -1) {
                            class29.field590[var20.field3167].method660(class79.field1787 - 12, class36.field769 + -30);
                        }
                    }
                    if (class132.field3119 == 1 && class150.field3724[var1 - class66.field1387] == class120.field2875 && class43.field856 % 20 < 10) {
                        class135.method1055(var18, var18.field1962 + 15, 21395);
                        if (class79.field1787 > -1) {
                            class117.field2810[0].method660(class79.field1787 - 12, class36.field769 - 28);
                        }
                    }
                } else {
                    class21 var21 = (class21) var18;
                    int var22 = 30;
                    if (var21.field346 != -1 || var21.field367 != -1) {
                        class135.method1055(var18, var18.field1962 + 15, 21395);
                        if (class79.field1787 > -1) {
                            if (var21.field346 != -1) {
                                class67.field1397[var21.field346].method660(class79.field1787 - 12, -var22 + class36.field769);
                                var22 += 25;
                            }
                            if (var21.field367 != -1) {
                                class29.field590[var21.field367].method660(class79.field1787 - 12, -var22 + class36.field769);
                                var22 += 25;
                            }
                        }
                    }
                    if (var1 >= 0 && class132.field3119 == 10 && class20.field326[var1] == class146.field3574) {
                        class135.method1055(var18, var18.field1962 + 15, 21395);
                        if (class79.field1787 > -1) {
                            class117.field2810[1].method660(class79.field1787 - 12, class36.field769 - var22);
                        }
                    }
                }
                if (var18.field1957 != null && (var1 >= class66.field1387 || class32.field695 == 0 || class32.field695 == 3 || class32.field695 == 1 && class81.method637(true, ((class21) var18).field356))) {
                    class135.method1055(var18, var18.field1962, 21395);
                    if (class79.field1787 > -1 && class130.field3087 < class99.field2393) {
                        class99.field2396[class130.field3087] = class144.field3554.method331(var18.field1957) / 2;
                        class99.field2399[class130.field3087] = class144.field3554.field938;
                        class99.field2374[class130.field3087] = class79.field1787;
                        class99.field2388[class130.field3087] = class36.field769;
                        class99.field2392[class130.field3087] = var18.field2012;
                        class99.field2382[class130.field3087] = var18.field1965;
                        class99.field2380[class130.field3087] = var18.field2001;
                        class99.field2404[class130.field3087] = var18.field1957;
                        class130.field3087++;
                    }
                }
                if (var18.field1990 > class43.field856) {
                    class135.method1055(var18, var18.field1962 + 15, 21395);
                    if (class79.field1787 > -1) {
                        int var23 = var18.field1984 * 30 / var18.field1945;
                        if (var23 > 30) {
                            var23 = 30;
                        }
                        class49.method360(class79.field1787 - 15, class36.field769 + -3, var23, 5, 65280);
                        class49.method360(class79.field1787 + var23 - 15, class36.field769 + -3, 30 - var23, 5, 16711680);
                    }
                }
                for (int var24 = 0; var24 < 4; var24++) {
                    if (class43.field856 < var18.field1980[var24]) {
                        class135.method1055(var18, var18.field1962 / 2, 21395);
                        if (class79.field1787 > -1) {
                            if (var24 == 1) {
                                class36.field769 -= 20;
                            }
                            if (var24 == 2) {
                                class36.field769 -= 10;
                                class79.field1787 -= 15;
                            }
                            if (var24 == 3) {
                                class36.field769 -= 10;
                                class79.field1787 += 15;
                            }
                            class20.field325[var18.field1973[var24]].method660(class79.field1787 - 12, class36.field769 - 12);
                            class25.field486.method325(class79.method614(15591, var18.field1953[var24]), class79.field1787 - 1, class36.field769 - -3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var2 = 0; var2 < class130.field3087; var2++) {
            int var3 = class99.field2374[var2];
            int var4 = class99.field2399[var2];
            int var5 = class99.field2388[var2];
            int var6 = class99.field2396[var2];
            boolean var7 = true;
            while (var7) {
                var7 = false;
                for (int var17 = 0; var17 < var2; var17++) {
                    if (var5 + 2 > class99.field2388[var17] + -class99.field2399[var17] && class99.field2388[var17] + 2 > -var4 + var5 && var3 - var6 < class99.field2396[var17] + class99.field2374[var17] && var3 + var6 > class99.field2374[var17] - class99.field2396[var17] && class99.field2388[var17] - class99.field2399[var17] < var5) {
                        var7 = true;
                        var5 = class99.field2388[var17] - class99.field2399[var17];
                    }
                }
            }
            class79.field1787 = class99.field2374[var2];
            class36.field769 = class99.field2388[var2] = var5;
            class117 var8 = class99.field2404[var2];
            if (class71.field1531 == 0) {
                int var9 = 16776960;
                if (class99.field2392[var2] < 6) {
                    var9 = class16.field256[class99.field2392[var2]];
                }
                if (class99.field2392[var2] == 6) {
                    var9 = class153.field3783 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class99.field2392[var2] == 7) {
                    var9 = class153.field3783 % 20 < 10 ? 255 : 65535;
                }
                if (class99.field2392[var2] == 8) {
                    var9 = class153.field3783 % 20 < 10 ? 45056 : 8454016;
                }
                if (class99.field2392[var2] == 9) {
                    int var10 = 150 - class99.field2380[var2];
                    if (var10 < 50) {
                        var9 = var10 * 1280 + 16711680;
                    } else if (var10 < 100) {
                        var9 = 16776960 + 16384000 - var10 * 327680;
                    } else if (var10 < 150) {
                        var9 = (var10 - 100) * 5 + 65280;
                    }
                }
                if (class99.field2392[var2] == 10) {
                    int var11 = 150 - class99.field2380[var2];
                    if (var11 < 50) {
                        var9 = var11 * 5 + 16711680;
                    } else if (var11 < 100) {
                        var9 = 33095935 - var11 * 327680;
                    } else if (var11 < 150) {
                        var9 = var11 * 327680 - (var11 - 100) * 5 - 32767745;
                    }
                }
                if (class99.field2392[var2] == 11) {
                    int var12 = 150 - class99.field2380[var2];
                    if (var12 < 50) {
                        var9 = 16777215 - var12 * 327685;
                    } else if (var12 < 100) {
                        var9 = var12 * 327685 + 65280 - 16384250;
                    } else if (var12 < 150) {
                        var9 = 16777215 - (var12 - 100) * 327680;
                    }
                }
                if (class99.field2382[var2] == 0) {
                    class144.field3554.method325(var8, class79.field1787, class36.field769, var9, 0);
                }
                if (class99.field2382[var2] == 1) {
                    class144.field3554.method324(var8, class79.field1787, class36.field769, var9, 0, class153.field3783);
                }
                if (class99.field2382[var2] == 2) {
                    class144.field3554.method314(var8, class79.field1787, class36.field769, var9, 0, class153.field3783);
                }
                if (class99.field2382[var2] == 3) {
                    class144.field3554.method332(var8, class79.field1787, class36.field769, var9, 0, class153.field3783, 150 - class99.field2380[var2]);
                }
                if (class99.field2382[var2] == 4) {
                    int var13 = class144.field3554.method331(var8);
                    int var14 = (150 - class99.field2380[var2]) * (var13 + 100) / 150;
                    class49.method358(class79.field1787 - 50, 0, class79.field1787 + 50, 334);
                    class144.field3554.method330(var8, class79.field1787 + 50 - var14, class36.field769, var9, 0);
                    class49.method363();
                }
                if (class99.field2382[var2] == 5) {
                    int var15 = 150 - class99.field2380[var2];
                    int var16 = 0;
                    if (var15 < 25) {
                        var16 = var15 - 25;
                    } else if (var15 > 125) {
                        var16 = var15 - 125;
                    }
                    class49.method358(0, class36.field769 - class144.field3554.field938 - 1, 512, class36.field769 + 5);
                    class144.field3554.method325(var8, class79.field1787, class36.field769 + var16, var9, 0);
                    class49.method363();
                }
            } else {
                class144.field3554.method325(var8, class79.field1787, class36.field769, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Ljb;Ljb;)V")
    public class55(class64 arg0, class64 arg1) {
        this.field1124 = arg1;
        this.field1135 = arg0;
    }
}

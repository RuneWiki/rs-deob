import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class276 {

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4472 = "glow3:";

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field4473 = 0;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4476 = "glow1:";

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "[[[I")
    public static int[][][] field4478;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
    public static final void method1905(int arg0) {
        field4477++;
        class175.field2756.method1511((byte) 119);
        if (arg0 == 4) {
            class152.field2261.method1511((byte) 102);
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
    public static final void method1906(int arg0) {
        if (arg0 != -21094) {
            method1909((byte) -75);
        }
        class134.field1931.method1510(10283);
        field4469++;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lfe;BI)I")
    public static final int method1907(class231 arg0, byte arg1, int arg2) {
        if (arg1 != 122) {
            field4473 = -70;
        }
        field4474++;
        if (!client.method1698(arg0).method147(arg2, -15469) && arg0.field3590 == null) {
            return -1;
        } else if (arg0.field3679 == null || arg0.field3679.length <= arg2) {
            return -1;
        } else {
            return arg0.field3679[arg2];
        }
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)V")
    public static final void method1908(int arg0) {
        field4470++;
        if (class66.method437((byte) 127) != 2) {
            return;
        }
        byte var1 = (byte) (class1.field28 - 4 & 0xFF);
        int var2 = class1.field28 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class19.field259[var3][var2][var16] = var1;
            }
        }
        if (class148.field2204 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class161.field2409[var4] = -1000000;
            class123.field1778[var4] = 1000000;
            class31.field379[var4] = 0;
            class10.field152[var4] = 1000000;
            class225.field3505[var4] = 0;
        }
        if (class158.field2370 == 1) {
            if ((class74.field1121[class148.field2204][class214.field3347.field3915 >> 7][class214.field3347.field3920 >> 7] & 0x4) != 0) {
                class29.method148(0, class184.field2892, 9568256, class214.field3347.field3915 >> 7, false, class214.field3347.field3920 >> 7);
            }
            if (class147.field2189 < 310) {
                int var6 = class99.field1474 >> 7;
                int var7 = class255.field4159 >> 7;
                int var8 = class214.field3347.field3915 >> 7;
                int var9 = class214.field3347.field3920 >> 7;
                int var10;
                if (var8 <= var6) {
                    var10 = var6 - var8;
                } else {
                    var10 = var8 - var6;
                }
                int var11;
                if (var9 > var7) {
                    var11 = var9 - var7;
                } else {
                    var11 = var7 - var9;
                }
                if (var10 == 0 && var11 == 0 || var10 <= -104 || var10 >= 104 || var11 <= -104 || var11 >= 104) {
                    class285.method1952((Throwable) null, (byte) 55, "RC: " + var6 + "," + var7 + " " + var8 + "," + var9 + " " + class113.field1653 + "," + class5.field77);
                    return;
                }
                if (var10 <= var11) {
                    int var12 = var10 * 65536 / var11;
                    int var13 = 32768;
                    while (var7 != var9) {
                        if (var7 < var9) {
                            var7++;
                        } else if (var7 > var9) {
                            var7--;
                        }
                        if ((class74.field1121[class148.field2204][var6][var7] & 0x4) != 0) {
                            class29.method148(1, class184.field2892, 9568256, var6, false, var7);
                            break;
                        }
                        var13 += var12;
                        if (var13 >= 65536) {
                            if (var8 > var6) {
                                var6++;
                            } else if (var6 > var8) {
                                var6--;
                            }
                            var13 -= 65536;
                            if ((class74.field1121[class148.field2204][var6][var7] & 0x4) != 0) {
                                class29.method148(1, class184.field2892, 9568256, var6, false, var7);
                                break;
                            }
                        }
                    }
                } else {
                    int var14 = 32768;
                    int var15 = var11 * 65536 / var10;
                    while (var6 != var8) {
                        if (var8 > var6) {
                            var6++;
                        } else if (var8 < var6) {
                            var6--;
                        }
                        if ((class74.field1121[class148.field2204][var6][var7] & 0x4) != 0) {
                            class29.method148(1, class184.field2892, arg0 ^ 0xFF6D8CD3, var6, false, var7);
                            break;
                        }
                        var14 += var15;
                        if (var14 >= 65536) {
                            if (var7 < var9) {
                                var7++;
                            } else if (var7 > var9) {
                                var7--;
                            }
                            var14 -= 65536;
                            if ((class74.field1121[class148.field2204][var6][var7] & 0x4) != 0) {
                                class29.method148(1, class184.field2892, 9568256, var6, false, var7);
                                break;
                            }
                        }
                    }
                }
            }
        } else {
            int var5 = class52.method351(-113, class255.field4159, class99.field1474, class148.field2204);
            if (var5 - class21.field279 < 800 && (class74.field1121[class148.field2204][class99.field1474 >> 7][class255.field4159 >> 7] & 0x4) != 0) {
                class29.method148(1, class184.field2892, 9568256, class99.field1474 >> 7, false, class255.field4159 >> 7);
            }
        }
        if (arg0 != -29485) {
            method1905(91);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
    public static void method1909(byte arg0) {
        field4476 = null;
        field4478 = null;
        field4472 = null;
        if (arg0 != 71) {
            method1905(60);
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)V")
    public static final void method1910(byte arg0) {
        field4475++;
        if (arg0 != 58) {
            field4473 = 89;
        }
        int var1 = class66.method437((byte) 127);
        if (var1 == 0) {
            class19.field259 = null;
            class159.method1099(1136813004, 0);
        } else if (var1 == 1) {
            class142.method925((byte) 0, 0);
            class159.method1099(1136813004, 512);
            if (class74.field1121 != null) {
                class296.method1996((byte) 112);
            }
        } else {
            class142.method925((byte) (class1.field28 - 4 & 0xFF), 0);
            class159.method1099(1136813004, 2);
        }
        class28.field345 = class148.field2204;
    }
}

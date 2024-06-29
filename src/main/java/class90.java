import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class90 {

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1369 = new CRC32();

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    public static int field1382 = 2;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public static int field1379 = -1;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "F")
    public static float field1376;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    private int field1367;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public int field1368;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
    public int field1380;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "Lrk;")
    public static class252 field1378;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "Lwf;")
    public static class306 field1373;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "Lwf;")
    public static class306 field1381;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "[[[Lsa;")
    public static class174[][][] field1375;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILgn;I)V", line = 5)
    private final void method617(int arg0, int arg1, class303 arg2, int arg3) {
        if (arg1 == 1) {
            this.field1367 = arg2.method1994(false);
        } else if (arg1 == 2) {
            this.field1380 = arg2.method2043((byte) -108);
            this.field1368 = arg2.method2043((byte) -115);
        }
        field1374++;
        if (arg3 != -3) {
            field1375 = (class174[][][]) ((class174[][][]) null);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V", line = 28)
    public static final void method618(int arg0) {
        class255.field3981.method1298((byte) 110);
        field1363++;
        if (arg0 != -28104) {
            method625(13, -96);
        }
        class242.field3826.method1298((byte) 110);
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)Ln;", line = 45)
    public final class178 method619(int arg0) {
        class178 var2 = (class178) class183.field2802.method1294((long) this.field1367, 124);
        field1370++;
        int var3 = -80 / ((arg0 - 51) / 52);
        if (var2 != null) {
            return var2;
        }
        class178 var4 = class6.method37(this.field1367, class285.field4374, -100, 0);
        if (var4 != null) {
            class183.field2802.method1292((long) this.field1367, -112, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)I", line = 65)
    public static final int method620(int arg0, int arg1, int arg2) {
        field1371++;
        int var3 = class130.method881(arg2 + 91923, 4, -1, arg0 + 45365) + (class130.method881(arg2 + 37821, 2, arg1 - 61, arg0 + 10294) - 128 >> 1) + (class130.method881(arg2, 1, arg1 ^ -61, arg0) + -128 >> 2) - 128;
        if (arg1 != 60) {
            method622(-4);
        }
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILgn;I)V", line = 88)
    public final void method621(int arg0, class303 arg1, int arg2) {
        field1366++;
        if (arg2 != 17445) {
            field1379 = 10;
        }
        while (true) {
            int var4 = arg1.method2043((byte) -121);
            if (var4 == 0) {
                return;
            }
            this.method617(arg0, var4, arg1, -3);
        }
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V", line = 114)
    public static void method622(int arg0) {
        field1373 = null;
        if (arg0 != 1851) {
            field1373 = (class306) null;
        }
        field1381 = null;
        field1378 = null;
        field1375 = (class174[][][]) null;
        field1369 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILwb;IIIBI)V", line = 138)
    public static final void method623(int arg0, class294 arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field1377++;
        long var7 = 0L;
        if (arg0 == 0) {
            var7 = class126.method848(arg3, arg6, arg4);
        } else if (arg0 == 1) {
            var7 = class159.method1103(arg3, arg6, arg4);
        } else if (arg0 == 2) {
            var7 = class97.method668(arg3, arg6, arg4);
        } else if (arg0 == 3) {
            var7 = class338.method2341(arg3, arg6, arg4);
        }
        boolean var9 = true;
        int var10 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        boolean var11 = false;
        class17 var12 = class277.method1819((byte) 126, var10);
        if (var12.method129(0)) {
            class264.method1749(arg6, var12, arg4, arg3, (byte) -94);
        }
        boolean var13 = false;
        int var14 = ((int) var7 & 0x7D48B) >> 14;
        int var15 = (int) var7 >> 20 & 0x3;
        if (var7 != 0L) {
            class94 var16 = null;
            class94 var17 = null;
            if (arg0 == 0) {
                class157 var21 = class199.method1344(arg3, arg6, arg4);
                if (var21 != null) {
                    var17 = var21.field2451;
                    var16 = var21.field2454;
                }
                if (var12.field233 != 0) {
                    arg1.method1920(!var12.field213, var12.field218, var14, arg6, arg4, var15, (byte) 56);
                }
            } else if (arg0 == 1) {
                class152 var20 = class139.method947(arg3, arg6, arg4);
                if (var20 != null) {
                    var16 = var20.field2405;
                    var17 = var20.field2406;
                }
            } else if (arg0 == 2) {
                class272 var19 = class164.method1122(arg3, arg6, arg4);
                if (var19 != null) {
                    var16 = var19.field4173;
                }
                if (var12.field233 != 0 && var12.field212 + arg6 < 104 && arg4 + var12.field212 < 104 && (var12.field187 + arg6) < 104 && var12.field187 + arg4 < 104) {
                    arg1.method1929(var15, !var12.field213, var12.field212, var12.field187, var12.field218, (byte) -93, arg6, arg4);
                }
            } else if (arg0 == 3) {
                class23 var18 = class163.method1114(arg3, arg6, arg4);
                if (var18 != null) {
                    var16 = var18.field285;
                }
                if (var12.field233 == 1) {
                    arg1.method1926(arg4, (byte) -98, arg6);
                }
            }
            if (var12.field195 != null) {
                var12 = var12.method139(arg5 ^ 0x2D);
            }
            if (class333.field5166 && var12 != null && var12.field173) {
                if (var14 == 2) {
                    if ((var16 instanceof class218)) {
                        ((class218) var16).method1459((byte) -65);
                    } else {
                        class154.method1076(var14, var15 + 4, 0, arg6, arg4, arg2, 26008, 0, var12);
                    }
                    if ((var17 instanceof class218)) {
                        ((class218) var17).method1459((byte) -70);
                    } else {
                        class154.method1076(var14, var15 + 1 & 0x3, 0, arg6, arg4, arg2, 26008, 0, var12);
                    }
                } else if (var14 == 5) {
                    if (var16 instanceof class218) {
                        ((class218) var16).method1459((byte) -121);
                    } else {
                        class154.method1076(4, var15, class151.field2385[var15] * 8, arg6, arg4, arg2, 26008, class210.field3337[var15] * 8, var12);
                    }
                } else if (var14 == 6) {
                    if ((var16 instanceof class218)) {
                        ((class218) var16).method1459((byte) -80);
                    } else {
                        class154.method1076(4, var15 + 4, class200.field3014[var15] * 8, arg6, arg4, arg2, 26008, class151.field2387[var15] * 8, var12);
                    }
                } else if (var14 == 7) {
                    if ((var16 instanceof class218)) {
                        ((class218) var16).method1459((byte) -124);
                    } else {
                        class154.method1076(4, (var15 + 2 & 0x3) + 4, 0, arg6, arg4, arg2, 26008, 0, var12);
                    }
                } else if (var14 == 8) {
                    if ((var16 instanceof class218)) {
                        ((class218) var16).method1459((byte) -108);
                    } else {
                        class154.method1076(4, var15 + 4, class200.field3014[var15] * 8, arg6, arg4, arg2, 26008, class151.field2387[var15] * 8, var12);
                    }
                    if (var17 instanceof class218) {
                        ((class218) var17).method1459((byte) -66);
                    } else {
                        class154.method1076(4, (var15 + 2 & 0x3) + 4, class200.field3014[var15] * 8, arg6, arg4, arg2, 26008, class151.field2387[var15] * 8, var12);
                    }
                } else if (var14 == 11) {
                    if (var16 instanceof class218) {
                        ((class218) var16).method1459((byte) -104);
                    } else {
                        class154.method1076(10, var15 + 4, 0, arg6, arg4, arg2, 26008, 0, var12);
                    }
                } else if (var16 instanceof class218) {
                    ((class218) var16).method1459((byte) -69);
                } else {
                    class154.method1076(var14, var15, 0, arg6, arg4, arg2, 26008, 0, var12);
                }
            }
        }
        if (arg5 != -46) {
            field1373 = (class306) null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)Z", line = 334)
    public static final boolean method624(int arg0) {
        field1372++;
        try {
            if (class278.field4286 == 2) {
                if (class323.field5026 == null) {
                    class323.field5026 = class327.method2220(class85.field1289, class82.field1219, class160.field2483);
                    if (class323.field5026 == null) {
                        return false;
                    }
                }
                if (class240.field3820 == null) {
                    class240.field3820 = new class210(class14.field149, class166.field2550);
                }
                if (class89.field1362.method436((byte) -120, class240.field3820, class323.field5026, 22050, class150.field2370)) {
                    class89.field1362.method416((byte) 97);
                    class89.field1362.method435(8, class150.field2371);
                    class89.field1362.method427(class323.field5026, -15879, class284.field4354);
                    class85.field1289 = null;
                    class323.field5026 = null;
                    class240.field3820 = null;
                    class278.field4286 = 0;
                    return true;
                }
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            class89.field1362.method443(127);
            class278.field4286 = 0;
            class323.field5026 = null;
            class240.field3820 = null;
            class85.field1289 = null;
        }
        int var2 = 22 / ((arg0 - 27) / 44);
        return false;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)V", line = 381)
    public static final void method625(int arg0, int arg1) {
        field1365++;
        if (arg0 < 99) {
            method624(18);
        }
        class75 var2 = class204.method1371(4, 7, arg1);
        var2.method533(22461);
    }
}

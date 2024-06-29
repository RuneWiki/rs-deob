import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class159 {

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "Z")
    public boolean field2606 = false;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field2601 = null;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "[I")
    public static int[] field2602 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public int field2595;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public int field2598;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "[I")
    public static int[] field2599;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZILgi;Lgi;)V")
    public static final void method1084(boolean arg0, int arg1, class164 arg2, class164 arg3) {
        class116.field1781 = arg3;
        field2604++;
        class313.field5037 = arg0;
        class278.field4533 = arg2;
        if (arg1 != 0) {
            method1085((byte) 111, 113);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BI)Lai;")
    public static final class91 method1085(byte arg0, int arg1) {
        if (arg0 != -63) {
            field2601 = null;
        }
        field2603++;
        class91 var2 = (class91) client.field2666.method1879(arg0 + 8950, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class15.field296.method1156(class24.method196(true, arg1), class240.method1632(arg1, false), (byte) -16);
        class91 var4 = new class91();
        var4.field1455 = arg1;
        if (var3 != null) {
            var4.method629(new class274(var3), true);
        }
        var4.method634((byte) 126);
        client.field2666.method1883((long) arg1, -96, var4);
        return var4;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
    public static void method1086(byte arg0) {
        field2601 = null;
        field2599 = null;
        field2602 = null;
        if (arg0 < 94) {
            field2599 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIZ)Lud;")
    public final class2 method1087(int arg0, int arg1, boolean arg2) {
        field2594++;
        class2 var4 = (class2) class174.field2911.method1879(8887, (long) ((arg2 ? 262144 : 0) | this.field2598 | arg1 << 16));
        if (var4 != null) {
            return var4;
        }
        if (arg0 != 1265215536) {
            this.field2598 = 74;
        }
        class22.field414.method1168(0, this.field2598);
        class2 var5 = class100.method709(0, this.field2598, class22.field414, true);
        if (var5 != null) {
            var5.method9(class238.field3742, class97.field1533, field2605);
            var5.field3177 = var5.field3179;
            var5.field3178 = var5.field3181;
            if (arg2) {
                var5.method6();
            }
            for (int var6 = 0; var6 < arg1; var6++) {
                var5.method4();
            }
            class174.field2911.method1883((long) (arg1 << 16 | this.field2598 | (arg2 ? 262144 : 0)), 116, var5);
        }
        return var5;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBLfj;I)V")
    private final void method1088(int arg0, byte arg1, class274 arg2, int arg3) {
        if (arg1 < 28) {
            this.field2598 = 112;
        }
        field2607++;
        if (arg3 == 1) {
            this.field2598 = arg2.method1837(252);
        } else if (arg3 == 2) {
            this.field2595 = arg2.method1812(true);
        } else if (arg3 == 3) {
            this.field2606 = true;
        } else if (arg3 == 4) {
            this.field2598 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lfj;IB)V")
    public final void method1089(class274 arg0, int arg1, byte arg2) {
        if (arg2 != 65) {
            return;
        }
        while (true) {
            int var4 = arg0.method1849(255);
            if (var4 == 0) {
                field2600++;
                return;
            }
            this.method1088(arg1, (byte) 95, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Luk;[I[I[IB)V")
    public static final void method1090(class104 arg0, int[] arg1, int[] arg2, int[] arg3, byte arg4) {
        field2597++;
        if (arg4 > -78) {
            method1092(-110, -38, 0, 104, -112, 85, 11);
        }
        for (int var5 = 0; var5 < arg2.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg3[var5];
            int var8 = arg1[var5];
            int var9 = 0;
            while (var8 != 0 && var9 < arg0.field986.length) {
                if ((var8 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field986[var9] = null;
                    } else {
                        class91 var10 = method1085((byte) -63, var6);
                        int var11 = var10.field1453;
                        class278 var12 = arg0.field986[var9];
                        if (var12 != null) {
                            if (var12.field4544 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field986[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field4534 = 0;
                                    var12.field4537 = 0;
                                    var12.field4543 = var7;
                                    var12.field4532 = 0;
                                    var12.field4535 = 1;
                                    class252.method1710(0, arg0.field929, var10, arg0.field994, false, 84);
                                } else if (var11 == 2) {
                                    var12.field4534 = 0;
                                }
                            } else if (var10.field1447 >= method1085((byte) -63, var12.field4544).field1447) {
                                var12 = arg0.field986[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class278 var13 = arg0.field986[var9] = new class278();
                            var13.field4535 = 1;
                            var13.field4532 = 0;
                            var13.field4534 = 0;
                            var13.field4537 = 0;
                            var13.field4543 = var7;
                            var13.field4544 = var6;
                            class252.method1710(0, arg0.field929, var10, arg0.field994, false, 87);
                        }
                    }
                }
                var9++;
                var8 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1091(int arg0, String arg1) {
        field2609++;
        class179.field2966 = arg1;
        if (class44.field659.field1105 == null) {
            return;
        }
        try {
            if (arg0 > -63) {
                field2601 = null;
            }
            String var2 = class44.field659.field1105.getParameter("cookieprefix");
            String var3 = class44.field659.field1105.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class82.method586(-47, class264.method1778(6573) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class216.method1482("document.cookie=\"" + var5 + "\"", -6938, class44.field659.field1105);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1092(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != -2) {
            method1090((class104) null, (int[]) null, (int[]) null, (int[]) null, (byte) 93);
        }
        if (arg2 >= class34.field561 && arg5 <= class148.field2371 && arg6 >= class52.field766 && class191.field3112 >= arg4) {
            if (arg3 == 1) {
                class16.method129(arg6, (byte) -55, arg4, arg2, arg5, arg1);
            } else {
                class14.method126(arg5, arg1, arg6, 97, arg4, arg2, arg3);
            }
        } else if (arg3 == 1) {
            class88.method618(arg6, arg2, arg5, arg4, arg1, false);
        } else {
            class117.method804(arg1, arg3, arg5, arg2, -1, arg6, arg4);
        }
        field2608++;
    }
}

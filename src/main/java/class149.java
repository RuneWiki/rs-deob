import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public abstract class class149 {

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "[Lcb;")
    public static class314[] field2533 = new class314[32768];

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2534 = null;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V", line = 7)
    public static void method1067(int arg0) {
        field2533 = null;
        field2534 = null;
        if (arg0 != 2) {
            method1068((class314) null, 1);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lcb;I)I", line = 21)
    public static final int method1068(class314 arg0, int arg1) {
        int var2 = 127 / ((-arg1 - 15) / 60);
        class88 var3 = arg0.field5107;
        field2530++;
        if (var3.field1552 != null) {
            var3 = var3.method681((byte) 15);
            if (var3 == null) {
                return -1;
            }
        }
        int var4 = var3.field1561;
        class5 var5 = arg0.method60(true);
        if (arg0.field206 == var5.field106) {
            var4 = var3.field1549;
        } else if (arg0.field206 == var5.field80 || arg0.field206 == var5.field110 || arg0.field206 == var5.field91 || arg0.field206 == var5.field94) {
            var4 = var3.field1603;
        } else if (arg0.field206 == var5.field82 || arg0.field206 == var5.field103 || arg0.field206 == var5.field99 || arg0.field206 == var5.field113) {
            var4 = var3.field1536;
        }
        return var4;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V", line = 57)
    public static final void method1069(boolean arg0) {
        class342.field5413.method297((byte) -49);
        field2536++;
        if (!arg0) {
            return;
        }
        int var1 = class342.field5413.method295((byte) 105, 8);
        if (class255.field4184 > var1) {
            for (int var2 = var1; var2 < class255.field4184; var2++) {
                class28.field685[class117.field2087++] = class23.field570[var2];
            }
        }
        if (var1 > class255.field4184) {
            throw new RuntimeException("gnpov1");
        }
        class255.field4184 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class23.field570[var3];
            class314 var5 = field2533[var4];
            int var6 = class342.field5413.method295((byte) 114, 1);
            if (var6 == 0) {
                class23.field570[class255.field4184++] = var4;
                var5.field221 = class267.field4371;
            } else {
                int var7 = class342.field5413.method295((byte) -113, 2);
                if (var7 == 0) {
                    class23.field570[class255.field4184++] = var4;
                    var5.field221 = class267.field4371;
                    class34.field761[class91.field1613++] = var4;
                } else if (var7 == 1) {
                    class23.field570[class255.field4184++] = var4;
                    var5.field221 = class267.field4371;
                    int var8 = class342.field5413.method295((byte) 121, 3);
                    var5.method57(-2079349584, 1, var8);
                    int var9 = class342.field5413.method295((byte) -98, 1);
                    if (var9 == 1) {
                        class34.field761[class91.field1613++] = var4;
                    }
                } else if (var7 == 2) {
                    class23.field570[class255.field4184++] = var4;
                    var5.field221 = class267.field4371;
                    if (class342.field5413.method295((byte) -119, 1) == 1) {
                        int var11 = class342.field5413.method295((byte) 84, 3);
                        var5.method57(-2079349584, 2, var11);
                        int var12 = class342.field5413.method295((byte) 24, 3);
                        var5.method57(-2079349584, 2, var12);
                    } else {
                        int var10 = class342.field5413.method295((byte) 30, 3);
                        var5.method57(-2079349584, 0, var10);
                    }
                    int var13 = class342.field5413.method295((byte) -108, 1);
                    if (var13 == 1) {
                        class34.field761[class91.field1613++] = var4;
                    }
                } else if (var7 == 3) {
                    class28.field685[class117.field2087++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ljava/lang/String;Lg;I)Ljava/lang/String;", line = 173)
    public static final String method1070(String arg0, class181 arg1, int arg2) {
        field2535++;
        if (arg0.indexOf("%") != -1) {
            label58: while (true) {
                int var3 = arg0.indexOf("%1");
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg0.indexOf("%2");
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg0.indexOf("%3");
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg0.indexOf("%4");
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg0.indexOf("%5");
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg0.indexOf("%dns");
                                                        if (var8 == -1) {
                                                            break label58;
                                                        }
                                                        String var9 = "";
                                                        if (class267.field4363 != null) {
                                                            if (class267.field4363.field3501 == null) {
                                                                var9 = class320.method2302(class267.field4363.field3505, -27286);
                                                            } else {
                                                                var9 = (String) class267.field4363.field3501;
                                                            }
                                                        }
                                                        arg0 = arg0.substring(0, var8) + var9 + arg0.substring(var8 + 4);
                                                    }
                                                }
                                                arg0 = arg0.substring(0, var7) + class191.method1319(class202.method1383((byte) 124, 4, arg1), false) + arg0.substring(var7 + 2);
                                            }
                                        }
                                        arg0 = arg0.substring(0, var6) + class191.method1319(class202.method1383((byte) 105, 3, arg1), false) + arg0.substring(var6 + 2);
                                    }
                                }
                                arg0 = arg0.substring(0, var5) + class191.method1319(class202.method1383((byte) 120, 2, arg1), false) + arg0.substring(var5 + 2);
                            }
                        }
                        arg0 = arg0.substring(0, var4) + class191.method1319(class202.method1383((byte) 103, 1, arg1), false) + arg0.substring(var4 + 2);
                    }
                }
                arg0 = arg0.substring(0, var3) + class191.method1319(class202.method1383((byte) 110, 0, arg1), false) + arg0.substring(var3 + 2);
            }
        }
        if (arg2 != -24642) {
            method1068((class314) null, -38);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ)V", line = 266)
    public static final void method1072(int arg0, boolean arg1) {
        class259.method1821(class123.field2167, class352.field5618, class296.field4843, class205.field3411);
        class259.method1815(class217.field3623, class131.field2258, arg1);
        field2532++;
        int var2 = -10 % ((75 - arg0) / 33);
        class259.method1814((float) class217.field3612, (float) class190.field3223, (float) class79.field1406);
        class259.method1822();
        class196.field3277 = class109.field1999;
        class66.field1245 = class222.field3667;
        class196.field3280 = class146.field2483;
        class196.field3281 = class125.field2204;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)V", line = 284)
    public static final void method1073(int arg0, byte arg1) {
        class287.field4695.method896(arg0, (byte) -18);
        class140.field2375.method896(arg0, (byte) -64);
        field2531++;
        if (arg1 != 52) {
            field2534 = (String) null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Ldf;B)Ldf;")
    public abstract class185 method1071(class185 arg0, byte arg1);
}

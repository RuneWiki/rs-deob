import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class94 {

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "[I")
    private int[] field2066;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "Lec;")
    public static class28 field2063 = class28.method210(-46, "You have only just left another world");

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "Lpa;")
    public static class91 field2071 = new class91(64);

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public static int field2074 = 0;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    public static int field2078 = 0;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "Lec;")
    public static class28 field2075 = class28.method210(-46, "");

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public static int field2073 = 0;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "Lec;")
    public static class28 field2080 = class28.method210(-46, "This is a non)2members*6nworld)3 To enjoy your*6nmembers benefits we*6nrecommend you play on a*6nmembers world instead)3");

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public static int field2079;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pd", name = "v", descriptor = "Ljava/lang/Class;")
    public static Class field2082;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "[Lwc;")
    public static class128[] field2076;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "[Lea;")
    public static class26[] field2081;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public static void method674(int arg0) {
        field2080 = null;
        field2063 = null;
        if (arg0 != -1489) {
            field2075 = null;
        }
        field2081 = null;
        field2075 = null;
        field2076 = null;
        field2071 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IZ)I")
    public final int method675(int arg0, boolean arg1) {
        field2067++;
        if (!arg1) {
            field2078 = -60;
        }
        int var3 = this.field2066.length - 2;
        int var4 = arg0 << 1 & var3;
        while (true) {
            int var5 = this.field2066[var4];
            if (arg0 == var5) {
                return this.field2066[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var4 + 2 & var3;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
    public static final void method676(boolean arg0) {
        field2072++;
        Object var1 = class96.field2129;
        synchronized (class96.field2129) {
            if (class76.field1716 == 0) {
                class30.field652.method617(new class68(), -10172, 5);
            }
            class76.field1716 = 600;
            if (arg0) {
                field2075 = null;
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)Ljava/awt/Component;")
    public static final Component method677(byte arg0) {
        field2064++;
        if (class126.field2727 == null) {
            if (arg0 != 6) {
                field2077 = 106;
            }
            return class30.field652 == null ? null : class30.field652.field1871;
        } else {
            return class126.field2727;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V")
    public static final void method678(byte arg0) {
        field2070++;
        if (class43.field949 == null) {
            return;
        }
        long var1 = System.currentTimeMillis();
        if (var1 <= class4.field65) {
            return;
        }
        class43.field949.method555(var1);
        int var3 = (int) (var1 - class4.field65);
        class4.field65 = var1;
        synchronized (field2082 == null ? (field2082 = method680("od")) : field2082) {
            class62.field1388 += class114.field2442 * var3;
            int var5 = (class62.field1388 - class114.field2442 * 2000) / 1000;
            if (var5 > 0) {
                if (class37.field834 != null) {
                    class37.field834.method242(var5);
                }
                class62.field1388 -= var5 * 1000;
            }
        }
        if (arg0 > -89) {
            method677((byte) 112);
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "([I)V")
    public class94(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field2066 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2066[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field2066[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field2066[var5 + var5] = arg0[var4];
            this.field2066[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(B)V")
    public static final void method679(byte arg0) {
        if (class76.field1691 == 0 && class95.field2097 == 0) {
            client.method124(-7765, class49.field1147, class88.field1960, class23.field530, 31, 0);
            class126.field2731++;
        }
        field2068++;
        int var1 = -1;
        if (arg0 >= -103) {
            return;
        }
        for (int var2 = 0; var2 < class33.field750; var2++) {
            int var3 = class33.field731[var2];
            int var4 = var3 & 0x7F;
            int var5 = var3 >> 7 & 0x7F;
            int var6 = var3 >> 29 & 0x3;
            int var7 = var3 >> 14 & 0x7FFF;
            if (var1 != var3) {
                var1 = var3;
                if (var6 == 2 && class11.field179.method795(class122.field2657, var4, var5, var3) >= 0) {
                    class45 var8 = class72.method566(var7, 97);
                    if (var8.field982 != null) {
                        var8 = var8.method363(false);
                    }
                    if (var8 == null) {
                        continue;
                    }
                    if (class76.field1691 == 1) {
                        class103.field2194++;
                        client.method124(-7765, class68.method537(1, new class28[] { class43.field918, class1.field6, class118.field2524, var8.field1008 }), var5, var4, 7, var3);
                    } else if (class95.field2097 != 1) {
                        class22.field492++;
                        class28[] var9 = var8.field988;
                        if (class20.field451) {
                            var9 = class83.method632(false, var9);
                        }
                        if (var9 != null) {
                            for (int var10 = 4; var10 >= 0; var10--) {
                                if (var9[var10] != null) {
                                    short var11 = 0;
                                    if (var10 == 0) {
                                        var11 = 11;
                                    }
                                    class31.field667++;
                                    if (var10 == 1) {
                                        var11 = 52;
                                    }
                                    if (var10 == 2) {
                                        var11 = 6;
                                    }
                                    if (var10 == 3) {
                                        var11 = 26;
                                    }
                                    if (var10 == 4) {
                                        var11 = 1006;
                                    }
                                    client.method124(-7765, class68.method537(1, new class28[] { var9[var10], class9.field163, var8.field1008 }), var5, var4, var11, var3);
                                }
                            }
                        }
                        client.method124(-7765, class68.method537(1, new class28[] { class27.field583, var8.field1008 }), var5, var4, 1004, var8.field961 << 14);
                    } else if ((class79.field1824 & 0x4) == 4) {
                        class74.field1635++;
                        client.method124(-7765, class68.method537(1, new class28[] { class37.field843, class9.field163, var8.field1008 }), var5, var4, 50, var3);
                    }
                }
                if (var6 == 1) {
                    class90 var12 = class88.field1956[var7];
                    if (var12.field1996.field2235 == 1 && (var12.field1446 & 0x7F) == 64 && (var12.field1501 & 0x7F) == 64) {
                        for (int var13 = 0; var13 < class64.field1430; var13++) {
                            class90 var16 = class88.field1956[class64.field1429[var13]];
                            if (var16 != null && var12 != var16 && var16.field1996.field2235 == 1 && var12.field1446 == var16.field1446 && var12.field1501 == var16.field1501) {
                                class27.method197(var4, var16.field1996, class64.field1429[var13], var5, (byte) 83);
                            }
                        }
                        for (int var14 = 0; var14 < class74.field1641; var14++) {
                            class43 var15 = class129.field2779[class4.field66[var14]];
                            if (var15 != null && var12.field1446 == var15.field1446 && var12.field1501 == var15.field1501) {
                                class55.method451(class4.field66[var14], var4, 4334, var15, var5);
                            }
                        }
                    }
                    class27.method197(var4, var12.field1996, var7, var5, (byte) -111);
                }
                if (var6 == 0) {
                    class43 var17 = class129.field2779[var7];
                    if ((var17.field1446 & 0x7F) == 64 && (var17.field1501 & 0x7F) == 64) {
                        for (int var18 = 0; var18 < class64.field1430; var18++) {
                            class90 var21 = class88.field1956[class64.field1429[var18]];
                            if (var21 != null && var21.field1996.field2235 == 1 && var17.field1446 == var21.field1446 && var17.field1501 == var21.field1501) {
                                class27.method197(var4, var21.field1996, class64.field1429[var18], var5, (byte) 69);
                            }
                        }
                        for (int var19 = 0; var19 < class74.field1641; var19++) {
                            class43 var20 = class129.field2779[class4.field66[var19]];
                            if (var20 != null && var17 != var20 && var17.field1446 == var20.field1446 && var17.field1501 == var20.field1501) {
                                class55.method451(class4.field66[var19], var4, 4334, var20, var5);
                            }
                        }
                    }
                    class55.method451(var7, var4, 4334, var17, var5);
                }
                if (var6 == 3) {
                    class42 var22 = class127.field2746[class122.field2657][var4][var5];
                    if (var22 != null) {
                        for (class34 var23 = (class34) var22.method332(1518); var23 != null; var23 = (class34) var22.method331(0)) {
                            class129 var24 = class129.method992(var23.field764, -44);
                            if (class76.field1691 == 1) {
                                class2.field23++;
                                client.method124(-7765, class68.method537(1, new class28[] { class43.field918, class1.field6, class68.field1535, var24.field2765 }), var5, var4, 44, var23.field764);
                            } else if (class95.field2097 != 1) {
                                field2061++;
                                class28[] var25 = var24.field2764;
                                if (class20.field451) {
                                    var25 = class83.method632(false, var25);
                                }
                                for (int var26 = 4; var26 >= 0; var26--) {
                                    if (var25 != null && var25[var26] != null) {
                                        class17.field324++;
                                        byte var27 = 0;
                                        if (var26 == 0) {
                                            var27 = 17;
                                        }
                                        if (var26 == 1) {
                                            var27 = 29;
                                        }
                                        if (var26 == 2) {
                                            var27 = 9;
                                        }
                                        if (var26 == 3) {
                                            var27 = 15;
                                        }
                                        if (var26 == 4) {
                                            var27 = 38;
                                        }
                                        client.method124(-7765, class68.method537(1, new class28[] { var25[var26], class119.field2562, var24.field2765 }), var5, var4, var27, var23.field764);
                                    } else if (var26 == 2) {
                                        class65.field1485++;
                                        client.method124(-7765, class68.method537(1, new class28[] { class76.field1719, var24.field2765 }), var5, var4, 9, var23.field764);
                                    }
                                }
                                client.method124(-7765, class68.method537(1, new class28[] { class56.field1289, var24.field2765 }), var5, var4, 1002, var23.field764);
                            } else if ((class79.field1824 & 0x1) == 1) {
                                client.method124(-7765, class68.method537(1, new class28[] { class37.field843, class119.field2562, var24.field2765 }), var5, var4, 22, var23.field764);
                                class65.field1453++;
                            }
                        }
                    }
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method680(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

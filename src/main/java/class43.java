import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class43 extends class161 {

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "S")
    public short field537;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "Lal;")
    public static class52 field533 = new class52(50);

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "Llc;")
    public static class385 field535;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "[Ltd;")
    public static class262[] field532;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)V")
    public static final void method284(byte arg0) {
        while (true) {
            if (class158.field2514.method2229(class345.field5331, arg0 ^ 0x3D) >= 11) {
                int var1 = class158.field2514.method2225(arg0 - 109, 11);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class216.field3517[var1] == null) {
                        class216.field3517[var1] = new class219();
                        class216.field3517[var1].field1868 = var1;
                        var2 = true;
                        if (class430.field6327[var1] != null) {
                            class216.field3517[var1].method1564(class430.field6327[var1], -126);
                        }
                    }
                    class132.field2063[class107.field1500++] = var1;
                    class219 var3 = class216.field3517[var1];
                    var3.field1839 = class183.field2987;
                    int var4 = class218.field3575[class158.field2514.method2225(108, 3)];
                    int var5 = class158.field2514.method2225(-106, 1);
                    int var6 = class158.field2514.method2225(116, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = class158.field2514.method2225(-66, 1);
                    if (var7 == 1) {
                        class208.field3349[class21.field274++] = var1;
                    }
                    int var8 = class158.field2514.method2225(-53, 5);
                    if (var2) {
                        var3.method914(var4, 16383);
                    }
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.method1569(class261.field4201.field1906[0] + var8, var5 == 1, 14160, class261.field4201.field1916[0] + var6, class266.field4286);
                    continue;
                }
            }
            field536++;
            class158.field2514.method2226(7);
            if (arg0 != 61) {
                field533 = null;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(I)V")
    public static final void method285(int arg0) {
        field542++;
        class74 var1 = class433.field6389;
        synchronized (class433.field6389) {
            class218.field3567 = class394.field5912;
            class358.field5467++;
            class414.field6125 = class91.field1129;
            int var2 = 57 / ((-arg0 - 14) / 45);
            class287.field4604 = class1.field3;
            class402.field6005 = class220.field3626;
            class56.field692 = class255.field4128;
            class214.field3480 = class108.field1519;
            class452.field6586 = class181.field2972;
            class220.field3626 = 0;
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(B)V")
    public static final void method286(byte arg0) {
        field539++;
        class224.field3737.method255(-20994);
        for (class418 var1 = (class418) class86.field1089.method253((byte) -6); var1 != null; var1 = (class418) class86.field1089.method247((byte) -121)) {
            if (var1.field6192 < 1000) {
                var1.method1120(90);
                class224.field3737.method245(500, var1);
            }
        }
        class224.field3737.method256(false, class86.field1089);
        if (class129.field2037 != null) {
            return;
        }
        if (arg0 < 53) {
            method285(42);
        }
        if (class329.field5152 != null || class391.field5874 > 0) {
            return;
        }
        int var2 = class402.field6005;
        if (!class262.field4214) {
            if (var2 == 1 && class144.field2267 > 0) {
                int var3 = ((class418) class86.field1089.field459.field2536).field6192;
                if (var3 == 17 || var3 == 51 || var3 == 31 || var3 == 35 || var3 == 15 || var3 == 45 || var3 == 28 || var3 == 58 || var3 == 12 || var3 == 8 || var3 == 7 || var3 == 1003) {
                    class418 var4 = (class418) class86.field1089.field459.field2536;
                    class172 var5 = class196.method1375(var4.field6186, (byte) -56);
                    class53 var6 = client.method1149(var5);
                    if (var6.method351((byte) -95)) {
                        class105.field1476 = 0;
                        class39.field496 = false;
                        if (class129.field2037 != null) {
                            class336.method2219((byte) 6, class129.field2037);
                        }
                        class129.field2037 = class196.method1375(var4.field6186, (byte) -56);
                        class92.field1132 = var4.field6187;
                        class300.field4764 = class214.field3480;
                        class262.field4216 = class56.field692;
                        class336.method2219((byte) 6, class129.field2037);
                        return;
                    }
                }
            }
            if (var2 <= 0 && class381.field5765 > 0) {
                var2 = class381.field5765;
            }
            class381.field5765 = 0;
            if (var2 == 1 && (class345.field5327 == 1 && class144.field2267 > 2 || class323.method2140((byte) 57))) {
                var2 = 2;
            }
            if (var2 == 2 && class144.field2267 > 0) {
                class433.method2677(class214.field3480, 0, class56.field692);
            }
            if (var2 == 1 && class144.field2267 > 0) {
                class133.method971((byte) 115);
                return;
            }
            return;
        }
        if (var2 != 1) {
            int var7 = class414.field6125;
            int var8 = class287.field4604;
            if ((class75.field949 - 10) > var7 || class75.field949 + class427.field6299 + 10 < var7 || var8 < (class27.field315 - 10) || class27.field315 + class186.field3064 + 10 < var8) {
                class262.field4214 = false;
                class59.method389(class27.field315, class186.field3064, class75.field949, class427.field6299, (byte) -125);
            }
        }
        if (var2 != 1) {
            return;
        }
        int var9 = class75.field949;
        int var10 = class27.field315;
        int var11 = class427.field6299;
        int var12 = class56.field692;
        int var13 = class214.field3480;
        int var14 = -1;
        for (int var15 = 0; var15 < class144.field2267; var15++) {
            if (class61.field786) {
                int var19 = var10 + ((class144.field2267 + -1 + -var15) * 16) + 33;
                if (var9 < var12 && var12 < (var9 + var11) && var19 - 13 < var13 && var13 < (var19 + 4)) {
                    var14 = var15;
                }
            } else {
                int var20 = (class144.field2267 - var15 - 1) * 16 + var10 + 31;
                if (var9 < var12 && var9 + var11 > var12 && var20 - 13 < var13 && var13 < var20 + 3) {
                    var14 = var15;
                }
            }
        }
        if (var14 != -1) {
            int var16 = 0;
            class388 var17 = new class388(class86.field1089);
            for (class418 var18 = (class418) var17.method2458(true); var18 != null; var18 = (class418) var17.method2459(97)) {
                if (var14 == var16) {
                    class187.method1332(false, var18);
                }
                var16++;
            }
        }
        class262.field4214 = false;
        class59.method389(class27.field315, class186.field3064, class75.field949, class427.field6299, (byte) -89);
    }

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "(I)V")
    public static void method287(int arg0) {
        field533 = null;
        if (arg0 == -3) {
            field532 = null;
            field535 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IILjd;IIBI)V")
    public static final void method288(int arg0, int arg1, class124 arg2, int arg3, int arg4, byte arg5, int arg6) {
        class196.method1373(0, (byte) -121, arg0, arg2.field722, arg1, arg3, arg6, arg2.field724, arg4);
        if (arg5 <= -1) {
            field541++;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIB)V")
    public static final void method289(int arg0, int arg1, int arg2, byte arg3) {
        field540++;
        class211 var4 = class281.method1921(11, arg2, (byte) -94);
        var4.method1490((byte) 117);
        var4.field3379 = arg0;
        var4.field3383 = arg1;
        if (arg3 < 106) {
            method289(69, -124, -112, (byte) 72);
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(Z)V")
    public static final void method290(boolean arg0) {
        field538++;
        class52 var1 = class308.field4876;
        synchronized (class308.field4876) {
            class308.field4876.method336(127);
        }
        class52 var2 = class86.field1081;
        synchronized (class86.field1081) {
            class86.field1081.method336(82);
        }
        class52 var3 = class30.field373;
        synchronized (class30.field373) {
            if (arg0) {
                method286((byte) 24);
            }
            class30.field373.method336(-85);
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
    public class43() {
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(S)V")
    public class43(short arg0) {
        this.field537 = arg0;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class101 extends class261 {

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field1449 = 1400;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    public static int field1453 = -1;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "[I")
    public static int[] field1452 = new int[500];

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
    public static int field1454;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hk", name = "o", descriptor = "Ljava/lang/Class;")
    public static Class field1455;

    // $FF: synthetic method
    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method686(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V", line = 10)
    public static final void method683(int arg0) {
        if (arg0 > -91) {
            return;
        }
        field1451++;
        if (class327.field5012) {
            return;
        }
        class314.field4804 = true;
        if (class96.field1399.field5229) {
            class482.field7022 = ((int) class482.field7022 + 191 & 0xFFFFFF80);
        } else {
            class186.field2619 += (24.0F - class186.field2619) / 2.0F;
        }
        class327.field5012 = true;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V", line = 35)
    public static final void method684(byte arg0) {
        if (arg0 < 75) {
            method683(-122);
        }
        field1450++;
        for (class406 var1 = (class406) class286.field4266.method1970(64); var1 != null; var1 = (class406) class286.field4266.method1960(24)) {
            if (class380.field5802 == null) {
                var1.method2785((byte) -120);
            } else if (class405.field6116 >= var1.field6125) {
                int var14 = class341.field5384[var1.field6143];
                if (var14 == 0) {
                    class70 var15 = class456.method2743(var1.field6140, var1.field6136, var1.field6132);
                    if (var15 instanceof class458) {
                        class38.method271(var1.field6140, var1.field6136, var1.field6132);
                        class458 var16 = (class458) var15;
                        if (var16.field6719 != null) {
                            class250.method1638(var1.field6140, var1.field6136, var1.field6132, var16.field6719, null);
                        }
                    }
                } else if (var14 == 1) {
                    class255 var21 = class174.method1214(var1.field6140, var1.field6136, var1.field6132);
                    if (var21 instanceof class392) {
                        class507.method3027(var1.field6140, var1.field6136, var1.field6132);
                        class392 var22 = (class392) var21;
                        if (var22.field5955 != null) {
                            class393.method2414(var1.field6140, var1.field6136, var1.field6132, var22.field5955, null);
                        }
                    }
                } else if (var14 == 2) {
                    class153 var19 = class432.method2587(var1.field6140, var1.field6136, var1.field6132, field1455 == null ? (field1455 = method686("ou")) : field1455);
                    if (var19 instanceof class399) {
                        class268.method1711(var1.field6140, var1.field6136, var1.field6132, field1455 == null ? (field1455 = method686("ou")) : field1455);
                        class399 var20 = (class399) var19;
                        if (var20.field6076 != null) {
                            class223.method1511(var20.field6076, false);
                        }
                    }
                } else if (var14 == 3) {
                    class383 var17 = class380.method2357(var1.field6140, var1.field6136, var1.field6132);
                    if (var17 instanceof class286) {
                        class77.method510(var1.field6140, var1.field6136, var1.field6132);
                        class286 var18 = (class286) var17;
                        if (var18.field4270 != null) {
                            class288.method1868(var1.field6140, var1.field6136, var1.field6132, var18.field4270);
                        }
                    }
                }
                var1.method2785((byte) -120);
            } else if (class405.field6116 == var1.field6137) {
                int var2 = class341.field5384[var1.field6143];
                if (var2 == 0) {
                    class70 var12 = class456.method2743(var1.field6140, var1.field6136, var1.field6132);
                    if (var12 instanceof class458) {
                        var1.method2785((byte) -120);
                    } else if (class493.method2924(var1.field6140, var1.field6136, var1.field6132) == null) {
                        class458 var13 = new class458(var1.field6143, var1.field6128, var1.field6139, var1.field6146, var1.field6131, var12);
                        class250.method1638(var1.field6140, var1.field6136, var1.field6132, var13, null);
                    } else {
                        var1.method2785((byte) -120);
                    }
                } else if (var2 == 1) {
                    class255 var10 = class174.method1214(var1.field6140, var1.field6136, var1.field6132);
                    if (var10 instanceof class392) {
                        var1.method2785((byte) -120);
                    } else if (class354.method2237(var1.field6140, var1.field6136, var1.field6132) == null) {
                        class392 var11 = new class392(var1.field6143, var1.field6128, var1.field6139, var1.field6146, var1.field6131, var10);
                        class393.method2414(var1.field6140, var1.field6136, var1.field6132, var11, null);
                    } else {
                        var1.method2785((byte) -120);
                    }
                } else if (var2 == 2) {
                    class153 var3 = class432.method2587(var1.field6140, var1.field6136, var1.field6132, field1455 == null ? (field1455 = method686("ou")) : field1455);
                    if (var3 instanceof class399) {
                        var1.method2785((byte) -120);
                    } else {
                        class268.method1711(var1.field6140, var1.field6136, var1.field6132, field1455 == null ? (field1455 = method686("ou")) : field1455);
                        class130 var4 = class56.field755.method2031(115, var1.field6144);
                        int var5;
                        int var6;
                        if (var1.field6128 == 1 || var1.field6128 == 3) {
                            var6 = var4.field1898;
                            var5 = var4.field1843;
                        } else {
                            var5 = var4.field1898;
                            var6 = var4.field1843;
                        }
                        class399 var7 = new class399(var1.field6143, var1.field6128, var1.field6140, var1.field6139, var1.field6146, var1.field6131, var1.field6136, var1.field6136 + var6 - 1, var1.field6132, var1.field6132 + var5 - 1, var3);
                        class223.method1511(var7, false);
                    }
                } else if (var2 == 3) {
                    class383 var8 = class380.method2357(var1.field6140, var1.field6136, var1.field6132);
                    if (var8 instanceof class286) {
                        var1.method2785((byte) -120);
                    } else {
                        class286 var9 = new class286(var1.field6139, var1.field6146, var1.field6131, var8);
                        class288.method1868(var1.field6140, var1.field6136, var1.field6132, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V", line = 243)
    public static void method685(boolean arg0) {
        field1452 = null;
        if (!arg0) {
            field1454 = -22;
        }
    }
}

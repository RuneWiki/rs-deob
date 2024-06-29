import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class588 implements class231 {

    @OriginalMember(owner = "client!pda", name = "e", descriptor = "Ljava/lang/String;")
    private String field7793;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "Lbi;")
    private class449 field7789;

    @OriginalMember(owner = "client!pda", name = "g", descriptor = "I")
    public static int field7795 = 0;

    @OriginalMember(owner = "client!pda", name = "f", descriptor = "I")
    public static int field7794 = 0;

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "I")
    public static int field7790;

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "I")
    public static int field7791;

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "I")
    public static int field7792;

    @OriginalMember(owner = "client!pda", name = "h", descriptor = "I")
    public static int field7796;

    @OriginalMember(owner = "client!pda", name = "i", descriptor = "I")
    public static int field7797;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pda", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field7798;

    // $FF: synthetic method
    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3238(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(I)I", line = 9)
    public static final int method3235(int arg0) {
        field7796++;
        if (class237.field3351 == 0) {
            class6.field156.method109((byte) 90, new class75("jaclib"));
            if (class6.field156.method111(-124).method592(-11428) != 100) {
                return 1;
            }
            if (!((class75) class6.field156.method111(arg0 ^ 0xFFFFFFC9)).method591((byte) -38)) {
                class139.field2244.method2269((byte) -23);
            }
            class237.field3351 = 1;
        }
        if (class237.field3351 == 1) {
            class663.field9419 = class6.method113(arg0 + 6);
            class6.field145.method109((byte) 91, new class328(class449.field6136));
            class6.field158.method109((byte) 100, new class75("jaggl"));
            class6.field159.method109((byte) 125, new class75("jagdx"));
            class6.field160.method109((byte) 105, new class75("jagmisc"));
            class6.field161.method109((byte) 101, new class75("sw3d"));
            class6.field162.method109((byte) 105, new class75("hw3d"));
            class6.field163.method109((byte) 124, new class328(class230.field3220));
            class6.field164.method109((byte) 111, new class328(class29.field481));
            class6.field165.method109((byte) 101, new class328(class525.field6997));
            class6.field166.method109((byte) 125, new class328(class696.field9774));
            class6.field167.method109((byte) 108, new class328(class46.field663));
            class6.field168.method109((byte) 127, new class328(class46.field665));
            class6.field169.method109((byte) 104, new class328(class84.field1299));
            class6.field170.method109((byte) 100, new class328(class602.field7989));
            class6.field171.method109((byte) 99, new class328(class428.field5868));
            class6.field172.method109((byte) 88, new class328(class657.field8956));
            class6.field173.method109((byte) 97, new class328(class158.field2499));
            class6.field174.method109((byte) 112, new class328(class513.field6852));
            class6.field175.method109((byte) 92, new class328(class482.field6509));
            class6.field176.method109((byte) 98, new class328(class426.field5852));
            class6.field177.method109((byte) 87, new class605(class700.field9849, "huffman"));
            class6.field178.method109((byte) 91, new class328(class225.field3176));
            class6.field179.method109((byte) 112, new class328(class666.field9455));
            class6.field180.method109((byte) 115, new class328(class68.field1035));
            class6.field181.method109((byte) 97, new class588(class559.field7425, "details"));
            for (int var1 = 0; var1 < class663.field9419.length; var1++) {
                if (class663.field9419[var1].method111(-32) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class6[] var3 = class663.field9419;
            for (int var4 = 0; var4 < var3.length; var4++) {
                class6 var5 = var3[var4];
                int var6 = var5.method110(-102);
                int var7 = var5.method111(arg0 ^ 0xFFFFFFBC).method592(-11428);
                var2 += var6 * var7 / 100;
            }
            class237.field3351 = 2;
            class78.field1226 = var2;
        }
        if (class663.field9419 == null) {
            return 100;
        }
        int var8 = 0;
        int var9 = 0;
        boolean var10 = true;
        class6[] var11 = class663.field9419;
        for (int var12 = 0; var12 < var11.length; var12++) {
            class6 var16 = var11[var12];
            int var17 = var16.method110(-32);
            int var18 = var16.method111(-26).method592(arg0 ^ 0xFFFFD35D);
            if (var18 < 100) {
                var10 = false;
            }
            var8 += var17;
            var9 += var17 * var18 / 100;
        }
        if (var10) {
            if (!((class75) class6.field160.method111(-41)).method591((byte) -38)) {
                class139.field2244.method2272((byte) 94);
            }
            class663.field9419 = null;
        }
        int var13 = var9 - class78.field1226;
        int var14 = var8 - class78.field1226;
        if (arg0 != 1) {
            field7795 = 31;
        }
        int var15 = var14 > 0 ? var13 * 100 / var14 : 100;
        if (!var10 && var15 > 99) {
            var15 = 99;
        }
        return var15;
    }

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Lbi;Ljava/lang/String;)V", line = 150)
    private class588(class449 arg0, String arg1) {
        this.field7793 = arg1;
        this.field7789 = arg0;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(IIIIIIIII)V", line = 159)
    public static final void method3236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field7790++;
        if (class269.method1639(arg1, 0)) {
            if (arg4 != 3) {
                field7795 = 113;
            }
            if (class699.field9814[arg1] == null) {
                class54.method362(-1, arg5, 1024, arg6, arg8, arg0, arg3, class601.field7977[arg1], arg7, arg2);
            } else {
                class54.method362(-1, arg5, arg4 ^ 0x403, arg6, arg8, arg0, arg3, class699.field9814[arg1], arg7, arg2);
            }
        } else if (arg0 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class511.field6834[var9] = true;
            }
        } else {
            class511.field6834[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "(I)V", line = 192)
    public static final void method3237(int arg0) {
        if (arg0 < 122) {
            method3235(-22);
        }
        field7792++;
        for (class42 var1 = (class42) class39.field584.method3257(-69); var1 != null; var1 = (class42) class39.field584.method3263((byte) -100)) {
            if (class703.field9899 == null) {
                var1.method2797(-120);
            } else if (class642.field8626 >= var1.field613) {
                int var14 = class216.field3088[var1.field605];
                if (var14 == 0) {
                    class477 var21 = class219.method1390(var1.field617, var1.field615, var1.field620);
                    if (var21 instanceof class436) {
                        class286.method1767(var1.field617, var1.field615, var1.field620);
                        class436 var22 = (class436) var21;
                        if (var22.field5972 != null) {
                            class100.method764(var1.field617, var1.field615, var1.field620, var22.field5972, null);
                        }
                    }
                } else if (var14 == 1) {
                    class18 var15 = class74.method581(var1.field617, var1.field615, var1.field620);
                    if (var15 instanceof class562) {
                        class157.method1097(var1.field617, var1.field615, var1.field620);
                        class562 var16 = (class562) var15;
                        if (var16.field7454 != null) {
                            class425.method2433(var1.field617, var1.field615, var1.field620, var16.field7454, null);
                        }
                    }
                } else if (var14 == 2) {
                    class641 var17 = class503.method2793(var1.field617, var1.field615, var1.field620, field7798 == null ? (field7798 = method3238("qi")) : field7798);
                    if (var17 instanceof class92) {
                        class692.method3841(var1.field617, var1.field615, var1.field620, field7798 == null ? (field7798 = method3238("qi")) : field7798);
                        class92 var18 = (class92) var17;
                        if (var18.field1389 != null) {
                            class618.method3385(var18.field1389, false);
                        }
                    }
                } else if (var14 == 3) {
                    class618 var19 = class34.method269(var1.field617, var1.field615, var1.field620);
                    if (var19 instanceof class13) {
                        class446.method2517(var1.field617, var1.field615, var1.field620);
                        class13 var20 = (class13) var19;
                        if (var20.field216 != null) {
                            class66.method530(var1.field617, var1.field615, var1.field620, var20.field216);
                        }
                    }
                }
                var1.method2797(70);
            } else if (class642.field8626 == var1.field619) {
                int var2 = class216.field3088[var1.field605];
                if (var2 == 0) {
                    class477 var12 = class219.method1390(var1.field617, var1.field615, var1.field620);
                    if (var12 instanceof class436) {
                        var1.method2797(77);
                    } else if (class93.method736(var1.field617, var1.field615, var1.field620) == null) {
                        class436 var13 = new class436(var1.field605, var1.field614, var1.field608, var1.field604, var1.field611, var12);
                        class100.method764(var1.field617, var1.field615, var1.field620, var13, null);
                    } else {
                        var1.method2797(-124);
                    }
                } else if (var2 == 1) {
                    class18 var3 = class74.method581(var1.field617, var1.field615, var1.field620);
                    if (var3 instanceof class562) {
                        var1.method2797(60);
                    } else if (class304.method1842(var1.field617, var1.field615, var1.field620) == null) {
                        class562 var4 = new class562(var1.field605, var1.field614, var1.field608, var1.field604, var1.field611, var3);
                        class425.method2433(var1.field617, var1.field615, var1.field620, var4, null);
                    } else {
                        var1.method2797(-114);
                    }
                } else if (var2 == 2) {
                    class641 var5 = class503.method2793(var1.field617, var1.field615, var1.field620, field7798 == null ? (field7798 = method3238("qi")) : field7798);
                    if (var5 instanceof class92) {
                        var1.method2797(82);
                    } else {
                        class692.method3841(var1.field617, var1.field615, var1.field620, field7798 == null ? (field7798 = method3238("qi")) : field7798);
                        class58 var6 = class470.field6288.method1258(var1.field616, (byte) -128);
                        int var7;
                        int var8;
                        if (var1.field614 == 1 || var1.field614 == 3) {
                            var8 = var6.field838;
                            var7 = var6.field885;
                        } else {
                            var7 = var6.field838;
                            var8 = var6.field885;
                        }
                        class92 var9 = new class92(var1.field605, var1.field614, var1.field617, var1.field608, var1.field604, var1.field611, var1.field615, var7 + var1.field615 - 1, var1.field620, var8 + var1.field620 - 1, var5);
                        class618.method3385(var9, false);
                    }
                } else if (var2 == 3) {
                    class618 var10 = class34.method269(var1.field617, var1.field615, var1.field620);
                    if (var10 instanceof class13) {
                        var1.method2797(114);
                    } else {
                        class13 var11 = new class13(var1.field608, var1.field604, var1.field611, var10);
                        class66.method530(var1.field617, var1.field615, var1.field620, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)Liaa;", line = 406)
    public final class462 method590(byte arg0) {
        field7797++;
        int var2 = 102 % ((6 - arg0) / 57);
        return class462.field6254;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)I", line = 416)
    public final int method592(int arg0) {
        field7791++;
        if (arg0 == -11428) {
            return this.field7789.method2522(this.field7793, (byte) -33) ? 100 : this.field7789.method2546(-17877, this.field7793);
        } else {
            return 94;
        }
    }
}

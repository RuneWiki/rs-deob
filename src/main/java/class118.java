import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class118 extends class139 {

    @OriginalMember(owner = "client!vb", name = "N", descriptor = "I")
    public static int field1493 = -1;

    @OriginalMember(owner = "client!vb", name = "S", descriptor = "[I")
    public static int[] field1498 = new int[14];

    @OriginalMember(owner = "client!vb", name = "K", descriptor = "Lwf;")
    public static class79 field1490 = new class79(33, 11);

    @OriginalMember(owner = "client!vb", name = "U", descriptor = "Lvs;")
    public static class385 field1500 = new class385(0, -1);

    @OriginalMember(owner = "client!vb", name = "I", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!vb", name = "J", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!vb", name = "L", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!vb", name = "M", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!vb", name = "O", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!vb", name = "P", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!vb", name = "Q", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!vb", name = "R", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!vb", name = "H", descriptor = "[Ljava/lang/String;")
    public static String[] field1487;

    @OriginalMember(owner = "client!vb", name = "T", descriptor = "[[B")
    public static byte[][] field1499;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        if (arg1 == -45) {
            if (~arg2 == -1) {
                super.field1841 = ~arg0.method1701(-23121) == -2;
            }
            ++field1492;
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
    public class118() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)I")
    public static final int method733(int arg0) {
        ++field1496;
        try {
            if (~class408.field5725 == -1) {
                if (~(class433.method2562(-2039) - 5000L) > ~class244.field3635) {
                    return 0;
                }
                class437.field6077 = class252.field3718.method2527(class279.field4115, (byte) -126, class230.field3470);
                class157.field2347 = class433.method2562(-2039);
                class408.field5725 = 1;
            }
            if (class433.method2562(-2039) > class157.field2347 + 30000L) {
                return class115.method725(0, 1000);
            } else {
                if (~class408.field5725 == -2) {
                    if (~class437.field6077.field5253 == -3) {
                        return class115.method725(0, 1001);
                    }
                    if (class437.field6077.field5253 != 1) {
                        return -1;
                    }
                    class58.field761 = new class337((Socket) class437.field6077.field5255, class252.field3718);
                    class437.field6077 = null;
                    int var1 = 0;
                    class225.field3415.field4021 = 0;
                    if (class470.field6623) {
                        var1 = class61.field804;
                    }
                    class225.field3415.method1753(true, class93.field1194.field1886);
                    class225.field3415.method1744(var1, true);
                    class58.field761.method2125(class225.field3415.field4021, class225.field3415.field4064, (byte) -36, 0);
                    if (class28.field381 != null) {
                        class28.field381.method2477(-122);
                    }
                    if (class116.field1481 != null) {
                        class116.field1481.method2477(-79);
                    }
                    int var2 = class58.field761.method2119(true);
                    if (class28.field381 != null) {
                        class28.field381.method2477(arg0 + -27214);
                    }
                    if (class116.field1481 != null) {
                        class116.field1481.method2477(-73);
                    }
                    if (~var2 != -1) {
                        return class115.method725(arg0 + -27106, var2);
                    }
                    class408.field5725 = 2;
                }
                if (class408.field5725 == 2) {
                    if (~class58.field761.method2121(true) > -3) {
                        return -1;
                    }
                    class216.field3253 = class58.field761.method2119(true);
                    class216.field3253 <<= 8;
                    class216.field3253 += class58.field761.method2119(true);
                    class161.field2391 = 0;
                    class408.field5725 = 3;
                    class184.field2707 = new byte[class216.field3253];
                }
                if (class408.field5725 == 3) {
                    int var3 = class58.field761.method2121(true);
                    if (var3 < 1) {
                        return -1;
                    } else {
                        if (~var3 < ~(-class161.field2391 + class216.field3253)) {
                            var3 = -class161.field2391 + class216.field3253;
                        }
                        class58.field761.method2123(88, class161.field2391, class184.field2707, var3);
                        class161.field2391 += var3;
                        if (class216.field3253 > class161.field2391) {
                            return -1;
                        } else if (!class62.method391((byte) -85, class184.field2707)) {
                            return class115.method725(0, 1002);
                        } else {
                            class156.field2323 = new class42[class353.field5102];
                            int var4 = 0;
                            for (int var5 = class31.field414; ~class257.field3763 <= ~var5; ++var5) {
                                class42 var6 = class76.method442(var5, 0);
                                if (var6 != null) {
                                    class156.field2323[var4++] = var6;
                                }
                            }
                            class105.field1339 = 0;
                            class206.field3159 = null;
                            class58.field761.method2118(1);
                            class58.field761 = null;
                            class153.field2279 = 0;
                            class184.field2707 = null;
                            class408.field5725 = 0;
                            class244.field3635 = class433.method2562(-2039);
                            return 0;
                        }
                    }
                } else {
                    if (arg0 != 27106) {
                        method737((class201) null, (class201) null, -51);
                    }
                    return -1;
                }
            }
        } catch (IOException var7) {
            return class115.method725(0, 1003);
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(II)Lsh;")
    public static final class48 method734(int arg0, int arg1) {
        ++field1491;
        if (arg1 != 4236) {
            return null;
        } else {
            class48[] var2 = class362.method2238((byte) -84);
            for (int var3 = 0; ~var2.length < ~var3; ++var3) {
                class48 var4 = var2[var3];
                if (~var4.field671 == ~arg0) {
                    return var4;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZII)V")
    private final void method735(boolean arg0, int arg1, int arg2) {
        ++field1488;
        int var4 = class216.field3245[arg2];
        int var5 = class237.field3559[arg1];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            client.field2610 = arg1;
            class321.field4654 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            client.field2610 = arg2;
            class321.field4654 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class321.field4654 = -arg1 + class356.field5147;
            client.field2610 = arg2;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            client.field2610 = -arg1 + class241.field3615;
            class321.field4654 = arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            client.field2610 = -arg1 + class241.field3615;
            class321.field4654 = -arg2 + class356.field5147;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            client.field2610 = -arg2 + class241.field3615;
            class321.field4654 = class356.field5147 - arg1;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            client.field2610 = class241.field3615 - arg2;
            class321.field4654 = arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class321.field4654 = -arg2 + class356.field5147;
            client.field2610 = arg1;
        }
        if (!arg0) {
            this.method33(-51, 77);
        }
        client.field2610 &= class388.field5511;
        class321.field4654 &= class414.field5822;
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)V")
    public static void method736(int arg0) {
        field1499 = null;
        field1487 = null;
        field1490 = null;
        field1500 = null;
        if (arg0 != 0) {
            method733(39);
        }
        field1498 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lb;Lb;I)V")
    public static final void method737(class201 arg0, class201 arg1, int arg2) {
        if (arg2 < 24) {
            method737((class201) null, (class201) null, -6);
        }
        class422.field5919 = arg1;
        class19.field267 = arg0;
        ++field1494;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)[[I")
    public final int[][] method33(int arg0, int arg1) {
        ++field1495;
        if (arg0 >= -67) {
            return null;
        } else {
            int[][] var3 = super.field1835.method999((byte) 104, arg1);
            if (super.field1835.field2395) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; var7 < class356.field5147; ++var7) {
                    this.method735(true, arg1, var7);
                    int[][] var8 = this.method882(0, client.field2610, 1);
                    var4[var7] = var8[0][class321.field4654];
                    var5[var7] = var8[1][class321.field4654];
                    var6[var7] = var8[2][class321.field4654];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        ++field1489;
        int[] var3 = super.field1844.method2176(arg0, arg1 ^ arg1);
        if (super.field1844.field5045) {
            for (int var4 = 0; class356.field5147 > var4; ++var4) {
                this.method735(true, arg0, var4);
                int[] var5 = this.method879((byte) -29, client.field2610, 0);
                var3[var4] = var5[class321.field4654];
            }
        }
        return var3;
    }
}

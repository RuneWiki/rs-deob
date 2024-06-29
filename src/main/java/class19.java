import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class19 extends class105 {

    @OriginalMember(owner = "client!lh", name = "W", descriptor = "I")
    private int field506 = 0;

    @OriginalMember(owner = "client!lh", name = "T", descriptor = "I")
    private int field503 = 4096;

    @OriginalMember(owner = "client!lh", name = "O", descriptor = "Z")
    public static boolean field498 = true;

    @OriginalMember(owner = "client!lh", name = "U", descriptor = "Z")
    public static volatile boolean field504 = true;

    @OriginalMember(owner = "client!lh", name = "Z", descriptor = "Lgi;")
    public static class183 field509 = null;

    @OriginalMember(owner = "client!lh", name = "Y", descriptor = "D")
    public static double field508 = -1.0D;

    @OriginalMember(owner = "client!lh", name = "P", descriptor = "I")
    public static int field499 = 1;

    @OriginalMember(owner = "client!lh", name = "ab", descriptor = "Lvf;")
    private static class265 field510 = class87.method582(-46, "red:");

    @OriginalMember(owner = "client!lh", name = "eb", descriptor = "Lvf;")
    private static class265 field514 = class87.method582(-46, "wave:");

    @OriginalMember(owner = "client!lh", name = "db", descriptor = "Lvf;")
    public static class265 field513 = field510;

    @OriginalMember(owner = "client!lh", name = "hb", descriptor = "Lvf;")
    public static class265 field517 = field514;

    @OriginalMember(owner = "client!lh", name = "bb", descriptor = "Lvf;")
    public static class265 field511 = field510;

    @OriginalMember(owner = "client!lh", name = "kb", descriptor = "I")
    public static int field520 = 0;

    @OriginalMember(owner = "client!lh", name = "M", descriptor = "Lvf;")
    private static class265 field496 = class87.method582(-46, "Loading title screen )2 ");

    @OriginalMember(owner = "client!lh", name = "X", descriptor = "Lvf;")
    public static class265 field507 = field496;

    @OriginalMember(owner = "client!lh", name = "fb", descriptor = "Lvf;")
    public static class265 field515 = field514;

    @OriginalMember(owner = "client!lh", name = "N", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!lh", name = "Q", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!lh", name = "R", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!lh", name = "S", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!lh", name = "V", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!lh", name = "cb", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!lh", name = "ib", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!lh", name = "jb", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!lh", name = "lb", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!lh", name = "gb", descriptor = "Lfl;")
    public static class192 field516;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lgk;Lvf;B)Lvf;")
    public static final class265 method132(class6 arg0, class265 arg1, byte arg2) {
        if (~arg1.method1792(0, class29.field742) != 0) {
            label58: while (true) {
                int var3 = arg1.method1792(0, class280.field4950);
                if (~var3 == 0) {
                    while (true) {
                        int var4 = arg1.method1792(0, class190.field3418);
                        if (~var4 == 0) {
                            while (true) {
                                int var5 = arg1.method1792(0, class116.field2062);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.method1792(0, class70.field1361);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.method1792(0, class237.field4138);
                                                if (~var7 == 0) {
                                                    while (true) {
                                                        int var8 = arg1.method1792(0, class100.field1757);
                                                        if (var8 == -1) {
                                                            break label58;
                                                        }
                                                        class265 var9 = class4.field66;
                                                        if (class59.field1192 != null) {
                                                            var9 = class54.method417((byte) -15, class59.field1192.field2000);
                                                            try {
                                                                if (class59.field1192.field1997 != null) {
                                                                    byte[] var10 = ((String) class59.field1192.field1997).getBytes("ISO-8859-1");
                                                                    var9 = class7.method51(0, 12047, var10.length, var10);
                                                                }
                                                            } catch (UnsupportedEncodingException var12) {
                                                            }
                                                        }
                                                        arg1 = class148.method1022(10, new class265[] { arg1.method1772(var8, 0, (byte) 102), var9, arg1.method1810(-1, var8 - -4) });
                                                    }
                                                }
                                                arg1 = class148.method1022(10, new class265[] { arg1.method1772(var7, 0, (byte) 119), class52.method412(class26.method233((byte) -61, 4, arg0), 2800), arg1.method1810(-1, var7 + 2) });
                                            }
                                        }
                                        arg1 = class148.method1022(10, new class265[] { arg1.method1772(var6, 0, (byte) 86), class52.method412(class26.method233((byte) 125, 3, arg0), 2800), arg1.method1810(-1, var6 + 2) });
                                    }
                                }
                                arg1 = class148.method1022(10, new class265[] { arg1.method1772(var5, 0, (byte) 108), class52.method412(class26.method233((byte) -127, 2, arg0), 2800), arg1.method1810(-1, var5 + 2) });
                            }
                        }
                        arg1 = class148.method1022(10, new class265[] { arg1.method1772(var4, 0, (byte) 125), class52.method412(class26.method233((byte) 121, 1, arg0), 2800), arg1.method1810(-1, var4 + 2) });
                    }
                }
                arg1 = class148.method1022(10, new class265[] { arg1.method1772(var3, 0, (byte) 81), class52.method412(class26.method233((byte) -98, 0, arg0), 2800), arg1.method1810(-1, var3 + 2) });
            }
        }
        int var11 = 80 % ((arg2 - 67) / 58);
        ++field502;
        return arg1;
    }

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "(I)V")
    public static final void method133(int arg0) {
        ++field519;
        int var1 = 83 % ((arg0 - -19) / 48);
        for (int var2 = 0; class48.field1027 > var2; ++var2) {
            int var3 = class93.field1646[var2];
            class23 var4 = class4.field67[var3];
            if (var4 != null) {
                class244.method1625(var4, -11777, var4.field681.field4713);
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "(I)V")
    public static final void method134(int arg0) {
        if (arg0 == -513) {
            ++field521;
            int var1 = 0;
            for (int var2 = 0; ~var2 > -105; ++var2) {
                for (int var3 = 0; var3 < 104; ++var3) {
                    if (class202.method1389(var3, 3, true, var2, class200.field3577, var1)) {
                        ++var1;
                    }
                    if (~var1 <= -513) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "(I)V")
    public static void method135(int arg0) {
        field510 = null;
        field511 = null;
        field507 = null;
        field514 = null;
        field517 = null;
        field516 = null;
        field515 = null;
        if (arg0 == 15146) {
            field496 = null;
            field513 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
    public class19() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field1853 = ~arg2.method920((byte) 88) == -2;
                }
            } else {
                this.field503 = arg2.method927(125);
            }
        } else {
            this.field506 = arg2.method927(127);
        }
        if (arg1 == 255) {
            ++field505;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IJ)V")
    public static final void method136(int arg0, long arg1) {
        if (arg0 != 1) {
            method133(-68);
        }
        ++field497;
        if (arg1 > 0L) {
            if (arg1 % 10L != 0L) {
                class212.method1450(arg1, -109);
            } else {
                class212.method1450(arg1 + -1L, 25);
                class212.method1450(1L, -128);
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)V")
    public static final void method137(byte arg0, int arg1) {
        ++field500;
        class164.field2981.method1891(-23549, arg1);
        if (arg0 != -120) {
            field510 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)[I")
    public final int[] method16(int arg0, int arg1) {
        if (arg0 != 8055) {
            method134(-28);
        }
        int[] var3 = super.field1862.method458(arg1, false);
        ++field512;
        if (super.field1862.field1236) {
            int[] var4 = this.method705(arg1, (byte) -104, 0);
            for (int var5 = 0; class94.field1668 > var5; ++var5) {
                int var6 = var4[var5];
                if (~this.field506 >= ~var6) {
                    if (this.field503 >= var6) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field503;
                    }
                } else {
                    var3[var5] = this.field506;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "(I)V")
    public static final void method138(int arg0) {
        ++field501;
        class117.method792(-1002);
        class147.method1016(false);
        class265.method1774(true);
        class21.method205(arg0 ^ -821733);
        class29.method242(false);
        class245.method1629(arg0 + -2532);
        if (arg0 != 2532) {
            field510 = null;
        }
        class269.method1845(arg0 + 19175);
        class218.method1501(63);
        class163.method1077(false);
        class167.method1101((byte) -44);
        class101.method677(684);
        class135.method936(58);
        class67.method479((byte) -126);
        class170.method1123(0);
        class143.method979(-29941);
        class100.field1753.method1888((byte) 103);
        class82.field1538.method1888((byte) 100);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IB)[[I")
    public final int[][] method18(int arg0, byte arg1) {
        ++field518;
        if (arg1 >= -110) {
            this.method16(-81, 90);
        }
        int[][] var3 = super.field1870.method569((byte) -94, arg0);
        if (super.field1870.field1567) {
            int[][] var4 = this.method702((byte) 94, arg0, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class94.field1668 > var11; ++var11) {
                int var12 = var7[var11];
                int var13 = var6[var11];
                int var14 = var5[var11];
                if (this.field506 <= var12) {
                    if (~var12 >= ~this.field503) {
                        var8[var11] = var12;
                    } else {
                        var8[var11] = this.field503;
                    }
                } else {
                    var8[var11] = this.field506;
                }
                if (this.field506 <= var14) {
                    if (this.field503 < var14) {
                        var9[var11] = this.field503;
                    } else {
                        var9[var11] = var14;
                    }
                } else {
                    var9[var11] = this.field506;
                }
                if (~var13 <= ~this.field506) {
                    if (~var13 >= ~this.field503) {
                        var10[var11] = var13;
                    } else {
                        var10[var11] = this.field503;
                    }
                } else {
                    var10[var11] = this.field506;
                }
            }
        }
        return var3;
    }
}

import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class class128 extends class332 {

    @OriginalMember(owner = "client!da", name = "x", descriptor = "[Lda;")
    public class128[] field1762;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "Z")
    public boolean field1753;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field1749 = 0;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "[C")
    public static char[] field1750 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public int field1751;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!da", name = "y", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!da", name = "z", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!da", name = "B", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!da", name = "C", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!da", name = "D", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!da", name = "E", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!da", name = "F", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!da", name = "G", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "Ljn;")
    public class132 field1755;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "Lsk;")
    public class135 field1748;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "Llc;")
    public static class175 field1761;

    @OriginalMember(owner = "client!da", name = "A", descriptor = "Llc;")
    public static class175 field1765;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(Z)V", line = 5)
    public void method130(boolean arg0) {
        if (!arg0) {
            field1760++;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V", line = 20)
    public static final void method850(byte arg0) {
        class35.field415.method1241(125);
        class180.field2607.method1241(122);
        field1767++;
        int var1 = 102 / ((-arg0 - 56) / 40);
        class230.field3359.method1241(116);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BII)[I", line = 33)
    public final int[] method851(byte arg0, int arg1, int arg2) {
        if (arg0 >= -53) {
            this.method852(55);
        }
        field1758++;
        return this.field1762[arg1].field1753 ? this.field1762[arg1].method126((byte) 117, arg2) : this.field1762[arg1].method102(arg2, 5110)[0];
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V", line = 54)
    public void method852(int arg0) {
        if (this.field1753) {
            this.field1748.method901((byte) -24);
            this.field1748 = null;
        } else {
            this.field1755.method877((byte) -62);
            this.field1755 = null;
        }
        field1763++;
        if (arg0 != -781218450) {
            this.method860(106);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZ)V", line = 81)
    public static final void method853(int arg0, boolean arg1) {
        if (arg0 <= 60) {
            return;
        }
        field1766++;
        if (class267.field4206 != arg1) {
            class267.field4206 = arg1;
            class41.method242(-6849);
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(BI)[I", line = 99)
    public int[] method126(byte arg0, int arg1) {
        field1759++;
        if (arg0 < 100) {
            method857(true, 35, (class298) null, 53, -78, 83);
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZB)V", line = 114)
    public static final void method854(boolean arg0, byte arg1) {
        class300.field4674 = arg0;
        if (arg1 < 125) {
            field1765 = (class175) null;
        }
        field1768++;
        if (!class300.field4674) {
            int var2 = class307.field4742.method655(-10505);
            int var3 = (class132.field1817 - class307.field4742.field1400) / 16;
            class343.field5326 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    class343.field5326[var4][var5] = class307.field4742.method637((byte) 106);
                }
            }
            boolean var6 = class25.method158(104, class307.field4742.method659(false));
            int var7 = class307.field4742.method669(-31662);
            int var8 = class307.field4742.method638(-128);
            int var9 = class307.field4742.method624(14612);
            int var10 = class307.field4742.method655(-10505);
            class120.field1694 = new int[var3];
            class61.field750 = null;
            class186.field2691 = new int[var3];
            class295.field4613 = new int[var3];
            class230.field3361 = new byte[var3][];
            boolean var11 = false;
            class272.field4270 = (byte[][]) null;
            class61.field754 = new int[var3];
            class239.field3574 = new byte[var3][];
            class110.field1545 = new byte[var3][];
            if (((var2 / 8) == 48 || (var2 / 8) == 49) && var8 / 8 == 48) {
                var11 = true;
            }
            class150.field2082 = new int[var3];
            if (var2 / 8 == 48 && var8 / 8 == 148) {
                var11 = true;
            }
            class106.field1347 = new byte[var3][];
            int var12 = 0;
            for (int var13 = (var2 - 6) / 8; var13 <= ((var2 + 6) / 8); var13++) {
                for (int var14 = (var8 - 6) / 8; var14 <= ((var8 + 6) / 8); var14++) {
                    int var15 = (var13 << 8) + var14;
                    if (var11 && var14 == 49 || var14 == 149 || var14 == 147 || var13 == 50 || !(var13 != 49 || var14 != 47)) {
                        class120.field1694[var12] = var15;
                        class186.field2691[var12] = -1;
                        class61.field754[var12] = -1;
                        class295.field4613[var12] = -1;
                        class150.field2082[var12] = -1;
                    } else {
                        class120.field1694[var12] = var15;
                        class186.field2691[var12] = class222.field3133.method1179((byte) 71, "m" + var13 + "_" + var14);
                        class61.field754[var12] = class222.field3133.method1179((byte) -102, "l" + var13 + "_" + var14);
                        class295.field4613[var12] = class222.field3133.method1179((byte) 68, "um" + var13 + "_" + var14);
                        class150.field2082[var12] = class222.field3133.method1179((byte) -122, "ul" + var13 + "_" + var14);
                    }
                    var12++;
                }
            }
            class149.method1004(var7, var10, var6, var2, (byte) 126, var8, var9, false);
            return;
        }
        int var16 = class307.field4742.method683((byte) 125);
        int var17 = class307.field4742.method669(-31662);
        int var18 = class307.field4742.method624(14612);
        class307.field4742.method572(61);
        for (int var19 = 0; var19 < 4; var19++) {
            for (int var20 = 0; var20 < 13; var20++) {
                for (int var21 = 0; var21 < 13; var21++) {
                    int var22 = class307.field4742.method566(1, 0);
                    if (var22 == 1) {
                        class252.field3836[var19][var20][var21] = class307.field4742.method566(26, 0);
                    } else {
                        class252.field3836[var19][var20][var21] = -1;
                    }
                }
            }
        }
        class307.field4742.method569(true);
        int var23 = (class132.field1817 - class307.field4742.field1400) / 16;
        class343.field5326 = new int[var23][4];
        for (int var24 = 0; var24 < var23; var24++) {
            for (int var25 = 0; var25 < 4; var25++) {
                class343.field5326[var24][var25] = class307.field4742.method637((byte) -120);
            }
        }
        int var26 = class307.field4742.method624(14612);
        int var27 = class307.field4742.method655(-10505);
        boolean var28 = class25.method158(104, class307.field4742.method652(0));
        class110.field1545 = new byte[var23][];
        class106.field1347 = new byte[var23][];
        class230.field3361 = new byte[var23][];
        class150.field2082 = new int[var23];
        class61.field754 = new int[var23];
        class120.field1694 = new int[var23];
        class272.field4270 = (byte[][]) null;
        class186.field2691 = new int[var23];
        class61.field750 = null;
        class239.field3574 = new byte[var23][];
        class295.field4613 = new int[var23];
        int var29 = 0;
        for (int var30 = 0; var30 < 4; var30++) {
            for (int var31 = 0; var31 < 13; var31++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class252.field3836[var30][var31][var32];
                    if (var33 != -1) {
                        int var34 = var33 >> 14 & 0x3FF;
                        int var35 = var33 >> 3 & 0x7FF;
                        int var36 = (var34 / 8 << 8) + var35 / 8;
                        for (int var37 = 0; var37 < var29; var37++) {
                            if (class120.field1694[var37] == var36) {
                                var36 = -1;
                                break;
                            }
                        }
                        if (var36 != -1) {
                            int var38 = var36 >> 8 & 0xFF;
                            class120.field1694[var29] = var36;
                            int var39 = var36 & 0xFF;
                            class186.field2691[var29] = class222.field3133.method1179((byte) -96, "m" + var38 + "_" + var39);
                            class61.field754[var29] = class222.field3133.method1179((byte) -128, "l" + var38 + "_" + var39);
                            class295.field4613[var29] = class222.field3133.method1179((byte) -114, "um" + var38 + "_" + var39);
                            class150.field2082[var29] = class222.field3133.method1179((byte) -100, "ul" + var38 + "_" + var39);
                            var29++;
                        }
                    }
                }
            }
        }
        class149.method1004(var17, var18, var28, var27, (byte) 126, var26, var16, false);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)[[I", line = 363)
    public final int[][] method855(int arg0, int arg1, int arg2) {
        field1771++;
        if (arg0 != -3102) {
            return (int[][]) ((int[][]) null);
        } else if (this.field1762[arg2].field1753) {
            int[] var4 = this.field1762[arg2].method126((byte) 103, arg1);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field1762[arg2].method102(arg1, 5110);
        }
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)I", line = 404)
    public int method856(int arg0) {
        field1756++;
        if (arg0 <= 54) {
            this.method130(false);
        }
        return -1;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)[[I", line = 416)
    public int[][] method102(int arg0, int arg1) {
        field1757++;
        if (arg1 == 5110) {
            throw new IllegalStateException("This operation does not have a colour output");
        }
        return (int[][]) ((int[][]) null);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZILn;III)V", line = 433)
    public static final void method857(boolean arg0, int arg1, class298 arg2, int arg3, int arg4, int arg5) {
        field1764++;
        if (arg2.field4643 == -1 && arg2.field4659 == null) {
            return;
        }
        int var6 = 0;
        int var7 = class261.field3947 * arg2.field4653 >> 8;
        if (arg5 > arg2.field4640) {
            var6 += arg5 - arg2.field4640;
        } else if (arg5 < arg2.field4639) {
            var6 += arg2.field4639 - arg5;
        }
        if (!arg0) {
            return;
        }
        if (arg1 > arg2.field4651) {
            var6 += arg1 - arg2.field4651;
        } else if (arg1 < arg2.field4635) {
            var6 += arg2.field4635 - arg1;
        }
        if (arg2.field4652 == 0 || arg2.field4652 < (var6 - 64) || class261.field3947 == 0 || arg2.field4641 != arg3) {
            if (arg2.field4650 != null) {
                class19.field255.method27(arg2.field4650);
                arg2.field4650 = null;
            }
            if (arg2.field4638 != null) {
                class19.field255.method27(arg2.field4638);
                arg2.field4638 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg2.field4652 - var6) * var7 / arg2.field4652;
        if (arg2.field4650 != null) {
            arg2.field4650.method1135(var8);
        } else if (arg2.field4643 >= 0) {
            class33 var9 = class33.method199(class148.field2060, arg2.field4643, 0);
            if (var9 != null) {
                class203 var10 = var9.method198().method1390(class255.field3880);
                class174 var11 = class174.method1168(var10, 100, var8);
                var11.method1140(-1);
                class19.field255.method31(var11);
                arg2.field4650 = var11;
            }
        }
        if (arg2.field4638 != null) {
            arg2.field4638.method1135(var8);
            if (!arg2.field4638.method2284(17698)) {
                arg2.field4638 = null;
            }
        } else if (arg2.field4659 != null && (arg2.field4649 -= arg4) <= 0) {
            int var12 = (int) ((double) arg2.field4659.length * Math.random());
            class33 var13 = class33.method199(class148.field2060, arg2.field4659[var12], 0);
            if (var13 != null) {
                class203 var14 = var13.method198().method1390(class255.field3880);
                class174 var15 = class174.method1168(var14, 100, var8);
                var15.method1140(0);
                class19.field255.method31(var15);
                arg2.field4649 = arg2.field4642 + ((int) (Math.random() * (double) (arg2.field4644 - arg2.field4642)));
                arg2.field4638 = var15;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lp;II)V", line = 561)
    public void method107(class107 arg0, int arg1, int arg2) {
        field1752++;
        if (arg2 > -85) {
            this.field1748 = (class135) null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 571)
    public static final void method858(int arg0, Component arg1) {
        field1770++;
        arg1.addMouseListener(class184.field2662);
        arg1.addMouseMotionListener(class184.field2662);
        arg1.addFocusListener(class184.field2662);
        if (arg0 >= -123) {
            field1761 = (class175) null;
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(IZ)V", line = 586)
    public class128(int arg0, boolean arg1) {
        this.field1762 = new class128[arg0];
        this.field1753 = arg1;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(III)V", line = 600)
    public final void method859(int arg0, int arg1, int arg2) {
        field1769++;
        int var4 = ~this.field1751 == arg2 ? arg0 : this.field1751;
        if (this.field1753) {
            this.field1748 = new class135(var4, arg0, arg1);
        } else {
            this.field1755 = new class132(var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(I)I", line = 623)
    public int method860(int arg0) {
        field1754++;
        return arg0 == -6967 ? -1 : 56;
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V", line = 646)
    public static void method861(int arg0) {
        field1761 = null;
        if (arg0 == 8) {
            field1750 = null;
            field1765 = null;
        }
    }
}

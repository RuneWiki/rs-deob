import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class97 extends class130 {

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "Lcd;")
    public static class64 field1767 = class44.method335((byte) 71, "<col=40ff00>");

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "Lcd;")
    public static class64 field1772 = class44.method335((byte) 71, ")1");

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "Lcd;")
    public static class64 field1783 = class44.method335((byte) 71, "details");

    @OriginalMember(owner = "client!wc", name = "P", descriptor = "Lig;")
    public static class168 field1784 = new class168(50);

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "B")
    public static byte field1776;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!wc", name = "H", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "Ldh;")
    private class159 field1775;

    @OriginalMember(owner = "client!wc", name = "Q", descriptor = "[I")
    public static int[] field1785;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "[[B")
    public static byte[][] field1768;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLkh;I)V", line = 11)
    private final void method725(byte arg0, class13 arg1, int arg2) {
        field1770++;
        if (arg0 != -49) {
            this.field1775 = (class159) null;
        }
        if (arg2 != 249) {
            return;
        }
        int var4 = arg1.method152((byte) -85);
        if (this.field1775 == null) {
            int var5 = class143.method1013((byte) 39, var4);
            this.field1775 = new class159(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg1.method152((byte) -79) == 1;
            int var8 = arg1.method111(1263702152);
            class25 var9;
            if (var7) {
                var9 = new class141(arg1.method104((byte) -118));
            } else {
                var9 = new class84(arg1.method105((byte) 46));
            }
            this.field1775.method1149(var9, (long) var8, -66);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIZ[Lwf;II[BIIII)V", line = 56)
    public static final void method726(int arg0, int arg1, boolean arg2, class54[] arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9, int arg10) {
        field1769++;
        if (arg0 != 0) {
            method726(-21, 56, false, (class54[]) null, 107, 29, (byte[]) null, 42, 72, -9, -122);
        }
        int var11 = -1;
        class13 var12 = new class13(arg6);
        while (true) {
            int var13 = var12.method156(0);
            if (var13 == 0) {
                return;
            }
            var11 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var12.method163(255);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 12;
                int var18 = var12.method152((byte) -113);
                int var19 = var14 >> 6 & 0x3F;
                int var20 = var18 & 0x3;
                int var21 = var18 >> 2;
                if (arg1 == var17 && var19 >= arg10 && var19 < (arg10 + 8) && arg8 <= var16 && var16 < (arg8 + 8)) {
                    class290 var22 = class172.method1207(var11, -127);
                    int var23 = class253.method1815(var22.field4957, var20, arg0 ^ 0xFFFFB7B6, var16 & 0x7, var22.field5017, arg9, var19 & 0x7) + arg4;
                    int var24 = arg5 + class3.method18(arg9, false, var16 & 0x7, var22.field4957, var20, var22.field5017, var19 & 0x7);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class54 var25 = null;
                        if (!arg2) {
                            int var26 = arg7;
                            if ((class82.field1508[1][var23][var24] & 0x2) == 2) {
                                var26 = arg7 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg3[var26];
                            }
                        }
                        class9.method82(var21, true, arg7, var25, var23, var11, arg7, !arg2, var24, arg2, arg9 + var20 & 0x3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZ)Z", line = 139)
    public static final boolean method727(int arg0, boolean arg1) {
        field1781++;
        class9 var2 = class83.method643(arg0, -24383);
        if (var2 == null) {
            return false;
        } else if (class282.field4846 == 1 || class282.field4846 == 2 || class3.field33 == 2) {
            byte[] var3 = var2.field192.method536(0);
            class247.field4296 = new String(var3, 0, var3.length);
            class76.field1433 = var2.field186;
            if (class3.field33 != 0) {
                class60.field1174 = class76.field1433 + 40000;
                class230.field3909 = class60.field1174;
                class180.field3089 = class76.field1433 + 50000;
            }
            return true;
        } else {
            class64 var4 = class145.field2566;
            if (class3.field33 != 0) {
                var4 = class104.method768(new class64[] { class232.field3912, class310.method2149(var2.field186 + 7000, (byte) 127) }, false);
            }
            class64 var5 = class145.field2566;
            if (class145.field2560 != null) {
                var5 = class104.method768(new class64[] { class46.field763, class145.field2560 }, false);
            }
            class64 var6 = class104.method768(new class64[] { class41.field643, var2.field192, var4, class252.field4393, class310.method2149(class253.field4411, (byte) -37), class53.field870, class310.method2149(class188.field3241, (byte) 4), var5, class61.field1195, class224.field3814 ? class110.field2032 : class273.field4684, class284.field4881, class245.field4257 ? class110.field2032 : class273.field4684, class44.field722, class267.field4604 ? class110.field2032 : class273.field4684 }, false);
            try {
                class134.field2370.getAppletContext().showDocument(var6.method539(-96), "_self");
            } catch (Exception var8) {
                return false;
            }
            if (!arg1) {
                field1784 = (class168) null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lkh;I)V", line = 201)
    public final void method728(class13 arg0, int arg1) {
        field1774++;
        while (true) {
            int var3 = arg0.method152((byte) -69);
            if (var3 == 0) {
                if (arg1 != -104) {
                    this.field1775 = (class159) null;
                }
                return;
            }
            this.method725((byte) -49, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)I", line = 243)
    public final int method729(int arg0, int arg1, int arg2) {
        field1778++;
        if (this.field1775 == null) {
            return arg0;
        } else {
            class84 var4 = (class84) this.field1775.method1151((long) arg1, arg2 ^ arg2);
            return var4 == null ? arg0 : var4.field1552;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lcd;II)Lcd;", line = 260)
    public final class64 method730(class64 arg0, int arg1, int arg2) {
        field1771++;
        if (arg2 <= 26) {
            this.method730((class64) null, -50, -38);
        }
        if (this.field1775 == null) {
            return arg0;
        } else {
            class141 var4 = (class141) this.field1775.method1151((long) arg1, 0);
            return var4 == null ? arg0 : var4.field2482;
        }
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)I", line = 280)
    public static final int method731(int arg0) {
        field1780++;
        if (arg0 != 29983) {
            return -8;
        } else if (class263.field4514 != null) {
            return 3;
        } else if (class123.field2216 && class276.field4751) {
            return 2;
        } else if (class123.field2216 && !class276.field4751) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ID)V", line = 311)
    public static final void method732(int arg0, double arg1) {
        field1777++;
        if (class184.field3158 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class244.field4250[var3] = var4 <= 255 ? var4 : 255;
            }
            class184.field3158 = arg1;
        }
        if (arg0 > -41) {
            method726(-81, -35, true, (class54[]) null, -89, 0, (byte[]) null, 83, -21, 32, 51);
        }
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(B)V", line = 337)
    public static void method733(byte arg0) {
        if (arg0 != -4) {
            return;
        }
        field1768 = (byte[][]) null;
        field1785 = null;
        field1772 = null;
        field1784 = null;
        field1767 = null;
        field1783 = null;
    }
}

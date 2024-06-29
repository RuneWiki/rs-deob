import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class101 extends class132 {

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "Ltg;")
    public static class184 field1873 = class135.method812("Der Anmelde)2Server ist offline)3", 3);

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    public static int field1870 = 0;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "Ltg;")
    public static class184 field1863 = class135.method812(":", 3);

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "Ltg;")
    public static class184 field1876 = class135.method812("<img=0>", 3);

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "I")
    public static int field1875 = 0;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "Lke;")
    public class101 field1867;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "Lke;")
    public class101 field1871;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "[I")
    public static int[] field1865;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V")
    public static void method624(byte arg0) {
        field1865 = null;
        int var1 = 103 % ((arg0 - 44) / 32);
        field1873 = null;
        field1876 = null;
        field1863 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZLvb;)V")
    public static final void method625(boolean arg0, class197 arg1) {
        class36.field678 = arg1;
        field1868++;
        if (arg0) {
            method629(-125, null, -45, 97);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lvb;ILvb;Lvb;Lvb;)V")
    public static final void method626(class197 arg0, int arg1, class197 arg2, class197 arg3, class197 arg4) {
        class135.field2451 = arg3;
        if (arg1 != 0) {
            return;
        }
        field1862++;
        class20.field380 = arg2;
        class119.field2151 = arg0;
        class169.field3210 = arg4;
        class149.field2670 = new class167[class119.field2151.method1264(0)][];
        class59.field1104 = new boolean[class119.field2151.method1264(0)];
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)Ltg;")
    public static final class184 method627(byte arg0, int arg1) {
        field1869++;
        if (arg0 <= 70) {
            field1875 = -126;
        }
        if (arg1 < 100000) {
            return class144.method884(0, new class184[] { class5.field90, class170.method1060(arg1, -102), class170.field3239 });
        } else if (arg1 < 10000000) {
            return class144.method884(0, new class184[] { class110.field1989, class170.method1060(arg1 / 1000, -127), class117.field2115, class170.field3239 });
        } else {
            return class144.method884(0, new class184[] { class60.field1122, class170.method1060(arg1 / 1000000, -127), class38.field731, class170.field3239 });
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(B)V")
    public final void method628(byte arg0) {
        field1872++;
        if (this.field1871 == null) {
            return;
        }
        this.field1871.field1867 = this.field1867;
        this.field1867.field1871 = this.field1871;
        this.field1871 = null;
        this.field1867 = null;
        int var2 = -99 % ((arg0 - 24) / 32);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILgh;II)V")
    public static final void method629(int arg0, class67 arg1, int arg2, int arg3) {
        field1866++;
        if ((arg2 & 0x2) != 0) {
            int var4 = class21.field394.method578((byte) -112);
            byte[] var5 = new byte[var4];
            class97 var6 = new class97(var5);
            class21.field394.method594(var4, (byte) 126, 0, var5);
            class21.field390[arg0] = var6;
            arg1.method394((byte) 3, var6);
        }
        if ((arg2 & 0x40) != 0) {
            arg1.field653 = class21.field394.method564(105);
            if (arg1.field653 == 65535) {
                arg1.field653 = -1;
            }
        }
        if ((arg2 & 0x4) != 0) {
            int var7 = class21.field394.method611(false);
            int var8 = class21.field394.method588((byte) -128);
            int var9 = class21.field394.method605(55);
            int var10 = class21.field394.field1834;
            if (arg1.field1299 != null && arg1.field1275 != null) {
                long var11 = arg1.field1299.method1160(0);
                boolean var13 = false;
                if (var8 <= 1) {
                    for (int var14 = 0; var14 < class9.field170; var14++) {
                        if (class103.field1878[var14] == var11) {
                            var13 = true;
                            break;
                        }
                    }
                }
                if (!var13 && class63.field1182 == 0) {
                    class109.field1970.field1834 = 0;
                    class21.field394.method594(var9, (byte) 126, 0, class109.field1970.field1809);
                    class109.field1970.field1834 = 0;
                    class184 var15 = class211.method1358(class187.method1181(class109.field1970, -32769).method1152(-122));
                    arg1.field611 = var15.method1148(-4383);
                    arg1.field625 = var7 & 0xFF;
                    arg1.field628 = 150;
                    arg1.field602 = var7 >> 8;
                    if (var8 == 2 || var8 == 3) {
                        class149.method914(1, var15, class144.method884(0, new class184[] { class180.field3436, arg1.field1299 }), -49);
                    } else if (var8 == 1) {
                        class149.method914(1, var15, class144.method884(0, new class184[] { class106.field1925, arg1.field1299 }), 108);
                    } else {
                        class149.method914(2, var15, arg1.field1299, 36);
                    }
                }
            }
            class21.field394.field1834 = var10 + var9;
        }
        if ((arg2 & 0x100) != 0) {
            int var16 = class21.field394.method614(0);
            int var17 = class21.field394.method614(0);
            arg1.method215(class161.field2903, var16, 0, var17);
        }
        if ((arg2 & 0x10) != 0) {
            int var18 = class21.field394.method590(true);
            if (var18 == 65535) {
                var18 = -1;
            }
            int var19 = class21.field394.method614(0);
            class182.method1129(arg1, var19, true, var18);
        }
        if ((arg2 & 0x1) != 0) {
            int var20 = class21.field394.method578((byte) -107);
            int var21 = class21.field394.method578((byte) -125);
            arg1.method215(class161.field2903, var20, 0, var21);
            arg1.field640 = class161.field2903 + 300;
            arg1.field601 = class21.field394.method578((byte) -96);
        }
        if ((arg2 & 0x20) != 0) {
            arg1.field605 = class21.field394.method611(false);
            arg1.field654 = class21.field394.method572(false);
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field608 = class21.field394.method588((byte) -119);
            arg1.field665 = class21.field394.method614(0);
            arg1.field657 = class21.field394.method588((byte) -31);
            arg1.field618 = class21.field394.method614(0);
            arg1.field620 = class21.field394.method590(true) + class161.field2903;
            arg1.field632 = class21.field394.method564(73) + class161.field2903;
            arg1.field603 = class21.field394.method588((byte) -95);
            arg1.field642 = 0;
            arg1.field598 = 1;
        }
        if (arg3 >= -81) {
            field1863 = null;
        }
        if ((arg2 & 0x200) != 0) {
            arg1.field619 = class21.field394.method564(86);
            int var22 = class21.field394.method599(-16003);
            arg1.field641 = (var22 & 0xFFFF) + class161.field2903;
            if (arg1.field619 == 65535) {
                arg1.field619 = -1;
            }
            arg1.field607 = 0;
            arg1.field660 = 0;
            arg1.field638 = var22 >> 16;
            if (arg1.field641 > class161.field2903) {
                arg1.field660 = -1;
            }
        }
        if ((arg2 & 0x80) == 0) {
            return;
        }
        arg1.field611 = class21.field394.method596(-1);
        if (arg1.field611.method1165(0, false) == 126) {
            arg1.field611 = arg1.field611.method1140(1, 1);
            class149.method914(2, arg1.field611, arg1.field1299, 44);
        } else if (class46.field872 == arg1) {
            class149.method914(2, arg1.field611, arg1.field1299, 74);
        }
        arg1.field602 = 0;
        arg1.field625 = 0;
        arg1.field628 = 150;
    }
}

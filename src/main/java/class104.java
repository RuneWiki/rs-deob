import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class104 extends class115 {

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "Lud;")
    public static class279 field1960 = class130.method1024("<col=ff3000>", 255);

    @OriginalMember(owner = "client!wc", name = "H", descriptor = "Lud;")
    private static class279 field1957 = class130.method1024("Opened title screen", 255);

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "Lud;")
    public static class279 field1954 = field1957;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "[I")
    public static int[] field1955 = new int[25];

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "I")
    public int field1962;

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!wc", name = "P", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!wc", name = "Q", descriptor = "I")
    public int field1965;

    @OriginalMember(owner = "client!wc", name = "R", descriptor = "I")
    public int field1966;

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "Lud;")
    public class279 field1958;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 6)
    public final void method875(int arg0) {
        field1964++;
        if (arg0 != 12466) {
            method881((class149) null, (class149) null, 65);
        }
        this.field2103 = class127.method1015(arg0 + 9038) + 500L | Long.MIN_VALUE & this.field2103;
        class100.field1866.method1513(this, 256);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIIBI)V", line = 26)
    public static final void method876(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field1959++;
        if (arg7 < 1) {
            field1955 = (int[]) null;
        }
        for (int var9 = 0; var9 < class62.field1274.field2429; var9++) {
            if (class62.field1274.method1044(8, var9)) {
                int var10 = class34.field777 - (class62.field1274.field2436[var9] - (class166.field3007 - 1));
                int var11 = class62.field1274.field2423[var9] - class245.field4356;
                int var12 = (var10 - arg1) * (arg2 - arg8) / (arg0 - arg1) + arg8;
                int var13 = (var11 - arg3) * (arg4 - arg6) / (arg5 - arg3) + arg6;
                int var14 = 16777215;
                class175 var15 = null;
                int var16 = class62.field1274.method1040(var9, (byte) 100);
                if (var16 == 0) {
                    if ((double) class52.field1071 == 3.0D) {
                        var15 = class284.field5072;
                    }
                    if ((double) class52.field1071 == 4.0D) {
                        var15 = class235.field4094;
                    }
                    if ((double) class52.field1071 == 6.0D) {
                        var15 = class229.field3991;
                    }
                    if ((double) class52.field1071 >= 8.0D) {
                        var15 = class239.field4186;
                    }
                }
                if (var16 == 1) {
                    if ((double) class52.field1071 == 3.0D) {
                        var15 = class229.field3991;
                    }
                    if ((double) class52.field1071 == 4.0D) {
                        var15 = class239.field4186;
                    }
                    if ((double) class52.field1071 == 6.0D) {
                        var15 = class119.field2143;
                    }
                    if ((double) class52.field1071 >= 8.0D) {
                        var15 = class64.field1308;
                    }
                }
                if (var16 == 2) {
                    var14 = 16755200;
                    if ((double) class52.field1071 == 3.0D) {
                        var15 = class119.field2143;
                    }
                    if ((double) class52.field1071 == 4.0D) {
                        var15 = class64.field1308;
                    }
                    if ((double) class52.field1071 == 6.0D) {
                        var15 = class57.field1215;
                    }
                    if ((double) class52.field1071 >= 8.0D) {
                        var15 = class44.field936;
                    }
                }
                if (class62.field1274.field2439[var9] != -1) {
                    var14 = class62.field1274.field2439[var9];
                }
                if (var15 != null) {
                    int var17 = class109.field2015.method397(class62.field1274.field2438[var9], (int[]) null, class181.field3312);
                    int var18 = var12 - (var17 - 1) * var15.method1362() / 2;
                    int var19 = var18 + var15.method1359() / 2;
                    for (int var20 = 0; var20 < var17; var20++) {
                        class279 var21 = class181.field3312[var20];
                        if ((var17 - 1) > var20) {
                            var21.method2019(var21.method1984(8) - 4, (byte) -115);
                        }
                        var15.method1363(var21, var13, var19, var14, true);
                        var19 += var15.method1362();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)I", line = 148)
    public final int method877(int arg0) {
        field1963++;
        if (arg0 != 255) {
            this.method878(-125);
        }
        return (int) (this.field5539 >>> 32 & 0xFFL);
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)I", line = 165)
    public final int method878(int arg0) {
        if (arg0 != -7962) {
            method882(true);
        }
        field1950++;
        return (int) this.field5539;
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V", line = 177)
    public final void method879(int arg0) {
        field1961++;
        this.field2103 |= Long.MIN_VALUE;
        if ((long) arg0 == this.method880(true)) {
            class317.field5566.method1513(this, 256);
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)J", line = 195)
    public final long method880(boolean arg0) {
        field1951++;
        if (!arg0) {
            this.field1966 = 71;
        }
        return this.field2103 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lok;Lok;I)I", line = 214)
    public static final int method881(class149 arg0, class149 arg1, int arg2) {
        field1956++;
        int var3 = arg2;
        if (arg0.method1186(class191.field3432, -22698)) {
            var3 = arg2 + 1;
        }
        if (arg0.method1186(class177.field3182, -22698)) {
            var3++;
        }
        if (arg0.method1186(class278.field4917, -22698)) {
            var3++;
        }
        if (arg1.method1186(class191.field3432, -22698)) {
            var3++;
        }
        if (arg1.method1186(class177.field3182, -22698)) {
            var3++;
        }
        if (arg1.method1186(class278.field4917, -22698)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(Z)V", line = 259)
    public static void method882(boolean arg0) {
        field1957 = null;
        field1960 = null;
        field1955 = null;
        field1954 = null;
        if (!arg0) {
            field1960 = (class279) null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(BLok;)V", line = 272)
    public static final void method883(byte arg0, class149 arg1) {
        field1952++;
        if (class178.field3208) {
            return;
        }
        if (class97.field1824) {
            class256.method1833();
        } else {
            class146.method1118();
        }
        class178.field3224 = class182.method1414(class266.field4790, true, arg1);
        int var2 = class176.field3150;
        if (arg0 >= -84) {
            method883((byte) -40, (class149) null);
        }
        int var3 = var2 * 956 / 503;
        class178.field3224.method581((class221.field3899 - var3) / 2, 0, var3, var2);
        class287.field5129 = class177.method1372((byte) -107, arg1, class115.field2093);
        class287.field5129.method423(class221.field3899 / 2 - (class287.field5129.field1041 / 2), 18);
        class178.field3208 = true;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(II)V", line = 297)
    public class104(int arg0, int arg1) {
        this.field5539 = (long) arg1 | (long) arg0 << 32;
    }
}

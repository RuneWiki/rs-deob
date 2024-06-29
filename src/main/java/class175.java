import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class175 {

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "Lvl;")
    private class164 field2804 = new class164(256);

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "Lvl;")
    private class164 field2811 = new class164(256);

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "Lth;")
    private class57 field2802;

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "Lth;")
    private class57 field2809;

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "Z")
    public static boolean field2807 = true;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "([IIIB)Lh;", line = 9)
    private final class110 method1376(int[] arg0, int arg1, int arg2, byte arg3) {
        field2801++;
        int var5 = -104 / ((-arg3 - 2) / 38);
        int var6 = arg2 ^ (arg1 << 4 & 0xFFFD | arg1 >>> 12);
        int var7 = var6 | arg1 << 16;
        long var8 = (long) var7 ^ 0x100000000L;
        class110 var10 = (class110) this.field2811.method1268(111, var8);
        if (var10 != null) {
            return var10;
        } else if (arg0 == null || arg0[0] > 0) {
            class33 var11 = (class33) this.field2804.method1268(92, var8);
            if (var11 == null) {
                var11 = class33.method230(this.field2809, arg1, arg2);
                if (var11 == null) {
                    return null;
                }
                this.field2804.method1273(1, var8, var11);
            }
            class110 var12 = var11.method228(arg0);
            if (var12 == null) {
                return null;
            } else {
                var11.method330(15);
                this.field2811.method1273(1, var8, var12);
                return var12;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V", line = 52)
    public static final void method1377(int arg0) {
        field2808++;
        class198.method1523(112);
        class350.method2464((byte) 125);
        class210.method1585((byte) -11);
        class340.method2395(arg0 ^ 0x4894);
        class176.method1384((byte) -76);
        class315.method2230(0);
        class61.method507(-1003);
        class169.method1312((byte) 58);
        class40.method260((byte) -81);
        class292.method2111(6335);
        class49.method389(-16376);
        class186.method1464(false);
        class307.method2183(-20851);
        class49.method385((byte) 66);
        class354.method2503(arg0 ^ 0xFFFFFFC3);
        class131.method1001(false);
        class13.method70((byte) 120);
        class112.method845(11554);
        class81.method665(-219);
        if (class93.field1571 != 0) {
            for (int var1 = 0; var1 < class46.field746.length; var1++) {
                class46.field746[var1] = null;
            }
            class184.field2973 = 0;
        }
        class229.method1779(2048);
        class86.method694(-26054);
        class23.method149((byte) -122);
        class71.method608(0);
        class106.field1755.method2326(-4);
        if (!class42.field607) {
            ((class98) class153.field2439).method756(255);
        }
        class260.field4363.method2150((byte) 126);
        if (arg0 != -1) {
            method1377(-10);
        }
        class70.field1217.method466(0);
        class327.field5203.method466(0);
        class45.field703.method466(0);
        class220.field3557.method466(0);
        class340.field5425.method466(arg0 + 1);
        class355.field5641.method466(0);
        class22.field251.method466(0);
        class76.field1305.method466(0);
        class156.field2474.method466(0);
        class84.field1429.method466(0);
        class131.field2224.method466(0);
        class101.field1655.method2326(arg0 ^ 0x3);
        class183.field2948.method2326(-4);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(II[II)Lh;", line = 125)
    private final class110 method1378(int arg0, int arg1, int[] arg2, int arg3) {
        field2800++;
        int var5 = (arg3 >>> 12 | arg3 << 4 & 0xFFF1) ^ arg1;
        int var6 = var5 | arg3 << 16;
        if (arg0 != 0) {
            return (class110) null;
        }
        long var7 = (long) var6;
        class110 var9 = (class110) this.field2811.method1268(-80, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class85 var10 = class85.method680(this.field2802, arg3, arg1);
            if (var10 == null) {
                return null;
            }
            class110 var11 = var10.method677();
            this.field2811.method1273(1, var7, var11);
            if (arg2 != null) {
                arg2[0] -= var11.field1808.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIII)V", line = 164)
    public static final void method1379(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2799++;
        if (class42.field607) {
            class244.method1871(arg4, arg3, arg4 + arg0, arg2 + arg3);
            class244.method1862(arg4, arg3, arg0, arg2, 0);
        } else {
            class246.method1889(arg4, arg3, arg0 + arg4, arg2 + arg3);
            class246.method1885(arg4, arg3, arg0, arg2, 0);
        }
        if (class35.field509 < 100) {
            return;
        }
        float var5 = (float) class174.field2780 / (float) class174.field2776;
        int var6 = arg2;
        int var7 = arg0;
        if (var5 < 1.0F) {
            var6 = (int) ((float) arg0 * var5);
        } else {
            var7 = (int) ((float) arg2 / var5);
        }
        int var8 = (arg0 - var7) / 2 + arg4;
        int var9 = (arg2 - var6) / 2 + arg3;
        if (class330.field5242 == null || class330.field5242.field197 != arg0 || class330.field5242.field199 != arg2) {
            class351 var10 = new class351(arg0, arg2);
            class246.method1894(var10.field5571, arg0, arg2);
            if (class174.field2777.field1687 != -1) {
                class246.method1885(0, 0, arg0, arg2, class174.field2777.field1687);
            }
            class174.method1365(0, 0, class174.field2776, class174.field2780, 0, 0, var7, var6);
            class174.method1373();
            if (class42.field607) {
                class330.field5242 = new class58(var10);
            } else {
                class330.field5242 = var10;
            }
            if (class42.field607) {
                class246.field4036 = null;
            } else {
                class292.field4728.method2415(-1);
            }
        }
        class330.field5242.method95(var8, var9);
        int var11 = var8 + (class325.field5167 * var7 / class174.field2776);
        int var12 = var9 + (class201.field3199 * var6 / class174.field2780);
        int var13 = 16711680;
        int var14 = class342.field5446 * var7 / class174.field2776;
        if (class131.field2212 == 1) {
            var13 = 16777215;
        }
        int var15 = class56.field915 * var6 / class174.field2780;
        if (class42.field607) {
            class244.method1872(var11, var12, var14, var15, var13, 128);
            class244.method1865(var11, var12, var14, var15, var13);
        } else {
            class246.method1905(var11, var12, var14, var15, var13, 128);
            class246.method1881(var11, var12, var14, var15, var13);
        }
        if (arg1 != 29932 || class248.field4048 <= 0) {
            return;
        }
        int var16;
        if (class226.field3727 <= 50) {
            var16 = class226.field3727 * 5;
        } else {
            var16 = 500 - class226.field3727 * 5;
        }
        for (class59 var17 = (class59) class174.field2782.method912(false); var17 != null; var17 = (class59) class174.field2782.method909(-126)) {
            class213 var18 = class169.method1315(var17.field1011, 65);
            if (class98.method761(var18, 57)) {
                if (class255.field4296 == var17.field1011) {
                    int var21 = var17.field1015 * var7 / class174.field2776 + var8;
                    int var22 = var17.field1008 * var6 / class174.field2780 + var9;
                    if (class42.field607) {
                        class244.method1872(var21 - 2, var22 + -2, 4, 4, 16776960, var16);
                    } else {
                        class246.method1905(var21 - 2, var22 - 2, 4, 4, 16776960, var16);
                    }
                } else if (class74.field1256 != -1 && class74.field1256 == var18.field3421) {
                    int var19 = var8 + (var17.field1015 * var7 / class174.field2776);
                    int var20 = var17.field1008 * var6 / class174.field2780 + var9;
                    if (class42.field607) {
                        class244.method1872(var19 - 2, var20 + -2, 4, 4, 16776960, var16);
                    } else {
                        class246.method1905(var19 - 2, var20 + -2, 4, 4, 16776960, var16);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lth;Lth;)V", line = 396)
    public class175(class57 arg0, class57 arg1) {
        this.field2802 = arg0;
        this.field2809 = arg1;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(BI[I)Lh;", line = 313)
    public final class110 method1380(byte arg0, int arg1, int[] arg2) {
        field2805++;
        if (this.field2802.method489(17752) == 1) {
            return this.method1378(0, arg1, arg2, 0);
        } else if (this.field2802.method482(arg0 + 27530, arg1) == 1) {
            return this.method1378(0, 0, arg2, arg1);
        } else {
            if (arg0 != 5) {
                method1377(-27);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V", line = 339)
    public static final void method1381(byte arg0) {
        int var1 = -75 % ((22 - arg0) / 39);
        field2810++;
        int[] var2 = new int[class281.field4614];
        int var3 = 0;
        for (int var4 = 0; var4 < class281.field4614; var4++) {
            class52 var5 = class6.method22(var4, 16430);
            if (var5.field819 >= 0 || var5.field842 >= 0) {
                var2[var3++] = var4;
            }
        }
        class184.field2964 = new int[var3];
        for (int var6 = 0; var6 < var3; var6++) {
            class184.field2964[var6] = var2[var6];
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I[II)Lh;", line = 374)
    public final class110 method1382(int arg0, int[] arg1, int arg2) {
        field2803++;
        if (this.field2809.method489(17752) == 1) {
            return this.method1376(arg1, 0, arg2, (byte) 100);
        } else if (this.field2809.method482(27535, arg2) == 1) {
            return this.method1376(arg1, arg2, 0, (byte) -57);
        } else {
            if (arg0 != 9376) {
                method1377(41);
            }
            throw new RuntimeException();
        }
    }
}

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class145 extends class303 {

    @OriginalMember(owner = "client!um", name = "L", descriptor = "I")
    private int field2272 = 4096;

    @OriginalMember(owner = "client!um", name = "R", descriptor = "[[B")
    public static byte[][] field2278 = new byte[50][];

    @OriginalMember(owner = "client!um", name = "S", descriptor = "[I")
    public static int[] field2279 = new int[32768];

    @OriginalMember(owner = "client!um", name = "G", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!um", name = "I", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!um", name = "J", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!um", name = "K", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!um", name = "M", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!um", name = "N", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!um", name = "O", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!um", name = "P", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!um", name = "U", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!um", name = "V", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!um", name = "T", descriptor = "Lai;")
    public static class126 field2280;

    @OriginalMember(owner = "client!um", name = "Q", descriptor = "Z")
    public static boolean field2277;

    @OriginalMember(owner = "client!um", name = "H", descriptor = "[Z")
    public static boolean[] field2268;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIB)V", line = 10)
    public static final void method1096(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg1 >= class188.field2995 && arg1 <= class195.field3108) {
            int var5 = class308.method2129(arg0, class116.field1888, class319.field4965, 1252946087);
            int var6 = class308.method2129(arg3, class116.field1888, class319.field4965, 1252946087);
            class137.method1052(arg1, var5, var6, (byte) -115, arg2);
        }
        if (arg4 <= 59) {
            field2277 = false;
        }
        field2275++;
    }

    @OriginalMember(owner = "client!um", name = "f", descriptor = "(I)V", line = 28)
    public static final void method1097(int arg0) {
        class45.field769.method282(0);
        class34.field572 = null;
        field2276++;
        if (arg0 != 100) {
            method1098(true, -51, 122, 125, 64, 12, false);
        }
        class326.field5060 = 1;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZIIIIIZ)V", line = 45)
    public static final void method1098(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg0) {
            class265.method1883();
        }
        field2273++;
        if (class52.field823 != null && (arg2 != 3 || class107.field1786 != arg1 || class247.field3825 != arg5)) {
            class157.method1180(false, class52.field823, class83.field1235);
            class52.field823 = null;
        }
        if (arg2 == 3 && class52.field823 == null) {
            class52.field823 = class294.method2069(true, class83.field1235, 0, arg5, 0, arg1);
            if (class52.field823 != null) {
                class107.field1786 = arg1;
                class247.field3825 = arg5;
                class41.method334(class83.field1235, true);
            }
        }
        if (arg2 == 3 && class52.field823 == null) {
            method1098(true, -1, class54.field860, -1, arg4, -1, true);
            return;
        }
        Container var7;
        if (class52.field823 != null) {
            var7 = class52.field823;
        } else if (class81.field1219 == null) {
            var7 = class83.field1235.field5052;
        } else {
            var7 = class81.field1219;
        }
        class64.field1053 = var7.getSize().width;
        class297.field4686 = var7.getSize().height;
        if (class81.field1219 == var7) {
            Insets var8 = class81.field1219.getInsets();
            class297.field4686 -= var8.top + var8.bottom;
            class64.field1053 -= var8.right + var8.left;
        }
        if (arg2 < 2) {
            class180.field2880 = 765;
            class107.field1778 = (class64.field1053 - 765) / 2;
            class73.field1127 = 503;
            class121.field1938 = 0;
        } else {
            class73.field1127 = class297.field4686;
            class107.field1778 = 0;
            class121.field1938 = 0;
            class180.field2880 = class64.field1053;
        }
        if (arg6) {
            class311.method2150(13134, class2.field7);
            class306.method2119(class2.field7, arg3 - 9888);
            if (class185.field2941 != null) {
                class185.field2941.method671(class2.field7, (byte) -64);
            }
            class114.field1866.method2189(arg3 ^ 0xA87F301C);
            class147.method1143(class2.field7, 98);
            class173.method1281(false, class2.field7);
            if (class185.field2941 != null) {
                class185.field2941.method667(class2.field7, arg3 ^ 0xFFFFFFFE);
            }
        } else {
            if (class265.field4126) {
                class265.method1882(class180.field2880, class73.field1127);
            }
            class2.field7.setSize(class180.field2880, class73.field1127);
            if (class81.field1219 == var7) {
                Insets var9 = class81.field1219.getInsets();
                class2.field7.setLocation(class107.field1778 + var9.left, class121.field1938 + var9.top);
            } else {
                class2.field7.setLocation(class107.field1778, class121.field1938);
            }
        }
        if (~arg2 == arg3 && arg4 > 0) {
            class265.method1915(class2.field7);
        }
        if (arg0 && arg2 > 0) {
            class2.field7.setIgnoreRepaint(true);
            if (!class14.field267) {
                class29.method192();
                class222.field3556 = null;
                class222.field3556 = class70.method541(-1, class73.field1127, class2.field7, class180.field2880);
                class182.method1351();
                if (class22.field394 == 5) {
                    class176.method1315(true, class95.field1558, true);
                } else {
                    class17.method144((byte) 63, class64.field1015, false);
                }
                try {
                    Graphics var10 = class2.field7.getGraphics();
                    class222.field3556.method1216(0, 0, arg3 + 1, var10);
                } catch (Exception var14) {
                }
                class136.method1040(8529);
                if (arg4 == 0) {
                    class222.field3556 = class70.method541(-1, 503, class2.field7, 765);
                } else {
                    class222.field3556 = null;
                }
                class21 var12 = class83.field1235.method2223(class114.field1866.getClass(), 103);
                while (var12.field387 == 0) {
                    class279.method1991(94, 100L);
                }
                if (var12.field387 == 1) {
                    class14.field267 = true;
                }
            }
            if (class14.field267) {
                class265.method1886(class2.field7, class141.field2240 * 2);
            }
        }
        if (!class265.field4126 && arg2 > 0) {
            method1098(true, -1, 0, -1, arg4, -1, true);
            return;
        }
        if (arg2 > 0 && arg4 == 0) {
            class89.field1400.setPriority(5);
            class222.field3556 = null;
            class146.method1131();
            ((class203) class174.field2734).method1470(200, ~arg3);
            if (class302.field4753) {
                class174.method1290(0.7F);
            }
            class169.method1231(29307);
        } else if (arg2 == 0 && arg4 > 0) {
            class89.field1400.setPriority(1);
            class222.field3556 = class70.method541(-1, 503, class2.field7, 765);
            class146.method1125();
            class47.method371();
            ((class203) class174.field2734).method1470(20, 0);
            if (class302.field4753) {
                if (class329.field5093 == 1) {
                    class174.method1290(0.9F);
                }
                if (class329.field5093 == 2) {
                    class174.method1290(0.8F);
                }
                if (class329.field5093 == 3) {
                    class174.method1290(0.7F);
                }
                if (class329.field5093 == 4) {
                    class174.method1290(0.6F);
                }
            }
            class186.method1401();
            class169.method1231(29307);
        }
        class42.field751 = !class34.method248(-110);
        if (arg0) {
            class170.method1238((byte) 26);
        }
        if (arg2 < 2) {
            class29.field476 = false;
        } else {
            class29.field476 = true;
        }
        if (class122.field1950 != -1) {
            class67.method508(true, 1);
        }
        if (class127.field2032 != null && (class22.field394 == 30 || class22.field394 == 25)) {
            class134.method1010(arg3 + 1);
        }
        for (int var13 = 0; var13 < 100; var13++) {
            class30.field502[var13] = true;
        }
        class28.field459 = true;
    }

    @OriginalMember(owner = "client!um", name = "g", descriptor = "(I)V", line = 278)
    public static void method1099(int arg0) {
        field2279 = null;
        field2278 = (byte[][]) null;
        field2268 = null;
        field2280 = null;
        if (arg0 >= -38) {
            field2277 = false;
        }
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V", line = 297)
    public class145() {
        super(1, true);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ILpe;I)V", line = 302)
    public final void method65(int arg0, class101 arg1, int arg2) {
        if (arg0 != -4004) {
            method1097(-2);
        }
        if (arg2 == 0) {
            this.field2272 = arg1.method731(false);
        }
        field2267++;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(II)[I", line = 316)
    public final int[] method67(int arg0, int arg1) {
        if (arg0 != -3) {
            field2279 = (int[]) null;
        }
        field2281++;
        int[] var3 = this.field4763.method394(0, arg1);
        if (this.field4763.field863) {
            int[] var4 = this.method2107(arg1 - 1 & class12.field240, 0, 0);
            int[] var5 = this.method2107(arg1, arg0 ^ 0xFFFFFFFD, 0);
            int[] var6 = this.method2107(class12.field240 & arg1 + 1, 0, 0);
            for (int var7 = 0; var7 < class70.field1108; var7++) {
                int var8 = (var6[var7] - var4[var7]) * this.field2272;
                int var9 = var8 >> 12;
                int var10 = (var5[var7 + 1 & class40.field724] - var5[var7 - 1 & class40.field724]) * this.field2272;
                int var11 = var10 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var9 * var9 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZI)Z", line = 370)
    public static final boolean method1100(boolean arg0, int arg1) {
        class157.field2494 = arg0;
        class247.field3822 = arg1 + 1 & 0xFFFF;
        field2274++;
        return true;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZB)V", line = 385)
    public static final void method1101(boolean arg0, byte arg1) {
        class139.field2215 = new int[104];
        class115.field1886 = new int[104];
        class92.field1522 = 99;
        class179.field2863 = new int[104];
        class263.field4071 = new int[104];
        field2270++;
        class87.field1337 = new int[104];
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class295.field4667 = new byte[var2][105][105];
        class151.field2426 = new int[var2][105][105];
        if (arg1 == 20) {
            class74.field1136 = new byte[var2][104][104];
            class100.field1647 = new byte[var2][104][104];
            class193.field3069 = new byte[var2][104][104];
            class294.field4640 = new byte[var2][104][104];
        }
    }
}

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class195 implements MouseListener, MouseMotionListener, FocusListener {

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public static int field3119 = 7759444;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    public static int field3127 = 0;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "[Lbg;")
    public static class203[] field3129;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "[[[B")
    public static byte[][][] field3115;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIILjava/awt/Component;)Ljd;", line = 4)
    public static final class140 method1303(int arg0, int arg1, int arg2, Component arg3) {
        field3118++;
        try {
            if (arg0 == 23229) {
                Class var4 = Class.forName("ga");
                class140 var5 = (class140) var4.getDeclaredConstructor().newInstance();
                var5.method122(arg3, arg2, 2, arg1);
                return var5;
            } else {
                return (class140) null;
            }
        } catch (Throwable var8) {
            class117 var7 = new class117();
            var7.method122(arg3, arg2, 2, arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ei", name = "mouseExited", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 27)
    public final synchronized void mouseExited(MouseEvent arg0) {
        if (class91.field1268 != null) {
            class162.field2569 = 0;
            class317.field5498 = -1;
            class28.field486 = -1;
        }
        field3124++;
    }

    @OriginalMember(owner = "client!ei", name = "mouseReleased", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 47)
    public final synchronized void mouseReleased(MouseEvent arg0) {
        if (class91.field1268 != null) {
            class162.field2569 = 0;
            class85.field1198 = 0;
            int var2 = arg0.getModifiers();
            if ((var2 & 0x4) == 0) {
            }
            if ((var2 & 0x10) != 0) {
            }
            if ((var2 & 0x8) != 0) {
            }
        }
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3133++;
    }

    @OriginalMember(owner = "client!ei", name = "mouseMoved", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 80)
    public final synchronized void mouseMoved(MouseEvent arg0) {
        if (class91.field1268 != null) {
            class162.field2569 = 0;
            class317.field5498 = arg0.getX();
            class28.field486 = arg0.getY();
        }
        field3121++;
    }

    @OriginalMember(owner = "client!ei", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 100)
    public final void focusGained(FocusEvent arg0) {
        field3128++;
    }

    @OriginalMember(owner = "client!ei", name = "mouseClicked", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 108)
    public final void mouseClicked(MouseEvent arg0) {
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
        field3117++;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lan;IB)V", line = 120)
    public static final void method1304(class320 arg0, int arg1, byte arg2) {
        field3125++;
        Object[] var3 = arg0.field5581;
        int var4 = (Integer) var3[0];
        class150 var5 = class282.method1911(124, var4);
        if (var5 == null) {
            return;
        }
        class9.field115 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = var5.field2339;
        int[] var9 = var5.field2340;
        int var10 = -1;
        byte var11 = -1;
        try {
            class245.field4121 = new class152[var5.field2337];
            class135.field2078 = new int[var5.field2325];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var15 = (Integer) var3[var14];
                    if (var15 == -2147483647) {
                        var15 = arg0.field5586;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg0.field5582;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg0.field5569 == null ? -1 : arg0.field5569.field1868;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg0.field5577;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg0.field5569 == null ? -1 : arg0.field5569.field1934;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg0.field5572 == null ? -1 : arg0.field5572.field1868;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg0.field5572 == null ? -1 : arg0.field5572.field1934;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg0.field5575;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg0.field5570;
                    }
                    class135.field2078[var12++] = var15;
                } else if (var3[var14] instanceof class152) {
                    class152 var16 = (class152) var3[var14];
                    if (var16.method992(23292, class304.field5225)) {
                        var16 = arg0.field5578;
                    }
                    class245.field4121[var13++] = var16;
                }
            }
            int var17 = 0;
            label4297: while (true) {
                var17++;
                if (var17 > arg1) {
                    throw new RuntimeException("slow");
                }
                var10++;
                int var509 = var9[var10];
                if (var509 < 100) {
                    if (var509 == 0) {
                        class265.field4478[var7++] = var8[var10];
                        continue;
                    }
                    if (var509 == 1) {
                        int var18 = var8[var10];
                        class265.field4478[var7++] = class249.field4227[var18];
                        continue;
                    }
                    if (var509 == 2) {
                        int var19 = var8[var10];
                        var7--;
                        class175.method1168(class265.field4478[var7], 38, var19);
                        continue;
                    }
                    if (var509 == 3) {
                        class284.field4832[var6++] = var5.field2332[var10];
                        continue;
                    }
                    if (var509 == 6) {
                        var10 += var8[var10];
                        continue;
                    }
                    if (var509 == 7) {
                        var7 -= 2;
                        if (class265.field4478[var7 + 1] != class265.field4478[var7]) {
                            var10 += var8[var10];
                        }
                        continue;
                    }
                    if (var509 == 8) {
                        var7 -= 2;
                        if (class265.field4478[var7 + 1] == class265.field4478[var7]) {
                            var10 += var8[var10];
                        }
                        continue;
                    }
                    if (var509 == 9) {
                        var7 -= 2;
                        if (class265.field4478[var7 + 1] > class265.field4478[var7]) {
                            var10 += var8[var10];
                        }
                        continue;
                    }
                    if (var509 == 10) {
                        var7 -= 2;
                        if (class265.field4478[var7] > class265.field4478[var7 + 1]) {
                            var10 += var8[var10];
                        }
                        continue;
                    }
                    if (var509 == 21) {
                        if (class9.field115 == 0) {
                            return;
                        }
                        class160 var20 = class308.field5289[--class9.field115];
                        class135.field2078 = var20.field2550;
                        var10 = var20.field2549;
                        var5 = var20.field2558;
                        var8 = var5.field2339;
                        var9 = var5.field2340;
                        class245.field4121 = var20.field2557;
                        continue;
                    }
                    if (var509 == 25) {
                        int var21 = var8[var10];
                        class265.field4478[var7++] = class295.method2035(var21, false);
                        continue;
                    }
                    if (var509 == 27) {
                        int var22 = var8[var10];
                        var7--;
                        class85.method558(class265.field4478[var7], var22, -22134);
                        continue;
                    }
                    if (var509 == 31) {
                        var7 -= 2;
                        if (class265.field4478[var7] <= class265.field4478[var7 + 1]) {
                            var10 += var8[var10];
                        }
                        continue;
                    }
                    if (var509 == 32) {
                        var7 -= 2;
                        if (class265.field4478[var7] >= class265.field4478[var7 + 1]) {
                            var10 += var8[var10];
                        }
                        continue;
                    }
                    if (var509 == 33) {
                        class265.field4478[var7++] = class135.field2078[var8[var10]];
                        continue;
                    }
                    int var10001;
                    if (var509 == 34) {
                        var10001 = var8[var10];
                        var7--;
                        class135.field2078[var10001] = class265.field4478[var7];
                        continue;
                    }
                    if (var509 == 35) {
                        class284.field4832[var6++] = class245.field4121[var8[var10]];
                        continue;
                    }
                    if (var509 == 36) {
                        var10001 = var8[var10];
                        var6--;
                        class245.field4121[var10001] = class284.field4832[var6];
                        continue;
                    }
                    if (var509 == 37) {
                        int var23 = var8[var10];
                        var6 -= var23;
                        class152 var24 = class272.method1874(255, class284.field4832, var23, var6);
                        class284.field4832[var6++] = var24;
                        continue;
                    }
                    if (var509 == 38) {
                        var7--;
                        continue;
                    }
                    if (var509 == 39) {
                        var6--;
                        continue;
                    }
                    if (var509 == 40) {
                        int var25 = var8[var10];
                        class150 var26 = class282.method1911(120, var25);
                        int[] var27 = new int[var26.field2325];
                        class152[] var28 = new class152[var26.field2337];
                        for (int var29 = 0; var29 < var26.field2341; var29++) {
                            var27[var29] = class265.field4478[var7 - (var26.field2341 - var29)];
                        }
                        for (int var30 = 0; var30 < var26.field2338; var30++) {
                            var28[var30] = class284.field4832[var6 + var30 - var26.field2338];
                        }
                        var7 -= var26.field2341;
                        var6 -= var26.field2338;
                        class160 var31 = new class160();
                        var31.field2557 = class245.field4121;
                        var31.field2558 = var5;
                        var31.field2550 = class135.field2078;
                        var31.field2549 = var10;
                        if (class308.field5289.length <= class9.field115) {
                            throw new RuntimeException();
                        }
                        var10 = -1;
                        var5 = var26;
                        class308.field5289[class9.field115++] = var31;
                        var8 = var26.field2339;
                        class245.field4121 = var28;
                        var9 = var26.field2340;
                        class135.field2078 = var27;
                        continue;
                    }
                    if (var509 == 42) {
                        class265.field4478[var7++] = class211.field3426[var8[var10]];
                        continue;
                    }
                    if (var509 == 43) {
                        int var32 = var8[var10];
                        var7--;
                        class211.field3426[var32] = class265.field4478[var7];
                        class203.method1343(var32, -1167351037);
                        continue;
                    }
                    if (var509 == 44) {
                        int var33 = var8[var10] & 0xFFFF;
                        var7--;
                        int var34 = class265.field4478[var7];
                        int var35 = var8[var10] >> 16;
                        if (var34 >= 0 && var34 <= 5000) {
                            class314.field5448[var35] = var34;
                            byte var36 = -1;
                            if (var33 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var34 <= var37) {
                                    continue label4297;
                                }
                                class150.field2334[var35][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var509 == 45) {
                        var7--;
                        int var38 = class265.field4478[var7];
                        int var39 = var8[var10];
                        if (var38 >= 0 && class314.field5448[var39] > var38) {
                            class265.field4478[var7++] = class150.field2334[var39][var38];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var509 == 46) {
                        var7 -= 2;
                        int var40 = var8[var10];
                        int var41 = class265.field4478[var7];
                        if (var41 >= 0 && var41 < class314.field5448[var40]) {
                            class150.field2334[var40][var41] = class265.field4478[var7 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var509 == 47) {
                        class152 var42 = class236.field3864[var8[var10]];
                        if (var42 == null) {
                            var42 = class85.field1195;
                        }
                        class284.field4832[var6++] = var42;
                        continue;
                    }
                    if (var509 == 48) {
                        int var43 = var8[var10];
                        var6--;
                        class236.field3864[var43] = class284.field4832[var6];
                        class238.method1632(-3841, var43);
                        continue;
                    }
                    if (var509 == 51) {
                        class231 var44 = var5.field2336[var8[var10]];
                        var7--;
                        class114 var45 = (class114) var44.method1586((long) class265.field4478[var7], -126);
                        if (var45 != null) {
                            var10 += var45.field1616;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var8[var10] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var509 < 300) {
                    if (var509 == 100) {
                        var7 -= 3;
                        int var47 = class265.field4478[var7 + 2];
                        int var48 = class265.field4478[var7 + 1];
                        int var49 = class265.field4478[var7];
                        if (var48 != 0) {
                            class127 var50 = class11.method54(false, var49);
                            if (var50.field1937 == null) {
                                var50.field1937 = new class127[var47 + 1];
                            }
                            if (var50.field1937.length <= var47) {
                                class127[] var51 = new class127[var47 + 1];
                                for (int var52 = 0; var52 < var50.field1937.length; var52++) {
                                    var51[var52] = var50.field1937[var52];
                                }
                                var50.field1937 = var51;
                            }
                            if (var47 > 0 && var50.field1937[var47 - 1] == null) {
                                throw new RuntimeException("Gap at:" + (var47 - 1));
                            }
                            class127 var53 = new class127();
                            var53.field1794 = true;
                            var53.field1902 = var48;
                            var53.field1934 = var47;
                            var53.field1836 = var53.field1868 = var50.field1868;
                            var50.field1937[var47] = var53;
                            if (var46) {
                                class295.field5052 = var53;
                            } else {
                                class316.field5488 = var53;
                            }
                            class272.method1868(22889, var50);
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var509 == 101) {
                        class127 var54 = var46 ? class295.field5052 : class316.field5488;
                        if (var54.field1934 == -1) {
                            if (var46) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class127 var55 = class11.method54(false, var54.field1868);
                        var55.field1937[var54.field1934] = null;
                        class272.method1868(22889, var55);
                        continue;
                    }
                    if (var509 == 102) {
                        var7--;
                        class127 var56 = class11.method54(false, class265.field4478[var7]);
                        var56.field1937 = null;
                        class272.method1868(22889, var56);
                        continue;
                    }
                    if (var509 == 200) {
                        var7 -= 2;
                        int var57 = class265.field4478[var7 + 1];
                        int var58 = class265.field4478[var7];
                        class127 var59 = class132.method837(var57, var58, 0);
                        if (var59 != null && var57 != -1) {
                            class265.field4478[var7++] = 1;
                            if (var46) {
                                class295.field5052 = var59;
                            } else {
                                class316.field5488 = var59;
                            }
                            continue;
                        }
                        class265.field4478[var7++] = 0;
                        continue;
                    }
                    if (var509 == 201) {
                        var7--;
                        int var60 = class265.field4478[var7];
                        class127 var61 = class11.method54(false, var60);
                        if (var61 == null) {
                            class265.field4478[var7++] = 0;
                        } else {
                            class265.field4478[var7++] = 1;
                            if (var46) {
                                class295.field5052 = var61;
                            } else {
                                class316.field5488 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var509 < 500) {
                    if (var509 == 403) {
                        var7 -= 2;
                        int var62 = class265.field4478[var7 + 1];
                        int var63 = class265.field4478[var7];
                        for (int var64 = 0; var64 < class325.field5668.length; var64++) {
                            if (class325.field5668[var64] == var63) {
                                class85.field1176.field177.method1554(var62, var64, false);
                                continue label4297;
                            }
                        }
                        int var65 = 0;
                        while (true) {
                            if (var65 >= class281.field4798.length) {
                                continue label4297;
                            }
                            if (class281.field4798[var65] == var63) {
                                class85.field1176.field177.method1554(var62, var65, false);
                                continue label4297;
                            }
                            var65++;
                        }
                    }
                    if (var509 == 404) {
                        var7 -= 2;
                        int var66 = class265.field4478[var7];
                        int var67 = class265.field4478[var7 + 1];
                        class85.field1176.field177.method1567(var66, var67, (byte) -128);
                        continue;
                    }
                    if (var509 == 410) {
                        var7--;
                        boolean var68 = class265.field4478[var7] != 0;
                        class85.field1176.field177.method1564(101, var68);
                        continue;
                    }
                } else if (var509 >= 1000 && var509 < 1100 || var509 >= 2000 && var509 < 2100) {
                    class127 var69;
                    if (var509 < 2000) {
                        var69 = var46 ? class295.field5052 : class316.field5488;
                    } else {
                        var7--;
                        var69 = class11.method54(false, class265.field4478[var7]);
                        var509 -= 1000;
                    }
                    if (var509 == 1000) {
                        var7 -= 4;
                        var69.field1927 = class265.field4478[var7];
                        var69.field1851 = class265.field4478[var7 + 1];
                        int var70 = class265.field4478[var7 + 2];
                        int var71 = class265.field4478[var7 + 3];
                        if (var71 < 0) {
                            var71 = 0;
                        } else if (var71 > 5) {
                            var71 = 5;
                        }
                        var69.field1838 = (byte) var71;
                        if (var70 < 0) {
                            var70 = 0;
                        } else if (var70 > 5) {
                            var70 = 5;
                        }
                        var69.field1857 = (byte) var70;
                        class272.method1868(22889, var69);
                        class320.method2255(var69, (byte) -122);
                        if (var69.field1934 == -1) {
                            class287.method1933(false, var69.field1868);
                        }
                        continue;
                    }
                    if (var509 == 1001) {
                        var7 -= 4;
                        var69.field1879 = class265.field4478[var7];
                        var69.field1802 = class265.field4478[var7 + 1];
                        var69.field1822 = 0;
                        var69.field1907 = 0;
                        int var72 = class265.field4478[var7 + 3];
                        if (var72 < 0) {
                            var72 = 0;
                        } else if (var72 > 4) {
                            var72 = 4;
                        }
                        int var73 = class265.field4478[var7 + 2];
                        var69.field1910 = (byte) var72;
                        if (var73 < 0) {
                            var73 = 0;
                        } else if (var73 > 4) {
                            var73 = 4;
                        }
                        var69.field1839 = (byte) var73;
                        class272.method1868(22889, var69);
                        class320.method2255(var69, (byte) -99);
                        if (var69.field1902 == 0) {
                            class193.method1288(124, false, var69);
                        }
                        continue;
                    }
                    if (var509 == 1003) {
                        var7--;
                        boolean var74 = class265.field4478[var7] == 1;
                        if (var69.field1870 != var74) {
                            var69.field1870 = var74;
                            class272.method1868(22889, var69);
                        }
                        if (var69.field1934 == -1) {
                            class62.method404((byte) 126, var69.field1868);
                        }
                        continue;
                    }
                    if (var509 == 1004) {
                        var7 -= 2;
                        var69.field1866 = class265.field4478[var7];
                        var69.field1786 = class265.field4478[var7 + 1];
                        class272.method1868(22889, var69);
                        class320.method2255(var69, (byte) -127);
                        if (var69.field1902 == 0) {
                            class193.method1288(124, false, var69);
                        }
                        continue;
                    }
                    if (var509 == 1005) {
                        var7--;
                        var69.field1816 = class265.field4478[var7] == 1;
                        continue;
                    }
                } else if (!(var509 < 1100 || var509 >= 1200) || !(var509 < 2100 || var509 >= 2200)) {
                    class127 var500;
                    if (var509 < 2000) {
                        var500 = var46 ? class295.field5052 : class316.field5488;
                    } else {
                        var509 -= 1000;
                        var7--;
                        var500 = class11.method54(false, class265.field4478[var7]);
                    }
                    if (var509 == 1100) {
                        var7 -= 2;
                        var500.field1891 = class265.field4478[var7];
                        if (var500.field1875 - var500.field1876 < var500.field1891) {
                            var500.field1891 = var500.field1875 - var500.field1876;
                        }
                        if (var500.field1891 < 0) {
                            var500.field1891 = 0;
                        }
                        var500.field1852 = class265.field4478[var7 + 1];
                        if (var500.field1852 > var500.field1915 - var500.field1921) {
                            var500.field1852 = var500.field1915 - var500.field1921;
                        }
                        if (var500.field1852 < 0) {
                            var500.field1852 = 0;
                        }
                        class272.method1868(22889, var500);
                        if (var500.field1934 == -1) {
                            class147.method924(var500.field1868, (byte) 127);
                        }
                        continue;
                    }
                    if (var509 == 1101) {
                        var7--;
                        var500.field1856 = class265.field4478[var7];
                        class272.method1868(22889, var500);
                        if (var500.field1934 == -1) {
                            class228.method1570((byte) -51, var500.field1868);
                        }
                        continue;
                    }
                    if (var509 == 1102) {
                        var7--;
                        var500.field1829 = class265.field4478[var7] == 1;
                        class272.method1868(22889, var500);
                        continue;
                    }
                    if (var509 == 1103) {
                        var7--;
                        var500.field1880 = class265.field4478[var7];
                        class272.method1868(22889, var500);
                        continue;
                    }
                    if (var509 == 1104) {
                        var7--;
                        var500.field1884 = class265.field4478[var7];
                        class272.method1868(22889, var500);
                        continue;
                    }
                    if (var509 == 1105) {
                        var7--;
                        var500.field1944 = class265.field4478[var7];
                        class272.method1868(22889, var500);
                        continue;
                    }
                    if (var509 == 1106) {
                        var7--;
                        var500.field1844 = class265.field4478[var7];
                        class272.method1868(22889, var500);
                        continue;
                    }
                    if (var509 == 1107) {
                        var7--;
                        var500.field1895 = class265.field4478[var7] == 1;
                        class272.method1868(22889, var500);
                        continue;
                    }
                    if (var509 == 1108) {
                        var500.field1899 = 1;
                        var7--;
                        var500.field1900 = class265.field4478[var7];
                        class272.method1868(22889, var500);
                        if (var500.field1934 == -1) {
                            class91.method595(29, var500.field1868);
                        }
                        continue;
                    }
                    if (var509 == 1109) {
                        var7 -= 6;
                        var500.field1823 = class265.field4478[var7];
                        var500.field1782 = class265.field4478[var7 + 1];
                        var500.field1820 = class265.field4478[var7 + 2];
                        var500.field1813 = class265.field4478[var7 + 3];
                        var500.field1790 = class265.field4478[var7 + 4];
                        var500.field1861 = class265.field4478[var7 + 5];
                        class272.method1868(22889, var500);
                        if (var500.field1934 == -1) {
                            class113.method759((byte) 33, var500.field1868);
                            class186.method1236(0, var500.field1868);
                        }
                        continue;
                    }
                    if (var509 == 1110) {
                        var7--;
                        int var501 = class265.field4478[var7];
                        if (var500.field1943 != var501) {
                            var500.field1795 = 0;
                            var500.field1800 = 0;
                            var500.field1943 = var501;
                            var500.field1874 = 1;
                            class272.method1868(22889, var500);
                        }
                        if (var500.field1934 == -1) {
                            class189.method1257((byte) 106, var500.field1868);
                        }
                        continue;
                    }
                    if (var509 == 1111) {
                        var7--;
                        var500.field1862 = class265.field4478[var7] == 1;
                        class272.method1868(22889, var500);
                        continue;
                    }
                    if (var509 == 1112) {
                        var6--;
                        class152 var502 = class284.field4832[var6];
                        if (!var502.method992(23292, var500.field1912)) {
                            var500.field1912 = var502;
                            class272.method1868(22889, var500);
                        }
                        if (var500.field1934 == -1) {
                            class16.method105(3, var500.field1868);
                        }
                        continue;
                    }
                    if (var509 == 1113) {
                        var7--;
                        var500.field1845 = class265.field4478[var7];
                        class272.method1868(22889, var500);
                        continue;
                    }
                    if (var509 == 1114) {
                        var7 -= 3;
                        var500.field1859 = class265.field4478[var7];
                        var500.field1897 = class265.field4478[var7 + 1];
                        var500.field1826 = class265.field4478[var7 + 2];
                        class272.method1868(22889, var500);
                        continue;
                    }
                    if (var509 == 1115) {
                        var7--;
                        var500.field1905 = class265.field4478[var7] == 1;
                        class272.method1868(22889, var500);
                        continue;
                    }
                    if (var509 == 1116) {
                        var7--;
                        var500.field1848 = class265.field4478[var7];
                        class272.method1868(22889, var500);
                        continue;
                    }
                    if (var509 == 1117) {
                        var7--;
                        var500.field1770 = class265.field4478[var7];
                        class272.method1868(22889, var500);
                        continue;
                    }
                    if (var509 == 1118) {
                        var7--;
                        var500.field1947 = class265.field4478[var7] == 1;
                        class272.method1868(22889, var500);
                        continue;
                    }
                    if (var509 == 1119) {
                        var7--;
                        var500.field1804 = class265.field4478[var7] == 1;
                        class272.method1868(22889, var500);
                        continue;
                    }
                    if (var509 == 1120) {
                        var7 -= 2;
                        var500.field1875 = class265.field4478[var7];
                        var500.field1915 = class265.field4478[var7 + 1];
                        class272.method1868(22889, var500);
                        if (var500.field1902 == 0) {
                            class193.method1288(125, false, var500);
                        }
                        continue;
                    }
                    if (var509 == 1121) {
                        var7 -= 2;
                        var500.field1793 = (short) class265.field4478[var7];
                        var500.field1896 = (short) class265.field4478[var7 + 1];
                        class272.method1868(22889, var500);
                        continue;
                    }
                    if (var509 == 1122) {
                        var7--;
                        var500.field1827 = class265.field4478[var7] == 1;
                        class272.method1868(22889, var500);
                        continue;
                    }
                    if (var509 == 1123) {
                        var7--;
                        var500.field1861 = class265.field4478[var7];
                        class272.method1868(22889, var500);
                        if (var500.field1934 == -1) {
                            class113.method759((byte) 33, var500.field1868);
                        }
                        continue;
                    }
                } else if (var509 >= 1200 && var509 < 1300 || var509 >= 2200 && var509 < 2300) {
                    class127 var496;
                    if (var509 >= 2000) {
                        var509 -= 1000;
                        var7--;
                        var496 = class11.method54(false, class265.field4478[var7]);
                    } else {
                        var496 = var46 ? class295.field5052 : class316.field5488;
                    }
                    class272.method1868(22889, var496);
                    if (var509 == 1200 || var509 == 1205) {
                        var7 -= 2;
                        int var497 = class265.field4478[var7];
                        int var498 = class265.field4478[var7 + 1];
                        if (var496.field1934 == -1) {
                            class58.method379(true, var496.field1868);
                            class113.method759((byte) 33, var496.field1868);
                            class186.method1236(0, var496.field1868);
                        }
                        if (var497 == -1) {
                            var496.field1911 = -1;
                            var496.field1900 = -1;
                            var496.field1899 = 1;
                        } else {
                            var496.field1885 = var498;
                            var496.field1911 = var497;
                            class312 var499 = class189.method1253((byte) 118, var497);
                            var496.field1790 = var499.field5405;
                            var496.field1861 = var499.field5376;
                            var496.field1823 = var499.field5389;
                            var496.field1820 = var499.field5369;
                            if (var509 == 1205) {
                                var496.field1779 = false;
                            } else {
                                var496.field1779 = true;
                            }
                            var496.field1813 = var499.field5408;
                            if (var496.field1822 > 0) {
                                var496.field1861 = var496.field1861 * 32 / var496.field1822;
                            } else if (var496.field1879 > 0) {
                                var496.field1861 = var496.field1861 * 32 / var496.field1879;
                            }
                            var496.field1782 = var499.field5410;
                        }
                        continue;
                    }
                    if (var509 == 1201) {
                        var496.field1899 = 2;
                        var7--;
                        var496.field1900 = class265.field4478[var7];
                        if (var496.field1934 == -1) {
                            class91.method595(74, var496.field1868);
                        }
                        continue;
                    }
                    if (var509 == 1202) {
                        var496.field1899 = 3;
                        var496.field1900 = class85.field1176.field177.method1563(4);
                        if (var496.field1934 == -1) {
                            class91.method595(75, var496.field1868);
                        }
                        continue;
                    }
                    if (var509 == 1203) {
                        var496.field1899 = 6;
                        var7--;
                        var496.field1900 = class265.field4478[var7];
                        if (var496.field1934 == -1) {
                            class91.method595(-126, var496.field1868);
                        }
                        continue;
                    }
                    if (var509 == 1204) {
                        var496.field1899 = 5;
                        var7--;
                        var496.field1900 = class265.field4478[var7];
                        if (var496.field1934 == -1) {
                            class91.method595(81, var496.field1868);
                        }
                        continue;
                    }
                } else if (var509 >= 1300 && var509 < 1400 || var509 >= 2300 && var509 < 2400) {
                    class127 var490;
                    if (var509 >= 2000) {
                        var7--;
                        var490 = class11.method54(false, class265.field4478[var7]);
                        var509 -= 1000;
                    } else {
                        var490 = var46 ? class295.field5052 : class316.field5488;
                    }
                    if (var509 == 1300) {
                        var7--;
                        int var491 = class265.field4478[var7] - 1;
                        if (var491 >= 0 && var491 <= 9) {
                            var6--;
                            var490.method809(125, class284.field4832[var6], var491);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var509 == 1301) {
                        var7 -= 2;
                        int var492 = class265.field4478[var7];
                        int var493 = class265.field4478[var7 + 1];
                        var490.field1808 = class132.method837(var493, var492, 0);
                        continue;
                    }
                    if (var509 == 1302) {
                        var7--;
                        var490.field1832 = class265.field4478[var7] == 1;
                        continue;
                    }
                    if (var509 == 1303) {
                        var7--;
                        var490.field1850 = class265.field4478[var7];
                        continue;
                    }
                    if (var509 == 1304) {
                        var7--;
                        var490.field1846 = class265.field4478[var7];
                        continue;
                    }
                    if (var509 == 1305) {
                        var6--;
                        var490.field1801 = class284.field4832[var6];
                        continue;
                    }
                    if (var509 == 1306) {
                        var6--;
                        var490.field1796 = class284.field4832[var6];
                        continue;
                    }
                    if (var509 == 1307) {
                        var490.field1918 = null;
                        continue;
                    }
                    if (var509 == 1308) {
                        var7--;
                        var490.field1872 = class265.field4478[var7];
                        var7--;
                        var490.field1772 = class265.field4478[var7];
                        continue;
                    }
                    if (var509 == 1309) {
                        var7--;
                        int var494 = class265.field4478[var7];
                        var7--;
                        int var495 = class265.field4478[var7];
                        if (var495 >= 1 && var495 <= 10) {
                            var490.method812(var495 - 1, (byte) -126, var494);
                        }
                        continue;
                    }
                } else {
                    if (var509 >= 1400 && var509 < 1500 || var509 >= 2400 && var509 < 2500) {
                        class127 var483;
                        if (var509 < 2000) {
                            var483 = var46 ? class295.field5052 : class316.field5488;
                        } else {
                            var7--;
                            var483 = class11.method54(false, class265.field4478[var7]);
                            var509 -= 1000;
                        }
                        var6--;
                        class152 var484 = class284.field4832[var6];
                        int[] var485 = null;
                        if (var484.method1000(0) > 0 && var484.method1002(-12637, var484.method1000(0) - 1) == 89) {
                            var7--;
                            int var486 = class265.field4478[var7];
                            if (var486 > 0) {
                                var485 = new int[var486];
                                while ((var486--) > 0) {
                                    var7--;
                                    var485[var486] = class265.field4478[var7];
                                }
                            }
                            var484 = var484.method1015(0, 19197, var484.method1000(0) - 1);
                        }
                        Object[] var487 = new Object[var484.method1000(0) + 1];
                        for (int var488 = var487.length - 1; var488 >= 1; var488--) {
                            if (var484.method1002(-12637, var488 - 1) == 115) {
                                var6--;
                                var487[var488] = class284.field4832[var6];
                            } else {
                                var7--;
                                var487[var488] = Integer.valueOf(class265.field4478[var7]);
                            }
                        }
                        var7--;
                        int var489 = class265.field4478[var7];
                        if (var489 == -1) {
                            var487 = null;
                        } else {
                            var487[0] = Integer.valueOf(var489);
                        }
                        if (var509 == 1400) {
                            var483.field1771 = var487;
                        } else if (var509 == 1401) {
                            var483.field1774 = var487;
                        } else if (var509 == 1402) {
                            var483.field1883 = var487;
                        } else if (var509 == 1403) {
                            var483.field1936 = var487;
                        } else if (var509 == 1404) {
                            var483.field1906 = var487;
                        } else if (var509 == 1405) {
                            var483.field1867 = var487;
                        } else if (var509 == 1406) {
                            var483.field1926 = var487;
                        } else if (var509 == 1407) {
                            var483.field1886 = var485;
                            var483.field1930 = var487;
                        } else if (var509 == 1408) {
                            var483.field1908 = var487;
                        } else if (var509 == 1409) {
                            var483.field1928 = var487;
                        } else if (var509 == 1410) {
                            var483.field1792 = var487;
                        } else if (var509 == 1411) {
                            var483.field1775 = var487;
                        } else if (var509 == 1412) {
                            var483.field1777 = var487;
                        } else if (var509 == 1414) {
                            var483.field1916 = var487;
                            var483.field1901 = var485;
                        } else if (var509 == 1415) {
                            var483.field1835 = var487;
                            var483.field1864 = var485;
                        } else if (var509 == 1416) {
                            var483.field1803 = var487;
                        } else if (var509 == 1417) {
                            var483.field1843 = var487;
                        } else if (var509 == 1418) {
                            var483.field1871 = var487;
                        } else if (var509 == 1419) {
                            var483.field1807 = var487;
                        } else if (var509 == 1420) {
                            var483.field1849 = var487;
                        } else if (var509 == 1421) {
                            var483.field1853 = var487;
                        } else if (var509 == 1422) {
                            var483.field1855 = var487;
                        } else if (var509 == 1423) {
                            var483.field1815 = var487;
                        } else if (var509 == 1424) {
                            var483.field1935 = var487;
                        } else if (var509 == 1425) {
                            var483.field1841 = var487;
                        } else if (var509 == 1426) {
                            var483.field1781 = var487;
                        } else if (var509 == 1427) {
                            var483.field1890 = var487;
                        } else if (var509 == 1428) {
                            var483.field1922 = var485;
                            var483.field1817 = var487;
                        } else if (var509 == 1429) {
                            var483.field1940 = var485;
                            var483.field1821 = var487;
                        }
                        var483.field1806 = true;
                        continue;
                    }
                    if (var509 < 1600) {
                        class127 var482 = var46 ? class295.field5052 : class316.field5488;
                        if (var509 == 1500) {
                            class265.field4478[var7++] = var482.field1924;
                            continue;
                        }
                        if (var509 == 1501) {
                            class265.field4478[var7++] = var482.field1828;
                            continue;
                        }
                        if (var509 == 1502) {
                            class265.field4478[var7++] = var482.field1876;
                            continue;
                        }
                        if (var509 == 1503) {
                            class265.field4478[var7++] = var482.field1921;
                            continue;
                        }
                        if (var509 == 1504) {
                            class265.field4478[var7++] = var482.field1870 ? 1 : 0;
                            continue;
                        }
                        if (var509 == 1505) {
                            class265.field4478[var7++] = var482.field1836;
                            continue;
                        }
                    } else if (var509 < 1700) {
                        class127 var75 = var46 ? class295.field5052 : class316.field5488;
                        if (var509 == 1600) {
                            class265.field4478[var7++] = var75.field1891;
                            continue;
                        }
                        if (var509 == 1601) {
                            class265.field4478[var7++] = var75.field1852;
                            continue;
                        }
                        if (var509 == 1602) {
                            class284.field4832[var6++] = var75.field1912;
                            continue;
                        }
                        if (var509 == 1603) {
                            class265.field4478[var7++] = var75.field1875;
                            continue;
                        }
                        if (var509 == 1604) {
                            class265.field4478[var7++] = var75.field1915;
                            continue;
                        }
                        if (var509 == 1605) {
                            class265.field4478[var7++] = var75.field1861;
                            continue;
                        }
                        if (var509 == 1606) {
                            class265.field4478[var7++] = var75.field1820;
                            continue;
                        }
                        if (var509 == 1607) {
                            class265.field4478[var7++] = var75.field1790;
                            continue;
                        }
                        if (var509 == 1608) {
                            class265.field4478[var7++] = var75.field1813;
                            continue;
                        }
                        if (var509 == 1609) {
                            class265.field4478[var7++] = var75.field1880;
                            continue;
                        }
                        if (var509 == 1610) {
                            class265.field4478[var7++] = var75.field1823;
                            continue;
                        }
                        if (var509 == 1611) {
                            class265.field4478[var7++] = var75.field1782;
                            continue;
                        }
                        if (var509 == 1612) {
                            class265.field4478[var7++] = var75.field1944;
                            continue;
                        }
                    } else if (var509 < 1800) {
                        class127 var76 = var46 ? class295.field5052 : class316.field5488;
                        if (var509 == 1700) {
                            class265.field4478[var7++] = var76.field1911;
                            continue;
                        }
                        if (var509 == 1701) {
                            if (var76.field1911 == -1) {
                                class265.field4478[var7++] = 0;
                            } else {
                                class265.field4478[var7++] = var76.field1885;
                            }
                            continue;
                        }
                        if (var509 == 1702) {
                            class265.field4478[var7++] = var76.field1934;
                            continue;
                        }
                    } else if (var509 < 1900) {
                        class127 var480 = var46 ? class295.field5052 : class316.field5488;
                        if (var509 == 1800) {
                            class265.field4478[var7++] = client.method1759(var480).method545(-124);
                            continue;
                        }
                        if (var509 == 1801) {
                            var7--;
                            int var481 = class265.field4478[var7];
                            int var511 = var481 - 1;
                            if (var480.field1918 != null && var480.field1918.length > var511 && var480.field1918[var511] != null) {
                                class284.field4832[var6++] = var480.field1918[var511];
                                continue;
                            }
                            class284.field4832[var6++] = class60.field910;
                            continue;
                        }
                        if (var509 == 1802) {
                            if (var480.field1801 == null) {
                                class284.field4832[var6++] = class60.field910;
                            } else {
                                class284.field4832[var6++] = var480.field1801;
                            }
                            continue;
                        }
                    } else if (var509 < 2600) {
                        var7--;
                        class127 var479 = class11.method54(false, class265.field4478[var7]);
                        if (var509 == 2500) {
                            class265.field4478[var7++] = var479.field1924;
                            continue;
                        }
                        if (var509 == 2501) {
                            class265.field4478[var7++] = var479.field1828;
                            continue;
                        }
                        if (var509 == 2502) {
                            class265.field4478[var7++] = var479.field1876;
                            continue;
                        }
                        if (var509 == 2503) {
                            class265.field4478[var7++] = var479.field1921;
                            continue;
                        }
                        if (var509 == 2504) {
                            class265.field4478[var7++] = var479.field1870 ? 1 : 0;
                            continue;
                        }
                        if (var509 == 2505) {
                            class265.field4478[var7++] = var479.field1836;
                            continue;
                        }
                    } else if (var509 < 2700) {
                        var7--;
                        class127 var77 = class11.method54(false, class265.field4478[var7]);
                        if (var509 == 2600) {
                            class265.field4478[var7++] = var77.field1891;
                            continue;
                        }
                        if (var509 == 2601) {
                            class265.field4478[var7++] = var77.field1852;
                            continue;
                        }
                        if (var509 == 2602) {
                            class284.field4832[var6++] = var77.field1912;
                            continue;
                        }
                        if (var509 == 2603) {
                            class265.field4478[var7++] = var77.field1875;
                            continue;
                        }
                        if (var509 == 2604) {
                            class265.field4478[var7++] = var77.field1915;
                            continue;
                        }
                        if (var509 == 2605) {
                            class265.field4478[var7++] = var77.field1861;
                            continue;
                        }
                        if (var509 == 2606) {
                            class265.field4478[var7++] = var77.field1820;
                            continue;
                        }
                        if (var509 == 2607) {
                            class265.field4478[var7++] = var77.field1790;
                            continue;
                        }
                        if (var509 == 2608) {
                            class265.field4478[var7++] = var77.field1813;
                            continue;
                        }
                        if (var509 == 2609) {
                            class265.field4478[var7++] = var77.field1880;
                            continue;
                        }
                        if (var509 == 2610) {
                            class265.field4478[var7++] = var77.field1823;
                            continue;
                        }
                        if (var509 == 2611) {
                            class265.field4478[var7++] = var77.field1782;
                            continue;
                        }
                        if (var509 == 2612) {
                            class265.field4478[var7++] = var77.field1944;
                            continue;
                        }
                    } else if (var509 < 2800) {
                        if (var509 == 2700) {
                            var7--;
                            class127 var469 = class11.method54(false, class265.field4478[var7]);
                            class265.field4478[var7++] = var469.field1911;
                            continue;
                        }
                        if (var509 == 2701) {
                            var7--;
                            class127 var470 = class11.method54(false, class265.field4478[var7]);
                            if (var470.field1911 == -1) {
                                class265.field4478[var7++] = 0;
                            } else {
                                class265.field4478[var7++] = var470.field1885;
                            }
                            continue;
                        }
                        if (var509 == 2702) {
                            var7--;
                            int var471 = class265.field4478[var7];
                            class122 var472 = (class122) class107.field1519.method1586((long) var471, -67);
                            if (var472 == null) {
                                class265.field4478[var7++] = 0;
                            } else {
                                class265.field4478[var7++] = 1;
                            }
                            continue;
                        }
                        if (var509 == 2703) {
                            var7--;
                            class127 var473 = class11.method54(false, class265.field4478[var7]);
                            if (var473.field1937 == null) {
                                class265.field4478[var7++] = 0;
                                continue;
                            }
                            int var474 = var473.field1937.length;
                            for (int var475 = 0; var475 < var473.field1937.length; var475++) {
                                if (var473.field1937[var475] == null) {
                                    var474 = var475;
                                    break;
                                }
                            }
                            class265.field4478[var7++] = var474;
                            continue;
                        }
                        if (var509 == 2704 || var509 == 2705) {
                            var7 -= 2;
                            int var476 = class265.field4478[var7 + 1];
                            int var477 = class265.field4478[var7];
                            class122 var478 = (class122) class107.field1519.method1586((long) var477, -91);
                            if (var478 != null && var478.field1724 == var476) {
                                class265.field4478[var7++] = 1;
                                continue;
                            }
                            class265.field4478[var7++] = 0;
                            continue;
                        }
                    } else if (var509 < 2900) {
                        var7--;
                        class127 var78 = class11.method54(false, class265.field4478[var7]);
                        if (var509 == 2800) {
                            class265.field4478[var7++] = client.method1759(var78).method545(-124);
                            continue;
                        }
                        if (var509 == 2801) {
                            var7--;
                            int var79 = class265.field4478[var7];
                            int var510 = var79 - 1;
                            if (var78.field1918 != null && var510 < var78.field1918.length && var78.field1918[var510] != null) {
                                class284.field4832[var6++] = var78.field1918[var510];
                                continue;
                            }
                            class284.field4832[var6++] = class60.field910;
                            continue;
                        }
                        if (var509 == 2802) {
                            if (var78.field1801 == null) {
                                class284.field4832[var6++] = class60.field910;
                            } else {
                                class284.field4832[var6++] = var78.field1801;
                            }
                            continue;
                        }
                    } else if (var509 < 3200) {
                        if (var509 == 3100) {
                            var6--;
                            class152 var80 = class284.field4832[var6];
                            class245.method1687(class60.field910, 0, var80, -1);
                            continue;
                        }
                        if (var509 == 3101) {
                            var7 -= 2;
                            class121.method782(class265.field4478[var7 + 1], 1644, class265.field4478[var7], class85.field1176);
                            continue;
                        }
                        if (var509 == 3103) {
                            class311.method2154(8);
                            continue;
                        }
                        if (var509 == 3104) {
                            class273.field4686++;
                            var6--;
                            class152 var81 = class284.field4832[var6];
                            int var82 = 0;
                            if (var81.method1004((byte) 110)) {
                                var82 = var81.method998(-103);
                            }
                            class245.field4102.method1065(185, -30);
                            class245.field4102.method1967(var82, -1303690792);
                            continue;
                        }
                        if (var509 == 3105) {
                            class298.field5160++;
                            var6--;
                            class152 var83 = class284.field4832[var6];
                            class245.field4102.method1065(170, -54);
                            class245.field4102.method1988(var83.method1013(-18674), -123);
                            continue;
                        }
                        if (var509 == 3106) {
                            class289.field4908++;
                            var6--;
                            class152 var84 = class284.field4832[var6];
                            class245.field4102.method1065(253, -17);
                            class245.field4102.method1980(false, var84.method1000(0) + 1);
                            class245.field4102.method2015(-21389, var84);
                            continue;
                        }
                        if (var509 == 3107) {
                            var7--;
                            int var85 = class265.field4478[var7];
                            var6--;
                            class152 var86 = class284.field4832[var6];
                            class201.method1336(var86, var85, -114);
                            continue;
                        }
                        if (var509 == 3108) {
                            var7 -= 3;
                            int var87 = class265.field4478[var7];
                            int var88 = class265.field4478[var7 + 1];
                            int var89 = class265.field4478[var7 + 2];
                            class127 var90 = class11.method54(false, var89);
                            class173.method1157(var90, var87, (byte) 106, var88);
                            continue;
                        }
                        if (var509 == 3109) {
                            var7 -= 2;
                            int var91 = class265.field4478[var7];
                            class127 var92 = var46 ? class295.field5052 : class316.field5488;
                            int var93 = class265.field4478[var7 + 1];
                            class173.method1157(var92, var91, (byte) 79, var93);
                            continue;
                        }
                        if (var509 == 3110) {
                            class175.field2805++;
                            var7--;
                            int var94 = class265.field4478[var7];
                            class245.field4102.method1065(45, 124);
                            class245.field4102.method1994(var94, 2921);
                            continue;
                        }
                    } else if (var509 < 3300) {
                        if (var509 == 3200) {
                            var7 -= 3;
                            class125.method795(-30990, class265.field4478[var7 + 1], class265.field4478[var7 + 2], class265.field4478[var7]);
                            continue;
                        }
                        if (var509 == 3201) {
                            var7--;
                            class146.method920((byte) -70, class265.field4478[var7]);
                            continue;
                        }
                        if (var509 == 3202) {
                            var7 -= 2;
                            class316.method2210(class265.field4478[var7], class265.field4478[var7 + 1], (byte) 83);
                            continue;
                        }
                    } else if (var509 < 3400) {
                        if (var509 == 3300) {
                            class265.field4478[var7++] = class142.field2187;
                            continue;
                        }
                        if (var509 == 3301) {
                            var7 -= 2;
                            int var435 = class265.field4478[var7 + 1];
                            int var436 = class265.field4478[var7];
                            class265.field4478[var7++] = class9.method46(var436, -1, var435);
                            continue;
                        }
                        if (var509 == 3302) {
                            var7 -= 2;
                            int var437 = class265.field4478[var7];
                            int var438 = class265.field4478[var7 + 1];
                            class265.field4478[var7++] = class45.method312(var438, var437, (byte) 122);
                            continue;
                        }
                        if (var509 == 3303) {
                            var7 -= 2;
                            int var439 = class265.field4478[var7];
                            int var440 = class265.field4478[var7 + 1];
                            class265.field4478[var7++] = class39.method281(0, var439, var440);
                            continue;
                        }
                        if (var509 == 3304) {
                            var7--;
                            int var441 = class265.field4478[var7];
                            class265.field4478[var7++] = class26.method218(false, var441).field2845;
                            continue;
                        }
                        if (var509 == 3305) {
                            var7--;
                            int var442 = class265.field4478[var7];
                            class265.field4478[var7++] = class280.field4793[var442];
                            continue;
                        }
                        if (var509 == 3306) {
                            var7--;
                            int var443 = class265.field4478[var7];
                            class265.field4478[var7++] = class117.field1652[var443];
                            continue;
                        }
                        if (var509 == 3307) {
                            var7--;
                            int var444 = class265.field4478[var7];
                            class265.field4478[var7++] = class260.field4448[var444];
                            continue;
                        }
                        if (var509 == 3308) {
                            int var445 = class23.field400;
                            int var446 = (class85.field1176.field4162 >> 7) + class272.field4670;
                            int var447 = (class85.field1176.field4231 >> 7) + class199.field3226;
                            class265.field4478[var7++] = (var445 << 28) + (var446 << 14) + var447;
                            continue;
                        }
                        if (var509 == 3309) {
                            var7--;
                            int var448 = class265.field4478[var7];
                            class265.field4478[var7++] = class34.method251(16383, var448 >> 14);
                            continue;
                        }
                        if (var509 == 3310) {
                            var7--;
                            int var449 = class265.field4478[var7];
                            class265.field4478[var7++] = var449 >> 28;
                            continue;
                        }
                        if (var509 == 3311) {
                            var7--;
                            int var450 = class265.field4478[var7];
                            class265.field4478[var7++] = class34.method251(var450, 16383);
                            continue;
                        }
                        if (var509 == 3312) {
                            class265.field4478[var7++] = class23.field407 ? 1 : 0;
                            continue;
                        }
                        if (var509 == 3313) {
                            var7 -= 2;
                            int var451 = class265.field4478[var7] + 32768;
                            int var452 = class265.field4478[var7 + 1];
                            class265.field4478[var7++] = class9.method46(var451, -1, var452);
                            continue;
                        }
                        if (var509 == 3314) {
                            var7 -= 2;
                            int var453 = class265.field4478[var7] + 32768;
                            int var454 = class265.field4478[var7 + 1];
                            class265.field4478[var7++] = class45.method312(var454, var453, (byte) 117);
                            continue;
                        }
                        if (var509 == 3315) {
                            var7 -= 2;
                            int var455 = class265.field4478[var7] + 32768;
                            int var456 = class265.field4478[var7 + 1];
                            class265.field4478[var7++] = class39.method281(0, var455, var456);
                            continue;
                        }
                        if (var509 == 3316) {
                            if (class148.field2263 < 2) {
                                class265.field4478[var7++] = 0;
                            } else {
                                class265.field4478[var7++] = class148.field2263;
                            }
                            continue;
                        }
                        if (var509 == 3317) {
                            class265.field4478[var7++] = class270.field4622;
                            continue;
                        }
                        if (var509 == 3318) {
                            class265.field4478[var7++] = class314.field5443;
                            continue;
                        }
                        if (var509 == 3321) {
                            class265.field4478[var7++] = class94.field1338;
                            continue;
                        }
                        if (var509 == 3322) {
                            class265.field4478[var7++] = class265.field4475;
                            continue;
                        }
                        if (var509 == 3323) {
                            if (class49.field771 >= 5 && class49.field771 <= 9) {
                                class265.field4478[var7++] = 1;
                                continue;
                            }
                            class265.field4478[var7++] = 0;
                            continue;
                        }
                        if (var509 == 3324) {
                            if (class49.field771 >= 5 && class49.field771 <= 9) {
                                class265.field4478[var7++] = class49.field771;
                                continue;
                            }
                            class265.field4478[var7++] = 0;
                            continue;
                        }
                        if (var509 == 3325) {
                            class265.field4478[var7++] = class27.field458 ? 1 : 0;
                            continue;
                        }
                        if (var509 == 3326) {
                            class265.field4478[var7++] = class85.field1176.field179;
                            continue;
                        }
                        if (var509 == 3327) {
                            class265.field4478[var7++] = class85.field1176.field177.field3679 ? 1 : 0;
                            continue;
                        }
                        if (var509 == 3328) {
                            class265.field4478[var7++] = class252.field4348 && !class277.field4735 ? 1 : 0;
                            continue;
                        }
                        if (var509 == 3329) {
                            class265.field4478[var7++] = class205.field3346 ? 1 : 0;
                            continue;
                        }
                        if (var509 == 3330) {
                            var7--;
                            int var457 = class265.field4478[var7];
                            class265.field4478[var7++] = class265.method1820(-27, var457);
                            continue;
                        }
                        if (var509 == 3331) {
                            var7 -= 2;
                            int var458 = class265.field4478[var7 + 1];
                            int var459 = class265.field4478[var7];
                            class265.field4478[var7++] = class316.method2212(var459, false, var458, (byte) 24);
                            continue;
                        }
                        if (var509 == 3332) {
                            var7 -= 2;
                            int var460 = class265.field4478[var7];
                            int var461 = class265.field4478[var7 + 1];
                            class265.field4478[var7++] = class316.method2212(var460, true, var461, (byte) 24);
                            continue;
                        }
                        if (var509 == 3333) {
                            class265.field4478[var7++] = class90.field1265;
                            continue;
                        }
                        if (var509 == 3335) {
                            class265.field4478[var7++] = class222.field3622;
                            continue;
                        }
                        if (var509 == 3336) {
                            var7 -= 4;
                            int var462 = class265.field4478[var7];
                            int var463 = class265.field4478[var7 + 2];
                            int var464 = class265.field4478[var7 + 3];
                            int var465 = class265.field4478[var7 + 1];
                            int var466 = (var465 << 14) + var462;
                            int var467 = (var463 << 28) + var466;
                            int var468 = var464 + var467;
                            class265.field4478[var7++] = var468;
                            continue;
                        }
                        if (var509 == 3337) {
                            class265.field4478[var7++] = class45.field726;
                            continue;
                        }
                    } else if (var509 < 3500) {
                        if (var509 == 3400) {
                            var7 -= 2;
                            int var418 = class265.field4478[var7 + 1];
                            int var419 = class265.field4478[var7];
                            class193 var420 = class91.method598(-1, var419);
                            if (var420.field3077 != 115) {
                            }
                            class284.field4832[var6++] = var420.method1287((byte) -8, var418);
                            continue;
                        }
                        if (var509 == 3408) {
                            var7 -= 4;
                            int var421 = class265.field4478[var7];
                            int var422 = class265.field4478[var7 + 1];
                            int var423 = class265.field4478[var7 + 2];
                            int var424 = class265.field4478[var7 + 3];
                            class193 var425 = class91.method598(-1, var423);
                            if (var425.field3056 == var421 && var425.field3077 == var422) {
                                if (var422 == 115) {
                                    class284.field4832[var6++] = var425.method1287((byte) -8, var424);
                                } else {
                                    class265.field4478[var7++] = var425.method1291(64, var424);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var509 == 3409) {
                            var7 -= 3;
                            int var426 = class265.field4478[var7];
                            int var427 = class265.field4478[var7 + 1];
                            int var428 = class265.field4478[var7 + 2];
                            if (var427 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class193 var429 = class91.method598(-1, var427);
                            if (var429.field3077 != var426) {
                                throw new RuntimeException("C3409-1");
                            }
                            class265.field4478[var7++] = var429.method1294(0, var428) ? 1 : 0;
                            continue;
                        }
                        if (var509 == 3410) {
                            var7--;
                            int var430 = class265.field4478[var7];
                            var6--;
                            class152 var431 = class284.field4832[var6];
                            if (var430 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class193 var432 = class91.method598(-1, var430);
                            if (var432.field3077 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class265.field4478[var7++] = var432.method1290(var431, -25) ? 1 : 0;
                            continue;
                        }
                        if (var509 == 3411) {
                            var7--;
                            int var433 = class265.field4478[var7];
                            class193 var434 = class91.method598(-1, var433);
                            class265.field4478[var7++] = var434.field3062.method1582(-18869);
                            continue;
                        }
                    } else if (var509 < 3700) {
                        if (var509 == 3600) {
                            if (class170.field2674 == 0) {
                                class265.field4478[var7++] = -2;
                            } else if (class170.field2674 == 1) {
                                class265.field4478[var7++] = -1;
                            } else {
                                class265.field4478[var7++] = class199.field3206;
                            }
                            continue;
                        }
                        if (var509 == 3601) {
                            var7--;
                            int var396 = class265.field4478[var7];
                            if (class170.field2674 == 2 && class199.field3206 > var396) {
                                class284.field4832[var6++] = class176.field2838[var396];
                                continue;
                            }
                            class284.field4832[var6++] = class60.field910;
                            continue;
                        }
                        if (var509 == 3602) {
                            var7--;
                            int var397 = class265.field4478[var7];
                            if (class170.field2674 == 2 && var397 < class199.field3206) {
                                class265.field4478[var7++] = class179.field2863[var397];
                                continue;
                            }
                            class265.field4478[var7++] = 0;
                            continue;
                        }
                        if (var509 == 3603) {
                            var7--;
                            int var398 = class265.field4478[var7];
                            if (class170.field2674 == 2 && var398 < class199.field3206) {
                                class265.field4478[var7++] = class49.field762[var398];
                                continue;
                            }
                            class265.field4478[var7++] = 0;
                            continue;
                        }
                        if (var509 == 3604) {
                            var6--;
                            class152 var399 = class284.field4832[var6];
                            var7--;
                            int var400 = class265.field4478[var7];
                            class27.method223(var400, (byte) 101, var399);
                            continue;
                        }
                        if (var509 == 3605) {
                            var6--;
                            class152 var401 = class284.field4832[var6];
                            class212.method1429(var401.method1013(-18674), -1);
                            continue;
                        }
                        if (var509 == 3606) {
                            var6--;
                            class152 var402 = class284.field4832[var6];
                            class92.method609((byte) -65, var402.method1013(-18674));
                            continue;
                        }
                        if (var509 == 3607) {
                            var6--;
                            class152 var403 = class284.field4832[var6];
                            class46.method316(true, var403.method1013(-18674));
                            continue;
                        }
                        if (var509 == 3608) {
                            var6--;
                            class152 var404 = class284.field4832[var6];
                            class210.method1413(var404.method1013(-18674), false);
                            continue;
                        }
                        if (var509 == 3609) {
                            var6--;
                            class152 var405 = class284.field4832[var6];
                            if (var405.method977(22394, class215.field3504) || var405.method977(22394, class120.field1693)) {
                                var405 = var405.method983((byte) 88, 7);
                            }
                            class265.field4478[var7++] = class295.method2038(80, var405) ? 1 : 0;
                            continue;
                        }
                        if (var509 == 3610) {
                            var7--;
                            int var406 = class265.field4478[var7];
                            if (class170.field2674 == 2 && var406 < class199.field3206) {
                                class284.field4832[var6++] = class8.field110[var406];
                                continue;
                            }
                            class284.field4832[var6++] = class60.field910;
                            continue;
                        }
                        if (var509 == 3611) {
                            if (class296.field5070 == null) {
                                class284.field4832[var6++] = class60.field910;
                            } else {
                                class284.field4832[var6++] = class296.field5070.method1022(-117);
                            }
                            continue;
                        }
                        if (var509 == 3612) {
                            if (class296.field5070 == null) {
                                class265.field4478[var7++] = 0;
                            } else {
                                class265.field4478[var7++] = class167.field2631;
                            }
                            continue;
                        }
                        if (var509 == 3613) {
                            var7--;
                            int var407 = class265.field4478[var7];
                            if (class296.field5070 != null && class167.field2631 > var407) {
                                class284.field4832[var6++] = class225.field3656[var407].field4487.method1022(-117);
                                continue;
                            }
                            class284.field4832[var6++] = class60.field910;
                            continue;
                        }
                        if (var509 == 3614) {
                            var7--;
                            int var408 = class265.field4478[var7];
                            if (class296.field5070 != null && class167.field2631 > var408) {
                                class265.field4478[var7++] = class225.field3656[var408].field4483;
                                continue;
                            }
                            class265.field4478[var7++] = 0;
                            continue;
                        }
                        if (var509 == 3615) {
                            var7--;
                            int var409 = class265.field4478[var7];
                            if (class296.field5070 != null && var409 < class167.field2631) {
                                class265.field4478[var7++] = class225.field3656[var409].field4486;
                                continue;
                            }
                            class265.field4478[var7++] = 0;
                            continue;
                        }
                        if (var509 == 3616) {
                            class265.field4478[var7++] = class284.field4828;
                            continue;
                        }
                        if (var509 == 3617) {
                            var6--;
                            class152 var410 = class284.field4832[var6];
                            class106.method706((byte) -54, var410);
                            continue;
                        }
                        if (var509 == 3618) {
                            class265.field4478[var7++] = class121.field1711;
                            continue;
                        }
                        if (var509 == 3619) {
                            var6--;
                            class152 var411 = class284.field4832[var6];
                            class174.method1160(-1, var411.method1013(-18674));
                            continue;
                        }
                        if (var509 == 3620) {
                            class230.method1579(5040);
                            continue;
                        }
                        if (var509 == 3621) {
                            if (class170.field2674 == 0) {
                                class265.field4478[var7++] = -1;
                            } else {
                                class265.field4478[var7++] = class299.field5190;
                            }
                            continue;
                        }
                        if (var509 == 3622) {
                            var7--;
                            int var412 = class265.field4478[var7];
                            if (class170.field2674 != 0 && var412 < class299.field5190) {
                                class284.field4832[var6++] = class160.method1077(-90, class11.field133[var412]).method1022(-117);
                                continue;
                            }
                            class284.field4832[var6++] = class60.field910;
                            continue;
                        }
                        if (var509 == 3623) {
                            var6--;
                            class152 var413 = class284.field4832[var6];
                            if (var413.method977(22394, class215.field3504) || var413.method977(22394, class120.field1693)) {
                                var413 = var413.method983((byte) 88, 7);
                            }
                            class265.field4478[var7++] = class98.method662(false, var413) ? 1 : 0;
                            continue;
                        }
                        if (var509 == 3624) {
                            var7--;
                            int var414 = class265.field4478[var7];
                            if (class225.field3656 != null && var414 < class167.field2631 && class225.field3656[var414].field4487.method995(-116, class85.field1176.field146)) {
                                class265.field4478[var7++] = 1;
                                continue;
                            }
                            class265.field4478[var7++] = 0;
                            continue;
                        }
                        if (var509 == 3625) {
                            if (class233.field3818 == null) {
                                class284.field4832[var6++] = class60.field910;
                            } else {
                                class284.field4832[var6++] = class233.field3818.method1022(-117);
                            }
                            continue;
                        }
                        if (var509 == 3626) {
                            var7--;
                            int var415 = class265.field4478[var7];
                            if (class296.field5070 != null && var415 < class167.field2631) {
                                class284.field4832[var6++] = class225.field3656[var415].field4488;
                                continue;
                            }
                            class284.field4832[var6++] = class60.field910;
                            continue;
                        }
                        if (var509 == 3627) {
                            var7--;
                            int var416 = class265.field4478[var7];
                            if (class170.field2674 == 2 && var416 >= 0 && class199.field3206 > var416) {
                                class265.field4478[var7++] = class304.field5234[var416] ? 1 : 0;
                                continue;
                            }
                            class265.field4478[var7++] = 0;
                            continue;
                        }
                        if (var509 == 3628) {
                            var6--;
                            class152 var417 = class284.field4832[var6];
                            if (var417.method977(22394, class215.field3504) || var417.method977(22394, class120.field1693)) {
                                var417 = var417.method983((byte) 88, 7);
                            }
                            class265.field4478[var7++] = class197.method1314(-1, var417);
                            continue;
                        }
                        if (var509 == 3629) {
                            class265.field4478[var7++] = class93.field1321;
                            continue;
                        }
                    } else if (var509 < 4000) {
                        if (var509 == 3903) {
                            var7--;
                            int var382 = class265.field4478[var7];
                            class265.field4478[var7++] = class308.field5287[var382].method1889(-29120);
                            continue;
                        }
                        if (var509 == 3904) {
                            var7--;
                            int var383 = class265.field4478[var7];
                            class265.field4478[var7++] = class308.field5287[var383].field4731;
                            continue;
                        }
                        if (var509 == 3905) {
                            var7--;
                            int var384 = class265.field4478[var7];
                            class265.field4478[var7++] = class308.field5287[var384].field4727;
                            continue;
                        }
                        if (var509 == 3906) {
                            var7--;
                            int var385 = class265.field4478[var7];
                            class265.field4478[var7++] = class308.field5287[var385].field4734;
                            continue;
                        }
                        if (var509 == 3907) {
                            var7--;
                            int var386 = class265.field4478[var7];
                            class265.field4478[var7++] = class308.field5287[var386].field4725;
                            continue;
                        }
                        if (var509 == 3908) {
                            var7--;
                            int var387 = class265.field4478[var7];
                            class265.field4478[var7++] = class308.field5287[var387].field4724;
                            continue;
                        }
                        if (var509 == 3910) {
                            var7--;
                            int var388 = class265.field4478[var7];
                            int var389 = class308.field5287[var388].method1891(-2);
                            class265.field4478[var7++] = var389 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var509 == 3911) {
                            var7--;
                            int var390 = class265.field4478[var7];
                            int var391 = class308.field5287[var390].method1891(-2);
                            class265.field4478[var7++] = var391 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var509 == 3912) {
                            var7--;
                            int var392 = class265.field4478[var7];
                            int var393 = class308.field5287[var392].method1891(-2);
                            class265.field4478[var7++] = var393 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var509 == 3913) {
                            var7--;
                            int var394 = class265.field4478[var7];
                            int var395 = class308.field5287[var394].method1891(-2);
                            class265.field4478[var7++] = var395 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var509 < 4100) {
                        if (var509 == 4000) {
                            var7 -= 2;
                            int var95 = class265.field4478[var7];
                            int var96 = class265.field4478[var7 + 1];
                            class265.field4478[var7++] = var95 + var96;
                            continue;
                        }
                        if (var509 == 4001) {
                            var7 -= 2;
                            int var97 = class265.field4478[var7 + 1];
                            int var98 = class265.field4478[var7];
                            class265.field4478[var7++] = var98 - var97;
                            continue;
                        }
                        if (var509 == 4002) {
                            var7 -= 2;
                            int var99 = class265.field4478[var7 + 1];
                            int var100 = class265.field4478[var7];
                            class265.field4478[var7++] = var99 * var100;
                            continue;
                        }
                        if (var509 == 4003) {
                            var7 -= 2;
                            int var101 = class265.field4478[var7];
                            int var102 = class265.field4478[var7 + 1];
                            class265.field4478[var7++] = var101 / var102;
                            continue;
                        }
                        if (var509 == 4004) {
                            var7--;
                            int var103 = class265.field4478[var7];
                            class265.field4478[var7++] = (int) ((double) var103 * Math.random());
                            continue;
                        }
                        if (var509 == 4005) {
                            var7--;
                            int var104 = class265.field4478[var7];
                            class265.field4478[var7++] = (int) ((double) (var104 + 1) * Math.random());
                            continue;
                        }
                        if (var509 == 4006) {
                            var7 -= 5;
                            int var105 = class265.field4478[var7];
                            int var106 = class265.field4478[var7 + 1];
                            int var107 = class265.field4478[var7 + 2];
                            int var108 = class265.field4478[var7 + 3];
                            int var109 = class265.field4478[var7 + 4];
                            class265.field4478[var7++] = var105 + ((var106 - var105) * (var109 - var107) / (var108 - var107));
                            continue;
                        }
                        if (var509 == 4007) {
                            var7 -= 2;
                            long var110 = (long) class265.field4478[var7 + 1];
                            long var112 = (long) class265.field4478[var7];
                            class265.field4478[var7++] = (int) (var112 + (var110 * var112 / 100L));
                            continue;
                        }
                        if (var509 == 4008) {
                            var7 -= 2;
                            int var114 = class265.field4478[var7];
                            int var115 = class265.field4478[var7 + 1];
                            class265.field4478[var7++] = class72.method493(0x1 << var115, var114);
                            continue;
                        }
                        if (var509 == 4009) {
                            var7 -= 2;
                            int var116 = class265.field4478[var7];
                            int var117 = class265.field4478[var7 + 1];
                            class265.field4478[var7++] = class34.method251(var116, -(0x1 << var117) - 1);
                            continue;
                        }
                        if (var509 == 4010) {
                            var7 -= 2;
                            int var118 = class265.field4478[var7];
                            int var119 = class265.field4478[var7 + 1];
                            class265.field4478[var7++] = class34.method251(var118, 0x1 << var119) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var509 == 4011) {
                            var7 -= 2;
                            int var120 = class265.field4478[var7 + 1];
                            int var121 = class265.field4478[var7];
                            class265.field4478[var7++] = var121 % var120;
                            continue;
                        }
                        if (var509 == 4012) {
                            var7 -= 2;
                            int var122 = class265.field4478[var7];
                            int var123 = class265.field4478[var7 + 1];
                            if (var122 == 0) {
                                class265.field4478[var7++] = 0;
                            } else {
                                class265.field4478[var7++] = (int) Math.pow((double) var122, (double) var123);
                            }
                            continue;
                        }
                        if (var509 == 4013) {
                            var7 -= 2;
                            int var124 = class265.field4478[var7 + 1];
                            int var125 = class265.field4478[var7];
                            if (var125 == 0) {
                                class265.field4478[var7++] = 0;
                            } else if (var124 == 0) {
                                class265.field4478[var7++] = Integer.MAX_VALUE;
                            } else {
                                class265.field4478[var7++] = (int) Math.pow((double) var125, 1.0D / (double) var124);
                            }
                            continue;
                        }
                        if (var509 == 4014) {
                            var7 -= 2;
                            int var126 = class265.field4478[var7];
                            int var127 = class265.field4478[var7 + 1];
                            class265.field4478[var7++] = class34.method251(var126, var127);
                            continue;
                        }
                        if (var509 == 4015) {
                            var7 -= 2;
                            int var128 = class265.field4478[var7];
                            int var129 = class265.field4478[var7 + 1];
                            class265.field4478[var7++] = class72.method493(var129, var128);
                            continue;
                        }
                        if (var509 == 4016) {
                            var7 -= 2;
                            int var130 = class265.field4478[var7];
                            int var131 = class265.field4478[var7 + 1];
                            class265.field4478[var7++] = var131 > var130 ? var130 : var131;
                            continue;
                        }
                        if (var509 == 4017) {
                            var7 -= 2;
                            int var132 = class265.field4478[var7];
                            int var133 = class265.field4478[var7 + 1];
                            class265.field4478[var7++] = var133 >= var132 ? var133 : var132;
                            continue;
                        }
                        if (var509 == 4018) {
                            var7 -= 3;
                            long var134 = (long) class265.field4478[var7 + 1];
                            long var136 = (long) class265.field4478[var7];
                            long var138 = (long) class265.field4478[var7 + 2];
                            class265.field4478[var7++] = (int) (var136 * var138 / var134);
                            continue;
                        }
                    } else if (var509 < 4200) {
                        if (var509 == 4100) {
                            var6--;
                            class152 var140 = class284.field4832[var6];
                            var7--;
                            int var141 = class265.field4478[var7];
                            class284.field4832[var6++] = method1307(new class152[] { var140, class38.method280(88, var141) }, (byte) 29);
                            continue;
                        }
                        if (var509 == 4101) {
                            var6 -= 2;
                            class152 var142 = class284.field4832[var6];
                            class152 var143 = class284.field4832[var6 + 1];
                            class284.field4832[var6++] = method1307(new class152[] { var142, var143 }, (byte) 29);
                            continue;
                        }
                        if (var509 == 4102) {
                            var6--;
                            class152 var144 = class284.field4832[var6];
                            var7--;
                            int var145 = class265.field4478[var7];
                            class284.field4832[var6++] = method1307(new class152[] { var144, class175.method1169(var145, true, true) }, (byte) 29);
                            continue;
                        }
                        if (var509 == 4103) {
                            var6--;
                            class152 var146 = class284.field4832[var6];
                            class284.field4832[var6++] = var146.method1023((byte) 49);
                            continue;
                        }
                        if (var509 == 4104) {
                            var7--;
                            int var147 = class265.field4478[var7];
                            long var148 = (long) var147 * 86400000L + 1014768000000L;
                            class267.field4496.setTime(new Date(var148));
                            int var150 = class267.field4496.get(5);
                            int var151 = class267.field4496.get(2);
                            int var152 = class267.field4496.get(1);
                            class284.field4832[var6++] = method1307(new class152[] { class38.method280(71, var150), class41.field658, class228.field3717[var151], class41.field658, class38.method280(94, var152) }, (byte) 29);
                            continue;
                        }
                        if (var509 == 4105) {
                            var6 -= 2;
                            class152 var153 = class284.field4832[var6];
                            class152 var154 = class284.field4832[var6 + 1];
                            if (class85.field1176.field177 != null && class85.field1176.field177.field3679) {
                                class284.field4832[var6++] = var154;
                                continue;
                            }
                            class284.field4832[var6++] = var153;
                            continue;
                        }
                        if (var509 == 4106) {
                            var7--;
                            int var155 = class265.field4478[var7];
                            class284.field4832[var6++] = class38.method280(107, var155);
                            continue;
                        }
                        if (var509 == 4107) {
                            var6 -= 2;
                            class265.field4478[var7++] = class284.field4832[var6].method1005(255, class284.field4832[var6 + 1]);
                            continue;
                        }
                        if (var509 == 4108) {
                            var7 -= 2;
                            var6--;
                            class152 var156 = class284.field4832[var6];
                            int var157 = class265.field4478[var7];
                            int var158 = class265.field4478[var7 + 1];
                            class265.field4478[var7++] = class310.method2149(var158, -7919).method1136(var156, var157);
                            continue;
                        }
                        if (var509 == 4109) {
                            var7 -= 2;
                            var6--;
                            class152 var159 = class284.field4832[var6];
                            int var160 = class265.field4478[var7];
                            int var161 = class265.field4478[var7 + 1];
                            class265.field4478[var7++] = class310.method2149(var161, -7919).method1141(var159, var160);
                            continue;
                        }
                        if (var509 == 4110) {
                            var6 -= 2;
                            class152 var162 = class284.field4832[var6];
                            class152 var163 = class284.field4832[var6 + 1];
                            var7--;
                            if (class265.field4478[var7] == 1) {
                                class284.field4832[var6++] = var162;
                            } else {
                                class284.field4832[var6++] = var163;
                            }
                            continue;
                        }
                        if (var509 == 4111) {
                            var6--;
                            class152 var164 = class284.field4832[var6];
                            class284.field4832[var6++] = class171.method1142(var164);
                            continue;
                        }
                        if (var509 == 4112) {
                            var7--;
                            int var165 = class265.field4478[var7];
                            var6--;
                            class152 var166 = class284.field4832[var6];
                            if (var165 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class284.field4832[var6++] = var166.method1020(var165, 123);
                            continue;
                        }
                        if (var509 == 4113) {
                            var7--;
                            int var167 = class265.field4478[var7];
                            class265.field4478[var7++] = class11.method57(var167, -152) ? 1 : 0;
                            continue;
                        }
                        if (var509 == 4114) {
                            var7--;
                            int var168 = class265.field4478[var7];
                            class265.field4478[var7++] = class39.method283(var168, true) ? 1 : 0;
                            continue;
                        }
                        if (var509 == 4115) {
                            var7--;
                            int var169 = class265.field4478[var7];
                            class265.field4478[var7++] = class213.method1443(var169, 1) ? 1 : 0;
                            continue;
                        }
                        if (var509 == 4116) {
                            var7--;
                            int var170 = class265.field4478[var7];
                            class265.field4478[var7++] = class211.method1419(var170, -126) ? 1 : 0;
                            continue;
                        }
                        if (var509 == 4117) {
                            var6--;
                            class152 var171 = class284.field4832[var6];
                            if (var171 == null) {
                                class265.field4478[var7++] = 0;
                            } else {
                                class265.field4478[var7++] = var171.method1000(0);
                            }
                            continue;
                        }
                        if (var509 == 4118) {
                            var7 -= 2;
                            int var172 = class265.field4478[var7];
                            var6--;
                            class152 var173 = class284.field4832[var6];
                            int var174 = class265.field4478[var7 + 1];
                            class284.field4832[var6++] = var173.method1015(var172, 19197, var174);
                            continue;
                        }
                        if (var509 == 4119) {
                            var6--;
                            class152 var175 = class284.field4832[var6];
                            class152 var176 = class97.method652(var175.method1000(0), (byte) -109);
                            boolean var177 = false;
                            for (int var178 = 0; var175.method1000(0) > var178; var178++) {
                                int var179 = var175.method1002(-12637, var178);
                                if (var179 == 60) {
                                    var177 = true;
                                } else if (var179 == 62) {
                                    var177 = false;
                                } else if (!var177) {
                                    var176.method981(var179, (byte) 121);
                                }
                            }
                            var176.method1024(0);
                            class284.field4832[var6++] = var176;
                            continue;
                        }
                        if (var509 == 4120) {
                            var7 -= 2;
                            int var180 = class265.field4478[var7];
                            int var181 = class265.field4478[var7 + 1];
                            var6--;
                            class152 var182 = class284.field4832[var6];
                            class265.field4478[var7++] = var182.method1006(-1, var181, var180);
                            continue;
                        }
                        if (var509 == 4121) {
                            var6 -= 2;
                            class152 var183 = class284.field4832[var6];
                            class152 var184 = class284.field4832[var6 + 1];
                            var7--;
                            int var185 = class265.field4478[var7];
                            class265.field4478[var7++] = var183.method1021(var184, var185, -18410);
                            continue;
                        }
                        if (var509 == 4122) {
                            var7--;
                            int var186 = class265.field4478[var7];
                            class265.field4478[var7++] = class121.method786(var186, 255);
                            continue;
                        }
                        if (var509 == 4123) {
                            var7--;
                            int var187 = class265.field4478[var7];
                            class265.field4478[var7++] = class280.method1907(var187, (byte) -114);
                            continue;
                        }
                        if (var509 == 4124) {
                            var7--;
                            boolean var188 = class265.field4478[var7] != 0;
                            var7--;
                            int var189 = class265.field4478[var7];
                            class284.field4832[var6++] = class101.method676(var188, (byte) -113, 0, class222.field3622, (long) var189);
                            continue;
                        }
                    } else if (var509 < 4300) {
                        if (var509 == 4200) {
                            var7--;
                            int var190 = class265.field4478[var7];
                            class284.field4832[var6++] = class189.method1253((byte) 47, var190).field5393;
                            continue;
                        }
                        if (var509 == 4201) {
                            var7 -= 2;
                            int var191 = class265.field4478[var7 + 1];
                            int var192 = class265.field4478[var7];
                            class312 var193 = class189.method1253((byte) 123, var192);
                            if (var191 >= 1 && var191 <= 5 && var193.field5385[var191 - 1] != null) {
                                class284.field4832[var6++] = var193.field5385[var191 - 1];
                                continue;
                            }
                            class284.field4832[var6++] = class60.field910;
                            continue;
                        }
                        if (var509 == 4202) {
                            var7 -= 2;
                            int var194 = class265.field4478[var7 + 1];
                            int var195 = class265.field4478[var7];
                            class312 var196 = class189.method1253((byte) 72, var195);
                            if (var194 >= 1 && var194 <= 5 && var196.field5400[var194 - 1] != null) {
                                class284.field4832[var6++] = var196.field5400[var194 - 1];
                                continue;
                            }
                            class284.field4832[var6++] = class60.field910;
                            continue;
                        }
                        if (var509 == 4203) {
                            var7--;
                            int var197 = class265.field4478[var7];
                            class265.field4478[var7++] = class189.method1253((byte) 120, var197).field5403;
                            continue;
                        }
                        if (var509 == 4204) {
                            var7--;
                            int var198 = class265.field4478[var7];
                            class265.field4478[var7++] = class189.method1253((byte) 55, var198).field5375 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var509 == 4205) {
                            var7--;
                            int var199 = class265.field4478[var7];
                            class312 var200 = class189.method1253((byte) 101, var199);
                            if (var200.field5349 == -1 && var200.field5348 >= 0) {
                                class265.field4478[var7++] = var200.field5348;
                                continue;
                            }
                            class265.field4478[var7++] = var199;
                            continue;
                        }
                        if (var509 == 4206) {
                            var7--;
                            int var201 = class265.field4478[var7];
                            class312 var202 = class189.method1253((byte) 109, var201);
                            if (var202.field5349 >= 0 && var202.field5348 >= 0) {
                                class265.field4478[var7++] = var202.field5348;
                                continue;
                            }
                            class265.field4478[var7++] = var201;
                            continue;
                        }
                        if (var509 == 4207) {
                            var7--;
                            int var203 = class265.field4478[var7];
                            class265.field4478[var7++] = class189.method1253((byte) 61, var203).field5351 ? 1 : 0;
                            continue;
                        }
                        if (var509 == 4208) {
                            var7 -= 2;
                            int var204 = class265.field4478[var7 + 1];
                            int var205 = class265.field4478[var7];
                            class45 var206 = class162.method1088(var204, (byte) 123);
                            if (var206.method307(124)) {
                                class284.field4832[var6++] = class189.method1253((byte) 82, var205).method2167(768, var206.field715, var204);
                            } else {
                                class265.field4478[var7++] = class189.method1253((byte) 96, var205).method2178((byte) -35, var206.field720, var204);
                            }
                            continue;
                        }
                        if (var509 == 4210) {
                            var6--;
                            class152 var207 = class284.field4832[var6];
                            var7--;
                            int var208 = class265.field4478[var7];
                            class183.method1222(var208 == 1, 16, var207);
                            class265.field4478[var7++] = class114.field1623;
                            continue;
                        }
                        if (var509 == 4211) {
                            if (client.field4356 != null && class114.field1623 > class280.field4782) {
                                class265.field4478[var7++] = class34.method251(client.field4356[class280.field4782++], 65535);
                                continue;
                            }
                            class265.field4478[var7++] = -1;
                            continue;
                        }
                        if (var509 == 4212) {
                            class280.field4782 = 0;
                            continue;
                        }
                    } else if (var509 >= 4400) {
                        if (var509 < 4500) {
                            if (var509 == 4400) {
                                var7 -= 2;
                                int var209 = class265.field4478[var7];
                                int var210 = class265.field4478[var7 + 1];
                                class45 var211 = class162.method1088(var210, (byte) 119);
                                if (var211.method307(126)) {
                                    class284.field4832[var6++] = class242.method1656(var209, true).method1855(-25802, var211.field715, var210);
                                } else {
                                    class265.field4478[var7++] = class242.method1656(var209, true).method1853(var211.field720, (byte) 102, var210);
                                }
                                continue;
                            }
                        } else if (var509 < 4600) {
                            if (var509 == 4500) {
                                var7 -= 2;
                                int var212 = class265.field4478[var7];
                                int var213 = class265.field4478[var7 + 1];
                                class45 var214 = class162.method1088(var213, (byte) 116);
                                if (var214.method307(125)) {
                                    class284.field4832[var6++] = class93.method613(var212, 94).method2286((byte) 74, var213, var214.field715);
                                } else {
                                    class265.field4478[var7++] = class93.method613(var212, 74).method2288(30291, var213, var214.field720);
                                }
                                continue;
                            }
                        } else if (var509 < 5100) {
                            if (var509 == 5000) {
                                class265.field4478[var7++] = class62.field938;
                                continue;
                            }
                            if (var509 == 5001) {
                                class199.field3221++;
                                var7 -= 3;
                                class62.field938 = class265.field4478[var7];
                                class157.field2512 = class265.field4478[var7 + 1];
                                class28.field487 = class265.field4478[var7 + 2];
                                class245.field4102.method1065(240, 123);
                                class245.field4102.method1980(false, class62.field938);
                                class245.field4102.method1980(false, class157.field2512);
                                class245.field4102.method1980(false, class28.field487);
                                continue;
                            }
                            if (var509 == 5002) {
                                var7 -= 2;
                                var6--;
                                class152 var215 = class284.field4832[var6];
                                int var216 = class265.field4478[var7 + 1];
                                class94.field1341++;
                                int var217 = class265.field4478[var7];
                                class245.field4102.method1065(48, -119);
                                class245.field4102.method1988(var215.method1013(-18674), -53);
                                class245.field4102.method1980(false, var217 - 1);
                                class245.field4102.method1980(false, var216);
                                continue;
                            }
                            if (var509 == 5003) {
                                var7--;
                                int var218 = class265.field4478[var7];
                                class152 var219 = null;
                                if (var218 < 100) {
                                    var219 = class83.field1152[var218];
                                }
                                if (var219 == null) {
                                    var219 = class60.field910;
                                }
                                class284.field4832[var6++] = var219;
                                continue;
                            }
                            if (var509 == 5004) {
                                var7--;
                                int var220 = class265.field4478[var7];
                                int var221 = -1;
                                if (var220 < 100 && class83.field1152[var220] != null) {
                                    var221 = class310.field5305[var220];
                                }
                                class265.field4478[var7++] = var221;
                                continue;
                            }
                            if (var509 == 5005) {
                                class265.field4478[var7++] = class157.field2512;
                                continue;
                            }
                            if (var509 == 5008) {
                                var6--;
                                class152 var222 = class284.field4832[var6];
                                if (var222.method977(22394, class140.field2138)) {
                                    class94.method620((byte) -120, var222);
                                    continue;
                                }
                                if (class148.field2263 == 0 && (class252.field4348 && !class277.field4735 || class205.field3346)) {
                                    continue;
                                }
                                class152 var223 = var222.method1023((byte) 95);
                                class113.field1609++;
                                byte var224 = 0;
                                if (var223.method977(22394, class143.field2210)) {
                                    var224 = 0;
                                    var222 = var222.method983((byte) 88, class143.field2210.method1000(0));
                                } else if (var223.method977(22394, class202.field3255)) {
                                    var224 = 1;
                                    var222 = var222.method983((byte) 88, class202.field3255.method1000(0));
                                } else if (var223.method977(22394, class81.field1143)) {
                                    var224 = 2;
                                    var222 = var222.method983((byte) 88, class81.field1143.method1000(0));
                                } else if (var223.method977(22394, class167.field2628)) {
                                    var222 = var222.method983((byte) 88, class167.field2628.method1000(0));
                                    var224 = 3;
                                } else if (var223.method977(22394, class116.field1634)) {
                                    var224 = 4;
                                    var222 = var222.method983((byte) 88, class116.field1634.method1000(0));
                                } else if (var223.method977(22394, class170.field2673)) {
                                    var224 = 5;
                                    var222 = var222.method983((byte) 88, class170.field2673.method1000(0));
                                } else if (var223.method977(22394, class26.field447)) {
                                    var224 = 6;
                                    var222 = var222.method983((byte) 88, class26.field447.method1000(0));
                                } else if (var223.method977(22394, class44.field706)) {
                                    var222 = var222.method983((byte) 88, class44.field706.method1000(0));
                                    var224 = 7;
                                } else if (var223.method977(22394, class15.field204)) {
                                    var222 = var222.method983((byte) 88, class15.field204.method1000(0));
                                    var224 = 8;
                                } else if (var223.method977(22394, class61.field920)) {
                                    var224 = 9;
                                    var222 = var222.method983((byte) 88, class61.field920.method1000(0));
                                } else if (var223.method977(22394, class16.field227)) {
                                    var224 = 10;
                                    var222 = var222.method983((byte) 88, class16.field227.method1000(0));
                                } else if (var223.method977(22394, class241.field3940)) {
                                    var222 = var222.method983((byte) 88, class241.field3940.method1000(0));
                                    var224 = 11;
                                } else if (class222.field3622 != 0) {
                                    if (var223.method977(22394, class143.field2205)) {
                                        var224 = 0;
                                        var222 = var222.method983((byte) 88, class143.field2205.method1000(0));
                                    } else if (var223.method977(22394, class202.field3265)) {
                                        var222 = var222.method983((byte) 88, class202.field3265.method1000(0));
                                        var224 = 1;
                                    } else if (var223.method977(22394, class81.field1142)) {
                                        var224 = 2;
                                        var222 = var222.method983((byte) 88, class81.field1142.method1000(0));
                                    } else if (var223.method977(22394, class167.field2630)) {
                                        var224 = 3;
                                        var222 = var222.method983((byte) 88, class167.field2630.method1000(0));
                                    } else if (var223.method977(22394, class116.field1628)) {
                                        var222 = var222.method983((byte) 88, class116.field1628.method1000(0));
                                        var224 = 4;
                                    } else if (var223.method977(22394, class170.field2663)) {
                                        var222 = var222.method983((byte) 88, class170.field2663.method1000(0));
                                        var224 = 5;
                                    } else if (var223.method977(22394, class26.field441)) {
                                        var222 = var222.method983((byte) 88, class26.field441.method1000(0));
                                        var224 = 6;
                                    } else if (var223.method977(22394, class44.field699)) {
                                        var222 = var222.method983((byte) 88, class44.field699.method1000(0));
                                        var224 = 7;
                                    } else if (var223.method977(22394, class15.field200)) {
                                        var224 = 8;
                                        var222 = var222.method983((byte) 88, class15.field200.method1000(0));
                                    } else if (var223.method977(22394, class61.field917)) {
                                        var222 = var222.method983((byte) 88, class61.field917.method1000(0));
                                        var224 = 9;
                                    } else if (var223.method977(22394, class16.field214)) {
                                        var222 = var222.method983((byte) 88, class16.field214.method1000(0));
                                        var224 = 10;
                                    } else if (var223.method977(22394, class241.field3943)) {
                                        var222 = var222.method983((byte) 88, class241.field3943.method1000(0));
                                        var224 = 11;
                                    }
                                }
                                byte var225 = 0;
                                class152 var226 = var222.method1023((byte) 50);
                                if (var226.method977(22394, class6.field86)) {
                                    var222 = var222.method983((byte) 88, class6.field86.method1000(0));
                                    var225 = 1;
                                } else if (var226.method977(22394, class73.field1067)) {
                                    var225 = 2;
                                    var222 = var222.method983((byte) 88, class73.field1067.method1000(0));
                                } else if (var226.method977(22394, class206.field3372)) {
                                    var225 = 3;
                                    var222 = var222.method983((byte) 88, class206.field3372.method1000(0));
                                } else if (var226.method977(22394, class232.field3813)) {
                                    var222 = var222.method983((byte) 88, class232.field3813.method1000(0));
                                    var225 = 4;
                                } else if (var226.method977(22394, class321.field5596)) {
                                    var222 = var222.method983((byte) 88, class321.field5596.method1000(0));
                                    var225 = 5;
                                } else if (class222.field3622 != 0) {
                                    if (var226.method977(22394, class6.field99)) {
                                        var225 = 1;
                                        var222 = var222.method983((byte) 88, class6.field99.method1000(0));
                                    } else if (var226.method977(22394, class73.field1069)) {
                                        var222 = var222.method983((byte) 88, class73.field1069.method1000(0));
                                        var225 = 2;
                                    } else if (var226.method977(22394, class206.field3366)) {
                                        var225 = 3;
                                        var222 = var222.method983((byte) 88, class206.field3366.method1000(0));
                                    } else if (var226.method977(22394, class232.field3810)) {
                                        var222 = var222.method983((byte) 88, class232.field3810.method1000(0));
                                        var225 = 4;
                                    } else if (var226.method977(22394, class321.field5595)) {
                                        var222 = var222.method983((byte) 88, class321.field5595.method1000(0));
                                        var225 = 5;
                                    }
                                }
                                class245.field4102.method1065(214, 127);
                                class245.field4102.method1980(false, 0);
                                int var227 = class245.field4102.field4946;
                                class245.field4102.method1980(false, var224);
                                class245.field4102.method1980(false, var225);
                                class219.method1497((byte) -11, class245.field4102, var222);
                                class245.field4102.method2005(class245.field4102.field4946 - var227, (byte) 120);
                                continue;
                            }
                            if (var509 == 5009) {
                                var6 -= 2;
                                class152 var228 = class284.field4832[var6];
                                class152 var229 = class284.field4832[var6 + 1];
                                if (class148.field2263 != 0 || (!class252.field4348 || class277.field4735) && !class205.field3346) {
                                    class30.field517++;
                                    class245.field4102.method1065(132, 126);
                                    class245.field4102.method1980(false, 0);
                                    int var230 = class245.field4102.field4946;
                                    class245.field4102.method1988(var228.method1013(-18674), -52);
                                    class219.method1497((byte) -11, class245.field4102, var229);
                                    class245.field4102.method2005(class245.field4102.field4946 - var230, (byte) 116);
                                }
                                continue;
                            }
                            if (var509 == 5010) {
                                class152 var231 = null;
                                var7--;
                                int var232 = class265.field4478[var7];
                                if (var232 < 100) {
                                    var231 = class83.field1155[var232];
                                }
                                if (var231 == null) {
                                    var231 = class60.field910;
                                }
                                class284.field4832[var6++] = var231;
                                continue;
                            }
                            if (var509 == 5011) {
                                var7--;
                                int var233 = class265.field4478[var7];
                                class152 var234 = null;
                                if (var233 < 100) {
                                    var234 = class64.field971[var233];
                                }
                                if (var234 == null) {
                                    var234 = class60.field910;
                                }
                                class284.field4832[var6++] = var234;
                                continue;
                            }
                            if (var509 == 5012) {
                                int var235 = -1;
                                var7--;
                                int var236 = class265.field4478[var7];
                                if (var236 < 100) {
                                    var235 = class2.field45[var236];
                                }
                                class265.field4478[var7++] = var235;
                                continue;
                            }
                            if (var509 == 5015) {
                                class152 var237;
                                if (class85.field1176 == null || class85.field1176.field146 == null) {
                                    var237 = class201.field3241;
                                } else {
                                    var237 = class85.field1176.method65(false);
                                }
                                class284.field4832[var6++] = var237;
                                continue;
                            }
                            if (var509 == 5016) {
                                class265.field4478[var7++] = class28.field487;
                                continue;
                            }
                            if (var509 == 5017) {
                                class265.field4478[var7++] = class17.field242;
                                continue;
                            }
                            if (var509 == 5050) {
                                var7--;
                                int var238 = class265.field4478[var7];
                                class284.field4832[var6++] = class321.method2262(false, var238).field4414;
                                continue;
                            }
                            if (var509 == 5051) {
                                var7--;
                                int var239 = class265.field4478[var7];
                                class256 var240 = class321.method2262(false, var239);
                                if (var240.field4409 == null) {
                                    class265.field4478[var7++] = 0;
                                } else {
                                    class265.field4478[var7++] = var240.field4409.length;
                                }
                                continue;
                            }
                            if (var509 == 5052) {
                                var7 -= 2;
                                int var241 = class265.field4478[var7];
                                int var242 = class265.field4478[var7 + 1];
                                class256 var243 = class321.method2262(false, var241);
                                int var244 = var243.field4409[var242];
                                class265.field4478[var7++] = var244;
                                continue;
                            }
                            if (var509 == 5053) {
                                var7--;
                                int var245 = class265.field4478[var7];
                                class256 var246 = class321.method2262(false, var245);
                                if (var246.field4412 == null) {
                                    class265.field4478[var7++] = 0;
                                } else {
                                    class265.field4478[var7++] = var246.field4412.length;
                                }
                                continue;
                            }
                            if (var509 == 5054) {
                                var7 -= 2;
                                int var247 = class265.field4478[var7];
                                int var248 = class265.field4478[var7 + 1];
                                class265.field4478[var7++] = class321.method2262(false, var247).field4412[var248];
                                continue;
                            }
                            if (var509 == 5055) {
                                var7--;
                                int var249 = class265.field4478[var7];
                                class284.field4832[var6++] = class22.method177(1, var249).method1049(0);
                                continue;
                            }
                            if (var509 == 5056) {
                                var7--;
                                int var250 = class265.field4478[var7];
                                class157 var251 = class22.method177(1, var250);
                                if (var251.field2497 == null) {
                                    class265.field4478[var7++] = 0;
                                } else {
                                    class265.field4478[var7++] = var251.field2497.length;
                                }
                                continue;
                            }
                            if (var509 == 5057) {
                                var7 -= 2;
                                int var252 = class265.field4478[var7];
                                int var253 = class265.field4478[var7 + 1];
                                class265.field4478[var7++] = class22.method177(1, var252).field2497[var253];
                                continue;
                            }
                            if (var509 == 5058) {
                                class260.field4451 = new class225();
                                var7--;
                                class260.field4451.field3654 = class265.field4478[var7];
                                class260.field4451.field3651 = class22.method177(1, class260.field4451.field3654);
                                class260.field4451.field3652 = new int[class260.field4451.field3651.method1044(-1)];
                                continue;
                            }
                            if (var509 == 5059) {
                                class201.field3238++;
                                class245.field4102.method1065(29, 124);
                                class245.field4102.method1980(false, 0);
                                int var254 = class245.field4102.field4946;
                                class245.field4102.method1980(false, 0);
                                class245.field4102.method1994(class260.field4451.field3654, 2921);
                                class260.field4451.field3651.method1043((byte) 117, class245.field4102, class260.field4451.field3652);
                                class245.field4102.method2005(class245.field4102.field4946 - var254, (byte) 127);
                                continue;
                            }
                            if (var509 == 5060) {
                                var6--;
                                class152 var255 = class284.field4832[var6];
                                class81.field1136++;
                                class245.field4102.method1065(183, -66);
                                class245.field4102.method1980(false, 0);
                                int var256 = class245.field4102.field4946;
                                class245.field4102.method1988(var255.method1013(-18674), 95);
                                class245.field4102.method1994(class260.field4451.field3654, 2921);
                                class260.field4451.field3651.method1043((byte) -123, class245.field4102, class260.field4451.field3652);
                                class245.field4102.method2005(class245.field4102.field4946 - var256, (byte) 125);
                                continue;
                            }
                            if (var509 == 5061) {
                                class245.field4102.method1065(29, -54);
                                class201.field3238++;
                                class245.field4102.method1980(false, 0);
                                int var257 = class245.field4102.field4946;
                                class245.field4102.method1980(false, 1);
                                class245.field4102.method1994(class260.field4451.field3654, 2921);
                                class260.field4451.field3651.method1043((byte) -125, class245.field4102, class260.field4451.field3652);
                                class245.field4102.method2005(class245.field4102.field4946 - var257, (byte) 124);
                                continue;
                            }
                            if (var509 == 5062) {
                                var7 -= 2;
                                int var258 = class265.field4478[var7];
                                int var259 = class265.field4478[var7 + 1];
                                class265.field4478[var7++] = class321.method2262(false, var258).field4417[var259];
                                continue;
                            }
                            if (var509 == 5063) {
                                var7 -= 2;
                                int var260 = class265.field4478[var7 + 1];
                                int var261 = class265.field4478[var7];
                                class265.field4478[var7++] = class321.method2262(false, var261).field4403[var260];
                                continue;
                            }
                            if (var509 == 5064) {
                                var7 -= 2;
                                int var262 = class265.field4478[var7 + 1];
                                int var263 = class265.field4478[var7];
                                if (var262 == -1) {
                                    class265.field4478[var7++] = -1;
                                } else {
                                    class265.field4478[var7++] = class321.method2262(false, var263).method1790(false, var262);
                                }
                                continue;
                            }
                            if (var509 == 5065) {
                                var7 -= 2;
                                int var264 = class265.field4478[var7];
                                int var265 = class265.field4478[var7 + 1];
                                if (var265 == -1) {
                                    class265.field4478[var7++] = -1;
                                } else {
                                    class265.field4478[var7++] = class321.method2262(false, var264).method1791(var265, (byte) 2);
                                }
                                continue;
                            }
                            if (var509 == 5066) {
                                var7--;
                                int var266 = class265.field4478[var7];
                                class265.field4478[var7++] = class22.method177(1, var266).method1044(-1);
                                continue;
                            }
                            if (var509 == 5067) {
                                var7 -= 2;
                                int var267 = class265.field4478[var7];
                                int var268 = class265.field4478[var7 + 1];
                                int var269 = class22.method177(1, var267).method1057((byte) -121, var268);
                                class265.field4478[var7++] = var269;
                                continue;
                            }
                            if (var509 == 5068) {
                                var7 -= 2;
                                int var270 = class265.field4478[var7];
                                int var271 = class265.field4478[var7 + 1];
                                class260.field4451.field3652[var270] = var271;
                                continue;
                            }
                            if (var509 == 5069) {
                                var7 -= 2;
                                int var272 = class265.field4478[var7];
                                int var273 = class265.field4478[var7 + 1];
                                class260.field4451.field3652[var272] = var273;
                                continue;
                            }
                            if (var509 == 5070) {
                                var7 -= 3;
                                int var274 = class265.field4478[var7 + 1];
                                int var275 = class265.field4478[var7];
                                int var276 = class265.field4478[var7 + 2];
                                class157 var277 = class22.method177(1, var275);
                                if (var277.method1057((byte) -126, var274) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class265.field4478[var7++] = var277.method1047(true, var274, var276);
                                continue;
                            }
                            if (var509 == 5071) {
                                var7--;
                                boolean var278 = class265.field4478[var7] == 1;
                                var6--;
                                class152 var279 = class284.field4832[var6];
                                class133.method850(true, var278, var279);
                                class265.field4478[var7++] = class114.field1623;
                                continue;
                            }
                            if (var509 == 5072) {
                                if (client.field4356 != null && class280.field4782 < class114.field1623) {
                                    class265.field4478[var7++] = class34.method251(client.field4356[class280.field4782++], 65535);
                                    continue;
                                }
                                class265.field4478[var7++] = -1;
                                continue;
                            }
                            if (var509 == 5073) {
                                class280.field4782 = 0;
                                continue;
                            }
                        } else if (var509 < 5200) {
                            if (var509 == 5100) {
                                if (class216.field3515[86]) {
                                    class265.field4478[var7++] = 1;
                                } else {
                                    class265.field4478[var7++] = 0;
                                }
                                continue;
                            }
                            if (var509 == 5101) {
                                if (class216.field3515[82]) {
                                    class265.field4478[var7++] = 1;
                                } else {
                                    class265.field4478[var7++] = 0;
                                }
                                continue;
                            }
                            if (var509 == 5102) {
                                if (class216.field3515[81]) {
                                    class265.field4478[var7++] = 1;
                                } else {
                                    class265.field4478[var7++] = 0;
                                }
                                continue;
                            }
                        } else if (var509 < 5300) {
                            if (var509 == 5200) {
                                var7--;
                                class235.method1621(class265.field4478[var7], -101);
                                continue;
                            }
                            if (var509 == 5201) {
                                class265.field4478[var7++] = class283.method1919(50);
                                continue;
                            }
                            if (var509 == 5202) {
                                var7--;
                                class58.method387(125, class265.field4478[var7]);
                                continue;
                            }
                            if (var509 == 5203) {
                                var6--;
                                class204.method1348(4189, class284.field4832[var6]);
                                continue;
                            }
                            if (var509 == 5204) {
                                class284.field4832[var6 - 1] = class230.method1578(class284.field4832[var6 - 1], 1);
                                continue;
                            }
                            if (var509 == 5205) {
                                var6--;
                                class28.method229(111, class284.field4832[var6]);
                                continue;
                            }
                            if (var509 == 5206) {
                                var7--;
                                int var280 = class265.field4478[var7];
                                class311 var281 = class303.method2119(var280 >> 14 & 0x3FFF, var280 & 0x3FFF, false);
                                if (var281 == null) {
                                    class284.field4832[var6++] = class60.field910;
                                } else {
                                    class284.field4832[var6++] = var281.field5328;
                                }
                                continue;
                            }
                            if (var509 == 5207) {
                                var6--;
                                class311 var282 = class259.method1800((byte) -119, class284.field4832[var6]);
                                if (var282 != null && var282.field5318 != null) {
                                    class284.field4832[var6++] = var282.field5318;
                                    continue;
                                }
                                class284.field4832[var6++] = class60.field910;
                                continue;
                            }
                            if (var509 == 5208) {
                                class265.field4478[var7++] = class148.field2292;
                                class265.field4478[var7++] = class82.field1149;
                                continue;
                            }
                            if (var509 == 5209) {
                                class265.field4478[var7++] = class252.field4335 + class146.field2244;
                                class265.field4478[var7++] = class26.field446 + class197.field3160 - class84.field1158 - 1;
                                continue;
                            }
                            if (var509 == 5210) {
                                class311 var283 = class142.method896(-28093);
                                if (var283 == null) {
                                    class265.field4478[var7++] = 0;
                                    class265.field4478[var7++] = 0;
                                } else {
                                    class265.field4478[var7++] = var283.field5339 * 64;
                                    class265.field4478[var7++] = var283.field5323 * 64;
                                }
                                continue;
                            }
                            if (var509 == 5211) {
                                class311 var284 = class142.method896(-28093);
                                if (var284 == null) {
                                    class265.field4478[var7++] = 0;
                                    class265.field4478[var7++] = 0;
                                } else {
                                    class265.field4478[var7++] = var284.field5336 - var284.field5315;
                                    class265.field4478[var7++] = var284.field5316 - var284.field5319;
                                }
                                continue;
                            }
                            if (var509 == 5212) {
                                int var285 = class34.method253((byte) 11);
                                int var286 = 0;
                                class152 var287;
                                if (var285 == -1) {
                                    var287 = class60.field910;
                                } else {
                                    var287 = class194.field3086.field4766[var285];
                                    var286 = class194.field3086.method1899(true, var285);
                                }
                                class152 var288 = var287.method987(class83.field1153, class321.field5604, -1);
                                class284.field4832[var6++] = var288;
                                class265.field4478[var7++] = var286;
                                continue;
                            }
                            if (var509 == 5213) {
                                int var289 = class80.method529((byte) 124);
                                int var290 = 0;
                                class152 var291;
                                if (var289 == -1) {
                                    var291 = class60.field910;
                                } else {
                                    var291 = class194.field3086.field4766[var289];
                                    var290 = class194.field3086.method1899(true, var289);
                                }
                                class152 var292 = var291.method987(class83.field1153, class321.field5604, -1);
                                class284.field4832[var6++] = var292;
                                class265.field4478[var7++] = var290;
                                continue;
                            }
                            if (var509 == 5214) {
                                var7--;
                                int var293 = class265.field4478[var7];
                                class3.method13((var293 & 0xFFFCFC1) >> 14, var293 & 0x3FFF, true);
                                continue;
                            }
                            if (var509 == 5215) {
                                var7--;
                                int var294 = class265.field4478[var7];
                                var6--;
                                class152 var295 = class284.field4832[var6];
                                boolean var296 = false;
                                class48 var297 = class213.method1435((byte) -105, var294 >> 14 & 0x3FFF, var294 & 0x3FFF);
                                for (class311 var298 = (class311) var297.method333((byte) 125); var298 != null; var298 = (class311) var297.method329(-13985)) {
                                    if (var298.field5328.method995(-115, var295)) {
                                        var296 = true;
                                        break;
                                    }
                                }
                                if (var296) {
                                    class265.field4478[var7++] = 1;
                                } else {
                                    class265.field4478[var7++] = 0;
                                }
                                continue;
                            }
                            if (var509 == 5216) {
                                var7--;
                                int var299 = class265.field4478[var7];
                                class112.method753(20818, var299);
                                continue;
                            }
                            if (var509 == 5217) {
                                var7--;
                                int var300 = class265.field4478[var7];
                                if (class253.method1762(var300, -1)) {
                                    class265.field4478[var7++] = 1;
                                } else {
                                    class265.field4478[var7++] = 0;
                                }
                                continue;
                            }
                            if (var509 == 5218) {
                                class311 var301 = class142.method896(-28093);
                                if (var301 == null) {
                                    class265.field4478[var7++] = -1;
                                } else {
                                    class265.field4478[var7++] = var301.field5330;
                                }
                                continue;
                            }
                            if (var509 == 5219) {
                                var6--;
                                class234.method1605(111, class284.field4832[var6]);
                                continue;
                            }
                            if (var509 == 5220) {
                                class265.field4478[var7++] = class37.field616 == 100 ? 1 : 0;
                                continue;
                            }
                        } else if (var509 < 5400) {
                            if (var509 == 5300) {
                                var7 -= 2;
                                int var302 = class265.field4478[var7 + 1];
                                int var303 = class265.field4478[var7];
                                class179.method1178(true, var302, false, 3, var303);
                                class265.field4478[var7++] = class23.field397 == null ? 0 : 1;
                                continue;
                            }
                            if (var509 == 5301) {
                                if (class23.field397 != null) {
                                    class179.method1178(true, -1, false, class167.field2632, -1);
                                }
                                continue;
                            }
                            if (var509 == 5302) {
                                class210[] var304 = class305.method2127((byte) -56);
                                class265.field4478[var7++] = var304.length;
                                continue;
                            }
                            if (var509 == 5303) {
                                var7--;
                                int var305 = class265.field4478[var7];
                                class210[] var306 = class305.method2127((byte) -115);
                                class265.field4478[var7++] = var306[var305].field3412;
                                class265.field4478[var7++] = var306[var305].field3411;
                                continue;
                            }
                            if (var509 == 5305) {
                                int var307 = class179.field2848;
                                int var308 = class15.field211;
                                int var309 = -1;
                                class210[] var310 = class305.method2127((byte) -51);
                                for (int var311 = 0; var311 < var310.length; var311++) {
                                    class210 var312 = var310[var311];
                                    if (var312.field3412 == var308 && var312.field3411 == var307) {
                                        var309 = var311;
                                        break;
                                    }
                                }
                                class265.field4478[var7++] = var309;
                                continue;
                            }
                            if (var509 == 5306) {
                                class265.field4478[var7++] = class89.method586(1);
                                continue;
                            }
                            if (var509 == 5307) {
                                var7--;
                                int var313 = class265.field4478[var7];
                                if (var313 < 0 || var313 > 2) {
                                    var313 = 0;
                                }
                                class179.method1178(true, -1, false, var313, -1);
                                continue;
                            }
                            if (var509 == 5308) {
                                class265.field4478[var7++] = class167.field2632;
                                continue;
                            }
                            if (var509 == 5309) {
                                var7--;
                                int var314 = class265.field4478[var7];
                                if (var314 < 0 || var314 > 2) {
                                    var314 = 0;
                                }
                                class167.field2632 = var314;
                                class134.method854((byte) 50, class34.field572);
                                continue;
                            }
                        } else if (var509 < 5500) {
                            if (var509 == 5400) {
                                var6 -= 2;
                                class152.field2402++;
                                var7--;
                                int var315 = class265.field4478[var7];
                                class152 var316 = class284.field4832[var6 + 1];
                                class152 var317 = class284.field4832[var6];
                                class245.field4102.method1065(55, 15);
                                class245.field4102.method1980(false, class162.method1086(-1, var317) - (-class162.method1086(-1, var316) - 1));
                                class245.field4102.method2015(-21389, var317);
                                class245.field4102.method2015(-21389, var316);
                                class245.field4102.method1980(false, var315);
                                continue;
                            }
                            if (var509 == 5401) {
                                var7 -= 2;
                                class143.field2209[class265.field4478[var7]] = (short) class93.method611(class265.field4478[var7 + 1], -89);
                                class79.method523((byte) -74);
                                class213.method1436(-1);
                                class280.method1904(-79);
                                class164.method1100(true);
                                class147.method923((byte) 3);
                                continue;
                            }
                            if (var509 == 5405) {
                                var7 -= 2;
                                int var318 = class265.field4478[var7];
                                int var319 = class265.field4478[var7 + 1];
                                if (var318 >= 0 && var318 < 2) {
                                    class38.field627[var318] = new int[var319 << 1][4];
                                }
                                continue;
                            }
                            if (var509 == 5406) {
                                var7 -= 7;
                                int var320 = class265.field4478[var7];
                                int var321 = class265.field4478[var7 + 1] << 1;
                                int var322 = class265.field4478[var7 + 2];
                                int var323 = class265.field4478[var7 + 3];
                                int var324 = class265.field4478[var7 + 4];
                                int var325 = class265.field4478[var7 + 5];
                                int var326 = class265.field4478[var7 + 6];
                                if (var320 >= 0 && var320 < 2 && class38.field627[var320] != null && var321 >= 0 && var321 < class38.field627[var320].length) {
                                    class38.field627[var320][var321] = new int[] { (class34.method251(268431871, var322) >> 14) * 128, var323, class34.method251(var322, 16383) * 128, var326 };
                                    class38.field627[var320][var321 + 1] = new int[] { class34.method251(16383, var324 >> 14) * 128, var325, class34.method251(16383, var324) * 128 };
                                }
                                continue;
                            }
                            if (var509 == 5407) {
                                var7--;
                                int var327 = class38.field627[class265.field4478[var7]].length >> 1;
                                class265.field4478[var7++] = var327;
                                continue;
                            }
                            if (var509 == 5411) {
                                if (class23.field397 != null) {
                                    class179.method1178(true, -1, false, class167.field2632, -1);
                                }
                                if (class85.field1201 == null) {
                                    class108.method720(false, class154.method1028(31099), -97);
                                } else {
                                    System.exit(0);
                                }
                                continue;
                            }
                            if (var509 == 5419) {
                                class152 var328 = class60.field910;
                                if (class20.field265 != null) {
                                    var328 = class49.method342(class20.field265.field2979, (byte) 89);
                                    try {
                                        if (class20.field265.field2977 != null) {
                                            byte[] var329 = ((String) class20.field265.field2977).getBytes("ISO-8859-1");
                                            var328 = class117.method775(var329, var329.length, (byte) 124, 0);
                                        }
                                    } catch (UnsupportedEncodingException var507) {
                                    }
                                }
                                class284.field4832[var6++] = var328;
                                continue;
                            }
                            if (var509 == 5420) {
                                class265.field4478[var7++] = class151.field2361 == 3 ? 1 : 0;
                                continue;
                            }
                            if (var509 == 5421) {
                                if (class23.field397 != null) {
                                    class179.method1178(true, -1, false, class167.field2632, -1);
                                }
                                var6--;
                                class152 var331 = class284.field4832[var6];
                                var7--;
                                boolean var332 = class265.field4478[var7] == 1;
                                class152 var333 = method1307(new class152[] { class154.method1028(31099), var331 }, (byte) 29);
                                if (class85.field1201 == null && (!var332 || class151.field2361 == 3 || !class151.field2350.startsWith("win") || class211.field3431)) {
                                    class108.method720(var332, var333, -117);
                                    continue;
                                }
                                class100.field1462 = var332;
                                class241.field3942 = var333;
                                class314.field5438 = class34.field572.method967(0, new String(var333.method1018(-84), "ISO-8859-1"));
                                continue;
                            }
                            if (var509 == 5422) {
                                var6 -= 2;
                                class152 var334 = class284.field4832[var6];
                                class152 var335 = class284.field4832[var6 + 1];
                                var7--;
                                int var336 = class265.field4478[var7];
                                if (var334.method1000(0) > 0) {
                                    if (class82.field1144 == null) {
                                        class82.field1144 = new class152[class299.field5185[class256.field4410]];
                                    }
                                    class82.field1144[var336] = var334;
                                }
                                if (var335.method1000(0) > 0) {
                                    if (class163.field2580 == null) {
                                        class163.field2580 = new class152[class299.field5185[class256.field4410]];
                                    }
                                    class163.field2580[var336] = var335;
                                }
                                continue;
                            }
                            if (var509 == 5423) {
                                var6--;
                                class284.field4832[var6].method975((byte) 17);
                                continue;
                            }
                            if (var509 == 5424) {
                                var7 -= 11;
                                class8.field109 = class265.field4478[var7];
                                class169.field2641 = class265.field4478[var7 + 1];
                                class282.field4810 = class265.field4478[var7 + 2];
                                class272.field4676 = class265.field4478[var7 + 3];
                                class51.field795 = class265.field4478[var7 + 4];
                                class227.field3705 = class265.field4478[var7 + 5];
                                class10.field126 = class265.field4478[var7 + 6];
                                class42.field678 = class265.field4478[var7 + 7];
                                class50.field782 = class265.field4478[var7 + 8];
                                class128.field1964 = class265.field4478[var7 + 9];
                                class26.field440 = class265.field4478[var7 + 10];
                                class224.field3650.method1361(-1, class51.field795);
                                class224.field3650.method1361(-1, class227.field3705);
                                class224.field3650.method1361(-1, class10.field126);
                                class224.field3650.method1361(-1, class42.field678);
                                class224.field3650.method1361(-1, class50.field782);
                                class180.field2874 = true;
                                continue;
                            }
                            if (var509 == 5425) {
                                class299.method2098((byte) -127);
                                class180.field2874 = false;
                                continue;
                            }
                            if (var509 == 5426) {
                                var7--;
                                class92.field1283 = class265.field4478[var7];
                                continue;
                            }
                            if (var509 == 5427) {
                                var7 -= 2;
                                class241.field3944 = class265.field4478[var7];
                                class127.field1799 = class265.field4478[var7 + 1];
                                continue;
                            }
                        } else if (var509 < 5600) {
                            if (var509 == 5500) {
                                var7 -= 4;
                                int var367 = class265.field4478[var7 + 2];
                                int var368 = class265.field4478[var7 + 1];
                                int var369 = class265.field4478[var7 + 3];
                                int var370 = class265.field4478[var7];
                                class155.method1037((var370 & 0x3FFF) - class199.field3226, var368, var369, var367, (var370 >> 14 & 0x3FFF) - class272.field4670, false, false);
                                continue;
                            }
                            if (var509 == 5501) {
                                var7 -= 4;
                                int var371 = class265.field4478[var7];
                                int var372 = class265.field4478[var7 + 2];
                                int var373 = class265.field4478[var7 + 1];
                                int var374 = class265.field4478[var7 + 3];
                                class324.method2280((var371 & 0x3FFF) - class199.field3226, var374, -384, var373, (var371 >> 14 & 0x3FFF) - class272.field4670, var372);
                                continue;
                            }
                            if (var509 == 5502) {
                                var7 -= 6;
                                int var375 = class265.field4478[var7];
                                if (var375 >= 2) {
                                    throw new RuntimeException();
                                }
                                class299.field5181 = var375;
                                int var376 = class265.field4478[var7 + 1];
                                if (class38.field627[class299.field5181].length >> 1 <= var376 + 1) {
                                    throw new RuntimeException();
                                }
                                class112.field1580 = var376;
                                class196.field3135 = 0;
                                class6.field98 = class265.field4478[var7 + 2];
                                class294.field5033 = class265.field4478[var7 + 3];
                                int var377 = class265.field4478[var7 + 4];
                                if (var377 >= 2) {
                                    throw new RuntimeException();
                                }
                                class104.field1489 = var377;
                                int var378 = class265.field4478[var7 + 5];
                                if ((class38.field627[class104.field1489].length >> 1) <= (var378 + 1)) {
                                    throw new RuntimeException();
                                }
                                class41.field659 = var378;
                                class28.field485 = 3;
                                continue;
                            }
                            if (var509 == 5503) {
                                class222.method1538(-85);
                                continue;
                            }
                            if (var509 == 5504) {
                                var7 -= 2;
                                class193.field3060 = class265.field4478[var7];
                                class272.field4645 = class265.field4478[var7 + 1];
                                if (class28.field485 == 2) {
                                    class223.field3634 = class193.field3060;
                                    class94.field1346 = class272.field4645;
                                }
                                class298.method2083(false);
                                continue;
                            }
                            if (var509 == 5505) {
                                class265.field4478[var7++] = class193.field3060;
                                continue;
                            }
                            if (var509 == 5506) {
                                class265.field4478[var7++] = class272.field4645;
                                continue;
                            }
                        } else if (var509 < 5700) {
                            if (var509 == 5600) {
                                var6 -= 2;
                                class152 var363 = class284.field4832[var6 + 1];
                                var7--;
                                int var364 = class265.field4478[var7];
                                class152 var365 = class284.field4832[var6];
                                if (class232.field3814 == 10 && class18.field250 == 0 && class37.field618 == 0 && class141.field2156 == 0 && class193.field3078 == 0) {
                                    class23.method190(var364, var363, var365, -7963);
                                }
                                continue;
                            }
                            if (var509 == 5601) {
                                class20.method124((byte) 123);
                                continue;
                            }
                            if (var509 == 5602) {
                                if (class37.field618 == 0) {
                                    class184.field2930 = -2;
                                }
                                continue;
                            }
                            if (var509 == 5603) {
                                var7 -= 4;
                                if (class232.field3814 == 10 && class18.field250 == 0 && class37.field618 == 0 && class141.field2156 == 0 && class193.field3078 == 0) {
                                    class283.method1921(class265.field4478[var7 + 1], class265.field4478[var7], class265.field4478[var7 + 3], class265.field4478[var7 + 2], 1);
                                }
                                continue;
                            }
                            if (var509 == 5604) {
                                var6--;
                                if (class232.field3814 == 10 && class18.field250 == 0 && class37.field618 == 0 && class141.field2156 == 0 && class193.field3078 == 0) {
                                    class260.method1803(13660, class284.field4832[var6].method1013(-18674));
                                }
                                continue;
                            }
                            if (var509 == 5605) {
                                var6 -= 2;
                                var7 -= 4;
                                if (class232.field3814 == 10 && class18.field250 == 0 && class37.field618 == 0 && class141.field2156 == 0 && class193.field3078 == 0) {
                                    class31.method237(class265.field4478[var7 + 3], class284.field4832[var6].method1013(-18674), class265.field4478[var7], class265.field4478[var7 + 2], class265.field4478[var7 + 1], false, class284.field4832[var6 + 1]);
                                }
                                continue;
                            }
                            if (var509 == 5606) {
                                if (class141.field2156 == 0) {
                                    class28.field477 = -2;
                                }
                                continue;
                            }
                            if (var509 == 5607) {
                                class265.field4478[var7++] = class184.field2930;
                                continue;
                            }
                            if (var509 == 5608) {
                                class265.field4478[var7++] = class296.field5055;
                                continue;
                            }
                            if (var509 == 5609) {
                                class265.field4478[var7++] = class28.field477;
                                continue;
                            }
                            if (var509 == 5610) {
                                for (int var366 = 0; var366 < 5; var366++) {
                                    class284.field4832[var6++] = class287.field4856.length <= var366 ? class60.field910 : class287.field4856[var366].method1022(-117);
                                }
                                class287.field4856 = null;
                                continue;
                            }
                            if (var509 == 5611) {
                                class265.field4478[var7++] = class192.field3021;
                                continue;
                            }
                        } else if (var509 < 6100) {
                            if (var509 == 6001) {
                                var7--;
                                int var354 = class265.field4478[var7];
                                if (var354 < 1) {
                                    var354 = 1;
                                }
                                if (var354 > 4) {
                                    var354 = 4;
                                }
                                class87.field1228 = var354;
                                if (!class217.field3516 || !class81.field1131) {
                                    if (class87.field1228 == 1) {
                                        class181.method1206(0.9F);
                                    }
                                    if (class87.field1228 == 2) {
                                        class181.method1206(0.8F);
                                    }
                                    if (class87.field1228 == 3) {
                                        class181.method1206(0.7F);
                                    }
                                    if (class87.field1228 == 4) {
                                        class181.method1206(0.6F);
                                    }
                                }
                                if (class217.field3516) {
                                    class121.method783(159);
                                    if (!class81.field1131) {
                                        class224.method1547(25);
                                    }
                                }
                                class213.method1436(-1);
                                class134.method854((byte) 61, class34.field572);
                                class254.field4391 = false;
                                continue;
                            }
                            if (var509 == 6002) {
                                var7--;
                                class154.method1030(class265.field4478[var7] == 1, -111);
                                client.method1751(true);
                                class224.method1547(25);
                                class159.method1069(16560);
                                class134.method854((byte) 59, class34.field572);
                                class254.field4391 = false;
                                continue;
                            }
                            if (var509 == 6003) {
                                var7--;
                                class289.field4906 = class265.field4478[var7] == 1;
                                class159.method1069(16560);
                                class134.method854((byte) 26, class34.field572);
                                class254.field4391 = false;
                                continue;
                            }
                            if (var509 == 6005) {
                                var7--;
                                class199.field3209 = class265.field4478[var7] == 1;
                                class224.method1547(25);
                                class134.method854((byte) 66, class34.field572);
                                class254.field4391 = false;
                                continue;
                            }
                            if (var509 == 6006) {
                                var7--;
                                class205.field3352 = class265.field4478[var7] == 1;
                                ((class272) class181.field2878).method1875(false, !class205.field3352);
                                class134.method854((byte) 23, class34.field572);
                                class254.field4391 = false;
                                continue;
                            }
                            if (var509 == 6007) {
                                var7--;
                                class211.field3427 = class265.field4478[var7] == 1;
                                class134.method854((byte) 98, class34.field572);
                                class254.field4391 = false;
                                continue;
                            }
                            if (var509 == 6008) {
                                var7--;
                                class15.field209 = class265.field4478[var7] == 1;
                                class134.method854((byte) 39, class34.field572);
                                class254.field4391 = false;
                                continue;
                            }
                            if (var509 == 6009) {
                                var7--;
                                class92.field1307 = class265.field4478[var7] == 1;
                                class134.method854((byte) 29, class34.field572);
                                class254.field4391 = false;
                                continue;
                            }
                            if (var509 == 6010) {
                                var7--;
                                class33.field539 = class265.field4478[var7] == 1;
                                class134.method854((byte) 102, class34.field572);
                                class254.field4391 = false;
                                continue;
                            }
                            if (var509 == 6011) {
                                var7--;
                                int var355 = class265.field4478[var7];
                                if (var355 < 0 || var355 > 2) {
                                    var355 = 0;
                                }
                                class239.field3919 = var355;
                                class134.method854((byte) 59, class34.field572);
                                class254.field4391 = false;
                                continue;
                            }
                            if (var509 == 6012) {
                                if (class217.field3516) {
                                    class89.method587(0, 0, -7);
                                }
                                var7--;
                                class81.field1131 = class265.field4478[var7] == 1;
                                if (class217.field3516 && class81.field1131) {
                                    class181.method1206(0.7F);
                                } else {
                                    if (class87.field1228 == 1) {
                                        class181.method1206(0.9F);
                                    }
                                    if (class87.field1228 == 2) {
                                        class181.method1206(0.8F);
                                    }
                                    if (class87.field1228 == 3) {
                                        class181.method1206(0.7F);
                                    }
                                    if (class87.field1228 == 4) {
                                        class181.method1206(0.6F);
                                    }
                                }
                                class224.method1547(25);
                                class134.method854((byte) 126, class34.field572);
                                class254.field4391 = false;
                                continue;
                            }
                            if (var509 == 6014) {
                                var7--;
                                class100.field1454 = class265.field4478[var7] == 1;
                                if (class217.field3516) {
                                    class224.method1547(25);
                                }
                                class134.method854((byte) 33, class34.field572);
                                class254.field4391 = false;
                                continue;
                            }
                            if (var509 == 6015) {
                                var7--;
                                class236.field3870 = class265.field4478[var7] == 1;
                                if (class217.field3516) {
                                    class121.method783(159);
                                }
                                class134.method854((byte) 123, class34.field572);
                                class254.field4391 = false;
                                continue;
                            }
                            if (var509 == 6016) {
                                var7--;
                                int var356 = class265.field4478[var7];
                                if (class217.field3516) {
                                    class137.field2102 = true;
                                }
                                if (var356 < 0 || var356 > 2) {
                                    var356 = 0;
                                }
                                class225.field3657 = var356;
                                continue;
                            }
                            if (var509 == 6017) {
                                var7--;
                                class28.field484 = class265.field4478[var7] == 1;
                                class124.method792(2);
                                class134.method854((byte) 26, class34.field572);
                                class254.field4391 = false;
                                continue;
                            }
                            if (var509 == 6018) {
                                var7--;
                                int var357 = class265.field4478[var7];
                                if (var357 < 0) {
                                    var357 = 0;
                                }
                                if (var357 > 127) {
                                    var357 = 127;
                                }
                                class224.field3637 = var357;
                                class134.method854((byte) 124, class34.field572);
                                class254.field4391 = false;
                                continue;
                            }
                            if (var509 == 6019) {
                                var7--;
                                int var358 = class265.field4478[var7];
                                if (var358 < 0) {
                                    var358 = 0;
                                }
                                if (var358 > 255) {
                                    var358 = 255;
                                }
                                if (class6.field93 != var358) {
                                    if (class6.field93 == 0 && class40.field653 != -1) {
                                        class116.method766(0, class280.field4783, class40.field653, false, 0, var358);
                                        class111.field1571 = false;
                                    } else if (var358 == 0) {
                                        class320.method2254(13715);
                                        class111.field1571 = false;
                                    } else {
                                        class147.method925(var358, 107);
                                    }
                                    class6.field93 = var358;
                                }
                                class134.method854((byte) 110, class34.field572);
                                class254.field4391 = false;
                                continue;
                            }
                            if (var509 == 6020) {
                                var7--;
                                int var359 = class265.field4478[var7];
                                if (var359 < 0) {
                                    var359 = 0;
                                }
                                if (var359 > 127) {
                                    var359 = 127;
                                }
                                class72.field1048 = var359;
                                class134.method854((byte) 24, class34.field572);
                                class254.field4391 = false;
                                continue;
                            }
                            if (var509 == 6021) {
                                var7--;
                                class237.field3886 = class265.field4478[var7] == 1;
                                class159.method1069(16560);
                                continue;
                            }
                            if (var509 == 6023) {
                                var7--;
                                int var360 = class265.field4478[var7];
                                if (var360 < 0) {
                                    var360 = 0;
                                }
                                boolean var361 = false;
                                if (var360 > 2) {
                                    var360 = 2;
                                }
                                if (class6.field96 < 96) {
                                    var361 = true;
                                    var360 = 0;
                                }
                                class47.method324(var360);
                                class134.method854((byte) 60, class34.field572);
                                class254.field4391 = false;
                                class265.field4478[var7++] = var361 ? 0 : 1;
                                continue;
                            }
                            if (var509 == 6024) {
                                var7--;
                                int var362 = class265.field4478[var7];
                                if (var362 < 0 || var362 > 2) {
                                    var362 = 0;
                                }
                                class140.field2135 = var362;
                                class134.method854((byte) 82, class34.field572);
                                continue;
                            }
                            if (var509 == 6028) {
                                var7--;
                                class169.field2651 = class265.field4478[var7] != 0;
                                class134.method854((byte) 89, class34.field572);
                                continue;
                            }
                        } else if (var509 < 6200) {
                            if (var509 == 6101) {
                                class265.field4478[var7++] = class87.field1228;
                                continue;
                            }
                            if (var509 == 6102) {
                                class265.field4478[var7++] = class296.method2044(-85) ? 1 : 0;
                                continue;
                            }
                            if (var509 == 6103) {
                                class265.field4478[var7++] = class289.field4906 ? 1 : 0;
                                continue;
                            }
                            if (var509 == 6105) {
                                class265.field4478[var7++] = class199.field3209 ? 1 : 0;
                                continue;
                            }
                            if (var509 == 6106) {
                                class265.field4478[var7++] = class205.field3352 ? 1 : 0;
                                continue;
                            }
                            if (var509 == 6107) {
                                class265.field4478[var7++] = class211.field3427 ? 1 : 0;
                                continue;
                            }
                            if (var509 == 6108) {
                                class265.field4478[var7++] = class15.field209 ? 1 : 0;
                                continue;
                            }
                            if (var509 == 6109) {
                                class265.field4478[var7++] = class92.field1307 ? 1 : 0;
                                continue;
                            }
                            if (var509 == 6110) {
                                class265.field4478[var7++] = class33.field539 ? 1 : 0;
                                continue;
                            }
                            if (var509 == 6111) {
                                class265.field4478[var7++] = class239.field3919;
                                continue;
                            }
                            if (var509 == 6112) {
                                class265.field4478[var7++] = class81.field1131 ? 1 : 0;
                                continue;
                            }
                            if (var509 == 6114) {
                                class265.field4478[var7++] = class100.field1454 ? 1 : 0;
                                continue;
                            }
                            if (var509 == 6115) {
                                class265.field4478[var7++] = class236.field3870 ? 1 : 0;
                                continue;
                            }
                            if (var509 == 6116) {
                                class265.field4478[var7++] = class225.field3657;
                                continue;
                            }
                            if (var509 == 6117) {
                                class265.field4478[var7++] = class28.field484 ? 1 : 0;
                                continue;
                            }
                            if (var509 == 6118) {
                                class265.field4478[var7++] = class224.field3637;
                                continue;
                            }
                            if (var509 == 6119) {
                                class265.field4478[var7++] = class6.field93;
                                continue;
                            }
                            if (var509 == 6120) {
                                class265.field4478[var7++] = class72.field1048;
                                continue;
                            }
                            if (var509 == 6121) {
                                if (class217.field3516) {
                                    class265.field4478[var7++] = class217.field3535 ? 1 : 0;
                                } else {
                                    class265.field4478[var7++] = 0;
                                }
                                continue;
                            }
                            if (var509 == 6123) {
                                class265.field4478[var7++] = class47.method323();
                                continue;
                            }
                            if (var509 == 6124) {
                                class265.field4478[var7++] = class140.field2135;
                                continue;
                            }
                            if (var509 == 6128) {
                                class265.field4478[var7++] = class169.field2651 ? 1 : 0;
                                continue;
                            }
                        } else if (var509 < 6300) {
                            if (var509 == 6200) {
                                var7 -= 2;
                                class290.field4927 = (short) class265.field4478[var7];
                                if (class290.field4927 <= 0) {
                                    class290.field4927 = 256;
                                }
                                class121.field1715 = (short) class265.field4478[var7 + 1];
                                if (class121.field1715 <= 0) {
                                    class121.field1715 = 205;
                                }
                                continue;
                            }
                            if (var509 == 6201) {
                                var7 -= 2;
                                class37.field601 = (short) class265.field4478[var7];
                                if (class37.field601 <= 0) {
                                    class37.field601 = 256;
                                }
                                class137.field2094 = (short) class265.field4478[var7 + 1];
                                if (class137.field2094 <= 0) {
                                    class137.field2094 = 320;
                                }
                                continue;
                            }
                            if (var509 == 6202) {
                                var7 -= 4;
                                class118.field1676 = (short) class265.field4478[var7];
                                if (class118.field1676 <= 0) {
                                    class118.field1676 = 1;
                                }
                                class213.field3480 = (short) class265.field4478[var7 + 1];
                                if (class213.field3480 <= 0) {
                                    class213.field3480 = 32767;
                                } else if (class118.field1676 > class213.field3480) {
                                    class213.field3480 = class118.field1676;
                                }
                                class159.field2534 = (short) class265.field4478[var7 + 2];
                                if (class159.field2534 <= 0) {
                                    class159.field2534 = 1;
                                }
                                class74.field1073 = (short) class265.field4478[var7 + 3];
                                if (class74.field1073 <= 0) {
                                    class74.field1073 = 32767;
                                } else if (class74.field1073 < class159.field2534) {
                                    class74.field1073 = class159.field2534;
                                }
                                continue;
                            }
                            if (var509 == 6203) {
                                class59.method389(false, 0, (byte) -38, class85.field1178.field1921, 0, class85.field1178.field1876);
                                class265.field4478[var7++] = class254.field4393;
                                class265.field4478[var7++] = class308.field5291;
                                continue;
                            }
                            if (var509 == 6204) {
                                class265.field4478[var7++] = class37.field601;
                                class265.field4478[var7++] = class137.field2094;
                                continue;
                            }
                            if (var509 == 6205) {
                                class265.field4478[var7++] = class290.field4927;
                                class265.field4478[var7++] = class121.field1715;
                                continue;
                            }
                        } else if (var509 < 6400) {
                            if (var509 == 6300) {
                                class265.field4478[var7++] = (int) (class76.method507(-30994) / 60000L);
                                continue;
                            }
                            if (var509 == 6301) {
                                class265.field4478[var7++] = (int) (class76.method507(-30994) / 86400000L) - 11745;
                                continue;
                            }
                            if (var509 == 6302) {
                                var7 -= 3;
                                int var349 = class265.field4478[var7];
                                int var350 = class265.field4478[var7 + 2];
                                int var351 = class265.field4478[var7 + 1];
                                class267.field4496.clear();
                                class267.field4496.set(11, 12);
                                class267.field4496.set(var350, var351, var349);
                                class265.field4478[var7++] = (int) (class267.field4496.getTime().getTime() / 86400000L) - 11745;
                                continue;
                            }
                            if (var509 == 6303) {
                                class267.field4496.clear();
                                class267.field4496.setTime(new Date(class76.method507(-30994)));
                                class265.field4478[var7++] = class267.field4496.get(1);
                                continue;
                            }
                            if (var509 == 6304) {
                                var7--;
                                int var352 = class265.field4478[var7];
                                boolean var353 = true;
                                if (var352 < 0) {
                                    var353 = (var352 + 1) % 4 == 0;
                                } else if (var352 < 1582) {
                                    var353 = (var352 % 4) == 0;
                                } else if ((var352 % 4) != 0) {
                                    var353 = false;
                                } else if (var352 % 100 != 0) {
                                    var353 = true;
                                } else if ((var352 % 400) != 0) {
                                    var353 = false;
                                }
                                class265.field4478[var7++] = var353 ? 1 : 0;
                                continue;
                            }
                        } else if (var509 < 6500) {
                            if (var509 == 6405) {
                                class265.field4478[var7++] = class80.method532(-48) ? 1 : 0;
                                continue;
                            }
                            if (var509 == 6406) {
                                class265.field4478[var7++] = class150.method945(-256) ? 1 : 0;
                                continue;
                            }
                        } else if (var509 < 6600) {
                            if (var509 == 6500) {
                                if (class232.field3814 == 10 && class18.field250 == 0 && class37.field618 == 0 && class141.field2156 == 0) {
                                    class265.field4478[var7++] = class225.method1551(true) == -1 ? 0 : 1;
                                    continue;
                                }
                                class265.field4478[var7++] = 1;
                                continue;
                            }
                            if (var509 == 6501) {
                                class295 var337 = class41.method288((byte) 32);
                                if (var337 == null) {
                                    class265.field4478[var7++] = -1;
                                    class265.field4478[var7++] = 0;
                                    class284.field4832[var6++] = class60.field910;
                                    class265.field4478[var7++] = 0;
                                    class284.field4832[var6++] = class60.field910;
                                    class265.field4478[var7++] = 0;
                                } else {
                                    class265.field4478[var7++] = var337.field5040;
                                    class265.field4478[var7++] = var337.field2583;
                                    class284.field4832[var6++] = var337.field5038;
                                    class281 var338 = var337.method2037(120);
                                    class265.field4478[var7++] = var338.field4796;
                                    class284.field4832[var6++] = var338.field4799;
                                    class265.field4478[var7++] = var337.field2581;
                                }
                                continue;
                            }
                            if (var509 == 6502) {
                                class295 var339 = class258.method1796((byte) -87);
                                if (var339 == null) {
                                    class265.field4478[var7++] = -1;
                                    class265.field4478[var7++] = 0;
                                    class284.field4832[var6++] = class60.field910;
                                    class265.field4478[var7++] = 0;
                                    class284.field4832[var6++] = class60.field910;
                                    class265.field4478[var7++] = 0;
                                } else {
                                    class265.field4478[var7++] = var339.field5040;
                                    class265.field4478[var7++] = var339.field2583;
                                    class284.field4832[var6++] = var339.field5038;
                                    class281 var340 = var339.method2037(125);
                                    class265.field4478[var7++] = var340.field4796;
                                    class284.field4832[var6++] = var340.field4799;
                                    class265.field4478[var7++] = var339.field2581;
                                }
                                continue;
                            }
                            if (var509 == 6503) {
                                var7--;
                                int var341 = class265.field4478[var7];
                                if (class232.field3814 == 10 && class18.field250 == 0 && class37.field618 == 0 && class141.field2156 == 0) {
                                    class265.field4478[var7++] = class210.method1417(50000, var341) ? 1 : 0;
                                    continue;
                                }
                                class265.field4478[var7++] = 0;
                                continue;
                            }
                            if (var509 == 6504) {
                                var7--;
                                class243.field4023 = class265.field4478[var7];
                                class134.method854((byte) 54, class34.field572);
                                continue;
                            }
                            if (var509 == 6505) {
                                class265.field4478[var7++] = class243.field4023;
                                continue;
                            }
                            if (var509 == 6506) {
                                var7--;
                                int var342 = class265.field4478[var7];
                                class295 var343 = class192.method1276(var342, (byte) 8);
                                if (var343 == null) {
                                    class265.field4478[var7++] = -1;
                                    class284.field4832[var6++] = class60.field910;
                                    class265.field4478[var7++] = 0;
                                    class284.field4832[var6++] = class60.field910;
                                    class265.field4478[var7++] = 0;
                                } else {
                                    class265.field4478[var7++] = var343.field2583;
                                    class284.field4832[var6++] = var343.field5038;
                                    class281 var344 = var343.method2037(125);
                                    class265.field4478[var7++] = var344.field4796;
                                    class284.field4832[var6++] = var344.field4799;
                                    class265.field4478[var7++] = var343.field2581;
                                }
                                continue;
                            }
                            if (var509 == 6507) {
                                var7 -= 4;
                                int var345 = class265.field4478[var7];
                                int var346 = class265.field4478[var7 + 2];
                                boolean var347 = class265.field4478[var7 + 1] == 1;
                                boolean var348 = class265.field4478[var7 + 3] == 1;
                                class295.method2039((byte) -26, var345, var348, var347, var346);
                                continue;
                            }
                        } else if (var509 < 6700) {
                            if (var509 == 6600) {
                                var7--;
                                class259.field4438 = class265.field4478[var7] == 1;
                                class134.method854((byte) 87, class34.field572);
                                continue;
                            }
                            if (var509 == 6601) {
                                class265.field4478[var7++] = class259.field4438 ? 1 : 0;
                                continue;
                            }
                        }
                    } else if (var509 == 4300) {
                        var7 -= 2;
                        int var379 = class265.field4478[var7];
                        int var380 = class265.field4478[var7 + 1];
                        class45 var381 = class162.method1088(var380, (byte) 122);
                        if (var381.method307(127)) {
                            class284.field4832[var6++] = class98.method659(255, var379).method1646((byte) -128, var380, var381.field715);
                        } else {
                            class265.field4478[var7++] = class98.method659(255, var379).method1649(var381.field720, var380, 12169);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var508) {
            if (var5.field2327 == null) {
                if (class39.field638 != 0) {
                    class245.method1687(class60.field910, 0, class104.field1492, -1);
                }
                class169.method1109(var508, (byte) -128, "CS2 - scr:" + var5.field4689 + " op:" + var11);
            } else {
                class152 var504 = class97.method652(30, (byte) -63);
                var504.method1008(-9, class118.field1677).method1008(-9, var5.field2327);
                for (int var505 = class9.field115 - 1; var505 >= 0; var505--) {
                    var504.method1008(-9, class28.field474).method1008(-9, class308.field5289[var505].field2558.field2327);
                }
                if (var11 == 40) {
                    int var506 = var8[var10];
                    var504.method1008(-9, class58.field893).method1008(-9, class38.method280(99, var506));
                }
                if (class39.field638 != 0) {
                    class245.method1687(class60.field910, 0, method1307(new class152[] { class304.field5226, var5.field2327 }, (byte) 29), -1);
                }
                class169.method1109(var508, (byte) 73, "CS2 - scr:" + var5.field4689 + " op:" + var11 + new String(var504.method1018(-82)));
            }
            if (arg2 < 85) {
                field3129 = (class203[]) null;
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I[F)[F", line = 6413)
    public static final float[] method1305(int arg0, float[] arg1) {
        field3131++;
        if (arg1 == null) {
            return null;
        }
        float[] var2 = new float[arg1.length];
        class187.method1246(arg1, 0, var2, 0, arg1.length);
        if (arg0 != -29303) {
            method1303(-63, -25, -23, (Component) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ei", name = "mouseEntered", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 6446)
    public final synchronized void mouseEntered(MouseEvent arg0) {
        field3116++;
        if (class91.field1268 != null) {
            class162.field2569 = 0;
            class317.field5498 = arg0.getX();
            class28.field486 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V", line = 6463)
    public static void method1306(boolean arg0) {
        field3129 = null;
        if (arg0) {
            field3119 = -49;
        }
        field3115 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!ei", name = "mousePressed", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 6477)
    public final synchronized void mousePressed(MouseEvent arg0) {
        if (class91.field1268 != null) {
            class162.field2569 = 0;
            class268.field4524 = arg0.getX();
            class283.field4812 = arg0.getY();
            class267.field4505 = class76.method507(-30994);
            if (arg0.isMetaDown()) {
                class3.field50 = 2;
                class85.field1198 = 2;
            } else {
                class3.field50 = 1;
                class85.field1198 = 1;
            }
            int var2 = arg0.getModifiers();
            if ((var2 & 0x8) != 0) {
            }
            if ((var2 & 0x10) != 0) {
            }
            if ((var2 & 0x4) == 0) {
            }
        }
        field3123++;
        if (arg0.isPopupTrigger()) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ei", name = "mouseDragged", descriptor = "(Ljava/awt/event/MouseEvent;)V", line = 6525)
    public final synchronized void mouseDragged(MouseEvent arg0) {
        field3122++;
        if (class91.field1268 != null) {
            class162.field2569 = 0;
            class317.field5498 = arg0.getX();
            class28.field486 = arg0.getY();
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([Lwm;B)Lwm;", line = 6545)
    public static final class152 method1307(class152[] arg0, byte arg1) {
        if (arg1 != 29) {
            return (class152) null;
        }
        field3120++;
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class272.method1874(255, arg0, arg0.length, 0);
    }

    @OriginalMember(owner = "client!ei", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 6566)
    public final synchronized void focusLost(FocusEvent arg0) {
        field3132++;
        if (class91.field1268 != null) {
            class85.field1198 = 0;
        }
    }
}

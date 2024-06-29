import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class77 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!la", name = "d", descriptor = "[[I")
    public static int[][] field1809 = new int[104][104];

    @OriginalMember(owner = "client!la", name = "a", descriptor = "[I")
    public static int[] field1806 = new int[50];

    @OriginalMember(owner = "client!la", name = "i", descriptor = "[I")
    public static int[] field1814 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!la", name = "p", descriptor = "[Lfc;")
    public static class39[] field1821 = new class39[16];

    @OriginalMember(owner = "client!la", name = "q", descriptor = "Le;")
    public static class29 field1822 = new class29(64);

    @OriginalMember(owner = "client!la", name = "u", descriptor = "Lda;")
    public static class23 field1826 = new class23();

    @OriginalMember(owner = "client!la", name = "x", descriptor = "Lu;")
    public static class135 field1829 = class87.method676((byte) -112, "jolt");

    @OriginalMember(owner = "client!la", name = "B", descriptor = "Lu;")
    private static class135 field1833 = class87.method676((byte) -43, "Could not complete login)3");

    @OriginalMember(owner = "client!la", name = "A", descriptor = "[Lu;")
    public static class135[] field1832 = new class135[5];

    @OriginalMember(owner = "client!la", name = "y", descriptor = "Lu;")
    public static class135 field1830 = class87.method676((byte) -108, "AUS");

    @OriginalMember(owner = "client!la", name = "C", descriptor = "Lu;")
    private static class135 field1834 = class87.method676((byte) -97, "wishes to duel with you)3");

    @OriginalMember(owner = "client!la", name = "v", descriptor = "Lu;")
    public static class135 field1827 = field1833;

    @OriginalMember(owner = "client!la", name = "D", descriptor = "Lu;")
    public static class135 field1835 = field1834;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!la", name = "z", descriptor = "Lre;")
    public static class122 field1831;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "Lae;")
    public static class6 field1828;

    @OriginalMember(owner = "client!la", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        arg0.consume();
        field1817++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)Z")
    public static final boolean method613(int arg0) {
        field1824++;
        if (class104.field2501 == null) {
            return false;
        }
        try {
            int var1 = class104.field2501.method877(arg0 - 20511);
            if (var1 == 0) {
                return false;
            }
            if (class41.field959 == -1) {
                class104.field2501.method872((byte) -116, class23.field581.field1495, 1, 0);
                class23.field581.field1485 = 0;
                class41.field959 = class23.field581.method932(1);
                class21.field499 = class107.field2585[class41.field959];
                var1--;
            }
            if (class21.field499 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                var1--;
                class104.field2501.method872((byte) -125, class23.field581.field1495, 1, 0);
                class21.field499 = class23.field581.field1495[0] & 0xFF;
            }
            if (class21.field499 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                var1 -= 2;
                class104.field2501.method872((byte) -65, class23.field581.field1495, 2, 0);
                class23.field581.field1485 = 0;
                class21.field499 = class23.field581.method483((byte) 24);
            }
            if (class21.field499 > var1) {
                return false;
            }
            class23.field581.field1485 = 0;
            class104.field2501.method872((byte) -89, class23.field581.field1495, class21.field499, 0);
            class35.field815 = 0;
            class5.field124 = class113.field2743;
            class113.field2743 = class97.field2355;
            class97.field2355 = class41.field959;
            if (class41.field959 == 136) {
                class135 var2 = class23.field581.method496(arg0 - 20751);
                Object[] var3 = new Object[var2.method1063(-64) + 1];
                for (int var4 = var2.method1063(arg0 ^ -20645) - 1; var4 >= 0; var4--) {
                    if (var2.method1071(61, var4) == 115) {
                        var3[var4 + 1] = class23.field581.method496(-87);
                    } else {
                        var3[var4 + 1] = Integer.valueOf(class23.field581.method498((byte) 125));
                    }
                }
                var3[0] = Integer.valueOf(class23.field581.method498((byte) -115));
                class52.method399(null, var3, 0, 0, null, -2147483645, 0);
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 233) {
                class133.field3215 = class23.field581.method456((byte) 84);
                class42.field969 = class23.field581.method469(-128);
                for (int var5 = class42.field969; var5 < class42.field969 + 8; var5++) {
                    for (int var6 = class133.field3215; var6 < class133.field3215 + 8; var6++) {
                        if (class48.field1142[class136.field3301][var5][var6] != null) {
                            class48.field1142[class136.field3301][var5][var6] = null;
                            class141.method1131(var6, arg0 ^ 0x509B, var5);
                        }
                    }
                }
                for (class44 var7 = (class44) class123.field2940.method182((byte) 50); var7 != null; var7 = (class44) class123.field2940.method181((byte) 91)) {
                    if (class42.field969 <= var7.field1060 && var7.field1060 < class42.field969 + 8 && var7.field1073 >= class133.field3215 && var7.field1073 < class133.field3215 + 8 && class136.field3301 == var7.field1058) {
                        var7.field1072 = 0;
                    }
                }
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 190) {
                int var8 = class23.field581.method468((byte) -89);
                int var9 = class23.field581.method446((byte) -99);
                class146 var10 = class48.method360(-94, var8);
                class41.field959 = -1;
                if (var10.field3624 != var9 || var9 == -1) {
                    var10.field3614 = 0;
                    var10.field3563 = 0;
                    var10.field3624 = var9;
                }
                return true;
            }
            if (class41.field959 == 11) {
                int var11 = class23.field581.method469(-128);
                int var12 = class23.field581.method456((byte) 100);
                int var13 = class23.field581.method480(0);
                class136.field3301 = var11 >> 1;
                class116.field2789.method51((var11 & 0x1) == 1, arg0 - 20508, var12, var13);
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 158) {
                int var14 = class23.field581.method491(arg0 ^ 0x5099);
                class120.method957(var14, (byte) -53);
                class41.field959 = -1;
                class53.field1254 = class126.field2998;
                return true;
            }
            if (arg0 != 20635) {
                field1814 = null;
            }
            if (class41.field959 == 74) {
                int var15 = class23.field581.method468((byte) -30);
                int var16 = class23.field581.method483((byte) 24);
                class52.field1226[var16] = var15;
                if (class104.field2513[var16] != var15) {
                    class104.field2513[var16] = var15;
                    class48.method366(var16, -128);
                    if (class99.field2384 != -1) {
                        class65.field1634 = true;
                    }
                    class135.field3239 = true;
                }
                class53.field1257 = class126.field2998;
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 83) {
                int var17 = class23.field581.method491(2);
                class44.method344(var17, -10744);
                if (class49.field1174 != -1) {
                    class148.method1213(class49.field1174, (byte) -128);
                    class65.field1634 = true;
                    class49.field1174 = -1;
                }
                if (class19.field425 != -1) {
                    class148.method1213(class19.field425, (byte) -116);
                    class19.field425 = -1;
                    class125.method978(30, 1);
                }
                if (class115.field2752 != -1) {
                    class148.method1213(class115.field2752, (byte) -46);
                    class115.field2752 = -1;
                }
                if (class106.field2552 != -1) {
                    class148.method1213(class106.field2552, (byte) -92);
                    class106.field2552 = -1;
                }
                if (class80.field1900 == var17) {
                    class143.method1175(class80.field1900, arg0 ^ 0x50F4);
                } else {
                    class148.method1213(class80.field1900, (byte) -58);
                    class80.field1900 = var17;
                }
                class135.field3239 = true;
                class104.field2507 = -1;
                if (class42.field975 != 0) {
                    class65.field1634 = true;
                    class42.field975 = 0;
                }
                class10.field244 = true;
                class151.method1219(class80.field1900, (byte) 121);
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 147) {
                if (class49.field1174 != -1) {
                    class148.method1213(class49.field1174, (byte) -114);
                    class49.field1174 = -1;
                }
                class34.field789 = false;
                class41.field959 = -1;
                class113.field2722 = class113.field2742;
                class42.field975 = 2;
                class65.field1634 = true;
                return true;
            }
            if (class41.field959 == 117) {
                class79.field1858 = class23.field581.method480(arg0 - 20635);
                class48.field1135 = class23.field581.method480(arg0 - 20635);
                class126.field3014 = class23.field581.method480(0);
                class42.field979 = true;
                class41.field959 = -1;
                class65.field1634 = true;
                return true;
            }
            if (class41.field959 == 123) {
                int var18 = class23.field581.method488(-28134);
                int var19 = class23.field581.method464(4);
                int var20 = class23.field581.method483((byte) 24);
                class146 var21 = class48.method360(-111, var19);
                var21.field3592 = (var18 << 16) + var20;
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 221) {
                if (class80.field1900 != -1) {
                    class148.method1213(class80.field1900, (byte) -123);
                    class80.field1900 = -1;
                    class135.field3239 = true;
                    class10.field244 = true;
                }
                if (class49.field1174 != -1) {
                    class148.method1213(class49.field1174, (byte) -67);
                    class65.field1634 = true;
                    class49.field1174 = -1;
                }
                if (class19.field425 != -1) {
                    class148.method1213(class19.field425, (byte) -95);
                    class19.field425 = -1;
                    class125.method978(30, 1);
                }
                if (class115.field2752 != -1) {
                    class148.method1213(class115.field2752, (byte) -89);
                    class115.field2752 = -1;
                }
                if (class106.field2552 != -1) {
                    class148.method1213(class106.field2552, (byte) -61);
                    class106.field2552 = -1;
                }
                class104.field2507 = -1;
                class41.field959 = -1;
                if (class42.field975 != 0) {
                    class42.field975 = 0;
                    class65.field1634 = true;
                }
                return true;
            }
            if (class41.field959 == 149) {
                int var22 = class23.field581.method446((byte) -99);
                int var23 = class23.field581.method498((byte) 126);
                int var24 = class23.field581.method454(117);
                class146 var25 = class48.method360(-73, var23);
                var25.field3669 = var25.field3632 + var22;
                var25.field3575 = var25.field3636 + var24;
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 249) {
                class63.field1573 = class23.field581.method480(0);
                class41.field959 = -1;
                class53.field1257 = class126.field2998;
                class135.field3239 = true;
                return true;
            }
            if (class41.field959 == 227) {
                int var26 = class23.field581.method491(2);
                class44.method344(var26, arg0 - 31379);
                if (class80.field1900 != -1) {
                    class148.method1213(class80.field1900, (byte) -57);
                    class135.field3239 = true;
                    class80.field1900 = -1;
                    class10.field244 = true;
                }
                if (class19.field425 != -1) {
                    class148.method1213(class19.field425, (byte) -126);
                    class19.field425 = -1;
                    class125.method978(30, arg0 ^ 0x509A);
                }
                if (class115.field2752 != -1) {
                    class148.method1213(class115.field2752, (byte) -106);
                    class115.field2752 = -1;
                }
                if (class106.field2552 != -1) {
                    class148.method1213(class106.field2552, (byte) -117);
                    class106.field2552 = -1;
                }
                if (class49.field1174 == var26) {
                    class143.method1175(class49.field1174, -114);
                } else {
                    class148.method1213(class49.field1174, (byte) -111);
                    class49.field1174 = var26;
                }
                class104.field2507 = -1;
                class151.method1219(class49.field1174, (byte) 116);
                class65.field1634 = true;
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 69) {
                boolean var27 = class23.field581.method469(-128) == 1;
                int var28 = class23.field581.method468((byte) -45);
                class146 var29 = class48.method360(arg0 ^ 0xFFFFAF2D, var28);
                var29.field3578 = var27;
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 113) {
                class53.field1250 = class23.field581.method469(arg0 - 20763);
                class41.field959 = -1;
                if (class53.field1250 == class49.field1167) {
                    if (class53.field1250 == 3) {
                        class49.field1167 = 1;
                    } else {
                        class49.field1167 = 3;
                    }
                    class135.field3239 = true;
                }
                return true;
            }
            if (class41.field959 == 237) {
                class106.field2548 = true;
                class28.field690 = class23.field581.method480(0);
                class148.field3693 = class23.field581.method480(arg0 ^ 0x509B);
                class95.field2317 = class23.field581.method483((byte) 24);
                class26.field625 = class23.field581.method480(0);
                class52.field1228 = class23.field581.method480(0);
                if (class52.field1228 >= 100) {
                    int var30 = class28.field690 * 128 + 64;
                    int var31 = class148.field3693 * 128 + 64;
                    int var32 = class20.method148(var30, var31, class136.field3301, -2) - class95.field2317;
                    int var33 = var30 - class132.field3185;
                    int var34 = var31 - class47.field1122;
                    int var35 = var32 - class17.field386;
                    int var36 = (int) Math.sqrt((double) (var33 * var33 + var34 * var34));
                    class62.field1552 = (int) (Math.atan2((double) var35, (double) var36) * 325.949D) & 0x7FF;
                    class117.field2806 = (int) (Math.atan2((double) var33, (double) var34) * -325.949D) & 0x7FF;
                    if (class62.field1552 < 128) {
                        class62.field1552 = 128;
                    }
                    if (class62.field1552 > 383) {
                        class62.field1552 = 383;
                    }
                }
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 22) {
                for (int var37 = 0; var37 < class131.field3166.length; var37++) {
                    if (class131.field3166[var37] != null) {
                        class131.field3166[var37].field170 = -1;
                    }
                }
                for (int var38 = 0; var38 < class96.field2340.length; var38++) {
                    if (class96.field2340[var38] != null) {
                        class96.field2340[var38].field170 = -1;
                    }
                }
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 84) {
                class62.field1553 = class23.field581.method480(0);
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 10) {
                class63.field1586 = class23.field581.method488(-28134) * 30;
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 162 || class41.field959 == 146 || class41.field959 == 107 || class41.field959 == 181 || class41.field959 == 92 || class41.field959 == 241 || class41.field959 == 104 || class41.field959 == 64 || class41.field959 == 165 || class41.field959 == 98 || class41.field959 == 33) {
                class93.method756(190401380);
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 57) {
                class138.field3350 = class23.field581.method480(arg0 ^ 0x509B);
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 91) {
                int var39 = class23.field581.method483((byte) 24);
                int var40 = class23.field581.method480(0);
                int var41 = class23.field581.method483((byte) 24);
                class56.method433(var39, var41, var40, arg0 ^ 0xFFFFAF2D);
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 27) {
                class106.field2548 = false;
                for (int var42 = 0; var42 < 5; var42++) {
                    class146.field3585[var42] = false;
                }
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 209) {
                class145.method1190(-87);
                class41.field959 = -1;
                return false;
            }
            if (class41.field959 == 108) {
                long var43 = class23.field581.method444(0);
                class135 var45 = class130.method1045(class23.field581, (byte) -95).method1078(arg0 - 20742);
                class82.method635(6, class131.method1054(false, var43).method1088((byte) 56), (byte) 109, var45);
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 193) {
                class23.method193(arg0 - 20520);
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 34) {
                int var46 = class23.field581.method483((byte) 24);
                class44.method344(var46, -10744);
                if (class80.field1900 != -1) {
                    class148.method1213(class80.field1900, (byte) -59);
                    class10.field244 = true;
                    class135.field3239 = true;
                    class80.field1900 = -1;
                }
                if (class49.field1174 != -1) {
                    class148.method1213(class49.field1174, (byte) -81);
                    class49.field1174 = -1;
                    class65.field1634 = true;
                }
                if (class19.field425 != -1) {
                    class148.method1213(class19.field425, (byte) -107);
                    class19.field425 = -1;
                    class125.method978(30, 1);
                }
                if (class115.field2752 != -1) {
                    class148.method1213(class115.field2752, (byte) -110);
                    class115.field2752 = -1;
                }
                if (class106.field2552 == var46) {
                    class143.method1175(class106.field2552, -24);
                } else {
                    class148.method1213(class106.field2552, (byte) -96);
                    class106.field2552 = var46;
                }
                class104.field2507 = -1;
                if (class42.field975 != 0) {
                    class42.field975 = 0;
                    class65.field1634 = true;
                }
                class151.method1219(class106.field2552, (byte) 124);
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 251) {
                class41.field959 = -1;
                class86.field2062 = 0;
                return true;
            }
            if (class41.field959 == 134) {
                class106.field2549 = class23.field581.method483((byte) 24);
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 7) {
                int var47 = class23.field581.method472((byte) -97);
                int var48 = class23.field581.method493(false);
                class146 var49 = class48.method360(-118, var48);
                class41.field959 = -1;
                var49.field3551 = 2;
                var49.field3625 = var47;
                return true;
            }
            if (class41.field959 == 191) {
                long var50 = class23.field581.method444(arg0 - 20635);
                long var52 = (long) class23.field581.method483((byte) 24);
                long var54 = (long) class23.field581.method455(true);
                int var56 = class23.field581.method480(0);
                boolean var57 = false;
                long var58 = (var52 << 32) + var54;
                for (int var60 = 0; var60 < 100; var60++) {
                    if (class4.field99[var60] == var58) {
                        var57 = true;
                        break;
                    }
                }
                if (var56 <= 1) {
                    for (int var61 = 0; var61 < class119.field2844; var61++) {
                        if (class14.field340[var61] == var50) {
                            var57 = true;
                            break;
                        }
                    }
                }
                if (!var57 && class135.field3264 == 0) {
                    class4.field99[class115.field2755] = var58;
                    class115.field2755 = (class115.field2755 + 1) % 100;
                    class135 var62 = class130.method1045(class23.field581, (byte) -118).method1078(82);
                    if (var56 == 2 || var56 == 3) {
                        class82.method635(7, class107.method867(2, new class135[] { class26.field626, class131.method1054(false, var50).method1088((byte) 56) }), (byte) 96, var62);
                    } else if (var56 == 1) {
                        class82.method635(7, class107.method867(arg0 ^ 0x5099, new class135[] { class56.field1369, class131.method1054(false, var50).method1088((byte) 56) }), (byte) 126, var62);
                    } else {
                        class82.method635(3, class131.method1054(false, var50).method1088((byte) 56), (byte) 112, var62);
                    }
                }
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 31) {
                class60.field1509 = class23.field581.method480(0);
                if (class60.field1509 == 1) {
                    class145.field3529 = class23.field581.method483((byte) 24);
                }
                if (class60.field1509 >= 2 && class60.field1509 <= 6) {
                    if (class60.field1509 == 2) {
                        class103.field2494 = 64;
                        class41.field958 = 64;
                    }
                    if (class60.field1509 == 3) {
                        class41.field958 = 0;
                        class103.field2494 = 64;
                    }
                    if (class60.field1509 == 4) {
                        class41.field958 = 128;
                        class103.field2494 = 64;
                    }
                    if (class60.field1509 == 5) {
                        class41.field958 = 64;
                        class103.field2494 = 0;
                    }
                    if (class60.field1509 == 6) {
                        class41.field958 = 64;
                        class103.field2494 = 128;
                    }
                    class60.field1509 = 2;
                    class35.field826 = class23.field581.method483((byte) 24);
                    class55.field1310 = class23.field581.method483((byte) 24);
                    class49.field1164 = class23.field581.method480(0);
                }
                if (class60.field1509 == 10) {
                    class63.field1575 = class23.field581.method483((byte) 24);
                }
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 46) {
                byte var63 = class23.field581.method486(48);
                int var64 = class23.field581.method488(arg0 - 48769);
                class52.field1226[var64] = var63;
                if (class104.field2513[var64] != var63) {
                    class104.field2513[var64] = var63;
                    class48.method366(var64, -127);
                    if (class99.field2384 != -1) {
                        class65.field1634 = true;
                    }
                    class135.field3239 = true;
                }
                class41.field959 = -1;
                class53.field1257 = class126.field2998;
                return true;
            }
            if (class41.field959 == 187) {
                class113.field2734 = class23.field581.method496(-88);
                if (class49.field1174 != -1) {
                    class148.method1213(class49.field1174, (byte) -95);
                    class49.field1174 = -1;
                }
                class34.field789 = false;
                class65.field1634 = true;
                class42.field975 = 4;
                class41.field959 = -1;
                class113.field2722 = class113.field2742;
                return true;
            }
            if (class41.field959 == 176) {
                int var65 = class23.field581.method480(0);
                int var66 = class23.field581.method480(0);
                int var67 = class23.field581.method480(0);
                int var68 = class23.field581.method480(0);
                class146.field3585[var65] = true;
                class82.field1944[var65] = var66;
                class115.field2763[var65] = var67;
                class102.field2455[var65] = var68;
                class125.field2978[var65] = 0;
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 105) {
                int var69 = class23.field581.method491(arg0 - 20633);
                int var70 = class23.field581.method464(arg0 ^ 0x509F);
                class146 var71 = class48.method360(-104, var70);
                if (var71 != null && var71.field3564 == 0) {
                    if (var69 > var71.field3619 - var71.field3661) {
                        var69 = var71.field3619 - var71.field3661;
                    }
                    if (var69 < 0) {
                        var69 = 0;
                    }
                    var71.field3671 = var69;
                }
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 238) {
                class23.field581.method491(arg0 - 20633);
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 130) {
                class106.field2548 = true;
                class101.field2448 = class23.field581.method480(0);
                class84.field1993 = class23.field581.method480(0);
                class151.field3736 = class23.field581.method483((byte) 24);
                client.field517 = class23.field581.method480(arg0 ^ 0x509B);
                class47.field1111 = class23.field581.method480(0);
                if (class47.field1111 >= 100) {
                    class132.field3185 = class101.field2448 * 128 + 64;
                    class47.field1122 = class84.field1993 * 128 + 64;
                    class17.field386 = class20.method148(class132.field3185, class47.field1122, class136.field3301, -2) - class151.field3736;
                }
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 252) {
                int var72 = class23.field581.method456((byte) 47);
                int var73 = class23.field581.method491(2);
                if (var73 == 65535) {
                    var73 = -1;
                }
                if (class21.field491[var72] == var73) {
                    class143.method1175(class21.field491[var72], arg0 - 20557);
                } else {
                    class148.method1213(class21.field491[var72], (byte) -68);
                    class21.field491[var72] = var73;
                }
                class10.field244 = true;
                class135.field3239 = true;
                class151.method1219(class21.field491[var72], (byte) 123);
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 248) {
                int var74 = class23.field581.method472((byte) -41);
                int var75 = class23.field581.method488(-28134);
                class44.method344(var74, arg0 - 31379);
                if (var75 != -1) {
                    class44.method344(var75, -10744);
                }
                if (class106.field2552 != -1) {
                    class148.method1213(class106.field2552, (byte) -64);
                    class106.field2552 = -1;
                }
                if (class80.field1900 != -1) {
                    class148.method1213(class80.field1900, (byte) -100);
                    class80.field1900 = -1;
                }
                if (class49.field1174 != -1) {
                    class148.method1213(class49.field1174, (byte) -101);
                    class49.field1174 = -1;
                }
                if (class19.field425 == var74) {
                    class143.method1175(class19.field425, -128);
                } else {
                    class148.method1213(class19.field425, (byte) -119);
                    class19.field425 = var74;
                    class125.method978(35, 1);
                }
                if (class115.field2752 == var74) {
                    class143.method1175(class115.field2752, -125);
                } else {
                    class148.method1213(class115.field2752, (byte) -122);
                    class115.field2752 = var75;
                }
                class42.field975 = 0;
                class104.field2507 = -1;
                class151.method1219(class19.field425, (byte) 127);
                class151.method1219(class115.field2752, (byte) 121);
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 2) {
                int var76 = class23.field581.method472((byte) -60);
                int var77 = class23.field581.method472((byte) -108);
                int var78 = class23.field581.method468((byte) 102);
                int var79 = class23.field581.method488(-28134);
                class146 var80 = class48.method360(-84, var78);
                var80.field3654 = var77;
                var80.field3655 = var76;
                class41.field959 = -1;
                var80.field3593 = var79;
                return true;
            }
            if (class41.field959 == 203) {
                class23.field581.method498((byte) 125);
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 196) {
                class49.field1167 = class23.field581.method484((byte) 127);
                class135.field3239 = true;
                class10.field244 = true;
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 61) {
                class42.field969 = class23.field581.method469(-128);
                class133.field3215 = class23.field581.method484((byte) 127);
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 129) {
                int var81 = class23.field581.method498((byte) 125);
                int var82 = class23.field581.method483((byte) 24);
                int var83 = class23.field581.method464(arg0 - 20631);
                if (var82 == 65535) {
                    var82 = -1;
                }
                class146 var84 = class48.method360(-74, var81);
                if (var84.field3628) {
                    var84.field3582 = var83;
                    var84.field3618 = var82;
                    class94 var86 = class41.method306(-66, var82);
                    var84.field3593 = var86.field2221;
                    var84.field3581 = var86.field2222;
                    var84.field3654 = var86.field2229;
                    var84.field3655 = var86.field2241;
                    var84.field3589 = var86.field2248;
                    if (var84.field3623 > 0) {
                        var84.field3655 = var84.field3655 * 32 / var84.field3623;
                    }
                    var84.field3607 = var86.field2252;
                    class37.method283(-67, var84);
                } else if (var82 == -1) {
                    class41.field959 = -1;
                    var84.field3551 = 0;
                    return true;
                } else {
                    class94 var85 = class41.method306(-71, var82);
                    var84.field3593 = var85.field2221;
                    var84.field3655 = var85.field2241 * 100 / var83;
                    var84.field3551 = 4;
                    var84.field3654 = var85.field2229;
                    var84.field3625 = var82;
                }
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 185) {
                long var87 = class23.field581.method444(0);
                byte var89 = class23.field581.method475(-49152);
                long var90 = class23.field581.method444(0);
                long var92 = (long) class23.field581.method483((byte) 24);
                long var94 = (long) class23.field581.method455(true);
                int var96 = class23.field581.method480(0);
                boolean var97 = false;
                long var98 = (var92 << 32) + var94;
                for (int var100 = 0; var100 < 100; var100++) {
                    if (class4.field99[var100] == var98) {
                        var97 = true;
                        break;
                    }
                }
                if (var96 <= 1) {
                    for (int var101 = 0; var101 < class119.field2844; var101++) {
                        if (class14.field340[var101] == var87) {
                            var97 = true;
                            break;
                        }
                    }
                }
                if (!var97 && class135.field3264 == 0) {
                    class4.field99[class115.field2755] = var98;
                    class115.field2755 = (class115.field2755 + 1) % 100;
                    class135 var102 = class130.method1045(class23.field581, (byte) 106).method1078(arg0 - 20539);
                    class135 var103 = class107.method867(2, new class135[] { class101.field2429, class131.method1054(false, var90), class78.field1841, class68.method547(-1, var89), class46.field1096 });
                    if (var96 == 2 || var96 == 3) {
                        class82.method635(7, class107.method867(2, new class135[] { var103, class26.field626, class131.method1054(false, var87).method1088((byte) 56) }), (byte) 107, var102);
                    } else if (var96 == 1) {
                        class82.method635(7, class107.method867(2, new class135[] { var103, class56.field1369, class131.method1054(false, var87).method1088((byte) 56) }), (byte) 84, var102);
                    } else {
                        class82.method635(3, class107.method867(2, new class135[] { var103, class131.method1054(false, var87).method1088((byte) 56) }), (byte) 83, var102);
                    }
                }
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 79) {
                class56.method431(8, true);
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 38) {
                int var104 = class23.field581.method488(-28134);
                int var105 = class23.field581.method464(4);
                class146 var106 = class48.method360(-113, var105);
                class41.field959 = -1;
                var106.field3625 = var104;
                var106.field3551 = 1;
                return true;
            }
            if (class41.field959 == 210) {
                int var107 = class23.field581.method447(255);
                if (class99.field2384 != var107) {
                    class148.method1213(class99.field2384, (byte) -53);
                    class99.field2384 = var107;
                }
                class65.field1634 = true;
                class151.method1219(class99.field2384, (byte) 116);
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 220) {
                class56.method431(arg0 - 20627, false);
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 54) {
                if (class49.field1167 == 12) {
                    class135.field3239 = true;
                }
                class78.field1855 = class23.field581.method446((byte) -99);
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 99) {
                class135 var108 = class23.field581.method496(arg0 - 20753);
                int var109 = class23.field581.method484((byte) 119);
                int var110 = class23.field581.method484((byte) 121);
                if (var109 >= 1 && var109 <= 5) {
                    if (var108.method1069(90, class90.field2113)) {
                        var108 = null;
                    }
                    field1832[var109 - 1] = var108;
                    class76.field1800[var109 - 1] = var110 == 0;
                }
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 106) {
                int var111 = class23.field581.method493(false);
                class146 var112 = class48.method360(arg0 - 20709, var111);
                for (int var113 = 0; var113 < var112.field3597.length; var113++) {
                    var112.field3597[var113] = -1;
                    var112.field3597[var113] = 0;
                }
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 110) {
                class23.field581.method456((byte) 104);
                class23.field581.method464(4);
                class23.field581.method491(2);
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 41) {
                int var114 = class23.field581.method454(-114);
                if (var114 >= 0) {
                    class44.method344(var114, -10744);
                }
                if (class95.field2294 != var114) {
                    class148.method1213(class95.field2294, (byte) -74);
                    class95.field2294 = var114;
                }
                class151.method1219(class95.field2294, (byte) 123);
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 40) {
                int var115 = class23.field581.method464(4);
                int var116 = class23.field581.method488(-28134);
                int var117 = var116 >> 10 & 0x1F;
                int var118 = var116 & 0x1F;
                int var119 = var116 >> 5 & 0x1F;
                class146 var120 = class48.method360(-113, var115);
                class41.field959 = -1;
                var120.field3635 = (var118 << 3) + (var117 << 19) + (var119 << 11);
                return true;
            }
            if (class41.field959 == 55) {
                int var121 = class23.field581.method483((byte) 24);
                if (var121 == 65535) {
                    var121 = -1;
                }
                int var122 = class23.field581.method468((byte) 116);
                int var123 = class23.field581.method498((byte) -95);
                long var124 = ((long) var123 << 32) + (long) var121;
                class41 var126 = class115.field2751.method842(var124, 124);
                if (var126 != null) {
                    var126.method302(arg0 - 16564);
                }
                class115.field2751.method836(var124, (byte) 66, new class8(var122));
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 172) {
                long var127 = class23.field581.method444(arg0 ^ 0x509B);
                int var129 = class23.field581.method483((byte) 24);
                int var130 = class23.field581.method480(arg0 ^ 0x509B);
                class135 var131 = class131.method1054(false, var127).method1088((byte) 56);
                for (int var132 = 0; var132 < class79.field1885; var132++) {
                    if (class8.field148[var132] == var127) {
                        if (class94.field2281[var132] != var129) {
                            class94.field2281[var132] = var129;
                            class135.field3239 = true;
                            if (var129 > 0) {
                                class82.method635(5, class113.field2742, (byte) 83, class107.method867(2, new class135[] { var131, class120.field2913 }));
                            }
                            if (var129 == 0) {
                                class82.method635(5, class113.field2742, (byte) 125, class107.method867(2, new class135[] { var131, class139.field3363 }));
                            }
                        }
                        var131 = null;
                        class28.field667[var132] = var130;
                        break;
                    }
                }
                if (var131 != null && class79.field1885 < 200) {
                    class8.field148[class79.field1885] = var127;
                    class23.field563[class79.field1885] = var131;
                    class94.field2281[class79.field1885] = var129;
                    class28.field667[class79.field1885] = var130;
                    class79.field1885++;
                    class53.field1257 = class126.field2998;
                    class135.field3239 = true;
                }
                boolean var133 = false;
                while (!var133) {
                    var133 = true;
                    for (int var134 = 0; var134 < class79.field1885 - 1; var134++) {
                        if (class94.field2281[var134] != class52.field1240 && class94.field2281[var134 + 1] == class52.field1240 || class94.field2281[var134] == 0 && class94.field2281[var134 + 1] != 0) {
                            int var135 = class94.field2281[var134];
                            class94.field2281[var134] = class94.field2281[var134 + 1];
                            class94.field2281[var134 + 1] = var135;
                            var133 = false;
                            class135 var136 = class23.field563[var134];
                            class23.field563[var134] = class23.field563[var134 + 1];
                            class23.field563[var134 + 1] = var136;
                            long var137 = class8.field148[var134];
                            class8.field148[var134] = class8.field148[var134 + 1];
                            class8.field148[var134 + 1] = var137;
                            int var139 = class28.field667[var134];
                            class28.field667[var134] = class28.field667[var134 + 1];
                            class28.field667[var134 + 1] = var139;
                            class135.field3239 = true;
                        }
                    }
                }
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 60) {
                int var140 = class23.field581.method468((byte) 98);
                class146 var141 = class48.method360(arg0 - 20740, var140);
                var141.field3551 = 3;
                var141.field3625 = class116.field2789.field3526.method203((byte) -74);
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 211) {
                class42.field969 = class23.field581.method469(-128);
                class133.field3215 = class23.field581.method484((byte) 127);
                while (class23.field581.field1485 < class21.field499) {
                    class41.field959 = class23.field581.method480(arg0 ^ 0x509B);
                    class93.method756(arg0 + 190380745);
                }
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 137) {
                int var142 = class23.field581.method498((byte) -75);
                class22.field546 = class41.field965.method223(var142, false);
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 23) {
                int var143 = class23.field581.method483((byte) 24);
                if (var143 == 65535) {
                    var143 = -1;
                }
                method621(arg0 ^ 0x50F1, var143);
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 145) {
                int var144 = class23.field581.method455(true);
                int var145 = class23.field581.method483((byte) 24);
                if (var145 == 65535) {
                    var145 = -1;
                }
                class122.method964(67, var144, var145);
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 234) {
                class135 var146 = class23.field581.method496(-122);
                int var147 = class23.field581.method468((byte) -43);
                class146 var148 = class48.method360(-75, var147);
                var148.field3568 = var146;
                if (var147 >> 16 == class21.field491[class49.field1167]) {
                    class135.field3239 = true;
                }
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 205) {
                class135.field3239 = true;
                int var149 = class23.field581.method498((byte) 124);
                int var150 = class23.field581.method483((byte) 24);
                if (var149 < -70000) {
                    var150 += 32768;
                }
                class146 var151;
                if (var149 >= 0) {
                    var151 = class48.method360(arg0 ^ 0xFFFFAF30, var149);
                } else {
                    var151 = null;
                }
                while (class21.field499 > class23.field581.field1485) {
                    int var152 = class23.field581.method450((byte) -71);
                    int var153 = class23.field581.method483((byte) 24);
                    int var154 = 0;
                    if (var153 != 0) {
                        var154 = class23.field581.method480(0);
                        if (var154 == 255) {
                            var154 = class23.field581.method498((byte) 122);
                        }
                    }
                    if (var151 != null && var152 >= 0 && var152 < var151.field3597.length) {
                        var151.field3597[var152] = var153;
                        var151.field3657[var152] = var154;
                    }
                    class106.method861(var153 - 1, arg0 ^ 0xFFFFAF64, var150, var152, var154);
                }
                class41.field959 = -1;
                class53.field1254 = class126.field2998;
                return true;
            }
            if (class41.field959 == 225) {
                class135 var155 = class23.field581.method496(arg0 - 20516);
                if (var155.method1092(class79.field1888, -126)) {
                    class135 var156 = var155.method1074(0, var155.method1090((byte) 64, class138.field3345), arg0 - 47725);
                    long var157 = var156.method1064(-22243);
                    boolean var159 = false;
                    for (int var160 = 0; var160 < class119.field2844; var160++) {
                        if (class14.field340[var160] == var157) {
                            var159 = true;
                            break;
                        }
                    }
                    if (!var159 && class135.field3264 == 0) {
                        class82.method635(4, var156, (byte) 121, class102.field2475);
                    }
                } else if (var155.method1092(class2.field68, -126)) {
                    class135 var161 = var155.method1074(0, var155.method1090((byte) 64, class138.field3345), -27090);
                    long var162 = var161.method1064(-22243);
                    boolean var164 = false;
                    for (int var165 = 0; var165 < class119.field2844; var165++) {
                        if (class14.field340[var165] == var162) {
                            var164 = true;
                            break;
                        }
                    }
                    if (!var164 && class135.field3264 == 0) {
                        class82.method635(8, var161, (byte) 96, field1835);
                    }
                } else if (var155.method1092(class135.field3249, -124)) {
                    class135 var166 = var155.method1074(0, var155.method1090((byte) 64, class138.field3345), -27090);
                    long var167 = var166.method1064(arg0 ^ 0xFFFFF986);
                    boolean var169 = false;
                    for (int var170 = 0; var170 < class119.field2844; var170++) {
                        if (class14.field340[var170] == var167) {
                            var169 = true;
                            break;
                        }
                    }
                    if (!var169 && class135.field3264 == 0) {
                        class135 var171 = var155.method1074(var155.method1090((byte) 64, class138.field3345) + 1, var155.method1063(-64) - 9, -27090);
                        class82.method635(8, var166, (byte) 114, var171);
                    }
                } else {
                    class82.method635(0, class113.field2742, (byte) 107, var155);
                }
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 155) {
                class135.field3239 = true;
                int var172 = class23.field581.method456((byte) 98);
                int var173 = class23.field581.method498((byte) -127);
                int var174 = class23.field581.method484((byte) 123);
                class128.field3088[var172] = var173;
                class85.field2025[var172] = var174;
                class120.field2895[var172] = 1;
                for (int var175 = 0; var175 < 98; var175++) {
                    if (class99.field2398[var175] <= var173) {
                        class120.field2895[var172] = var175 + 2;
                    }
                }
                class116.field2777 = class126.field2998;
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 243) {
                class135.field3239 = true;
                int var176 = class23.field581.method498((byte) -112);
                int var177 = class23.field581.method483((byte) 24);
                class146 var178;
                if (var176 >= 0) {
                    var178 = class48.method360(-75, var176);
                } else {
                    var178 = null;
                }
                if (var178 != null) {
                    for (int var179 = 0; var179 < var178.field3597.length; var179++) {
                        var178.field3597[var179] = 0;
                        var178.field3657[var179] = 0;
                    }
                }
                if (var176 < -70000) {
                    var177 += 32768;
                }
                class53.method409(var177, -9);
                int var180 = class23.field581.method483((byte) 24);
                for (int var181 = 0; var181 < var180; var181++) {
                    int var182 = class23.field581.method484((byte) 119);
                    if (var182 == 255) {
                        var182 = class23.field581.method468((byte) 111);
                    }
                    int var183 = class23.field581.method472((byte) -71);
                    if (var178 != null && var178.field3597.length > var181) {
                        var178.field3597[var181] = var183;
                        var178.field3657[var181] = var182;
                    }
                    class106.method861(var183 - 1, -1, var177, var181, var182);
                }
                class41.field959 = -1;
                class53.field1254 = class126.field2998;
                return true;
            }
            if (class41.field959 == 3) {
                class38.method287(arg0 - 20653);
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 35) {
                int var184 = class23.field581.method472((byte) -86);
                int var185 = class23.field581.method488(-28134);
                if (class49.field1174 != -1) {
                    class148.method1213(class49.field1174, (byte) -105);
                    class49.field1174 = -1;
                    class65.field1634 = true;
                }
                if (class19.field425 != -1) {
                    class148.method1213(class19.field425, (byte) -57);
                    class19.field425 = -1;
                    class125.method978(30, 1);
                }
                if (class115.field2752 != -1) {
                    class148.method1213(class115.field2752, (byte) -76);
                    class115.field2752 = -1;
                }
                if (class106.field2552 == var185) {
                    class143.method1175(class106.field2552, -116);
                } else {
                    class148.method1213(class106.field2552, (byte) -51);
                    class106.field2552 = var185;
                }
                if (class80.field1900 == var184) {
                    class143.method1175(class80.field1900, -118);
                } else {
                    class148.method1213(class80.field1900, (byte) -43);
                    class80.field1900 = var184;
                }
                class104.field2507 = -1;
                if (class42.field975 != 0) {
                    class42.field975 = 0;
                    class65.field1634 = true;
                }
                class135.field3239 = true;
                class10.field244 = true;
                class151.method1219(class106.field2552, (byte) 127);
                class151.method1219(class80.field1900, (byte) 124);
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 245) {
                if (class49.field1174 != -1) {
                    class148.method1213(class49.field1174, (byte) -103);
                    class49.field1174 = -1;
                }
                class65.field1634 = true;
                class42.field975 = 1;
                class113.field2722 = class113.field2742;
                class34.field789 = false;
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 19) {
                for (int var186 = 0; var186 < class104.field2513.length; var186++) {
                    if (class52.field1226[var186] != class104.field2513[var186]) {
                        class104.field2513[var186] = class52.field1226[var186];
                        class48.method366(var186, -126);
                        class135.field3239 = true;
                    }
                }
                class53.field1257 = class126.field2998;
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 127) {
                for (int var187 = 0; var187 < class60.field1526; var187++) {
                    class53 var188 = class42.method316(var187, 6);
                    if (var188 != null && var188.field1255 == 0) {
                        class52.field1226[var187] = 0;
                        class104.field2513[var187] = 0;
                    }
                }
                class41.field959 = -1;
                class53.field1257 = class126.field2998;
                if (class99.field2384 != -1) {
                    class65.field1634 = true;
                }
                class135.field3239 = true;
                return true;
            }
            if (class41.field959 == 171) {
                class119.field2844 = class21.field499 / 8;
                for (int var189 = 0; var189 < class119.field2844; var189++) {
                    class14.field340[var189] = class23.field581.method444(arg0 - 20635);
                }
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 0) {
                class59.method492(class23.field581, 127, class21.field499, class41.field965);
                class41.field959 = -1;
                return true;
            }
            if (class41.field959 == 73) {
                if (class49.field1167 == 12) {
                    class135.field3239 = true;
                }
                class26.field628 = class23.field581.method480(0);
                class41.field959 = -1;
                return true;
            }
            class34.method267("T1 - " + class41.field959 + "," + class113.field2743 + "," + class5.field124 + " - " + class21.field499, 35, null);
            class145.method1190(-61);
        } catch (IOException var193) {
            class95.method779(-16);
        } catch (Exception var194) {
            String var191 = "T2 - " + class41.field959 + "," + class113.field2743 + "," + class5.field124 + " - " + class21.field499 + "," + (class116.field2789.field192[0] + class126.field3010) + "," + (class76.field1795 + class116.field2789.field162[0]) + " - ";
            for (int var192 = 0; class21.field499 > var192 && var192 < 50; var192++) {
                var191 = var191 + class23.field581.field1495[var192] + ",";
            }
            class34.method267(var191, 35, var194);
            class145.method1190(-108);
        }
        return true;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III)Z")
    public static final boolean method614(int arg0, int arg1, int arg2) {
        field1818++;
        if (arg1 == 20809) {
            return (arg0 >> arg2 + 1 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public static void method615(byte arg0) {
        field1832 = null;
        field1833 = null;
        field1822 = null;
        field1806 = null;
        field1834 = null;
        field1826 = null;
        field1821 = null;
        field1835 = null;
        field1831 = null;
        field1809 = null;
        field1829 = null;
        field1827 = null;
        field1828 = null;
        field1814 = null;
        if (arg0 != 48) {
            method613(42);
        }
        field1830 = null;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
    public static final void method616(int arg0) {
        if (arg0 > -114) {
            method616(-86);
        }
        field1808++;
        if (class32.field760 != 0 || class119.field2828 != null) {
            return;
        }
        int var1 = class48.field1151;
        if (class8.field143 && class139.field3389 >= 516 && class20.field470 >= 160 && class139.field3389 <= 765 && class20.field470 <= 205) {
            var1 = 0;
        }
        if (!class128.field3077) {
            if (var1 == 1 && class131.field3135 > 0) {
                int var2 = class69.field1706[class131.field3135 - 1];
                if (var2 == 8 || var2 == 1 || var2 == 17 || var2 == 19 || var2 == 34 || var2 == 18 || var2 == 36 || var2 == 57 || var2 == 47 || var2 == 31 || var2 == 29 || var2 == 1002) {
                    int var3 = class65.field1632[class131.field3135 - 1];
                    int var4 = class93.field2202[class131.field3135 - 1];
                    class146 var5 = class48.method360(-70, var4);
                    if (class101.method834(class23.method196(var5, (byte) -123), false) || class96.method792(class23.method196(var5, (byte) -124), 708440092)) {
                        class32.field753 = false;
                        class32.field760 = 2;
                        if (var4 >> 16 == class106.field2552) {
                            class32.field760 = 1;
                        }
                        if (var4 >> 16 == class49.field1174) {
                            class32.field760 = 3;
                        }
                        class32.field749 = var4;
                        class14.field314 = 0;
                        class68.field1656 = class139.field3389;
                        class69.field1695 = class20.field470;
                        class12.field293 = var3;
                        return;
                    }
                }
            }
            if (var1 == 1 && (class152.field3747 == 1 || class8.method40(class131.field3135 - 1, -58)) && class131.field3135 > 2) {
                var1 = 2;
            }
            if (var1 == 1 && class131.field3135 > 0) {
                class34.method271((byte) 107, class131.field3135 - 1);
            }
            if (var1 == 2 && class131.field3135 > 0) {
                class122.method963(0);
                return;
            }
            return;
        }
        if (var1 != 1) {
            int var6 = class76.field1798;
            int var7 = class53.field1278;
            if (class94.field2237 == 0) {
                var7 -= 4;
                var6 -= 4;
            }
            if (class94.field2237 == 1) {
                var7 -= 553;
                var6 -= 205;
            }
            if (class94.field2237 == 2) {
                var7 -= 17;
                var6 -= 357;
            }
            if (var7 < class80.field1908 - 10 || var7 > class80.field1908 + class12.field289 + 10 || class14.field331 - 10 > var6 || class28.field676 + class14.field331 + 10 < var6) {
                if (class94.field2237 == 1) {
                    class135.field3239 = true;
                }
                class128.field3077 = false;
                if (class94.field2237 == 2) {
                    class65.field1634 = true;
                }
            }
        }
        if (var1 != 1) {
            return;
        }
        int var8 = class80.field1908;
        int var9 = class14.field331;
        int var10 = class12.field289;
        int var11 = class139.field3389;
        int var12 = class20.field470;
        if (class94.field2237 == 0) {
            var12 -= 4;
            var11 -= 4;
        }
        int var13 = -1;
        if (class94.field2237 == 1) {
            var12 -= 205;
            var11 -= 553;
        }
        if (class94.field2237 == 2) {
            var11 -= 17;
            var12 -= 357;
        }
        for (int var14 = 0; var14 < class131.field3135; var14++) {
            int var15 = (class131.field3135 - var14 - 1) * 15 + var9 + 31;
            if (var8 < var11 && var8 + var10 > var11 && var15 - 13 < var12 && var15 + 3 > var12) {
                var13 = var14;
            }
        }
        if (var13 != -1) {
            class34.method271((byte) 113, var13);
        }
        class128.field3077 = false;
        if (class94.field2237 == 2) {
            class65.field1634 = true;
        }
        if (class94.field2237 != 1) {
            return;
        }
        class135.field3239 = true;
    }

    @OriginalMember(owner = "client!la", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field1819++;
        if (class46.field1103 != null) {
            class56.field1358 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class138.field3343.length > var2) {
                var3 = class138.field3343[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            int var4;
            if (var3 == 85 || var3 == 80 || var3 == 84 || var3 == 0 || var3 == 101) {
                var4 = -1;
            } else {
                var4 = class102.method835((byte) 125, arg0);
            }
            if (class143.field3503 >= 0 && var3 >= 0) {
                class25.field621[class143.field3503] = var3;
                class143.field3503 = class143.field3503 + 1 & 0x7F;
                if (class148.field3705 == class143.field3503) {
                    class143.field3503 = -1;
                }
            }
            if (var3 >= 0 || var4 >= 0) {
                int var5 = class57.field1406 + 1 & 0x7F;
                if (class1.field15 != var5) {
                    class131.field3167[class57.field1406] = var3;
                    class2.field58[class57.field1406] = var4;
                    class57.field1406 = var5;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!la", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field1811++;
        if (class46.field1103 != null) {
            class143.field3503 = -1;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIB)I")
    public static final int method617(int arg0, int arg1, byte arg2) {
        field1815++;
        int var3 = 0;
        while (arg1 > 0) {
            var3 = arg0 & 0x1 | var3 << 1;
            arg1--;
            arg0 >>>= 0x1;
        }
        if (arg2 < 59) {
            field1835 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lve;I)Z")
    public static final boolean method618(class146 arg0, int arg1) {
        field1820++;
        if (arg1 != -1) {
            field1835 = null;
        }
        if (class82.field1920) {
            if (class23.method196(arg0, (byte) -123) != 0) {
                return false;
            }
            if (arg0.field3564 == 0) {
                return false;
            }
        }
        return arg0.field3578;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V")
    public static final void method619(byte arg0) {
        field1816++;
        if (class32.field760 != 0) {
            return;
        }
        class69.field1706[0] = 1004;
        class131.field3135 = 1;
        class108.field2599[0] = class32.field756;
        if (class19.field425 != -1) {
            class129.field3107 = -1;
            class60.field1531 = -1;
            class116.method928(503, (byte) 43, 0, class19.field425, class76.field1798, 765, 0, class53.field1278, 0);
            class42.field996 = class60.field1531;
            class15.field365 = class129.field3107;
            return;
        }
        class48.method364(0);
        class60.field1531 = -1;
        class129.field3107 = -1;
        if (class53.field1278 > 4 && class76.field1798 > 4 && class53.field1278 < 516 && class76.field1798 < 338) {
            if (class106.field2552 == -1) {
                class145.method1185(22907);
            } else {
                class116.method928(338, (byte) 40, 4, class106.field2552, class76.field1798, 516, 0, class53.field1278, 4);
            }
        }
        class42.field996 = class60.field1531;
        class15.field365 = class129.field3107;
        boolean var1 = false;
        class129.field3107 = -1;
        class60.field1531 = -1;
        if (class53.field1278 > 553 && class76.field1798 > 205 && class53.field1278 < 743 && class76.field1798 < 466) {
            if (class80.field1900 != -1) {
                class116.method928(466, (byte) -114, 553, class80.field1900, class76.field1798, 743, 1, class53.field1278, 205);
            } else if (class21.field491[class49.field1167] != -1) {
                class116.method928(466, (byte) -107, 553, class21.field491[class49.field1167], class76.field1798, 743, 1, class53.field1278, 205);
            }
        }
        if (class135.field3233 != class129.field3107) {
            class135.field3233 = class129.field3107;
            class135.field3239 = true;
        }
        class129.field3107 = -1;
        if (class60.field1531 != class44.field1074) {
            class44.field1074 = class60.field1531;
            class135.field3239 = true;
        }
        class60.field1531 = -1;
        if (class53.field1278 > 17 && class76.field1798 > 357 && class53.field1278 < 496 && class76.field1798 < 453) {
            if (class49.field1174 != -1) {
                class116.method928(453, (byte) -102, 17, class49.field1174, class76.field1798, 496, 2, class53.field1278, 357);
            } else if (class99.field2384 != -1) {
                class116.method928(453, (byte) -127, 17, class99.field2384, class76.field1798, 496, 3, class53.field1278, 357);
            } else if (class76.field1798 < 434 && class53.field1278 < 426) {
                class17.method109((byte) 80, class76.field1798 - 357, class53.field1278 - 17);
            }
        }
        if ((class49.field1174 != -1 || class99.field2384 != -1) && class136.field3294 != class129.field3107) {
            class65.field1634 = true;
            class136.field3294 = class129.field3107;
        }
        if (arg0 != 22) {
            return;
        }
        if ((class49.field1174 != -1 || class99.field2384 != -1) && class60.field1531 != class22.field538) {
            class22.field538 = class60.field1531;
            class65.field1634 = true;
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class131.field3135 - 1; var2++) {
                if (class69.field1706[var2] < 1000 && class69.field1706[var2 + 1] > 1000) {
                    var1 = false;
                    class135 var3 = class108.field2599[var2];
                    class108.field2599[var2] = class108.field2599[var2 + 1];
                    class108.field2599[var2 + 1] = var3;
                    int var4 = class69.field1706[var2];
                    class69.field1706[var2] = class69.field1706[var2 + 1];
                    class69.field1706[var2 + 1] = var4;
                    int var5 = class65.field1632[var2];
                    class65.field1632[var2] = class65.field1632[var2 + 1];
                    class65.field1632[var2 + 1] = var5;
                    int var6 = class93.field2202[var2];
                    class93.field2202[var2] = class93.field2202[var2 + 1];
                    class93.field2202[var2 + 1] = var6;
                    int var7 = class104.field2514[var2];
                    class104.field2514[var2] = class104.field2514[var2 + 1];
                    class104.field2514[var2 + 1] = var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field1810++;
        if (class46.field1103 != null) {
            class56.field1358 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class138.field3343.length > var2) {
                var3 = class138.field3343[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class143.field3503 >= 0 && var3 >= 0) {
                class25.field621[class143.field3503] = ~var3;
                class143.field3503 = class143.field3503 + 1 & 0x7F;
                if (class148.field3705 == class143.field3503) {
                    class143.field3503 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Lu;")
    public static final class135 method620(int arg0, int arg1) {
        int var2 = -81 % ((arg1 + 41) / 39);
        field1823++;
        if (arg0 < 100000) {
            return class68.method547(-1, arg0);
        } else if (arg0 < 10000000) {
            return class107.method867(2, new class135[] { class68.method547(-1, arg0 / 1000), class1.field5 });
        } else {
            return class107.method867(2, new class135[] { class68.method547(-1, arg0 / 1000000), class2.field66 });
        }
    }

    @OriginalMember(owner = "client!la", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1812++;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(II)V")
    public static final void method621(int arg0, int arg1) {
        int var2 = -82 / ((arg0 + 28) / 47);
        field1813++;
        if (arg1 == -1 && !class69.field1709) {
            class103.method844(-12);
        } else if (arg1 != -1 && class78.field1848 != arg1 && class84.field1996 != 0 && !class69.field1709) {
            class55.method426(false, class41.field956, (byte) 105, 0, arg1, class84.field1996, 2);
        }
        class78.field1848 = arg1;
    }
}

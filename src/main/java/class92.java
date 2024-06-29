import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class92 extends Canvas {

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "Ljava/awt/Component;")
    private Component field1979;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "[I")
    public static int[] field1973 = new int[2048];

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field1974 = 0;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "Lpe;")
    private static class109 field1972 = class141.method1120("Use", 0);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "[I")
    public static int[] field1968 = new int[25];

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "Lpe;")
    private static class109 field1986 = class141.method1120("The server is being updated)3", 0);

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "[[[Lcd;")
    public static class19[][][] field1987 = new class19[4][104][104];

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "Lpe;")
    public static class109 field1985 = field1986;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "Lpe;")
    private static class109 field1981 = class141.method1120("Loaded fonts", 0);

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "Lpe;")
    public static class109 field1978 = class141.method1120("sl_button", 0);

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "Lpe;")
    public static class109 field1982 = field1972;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
    public static int field1990 = 0;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "Lpe;")
    public static class109 field1988 = field1981;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "Lpe;")
    private static class109 field1989 = class141.method1120("Please use a different world)3", 0);

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public static int field1991 = 0;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Lpe;")
    public static class109 field1969 = field1989;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "Lpe;")
    public static class109 field1984 = field1989;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
    public static int field1992 = 0;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "Lce;")
    public static class20 field1976;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "[[B")
    public static byte[][] field1970;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)V")
    public static final void method767(byte arg0, int arg1) {
        field1983++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class102.field2148[arg1];
        int var3 = class135.field2947[arg1];
        int var4 = class149.field3285[arg1];
        int var5 = class57.field1149[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        if (var4 == 20) {
            class63.field1299.method535(112, -25013);
            class63.field1299.method129(false, var2);
            class63.field1299.method134(var5, (byte) 124);
            class63.field1299.method123(var3, 1375221240);
            class13.field303 = 0;
            class35.field786 = class44.method403(var3, true);
            class7.field179++;
            class110.field2347 = var2;
        }
        if (var4 == 25) {
            class154 var6 = class102.method821(var3, true, var2);
            if (var6 != null) {
                class44.method402((byte) 34);
                class67.method522(-99, var2, class101.method817(21599, class136.method1084(0, var6)), var3);
                class135.field2936 = 0;
                class123.field2698 = class128.method1037(var6, (byte) -99);
                if (class123.field2698 == null) {
                    class123.field2698 = class133.field2911;
                }
                if (var6.field3473) {
                    class25.field621 = class44.method405(new class109[] { var6.field3452, class126.field2803 }, (byte) -74);
                    return;
                }
                class25.field621 = class44.method405(new class109[] { class78.field1644, var6.field3415, class126.field2803 }, (byte) -74);
            }
            return;
        }
        if (var4 == 24) {
            class50 var7 = class104.field2194[var5];
            if (var7 != null) {
                class86.method722(var7.field3121[0], 1, 127, 0, 1, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var7.field3120[0], false);
                class148.field3265++;
                class16.field400 = 2;
                class63.field1303 = class115.field2538;
                class16.field408 = 0;
                class116.field2590 = class120.field2671;
                class63.field1299.method535(241, -25013);
                class63.field1299.method109((byte) 47, var5);
            }
        }
        if (var4 == 22) {
            class19.field493++;
            boolean var8 = class86.method722(var3, 0, 126, 0, 0, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var2, false);
            if (!var8) {
                class86.method722(var3, 1, 126, 0, 1, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var2, false);
            }
            class63.field1303 = class115.field2538;
            class116.field2590 = class120.field2671;
            class16.field400 = 2;
            class16.field408 = 0;
            class63.field1299.method535(140, -25013);
            class63.field1299.method134(class43.field917 + var2, (byte) 76);
            class63.field1299.method109((byte) 47, var5);
            class63.field1299.method109((byte) 47, class82.field1736 + var3);
        }
        if (var4 == 18 || var4 == 1003) {
            class122.method989(class101.field2135[arg1], var3, (byte) -59, var5, var2);
        }
        if (var4 == 36) {
            class108 var10 = class52.field1067[var5];
            if (var10 != null) {
                class86.method722(var10.field3121[0], 1, 126, 0, 1, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var10.field3120[0], false);
                class63.field1303 = class115.field2538;
                class116.field2590 = class120.field2671;
                class16.field400 = 2;
                class104.field2186++;
                class16.field408 = 0;
                class63.field1299.method535(174, -25013);
                class63.field1299.method129(false, class135.field2956);
                class63.field1299.method110(class139.field3032, (byte) -121);
                class63.field1299.method109((byte) 47, var5);
            }
        }
        if (var4 == 42) {
            class50 var11 = class104.field2194[var5];
            if (var11 != null) {
                class86.method722(var11.field3121[0], 1, 127, 0, 1, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var11.field3120[0], false);
                class63.field1303 = class115.field2538;
                class16.field408 = 0;
                class116.field2590 = class120.field2671;
                class16.field400 = 2;
                class63.field1299.method535(225, -25013);
                class63.field1299.method129(false, var5);
                class136.field2973++;
            }
        }
        if (var4 == 44) {
            class135.field2935++;
            boolean var12 = class86.method722(var3, 0, 126, 0, 0, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var2, false);
            if (!var12) {
                class86.method722(var3, 1, 127, 0, 1, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var2, false);
            }
            class16.field408 = 0;
            class63.field1303 = class115.field2538;
            class116.field2590 = class120.field2671;
            class16.field400 = 2;
            class63.field1299.method535(59, -25013);
            class63.field1299.method134(class43.field917 + var2, (byte) -122);
            class63.field1299.method129(false, var5);
            class63.field1299.method134(class82.field1736 + var3, (byte) -112);
        }
        if (var4 == 1) {
            class63.field1299.method535(145, -25013);
            class63.field1299.method129(false, var2);
            class63.field1299.method109((byte) 47, var5);
            class63.field1299.method123(var3, 1375221240);
            class1.field1++;
            class13.field303 = 0;
            class35.field786 = class44.method403(var3, true);
            class110.field2347 = var2;
        }
        if (var4 == 37) {
            class63.field1299.method535(121, -25013);
            class7.field178++;
            class63.field1299.method123(var3, 1375221240);
            class154 var14 = class44.method403(var3, true);
            if (var14.field3477 != null && var14.field3477[0][0] == 5) {
                int var15 = var14.field3477[0][1];
                class153.field3376[var15] = 1 - class153.field3376[var15];
                class13.method125(var15, true);
            }
        }
        if (var4 == 41) {
            class124.field2738++;
            class1.method10((byte) -25, var3, var5, var2);
            class63.field1299.method535(169, -25013);
            class63.field1299.method109((byte) 47, class82.field1736 + var3);
            class63.field1299.method146(-27303, class43.field917 + var2);
            class63.field1299.method146(-27303, var5 >> 14 & 0x7FFF);
        }
        if (var4 == 1006) {
            class16.field408 = 0;
            class116.field2590 = class120.field2671;
            class82.field1730++;
            class63.field1303 = class115.field2538;
            class16.field400 = 2;
            class63.field1299.method535(217, -25013);
            class63.field1299.method129(false, var5);
        }
        if (var4 == 26) {
            class63.field1299.method535(108, -25013);
            class63.field1299.method134(var2, (byte) 8);
            class1.field8++;
            class63.field1299.method123(var3, 1375221240);
            class63.field1299.method146(-27303, var5);
            class13.field303 = 0;
            class35.field786 = class44.method403(var3, true);
            class110.field2347 = var2;
        }
        if (var4 == 9) {
            class50 var16 = class104.field2194[var5];
            if (var16 != null) {
                class75.field1503++;
                class86.method722(var16.field3121[0], 1, 127, 0, 1, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var16.field3120[0], false);
                class63.field1303 = class115.field2538;
                class116.field2590 = class120.field2671;
                class16.field400 = 2;
                class16.field408 = 0;
                class63.field1299.method535(186, -25013);
                class63.field1299.method134(var5, (byte) 43);
                class63.field1299.method118(class139.field3032, 675269912);
                class63.field1299.method134(class135.field2956, (byte) -100);
            }
        }
        if (var4 == 43) {
            class108 var17 = class52.field1067[var5];
            if (var17 != null) {
                class139.field3024++;
                class86.method722(var17.field3121[0], 1, 127, 0, 1, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var17.field3120[0], false);
                class16.field408 = 0;
                class63.field1303 = class115.field2538;
                class16.field400 = 2;
                class116.field2590 = class120.field2671;
                class63.field1299.method535(58, -25013);
                class63.field1299.method109((byte) 47, var5);
                class63.field1299.method109((byte) 47, class158.field3660);
                class63.field1299.method134(client.field532, (byte) -119);
                class63.field1299.method156(false, class123.field2733);
            }
        }
        if (var4 == 23) {
            class135.field2941++;
            class63.field1299.method535(53, -25013);
            class63.field1299.method123(var3, 1375221240);
            class63.field1299.method134(class158.field3660, (byte) -95);
            class63.field1299.method156(false, class123.field2733);
            class63.field1299.method134(var2, (byte) 52);
            class63.field1299.method134(client.field532, (byte) 42);
            class63.field1299.method146(-27303, var5);
            class13.field303 = 0;
            class35.field786 = class44.method403(var3, true);
            class110.field2347 = var2;
        }
        if (var4 == 12 && class121.field2679 == null) {
            class72.method577((byte) 120, var3, var2);
            class121.field2679 = class102.method821(var3, true, var2);
            class138.method1092(0, class121.field2679);
        }
        if (var4 == 14) {
            class1.method10((byte) -25, var3, var5, var2);
            class63.field1299.method535(48, -25013);
            class63.field1299.method129(false, var5 >> 14 & 0x7FFF);
            class8.field198++;
            class63.field1299.method146(-27303, class82.field1736 + var3);
            class63.field1299.method146(-27303, class43.field917 + var2);
        }
        if (var4 == 30) {
            class154.field3411++;
            class63.field1299.method535(243, -25013);
            class63.field1299.method146(-27303, var2);
            class63.field1299.method123(var3, 1375221240);
            class63.field1299.method109((byte) 47, var5);
            class13.field303 = 0;
            class35.field786 = class44.method403(var3, true);
            class110.field2347 = var2;
        }
        if (var4 == 15) {
            class63.field1299.method535(13, -25013);
            class107.field2244++;
            class63.field1299.method146(-27303, var5);
            class63.field1299.method129(false, var2);
            class63.field1299.method110(var3, (byte) -46);
            class13.field303 = 0;
            class35.field786 = class44.method403(var3, true);
            class110.field2347 = var2;
        }
        if (var4 == 58) {
            class104.field2189++;
            boolean var18 = class86.method722(var3, 0, 127, 0, 0, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var2, false);
            if (!var18) {
                class86.method722(var3, 1, 127, 0, 1, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var2, false);
            }
            class16.field408 = 0;
            class63.field1303 = class115.field2538;
            class16.field400 = 2;
            class116.field2590 = class120.field2671;
            class63.field1299.method535(98, -25013);
            class63.field1299.method134(class43.field917 + var2, (byte) 66);
            class63.field1299.method109((byte) 47, var3 + class82.field1736);
            class63.field1299.method109((byte) 47, var5);
        }
        if (var4 == 40) {
            class147.field3201.method684(class75.field1513, var2, var3);
        }
        if (var4 == 45) {
            class154 var20 = class44.method403(var3, true);
            boolean var21 = true;
            if (var20.field3459 > 0) {
                var21 = class24.method225(-325, var20);
            }
            if (var21) {
                class63.field1299.method535(121, -25013);
                class7.field178++;
                class63.field1299.method123(var3, 1375221240);
            }
        }
        if (var4 == 34) {
            class123.method1001(1);
        }
        if (var4 == 8) {
            class1.method10((byte) -25, var3, var5, var2);
            class158.field3657++;
            class63.field1299.method535(255, -25013);
            class63.field1299.method134(class82.field1736 + var3, (byte) 106);
            class63.field1299.method134(class43.field917 + var2, (byte) 97);
            class63.field1299.method134(var5 >> 14 & 0x7FFF, (byte) 89);
        }
        if (var4 == 1001) {
            class154 var22 = class44.method403(var3, true);
            if (var22 == null || var22.field3450[var2] < 100000) {
                class63.field1299.method535(217, -25013);
                class63.field1299.method129(false, var5);
                class82.field1730++;
            } else {
                class75.method593(0, class131.field2866, -8870, class44.method405(new class109[] { class143.method1132(var22.field3450[var2], 123), class15.field398, class4.method43((byte) 94, var5).field2381 }, (byte) -74));
            }
            class13.field303 = 0;
            class35.field786 = class44.method403(var3, true);
            class110.field2347 = var2;
        }
        if (var4 == 5) {
            class123.field2722++;
            boolean var23 = class86.method722(var3, 0, 126, 0, 0, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var2, false);
            if (!var23) {
                class86.method722(var3, 1, 126, 0, 1, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var2, false);
            }
            class16.field400 = 2;
            class16.field408 = 0;
            class63.field1303 = class115.field2538;
            class116.field2590 = class120.field2671;
            class63.field1299.method535(185, -25013);
            class63.field1299.method129(false, var5);
            class63.field1299.method129(false, var3 + class82.field1736);
            class63.field1299.method134(class43.field917 + var2, (byte) -92);
        }
        if (var4 == 13) {
            class50 var25 = class104.field2194[var5];
            if (var25 != null) {
                class18.field440++;
                class86.method722(var25.field3121[0], 1, 127, 0, 1, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var25.field3120[0], false);
                class16.field408 = 0;
                class16.field400 = 2;
                class63.field1303 = class115.field2538;
                class116.field2590 = class120.field2671;
                class63.field1299.method535(83, -25013);
                class63.field1299.method129(false, var5);
            }
        }
        if (var4 == 1002) {
            class1.method10((byte) -25, var3, var5, var2);
            class63.field1299.method535(10, -25013);
            class143.field3148++;
            class63.field1299.method134(class43.field917 + var2, (byte) 103);
            class63.field1299.method146(-27303, var3 + class82.field1736);
            class63.field1299.method129(false, var5 >> 14 & 0x7FFF);
        }
        if (var4 == 16) {
            class63.field1299.method535(31, -25013);
            class158.field3647++;
            class63.field1299.method129(false, var5);
            class63.field1299.method156(false, var3);
            class63.field1299.method109((byte) 47, class135.field2956);
            class63.field1299.method129(false, var2);
            class63.field1299.method156(false, class139.field3032);
            class13.field303 = 0;
            class35.field786 = class44.method403(var3, true);
            class110.field2347 = var2;
        }
        if (var4 == 48) {
            class108 var26 = class52.field1067[var5];
            if (var26 != null) {
                class118.field2601++;
                class86.method722(var26.field3121[0], 1, 126, 0, 1, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var26.field3120[0], false);
                class116.field2590 = class120.field2671;
                class16.field408 = 0;
                class63.field1303 = class115.field2538;
                class16.field400 = 2;
                class63.field1299.method535(123, -25013);
                class63.field1299.method134(var5, (byte) 77);
            }
        }
        if (var4 == 6) {
            class50 var27 = class104.field2194[var5];
            if (var27 != null) {
                class11.field241++;
                class86.method722(var27.field3121[0], 1, 127, 0, 1, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var27.field3120[0], false);
                class63.field1303 = class115.field2538;
                class116.field2590 = class120.field2671;
                class16.field400 = 2;
                class16.field408 = 0;
                class63.field1299.method535(168, -25013);
                class63.field1299.method129(false, var5);
            }
        }
        if (var4 == 4) {
            boolean var28 = class86.method722(var3, 0, 127, 0, 0, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var2, false);
            if (!var28) {
                class86.method722(var3, 1, 127, 0, 1, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var2, false);
            }
            class95.field2048++;
            class63.field1303 = class115.field2538;
            class116.field2590 = class120.field2671;
            class16.field400 = 2;
            class16.field408 = 0;
            class63.field1299.method535(105, -25013);
            class63.field1299.method129(false, client.field532);
            class63.field1299.method110(class123.field2733, (byte) 121);
            class63.field1299.method146(-27303, var5);
            class63.field1299.method129(false, class43.field917 + var2);
            class63.field1299.method109((byte) 47, class82.field1736 + var3);
            class63.field1299.method129(false, class158.field3660);
        }
        if (var4 == 28) {
            class85.field1798++;
            class1.method10((byte) -25, var3, var5, var2);
            class63.field1299.method535(96, -25013);
            class63.field1299.method146(-27303, var5 >> 14 & 0x7FFF);
            class63.field1299.method129(false, class43.field917 + var2);
            class63.field1299.method146(-27303, class82.field1736 + var3);
        }
        if (var4 == 21) {
            class50 var30 = class104.field2194[var5];
            if (var30 != null) {
                class4.field99++;
                class86.method722(var30.field3121[0], 1, 126, 0, 1, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var30.field3120[0], false);
                class16.field408 = 0;
                class116.field2590 = class120.field2671;
                class16.field400 = 2;
                class63.field1303 = class115.field2538;
                class63.field1299.method535(178, -25013);
                class63.field1299.method129(false, var5);
            }
        }
        if (var4 == 57) {
            class50 var31 = class104.field2194[var5];
            if (var31 != null) {
                class86.method722(var31.field3121[0], 1, 126, 0, 1, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var31.field3120[0], false);
                class126.field2790++;
                class16.field408 = 0;
                class16.field400 = 2;
                class116.field2590 = class120.field2671;
                class63.field1303 = class115.field2538;
                class63.field1299.method535(244, -25013);
                class63.field1299.method146(-27303, var5);
            }
        }
        if (var4 == 39) {
            class108 var32 = class52.field1067[var5];
            if (var32 != null) {
                class86.method722(var32.field3121[0], 1, 127, 0, 1, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var32.field3120[0], false);
                class136.field2961++;
                class16.field408 = 0;
                class63.field1303 = class115.field2538;
                class116.field2590 = class120.field2671;
                class16.field400 = 2;
                class63.field1299.method535(28, -25013);
                class63.field1299.method134(var5, (byte) -105);
            }
        }
        if (var4 == 10) {
            class86.field1823++;
            class63.field1299.method535(233, -25013);
            class63.field1299.method134(var2, (byte) -102);
            class63.field1299.method134(var5, (byte) 120);
            class63.field1299.method123(var3, 1375221240);
            class13.field303 = 0;
            class35.field786 = class44.method403(var3, true);
            class110.field2347 = var2;
        }
        if (var4 == 29) {
            class50 var33 = class104.field2194[var5];
            if (var33 != null) {
                class7.field169++;
                class86.method722(var33.field3121[0], 1, 126, 0, 1, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var33.field3120[0], false);
                class63.field1303 = class115.field2538;
                class116.field2590 = class120.field2671;
                class16.field408 = 0;
                class16.field400 = 2;
                class63.field1299.method535(102, -25013);
                class63.field1299.method134(var5, (byte) 51);
            }
        }
        if (var4 == 49) {
            class14.field371++;
            boolean var34 = class86.method722(var3, 0, 126, 0, 0, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var2, false);
            if (!var34) {
                class86.method722(var3, 1, 126, 0, 1, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var2, false);
            }
            class116.field2590 = class120.field2671;
            class63.field1303 = class115.field2538;
            class16.field408 = 0;
            class16.field400 = 2;
            class63.field1299.method535(101, -25013);
            class63.field1299.method146(-27303, class82.field1736 + var3);
            class63.field1299.method134(var5, (byte) 53);
            class63.field1299.method146(-27303, class43.field917 + var2);
            class63.field1299.method134(class135.field2956, (byte) -118);
            class63.field1299.method156(false, class139.field3032);
        }
        if (var4 == 47) {
            class156.field3585++;
            boolean var36 = class86.method722(var3, 0, 126, 0, 0, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var2, false);
            if (!var36) {
                class86.method722(var3, 1, 127, 0, 1, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var2, false);
            }
            class16.field400 = 2;
            class63.field1303 = class115.field2538;
            class116.field2590 = class120.field2671;
            class16.field408 = 0;
            class63.field1299.method535(94, -25013);
            class63.field1299.method146(-27303, class82.field1736 + var3);
            class63.field1299.method129(false, var5);
            class63.field1299.method129(false, class43.field917 + var2);
        }
        if (var4 == 33) {
            class63.field1299.method535(176, -25013);
            class134.field2922++;
            class63.field1299.method123(var3, 1375221240);
            class63.field1299.method109((byte) 47, var5);
            class63.field1299.method129(false, var2);
            class13.field303 = 0;
            class35.field786 = class44.method403(var3, true);
            class110.field2347 = var2;
        }
        if (var4 == 35) {
            class48.field996++;
            class63.field1299.method535(164, -25013);
            class63.field1299.method146(-27303, var5);
            class63.field1299.method129(false, var2);
            class63.field1299.method110(var3, (byte) 5);
            class13.field303 = 0;
            class35.field786 = class44.method403(var3, true);
            class110.field2347 = var2;
        }
        if (var4 == 32) {
            class47.field975++;
            class63.field1299.method535(60, -25013);
            class63.field1299.method109((byte) 47, var2);
            class63.field1299.method156(false, class139.field3032);
            class63.field1299.method129(false, class135.field2956);
            class63.field1299.method156(false, var3);
        }
        if (var4 == 1007) {
            class16.field408 = 0;
            class116.field2590 = class120.field2671;
            class16.field400 = 2;
            class63.field1303 = class115.field2538;
            class108 var38 = class52.field1067[var5];
            if (var38 != null) {
                class113 var39 = var38.field2265;
                if (var39.field2470 != null) {
                    var39 = var39.method932(true);
                }
                if (var39 != null) {
                    class17.field425++;
                    class63.field1299.method535(38, -25013);
                    class63.field1299.method134(var39.field2463, (byte) -112);
                }
            }
        }
        if (var4 == 11) {
            class50 var40 = class104.field2194[var5];
            if (var40 != null) {
                class86.method722(var40.field3121[0], 1, 127, 0, 1, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var40.field3120[0], false);
                class116.field2590 = class120.field2671;
                class63.field1303 = class115.field2538;
                class16.field400 = 2;
                class16.field408 = 0;
                class158.field3659++;
                class63.field1299.method535(63, -25013);
                class63.field1299.method109((byte) 47, var5);
            }
        }
        if (var4 == 3) {
            class63.field1299.method535(23, -25013);
            class63.field1299.method146(-27303, var2);
            class63.field1299.method156(false, var3);
            class102.field2145++;
            class63.field1299.method129(false, var5);
            class13.field303 = 0;
            class35.field786 = class44.method403(var3, true);
            class110.field2347 = var2;
        }
        if (var4 == 17 && class1.method10((byte) -25, var3, var5, var2)) {
            class101.field2122++;
            class63.field1299.method535(75, -25013);
            class63.field1299.method109((byte) 47, var5 >> 14 & 0x7FFF);
            class63.field1299.method109((byte) 47, class82.field1736 + var3);
            class63.field1299.method134(client.field532, (byte) -119);
            class63.field1299.method134(class43.field917 + var2, (byte) 119);
            class63.field1299.method129(false, class158.field3660);
            class63.field1299.method156(false, class123.field2733);
        }
        if (var4 == 38) {
            class108 var41 = class52.field1067[var5];
            if (var41 != null) {
                class137.field2996++;
                class86.method722(var41.field3121[0], 1, 126, 0, 1, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var41.field3120[0], false);
                class116.field2590 = class120.field2671;
                class16.field408 = 0;
                class16.field400 = 2;
                class63.field1303 = class115.field2538;
                class63.field1299.method535(187, -25013);
                class63.field1299.method134(var5, (byte) 49);
            }
        }
        if (arg0 >= -25) {
            method769(113, -55, null, 92);
        }
        if (var4 == 51 && class1.method10((byte) -25, var3, var5, var2)) {
            class63.field1299.method535(175, -25013);
            class157.field3611++;
            class63.field1299.method129(false, class135.field2956);
            class63.field1299.method110(class139.field3032, (byte) 120);
            class63.field1299.method146(-27303, class82.field1736 + var3);
            class63.field1299.method129(false, class43.field917 + var2);
            class63.field1299.method134(var5 >> 14 & 0x7FFF, (byte) -116);
        }
        if (var4 == 50) {
            class108 var42 = class52.field1067[var5];
            if (var42 != null) {
                class86.method722(var42.field3121[0], 1, 127, 0, 1, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var42.field3120[0], false);
                class16.field408 = 0;
                class16.field400 = 2;
                class116.field2590 = class120.field2671;
                class63.field1303 = class115.field2538;
                class63.field1299.method535(236, -25013);
                class135.field2946++;
                class63.field1299.method129(false, var5);
            }
        }
        if (var4 == 7) {
            class7.field178++;
            class63.field1299.method535(121, -25013);
            class63.field1299.method123(var3, 1375221240);
            class154 var43 = class44.method403(var3, true);
            if (var43.field3477 != null && var43.field3477[0][0] == 5) {
                int var44 = var43.field3477[0][1];
                if (class153.field3376[var44] != var43.field3389[0]) {
                    class153.field3376[var44] = var43.field3389[0];
                    class13.method125(var44, true);
                }
            }
        }
        if (var4 == 1004) {
            class16.field400 = 2;
            class63.field1303 = class115.field2538;
            class116.field2590 = class120.field2671;
            class38.field833++;
            class16.field408 = 0;
            class63.field1299.method535(242, -25013);
            class63.field1299.method129(false, var5 >> 14 & 0x7FFF);
        }
        if (var4 == 19) {
            class44.method402((byte) 34);
            class154 var45 = class44.method403(var3, true);
            class158.field3660 = var5;
            client.field532 = var2;
            class123.field2733 = var3;
            class135.field2936 = 1;
            class138.method1092(0, var45);
            class20.field500 = class44.method405(new class109[] { class52.field1071, class4.method43((byte) 94, var5).field2381, class126.field2803 }, (byte) -74);
            if (class20.field500 == null) {
                class20.field500 = class147.field3216;
            }
            return;
        }
        if (var4 == 2) {
            class50 var46 = class104.field2194[var5];
            if (var46 != null) {
                class86.method722(var46.field3121[0], 1, 126, 0, 1, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var46.field3120[0], false);
                class16.field408 = 0;
                class125.field2765++;
                class63.field1303 = class115.field2538;
                class16.field400 = 2;
                class116.field2590 = class120.field2671;
                class63.field1299.method535(237, -25013);
                class63.field1299.method109((byte) 47, client.field532);
                class63.field1299.method146(-27303, class158.field3660);
                class63.field1299.method110(class123.field2733, (byte) -89);
                class63.field1299.method146(-27303, var5);
            }
        }
        if (var4 == 46) {
            class63.field1299.method535(116, -25013);
            class75.field1518++;
            class63.field1299.method129(false, var2);
            class63.field1299.method110(var3, (byte) 127);
            class63.field1299.method134(var5, (byte) 106);
            class13.field303 = 0;
            class35.field786 = class44.method403(var3, true);
            class110.field2347 = var2;
        }
        if (var4 == 31) {
            class108 var47 = class52.field1067[var5];
            if (var47 != null) {
                class158.field3650++;
                class86.method722(var47.field3121[0], 1, 127, 0, 1, class136.field2975.field3120[0], 0, 2, 0, class136.field2975.field3121[0], var47.field3120[0], false);
                class63.field1303 = class115.field2538;
                class116.field2590 = class120.field2671;
                class16.field400 = 2;
                class16.field408 = 0;
                class63.field1299.method535(106, -25013);
                class63.field1299.method146(-27303, var5);
            }
        }
        if (class135.field2936 != 0) {
            class135.field2936 = 0;
            class138.method1092(0, class44.method403(class123.field2733, true));
        }
        if (class139.field3031) {
            class44.method402((byte) 34);
        }
        if (class35.field786 != null && class13.field303 == 0) {
            class138.method1092(0, class35.field786);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static void method768(int arg0) {
        field1988 = null;
        field1982 = null;
        int var1 = 112 % ((arg0 - 31) / 43);
        field1986 = null;
        field1976 = null;
        field1981 = null;
        field1969 = null;
        field1968 = null;
        field1973 = null;
        field1987 = null;
        field1984 = null;
        field1970 = null;
        field1989 = null;
        field1978 = null;
        field1985 = null;
        field1972 = null;
    }

    @OriginalMember(owner = "client!nb", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field1977++;
        this.field1979.paint(arg0);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILna;I)Lk;")
    public static final class69 method769(int arg0, int arg1, class91 arg2, int arg3) {
        field1993++;
        if (class12.method100(arg2, arg3, true, arg0)) {
            int var4 = 126 % ((arg1 - 55) / 58);
            return class79.method633(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BZ)V")
    public static final void method770(byte arg0, boolean arg1) {
        class147.method1148(false);
        if (arg0 != -70) {
            field1991 = -20;
        }
        field1980++;
        class133.field2899++;
        if (class133.field2899 < 50 && !arg1) {
            return;
        }
        class133.field2899 = 0;
        if (class153.field3370 || class153.field3363 == null) {
            return;
        }
        class63.field1299.method535(7, -25013);
        try {
            class153.field3363.method87(-122, class63.field1299.field279, class63.field1299.field309, 0);
            class63.field1299.field309 = 0;
        } catch (IOException var2) {
            class153.field3370 = true;
        }
        class115.field2553++;
    }

    @OriginalMember(owner = "client!nb", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1971++;
        this.field1979.update(arg0);
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class92(Component arg0) {
        this.field1979 = arg0;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V")
    public static final void method771(int arg0, int arg1, int arg2) {
        if (arg1 != -761237296) {
            field1987 = null;
        }
        field1975++;
        long var3 = (long) ((arg2 << 16) + arg0);
        class152 var5 = (class152) class8.field193.method505((byte) -46, var3);
        if (var5 != null) {
            class48.field997.method1075(var5, true);
        }
    }
}

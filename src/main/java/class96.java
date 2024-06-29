import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class96 {

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    public int field2335 = -1;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "Lu;")
    private static class135 field2334 = class87.method676((byte) -89, "Loaded title screen");

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "Lu;")
    public static class135 field2327 = field2334;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "Lu;")
    private static class135 field2337 = class87.method676((byte) -127, "glow1:");

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "Lu;")
    public static class135 field2338 = field2337;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "[Lq;")
    public static class111[] field2340 = new class111[32768];

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Lu;")
    public static class135 field2323 = field2337;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "Lbc;")
    public static class11 field2336;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "Lwe;")
    public class152 field2322;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "Z")
    public static boolean field2331;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "[I")
    public int[] field2325;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "[Lu;")
    public class135[] field2333;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static void method787(int arg0) {
        field2327 = null;
        field2334 = null;
        field2323 = null;
        field2338 = null;
        field2337 = null;
        field2340 = null;
        field2336 = null;
        if (arg0 != 0) {
            method789(40, -73, -69, 22, -20, -48, 10, 52);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIILjava/awt/Component;)Lre;")
    public static final class122 method788(int arg0, int arg1, int arg2, Component arg3) {
        field2326++;
        try {
            if (arg1 != 17433) {
                method790((byte) -44);
            }
            Class var4 = Class.forName("be");
            class122 var5 = (class122) var4.getDeclaredConstructor().newInstance();
            var5.method93(arg2, arg0, 22, arg3);
            return var5;
        } catch (Throwable var7) {
            class124 var6 = new class124();
            var6.method93(arg2, arg0, 22, arg3);
            return var6;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method789(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2341++;
        if (class93.method760(arg5 ^ arg5, arg0)) {
            method793(arg7, 0, arg3, -1, (byte) 89, arg2, arg4, arg6, arg1, class105.field2528[arg0], 0);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public static final void method790(byte arg0) {
        if (arg0 != -114) {
            return;
        }
        class93.field2204++;
        field2329++;
        class152.field3751.method929(175, -14044);
        if (class80.field1900 != -1) {
            class148.method1213(class80.field1900, (byte) -77);
            class135.field3239 = true;
            class104.field2507 = -1;
            class80.field1900 = -1;
            class10.field244 = true;
        }
        if (class49.field1174 != -1) {
            class148.method1213(class49.field1174, (byte) -112);
            class104.field2507 = -1;
            class65.field1634 = true;
            class49.field1174 = -1;
        }
        if (class19.field425 != -1) {
            class148.method1213(class19.field425, (byte) -86);
            class19.field425 = -1;
            class125.method978(30, 1);
        }
        if (class115.field2752 != -1) {
            class148.method1213(class115.field2752, (byte) -51);
            class115.field2752 = -1;
        }
        if (class106.field2552 != -1) {
            class148.method1213(class106.field2552, (byte) -55);
            class106.field2552 = -1;
            class104.field2507 = -1;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V")
    public static final void method791(byte arg0) {
        class63.method525(arg0, false);
        class35.field827 = 0;
        field2324++;
        boolean var1 = true;
        for (int var2 = 0; var2 < class68.field1665.length; var2++) {
            if (class109.field2648[var2] != -1 && class68.field1665[var2] == null) {
                class68.field1665[var2] = class141.field3473.method324(0, 0, class109.field2648[var2]);
                if (class68.field1665[var2] == null) {
                    class35.field827++;
                    var1 = false;
                }
            }
            if (class69.field1701[var2] != -1 && class69.field1691[var2] == null) {
                class69.field1691[var2] = class141.field3473.method330(class69.field1701[var2], 0, 255, class3.field93[var2]);
                if (class69.field1691[var2] == null) {
                    var1 = false;
                    class35.field827++;
                }
            }
        }
        if (!var1) {
            class93.field2215 = 1;
            return;
        }
        class75.field1761 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class68.field1665.length; var4++) {
            byte[] var56 = class69.field1691[var4];
            if (var56 != null) {
                int var57 = (class139.field3391[var4] >> 8) * 64 - class126.field3010;
                int var58 = (class139.field3391[var4] & 0xFF) * 64 - class76.field1795;
                if (class44.field1080) {
                    var58 = 10;
                    var57 = 10;
                }
                var3 &= class128.method1040(var57, var58, var56, -17);
            }
        }
        if (!var3) {
            class93.field2215 = 2;
            return;
        }
        if (class93.field2215 != 0) {
            class12.method89(class108.field2606, arg0 ^ 0xFFFFFF72, class10.field236, true);
        }
        class37.method282(true);
        class86.method675(arg0 ^ 0xA7);
        class37.method282(true);
        class100.field2418.method1017();
        class37.method282(true);
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class58.field1437[var5].method817(arg0 - 3);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    client.field525[var6][var54][var55] = 0;
                }
            }
        }
        class37.method282(true);
        class50.method377(95);
        int var7 = class68.field1665.length;
        class79.method625(0);
        class63.method525((byte) -17, true);
        if (!class44.field1080) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class139.field3391[var8] >> 8) * 64 - class126.field3010;
                int var18 = (class139.field3391[var8] & 0xFF) * 64 - class76.field1795;
                byte[] var19 = class68.field1665[var8];
                if (var19 != null) {
                    class37.method282(true);
                    class82.method639(var18, var19, (byte) 120, var17, class58.field1437, class132.field3183 * 8 - 48, class56.field1362 * 8 + -48);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class139.field3391[var9] >> 8) * 64 - class126.field3010;
                int var15 = (class139.field3391[var9] & 0xFF) * 64 - class76.field1795;
                byte[] var16 = class68.field1665[var9];
                if (var16 == null && class56.field1362 < 800) {
                    class37.method282(true);
                    class59.method495(var15, (byte) -112, 64, 64, var14);
                }
            }
            class63.method525((byte) 124, true);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class69.field1691[var10];
                if (var11 != null) {
                    int var12 = (class139.field3391[var10] >> 8) * 64 - class126.field3010;
                    int var13 = (class139.field3391[var10] & 0xFF) * 64 - class76.field1795;
                    class37.method282(true);
                    class143.method1174(var11, var12, class100.field2418, -1, class58.field1437, var13);
                }
            }
        }
        if (class44.field1080) {
            for (int var20 = 0; var20 < 4; var20++) {
                class37.method282(true);
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        int var36 = class53.field1259[var20][var34][var35];
                        boolean var37 = false;
                        if (var36 != -1) {
                            int var38 = var36 >> 24 & 0x3;
                            int var39 = var36 >> 1 & 0x3;
                            int var40 = var36 >> 14 & 0x3FF;
                            int var41 = var36 >> 3 & 0x7FF;
                            int var42 = (var40 / 8 << 8) + var41 / 8;
                            for (int var43 = 0; var43 < class139.field3391.length; var43++) {
                                if (class139.field3391[var43] == var42 && class68.field1665[var43] != null) {
                                    class124.method974(var38, false, class68.field1665[var43], var35 * 8, (var41 & 0x7) * 8, var39, var20, (var40 & 0x7) * 8, class58.field1437, var34 * 8);
                                    var37 = true;
                                    break;
                                }
                            }
                        }
                        if (!var37) {
                            class148.method1211(arg0 - 20060, var35 * 8, var20, var34 * 8);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class53.field1259[0][var21][var32];
                    if (var33 == -1) {
                        class59.method495(var32 * 8, (byte) -103, 8, 8, var21 * 8);
                    }
                }
            }
            class63.method525((byte) 125, true);
            for (int var22 = 0; var22 < 4; var22++) {
                class37.method282(true);
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class53.field1259[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 1 & 0x3;
                            int var27 = var25 >> 24 & 0x3;
                            int var28 = var25 >> 14 & 0x3FF;
                            int var29 = var25 >> 3 & 0x7FF;
                            int var30 = (var28 / 8 << 8) + (var29 / 8);
                            for (int var31 = 0; var31 < class139.field3391.length; var31++) {
                                if (class139.field3391[var31] == var30 && class69.field1691[var31] != null) {
                                    class56.method427(var26, var23 * 8, var22, var24 * 8, class69.field1691[var31], 1, (var29 & 0x7) * 8, class58.field1437, class100.field2418, var27, (var28 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class63.method525((byte) 124, true);
        class86.method675(217);
        class37.method282(true);
        class126.method984(class58.field1437, arg0 - 30723, class100.field2418);
        class63.method525((byte) 126, true);
        int var44 = class128.field3095;
        if (class136.field3301 < var44) {
            var44 = class136.field3301;
        }
        if (class136.field3301 - 1 > var44) {
            int var45 = class136.field3301 - 1;
        }
        if (class100.field2422) {
            class100.field2418.method1003(class128.field3095);
        } else {
            class100.field2418.method1003(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class141.method1131(var53, 0, var46);
            }
        }
        class37.method282(true);
        class29.method236((byte) -92);
        class41.field953.method234(-22666);
        if (class55.field1307 != null) {
            class133.field3202++;
            class152.field3751.method929(42, -14044);
            class152.field3751.method463(arg0 ^ 0x60, 1057001181);
        }
        if (!class44.field1080) {
            int var47 = (class132.field3183 - 6) / 8;
            int var48 = (class132.field3183 + 6) / 8;
            int var49 = (class56.field1362 - 6) / 8;
            int var50 = (class56.field1362 + 6) / 8;
            for (int var51 = var47 - 1; var51 <= var48 + 1; var51++) {
                for (int var52 = var49 - 1; var52 <= var50 + 1; var52++) {
                    if (var51 < var47 || var51 > var48 || var49 > var52 || var52 > var50) {
                        class141.field3473.method329(false, class107.method867(arg0 ^ 0x7C, new class135[] { class34.field797, class68.method547(-1, var51), class131.field3148, class68.method547(-1, var52) }));
                        class141.field3473.method329(false, class107.method867(2, new class135[] { class28.field669, class68.method547(-1, var51), class131.field3148, class68.method547(-1, var52) }));
                    }
                }
            }
        }
        if (class19.field425 == -1) {
            class125.method978(30, 1);
        } else {
            class125.method978(35, 1);
        }
        class37.method282(true);
        class78.method623(120);
        class152.field3751.method929(52, -14044);
        class21.method161(21356);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)Z")
    public static final boolean method792(int arg0, int arg1) {
        field2332++;
        if (arg1 == 708440092) {
            return (arg0 >> 29 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIBIIII[Lve;I)V")
    private static final void method793(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, class146[] arg9, int arg10) {
        int var11 = 0;
        if (arg4 != 89) {
            return;
        }
        while (arg9.length > var11) {
            class146 var12 = arg9[var11];
            if (var12 != null && (var12.field3564 == 0 || var12.field3617) && var12 != null && var12.field3611 == arg3 && !class77.method618(var12, -1)) {
                int var13 = arg5 + var12.field3575 - arg1;
                int var14 = var12.field3669 + arg6 - arg10;
                int var15 = var13 + var12.field3623;
                int var16 = var13 <= arg5 ? arg5 : var13;
                int var17 = var14 > arg6 ? var14 : arg6;
                int var18 = var12.field3661 + var14;
                int var19 = arg0 <= var15 ? arg0 : var15;
                int var20 = var18 >= arg8 ? arg8 : var18;
                if (var12.field3564 == 0) {
                    method793(var19, var12.field3664 + var16 - var13, arg2, var12.field3595, (byte) 89, var16, var17, arg7, var20, arg9, var12.field3671 + var17 - var14);
                    if (var12.field3574 != null) {
                        method793(var19, var16 + var12.field3664 - var13, arg2, var12.field3595, (byte) 89, var16, var17, arg7, var20, var12.field3574, var17 + var12.field3671 - var14);
                    }
                }
                if (var12.field3617) {
                    boolean var21 = false;
                    boolean var22;
                    if (var16 <= class53.field1278 && class76.field1798 >= var17 && var19 > class53.field1278 && var20 > class76.field1798) {
                        var22 = true;
                    } else {
                        var22 = false;
                    }
                    boolean var23 = false;
                    if (class48.field1151 == 1 && var16 <= class139.field3389 && var17 <= class20.field470 && var19 > class139.field3389 && class20.field470 < var20) {
                        var23 = true;
                    }
                    if (class60.field1520 == 1 && var22) {
                        var21 = true;
                    }
                    if (var23 && class119.field2828 == null && (arg2 & 0x200) != 0 && !class128.field3077 && class20.method154(var12, (byte) 25) != null) {
                        class97.field2362 = class139.field3389 - var16;
                        class4.field109 = class20.field470 - var17;
                        class128.field3094 = 0;
                        class119.field2828 = var12;
                        class82.field1928 = arg7;
                        class44.field1082 = false;
                    }
                    if (class119.field2828 != null || class128.field3077) {
                        var22 = false;
                        var23 = false;
                        var21 = false;
                    }
                    if (!var12.field3644 && var23 && (arg2 & 0x1) != 0) {
                        var12.field3644 = true;
                        if (var12.field3569 != null) {
                            class52.method399(var12, var12.field3569, class20.field470 - var14, 0, null, -2147483645, class139.field3389 - var13);
                        }
                    }
                    if (var12.field3644 && var21 && (arg2 & 0x4) != 0 && var12.field3642 != null) {
                        class52.method399(var12, var12.field3642, class76.field1798 - var14, 0, null, -2147483645, class53.field1278 - var13);
                    }
                    if (var12.field3644 && !var21 && (arg2 & 0x2) != 0) {
                        var12.field3644 = false;
                        if (var12.field3586 != null) {
                            class52.method399(var12, var12.field3586, class76.field1798 - var14, 0, null, arg4 ^ 0x8000005A, class53.field1278 - var13);
                        }
                    }
                    if (var21 && (arg2 & 0x8) != 0 && var12.field3613 != null) {
                        class52.method399(var12, var12.field3613, class76.field1798 - var14, 0, null, -2147483645, class53.field1278 - var13);
                    }
                    if (!var12.field3566 && var22 && (arg2 & 0x10) != 0) {
                        var12.field3566 = true;
                        if (var12.field3610 != null) {
                            class52.method399(var12, var12.field3610, class76.field1798 - var14, 0, null, -2147483645, class53.field1278 - var13);
                        }
                    }
                    if (var12.field3566 && var22 && (arg2 & 0x40) != 0 && var12.field3616 != null) {
                        class52.method399(var12, var12.field3616, class76.field1798 - var14, 0, null, arg4 ^ 0x8000005A, class53.field1278 - var13);
                    }
                    if (var12.field3566 && !var22 && (arg2 & 0x20) != 0) {
                        var12.field3566 = false;
                        if (var12.field3667 != null) {
                            class52.method399(var12, var12.field3667, class76.field1798 - var14, 0, null, -2147483645, class53.field1278 - var13);
                        }
                    }
                    if (var12.field3631 != null && (arg2 & 0x80) != 0) {
                        class52.method399(var12, var12.field3631, 0, 0, null, arg4 ^ 0x8000005A, 0);
                    }
                    if (var22 && class113.field2719 != 0 && var12.field3626 != null && (arg2 & 0x400) != 0) {
                        class52.method399(var12, var12.field3626, class113.field2719, 0, null, -2147483645, 0);
                    }
                    if ((arg2 & 0x100) != 0) {
                        if (var12.field3602 < class53.field1257 && var12.field3645 != null) {
                            class52.method399(var12, var12.field3645, 0, 0, null, -2147483645, 0);
                        }
                        if (class53.field1254 > var12.field3602 && var12.field3596 != null) {
                            class52.method399(var12, var12.field3596, 0, 0, null, -2147483645, 0);
                        }
                        if (class116.field2777 > var12.field3602 && var12.field3643 != null) {
                            class52.method399(var12, var12.field3643, 0, 0, null, -2147483645, 0);
                        }
                        var12.field3602 = class126.field2998;
                    }
                }
            }
            var11++;
        }
        field2330++;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lud;BI[B)V")
    public static final void method794(class139 arg0, byte arg1, int arg2, byte[] arg3) {
        field2339++;
        class129 var4 = new class129();
        var4.field3104 = 0;
        var4.field3109 = arg0;
        var4.field3108 = arg3;
        var4.field951 = arg2;
        class23 var5 = class23.field551;
        synchronized (class23.field551) {
            class23.field551.method185(var4, -27557);
        }
        int var6 = -87 % ((-arg1 - 51) / 33);
        class129.method1042(-123);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(JI)V")
    public static final void method795(long arg0, int arg1) {
        field2328++;
        if (arg1 < 64) {
            field2334 = null;
        }
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class62.method514(arg0 - 1L, (byte) -38);
            class62.method514(1L, (byte) -38);
        } else {
            class62.method514(arg0, (byte) -38);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class152 extends class259 {

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "[Lhj;")
    public class70[] field2224;

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "Ljava/lang/String;")
    public static String field2219 = "Hidden";

    @OriginalMember(owner = "client!ob", name = "U", descriptor = "I")
    public static int field2225 = -1;

    @OriginalMember(owner = "client!ob", name = "S", descriptor = "I")
    public static int field2223 = -1;

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!ob", name = "P", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!ob", name = "R", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!ob", name = "V", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!ob", name = "W", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!ob", name = "X", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!ob", name = "Y", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!ob", name = "Z", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!ob", name = "ab", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!ob", name = "bb", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!ob", name = "Q", descriptor = "Lpk;")
    public static class237 field2221;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIB)Lna;")
    public static final class123 method1029(int arg0, int arg1, int arg2, byte arg3) {
        field2230++;
        class123 var4 = new class123();
        if (arg3 < 86) {
            method1036((byte) 70);
        }
        var4.field1823 = arg0;
        var4.field1820 = arg2;
        class124.field1833.method309((byte) -8, var4, (long) arg1);
        class121.method859(117, arg0);
        class297 var5 = class151.method1023(-30464, arg1);
        if (var5 != null) {
            class297.method1979((byte) -60, var5);
        }
        if (class7.field90 != null) {
            class297.method1979((byte) -48, class7.field90);
            class7.field90 = null;
        }
        int var6 = class51.field826;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class8.method68((byte) -42, class265.field4147[var7])) {
                class259.method1744(var7, -26);
            }
        }
        if (class51.field826 == 1) {
            class66.field1093 = false;
            class210.method1386(class229.field3561, class67.field1116, class106.field1561, (byte) 92, class19.field333);
        } else {
            class210.method1386(class229.field3561, class67.field1116, class106.field1561, (byte) 46, class19.field333);
            int var8 = class105.field1555.method1293(class194.field2938);
            for (int var9 = 0; var9 < class51.field826; var9++) {
                int var10 = class105.field1555.method1293(class170.method1143(-24448, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class106.field1561 = (class197.field2979 ? 26 : 22) + class51.field826 * 15;
            class19.field333 = var8 + 8;
        }
        if (var5 != null) {
            class128.method886(82, var5, false);
        }
        class62.method510(583304259, arg0);
        if (class184.field2677 != -1) {
            class188.method1241((byte) 61, 1, class184.field2677);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)V")
    public static void method1030(int arg0) {
        field2221 = null;
        field2219 = null;
        if (arg0 > -85) {
            field2225 = 20;
        }
    }

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "(I)V")
    public static final void method1031(int arg0) {
        field2220++;
        for (int var1 = 0; var1 < class165.field2426; var1++) {
            int var2 = class148.field2149[var1];
            class87 var3 = class243.field3762[var2];
            int var4 = class173.field2543.method407(255);
            if ((var4 & 0x2) != 0) {
                var4 += class173.field2543.method407(255) << 8;
            }
            if ((var4 & 0x4) != 0) {
                int var5 = class173.field2543.method421(255);
                int var6 = class173.field2543.method420((byte) -103);
                if (var5 == 65535) {
                    var5 = -1;
                }
                boolean var7 = true;
                if (var5 != -1 && var3.field491 != -1 && class108.method781(class296.method1957(var5, true).field1516, -1).field3427 < class108.method781(class296.method1957(var3.field491, true).field1516, -1).field3427) {
                    var7 = false;
                }
                if (var7) {
                    var3.field415 = var6 >> 16;
                    var3.field488 = 0;
                    var3.field418 = (var6 & 0xFFFF) + class120.field1794;
                    if (class120.field1794 < var3.field418) {
                        var3.field488 = -1;
                    }
                    var3.field491 = var5;
                    var3.field459 = 1;
                    var3.field460 = 0;
                    if (var3.field491 != -1 && class120.field1794 == var3.field418) {
                        int var8 = class296.method1957(var3.field491, true).field1516;
                        if (var8 != -1) {
                            class220 var9 = class108.method781(var8, -1);
                            if (var9 != null && var9.field3413 != null) {
                                class244.method1664(var3.field455, false, 0, var3.field425, 8890, var9);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x20) != 0) {
                int var10 = class173.field2543.method450(-104);
                int var11 = class173.field2543.method407(255);
                var3.method176(var10, var11, (byte) 109, class120.field1794);
            }
            if ((var4 & 0x100) != 0) {
                int var12 = class173.field2543.method407(255);
                int[] var13 = new int[var12];
                int[] var14 = new int[var12];
                int[] var15 = new int[var12];
                for (int var16 = 0; var16 < var12; var16++) {
                    int var17 = class173.field2543.method423(127);
                    if (var17 == 65535) {
                        var17 = -1;
                    }
                    var13[var16] = var17;
                    var14[var16] = class173.field2543.method401((byte) -39);
                    var15[var16] = class173.field2543.method421(255);
                }
                class178.method1173(var15, 16018, var13, var14, var3);
            }
            if ((var4 & 0x80) != 0) {
                var3.field430 = class173.field2543.method397(120);
                if (var3.field430 == 65535) {
                    var3.field430 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field429 = class173.field2543.method439((byte) 118);
                var3.field451 = 100;
            }
            if ((var4 & 0x8) != 0) {
                int var18 = class173.field2543.method450(-118);
                int var19 = class173.field2543.method448(128);
                var3.method176(var18, var19, (byte) -106, class120.field1794);
                var3.field487 = class120.field1794 + 300;
                var3.field406 = class173.field2543.method450(-127);
            }
            if ((var4 & 0x200) != 0) {
                var3.field417 = class173.field2543.method423(103);
                var3.field474 = class173.field2543.method421(255);
            }
            if ((var4 & 0x40) != 0) {
                if (var3.field1323.method1256((byte) -109)) {
                    class43.method353(var3, -8213);
                }
                var3.method665(class114.method820((byte) -62, class173.field2543.method421(255)), (byte) -96);
                var3.method169(var3.field1323.field2813, 23138);
                var3.field436 = var3.field1323.field2846;
                var3.field432 = var3.field1323.field2865;
                if (var3.field1323.method1256((byte) -109)) {
                    class102.method744(class260.field3986, var3.field449[0], (class224) null, 0, var3.field493[0], var3, 8, (class188) null);
                }
            }
            if ((var4 & 0x10) != 0) {
                int var20 = class173.field2543.method423(-112);
                if (var20 == 65535) {
                    var20 = -1;
                }
                int var21 = class173.field2543.method448(128);
                class39.method308(var21, (byte) -45, var3, var20);
            }
        }
        if (arg0 >= -46) {
            field2225 = 45;
        }
    }

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "(II)Z")
    public final boolean method1032(int arg0, int arg1) {
        int var3 = -118 % ((46 - arg1) / 48);
        field2229++;
        return this.field2224[arg0].field1153;
    }

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "(II)Z")
    public final boolean method1033(int arg0, int arg1) {
        if (arg1 != -1) {
            method1035((class78) null, 45, -123, -100, -106, 17, -18);
        }
        field2228++;
        return this.field2224[arg0].field1156;
    }

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "(I)V")
    public static final void method1034(int arg0) {
        field2231++;
        class278.field4281.method944(arg0 ^ 0xFFFF);
        class275.field4239.method944(65535);
        if (arg0 != 0) {
            method1030(-16);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lql;IIIIII)V")
    public static final void method1035(class78 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        long var7 = 0L;
        field2217++;
        if (arg6 == 0) {
            var7 = class236.method1596(arg1, arg3, arg5);
        } else if (arg6 == 1) {
            var7 = class283.method1873(arg1, arg3, arg5);
        } else if (arg6 == 2) {
            var7 = class251.method1709(arg1, arg3, arg5);
        } else if (arg6 == 3) {
            var7 = class280.method1864(arg1, arg3, arg5);
        }
        boolean var9 = true;
        int var10 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        boolean var11 = false;
        if (arg2 > -115) {
            field2225 = -48;
        }
        int var12 = (int) var7 >> 14 & 0x1F;
        boolean var13 = false;
        class188 var14 = class3.method42(-111, var10);
        int var15 = (int) var7 >> 20 & 0x3;
        if (var14.method1245(0)) {
            class136.method930(arg3, var14, (byte) -92, arg1, arg5);
        }
        if (var7 == 0L) {
            return;
        }
        if (arg6 == 0) {
            class153.method1040(arg1, arg3, arg5);
            if (var14.field2785 != 0) {
                arg0.method621(var12, var15, 106, !var14.field2781, arg3, var14.field2730, arg5);
            }
        } else if (arg6 == 1) {
            class30.method207(arg1, arg3, arg5);
        } else if (arg6 == 2) {
            class296.method1950(arg1, arg3, arg5);
            if (var14.field2785 != 0 && (arg3 + var14.field2757) < 104 && (var14.field2757 + arg5) < 104 && (var14.field2805 + arg3) < 104 && var14.field2805 + arg5 < 104) {
                arg0.method623(var15, -127, var14.field2757, arg5, var14.field2730, !var14.field2781, var14.field2805, arg3);
            }
        } else if (arg6 == 3) {
            class15.method97(arg1, arg3, arg5);
            if (var14.field2785 == 1) {
                arg0.method618((byte) 83, arg5, arg3);
            }
        }
        if (var14.field2804 != null) {
            class188 var20 = var14.method1253(false);
            return;
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(B)Lqf;")
    public static final class293 method1036(byte arg0) {
        if (arg0 >= -104) {
            field2219 = null;
        }
        field2226++;
        class243.field3769 = 0;
        return class245.method1673(0);
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lpk;Lpk;IZ)V")
    public class152(class237 arg0, class237 arg1, int arg2, boolean arg3) {
        class284 var5 = new class284();
        int var6 = arg0.method1614(0, arg2);
        this.field2224 = new class70[var6];
        int[] var7 = arg0.method1632(arg2, (byte) -109);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1605(-126, var7[var8], arg2);
            int var10 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            class221 var11 = null;
            for (class221 var12 = (class221) var5.method1894((byte) -90); var12 != null; var12 = (class221) var5.method1886(-81)) {
                if (var12.field3441 == var10) {
                    var11 = var12;
                    break;
                }
            }
            if (var11 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1601(0, 126, var10);
                } else {
                    var13 = arg1.method1601(var10, 125, 0);
                }
                var11 = new class221(var10, var13);
                var5.method1881(var11, (byte) -56);
            }
            this.field2224[var7[var8]] = new class70(var9, var11);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V")
    public static final void method1037(int arg0, int arg1, int arg2) {
        class105 var3 = class9.method72(6, -1, arg2);
        field2232++;
        var3.method763(false);
        if (arg0 != 6192) {
            field2219 = null;
        }
        var3.field1553 = arg1;
    }
}

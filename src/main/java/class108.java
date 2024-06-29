import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class108 extends class73 {

    @OriginalMember(owner = "client!qa", name = "gb", descriptor = "[Lfb;")
    public class38[] field2697 = new class38[5];

    @OriginalMember(owner = "client!qa", name = "fb", descriptor = "I")
    public int field2696 = 0;

    @OriginalMember(owner = "client!qa", name = "ib", descriptor = "[I")
    public int[] field2699 = new int[5];

    @OriginalMember(owner = "client!qa", name = "lb", descriptor = "I")
    public int field2702;

    @OriginalMember(owner = "client!qa", name = "sb", descriptor = "I")
    public int field2709;

    @OriginalMember(owner = "client!qa", name = "nb", descriptor = "I")
    public int field2704;

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "I")
    public int field2690;

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "Lrd;")
    public static class117 field2674 = class95.method812("redstone1", (byte) 8);

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "Lrd;")
    private static class117 field2675 = class95.method812("New User", (byte) 8);

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "Lrd;")
    public static class117 field2673 = class95.method812("Offline", (byte) 8);

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "Lrd;")
    public static class117 field2676 = field2675;

    @OriginalMember(owner = "client!qa", name = "bb", descriptor = "Lrd;")
    public static class117 field2692 = class95.method812("Keine Antwort vom Anmelde)2Server)3", (byte) 8);

    @OriginalMember(owner = "client!qa", name = "X", descriptor = "I")
    public static int field2688 = 2;

    @OriginalMember(owner = "client!qa", name = "L", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!qa", name = "P", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!qa", name = "Q", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "I")
    public int field2685;

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "I")
    public int field2687;

    @OriginalMember(owner = "client!qa", name = "Y", descriptor = "I")
    public int field2689;

    @OriginalMember(owner = "client!qa", name = "db", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!qa", name = "hb", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!qa", name = "mb", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!qa", name = "ob", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!qa", name = "pb", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!qa", name = "qb", descriptor = "I")
    public int field2707;

    @OriginalMember(owner = "client!qa", name = "tb", descriptor = "I")
    public int field2710;

    @OriginalMember(owner = "client!qa", name = "ub", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!qa", name = "vb", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!qa", name = "wb", descriptor = "I")
    public int field2713;

    @OriginalMember(owner = "client!qa", name = "eb", descriptor = "Lqa;")
    public class108 field2695;

    @OriginalMember(owner = "client!qa", name = "cb", descriptor = "Lcf;")
    public class21 field2693;

    @OriginalMember(owner = "client!qa", name = "rb", descriptor = "Led;")
    public class33 field2708;

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "Lfa;")
    public class37 field2679;

    @OriginalMember(owner = "client!qa", name = "jb", descriptor = "Lia;")
    public class57 field2700;

    @OriginalMember(owner = "client!qa", name = "T", descriptor = "Ljb;")
    public class64 field2684;

    @OriginalMember(owner = "client!qa", name = "ab", descriptor = "Lk;")
    public class69 field2691;

    @OriginalMember(owner = "client!qa", name = "kb", descriptor = "Laf;")
    public static class7 field2701;

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "Z")
    public boolean field2680;

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "Z")
    public boolean field2683;

    @OriginalMember(owner = "client!qa", name = "V", descriptor = "Z")
    public boolean field2686;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)Lh;")
    public static final class49 method887(int arg0, int arg1) {
        field2712++;
        class49 var2 = (class49) class40.field1143.method774((long) arg1, 329);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class26.field787.method526((byte) 116, 10, arg1);
        class49 var4 = new class49();
        var4.field1431 = arg1;
        if (var3 != null) {
            var4.method549(arg0 + 2, new class14(var3));
        }
        var4.method554((byte) 19);
        if (var4.field1413 != arg0) {
            var4.method539(method887(-1, var4.field1401), 17, method887(-1, var4.field1413));
        }
        if (!class148.field3623 && var4.field1372) {
            var4.field1410 = 0;
            var4.field1425 = null;
            var4.field1394 = null;
            var4.field1414 = class32.field971;
        }
        class40.field1143.method773((long) arg1, (byte) -17, var4);
        return var4;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBI)I")
    public static final int method888(int arg0, byte arg1, int arg2) {
        field2681++;
        if (arg2 >= 2) {
            int var3 = method888(arg0 * arg0, (byte) -96, arg2 >> 1);
            if ((arg2 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            return var3;
        } else if (arg1 >= -87) {
            return 84;
        } else if (arg2 == 1) {
            return arg0;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(JI)V")
    public static final void method889(long arg0, int arg1) {
        field2677++;
        if (arg0 == 0L) {
            return;
        }
        if (class5.field119 >= 100 && class17.field393 != 1 || class5.field119 >= 200) {
            class52.method572(class134.field3215, -1, 0, class13.field261);
            return;
        }
        class117 var3 = class26.method272(false, arg0).method957(-8191);
        for (int var4 = 0; var4 < class5.field119; var4++) {
            if (class56.field1551[var4] == arg0) {
                class52.method572(class134.field3215, arg1 - 2, 0, class18.method193(new class117[] { var3, class47.field1347 }, arg1 ^ 0x32));
                return;
            }
        }
        for (int var5 = 0; var5 < class109.field2739; var5++) {
            if (class109.field2720[var5] == arg0) {
                class52.method572(class134.field3215, -1, 0, class18.method193(new class117[] { class43.field1237, var3, class117.field2867 }, 48));
                return;
            }
        }
        if (var3.method962(class144.field3516.field2528, true)) {
            return;
        }
        class93.field2346++;
        class72.field2025[class5.field119] = var3;
        class56.field1551[class5.field119] = arg0;
        class35.field1037[class5.field119] = 0;
        class15.field352[class5.field119] = 0;
        class5.field119++;
        class84.field2198 = class85.field2236 + arg1;
        class13.field262 = true;
        class25.field754.method739(false, 44);
        class25.field754.method163(-109, arg0);
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(III)V")
    public class108(int arg0, int arg1, int arg2) {
        this.field2702 = arg1;
        this.field2709 = arg2;
        this.field2690 = this.field2704 = arg0;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(III)I")
    public static final int method890(int arg0, int arg1, int arg2) {
        field2711++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 / 128;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return arg0 == 0 ? (arg2 & 0xFF80) + var3 : -120;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
    public static final void method891(boolean arg0) {
        field2703++;
        short var1 = 256;
        if (class128.field3111 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (class128.field3111 > 768) {
                    class52.field1476[var2] = class143.method1135(1024 - class128.field3111, true, class41.field1183[var2], class2.field51[var2]);
                } else if (class128.field3111 > 256) {
                    class52.field1476[var2] = class41.field1183[var2];
                } else {
                    class52.field1476[var2] = class143.method1135(256 - class128.field3111, true, class2.field51[var2], class41.field1183[var2]);
                }
            }
        } else if (class18.field448 > 0) {
            for (int var3 = 0; var3 < 256; var3++) {
                if (class18.field448 > 768) {
                    class52.field1476[var3] = class143.method1135(1024 - class18.field448, true, class124.field2998[var3], class2.field51[var3]);
                } else if (class18.field448 <= 256) {
                    class52.field1476[var3] = class143.method1135(256 - class18.field448, !arg0, class2.field51[var3], class124.field2998[var3]);
                } else {
                    class52.field1476[var3] = class124.field2998[var3];
                }
            }
        } else {
            for (int var4 = 0; var4 < 256; var4++) {
                class52.field1476[var4] = class2.field51[var4];
            }
        }
        for (int var5 = 0; var5 < 33920; var5++) {
            class107.field2671.field1250[var5] = class61.field1729.field2085[var5];
        }
        int var6 = 0;
        int var7 = 1152;
        for (int var8 = 1; var8 < var1 - 1; var8++) {
            int var22 = (var1 - var8) * class72.field2023[var8] / var1;
            int var23 = var22 + 22;
            if (var23 < 0) {
                var23 = 0;
            }
            var6 += var23;
            for (int var24 = var23; var24 < 128; var24++) {
                int var25 = class101.field2531[var6++];
                if (var25 == 0) {
                    var7++;
                } else {
                    int var26 = 256 - var25;
                    int var28 = class52.field1476[var25];
                    int var29 = class107.field2671.field1250[var7];
                    class107.field2671.field1250[var7++] = class66.method660(16711680, class66.method660(var29, 65280) * var26 + var25 * class66.method660(65280, var28)) + class66.method660(-16711936, var26 * class66.method660(var29, 16711935) + var25 * class66.method660(16711935, var28)) >> 8;
                }
            }
            var7 += var23;
        }
        int var9 = 0;
        for (int var10 = 0; var10 < 33920; var10++) {
            class86.field2241.field1250[var10] = class128.field3116.field2085[var10];
        }
        int var11 = 1176;
        if (arg0) {
            method887(14, -63);
        }
        for (int var12 = 1; var12 < var1 - 1; var12++) {
            int var13 = (var1 - var12) * class72.field2023[var12] / var1;
            int var14 = 103 - var13;
            int var15 = var11 + var13;
            for (int var16 = 0; var16 < var14; var16++) {
                int var17 = class101.field2531[var9++];
                if (var17 == 0) {
                    var15++;
                } else {
                    int var18 = 256 - var17;
                    int var19 = class86.field2241.field1250[var15];
                    int var21 = class52.field1476[var17];
                    class86.field2241.field1250[var15++] = class66.method660(-16711936, var18 * class66.method660(16711935, var19) + var17 * class66.method660(var21, 16711935)) + class66.method660(var17 * class66.method660(var21, 65280) + var18 * class66.method660(var19, 65280), 16711680) >> 8;
                }
            }
            var9 += 128 - var14;
            var11 = var15 + 128 - var13 - var14;
        }
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
    public static void method892(int arg0) {
        field2673 = null;
        field2692 = null;
        field2675 = null;
        field2676 = null;
        field2701 = null;
        field2674 = null;
        if (arg0 <= 99) {
            method888(-98, (byte) 2, 101);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLwa;)Z")
    public static final boolean method893(byte arg0, class144 arg1) {
        field2682++;
        if (arg0 != -3) {
            return true;
        } else if (arg1.field3530 == null) {
            return false;
        } else {
            for (int var2 = 0; var2 < arg1.field3530.length; var2++) {
                int var3 = class74.method699(arg1, -1, var2);
                int var4 = arg1.field3504[var2];
                if (arg1.field3530[var2] == 2) {
                    if (var4 <= var3) {
                        return false;
                    }
                } else if (arg1.field3530[var2] == 3) {
                    if (var3 <= var4) {
                        return false;
                    }
                } else if (arg1.field3530[var2] == 4) {
                    if (var3 == var4) {
                        return false;
                    }
                } else if (var3 != var4) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZIIZZ)Laf;")
    public static final class7 method894(boolean arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        if (arg1 <= 39) {
            return null;
        }
        field2705++;
        class92 var5 = null;
        if (class134.field3200 != null) {
            var5 = new class92(arg2, class134.field3200, class60.field1695[arg2], 1000000);
        }
        return new class7(var5, class35.field1050, arg2, arg4, arg0, arg3);
    }
}

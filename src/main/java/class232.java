import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class232 extends class195 {

    @OriginalMember(owner = "client!bc", name = "V", descriptor = "I")
    private int field3739 = 0;

    @OriginalMember(owner = "client!bc", name = "W", descriptor = "I")
    private int field3740 = 1;

    @OriginalMember(owner = "client!bc", name = "kb", descriptor = "I")
    private int field3754 = 0;

    @OriginalMember(owner = "client!bc", name = "ab", descriptor = "Z")
    public static boolean field3744 = false;

    @OriginalMember(owner = "client!bc", name = "gb", descriptor = "Lck;")
    public static class119 field3750 = class298.method1987((byte) 26, "null");

    @OriginalMember(owner = "client!bc", name = "ib", descriptor = "Lck;")
    public static class119 field3752 = class298.method1987((byte) 8, "1");

    @OriginalMember(owner = "client!bc", name = "bb", descriptor = "I")
    public static int field3745 = 1;

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!bc", name = "Y", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!bc", name = "Z", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!bc", name = "cb", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!bc", name = "db", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!bc", name = "eb", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!bc", name = "fb", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!bc", name = "hb", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!bc", name = "jb", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!bc", name = "X", descriptor = "[I")
    public static int[] field3741;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(JB)V", line = 11)
    public static final void method1493(long arg0, byte arg1) {
        field3747++;
        if (arg1 != -51) {
            field3744 = true;
        }
        if (arg0 <= 0L) {
            return;
        }
        if ((arg0 % 10L) == 0L) {
            class108.method695((byte) -70, arg0 - 1L);
            class108.method695((byte) -70, 1L);
        } else {
            class108.method695((byte) -70, arg0);
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V", line = 73)
    public class232() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)V", line = 52)
    public static final void method1494(int arg0) {
        field3751++;
        if (class214.field3407 == 10) {
            class204.method1289(-116, 28);
        }
        if (arg0 > -16) {
            field3741 = (int[]) null;
        }
        if (class214.field3407 == 30) {
            class204.method1289(4, 25);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)[I", line = 82)
    public final int[] method11(int arg0, boolean arg1) {
        field3748++;
        int[] var3 = this.field3106.method924(100, arg0);
        if (this.field3106.field2260) {
            int var4 = class215.field3424[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class157.field2504; var6++) {
                int var7 = class157.field2505[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (this.field3739 == 0) {
                    var11 = (var7 - var4) * this.field3740;
                } else {
                    int var9 = var8 * var8 + (var5 * var5) >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field3740 * var10) * 3.141592653589793D);
                }
                int var12 = var11 - (var11 & 0xFFFFF000);
                if (this.field3754 == 0) {
                    var12 = class67.field1045[(var12 & 0xFF7) >> 4] + 4096 >> 1;
                } else if (this.field3754 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        if (arg1) {
            method1497(72, (class119[]) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)V", line = 151)
    public static void method1495(int arg0) {
        field3752 = null;
        field3741 = null;
        if (arg0 != 0) {
            field3743 = -81;
        }
        field3750 = null;
    }

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "(I)V", line = 164)
    private static final void method1496(int arg0) {
        field3746++;
        int var1 = class49.field748.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class49.field748[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class263.field4276; var4++) {
                    if (class291.field4836[var4] == class150.field2382[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class291.field4836[class263.field4276] = class150.field2382[var2];
                    var3 = class263.field4276++;
                }
                class3 var5 = new class3(class49.field748[var2]);
                int var6 = 0;
                while (var5.field44 < class49.field748[var2].length && var6 < 511) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method63((byte) 1);
                    int var9 = (var8 & 0x1FDE) >> 7;
                    int var10 = (class150.field2382[var2] >> 8) * 64 + var9 - class30.field421;
                    int var11 = var8 & 0x3F;
                    int var12 = var8 >> 14;
                    int var13 = (class150.field2382[var2] & 0xFF) * 64 + var11 - class189.field2995;
                    class50 var14 = class134.method896(arg0 + 5218, var5.method63((byte) 1));
                    if (class70.field1103[var7] == null && (var14.field822 & 0x1) > 0 && class119.field1862 == var12 && var10 >= 0 && (var10 + var14.field796) < 104 && var13 >= 0 && var14.field796 + var13 < 104) {
                        class70.field1103[var7] = new class163();
                        class163 var15 = class70.field1103[var7];
                        class23.field348[class157.field2499++] = var7;
                        var15.field2575 = var14;
                        var15.field4999 = var15.field2575.field789;
                        var15.field4984 = class1.field15;
                        var15.field4964 = var15.field2575.field794;
                        var15.field4943 = var15.field2575.field804;
                        var15.field4979 = var15.field2575.field820;
                        var15.field4953 = var15.field2575.field829;
                        var15.field4956 = var15.field2575.field796;
                        var15.field4982 = var15.field2575.field836;
                        var15.field4976 = var15.field2575.field785;
                        if (var15.field4979 == 0) {
                            var15.field5007 = 0;
                        }
                        var15.field4945 = var15.field2575.field778;
                        var15.method1982(var13, 7, var10, true);
                    }
                }
            }
        }
        if (arg0 != -5219) {
            method1495(-54);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I[Lck;)[Lck;", line = 280)
    public static final class119[] method1497(int arg0, class119[] arg1) {
        field3749++;
        class119[] var2 = new class119[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class170.method1074(new class119[] { class234.method1506(var3, (byte) -79), class147.field2370 }, -121);
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class170.method1074(new class119[] { var2[var3], arg1[var3] }, -95);
            }
        }
        if (arg0 <= 43) {
            field3741 = (int[]) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V", line = 312)
    public final void method14(int arg0) {
        if (arg0 != 2048879374) {
            field3744 = false;
        }
        class166.method1046((byte) 68);
        field3753++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lfj;II)V", line = 330)
    public final void method13(class3 arg0, int arg1, int arg2) {
        if (arg1 > -117) {
            return;
        }
        if (arg2 == 0) {
            this.field3739 = arg0.method64((byte) 108);
        } else if (arg2 == 1) {
            this.field3754 = arg0.method64((byte) -126);
        } else if (arg2 == 3) {
            this.field3740 = arg0.method64((byte) -117);
        }
        field3742++;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(B)V", line = 374)
    public static final void method1498(byte arg0) {
        class108.method698(false, (byte) 62);
        field3738++;
        boolean var1 = true;
        class128.field1957 = 0;
        for (int var2 = 0; var2 < class204.field3240.length; var2++) {
            if (class226.field3611[var2] != -1 && class204.field3240[var2] == null) {
                class204.field3240[var2] = class196.field3152.method261(-1, class226.field3611[var2], 0);
                if (class204.field3240[var2] == null) {
                    var1 = false;
                    class128.field1957++;
                }
            }
            if (class59.field960[var2] != -1 && class142.field2274[var2] == null) {
                class142.field2274[var2] = class196.field3152.method259(0, class277.field4544[var2], (byte) 56, class59.field960[var2]);
                if (class142.field2274[var2] == null) {
                    class128.field1957++;
                    var1 = false;
                }
            }
            if (class1.field22[var2] != -1 && class293.field4877[var2] == null) {
                class293.field4877[var2] = class196.field3152.method261(-1, class1.field22[var2], 0);
                if (class293.field4877[var2] == null) {
                    var1 = false;
                    class128.field1957++;
                }
            }
            if (class109.field1665[var2] != -1 && class146.field2352[var2] == null) {
                class146.field2352[var2] = class196.field3152.method261(-1, class109.field1665[var2], 0);
                if (class146.field2352[var2] == null) {
                    var1 = false;
                    class128.field1957++;
                }
            }
            if (class254.field4091 != null && class49.field748[var2] == null && class254.field4091[var2] != -1) {
                class49.field748[var2] = class196.field3152.method259(0, class277.field4544[var2], (byte) 105, class254.field4091[var2]);
                if (class49.field748[var2] == null) {
                    var1 = false;
                    class128.field1957++;
                }
            }
        }
        if (!var1) {
            class20.field286 = 1;
            return;
        }
        boolean var3 = true;
        class96.field1474 = 0;
        for (int var4 = 0; var4 < class204.field3240.length; var4++) {
            byte[] var5 = class142.field2274[var4];
            if (var5 != null) {
                int var6 = (class150.field2382[var4] >> 8) * 64 - class30.field421;
                int var7 = (class150.field2382[var4] & 0xFF) * 64 - class189.field2995;
                if (class36.field540) {
                    var7 = 10;
                    var6 = 10;
                }
                var3 &= class164.method1040(var5, 0, var7, var6);
            }
            byte[] var8 = class146.field2352[var4];
            if (var8 != null) {
                int var9 = (class150.field2382[var4] & 0xFF) * 64 - class189.field2995;
                int var10 = (class150.field2382[var4] >> 8) * 64 - class30.field421;
                if (class36.field540) {
                    var9 = 10;
                    var10 = 10;
                }
                var3 &= class164.method1040(var8, 0, var9, var10);
            }
        }
        if (!var3) {
            class20.field286 = 2;
            return;
        }
        if (class20.field286 != 0) {
            class142.method930(true, class170.method1074(new class119[] { class244.field3961, class289.field4756 }, -88), 250);
        }
        class91.method624(4096);
        class181.method1158(0);
        class57.method427();
        boolean var11 = false;
        for (int var12 = 0; var12 < class204.field3240.length; var12++) {
            if (class146.field2352[var12] != null || class293.field4877[var12] != null) {
                var11 = true;
                break;
            }
        }
        if (!class10.field184) {
            var11 = false;
        }
        if (var11) {
            class212.method1330(1);
        } else {
            class210.method1319();
        }
        if (arg0 <= 73) {
            method1498((byte) -102);
        }
        for (int var13 = 0; var13 < 4; var13++) {
            class217.field3510[var13].method1748((byte) -68);
        }
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 104; var15++) {
                for (int var16 = 0; var16 < 104; var16++) {
                    class111.field1707[var14][var15][var16] = 0;
                }
            }
        }
        class234.method1510(false, -60);
        class172.field2724.method247();
        for (int var17 = 0; var17 < 13; var17++) {
            for (int var18 = 0; var18 < 13; var18++) {
                class172.field2721[var17][var18].field2205 = true;
            }
        }
        class125.method843();
        class9.method101(-90);
        class91.method624(4096);
        System.gc();
        class91.method624(4096);
        class108.method698(true, (byte) 126);
        class94.method640(false, true);
        if (!class36.field540) {
            class36.method270(0, false);
            class108.method698(true, (byte) 76);
            int var19 = class124.field1917.field4963[0] >> 3;
            int var20 = class124.field1917.field4973[0] >> 3;
            class268.method1781(var19, var20, -103);
            class168.method1061(26001, false);
            if (class49.field748 != null) {
                method1496(-5219);
            }
        }
        if (class36.field540) {
            class132.method872(false, (byte) 41);
            class108.method698(true, (byte) 79);
            int var21 = class124.field1917.field4963[0] >> 3;
            int var22 = class124.field1917.field4973[0] >> 3;
            class268.method1781(var21, var22, 19);
            class128.method852(-113, false);
        }
        class181.method1158(0);
        class108.method698(true, (byte) 113);
        class91.method624(4096);
        class161.method1027(false, 110, class217.field3510);
        class125.method842();
        class108.method698(true, (byte) 114);
        class91.method624(4096);
        int var23 = class88.field1354;
        if (class10.field189 < var23) {
            var23 = class10.field189;
        }
        if ((class10.field189 - 1) > var23) {
            int var24 = class10.field189 - 1;
        }
        if (class64.method479(301989888)) {
            class74.method529(0);
        } else {
            class74.method529(class88.field1354);
        }
        class279.method1855(0);
        if (var11) {
            class155.method988(true);
            class94.method640(true, true);
            if (!class36.field540) {
                class36.method270(0, true);
                class108.method698(true, (byte) 61);
                class168.method1061(26001, true);
            }
            if (class36.field540) {
                class132.method872(true, (byte) 122);
                class108.method698(true, (byte) 92);
                class128.method852(-114, true);
            }
            class181.method1158(0);
            class108.method698(true, (byte) 78);
            class91.method624(4096);
            class161.method1027(true, 108, class217.field3510);
            class108.method698(true, (byte) 95);
            class91.method624(4096);
            class279.method1855(0);
            class155.method988(false);
        }
        for (int var25 = 0; var25 < 13; var25++) {
            for (int var26 = 0; var26 < 13; var26++) {
                class172.field2721[var25][var26].method906(class57.field926[0], var25 * 8, var26 * 8);
            }
        }
        for (int var27 = 0; var27 < 104; var27++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class54.method400(var27, var28, 9807);
            }
        }
        class91.method624(4096);
        class246.method1601((byte) 110);
        class181.method1158(0);
        if (class118.field1808 != null && class44.field660 != null) {
            class269.field4429++;
            class6.field149.method966(0, 62);
            class6.field149.method26(1057001181, 125);
        }
        if (!class36.field540) {
            int var29 = (class177.field2816 + 6) / 8;
            int var30 = (class55.field884 - 6) / 8;
            int var31 = (class177.field2816 - 6) / 8;
            int var32 = (class55.field884 + 6) / 8;
            for (int var33 = var31 - 1; var33 <= (var29 + 1); var33++) {
                for (int var34 = var30 - 1; var34 <= (var32 + 1); var34++) {
                    if (var33 < var31 || var29 < var33 || var30 > var34 || var32 < var34) {
                        class196.field3152.method284(class170.method1074(new class119[] { class164.field2582, class234.method1506(var33, (byte) -79), class94.field1454, class234.method1506(var34, (byte) -79) }, -72), 27466);
                        class196.field3152.method284(class170.method1074(new class119[] { class193.field3091, class234.method1506(var33, (byte) -79), class94.field1454, class234.method1506(var34, (byte) -79) }, -110), 27466);
                    }
                }
            }
        }
        if (class214.field3407 == 28) {
            class204.method1289(-122, 10);
        } else {
            class204.method1289(126, 30);
        }
        class91.method624(4096);
        if (class44.field660 != null) {
            class6.field149.method966(0, 178);
        }
        class184.method1173(32);
    }
}

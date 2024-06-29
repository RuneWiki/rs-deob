import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class107 {

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Lmh;")
    public static class62 field1733 = class201.method1405(true, "Konfig geladen)3");

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field1735 = 0;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "Lmh;")
    public static class62 field1731 = class201.method1405(true, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "[Lhh;")
    public static class294[] field1732 = new class294[27];

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILhi;)V", line = 5)
    public static final void method826(int arg0, class26 arg1) {
        if (arg0 != 5863) {
            field1733 = (class62) null;
        }
        field1734++;
        class92.field1520 = arg1;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZIIIII)V", line = 16)
    public static final void method827(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1730++;
        class282.field4815++;
        if (!arg0) {
            class170.method1224((byte) 93, true);
            class70.method509(true, (byte) 10);
            class170.method1224((byte) -119, false);
        }
        class70.method509(false, (byte) 10);
        if (!arg0) {
            class101.method803(arg4 + 19933);
        }
        if (arg4 != -19934) {
            field1735 = -122;
        }
        class105.method822(arg4 + 19934);
        class206.method1449(false, arg2, arg1, arg3, arg5, true);
        int var6 = class199.field3370;
        int var7 = class254.field4318;
        int var8 = class182.field2898;
        int var9 = class102.field1673;
        if (class21.field220 == 1) {
            int var10 = class267.field4516 + class215.field3646 & 0x7FF;
            int var11 = class20.field208;
            if (var11 < class254.field4316 / 256) {
                var11 = class254.field4316 / 256;
            }
            if (class219.field3774[4] && class298.field5087[4] + 128 > var11) {
                var11 = class298.field5087[4] + 128;
            }
            class100.method798((var11 * 3) + 600, var9, var11, class170.field2769, var10, class2.field24, (byte) 22, class165.method1186((byte) -58, class268.field4551.field3814, class268.field4551.field3821, class7.field85) - 50);
        }
        int var12 = class15.field134;
        int var13 = class258.field4351;
        int var14 = class215.field3647;
        int var15 = class46.field683;
        int var16 = class30.field414;
        for (int var17 = 0; var17 < 5; var17++) {
            if (class219.field3774[var17]) {
                int var18 = (int) ((double) (-class26.field302[var17]) + (double) (class26.field302[var17] * 2 + 1) * Math.random() + Math.sin((double) class30.field411[var17] / 100.0D * (double) class186.field2979[var17]) * (double) class298.field5087[var17]);
                if (var17 == 0) {
                    class258.field4351 += var18;
                }
                if (var17 == 1) {
                    class15.field134 += var18;
                }
                if (var17 == 2) {
                    class215.field3647 += var18;
                }
                if (var17 == 3) {
                    class30.field414 = class30.field414 + var18 & 0x7FF;
                }
                if (var17 == 4) {
                    class46.field683 += var18;
                    if (class46.field683 < 128) {
                        class46.field683 = 128;
                    }
                    if (class46.field683 > 383) {
                        class46.field683 = 383;
                    }
                }
            }
        }
        class94.method761(false);
        class311.method2118(var7, var8, var6 + var7, var8 + var9);
        float var19 = (float) class46.field683 * 0.17578125F;
        float var20 = (float) class30.field414 * 0.17578125F;
        if (class21.field220 == 3) {
            var20 = class115.field1928 * 360.0F / 6.2831855F;
            var19 = class15.field125 * 360.0F / 6.2831855F;
        }
        class154.method1111(var7, var8, var6, var9, var7 + (var6 / 2), var9 / 2 + var8, var19, var20, class195.field3287, class195.field3287);
        if (class80.field1341 || var7 > class45.field678 || class45.field678 >= var6 + var7 || var8 > class113.field1883 || class113.field1883 >= var8 + var9) {
            class221.field3790 = false;
            class288.field4910 = 0;
        } else {
            class288.field4910 = 0;
            class221.field3790 = true;
            int var21 = class244.field4160;
            int var22 = class221.field3804;
            class41.field631 = (class45.field678 - var7) * (var22 - var21) / var6 + var21;
            int var23 = class24.field263;
            int var24 = class8.field90;
            class218.field3743 = (class113.field1883 - var8) * (var24 - var23) / var9 + var23;
        }
        class209.method1460(121);
        byte var25 = class244.method1710(-28075) == 2 ? (byte) class282.field4815 : 1;
        class154.method1122();
        class154.method1137(true);
        class154.method1120(true);
        boolean var26 = false;
        int var27;
        if (class118.field1983 == 10) {
            var27 = class269.method1847(class258.field4351 >> 10, class215.field3647 >> 10, (byte) -110, class277.field4757, class44.field662);
        } else {
            var27 = class269.method1847(class268.field4551.field3828[0] >> 3, class268.field4551.field3846[0] >> 3, (byte) -120, class277.field4757, class44.field662);
        }
        class117.method903(class199.field3367, !class92.field1499);
        class154.method1109(var27);
        class251.method1746(class258.field4351, (byte) -89, class215.field3647, class46.field683, class30.field414, class15.field134);
        class154.field2455 = class199.field3367;
        class185.method1297(class258.field4351, class15.field134, class215.field3647, class46.field683, class30.field414, class15.field121, class256.field4332, class21.field219, class219.field3779, class54.field791, class122.field2026, class7.field85 + 1, var25, class268.field4551.field3821 >> 7, class268.field4551.field3814 >> 7);
        class230.field3989 = true;
        class117.method906();
        class251.method1746(0, (byte) -92, 0, 0, 0, 0);
        class209.method1460(126);
        class50.method326();
        class215.method1518(-126, var9, class195.field3287, class195.field3287, var8, var6, var7);
        class153.method1103(var8, var9, class195.field3287, (byte) 119, var7, class195.field3287, var6);
        ((class29) class23.field248).method177((byte) 110, class277.field4757);
        class4.method19(arg4 + 19810, var7, var8, var9, var6);
        class15.field134 = var12;
        class215.field3647 = var14;
        class258.field4351 = var13;
        class46.field683 = var15;
        class30.field414 = var16;
        if (class90.field1427 && class246.field4185.method1762(-104) == 0) {
            class90.field1427 = false;
        }
        if (class90.field1427) {
            class311.method2117(var7, var8, var6, var9, 0);
            class17.method67(class74.field1139, false, arg4 + 19944);
        }
        if (!arg0 && !class90.field1427 && !class80.field1341 && class45.field678 >= var7 && var7 + var6 > class45.field678 && class113.field1883 >= var8 && class113.field1883 < var8 + var9) {
            class2.method12(var6, var8, var9, class45.field678, class113.field1883, var7, -122);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLna;)V", line = 209)
    public static final void method828(byte arg0, class153 arg1) {
        if (arg0 != 102) {
            method828((byte) -31, (class153) null);
        }
        class114 var2 = (class114) class243.field4134.method311((byte) 114, arg1.field2430.method451(116));
        if (var2 != null) {
            if (var2.field1898 != null) {
                class27.field331.method132(var2.field1898);
                var2.field1898 = null;
            }
            var2.method1444((byte) 89);
        }
        field1736++;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 266)
    public static void method829(int arg0) {
        field1733 = null;
        field1732 = null;
        field1731 = null;
        if (arg0 != 271667011) {
            field1737 = 77;
        }
    }
}

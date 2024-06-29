import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class2 extends class195 {

    @OriginalMember(owner = "client!ia", name = "W", descriptor = "I")
    private int field25 = 2048;

    @OriginalMember(owner = "client!ia", name = "hb", descriptor = "I")
    private int field36 = 1024;

    @OriginalMember(owner = "client!ia", name = "ib", descriptor = "I")
    private int field37 = 3072;

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "Lck;")
    public static class119 field23 = class298.method1987((byte) 115, "broadwater");

    @OriginalMember(owner = "client!ia", name = "V", descriptor = "Lck;")
    public static class119 field24 = class298.method1987((byte) 77, "<col=00ff00>");

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "Lck;")
    public static class119 field26 = class298.method1987((byte) 92, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!ia", name = "ab", descriptor = "Lck;")
    public static class119 field29 = class298.method1987((byte) 63, "Texturen geladen)3");

    @OriginalMember(owner = "client!ia", name = "Y", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!ia", name = "Z", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ia", name = "bb", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ia", name = "cb", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!ia", name = "db", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ia", name = "eb", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!ia", name = "fb", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!ia", name = "gb", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ia", name = "jb", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)V", line = 11)
    public static final void method6(byte arg0) {
        field30++;
        for (int var1 = 0; var1 < 5; var1++) {
            class55.field883[var1] = false;
        }
        if (arg0 >= -120) {
            method8((byte) 63);
        }
        class68.field1063 = 1;
        class72.field1124 = -1;
        class150.field2381 = -1;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V", line = 515)
    public class2() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V", line = 39)
    public static final void method7(int arg0) {
        if (class119.field1822 != -1) {
            class184.method1167((byte) 55, class119.field1822);
        }
        field35++;
        for (int var1 = 0; var1 < class36.field499; var1++) {
            if (class212.field3379[var1]) {
                class187.field2940[var1] = true;
            }
            class108.field1657[var1] = class212.field3379[var1];
            class212.field3379[var1] = false;
        }
        class198.field3167 = null;
        class291.field4769 = arg0;
        class89.field1356 = class1.field15;
        class132.field2010 = true;
        class170.field2698 = -1;
        if (class119.field1822 != -1) {
            class36.field499 = 0;
            class182.method1163(0, false, class131.field2000, class119.field1822, -1, 0, 0, class269.field4437, 0);
        }
        class121.method816();
        class164.field2592 = 0;
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(B)V", line = 79)
    public static void method8(byte arg0) {
        field29 = null;
        int var1 = 75 % ((-arg0 - 32) / 37);
        field24 = null;
        field23 = null;
        field26 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)[[I", line = 91)
    public final int[][] method9(byte arg0, int arg1) {
        field31++;
        if (arg0 != 3) {
            this.method9((byte) -11, 44);
        }
        int[][] var3 = this.field3126.method603(arg1, arg0 ^ 0xFFFFFF83);
        if (this.field3126.field1372) {
            int[][] var4 = this.method1256(arg1, 0, -10072);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class157.field2504; var11++) {
                var8[var11] = this.field36 + (var5[var11] * this.field25 >> 12);
                var9[var11] = this.field36 + (var7[var11] * this.field25 >> 12);
                var10[var11] = (var6[var11] * this.field25 >> 12) + this.field36;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILba;I)V", line = 142)
    public static final void method10(int arg0, int arg1, class292 arg2, int arg3) {
        field32++;
        if ((arg0 & 0x20) != 0) {
            arg2.field4952 = class22.field333.method54(31935);
            if (arg2.field4952 == 65535) {
                arg2.field4952 = -1;
            }
        }
        if ((arg0 & 0x1) != 0) {
            arg2.field5009 = class22.field333.method63((byte) 1);
            arg2.field4969 = class22.field333.method63((byte) 1);
        }
        if ((arg0 & 0x100) != 0) {
            arg2.field4962 = class22.field333.method15((byte) 92);
            int var4 = class22.field333.method46(-110);
            if (arg2.field4962 == 65535) {
                arg2.field4962 = -1;
            }
            arg2.field4992 = (var4 & 0xFFFF) + class1.field15;
            arg2.field4995 = var4 >> 16;
            arg2.field4965 = 0;
            if (arg2.field4992 > class1.field15) {
                arg2.field4965 = -1;
            }
            arg2.field4998 = 0;
        }
        if ((arg0 & 0x200) != 0) {
            int var5 = class22.field333.method64((byte) -124);
            int var6 = class22.field333.method64((byte) -123);
            arg2.method1983(class1.field15, var5, 20718, var6);
        }
        if ((arg0 & 0x80) != 0) {
            int var7 = class22.field333.method64((byte) 27);
            byte[] var8 = new byte[var7];
            class3 var9 = new class3(var8);
            class22.field333.method60(4, 0, var7, var8);
            class236.field3793[arg1] = var9;
            arg2.method1945(31908, var9);
        }
        if ((arg0 & 0x2) != 0) {
            int var10 = class22.field333.method15((byte) 100);
            int var11 = class22.field333.method58(255);
            boolean var12 = (var10 & 0x8000) != 0;
            int var13 = class22.field333.method45((byte) -126);
            int var14 = class22.field333.field44;
            if (arg2.field4861 != null && arg2.field4848 != null) {
                long var15 = arg2.field4861.method786((byte) 112);
                boolean var17 = false;
                if (var11 <= 1) {
                    if (!var12 && class261.field4180 == 1 || class245.field3972 == 1) {
                        var17 = true;
                    } else {
                        for (int var18 = 0; var18 < class151.field2399; var18++) {
                            if (class96.field1476[var18] == var15) {
                                var17 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var17 && class87.field1330 == 0) {
                    class13.field214.field44 = 0;
                    class22.field333.method74(0, var13, class13.field214.field101, -338172528);
                    class13.field214.field44 = 0;
                    int var19 = -1;
                    class119 var21;
                    if (var12) {
                        var10 &= 0x7FFF;
                        class268 var20 = class75.method539(class13.field214, (byte) -23);
                        var19 = var20.field4418;
                        var21 = var20.field4428.method160(-5418, class13.field214);
                    } else {
                        var21 = class278.method1849(class62.method467((byte) -20, class13.field214).method752(-11227));
                    }
                    arg2.field4994 = var21.method787((byte) 25);
                    arg2.field4997 = 150;
                    arg2.field4944 = var10 & 0xFF;
                    arg2.field4940 = var10 >> 8;
                    if (var11 == 2) {
                        class24.method184(122, var21, var12 ? 17 : 1, class170.method1074(new class119[] { class3.field93, arg2.field4861 }, -91), (class119) null, var19);
                    } else if (var11 == 1) {
                        class24.method184(121, var21, var12 ? 17 : 1, class170.method1074(new class119[] { class222.field3583, arg2.field4861 }, -78), (class119) null, var19);
                    } else {
                        class24.method184(122, var21, var12 ? 17 : 2, arg2.field4861, (class119) null, var19);
                    }
                }
            }
            class22.field333.field44 = var14 + var13;
        }
        if ((arg0 & 0x400) != 0) {
            arg2.field4987 = class22.field333.method45((byte) -126);
            arg2.field4974 = class22.field333.method64((byte) -95);
            arg2.field5004 = class22.field333.method58(255);
            arg2.field4960 = class22.field333.method45((byte) -126);
            arg2.field4954 = class22.field333.method54(31935) + class1.field15;
            arg2.field5002 = class22.field333.method23(-73) + class1.field15;
            arg2.field4942 = class22.field333.method64((byte) 59);
            arg2.field4990 = 1;
            arg2.field4996 = 0;
        }
        if ((arg0 & 0x8) != 0) {
            int var22 = class22.field333.method54(31935);
            int var23 = class22.field333.method64((byte) 103);
            if (var22 == 65535) {
                var22 = -1;
            }
            class163.method1037(arg2, 0, var23, var22);
        }
        int var24 = 118 / ((73 - arg3) / 47);
        if ((arg0 & 0x40) != 0) {
            arg2.field4994 = class22.field333.method41((byte) -124);
            if (arg2.field4994.method755((byte) -60, 0) == 126) {
                arg2.field4994 = arg2.field4994.method769(-76, 1);
                class54.method401((byte) -128, arg2.field4994, 2, arg2.field4861);
            } else if (class124.field1917 == arg2) {
                class54.method401((byte) -116, arg2.field4994, 2, arg2.field4861);
            }
            arg2.field4944 = 0;
            arg2.field4997 = 150;
            arg2.field4940 = 0;
        }
        if ((arg0 & 0x10) == 0) {
            return;
        }
        int var25 = class22.field333.method58(255);
        int var26 = class22.field333.method45((byte) -126);
        arg2.method1983(class1.field15, var25, 20718, var26);
        arg2.field4961 = class1.field15 + 300;
        arg2.field4972 = class22.field333.method45((byte) -126);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZ)[I", line = 369)
    public final int[] method11(int arg0, boolean arg1) {
        field28++;
        int[] var3 = this.field3106.method924(100, arg0);
        if (this.field3106.field2260) {
            int[] var4 = this.method1253(0, 61, arg0);
            for (int var5 = 0; var5 < class157.field2504; var5++) {
                var3[var5] = (var4[var5] * this.field25 >> 12) + this.field36;
            }
        }
        if (arg1) {
            field26 = (class119) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lva;I)I", line = 403)
    public static final int method12(class36 arg0, int arg1) {
        field34++;
        int var2 = 0;
        if (arg0.method267((byte) 4, class86.field1303)) {
            var2++;
        }
        if (arg0.method267((byte) 4, class270.field4452)) {
            var2++;
        }
        int var3 = -43 / ((arg1 + 40) / 47);
        if (arg0.method267((byte) 4, class87.field1323)) {
            var2++;
        }
        if (arg0.method267((byte) 4, class139.field2228)) {
            var2++;
        }
        if (arg0.method267((byte) 4, class85.field1286)) {
            var2++;
        }
        if (arg0.method267((byte) 4, class221.field3543)) {
            var2++;
        }
        if (arg0.method267((byte) 4, class74.field1164)) {
            var2++;
        }
        if (arg0.method267((byte) 4, class291.field4813)) {
            var2++;
        }
        if (arg0.method267((byte) 4, class162.field2560)) {
            var2++;
        }
        if (arg0.method267((byte) 4, class101.field1532)) {
            var2++;
        }
        if (arg0.method267((byte) 4, class63.field1000)) {
            var2++;
        }
        if (arg0.method267((byte) 4, class216.field3458)) {
            var2++;
        }
        if (arg0.method267((byte) 4, class206.field3270)) {
            var2++;
        }
        if (arg0.method267((byte) 4, class20.field292)) {
            var2++;
        }
        if (arg0.method267((byte) 4, class185.field2924)) {
            var2++;
        }
        if (arg0.method267((byte) 4, class151.field2409)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lfj;II)V", line = 469)
    public final void method13(class3 arg0, int arg1, int arg2) {
        if (arg1 > -117) {
            return;
        }
        field33++;
        if (arg2 == 0) {
            this.field36 = arg0.method63((byte) 1);
        } else if (arg2 == 1) {
            this.field37 = arg0.method63((byte) 1);
        } else if (arg2 == 2) {
            this.field3127 = arg0.method64((byte) 100) == 1;
        }
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)V", line = 530)
    public final void method14(int arg0) {
        field38++;
        this.field25 = this.field37 - this.field36;
        if (arg0 != 2048879374) {
            field26 = (class119) null;
        }
    }
}

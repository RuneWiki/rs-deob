import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class404 extends class416 {

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "Lhi;")
    public class207 field5635;

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "Lse;")
    public class259 field5634;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "Z")
    public static boolean field5629 = false;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "F")
    public static float field5631;

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "I")
    public int field5628;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "I")
    public static int field5630;

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "I")
    public int field5632;

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "I")
    public int field5633;

    @OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!tb", name = "H", descriptor = "I")
    public int field5638;

    @OriginalMember(owner = "client!tb", name = "I", descriptor = "I")
    public int field5639;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)I", line = 3)
    public static final int method2374(int arg0, int arg1) {
        field5637++;
        byte var2;
        if (arg1 > 12000) {
            var2 = 4;
            class660.method3578((byte) -95);
        } else if (arg1 > 5000) {
            class588.method3212(arg0);
            var2 = 3;
        } else if (arg1 > 2000) {
            var2 = 2;
            class615.method3356((byte) -126);
        } else {
            class656.method3567(1, true);
            var2 = 1;
        }
        if (arg0 != 0) {
            return 48;
        }
        if (class411.field5711.field3913.method3282(true) != 2) {
            class411.field5711.method1677(class411.field5711.field3877, (byte) -71, 2);
            class421.method2435(false, arg0 ^ 0x3F, 2);
        }
        class2.method15(17458);
        return var2;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)I", line = 56)
    public static final int method2375(int arg0) {
        field5630++;
        if (class185.field2802 == 0) {
            class101.field1383.method755((byte) -112, new class659("jaclib"));
            if (class101.field1383.method762((byte) 86).method78(arg0 - 20701) != 100) {
                return 1;
            }
            if (!((class659) class101.field1383.method762((byte) -117)).method3574(-92)) {
                class243.field3401.method2132(7);
            }
            class185.field2802 = 1;
        }
        if (class185.field2802 == 1) {
            class392.field5481 = class101.method753((byte) -82);
            class101.field1379.method755((byte) -112, new class706(class456.field6215));
            class101.field1388.method755((byte) -112, new class659("jaggl"));
            class101.field1390.method755((byte) -112, new class659("jagdx"));
            class101.field1391.method755((byte) -112, new class659("jagmisc"));
            class101.field1392.method755((byte) -112, new class659("sw3d"));
            class101.field1393.method755((byte) -112, new class659("hw3d"));
            class101.field1394.method755((byte) -112, new class659("jagtheora"));
            class101.field1395.method755((byte) -112, new class706(class361.field5087));
            class101.field1396.method755((byte) -112, new class706(class753.field10500));
            class101.field1397.method755((byte) -112, new class706(class622.field8296));
            class101.field1398.method755((byte) -112, new class706(class654.field8670));
            class101.field1399.method755((byte) -112, new class706(class352.field4951));
            class101.field1400.method755((byte) -112, new class706(class324.field4602));
            class101.field1401.method755((byte) -112, new class706(class254.field3491));
            class101.field1402.method755((byte) -112, new class706(class187.field2825));
            class101.field1403.method755((byte) -112, new class706(class423.field5827));
            class101.field1404.method755((byte) -112, new class706(class466.field6413));
            class101.field1405.method755((byte) -112, new class706(class382.field5304));
            class101.field1406.method755((byte) -112, new class706(class53.field654));
            class101.field1407.method755((byte) -112, new class706(class534.field7038));
            class101.field1408.method755((byte) -112, new class706(class434.field5973));
            class101.field1409.method755((byte) -112, new class5(class469.field6433, "huffman"));
            class101.field1410.method755((byte) -112, new class706(class6.field138));
            class101.field1411.method755((byte) -112, new class706(class606.field7972));
            class101.field1412.method755((byte) -112, new class706(class275.field3836));
            class101.field1413.method755((byte) -112, new class442(class135.field2156, "details"));
            for (int var1 = 0; var1 < class392.field5481.length; var1++) {
                if (class392.field5481[var1].method762((byte) 81) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class101[] var3 = class392.field5481;
            for (int var4 = 0; var4 < var3.length; var4++) {
                class101 var5 = var3[var4];
                int var6 = var5.method759(1);
                int var7 = var5.method762((byte) -116).method78(arg0 - 20701);
                var2 += var6 * var7 / 100;
            }
            class185.field2802 = 2;
            class123.field2068 = var2;
        }
        if (class392.field5481 == null) {
            return 100;
        }
        int var8 = 0;
        int var9 = arg0;
        boolean var10 = true;
        class101[] var11 = class392.field5481;
        for (int var12 = 0; var12 < var11.length; var12++) {
            class101 var16 = var11[var12];
            int var17 = var16.method759(arg0 ^ 0x1);
            int var18 = var16.method762((byte) 10).method78(arg0 - 20701);
            var8 += var17;
            var9 += var17 * var18 / 100;
            if (var18 < 100) {
                var10 = false;
            }
        }
        if (var10) {
            if (!((class659) class101.field1391.method762((byte) -109)).method3574(-78)) {
                class243.field3401.method2131((byte) -127);
            }
            if (!((class659) class101.field1394.method762((byte) 88)).method3574(-58)) {
                class201.field3019 = class243.field3401.method2125(122);
            }
            class392.field5481 = null;
        }
        int var13 = var8 - class123.field2068;
        int var14 = var9 - class123.field2068;
        int var15 = var13 > 0 ? var14 * 100 / var13 : 100;
        if (!var10 && var15 > 99) {
            var15 = 99;
        }
        return var15;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V", line = 202)
    public final void method2376(int arg0) {
        this.field5632 = this.field5635.field3079;
        this.field5638 = this.field5635.field3073;
        if (arg0 != 25201) {
            this.field5635 = null;
        }
        field5636++;
        this.field5639 = this.field5635.field3072;
        if (this.field5635.field3070 != null) {
            this.field5635.field3070.method1728(this.field5634.field3613, this.field5634.field3606, this.field5634.field3617, class537.field7076);
        }
        this.field5633 = class537.field7076[0];
        this.field5628 = class537.field7076[2];
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lhi;Ll;)V", line = 232)
    public class404(class207 arg0, class17 arg1) {
        this.field5635 = arg0;
        this.field5634 = this.field5635.method1384(0);
        this.method2376(25201);
    }
}

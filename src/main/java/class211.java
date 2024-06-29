import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class211 {

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3369 = "shake:";

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "[[B")
    public static byte[][] field3372 = new byte[250][];

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "Lik;")
    public static class259 field3367 = new class259(64);

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "[Z")
    public static boolean[] field3373 = new boolean[5];

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "[I")
    public static int[] field3375;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "[[S")
    public static short[][] field3370;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V", line = 7)
    public static final void method1533(int arg0) {
        field3374++;
        if (class81.field1222 == null) {
            return;
        }
        if (class78.field1183 < 10) {
            if (!class229.field3644.method469(class81.field1222.field2624, -1465)) {
                class78.field1183 = class219.field3510.method461(class81.field1222.field2624, (byte) 61) / 10;
                return;
            }
            class65.method495((byte) -62);
            class78.field1183 = 10;
        }
        if (class78.field1183 == 10) {
            class310.field4885 = class81.field1222.field2623 >> 6 << 6;
            class70.field1107 = class81.field1222.field2634 >> 6 << 6;
            if (class81.field1222.field2638 == 37) {
                class101.field1719 = 3.0F;
                class54.field862 = 3.0F;
            } else if (class81.field1222.field2638 == 50) {
                class101.field1719 = 4.0F;
                class54.field862 = 4.0F;
            } else if (class81.field1222.field2638 == 75) {
                class101.field1719 = 6.0F;
                class54.field862 = 6.0F;
            } else if (class81.field1222.field2638 == 100) {
                class101.field1719 = 8.0F;
                class54.field862 = 8.0F;
            } else if (class81.field1222.field2638 == 200) {
                class101.field1719 = 16.0F;
                class54.field862 = 16.0F;
            } else {
                class101.field1719 = 8.0F;
                class54.field862 = 8.0F;
            }
            class279.field4316 = (class81.field1222.field2622 >> 6 << 6) + 64 - class70.field1107;
            class79.field1208 = (class81.field1222.field2632 >> 6 << 6) + 64 - class310.field4885;
            int var1 = (class19.field356.field1442 >> 7) + class177.field2780 - class310.field4885;
            int var2 = var1 + (int) (Math.random() * 10.0D) - 5;
            int var3 = class70.field1107 + class279.field4316 - (class19.field356.field1369 >> 7) - class91.field1485 - 1;
            int var4 = var3 + ((int) (Math.random() * 10.0D) - 5);
            if (var2 >= 0 && class79.field1208 > var2 && var4 >= 0 && var4 < class279.field4316) {
                class95.field1565 = var4;
                class40.field725 = var2;
            } else {
                class40.field725 = class81.field1222.field2618 * 64 - class310.field4885;
                class95.field1565 = class279.field4316 + class70.field1107 - (class81.field1222.field2619 * 64) - 1;
            }
            class40.method326(-1);
            int var5 = class100.field1644 >> 2 << 10;
            class23.field403 = new int[class222.field3565 + 1];
            int var6 = class279.field4316 >> 6;
            int var7 = class79.field1208 >> 6;
            class195.field3110 = new byte[var7][var6][];
            class148.field2387 = new int[var7][var6][];
            class151.field2432 = new byte[var7][var6][];
            int var8 = class191.field3058 >> 1;
            class168.field2607 = new byte[var7][var6][];
            class210.field3362 = new int[var7][var6][];
            class276.field4279 = new byte[var7][var6][];
            class222.field3562 = new int[var7][var6][];
            class139.field2218 = new byte[var7][var6][];
            class95.method681(var5, -3873, var8);
            class78.field1183 = 20;
        } else if (class78.field1183 == 20) {
            class19.method152(new class101(class229.field3644.method484(class81.field1222.field2624, "underlay", false)), 896);
            class78.field1183 = 30;
            class64.method460(50, true);
            class180.method1344(127);
        } else if (class78.field1183 == 30) {
            class8.method68(127, new class101(class229.field3644.method484(class81.field1222.field2624, "overlay", false)));
            class78.field1183 = 40;
            class180.method1344(127);
        } else if (class78.field1183 == 40) {
            class244.method1736(new class101(class229.field3644.method484(class81.field1222.field2624, "overlay2", false)), (byte) -55);
            class78.field1183 = 50;
            class180.method1344(127);
        } else if (class78.field1183 == 50) {
            class34.method243(new class101(class229.field3644.method484(class81.field1222.field2624, "loc", false)), -1);
            class78.field1183 = 60;
            class64.method460(50, true);
            class180.method1344(124);
        } else if (class78.field1183 == 60) {
            if (class229.field3644.method486(class81.field1222.field2624 + "_labels", 1)) {
                if (!class229.field3644.method469(class81.field1222.field2624 + "_labels", arg0 ^ 0x6090)) {
                    return;
                }
                class43.field763 = class101.method763((byte) -66, class229.field3644, class81.field1222.field2624 + "_labels");
            } else {
                class43.field763 = new class198(0);
            }
            class78.field1183 = 70;
            class180.method1344(126);
        } else if (class78.field1183 == 70) {
            class12.field229 = new class241(11, true, class2.field7);
            class78.field1183 = 73;
            class64.method460(50, true);
            class180.method1344(126);
        } else if (class78.field1183 == 73) {
            class109.field1803 = new class241(12, true, class2.field7);
            class78.field1183 = 76;
            class64.method460(50, true);
            class180.method1344(124);
        } else if (class78.field1183 == 76) {
            class141.field2239 = new class241(14, true, class2.field7);
            class78.field1183 = 79;
            class64.method460(50, true);
            class180.method1344(127);
        } else if (class78.field1183 == 79) {
            class240.field3735 = new class241(17, true, class2.field7);
            class78.field1183 = 82;
            class64.method460(50, true);
            class180.method1344(127);
        } else if (class78.field1183 == 82) {
            class61.field952 = new class241(19, true, class2.field7);
            class78.field1183 = 85;
            class64.method460(50, true);
            class180.method1344(125);
        } else if (class78.field1183 == 85) {
            class98.field1629 = new class241(22, true, class2.field7);
            class78.field1183 = 88;
            class64.method460(50, true);
            class180.method1344(126);
        } else if (class78.field1183 == 88) {
            class170.field2647 = new class241(26, true, class2.field7);
            class78.field1183 = 91;
            class64.method460(arg0 ^ 0xFFFF9AE5, true);
            class180.method1344(125);
        } else {
            class216.field3455 = new class241(30, true, class2.field7);
            class78.field1183 = 100;
            class64.method460(50, true);
            class180.method1344(arg0 + 26024);
            System.gc();
            if (arg0 != -25897) {
                field3369 = (String) null;
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V", line = 235)
    public static void method1534(int arg0) {
        field3373 = null;
        field3372 = (byte[][]) null;
        field3370 = (short[][]) null;
        field3369 = null;
        field3375 = null;
        if (arg0 != -12906) {
            method1535((byte) -110);
        }
        field3367 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)Z", line = 259)
    public static final boolean method1535(byte arg0) {
        if (arg0 != 63) {
            method1535((byte) -81);
        }
        field3371++;
        return class326.field5060 == 0 ? class45.field769.method273(false) : true;
    }
}

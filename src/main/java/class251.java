import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class251 {

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "Z")
    public static boolean field3422 = false;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "[I")
    public static int[] field3424 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public static int field3426 = 0;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "Lfca;")
    public static class661 field3427 = new class661();

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "Lrda;")
    public static class467 field3428 = new class467(16);

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BI)[B")
    public static final synchronized byte[] method1633(byte arg0, int arg1) {
        field3421++;
        if (arg1 == 100 && class108.field1465 > 0) {
            byte[] var2 = class448.field5841[--class108.field1465];
            class448.field5841[class108.field1465] = null;
            return var2;
        }
        if (arg0 <= 104) {
            method1637(41, (byte) -51);
        }
        if (arg1 == 5000 && class678.field8764 > 0) {
            byte[] var3 = class696.field8945[--class678.field8764];
            class696.field8945[class678.field8764] = null;
            return var3;
        } else if (arg1 == 30000 && class68.field905 > 0) {
            byte[] var4 = class698.field9260[--class68.field905];
            class698.field9260[class68.field905] = null;
            return var4;
        } else {
            if (class323.field3996 != null) {
                for (int var5 = 0; var5 < class507.field6479.length; var5++) {
                    if (class507.field6479[var5] == arg1 && class598.field7608[var5] > 0) {
                        byte[] var6 = class323.field3996[var5][--class598.field7608[var5]];
                        class323.field3996[var5][class598.field7608[var5]] = null;
                        return var6;
                    }
                }
            }
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public static final void method1634(int arg0) {
        field3419++;
        if (class558.field7086 <= 1) {
            class485.field6252.method2986(2, class485.field6252.field6932, (byte) 58);
        } else {
            class485.field6252.method2986(4, class485.field6252.field6932, (byte) -44);
        }
        if (arg0 != 7) {
            method1633((byte) -54, 62);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "([BI)V")
    public static final synchronized void method1635(byte[] arg0, int arg1) {
        field3423++;
        int var2 = -112 / ((arg1 + 70) / 49);
        if (arg0.length == 100 && class108.field1465 < 1000) {
            class448.field5841[class108.field1465++] = arg0;
        } else if (arg0.length == 5000 && class678.field8764 < 250) {
            class696.field8945[class678.field8764++] = arg0;
        } else if (arg0.length == 30000 && class68.field905 < 50) {
            class698.field9260[class68.field905++] = arg0;
        } else if (class323.field3996 != null) {
            for (int var3 = 0; var3 < class507.field6479.length; var3++) {
                if (class507.field6479[var3] == arg0.length && class598.field7608[var3] < class323.field3996[var3].length) {
                    class323.field3996[var3][class598.field7608[var3]++] = arg0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)V")
    public static void method1636(int arg0) {
        if (arg0 != -20292) {
            field3422 = true;
        }
        field3428 = null;
        field3427 = null;
        field3424 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IB)V")
    public static final void method1637(int arg0, byte arg1) {
        class495.method2753((byte) -128);
        field3420++;
        int var2 = class182.field2489.method2572(-111, arg0).field4026;
        if (arg1 > -66) {
            method1635(null, 62);
        }
        if (var2 == 0) {
            return;
        }
        int var3 = class381.field4705.field3081[arg0];
        if (var2 == 5) {
            class484.field6248 = var3;
        }
        if (var2 == 6) {
            class55.field710 = var3;
        }
    }
}

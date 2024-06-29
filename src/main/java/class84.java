import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class84 {

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public int field1507 = -1;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "Lhi;")
    private static class82 field1496 = class95.method664((byte) -109, "fr");

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "Lhi;")
    private static class82 field1497 = class95.method664((byte) -43, ")3en");

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "Lhi;")
    private static class82 field1502 = class95.method664((byte) -118, ")3de");

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "Lhi;")
    private static class82 field1509 = class95.method664((byte) -37, ")3fr");

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "Lhi;")
    private static class82 field1504 = class95.method664((byte) -125, "Loading world list data");

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "Lhi;")
    private static class82 field1511 = class95.method664((byte) -53, "de");

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "Lhi;")
    private static class82 field1501 = class95.method664((byte) -59, "en");

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "Lhi;")
    private static class82 field1498 = class95.method664((byte) -87, ")3pt");

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "Lhi;")
    private static class82 field1499 = class95.method664((byte) -96, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "Lhi;")
    public static class82 field1513 = field1504;

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "Lhi;")
    private static class82 field1519 = class95.method664((byte) -91, "pt");

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "Lhi;")
    public static class82 field1503 = field1499;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "[Lhi;")
    private static class82[] field1515 = new class82[] { field1497, field1502, field1509, field1498 };

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "[Lhi;")
    public static class82[] field1500 = new class82[] { field1501, field1511, field1496, field1519 };

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public int field1493;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public int field1494;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public int field1495;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public int field1506;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public int field1510;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "I")
    public int field1516;

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "I")
    public int field1517;

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "I")
    public int field1518;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "[Lve;")
    public static class212[] field1512;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Leg;IIIIIIZ)V", line = 12)
    public static final void method584(class41 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field713.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field713[var9] - class129.field2252;
            int var11 = arg0.field730[var9] - class191.field3210;
            int var12 = arg0.field709[var9] - class37.field621;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field710 != null) {
                class41.field726[var9] = var13;
                class41.field715[var9] = var16;
                class41.field722[var9] = var17;
            }
            class41.field714[var9] = (var13 << 9) / var17 + class102.field1817;
            class41.field728[var9] = (var16 << 9) / var17 + class102.field1811;
        }
        class102.field1814 = 0;
        int var19 = arg0.field725.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field725[var20];
            int var22 = arg0.field717[var20];
            int var23 = arg0.field718[var20];
            int var24 = class41.field714[var21];
            int var25 = class41.field714[var22];
            int var26 = class41.field714[var23];
            int var27 = class41.field728[var21];
            int var28 = class41.field728[var22];
            int var29 = class41.field728[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class257.field4414 && class44.method328(class133.field2310 + class102.field1817, class39.field673 + class102.field1811, var27, var28, var29, var24, var25, var26)) {
                    class100.field1799 = arg5;
                    class257.field4419 = arg6;
                }
                if (!class147.field2485 && !arg7) {
                    class102.field1806 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class102.field1807 || var25 > class102.field1807 || var26 > class102.field1807) {
                        class102.field1806 = true;
                    }
                    if (arg0.field710 == null || arg0.field710[var20] == -1) {
                        if (arg0.field724[var20] != 12345678) {
                            class102.method692(var27, var28, var29, var24, var25, var26, arg0.field724[var20], arg0.field711[var20], arg0.field727[var20]);
                        }
                    } else if (!class113.field2040) {
                        int var30 = class102.field1821.method627(arg0.field710[var20], -120);
                        class102.method692(var27, var28, var29, var24, var25, var26, class25.method159(var30, arg0.field724[var20]), class25.method159(var30, arg0.field711[var20]), class25.method159(var30, arg0.field727[var20]));
                    } else if (arg0.field721) {
                        class102.method705(var27, var28, var29, var24, var25, var26, arg0.field724[var20], arg0.field711[var20], arg0.field727[var20], class41.field726[0], class41.field726[1], class41.field726[3], class41.field715[0], class41.field715[1], class41.field715[3], class41.field722[0], class41.field722[1], class41.field722[3], arg0.field710[var20]);
                    } else {
                        class102.method705(var27, var28, var29, var24, var25, var26, arg0.field724[var20], arg0.field711[var20], arg0.field727[var20], class41.field726[var21], class41.field726[var22], class41.field726[var23], class41.field715[var21], class41.field715[var22], class41.field715[var23], class41.field722[var21], class41.field722[var22], class41.field722[var23], arg0.field710[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V", line = 134)
    public static void method585(int arg0) {
        field1498 = null;
        field1500 = null;
        field1515 = null;
        field1512 = null;
        field1504 = null;
        if (arg0 != 3) {
            method587(-117);
        }
        field1502 = null;
        field1499 = null;
        field1496 = null;
        field1501 = null;
        field1519 = null;
        field1513 = null;
        field1497 = null;
        field1511 = null;
        field1503 = null;
        field1509 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Leb;IBI)V", line = 189)
    public static final void method586(class275 arg0, int arg1, byte arg2, int arg3) {
        if (arg0.field1709 == arg3 && arg3 != -1) {
            class35 var4 = class284.method1973(arg3, false);
            int var5 = var4.field566;
            if (var5 == 1) {
                arg0.field1671 = arg1;
                arg0.field1655 = 0;
                arg0.field1659 = 0;
                arg0.field1708 = 0;
                class205.method1474(var4, false, arg0.field1659, arg0.field1685, arg0.field1689, (byte) -84);
            }
            if (var5 == 2) {
                arg0.field1655 = 0;
            }
        } else if (arg3 == -1 || arg0.field1709 == -1 || class284.method1973(arg3, false).field543 >= class284.method1973(arg0.field1709, false).field543) {
            arg0.field1708 = 0;
            arg0.field1659 = 0;
            arg0.field1722 = arg0.field1674;
            arg0.field1671 = arg1;
            arg0.field1709 = arg3;
            arg0.field1655 = 0;
            if (arg0.field1709 != -1) {
                class205.method1474(class284.method1973(arg0.field1709, false), false, arg0.field1659, arg0.field1685, arg0.field1689, (byte) -73);
            }
        }
        field1505++;
        if (arg2 >= -9) {
            method587(-77);
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)I", line = 269)
    public static final int method587(int arg0) {
        field1514++;
        if (arg0 <= 28) {
            method585(-69);
        }
        return class112.field2035;
    }
}

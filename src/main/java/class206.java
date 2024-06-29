import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class206 extends class376 {

    @OriginalMember(owner = "client!mn", name = "q", descriptor = "I")
    public int field2783 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!mn", name = "r", descriptor = "I")
    public int field2784 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!mn", name = "z", descriptor = "I")
    public int field2792 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!mn", name = "s", descriptor = "I")
    public int field2785 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!mn", name = "p", descriptor = "I")
    public int field2782 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!mn", name = "u", descriptor = "I")
    public int field2787 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!mn", name = "w", descriptor = "I")
    public int field2789 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!mn", name = "y", descriptor = "I")
    public int field2791 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!mn", name = "o", descriptor = "Lne;")
    public class173 field2781;

    @OriginalMember(owner = "client!mn", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field2793 = new String[100];

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!mn", name = "t", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!mn", name = "v", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!mn", name = "x", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V")
    public static final void method1345(int arg0) {
        field2786++;
        if (arg0 != -86) {
            field2793 = null;
        }
        class71.field1103.method1418((byte) -61);
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(B)V")
    public static void method1346(byte arg0) {
        int var1 = -64 / ((86 - arg0) / 38);
        field2793 = null;
    }

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "(I)J")
    public static final long method1347(int arg0) {
        field2780++;
        if (arg0 != -13952) {
            field2793 = null;
        }
        return class24.field340.method491(arg0 - 16467);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IBI)Z")
    public final boolean method1348(int arg0, byte arg1, int arg2) {
        field2790++;
        if (this.field2789 <= arg0 && arg0 <= this.field2783 && arg2 >= this.field2787 && this.field2792 >= arg2) {
            return true;
        } else {
            int var4 = -25 / ((arg1 - 14) / 41);
            return this.field2785 <= arg0 && arg0 <= this.field2791 && this.field2782 <= arg2 && arg2 <= this.field2784;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Laa;Lsr;B)V")
    public static final void method1349(class281 arg0, class136 arg1, byte arg2) {
        field2779++;
        if (class42.field618 == null) {
            return;
        }
        if (class24.field320 < 10) {
            if (!class42.field620.method1906(class42.field618.field1766, 125)) {
                class24.field320 = class441.field6379.method1913(class42.field618.field1766, false) / 10;
                return;
            }
            class356.method2303(-20844);
            class24.field320 = 10;
        }
        if (class24.field320 == 10) {
            class42.field641 = class42.field618.field1749 >> 6 << 6;
            class42.field650 = class42.field618.field1751 >> 6 << 6;
            class42.field646 = (class42.field618.field1759 >> 6 << 6) - (class42.field650 - 64);
            class42.field648 = (class42.field618.field1756 >> 6 << 6) + 64 - class42.field641;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class42.field618.method833(class449.field6509 + (class307.field4211.field6197 >> 7), var3, class265.field3617, false, (class307.field4211.field6192 >> 7) + class354.field4981)) {
                var5 = var3[2] - class42.field650;
                var4 = var3[1] - class42.field641;
            }
            if (!class308.field4217 && var4 >= 0 && class42.field648 > var4 && var5 >= 0 && class42.field646 > var5) {
                int var6 = var5 + ((int) (Math.random() * 10.0D) - 5);
                int var7 = var4 + ((int) (Math.random() * 10.0D) - 5);
                class339.field4742 = var7;
                class448.field6472 = var6;
            } else if (class222.field2978 == -1 || class223.field3012 == -1) {
                class42.field618.method839(true, class42.field618.field1764 & 0x3FFF, class42.field618.field1764 >> 14 & 0x3FFF, var3);
                class339.field4742 = var3[1] - class42.field641;
                class448.field6472 = var3[2] - class42.field650;
            } else {
                class42.field618.method839(true, class223.field3012, class222.field2978, var3);
                if (var3 != null) {
                    class339.field4742 = var3[1] - class42.field641;
                    class448.field6472 = var3[2] - class42.field650;
                }
                class223.field3012 = -1;
                class222.field2978 = -1;
                class308.field4217 = false;
            }
            if (class42.field618.field1752 == 37) {
                class42.field628 = 3.0F;
                class42.field629 = 3.0F;
            } else if (class42.field618.field1752 == 50) {
                class42.field628 = 4.0F;
                class42.field629 = 4.0F;
            } else if (class42.field618.field1752 == 75) {
                class42.field628 = 6.0F;
                class42.field629 = 6.0F;
            } else if (class42.field618.field1752 == 100) {
                class42.field628 = 8.0F;
                class42.field629 = 8.0F;
            } else if (class42.field618.field1752 == 200) {
                class42.field628 = 16.0F;
                class42.field629 = 16.0F;
            } else {
                class42.field628 = 8.0F;
                class42.field629 = 8.0F;
            }
            class42.field621 = (int) class42.field628 >> 1;
            class42.field627 = class125.method840(class42.field621, (byte) 43);
            class245.method1536((byte) 110);
            class42.method297();
            class448.field6462 = new class196();
            class42.field623 += (int) (Math.random() * 5.0D) - 2;
            if (class42.field623 < -8) {
                class42.field623 = -8;
            }
            if (class42.field623 > 8) {
                class42.field623 = 8;
            }
            class42.field625 += (int) (Math.random() * 5.0D) - 2;
            if (class42.field625 < -16) {
                class42.field625 = -16;
            }
            if (class42.field625 > 16) {
                class42.field625 = 16;
            }
            class42.method304(arg1, class42.field623 >> 2 << 10, class42.field625 >> 1);
            class143.method975(0, 1024, 256);
            class361.method2326(-25117, 256, 256);
            class280.method1718(108, 4096);
            class15.method84((byte) 72, 256);
            class24.field320 = 20;
        } else if (class24.field320 == 20) {
            class31.method240(true, (byte) 37);
            class42.method302(arg0, class42.field623, class42.field625);
            class24.field320 = 60;
            class31.method240(true, (byte) 37);
            class312.method1982((byte) 107);
        } else if (class24.field320 == 60) {
            if (class42.field620.method1893(class42.field618.field1766 + "_staticelements", (byte) 73)) {
                if (!class42.field620.method1906(class42.field618.field1766 + "_staticelements", 107)) {
                    return;
                }
                class42.field630 = class192.method1275(class293.field4055, class42.field618.field1766 + "_staticelements", class42.field620, -78);
            } else {
                class42.field630 = new class249(0);
            }
            class42.method298();
            class24.field320 = 70;
            class31.method240(true, (byte) 37);
            class312.method1982((byte) 78);
        } else if (class24.field320 == 70) {
            class214.field2846 = new class183(arg0, 11, true, class41.field617);
            class24.field320 = 73;
            class31.method240(true, (byte) 37);
            class312.method1982((byte) 119);
        } else if (class24.field320 == 73) {
            class296.field4099 = new class183(arg0, 12, true, class41.field617);
            class24.field320 = 76;
            class31.method240(true, (byte) 37);
            class312.method1982((byte) 77);
        } else if (class24.field320 == 76) {
            class139.field1976 = new class183(arg0, 14, true, class41.field617);
            class24.field320 = 79;
            class31.method240(true, (byte) 37);
            class312.method1982((byte) 95);
        } else if (class24.field320 == 79) {
            class43.field655 = new class183(arg0, 17, true, class41.field617);
            class24.field320 = 82;
            class31.method240(true, (byte) 37);
            class312.method1982((byte) 104);
        } else if (class24.field320 == 82) {
            class247.field3429 = new class183(arg0, 19, true, class41.field617);
            class24.field320 = 85;
            class31.method240(true, (byte) 37);
            class312.method1982((byte) 61);
        } else if (class24.field320 == 85) {
            class23.field311 = new class183(arg0, 22, true, class41.field617);
            class24.field320 = 88;
            class31.method240(true, (byte) 37);
            class312.method1982((byte) 109);
        } else if (class24.field320 == 88) {
            class16.field190 = new class183(arg0, 26, true, class41.field617);
            class24.field320 = 91;
            class31.method240(true, (byte) 37);
            class312.method1982((byte) 111);
        } else {
            class35.field542 = new class183(arg0, 30, true, class41.field617);
            class24.field320 = 100;
            class31.method240(true, (byte) 37);
            class312.method1982((byte) 121);
            if (arg2 >= -74) {
                method1346((byte) -20);
            }
            System.gc();
        }
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lne;)V")
    public class206(class173 arg0) {
        this.field2781 = arg0;
    }
}

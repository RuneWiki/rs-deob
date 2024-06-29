import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public abstract class class155 {

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "Lpj;")
    public static class237 field2743 = class33.method353("lila:", 31);

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "Lpj;")
    public static class237 field2747 = class33.method353("Lade Texturen )2 ", 93);

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "Lpj;")
    public static class237 field2748 = class33.method353("null", 82);

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field2745 = 0;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
    public static int field2752 = 0;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public int field2736;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public int field2737;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public int field2740;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public int field2741;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public int field2746;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "I")
    public int field2753;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "Lpi;")
    public static class136 field2738;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "Lpi;")
    public static class136 field2749;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IB)I")
    public static final int method1064(int arg0, byte arg1) {
        field2754++;
        int var2 = arg0 * 6 - 61440;
        if (arg1 != -108) {
            field2747 = null;
        }
        int var3 = (arg0 * var2 >> 12) + 40960;
        int var4 = (arg0 * arg0 >> 12) * arg0 >> 12;
        return var3 * var4 >> 12;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "([Lpj;I[S)V")
    public static final void method1065(class237[] arg0, int arg1, short[] arg2) {
        field2750++;
        if (arg1 <= 35) {
            field2752 = 122;
        }
        class213.method1426(arg2, arg0, 0, arg0.length - 1, 1);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)I")
    public static final int method1066(int arg0, int arg1) {
        field2739++;
        if (arg0 != -1380860888) {
            field2748 = null;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BIII)V")
    public static final void method1067(byte arg0, int arg1, int arg2, int arg3) {
        class270 var4 = class202.method1368(-15, 9, arg1);
        field2744++;
        var4.method1793(13);
        var4.field4619 = arg2;
        if (arg0 == -8) {
            var4.field4628 = arg3;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)V")
    public static final void method1068(int arg0, int arg1, int arg2) {
        class120.field2121++;
        class223.field3830.method368(99, 69);
        field2751++;
        class223.field3830.method341(26994, arg1);
        class223.field3830.method329(arg2, (byte) 97);
        if (arg0 < 106) {
            method1070(90);
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)Z")
    public static final boolean method1069(int arg0, int arg1) {
        if (arg0 < 81) {
            return true;
        } else {
            field2755++;
            return (arg1 >> 28 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(III)V")
    public abstract void method1062(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)Z")
    public static final boolean method1070(int arg0) {
        field2742++;
        try {
            if (++class268.field4576 > 1500) {
                if (class127.field2219 != null) {
                    class127.field2219.method1431((byte) 49);
                    class127.field2219 = null;
                    class135.method944(30743);
                    return true;
                } else if (class68.field1335 >= 1) {
                    class135.method944(arg0 ^ 0xFFFF87E9);
                    return true;
                } else {
                    if (class245.field4291 == class221.field3803) {
                        class245.field4291 = class189.field3290;
                    } else {
                        class245.field4291 = class221.field3803;
                    }
                    class68.field1335++;
                    class268.field4576 = 0;
                    class174.field3055 = 0;
                    return false;
                }
            } else if (arg0 != -2) {
                return false;
            } else if (class174.field3055 == 0) {
                if (class181.method1244((byte) -62) - 5000L < class135.field2346) {
                    return true;
                } else {
                    class135.field2346 = class181.method1244((byte) -16);
                    class52.field1100 = class268.field4572.method543(class170.field2982, class245.field4291, (byte) -119);
                    class174.field3055 = 1;
                    return false;
                }
            } else if (class174.field3055 == 1) {
                if (class52.field1100.field1823 == 2) {
                    throw new IOException();
                } else if (class52.field1100.field1823 == 1) {
                    class127.field2219 = new class214((Socket) class52.field1100.field1826, class268.field4572);
                    class52.field1100 = null;
                    class223.field3830.field647 = 0;
                    int var1 = 0;
                    if (class270.field4620) {
                        var1 = class170.field2987;
                    }
                    class223.field3830.method293((byte) 125, 87);
                    class223.field3830.method290((byte) -20, var1);
                    class127.field2219.method1434(0, -26363, class223.field3830.field647, class223.field3830.field644);
                    if (class79.field1485 != null) {
                        class79.field1485.method1079(-46);
                    }
                    if (class131.field2312 != null) {
                        class131.field2312.method1079(arg0 + 125);
                    }
                    class257.field4418 = class127.field2219.method1437((byte) 85);
                    if (class79.field1485 != null) {
                        class79.field1485.method1079(126);
                    }
                    if (class131.field2312 != null) {
                        class131.field2312.method1079(-36);
                    }
                    class174.field3055 = 2;
                    return false;
                } else {
                    return false;
                }
            } else if (class174.field3055 != 2) {
                int var2 = class127.field2219.method1438(12);
                if (var2 < 1) {
                    return false;
                }
                class127.field2219.method1435(class179.field3159, 18461, var2, class54.field1115);
                class179.field3159 += var2;
                if (class179.field3159 < class257.field4418) {
                    return false;
                }
                class68.method556(11295, class54.field1115);
                class146.field2610 = new class122[class193.field3338];
                int var3 = 0;
                for (int var4 = class31.field620; var4 <= class190.field3308; var4++) {
                    class122 var5 = class49.method450((byte) -3, var4);
                    if (var5 != null) {
                        class146.field2610[var3++] = var5;
                    }
                }
                class127.field2219.method1431((byte) 49);
                class127.field2219 = null;
                class135.method944(30743);
                return true;
            } else if (class127.field2219.method1438(12) < 1) {
                return false;
            } else {
                class257.field4418 <<= 0x8;
                class257.field4418 += class127.field2219.method1437((byte) 85);
                class54.field1115 = new byte[class257.field4418];
                class174.field3055 = 3;
                class54.field1115[0] = (byte) (class257.field4418 >> 8);
                class54.field1115[1] = (byte) class272.method1817(255, class257.field4418);
                return false;
            }
        } catch (IOException var6) {
            if (class127.field2219 != null) {
                class127.field2219.method1431((byte) 49);
                class127.field2219 = null;
            }
            if (class68.field1335 >= 1) {
                class135.method944(arg0 + 30745);
                return true;
            }
            class268.field4576 = 0;
            if (class245.field4291 == class221.field3803) {
                class245.field4291 = class189.field3290;
            } else {
                class245.field4291 = class221.field3803;
            }
            class68.field1335++;
            class174.field3055 = 0;
            return false;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V")
    public static void method1071(boolean arg0) {
        if (arg0) {
            field2749 = null;
        }
        field2747 = null;
        field2743 = null;
        field2738 = null;
        field2748 = null;
        field2749 = null;
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(II)V")
    public abstract void method1055(int arg0, int arg1);
}

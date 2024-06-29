import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class61 extends class236 {

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "[I")
    public static int[] field1310 = new int[1000];

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "Lsg;")
    private static class30 field1309 = class167.method1221((byte) 33, " from your friend list first)3");

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "Lsg;")
    public static class30 field1318 = field1309;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "F")
    public static float field1315;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
    public int field1314;

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "I")
    public int field1316;

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!pb", name = "K", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "[I")
    public int[] field1312;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "[I")
    public int[] field1313;

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "[I")
    public int[] field1321;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "[Lkb;")
    public class27[] field1311;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "[Lkb;")
    public class27[] field1319;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "[[[B")
    public byte[][][] field1317;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(II)I")
    public static final int method555(int arg0, int arg1) {
        field1322++;
        class4 var2 = class50.method503((byte) 113, arg1);
        if (arg0 < 106) {
            method555(-29, 68);
        }
        int var3 = var2.field59;
        int var4 = var2.field60;
        int var5 = var2.field63;
        int var6 = class97.field1978[var4 - var5];
        return var6 & class142.field2741[var3] >> var5;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
    public static final void method556(byte arg0) {
        field1324++;
        if (class208.field3745 == 0) {
            return;
        }
        try {
            if (++class62.field1334 > 1500) {
                if (class175.field3261 != null) {
                    class175.field3261.method1516(-86);
                    class175.field3261 = null;
                }
                if (class173.field3230 >= 1) {
                    class68.field1498 = -5;
                    class208.field3745 = 0;
                    return;
                }
                class173.field3230++;
                class62.field1334 = 0;
                class208.field3745 = 1;
                if (class90.field1823 == class54.field1196) {
                    class54.field1196 = class146.field2791;
                } else {
                    class54.field1196 = class90.field1823;
                }
            }
            if (arg0 >= -105) {
                method555(-2, -123);
            }
            if (class208.field3745 == 1) {
                class2.field36 = class190.field3452.method602(-16536, class54.field1196, class64.field1422);
                class208.field3745 = 2;
            }
            if (class208.field3745 == 2) {
                if (class2.field36.field493 == 2) {
                    throw new IOException();
                }
                if (class2.field36.field493 != 1) {
                    return;
                }
                class175.field3261 = new class212((Socket) class2.field36.field492, class190.field3452);
                class2.field36 = null;
                class175.field3261.method1509(class196.field3553.field124, 0, class196.field3553.field146, true);
                if (class11.field217 != null) {
                    class11.field217.method499(109);
                }
                if (class149.field2843 != null) {
                    class149.field2843.method499(125);
                }
                int var1 = class175.field3261.method1515(0);
                if (class11.field217 != null) {
                    class11.field217.method499(121);
                }
                if (class149.field2843 != null) {
                    class149.field2843.method499(114);
                }
                if (var1 != 101) {
                    class208.field3745 = 0;
                    class68.field1498 = var1;
                    class175.field3261.method1516(-95);
                    class175.field3261 = null;
                    return;
                }
                class208.field3745 = 3;
            }
            if (class208.field3745 == 3 && class175.field3261.method1508(0) >= 2) {
                int var2 = class175.field3261.method1515(0) << 8 | class175.field3261.method1515(0);
                class244.method1720((byte) 126, var2);
                if (class200.field3579 == -1) {
                    class68.field1498 = 6;
                    class208.field3745 = 0;
                    class175.field3261.method1516(-108);
                    class175.field3261 = null;
                } else {
                    class208.field3745 = 0;
                    class175.field3261.method1516(-84);
                    class175.field3261 = null;
                    class17.method173(-102);
                }
            }
        } catch (IOException var3) {
            if (class175.field3261 != null) {
                class175.field3261.method1516(-109);
                class175.field3261 = null;
            }
            if (class173.field3230 < 1) {
                class173.field3230++;
                class208.field3745 = 1;
                class62.field1334 = 0;
                if (class90.field1823 == class54.field1196) {
                    class54.field1196 = class146.field2791;
                } else {
                    class54.field1196 = class90.field1823;
                }
            } else {
                class208.field3745 = 0;
                class68.field1498 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILwd;I)V")
    public static final void method557(int arg0, class63 arg1, int arg2) {
        field1320++;
        if (arg1.field1367 > class133.field2617) {
            class209.method1483(arg1, -2);
        } else if (arg1.field1394 < class133.field2617) {
            class151.method1117((byte) -20, arg1);
        } else {
            class265.method1822((byte) 118, arg1);
        }
        if (arg1.field1360 < 128 || arg1.field1336 < 128 || arg1.field1360 >= 13184 || arg1.field1336 >= 13184) {
            arg1.field1345 = -1;
            arg1.field1367 = 0;
            arg1.field1364 = -1;
            arg1.field1394 = 0;
            arg1.field1360 = arg1.field1349[0] * 128 + arg1.method574(true) * 64;
            arg1.field1336 = arg1.field1372[0] * 128 + (arg1.method574(true) * 64);
            arg1.method565((byte) 72);
        }
        if (arg0 != 30958) {
            return;
        }
        if (class247.field4394 == arg1 && (arg1.field1360 < 1536 || arg1.field1336 < 1536 || arg1.field1360 >= 11776 || arg1.field1336 >= 11776)) {
            arg1.field1394 = 0;
            arg1.field1367 = 0;
            arg1.field1345 = -1;
            arg1.field1364 = -1;
            arg1.field1360 = arg1.field1349[0] * 128 + (arg1.method574(true) * 64);
            arg1.field1336 = arg1.field1372[0] * 128 + arg1.method574(true) * 64;
            arg1.method565((byte) 67);
        }
        class41.method430(2047, arg1);
        class17.method167(false, arg1);
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)V")
    public static void method558(int arg0) {
        if (arg0 == 11776) {
            field1309 = null;
            field1310 = null;
            field1318 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(III)V")
    public static final void method559(int arg0, int arg1, int arg2) {
        field1308++;
        class68 var3 = class103.method830(arg2, 4, arg1);
        var3.method608(false);
        var3.field1484 = arg0;
    }
}

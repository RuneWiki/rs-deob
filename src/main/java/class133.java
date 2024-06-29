import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class133 {

    @OriginalMember(owner = "client!td", name = "h", descriptor = "Lu;")
    private static class135 field3207 = class87.method676((byte) -48, "To play on this world move to a free area first");

    @OriginalMember(owner = "client!td", name = "f", descriptor = "Lu;")
    public static class135 field3205 = field3207;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "Lu;")
    public static class135 field3209 = class87.method676((byte) -67, "Hidden)2");

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public int field3200;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public int field3201;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public int field3208;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public int field3211;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    public int field3212;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public int field3214;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public int field3216;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "[B")
    public byte[] field3204;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "[B")
    public byte[] field3206;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILg;Lu;Lu;)Lcc;")
    public static final class18 method1058(int arg0, class43 arg1, class135 arg2, class135 arg3) {
        if (arg0 != 209) {
            field3215 = 116;
        }
        int var4 = arg1.method317((byte) 13, arg3);
        int var5 = arg1.method340(var4, (byte) 37, arg2);
        field3203++;
        return class28.method232(arg1, -107, var5, var4);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
    public static void method1059(int arg0) {
        field3209 = null;
        if (arg0 != 181) {
            method1061((byte) -11, null, 62, 75, true);
        }
        field3205 = null;
        field3207 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILg;)V")
    public static final void method1060(int arg0, class43 arg1) {
        if (arg0 != -20777) {
            method1060(33, null);
        }
        class102.field2461 = arg1;
        field3213++;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B[IIIZ)V")
    public static final void method1061(byte arg0, int[] arg1, int arg2, int arg3, boolean arg4) {
        field3210++;
        class152.field3740.method966(-79);
        class48.field1147.method29(0, 0);
        if (arg4) {
            if (arg1[arg2] != -1) {
                if (arg2 == 0) {
                    class107.field2574.method29(22, 10);
                }
                if (arg2 == 1) {
                    class130.field3113.method29(54, 8);
                }
                if (arg2 == 2) {
                    class130.field3113.method29(82, 8);
                }
                if (arg2 == 3) {
                    class77.field1828.method29(110, 8);
                }
                if (arg2 == 4) {
                    class113.field2721.method29(153, 8);
                }
                if (arg2 == 5) {
                    class113.field2721.method29(181, 8);
                }
                if (arg2 == 6) {
                    class130.field3127.method29(209, 9);
                }
            }
            if (arg1[0] != -1 && arg3 != 0) {
                class56.field1352[0].method29(29, 13);
            }
            if (arg1[1] != -1 && arg3 != 1) {
                class56.field1352[1].method29(53, 11);
            }
            if (arg1[2] != -1 && arg3 != 2) {
                class56.field1352[2].method29(82, 11);
            }
            if (arg1[3] != -1 && arg3 != 3) {
                class56.field1352[3].method29(115, 12);
            }
            if (arg1[4] != -1 && arg3 != 4) {
                class56.field1352[4].method29(153, 13);
            }
            if (arg1[5] != -1 && arg3 != 5) {
                class56.field1352[5].method29(180, 11);
            }
            if (arg1[6] != -1 && arg3 != 6) {
                class56.field1352[6].method29(208, 13);
            }
        }
        class62.field1554.method966(-84);
        class10.field255.method29(0, 0);
        if (arg4) {
            if (arg1[arg2] != -1) {
                if (arg2 == 7) {
                    class76.field1796.method29(42, 0);
                }
                if (arg2 == 8) {
                    class19.field442.method29(74, 0);
                }
                if (arg2 == 9) {
                    class19.field442.method29(102, 0);
                }
                if (arg2 == 10) {
                    class60.field1534.method29(130, 1);
                }
                if (arg2 == 11) {
                    class19.field419.method29(173, 0);
                }
                if (arg2 == 12) {
                    class19.field419.method29(201, 0);
                }
                if (arg2 == 13) {
                    class14.field304.method29(229, 0);
                }
            }
            if (arg1[8] != -1 && arg3 != 8) {
                class56.field1352[7].method29(74, 2);
            }
            if (arg1[9] != -1 && arg3 != 9) {
                class56.field1352[8].method29(102, 3);
            }
            if (arg1[10] != -1 && arg3 != 10) {
                class56.field1352[9].method29(137, 4);
            }
            if (arg1[11] != -1 && arg3 != 11) {
                class56.field1352[10].method29(174, 2);
            }
            if (arg1[12] != -1 && arg3 != 12) {
                class56.field1352[11].method29(201, 2);
            }
            if (arg1[13] != -1 && arg3 != 13) {
                class56.field1352[12].method29(226, 2);
            }
        }
        if (arg0 != -99) {
            return;
        }
        try {
            Graphics var5 = class59.field1484.getGraphics();
            class152.field3740.method94(-17740, 160, var5, 516);
            class62.field1554.method94(-17740, 466, var5, 496);
        } catch (Exception var6) {
            class59.field1484.repaint();
        }
    }
}

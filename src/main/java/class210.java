import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class210 extends class608 implements class342 {

    @OriginalMember(owner = "client!in", name = "H", descriptor = "Leea;")
    public static class406 field2968 = new class406(8);

    @OriginalMember(owner = "client!in", name = "J", descriptor = "I")
    public static int field2970 = 0;

    @OriginalMember(owner = "client!in", name = "w", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!in", name = "x", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!in", name = "y", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!in", name = "z", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!in", name = "A", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!in", name = "B", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!in", name = "C", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!in", name = "D", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!in", name = "E", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!in", name = "F", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!in", name = "I", descriptor = "[[I")
    public static int[][] field2969;

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Llh;Z)V", line = 4)
    public class210(class125 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IJ)V", line = 8)
    public static final void method1342(int arg0, long arg1) {
        if (arg0 >= -11) {
            method1346(7);
        }
        field2962++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class563.method3209(arg1 - 1L, -10003);
            class563.method3209(1L, -10003);
        } else {
            class563.method3209(arg1, -10003);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;", line = 32)
    public final Buffer method251(boolean arg0, byte arg1) {
        field2964++;
        return arg1 == 60 ? super.method251(arg0, (byte) 60) : null;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)I", line = 45)
    public final int method248(int arg0) {
        field2961++;
        if (arg0 != -920) {
            field2970 = 127;
        }
        return super.method248(-920);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIB)Z", line = 63)
    public final boolean method1343(int arg0, int arg1, byte arg2) {
        field2965++;
        super.method252(30, arg1);
        if (arg2 != -118) {
            field2968 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ILjaclib/memory/Source;II)Z", line = 80)
    public final boolean method1344(int arg0, Source arg1, int arg2, int arg3) {
        super.method3459(arg2, arg1, (byte) 100);
        if (arg0 != -17817) {
            this.method1343(-35, -72, (byte) -7);
        }
        field2967++;
        return true;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(I)V", line = 97)
    public final void method249(int arg0) {
        field2959++;
        super.method249(arg0);
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(I)Z", line = 107)
    public final boolean method245(int arg0) {
        if (arg0 != -11359) {
            field2969 = null;
        }
        field2963++;
        return this.method245(-11359);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lqa;I)V", line = 124)
    public static final void method1345(class167 arg0, int arg1) {
        if (class2.field20) {
            class459.method2689(arg0, arg1 - 35004);
        } else {
            class340.method2086((byte) 8, arg0);
        }
        field2966++;
        if (arg1 != 34962) {
            method1342(-70, -5L);
        }
    }

    @OriginalMember(owner = "client!in", name = "e", descriptor = "(I)V", line = 139)
    public static final void method1346(int arg0) {
        field2958++;
        boolean var1 = class52.field761.method1744(16) == 1;
        int var2 = class52.field761.method1723((byte) 78);
        class234.field3439 = class52.field761.method1689(-91);
        int var3 = class52.field761.method1701(255);
        int var4 = class52.field761.method1745(arg0 ^ 0xFFFF827B);
        class244.method1551(3);
        class444.method2625(false, var3);
        class52.field761.method1655(6924);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < class146.field2247 >> 3; var20++) {
                for (int var21 = 0; var21 < (class66.field990 >> 3); var21++) {
                    int var22 = class52.field761.method1660(28, 1);
                    if (var22 == 1) {
                        class82.field1462[var5][var20][var21] = class52.field761.method1660(class631.method3567(arg0, -95), 26);
                    } else {
                        class82.field1462[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class52.field761.method1668((byte) -40);
        int var6 = (class541.field7525 - class52.field761.field3913) / 16;
        field2969 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                field2969[var7][var19] = class52.field761.method1748(arg0 - 67);
            }
        }
        class142.field2219 = new int[var6];
        class469.field6758 = null;
        class43.field584 = new int[var6];
        class563.field8070 = new byte[var6][];
        class179.field2602 = new byte[var6][];
        class265.field3877 = new int[var6];
        if (arg0 != -1) {
            return;
        }
        class142.field2215 = new int[var6];
        class443.field6477 = new int[var6];
        class166.field2426 = new byte[var6][];
        class648.field9390 = new byte[var6][];
        class543.field7574 = null;
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < (class146.field2247 >> 3); var10++) {
                for (int var11 = 0; var11 < class66.field990 >> 3; var11++) {
                    int var12 = class82.field1462[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = (var12 & 0xFFEC11) >> 14;
                        int var14 = (var12 & 0x3FFD) >> 3;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class43.field584[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class43.field584[var8] = var15;
                            int var17 = var15 >> 8 & 0xFF;
                            int var18 = var15 & 0xFF;
                            class265.field3877[var8] = class597.field8501.method3195(class631.method3567(arg0, -1), "m" + var17 + "_" + var18);
                            class142.field2215[var8] = class597.field8501.method3195(0, "l" + var17 + "_" + var18);
                            class142.field2219[var8] = class597.field8501.method3195(0, "um" + var17 + "_" + var18);
                            class443.field6477[var8] = class597.field8501.method3195(class631.method3567(arg0, -1), "ul" + var17 + "_" + var18);
                            var8++;
                        }
                    }
                }
            }
        }
        class159.method1125(10, var1, var4, 120, var2);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V", line = 287)
    public static void method1347(byte arg0) {
        field2968 = null;
        field2969 = null;
        if (arg0 >= -22) {
            field2969 = null;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(III)Z", line = 299)
    public static final boolean method1348(int arg0, int arg1, int arg2) {
        if (arg0 <= 98) {
            field2968 = null;
        }
        field2960++;
        return (arg1 & 0x800) != 0;
    }
}

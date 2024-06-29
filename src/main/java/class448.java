import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class448 {

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "[[I")
    public int[][] field6655 = new int[6][258];

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "[I")
    public int[] field6652 = new int[256];

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "[B")
    public byte[] field6659 = new byte[18002];

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "[I")
    public int[] field6661 = new int[16];

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public int field6647 = 0;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "[I")
    public int[] field6669 = new int[257];

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "[Z")
    public boolean[] field6658 = new boolean[16];

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "[[B")
    public byte[][] field6665 = new byte[6][258];

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "[Z")
    public boolean[] field6670 = new boolean[256];

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "[B")
    public byte[] field6646 = new byte[256];

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "[I")
    public int[] field6660 = new int[6];

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "[B")
    public byte[] field6674 = new byte[4096];

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "[[I")
    public int[][] field6676 = new int[6][258];

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
    public int field6666 = 0;

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "[B")
    public byte[] field6679 = new byte[18002];

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "[[I")
    public int[][] field6662 = new int[6][258];

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field6648 = 0;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "B")
    public byte field6657;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public int field6650;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public int field6651;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public int field6653;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public int field6654;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public int field6663;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public int field6664;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
    public int field6667;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "I")
    public static int field6668;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
    public int field6671;

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "I")
    public int field6672;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
    public int field6673;

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
    public int field6675;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
    public int field6677;

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
    public int field6680;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "Lcn;")
    public static class14 field6649;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "[B")
    public byte[] field6656;

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "[B")
    public byte[] field6678;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZIZII)V")
    public static final void method2756(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field6668++;
        if (class348.field5192 == null) {
            class376.field5542.method1991(arg4, -16777216, arg5, arg0, 127, arg2);
        } else if (class116.field1781.field1275 >= 0 && class116.field1781.field1275 < class338.field5076 * 128 && class116.field1781.field1279 >= 0 && (class250.field4077 * 128) > class116.field1781.field1279) {
            class334.field5036++;
            if (class116.field1781 != null && (class116.field1781.field1275 - (class116.field1781.method3045(0) - 1) * 64 >> 7) == class521.field7646 && class116.field1781.field1279 - ((class116.field1781.method3045(0) - 1) * 64) >> 7 == class488.field7136) {
                class488.field7136 = -1;
                class521.field7646 = -1;
                class442.method2731(-122);
            }
            class285.method1913((byte) -126);
            if (!arg3) {
                class505.method3005((byte) -116);
            }
            class357.method2283((byte) 5);
            class171.method1224(arg2, arg5, arg4, (byte) 5, arg0, arg1);
            int var6 = class487.field7129;
            int var7 = class416.field6117;
            int var8 = class270.field4277;
            int var9 = class442.field6584;
            if (class33.field401 == 1) {
                int var10 = (int) class353.field5236;
                if (class498.field7258 >> 8 > var10) {
                    var10 = class498.field7258 >> 8;
                }
                if (class190.field2911[4] && var10 < class193.field2967[4] + 128) {
                    var10 = class193.field2967[4] + 128;
                }
                int var11 = (int) class434.field6466 + class432.field6421 & 0x3FFF;
                class300.method1997(var10, class416.method2605(class116.field1781.field1279, class116.field1781.field1275, (byte) -12, class30.field370) - 50, (byte) 61, class172.field2662, class351.field5232, var9, (var10 >> 3) * 3 + 600 << 0, var11);
            } else if (class33.field401 == 4) {
                int var12 = (int) class353.field5236;
                if ((class498.field7258 >> 8) > var12) {
                    var12 = class498.field7258 >> 8;
                }
                if (class190.field2911[4] && var12 < class193.field2967[4] + 128) {
                    var12 = class193.field2967[4] + 128;
                }
                int var13 = (int) class434.field6466 & 0x3FFF;
                class300.method1997(var12, class416.method2605(class447.field6641, class2.field28, (byte) 109, class30.field370) - 50, (byte) 61, class172.field2662, class351.field5232, var9, ((var12 >> 3) * 3) + 600 << 0, var13);
            } else if (class33.field401 == 5) {
                class106.method844(var9, (byte) 126);
            }
            int var14 = class128.field1917;
            int var15 = class505.field7344;
            int var16 = class406.field5999;
            int var17 = class430.field6377;
            int var18 = class536.field7863;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class190.field2911[var19]) {
                    int var22 = (int) ((double) (-class209.field3203[var19]) + (double) (class209.field3203[var19] * 2 + 1) * Math.random() + Math.sin((double) class316.field4824[var19] / 100.0D * (double) class331.field5004[var19]) * (double) class193.field2967[var19]);
                    if (var19 == 4) {
                        class430.field6377 += var22;
                        if (class430.field6377 < 1024) {
                            class430.field6377 = 1024;
                        } else if (class430.field6377 > 3072) {
                            class430.field6377 = 3072;
                        }
                    }
                    if (var19 == 0) {
                        class128.field1917 += var22;
                    }
                    if (var19 == 2) {
                        class406.field5999 += var22;
                    }
                    if (var19 == 3) {
                        class536.field7863 = class536.field7863 + var22 & 0x3FFF;
                    }
                    if (var19 == 1) {
                        class505.field7344 += var22;
                    }
                }
            }
            if (class128.field1917 < 0) {
                class128.field1917 = 0;
            }
            if ((class474.field6947 << 7) - 1 < class128.field1917) {
                class128.field1917 = (class474.field6947 << 7) - 1;
            }
            if (class406.field5999 < 0) {
                class406.field5999 = 0;
            }
            if (class406.field5999 > ((class443.field6603 << 7) - 1)) {
                class406.field5999 = (class443.field6603 << 7) - 1;
            }
            class53.method350(true);
            class346.method2224(false);
            class376.field5542.method571(var8, var7, var6 + var8, var7 + var9);
            class376.field5542.method593();
            int var20 = class172.field2667;
            if (class114.field1751 == null) {
                class376.field5542.method567(var20);
            } else {
                class114.field1751.method2937(var7, class319.field4842 << 3, class536.field7863, var20, class430.field6377, class376.field5542, 97, var6, var9, var8);
            }
            class425.method2644(27576);
            class517.field7515.method955(class128.field1917, class505.field7344, class406.field5999, -class430.field6377 & 0x3FFF, -class536.field7863 & 0x3FFF, -class21.field242 & 0x3FFF);
            class376.field5542.method582(class517.field7515);
            class376.field5542.method541(var6 / 2 + var8, var9 / 2 + var7, class505.field7336 << 1, class505.field7336 << 1);
            class490.method2955(class505.field7336 << 1, 100, class505.field7336 << 1, var6 / 2 + var8, var7 - -(var9 / 2));
            class202.method1420(class128.field1917, -class536.field7863 & 0x3FFF, -class430.field6377 & 0x3FFF, 0, -class21.field242 & 0x3FFF, class406.field5999, class505.field7344);
            byte var21 = class40.field667.method418(-40, class108.field1631) == 2 ? (byte) class334.field5036 : 1;
            class532.method3142(class376.field5542, class446.field6625, class81.field1331, class517.field7515, class128.field1917, class505.field7344, class406.field5999, class107.field1627, class107.field1629, class529.field7736, class42.field675, class316.field4820, class474.field6951, class116.field1781.field1274 + 1, var21, class116.field1781.field1275 >> 7, class116.field1781.field1279 >> 7, !class40.field667.field4210);
            class425.method2644(27576);
            if (class460.field6813 == 9) {
                class405.method2548(var9, 256, 256, var8, 98, var7, var6);
                class51.method336(var6, false, 256, var9, var8, 256, var7);
                class312.method2070(var8, 256, var7, var9, 256, var6, (byte) -103);
                class259.method1822(var8, var9, var6, 115, var7);
            }
            class414.method2596();
            class536.field7863 = var18;
            class128.field1917 = var14;
            class430.field6377 = var17;
            class406.field5999 = var16;
            class505.field7344 = var15;
            if (class115.field1772 && class201.field3108.method2519(20135) == 0) {
                class115.field1772 = false;
            }
            if (class115.field1772) {
                class376.field5542.method1991(var7, -16777216, var6, var9, 39, var8);
                class51.method334(class54.field833, class185.field2838.method1265(class345.field5141, -104), 6, false);
            }
        } else {
            class376.field5542.method1991(arg4, -16777216, arg5, arg0, 115, arg2);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public static void method2757(int arg0) {
        field6649 = null;
        if (arg0 != 26279) {
            field6648 = -97;
        }
    }
}

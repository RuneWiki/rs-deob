import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class478 {

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public int field6762 = 8;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public int field6766 = 16777215;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "[C")
    public static char[] field6765 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public int field6756;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public int field6758;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public int field6761;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public int field6763;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field6767;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public int field6768;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "Z")
    public boolean field6760;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZ)V", line = 7)
    public static final void method2827(int arg0, boolean arg1) {
        class3.field23 = arg1;
        if (arg0 != -30362) {
            field6765 = null;
        }
        field6759++;
        if (!class3.field23) {
            int var2 = class79.field939.method883(125);
            int var3 = class79.field939.method896(arg0 + 43451);
            int var4 = class79.field939.method916(21933);
            boolean var5 = class79.field939.method940((byte) 62) == 1;
            class190.method1037((byte) 108, var3);
            int var6 = (class361.field5203 - class79.field939.field2206) / 16;
            class327.field4711 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var11 = 0; var11 < 4; var11++) {
                    class327.field4711[var7][var11] = class79.field939.method939((byte) 46);
                }
            }
            class382.field5430 = null;
            class46.field602 = null;
            class170.field2017 = new int[var6];
            class217.field3034 = new int[var6];
            class420.field6064 = new byte[var6][];
            class247.field3482 = new byte[var6][];
            class458.field6451 = new byte[var6][];
            class78.field933 = new int[var6];
            class216.field2981 = new int[var6];
            class16.field215 = new byte[var6][];
            client.field3938 = new int[var6];
            int var8 = 0;
            for (int var9 = (var2 - (class159.field1895 >> 4)) / 8; var9 <= (var2 + (class159.field1895 >> 4)) / 8; var9++) {
                for (int var10 = (var4 - (class289.field4316 >> 4)) / 8; var10 <= (((class289.field4316 >> 4) + var4) / 8); var10++) {
                    class217.field3034[var8] = (var9 << 8) + var10;
                    class78.field933[var8] = class242.field3319.method2761(0, "m" + var9 + "_" + var10);
                    client.field3938[var8] = class242.field3319.method2761(0, "l" + var9 + "_" + var10);
                    class170.field2017[var8] = class242.field3319.method2761(0, "um" + var9 + "_" + var10);
                    class216.field2981[var8] = class242.field3319.method2761(0, "ul" + var9 + "_" + var10);
                    var8++;
                }
            }
            class199.method1088(var5, var4, false, var2, false);
            return;
        }
        int var12 = class79.field939.method896(13089);
        int var13 = class79.field939.method930(255);
        int var14 = class79.field939.method930(255);
        boolean var15 = class79.field939.method896(13089) == 1;
        class190.method1037((byte) -111, var12);
        class79.field939.method2016(98);
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var31 = 0; var31 < (class159.field1895 >> 3); var31++) {
                for (int var32 = 0; var32 < class289.field4316 >> 3; var32++) {
                    int var33 = class79.field939.method2017(-120, 1);
                    if (var33 == 1) {
                        class79.field952[var16][var31][var32] = class79.field939.method2017(-120, 26);
                    } else {
                        class79.field952[var16][var31][var32] = -1;
                    }
                }
            }
        }
        class79.field939.method2006((byte) 64);
        int var17 = (class361.field5203 - class79.field939.field2206) / 16;
        class327.field4711 = new int[var17][4];
        for (int var18 = 0; var18 < var17; var18++) {
            for (int var30 = 0; var30 < 4; var30++) {
                class327.field4711[var18][var30] = class79.field939.method939((byte) -78);
            }
        }
        class216.field2981 = new int[var17];
        class382.field5430 = null;
        class420.field6064 = new byte[var17][];
        client.field3938 = new int[var17];
        class46.field602 = null;
        class170.field2017 = new int[var17];
        class458.field6451 = new byte[var17][];
        class217.field3034 = new int[var17];
        class247.field3482 = new byte[var17][];
        class78.field933 = new int[var17];
        class16.field215 = new byte[var17][];
        int var19 = 0;
        for (int var20 = 0; var20 < 4; var20++) {
            for (int var21 = 0; var21 < (class159.field1895 >> 3); var21++) {
                for (int var22 = 0; var22 < class289.field4316 >> 3; var22++) {
                    int var23 = class79.field952[var20][var21][var22];
                    if (var23 != -1) {
                        int var24 = (var23 & 0xFFCFB3) >> 14;
                        int var25 = (var23 & 0x3FFE) >> 3;
                        int var26 = (var24 / 8 << 8) + var25 / 8;
                        for (int var27 = 0; var27 < var19; var27++) {
                            if (class217.field3034[var27] == var26) {
                                var26 = -1;
                                break;
                            }
                        }
                        if (var26 != -1) {
                            class217.field3034[var19] = var26;
                            int var28 = (var26 & 0xFF3E) >> 8;
                            int var29 = var26 & 0xFF;
                            class78.field933[var19] = class242.field3319.method2761(0, "m" + var28 + "_" + var29);
                            client.field3938[var19] = class242.field3319.method2761(0, "l" + var28 + "_" + var29);
                            class170.field2017[var19] = class242.field3319.method2761(0, "um" + var28 + "_" + var29);
                            class216.field2981[var19] = class242.field3319.method2761(0, "ul" + var28 + "_" + var29);
                            var19++;
                        }
                    }
                }
            }
        }
        class199.method1088(var15, var13, false, var14, false);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lvt;BI)V", line = 236)
    private final void method2828(class179 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field6762 = arg0.method916(21933);
        } else if (arg2 == 2) {
            this.field6760 = true;
        } else if (arg2 == 3) {
            this.field6761 = arg0.method906(-55);
            this.field6768 = arg0.method906(-94);
            this.field6763 = arg0.method906(-65);
        } else if (arg2 == 4) {
            this.field6758 = arg0.method895((byte) -95);
        } else if (arg2 == 5) {
            this.field6756 = arg0.method916(21933);
        } else if (arg2 == 6) {
            this.field6766 = arg0.method899((byte) 119);
        }
        int var4 = -31 / ((arg1 - 55) / 36);
        field6764++;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V", line = 281)
    public static void method2829(byte arg0) {
        if (arg0 >= 12) {
            field6765 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILvt;)V", line = 292)
    public final void method2830(int arg0, class179 arg1) {
        while (true) {
            int var3 = arg1.method895((byte) -92);
            if (var3 == 0) {
                if (arg0 != -29475) {
                    return;
                }
                field6767++;
                return;
            }
            this.method2828(arg1, (byte) -59, var3);
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)V", line = 313)
    public static final void method2831(byte arg0) {
        if (arg0 != -127) {
            return;
        }
        for (int var1 = 0; var1 < class140.field1686.length; var1++) {
            for (int var2 = 0; var2 < class140.field1686[0].length; var2++) {
                for (int var3 = 0; var3 < class140.field1686[0][0].length; var3++) {
                    class140.field1686[var1][var2][var3] = 0;
                }
            }
        }
        field6757++;
    }
}

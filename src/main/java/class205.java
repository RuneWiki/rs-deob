import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class205 extends class305 {

    @OriginalMember(owner = "client!nea", name = "E", descriptor = "F")
    public static float field2749;

    @OriginalMember(owner = "client!nea", name = "C", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!nea", name = "F", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!nea", name = "G", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!nea", name = "H", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!nea", name = "D", descriptor = "[B")
    private byte[] field2748;

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(ZIIIII)V", line = 3)
    public static final void method1309(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2750++;
        if (class153.field2168 == null) {
            class146.field1963.method3118(true, arg1, arg3, arg5, arg2, -16777216);
        } else if (class408.field5369.field398 >= 0 && class408.field5369.field398 < class703.field9886 * 512 && class408.field5369.field397 >= 0 && class408.field5369.field397 < class431.field5789 * 512) {
            class647.field8940++;
            if (class408.field5369 != null && (class408.field5369.field398 - (class408.field5369.method1435((byte) 105) * 256 - 256) >> 9) == class387.field5165 && class408.field5369.field397 - (class408.field5369.method1435((byte) 92) - 1) * 256 >> 9 == class502.field6926) {
                class502.field6926 = -1;
                class387.field5165 = -1;
                class326.method1896(-3379);
            }
            class118.method689((byte) -78);
            if (!arg0) {
                class148.method847(-52);
            }
            class46.method245(0);
            class669.method3802(arg5, arg3, arg1, arg2, 59, true);
            int var6 = class276.field3663;
            int var7 = class520.field7209;
            int var8 = class549.field7508;
            int var9 = class96.field1161;
            if (class311.field4200 == 1) {
                int var10 = (int) class475.field6610;
                if ((class288.field3803 >> 8) > var10) {
                    var10 = class288.field3803 >> 8;
                }
                if (class149.field2028[4] && var10 < class122.field1589[4] + 128) {
                    var10 = class122.field1589[4] + 128;
                }
                int var11 = (int) class565.field7707 + class360.field4780 & 0x3FFF;
                class461.method2581(class424.field5715, var11, var7, class180.method1211(class298.field3942, true, class408.field5369.field398, class408.field5369.field397) - 200, (byte) 103, var10, class470.field6552, (var10 >> 3) * 3 + 600 << 2);
            } else if (class311.field4200 == 4) {
                int var12 = (int) class475.field6610;
                if ((class288.field3803 >> 8) > var12) {
                    var12 = class288.field3803 >> 8;
                }
                if (class149.field2028[4] && var12 < (class122.field1589[4] + 128)) {
                    var12 = class122.field1589[4] + 128;
                }
                int var13 = (int) class565.field7707 & 0x3FFF;
                class461.method2581(class424.field5715, var13, var7, class180.method1211(class298.field3942, true, class165.field2369, class622.field8621) - 200, (byte) 103, var12, class470.field6552, (var12 >> 3) * 3 + 600 << 2);
            } else if (class311.field4200 == 5) {
                class353.method2083(true, var7);
            }
            int var14 = class82.field946;
            int var15 = class148.field1986;
            int var16 = class147.field1980;
            int var17 = class558.field7615;
            int var18 = class604.field8440;
            if (arg4 < 119) {
                method1312((byte) 33, null);
            }
            for (int var19 = 0; var19 < 5; var19++) {
                if (class149.field2028[var19]) {
                    int var22 = (int) ((double) (-class227.field2948[var19]) + (double) (class227.field2948[var19] * 2 + 1) * Math.random() + Math.sin((double) class315.field4226[var19] / 100.0D * (double) class12.field158[var19]) * (double) class122.field1589[var19]);
                    if (var19 == 4) {
                        class558.field7615 += var22;
                        if (class558.field7615 < 1024) {
                            class558.field7615 = 1024;
                        } else if (class558.field7615 > 3072) {
                            class558.field7615 = 3072;
                        }
                    }
                    if (var19 == 0) {
                        class82.field946 += var22 << 2;
                    }
                    if (var19 == 2) {
                        class147.field1980 += var22 << 2;
                    }
                    if (var19 == 3) {
                        class604.field8440 = class604.field8440 + var22 & 0x3FFF;
                    }
                    if (var19 == 1) {
                        class148.field1986 += var22 << 2;
                    }
                }
            }
            if (class82.field946 < 0) {
                class82.field946 = 0;
            }
            if (class82.field946 > ((class329.field4421 << 9) - 1)) {
                class82.field946 = (class329.field4421 << 9) - 1;
            }
            if (class147.field1980 < 0) {
                class147.field1980 = 0;
            }
            if (((class641.field8846 << 9) - 1) < class147.field1980) {
                class147.field1980 = (class641.field8846 << 9) - 1;
            }
            class586.method3250((byte) -13);
            class669.method3800((byte) -82);
            class146.field1963.method1042(var8, var6, var8 + var9, var6 + var7);
            class146.field1963.method1147();
            int var20 = class115.field1469;
            if (class292.field3855 == null) {
                class146.field1963.method1146(var20);
            } else {
                class292.field3855.method3248(var7, -24009, var8, class558.field7615, class701.field9871 << 3, var20, class146.field1963, class604.field8440, var9, var6);
            }
            class276.method1656(-896460184);
            class546.field7466.method351(class82.field946, class148.field1986, class147.field1980, -class558.field7615 & 0x3FFF, -class604.field8440 & 0x3FFF, -class660.field9416 & 0x3FFF);
            class146.field1963.method1123(class546.field7466);
            class146.field1963.method1088(var9 / 2 + var8, var7 / 2 + var6, class15.field190 << 1, class15.field190 << 1);
            class451.method2533(var9 / 2 + var8, class15.field190 << 1, class15.field190 << 1, 42, var7 / 2 + var6);
            class517.method2933(-class558.field7615 & 0x3FFF, -class604.field8440 & 0x3FFF, class82.field946, class148.field1986, -class660.field9416 & 0x3FFF, 1, class147.field1980);
            byte var21 = class602.field8408.method3567(class618.field8566, (byte) -93) == 2 ? (byte) class647.field8940 : 1;
            class702.method3942(class327.field4404, class82.field946, class148.field1986, class147.field1980, class614.field8511, class323.field4355, class62.field780, class699.field9859, class302.field3994, class474.field6605, class408.field5369.field385 + 1, var21, class408.field5369.field398 >> 9, class408.field5369.field397 >> 9, !class602.field8408.field4312, true);
            class276.method1656(-896460184);
            if (class576.field7861 == 10) {
                class118.method691(256, var7, var8, var9, (byte) 47, 256, var6);
                class666.method3793(var6, (byte) -12, var9, 256, var7, 256, var8);
                class610.method3383(var9, var6, var8, var7, 256, 256, (byte) 4);
                class4.method25(var8, (byte) 33, var9, var7, var6);
            }
            class502.method2856();
            class148.field1986 = var15;
            class82.field946 = var14;
            class558.field7615 = var17;
            class147.field1980 = var16;
            class604.field8440 = var18;
            if (class576.field7860 && class567.field7725.method989(3) == 0) {
                class576.field7860 = false;
            }
            if (class576.field7860) {
                class146.field1963.method3118(true, var7, var8, var6, var9, -16777216);
                class591.method3268(class325.field4382, class146.field1963, false, class371.field4891.method2141(class422.field5539, true), class401.field5319, false);
            }
        } else {
            class146.field1963.method3118(true, arg1, arg3, arg5, arg2, -16777216);
        }
    }

    @OriginalMember(owner = "client!nea", name = "<init>", descriptor = "()V", line = 203)
    public class205() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(IIIZ)[B", line = 207)
    public final byte[] method1310(int arg0, int arg1, int arg2, boolean arg3) {
        field2747++;
        this.field2748 = new byte[arg1 * 2 * arg0 * arg2];
        if (!arg3) {
            this.field2748 = null;
        }
        this.method481(arg1, arg0, (byte) -119, arg2);
        return this.field2748;
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(BIZ)V", line = 221)
    public final void method1311(byte arg0, int arg1, boolean arg2) {
        field2752++;
        int var4 = arg1 * 2;
        byte var5 = (byte) ((arg0 >> 1 & 0x7F) + 127);
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field2748[var10001] = var5;
        this.field2748[var6] = var5;
        if (!arg2) {
            field2749 = -0.5016572F;
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(BLjava/lang/String;)I", line = 237)
    public static final int method1312(byte arg0, String arg1) {
        field2751++;
        if (arg1 == null) {
            return -1;
        }
        int var2 = 0;
        int var3 = 114 % ((73 - arg0) / 45);
        while (var2 < class427.field5757) {
            if (arg1.equalsIgnoreCase(class82.field948[var2])) {
                return var2;
            }
            var2++;
        }
        return -1;
    }
}

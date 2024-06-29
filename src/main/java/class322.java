import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class322 extends class222 implements class68 {

    @OriginalMember(owner = "client!wr", name = "I", descriptor = "Lbb;")
    public class222 field4660;

    @OriginalMember(owner = "client!wr", name = "S", descriptor = "Z")
    public static boolean field4669 = false;

    @OriginalMember(owner = "client!wr", name = "T", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4670 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!wr", name = "X", descriptor = "I")
    public static int field4674 = 0;

    @OriginalMember(owner = "client!wr", name = "B", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!wr", name = "C", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!wr", name = "E", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!wr", name = "F", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!wr", name = "H", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!wr", name = "J", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!wr", name = "K", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!wr", name = "L", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!wr", name = "M", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!wr", name = "N", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!wr", name = "O", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!wr", name = "Q", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!wr", name = "R", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!wr", name = "U", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!wr", name = "V", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!wr", name = "W", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)I", line = 5)
    public final int method336(int arg0) {
        field4664++;
        if (arg0 != -6130) {
            method2004(-64);
        }
        return 0;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZII)Ljava/lang/String;", line = 16)
    public static final String method2003(boolean arg0, int arg1, int arg2) {
        field4672++;
        if (arg2 != 26) {
            method2005(-53);
        }
        return arg0 && arg1 >= 0 ? class263.method1694(arg1, (byte) 27, 10, arg0) : Integer.toString(arg1);
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(IIIIILbb;)V", line = 30)
    public class322(int arg0, int arg1, int arg2, int arg3, int arg4, class222 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class18.method182(arg0, arg1, true));
        this.field4660 = arg5;
    }

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "(I)Lfb;", line = 40)
    public static final class484 method2004(int arg0) {
        field4659++;
        if (class12.field216 == null || class429.field6508 == null) {
            return null;
        }
        class429.field6508.method1043(-104, class12.field216);
        if (arg0 < 26) {
            method2003(false, -92, -72);
        }
        class484 var1 = (class484) class429.field6508.method1042(765);
        if (var1 == null) {
            return null;
        } else {
            class38 var2 = class12.field210.method1851(36, var1.field7129);
            return var2 != null && var2.field567 && var2.method320(class12.field207, (byte) 69) ? var1 : class498.method2969(true);
        }
    }

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "(I)V", line = 70)
    public static final void method2005(int arg0) {
        field4657++;
        int var1 = -115 % ((71 - arg0) / 32);
        int var2 = class409.field6214.method1079(-13703);
        int var3 = class409.field6214.method1100(-25469);
        boolean var4 = class409.field6214.method1087(false) == 1;
        class405.field6149 = class409.field6214.method1057(95);
        int var5 = class409.field6214.method1086((byte) 107);
        class297.method1896(22826);
        class312.method1964(var5, (byte) 3);
        class409.field6214.method951(1374428641);
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var21 = 0; var21 < class398.field6071 >> 3; var21++) {
                for (int var22 = 0; var22 < (class528.field7734 >> 3); var22++) {
                    int var23 = class409.field6214.method949(61, 1);
                    if (var23 == 1) {
                        class156.field2033[var6][var21][var22] = class409.field6214.method949(39, 26);
                    } else {
                        class156.field2033[var6][var21][var22] = -1;
                    }
                }
            }
        }
        class409.field6214.method952(119);
        int var7 = (class497.field7326 - class409.field6214.field2185) / 16;
        class411.field6253 = new int[var7][4];
        for (int var8 = 0; var8 < var7; var8++) {
            for (int var20 = 0; var20 < 4; var20++) {
                class411.field6253[var8][var20] = class409.field6214.method1099(-122);
            }
        }
        class455.field6843 = new byte[var7][];
        class263.field3688 = null;
        class423.field6449 = new int[var7];
        class140.field1870 = new byte[var7][];
        class441.field6657 = null;
        class44.field640 = new int[var7];
        class510.field7488 = new byte[var7][];
        class410.field6233 = new int[var7];
        class402.field6119 = new byte[var7][];
        class510.field7490 = new int[var7];
        class213.field3024 = new int[var7];
        int var9 = 0;
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < class398.field6071 >> 3; var11++) {
                for (int var12 = 0; var12 < class528.field7734 >> 3; var12++) {
                    int var13 = class156.field2033[var10][var11][var12];
                    if (var13 != -1) {
                        int var14 = (var13 & 0xFFDEF8) >> 14;
                        int var15 = var13 >> 3 & 0x7FF;
                        int var16 = (var14 / 8 << 8) + var15 / 8;
                        for (int var17 = 0; var17 < var9; var17++) {
                            if (class510.field7490[var17] == var16) {
                                var16 = -1;
                                break;
                            }
                        }
                        if (var16 != -1) {
                            class510.field7490[var9] = var16;
                            int var18 = (var16 & 0xFF09) >> 8;
                            int var19 = var16 & 0xFF;
                            class213.field3024[var9] = class79.field1131.method1265("m" + var18 + "_" + var19, 57);
                            class410.field6233[var9] = class79.field1131.method1265("l" + var18 + "_" + var19, 45);
                            class423.field6449[var9] = class79.field1131.method1265("um" + var18 + "_" + var19, 119);
                            class44.field640[var9] = class79.field1131.method1265("ul" + var18 + "_" + var19, 77);
                            var9++;
                        }
                    }
                }
            }
        }
        class175.method1178(var2, 10, (byte) -80, var3, var4);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)Z", line = 218)
    public final boolean method339(int arg0) {
        if (arg0 != 3583) {
            method2006(false);
        }
        field4671++;
        return false;
    }

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "(I)I", line = 230)
    public final int method1497(int arg0) {
        if (arg0 <= 61) {
            return 89;
        } else {
            field4661++;
            return 0;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lqa;I)V", line = 241)
    public final void method330(class165 arg0, int arg1) {
        if (arg1 != 14470) {
            this.method336(-62);
        }
        field4655++;
    }

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "(Z)V", line = 253)
    public static void method2006(boolean arg0) {
        if (arg0) {
            field4670 = null;
        }
        field4670 = null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILqa;)Lou;", line = 263)
    public final class437 method136(int arg0, class165 arg1) {
        field4656++;
        return arg0 == 0 ? null : null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZLqa;)V", line = 276)
    public final void method333(boolean arg0, class165 arg1) {
        if (arg0) {
            field4673++;
        }
    }

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "(I)V", line = 289)
    public final void method334(int arg0) {
        if (arg0 != 29893) {
            field4670 = null;
        }
        field4662++;
    }

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "(I)I", line = 299)
    public final int method332(int arg0) {
        field4668++;
        return arg0 == 6359 ? 0 : 5;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILqa;I)Lka;", line = 312)
    public final class334 method337(int arg0, class165 arg1, int arg2) {
        field4667++;
        if (arg2 != 14221) {
            this.method333(true, null);
        }
        return null;
    }

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "(I)V", line = 323)
    public static final void method2007(int arg0) {
        class81.field1167 = arg0;
        for (int var1 = 0; var1 < class533.field7842; var1++) {
            for (int var2 = 0; var2 < class475.field7051; var2++) {
                if (class443.field6672[arg0][var1][var2] == null) {
                    class443.field6672[arg0][var1][var2] = new class452(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BIILqa;)Z", line = 348)
    public final boolean method138(byte arg0, int arg1, int arg2, class165 arg3) {
        if (arg0 <= 121) {
            field4658 = -94;
        }
        field4665++;
        return false;
    }

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "(I)I", line = 360)
    public final int method338(int arg0) {
        field4666++;
        return arg0 < 75 ? -39 : 0;
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(ZLqa;)V", line = 374)
    public final void method135(boolean arg0, class165 arg1) {
        field4663++;
        if (arg0) {
            field4670 = null;
        }
    }
}

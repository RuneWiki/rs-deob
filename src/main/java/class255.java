import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class255 extends class578 {

    @OriginalMember(owner = "client!kr", name = "x", descriptor = "Lta;")
    private class330 field3658;

    @OriginalMember(owner = "client!kr", name = "k", descriptor = "Ljj;")
    private class334 field3640;

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "Leh;")
    private class544 field3657;

    @OriginalMember(owner = "client!kr", name = "q", descriptor = "I")
    private int field3643;

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "I")
    private int field3646;

    @OriginalMember(owner = "client!kr", name = "v", descriptor = "I")
    private int field3654;

    @OriginalMember(owner = "client!kr", name = "G", descriptor = "I")
    private int field3652;

    @OriginalMember(owner = "client!kr", name = "j", descriptor = "[[F")
    private float[][] field3649;

    @OriginalMember(owner = "client!kr", name = "I", descriptor = "[[F")
    private float[][] field3660;

    @OriginalMember(owner = "client!kr", name = "s", descriptor = "[[F")
    private float[][] field3656;

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "I")
    private int field3648;

    @OriginalMember(owner = "client!kr", name = "r", descriptor = "Ldfa;")
    private class477 field3644;

    @OriginalMember(owner = "client!kr", name = "E", descriptor = "Luba;")
    private class517 field3642;

    @OriginalMember(owner = "client!kr", name = "u", descriptor = "Ljaclib/memory/Stream;")
    private Stream field3661;

    @OriginalMember(owner = "client!kr", name = "i", descriptor = "Ljaclib/memory/Stream;")
    private Stream field3664;

    @OriginalMember(owner = "client!kr", name = "D", descriptor = "Lbl;")
    private class719 field3653;

    @OriginalMember(owner = "client!kr", name = "o", descriptor = "I")
    private int field3655;

    @OriginalMember(owner = "client!kr", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field3666 = new String[] { method2141(method2140("_\u000ff-\u0016")), method2141(method2140("_\u000ff+\u0016")), method2141(method2140("_\u000ff,\u0016")), method2141(method2140("OSfGC")), method2141(method2140("Z\b$\u0005")), method2141(method2140("_\u000ff*\u0016")), method2141(method2140("D\u001c=\u001a[")), method2141(method2140("hRfS\u0012\u0014\"eBei\u0003\b")), method2141(method2140("\u0014\u000e-\nQZ\u0019;G\u0010\u001a")), method2141(method2140("_\u000ff/\u0016")), method2141(method2140("d\u001c=\u001aWZ\u001ah\u000fQF]")), method2141(method2140("_\u000ffUWZ\u0014<W\u0016")), method2141(method2140("_\u000ff(\u0016")) };

    @OriginalMember(owner = "client!kr", name = "B", descriptor = "Lsb;")
    public static class261 field3645 = new class261(4, 4);

    @OriginalMember(owner = "client!kr", name = "y", descriptor = "Lui;")
    public static class251 field3662 = new class251(4);

    @OriginalMember(owner = "client!kr", name = "F", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!kr", name = "w", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!kr", name = "z", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!kr", name = "t", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!kr", name = "H", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!kr", name = "C", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3663;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V", line = 13)
    public static void method2134(int arg0) {
        try {
            if (arg0 == -4) {
                field3662 = null;
                field3663 = null;
                field3645 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3666[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)Z", line = 27)
    public static final boolean method2135(int arg0, int arg1) {
        try {
            field3651++;
            if (arg0 != 0) {
                field3665 = -90;
            }
            return arg1 == 2 || arg1 == 3;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3666[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZS)V", line = 38)
    private final void method2136(boolean arg0, short arg1) {
        try {
            if (!arg0) {
                field3650++;
                if (Stream.method3200()) {
                    this.field3664.method3195(arg1);
                } else {
                    this.field3664.method3198(arg1);
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3666[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIII[[Z)V", line = 67)
    public final void method2137(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4) {
        try {
            field3659++;
            if (this.field3642 != null && (arg2 + arg3) >= this.field3643 && this.field3646 >= arg2 - arg3 && this.field3654 <= arg0 + arg3) {
                if (arg1 > -6) {
                    this.method2139((byte) 103, 62, -15, -50, 127, 119, 89);
                }
                if (this.field3652 >= arg0 - arg3) {
                    for (int var6 = this.field3654; var6 <= this.field3652; var6++) {
                        for (int var7 = this.field3643; var7 <= this.field3646; var7++) {
                            int var8 = var7 - arg2;
                            int var9 = var6 - arg0;
                            if ((-arg3) < var8 && var8 < arg3 && var9 > -arg3 && var9 < arg3 && arg4[arg3 + var8][arg3 + var9]) {
                                this.field3640.method2616(0, (byte) ((int) (this.field3658.method2597(2) * 255.0F)));
                                this.field3640.method2088(this.field3653, 0, false);
                                this.field3640.method2120(this.field3640.field4830, -1);
                                this.field3640.method2074(class12.field163, 0, this.field3655, this.field3642, 0, this.field3648 / 3, 36);
                                return;
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field3666[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field3666[4] : field3666[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V", line = 135)
    public static final void method2138(byte arg0) {
        try {
            if (class55.field760 < 102) {
                class55.field760 += 6;
            }
            field3647++;
            if (class27.field345 != -1 && class503.field7352 < class614.method4531(-95)) {
                for (int var1 = class27.field345; var1 < class355.field5167.length; var1++) {
                    if (class355.field5167[var1].startsWith(field3666[6])) {
                        int var2 = 5;
                        try {
                            var2 = Integer.parseInt(class355.field5167[var1].substring(6));
                        } catch (Exception var14) {
                        }
                        class11.method74(field3666[10] + var2 + field3666[8], (byte) 37);
                        class27.field345 = var1 + 1;
                        class503.field7352 = (long) (var2 * 1000) + class614.method4531(-122);
                        return;
                    }
                    class273.field3877 = class355.field5167[var1];
                    class250.method2031(5, false);
                }
                class27.field345 = -1;
            }
            if (class526.field7655 != 0) {
                class462.field6742 -= class526.field7655 * 5;
                if (class462.field6742 >= class648.field9211) {
                    class462.field6742 = class648.field9211 - 1;
                }
                if (class462.field6742 < 0) {
                    class462.field6742 = 0;
                }
                class526.field7655 = 0;
            }
            for (int var3 = 0; var3 < class9.field104; var3++) {
                class781 var4 = class327.field4479[var3];
                int var5 = var4.method3485((byte) 91);
                char var6 = var4.method3488(arg0 ^ 0x125D);
                int var7 = var4.method3487(-116);
                if (var5 == 84) {
                    class250.method2031(5, false);
                }
                if (var5 == 80) {
                    class250.method2031(5, true);
                } else if (var5 == 66 && (var7 & 0x4) != 0) {
                    if (class560.field8144 != null) {
                        String var8 = "";
                        for (int var9 = class789.field11405.length - 1; var9 >= 0; var9--) {
                            if (class789.field11405[var9] != null && class789.field11405[var9].length() > 0) {
                                var8 = var8 + class789.field11405[var9] + '\n';
                            }
                        }
                        class560.field8144.setContents(new StringSelection(var8), null);
                    }
                } else if (var5 == 67 && (var7 & 0x4) != 0) {
                    if (class560.field8144 != null) {
                        Transferable var10 = class560.field8144.getContents(null);
                        if (var10 != null) {
                            try {
                                String var11 = (String) var10.getTransferData(DataFlavor.stringFlavor);
                                if (var11 != null) {
                                    String[] var12 = class793.method5716('\n', var11, -107);
                                    class628.method4610(var12, true);
                                }
                            } catch (Exception var15) {
                            }
                        }
                    }
                } else if (var5 == 85 && class26.field326 > 0) {
                    class273.field3877 = class273.field3877.substring(0, class26.field326 - 1) + class273.field3877.substring(class26.field326);
                    class26.field326--;
                } else if (var5 == 101 && class26.field326 < class273.field3877.length()) {
                    class273.field3877 = class273.field3877.substring(0, class26.field326) + class273.field3877.substring(class26.field326 + 1);
                } else if (var5 == 96 && class26.field326 > 0) {
                    class26.field326--;
                } else if (var5 == 97 && class26.field326 < class273.field3877.length()) {
                    class26.field326++;
                } else if (var5 == 102) {
                    class26.field326 = 0;
                } else if (var5 == 103) {
                    class26.field326 = class273.field3877.length();
                } else if (var5 == 104 && class354.field5135 < class789.field11405.length) {
                    class354.field5135++;
                    class738.method5356(false);
                    class26.field326 = class273.field3877.length();
                } else if (var5 == 105 && class354.field5135 > 0) {
                    class354.field5135--;
                    class738.method5356(false);
                    class26.field326 = class273.field3877.length();
                } else if (class248.method2024(var6, (byte) 59) || field3666[7].indexOf(var6) != -1) {
                    class273.field3877 = class273.field3877.substring(0, class26.field326) + class327.field4479[var3].method3488(-4705) + class273.field3877.substring(class26.field326);
                    class26.field326++;
                }
            }
            class330.field4506 = 0;
            if (arg0 != -62) {
                method2134(81);
            }
            class9.field104 = 0;
            class591.method4369(arg0 ^ 0xFFFFFFC2);
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field3666[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Ljj;Leh;Lta;[I)V", line = 331)
    public class255(class334 arg0, class544 arg1, class330 arg2, int[] arg3) {
        try {
            this.field3658 = arg2;
            this.field3640 = arg0;
            this.field3657 = arg1;
            int var5 = this.field3658.method2594((byte) 21) - (arg1.field10690 >> 1);
            this.field3643 = this.field3658.method2595((byte) 93) - var5 >> arg1.field10692;
            this.field3646 = var5 + this.field3658.method2595((byte) -51) >> arg1.field10692;
            this.field3654 = this.field3658.method2592(true) - var5 >> arg1.field10692;
            this.field3652 = this.field3658.method2592(true) + var5 >> arg1.field10692;
            int var6 = this.field3646 + 1 - this.field3643;
            int var7 = this.field3652 + 1 - this.field3654;
            this.field3649 = new float[var6 + 1][var7 + 1];
            this.field3660 = new float[var6 + 1][var7 + 1];
            this.field3656 = new float[var6 + 1][var7 + 1];
            for (int var8 = 0; var8 <= var7; var8++) {
                int var9 = this.field3654 + var8;
                if (var9 > 0 && var9 < this.field3657.field10703 - 1) {
                    for (int var10 = 0; var10 <= var6; var10++) {
                        int var11 = this.field3643 + var10;
                        if (var11 > 0 && var11 < (this.field3657.field10701 - 1)) {
                            int var12 = arg1.method5442(var11 + 1, var9, 31844) - arg1.method5442(var11 - 1, var9, 31844);
                            int var13 = arg1.method5442(var11, var9 + 1, 31844) - arg1.method5442(var11, var9 - 1, 31844);
                            float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536)));
                            this.field3656[var10][var8] = (float) var12 * var14;
                            this.field3649[var10][var8] = var14 * -256.0F;
                            this.field3660[var10][var8] = (float) var13 * var14;
                        }
                    }
                }
            }
            int var15 = 0;
            for (int var16 = this.field3654; var16 <= this.field3652; var16++) {
                if (var16 >= 0 && arg1.field10703 > var16) {
                    for (int var17 = this.field3643; var17 <= this.field3646; var17++) {
                        if (var17 >= 0 && var17 < arg1.field10701) {
                            int var18 = arg3[var15];
                            int[] var19 = arg1.field7969[var17][var16];
                            if (var19 != null && var18 != 0) {
                                if (var18 == 1) {
                                    int var20 = 0;
                                    while (var19.length > var20) {
                                        if (var19[var20++] != -1 && var19[var20++] != -1 && var19[var20++] != -1) {
                                            this.field3648 += 3;
                                        }
                                    }
                                } else {
                                    this.field3648 += 3;
                                }
                            }
                        }
                        var15++;
                    }
                } else {
                    var15 += this.field3646 - this.field3643;
                }
            }
            if (this.field3648 > 0) {
                this.field3644 = new class477(class788.method5671(1282334120, this.field3648));
                this.field3642 = this.field3640.method2071(false, -21663);
                this.field3642.method2344(this.field3648, 106);
                NativeHeapBuffer var21 = this.field3640.method2672(0, false, this.field3648 * 16);
                this.field3661 = new Stream(var21);
                while (true) {
                    Buffer var22;
                    do {
                        var22 = this.field3642.method2343((byte) 54, true);
                    } while (var22 == null);
                    this.field3664 = new Stream(var22);
                    int var23 = 0;
                    int var24 = 0;
                    for (int var25 = this.field3654; var25 <= this.field3652; var25++) {
                        if (var25 >= 0 && arg1.field10703 > var25) {
                            int var26 = 0;
                            for (int var27 = this.field3643; var27 <= this.field3646; var27++) {
                                if (var27 >= 0 && var27 < arg1.field10701) {
                                    int var28 = arg3[var24];
                                    int[] var29 = arg1.field7969[var27][var25];
                                    if (var29 != null && var28 != 0) {
                                        if (var28 == 1) {
                                            int[] var30 = arg1.field7964[var27][var25];
                                            int[] var31 = arg1.field7974[var27][var25];
                                            int var32 = 0;
                                            label176: while (true) {
                                                while (true) {
                                                    if (var32 >= var29.length) {
                                                        break label176;
                                                    }
                                                    if (var29[var32] == -1 || var29[var32 + 1] == -1 || var29[var32 + 2] == -1) {
                                                        var32 += 3;
                                                    } else {
                                                        this.method2139((byte) 103, var30[var32], var27, var26, var31[var32], var25, var23);
                                                        var32++;
                                                        this.method2139((byte) 103, var30[var32], var27, var26, var31[var32], var25, var23);
                                                        var32++;
                                                        this.method2139((byte) 103, var30[var32], var27, var26, var31[var32], var25, var23);
                                                        var32++;
                                                    }
                                                }
                                            }
                                        } else if (var28 == 3) {
                                            this.method2139((byte) 103, 0, var27, var26, 0, var25, var23);
                                            this.method2139((byte) 103, arg1.field10690, var27, var26, 0, var25, var23);
                                            this.method2139((byte) 103, 0, var27, var26, arg1.field10690, var25, var23);
                                        } else if (var28 == 2) {
                                            this.method2139((byte) 103, arg1.field10690, var27, var26, 0, var25, var23);
                                            this.method2139((byte) 103, arg1.field10690, var27, var26, arg1.field10690, var25, var23);
                                            this.method2139((byte) 103, 0, var27, var26, 0, var25, var23);
                                        } else if (var28 == 5) {
                                            this.method2139((byte) 103, arg1.field10690, var27, var26, arg1.field10690, var25, var23);
                                            this.method2139((byte) 103, 0, var27, var26, arg1.field10690, var25, var23);
                                            this.method2139((byte) 103, arg1.field10690, var27, var26, 0, var25, var23);
                                        } else if (var28 == 4) {
                                            this.method2139((byte) 103, 0, var27, var26, arg1.field10690, var25, var23);
                                            this.method2139((byte) 103, 0, var27, var26, 0, var25, var23);
                                            this.method2139((byte) 103, arg1.field10690, var27, var26, arg1.field10690, var25, var23);
                                        }
                                    }
                                }
                                var26++;
                                var24++;
                            }
                        } else {
                            var24 += this.field3646 - this.field3643;
                        }
                        var23++;
                    }
                    this.field3664.method3199();
                    if (this.field3642.method2339(true)) {
                        this.field3661.method3199();
                        this.field3653 = this.field3640.method2117(false, 16);
                        this.field3653.method2404((byte) 32, var21, 16, this.field3655 * 16);
                        break;
                    }
                    this.field3661.method3196(0);
                    this.field3644.method3690((byte) 63);
                }
            } else {
                this.field3642 = null;
                this.field3653 = null;
            }
            this.field3664 = null;
            this.field3644 = null;
            this.field3661 = null;
            this.field3656 = this.field3649 = this.field3660 = null;
        } catch (RuntimeException var34) {
            throw class665.method4799(var34, field3666[11] + (arg0 == null ? field3666[4] : field3666[3]) + ',' + (arg1 == null ? field3666[4] : field3666[3]) + ',' + (arg2 == null ? field3666[4] : field3666[3]) + ',' + (arg3 == null ? field3666[4] : field3666[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(BIIIIII)V", line = 594)
    private final void method2139(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            field3641++;
            long var8 = -1L;
            int var10 = (arg2 << this.field3657.field10692) + arg1;
            int var11 = arg4 + (arg5 << this.field3657.field10692);
            int var12 = this.field3657.method5440((byte) 15, var10, var11);
            if ((arg1 & 0x7F) == 0 || (arg4 & 0x7F) == 0) {
                var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
                class578 var13 = this.field3644.method3693(false, var8);
                if (var13 != null) {
                    this.method2136(false, ((class292) var13).field4113);
                    return;
                }
            }
            short var14 = (short) (this.field3655++);
            if (var8 != -1L) {
                this.field3644.method3691(new class292(var14), var8, -1);
            }
            float var28;
            float var30;
            float var31;
            if (arg1 == 0 && arg4 == 0) {
                var31 = this.field3660[arg3][arg6];
                var28 = this.field3649[arg3][arg6];
                var30 = this.field3656[arg3][arg6];
            } else if (this.field3657.field10690 == arg1 && arg4 == 0) {
                var31 = this.field3660[arg3 + 1][arg6];
                var28 = this.field3649[arg3 + 1][arg6];
                var30 = this.field3656[arg3 + 1][arg6];
            } else if (this.field3657.field10690 == arg1 && this.field3657.field10690 == arg4) {
                var30 = this.field3656[arg3 + 1][arg6 + 1];
                var31 = this.field3660[arg3 + 1][arg6 + 1];
                var28 = this.field3649[arg3 + 1][arg6 + 1];
            } else if (arg1 == 0 && this.field3657.field10690 == arg4) {
                var30 = this.field3656[arg3][arg6 + 1];
                var31 = this.field3660[arg3][arg6 + 1];
                var28 = this.field3649[arg3][arg6 + 1];
            } else {
                float var15 = (float) arg1 / (float) this.field3657.field10690;
                float var16 = (float) arg4 / (float) this.field3657.field10690;
                float var17 = this.field3656[arg3][arg6];
                float var18 = this.field3649[arg3][arg6];
                float var19 = this.field3660[arg3][arg6];
                float var20 = this.field3656[arg3 + 1][arg6];
                float var21 = this.field3649[arg3 + 1][arg6];
                float var22 = this.field3660[arg3 + 1][arg6];
                float var23 = (this.field3660[arg3][arg6 + 1] - var19) * var15 + var19;
                float var24 = (this.field3656[arg3][arg6 + 1] - var17) * var15 + var17;
                float var25 = (this.field3649[arg3][arg6 + 1] - var18) * var15 + var18;
                float var26 = (this.field3649[arg3 + 1][arg6 + 1] - var21) * var15 + var21;
                float var27 = (this.field3656[arg3 + 1][arg6 + 1] - var20) * var15 + var20;
                var28 = (var26 - var25) * var16 + var25;
                float var29 = (this.field3660[arg3 + 1][arg6 + 1] - var22) * var15 + var22;
                var30 = (var27 - var24) * var16 + var24;
                var31 = (var29 - var23) * var16 + var23;
            }
            float var32 = (float) (this.field3658.method2595((byte) -81) - var10);
            float var33 = (float) (this.field3658.method2590((byte) 115) - var12);
            float var34 = (float) (this.field3658.method2592(true) - var11);
            float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
            float var36 = 1.0F / var35;
            float var37 = var33 * var36;
            float var38 = var32 * var36;
            float var39 = var34 * var36;
            float var40 = var35 / (float) this.field3658.method2594((byte) 21);
            float var41 = 1.0F - (var40 * var40);
            if (var41 < 0.0F) {
                var41 = 0.0F;
            }
            float var42 = var31 * var39 + var28 * var37 + var30 * var38;
            if (var42 < 0.0F) {
                var42 = 0.0F;
            }
            float var43 = var41 * var42 * 2.0F;
            if (var43 > 1.0F) {
                var43 = 1.0F;
            }
            int var44 = this.field3658.method2591(11062);
            int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
            if (var45 > 255) {
                var45 = 255;
            }
            if (arg0 != 103) {
                this.field3654 = 40;
            }
            int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
            if (var46 > 255) {
                var46 = 255;
            }
            int var47 = (int) ((float) (var44 & 0xFF) * var43);
            if (Stream.method3200()) {
                this.field3661.method3202((float) var10);
                this.field3661.method3202((float) var12);
                this.field3661.method3202((float) var11);
            } else {
                this.field3661.method3206((float) var10);
                this.field3661.method3206((float) var12);
                this.field3661.method3206((float) var11);
            }
            if (var47 > 255) {
                var47 = 255;
            }
            if (this.field3640.field4775 == 0) {
                this.field3661.method3203(var47);
                this.field3661.method3203(var46);
                this.field3661.method3203(var45);
            } else {
                this.field3661.method3203(var45);
                this.field3661.method3203(var46);
                this.field3661.method3203(var47);
            }
            this.field3661.method3203(255);
            this.method2136(false, var14);
        } catch (RuntimeException var49) {
            throw class665.method4799(var49, field3666[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!kr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2140(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2141(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 52;
                    break;
                case 1:
                    var10005 = 125;
                    break;
                case 2:
                    var10005 = 72;
                    break;
                case 3:
                    var10005 = 105;
                    break;
                default:
                    var10005 = 62;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

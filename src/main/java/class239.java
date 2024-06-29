import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class239 extends class292 {

    @OriginalMember(owner = "client!kk", name = "H", descriptor = "Z")
    public boolean field3696 = true;

    @OriginalMember(owner = "client!kk", name = "G", descriptor = "I")
    public static int field3695 = 0;

    @OriginalMember(owner = "client!kk", name = "D", descriptor = "Led;")
    public static class186 field3692 = new class186(5000);

    @OriginalMember(owner = "client!kk", name = "ab", descriptor = "Z")
    public static boolean field3714 = false;

    @OriginalMember(owner = "client!kk", name = "bb", descriptor = "I")
    public static int field3715 = 0;

    @OriginalMember(owner = "client!kk", name = "R", descriptor = "B")
    public static byte field3706;

    @OriginalMember(owner = "client!kk", name = "E", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!kk", name = "F", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!kk", name = "I", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!kk", name = "L", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!kk", name = "M", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!kk", name = "N", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!kk", name = "O", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!kk", name = "Q", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!kk", name = "U", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!kk", name = "V", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!kk", name = "X", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!kk", name = "Y", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!kk", name = "Z", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!kk", name = "db", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!kk", name = "cb", descriptor = "Ljava/awt/Frame;")
    public static Frame field3716;

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "[I")
    public static int[] field3698;

    @OriginalMember(owner = "client!kk", name = "P", descriptor = "[I")
    public int[] field3704;

    @OriginalMember(owner = "client!kk", name = "W", descriptor = "[I")
    private int[] field3710;

    @OriginalMember(owner = "client!kk", name = "K", descriptor = "[Ljava/lang/String;")
    private String[] field3699;

    @OriginalMember(owner = "client!kk", name = "S", descriptor = "[[I")
    private int[][] field3707;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lf;BI)V")
    private final void method1608(class37 arg0, byte arg1, int arg2) {
        int var4 = -125 / ((25 - arg1) / 36);
        if (arg2 == 1) {
            this.field3699 = class216.method1439(127, '<', arg0.method331(16312));
        } else if (arg2 == 2) {
            int var9 = arg0.method333((byte) -59);
            this.field3704 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3704[var10] = arg0.method293(91);
            }
        } else if (arg2 == 3) {
            int var5 = arg0.method333((byte) -59);
            this.field3710 = new int[var5];
            this.field3707 = new int[var5][];
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = arg0.method293(-60);
                this.field3710[var6] = var7;
                this.field3707[var6] = new int[class169.field2539[var7]];
                for (int var8 = 0; var8 < class169.field2539[var7]; var8++) {
                    this.field3707[var6][var8] = arg0.method293(96);
                }
            }
        } else if (arg2 == 4) {
            this.field3696 = false;
        }
        field3701++;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lcl;IIIIIIZ)V")
    public static final void method1609(class199 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field3128.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field3128[var9] - class102.field1630;
            int var23 = arg0.field3123[var9] - class58.field894;
            int var24 = arg0.field3122[var9] - field3713;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field3138 != null) {
                class199.field3134[var9] = var25;
                class199.field3121[var9] = var28;
                class199.field3130[var9] = var29;
            }
            class199.field3124[var9] = (var25 << 9) / var29 + class97.field1546;
            class199.field3131[var9] = (var28 << 9) / var29 + class97.field1552;
        }
        class97.field1559 = 0;
        int var10 = arg0.field3133.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field3133[var11];
            int var13 = arg0.field3136[var11];
            int var14 = arg0.field3139[var11];
            int var15 = class199.field3124[var12];
            int var16 = class199.field3124[var13];
            int var17 = class199.field3124[var14];
            int var18 = class199.field3131[var12];
            int var19 = class199.field3131[var13];
            int var20 = class199.field3131[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class222.field3479 && class33.method263(class99.field1586 + class97.field1546, class97.field1552 + class137.field2125, var18, var19, var20, var15, var16, var17)) {
                    class187.field2818 = arg5;
                    class133.field2041 = arg6;
                }
                if (!arg7) {
                    class97.field1553 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class97.field1550 || var16 > class97.field1550 || var17 > class97.field1550) {
                        class97.field1553 = true;
                    }
                    if (arg0.field3138 == null || arg0.field3138[var11] == -1) {
                        if (arg0.field3132[var11] != 12345678) {
                            class97.method762(var18, var19, var20, var15, var16, var17, arg0.field3132[var11], arg0.field3135[var11], arg0.field3120[var11]);
                        }
                    } else if (!class155.field2366) {
                        int var21 = class97.field1547.method1893(arg0.field3138[var11], -111);
                        class97.method762(var18, var19, var20, var15, var16, var17, class111.method824(var21, arg0.field3132[var11]), class111.method824(var21, arg0.field3135[var11]), class111.method824(var21, arg0.field3120[var11]));
                    } else if (arg0.field3126) {
                        class97.method750(var18, var19, var20, var15, var16, var17, arg0.field3132[var11], arg0.field3135[var11], arg0.field3120[var11], class199.field3134[0], class199.field3134[1], class199.field3134[3], class199.field3121[0], class199.field3121[1], class199.field3121[3], class199.field3130[0], class199.field3130[1], class199.field3130[3], arg0.field3138[var11]);
                    } else {
                        class97.method750(var18, var19, var20, var15, var16, var17, arg0.field3132[var11], arg0.field3135[var11], arg0.field3120[var11], class199.field3134[var12], class199.field3134[var13], class199.field3134[var14], class199.field3121[var12], class199.field3121[var13], class199.field3121[var14], class199.field3130[var12], class199.field3130[var13], class199.field3130[var14], arg0.field3138[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BII)I")
    public final int method1610(byte arg0, int arg1, int arg2) {
        if (arg0 < 111) {
            this.method1617((int[]) null, false, (class37) null);
        }
        field3702++;
        if (this.field3710 == null || arg2 < 0 || this.field3710.length < arg2) {
            return -1;
        } else if (this.field3707[arg2] == null || arg1 < 0 || this.field3707[arg2].length < arg1) {
            return -1;
        } else {
            return this.field3707[arg2][arg1];
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZ)V")
    public static final void method1611(int arg0, boolean arg1) {
        field3697++;
        class187.field2824 = arg1;
        if (class187.field2824) {
            int var16 = field3692.method309(255);
            int var17 = field3692.method325(255);
            int var18 = field3692.method293(-8);
            field3692.method1256(8);
            for (int var19 = 0; var19 < 4; var19++) {
                for (int var37 = 0; var37 < 13; var37++) {
                    for (int var38 = 0; var38 < 13; var38++) {
                        int var39 = field3692.method1253((byte) -119, 1);
                        if (var39 == 1) {
                            class290.field4566[var19][var37][var38] = field3692.method1253((byte) -92, 26);
                        } else {
                            class290.field4566[var19][var37][var38] = -1;
                        }
                    }
                }
            }
            field3692.method1252((byte) 16);
            int var20 = (class79.field1329 - field3692.field588) / 16;
            class94.field1521 = new int[var20][4];
            for (int var21 = 0; var21 < var20; var21++) {
                for (int var36 = 0; var36 < 4; var36++) {
                    class94.field1521[var21][var36] = field3692.method332((byte) -124);
                }
            }
            int var22 = field3692.method293(-24);
            int var23 = field3692.method283(arg0 ^ 0x4862);
            boolean var24 = class244.method1652(arg0 ^ 0xFFFFB754, field3692.method297((byte) -120));
            class112.field1769 = new int[var20];
            class259.field3987 = new byte[var20][];
            class221.field3454 = new int[var20];
            class187.field2823 = new int[var20];
            class100.field1589 = new int[var20];
            class197.field3101 = null;
            class230.field3588 = null;
            class178.field2666 = new int[var20];
            class86.field1417 = new byte[var20][];
            int var25 = 0;
            for (int var26 = 0; var26 < 4; var26++) {
                for (int var27 = 0; var27 < 13; var27++) {
                    for (int var28 = 0; var28 < 13; var28++) {
                        int var29 = class290.field4566[var26][var27][var28];
                        if (var29 != -1) {
                            int var30 = var29 >> 3 & 0x7FF;
                            int var31 = (var29 & 0xFFDD24) >> 14;
                            int var32 = (var31 / 8 << 8) + (var30 / 8);
                            for (int var33 = 0; var33 < var25; var33++) {
                                if (class221.field3454[var33] == var32) {
                                    var32 = -1;
                                    break;
                                }
                            }
                            if (var32 != -1) {
                                class221.field3454[var25] = var32;
                                int var34 = var32 & 0xFF;
                                int var35 = (var32 & 0xFF1A) >> 8;
                                class100.field1589[var25] = client.field2408.method1168(20345, "m" + var35 + "_" + var34);
                                class187.field2823[var25] = client.field2408.method1168(20345, "l" + var35 + "_" + var34);
                                class112.field1769[var25] = client.field2408.method1168(20345, "um" + var35 + "_" + var34);
                                class178.field2666[var25] = client.field2408.method1168(20345, "ul" + var35 + "_" + var34);
                                var25++;
                            }
                        }
                    }
                }
            }
            class291.method1960(var17, var22, arg0 - 18470, var16, var23, var18, false, var24);
        } else {
            int var2 = field3692.method283(arg0 ^ 0x4862);
            int var3 = (class79.field1329 - field3692.field588) / 16;
            class94.field1521 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var15 = 0; var15 < 4; var15++) {
                    class94.field1521[var4][var15] = field3692.method332((byte) 127);
                }
            }
            boolean var5 = class244.method1652(arg0 ^ 0xFFFFB727, field3692.method335(false));
            int var6 = field3692.method325(arg0 - 18334);
            int var7 = field3692.method313(114);
            int var8 = field3692.method293(126);
            int var9 = field3692.method283(arg0 - 18334);
            class197.field3101 = null;
            class100.field1589 = new int[var3];
            class221.field3454 = new int[var3];
            class86.field1417 = new byte[var3][];
            class178.field2666 = new int[var3];
            boolean var10 = false;
            class187.field2823 = new int[var3];
            class112.field1769 = new int[var3];
            if (((var2 / 8) == 48 || (var2 / 8) == 49) && (var7 / 8) == 48) {
                var10 = true;
            }
            class230.field3588 = null;
            class259.field3987 = new byte[var3][];
            int var11 = 0;
            if ((var2 / 8) == 48 && var7 / 8 == 148) {
                var10 = true;
            }
            for (int var12 = (var2 - 6) / 8; var12 <= ((var2 + 6) / 8); var12++) {
                for (int var13 = (var7 - 6) / 8; var13 <= (var7 + 6) / 8; var13++) {
                    int var14 = (var12 << 8) + var13;
                    if (var10 && var13 == 49 || var13 == 149 || var13 == 147 || var12 == 50 || !(var12 != 49 || var13 != 47)) {
                        class221.field3454[var11] = var14;
                        class100.field1589[var11] = -1;
                        class187.field2823[var11] = -1;
                        class112.field1769[var11] = -1;
                        class178.field2666[var11] = -1;
                    } else {
                        class221.field3454[var11] = var14;
                        class100.field1589[var11] = client.field2408.method1168(class76.method605(arg0, 2020), "m" + var12 + "_" + var13);
                        class187.field2823[var11] = client.field2408.method1168(20345, "l" + var12 + "_" + var13);
                        class112.field1769[var11] = client.field2408.method1168(20345, "um" + var12 + "_" + var13);
                        class178.field2666[var11] = client.field2408.method1168(20345, "ul" + var12 + "_" + var13);
                    }
                    var11++;
                }
            }
            class291.method1960(var6, var7, 109, var8, var2, var9, false, var5);
        }
        if (arg0 != 18589) {
            method1619(109);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIILbf;Lbf;IIJ)V")
    public static final void method1612(int arg0, int arg1, int arg2, int arg3, class205 arg4, class205 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class228 var10 = new class228();
        var10.field3564 = arg8;
        var10.field3561 = arg1 * 128 + 64;
        var10.field3574 = arg2 * 128 + 64;
        var10.field3563 = arg3;
        var10.field3565 = arg4;
        var10.field3570 = arg5;
        var10.field3571 = arg6;
        var10.field3572 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class255.field3907[var11][arg1][arg2] == null) {
                class255.field3907[var11][arg1][arg2] = new class23(var11, arg1, arg2);
            }
        }
        class255.field3907[arg0][arg1][arg2].field344 = var10;
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(II)I")
    public final int method1613(int arg0, int arg1) {
        if (arg1 != 16) {
            method1612(-69, -62, 75, 12, (class205) null, (class205) null, 69, -80, 46L);
        }
        field3709++;
        return this.field3710 == null || arg0 < 0 || this.field3710.length < arg0 ? -1 : this.field3710[arg0];
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILf;)Ljava/lang/String;")
    public final String method1614(int arg0, class37 arg1) {
        field3705++;
        StringBuffer var3 = new StringBuffer(arg0);
        if (this.field3710 != null) {
            for (int var4 = 0; var4 < this.field3710.length; var4++) {
                var3.append(this.field3699[var4]);
                var3.append(class64.method504(arg1.method311(class116.field1804[this.field3710[var4]], 17799), this.field3710[var4], (byte) 126, this.field3707[var4]));
            }
        }
        var3.append(this.field3699[this.field3699.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZLf;)V")
    public final void method1615(boolean arg0, class37 arg1) {
        if (arg0) {
            this.method1617((int[]) null, true, (class37) null);
        }
        while (true) {
            int var3 = arg1.method333((byte) -59);
            if (var3 == 0) {
                field3700++;
                return;
            }
            this.method1608(arg1, (byte) -128, var3);
        }
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)Ljava/lang/String;")
    public final String method1616(int arg0) {
        if (arg0 >= -48) {
            method1611(75, false);
        }
        field3693++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field3699 == null) {
            return "";
        }
        var2.append(this.field3699[0]);
        for (int var3 = 1; var3 < this.field3699.length; var3++) {
            var2.append("...");
            var2.append(this.field3699[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "([IZLf;)V")
    public final void method1617(int[] arg0, boolean arg1, class37 arg2) {
        field3711++;
        if (this.field3710 == null) {
            return;
        }
        for (int var4 = 0; this.field3710.length > var4 && var4 < arg0.length; var4++) {
            int var5 = class86.field1411[this.method1613(var4, 16)];
            if (var5 > 0) {
                arg2.method318((long) arg0[var4], var5, -102);
            }
        }
        if (arg1) {
            field3706 = 12;
        }
    }

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(I)V")
    public final void method1618(int arg0) {
        if (arg0 != -16299) {
            this.field3710 = null;
        }
        field3717++;
        if (this.field3704 != null) {
            for (int var2 = 0; var2 < this.field3704.length; var2++) {
                this.field3704[var2] = class115.method840(this.field3704[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "(I)V")
    public static final void method1619(int arg0) {
        class35.field560 = null;
        field3708++;
        class270.field4281 = null;
        field3698 = null;
        class289.field4554 = null;
        class184.field2764 = null;
        if (arg0 != 65306) {
            field3698 = null;
        }
        class107.field1717 = null;
    }

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "(I)I")
    public final int method1620(int arg0) {
        if (arg0 == 1) {
            field3694++;
            return this.field3710 == null ? 0 : this.field3710.length;
        } else {
            return -6;
        }
    }

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "(I)V")
    public static void method1621(int arg0) {
        field3692 = null;
        field3716 = null;
        field3698 = null;
        if (arg0 != -1) {
            field3716 = null;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class516 {

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "[B")
    private byte[] field7645;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "[I")
    private int[] field7642;

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "[I")
    private int[] field7647;

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "[C")
    public static char[] field7644 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
    public static int field7638;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
    public static int field7639;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
    public static int field7640;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
    public static int field7641;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "I")
    public static int field7643;

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "I")
    public static int field7646;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
    public static final void method3058(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -28456) {
            return;
        }
        field7640++;
        class101 var5 = class620.method3501(arg2, false, arg1);
        if (var5 == null) {
            return;
        }
        if (var5.field1648 != null) {
            class400 var6 = new class400();
            var6.field5787 = arg4;
            var6.field5775 = arg0;
            var6.field5783 = var5;
            var6.field5790 = var5.field1648;
            class362.method2171(var6);
        }
        if (class515.field7636 != 10 || !client.method707(var5).method1954(arg4 - 1, true)) {
            return;
        }
        if (arg4 == 1) {
            class134.field2160++;
            class699 var7 = class452.method2630(class699.field9897, class443.field6413, (byte) 124);
            class347.method2114(arg1, arg3 ^ 0x49E3, var7, var5.field1565, arg2);
            class149.method1134(var7, true);
        }
        if (arg4 == 2) {
            class270.field3853++;
            class699 var8 = class452.method2630(class699.field9897, class700.field9921, (byte) 121);
            class347.method2114(arg1, arg3 ^ 0x49E3, var8, var5.field1565, arg2);
            class149.method1134(var8, true);
        }
        if (arg4 == 3) {
            class272.field3895++;
            class699 var9 = class452.method2630(class699.field9897, class570.field8322, (byte) 126);
            class347.method2114(arg1, -9925, var9, var5.field1565, arg2);
            class149.method1134(var9, true);
        }
        if (arg4 == 4) {
            class625.field8918++;
            class699 var10 = class452.method2630(class699.field9897, class21.field292, (byte) 121);
            class347.method2114(arg1, -9925, var10, var5.field1565, arg2);
            class149.method1134(var10, true);
        }
        if (arg4 == 5) {
            class666.field9363++;
            class699 var11 = class452.method2630(class699.field9897, class301.field4216, (byte) 125);
            class347.method2114(arg1, arg3 + 18531, var11, var5.field1565, arg2);
            class149.method1134(var11, true);
        }
        if (arg4 == 6) {
            class457.field6571++;
            class699 var12 = class452.method2630(class699.field9897, class468.field6752, (byte) 125);
            class347.method2114(arg1, arg3 + 18531, var12, var5.field1565, arg2);
            class149.method1134(var12, true);
        }
        if (arg4 == 7) {
            class678.field9658++;
            class699 var13 = class452.method2630(class699.field9897, class113.field1819, (byte) 123);
            class347.method2114(arg1, -9925, var13, var5.field1565, arg2);
            class149.method1134(var13, true);
        }
        if (arg4 == 8) {
            class430.field6129++;
            class699 var14 = class452.method2630(class699.field9897, class5.field45, (byte) 122);
            class347.method2114(arg1, -9925, var14, var5.field1565, arg2);
            class149.method1134(var14, true);
        }
        if (arg4 == 9) {
            class570.field8325++;
            class699 var15 = class452.method2630(class699.field9897, class68.field1084, (byte) 126);
            class347.method2114(arg1, -9925, var15, var5.field1565, arg2);
            class149.method1134(var15, true);
        }
        if (arg4 == 10) {
            class300.field4212++;
            class699 var16 = class452.method2630(class699.field9897, class637.field9047, (byte) 122);
            class347.method2114(arg1, -9925, var16, var5.field1565, arg2);
            class149.method1134(var16, true);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V")
    public static void method3059(byte arg0) {
        if (arg0 > -111) {
            method3059((byte) -75);
        }
        field7644 = null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(BZ)V")
    public static final void method3060(byte arg0, boolean arg1) {
        if (arg0 < 14) {
            return;
        }
        field7641++;
        if (arg1) {
            if (class557.field8146 != -1) {
                class417.method2475((byte) -64, class557.field8146);
            }
            for (class259 var2 = (class259) class199.field3098.method2815(0); var2 != null; var2 = (class259) class199.field3098.method2814(4)) {
                if (!var2.method2555(19742)) {
                    var2 = (class259) class199.field3098.method2815(0);
                    if (var2 == null) {
                        break;
                    }
                }
                class270.method1705(true, -39, var2, false);
            }
            class557.field8146 = -1;
            class199.field3098 = new class482(8);
            class544.method3196(0);
            class557.field8146 = class408.field5845;
            class7.method29(false, 22739);
            class498.method2983(-26);
            class362.method2167(class557.field8146);
        }
        class436.field6278 = true;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I[BI[BII)I")
    public final int method3061(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field7646++;
        if (arg2 == 0) {
            return 0;
        }
        int var7 = arg2 + arg5;
        int var8 = 0;
        if (arg4 != -1) {
            method3060((byte) 104, false);
        }
        int var9 = arg0;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 < 0) {
                var8 = this.field7647[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field7647[var8]) < 0) {
                arg1[arg5++] = (byte) (~var11);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field7647[var8];
            }
            int var12;
            if ((var12 = this.field7647[var8]) < 0) {
                arg1[arg5++] = (byte) (~var12);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field7647[var8];
            }
            int var13;
            if ((var13 = this.field7647[var8]) < 0) {
                arg1[arg5++] = (byte) (~var13);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field7647[var8];
            }
            int var14;
            if ((var14 = this.field7647[var8]) < 0) {
                arg1[arg5++] = (byte) (~var14);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field7647[var8];
            }
            int var15;
            if ((var15 = this.field7647[var8]) < 0) {
                arg1[arg5++] = (byte) (~var15);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field7647[var8];
            }
            int var16;
            if ((var16 = this.field7647[var8]) < 0) {
                arg1[arg5++] = (byte) (~var16);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field7647[var8];
            }
            int var17;
            if ((var17 = this.field7647[var8]) < 0) {
                arg1[arg5++] = (byte) (~var17);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field7647[var8];
            }
            int var18;
            if ((var18 = this.field7647[var8]) < 0) {
                arg1[arg5++] = (byte) (~var18);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg0;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "([I[ILhw;I[I)V")
    public static final void method3062(int[] arg0, int[] arg1, class270 arg2, int arg3, int[] arg4) {
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg0[var5];
            int var8 = arg1[var5];
            int var9 = 0;
            while (var7 != 0 && arg2.field2356.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg2.field2356[var9] = null;
                    } else {
                        class606 var10 = class480.field6871.method1417(arg3 ^ 0xE02, var6);
                        int var11 = var10.field8710;
                        class391 var12 = arg2.field2356[var9];
                        if (var12 != null) {
                            if (var12.field5694 == var6) {
                                if (var11 == 0) {
                                    var12 = arg2.field2356[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field5697 = 0;
                                    var12.field5695 = 0;
                                    var12.field5696 = 1;
                                    var12.field5691 = 0;
                                    var12.field5693 = var8;
                                    if (!arg2.field2389) {
                                        class150.method1144(0, (byte) 39, arg2, var10);
                                    }
                                } else if (var11 == 2) {
                                    var12.field5697 = 0;
                                }
                            } else if (var10.field8716 >= class480.field6871.method1417(-3585, var12.field5694).field8716) {
                                var12 = arg2.field2356[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class391 var13 = arg2.field2356[var9] = new class391();
                            var13.field5695 = 0;
                            var13.field5696 = 1;
                            var13.field5691 = 0;
                            var13.field5697 = 0;
                            var13.field5694 = var6;
                            var13.field5693 = var8;
                            if (!arg2.field2389) {
                                class150.method1144(0, (byte) 66, arg2, var10);
                            }
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        field7639++;
        if (arg3 != -3) {
            method3058(null, 57, -105, -69, 99);
        }
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "([B)V")
    public class516(byte[] arg0) {
        int var2 = arg0.length;
        this.field7645 = arg0;
        this.field7642 = new int[var2];
        int[] var3 = new int[33];
        this.field7647 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field7642[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class460.method2676(var12, var11);
                    }
                    var9 = var8 | var7;
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field7647[var14] == 0) {
                            this.field7647[var14] = var4;
                        }
                        var14 = this.field7647[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field7647.length <= var14) {
                        int[] var18 = new int[this.field7647.length * 2];
                        for (int var19 = 0; var19 < this.field7647.length; var19++) {
                            var18[var19] = this.field7647[var19];
                        }
                        this.field7647 = var18;
                    }
                }
                this.field7647[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I[BI[BIB)I")
    public final int method3063(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, byte arg5) {
        field7643++;
        int var7 = 0;
        int var8 = arg0 + arg4;
        int var9 = arg2 << 3;
        while (var8 > arg4) {
            int var10 = arg1[arg4] & 0xFF;
            int var11 = this.field7642[var10];
            byte var12 = this.field7645[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var14 - (1 - var12) >> 3) + var13;
            var9 += var12;
            int var17 = var14 + 24;
            arg3[var13] = (byte) (var7 = class460.method2676(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg3[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg3[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg3[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg3[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg4++;
        }
        if (arg5 != 5) {
            method3062(null, null, null, 90, null);
        }
        return (var9 + 7 >> 3) - arg2;
    }
}

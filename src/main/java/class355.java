import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class355 {

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "[I")
    private int[] field5715;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "[B")
    private byte[] field5710;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "[I")
    private int[] field5714;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5721 = new String[] { method2945(method2944("v\u0002'92")), method2945(method2944("XI'@6$9$QAY\u0018I")), method2945(method2944("$\u0015l\u0019uj\u0002zT4*")), method2945(method2944("T\u0007|\tsj\u0001)\u001cuvF")), method2945(method2944("t\u0007|\t\u007f")), method2945(method2944("j\u0013e\u0016")), method2945(method2944("v\u0002'?2")), method2945(method2944("\u007fH'Tg")), method2945(method2944("v\u0002';2")), method2945(method2944("v\u0002'Fsj\u000f}D2")), method2945(method2944("J\t)\u0019u`\u0003~\u0015h`Fo\u0015h$\u0002h\u000e{$\u0010h\u0016oaF")), method2945(method2944("v\u0002'>2")), method2945(method2944("v\u0002'82")) };

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "Lvn;")
    public static class330 field5712 = new class330(44, 0);

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "Lvn;")
    public static class330 field5720 = new class330(21, 8);

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field5716;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field5717;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "Lda;")
    public static class64 field5718;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "Llc;")
    public static class676 field5711;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 10)
    public static void method2939(int arg0) {
        try {
            field5718 = null;
            if (arg0 != 32) {
                method2943(-101);
            }
            field5720 = null;
            field5711 = null;
            field5712 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5721[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "([B)V", line = 26)
    public class355(byte[] arg0) {
        try {
            int var2 = arg0.length;
            this.field5715 = new int[var2];
            this.field5710 = arg0;
            this.field5714 = new int[8];
            int[] var3 = new int[33];
            int var4 = 0;
            for (int var5 = 0; var5 < var2; var5++) {
                byte var6 = arg0[var5];
                if (var6 != 0) {
                    int var7 = 0x1 << 32 - var6;
                    int var8 = var3[var6];
                    this.field5715[var5] = var8;
                    int var9;
                    if ((var7 & var8) == 0) {
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
                            var3[var10] = class553.method4099(var12, var11);
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
                        if ((var16 & var8) == 0) {
                            var14++;
                        } else {
                            if (this.field5714[var14] == 0) {
                                this.field5714[var14] = var4;
                            }
                            var14 = this.field5714[var14];
                        }
                        int var17 = var16 >>> 1;
                        if (this.field5714.length <= var14) {
                            int[] var18 = new int[this.field5714.length * 2];
                            for (int var19 = 0; var19 < this.field5714.length; var19++) {
                                var18[var19] = this.field5714[var19];
                            }
                            this.field5714 = var18;
                        }
                    }
                    if (var4 <= var14) {
                        var4 = var14 + 1;
                    }
                    this.field5714[var14] = ~var5;
                }
            }
        } catch (RuntimeException var21) {
            throw class590.method4333(var21, field5721[9] + (arg0 == null ? field5721[5] : field5721[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V", line = 149)
    public static final void method2940(int arg0) {
        try {
            field5719++;
            if (arg0 == -30516 && class393.field6256.field806 && class530.field7797.field7676 != -1) {
                class430.method3406(class530.field7797.field7671, 13, class530.field7797.field7676);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5721[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([BBIII[B)I", line = 164)
    public final int method2941(byte[] arg0, byte arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        try {
            field5717++;
            int var7 = 0;
            int var18 = arg2 + arg4;
            int var8 = arg3 << 3;
            while (var18 > arg2) {
                int var9 = arg0[arg2] & 0xFF;
                int var10 = this.field5715[var9];
                byte var11 = this.field5710[var9];
                if (var11 == 0) {
                    throw new RuntimeException(field5721[10] + var9);
                }
                int var12 = var8 >> 3;
                int var13 = var8 & 0x7;
                int var14 = var7 & -var13 >> 31;
                int var15 = var12 + (var13 + var11 - 1 >> 3);
                var8 += var11;
                int var19 = var13 + 24;
                arg5[var12] = (byte) (var7 = class553.method4099(var14, var10 >>> var19));
                if (var12 < var15) {
                    var12++;
                    var13 = var19 - 8;
                    arg5[var12] = (byte) (var7 = var10 >>> var13);
                    if (var12 < var15) {
                        var12++;
                        var13 -= 8;
                        arg5[var12] = (byte) (var7 = var10 >>> var13);
                        if (var12 < var15) {
                            var12++;
                            var13 -= 8;
                            arg5[var12] = (byte) (var7 = var10 >>> var13);
                            if (var15 > var12) {
                                var12++;
                                var13 -= 8;
                                arg5[var12] = (byte) (var7 = var10 << -var13);
                            }
                        }
                    }
                }
                arg2++;
            }
            if (arg1 != 88) {
                field5718 = null;
            }
            return (var8 + 7 >> 3) - arg3;
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field5721[11] + (arg0 == null ? field5721[5] : field5721[7]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field5721[5] : field5721[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II[B[BII)I", line = 237)
    public final int method2942(int arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5) {
        try {
            field5713++;
            if (arg1 == 0) {
                return 0;
            }
            int var7 = 0;
            int var8 = 108 / ((-arg5 - 56) / 46);
            int var21 = arg1 + arg4;
            int var9 = arg0;
            while (true) {
                byte var10 = arg3[var9];
                if (var10 < 0) {
                    var7 = this.field5714[var7];
                } else {
                    var7++;
                }
                int var11;
                if ((var11 = this.field5714[var7]) < 0) {
                    arg2[arg4++] = (byte) (~var11);
                    if (arg4 >= var21) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x40) == 0) {
                    var7++;
                } else {
                    var7 = this.field5714[var7];
                }
                int var12;
                if ((var12 = this.field5714[var7]) < 0) {
                    arg2[arg4++] = (byte) (~var12);
                    if (var21 <= arg4) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x20) == 0) {
                    var7++;
                } else {
                    var7 = this.field5714[var7];
                }
                int var13;
                if ((var13 = this.field5714[var7]) < 0) {
                    arg2[arg4++] = (byte) (~var13);
                    if (arg4 >= var21) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x10) == 0) {
                    var7++;
                } else {
                    var7 = this.field5714[var7];
                }
                int var14;
                if ((var14 = this.field5714[var7]) < 0) {
                    arg2[arg4++] = (byte) (~var14);
                    if (arg4 >= var21) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x8) == 0) {
                    var7++;
                } else {
                    var7 = this.field5714[var7];
                }
                int var15;
                if ((var15 = this.field5714[var7]) < 0) {
                    arg2[arg4++] = (byte) (~var15);
                    if (arg4 >= var21) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x4) == 0) {
                    var7++;
                } else {
                    var7 = this.field5714[var7];
                }
                int var16;
                if ((var16 = this.field5714[var7]) < 0) {
                    arg2[arg4++] = (byte) (~var16);
                    if (var21 <= arg4) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x2) == 0) {
                    var7++;
                } else {
                    var7 = this.field5714[var7];
                }
                int var17;
                if ((var17 = this.field5714[var7]) < 0) {
                    arg2[arg4++] = (byte) (~var17);
                    if (arg4 >= var21) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x1) == 0) {
                    var7++;
                } else {
                    var7 = this.field5714[var7];
                }
                int var18;
                if ((var18 = this.field5714[var7]) < 0) {
                    arg2[arg4++] = (byte) (~var18);
                    if (var21 <= arg4) {
                        break;
                    }
                    var7 = 0;
                }
                var9++;
            }
            return var9 + 1 - arg0;
        } catch (RuntimeException var20) {
            throw class590.method4333(var20, field5721[6] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field5721[5] : field5721[7]) + ',' + (arg3 == null ? field5721[5] : field5721[7]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V", line = 384)
    public static final void method2943(int arg0) {
        try {
            field5716++;
            if (class37.field427 < 102) {
                class37.field427 += 6;
            }
            if (class759.field11157 != -1 && class712.method5167(arg0 - 2333) > class390.field6227) {
                for (int var1 = class759.field11157; var1 < class501.field7494.length; var1++) {
                    if (class501.field7494[var1].startsWith(field5721[4])) {
                        int var2 = 5;
                        try {
                            var2 = Integer.parseInt(class501.field7494[var1].substring(6));
                        } catch (Exception var14) {
                        }
                        class6.method42(true, field5721[3] + var2 + field5721[2]);
                        class759.field11157 = var1 + 1;
                        class390.field6227 = (long) (var2 * 1000) + class712.method5167(-2334);
                        return;
                    }
                    class54.field683 = class501.field7494[var1];
                    class647.method4714(false, 0);
                }
                class759.field11157 = -1;
            }
            if (class317.field5177 != 0) {
                class582.field8381 -= class317.field5177 * 5;
                if (class455.field7020 <= class582.field8381) {
                    class582.field8381 = class455.field7020 - 1;
                }
                class317.field5177 = 0;
                if (class582.field8381 < 0) {
                    class582.field8381 = 0;
                }
            }
            for (int var3 = 0; var3 < class135.field1914; var3++) {
                class394 var4 = class680.field9699[var3];
                int var5 = var4.method2545(arg0 - 24028);
                char var6 = var4.method2541(-29008);
                int var7 = var4.method2547(-14517);
                if (var5 == 84) {
                    class647.method4714(false, 0);
                }
                if (var5 == 80) {
                    class647.method4714(true, 0);
                } else if (var5 == 66 && (var7 & 0x4) != 0) {
                    if (class494.field7432 != null) {
                        String var8 = "";
                        for (int var9 = class585.field8479.length - 1; var9 >= 0; var9--) {
                            if (class585.field8479[var9] != null && class585.field8479[var9].length() > 0) {
                                var8 = var8 + class585.field8479[var9] + '\n';
                            }
                        }
                        class494.field7432.setContents(new StringSelection(var8), null);
                    }
                } else if (var5 == 67 && (var7 & 0x4) != 0) {
                    if (class494.field7432 != null) {
                        Transferable var10 = class494.field7432.getContents(null);
                        if (var10 != null) {
                            try {
                                String var11 = (String) var10.getTransferData(DataFlavor.stringFlavor);
                                if (var11 != null) {
                                    String[] var12 = class444.method3476('\n', 11206, var11);
                                    class648.method4726(true, var12);
                                }
                            } catch (Exception var15) {
                            }
                        }
                    }
                } else if (var5 == 85 && class635.field9120 > 0) {
                    class54.field683 = class54.field683.substring(0, class635.field9120 - 1) + class54.field683.substring(class635.field9120);
                    class635.field9120--;
                } else if (var5 == 101 && class635.field9120 < class54.field683.length()) {
                    class54.field683 = class54.field683.substring(0, class635.field9120) + class54.field683.substring(class635.field9120 + 1);
                } else if (var5 == 96 && class635.field9120 > 0) {
                    class635.field9120--;
                } else if (var5 == 97 && class635.field9120 < class54.field683.length()) {
                    class635.field9120++;
                } else if (var5 == 102) {
                    class635.field9120 = 0;
                } else if (var5 == 103) {
                    class635.field9120 = class54.field683.length();
                } else if (var5 == 104 && class453.field7006 < class585.field8479.length) {
                    class453.field7006++;
                    class432.method3414(-109);
                    class635.field9120 = class54.field683.length();
                } else if (var5 == 105 && class453.field7006 > 0) {
                    class453.field7006--;
                    class432.method3414(arg0 - 117);
                    class635.field9120 = class54.field683.length();
                } else if (class789.method5668((byte) 126, var6) || field5721[1].indexOf(var6) != -1) {
                    class54.field683 = class54.field683.substring(0, class635.field9120) + class680.field9699[var3].method2541(-29008) + class54.field683.substring(class635.field9120);
                    class635.field9120++;
                }
            }
            if (arg0 != -1) {
                method2939(-88);
            }
            class135.field1914 = 0;
            class576.field8306 = 0;
            class30.method318(-116);
        } catch (RuntimeException var16) {
            throw class590.method4333(var16, field5721[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2944(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2945(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 4;
                    break;
                case 1:
                    var10005 = 102;
                    break;
                case 2:
                    var10005 = 9;
                    break;
                case 3:
                    var10005 = 122;
                    break;
                default:
                    var10005 = 26;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

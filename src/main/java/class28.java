import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class28 {

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "[B")
    private byte[] field697;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "[I")
    private int[] field706;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "[I")
    private int[] field710;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Lva;")
    private static class121 field694 = class107.method797("Invalid loginserver requested)3", -10983);

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field700 = 0;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "Lva;")
    private static class121 field699 = class107.method797("level)2", -10983);

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "Z")
    public static boolean field708 = false;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public static int field711 = 0;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "Lva;")
    public static class121 field712 = field699;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    public static int field707 = 0;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    public static int field716 = 3;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "[I")
    public static int[] field718 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "B")
    public static byte field714 = 0;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "Lva;")
    public static class121 field719 = field694;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "Lw;")
    public static class125 field702;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "Z")
    public static boolean field715;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "[I")
    public static int[] field701;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "[I")
    public static int[] field713;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "[Lm;")
    public static class72[] field698;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "[Lm;")
    public static class72[] field703;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BII)I", line = 11)
    public static final int method219(byte arg0, int arg1, int arg2) {
        field705++;
        int var3 = class113.method817(arg1 - 1, (byte) 106, arg2 - 1) + class113.method817(arg1 + 1, (byte) 106, arg2 - 1) + class113.method817(arg1 - 1, (byte) 106, arg2 + 1) + class113.method817(arg1 - -1, (byte) 106, arg2 - -1);
        if (arg0 <= 72) {
            method219((byte) 103, 27, -41);
        }
        int var4 = class113.method817(arg1 - 1, (byte) 106, arg2) + class113.method817(arg1 + 1, (byte) 106, arg2) + class113.method817(arg1, (byte) 106, arg2 - 1) + class113.method817(arg1, (byte) 106, arg2 + 1);
        int var5 = class113.method817(arg1, (byte) 106, arg2);
        return var4 / 8 + var3 / 16 + var5 / 4;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V", line = 42)
    public static void method220(int arg0) {
        field718 = null;
        field699 = null;
        field702 = null;
        field701 = null;
        field703 = null;
        field698 = null;
        field694 = null;
        field712 = null;
        field719 = null;
        if (arg0 != -25704) {
            field708 = true;
        }
        field713 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Z", line = 66)
    public static final boolean method221(int arg0, int arg1) {
        field696++;
        if (class61.field1482[arg0]) {
            return true;
        } else if (class107.field2435.method330(86, arg0)) {
            int var2 = class107.field2435.method328(arg0, false);
            if (var2 == 0) {
                class61.field1482[arg0] = true;
                return true;
            }
            if (arg1 != 14585) {
                field708 = true;
            }
            if (class126.field2872[arg0] == null) {
                class126.field2872[arg0] = new class19[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class126.field2872[arg0][var3] == null) {
                    byte[] var4 = class107.field2435.method315(arg0, true, var3);
                    if (var4 != null) {
                        class126.field2872[arg0][var3] = new class19();
                        class126.field2872[arg0][var3].method170(new class113(var4), 75);
                    }
                }
            }
            class61.field1482[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([BI[BIIB)I", line = 122)
    public final int method222(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, byte arg5) {
        field709++;
        if (arg5 > -15) {
            method220(-67);
        }
        if (arg1 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg1 + arg4;
        int var9 = arg3;
        while (true) {
            byte var10 = arg0[var9];
            if (var10 < 0) {
                var7 = this.field710[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field710[var7]) < 0) {
                arg2[arg4++] = (byte) ~var11;
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field710[var7];
            }
            int var12;
            if ((var12 = this.field710[var7]) < 0) {
                arg2[arg4++] = (byte) ~var12;
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field710[var7];
            }
            int var13;
            if ((var13 = this.field710[var7]) < 0) {
                arg2[arg4++] = (byte) ~var13;
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field710[var7];
            }
            int var14;
            if ((var14 = this.field710[var7]) < 0) {
                arg2[arg4++] = (byte) ~var14;
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field710[var7];
            }
            int var15;
            if ((var15 = this.field710[var7]) < 0) {
                arg2[arg4++] = (byte) ~var15;
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field710[var7];
            }
            int var16;
            if ((var16 = this.field710[var7]) < 0) {
                arg2[arg4++] = (byte) ~var16;
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field710[var7];
            }
            int var17;
            if ((var17 = this.field710[var7]) < 0) {
                arg2[arg4++] = (byte) ~var17;
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field710[var7];
            }
            int var18;
            if ((var18 = this.field710[var7]) < 0) {
                arg2[arg4++] = (byte) ~var18;
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ls;Ljava/awt/Component;B)V", line = 297)
    public static final void method223(class105 arg0, Component arg1, byte arg2) {
        field695++;
        try {
            class112 var3 = (class112) Class.forName("sd").getDeclaredConstructor().newInstance();
            var3.method816(arg0, 2048);
            class129.field2974 = var3;
            if (arg2 > 75) {
                ;
            }
        } catch (Throwable var6) {
            try {
                class129.field2974 = new class94(arg0, arg1);
            } catch (Throwable var5) {
                if (class105.field2404.toLowerCase().indexOf("microsoft") >= 0) {
                    try {
                        class129.field2974 = new class93();
                        return;
                    } catch (Throwable var4) {
                    }
                }
                class129.field2974 = new class27(8000);
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([BBI[BII)I", line = 345)
    public final int method224(byte[] arg0, byte arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field704++;
        int var7 = 0;
        int var8 = arg2 + arg5;
        if (arg1 < 4) {
            field715 = true;
        }
        int var9 = arg4 << 3;
        while (arg2 < var8) {
            int var10 = arg3[arg2] & 0xFF;
            int var11 = this.field706[var10];
            byte var12 = this.field697[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 & 0x7;
            int var14 = var7 & -var13 >> 31;
            int var15 = var9 >> 3;
            int var16 = (var13 + var12 - 1 >> 3) + var15;
            int var17 = var13 + 24;
            arg0[var15] = (byte) (var7 = class59.method430(var14, var11 >>> var17));
            if (var16 > var15) {
                var13 = var17 - 8;
                var15++;
                arg0[var15] = (byte) (var7 = var11 >>> var13);
                if (var15 < var16) {
                    var15++;
                    var13 -= 8;
                    arg0[var15] = (byte) (var7 = var11 >>> var13);
                    if (var15 < var16) {
                        var15++;
                        var13 -= 8;
                        arg0[var15] = (byte) (var7 = var11 >>> var13);
                        if (var15 < var16) {
                            var13 -= 8;
                            var15++;
                            arg0[var15] = (byte) (var7 = var11 << -var13);
                        }
                    }
                }
            }
            var9 += var12;
            arg2++;
        }
        return (var9 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "([B)V", line = 414)
    public class28(byte[] arg0) {
        int var2 = arg0.length;
        this.field697 = arg0;
        int[] var3 = new int[33];
        this.field706 = new int[var2];
        int var4 = 0;
        this.field710 = new int[8];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field706[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var7 | var8;
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
                        var3[var10] = class59.method430(var12, var11);
                    }
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
                        if (this.field710[var14] == 0) {
                            this.field710[var14] = var4;
                        }
                        var14 = this.field710[var14];
                    }
                    if (this.field710.length <= var14) {
                        int[] var17 = new int[this.field710.length * 2];
                        for (int var18 = 0; var18 < this.field710.length; var18++) {
                            var17[var18] = this.field710[var18];
                        }
                        this.field710 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field710[var14] = ~var5;
            }
        }
    }
}

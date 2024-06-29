import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 {

    @OriginalMember(owner = "client!a", name = "m", descriptor = "[B")
    private byte[] field13;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "[I")
    private int[] field6;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "[I")
    private int[] field4;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "[Lwb;")
    public static class130[] field1 = new class130[5];

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Lwb;")
    public static class130 field3 = class26.method212("headicons_hint", -32376);

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field9 = 0;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Lwb;")
    private static class130 field11 = class26.method212("Add friend", -32376);

    @OriginalMember(owner = "client!a", name = "p", descriptor = "Lwb;")
    public static class130 field16 = field11;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "Lwb;")
    private static class130 field15 = class26.method212("Connection timed out)3", -32376);

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Lwb;")
    public static class130 field7 = class26.method212("Spiel)2Fenster geladen)3", -32376);

    @OriginalMember(owner = "client!a", name = "r", descriptor = "Lwb;")
    private static class130 field18 = class26.method212("Connecting to server)3)3)3", -32376);

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Lwb;")
    public static class130 field5 = field18;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Z")
    public static boolean field8 = false;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Lwb;")
    public static class130 field2 = field15;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field12 = 0;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "Lqd;")
    public static class100 field17;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(III[BI[B)I", line = 5)
    public final int method1(int arg0, int arg1, int arg2, byte[] arg3, int arg4, byte[] arg5) {
        int var7 = arg2 + arg4;
        field19++;
        int var8 = arg1 << 3;
        int var9 = 0;
        while (var7 > arg2) {
            int var11 = arg5[arg2] & 0xFF;
            int var12 = this.field6[var11];
            byte var13 = this.field13[var11];
            if (var13 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var8 >> 3;
            int var15 = var8 & 0x7;
            int var16 = var9 & -var15 >> 31;
            int var17 = (var13 + var15 - 1 >> 3) + var14;
            int var18 = var15 + 24;
            arg3[var14] = (byte) (var9 = class129.method950(var16, var12 >>> var18));
            if (var17 > var14) {
                var15 = var18 - 8;
                var14++;
                arg3[var14] = (byte) (var9 = var12 >>> var15);
                if (var17 > var14) {
                    var15 -= 8;
                    var14++;
                    arg3[var14] = (byte) (var9 = var12 >>> var15);
                    if (var14 < var17) {
                        var15 -= 8;
                        var14++;
                        arg3[var14] = (byte) (var9 = var12 >>> var15);
                        if (var14 < var17) {
                            var15 -= 8;
                            var14++;
                            arg3[var14] = (byte) (var9 = var12 << -var15);
                        }
                    }
                }
            }
            var8 += var13;
            arg2++;
        }
        int var10 = 36 % ((80 - arg0) / 43);
        return (var8 + 7 >> 3) - arg1;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V", line = 90)
    public static void method2(boolean arg0) {
        field18 = null;
        field7 = null;
        field15 = null;
        field17 = null;
        if (arg0) {
            method3(51);
        }
        field16 = null;
        field2 = null;
        field5 = null;
        field3 = null;
        field11 = null;
        field1 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 164)
    public static final void method3(int arg0) {
        field10++;
        if (arg0 != 8) {
            method2(false);
        }
        class51 var1 = class56.field1426;
        synchronized (class56.field1426) {
            class96.field2332 = class132.field3188;
            if (class21.field622 >= 0) {
                while (class21.field622 != class115.field2827) {
                    int var2 = class116.field2851[class115.field2827];
                    class115.field2827 = class115.field2827 + 1 & 0x7F;
                    if (var2 >= 0) {
                        class81.field1939[var2] = true;
                    } else {
                        class81.field1939[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class81.field1939[var3] = false;
                }
                class21.field622 = class115.field2827;
            }
            class132.field3188 = class103.field2531;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II[BII[B)I", line = 205)
    public final int method4(int arg0, int arg1, byte[] arg2, int arg3, int arg4, byte[] arg5) {
        field14++;
        if (arg1 == 0) {
            return 0;
        }
        int var7 = arg1 + arg4;
        int var8 = 0;
        int var9 = arg3;
        if (arg0 >= -36) {
            method3(-14);
        }
        while (true) {
            byte var10 = arg5[var9];
            if (var10 < 0) {
                var8 = this.field4[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field4[var8]) < 0) {
                arg2[arg4++] = (byte) ~var11;
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field4[var8];
            }
            int var12;
            if ((var12 = this.field4[var8]) < 0) {
                arg2[arg4++] = (byte) ~var12;
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field4[var8];
            }
            int var13;
            if ((var13 = this.field4[var8]) < 0) {
                arg2[arg4++] = (byte) ~var13;
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field4[var8];
            }
            int var14;
            if ((var14 = this.field4[var8]) < 0) {
                arg2[arg4++] = (byte) ~var14;
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field4[var8];
            }
            int var15;
            if ((var15 = this.field4[var8]) < 0) {
                arg2[arg4++] = (byte) ~var15;
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field4[var8];
            }
            int var16;
            if ((var16 = this.field4[var8]) < 0) {
                arg2[arg4++] = (byte) ~var16;
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field4[var8];
            }
            int var17;
            if ((var17 = this.field4[var8]) < 0) {
                arg2[arg4++] = (byte) ~var17;
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field4[var8];
            }
            int var18;
            if ((var18 = this.field4[var8]) < 0) {
                arg2[arg4++] = (byte) ~var18;
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "([B)V", line = 354)
    public class1(byte[] arg0) {
        int var2 = arg0.length;
        int[] var3 = new int[33];
        this.field13 = arg0;
        this.field6 = new int[var2];
        this.field4 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field6[var5] = var8;
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
                        var3[var10] = class129.method950(var11, var12);
                    }
                    var9 = var7 | var8;
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
                        if (this.field4[var14] == 0) {
                            this.field4[var14] = var4;
                        }
                        var14 = this.field4[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field4.length <= var14) {
                        int[] var18 = new int[this.field4.length * 2];
                        for (int var19 = 0; var19 < this.field4.length; var19++) {
                            var18[var19] = this.field4[var19];
                        }
                        this.field4 = var18;
                    }
                }
                this.field4[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}

import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class36 {

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "[I")
    private int[] field901;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "[B")
    private byte[] field911;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "[I")
    private int[] field903;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "Lad;")
    public static class5 field904 = class88.method674("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", -104);

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "Lad;")
    private static class5 field913 = class88.method674("This computers address has been blocked", -107);

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "Lad;")
    public static class5 field906 = field913;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "Lad;")
    private static class5 field915 = class88.method674("To create a new account you need to", -117);

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "Lad;")
    public static class5 field910 = field915;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "Le;")
    public static class25 field907 = new class25(5000);

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "Lad;")
    public static class5 field919 = class88.method674("Hierhin gehen", 87);

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "Lad;")
    public static class5 field921 = class88.method674(" weitere Optionen", 119);

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "Lad;")
    private static class5 field918 = class88.method674(" is already on your friend list", 83);

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "Lad;")
    public static class5 field920 = field918;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "Lad;")
    public static class5 field922 = class88.method674("(Udns", -88);

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "[[B")
    public static byte[][] field917;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 3)
    public static void method276(int arg0) {
        if (arg0 >= -30) {
            return;
        }
        field921 = null;
        field913 = null;
        field915 = null;
        field922 = null;
        field904 = null;
        field917 = null;
        field906 = null;
        field918 = null;
        field919 = null;
        field920 = null;
        field907 = null;
        field910 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lab;ZI)V", line = 26)
    public static final void method277(class3 arg0, boolean arg1, int arg2) {
        class90.method686(arg0.field120, 327680, arg2, arg0.field112);
        if (arg1) {
            field905++;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIII)I", line = 42)
    public static final int method278(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field912++;
        if (var4 == 0) {
            return arg3;
        }
        if (arg0 != 7) {
            field910 = null;
        }
        if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II[BBI[B)I", line = 72)
    public final int method279(int arg0, int arg1, byte[] arg2, byte arg3, int arg4, byte[] arg5) {
        field908++;
        if (arg1 == 0) {
            return 0;
        }
        if (arg3 != 15) {
            method278(-83, 80, 38, 27);
        }
        int var7 = arg0 + arg1;
        int var8 = 0;
        int var9 = arg4;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field903[var8];
            }
            int var11;
            if ((var11 = this.field903[var8]) < 0) {
                arg2[arg0++] = (byte) ~var11;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field903[var8];
            }
            int var12;
            if ((var12 = this.field903[var8]) < 0) {
                arg2[arg0++] = (byte) ~var12;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field903[var8];
            }
            int var13;
            if ((var13 = this.field903[var8]) < 0) {
                arg2[arg0++] = (byte) ~var13;
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field903[var8];
            }
            int var14;
            if ((var14 = this.field903[var8]) < 0) {
                arg2[arg0++] = (byte) ~var14;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field903[var8];
            }
            int var15;
            if ((var15 = this.field903[var8]) < 0) {
                arg2[arg0++] = (byte) ~var15;
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field903[var8];
            }
            int var16;
            if ((var16 = this.field903[var8]) < 0) {
                arg2[arg0++] = (byte) ~var16;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field903[var8];
            }
            int var17;
            if ((var17 = this.field903[var8]) < 0) {
                arg2[arg0++] = (byte) ~var17;
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field903[var8];
            }
            int var18;
            if ((var18 = this.field903[var8]) < 0) {
                arg2[arg0++] = (byte) ~var18;
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg4;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([BIIB[BI)I", line = 247)
    public final int method280(byte[] arg0, int arg1, int arg2, byte arg3, byte[] arg4, int arg5) {
        field916++;
        int var7 = arg1 + arg2;
        int var8 = 0;
        int var9 = arg5 << 3;
        if (arg3 != 47) {
            field906 = null;
        }
        while (var7 > arg2) {
            int var10 = arg0[arg2] & 0xFF;
            byte var11 = this.field911[var10];
            int var12 = this.field901[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var8 & -var14 >> 31;
            var9 += var11;
            int var16 = var13 + (var14 + var11 - 1 >> 3);
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var8 = class5.method54(var15, var12 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg4[var13] = (byte) (var8 = var12 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg4[var13] = (byte) (var8 = var12 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg4[var13] = (byte) (var8 = var12 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg4[var13] = (byte) (var8 = var12 << -var14);
                        }
                    }
                }
            }
            arg2++;
        }
        return (var9 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V", line = 331)
    public static final void method281(int arg0) {
        field914++;
        try {
            if (arg0 != 205) {
                method281(-68);
            }
            Graphics var1 = class9.field305.getGraphics();
            class33.field795.method253(205, var1, false, 553);
        } catch (Exception var2) {
            class9.field305.repaint();
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "([B)V", line = 347)
    public class36(byte[] arg0) {
        int var2 = arg0.length;
        this.field901 = new int[var2];
        this.field911 = arg0;
        int[] var3 = new int[33];
        this.field903 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field901[var5] = var8;
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
                        var3[var10] = class5.method54(var11, var12);
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
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field903[var14] == 0) {
                            this.field903[var14] = var4;
                        }
                        var14 = this.field903[var14];
                    }
                    if (var14 >= this.field903.length) {
                        int[] var17 = new int[this.field903.length * 2];
                        for (int var18 = 0; var18 < this.field903.length; var18++) {
                            var17[var18] = this.field903[var18];
                        }
                        this.field903 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field903[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}

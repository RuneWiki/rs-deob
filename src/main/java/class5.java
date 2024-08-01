import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ad")
public class class5 {

    @OriginalMember(owner = "ad", name = "b", descriptor = "[B")
    private byte[] field62;

    @OriginalMember(owner = "ad", name = "d", descriptor = "[I")
    private int[] field64;

    @OriginalMember(owner = "ad", name = "e", descriptor = "[I")
    private int[] field65;

    @OriginalMember(owner = "ad", name = "c", descriptor = "Llf;")
    public static class109 field63 = class35.method275("huffman", 2);

    @OriginalMember(owner = "ad", name = "j", descriptor = "[I")
    public static int[] field70 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "ad", name = "l", descriptor = "I")
    public static int field72 = 0;

    @OriginalMember(owner = "ad", name = "f", descriptor = "Ll;")
    public static class103 field66 = new class103();

    @OriginalMember(owner = "ad", name = "s", descriptor = "I")
    public static int field79 = 0;

    @OriginalMember(owner = "ad", name = "q", descriptor = "Llf;")
    public static class109 field77 = class35.method275("Fehler beim Laden Ihres Spielcharakters)3", 2);

    @OriginalMember(owner = "ad", name = "r", descriptor = "I")
    public static int field78 = 0;

    @OriginalMember(owner = "ad", name = "n", descriptor = "Llf;")
    private static class109 field74 = class35.method275("No reply from loginserver)3", 2);

    @OriginalMember(owner = "ad", name = "t", descriptor = "Llf;")
    public static class109 field80 = field74;

    @OriginalMember(owner = "ad", name = "v", descriptor = "Llf;")
    private static class109 field82 = class35.method275("Please wait 1 minute and try again)3", 2);

    @OriginalMember(owner = "ad", name = "w", descriptor = "Llf;")
    public static class109 field83 = field82;

    @OriginalMember(owner = "ad", name = "p", descriptor = "Llf;")
    public static class109 field76 = field82;

    @OriginalMember(owner = "ad", name = "a", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "ad", name = "g", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "ad", name = "h", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "ad", name = "i", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "ad", name = "k", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "ad", name = "m", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "ad", name = "o", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "ad", name = "u", descriptor = "Lnd;")
    public static class125 field81;

    @OriginalMember(owner = "ad", name = "a", descriptor = "(II[BI[BI)I")
    public final int method20(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        int var7 = 0;
        field71++;
        int var8 = arg1 + arg5;
        int var9 = arg3 << 3;
        while (arg1 < var8) {
            int var10 = arg4[arg1] & 0xFF;
            byte var11 = this.field62[var10];
            int var12 = this.field64[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            var9 += var11;
            int var15 = (var11 + var14 - 1 >> 3) + var13;
            int var16 = var7 & -var14 >> 31;
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var7 = class31.method262(var16, var12 >>> var17));
            if (var15 > var13) {
                var14 = var17 - 8;
                var13++;
                arg2[var13] = (byte) (var7 = var12 >>> var14);
                if (var15 > var13) {
                    var14 -= 8;
                    var13++;
                    arg2[var13] = (byte) (var7 = var12 >>> var14);
                    if (var13 < var15) {
                        var14 -= 8;
                        var13++;
                        arg2[var13] = (byte) (var7 = var12 >>> var14);
                        if (var15 > var13) {
                            var13++;
                            var14 -= 8;
                            arg2[var13] = (byte) (var7 = var12 << -var14);
                        }
                    }
                }
            }
            arg1++;
        }
        if (arg0 != 8) {
            method23(true, true, 50, 99, true);
        }
        return (var9 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "ad", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method21(byte arg0, Component arg1) {
        arg1.removeMouseListener(class85.field1728);
        if (arg0 != -106) {
            method23(true, true, 84, 32, true);
        }
        arg1.removeMouseMotionListener(class85.field1728);
        arg1.removeFocusListener(class85.field1728);
        field68++;
        class52.field1054 = 0;
    }

    @OriginalMember(owner = "ad", name = "a", descriptor = "(III)I")
    public static final int method22(int arg0, int arg1, int arg2) {
        field69++;
        int var3 = arg0 - 1 & arg2 >> 31;
        if (arg1 != -1156100001) {
            method24((byte) -122);
        }
        return ((arg2 >>> 31) + arg2) % arg0 + var3;
    }

    @OriginalMember(owner = "ad", name = "a", descriptor = "(ZZIIZ)Loh;")
    public static final class138 method23(boolean arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        if (arg3 != -20347) {
            method24((byte) -37);
        }
        field67++;
        class204 var5 = null;
        if (class179.field3388 != null) {
            var5 = new class204(arg2, class179.field3388, class93.field1907[arg2], 1000000);
        }
        return new class138(var5, class16.field307, arg2, arg1, arg0, arg4);
    }

    @OriginalMember(owner = "ad", name = "a", descriptor = "(B)V")
    public static void method24(byte arg0) {
        field66 = null;
        field82 = null;
        field74 = null;
        field70 = null;
        field83 = null;
        field63 = null;
        field80 = null;
        field76 = null;
        field81 = null;
        field77 = null;
        if (arg0 > -12) {
            field66 = null;
        }
    }

    @OriginalMember(owner = "ad", name = "<init>", descriptor = "([B)V")
    public class5(byte[] arg0) {
        int var2 = 0;
        int var3 = arg0.length;
        this.field62 = arg0;
        int[] var4 = new int[33];
        this.field64 = new int[var3];
        this.field65 = new int[8];
        for (int var5 = 0; var5 < var3; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field64[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var4[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var4[var10] = var4[var10 - 1];
                            break;
                        }
                        var4[var10] = class31.method262(var12, var11);
                    }
                    var9 = var8 | var7;
                } else {
                    var9 = var4[var6 - 1];
                }
                var4[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field65[var14] == 0) {
                            this.field65[var14] = var2;
                        }
                        var14 = this.field65[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field65.length) {
                        int[] var18 = new int[this.field65.length * 2];
                        for (int var19 = 0; var19 < this.field65.length; var19++) {
                            var18[var19] = this.field65[var19];
                        }
                        this.field65 = var18;
                    }
                }
                this.field65[var14] = ~var5;
                if (var2 <= var14) {
                    var2 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "ad", name = "a", descriptor = "([BII[BII)I")
    public final int method25(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        if (arg5 != 4581) {
            return -110;
        }
        field61++;
        if (arg2 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg2 + arg4;
        int var9 = arg1;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 < 0) {
                var7 = this.field65[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field65[var7]) < 0) {
                arg0[arg4++] = (byte) ~var11;
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field65[var7];
            }
            int var12;
            if ((var12 = this.field65[var7]) < 0) {
                arg0[arg4++] = (byte) ~var12;
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field65[var7];
            }
            int var13;
            if ((var13 = this.field65[var7]) < 0) {
                arg0[arg4++] = (byte) ~var13;
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field65[var7];
            }
            int var14;
            if ((var14 = this.field65[var7]) < 0) {
                arg0[arg4++] = (byte) ~var14;
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field65[var7];
            }
            int var15;
            if ((var15 = this.field65[var7]) < 0) {
                arg0[arg4++] = (byte) ~var15;
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field65[var7];
            }
            int var16;
            if ((var16 = this.field65[var7]) < 0) {
                arg0[arg4++] = (byte) ~var16;
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field65[var7];
            }
            int var17;
            if ((var17 = this.field65[var7]) < 0) {
                arg0[arg4++] = (byte) ~var17;
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field65[var7];
            }
            int var18;
            if ((var18 = this.field65[var7]) < 0) {
                arg0[arg4++] = (byte) ~var18;
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg1;
    }
}

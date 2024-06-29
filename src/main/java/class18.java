import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class18 {

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "[B")
    private byte[] field258;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "[I")
    private int[] field256;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "[I")
    private int[] field253;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field259 = 0;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "Ljd;")
    public static class85 field252 = class221.method1499("Spieler kann nicht gefunden werden: ", (byte) 112);

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Lve;")
    public static class184 field255 = new class184(64);

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "Ljd;")
    public static class85 field261 = class221.method1499(")1 ", (byte) -93);

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "Lwe;")
    public static class15 field260 = new class15();

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public static int field262 = 0;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "Ljd;")
    public static class85 field265 = class221.method1499("Texturen geladen)3", (byte) -76);

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "[I")
    public static int[] field266 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public static int field267 = 0;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public static int field263 = 0;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIBI[B[B)I")
    public final int method129(int arg0, int arg1, byte arg2, int arg3, byte[] arg4, byte[] arg5) {
        field254++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = arg1 + arg3;
        int var8 = 0;
        if (arg2 != 77) {
            return -82;
        }
        int var9 = arg0;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field256[var8];
            }
            int var11;
            if ((var11 = this.field256[var8]) < 0) {
                arg4[arg1++] = (byte) (~var11);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field256[var8];
            }
            int var12;
            if ((var12 = this.field256[var8]) < 0) {
                arg4[arg1++] = (byte) (~var12);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field256[var8];
            }
            int var13;
            if ((var13 = this.field256[var8]) < 0) {
                arg4[arg1++] = (byte) (~var13);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field256[var8];
            }
            int var14;
            if ((var14 = this.field256[var8]) < 0) {
                arg4[arg1++] = (byte) (~var14);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field256[var8];
            }
            int var15;
            if ((var15 = this.field256[var8]) < 0) {
                arg4[arg1++] = (byte) (~var15);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field256[var8];
            }
            int var16;
            if ((var16 = this.field256[var8]) < 0) {
                arg4[arg1++] = (byte) (~var16);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field256[var8];
            }
            int var17;
            if ((var17 = this.field256[var8]) < 0) {
                arg4[arg1++] = (byte) (~var17);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field256[var8];
            }
            int var18;
            if ((var18 = this.field256[var8]) < 0) {
                arg4[arg1++] = (byte) (~var18);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZB)V")
    public static final void method130(boolean arg0, byte arg1) {
        if (arg1 > -62) {
            field260 = null;
        }
        for (class185 var2 = (class185) class247.field4254.method110(64); var2 != null; var2 = (class185) class247.field4254.method117((byte) 89)) {
            if (var2.field3182 != null) {
                class247.field4249.method954(var2.field3182);
                var2.field3182 = null;
            }
            if (var2.field3172 != null) {
                class247.field4249.method954(var2.field3172);
                var2.field3172 = null;
            }
            var2.method1753(137);
        }
        if (arg0) {
            for (class185 var3 = (class185) class187.field3218.method110(64); var3 != null; var3 = (class185) class187.field3218.method117((byte) 111)) {
                if (var3.field3182 != null) {
                    class247.field4249.method954(var3.field3182);
                    var3.field3182 = null;
                }
                var3.method1753(137);
            }
            for (class185 var4 = (class185) class31.field472.method1392((byte) -120); var4 != null; var4 = (class185) class31.field472.method1399(-123)) {
                if (var4.field3182 != null) {
                    class247.field4249.method954(var4.field3182);
                    var4.field3182 = null;
                }
                var4.method1753(137);
            }
        }
        field257++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)J")
    public static final long method131(int arg0, int arg1, int arg2) {
        class208 var3 = class99.field1780[arg0][arg1][arg2];
        return var3 == null || var3.field3641 == null ? 0L : var3.field3641.field4751;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([BII[BII)I")
    public final int method132(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field251++;
        int var7 = arg1 + arg4;
        int var8 = arg5 << 3;
        int var9 = 0;
        while (var7 > arg4) {
            int var10 = arg0[arg4] & 0xFF;
            int var11 = this.field253[var10];
            byte var12 = this.field258[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            var8 += var12;
            int var15 = var9 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg3[var13] = (byte) (var9 = class75.method528(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg3[var13] = (byte) (var9 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg3[var13] = (byte) (var9 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg3[var13] = (byte) (var9 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg3[var13] = (byte) (var9 = var11 << -var14);
                        }
                    }
                }
            }
            arg4++;
        }
        if (arg2 != -1) {
            field265 = null;
        }
        return (var8 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "([B)V")
    public class18(byte[] arg0) {
        int var2 = arg0.length;
        int[] var3 = new int[33];
        this.field258 = arg0;
        int var4 = 0;
        this.field256 = new int[8];
        this.field253 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field253[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var8 | var7;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class75.method528(var12, var11);
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
                        if (this.field256[var14] == 0) {
                            this.field256[var14] = var4;
                        }
                        var14 = this.field256[var14];
                    }
                    if (var14 >= this.field256.length) {
                        int[] var17 = new int[this.field256.length * 2];
                        for (int var18 = 0; var18 < this.field256.length; var18++) {
                            var17[var18] = this.field256[var18];
                        }
                        this.field256 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field256[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    public static void method133(byte arg0) {
        field265 = null;
        if (arg0 <= 6) {
            method131(-82, -60, 32);
        }
        field266 = null;
        field252 = null;
        field261 = null;
        field260 = null;
        field255 = null;
    }
}

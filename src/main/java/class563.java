import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class563 {

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "[B")
    private byte[] field7918;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "[I")
    private int[] field7925;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "[I")
    private int[] field7921;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "Lhg;")
    public static class693 field7917 = new class693(15, 8);

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "Z")
    public static boolean field7924 = true;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field7919;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field7920;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field7922;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field7923;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIC)C", line = 6)
    public static final char method3246(int arg0, int arg1, char arg2) {
        field7919++;
        if (arg2 >= 'À' && arg2 <= 'ÿ') {
            if (arg2 >= 'À' && arg2 <= 'Æ') {
                return 'A';
            }
            if (arg2 == 'Ç') {
                return 'C';
            }
            if (arg2 >= 'È' && arg2 <= 'Ë') {
                return 'E';
            }
            if (arg2 >= 'Ì' && arg2 <= 'Ï') {
                return 'I';
            }
            if (arg2 >= 'Ò' && arg2 <= 'Ö') {
                return 'O';
            }
            if (arg2 >= 'Ù' && arg2 <= 'Ü') {
                return 'U';
            }
            if (arg2 == 'Ý') {
                return 'Y';
            }
            if (arg2 == 'ß') {
                return 's';
            }
            if (arg2 >= 'à' && arg2 <= 'æ') {
                return 'a';
            }
            if (arg2 == 'ç') {
                return 'c';
            }
            if (arg2 >= 'è' && arg2 <= 'ë') {
                return 'e';
            }
            if (arg2 >= 'ì' && arg2 <= 'ï') {
                return 'i';
            }
            if (arg2 >= 'ò' && arg2 <= 'ö') {
                return 'o';
            }
            if (arg2 >= 'ù' && arg2 <= 'ü') {
                return 'u';
            }
            if (arg2 == 'ý' || arg2 == 'ÿ') {
                return 'y';
            }
        }
        if (arg2 == 'Œ') {
            return 'O';
        } else if (arg2 == 'œ') {
            return 'o';
        } else if (arg0 != 14552) {
            return '\u001d';
        } else if (arg2 == 'Ÿ') {
            return 'Y';
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V", line = 88)
    public static void method3247(boolean arg0) {
        field7917 = null;
        if (arg0) {
            field7923 = 92;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBI[B[BI)I", line = 107)
    public final int method3248(int arg0, byte arg1, int arg2, byte[] arg3, byte[] arg4, int arg5) {
        field7920++;
        if (arg1 != -67) {
            field7923 = -101;
        }
        int var7 = 0;
        int var8 = arg5 << 3;
        int var9 = arg0 + arg2;
        while (var9 > arg0) {
            int var10 = arg3[arg0] & 0xFF;
            int var11 = this.field7925[var10];
            byte var12 = this.field7918[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var7 = class683.method3840(var15, var11 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg4[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg4[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var14 -= 8;
                        var13++;
                        arg4[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg4[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var8 += var12;
            arg0++;
        }
        return (var8 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I[BII[BI)I", line = 183)
    public final int method3249(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field7922++;
        if (arg2 != -1) {
            field7917 = null;
        }
        if (arg3 == 0) {
            return 0;
        }
        int var7 = arg3 + arg5;
        int var8 = 0;
        int var9 = arg0;
        while (true) {
            byte var10 = arg1[var9];
            if (var10 < 0) {
                var8 = this.field7921[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field7921[var8]) < 0) {
                arg4[arg5++] = (byte) (~var11);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field7921[var8];
            }
            int var12;
            if ((var12 = this.field7921[var8]) < 0) {
                arg4[arg5++] = (byte) (~var12);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field7921[var8];
            }
            int var13;
            if ((var13 = this.field7921[var8]) < 0) {
                arg4[arg5++] = (byte) (~var13);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field7921[var8];
            }
            int var14;
            if ((var14 = this.field7921[var8]) < 0) {
                arg4[arg5++] = (byte) (~var14);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field7921[var8];
            }
            int var15;
            if ((var15 = this.field7921[var8]) < 0) {
                arg4[arg5++] = (byte) (~var15);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field7921[var8];
            }
            int var16;
            if ((var16 = this.field7921[var8]) < 0) {
                arg4[arg5++] = (byte) (~var16);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field7921[var8];
            }
            int var17;
            if ((var17 = this.field7921[var8]) < 0) {
                arg4[arg5++] = (byte) (~var17);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field7921[var8];
            }
            int var18;
            if ((var18 = this.field7921[var8]) < 0) {
                arg4[arg5++] = (byte) (~var18);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg0;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "([B)V", line = 332)
    public class563(byte[] arg0) {
        int var2 = arg0.length;
        this.field7918 = arg0;
        this.field7925 = new int[var2];
        int[] var3 = new int[33];
        this.field7921 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field7925[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var8 | var7;
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
                        var3[var10] = class683.method3840(var12, var11);
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
                        if (this.field7921[var14] == 0) {
                            this.field7921[var14] = var4;
                        }
                        var14 = this.field7921[var14];
                    }
                    if (this.field7921.length <= var14) {
                        int[] var17 = new int[this.field7921.length * 2];
                        for (int var18 = 0; var18 < this.field7921.length; var18++) {
                            var17[var18] = this.field7921[var18];
                        }
                        this.field7921 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field7921[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}

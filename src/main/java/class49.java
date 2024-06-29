import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class49 {

    @OriginalMember(owner = "client!h", name = "g", descriptor = "[I")
    private int[] field1159;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "[I")
    private int[] field1158;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "[B")
    private byte[] field1168;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "Lu;")
    private static class135 field1156 = class87.method676((byte) -67, "Unable to connect)3");

    @OriginalMember(owner = "client!h", name = "h", descriptor = "Lu;")
    public static class135 field1160 = class87.method676((byte) -120, "@whi@");

    @OriginalMember(owner = "client!h", name = "l", descriptor = "I")
    public static int field1164 = 0;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "Lu;")
    public static class135 field1170 = field1156;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "Lu;")
    public static class135 field1171 = field1156;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    public static int field1167 = 3;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "Lu;")
    private static class135 field1165 = class87.method676((byte) -41, "Please check your message)2centre for details)3");

    @OriginalMember(owner = "client!h", name = "e", descriptor = "Lu;")
    public static class135 field1157 = field1165;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "Z")
    public static boolean field1172 = false;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "Lr;")
    public static class117 field1153 = new class117(5000);

    @OriginalMember(owner = "client!h", name = "x", descriptor = "Lu;")
    public static class135 field1176 = class87.method676((byte) -48, "null");

    @OriginalMember(owner = "client!h", name = "v", descriptor = "I")
    public static int field1174 = -1;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "Lg;")
    public static class43 field1161;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "Lae;")
    public static class6 field1166;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "Lae;")
    public static class6 field1175;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "[I")
    public static int[] field1173;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(JB)V")
    public static final void method367(long arg0, byte arg1) {
        field1163++;
        if (arg0 == 0L) {
            return;
        }
        if (class119.field2844 >= 100) {
            class82.method635(0, class113.field2742, (byte) 88, class43.field1040);
            return;
        }
        class135 var3 = class131.method1054(false, arg0).method1088((byte) 56);
        for (int var4 = 0; var4 < class119.field2844; var4++) {
            if (class14.field340[var4] == arg0) {
                class82.method635(0, class113.field2742, (byte) 101, class107.method867(arg1 - 96, new class135[] { var3, class34.field798 }));
                return;
            }
        }
        for (int var5 = 0; var5 < class79.field1885; var5++) {
            if (class8.field148[var5] == arg0) {
                class82.method635(0, class113.field2742, (byte) 105, class107.method867(2, new class135[] { class23.field576, var3, class95.field2298 }));
                return;
            }
        }
        if (var3.method1101(class116.field2789.field3516, (byte) 89) || arg1 != 98) {
            return;
        }
        class99.field2389++;
        class14.field340[class119.field2844++] = arg0;
        class135.field3239 = true;
        class152.field3751.method929(107, arg1 ^ 0xFFFFC946);
        class152.field3751.method461(11739, arg0);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
    public static void method368(byte arg0) {
        field1170 = null;
        field1173 = null;
        field1161 = null;
        field1166 = null;
        field1153 = null;
        field1176 = null;
        field1157 = null;
        field1160 = null;
        field1171 = null;
        if (arg0 == -5) {
            field1156 = null;
            field1175 = null;
            field1165 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lba;Z)V")
    public static final void method369(class9 arg0, boolean arg1) {
        field1169++;
        if (arg1) {
            method367(96L, (byte) 32);
        }
        if (arg0.field183 == 0) {
            arg0.field213 = 1024;
        }
        arg0.field218 = 0;
        int var2 = arg0.field208 - class126.field2998;
        if (arg0.field183 == 1) {
            arg0.field213 = 1536;
        }
        int var3 = arg0.field210 * 64 + arg0.field209 * 128;
        int var4 = arg0.field210 * 64 + arg0.field189 * 128;
        if (arg0.field183 == 2) {
            arg0.field213 = 0;
        }
        arg0.field172 += (var4 - arg0.field172) / var2;
        arg0.field173 += (var3 - arg0.field173) / var2;
        if (arg0.field183 == 3) {
            arg0.field213 = 512;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIZ[BI[B)I")
    public final int method370(int arg0, int arg1, boolean arg2, byte[] arg3, int arg4, byte[] arg5) {
        field1162++;
        if (arg0 == 0) {
            return 0;
        }
        if (!arg2) {
            method368((byte) 31);
        }
        int var7 = arg0 + arg4;
        int var8 = 0;
        int var9 = arg1;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field1158[var8];
            }
            int var11;
            if ((var11 = this.field1158[var8]) < 0) {
                arg5[arg4++] = (byte) ~var11;
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1158[var8];
            }
            int var12;
            if ((var12 = this.field1158[var8]) < 0) {
                arg5[arg4++] = (byte) ~var12;
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1158[var8];
            }
            int var13;
            if ((var13 = this.field1158[var8]) < 0) {
                arg5[arg4++] = (byte) ~var13;
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1158[var8];
            }
            int var14;
            if ((var14 = this.field1158[var8]) < 0) {
                arg5[arg4++] = (byte) ~var14;
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1158[var8];
            }
            int var15;
            if ((var15 = this.field1158[var8]) < 0) {
                arg5[arg4++] = (byte) ~var15;
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1158[var8];
            }
            int var16;
            if ((var16 = this.field1158[var8]) < 0) {
                arg5[arg4++] = (byte) ~var16;
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1158[var8];
            }
            int var17;
            if ((var17 = this.field1158[var8]) < 0) {
                arg5[arg4++] = (byte) ~var17;
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1158[var8];
            }
            int var18;
            if ((var18 = this.field1158[var8]) < 0) {
                arg5[arg4++] = (byte) ~var18;
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg1;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([BI[BIII)I")
    public final int method371(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field1154++;
        int var7 = 0;
        int var8 = arg4 << 3;
        int var9 = arg1 + arg3;
        if (arg5 != -1) {
            field1176 = null;
        }
        while (arg1 < var9) {
            int var10 = arg0[arg1] & 0xFF;
            int var11 = this.field1159[var10];
            byte var12 = this.field1168[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            var8 += var12;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var7 = class44.method346(var15, var11 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg2[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg2[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var14 -= 8;
                        var13++;
                        arg2[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg2[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg1++;
        }
        return (var8 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "([B)V")
    public class49(byte[] arg0) {
        int var2 = arg0.length;
        this.field1159 = new int[var2];
        this.field1158 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        this.field1168 = arg0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field1159[var5] = var8;
                int var12;
                if ((var7 & var8) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var11 & var10) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class44.method346(var10, var11);
                    }
                    var12 = var8 | var7;
                } else {
                    var12 = var3[var6 - 1];
                }
                var3[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field1158[var14] == 0) {
                            this.field1158[var14] = var4;
                        }
                        var14 = this.field1158[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field1158.length <= var14) {
                        int[] var18 = new int[this.field1158.length * 2];
                        for (int var19 = 0; var19 < this.field1158.length; var19++) {
                            var18[var19] = this.field1158[var19];
                        }
                        this.field1158 = var18;
                    }
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field1158[var14] = ~var5;
            }
        }
    }
}

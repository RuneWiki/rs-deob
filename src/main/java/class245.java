import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class245 {

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "[I")
    private int[] field3858;

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "[B")
    private byte[] field3857;

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "[I")
    private int[] field3862;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "Z")
    public static boolean field3854 = false;

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "J")
    public static long field3855 = 0L;

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "Z")
    public static boolean field3859 = false;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "([B[BIIII)I", line = 4)
    public final int method1664(byte[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        field3863++;
        int var7 = 0;
        int var8 = arg2 + arg4;
        int var9 = arg5 << 3;
        if (arg3 != 28137) {
            this.field3857 = null;
        }
        while (var8 > arg2) {
            int var10 = arg1[arg2] & 0xFF;
            int var11 = this.field3858[var10];
            byte var12 = this.field3857[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = var13 + (var12 + var14 - 1 >> 3);
            var9 += var12;
            int var17 = var14 + 24;
            arg0[var13] = (byte) (var7 = class264.method1763(var15, var11 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg0[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg0[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg0[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg0[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg2++;
        }
        return (var9 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(II[BI)Ljava/lang/String;", line = 86)
    public static final String method1665(int arg0, int arg1, byte[] arg2, int arg3) {
        field3860++;
        char[] var4 = new char[arg3];
        if (arg1 <= 93) {
            field3855 = -46L;
        }
        int var5 = 0;
        int var6 = arg0 + arg3;
        for (int var7 = arg0; var7 < var6; var7++) {
            int var8 = arg2[var7] & 0xFF;
            if (var8 < 128) {
                var4[var5++] = (char) var8;
            } else if (var8 < 194) {
                throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var8);
            } else if (var8 >= 224) {
                if (var8 >= 240) {
                    if (var8 >= 244) {
                        throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var8);
                    }
                    throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                }
                if (var6 <= var7 + 2) {
                    throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                }
                var7++;
                int var9 = arg2[var7] & 0xFF;
                if (var9 < 128 || var9 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                }
                var7++;
                int var10 = arg2[var7] & 0xFF;
                if (var10 < 128 || var10 > 191) {
                    throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                }
                var4[var5++] = (char) class264.method1763(class264.method1763(class74.method644(var9, -129) << 6, class74.method644(var8 << 12, -921600)), class74.method644(var10, -129));
            } else if (var7 + 1 < var6) {
                var7++;
                int var11 = arg2[var7] & 0xFF;
                if (var11 < 128 || var11 > 191) {
                    throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                }
                var4[var5++] = (char) class264.method1763(class74.method644(-12352, var8 << 6), class74.method644(var11, -129));
            } else {
                throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V", line = 162)
    public static final void method1666(int arg0) {
        field3861++;
        if (arg0 == 0) {
            class338.field5042 = true;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "([BIIII[B)I", line = 180)
    public final int method1667(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field3856++;
        if (arg1 != -60402365) {
            this.method1667(null, 91, -125, 22, -70, null);
        }
        if (arg3 == 0) {
            return 0;
        }
        int var7 = arg3 + arg4;
        int var8 = 0;
        int var9 = arg2;
        while (true) {
            byte var10 = arg0[var9];
            if (var10 < 0) {
                var8 = this.field3862[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field3862[var8]) < 0) {
                arg5[arg4++] = (byte) (~var11);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field3862[var8];
            }
            int var12;
            if ((var12 = this.field3862[var8]) < 0) {
                arg5[arg4++] = (byte) (~var12);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field3862[var8];
            }
            int var13;
            if ((var13 = this.field3862[var8]) < 0) {
                arg5[arg4++] = (byte) (~var13);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field3862[var8];
            }
            int var14;
            if ((var14 = this.field3862[var8]) < 0) {
                arg5[arg4++] = (byte) (~var14);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field3862[var8];
            }
            int var15;
            if ((var15 = this.field3862[var8]) < 0) {
                arg5[arg4++] = (byte) (~var15);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field3862[var8];
            }
            int var16;
            if ((var16 = this.field3862[var8]) < 0) {
                arg5[arg4++] = (byte) (~var16);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field3862[var8];
            }
            int var17;
            if ((var17 = this.field3862[var8]) < 0) {
                arg5[arg4++] = (byte) (~var17);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field3862[var8];
            }
            int var18;
            if ((var18 = this.field3862[var8]) < 0) {
                arg5[arg4++] = (byte) (~var18);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg2;
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "([B)V", line = 330)
    public class245(byte[] arg0) {
        int var2 = arg0.length;
        this.field3858 = new int[var2];
        this.field3857 = arg0;
        int[] var3 = new int[33];
        this.field3862 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field3858[var5] = var8;
                int var12;
                if ((var8 & var7) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var10 & var11) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class264.method1763(var10, var11);
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
                        if (this.field3862[var14] == 0) {
                            this.field3862[var14] = var4;
                        }
                        var14 = this.field3862[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field3862.length <= var14) {
                        int[] var18 = new int[this.field3862.length * 2];
                        for (int var19 = 0; var19 < this.field3862.length; var19++) {
                            var18[var19] = this.field3862[var19];
                        }
                        this.field3862 = var18;
                    }
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field3862[var14] = ~var5;
            }
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class29 {

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "[I")
    private int[] field689;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "[B")
    private byte[] field681;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "[I")
    private int[] field686;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "Z")
    public static boolean field685 = true;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field682 = 0;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "[B")
    public static byte[] field680 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
    public static int field693 = 1;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "Lud;")
    public static class279 field691 = class130.method1024(" <col=00ff80>", 255);

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "Lud;")
    public static class279 field690 = class130.method1024("", 255);

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IBII[B[B)I", line = 11)
    public final int method263(int arg0, byte arg1, int arg2, int arg3, byte[] arg4, byte[] arg5) {
        int var7 = arg0 + arg2;
        if (arg1 != -47) {
            this.field681 = (byte[]) null;
        }
        int var8 = 0;
        field696++;
        int var9 = arg3 << 3;
        while (arg2 < var7) {
            int var10 = arg5[arg2] & 0xFF;
            int var11 = this.field686[var10];
            byte var12 = this.field681[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            var9 += var12;
            int var15 = var8 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var8 = class301.method2139(var15, var11 >>> var17));
            if (var16 > var13) {
                var13++;
                var14 = var17 - 8;
                arg4[var13] = (byte) (var8 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg4[var13] = (byte) (var8 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg4[var13] = (byte) (var8 = var11 >>> var14);
                        if (var16 > var13) {
                            var14 -= 8;
                            var13++;
                            arg4[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg2++;
        }
        return (var9 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)I", line = 108)
    public static final int method264(int arg0) {
        field692++;
        return class180.field3259 == arg0 ? 0 : class134.field2444[class180.field3259].method72();
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IB)I", line = 125)
    public static final int method265(int arg0, byte arg1) {
        if (arg1 != 51) {
            field691 = (class279) null;
        }
        field683++;
        return (arg0 & 0x3FCF8) >> 11;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "([B)V", line = 142)
    public class29(byte[] arg0) {
        int var2 = arg0.length;
        this.field689 = new int[8];
        this.field681 = arg0;
        this.field686 = new int[var2];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field686[var5] = var8;
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
                        var3[var10] = class301.method2139(var11, var12);
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
                        if (this.field689[var14] == 0) {
                            this.field689[var14] = var4;
                        }
                        var14 = this.field689[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field689.length) {
                        int[] var18 = new int[this.field689.length * 2];
                        for (int var19 = 0; var19 < this.field689.length; var19++) {
                            var18[var19] = this.field689[var19];
                        }
                        this.field689 = var18;
                    }
                }
                this.field689[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V", line = 269)
    public static final void method266(int arg0) {
        int var1 = -85 / ((arg0 + 61) / 54);
        class312.field5521 = true;
        field688++;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lgf;IBII)V", line = 282)
    public static final void method267(class8 arg0, int arg1, byte arg2, int arg3, int arg4) {
        field694++;
        if (arg2 > -58) {
            field690 = (class279) null;
        }
        if (class97.field1824) {
            class256.method1830(arg3, arg4, arg0.field220 + arg3, arg0.field297 + arg4);
        }
        if (client.field4470 >= 3) {
            if (class97.field1824) {
                class70 var5 = arg0.method61(-10823, false);
                if (var5 != null) {
                    var5.method584(arg3, arg4);
                }
            } else {
                class146.method1123(arg3, arg4, 0, arg0.field251, arg0.field200);
            }
        } else if (class97.field1824) {
            ((class203) class153.field2781).method1502(arg3, arg4, arg0.field220, arg0.field297, class153.field2781.field1377 / 2, class153.field2781.field1375 / 2, class126.field2349, 256, (class203) arg0.method61(-10823, false));
        } else {
            ((class66) class153.field2781).method570(arg3, arg4, arg0.field220, arg0.field297, class153.field2781.field1377 / 2, class153.field2781.field1375 / 2, class126.field2349, 256, arg0.field251, arg0.field200);
        }
        class249.field4446[arg1] = true;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III[BI[B)I", line = 332)
    public final int method268(int arg0, int arg1, int arg2, byte[] arg3, int arg4, byte[] arg5) {
        field695++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = arg0 + arg2;
        if (arg1 < 5) {
            return -6;
        }
        int var8 = 0;
        int var9 = arg4;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field689[var8];
            }
            int var11;
            if ((var11 = this.field689[var8]) < 0) {
                arg3[arg2++] = (byte) (~var11);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field689[var8];
            }
            int var12;
            if ((var12 = this.field689[var8]) < 0) {
                arg3[arg2++] = (byte) (~var12);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field689[var8];
            }
            int var13;
            if ((var13 = this.field689[var8]) < 0) {
                arg3[arg2++] = (byte) (~var13);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field689[var8];
            }
            int var14;
            if ((var14 = this.field689[var8]) < 0) {
                arg3[arg2++] = (byte) (~var14);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field689[var8];
            }
            int var15;
            if ((var15 = this.field689[var8]) < 0) {
                arg3[arg2++] = (byte) (~var15);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field689[var8];
            }
            int var16;
            if ((var16 = this.field689[var8]) < 0) {
                arg3[arg2++] = (byte) (~var16);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field689[var8];
            }
            int var17;
            if ((var17 = this.field689[var8]) < 0) {
                arg3[arg2++] = (byte) (~var17);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field689[var8];
            }
            int var18;
            if ((var18 = this.field689[var8]) < 0) {
                arg3[arg2++] = (byte) (~var18);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg4;
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V", line = 479)
    public static void method269(int arg0) {
        field690 = null;
        if (arg0 < -71) {
            field680 = null;
            field691 = null;
        }
    }
}

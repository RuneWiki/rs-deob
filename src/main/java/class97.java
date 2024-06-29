import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class97 {

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "[I")
    private int[] field1377;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "[B")
    private byte[] field1373;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "[I")
    private int[] field1370;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "[I")
    public static int[] field1369 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "[I")
    public static int[] field1371 = new int[5];

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIIBI)V", line = 4)
    public static final void method765(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        if (class355.field5452 <= arg4 && class348.field5378 >= arg7 && class326.field4901 <= arg2 && class261.field3911 >= arg1) {
            class258.method1901(arg0, arg4, arg7, arg2, arg5, arg3, arg1, (byte) 3);
        } else {
            class335.method2360(arg3, arg5, arg0, (byte) -48, arg7, arg4, arg2, arg1);
        }
        if (arg6 >= -1) {
            field1371 = (int[]) null;
        }
        field1375++;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V", line = 21)
    public static final void method766(boolean arg0) {
        if (!arg0) {
            method769(-91);
        }
        field1372++;
        class135.field1968 = new class196(32);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([BIII[BI)I", line = 43)
    public final int method767(byte[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field1376++;
        int var7 = arg1 + arg5;
        int var8 = arg3 << 3;
        int var9 = arg2;
        while (arg1 < var7) {
            int var10 = arg0[arg1] & 0xFF;
            int var11 = this.field1370[var10];
            byte var12 = this.field1373[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var9 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var9 = class81.method666(var15, var11 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg4[var13] = (byte) (var9 = var11 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg4[var13] = (byte) (var9 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg4[var13] = (byte) (var9 = var11 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg4[var13] = (byte) (var9 = var11 << -var14);
                        }
                    }
                }
            }
            var8 += var12;
            arg1++;
        }
        return (var8 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIILqf;)V", line = 113)
    public static final void method768(int arg0, int arg1, int arg2, class359 arg3) {
        field1374++;
        if (class264.field4043 < 2 && class239.field3562 == 0 && !class273.field4150) {
            return;
        }
        if (arg1 != -21783) {
            method766(false);
        }
        String var4 = class15.method86(arg1 + 21784);
        if (arg3 == null) {
            int var5 = class126.field1846.method199(var4, arg0 + 4, arg2 - -15, 16777215, 0, class321.field4819, class321.field4836);
            class230.method1716(arg2, arg0 + 4, var5 + class126.field1846.method203(var4), 2, 15);
            return;
        }
        class29 var6 = arg3.method2492(class239.field3563, false);
        if (var6 == null) {
            var6 = class126.field1846;
        }
        var6.method191(var4, arg0, arg2, arg3.field5506, arg3.field5560, arg3.field5646, arg3.field5576, arg3.field5655, arg3.field5657, class321.field4819, class321.field4836, class86.field1216);
        class230.method1716(class86.field1216[1], class86.field1216[0], class86.field1216[2], arg1 ^ 0xFFFFAAEB, class86.field1216[3]);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V", line = 153)
    public static void method769(int arg0) {
        field1371 = null;
        int var1 = -48 / ((arg0 + 25) / 53);
        field1369 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I[BII[BI)I", line = 163)
    public final int method770(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field1378++;
        if (arg5 == 0) {
            return 0;
        }
        int var7 = arg2 + arg5;
        int var8 = arg3;
        int var9 = arg0;
        while (true) {
            byte var10 = arg4[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field1377[var8];
            }
            int var11;
            if ((var11 = this.field1377[var8]) < 0) {
                arg1[arg2++] = (byte) (~var11);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1377[var8];
            }
            int var12;
            if ((var12 = this.field1377[var8]) < 0) {
                arg1[arg2++] = (byte) (~var12);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1377[var8];
            }
            int var13;
            if ((var13 = this.field1377[var8]) < 0) {
                arg1[arg2++] = (byte) (~var13);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1377[var8];
            }
            int var14;
            if ((var14 = this.field1377[var8]) < 0) {
                arg1[arg2++] = (byte) (~var14);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1377[var8];
            }
            int var15;
            if ((var15 = this.field1377[var8]) < 0) {
                arg1[arg2++] = (byte) (~var15);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1377[var8];
            }
            int var16;
            if ((var16 = this.field1377[var8]) < 0) {
                arg1[arg2++] = (byte) (~var16);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1377[var8];
            }
            int var17;
            if ((var17 = this.field1377[var8]) < 0) {
                arg1[arg2++] = (byte) (~var17);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1377[var8];
            }
            int var18;
            if ((var18 = this.field1377[var8]) < 0) {
                arg1[arg2++] = (byte) (~var18);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg0;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "([B)V", line = 308)
    public class97(byte[] arg0) {
        int var2 = arg0.length;
        this.field1377 = new int[8];
        this.field1373 = arg0;
        this.field1370 = new int[var2];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field1370[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
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
                        var3[var10] = class81.method666(var12, var11);
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
                        if (this.field1377[var14] == 0) {
                            this.field1377[var14] = var4;
                        }
                        var14 = this.field1377[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field1377.length <= var14) {
                        int[] var18 = new int[this.field1377.length * 2];
                        for (int var19 = 0; var19 < this.field1377.length; var19++) {
                            var18[var19] = this.field1377[var19];
                        }
                        this.field1377 = var18;
                    }
                }
                this.field1377[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}

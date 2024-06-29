import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class60 {

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "[I")
    private int[] field853;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "[B")
    private byte[] field857;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "[I")
    private int[] field856;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "Lph;")
    public static class229 field852 = class266.method1858("; Expires=", 0);

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "Lph;")
    public static class229 field861 = class266.method1858("Chargement des fichiers config )2 ", 0);

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "Lsi;")
    public static class66 field854;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V", line = 9)
    public static final void method401(int arg0) {
        class166.field2704.method1414(arg0 - 24861);
        class195.field3251.method1414(125);
        field860++;
        if (arg0 != 24984) {
            field854 = (class66) null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([BB[BIII)I", line = 27)
    public final int method402(byte[] arg0, byte arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        int var7 = 43 % ((arg1 + 31) / 56);
        field851++;
        int var8 = arg3 + arg5;
        int var9 = 0;
        int var10 = arg4 << 3;
        while (var8 > arg5) {
            int var11 = arg0[arg5] & 0xFF;
            int var12 = this.field856[var11];
            byte var13 = this.field857[var11];
            if (var13 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var10 & 0x7;
            int var15 = var10 >> 3;
            int var16 = (var14 + var13 - 1 >> 3) + var15;
            var10 += var13;
            int var17 = var9 & -var14 >> 31;
            int var18 = var14 + 24;
            arg2[var15] = (byte) (var9 = class201.method1410(var17, var12 >>> var18));
            if (var15 < var16) {
                var15++;
                var14 = var18 - 8;
                arg2[var15] = (byte) (var9 = var12 >>> var14);
                if (var16 > var15) {
                    var14 -= 8;
                    var15++;
                    arg2[var15] = (byte) (var9 = var12 >>> var14);
                    if (var15 < var16) {
                        var14 -= 8;
                        var15++;
                        arg2[var15] = (byte) (var9 = var12 >>> var14);
                        if (var16 > var15) {
                            var15++;
                            var14 -= 8;
                            arg2[var15] = (byte) (var9 = var12 << -var14);
                        }
                    }
                }
            }
            arg5++;
        }
        return (var10 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I[B[BIII)I", line = 99)
    public final int method403(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field859++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg3 + arg4;
        int var9 = -98 / ((arg0 - 4) / 46);
        int var10 = arg5;
        while (true) {
            byte var11 = arg2[var10];
            if (var11 < 0) {
                var7 = this.field853[var7];
            } else {
                var7++;
            }
            int var12;
            if ((var12 = this.field853[var7]) < 0) {
                arg1[arg4++] = (byte) (~var12);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var11 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field853[var7];
            }
            int var13;
            if ((var13 = this.field853[var7]) < 0) {
                arg1[arg4++] = (byte) (~var13);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var11 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field853[var7];
            }
            int var14;
            if ((var14 = this.field853[var7]) < 0) {
                arg1[arg4++] = (byte) (~var14);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var11 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field853[var7];
            }
            int var15;
            if ((var15 = this.field853[var7]) < 0) {
                arg1[arg4++] = (byte) (~var15);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var11 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field853[var7];
            }
            int var16;
            if ((var16 = this.field853[var7]) < 0) {
                arg1[arg4++] = (byte) (~var16);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var11 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field853[var7];
            }
            int var17;
            if ((var17 = this.field853[var7]) < 0) {
                arg1[arg4++] = (byte) (~var17);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var11 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field853[var7];
            }
            int var18;
            if ((var18 = this.field853[var7]) < 0) {
                arg1[arg4++] = (byte) (~var18);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var11 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field853[var7];
            }
            int var19;
            if ((var19 = this.field853[var7]) < 0) {
                arg1[arg4++] = (byte) (~var19);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var10++;
        }
        return var10 + 1 - arg5;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)Lue;", line = 245)
    public static final class235 method404(int arg0, int arg1, int arg2) {
        field863++;
        for (class235 var3 = (class235) class142.field2309.method1580((byte) -39); var3 != null; var3 = (class235) class142.field2309.method1579((byte) 28)) {
            if (var3.field3876 && var3.method1664((byte) -50, arg1, arg2)) {
                return var3;
            }
        }
        if (arg0 <= 34) {
            method404(-128, 4, -102);
        }
        return null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)V", line = 269)
    public static final void method405(int arg0, int arg1) {
        field864++;
        if (!class69.method542(arg0, -1)) {
            return;
        }
        if (arg1 <= 88) {
            method407((byte) 89, -117, -120);
        }
        class301[] var2 = class37.field604[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class301 var4 = var2[var3];
            if (var4 != null) {
                var4.field4950 = 0;
                var4.field5000 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZJ)V", line = 306)
    public static final void method406(boolean arg0, long arg1) {
        if (arg0) {
            method406(false, 101L);
        }
        field855++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class216.field3555; var3++) {
            if (class282.field4682[var3] == arg1) {
                class94.field1594++;
                class216.field3555--;
                for (int var4 = var3; var4 < class216.field3555; var4++) {
                    class282.field4682[var4] = class282.field4682[var4 + 1];
                    class108.field1820[var4] = class108.field1820[var4 + 1];
                }
                class198.field3295 = class129.field2125;
                class121.field2033.method37(33, 167);
                class121.field2033.method1208((byte) -6, arg1);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BII)I", line = 351)
    public static final int method407(byte arg0, int arg1, int arg2) {
        field862++;
        if (arg2 == -2) {
            return 12345678;
        }
        if (arg0 <= 53) {
            method406(false, 31L);
        }
        if (arg2 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V", line = 388)
    public static void method408(int arg0) {
        field861 = null;
        field852 = null;
        field854 = null;
        int var1 = 76 % ((arg0 + 25) / 61);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIFIIZ)[[I", line = 401)
    public static final int[][] method409(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, int arg6, int arg7, boolean arg8) {
        class262 var9 = new class262();
        var9.field4377 = (int) (arg5 * 4096.0F);
        if (arg1 < 70) {
            field852 = (class229) null;
        }
        var9.field4378 = arg2;
        var9.field4371 = arg7;
        var9.field4389 = arg8;
        var9.field4381 = arg3;
        var9.method65(117);
        int[][] var10 = new int[arg0][arg6];
        class176.method1268(arg0, false, arg6);
        for (int var11 = 0; var11 < arg0; var11++) {
            var9.method1826((byte) -119, var10[var11], var11);
        }
        field858++;
        return var10;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "([B)V", line = 435)
    public class60(byte[] arg0) {
        int var2 = arg0.length;
        this.field853 = new int[8];
        this.field857 = arg0;
        this.field856 = new int[var2];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field856[var5] = var8;
                int var12;
                if ((var7 & var8) == 0) {
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
                        var3[var9] = class201.method1410(var11, var10);
                    }
                    var12 = var7 | var8;
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
                        if (this.field853[var14] == 0) {
                            this.field853[var14] = var4;
                        }
                        var14 = this.field853[var14];
                    }
                    if (this.field853.length <= var14) {
                        int[] var17 = new int[this.field853.length * 2];
                        for (int var18 = 0; var18 < this.field853.length; var18++) {
                            var17[var18] = this.field853[var18];
                        }
                        this.field853 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field853[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}

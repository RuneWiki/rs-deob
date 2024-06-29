import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class48 {

    @OriginalMember(owner = "client!tba", name = "k", descriptor = "[B")
    private byte[] field764;

    @OriginalMember(owner = "client!tba", name = "e", descriptor = "[I")
    private int[] field758;

    @OriginalMember(owner = "client!tba", name = "h", descriptor = "[I")
    private int[] field761;

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "Liba;")
    public static class211 field755 = new class211(73, 0);

    @OriginalMember(owner = "client!tba", name = "j", descriptor = "Lnfa;")
    public static class661 field763 = new class661(16);

    @OriginalMember(owner = "client!tba", name = "n", descriptor = "Liba;")
    public static class211 field767 = new class211(42, 7);

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!tba", name = "f", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!tba", name = "i", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!tba", name = "l", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "Lmv;")
    public static class295 field757;

    @OriginalMember(owner = "client!tba", name = "m", descriptor = "Lmca;")
    public static class34 field766;

    @OriginalMember(owner = "client!tba", name = "g", descriptor = "[I")
    public static int[] field760;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(IIII[B[B)I", line = 10)
    public final int method286(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte[] arg5) {
        field759++;
        int var7 = 0;
        int var8 = arg1 + arg3;
        int var9 = arg0 << 3;
        if (arg2 != 1627352001) {
            method287(null, 44);
        }
        while (var8 > arg1) {
            int var10 = arg5[arg1] & 0xFF;
            int var11 = this.field758[var10];
            byte var12 = this.field764[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var7 = class151.method1076(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg4[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
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
            var9 += var12;
            arg1++;
        }
        return (var9 + 7 >> 3) - arg0;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 86)
    public static final void method287(String arg0, int arg1) {
        field754++;
        if (arg1 < 45) {
            method290(37, 68, 125);
        }
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class247.method1506(arg0, false);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class356.field5266; var3++) {
            String var4 = class205.field2796[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class247.method1506(var4, false);
            if (var5 != null && var5.equals(var2)) {
                class356.field5266--;
                for (int var6 = var3; var6 < class356.field5266; var6++) {
                    class205.field2796[var6] = class205.field2796[var6 + 1];
                    class645.field9294[var6] = class645.field9294[var6 + 1];
                    class484.field6902[var6] = class484.field6902[var6 + 1];
                    class273.field3566[var6] = class273.field3566[var6 + 1];
                    class571.field8299[var6] = class571.field8299[var6 + 1];
                    class238.field3133[var6] = class238.field3133[var6 + 1];
                }
                class247.field3259++;
                class516.field7245 = class351.field5215;
                class654 var7 = class631.method3628(class426.field6220, (byte) -51, class357.field5280);
                var7.field9358.method3110(class420.method2543(1, arg0), 67);
                var7.field9358.method3132(arg0, 3);
                class444.method2623(121, var7);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "([BI[BIIB)I", line = 154)
    public final int method288(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, byte arg5) {
        field756++;
        if (arg1 == 0) {
            return 0;
        }
        int var7 = 21 / ((-arg5 - 40) / 63);
        int var8 = arg1 + arg3;
        int var9 = 0;
        int var10 = arg4;
        while (true) {
            byte var11 = arg0[var10];
            if (var11 >= 0) {
                var9++;
            } else {
                var9 = this.field761[var9];
            }
            int var12;
            if ((var12 = this.field761[var9]) < 0) {
                arg2[arg3++] = (byte) (~var12);
                if (var8 <= arg3) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x40) == 0) {
                var9++;
            } else {
                var9 = this.field761[var9];
            }
            int var13;
            if ((var13 = this.field761[var9]) < 0) {
                arg2[arg3++] = (byte) (~var13);
                if (var8 <= arg3) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x20) == 0) {
                var9++;
            } else {
                var9 = this.field761[var9];
            }
            int var14;
            if ((var14 = this.field761[var9]) < 0) {
                arg2[arg3++] = (byte) (~var14);
                if (arg3 >= var8) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x10) == 0) {
                var9++;
            } else {
                var9 = this.field761[var9];
            }
            int var15;
            if ((var15 = this.field761[var9]) < 0) {
                arg2[arg3++] = (byte) (~var15);
                if (var8 <= arg3) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x8) == 0) {
                var9++;
            } else {
                var9 = this.field761[var9];
            }
            int var16;
            if ((var16 = this.field761[var9]) < 0) {
                arg2[arg3++] = (byte) (~var16);
                if (arg3 >= var8) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x4) == 0) {
                var9++;
            } else {
                var9 = this.field761[var9];
            }
            int var17;
            if ((var17 = this.field761[var9]) < 0) {
                arg2[arg3++] = (byte) (~var17);
                if (arg3 >= var8) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x2) == 0) {
                var9++;
            } else {
                var9 = this.field761[var9];
            }
            int var18;
            if ((var18 = this.field761[var9]) < 0) {
                arg2[arg3++] = (byte) (~var18);
                if (arg3 >= var8) {
                    break;
                }
                var9 = 0;
            }
            if ((var11 & 0x1) == 0) {
                var9++;
            } else {
                var9 = this.field761[var9];
            }
            int var19;
            if ((var19 = this.field761[var9]) < 0) {
                arg2[arg3++] = (byte) (~var19);
                if (arg3 >= var8) {
                    break;
                }
                var9 = 0;
            }
            var10++;
        }
        return var10 + 1 - arg4;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V", line = 297)
    public static void method289(int arg0) {
        int var1 = -10 / ((42 - arg0) / 36);
        field766 = null;
        field763 = null;
        field755 = null;
        field767 = null;
        field760 = null;
        field757 = null;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(III)Z", line = 321)
    public static final boolean method290(int arg0, int arg1, int arg2) {
        if (arg1 != 11615) {
            method289(-3);
        }
        field762++;
        return (arg2 & 0x220) == 544 | (arg2 & 0x18) != 0;
    }

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "([B)V", line = 333)
    public class48(byte[] arg0) {
        int var2 = arg0.length;
        this.field764 = arg0;
        this.field758 = new int[var2];
        this.field761 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field758[var5] = var8;
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
                        var3[var10] = class151.method1076(var11, var12);
                    }
                    var9 = var8 | var7;
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
                        if (this.field761[var14] == 0) {
                            this.field761[var14] = var4;
                        }
                        var14 = this.field761[var14];
                    }
                    if (var14 >= this.field761.length) {
                        int[] var17 = new int[this.field761.length * 2];
                        for (int var18 = 0; var18 < this.field761.length; var18++) {
                            var17[var18] = this.field761[var18];
                        }
                        this.field761 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field761[var14] = ~var5;
            }
        }
    }
}

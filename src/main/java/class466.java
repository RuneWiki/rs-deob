import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class466 {

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "[I")
    private int[] field6609;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "[B")
    private byte[] field6620;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "[I")
    private int[] field6621;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field6613 = 0;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "Z")
    public static boolean field6619 = false;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "Lvt;")
    public static class344 field6614 = new class344("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "Lim;")
    public static class353 field6622 = new class353(0, 6);

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "F")
    public static float field6610;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field6611;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field6616;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field6618;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "Llh;")
    public static class125 field6612;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "Lhb;")
    public static class318 field6615;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[BII[BI)I")
    public final int method2678(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field6618++;
        if (arg0 == arg3) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg3 + arg5;
        int var9 = arg2;
        while (true) {
            byte var10 = arg1[var9];
            if (var10 < 0) {
                var7 = this.field6621[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field6621[var7]) < 0) {
                arg4[arg5++] = (byte) (~var11);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field6621[var7];
            }
            int var12;
            if ((var12 = this.field6621[var7]) < 0) {
                arg4[arg5++] = (byte) (~var12);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field6621[var7];
            }
            int var13;
            if ((var13 = this.field6621[var7]) < 0) {
                arg4[arg5++] = (byte) (~var13);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field6621[var7];
            }
            int var14;
            if ((var14 = this.field6621[var7]) < 0) {
                arg4[arg5++] = (byte) (~var14);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field6621[var7];
            }
            int var15;
            if ((var15 = this.field6621[var7]) < 0) {
                arg4[arg5++] = (byte) (~var15);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field6621[var7];
            }
            int var16;
            if ((var16 = this.field6621[var7]) < 0) {
                arg4[arg5++] = (byte) (~var16);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field6621[var7];
            }
            int var17;
            if ((var17 = this.field6621[var7]) < 0) {
                arg4[arg5++] = (byte) (~var17);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field6621[var7];
            }
            int var18;
            if ((var18 = this.field6621[var7]) < 0) {
                arg4[arg5++] = (byte) (~var18);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 - (arg2 - 1);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIZI)V")
    public static final void method2679(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg3) {
            field6614 = null;
        }
        for (int var5 = 0; var5 < class161.field2051; var5++) {
            Rectangle var6 = class331.field4576[var5];
            if ((var6.x + var6.width) > arg1 && var6.x < (arg1 + arg2) && arg4 < var6.y + var6.height && (arg4 + arg0) > var6.y) {
                class584.field8455[var5] = true;
            }
        }
        field6611++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([BI[BIII)I")
    public final int method2680(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field6616++;
        int var7 = 0;
        if (arg1 != 7) {
            this.field6609 = null;
        }
        int var8 = arg4 << 3;
        int var9 = arg3 + arg5;
        while (var9 > arg3) {
            int var10 = arg0[arg3] & 0xFF;
            int var11 = this.field6609[var10];
            byte var12 = this.field6620[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var7 = class292.method1790(var15, var11 >>> var17));
            if (var16 > var13) {
                var13++;
                var14 = var17 - 8;
                arg2[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg2[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var13++;
                        var14 -= 8;
                        arg2[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg2[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var8 += var12;
            arg3++;
        }
        return (var8 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static void method2681(int arg0) {
        field6615 = null;
        if (arg0 <= 110) {
            method2681(99);
        }
        field6614 = null;
        field6622 = null;
        field6612 = null;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "([B)V")
    public class466(byte[] arg0) {
        int var2 = arg0.length;
        this.field6609 = new int[var2];
        this.field6620 = arg0;
        int[] var3 = new int[33];
        this.field6621 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field6609[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
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
                        var3[var10] = class292.method1790(var12, var11);
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
                        if (this.field6621[var14] == 0) {
                            this.field6621[var14] = var4;
                        }
                        var14 = this.field6621[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field6621.length) {
                        int[] var18 = new int[this.field6621.length * 2];
                        for (int var19 = 0; var19 < this.field6621.length; var19++) {
                            var18[var19] = this.field6621[var19];
                        }
                        this.field6621 = var18;
                    }
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field6621[var14] = ~var5;
            }
        }
    }
}

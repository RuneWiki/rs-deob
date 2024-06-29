import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ILFXQDER")
public class class23 {

    @OriginalMember(owner = "client!ILFXQDER", name = "a", descriptor = "Z")
    private boolean field846 = false;

    @OriginalMember(owner = "client!ILFXQDER", name = "b", descriptor = "I")
    private int field847 = 290;

    @OriginalMember(owner = "client!ILFXQDER", name = "l", descriptor = "[I")
    private int[] field857 = new int[5];

    @OriginalMember(owner = "client!ILFXQDER", name = "m", descriptor = "[I")
    private int[] field858 = new int[5];

    @OriginalMember(owner = "client!ILFXQDER", name = "n", descriptor = "[I")
    private int[] field859 = new int[5];

    @OriginalMember(owner = "client!ILFXQDER", name = "p", descriptor = "I")
    private int field861 = 100;

    @OriginalMember(owner = "client!ILFXQDER", name = "s", descriptor = "I")
    public int field864 = 500;

    @OriginalMember(owner = "client!ILFXQDER", name = "c", descriptor = "B")
    private static byte field848 = 2;

    @OriginalMember(owner = "client!ILFXQDER", name = "x", descriptor = "[I")
    private static int[] field869 = new int[5];

    @OriginalMember(owner = "client!ILFXQDER", name = "y", descriptor = "[I")
    private static int[] field870 = new int[5];

    @OriginalMember(owner = "client!ILFXQDER", name = "z", descriptor = "[I")
    private static int[] field871 = new int[5];

    @OriginalMember(owner = "client!ILFXQDER", name = "A", descriptor = "[I")
    private static int[] field872 = new int[5];

    @OriginalMember(owner = "client!ILFXQDER", name = "B", descriptor = "[I")
    private static int[] field873 = new int[5];

    @OriginalMember(owner = "client!ILFXQDER", name = "o", descriptor = "I")
    private int field860;

    @OriginalMember(owner = "client!ILFXQDER", name = "t", descriptor = "I")
    public int field865;

    @OriginalMember(owner = "client!ILFXQDER", name = "d", descriptor = "LUHTSXKVU;")
    private class56 field849;

    @OriginalMember(owner = "client!ILFXQDER", name = "e", descriptor = "LUHTSXKVU;")
    private class56 field850;

    @OriginalMember(owner = "client!ILFXQDER", name = "f", descriptor = "LUHTSXKVU;")
    private class56 field851;

    @OriginalMember(owner = "client!ILFXQDER", name = "g", descriptor = "LUHTSXKVU;")
    private class56 field852;

    @OriginalMember(owner = "client!ILFXQDER", name = "h", descriptor = "LUHTSXKVU;")
    private class56 field853;

    @OriginalMember(owner = "client!ILFXQDER", name = "i", descriptor = "LUHTSXKVU;")
    private class56 field854;

    @OriginalMember(owner = "client!ILFXQDER", name = "j", descriptor = "LUHTSXKVU;")
    private class56 field855;

    @OriginalMember(owner = "client!ILFXQDER", name = "k", descriptor = "LUHTSXKVU;")
    private class56 field856;

    @OriginalMember(owner = "client!ILFXQDER", name = "r", descriptor = "LUHTSXKVU;")
    private class56 field863;

    @OriginalMember(owner = "client!ILFXQDER", name = "q", descriptor = "LXSKZRAYI;")
    private class64 field862;

    @OriginalMember(owner = "client!ILFXQDER", name = "u", descriptor = "[I")
    private static int[] field866;

    @OriginalMember(owner = "client!ILFXQDER", name = "v", descriptor = "[I")
    private static int[] field867;

    @OriginalMember(owner = "client!ILFXQDER", name = "w", descriptor = "[I")
    private static int[] field868;

    @OriginalMember(owner = "client!ILFXQDER", name = "a", descriptor = "()V")
    public static final void method224() {
        field867 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field867[var0] = 1;
            } else {
                field867[var0] = -1;
            }
        }
        field868 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field868[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field866 = new int[220500];
    }

    @OriginalMember(owner = "client!ILFXQDER", name = "a", descriptor = "(II)[I")
    public final int[] method225(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field866[var3] = 0;
        }
        if (arg1 < 10) {
            return field866;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field849.method447(-33980);
        this.field850.method447(-33980);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field851 != null) {
            this.field851.method447(-33980);
            this.field852.method447(-33980);
            var6 = (int) ((double) (this.field851.field1339 - this.field851.field1338) * 32.768D / var4);
            var7 = (int) ((double) this.field851.field1338 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field853 != null) {
            this.field853.method447(-33980);
            this.field854.method447(-33980);
            var9 = (int) ((double) (this.field853.field1339 - this.field853.field1338) * 32.768D / var4);
            var10 = (int) ((double) this.field853.field1338 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field857[var12] != 0) {
                field869[var12] = 0;
                field870[var12] = (int) ((double) this.field859[var12] * var4);
                field871[var12] = (this.field857[var12] << 14) / 100;
                field872[var12] = (int) ((double) (this.field849.field1339 - this.field849.field1338) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field858[var12]) / var4);
                field873[var12] = (int) ((double) this.field849.field1338 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field849.method448(0, arg0);
            int var42 = this.field850.method448(0, arg0);
            if (this.field851 != null) {
                int var43 = this.field851.method448(0, arg0);
                int var44 = this.field852.method448(0, arg0);
                var41 += this.method226(var44, var8, this.field851.field1340, (byte) -28) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field853 != null) {
                int var45 = this.field853.method448(0, arg0);
                int var46 = this.field854.method448(0, arg0);
                var42 = var42 * ((this.method226(var46, var11, this.field853.field1340, (byte) -28) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field857[var47] != 0) {
                    int var48 = field870[var47] + var13;
                    if (var48 < arg0) {
                        field866[var48] += this.method226(field871[var47] * var42 >> 15, field869[var47], this.field849.field1340, (byte) -28);
                        field869[var47] += (field872[var47] * var41 >> 16) + field873[var47];
                    }
                }
            }
        }
        if (this.field855 != null) {
            this.field855.method447(-33980);
            this.field856.method447(-33980);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field855.method448(0, arg0);
                int var19 = this.field856.method448(0, arg0);
                int var20;
                if (var16) {
                    var20 = ((this.field855.field1339 - this.field855.field1338) * var18 >> 8) + this.field855.field1338;
                } else {
                    var20 = ((this.field855.field1339 - this.field855.field1338) * var19 >> 8) + this.field855.field1338;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field866[var17] = 0;
                }
            }
        }
        if (this.field860 > 0 && this.field861 > 0) {
            int var21 = (int) ((double) this.field860 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field866[var22] += field866[var22 - var21] * this.field861 / 100;
            }
        }
        if (this.field862.field1576[0] > 0 || this.field862.field1576[1] > 0) {
            this.field863.method447(-33980);
            int var23 = this.field863.method448(0, arg0 + 1);
            int var24 = this.field862.method534(field848, 0, (float) var23 / 65536.0F);
            int var25 = this.field862.method534(field848, 1, (float) var23 / 65536.0F);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field866[var24 + var26] * (long) class64.field1583 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field866[var24 + var26 - var38 - 1] * (long) class64.field1581[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field866[var26 - var39 - 1] * (long) class64.field1581[1][var39] >> 16);
                    }
                    field866[var26] = var37;
                    var23 = this.field863.method448(0, arg0 + 1);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field866[var24 + var26] * (long) class64.field1583 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field866[var24 + var26 - var35 - 1] * (long) class64.field1581[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field866[var26 - var36 - 1] * (long) class64.field1581[1][var36] >> 16);
                        }
                        field866[var26] = var34;
                        var23 = this.field863.method448(0, arg0 + 1);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field866[var24 + var26 - var31 - 1] * (long) class64.field1581[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field866[var26 - var32 - 1] * (long) class64.field1581[1][var32] >> 16);
                            }
                            field866[var26] = var30;
                            this.field863.method448(0, arg0 + 1);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field862.method534(field848, 0, (float) var23 / 65536.0F);
                    var25 = this.field862.method534(field848, 1, (float) var23 / 65536.0F);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field866[var40] < -32768) {
                field866[var40] = -32768;
            }
            if (field866[var40] > 32767) {
                field866[var40] = 32767;
            }
        }
        return field866;
    }

    @OriginalMember(owner = "client!ILFXQDER", name = "a", descriptor = "(IIIB)I")
    private final int method226(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -28) {
            this.field846 = !this.field846;
        }
        if (arg2 == 1) {
            return (arg1 & 0x7FFF) < 16384 ? arg0 : -arg0;
        } else if (arg2 == 2) {
            return field868[arg1 & 0x7FFF] * arg0 >> 14;
        } else if (arg2 == 3) {
            return ((arg1 & 0x7FFF) * arg0 >> 14) - arg0;
        } else if (arg2 == 4) {
            return field867[arg1 / 2607 & 0x7FFF] * arg0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ILFXQDER", name = "a", descriptor = "(LRSWRPCHR;B)V")
    public final void method227(class50 arg0, byte arg1) {
        this.field849 = new class56();
        this.field849.method445(arg0, (byte) 46);
        this.field850 = new class56();
        this.field850.method445(arg0, (byte) 46);
        int var3 = arg0.method388();
        if (var3 != 0) {
            arg0.field1225--;
            this.field851 = new class56();
            this.field851.method445(arg0, (byte) 46);
            this.field852 = new class56();
            this.field852.method445(arg0, (byte) 46);
        }
        int var4 = arg0.method388();
        if (var4 != 0) {
            arg0.field1225--;
            this.field853 = new class56();
            this.field853.method445(arg0, (byte) 46);
            this.field854 = new class56();
            this.field854.method445(arg0, (byte) 46);
        }
        int var5 = arg0.method388();
        if (var5 != 0) {
            arg0.field1225--;
            this.field855 = new class56();
            this.field855.method445(arg0, (byte) 46);
            this.field856 = new class56();
            this.field856.method445(arg0, (byte) 46);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg0.method402();
            if (var7 == 0) {
                break;
            }
            this.field857[var6] = var7;
            this.field858[var6] = arg0.method401();
            this.field859[var6] = arg0.method402();
        }
        this.field860 = arg0.method402();
        this.field861 = arg0.method402();
        this.field864 = arg0.method390();
        this.field865 = arg0.method390();
        this.field862 = new class64();
        this.field863 = new class56();
        this.field862.method535(this.field863, 635, arg0);
        if (arg1 != 46) {
            this.field847 = 462;
        }
    }
}

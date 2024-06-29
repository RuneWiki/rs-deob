import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class428 {

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
    public int field6142 = 0;

    @OriginalMember(owner = "client!kq", name = "k", descriptor = "I")
    private int field6152 = 0;

    @OriginalMember(owner = "client!kq", name = "j", descriptor = "I")
    public int field6151 = 500;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "[I")
    private int[] field6143 = new int[5];

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "[I")
    private int[] field6148 = new int[5];

    @OriginalMember(owner = "client!kq", name = "p", descriptor = "[I")
    private int[] field6157 = new int[5];

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
    private int field6147 = 100;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "[I")
    private static int[] field6145 = new int[32768];

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "[I")
    private static int[] field6150;

    @OriginalMember(owner = "client!kq", name = "t", descriptor = "[I")
    private static int[] field6161;

    @OriginalMember(owner = "client!kq", name = "u", descriptor = "[I")
    private static int[] field6162;

    @OriginalMember(owner = "client!kq", name = "x", descriptor = "[I")
    private static int[] field6165;

    @OriginalMember(owner = "client!kq", name = "v", descriptor = "[I")
    private static int[] field6163;

    @OriginalMember(owner = "client!kq", name = "w", descriptor = "[I")
    private static int[] field6164;

    @OriginalMember(owner = "client!kq", name = "y", descriptor = "[I")
    private static int[] field6166;

    @OriginalMember(owner = "client!kq", name = "n", descriptor = "Ltj;")
    private class135 field6155;

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "Law;")
    private class54 field6144;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "Law;")
    private class54 field6146;

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "Law;")
    private class54 field6149;

    @OriginalMember(owner = "client!kq", name = "l", descriptor = "Law;")
    private class54 field6153;

    @OriginalMember(owner = "client!kq", name = "m", descriptor = "Law;")
    private class54 field6154;

    @OriginalMember(owner = "client!kq", name = "o", descriptor = "Law;")
    private class54 field6156;

    @OriginalMember(owner = "client!kq", name = "q", descriptor = "Law;")
    private class54 field6158;

    @OriginalMember(owner = "client!kq", name = "r", descriptor = "Law;")
    private class54 field6159;

    @OriginalMember(owner = "client!kq", name = "s", descriptor = "Law;")
    private class54 field6160;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "()V")
    public static void method2541() {
        field6161 = null;
        field6145 = null;
        field6150 = null;
        field6164 = null;
        field6166 = null;
        field6163 = null;
        field6162 = null;
        field6165 = null;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(III)I")
    private final int method2542(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field6150[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field6145[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lwn;)V")
    public final void method2543(class519 arg0) {
        this.field6149 = new class54();
        this.field6149.method473(arg0);
        this.field6160 = new class54();
        this.field6160.method473(arg0);
        int var2 = arg0.method3072((byte) -127);
        if (var2 != 0) {
            arg0.field7558--;
            this.field6154 = new class54();
            this.field6154.method473(arg0);
            this.field6146 = new class54();
            this.field6146.method473(arg0);
        }
        int var3 = arg0.method3072((byte) -120);
        if (var3 != 0) {
            arg0.field7558--;
            this.field6153 = new class54();
            this.field6153.method473(arg0);
            this.field6156 = new class54();
            this.field6156.method473(arg0);
        }
        int var4 = arg0.method3072((byte) -126);
        if (var4 != 0) {
            arg0.field7558--;
            this.field6158 = new class54();
            this.field6158.method473(arg0);
            this.field6159 = new class54();
            this.field6159.method473(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method3033(11790);
            if (var6 == 0) {
                break;
            }
            this.field6143[var5] = var6;
            this.field6157[var5] = arg0.method3077((byte) -75);
            this.field6148[var5] = arg0.method3033(11790);
        }
        this.field6152 = arg0.method3033(11790);
        this.field6147 = arg0.method3033(11790);
        this.field6151 = arg0.method3018(566990904);
        this.field6142 = arg0.method3018(566990904);
        this.field6155 = new class135();
        this.field6144 = new class54();
        this.field6155.method985(arg0, this.field6144);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)[I")
    public final int[] method2544(int arg0, int arg1) {
        class282.method1823(field6161, 0, arg0);
        if (arg1 < 10) {
            return field6161;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field6149.method471();
        this.field6160.method471();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field6154 != null) {
            this.field6154.method471();
            this.field6146.method471();
            var5 = (int) ((double) (this.field6154.field993 - this.field6154.field990) * 32.768D / var3);
            var6 = (int) ((double) this.field6154.field990 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field6153 != null) {
            this.field6153.method471();
            this.field6156.method471();
            var8 = (int) ((double) (this.field6153.field993 - this.field6153.field990) * 32.768D / var3);
            var9 = (int) ((double) this.field6153.field990 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field6143[var11] != 0) {
                field6164[var11] = 0;
                field6166[var11] = (int) ((double) this.field6148[var11] * var3);
                field6163[var11] = (this.field6143[var11] << 14) / 100;
                field6162[var11] = (int) ((double) (this.field6149.field993 - this.field6149.field990) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field6157[var11]) / var3);
                field6165[var11] = (int) ((double) this.field6149.field990 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field6149.method474(arg0);
            int var40 = this.field6160.method474(arg0);
            if (this.field6154 != null) {
                int var41 = this.field6154.method474(arg0);
                int var42 = this.field6146.method474(arg0);
                var39 += this.method2542(var7, var42, this.field6154.field991) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field6153 != null) {
                int var43 = this.field6153.method474(arg0);
                int var44 = this.field6156.method474(arg0);
                var40 = var40 * ((this.method2542(var10, var44, this.field6153.field991) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field6143[var45] != 0) {
                    int var46 = field6166[var45] + var12;
                    if (var46 < arg0) {
                        field6161[var46] += this.method2542(field6164[var45], field6163[var45] * var40 >> 15, this.field6149.field991);
                        field6164[var45] += (field6162[var45] * var39 >> 16) + field6165[var45];
                    }
                }
            }
        }
        if (this.field6158 != null) {
            this.field6158.method471();
            this.field6159.method471();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field6158.method474(arg0);
                int var18 = this.field6159.method474(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field6158.field993 - this.field6158.field990) * var17 >> 8) + this.field6158.field990;
                } else {
                    var19 = ((this.field6158.field993 - this.field6158.field990) * var18 >> 8) + this.field6158.field990;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field6161[var16] = 0;
                }
            }
        }
        if (this.field6152 > 0 && this.field6147 > 0) {
            int var20 = (int) ((double) this.field6152 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field6161[var21] += field6161[var21 - var20] * this.field6147 / 100;
            }
        }
        if (this.field6155.field2100[0] > 0 || this.field6155.field2100[1] > 0) {
            this.field6144.method471();
            int var22 = this.field6144.method474(arg0 + 1);
            int var23 = this.field6155.method983(0, (float) var22 / 65536.0F);
            int var24 = this.field6155.method983(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field6161[var23 + var25] * (long) class135.field2099 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field6161[var23 + var25 - var36 - 1] * (long) class135.field2095[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field6161[var25 - var37 - 1] * (long) class135.field2095[1][var37] >> 16);
                    }
                    field6161[var25] = var35;
                    var22 = this.field6144.method474(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field6161[var23 + var25] * (long) class135.field2099 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field6161[var23 + var25 - var33 - 1] * (long) class135.field2095[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field6161[var25 - var34 - 1] * (long) class135.field2095[1][var34] >> 16);
                        }
                        field6161[var25] = var32;
                        var22 = this.field6144.method474(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field6161[var23 + var25 - var29 - 1] * (long) class135.field2095[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field6161[var25 - var30 - 1] * (long) class135.field2095[1][var30] >> 16);
                            }
                            field6161[var25] = var28;
                            this.field6144.method474(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field6155.method983(0, (float) var22 / 65536.0F);
                    var24 = this.field6155.method983(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field6161[var38] < -32768) {
                field6161[var38] = -32768;
            }
            if (field6161[var38] > 32767) {
                field6161[var38] = 32767;
            }
        }
        return field6161;
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field6145[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field6150 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field6150[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field6161 = new int[220500];
        field6162 = new int[5];
        field6165 = new int[5];
        field6163 = new int[5];
        field6164 = new int[5];
        field6166 = new int[5];
    }
}

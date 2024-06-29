import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class418 {

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "Z")
    private boolean field6081 = true;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
    private int field6086 = -1;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    private int field6069;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    private int field6073;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "[Lfm;")
    private class731[] field6087;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    private int field6077;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    private int field6074;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "Lfm;")
    private class731 field6084;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "[Lfm;")
    private class731[] field6083;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "Lpia;")
    public static class94 field6072 = new class94(8, 7);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    private int field6076;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field6078;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field6080;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    private int field6082;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    public static int field6085;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "Lhu;")
    private class131 field6075;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(III)Z")
    public static final boolean method2631(int arg0, int arg1, int arg2) {
        if (arg0 >= -58) {
            return true;
        } else {
            field6068++;
            return false;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIZILha;II)V")
    public final void method2632(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, class58 arg7, int arg8, int arg9) {
        int var11 = arg2 + arg6 & 0x3FFF;
        field6078++;
        if (this.field6077 == -1 || this.field6076 == 0) {
            arg7.method370(arg8, arg9, arg0, arg3, arg1, 0);
        } else {
            class298 var12 = class537.field7763.method931(this.field6077, !arg5);
            if (this.field6075 == null && class537.field7763.method929(15715, this.field6077)) {
                int[] var13 = var12.field3698 == 2 ? class537.field7763.method932(0.7F, this.field6076, this.field6077, false, -20255, this.field6076) : class537.field7763.method930(false, 117, this.field6076, this.field6077, 0.7F, this.field6076);
                this.field6075 = arg7.method430(this.field6076, -89, var13, this.field6076, this.field6076, 0);
            }
            if (var12.field3698 == 2) {
                arg7.method370(arg8, arg9, arg0, arg3, arg1, 0);
            }
            if (this.field6075 != null) {
                int var14 = var12.field3698 == 2 ? 1 : 0;
                int var15 = arg3 * arg4 / -4096;
                int var16;
                for (var16 = arg3 * var11 / 4096 + (arg0 - arg3) / 2; var16 > arg3; var16 -= arg3) {
                }
                while (var16 < 0) {
                    var16 += arg3;
                }
                while (var15 > arg3) {
                    var15 -= arg3;
                }
                while (var15 < 0) {
                    var15 += arg3;
                }
                for (int var17 = var16 - arg3; var17 < arg0; var17 += arg3) {
                    for (int var18 = var15 - arg3; var18 < arg3; var18 += arg3) {
                        this.field6075.method818(arg8 + var17, var18 - -arg9, arg3, arg3, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field6082 - 1; var19 >= 0; var19--) {
            this.field6083[var19].method4083(arg7, arg8, arg9, arg0, arg3, arg4, var11);
        }
        if (arg5) {
            this.field6077 = 25;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIBII)V")
    public static final void method2633(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 <= 105) {
            method2633(-100, 97, (byte) -97, -105, 28);
        }
        field6079++;
        class47 var5 = class258.method1546(4, arg1, (byte) 121);
        var5.method271((byte) 127);
        var5.field514 = arg4;
        var5.field507 = arg3;
        var5.field519 = arg0;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IBI)V")
    public static final void method2634(int arg0, byte arg1, int arg2) {
        if (arg1 > -46) {
            method2636((byte) 64);
        }
        class65.field662++;
        field6070++;
        class249 var3 = class289.method1715(class35.field380, 92, class41.field470);
        var3.field3016.method1470((byte) -122, arg2);
        var3.field3016.method1421(arg0, -20798);
        class510.method3017(var3, 114);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILha;)Z")
    public final boolean method2635(int arg0, int arg1, class58 arg2) {
        if (this.field6086 != arg1) {
            this.field6086 = arg1;
            int var4 = class687.method3886(104, arg1);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field6076 != var4) {
                this.field6075 = null;
                this.field6076 = var4;
            }
            if (this.field6087 != null) {
                this.field6082 = 0;
                int[] var5 = new int[this.field6087.length];
                for (int var6 = 0; var6 < this.field6087.length; var6++) {
                    class731 var7 = this.field6087[var6];
                    if (var7.method4080(this.field6074, this.field6073, this.field6069, this.field6086)) {
                        var5[this.field6082] = var7.field10233;
                        this.field6083[this.field6082++] = var7;
                    }
                }
                class513.method3031(this.field6082 - 1, -29868, this.field6083, var5, 0);
            }
            this.field6081 = true;
        }
        if (arg0 != 0) {
            return false;
        }
        field6085++;
        boolean var8 = false;
        if (this.field6081) {
            this.field6081 = false;
            for (int var9 = this.field6082 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field6083[var9].method4078(arg2, this.field6084);
                var8 |= var10;
                this.field6081 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    public static void method2636(byte arg0) {
        field6072 = null;
        if (arg0 != 92) {
            method2633(-90, -87, (byte) 26, -79, 90);
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V")
    public final void method2637(byte arg0) {
        if (this.field6087 != null) {
            for (int var2 = 0; var2 < this.field6087.length; var2++) {
                this.field6087[var2].method4082();
            }
        }
        if (arg0 == 96) {
            field6071++;
            this.field6075 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(I[Lfm;IIII)V")
    public class418(int arg0, class731[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6069 = arg5;
        this.field6073 = arg4;
        this.field6087 = arg1;
        this.field6077 = arg0;
        this.field6074 = arg3;
        if (arg1 == null) {
            this.field6084 = null;
            this.field6083 = null;
        } else {
            this.field6083 = new class731[arg1.length];
            this.field6084 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GCVPDIUI")
public class class17 {

    @OriginalMember(owner = "client!GCVPDIUI", name = "i", descriptor = "[I")
    private int[] field789 = new int[5];

    @OriginalMember(owner = "client!GCVPDIUI", name = "j", descriptor = "[I")
    private int[] field790 = new int[5];

    @OriginalMember(owner = "client!GCVPDIUI", name = "k", descriptor = "[I")
    private int[] field791 = new int[5];

    @OriginalMember(owner = "client!GCVPDIUI", name = "m", descriptor = "I")
    private int field793 = 100;

    @OriginalMember(owner = "client!GCVPDIUI", name = "p", descriptor = "I")
    public int field796 = 500;

    @OriginalMember(owner = "client!GCVPDIUI", name = "u", descriptor = "[I")
    private static int[] field801 = new int[5];

    @OriginalMember(owner = "client!GCVPDIUI", name = "v", descriptor = "[I")
    private static int[] field802 = new int[5];

    @OriginalMember(owner = "client!GCVPDIUI", name = "w", descriptor = "[I")
    private static int[] field803 = new int[5];

    @OriginalMember(owner = "client!GCVPDIUI", name = "x", descriptor = "[I")
    private static int[] field804 = new int[5];

    @OriginalMember(owner = "client!GCVPDIUI", name = "y", descriptor = "[I")
    private static int[] field805 = new int[5];

    @OriginalMember(owner = "client!GCVPDIUI", name = "l", descriptor = "I")
    private int field792;

    @OriginalMember(owner = "client!GCVPDIUI", name = "q", descriptor = "I")
    public int field797;

    @OriginalMember(owner = "client!GCVPDIUI", name = "n", descriptor = "LGKDFAZFL;")
    private class20 field794;

    @OriginalMember(owner = "client!GCVPDIUI", name = "a", descriptor = "LJOBKQXED;")
    private class32 field781;

    @OriginalMember(owner = "client!GCVPDIUI", name = "b", descriptor = "LJOBKQXED;")
    private class32 field782;

    @OriginalMember(owner = "client!GCVPDIUI", name = "c", descriptor = "LJOBKQXED;")
    private class32 field783;

    @OriginalMember(owner = "client!GCVPDIUI", name = "d", descriptor = "LJOBKQXED;")
    private class32 field784;

    @OriginalMember(owner = "client!GCVPDIUI", name = "e", descriptor = "LJOBKQXED;")
    private class32 field785;

    @OriginalMember(owner = "client!GCVPDIUI", name = "f", descriptor = "LJOBKQXED;")
    private class32 field786;

    @OriginalMember(owner = "client!GCVPDIUI", name = "g", descriptor = "LJOBKQXED;")
    private class32 field787;

    @OriginalMember(owner = "client!GCVPDIUI", name = "h", descriptor = "LJOBKQXED;")
    private class32 field788;

    @OriginalMember(owner = "client!GCVPDIUI", name = "o", descriptor = "LJOBKQXED;")
    private class32 field795;

    @OriginalMember(owner = "client!GCVPDIUI", name = "r", descriptor = "[I")
    private static int[] field798;

    @OriginalMember(owner = "client!GCVPDIUI", name = "s", descriptor = "[I")
    private static int[] field799;

    @OriginalMember(owner = "client!GCVPDIUI", name = "t", descriptor = "[I")
    private static int[] field800;

    @OriginalMember(owner = "client!GCVPDIUI", name = "a", descriptor = "()V")
    public static final void method286() {
        field799 = new int[32768];
        for (int var0 = 0; var0 < 32768; var0++) {
            if (Math.random() > 0.5D) {
                field799[var0] = 1;
            } else {
                field799[var0] = -1;
            }
        }
        field800 = new int[32768];
        for (int var1 = 0; var1 < 32768; var1++) {
            field800[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
        }
        field798 = new int[220500];
    }

    @OriginalMember(owner = "client!GCVPDIUI", name = "a", descriptor = "(II)[I")
    public final int[] method287(int arg0, int arg1) {
        for (int var3 = 0; var3 < arg0; var3++) {
            field798[var3] = 0;
        }
        if (arg1 < 10) {
            return field798;
        }
        double var4 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field781.method339((byte) 3);
        this.field782.method339((byte) 3);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (this.field783 != null) {
            this.field783.method339((byte) 3);
            this.field784.method339((byte) 3);
            var6 = (int) ((double) (this.field783.field973 - this.field783.field972) * 32.768D / var4);
            var7 = (int) ((double) this.field783.field972 * 32.768D / var4);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (this.field785 != null) {
            this.field785.method339((byte) 3);
            this.field786.method339((byte) 3);
            var9 = (int) ((double) (this.field785.field973 - this.field785.field972) * 32.768D / var4);
            var10 = (int) ((double) this.field785.field972 * 32.768D / var4);
        }
        for (int var12 = 0; var12 < 5; var12++) {
            if (this.field789[var12] != 0) {
                field801[var12] = 0;
                field802[var12] = (int) ((double) this.field791[var12] * var4);
                field803[var12] = (this.field789[var12] << 14) / 100;
                field804[var12] = (int) ((double) (this.field781.field973 - this.field781.field972) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field790[var12]) / var4);
                field805[var12] = (int) ((double) this.field781.field972 * 32.768D / var4);
            }
        }
        for (int var13 = 0; var13 < arg0; var13++) {
            int var41 = this.field781.method340(arg0, (byte) 8);
            int var42 = this.field782.method340(arg0, (byte) 8);
            if (this.field783 != null) {
                int var43 = this.field783.method340(arg0, (byte) 8);
                int var44 = this.field784.method340(arg0, (byte) 8);
                var41 += this.method288(var44, false, this.field783.field974, var8) >> 1;
                var8 += (var6 * var43 >> 16) + var7;
            }
            if (this.field785 != null) {
                int var45 = this.field785.method340(arg0, (byte) 8);
                int var46 = this.field786.method340(arg0, (byte) 8);
                var42 = var42 * ((this.method288(var46, false, this.field785.field974, var11) >> 1) + 32768) >> 15;
                var11 += (var9 * var45 >> 16) + var10;
            }
            for (int var47 = 0; var47 < 5; var47++) {
                if (this.field789[var47] != 0) {
                    int var48 = field802[var47] + var13;
                    if (var48 < arg0) {
                        field798[var48] += this.method288(field803[var47] * var42 >> 15, false, this.field781.field974, field801[var47]);
                        field801[var47] += (field804[var47] * var41 >> 16) + field805[var47];
                    }
                }
            }
        }
        if (this.field787 != null) {
            this.field787.method339((byte) 3);
            this.field788.method339((byte) 3);
            int var14 = 0;
            boolean var15 = false;
            boolean var16 = true;
            for (int var17 = 0; var17 < arg0; var17++) {
                int var18 = this.field787.method340(arg0, (byte) 8);
                int var19 = this.field788.method340(arg0, (byte) 8);
                int var20;
                if (var16) {
                    var20 = ((this.field787.field973 - this.field787.field972) * var18 >> 8) + this.field787.field972;
                } else {
                    var20 = ((this.field787.field973 - this.field787.field972) * var19 >> 8) + this.field787.field972;
                }
                var14 += 256;
                if (var14 >= var20) {
                    var14 = 0;
                    var16 = !var16;
                }
                if (var16) {
                    field798[var17] = 0;
                }
            }
        }
        if (this.field792 > 0 && this.field793 > 0) {
            int var21 = (int) ((double) this.field792 * var4);
            for (int var22 = var21; var22 < arg0; var22++) {
                field798[var22] += field798[var22 - var21] * this.field793 / 100;
            }
        }
        if (this.field794.field837[0] > 0 || this.field794.field837[1] > 0) {
            this.field795.method339((byte) 3);
            int var23 = this.field795.method340(arg0 + 1, (byte) 8);
            int var24 = this.field794.method293((float) var23 / 65536.0F, 0, 367);
            int var25 = this.field794.method293((float) var23 / 65536.0F, 1, 367);
            if (arg0 >= var24 + var25) {
                int var26 = 0;
                int var27 = var25;
                if (var25 > arg0 - var24) {
                    var27 = arg0 - var24;
                }
                while (var26 < var27) {
                    int var37 = (int) ((long) field798[var24 + var26] * (long) class20.field844 >> 16);
                    for (int var38 = 0; var38 < var24; var38++) {
                        var37 += (int) ((long) field798[var24 + var26 - var38 - 1] * (long) class20.field842[0][var38] >> 16);
                    }
                    for (int var39 = 0; var39 < var26; var39++) {
                        var37 -= (int) ((long) field798[var26 - var39 - 1] * (long) class20.field842[1][var39] >> 16);
                    }
                    field798[var26] = var37;
                    var23 = this.field795.method340(arg0 + 1, (byte) 8);
                    var26++;
                }
                short var28 = 128;
                int var29 = var28;
                while (true) {
                    if (var29 > arg0 - var24) {
                        var29 = arg0 - var24;
                    }
                    while (var26 < var29) {
                        int var34 = (int) ((long) field798[var24 + var26] * (long) class20.field844 >> 16);
                        for (int var35 = 0; var35 < var24; var35++) {
                            var34 += (int) ((long) field798[var24 + var26 - var35 - 1] * (long) class20.field842[0][var35] >> 16);
                        }
                        for (int var36 = 0; var36 < var25; var36++) {
                            var34 -= (int) ((long) field798[var26 - var36 - 1] * (long) class20.field842[1][var36] >> 16);
                        }
                        field798[var26] = var34;
                        var23 = this.field795.method340(arg0 + 1, (byte) 8);
                        var26++;
                    }
                    if (var26 >= arg0 - var24) {
                        while (var26 < arg0) {
                            int var30 = 0;
                            for (int var31 = var24 + var26 - arg0; var31 < var24; var31++) {
                                var30 += (int) ((long) field798[var24 + var26 - var31 - 1] * (long) class20.field842[0][var31] >> 16);
                            }
                            for (int var32 = 0; var32 < var25; var32++) {
                                var30 -= (int) ((long) field798[var26 - var32 - 1] * (long) class20.field842[1][var32] >> 16);
                            }
                            field798[var26] = var30;
                            this.field795.method340(arg0 + 1, (byte) 8);
                            var26++;
                        }
                        break;
                    }
                    var24 = this.field794.method293((float) var23 / 65536.0F, 0, 367);
                    var25 = this.field794.method293((float) var23 / 65536.0F, 1, 367);
                    var29 += var28;
                }
            }
        }
        for (int var40 = 0; var40 < arg0; var40++) {
            if (field798[var40] < -32768) {
                field798[var40] = -32768;
            }
            if (field798[var40] > 32767) {
                field798[var40] = 32767;
            }
        }
        return field798;
    }

    @OriginalMember(owner = "client!GCVPDIUI", name = "a", descriptor = "(IZII)I")
    private final int method288(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            return 0;
        } else if (arg2 == 1) {
            return (arg3 & 0x7FFF) < 16384 ? arg0 : -arg0;
        } else if (arg2 == 2) {
            return field800[arg3 & 0x7FFF] * arg0 >> 14;
        } else if (arg2 == 3) {
            return ((arg3 & 0x7FFF) * arg0 >> 14) - arg0;
        } else if (arg2 == 4) {
            return field799[arg3 / 2607 & 0x7FFF] * arg0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!GCVPDIUI", name = "a", descriptor = "(LCMGGUSPR;I)V")
    public final void method289(class10 arg0, int arg1) {
        this.field781 = new class32();
        this.field781.method337(arg0, -593);
        this.field782 = new class32();
        this.field782.method337(arg0, -593);
        int var3 = arg0.method194();
        if (var3 != 0) {
            arg0.field646--;
            this.field783 = new class32();
            this.field783.method337(arg0, -593);
            this.field784 = new class32();
            this.field784.method337(arg0, -593);
        }
        int var4 = arg0.method194();
        if (var4 != 0) {
            arg0.field646--;
            this.field785 = new class32();
            this.field785.method337(arg0, -593);
            this.field786 = new class32();
            this.field786.method337(arg0, -593);
        }
        int var5 = arg0.method194();
        if (var5 != 0) {
            arg0.field646--;
            this.field787 = new class32();
            this.field787.method337(arg0, -593);
            this.field788 = new class32();
            this.field788.method337(arg0, -593);
        }
        for (int var6 = 0; var6 < 10; var6++) {
            int var7 = arg0.method208();
            if (var7 == 0) {
                break;
            }
            this.field789[var6] = var7;
            this.field790[var6] = arg0.method207();
            this.field791[var6] = arg0.method208();
        }
        this.field792 = arg0.method208();
        this.field793 = arg0.method208();
        this.field796 = arg0.method196();
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        this.field797 = arg0.method196();
        this.field794 = new class20();
        this.field795 = new class32();
        this.field794.method294(arg0, 527, this.field795);
    }
}

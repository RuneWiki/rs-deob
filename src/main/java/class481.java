import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class481 extends class136 {

    @OriginalMember(owner = "client!vm", name = "H", descriptor = "I")
    private int field7068 = 0;

    @OriginalMember(owner = "client!vm", name = "M", descriptor = "I")
    private int field7073 = 0;

    @OriginalMember(owner = "client!vm", name = "S", descriptor = "I")
    private int field7079 = 0;

    @OriginalMember(owner = "client!vm", name = "Q", descriptor = "Lmg;")
    public static class101 field7077;

    @OriginalMember(owner = "client!vm", name = "R", descriptor = "Lsl;")
    public static class318 field7078;

    @OriginalMember(owner = "client!vm", name = "D", descriptor = "I")
    public static int field7064;

    @OriginalMember(owner = "client!vm", name = "E", descriptor = "I")
    private int field7065;

    @OriginalMember(owner = "client!vm", name = "F", descriptor = "I")
    private int field7066;

    @OriginalMember(owner = "client!vm", name = "G", descriptor = "I")
    private int field7067;

    @OriginalMember(owner = "client!vm", name = "I", descriptor = "I")
    public static int field7069;

    @OriginalMember(owner = "client!vm", name = "J", descriptor = "I")
    public static int field7070;

    @OriginalMember(owner = "client!vm", name = "K", descriptor = "I")
    public static int field7071;

    @OriginalMember(owner = "client!vm", name = "L", descriptor = "I")
    private int field7072;

    @OriginalMember(owner = "client!vm", name = "N", descriptor = "I")
    public static int field7074;

    @OriginalMember(owner = "client!vm", name = "O", descriptor = "I")
    private int field7075;

    @OriginalMember(owner = "client!vm", name = "P", descriptor = "I")
    private int field7076;

    @OriginalMember(owner = "client!vm", name = "C", descriptor = "[Lpe;")
    public static class431[] field7063;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIII)V")
    private final void method2898(int arg0, int arg1, int arg2, int arg3) {
        ++field7069;
        int var5 = ~arg2 >= -2049 ? (arg1 + 4096) * arg2 >> 12 : arg1 + arg2 + -(arg1 * arg2 >> 12);
        if (var5 <= 0) {
            this.field7065 = this.field7066 = this.field7076 = arg2;
        } else {
            int var6 = arg3 * 6;
            int var7 = -var5 + arg2 + arg2;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 - -var13;
            int var15 = -var13 + var5;
            if (~var9 != -1) {
                if (var9 != 1) {
                    if (var9 != 2) {
                        if (~var9 != -4) {
                            if (var9 != 4) {
                                if (var9 == 5) {
                                    this.field7065 = var5;
                                    this.field7066 = var7;
                                    this.field7076 = var15;
                                }
                            } else {
                                this.field7066 = var7;
                                this.field7076 = var5;
                                this.field7065 = var14;
                            }
                        } else {
                            this.field7076 = var5;
                            this.field7065 = var7;
                            this.field7066 = var15;
                        }
                    } else {
                        this.field7076 = var14;
                        this.field7066 = var5;
                        this.field7065 = var7;
                    }
                } else {
                    this.field7076 = var7;
                    this.field7066 = var5;
                    this.field7065 = var15;
                }
            } else {
                this.field7066 = var14;
                this.field7065 = var5;
                this.field7076 = var7;
            }
        }
        if (arg0 != 100) {
            this.field7073 = -95;
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(IIII)V")
    public static final void method2899(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class478.field7044.field3334 * arg3 >> 8;
        int var5 = 20 % ((59 - arg1) / 58);
        ++field7070;
        if (arg0 == -1 && !class195.field2843) {
            class9.method62((byte) 127);
        } else if (~arg0 != 0 && (class398.field5850 != arg0 || !class388.method2390((byte) -89)) && ~var4 != -1 && !class195.field2843) {
            class131.method1002(var4, class512.field7556, (byte) -89, arg2, false, 0, arg0);
        }
        class398.field5850 = arg0;
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
    public class481() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(IIII)V")
    private final void method2900(int arg0, int arg1, int arg2, int arg3) {
        ++field7074;
        int var5 = ~arg1 <= ~arg0 ? arg1 : arg0;
        int var6 = arg2 > var5 ? arg2 : var5;
        int var7 = ~arg0 > ~arg1 ? arg0 : arg1;
        int var8 = ~arg2 <= ~var7 ? var7 : arg2;
        int var9 = -var8 + var6;
        this.field7067 = (var8 - -var6) / 2;
        if (~var9 < -1) {
            int var10 = (-arg0 + var6 << 12) / var9;
            int var11 = (-arg1 + var6 << 12) / var9;
            int var12 = (-arg2 + var6 << 12) / var9;
            if (arg0 == var6) {
                this.field7072 = ~arg1 == ~var8 ? var12 + 20480 : 4096 - var11;
            } else if (arg1 != var6) {
                this.field7072 = ~arg0 == ~var8 ? var11 + 12288 : -var10 + 20480;
            } else {
                this.field7072 = ~arg2 == ~var8 ? var10 + 4096 : -var12 + 12288;
            }
            this.field7072 /= 6;
        } else {
            this.field7072 = 0;
        }
        if (~this.field7067 < -1 && ~this.field7067 > -4097) {
            this.field7075 = (var9 << 12) / (this.field7067 <= 2048 ? this.field7067 * 2 : -(this.field7067 * 2) + 8192);
        } else {
            this.field7075 = 0;
        }
        int var13 = 75 % ((-68 - arg3) / 35);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IILiv;)V")
    public final void method268(int arg0, int arg1, class65 arg2) {
        if (arg0 != 4) {
            field7078 = null;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field7073 = (arg2.method629(false) << 12) / 100;
                }
            } else {
                this.field7068 = (arg2.method629(false) << 12) / 100;
            }
        } else {
            this.field7079 = arg2.method599((byte) 1);
        }
        ++field7064;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BI)[[I")
    public final int[][] method272(byte arg0, int arg1) {
        ++field7071;
        int[][] var3 = super.field1952.method3127((byte) 90, arg1);
        if (super.field1952.field7770) {
            int[][] var4 = this.method1036(3, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class467.field6889; ++var11) {
                this.method2900(var5[var11], var6[var11], var7[var11], 36);
                this.field7067 += this.field7073;
                this.field7072 += this.field7079;
                this.field7075 += this.field7068;
                while (this.field7072 < 0) {
                    this.field7072 += 4096;
                }
                if (~this.field7075 > -1) {
                    this.field7075 = 0;
                }
                while (~this.field7072 < -4097) {
                    this.field7072 -= 4096;
                }
                if (~this.field7075 < -4097) {
                    this.field7075 = 4096;
                }
                if (this.field7067 < 0) {
                    this.field7067 = 0;
                }
                if (this.field7067 > 4096) {
                    this.field7067 = 4096;
                }
                this.method2898(100, this.field7075, this.field7067, this.field7072);
                var8[var11] = this.field7065;
                var9[var11] = this.field7066;
                var10[var11] = this.field7076;
            }
        }
        if (arg0 <= 33) {
            this.method272((byte) -70, 115);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(B)V")
    public static void method2901(byte arg0) {
        field7077 = null;
        field7063 = null;
        if (arg0 >= -95) {
            method2899(5, 57, -60, -9);
        }
        field7078 = null;
    }

    static {
        new class331("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field7077 = new class101();
        field7078 = new class318(12, 4);
    }
}

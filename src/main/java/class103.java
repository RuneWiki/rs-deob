import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class103 extends class202 {

    @OriginalMember(owner = "client!cf", name = "I", descriptor = "I")
    private int field1503 = 0;

    @OriginalMember(owner = "client!cf", name = "K", descriptor = "I")
    private int field1505 = 0;

    @OriginalMember(owner = "client!cf", name = "M", descriptor = "I")
    private int field1507 = 0;

    @OriginalMember(owner = "client!cf", name = "T", descriptor = "I")
    public static int field1514 = 0;

    @OriginalMember(owner = "client!cf", name = "J", descriptor = "Z")
    public static boolean field1504 = false;

    @OriginalMember(owner = "client!cf", name = "X", descriptor = "Lss;")
    public static class213 field1518 = new class213("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!cf", name = "bb", descriptor = "I")
    public static int field1522 = 0;

    @OriginalMember(owner = "client!cf", name = "L", descriptor = "I")
    private int field1506;

    @OriginalMember(owner = "client!cf", name = "N", descriptor = "I")
    private int field1508;

    @OriginalMember(owner = "client!cf", name = "O", descriptor = "I")
    private int field1509;

    @OriginalMember(owner = "client!cf", name = "P", descriptor = "I")
    private int field1510;

    @OriginalMember(owner = "client!cf", name = "Q", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!cf", name = "R", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!cf", name = "S", descriptor = "I")
    private int field1513;

    @OriginalMember(owner = "client!cf", name = "U", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!cf", name = "V", descriptor = "I")
    private int field1516;

    @OriginalMember(owner = "client!cf", name = "W", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!cf", name = "Y", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!cf", name = "Z", descriptor = "[Lya;")
    public static class223[] field1520;

    @OriginalMember(owner = "client!cf", name = "ab", descriptor = "[[I")
    public static int[][] field1521;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIBI)V")
    private final void method701(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 > 108) {
            ++field1512;
            int var5 = ~arg3 < -2049 ? arg0 + arg3 - (arg0 * arg3 >> 12) : (arg0 + 4096) * arg3 >> 12;
            if (var5 <= 0) {
                this.field1510 = this.field1509 = this.field1513 = arg3;
            } else {
                int var6 = arg1 * 6;
                int var7 = arg3 - (-arg3 + var5);
                int var8 = (-var7 + var5 << 12) / var5;
                int var9 = var6 >> 12;
                int var10 = -(var9 << 12) + var6;
                int var12 = var8 * var5 >> 12;
                int var13 = var10 * var12 >> 12;
                int var14 = var7 + var13;
                int var15 = -var13 + var5;
                if (var9 != 0) {
                    if (~var9 != -2) {
                        if (var9 != 2) {
                            if (var9 != 3) {
                                if (var9 != 4) {
                                    if (~var9 == -6) {
                                        this.field1513 = var15;
                                        this.field1509 = var7;
                                        this.field1510 = var5;
                                    }
                                } else {
                                    this.field1509 = var7;
                                    this.field1510 = var14;
                                    this.field1513 = var5;
                                }
                            } else {
                                this.field1509 = var15;
                                this.field1513 = var5;
                                this.field1510 = var7;
                            }
                        } else {
                            this.field1513 = var14;
                            this.field1509 = var5;
                            this.field1510 = var7;
                        }
                    } else {
                        this.field1510 = var15;
                        this.field1509 = var5;
                        this.field1513 = var7;
                    }
                } else {
                    this.field1509 = var14;
                    this.field1510 = var5;
                    this.field1513 = var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "(I)V")
    public static void method702(int arg0) {
        if (arg0 < 121) {
            field1521 = null;
        }
        field1521 = null;
        field1520 = null;
        field1518 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIII)V")
    private final void method703(int arg0, int arg1, int arg2, int arg3) {
        ++field1519;
        int var5 = ~arg0 < ~arg1 ? arg0 : arg1;
        int var6 = ~arg0 > ~arg1 ? arg0 : arg1;
        int var7 = ~var5 <= ~arg3 ? var5 : arg3;
        int var8 = ~arg3 > ~var6 ? arg3 : var6;
        this.field1508 = (var7 + var8) / 2;
        int var9 = -var8 + var7;
        if (var9 <= 0) {
            this.field1506 = 0;
        } else {
            int var10 = (-arg0 + var7 << 12) / var9;
            int var11 = (var7 - arg1 << 12) / var9;
            int var12 = (var7 - arg3 << 12) / var9;
            if (arg0 == var7) {
                this.field1506 = arg1 == var8 ? 20480 - -var12 : 4096 - var11;
            } else if (~arg1 == ~var7) {
                this.field1506 = arg3 == var8 ? 4096 - -var10 : -var12 + 12288;
            } else {
                this.field1506 = ~arg0 == ~var8 ? var11 + 12288 : -var10 + 20480;
            }
            this.field1506 /= 6;
        }
        if (this.field1508 > 0 && this.field1508 < 4096) {
            this.field1516 = (var9 << 12) / (~this.field1508 < -2049 ? -(this.field1508 * 2) + 8192 : this.field1508 * 2);
        } else {
            this.field1516 = 0;
        }
        if (arg2 != 6) {
            this.method701(-90, -91, (byte) -57, -98);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)[[I")
    public final int[][] method44(int arg0, int arg1) {
        if (arg0 != -1) {
            return null;
        } else {
            ++field1511;
            int[][] var3 = super.field3081.method1050(arg1, -53);
            if (super.field3081.field2432) {
                int[][] var4 = this.method1382(0, arg1, -83);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; var11 < class276.field4375; ++var11) {
                    this.method703(var5[var11], var6[var11], 6, var7[var11]);
                    this.field1508 += this.field1507;
                    this.field1506 += this.field1505;
                    this.field1516 += this.field1503;
                    while (this.field1506 < 0) {
                        this.field1506 += 4096;
                    }
                    while (~this.field1506 < -4097) {
                        this.field1506 -= 4096;
                    }
                    if (~this.field1516 > -1) {
                        this.field1516 = 0;
                    }
                    if (~this.field1508 > -1) {
                        this.field1508 = 0;
                    }
                    if (~this.field1516 < -4097) {
                        this.field1516 = 4096;
                    }
                    if (~this.field1508 < -4097) {
                        this.field1508 = 4096;
                    }
                    this.method701(this.field1516, this.field1506, (byte) 112, this.field1508);
                    var8[var11] = this.field1510;
                    var9[var11] = this.field1509;
                    var10[var11] = this.field1513;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILff;)V")
    public static final void method704(int arg0, class214 arg1) {
        arg1.field3650 = null;
        ++field1515;
        if (class213.field3642 < 20) {
            class165.field2383.method2625(arg1, 0);
            ++class213.field3642;
        }
        if (arg0 != -9491) {
            field1518 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        int var4 = -58 % ((-46 - arg1) / 50);
        ++field1517;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field1507 = (arg0.method1427(false) << 12) / 100;
                }
            } else {
                this.field1503 = (arg0.method1427(false) << 12) / 100;
            }
        } else {
            this.field1505 = arg0.method1456(13329);
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
    public class103() {
        super(1, false);
    }
}

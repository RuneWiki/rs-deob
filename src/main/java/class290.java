import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class290 extends class96 {

    @OriginalMember(owner = "client!ur", name = "M", descriptor = "I")
    private int field3703 = 2048;

    @OriginalMember(owner = "client!ur", name = "S", descriptor = "I")
    private int field3709 = 0;

    @OriginalMember(owner = "client!ur", name = "R", descriptor = "I")
    private int field3708 = 12288;

    @OriginalMember(owner = "client!ur", name = "O", descriptor = "I")
    private int field3705 = 2048;

    @OriginalMember(owner = "client!ur", name = "T", descriptor = "I")
    private int field3710 = 0;

    @OriginalMember(owner = "client!ur", name = "W", descriptor = "I")
    private int field3713 = 4096;

    @OriginalMember(owner = "client!ur", name = "X", descriptor = "I")
    private int field3714 = 8192;

    @OriginalMember(owner = "client!ur", name = "Z", descriptor = "Lpi;")
    public static class340 field3716 = new class340(64, 1);

    @OriginalMember(owner = "client!ur", name = "ab", descriptor = "Loi;")
    public static class169 field3717 = new class169("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!ur", name = "bb", descriptor = "[I")
    public static int[] field3718 = new int[2048];

    @OriginalMember(owner = "client!ur", name = "K", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!ur", name = "L", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!ur", name = "N", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!ur", name = "P", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!ur", name = "Q", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!ur", name = "U", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!ur", name = "V", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!ur", name = "Y", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZLeo;)Ljava/lang/String;")
    public static final String method1751(int arg0, boolean arg1, class423 arg2) {
        ++field3701;
        if (arg1) {
            method1754(true);
        }
        if (!client.method3037(arg2).method1626(true, arg0) && arg2.field5779 == null) {
            return null;
        } else if (arg2.field5701 != null && arg2.field5701.length > arg0 && arg2.field5701[arg0] != null && ~arg2.field5701[arg0].trim().length() != -1) {
            return arg2.field5701[arg0];
        } else {
            return class285.field3633 ? "Hidden-" + arg0 : null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZ)V")
    public static final void method1752(int arg0, boolean arg1) {
        if (!arg1) {
            method1754(true);
        }
        ++field3704;
        class436 var2 = class459.method2712(8, arg0, -1759243680);
        var2.method2567(16013);
    }

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "(I)V")
    public final void method390(int arg0) {
        ++field3706;
        if (arg0 <= 15) {
            this.field3714 = 104;
        }
        class18.method112(-126);
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(II)V")
    public static final void method1753(int arg0, int arg1) {
        ++field3712;
        class436 var2 = class459.method2712(arg0, arg1, arg0 + -1759243694);
        var2.method2567(16013);
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        ++field3711;
        if (arg1 != 255) {
            this.method390(109);
        }
        int[] var3 = super.field1331.method397((byte) -110, arg0);
        if (super.field1331.field863) {
            int var4 = class74.field933[arg0] + -2048;
            for (int var5 = 0; class269.field3403 > var5; ++var5) {
                int var6 = class510.field7476[var5] + -2048;
                int var7 = this.field3705 + var6;
                int var8 = ~var7 > 2047 ? var7 - -4096 : var7;
                int var9 = var8 <= 2048 ? var8 : var8 + -4096;
                int var10 = this.field3709 + var4;
                int var11 = ~var10 > 2047 ? var10 + 4096 : var10;
                int var12 = ~var11 >= -2049 ? var11 : var11 + -4096;
                int var13 = var6 - -this.field3710;
                int var14 = ~var13 <= 2047 ? var13 : var13 - -4096;
                int var15 = var14 <= 2048 ? var14 : var14 + -4096;
                int var16 = var4 - -this.field3703;
                int var17 = var16 >= -2048 ? var16 : var16 + 4096;
                int var18 = var17 <= 2048 ? var17 : var17 + -4096;
                var3[var5] = !this.method1756((byte) 81, var12, var9) && !this.method1755(var18, var15, (byte) -115) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(Z)V")
    public static void method1754(boolean arg0) {
        field3716 = null;
        field3718 = null;
        field3717 = null;
        if (arg0) {
            method1754(false);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IILbt;)V")
    public final void method31(int arg0, int arg1, class88 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 == 6) {
                                    this.field3714 = arg2.method568((byte) 110);
                                }
                            } else {
                                this.field3713 = arg2.method568((byte) 110);
                            }
                        } else {
                            this.field3708 = arg2.method568((byte) 110);
                        }
                    } else {
                        this.field3703 = arg2.method568((byte) 110);
                    }
                } else {
                    this.field3710 = arg2.method568((byte) 110);
                }
            } else {
                this.field3709 = arg2.method568((byte) 110);
            }
        } else {
            this.field3705 = arg2.method568((byte) 110);
        }
        ++field3702;
        if (arg1 != -1) {
            method1753(-105, 31);
        }
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "()V")
    public class290() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIB)Z")
    private final boolean method1755(int arg0, int arg1, byte arg2) {
        ++field3707;
        int var4 = (arg0 + arg1) * this.field3708 >> 12;
        if (arg2 != -115) {
            this.field3713 = -99;
        }
        int var5 = class234.field3041[(var4 * 255 & 1044956) >> 12];
        int var6 = (var5 << 12) / this.field3708;
        int var7 = (var6 << 12) / this.field3714;
        int var8 = this.field3713 * var7 >> 12;
        return -arg1 + arg0 < var8 && ~(-var8) > ~(-arg1 + arg0);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(BII)Z")
    private final boolean method1756(byte arg0, int arg1, int arg2) {
        ++field3715;
        int var4 = (-arg2 + arg1) * this.field3708 >> 12;
        int var5 = class234.field3041[(var4 * 255 & 1048474) >> 12];
        int var6 = (var5 << 12) / this.field3708;
        int var7 = (var6 << 12) / this.field3714;
        int var8 = this.field3713 * var7 >> 12;
        if (arg0 <= 1) {
            return false;
        } else {
            return var8 > arg2 - -arg1 && -var8 < arg1 + arg2;
        }
    }
}

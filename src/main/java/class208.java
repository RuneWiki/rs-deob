import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class208 extends class202 {

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "Loh;")
    public static class263 field3764 = class253.method1681(-126, "Ausw-=hlen");

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "[I")
    public static int[] field3770 = new int[5];

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "Loh;")
    public class263 field3762;

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "Lue;")
    public static class86 field3765;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "[I")
    public int[] field3756;

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "[I")
    public int[] field3767;

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "[I")
    public int[] field3768;

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "[I")
    public int[] field3771;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
    public static void method1429(int arg0) {
        if (arg0 == -255) {
            field3764 = null;
            field3765 = null;
            field3770 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)I")
    public static final int method1430(byte arg0, int arg1) {
        field3763++;
        if (!(arg1 < 97 || arg1 > 122) || !(arg1 < 224 || arg1 > 254 || arg1 == 247)) {
            return arg1 - 32;
        }
        if (arg0 != 80) {
            field3765 = null;
        }
        if (arg1 == 255) {
            return 159;
        } else if (arg1 == 156) {
            return 140;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lsi;Z)V")
    public final void method1431(class194 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method1301(-8317);
            if (var3 == 0) {
                if (arg1) {
                    this.method1431((class194) null, false);
                }
                field3761++;
                return;
            }
            this.method1433(5, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILue;)V")
    public static final void method1432(int arg0, class86 arg1) {
        class94.field1855 = arg1.method573(-1, class190.field3421);
        class136.field2481 = arg1.method573(-1, class48.field1047);
        field3766++;
        if (arg0 < 96) {
            field3765 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILsi;)V")
    private final void method1433(int arg0, int arg1, class194 arg2) {
        if (arg0 != 5) {
            field3772 = 89;
        }
        if (arg1 == 1) {
            this.field3762 = arg2.method1320(false);
        } else if (arg1 == 2) {
            int var7 = arg2.method1301(-8317);
            this.field3767 = new int[var7];
            this.field3756 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3756[var8] = arg2.method1294((byte) 3);
                int var9 = arg2.method1301(-8317);
                if (var9 == 0) {
                    this.field3767[var8] = -1;
                } else {
                    this.field3767[var8] = var9;
                }
            }
        } else if (arg1 == 3) {
            int var4 = arg2.method1301(-8317);
            this.field3768 = new int[var4];
            this.field3771 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3771[var5] = arg2.method1294((byte) 3);
                int var6 = arg2.method1301(arg0 - 8322);
                if (var6 == 0) {
                    this.field3768[var5] = -1;
                } else {
                    this.field3768[var5] = var6;
                }
            }
        }
        field3758++;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)I")
    public final int method1434(int arg0, byte arg1) {
        field3759++;
        if (this.field3771 == null) {
            return -1;
        }
        int var3 = 0;
        int var4 = 81 / ((-arg1 - 35) / 34);
        while (var3 < this.field3771.length) {
            if (this.field3768[var3] == arg0) {
                return this.field3771[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V")
    public final void method1435(int arg0) {
        if (this.field3771 != null) {
            for (int var2 = 0; var2 < this.field3771.length; var2++) {
                this.field3771[var2] = class160.method1052(this.field3771[var2], 32768);
            }
        }
        field3769++;
        if (this.field3756 != null) {
            for (int var3 = 0; var3 < this.field3756.length; var3++) {
                this.field3756[var3] = class160.method1052(this.field3756[var3], 32768);
            }
        }
        if (arg0 != 0) {
            method1429(-29);
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(IB)I")
    public final int method1436(int arg0, byte arg1) {
        field3757++;
        if (this.field3756 == null) {
            return -1;
        } else if (arg1 == 120) {
            for (int var3 = 0; var3 < this.field3756.length; var3++) {
                if (this.field3767[var3] == arg0) {
                    return this.field3756[var3];
                }
            }
            return -1;
        } else {
            return -14;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public abstract class class518 {

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "Z")
    public boolean field7631 = true;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "Z")
    public boolean field7632 = false;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public int field7635 = 2;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "Z")
    public boolean field7636 = true;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public int field7643 = 2;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    public int field7644 = 0;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public int field7640 = 127;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public int field7642 = 0;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    public int field7650 = 127;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public int field7637 = 0;

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "Z")
    public boolean field7656 = false;

    @OriginalMember(owner = "client!fl", name = "F", descriptor = "I")
    public int field7662 = 2;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    public int field7645 = 0;

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "I")
    public int field7659 = 2;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "Z")
    public boolean field7652 = true;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "Z")
    public boolean field7639 = true;

    @OriginalMember(owner = "client!fl", name = "E", descriptor = "I")
    public int field7661 = 1;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "Z")
    public boolean field7633 = false;

    @OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
    public int field7663 = 0;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "Z")
    public boolean field7653 = true;

    @OriginalMember(owner = "client!fl", name = "H", descriptor = "Z")
    public boolean field7664 = true;

    @OriginalMember(owner = "client!fl", name = "I", descriptor = "Z")
    public boolean field7665 = true;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "Z")
    public boolean field7646 = true;

    @OriginalMember(owner = "client!fl", name = "D", descriptor = "Z")
    public boolean field7660 = true;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "Z")
    public boolean field7649 = true;

    @OriginalMember(owner = "client!fl", name = "M", descriptor = "I")
    public int field7669 = 0;

    @OriginalMember(owner = "client!fl", name = "O", descriptor = "I")
    public int field7671 = 255;

    @OriginalMember(owner = "client!fl", name = "N", descriptor = "I")
    public int field7670 = 0;

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "Z")
    public boolean field7667 = true;

    @OriginalMember(owner = "client!fl", name = "J", descriptor = "I")
    public int field7666 = 3;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "Z")
    public boolean field7638 = true;

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "[Lcq;")
    public static class327[] field7658 = new class327[14];

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "Lcn;")
    public static class356 field7648 = new class356();

    @OriginalMember(owner = "client!fl", name = "P", descriptor = "F")
    public static float field7672;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field7634;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
    public static int field7651;

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "I")
    public static int field7655;

    @OriginalMember(owner = "client!fl", name = "A", descriptor = "I")
    public static int field7657;

    @OriginalMember(owner = "client!fl", name = "L", descriptor = "La;")
    public static class435 field7668;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "Z")
    public boolean field7641;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "Z")
    public boolean field7647;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "Z")
    public boolean field7654;

    @OriginalMember(owner = "client!fl", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field7673;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZB)V")
    public final void method3081(int arg0, boolean arg1, byte arg2) {
        if (arg0 == 1 || arg0 == 3) {
            this.field7647 = arg1;
        } else {
            this.field7641 = arg1;
        }
        int var4 = 105 % ((28 - arg2) / 47);
        field7651++;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I[[[BIBII)V")
    public static final void method3082(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class328.field4485++;
        class294.field4053 = 0;
        for (int var6 = class354.field5189; var6 < class253.field3523; var6++) {
            class486[][] var17 = class89.field1305[var6];
            for (int var18 = class214.field2997; var18 < class127.field1887; var18++) {
                for (int var19 = class149.field2153; var19 < class526.field7780; var19++) {
                    class486 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class457.field6712[var18 + class110.field1656 - class368.field5398][var19 + class110.field1656 - class403.field5916] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field7109 = true;
                            var20.field7108 = true;
                            if (var20.field7115 == null) {
                                var20.field7098 = false;
                            } else {
                                var20.field7098 = true;
                            }
                            class294.field4053++;
                        } else {
                            var20.field7109 = false;
                            var20.field7108 = false;
                            var20.field7113 = 0;
                            if (var18 >= class368.field5398 - 16 && var18 <= class368.field5398 + 16 && var19 >= class403.field5916 - 16 && var19 <= class403.field5916 + 16 && (var20.field7114 != null || var20.field7118 != null || var20.field7103 != null || var20.field7105 != null || var20.field7100 != null || var20.field7115 != null)) {
                                class361.field5270.method2163(-11487, var20);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class89.field1302 == class211.field2950;
        for (int var8 = class354.field5189; var8 < class253.field3523; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class449.field6615.method308() && var8 >= arg2 && arg1 != null) {
                int var10 = class457.field6712.length;
                if (class457.field6712.length + class214.field2997 > class206.field2881) {
                    var10 -= class457.field6712.length + class214.field2997 - class206.field2881;
                }
                int var11 = class457.field6712[0].length;
                if (class457.field6712[0].length + class149.field2153 > class371.field5427) {
                    var11 -= class457.field6712[0].length + class149.field2153 - class371.field5427;
                }
                int var12 = class224.field3194;
                while (true) {
                    if (var12 >= var10) {
                        class361.field5270.method2155((byte) 34, var9, var8, class211.field2950[var8], true);
                        break;
                    }
                    int var13 = class214.field2997 + var12 - class224.field3194;
                    for (int var14 = class187.field2713; var14 < var11; var14++) {
                        class414.field6042[var12][var14] = false;
                        if (class457.field6712[var12][var14]) {
                            int var15 = class149.field2153 + var14 - class187.field2713;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class89.field1305[var16][var13][var15] != null && class89.field1305[var16][var13][var15].field7101 == var8) {
                                    class414.field6042[var12][var14] = class89.field1305[var16][var13][var15].field7109;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class361.field5270.method2155((byte) 73, var9, var8, class211.field2950[var8], false);
            }
            class361.field5270.method2156(5000);
        }
        if (!class173.method1124(true)) {
            class173.method1124(false);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IBI)V")
    public final void method3083(int arg0, byte arg1, int arg2) {
        if (arg1 >= -103) {
            return;
        }
        if (arg2 == 1 || arg2 == 3) {
            this.field7659 = arg0;
        } else {
            this.field7644 = arg0;
        }
        field7655++;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BI)Z")
    public final boolean method3084(byte arg0, int arg1) {
        if (arg0 > -10) {
            this.field7647 = true;
        }
        field7634++;
        return arg1 == 1 || arg1 == 3 ? this.field7647 : this.field7641;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)I")
    public final int method3085(int arg0, byte arg1) {
        field7657++;
        int var3 = 43 / ((arg1 - 69) / 35);
        return arg0 == 1 || arg0 == 3 ? this.field7659 : this.field7644;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)V")
    public static void method3086(boolean arg0) {
        field7648 = null;
        field7658 = null;
        if (arg0) {
            field7668 = null;
            field7673 = null;
        }
    }
}

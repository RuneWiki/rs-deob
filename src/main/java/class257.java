import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class257 {

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "[I")
    public static int[] field3189 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field3193 = -1;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    public static int field3198 = 52;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public int field3186;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public int field3187;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public int field3188;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public int field3192;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public int field3194;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public int field3196;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "Lhc;")
    public static class391 field3191;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "[Lrs;")
    public static class276[] field3200;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "[[Lth;")
    public static class266[][] field3197;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I[SB)[S")
    public static final short[] method1546(int arg0, short[] arg1, byte arg2) {
        if (arg2 <= 101) {
            field3193 = -98;
        }
        field3195++;
        short[] var3 = new short[arg0];
        class205.method1316(arg1, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    public static void method1547(int arg0) {
        int var1 = 122 / ((15 - arg0) / 60);
        field3191 = null;
        field3197 = null;
        field3189 = null;
        field3200 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "()V")
    public static final void method1548() {
        class483.field6746 = 0;
        label212: for (int var0 = 0; var0 < class355.field4976; var0++) {
            class276 var1 = class247.field3114[var0];
            if (class455.field6446 != null) {
                for (int var2 = 0; var2 < class455.field6446.length; var2++) {
                    if (class455.field6446[var2] != -1000000 && (var1.field3606 <= class455.field6446[var2] || var1.field3609 <= class455.field6446[var2]) && (var1.field3593 <= class509.field7096[var2] || var1.field3604 <= class509.field7096[var2]) && (var1.field3593 >= class311.field3982[var2] || var1.field3604 >= class311.field3982[var2]) && (var1.field3603 <= class44.field631[var2] || var1.field3595 <= class44.field631[var2]) && (var1.field3603 >= class115.field1470[var2] || var1.field3595 >= class115.field1470[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field3600 == 1) {
                int var3 = var1.field3607 + field3199 - class155.field2012;
                if (var3 >= 0 && var3 <= field3199 + field3199) {
                    int var4 = var1.field3611 + field3199 - class151.field1995;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > field3199 + field3199) {
                        continue;
                    }
                    int var5 = var1.field3596 + field3199 - class151.field1995;
                    if (var5 > field3199 + field3199) {
                        var5 = field3199 + field3199;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class634.field9230[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class543.field7580 - var1.field3593;
                        if (var7 > class590.field8521) {
                            var1.field3597 = 1;
                        } else {
                            if (var7 >= -class590.field8521) {
                                continue;
                            }
                            var1.field3597 = 2;
                            var7 = -var7;
                        }
                        var1.field3608 = (var1.field3603 - class100.field1335 << 8) / var7;
                        var1.field3599 = (var1.field3595 - class100.field1335 << 8) / var7;
                        var1.field3601 = (var1.field3606 - class385.field5366 << 8) / var7;
                        var1.field3605 = (var1.field3609 - class385.field5366 << 8) / var7;
                        field3200[class483.field6746++] = var1;
                    }
                }
            } else if (var1.field3600 == 2) {
                int var8 = var1.field3611 + field3199 - class151.field1995;
                if (var8 >= 0 && var8 <= field3199 + field3199) {
                    int var9 = var1.field3607 + field3199 - class155.field2012;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > field3199 + field3199) {
                        continue;
                    }
                    int var10 = var1.field3610 + field3199 - class155.field2012;
                    if (var10 > field3199 + field3199) {
                        var10 = field3199 + field3199;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class634.field9230[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class100.field1335 - var1.field3603;
                        if (var12 > class590.field8521) {
                            var1.field3597 = 3;
                        } else {
                            if (var12 >= -class590.field8521) {
                                continue;
                            }
                            var1.field3597 = 4;
                            var12 = -var12;
                        }
                        var1.field3598 = (var1.field3593 - class543.field7580 << 8) / var12;
                        var1.field3594 = (var1.field3604 - class543.field7580 << 8) / var12;
                        var1.field3601 = (var1.field3606 - class385.field5366 << 8) / var12;
                        var1.field3605 = (var1.field3609 - class385.field5366 << 8) / var12;
                        field3200[class483.field6746++] = var1;
                    }
                }
            } else if (var1.field3600 == 4) {
                int var13 = var1.field3606 - class385.field5366;
                if (var13 > class427.field5825) {
                    int var14 = var1.field3611 + field3199 - class151.field1995;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > field3199 + field3199) {
                        continue;
                    }
                    int var15 = var1.field3596 + field3199 - class151.field1995;
                    if (var15 > field3199 + field3199) {
                        var15 = field3199 + field3199;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field3607 + field3199 - class155.field2012;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > field3199 + field3199) {
                        continue;
                    }
                    int var17 = var1.field3610 + field3199 - class155.field2012;
                    if (var17 > field3199 + field3199) {
                        var17 = field3199 + field3199;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class634.field9230[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field3597 = 5;
                        var1.field3598 = (var1.field3593 - class543.field7580 << 8) / var13;
                        var1.field3594 = (var1.field3604 - class543.field7580 << 8) / var13;
                        var1.field3608 = (var1.field3603 - class100.field1335 << 8) / var13;
                        var1.field3599 = (var1.field3595 - class100.field1335 << 8) / var13;
                        field3200[class483.field6746++] = var1;
                    }
                }
            }
        }
    }
}

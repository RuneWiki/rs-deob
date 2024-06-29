import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class409 {

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    private int field5789 = 0;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
    private int field5799 = 0;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    private int field5797 = 0;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "Leea;")
    private class131 field5793;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "Lrc;")
    private class538 field5795;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "[Lmh;")
    private class631[] field5796;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "Lpb;")
    public class654 field5790;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "I")
    public static int field5798 = 0;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "Lgda;")
    public static class53 field5791 = new class53(79, -1);

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field5794;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
    public static int field5800;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z[[[BIBIIZ)V")
    public static final void method2528(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        int var7 = arg0 ? 1 : 0;
        class278.field3928 = 0;
        class347.field4911 = 0;
        class411.field5807++;
        if ((arg5 & 0x2) == 0) {
            for (class105 var8 = class710.field9861[var7]; var8 != null; var8 = var8.field1251) {
                if (!class209.method1284(var8, arg0, arg1, arg2, arg3)) {
                    class636.method3533(var8);
                    if (var8.field1260 != -1) {
                        class110.field1336[class278.field3928++] = var8;
                    }
                }
            }
        }
        if ((arg5 & 0x1) == 0) {
            for (class105 var9 = class373.field5234[var7]; var9 != null; var9 = var9.field1251) {
                if (!class209.method1284(var9, arg0, arg1, arg2, arg3)) {
                    class636.method3533(var9);
                    if (var9.field1260 != -1) {
                        class499.field7163[class347.field4911++] = var9;
                    }
                }
            }
            for (class105 var10 = class321.field4433[var7]; var10 != null; var10 = var10.field1251) {
                if (!class209.method1284(var10, arg0, arg1, arg2, arg3)) {
                    if (var10.method751(false)) {
                        class636.method3533(var10);
                        if (var10.field1260 != -1) {
                            class499.field7163[class347.field4911++] = var10;
                        }
                    } else {
                        class636.method3533(var10);
                        if (var10.field1260 != -1) {
                            class110.field1336[class278.field3928++] = var10;
                        }
                    }
                }
            }
            if (!arg0) {
                for (int var11 = 0; var11 < class581.field8200; var11++) {
                    if (!class209.method1284(class448.field6355[var11], arg0, arg1, arg2, arg3)) {
                        class636.method3533(class448.field6355[var11]);
                        if (class448.field6355[var11].field1260 != -1) {
                            if (class448.field6355[var11].method751(false)) {
                                class499.field7163[class347.field4911++] = class448.field6355[var11];
                            } else {
                                class110.field1336[class278.field3928++] = class448.field6355[var11];
                            }
                        }
                    }
                }
            }
        }
        if (class278.field3928 > 0) {
            class153.method1034(class110.field1336, 0, class278.field3928 - 1);
            for (int var12 = 0; var12 < class278.field3928; var12++) {
                class531.method3094(class110.field1336[var12], true, arg6);
            }
        }
        if (class370.field5217) {
            class362.field5135.method372(0, null);
        }
        if ((arg5 & 0x2) == 0) {
            for (int var13 = class136.field1978; var13 < class634.field8744; var13++) {
                if (var13 < arg2 || arg1 == null) {
                    int var23 = class589.field8299.length;
                    if (class589.field8299.length + class24.field338 > class492.field6939) {
                        var23 -= class589.field8299.length + class24.field338 - class492.field6939;
                    }
                    int var24 = class589.field8299[0].length;
                    if (class589.field8299[0].length + class513.field7322 > class365.field5171) {
                        var24 -= class589.field8299[0].length + class513.field7322 - class365.field5171;
                    }
                    boolean[][] var25 = class178.field2384;
                    if (class317.field4405) {
                        if (class661.field9049) {
                            var25 = class373.field5239[var13];
                        }
                        for (int var26 = class542.field7577; var26 < var23; var26++) {
                            int var27 = class24.field338 + var26 - class542.field7577;
                            for (int var28 = class280.field3976; var28 < var24; var28++) {
                                if (class589.field8299[var26][var28] && !class662.method3629(var13, 843095752, class513.field7322 + var28 - class280.field3976, var27)) {
                                    var25[var26][var28] = true;
                                } else {
                                    var25[var26][var28] = false;
                                }
                            }
                        }
                    }
                    if (class661.field9049) {
                        if (arg4 >= 0) {
                            class459.field6474[var13].method1823(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class459.field6474[var13].method1817(0, 0, 0, null, false, arg5);
                        }
                        for (int var29 = 0; var29 < class679.field9327; var29++) {
                            class668.field9078[var29].method2264(new class403(var13 + 1), -20613);
                        }
                    } else if (arg4 >= 0) {
                        class459.field6474[var13].method1823(class136.field1982, class481.field6801, class453.field6405, class178.field2384, true, arg4, arg5);
                    } else {
                        class459.field6474[var13].method1817(class136.field1982, class481.field6801, class453.field6405, class178.field2384, true, arg5);
                    }
                } else {
                    int var14 = class589.field8299.length;
                    if (class589.field8299.length + class24.field338 > class492.field6939) {
                        var14 -= class589.field8299.length + class24.field338 - class492.field6939;
                    }
                    int var15 = class589.field8299[0].length;
                    if (class589.field8299[0].length + class513.field7322 > class365.field5171) {
                        var15 -= class589.field8299[0].length + class513.field7322 - class365.field5171;
                    }
                    boolean[][] var16 = class178.field2384;
                    if (class317.field4405) {
                        if (class661.field9049) {
                            var16 = class373.field5239[var13];
                        }
                        for (int var17 = class542.field7577; var17 < var14; var17++) {
                            int var18 = class24.field338 + var17 - class542.field7577;
                            for (int var19 = class280.field3976; var19 < var15; var19++) {
                                var16[var17][var19] = false;
                                if (class589.field8299[var17][var19]) {
                                    int var20 = class513.field7322 + var19 - class280.field3976;
                                    for (int var21 = var13; var21 >= 0; var21--) {
                                        if (class553.field7776[var21][var18][var20] != null && class553.field7776[var21][var18][var20].field2274 == var13) {
                                            if ((var21 < arg2 || arg1[var21][var18][var20] != arg3) && !class662.method3629(var13, 843095752, var20, var18)) {
                                                var16[var17][var19] = true;
                                                break;
                                            }
                                            var16[var17][var19] = false;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class661.field9049) {
                        if (arg4 >= 0) {
                            class459.field6474[var13].method1823(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class459.field6474[var13].method1817(0, 0, 0, null, false, arg5);
                        }
                        for (int var22 = 0; var22 < class679.field9327; var22++) {
                            class668.field9078[var22].method2264(new class403(var13 + 1), -20613);
                        }
                    } else if (arg4 >= 0) {
                        class459.field6474[var13].method1823(class136.field1982, class481.field6801, class453.field6405, class178.field2384, false, arg4, arg5);
                    } else {
                        class459.field6474[var13].method1817(class136.field1982, class481.field6801, class453.field6405, class178.field2384, false, arg5);
                    }
                }
            }
        }
        if (class347.field4911 > 0) {
            class565.method3260(class499.field7163, 0, class347.field4911 - 1);
            for (int var30 = 0; var30 < class347.field4911; var30++) {
                class531.method3094(class499.field7163[var30], true, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILta;I)Z")
    public final boolean method2529(int arg0, class210 arg1, int arg2) {
        field5800++;
        if (this.field5789 == 0) {
            return false;
        } else {
            this.field5796[arg2 & this.field5789].method1508(arg0, -40, arg1);
            return true;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)Z")
    public final boolean method2530(int arg0, int arg1) {
        field5794++;
        if (arg1 != -1312) {
            this.method2530(50, -54);
        }
        return this.field5796[arg0].method1507((byte) 56);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIZZII)V")
    public final void method2531(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5) {
        field5792++;
        if (arg1 != 1) {
            this.field5789 = -25;
        }
        boolean var7 = arg2 & this.field5793.method396();
        if (!var7 && (arg5 == 4 || arg5 == 8 || arg5 == 9)) {
            if (arg5 == 4) {
                arg4 = arg0;
            }
            arg5 = 2;
        }
        if (arg5 != 0 && arg3) {
            arg5 |= Integer.MIN_VALUE;
        }
        if (this.field5789 != arg5) {
            if (this.field5789 != 0) {
                this.field5796[this.field5789 & Integer.MAX_VALUE].method1513(98);
            }
            if (arg5 != 0) {
                this.field5796[Integer.MAX_VALUE & arg5].method1509(true, arg3);
                this.field5796[arg5 & Integer.MAX_VALUE].method1506(17660, arg3);
                this.field5796[Integer.MAX_VALUE & arg5].method1512(arg0, 114, arg4);
            }
            this.field5797 = arg0;
            this.field5799 = arg4;
            this.field5789 = arg5;
        } else if (this.field5789 != 0) {
            this.field5796[Integer.MAX_VALUE & this.field5789].method1506(arg1 ^ 0x44FD, arg3);
            if (this.field5797 != arg0 || this.field5799 != arg4) {
                this.field5796[Integer.MAX_VALUE & this.field5789].method1512(arg0, arg1 + 95, arg4);
                this.field5799 = arg4;
                this.field5797 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V")
    public static void method2532(byte arg0) {
        if (arg0 == -122) {
            field5791 = null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Leea;)V")
    public class409(class131 arg0) {
        this.field5793 = arg0;
        this.field5795 = new class538(arg0);
        this.field5796 = new class631[10];
        this.field5796[1] = new class404(arg0);
        this.field5796[2] = new class548(arg0, this.field5795);
        this.field5796[4] = new class514(arg0, this.field5795);
        this.field5796[5] = new class377(arg0, this.field5795);
        this.field5796[6] = new class506(arg0);
        this.field5796[7] = new class235(arg0);
        this.field5796[3] = this.field5790 = new class654(arg0);
        this.field5796[8] = new class294(arg0, this.field5795);
        this.field5796[9] = new class673(arg0, this.field5795);
        if (!this.field5796[8].method1507((byte) -127)) {
            this.field5796[8] = this.field5796[4];
        }
        if (!this.field5796[9].method1507((byte) 59)) {
            this.field5796[9] = this.field5796[8];
        }
    }
}

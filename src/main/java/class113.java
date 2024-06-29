import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class113 {

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public int field1190 = 128;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public int field1197 = 128;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public int field1192;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public int field1196;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public int field1193;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public int field1189;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "Lgk;")
    public static class616 field1194 = new class616();

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "[C")
    public static char[] field1199 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)Lrf;")
    public final class113 method598(int arg0) {
        field1198++;
        if (arg0 != -1) {
            this.method598(108);
        }
        return new class113(this.field1192, this.field1197, this.field1190, this.field1189, this.field1196, this.field1193);
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
    public static void method599(int arg0) {
        if (arg0 != 0) {
            method601(60, (byte) 81);
        }
        field1194 = null;
        field1199 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZLrf;)V")
    public final void method600(boolean arg0, class113 arg1) {
        field1200++;
        this.field1197 = arg1.field1197;
        this.field1192 = arg1.field1192;
        this.field1196 = arg1.field1196;
        this.field1190 = arg1.field1190;
        if (!arg0) {
            this.field1189 = arg1.field1189;
            this.field1193 = arg1.field1193;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)Z")
    public static final boolean method601(int arg0, byte arg1) {
        field1191++;
        if (arg1 <= 121) {
            return false;
        } else {
            return arg0 == 3 || arg0 == 5 || arg0 == 6;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)V")
    public static final void method602(boolean arg0) {
        field1195++;
        for (int var1 = 0; var1 < class394.field5341; var1++) {
            class651.field9147[var1] = null;
        }
        class394.field5341 = 0;
        for (int var2 = 0; var2 < class612.field8618; var2++) {
            for (int var46 = 0; var46 < class122.field1369; var46++) {
                for (int var47 = 0; var47 < class247.field3058; var47++) {
                    class499 var48 = class487.field7044[var2][var47][var46];
                    if (var48 != null) {
                        if (var48.field7232 > 0) {
                            var48.field7232 = (short) (var48.field7232 * -1);
                        }
                        if (var48.field7216 > 0) {
                            var48.field7216 = (short) (var48.field7216 * -1);
                        }
                    }
                }
            }
        }
        if (arg0) {
            field1194 = null;
        }
        for (int var3 = 0; var3 < class612.field8618; var3++) {
            for (int var4 = 0; var4 < class122.field1369; var4++) {
                for (int var5 = 0; var5 < class247.field3058; var5++) {
                    class499 var6 = class487.field7044[var3][var5][var4];
                    if (var6 != null) {
                        boolean var7 = class487.field7044[0][var5][var4] != null && class487.field7044[0][var5][var4].field7225 != null;
                        if (var6.field7232 < 0) {
                            int var8 = var4;
                            int var9 = var4;
                            int var10 = var3;
                            int var11 = var3;
                            class499 var12 = class487.field7044[var3][var5][var4 - 1];
                            int var13 = class385.field5193[var3].method1608(var4, 840, var5);
                            while (var8 > 0 && var12 != null && var12.field7232 < 0 && var6.field7232 == var12.field7232 && var6.field7214 == var12.field7214 && var13 == class385.field5193[var3].method1608(var8 - 1, 840, var5) && ((var8 - 1) <= 0 || var13 == class385.field5193[var3].method1608(var8 - 2, 840, var5))) {
                                var8--;
                                var12 = class487.field7044[var3][var5][var8 - 1];
                            }
                            for (class499 var14 = class487.field7044[var3][var5][var4 + 1]; var9 < class247.field3058 && var14 != null && var14.field7232 < 0 && var6.field7232 == var14.field7232 && var6.field7214 == var14.field7214 && class385.field5193[var3].method1608(var9 + 1, 840, var5) == var13 && (var9 + 1 >= class247.field3058 || var13 == class385.field5193[var3].method1608(var9 + 2, 840, var5)); var14 = class487.field7044[var3][var5][var9 + 1]) {
                                var9++;
                            }
                            label304: while (var10 > 0) {
                                for (int var15 = var8; var15 <= var9; var15++) {
                                    if (class487.field7044[var10 - 1][var5][var15] == null || class487.field7044[var10 - 1][var5][var15].field7232 != var6.field7232 || class487.field7044[var10 - 1][var5][var15].field7214 != var6.field7214) {
                                        break label304;
                                    }
                                }
                                var10--;
                            }
                            label321: while (var11 < class612.field8618 - 1) {
                                for (int var16 = var8; var16 <= var9; var16++) {
                                    if (class487.field7044[var11 + 1][var5][var16] == null || class487.field7044[var11 + 1][var5][var16].field7232 != var6.field7232 || class487.field7044[var11 + 1][var5][var16].field7214 != var6.field7214) {
                                        break label321;
                                    }
                                }
                                var11++;
                            }
                            int var17 = var11 + 1 - var10;
                            int var18 = class385.field5193[var7 ? var10 + 1 : var10].method1608(var8, 840, var5);
                            int var19 = var18 + (var6.field7232 * var17);
                            int var20 = class385.field5193[var7 ? var10 + 1 : var10].method1608(var9 + 1, 840, var5);
                            int var21 = var20 + (var6.field7232 * var17);
                            int var22 = var5 << class559.field7984;
                            int var23 = var8 << class559.field7984;
                            int var24 = (var9 << class559.field7984) + class171.field1904;
                            class651.field9147[class394.field5341++] = new class603(1, var11, var6.field7214 + var22, var6.field7214 + var22, var6.field7214 + var22, var22 - -var6.field7214, var18, var20, var21, var19, var23, var24, var24, var23);
                            for (int var25 = var10; var25 <= var11; var25++) {
                                for (int var26 = var8; var26 <= var9; var26++) {
                                    class487.field7044[var25][var5][var26].field7232 = (short) (class487.field7044[var25][var5][var26].field7232 * -1);
                                }
                            }
                        }
                        if (var6.field7216 < 0) {
                            int var27 = var5;
                            int var28 = var5;
                            int var29 = var3;
                            int var30 = var3;
                            class499 var31 = class487.field7044[var3][var5 - 1][var4];
                            int var32 = class385.field5193[var3].method1608(var4, 840, var5);
                            while (var27 > 0 && var31 != null && var31.field7216 < 0 && var6.field7216 == var31.field7216 && var6.field7224 == var31.field7224 && class385.field5193[var3].method1608(var4, 840, var27 - 1) == var32 && ((var27 - 1) <= 0 || var32 == class385.field5193[var3].method1608(var4, 840, var27 - 2))) {
                                var27--;
                                var31 = class487.field7044[var3][var27 - 1][var4];
                            }
                            for (class499 var33 = class487.field7044[var3][var5 + 1][var4]; class122.field1369 > var28 && var33 != null && var33.field7216 < 0 && var6.field7216 == var33.field7216 && var6.field7224 == var33.field7224 && class385.field5193[var3].method1608(var4, 840, var28 + 1) == var32 && ((var28 + 1) >= class122.field1369 || class385.field5193[var3].method1608(var4, 840, var28 + 2) == var32); var33 = class487.field7044[var3][var28 + 1][var4]) {
                                var28++;
                            }
                            label220: while (var29 > 0) {
                                for (int var34 = var27; var34 <= var28; var34++) {
                                    if (class487.field7044[var29 - 1][var34][var4] == null || class487.field7044[var29 - 1][var34][var4].field7216 != var6.field7216 || class487.field7044[var29 - 1][var34][var4].field7224 != var6.field7224) {
                                        break label220;
                                    }
                                }
                                var29--;
                            }
                            label205: while (var30 < class612.field8618 - 1) {
                                for (int var35 = var27; var35 <= var28; var35++) {
                                    if (class487.field7044[var30 + 1][var35][var4] == null || class487.field7044[var30 + 1][var35][var4].field7216 != var6.field7216 || class487.field7044[var30 + 1][var35][var4].field7224 != var6.field7224) {
                                        break label205;
                                    }
                                }
                                var30++;
                            }
                            int var36 = var30 + 1 - var29;
                            int var37 = class385.field5193[var7 ? var29 + 1 : var29].method1608(var4, 840, var27);
                            int var38 = var6.field7216 * var36 + var37;
                            int var39 = class385.field5193[var7 ? var29 + 1 : var29].method1608(var4, 840, var28 + 1);
                            int var40 = var39 + (var6.field7216 * var36);
                            int var41 = var27 << class559.field7984;
                            int var42 = (var28 << class559.field7984) + class171.field1904;
                            int var43 = var4 << class559.field7984;
                            class651.field9147[class394.field5341++] = new class603(2, var30, var41, var42, var42, var41, var37, var39, var40, var38, var43 + var6.field7224, var6.field7224 + var43, var6.field7224 + var43, var43 - -var6.field7224);
                            for (int var44 = var29; var44 <= var30; var44++) {
                                for (int var45 = var27; var45 <= var28; var45++) {
                                    class487.field7044[var44][var45][var4].field7216 = (short) (class487.field7044[var44][var45][var4].field7216 * -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        class667.field9319 = true;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(I)V")
    public class113(int arg0) {
        this.field1192 = arg0;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(IIIIII)V")
    private class113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1196 = arg4;
        this.field1197 = arg1;
        this.field1193 = arg5;
        this.field1190 = arg2;
        this.field1189 = arg3;
        this.field1192 = arg0;
    }
}

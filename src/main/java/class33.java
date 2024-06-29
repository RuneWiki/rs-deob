import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public abstract class class33 {

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "Lhq;")
    public static class365 field369 = new class365(16);

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "I")
    public static int field370 = 0;

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "Lwo;")
    public static class285 field365;

    static {
        new class72("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIIIBI)V", line = 14)
    public static final void method216(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        class402.method2514(false, arg1);
        field366++;
        int var7 = 0;
        int var8 = arg1 - arg6;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        int var10 = -arg1;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (class53.field624 <= arg0 && arg0 <= class118.field1356) {
            int[] var14 = class228.field2877[arg0];
            int var15 = class65.method376(class295.field3937, class427.field5844, arg2 - arg1, (byte) 95);
            int var16 = class65.method376(class295.field3937, class427.field5844, arg1 + arg2, (byte) -53);
            int var17 = class65.method376(class295.field3937, class427.field5844, arg2 - var8, (byte) 108);
            int var18 = class65.method376(class295.field3937, class427.field5844, arg2 + var8, (byte) -121);
            class384.method2394(arg4, 101, var14, var17, var15);
            class384.method2394(arg3, arg5 ^ 0x49, var14, var18, var17);
            class384.method2394(arg4, 126, var14, var16, var18);
        }
        int var19 = -1;
        while (var7 < var9) {
            var19 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var19;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class212.field2593[var11] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg0 - var9;
                int var21 = arg0 + var9;
                if (var21 >= class53.field624 && class118.field1356 >= var20) {
                    if (var9 < var8) {
                        int var22 = class212.field2593[var9];
                        int var23 = class65.method376(class295.field3937, class427.field5844, arg2 + var7, (byte) 117);
                        int var24 = class65.method376(class295.field3937, class427.field5844, arg2 - var7, (byte) 98);
                        int var25 = class65.method376(class295.field3937, class427.field5844, arg2 + var22, (byte) -111);
                        int var26 = class65.method376(class295.field3937, class427.field5844, arg2 - var22, (byte) 85);
                        if (class118.field1356 >= var21) {
                            int[] var27 = class228.field2877[var21];
                            class384.method2394(arg4, 127, var27, var26, var24);
                            class384.method2394(arg3, 95, var27, var25, var26);
                            class384.method2394(arg4, arg5 + 44, var27, var23, var25);
                        }
                        if (var20 >= class53.field624) {
                            int[] var28 = class228.field2877[var20];
                            class384.method2394(arg4, 116, var28, var26, var24);
                            class384.method2394(arg3, arg5 + 70, var28, var25, var26);
                            class384.method2394(arg4, 101, var28, var23, var25);
                        }
                    } else {
                        int var29 = class65.method376(class295.field3937, class427.field5844, arg2 + var7, (byte) 87);
                        int var30 = class65.method376(class295.field3937, class427.field5844, arg2 - var7, (byte) 113);
                        if (class118.field1356 >= var21) {
                            class384.method2394(arg4, arg5 ^ 0x43, class228.field2877[var21], var29, var30);
                        }
                        if (var20 >= class53.field624) {
                            class384.method2394(arg4, arg5 + 60, class228.field2877[var20], var29, var30);
                        }
                    }
                }
            }
            int var31 = arg0 - var7;
            int var32 = arg0 + var7;
            if (class53.field624 <= var32 && class118.field1356 >= var31) {
                int var33 = arg2 + var9;
                int var34 = arg2 - var9;
                if (var33 >= class295.field3937 && var34 <= class427.field5844) {
                    int var35 = class65.method376(class295.field3937, class427.field5844, var33, (byte) -99);
                    int var36 = class65.method376(class295.field3937, class427.field5844, var34, (byte) 127);
                    if (var8 > var7) {
                        int var37 = var7 > var11 ? class212.field2593[var7] : var11;
                        int var38 = class65.method376(class295.field3937, class427.field5844, arg2 + var37, (byte) -69);
                        int var39 = class65.method376(class295.field3937, class427.field5844, arg2 - var37, (byte) 86);
                        if (var32 <= class118.field1356) {
                            int[] var40 = class228.field2877[var32];
                            class384.method2394(arg4, 106, var40, var39, var36);
                            class384.method2394(arg3, 116, var40, var38, var39);
                            class384.method2394(arg4, arg5 ^ 0x4B, var40, var35, var38);
                        }
                        if (var31 >= class53.field624) {
                            int[] var41 = class228.field2877[var31];
                            class384.method2394(arg4, 116, var41, var39, var36);
                            class384.method2394(arg3, arg5 ^ 0x5F, var41, var38, var39);
                            class384.method2394(arg4, 113, var41, var35, var38);
                        }
                    } else {
                        if (var32 <= class118.field1356) {
                            class384.method2394(arg4, 99, class228.field2877[var32], var35, var36);
                        }
                        if (class53.field624 <= var31) {
                            class384.method2394(arg4, 114, class228.field2877[var31], var35, var36);
                        }
                    }
                }
            }
        }
        if (arg5 != 52) {
            field369 = null;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lwo;Lwo;Z)V", line = 201)
    public static final void method217(class285 arg0, class285 arg1, boolean arg2) {
        class234.field3082 = arg1;
        if (arg2) {
            field368++;
            class6.field41 = arg0;
            class304.field4081 = class234.field3082.method1821(49, 3);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V", line = 214)
    public static void method218(int arg0) {
        field369 = null;
        field365 = null;
        if (arg0 != -1) {
            field365 = null;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "([J[IB)V", line = 233)
    public static final void method219(long[] arg0, int[] arg1, byte arg2) {
        field367++;
        if (arg2 != -86) {
            field369 = null;
        }
        class337.method2160(arg0.length - 1, arg1, (byte) -105, arg0, 0);
    }
}

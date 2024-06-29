import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class class13 {

    @OriginalMember(owner = "client!i", name = "b", descriptor = "Z")
    public static boolean field213 = false;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "Lbd;")
    public static class162 field214 = class17.method142(0, "::clientdrop");

    @OriginalMember(owner = "client!i", name = "i", descriptor = "[Laf;")
    public static class223[] field220 = new class223[0];

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field217 = 0;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "F")
    public static float field219;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "Lda;")
    public static class143 field216;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[BIIZ[Lqd;BI)V", line = 24)
    public static final void method110(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4, class179[] arg5, byte arg6, int arg7) {
        if (arg6 != -80) {
            method115(99);
        }
        field215++;
        if (!arg4) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if (arg3 + var9 > 0 && (arg3 + var9) < 103 && arg7 + var10 > 0 && (arg7 + var10) < 103) {
                            arg5[var8].field3061[arg3 + var9][arg7 + var10] = class92.method695(arg5[var8].field3061[arg3 + var9][arg7 + var10], -16777217);
                        }
                    }
                }
            }
        }
        byte var11;
        if (arg4) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        class94 var12 = new class94(arg1);
        for (int var13 = 0; var13 < var11; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class139.method1083(var15 + arg7, var12, arg3 + var14, arg2, -2, 0, var13, arg0, arg4);
                }
            }
        }
        if (!class117.field2159 || arg4) {
            return;
        }
        class160 var16 = null;
        while (true) {
            while (var12.field1653 < var12.field1681.length) {
                int var17 = var12.method756(915905888);
                if (var17 == 0) {
                    var16 = new class160(var12);
                } else if (var17 == 1) {
                    int var18 = var12.method756(915905888);
                    if (var18 > 0) {
                        for (int var19 = 0; var19 < var18; var19++) {
                            class196 var20 = new class196(var12);
                            var20.field3335 += arg7 << 7;
                            var20.field3334 += arg3 << 7;
                            int var21 = var20.field3334 >> 7;
                            int var22 = var20.field3335 >> 7;
                            if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104) {
                                var20.field3352 = class206.field3473[var20.field3337][var21][var22] - var20.field3352;
                                class221.method1598(var20);
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            if (var16 == null) {
                var16 = new class160();
            }
            for (int var23 = 0; var23 < 8; var23++) {
                for (int var24 = 0; var24 < 8; var24++) {
                    int var25 = (arg7 >> 3) + var24;
                    int var26 = (arg3 >> 3) + var23;
                    if (var26 >= 0 && var26 < 13 && var25 >= 0 && var25 < 13) {
                        class96.field1758[var26][var25] = var16;
                    }
                }
            }
            break;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lob;I)Lbd;", line = 198)
    public static final class162 method113(class78 arg0, int arg1) {
        if (arg1 != 0) {
            field217 = 53;
        }
        field221++;
        if (class148.method1173(-172139252, client.method861(arg0)) == 0) {
            return null;
        } else if (arg0.field1267 == null || arg0.field1267.method1278(-1).method1249((byte) -118) == 0) {
            return class255.field4223 ? class101.field1846 : null;
        } else {
            return arg0.field1267;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZLda;)V", line = 233)
    public static final void method114(boolean arg0, class143 arg1) {
        if (arg0) {
            class42.field693 = arg1;
            class213.field3573 = class42.field693.method1121(4, (byte) -114);
            field218++;
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V", line = 249)
    public static void method115(int arg0) {
        field216 = null;
        if (arg0 != 20257) {
            field214 = (class162) null;
        }
        field214 = null;
        field220 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)[B")
    public abstract byte[] method111(int arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[B)V")
    public abstract void method112(int arg0, byte[] arg1);
}

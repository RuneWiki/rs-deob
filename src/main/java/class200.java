import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class200 extends class239 {

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
    private final int field3618;

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "I")
    private final int field3628;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    private final int field3620;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    private final int field3609;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    private final int field3608;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    private final int field3612;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    private final int field3610;

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "I")
    private final int field3626;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field3614 = 0;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    public static int field3619 = -1;

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "Lsf;")
    public static class108 field3624 = class140.method973(255, "scrollen:");

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "F")
    public static float field3621;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!ta", name = "C", descriptor = "Lik;")
    public static class262 field3627;

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "[[Lcl;")
    public static class133[][] field3623;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)V", line = 9)
    public static final void method1412(int arg0, int arg1) {
        class74 var2 = class99.field1759[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class74 var4 = class99.field1759[var3][arg0][arg1] = class99.field1759[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field1131--;
                for (int var5 = 0; var5 < var4.field1119; var5++) {
                    class326 var6 = var4.field1118[var5];
                    if ((var6.field5563 >> 29 & 0x3L) == 2L && var6.field5575 == arg0 && var6.field5576 == arg1) {
                        var6.field5559--;
                    }
                }
            }
        }
        if (class99.field1759[0][arg0][arg1] == null) {
            class99.field1759[0][arg0][arg1] = new class74(0, arg0, arg1);
        }
        class99.field1759[0][arg0][arg1].field1120 = var2;
        class99.field1759[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZLsf;I)V", line = 46)
    public static final void method1413(boolean arg0, class108 arg1, int arg2) {
        if (arg2 != 3) {
            return;
        }
        field3625++;
        if (!arg0) {
            try {
                class143.field2518.getAppletContext().showDocument(arg1.method758(-28019, class143.field2518.getCodeBase()), "_top");
            } catch (Exception var7) {
            }
            return;
        }
        if (class231.field4051 && class132.field2263) {
            try {
                class33.method224((byte) 100, class289.field5052.field2441, new Object[] { arg1.method758(arg2 ^ 0xFFFF928E, class143.field2518.getCodeBase()).toString() }, "openjs");
                return;
            } catch (Throwable var8) {
            }
        }
        try {
            class143.field2518.getAppletContext().showDocument(arg1.method758(arg2 - 28022, class143.field2518.getCodeBase()), "_blank");
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(III)Lam;", line = 89)
    public static final class258 method1414(int arg0, int arg1, int arg2) {
        class74 var3 = class99.field1759[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class258 var4 = var3.field1141;
            var3.field1141 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V", line = 104)
    public static void method1415(int arg0) {
        if (arg0 != 1) {
            method1414(-103, -63, -33);
        }
        field3627 = null;
        field3624 = null;
        field3623 = (class133[][]) null;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V", line = 123)
    public static final void method1416(int arg0) {
        class10.field127.method644((byte) 124);
        int var1 = 12 / ((49 - arg0) / 58);
        field3611++;
        class177.field3226.method644((byte) 105);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(III)V", line = 143)
    public final void method1417(int arg0, int arg1, int arg2) {
        field3616++;
        if (arg1 != -1) {
            field3627 = (class262) null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BIIIII)V", line = 157)
    public static final void method1418(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3622++;
        long var6 = class282.method2031(arg3, arg5, arg4);
        if (arg0 != -15) {
            method1418((byte) -68, -44, 72, -25, -73, 78);
        }
        if (var6 != 0L) {
            int var8 = (int) var6 >> 20 & 0x3;
            int var9 = ((int) var6 & 0x7C9C3) >> 14;
            int var10 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            class60 var11 = class201.method1424(var10, (byte) 114);
            if (var11.field923 == -1) {
                int var14 = arg2;
                if (var6 > 0L) {
                    var14 = arg1;
                }
                int[] var15 = class28.field427;
                int var16 = (52736 - (arg4 * 512)) * 4 + arg5 * 4 + 24624;
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var8 == 1) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var8 == 2) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 512 + 3] = var14;
                        var15[var16 + 3 + 1024] = var14;
                        var15[var16 + 1539] = var14;
                    } else if (var8 == 3) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1537] = var14;
                        var15[var16 + 1536 + 2] = var14;
                        var15[var16 + 1539] = var14;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var15[var16] = var14;
                    } else if (var8 == 1) {
                        var15[var16 + 3] = var14;
                    } else if (var8 == 2) {
                        var15[var16 + 1536 + 3] = var14;
                    } else if (var8 == 3) {
                        var15[var16 + 1536] = var14;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var8 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var8 == 1) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 3 + 512] = var14;
                        var15[var16 + 1024 + 3] = var14;
                        var15[var16 + 1536 + 3] = var14;
                    } else if (var8 == 2) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1537] = var14;
                        var15[var16 + 2 + 1536] = var14;
                        var15[var16 + 1536 + 3] = var14;
                    }
                }
            } else {
                class257 var12 = null;
                int var13 = var11.field899;
                if (!var11.field951) {
                    var12 = class203.field3664[var11.field923];
                } else if (var8 == 0) {
                    var12 = class203.field3664[var11.field923];
                } else if (var8 == 1) {
                    var13 = var11.field939;
                    var12 = class145.field2623[var11.field923];
                } else if (var8 == 2) {
                    var12 = class51.field740[var11.field923];
                } else if (var8 == 3) {
                    var12 = class73.field1109[var11.field923];
                    var13 = var11.field939;
                }
                if (var12 != null) {
                    var12.method404((arg5 * 4) + 48, (-var13 + 104 - arg4) * 4 + 48);
                }
            }
        }
        long var17 = class312.method2175(arg3, arg5, arg4);
        if (var17 != 0L) {
            int var19 = (int) var17 >> 20 & 0x3;
            int var20 = ((int) var17 & 0x7F81F) >> 14;
            int var21 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            class60 var22 = class201.method1424(var21, (byte) 118);
            if (var22.field923 != -1) {
                class257 var26 = null;
                int var27 = var22.field899;
                if (!var22.field951) {
                    var26 = class203.field3664[var22.field923];
                } else if (var19 == 0) {
                    var26 = class203.field3664[var22.field923];
                } else if (var19 == 1) {
                    var26 = class145.field2623[var22.field923];
                    var27 = var22.field939;
                } else if (var19 == 2) {
                    var26 = class51.field740[var22.field923];
                } else if (var19 == 3) {
                    var26 = class73.field1109[var22.field923];
                    var27 = var22.field939;
                }
                if (var26 != null) {
                    var26.method404(arg5 * 4 + 48, (104 - arg4 + -var27) * 4 + 48);
                }
            } else if (var20 == 9) {
                int var23 = 15658734;
                if (var17 > 0L) {
                    var23 = 15597568;
                }
                int[] var24 = class28.field427;
                int var25 = (103 - arg4) * 512 * 4 + ((arg5 * 4) + 24624);
                if (var19 == 0 || var19 == 2) {
                    var24[var25 + 1536] = var23;
                    var24[var25 + 1 + 1024] = var23;
                    var24[var25 + 2 + 512] = var23;
                    var24[var25 + 3] = var23;
                } else {
                    var24[var25] = var23;
                    var24[var25 + 513] = var23;
                    var24[var25 + 1024 + 2] = var23;
                    var24[var25 + 3 + 1536] = var23;
                }
            }
        }
        long var28 = class45.method325(arg3, arg5, arg4);
        if (var28 == 0L) {
            return;
        }
        int var30 = Integer.MAX_VALUE & (int) (var28 >>> 32);
        class60 var31 = class201.method1424(var30, (byte) 97);
        int var32 = ((int) var28 & 0x3466DC) >> 20;
        if (var31.field923 == -1) {
            return;
        }
        class257 var33 = null;
        int var34 = var31.field899;
        if (!var31.field951) {
            var33 = class203.field3664[var31.field923];
        } else if (var32 == 0) {
            var33 = class203.field3664[var31.field923];
        } else if (var32 == 1) {
            var34 = var31.field939;
            var33 = class145.field2623[var31.field923];
        } else if (var32 == 2) {
            var33 = class51.field740[var31.field923];
        } else if (var32 == 3) {
            var34 = var31.field939;
            var33 = class73.field1109[var31.field923];
        }
        if (var33 != null) {
            var33.method404(arg5 * 4 + 48, 48 - -((104 - arg4 + -var34) * 4));
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 475)
    public class200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3618 = arg0;
        this.field3628 = arg6;
        this.field3620 = arg4;
        this.field3609 = arg5;
        this.field3608 = arg2;
        this.field3612 = arg7;
        this.field3610 = arg3;
        this.field3626 = arg1;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V", line = 491)
    public final void method1419(int arg0, int arg1, int arg2) {
        field3617++;
        int var4 = this.field3608 * arg0 >> 12;
        int var5 = this.field3626 * arg2 >> 12;
        int var6 = this.field3610 * arg2 >> 12;
        int var7 = this.field3620 * arg0 >> 12;
        int var8 = this.field3618 * arg0 >> 12;
        int var9 = this.field3609 * arg2 >> 12;
        int var10 = this.field3628 * arg0 >> 12;
        int var11 = this.field3612 * arg2 >> 12;
        if (arg1 != -1) {
            field3619 = -56;
        }
        class145.method999(var9, var6, 0, var10, var11, this.field4168, var8, var5, var4, var7);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZII)V", line = 521)
    public final void method1420(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method1418((byte) -2, -27, 66, 65, -60, -63);
        }
        field3615++;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class267 extends class96 {

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "I")
    private int field3381 = 585;

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "I")
    public static int field3382 = 0;

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "I")
    public static int field3384 = 1;

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "Z")
    public static boolean field3387;

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "[I")
    public static int[] field3388;

    @OriginalMember(owner = "client!jg", name = "K", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!jg", name = "N", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!jg", name = "P", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!jg", name = "Q", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "I")
    public static int field3389;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jg", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field3390;

    // $FF: synthetic method
    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1656(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class169("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
        field3387 = true;
        field3388 = new int[3];
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V", line = 3)
    public class267() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILbt;)V", line = 6)
    public final void method31(int arg0, int arg1, class88 arg2) {
        if (~arg0 == -1) {
            this.field3381 = arg2.method568((byte) 110);
        }
        ++field3380;
        if (arg1 != -1) {
            field3382 = -84;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BII)I", line = 32)
    public static final int method1653(byte arg0, int arg1, int arg2) {
        ++field3386;
        if (arg0 != 50) {
            return 100;
        } else if (arg2 == -2) {
            return 12345678;
        } else if (~arg2 == 0) {
            if (~arg1 > -3) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (127 & arg2) * arg1 >> 7;
            if (~var3 <= -3) {
                if (~var3 < -127) {
                    var3 = 126;
                }
            } else {
                var3 = 2;
            }
            return (arg2 & 65408) - -var3;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIIII)V", line = 67)
    public static final void method1654(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3383;
        if (~arg5 <= -1 && arg2 >= 0 && class200.field2594 + -1 > arg5 && class118.field1647 - 1 > arg2) {
            if (class470.field6877 == null) {
                return;
            }
            if (~arg0 != -1) {
                if (arg0 == 1) {
                    class323 var8 = (class323) class301.method1806(arg6, arg5, arg2);
                    if (var8 != null) {
                        if (!(var8 instanceof class172)) {
                            int var9 = var8.method413(-30502);
                            if (~arg1 != -5 && arg1 != 5) {
                                if (~arg1 == -7) {
                                    class192.method1249(arg6, arg3 + 4, arg2, arg0, var9, 105, arg5, 4, arg4);
                                } else if (~arg1 != -8) {
                                    if (~arg1 == -9) {
                                        class192.method1249(arg6, arg3 + 4, arg2, arg0, var9, 109, arg5, 4, arg4);
                                        class192.method1249(arg6, (3 & arg3 + 2) + 4, arg2, arg0, var9, 119, arg5, 4, arg4);
                                    }
                                } else {
                                    class192.method1249(arg6, (3 & arg3 + 2) + 4, arg2, arg0, var9, 95, arg5, 4, arg4);
                                }
                            } else {
                                class192.method1249(arg6, arg3, arg2, arg0, var9, 115, arg5, 4, arg4);
                            }
                        } else {
                            ((class172) var8).field2226.method1285(arg4, (byte) -103);
                        }
                    }
                } else if (arg0 == 2) {
                    class323 var10 = (class323) class346.method2038(arg6, arg5, arg2, field3390 != null ? field3390 : (field3390 = method1656("wk")));
                    if (var10 != null) {
                        if (arg1 == 11) {
                            arg1 = 10;
                        }
                        if (var10 instanceof class279) {
                            ((class279) var10).field3583.method1285(arg4, (byte) -103);
                        } else {
                            class192.method1249(arg6, arg3, arg2, arg0, var10.method413(-30502), 117, arg5, arg1, arg4);
                        }
                    }
                } else if (~arg0 == -4) {
                    class323 var11 = (class323) class205.method1342(arg6, arg5, arg2);
                    if (var11 != null) {
                        if (!(var11 instanceof class347)) {
                            class192.method1249(arg6, arg3, arg2, arg0, var11.method413(-30502), 99, arg5, arg1, arg4);
                        } else {
                            ((class347) var11).field4430.method1285(arg4, (byte) -103);
                        }
                    }
                }
            } else {
                class323 var12 = (class323) class67.method384(arg6, arg5, arg2);
                class323 var13 = (class323) class175.method1140(arg6, arg5, arg2);
                if (var12 != null && arg1 != 2) {
                    if (!(var12 instanceof class73)) {
                        class192.method1249(arg6, arg3, arg2, arg0, var12.method413(-30502), 118, arg5, arg1, arg4);
                    } else {
                        ((class73) var12).field910.method1285(arg4, (byte) -103);
                    }
                }
                if (var13 != null) {
                    if (!(var13 instanceof class73)) {
                        class192.method1249(arg6, arg3, arg2, arg0, var13.method413(-30502), 96, arg5, arg1, arg4);
                    } else {
                        ((class73) var13).field910.method1285(arg4, (byte) -103);
                    }
                }
            }
        }
        int var14 = 85 % ((47 - arg7) / 59);
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(Z)V", line = 188)
    public static void method1655(boolean arg0) {
        if (arg0) {
            field3388 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(II)[I", line = 200)
    public final int[] method37(int arg0, int arg1) {
        ++field3385;
        int[] var3 = super.field1331.method397((byte) -110, arg0);
        if (super.field1331.field863) {
            int var4 = class74.field933[arg0];
            for (int var5 = 0; ~var5 > ~class269.field3403; ++var5) {
                int var6 = class510.field7476[var5];
                if (~this.field3381 > ~var6 && var6 < -this.field3381 + 4096 && var4 > 2048 - this.field3381 && ~(2048 - -this.field3381) < ~var4) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 > -1 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field3381);
                    var3[var5] = 4096 - var10;
                } else if (~var6 < ~(-this.field3381 + 2048) && ~var6 > ~(2048 - -this.field3381)) {
                    int var11 = var4 + -2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field3381;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field3381 + 2048);
                } else if (var4 >= this.field3381 && ~var4 >= ~(-this.field3381 + 4096)) {
                    if (~var6 <= ~this.field3381 && ~var6 >= ~(-this.field3381 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field3381 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 - 2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field3381;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field3381 + 2048);
                }
            }
        }
        if (arg1 != 255) {
            field3387 = true;
        }
        return var3;
    }
}

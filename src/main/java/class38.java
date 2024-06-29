import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class38 extends class97 {

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "I")
    public static int field458 = 0;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "Ljg;")
    public static class241 field462 = new class241(64);

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "[I")
    public static int[] field469 = new int[50];

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public int field453;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    public int field454;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    public int field455;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
    public int field457;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
    public int field459;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
    public int field460;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
    public int field461;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "I")
    public int field463;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
    public int field464;

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "I")
    public int field465;

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "I")
    public int field466;

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "I")
    public int field471;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "I")
    public int field472;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
    public int field473;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
    public static int field474;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lj", name = "J", descriptor = "Ljava/lang/Class;")
    public static Class field475;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lek;Ldr;IIIIII)V")
    public static final void method217(class375 arg0, class261 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field474++;
        class18 var8 = null;
        if (arg3 == arg5) {
            var8 = (class18) class37.method211(arg6, arg2, arg7);
        }
        if (arg5 == 1) {
            var8 = (class18) class213.method1245(arg6, arg2, arg7);
        }
        if (arg5 == 2) {
            var8 = (class18) class51.method293(arg6, arg2, arg7, field475 == null ? (field475 = method222("rc")) : field475);
        }
        if (arg5 == 3) {
            var8 = (class18) class386.method2385(arg6, arg2, arg7);
        }
        if (var8 == null) {
            return;
        }
        int var9 = var8.method9(85);
        int var10 = var8.method3((byte) -106);
        class85 var11 = class411.method2575(0, var8.method7(true));
        if (var11.method554((byte) -10)) {
            class380.method2290(var11, arg6, arg7, arg3 ^ 0x80, arg2);
        }
        if (var8.method1(75)) {
            var8.method6(arg1, -79);
        }
        if (arg5 != 0) {
            if (arg5 == 1) {
                class360.method2171(arg6, arg2, arg7);
                return;
            }
            if (arg5 == 2) {
                class62.method335(arg6, arg2, arg7, field475 == null ? (field475 = method222("rc")) : field475);
                if (var11.field1147 != 0 && class115.field1522 > var11.field1197 + arg2 && (var11.field1197 + arg7) < class198.field3004 && class115.field1522 > var11.field1122 + arg2 && class198.field3004 > (var11.field1122 + arg7)) {
                    arg0.method2252((byte) -126, var11.field1197, var11.field1191, arg2, var11.field1122, !var11.field1143, var10, arg7);
                    return;
                }
                return;
            }
            if (arg5 == 3) {
                class54.method312(arg6, arg2, arg7);
                if (var11.field1147 == 1) {
                    arg0.method2263(arg2, arg7, 21310);
                    return;
                }
            }
            return;
        }
        class276.method1710(arg6, arg2, arg7);
        if (var11.field1147 != 0) {
            arg0.method2256(arg7, var9, !var11.field1143, false, arg2, var10, var11.field1191);
            return;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIZIZZ)V")
    public static final void method218(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, boolean arg6) {
        if (!arg6) {
            field462 = null;
        }
        field467++;
        if (arg2 >= arg4) {
            return;
        }
        int var7 = (arg2 + arg4) / 2;
        int var8 = arg2;
        class432 var9 = class205.field3072[var7];
        class205.field3072[var7] = class205.field3072[arg4];
        class205.field3072[arg4] = var9;
        for (int var10 = arg2; var10 < arg4; var10++) {
            if (class213.method1248(var9, arg1, class205.field3072[var10], arg3, arg5, arg0, -83) <= 0) {
                class432 var11 = class205.field3072[var10];
                class205.field3072[var10] = class205.field3072[var8];
                class205.field3072[var8++] = var11;
            }
        }
        class205.field3072[arg4] = class205.field3072[var8];
        class205.field3072[var8] = var9;
        method218(arg0, arg1, arg2, arg3, var8 - 1, arg5, arg6);
        method218(arg0, arg1, var8 + 1, arg3, arg4, arg5, true);
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V")
    public static void method219(int arg0) {
        field462 = null;
        field469 = null;
        if (arg0 != 2) {
            field458 = -24;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ldr;II)Lwp;")
    public final class292 method220(class261 arg0, int arg1, int arg2) {
        field456++;
        if (arg2 != 14383) {
            this.field466 = -117;
        }
        int var4 = class423.field6228[this.field455];
        if (var4 == 0) {
            class233 var11 = class37.method211(this.field470, this.field472, this.field453);
            if (var11 instanceof class302) {
                class302 var12 = (class302) var11;
                if (var12.field4555 != null) {
                    return ((class18) var12.field4555).method12(arg0, arg1, (byte) -87);
                }
            }
        } else if (var4 == 1) {
            class337 var9 = class213.method1245(this.field470, this.field472, this.field453);
            if (var9 instanceof class82) {
                class82 var10 = (class82) var9;
                if (var10.field1097 != null) {
                    return ((class18) var10.field1097).method12(arg0, arg1, (byte) -11);
                }
            }
        } else if (var4 == 2) {
            class141 var5 = class51.method293(this.field470, this.field472, this.field453, field475 == null ? (field475 = method222("rc")) : field475);
            if (var5 instanceof class314) {
                class314 var6 = (class314) var5;
                if (var6.field4744 != null) {
                    return ((class18) var6.field4744).method12(arg0, arg1, (byte) -87);
                }
            }
        } else if (var4 == 3) {
            class316 var7 = class386.method2385(this.field470, this.field472, this.field453);
            if (var7 instanceof class401) {
                class401 var8 = (class401) var7;
                if (var8.field5970 != null) {
                    return ((class18) var8.field5970).method12(arg0, arg1, (byte) 94);
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)V")
    public static final void method221(int arg0) {
        class354[] var1 = class292.field4454;
        synchronized (class292.field4454) {
            if (arg0 >= -22) {
                method219(50);
            }
            int var2 = 0;
            while (true) {
                if (class292.field4454.length <= var2) {
                    break;
                }
                class292.field4454[var2] = new class354();
                class280.field4288[var2] = 0;
                var2++;
            }
        }
        field468++;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method222(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class151((String) null, "Dieses System darf nicht missbraucht werden!", (String) null, (String) null);
    }
}

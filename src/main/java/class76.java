import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class76 {

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "Lek;")
    private class352 field981 = new class352(256);

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "Lek;")
    private class352 field991 = new class352(256);

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "Lqn;")
    private class47 field987;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "Lqn;")
    private class47 field990;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "Ldq;")
    public static class493 field983 = new class493(50, -1);

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    public static int field992;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jj", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field993;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III[I)Ljc;")
    private final class305 method661(int arg0, int arg1, int arg2, int[] arg3) {
        field988++;
        int var5 = (arg1 >>> 12 | arg1 << 4 & 0xFFF9) ^ arg0;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        if (arg2 != 0) {
            return null;
        }
        class305 var9 = (class305) this.field991.method2022(-1, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class207 var10 = class207.method1286(this.field987, arg1, arg0);
            if (var10 == null) {
                return null;
            }
            class305 var11 = var10.method1287();
            this.field991.method2019((byte) -40, var11, var7);
            if (arg3 != null) {
                arg3[0] -= var11.field3899.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([IIB)Ljc;")
    public final class305 method662(int[] arg0, int arg1, byte arg2) {
        field984++;
        if (this.field990.method472((byte) -82) == 1) {
            return this.method664(0, arg0, arg1, (byte) 38);
        }
        if (arg2 < 45) {
            this.field990 = null;
        }
        if (this.field990.method469(30322, arg1) != 1) {
            throw new RuntimeException();
        }
        return this.method664(arg1, arg0, 0, (byte) 38);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public static void method663(int arg0) {
        if (arg0 != 10) {
            field985 = 110;
        }
        field983 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I[IIB)Ljc;")
    private final class305 method664(int arg0, int[] arg1, int arg2, byte arg3) {
        field992++;
        int var5 = (arg0 >>> 12 | arg0 << 4 & 0xFFF2) ^ arg2;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class305 var9 = (class305) this.field991.method2022(-1, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class396 var10 = (class396) this.field981.method2022(-1, var7);
            if (var10 == null) {
                var10 = class396.method2353(this.field990, arg0, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field981.method2019((byte) -89, var10, var7);
            }
            class305 var11 = var10.method2357(arg1);
            if (var11 == null) {
                return null;
            }
            if (arg3 != 38) {
                field986 = -34;
            }
            var10.method2165(16225);
            this.field991.method2019((byte) -40, var11, var7);
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method665(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 != -45) {
            method663(-128);
        }
        field982++;
        if (arg0 < 0 || arg6 < 0 || arg0 >= (class452.field6526 - 1) || class440.field6307 - 1 <= arg6) {
            return;
        }
        if (class125.field1664 == null) {
            return;
        }
        if (arg5 == 0) {
            class41 var8 = (class41) class20.method173(arg2, arg0, arg6);
            class41 var9 = (class41) class250.method1519(arg2, arg0, arg6);
            if (var8 != null && arg7 != 2) {
                if (var8 instanceof class22) {
                    ((class22) var8).field316.method2837(arg4, 4);
                } else {
                    class194.method1200(arg1, arg0, arg2, 3827, arg4, arg5, arg6, var8.method187(21067), arg7);
                }
            }
            if (var9 != null) {
                if (!(var9 instanceof class22)) {
                    class194.method1200(arg1, arg0, arg2, 3827, arg4, arg5, arg6, var9.method187(arg3 ^ 0xFFFFAD98), arg7);
                    return;
                }
                ((class22) var9).field316.method2837(arg4, 4);
                return;
            }
            return;
        }
        if (arg5 != 1) {
            if (arg5 == 2) {
                class41 var10 = (class41) class212.method1314(arg2, arg0, arg6, field993 == null ? (field993 = method667("fw")) : field993);
                if (var10 != null) {
                    if (arg7 == 11) {
                        arg7 = 10;
                    }
                    if (!(var10 instanceof class293)) {
                        class194.method1200(arg1, arg0, arg2, 3827, arg4, arg5, arg6, var10.method187(21067), arg7);
                        return;
                    }
                    ((class293) var10).field3749.method2837(arg4, arg3 + 49);
                    return;
                }
            } else if (arg5 == 3) {
                class41 var11 = (class41) class238.method1430(arg2, arg0, arg6);
                if (var11 == null) {
                    return;
                }
                if (var11 instanceof class113) {
                    ((class113) var11).field1510.method2837(arg4, 4);
                    return;
                }
                class194.method1200(arg1, arg0, arg2, arg3 + 3872, arg4, arg5, arg6, var11.method187(21067), arg7);
            } else {
                return;
            }
            return;
        }
        class41 var12 = (class41) class140.method952(arg2, arg0, arg6);
        if (var12 == null) {
            return;
        }
        if (var12 instanceof class51) {
            ((class51) var12).field674.method2837(arg4, 4);
            return;
        }
        int var13 = var12.method187(21067);
        if (arg7 != 4 && arg7 != 5) {
            if (arg7 != 6) {
                if (arg7 == 7) {
                    class194.method1200((arg1 + 2 & 0x3) + 4, arg0, arg2, 3827, arg4, arg5, arg6, var13, 4);
                } else if (arg7 == 8) {
                    class194.method1200(arg1 + 4, arg0, arg2, arg3 ^ 0xFFFFF120, arg4, arg5, arg6, var13, 4);
                    class194.method1200((arg1 + 2 & 0x3) + 4, arg0, arg2, 3827, arg4, arg5, arg6, var13, 4);
                    return;
                }
                return;
            }
            class194.method1200(arg1 + 4, arg0, arg2, 3827, arg4, arg5, arg6, var13, 4);
            return;
        }
        class194.method1200(arg1, arg0, arg2, arg3 + 3872, arg4, arg5, arg6, var13, 4);
        return;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I[II)Ljc;")
    public final class305 method666(int arg0, int[] arg1, int arg2) {
        field989++;
        if (this.field987.method472((byte) -82) == 1) {
            return this.method661(arg2, 0, 0, arg1);
        }
        if (arg0 != 2) {
            this.method664(-26, null, -51, (byte) -46);
        }
        if (this.field987.method469(arg0 ^ 0x7670, arg2) != 1) {
            throw new RuntimeException();
        }
        return this.method661(0, arg2, 0, arg1);
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lqn;Lqn;)V")
    public class76(class47 arg0, class47 arg1) {
        this.field987 = arg0;
        this.field990 = arg1;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method667(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

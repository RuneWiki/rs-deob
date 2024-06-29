import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class135 implements class402 {

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public int field1632;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field1633 = 0;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field1636;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lc", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field1637;

    @OriginalMember(owner = "client!lc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1635++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Lku;")
    public static final class362 method639(int arg0) {
        field1636++;
        try {
            int var1 = 24 / ((-arg0 - 65) / 36);
            return (class362) Class.forName("bs").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class135(String arg0, int arg1) {
        this.field1632 = arg1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method640(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field1630++;
        if (arg0 >= 0 && arg6 >= 0 && class159.field1895 - 1 > arg0 && class289.field4316 - 1 > arg6) {
            if (class293.field4356 == null) {
                return;
            }
            if (arg2 == 0) {
                class116 var8 = (class116) class63.method320(arg4, arg0, arg6);
                class116 var9 = (class116) class413.method2448(arg4, arg0, arg6);
                if (var8 != null && arg5 != 2) {
                    if (var8 instanceof class484) {
                        ((class484) var8).field6861.method531(arg1, (byte) -128);
                    } else {
                        class214.method1202(arg3, -2, arg6, arg4, var8.method16(false), arg0, arg2, arg5, arg1);
                    }
                }
                if (var9 != null) {
                    if ((var9 instanceof class484)) {
                        ((class484) var9).field6861.method531(arg1, (byte) -89);
                    } else {
                        class214.method1202(arg3, -2, arg6, arg4, var9.method16(false), arg0, arg2, arg5, arg1);
                    }
                }
            } else if (arg2 == 1) {
                class116 var12 = (class116) class330.method2001(arg4, arg0, arg6);
                if (var12 != null) {
                    if (var12 instanceof class63) {
                        ((class63) var12).field776.method531(arg1, (byte) -104);
                    } else {
                        int var13 = var12.method16(false);
                        if (arg5 == 4 || arg5 == 5) {
                            class214.method1202(arg3, -2, arg6, arg4, var13, arg0, arg2, 4, arg1);
                        } else if (arg5 == 6) {
                            class214.method1202(arg3 + 4, -2, arg6, arg4, var13, arg0, arg2, 4, arg1);
                        } else if (arg5 == 7) {
                            class214.method1202((arg3 + 2 & 0x3) + 4, -2, arg6, arg4, var13, arg0, arg2, 4, arg1);
                        } else if (arg5 == 8) {
                            class214.method1202(arg3 + 4, -2, arg6, arg4, var13, arg0, arg2, 4, arg1);
                            class214.method1202((arg3 + 2 & 0x3) + 4, -2, arg6, arg4, var13, arg0, arg2, 4, arg1);
                        }
                    }
                }
            } else if (arg2 == 2) {
                class116 var10 = (class116) class263.method1603(arg4, arg0, arg6, field1637 == null ? (field1637 = method643("td")) : field1637);
                if (var10 != null) {
                    if (arg5 == 11) {
                        arg5 = 10;
                    }
                    if ((var10 instanceof class413)) {
                        ((class413) var10).field5892.method531(arg1, (byte) -58);
                    } else {
                        class214.method1202(arg3, -2, arg6, arg4, var10.method16(false), arg0, arg2, arg5, arg1);
                    }
                }
            } else if (arg2 == 3) {
                class116 var11 = (class116) class427.method2542(arg4, arg0, arg6);
                if (var11 != null) {
                    if ((var11 instanceof class47)) {
                        ((class47) var11).field608.method531(arg1, (byte) -73);
                    } else {
                        class214.method1202(arg3, -2, arg6, arg4, var11.method16(false), arg0, arg2, arg5, arg1);
                    }
                }
            }
        }
        if (arg7 >= -80) {
            method641(-19, 100, -43, true, true, -99, 27);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIZZII)V")
    public static final void method641(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        field1631++;
        if (arg1 < 110) {
            field1633 = 76;
        }
        if (arg5 >= arg6) {
            return;
        }
        int var7 = (arg5 + arg6) / 2;
        int var8 = arg5;
        class239 var9 = class28.field368[var7];
        class28.field368[var7] = class28.field368[arg6];
        class28.field368[arg6] = var9;
        for (int var10 = arg5; var10 < arg6; var10++) {
            if (class305.method1907(class28.field368[var10], -118, var9, arg4, arg2, arg0, arg3) <= 0) {
                class239 var11 = class28.field368[var10];
                class28.field368[var10] = class28.field368[var8];
                class28.field368[var8++] = var11;
            }
        }
        class28.field368[arg6] = class28.field368[var8];
        class28.field368[var8] = var9;
        method641(arg0, 123, arg2, arg3, arg4, arg5, var8 - 1);
        method641(arg0, 116, arg2, arg3, arg4, var8 + 1, arg6);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method642(byte arg0, String arg1) {
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        field1634++;
        System.exit(1);
        int var2 = 24 / ((23 - arg0) / 49);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method643(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class40("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
    }
}

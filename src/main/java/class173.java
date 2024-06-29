import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class173 {

    @OriginalMember(owner = "client!i", name = "d", descriptor = "[I")
    public static int[] field2001 = new int[25];

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field2004;

    // $FF: synthetic field
    @OriginalMember(owner = "client!i", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field2005;

    // $FF: synthetic field
    @OriginalMember(owner = "client!i", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field2006;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1086(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1998++;
        if (arg0 >= 0 && arg1 >= 0 && (class22.field232 - 1) > arg0 && arg1 < class196.field2329 - 1) {
            if (class347.field4722 == null) {
                return;
            }
            if (arg6 == 0) {
                class171 var12 = (class171) class440.method2708(arg7, arg0, arg1);
                class171 var13 = (class171) class158.method1014(arg7, arg0, arg1);
                if (var12 != null && arg4 != 2) {
                    if ((var12 instanceof class225)) {
                        ((class225) var12).field2851.method2752(-9833, arg2);
                    } else {
                        class307.method1947(arg0, arg4, arg6, arg2, arg5, (byte) -115, arg7, arg1, var12.method409(-50));
                    }
                }
                if (var13 != null) {
                    if (var13 instanceof class225) {
                        ((class225) var13).field2851.method2752(-9833, arg2);
                    } else {
                        class307.method1947(arg0, arg4, arg6, arg2, arg5, (byte) -117, arg7, arg1, var13.method409(-50));
                    }
                }
            } else if (arg6 == 1) {
                class171 var10 = (class171) class65.method373(arg7, arg0, arg1);
                if (var10 != null) {
                    if ((var10 instanceof class380)) {
                        ((class380) var10).field5168.method2752(-9833, arg2);
                    } else {
                        int var11 = var10.method409(-50);
                        if (arg4 == 4 || arg4 == 5) {
                            class307.method1947(arg0, 4, arg6, arg2, arg5, (byte) -113, arg7, arg1, var11);
                        } else if (arg4 == 6) {
                            class307.method1947(arg0, 4, arg6, arg2, arg5 + 4, (byte) -103, arg7, arg1, var11);
                        } else if (arg4 == 7) {
                            class307.method1947(arg0, 4, arg6, arg2, (arg5 + 2 & 0x3) + 4, (byte) -128, arg7, arg1, var11);
                        } else if (arg4 == 8) {
                            class307.method1947(arg0, 4, arg6, arg2, arg5 + 4, (byte) -108, arg7, arg1, var11);
                            class307.method1947(arg0, 4, arg6, arg2, (arg5 + 2 & 0x3) + 4, (byte) -105, arg7, arg1, var11);
                        }
                    }
                }
            } else if (arg6 == 2) {
                class171 var9 = (class171) class246.method1610(arg7, arg0, arg1, field2005 == null ? (field2005 = method1092("ol")) : field2005);
                if (var9 != null) {
                    if (arg4 == 11) {
                        arg4 = 10;
                    }
                    if ((var9 instanceof class211)) {
                        ((class211) var9).field2562.method2752(-9833, arg2);
                    } else {
                        class307.method1947(arg0, arg4, arg6, arg2, arg5, (byte) -116, arg7, arg1, var9.method409(-50));
                    }
                }
            } else if (arg6 == 3) {
                class171 var8 = (class171) class451.method2792(arg7, arg0, arg1);
                if (var8 != null) {
                    if (var8 instanceof class218) {
                        ((class218) var8).field2682.method2752(-9833, arg2);
                    } else {
                        class307.method1947(arg0, arg4, arg6, arg2, arg5, (byte) -116, arg7, arg1, var8.method409(-50));
                    }
                }
            }
        }
        if (arg3 != 4) {
            method1091(-41);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V")
    public static final void method1087(boolean arg0) {
        field2004++;
        if (arg0) {
            return;
        }
        if (class441.field6075 == 2) {
            class105.field1254 = 96;
            return;
        }
        try {
            Method var1 = (field2006 == null ? (field2006 = method1092("java.lang.Runtime")) : field2006).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class105.field1254 = (int) (var3 / 1048576L) + 1;
                    return;
                } catch (Throwable var4) {
                    return;
                }
            }
        } catch (Exception var5) {
            return;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
    public static final void method1088(int arg0, int arg1) {
        field1999++;
        if (!class192.method1185(arg0 ^ 0xFFFFF37F, arg1)) {
            return;
        }
        class453[] var2 = class362.field4903[arg1];
        for (int var3 = arg0; var3 < var2.length; var3++) {
            class453 var4 = var2[var3];
            if (var4 != null) {
                var4.field6315 = 0;
                var4.field6439 = 0;
                var4.field6331 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILwo;)V")
    public static final void method1089(int arg0, class285 arg1) {
        field2002++;
        if (arg0 == -20154) {
            class310.field4192 = arg1;
            class192.field2253 = class310.field4192.method1821(arg0 + 20210, 19);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IZLaq;IILc;Lem;I)V")
    public static final void method1090(int arg0, boolean arg1, class453 arg2, int arg3, int arg4, class436 arg5, class423 arg6, int arg7) {
        field2000++;
        if (arg5 == null) {
            return;
        }
        if (!arg1) {
            field2001 = null;
        }
        int var8;
        if (class320.field4294 == 4) {
            var8 = (int) class434.field5929 & 0x3FFF;
        } else {
            var8 = (int) class434.field5929 + class231.field3043 & 0x3FFF;
        }
        int var9 = Math.max(arg2.field6377 / 2, arg2.field6432 / 2) + 10;
        int var10 = arg4 * arg4 + arg7 * arg7;
        if (var10 > var9 * var9) {
            return;
        }
        int var11 = class363.field4927[var8];
        int var12 = class363.field4917[var8];
        if (class320.field4294 != 4) {
            var11 = var11 * 256 / (class280.field3627 + 256);
            var12 = var12 * 256 / (class280.field3627 + 256);
        }
        int var13 = arg4 * var12 + arg7 * var11 >> 15;
        int var14 = arg7 * var12 - (arg4 * var11) >> 15;
        arg5.method165(arg2.field6377 / 2 + arg3 + (var13 - arg5.method235() / 2), arg2.field6432 / 2 + arg0 + -var14 + -(arg5.method236() / 2), arg6, arg3, arg0);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static void method1091(int arg0) {
        field2001 = null;
        if (arg0 != 10) {
            method1090(63, true, (class453) null, -63, -101, (class436) null, (class423) null, -115);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1092(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class72((String) null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", (String) null, (String) null);
        field2003 = 0;
        new class72("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
    }
}

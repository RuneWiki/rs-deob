import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public abstract class class105 {

    @OriginalMember(owner = "client!m", name = "a", descriptor = "Lfo;")
    public static class22 field1318 = new class22(11, 17);

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "Lei;")
    public static class332 field1321;

    // $FF: synthetic field
    @OriginalMember(owner = "client!m", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field1325;

    @OriginalMember(owner = "client!m", name = "ta", descriptor = "(I)V")
    public abstract void method604(int arg0);

    @OriginalMember(owner = "client!m", name = "va", descriptor = "([I)V")
    public abstract void method605(int[] arg0);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BLua;)Ljava/lang/String;")
    public static final String method606(byte arg0, class548 arg1) {
        field1320++;
        if (arg0 == 66) {
            return arg1.field8162 == null || arg1.field8162.length() <= 0 ? arg1.field8165 : arg1.field8165 + class449.field6579.method2953(3181, class77.field889) + arg1.field8162;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
    public static void method607(byte arg0) {
        field1321 = null;
        if (arg0 > 114) {
            field1318 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "B", descriptor = "(IIIIII)V")
    public abstract void method608(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "()Lm;")
    public abstract class105 method609();

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)I")
    public static final int method610(int arg0, byte arg1) {
        field1319++;
        return arg1 <= 80 ? 91 : arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!m", name = "k", descriptor = "(I)V")
    public abstract void method611(int arg0);

    @OriginalMember(owner = "client!m", name = "I", descriptor = "(III[I)V")
    public abstract void method612(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!m", name = "oa", descriptor = "(III)V")
    public abstract void method613(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIZII)V")
    public static final void method614(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field1322++;
        if (arg3 >= 0 && arg0 >= 0 && (class35.field399 - 1) > arg3 && arg0 < class382.field5586 - 1) {
            if (class526.field7777 == null) {
                return;
            }
            if (arg2 == 0) {
                class438 var8 = (class438) class491.method2972(arg7, arg3, arg0);
                class438 var9 = (class438) class64.method399(arg7, arg3, arg0);
                if (var8 != null && arg4 != 2) {
                    if ((var8 instanceof class71)) {
                        ((class71) var8).field823.method3528(arg1, 1);
                    } else {
                        class161.method939(arg1, arg4, arg0, arg6, false, arg3, var8.method173(89), arg2, arg7);
                    }
                }
                if (var9 != null) {
                    if ((var9 instanceof class71)) {
                        ((class71) var9).field823.method3528(arg1, 1);
                    } else {
                        class161.method939(arg1, arg4, arg0, arg6, false, arg3, var9.method173(88), arg2, arg7);
                    }
                }
            } else if (arg2 == 1) {
                class438 var12 = (class438) class427.method2549(arg7, arg3, arg0);
                if (var12 != null) {
                    if (var12 instanceof class154) {
                        ((class154) var12).field1972.method3528(arg1, 1);
                    } else {
                        int var13 = var12.method173(108);
                        if (arg4 == 4 || arg4 == 5) {
                            class161.method939(arg1, 4, arg0, arg6, false, arg3, var13, arg2, arg7);
                        } else if (arg4 == 6) {
                            class161.method939(arg1, 4, arg0, arg6 + 4, !arg5, arg3, var13, arg2, arg7);
                        } else if (arg4 == 7) {
                            class161.method939(arg1, 4, arg0, (arg6 + 2 & 0x3) + 4, false, arg3, var13, arg2, arg7);
                        } else if (arg4 == 8) {
                            class161.method939(arg1, 4, arg0, arg6 + 4, false, arg3, var13, arg2, arg7);
                            class161.method939(arg1, 4, arg0, (arg6 + 2 & 0x3) + 4, !arg5, arg3, var13, arg2, arg7);
                        }
                    }
                }
            } else if (arg2 == 2) {
                class438 var10 = (class438) class488.method2956(arg7, arg3, arg0, field1325 == null ? (field1325 = method623("ej")) : field1325);
                if (var10 != null) {
                    if (arg4 == 11) {
                        arg4 = 10;
                    }
                    if ((var10 instanceof class100)) {
                        ((class100) var10).field1264.method3528(arg1, 1);
                    } else {
                        class161.method939(arg1, arg4, arg0, arg6, false, arg3, var10.method173(47), arg2, arg7);
                    }
                }
            } else if (arg2 == 3) {
                class438 var11 = (class438) class287.method1784(arg7, arg3, arg0);
                if (var11 != null) {
                    if (var11 instanceof class188) {
                        ((class188) var11).field2876.method3528(arg1, 1);
                    } else {
                        class161.method939(arg1, arg4, arg0, arg6, false, arg3, var11.method173(109), arg2, arg7);
                    }
                }
            }
        }
        if (!arg5) {
            field1323 = -57;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V")
    public static final void method615(boolean arg0) {
        field1324++;
        class17.field154.method2037(true);
        if (arg0) {
            method606((byte) 95, null);
        }
    }

    @OriginalMember(owner = "client!m", name = "XA", descriptor = "(I)V")
    public abstract void method616(int arg0);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III[I)V")
    public abstract void method617(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!m", name = "EA", descriptor = "(Lm;)V")
    public abstract void method618(class105 arg0);

    @OriginalMember(owner = "client!m", name = "TA", descriptor = "(III)V")
    public abstract void method619(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!m", name = "ha", descriptor = "()V")
    public abstract void method620();

    @OriginalMember(owner = "client!m", name = "KA", descriptor = "(I)V")
    public abstract void method621(int arg0);

    @OriginalMember(owner = "client!m", name = "ma", descriptor = "(I)V")
    public abstract void method622(int arg0);

    // $FF: synthetic method
    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method623(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

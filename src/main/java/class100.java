import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class100 {

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "[I")
    public static int[] field1324 = new int[25];

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "[I")
    public static int[] field1325 = new int[2500];

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "Lir;")
    public static class185 field1323;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cc", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field1326;

    // $FF: synthetic method
    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method774(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIBII)V", line = 7)
    public static final void method769(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        if (arg5 != 45) {
            method769(79, 58, 55, 92, 121, (byte) 4, 39, 22);
        }
        field1320++;
        if (arg4 < 0 || arg7 < 0 || arg4 >= class351.field5217 - 1 || arg7 >= class143.field1815 - 1) {
            return;
        }
        if (class106.field1405 == null) {
            return;
        }
        if (arg0 != 0) {
            if (arg0 == 1) {
                class56 var8 = (class56) class235.method1526(arg1, arg4, arg7);
                if (var8 != null) {
                    if (var8 instanceof class406) {
                        ((class406) var8).field5908.method2483((byte) -72, arg3);
                        return;
                    }
                    int var9 = var8.method116(24186);
                    if (arg6 == 4 || arg6 == 5) {
                        class20.method145(var9, arg0, 2, arg2, arg1, arg3, arg7, arg4, 4);
                    } else if (arg6 == 6) {
                        class20.method145(var9, arg0, arg5 - 43, arg2 + 4, arg1, arg3, arg7, arg4, 4);
                        return;
                    } else if (arg6 == 7) {
                        class20.method145(var9, arg0, 2, (arg2 + 2 & 0x3) + 4, arg1, arg3, arg7, arg4, 4);
                        return;
                    } else if (arg6 == 8) {
                        class20.method145(var9, arg0, 2, arg2 + 4, arg1, arg3, arg7, arg4, 4);
                        class20.method145(var9, arg0, 2, (arg2 + 2 & 0x3) + 4, arg1, arg3, arg7, arg4, 4);
                        return;
                    }
                    return;
                }
            } else if (arg0 == 2) {
                class56 var11 = (class56) class31.method243(arg1, arg4, arg7, field1326 == null ? (field1326 = method774("lk")) : field1326);
                if (var11 == null) {
                    return;
                }
                if (arg6 == 11) {
                    arg6 = 10;
                }
                if (!(var11 instanceof class186)) {
                    class20.method145(var11.method116(24186), arg0, 2, arg2, arg1, arg3, arg7, arg4, arg6);
                    return;
                }
                ((class186) var11).field2551.method2483((byte) -29, arg3);
            } else if (arg0 == 3) {
                class56 var10 = (class56) class104.method792(arg1, arg4, arg7);
                if (var10 != null) {
                    if (!(var10 instanceof class40)) {
                        class20.method145(var10.method116(24186), arg0, 2, arg2, arg1, arg3, arg7, arg4, arg6);
                        return;
                    }
                    ((class40) var10).field601.method2483((byte) -58, arg3);
                    return;
                }
            }
            return;
        }
        class56 var12 = (class56) class57.method421(arg1, arg4, arg7);
        class56 var13 = (class56) class320.method2106(arg1, arg4, arg7);
        if (var12 != null && arg6 != 2) {
            if ((var12 instanceof class424)) {
                ((class424) var12).field6177.method2483((byte) -81, arg3);
            } else {
                class20.method145(var12.method116(24186), arg0, 2, arg2, arg1, arg3, arg7, arg4, arg6);
            }
        }
        if (var13 == null) {
            return;
        }
        if (var13 instanceof class424) {
            ((class424) var13).field6177.method2483((byte) -39, arg3);
            return;
        }
        class20.method145(var13.method116(24186), arg0, 2, arg2, arg1, arg3, arg7, arg4, arg6);
        return;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILjava/lang/String;)V", line = 125)
    public static final void method770(int arg0, int arg1, String arg2) {
        field1319++;
        class440 var3 = class186.method1241(arg1, 2, (byte) 56);
        var3.method2756(-1369656528);
        if (arg0 != 10421) {
            method772(true, 22);
        }
        var3.field6376 = arg2;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)V", line = 139)
    public static final void method771(int arg0, int arg1) {
        field1322++;
        if (!class338.method2195(arg0, 6173)) {
            return;
        }
        class248[] var2 = class4.field71[arg0];
        for (int var3 = arg1; var3 < var2.length; var3++) {
            class248 var4 = var2[var3];
            if (var4 != null) {
                var4.field3606 = 1;
                var4.field3622 = 0;
                var4.field3662 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)I", line = 172)
    public static final int method772(boolean arg0, int arg1) {
        if (!arg0) {
            field1323 = null;
        }
        field1321++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V", line = 201)
    public static void method773(byte arg0) {
        field1325 = null;
        field1324 = null;
        field1323 = null;
        if (arg0 != 82) {
            field1325 = null;
        }
    }
}

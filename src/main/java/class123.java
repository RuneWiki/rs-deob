import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class123 extends class223 {

    @OriginalMember(owner = "client!ov", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1796 = "";

    @OriginalMember(owner = "client!ov", name = "l", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!ov", name = "p", descriptor = "I")
    public int field1797;

    @OriginalMember(owner = "client!ov", name = "s", descriptor = "I")
    public int field1800;

    @OriginalMember(owner = "client!ov", name = "u", descriptor = "I")
    public static int field1802;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ov", name = "x", descriptor = "Ljava/lang/Class;")
    public static Class field1805;

    @OriginalMember(owner = "client!ov", name = "q", descriptor = "[I")
    public int[] field1798;

    @OriginalMember(owner = "client!ov", name = "r", descriptor = "[I")
    public int[] field1799;

    @OriginalMember(owner = "client!ov", name = "w", descriptor = "[I")
    public int[] field1804;

    @OriginalMember(owner = "client!ov", name = "n", descriptor = "[Lqt;")
    public class449[] field1795;

    @OriginalMember(owner = "client!ov", name = "t", descriptor = "[Lqt;")
    public class449[] field1801;

    @OriginalMember(owner = "client!ov", name = "v", descriptor = "[[Luu;")
    public static class188[][] field1803;

    @OriginalMember(owner = "client!ov", name = "m", descriptor = "[[[B")
    public byte[][][] field1794;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method977(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V", line = 5)
    public static final void method973(int arg0) {
        field1802++;
        class472.field6970.field827 = 0;
        class112.field1578 = 0;
        class434.field6366 = null;
        class393.field5780 = null;
        class76.field1036 = 0;
        class169.field2395 = null;
        class511.field7543 = null;
        class85.field1163.field827 = 0;
        class26.field314 = 0;
        class170.method1200(arg0 - 151);
        class485.method2916(4);
        for (int var1 = 0; var1 < 2048; var1++) {
            class384.field5647[var1] = null;
        }
        class435.field6375 = null;
        for (int var2 = 0; var2 < class250.field3690.length; var2++) {
            class461 var4 = class250.field3690[var2];
            if (var4 != null) {
                var4.field1713 = -1;
            }
        }
        class275.method1771(-121);
        class462.field6802 = 1;
        class432.method2619((byte) -123, arg0);
        for (int var3 = 0; var3 < 100; var3++) {
            class342.field4736[var3] = true;
        }
        class435.method2639((byte) 66);
        class346.field4815 = 0L;
        class377.field5588 = null;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Ljj;IIIII)V", line = 64)
    public static final void method974(class76 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field1031 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class270.field3980[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class521 var13 = class9.field115[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field1031; var14++) {
                            if (arg0.field1034[var14] == var13.field7653) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field1034[arg0.field1031++] = var13.field7653;
                        if (arg0.field1031 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field1031; var15 < 4; var15++) {
            arg0.field1034[var15] = null;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIBIIIII)V", line = 129)
    public static final void method975(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = -4 % ((65 - arg2) / 51);
        field1793++;
        if (arg6 < 0 || arg7 < 0 || (class397.field5828 - 1) <= arg6 || arg7 >= class457.field6713 - 1) {
            return;
        }
        if (class422.field6240 == null) {
            return;
        }
        if (arg4 != 0) {
            if (arg4 == 1) {
                class529 var11 = (class529) class510.method3040(arg0, arg6, arg7);
                if (var11 == null) {
                    return;
                }
                if (!(var11 instanceof class463)) {
                    int var12 = var11.method28(true);
                    if (arg5 != 4 && arg5 != 5) {
                        if (arg5 == 6) {
                            class372.method2296(arg0, arg6, 4, 255, arg3, arg1 + 4, var12, arg7, arg4);
                            return;
                        }
                        if (arg5 == 7) {
                            class372.method2296(arg0, arg6, 4, 255, arg3, (arg1 + 2 & 0x3) + 4, var12, arg7, arg4);
                        } else if (arg5 == 8) {
                            class372.method2296(arg0, arg6, 4, 255, arg3, arg1 + 4, var12, arg7, arg4);
                            class372.method2296(arg0, arg6, 4, 255, arg3, (arg1 + 2 & 0x3) + 4, var12, arg7, arg4);
                            return;
                        }
                        return;
                    }
                    class372.method2296(arg0, arg6, 4, 255, arg3, arg1, var12, arg7, arg4);
                    return;
                }
                ((class463) var11).field6818.method2051(arg3, 8192);
                return;
            }
            if (arg4 == 2) {
                class529 var9 = (class529) class262.method1683(arg0, arg6, arg7, field1805 == null ? (field1805 = method977("f")) : field1805);
                if (var9 != null) {
                    if (arg5 == 11) {
                        arg5 = 10;
                    }
                    if (!(var9 instanceof class153)) {
                        class372.method2296(arg0, arg6, arg5, 255, arg3, arg1, var9.method28(true), arg7, arg4);
                        return;
                    }
                    ((class153) var9).field2163.method2051(arg3, 8192);
                    return;
                }
            } else if (arg4 == 3) {
                class529 var10 = (class529) class282.method1802(arg0, arg6, arg7);
                if (var10 == null) {
                    return;
                }
                if (!(var10 instanceof class4)) {
                    class372.method2296(arg0, arg6, arg5, 255, arg3, arg1, var10.method28(true), arg7, arg4);
                    return;
                }
                ((class4) var10).field61.method2051(arg3, 8192);
            } else {
                return;
            }
            return;
        }
        class529 var13 = (class529) class344.method2079(arg0, arg6, arg7);
        class529 var14 = (class529) class316.method1973(arg0, arg6, arg7);
        if (var13 != null && arg5 != 2) {
            if (var13 instanceof class61) {
                ((class61) var13).field712.method2051(arg3, 8192);
            } else {
                class372.method2296(arg0, arg6, arg5, 255, arg3, arg1, var13.method28(true), arg7, arg4);
            }
        }
        if (var14 == null) {
            return;
        }
        if (var14 instanceof class61) {
            ((class61) var14).field712.method2051(arg3, 8192);
            return;
        }
        class372.method2296(arg0, arg6, arg5, 255, arg3, arg1, var14.method28(true), arg7, arg4);
        return;
    }

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "(B)V", line = 253)
    public static void method976(byte arg0) {
        if (arg0 != 86) {
            method973(114);
        }
        field1803 = null;
        field1796 = null;
    }
}

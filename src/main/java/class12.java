import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class12 extends class260 {

    @OriginalMember(owner = "client!ds", name = "u", descriptor = "I")
    public int field185 = 0;

    @OriginalMember(owner = "client!ds", name = "x", descriptor = "I")
    public int field188 = -1;

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "[Lsk;")
    public static class438[] field182 = new class438[2048];

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "Ldi;")
    public static class83 field180 = new class83(23, 6);

    @OriginalMember(owner = "client!ds", name = "D", descriptor = "I")
    public static int field194 = 0;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
    public int field175;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "I")
    public int field178;

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
    public int field179;

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!ds", name = "t", descriptor = "I")
    public int field184;

    @OriginalMember(owner = "client!ds", name = "v", descriptor = "I")
    public int field186;

    @OriginalMember(owner = "client!ds", name = "w", descriptor = "I")
    public int field187;

    @OriginalMember(owner = "client!ds", name = "y", descriptor = "I")
    public int field189;

    @OriginalMember(owner = "client!ds", name = "z", descriptor = "I")
    public int field190;

    @OriginalMember(owner = "client!ds", name = "A", descriptor = "I")
    public int field191;

    @OriginalMember(owner = "client!ds", name = "C", descriptor = "I")
    public int field193;

    @OriginalMember(owner = "client!ds", name = "s", descriptor = "Lmg;")
    public static class101 field183;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ds", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field195;

    @OriginalMember(owner = "client!ds", name = "B", descriptor = "[[B")
    public static byte[][] field192;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method61(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(I)V", line = 7)
    public static void method57(int arg0) {
        field183 = null;
        if (arg0 != 2048) {
            field194 = -54;
        }
        field192 = null;
        field180 = null;
        field182 = null;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)V", line = 27)
    public static final void method58(int arg0, int arg1, int arg2) {
        field181++;
        class97 var3 = class348.method2064(arg2, 13, -80);
        var3.method712((byte) -84);
        var3.field1468 = arg1;
        if (arg0 != 10595) {
            field182 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIBIIIIILya;)V", line = 51)
    public static final void method59(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class38 arg8) {
        field176++;
        class503 var9 = (class503) class176.method1135(arg5, arg4, arg0);
        if (arg2 != 125) {
            return;
        }
        if (var9 != null) {
            class220 var10 = class78.field1141.method2103(var9.method490(-29679), true);
            int var11 = var9.method499(arg2 - 15686) & 0x3;
            int var12 = var9.method496(arg2 ^ 0xD);
            if (var10.field3093 == -1) {
                int var13 = arg6;
                if (var10.field3119 > 0) {
                    var13 = arg3;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg8.method307(arg7, 4, arg1, -81, var13);
                    } else if (var11 == 1) {
                        arg8.method230(var13, 4, arg7, (byte) -79, arg1);
                    } else if (var11 == 2) {
                        arg8.method307(arg7, 4, arg1 + 3, arg2 + -181, var13);
                    } else if (var11 == 3) {
                        arg8.method230(var13, 4, arg7 + 3, (byte) -128, arg1);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg8.method325(arg1, 1, var13, 1, arg7, 1);
                    } else if (var11 == 1) {
                        arg8.method325(arg1 + 3, 1, var13, 1, arg7, 1);
                    } else if (var11 == 2) {
                        arg8.method325(arg1 + 3, 1, var13, 1, arg7 + 3, 1);
                    } else if (var11 == 3) {
                        arg8.method325(arg1, 1, var13, 1, arg7 + 3, 1);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg8.method230(var13, 4, arg7, (byte) 96, arg1);
                    } else if (var11 == 1) {
                        arg8.method307(arg7, 4, arg1 + 3, -41, var13);
                    } else if (var11 == 2) {
                        arg8.method230(var13, 4, arg7 + 3, (byte) 64, arg1);
                    } else if (var11 == 3) {
                        arg8.method307(arg7, 4, arg1, -86, var13);
                    }
                }
            } else {
                class331.method1911(arg8, var11, arg2 - 232, arg7, var10, arg1);
            }
        }
        class503 var14 = (class503) class38.method295(arg5, arg4, arg0, field195 == null ? (field195 = method61("jn")) : field195);
        if (var14 != null) {
            class220 var15 = class78.field1141.method2103(var14.method490(-29679), true);
            int var16 = var14.method499(-15561) & 0x3;
            int var17 = var14.method496(-114);
            if (var15.field3093 != -1) {
                class331.method1911(arg8, var16, -89, arg7, var15, arg1);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field3119 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg8.method289(arg1 + 3, 1, arg7, arg1, arg7 + 3, var18);
                } else {
                    arg8.method289(arg1 + 3, arg2 + -124, arg7 + 3, arg1, arg7, var18);
                }
            }
        }
        class503 var19 = (class503) class509.method3048(arg5, arg4, arg0);
        if (var19 == null) {
            return;
        }
        class220 var20 = class78.field1141.method2103(var19.method490(-29679), true);
        int var21 = var19.method499(-15561) & 0x3;
        if (var20.field3093 != -1) {
            class331.method1911(arg8, var21, -111, arg7, var20, arg1);
            return;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(BLmg;Lmg;Lmg;Lqu;)Z", line = 193)
    public static final boolean method60(byte arg0, class101 arg1, class101 arg2, class101 arg3, class64 arg4) {
        class121.field1817 = arg4;
        class149.field2161 = arg2;
        class50.field604 = arg3;
        class23.field310 = arg1;
        field177++;
        return arg0 > -15 ? true : true;
    }
}

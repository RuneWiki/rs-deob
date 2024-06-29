import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class566 {

    @OriginalMember(owner = "client!nba", name = "d", descriptor = "J")
    public long field8262;

    @OriginalMember(owner = "client!nba", name = "g", descriptor = "Luca;")
    private class287 field8265;

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "I")
    public static int field8260 = 52;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "I")
    public static int field8259;

    @OriginalMember(owner = "client!nba", name = "c", descriptor = "I")
    public static int field8261;

    @OriginalMember(owner = "client!nba", name = "e", descriptor = "I")
    public static int field8263;

    @OriginalMember(owner = "client!nba", name = "f", descriptor = "I")
    public static int field8264;

    @OriginalMember(owner = "client!nba", name = "h", descriptor = "I")
    public static int field8266;

    @OriginalMember(owner = "client!nba", name = "i", descriptor = "I")
    public static int field8267;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(III)Lkga;")
    public static final class518 method3261(int arg0, int arg1, int arg2) {
        class44 var3 = class603.field8695[arg0][arg1][arg2];
        return var3 == null || var3.field672 == null ? null : var3.field672;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(Lps;BI)Ljava/lang/String;")
    public static final String method3262(class5 arg0, byte arg1, int arg2) {
        field8261++;
        if (arg1 != 92) {
            field8260 = -22;
        }
        if (!client.method564(arg0).method456(arg2, -31) && arg0.field70 == null) {
            return null;
        } else if (arg0.field102 == null || arg2 >= arg0.field102.length || arg0.field102[arg2] == null || arg0.field102[arg2].trim().length() == 0) {
            return class1.field9 ? "Hidden-" + arg2 : null;
        } else {
            return arg0.field102[arg2];
        }
    }

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "(III)Z")
    public static final boolean method3263(int arg0, int arg1, int arg2) {
        field8264++;
        if (arg2 < 125) {
            method3265(53, null, 60, -33, 49, 40, 82);
        }
        return (class144.method1000(true, arg1, arg0) | class442.method2614(true, arg0, arg1) | class252.method1521(arg0, arg1, 49)) & class543.method3190((byte) 126, arg1, arg0);
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(BLlr;)V")
    public static final void method3264(byte arg0, class311 arg1) {
        field8266++;
        int var2 = 0;
        arg1.method1941(-110);
        for (int var3 = 0; var3 < class416.field6150; var3++) {
            int var15 = class35.field554[var3];
            if ((class1.field2[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class1.field2[var15] = (byte) class151.method1076(class1.field2[var15], 2);
                } else {
                    int var16 = arg1.method1946(1, (byte) 126);
                    if (var16 == 0) {
                        var2 = class646.method3677(arg1, 115);
                        class1.field2[var15] = (byte) class151.method1076(class1.field2[var15], 2);
                    } else {
                        class373.method2296(2737, arg1, var15);
                    }
                }
            }
        }
        arg1.method1935((byte) 116);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg1.method1941(arg0 ^ 0xE);
        for (int var4 = 0; var4 < class416.field6150; var4++) {
            int var13 = class35.field554[var4];
            if ((class1.field2[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    class1.field2[var13] = (byte) class151.method1076(class1.field2[var13], 2);
                    var2--;
                } else {
                    int var14 = arg1.method1946(1, (byte) 126);
                    if (var14 == 0) {
                        var2 = class646.method3677(arg1, 99);
                        class1.field2[var13] = (byte) class151.method1076(class1.field2[var13], 2);
                    } else {
                        class373.method2296(arg0 + 2840, arg1, var13);
                    }
                }
            }
        }
        arg1.method1935((byte) 72);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg1.method1941(arg0 ^ 0x1A);
        for (int var5 = 0; var5 < class688.field9713; var5++) {
            int var11 = class448.field6498[var5];
            if ((class1.field2[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    class1.field2[var11] = (byte) class151.method1076(class1.field2[var11], 2);
                    var2--;
                } else {
                    int var12 = arg1.method1946(1, (byte) 124);
                    if (var12 == 0) {
                        var2 = class646.method3677(arg1, 103);
                        class1.field2[var11] = (byte) class151.method1076(class1.field2[var11], 2);
                    } else if (class106.method752(arg1, (byte) 15, var11)) {
                        class1.field2[var11] = (byte) class151.method1076(class1.field2[var11], 2);
                    }
                }
            }
        }
        arg1.method1935((byte) 54);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg1.method1941(-83);
        for (int var6 = 0; var6 < class688.field9713; var6++) {
            int var9 = class448.field6498[var6];
            if ((class1.field2[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class1.field2[var9] = (byte) class151.method1076(class1.field2[var9], 2);
                } else {
                    int var10 = arg1.method1946(1, (byte) 127);
                    if (var10 == 0) {
                        var2 = class646.method3677(arg1, 115);
                        class1.field2[var9] = (byte) class151.method1076(class1.field2[var9], 2);
                    } else if (class106.method752(arg1, (byte) 75, var9)) {
                        class1.field2[var9] = (byte) class151.method1076(class1.field2[var9], 2);
                    }
                }
            }
        }
        arg1.method1935((byte) 112);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class688.field9713 = 0;
        class416.field6150 = 0;
        if (arg0 != -103) {
            method3266(-42, -72, 14, true, -6);
        }
        for (int var7 = 1; var7 < 2048; var7++) {
            class1.field2[var7] = (byte) (class1.field2[var7] >> 1);
            class71 var8 = class35.field551[var7];
            if (var8 == null) {
                class448.field6498[class688.field9713++] = var7;
            } else {
                class35.field554[class416.field6150++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!nba", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field8259++;
        this.field8265.method1757(-31, this.field8262);
        super.finalize();
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(ILrg;IIIII)V")
    public static final void method3265(int arg0, class523 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class281.method1669(0, arg2, arg1.field7905, arg5, arg4, arg3, -513, arg0, arg1.field7895, arg1.field7896);
        if (arg6 <= 22) {
            method3265(-5, null, -36, -97, -29, 60, -63);
        }
        field8263++;
    }

    @OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Luca;J[Lg;)V")
    public class566(class287 arg0, long arg1, class129[] arg2) {
        this.field8262 = arg1;
        this.field8265 = arg0;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIIZI)V")
    public static final void method3266(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        class148.field2106 = arg4;
        class375.field5631 = arg0;
        class175.field2455 = arg1;
        if (!arg3) {
            method3265(21, null, 39, 8, 112, 50, -79);
        }
        field8267++;
        class323.field4704 = arg2;
    }
}

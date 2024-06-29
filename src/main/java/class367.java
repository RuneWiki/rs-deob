import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class367 extends class147 {

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "Lpn;")
    public static class72 field5245 = new class72(60, -1);

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "Lec;")
    public static class40 field5247 = new class40("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "I")
    public static int field5251 = 0;

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "Lsd;")
    public static class74 field5250 = new class74(2, -2);

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "Lsd;")
    public static class74 field5253;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "Lrg;")
    public class395 field5249;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "Z")
    public boolean field5252;

    static {
        new class40("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
        field5253 = new class74(80, 2);
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(B)V", line = 7)
    public static void method2216(byte arg0) {
        field5245 = null;
        field5253 = null;
        field5250 = null;
        field5247 = null;
        int var1 = 72 % ((arg0 - 2) / 41);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IC)Z", line = 24)
    public static final boolean method2217(int arg0, char arg1) {
        int var2 = 18 % ((40 - arg0) / 61);
        field5246++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var3 = class185.field2430;
            for (int var4 = 0; var4 < var3.length; var4++) {
                char var5 = var3[var4];
                if (arg1 == var5) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)V", line = 58)
    public static final void method2218(int arg0, int arg1, int arg2) {
        class263 var3 = class293.field4356[arg0][arg1][arg2];
        if (var3 != null && var3.field3798 != null) {
            var3.field3798 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lve;B)V", line = 68)
    public static final void method2219(class331 arg0, byte arg1) {
        field5244++;
        arg0.method2016(97);
        int var2 = 0;
        for (int var3 = 0; var3 < class438.field6286; var3++) {
            int var15 = class79.field944[var3];
            if ((class42.field513[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class42.field513[var15] = (byte) class292.method1841(class42.field513[var15], 2);
                } else {
                    int var16 = arg0.method2017(-125, 1);
                    if (var16 == 0) {
                        var2 = class337.method2044(arg0, -11825);
                        class42.field513[var15] = (byte) class292.method1841(class42.field513[var15], 2);
                    } else {
                        class259.method1591(var15, (byte) -72, arg0);
                    }
                }
            }
        }
        arg0.method2006((byte) -116);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg0.method2016(87);
        for (int var4 = 0; var4 < class438.field6286; var4++) {
            int var13 = class79.field944[var4];
            if ((class42.field513[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    class42.field513[var13] = (byte) class292.method1841(class42.field513[var13], 2);
                    var2--;
                } else {
                    int var14 = arg0.method2017(-100, 1);
                    if (var14 == 0) {
                        var2 = class337.method2044(arg0, -11825);
                        class42.field513[var13] = (byte) class292.method1841(class42.field513[var13], 2);
                    } else {
                        class259.method1591(var13, (byte) -44, arg0);
                    }
                }
            }
        }
        arg0.method2006((byte) -71);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg0.method2016(81);
        if (arg1 > -3) {
            return;
        }
        for (int var5 = 0; var5 < class188.field2549; var5++) {
            int var11 = class66.field825[var5];
            if ((class42.field513[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    class42.field513[var11] = (byte) class292.method1841(class42.field513[var11], 2);
                    var2--;
                } else {
                    int var12 = arg0.method2017(-64, 1);
                    if (var12 == 0) {
                        var2 = class337.method2044(arg0, -11825);
                        class42.field513[var11] = (byte) class292.method1841(class42.field513[var11], 2);
                    } else if (class373.method2253(arg0, var11, -22575)) {
                        class42.field513[var11] = (byte) class292.method1841(class42.field513[var11], 2);
                    }
                }
            }
        }
        arg0.method2006((byte) -120);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg0.method2016(117);
        for (int var6 = 0; var6 < class188.field2549; var6++) {
            int var9 = class66.field825[var6];
            if ((class42.field513[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class42.field513[var9] = (byte) class292.method1841(class42.field513[var9], 2);
                } else {
                    int var10 = arg0.method2017(-113, 1);
                    if (var10 == 0) {
                        var2 = class337.method2044(arg0, -11825);
                        class42.field513[var9] = (byte) class292.method1841(class42.field513[var9], 2);
                    } else if (class373.method2253(arg0, var9, -22575)) {
                        class42.field513[var9] = (byte) class292.method1841(class42.field513[var9], 2);
                    }
                }
            }
        }
        arg0.method2006((byte) 103);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class188.field2549 = 0;
        class438.field6286 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class42.field513[var7] = (byte) (class42.field513[var7] >> 1);
            class198 var8 = class46.field596[var7];
            if (var8 == null) {
                class66.field825[class188.field2549++] = var7;
            } else {
                class79.field944[class438.field6286++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILqe;Z)V", line = 274)
    public static final void method2220(int arg0, class160 arg1, boolean arg2) {
        field5248++;
        if (class358.field5165) {
            arg0 = 0;
            class358.field5165 = false;
        }
        if (class93.field1153 == null || !class93.field1153.method770((byte) -68, arg1)) {
            class93.field1153 = arg1;
            class186.field2444 = class434.method2591(-19310);
            class231.field3206 = arg0;
            class215.field2966 = arg0;
            if (class215.field2966 == 0) {
                class158.method762(-7090);
            } else {
                class403.field5736 = class397.field5643;
                class450.field6374 = class121.field1507;
                class421.field6075 = class324.field4682;
                class283.field4118 = class458.field6449;
                class110.field1347 = class27.field361;
                class381.field5406 = class71.field869;
                class184.field2402 = class180.field2275;
                class427.field6146 = class88.field1098;
                class415.field5969 = class234.field3249;
                class185.field2442 = class484.field6869;
            }
        }
        if (arg2) {
            field5251 = 73;
        }
    }
}

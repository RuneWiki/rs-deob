import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class81 extends class320 {

    @OriginalMember(owner = "client!ju", name = "p", descriptor = "I")
    public int field1424;

    @OriginalMember(owner = "client!ju", name = "n", descriptor = "I")
    public int field1422;

    @OriginalMember(owner = "client!ju", name = "q", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!ju", name = "l", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!ju", name = "m", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!ju", name = "o", descriptor = "I")
    public static int field1423;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ju", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field1426;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method645(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class342("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
        field1425 = 0;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method643(boolean arg0) {
        field1420++;
        for (class155 var1 = (class155) class55.field964.method2427(108); var1 != null; var1 = (class155) class55.field964.method2422(-125)) {
            if (class380.field5761 == null) {
                var1.method2090(-1);
            } else if (var1.field2448 <= class531.field7821) {
                int var2 = class72.field1249[var1.field2439];
                if (var2 == 0) {
                    class241 var3 = class310.method2028(var1.field2436, var1.field2430, var1.field2440);
                    if (var3 instanceof class167) {
                        class41.method409(var1.field2436, var1.field2430, var1.field2440);
                        class167 var4 = (class167) var3;
                        if (var4.field2594 != null) {
                            class163.method1205(var1.field2436, var1.field2430, var1.field2440, var4.field2594, null);
                        }
                    }
                } else if (var2 == 1) {
                    class506 var5 = class462.method2745(var1.field2436, var1.field2430, var1.field2440);
                    if (var5 instanceof class36) {
                        class118.method880(var1.field2436, var1.field2430, var1.field2440);
                        class36 var6 = (class36) var5;
                        if (var6.field697 != null) {
                            class26.method318(var1.field2436, var1.field2430, var1.field2440, var6.field697, null);
                        }
                    }
                } else if (var2 == 2) {
                    class417 var7 = class367.method2294(var1.field2436, var1.field2430, var1.field2440, field1426 == null ? (field1426 = method645("pa")) : field1426);
                    if (var7 instanceof class65) {
                        class492.method2932(var1.field2436, var1.field2430, var1.field2440, field1426 == null ? (field1426 = method645("pa")) : field1426);
                        class65 var8 = (class65) var7;
                        if (var8.field1109 != null) {
                            class84.method651(var8.field1109, false);
                        }
                    }
                } else if (var2 == 3) {
                    class480 var9 = class412.method2496(var1.field2436, var1.field2430, var1.field2440);
                    if (var9 instanceof class244) {
                        class28.method325(var1.field2436, var1.field2430, var1.field2440);
                        class244 var10 = (class244) var9;
                        if (var10.field3512 != null) {
                            class441.method2645(var1.field2436, var1.field2430, var1.field2440, var10.field3512);
                        }
                    }
                }
                var1.method2090(-1);
            } else if (class531.field7821 == var1.field2441) {
                int var11 = class72.field1249[var1.field2439];
                if (var11 == 0) {
                    class241 var21 = class310.method2028(var1.field2436, var1.field2430, var1.field2440);
                    if (var21 instanceof class167) {
                        var1.method2090(-1);
                    } else if (class267.method1716(var1.field2436, var1.field2430, var1.field2440) == null) {
                        class167 var22 = new class167(var1.field2439, var1.field2433, var1.field2444, var1.field2447, var1.field2431, var21);
                        class163.method1205(var1.field2436, var1.field2430, var1.field2440, var22, null);
                    } else {
                        var1.method2090(-1);
                    }
                } else if (var11 == 1) {
                    class506 var12 = class462.method2745(var1.field2436, var1.field2430, var1.field2440);
                    if (var12 instanceof class36) {
                        var1.method2090(-1);
                    } else if (class419.method2536(var1.field2436, var1.field2430, var1.field2440) == null) {
                        class36 var13 = new class36(var1.field2439, var1.field2433, var1.field2444, var1.field2447, var1.field2431, var12);
                        class26.method318(var1.field2436, var1.field2430, var1.field2440, var13, null);
                    } else {
                        var1.method2090(-1);
                    }
                } else if (var11 == 2) {
                    class417 var16 = class367.method2294(var1.field2436, var1.field2430, var1.field2440, field1426 == null ? (field1426 = method645("pa")) : field1426);
                    if (var16 instanceof class65) {
                        var1.method2090(-1);
                    } else {
                        class492.method2932(var1.field2436, var1.field2430, var1.field2440, field1426 == null ? (field1426 = method645("pa")) : field1426);
                        class79 var17 = class319.field4807.method2874(var1.field2445, -17045);
                        int var18;
                        int var19;
                        if (var1.field2433 == 1 || var1.field2433 == 3) {
                            var18 = var17.field1384;
                            var19 = var17.field1345;
                        } else {
                            var18 = var17.field1345;
                            var19 = var17.field1384;
                        }
                        class65 var20 = new class65(var1.field2439, var1.field2433, var1.field2436, var1.field2444, var1.field2447, var1.field2431, var1.field2430, var1.field2430 + var18 - 1, var1.field2440, var1.field2440 + var19 - 1, var16);
                        class84.method651(var20, false);
                    }
                } else if (var11 == 3) {
                    class480 var14 = class412.method2496(var1.field2436, var1.field2430, var1.field2440);
                    if (var14 instanceof class244) {
                        var1.method2090(-1);
                    } else {
                        class244 var15 = new class244(var1.field2444, var1.field2447, var1.field2431, var14);
                        class441.method2645(var1.field2436, var1.field2430, var1.field2440, var15);
                    }
                }
            }
        }
        if (arg0) {
            method644(null, -119, 104, -125);
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "([BIII)Ljava/lang/String;", line = 218)
    public static final String method644(byte[] arg0, int arg1, int arg2, int arg3) {
        field1423++;
        char[] var4 = new char[arg2];
        int var5 = 0;
        if (arg1 >= -7) {
            field1421 = 124;
        }
        for (int var6 = 0; var6 < arg2; var6++) {
            int var7 = arg0[arg3 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class26.field569[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(II)V", line = 259)
    public class81(int arg0, int arg1) {
        this.field1424 = arg0;
        this.field1422 = arg1;
    }
}

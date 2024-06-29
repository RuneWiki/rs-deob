import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class741 extends class41 {

    @OriginalMember(owner = "client!lu", name = "p", descriptor = "I")
    private int field10310 = -1;

    @OriginalMember(owner = "client!lu", name = "q", descriptor = "F")
    public static float field10311;

    @OriginalMember(owner = "client!lu", name = "r", descriptor = "I")
    public static int field10312;

    @OriginalMember(owner = "client!lu", name = "u", descriptor = "I")
    public static int field10315;

    @OriginalMember(owner = "client!lu", name = "v", descriptor = "I")
    public static int field10316;

    @OriginalMember(owner = "client!lu", name = "w", descriptor = "I")
    public static int field10317;

    @OriginalMember(owner = "client!lu", name = "x", descriptor = "I")
    public static int field10318;

    @OriginalMember(owner = "client!lu", name = "s", descriptor = "Lls;")
    public static class151 field10313;

    @OriginalMember(owner = "client!lu", name = "t", descriptor = "Lbt;")
    public static class48 field10314;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lu", name = "y", descriptor = "Ljava/lang/Class;")
    public static Class field10319;

    // $FF: synthetic method
    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method4163(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)V", line = 4)
    public static final void method4159(int arg0) {
        field10315++;
        class88 var1 = (class88) class83.field1126.method2725(37);
        if (arg0 <= 25) {
            return;
        }
        while (var1 != null) {
            if (var1.field1184) {
                var1.method2219(13630);
            } else {
                var1.field1170 = true;
                if (var1.field1176 >= 0 && var1.field1179 >= 0 && var1.field1176 < class596.field8090 && var1.field1179 < class107.field1350) {
                    class158.method1112((byte) -74, var1);
                }
            }
            var1 = (class88) class83.field1126.method2726(-121);
        }
        for (class88 var2 = (class88) class651.field8995.method2725(37); var2 != null; var2 = (class88) class651.field8995.method2726(-119)) {
            if (var2.field1184) {
                var2.method2219(13630);
            } else {
                var2.field1170 = true;
            }
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Loga;I)V", line = 45)
    public final void method331(class500 arg0, int arg1) {
        field10318++;
        if (arg1 == 55) {
            arg0.method2970(0, this.field10310);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILes;)V", line = 57)
    public final void method329(int arg0, class403 arg1) {
        this.field10310 = arg1.method2390((byte) 65);
        field10317++;
        if (arg0 != -3999) {
            field10313 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(CI)C", line = 73)
    public static final char method4160(char arg0, int arg1) {
        field10316++;
        int var2 = -12 % ((-arg1 - 4) / 63);
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "(I)V", line = 101)
    public static void method4161(int arg0) {
        field10313 = null;
        field10314 = null;
        int var1 = 47 % ((arg0 + 48) / 42);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "()V", line = 121)
    public static final void method4162() {
        for (int var0 = 0; var0 < class784.field10818; var0++) {
            if (!class109.field1363[var0]) {
                class110 var1 = class331.field4094[var0];
                class515 var2 = var1.field1374;
                int var3 = var1.field1385;
                int var4 = var2.method3088(21915) - class343.field4301;
                int var5 = (var4 * 2 >> class714.field10017) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method3084(0) - var4 >> class714.field10017;
                int var9 = var2.method3085(true) - var4 >> class714.field10017;
                int var10 = var2.method3085(true) + var4 >> class714.field10017;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class250.field2938) {
                    var10 = class250.field2938 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field1381[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class307.field3799) {
                        var16 = class307.field3799 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class712 var19 = class764.method4234(var3, var17, var11, field10319 == null ? (field10319 = method4163("ar")) : field10319);
                        if (var19 != null && var19.field9995 != 0) {
                            if (var19.field9995 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field1381[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field1381[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field1381[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field1381[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class109.field1363[var0] = true;
                class621.field8523[var3].method1400(var2, var7);
            }
        }
    }
}

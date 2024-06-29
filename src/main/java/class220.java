import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class220 {

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3517 = "Loaded sprites";

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "[I")
    public static int[] field3521 = new int[14];

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 11)
    public static final String method1589(String arg0, int arg1, String arg2, String arg3) {
        field3516++;
        int var4 = arg2.indexOf(arg0);
        if (arg1 < 45) {
            method1591((byte) 51);
        }
        while (var4 != -1) {
            arg2 = arg2.substring(0, var4) + arg3 + arg2.substring(var4 + arg0.length());
            var4 = arg2.indexOf(arg0, arg3.length() + var4);
        }
        return arg2;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BB)C", line = 35)
    public static final char method1590(byte arg0, byte arg1) {
        field3515++;
        int var2 = arg1 & 0xFF;
        if (arg0 != 47) {
            method1589((String) null, -111, (String) null, (String) null);
        }
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class8.field123[var2 - 128];
            if (var3 == '\u0000') {
                throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V", line = 74)
    public static void method1591(byte arg0) {
        if (arg0 < 98) {
            field3520 = 94;
        }
        field3521 = null;
        field3517 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)Lrc;", line = 85)
    public static final class327 method1592(boolean arg0) {
        if (arg0) {
            field3520 = -69;
        }
        field3518++;
        try {
            return (class327) Class.forName("ki").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class57();
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 101)
    public static final void method1593(int arg0) {
        field3519++;
        if (arg0 != 11956) {
            return;
        }
        for (class137 var1 = (class137) class151.field2427.method1490(arg0 - 11756); var1 != null; var1 = (class137) class151.field2427.method1487((byte) 117)) {
            class294 var2 = var1.field2186;
            if (class41.field734 != var2.field4657 || var2.field4661 < class205.field3252) {
                var1.method1701(-100);
            } else if (class205.field3252 >= var2.field4650) {
                if (var2.field4635 > 0) {
                    class305 var3 = class138.field2196[var2.field4635 - 1];
                    if (var3 != null && var3.field1442 >= 0 && var3.field1442 < 13312 && var3.field1369 >= 0 && var3.field1369 < 13312) {
                        var2.method2068(var3.field1442, var3.field1369, class48.method374(var3.field1369, var3.field1442, arg0 ^ 0x2EE3, var2.field4657) - var2.field4629, false, class205.field3252);
                    }
                }
                if (var2.field4635 < 0) {
                    int var4 = -var2.field4635 - 1;
                    class30 var5;
                    if (class60.field943 == var4) {
                        var5 = class19.field356;
                    } else {
                        var5 = class82.field1228[var4];
                    }
                    if (var5 != null && var5.field1442 >= 0 && var5.field1442 < 13312 && var5.field1369 >= 0 && var5.field1369 < 13312) {
                        var2.method2068(var5.field1442, var5.field1369, class48.method374(var5.field1369, var5.field1442, 107, var2.field4657) - var2.field4629, false, class205.field3252);
                    }
                }
                var2.method2065(class122.field1952, false);
                class293.method2063(class41.field734, (int) var2.field4632, (int) var2.field4654, (int) var2.field4630, 60, var2, var2.field4653, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(CI)Z", line = 160)
    public static final boolean method1594(char arg0, int arg1) {
        field3522++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            if (arg1 != 64) {
                field3521 = (int[]) null;
            }
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII)Z", line = 190)
    public static final boolean method1595(int arg0, int arg1, int arg2, int arg3) {
        if (!class68.method513(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class29.field475[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class31.field533) {
                    if (!class2.method4(var4, var6, var5)) {
                        return false;
                    }
                    if (!class2.method4(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class2.method4(var4, var7, var5)) {
                        return false;
                    }
                    if (!class2.method4(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class2.method4(var4, var8, var5)) {
                    return false;
                }
                if (!class2.method4(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class236.field3717) {
                    if (!class2.method4(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class2.method4(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class2.method4(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class2.method4(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class2.method4(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class2.method4(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class31.field533) {
                    if (!class2.method4(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class2.method4(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class2.method4(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class2.method4(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class2.method4(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class2.method4(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class236.field3717) {
                    if (!class2.method4(var4, var6, var5)) {
                        return false;
                    }
                    if (!class2.method4(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class2.method4(var4, var7, var5)) {
                        return false;
                    }
                    if (!class2.method4(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class2.method4(var4, var8, var5)) {
                    return false;
                }
                if (!class2.method4(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class2.method4(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class2.method4(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class2.method4(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class2.method4(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class2.method4(var4, var8, var5);
        } else {
            return true;
        }
    }
}

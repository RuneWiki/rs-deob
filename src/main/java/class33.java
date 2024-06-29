import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class33 extends class120 {

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "[I")
    public int[] field426 = new int[] { -1 };

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "[I")
    public int[] field428 = new int[1];

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "Ljava/lang/String;")
    public static String field425 = "K";

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)V")
    public static final void method264(int arg0) {
        if (arg0 != -101) {
            field429 = 34;
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class110.field1675[var1] = true;
        }
        field427++;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIII)Z")
    public static final boolean method265(int arg0, int arg1, int arg2, int arg3) {
        if (!class170.method1188(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class200.field3128[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class172.field2696) {
                    if (!class174.method1226(var4, var6, var5)) {
                        return false;
                    }
                    if (!class174.method1226(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class174.method1226(var4, var7, var5)) {
                        return false;
                    }
                    if (!class174.method1226(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class174.method1226(var4, var8, var5)) {
                    return false;
                }
                if (!class174.method1226(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class82.field1285) {
                    if (!class174.method1226(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class174.method1226(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class174.method1226(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class174.method1226(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class174.method1226(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class174.method1226(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class172.field2696) {
                    if (!class174.method1226(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class174.method1226(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class174.method1226(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class174.method1226(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class174.method1226(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class174.method1226(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class82.field1285) {
                    if (!class174.method1226(var4, var6, var5)) {
                        return false;
                    }
                    if (!class174.method1226(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class174.method1226(var4, var7, var5)) {
                        return false;
                    }
                    if (!class174.method1226(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class174.method1226(var4, var8, var5)) {
                    return false;
                }
                if (!class174.method1226(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class174.method1226(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class174.method1226(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class174.method1226(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class174.method1226(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class174.method1226(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
    public static final String method266(String arg0, String arg1, int arg2, String arg3) {
        field424++;
        int var4 = arg1.length();
        int var5 = arg3.length();
        int var6 = arg0.length();
        if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
        }
        int var7 = var4;
        int var8 = var6 - var5;
        if (var8 != 0) {
            int var9 = 0;
            while (true) {
                int var10 = arg1.indexOf(arg3, var9);
                if (var10 < 0) {
                    break;
                }
                var7 += var8;
                var9 = var5 + var10;
            }
        }
        StringBuffer var11 = new StringBuffer(var7);
        int var12 = arg2;
        while (true) {
            int var13 = arg1.indexOf(arg3, var12);
            if (var13 < 0) {
                var11.append(arg1.substring(var12));
                return var11.toString();
            }
            var11.append(arg1.substring(var12, var13));
            var11.append(arg0);
            var12 = var5 + var13;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
    public static void method267(byte arg0) {
        if (arg0 != -99) {
            method267((byte) -103);
        }
        field425 = null;
    }
}

import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class21 extends class237 {

    @OriginalMember(owner = "client!na", name = "p", descriptor = "Lte;")
    public static class244 field266 = new class244(500);

    @OriginalMember(owner = "client!na", name = "s", descriptor = "I")
    public static int field269 = 0;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "Ljava/lang/String;")
    public static String field270 = "glow3:";

    @OriginalMember(owner = "client!na", name = "C", descriptor = "[Z")
    public static boolean[] field279 = new boolean[100];

    @OriginalMember(owner = "client!na", name = "A", descriptor = "Ljava/util/Calendar;")
    public static Calendar field277 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!na", name = "D", descriptor = "Lab;")
    public static class269 field280 = new class269();

    @OriginalMember(owner = "client!na", name = "H", descriptor = "I")
    public static int field284 = 0;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "I")
    public int field271;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "I")
    public int field273;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!na", name = "G", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!na", name = "F", descriptor = "Lgk;")
    public static class184 field282;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "[I")
    public int[] field267;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "[I")
    public int[] field275;

    @OriginalMember(owner = "client!na", name = "E", descriptor = "[I")
    public int[] field281;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "[Lwa;")
    public class243[] field272;

    @OriginalMember(owner = "client!na", name = "B", descriptor = "[Lwa;")
    public class243[] field278;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field276;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "[[[B")
    public byte[][][] field268;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIII)Z")
    public static final boolean method115(int arg0, int arg1, int arg2, int arg3) {
        if (!class222.method1567(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class17.field209[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class230.field3789) {
                    if (!class186.method1299(var4, var6, var5)) {
                        return false;
                    }
                    if (!class186.method1299(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class186.method1299(var4, var7, var5)) {
                        return false;
                    }
                    if (!class186.method1299(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class186.method1299(var4, var8, var5)) {
                    return false;
                }
                if (!class186.method1299(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class236.field3909) {
                    if (!class186.method1299(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class186.method1299(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class186.method1299(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class186.method1299(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class186.method1299(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class186.method1299(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class230.field3789) {
                    if (!class186.method1299(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class186.method1299(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class186.method1299(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class186.method1299(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class186.method1299(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class186.method1299(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class236.field3909) {
                    if (!class186.method1299(var4, var6, var5)) {
                        return false;
                    }
                    if (!class186.method1299(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class186.method1299(var4, var7, var5)) {
                        return false;
                    }
                    if (!class186.method1299(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class186.method1299(var4, var8, var5)) {
                    return false;
                }
                if (!class186.method1299(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class186.method1299(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class186.method1299(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class186.method1299(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class186.method1299(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class186.method1299(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(I)V")
    public static void method116(int arg0) {
        field280 = null;
        field279 = null;
        field270 = null;
        if (arg0 == -23759) {
            field282 = null;
            field276 = null;
            field266 = null;
            field277 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IZBII)V")
    public static final void method117(int arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        field283++;
        int var5 = 48 % ((-arg2 - 13) / 48);
        if (class210.method1477((byte) 97, arg0)) {
            class296.method1984(arg1, (byte) -127, arg4, arg3, -1, class75.field937[arg0]);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BZLwb;)V")
    public static final void method118(byte arg0, boolean arg1, class123 arg2) {
        field274++;
        if (arg0 != -2) {
            field279 = null;
        }
        int var3 = arg2.field1770 == 0 ? arg2.field1879 : arg2.field1770;
        int var4 = arg2.field1853 == 0 ? arg2.field1809 : arg2.field1853;
        class296.method1984(arg1, (byte) -127, var4, var3, arg2.field1844, class75.field937[arg2.field1844 >> 16]);
        if (arg2.field1748 != null) {
            class296.method1984(arg1, (byte) -127, var4, var3, arg2.field1844, arg2.field1748);
        }
        class86 var5 = (class86) class92.field1139.method708((long) arg2.field1844, 122);
        if (var5 != null) {
            method117(var5.field1064, arg1, (byte) -122, var3, var4);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z[BB)Ljava/lang/Object;")
    public static final Object method119(boolean arg0, byte[] arg1, byte arg2) {
        field265++;
        if (arg1 == null) {
            return null;
        } else if (arg2 == -84) {
            if (arg1.length > 136 && !class35.field453) {
                try {
                    class16 var3 = (class16) Class.forName("pl").getDeclaredConstructor().newInstance();
                    var3.method86(arg1, true);
                    return var3;
                } catch (Throwable var4) {
                    class35.field453 = true;
                }
            }
            return arg0 ? class19.method103(false, arg1) : arg1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(II)V")
    public static final void method120(int arg0, int arg1) {
        class124.field1929.method1695(arg1, 0);
        if (arg0 > -39) {
            method119(true, (byte[]) null, (byte) 89);
        }
        class206.field3290.method1695(arg1, 0);
        field264++;
        class189.field3067.method1695(arg1, 0);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class120 extends class86 {

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    public static int field1855 = 0;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "Ljava/lang/String;")
    public static String field1857 = "glow2:";

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    public int field1852;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public int field1853;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!u", name = "r", descriptor = "Lkf;")
    public static class184 field1854;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "Lne;")
    public static class52 field1856;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public static void method858(byte arg0) {
        if (arg0 != -23) {
            field1854 = null;
        }
        field1857 = null;
        field1854 = null;
        field1856 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(III)J")
    public static final long method859(int arg0, int arg1, int arg2) {
        class23 var3 = class255.field3907[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field360; var4++) {
            class172 var5 = var3.field358[var4];
            if ((var5.field2569 >> 29 & 0x3L) == 2L && var5.field2558 == arg1 && var5.field2560 == arg2) {
                return var5.field2569;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILuf;)V")
    public static final void method860(int arg0, class176 arg1) {
        class283.field4474 = arg1.method1168(arg0 + 20345, "runes");
        if (arg0 != 0) {
            field1857 = null;
        }
        field1858++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIII)Z")
    public static final boolean method861(int arg0, int arg1, int arg2, int arg3) {
        if (!class228.method1513(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class68.field1079[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class102.field1630) {
                    if (!class80.method630(var4, var6, var5)) {
                        return false;
                    }
                    if (!class80.method630(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class80.method630(var4, var7, var5)) {
                        return false;
                    }
                    if (!class80.method630(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class80.method630(var4, var8, var5)) {
                    return false;
                }
                if (!class80.method630(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class239.field3713) {
                    if (!class80.method630(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class80.method630(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class80.method630(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class80.method630(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class80.method630(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class80.method630(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class102.field1630) {
                    if (!class80.method630(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class80.method630(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class80.method630(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class80.method630(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class80.method630(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class80.method630(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class239.field3713) {
                    if (!class80.method630(var4, var6, var5)) {
                        return false;
                    }
                    if (!class80.method630(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class80.method630(var4, var7, var5)) {
                        return false;
                    }
                    if (!class80.method630(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class80.method630(var4, var8, var5)) {
                    return false;
                }
                if (!class80.method630(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class80.method630(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class80.method630(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class80.method630(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class80.method630(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class80.method630(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(Z)V")
    public static final void method862(boolean arg0) {
        class179.field2675.method1782(127);
        if (!arg0) {
            field1854 = null;
        }
        field1851++;
    }
}

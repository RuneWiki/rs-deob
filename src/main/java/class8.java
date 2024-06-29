import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class8 {

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field86 = 0;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "Lmh;")
    public static class62 field87 = class201.method1405(true, "null");

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "Lhi;")
    public static class26 field89;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII)Z", line = 12)
    public static final boolean method36(int arg0, int arg1, int arg2, int arg3) {
        if (!class62.method416(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class37.field569[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class144.field2300) {
                    if (!class201.method1411(var4, var6, var5)) {
                        return false;
                    }
                    if (!class201.method1411(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class201.method1411(var4, var7, var5)) {
                        return false;
                    }
                    if (!class201.method1411(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class201.method1411(var4, var8, var5)) {
                    return false;
                }
                if (!class201.method1411(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class270.field4579) {
                    if (!class201.method1411(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class201.method1411(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class201.method1411(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class201.method1411(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class201.method1411(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class201.method1411(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class144.field2300) {
                    if (!class201.method1411(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class201.method1411(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class201.method1411(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class201.method1411(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class201.method1411(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class201.method1411(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class270.field4579) {
                    if (!class201.method1411(var4, var6, var5)) {
                        return false;
                    }
                    if (!class201.method1411(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class201.method1411(var4, var7, var5)) {
                        return false;
                    }
                    if (!class201.method1411(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class201.method1411(var4, var8, var5)) {
                    return false;
                }
                if (!class201.method1411(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class201.method1411(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class201.method1411(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class201.method1411(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class201.method1411(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class201.method1411(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILhi;)V", line = 203)
    public static final void method37(int arg0, class26 arg1) {
        class301.field5180 = arg1;
        field88++;
        if (arg0 != 14665) {
            method37(-46, (class26) null);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)V", line = 228)
    public static void method38(boolean arg0) {
        if (arg0) {
            field87 = null;
            field89 = null;
        }
    }
}

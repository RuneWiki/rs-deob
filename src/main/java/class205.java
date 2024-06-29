import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public abstract class class205 {

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field3348 = 0;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public int field3345;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public int field3350;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public int field3351;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)Z", line = 7)
    public final boolean method1377(byte arg0) {
        if (arg0 >= -78) {
            this.field3350 = 94;
        }
        field3349++;
        return (this.field3345 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)Z", line = 20)
    public final boolean method1378(int arg0) {
        if (arg0 != 16) {
            this.field3350 = 88;
        }
        field3346++;
        return (this.field3345 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(B)Z", line = 33)
    public final boolean method1379(byte arg0) {
        field3344++;
        int var2 = 29 % ((arg0 + 10) / 44);
        return (this.field3345 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIII)Z", line = 42)
    public static final boolean method1380(int arg0, int arg1, int arg2, int arg3) {
        if (!class2.method8(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class45.field923[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class56.field1113) {
                    if (!class168.method1065(var4, var6, var5)) {
                        return false;
                    }
                    if (!class168.method1065(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class168.method1065(var4, var7, var5)) {
                        return false;
                    }
                    if (!class168.method1065(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class168.method1065(var4, var8, var5)) {
                    return false;
                }
                if (!class168.method1065(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class303.field4606) {
                    if (!class168.method1065(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class168.method1065(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class168.method1065(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class168.method1065(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class168.method1065(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class168.method1065(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class56.field1113) {
                    if (!class168.method1065(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class168.method1065(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class168.method1065(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class168.method1065(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class168.method1065(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class168.method1065(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class303.field4606) {
                    if (!class168.method1065(var4, var6, var5)) {
                        return false;
                    }
                    if (!class168.method1065(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class168.method1065(var4, var7, var5)) {
                        return false;
                    }
                    if (!class168.method1065(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class168.method1065(var4, var8, var5)) {
                    return false;
                }
                if (!class168.method1065(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class168.method1065(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class168.method1065(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class168.method1065(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class168.method1065(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class168.method1065(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(B)Z", line = 240)
    public final boolean method1381(byte arg0) {
        field3343++;
        if (arg0 <= 112) {
            this.method1377((byte) 2);
        }
        return (this.field3345 & 0x8) != 0;
    }
}

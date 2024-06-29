import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class203 extends class112 {

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public int field3205;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    public int field3207;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public int field3209;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "J")
    public long field3204;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V", line = 5)
    public static final void method1257(int arg0, int arg1) {
        if (arg0 == 27602) {
            field3211++;
            class64 var2 = class230.method1387(arg1, (byte) 40, 16);
            var2.method446(-20033);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)J", line = 19)
    public final long method803(byte arg0) {
        field3212++;
        return arg0 == 22 ? this.field3204 : 96L;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(IIII)Z", line = 31)
    public static final boolean method1258(int arg0, int arg1, int arg2, int arg3) {
        if (!class39.method218(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class239.field3602;
        int var5 = arg2 << class239.field3602;
        int var6 = class99.field1801[arg0].method318(arg1, arg2) - 1;
        int var7 = var6 - (0x78 << class239.field3602 - 7);
        int var8 = var6 - (0xE6 << class239.field3602 - 7);
        int var9 = var6 - (0xEE << class239.field3602 - 7);
        if (arg3 == 1) {
            if (var4 > class421.field6042) {
                if (!class262.method1590(var4, var6, var5)) {
                    return false;
                }
                if (!class262.method1590(var4, var6, class42.field621 + var5)) {
                    return false;
                }
                if (!class262.method1590(var4, var6, class434.field6362 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class262.method1590(var4, var7, var5)) {
                    return false;
                }
                if (!class262.method1590(var4, var7, class42.field621 + var5)) {
                    return false;
                }
                if (!class262.method1590(var4, var7, class434.field6362 + var5)) {
                    return false;
                }
            }
            if (!class262.method1590(var4, var8, var5)) {
                return false;
            } else if (class262.method1590(var4, var8, class42.field621 + var5)) {
                return class262.method1590(var4, var8, class434.field6362 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class168.field2618) {
                if (!class262.method1590(var4, var6, class434.field6362 + var5)) {
                    return false;
                }
                if (!class262.method1590(class42.field621 + var4, var6, class434.field6362 + var5)) {
                    return false;
                }
                if (!class262.method1590(class434.field6362 + var4, var6, class434.field6362 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class262.method1590(var4, var7, class434.field6362 + var5)) {
                    return false;
                }
                if (!class262.method1590(class42.field621 + var4, var7, class434.field6362 + var5)) {
                    return false;
                }
                if (!class262.method1590(class434.field6362 + var4, var7, class434.field6362 + var5)) {
                    return false;
                }
            }
            if (!class262.method1590(var4, var8, class434.field6362 + var5)) {
                return false;
            } else if (class262.method1590(class42.field621 + var4, var8, class434.field6362 + var5)) {
                return class262.method1590(class434.field6362 + var4, var8, class434.field6362 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class421.field6042) {
                if (!class262.method1590(class434.field6362 + var4, var6, var5)) {
                    return false;
                }
                if (!class262.method1590(class434.field6362 + var4, var6, class42.field621 + var5)) {
                    return false;
                }
                if (!class262.method1590(class434.field6362 + var4, var6, class434.field6362 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class262.method1590(class434.field6362 + var4, var7, var5)) {
                    return false;
                }
                if (!class262.method1590(class434.field6362 + var4, var7, class42.field621 + var5)) {
                    return false;
                }
                if (!class262.method1590(class434.field6362 + var4, var7, class434.field6362 + var5)) {
                    return false;
                }
            }
            if (!class262.method1590(class434.field6362 + var4, var8, var5)) {
                return false;
            } else if (class262.method1590(class434.field6362 + var4, var8, class42.field621 + var5)) {
                return class262.method1590(class434.field6362 + var4, var8, class434.field6362 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class168.field2618) {
                if (!class262.method1590(var4, var6, var5)) {
                    return false;
                }
                if (!class262.method1590(class42.field621 + var4, var6, var5)) {
                    return false;
                }
                if (!class262.method1590(class434.field6362 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class262.method1590(var4, var7, var5)) {
                    return false;
                }
                if (!class262.method1590(class42.field621 + var4, var7, var5)) {
                    return false;
                }
                if (!class262.method1590(class434.field6362 + var4, var7, var5)) {
                    return false;
                }
            }
            if (!class262.method1590(var4, var8, var5)) {
                return false;
            } else if (class262.method1590(class42.field621 + var4, var8, var5)) {
                return class262.method1590(class434.field6362 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class262.method1590(class42.field621 + var4, var9, class42.field621 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class262.method1590(var4, var8, class434.field6362 + var5);
        } else if (arg3 == 32) {
            return class262.method1590(class434.field6362 + var4, var8, class434.field6362 + var5);
        } else if (arg3 == 64) {
            return class262.method1590(class434.field6362 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class262.method1590(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!db", name = "g", descriptor = "(I)I", line = 251)
    public final int method805(int arg0) {
        field3208++;
        if (arg0 != -4) {
            this.field3204 = -98L;
        }
        return this.field3207;
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(I)I", line = 262)
    public final int method802(int arg0) {
        field3206++;
        return arg0 == 6 ? this.field3205 : 33;
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(I)I", line = 274)
    public final int method801(int arg0) {
        int var2 = 121 % ((-arg0 - 18) / 61);
        field3210++;
        return this.field3209;
    }
}

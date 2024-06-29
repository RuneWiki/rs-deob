import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class141 extends class403 {

    @OriginalMember(owner = "client!hi", name = "Eb", descriptor = "Lmt;")
    public static class276 field1844 = new class276(11, 0, 1, 2);

    @OriginalMember(owner = "client!hi", name = "Fb", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!hi", name = "Gb", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!hi", name = "Hb", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!hi", name = "Jb", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!hi", name = "Ib", descriptor = "Z")
    public static boolean field1848;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IF)V", line = 5)
    public final void method882(int arg0, float arg1) {
        if (arg0 != -1491643256) {
            method884(-25, 40, 61, 99);
        }
        ++field1849;
        int var3 = NativeStream.floatToRawIntBits(arg1);
        super.field5663[super.field5665++] = (byte) var3;
        super.field5663[super.field5665++] = (byte) (var3 >> 8);
        super.field5663[super.field5665++] = (byte) (var3 >> 16);
        super.field5663[super.field5665++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "(I)V", line = 23)
    public static void method883(int arg0) {
        if (arg0 != 7) {
            method883(29);
        }
        field1844 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIII)Z", line = 33)
    public static final boolean method884(int arg0, int arg1, int arg2, int arg3) {
        if (!class422.method2503(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << class493.field6970;
            int var5 = arg2 << class493.field6970;
            int var6 = class330.field4818[arg0].method10(arg1, arg2) - 1;
            int var7 = var6 - (120 << class493.field6970 - 7);
            int var8 = var6 - (230 << class493.field6970 - 7);
            int var9 = var6 - (238 << class493.field6970 - 7);
            if (arg3 == 1) {
                if (var4 > class347.field5024) {
                    if (!class395.method2299(var4, var6, var5)) {
                        return false;
                    }
                    if (!class395.method2299(var4, var6, class534.field7832 + var5)) {
                        return false;
                    }
                    if (!class395.method2299(var4, var6, class169.field2463 + var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class395.method2299(var4, var7, var5)) {
                        return false;
                    }
                    if (!class395.method2299(var4, var7, class534.field7832 + var5)) {
                        return false;
                    }
                    if (!class395.method2299(var4, var7, class169.field2463 + var5)) {
                        return false;
                    }
                }
                if (!class395.method2299(var4, var8, var5)) {
                    return false;
                } else if (!class395.method2299(var4, var8, class534.field7832 + var5)) {
                    return false;
                } else {
                    return class395.method2299(var4, var8, class169.field2463 + var5);
                }
            } else if (arg3 == 2) {
                if (var5 < class181.field2608) {
                    if (!class395.method2299(var4, var6, class169.field2463 + var5)) {
                        return false;
                    }
                    if (!class395.method2299(class534.field7832 + var4, var6, class169.field2463 + var5)) {
                        return false;
                    }
                    if (!class395.method2299(class169.field2463 + var4, var6, class169.field2463 + var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class395.method2299(var4, var7, class169.field2463 + var5)) {
                        return false;
                    }
                    if (!class395.method2299(class534.field7832 + var4, var7, class169.field2463 + var5)) {
                        return false;
                    }
                    if (!class395.method2299(class169.field2463 + var4, var7, class169.field2463 + var5)) {
                        return false;
                    }
                }
                if (!class395.method2299(var4, var8, class169.field2463 + var5)) {
                    return false;
                } else if (!class395.method2299(class534.field7832 + var4, var8, class169.field2463 + var5)) {
                    return false;
                } else {
                    return class395.method2299(class169.field2463 + var4, var8, class169.field2463 + var5);
                }
            } else if (arg3 == 4) {
                if (var4 < class347.field5024) {
                    if (!class395.method2299(class169.field2463 + var4, var6, var5)) {
                        return false;
                    }
                    if (!class395.method2299(class169.field2463 + var4, var6, class534.field7832 + var5)) {
                        return false;
                    }
                    if (!class395.method2299(class169.field2463 + var4, var6, class169.field2463 + var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class395.method2299(class169.field2463 + var4, var7, var5)) {
                        return false;
                    }
                    if (!class395.method2299(class169.field2463 + var4, var7, class534.field7832 + var5)) {
                        return false;
                    }
                    if (!class395.method2299(class169.field2463 + var4, var7, class169.field2463 + var5)) {
                        return false;
                    }
                }
                if (!class395.method2299(class169.field2463 + var4, var8, var5)) {
                    return false;
                } else if (!class395.method2299(class169.field2463 + var4, var8, class534.field7832 + var5)) {
                    return false;
                } else {
                    return class395.method2299(class169.field2463 + var4, var8, class169.field2463 + var5);
                }
            } else if (arg3 == 8) {
                if (var5 > class181.field2608) {
                    if (!class395.method2299(var4, var6, var5)) {
                        return false;
                    }
                    if (!class395.method2299(class534.field7832 + var4, var6, var5)) {
                        return false;
                    }
                    if (!class395.method2299(class169.field2463 + var4, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class395.method2299(var4, var7, var5)) {
                        return false;
                    }
                    if (!class395.method2299(class534.field7832 + var4, var7, var5)) {
                        return false;
                    }
                    if (!class395.method2299(class169.field2463 + var4, var7, var5)) {
                        return false;
                    }
                }
                if (!class395.method2299(var4, var8, var5)) {
                    return false;
                } else if (!class395.method2299(class534.field7832 + var4, var8, var5)) {
                    return false;
                } else {
                    return class395.method2299(class169.field2463 + var4, var8, var5);
                }
            } else if (!class395.method2299(class534.field7832 + var4, var9, class534.field7832 + var5)) {
                return false;
            } else if (arg3 == 16) {
                return class395.method2299(var4, var8, class169.field2463 + var5);
            } else if (arg3 == 32) {
                return class395.method2299(class169.field2463 + var4, var8, class169.field2463 + var5);
            } else if (arg3 == 64) {
                return class395.method2299(class169.field2463 + var4, var8, var5);
            } else if (arg3 == 128) {
                return class395.method2299(var4, var8, var5);
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZB)V", line = 249)
    public static final void method885(boolean arg0, byte arg1) {
        ++field1846;
        if (class483.field6728.length() != 0) {
            if (arg1 == 93) {
                class486.method2805(94, "--> " + class483.field6728);
                class521.method3081(false, (byte) -16, class483.field6728, arg0);
                class483.field6728 = "";
                class511.field7567 = 0;
                class386.field5422 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(IF)V", line = 267)
    public final void method886(int arg0, float arg1) {
        ++field1845;
        int var3 = NativeStream.floatToRawIntBits(arg1);
        super.field5663[super.field5665++] = (byte) (var3 >> 24);
        super.field5663[super.field5665++] = (byte) (var3 >> 16);
        super.field5663[super.field5665++] = (byte) (var3 >> 8);
        super.field5663[super.field5665++] = (byte) var3;
        if (arg0 != 0) {
            method884(106, 108, -67, 125);
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(I)V", line = 292)
    public class141(int arg0) {
        super(arg0);
    }
}

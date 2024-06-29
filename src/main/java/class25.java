import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class25 {

    @OriginalMember(owner = "client!na", name = "f", descriptor = "Z")
    public static boolean field413 = false;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "J")
    public long field417;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "Lqm;")
    public static class222 field419;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "Lna;")
    public class25 field408;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "Lna;")
    public class25 field415;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "[I")
    public static int[] field412;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method228(int arg0) {
        if (arg0 != 99999999) {
            field412 = (int[]) null;
        }
        field411++;
        return this.field408 != null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IBI)Lja;", line = 24)
    public static final class60 method229(int arg0, byte arg1, int arg2) {
        field418++;
        if (arg1 != 124) {
            field412 = (int[]) null;
        }
        class60 var3 = class125.method907(arg2, -76);
        if (arg0 == -1) {
            return var3;
        } else if (var3 == null || var3.field1100 == null || arg0 >= var3.field1100.length) {
            return null;
        } else {
            return var3.field1100[arg0];
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIII)Z", line = 62)
    public static final boolean method230(int arg0, int arg1, int arg2, int arg3) {
        if (!class281.method1946(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class96.field1764[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class165.field2900) {
                    if (!class164.method1178(var4, var6, var5)) {
                        return false;
                    }
                    if (!class164.method1178(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class164.method1178(var4, var7, var5)) {
                        return false;
                    }
                    if (!class164.method1178(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class164.method1178(var4, var8, var5)) {
                    return false;
                }
                if (!class164.method1178(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class249.field4331) {
                    if (!class164.method1178(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class164.method1178(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class164.method1178(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class164.method1178(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class164.method1178(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class164.method1178(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class165.field2900) {
                    if (!class164.method1178(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class164.method1178(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class164.method1178(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class164.method1178(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class164.method1178(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class164.method1178(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class249.field4331) {
                    if (!class164.method1178(var4, var6, var5)) {
                        return false;
                    }
                    if (!class164.method1178(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class164.method1178(var4, var7, var5)) {
                        return false;
                    }
                    if (!class164.method1178(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class164.method1178(var4, var8, var5)) {
                    return false;
                }
                if (!class164.method1178(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class164.method1178(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class164.method1178(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class164.method1178(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class164.method1178(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class164.method1178(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IJILcd;III)V", line = 249)
    public static final void method231(int arg0, long arg1, int arg2, class64 arg3, int arg4, int arg5, int arg6) {
        field410++;
        class13 var8 = new class13(128);
        var8.method130(-1, 10);
        var8.method145(112, (int) (Math.random() * 99999.0D));
        var8.method145(92, 514);
        var8.method161((byte) -125, arg1);
        var8.method128((byte) 122, (int) (Math.random() * 9.9999999E7D));
        if (arg2 < 101) {
            method234((byte) 14);
        }
        var8.method116(false, arg3);
        var8.method128((byte) 110, (int) (Math.random() * 9.9999999E7D));
        var8.method145(97, class188.field3241);
        var8.method130(-1, arg5);
        var8.method130(-1, arg6);
        var8.method128((byte) -61, (int) (Math.random() * 9.9999999E7D));
        var8.method145(102, arg4);
        var8.method145(121, arg0);
        var8.method128((byte) -83, (int) (Math.random() * 9.9999999E7D));
        var8.method144(class60.field1151, (byte) -127, class234.field3947);
        class17.field353.field281 = 0;
        class17.field353.method130(-1, 161);
        class17.field353.method130(-1, var8.field281);
        class17.field353.method157(var8.field281, true, var8.field254, 0);
        class99.field1792 = 1;
        class138.field2456 = -3;
        class261.field4486 = 0;
        class269.field4649 = 0;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V", line = 291)
    public final void method232(int arg0) {
        field414++;
        if (this.field408 == null) {
            return;
        }
        this.field408.field415 = this.field415;
        if (arg0 != 128) {
            field413 = true;
        }
        this.field415.field408 = this.field408;
        this.field408 = null;
        this.field415 = null;
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V", line = 310)
    public static void method233(int arg0) {
        field419 = null;
        field412 = null;
        int var1 = -86 / ((38 - arg0) / 59);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V", line = 320)
    public static final void method234(byte arg0) {
        if (arg0 < 29) {
            method234((byte) -13);
        }
        class228.field3870.method1198(false);
        field409++;
    }
}

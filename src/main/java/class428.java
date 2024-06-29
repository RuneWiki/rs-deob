import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class428 {

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "I")
    public static int field5750 = -1;

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "S")
    public static short field5752 = 205;

    @OriginalMember(owner = "client!eaa", name = "f", descriptor = "I")
    public static int field5755 = -1;

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!eaa", name = "g", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "[Z")
    public static boolean[] field5753;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IBII)I")
    public static final int method2506(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 >= -64) {
            method2506(76, (byte) 58, -67, -103);
        }
        field5754++;
        int var4 = 255 - arg3;
        int var5 = ((arg2 & 0xFF00) * arg3 & 0xFF0000 | (arg2 & 0xFF00FF) * arg3 & 0xFF00FF00) >>> 8;
        return (((arg0 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg0 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V")
    public static void method2507(int arg0) {
        field5753 = null;
        if (arg0 != 0) {
            method2506(-44, (byte) -102, -17, -52);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(II)V")
    public static final void method2508(int arg0, int arg1) {
        field5751++;
        class221 var2 = class65.method413(12, arg0, (byte) 121);
        int var3 = 17 % ((arg1 + 65) / 58);
        var2.method1432(0);
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIII)Z")
    public static final boolean method2509(int arg0, int arg1, int arg2, int arg3) {
        if (!class190.method1303(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class115.field1626;
        int var5 = arg2 << class115.field1626;
        int var6 = class165.field2609[arg0].method1239(arg1, arg2) - 1;
        int var7 = var6 - (0x78 << class115.field1626 - 7);
        int var8 = var6 - (0xE6 << class115.field1626 - 7);
        int var9 = var6 - (0xEE << class115.field1626 - 7);
        if (arg3 == 1) {
            if (var4 > class103.field1488) {
                if (!class94.method740(var4, var6, var5)) {
                    return false;
                }
                if (!class94.method740(var4, var6, class402.field5500 + var5)) {
                    return false;
                }
                if (!class94.method740(var4, var6, class96.field1409 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class94.method740(var4, var7, var5)) {
                    return false;
                }
                if (!class94.method740(var4, var7, class402.field5500 + var5)) {
                    return false;
                }
                if (!class94.method740(var4, var7, class96.field1409 + var5)) {
                    return false;
                }
            }
            if (!class94.method740(var4, var8, var5)) {
                return false;
            } else if (class94.method740(var4, var8, class402.field5500 + var5)) {
                return class94.method740(var4, var8, class96.field1409 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class311.field4288) {
                if (!class94.method740(var4, var6, class96.field1409 + var5)) {
                    return false;
                }
                if (!class94.method740(class402.field5500 + var4, var6, class96.field1409 + var5)) {
                    return false;
                }
                if (!class94.method740(class96.field1409 + var4, var6, class96.field1409 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class94.method740(var4, var7, class96.field1409 + var5)) {
                    return false;
                }
                if (!class94.method740(class402.field5500 + var4, var7, class96.field1409 + var5)) {
                    return false;
                }
                if (!class94.method740(class96.field1409 + var4, var7, class96.field1409 + var5)) {
                    return false;
                }
            }
            if (!class94.method740(var4, var8, class96.field1409 + var5)) {
                return false;
            } else if (class94.method740(class402.field5500 + var4, var8, class96.field1409 + var5)) {
                return class94.method740(class96.field1409 + var4, var8, class96.field1409 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class103.field1488) {
                if (!class94.method740(class96.field1409 + var4, var6, var5)) {
                    return false;
                }
                if (!class94.method740(class96.field1409 + var4, var6, class402.field5500 + var5)) {
                    return false;
                }
                if (!class94.method740(class96.field1409 + var4, var6, class96.field1409 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class94.method740(class96.field1409 + var4, var7, var5)) {
                    return false;
                }
                if (!class94.method740(class96.field1409 + var4, var7, class402.field5500 + var5)) {
                    return false;
                }
                if (!class94.method740(class96.field1409 + var4, var7, class96.field1409 + var5)) {
                    return false;
                }
            }
            if (!class94.method740(class96.field1409 + var4, var8, var5)) {
                return false;
            } else if (class94.method740(class96.field1409 + var4, var8, class402.field5500 + var5)) {
                return class94.method740(class96.field1409 + var4, var8, class96.field1409 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class311.field4288) {
                if (!class94.method740(var4, var6, var5)) {
                    return false;
                }
                if (!class94.method740(class402.field5500 + var4, var6, var5)) {
                    return false;
                }
                if (!class94.method740(class96.field1409 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class94.method740(var4, var7, var5)) {
                    return false;
                }
                if (!class94.method740(class402.field5500 + var4, var7, var5)) {
                    return false;
                }
                if (!class94.method740(class96.field1409 + var4, var7, var5)) {
                    return false;
                }
            }
            if (!class94.method740(var4, var8, var5)) {
                return false;
            } else if (class94.method740(class402.field5500 + var4, var8, var5)) {
                return class94.method740(class96.field1409 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class94.method740(class402.field5500 + var4, var9, class402.field5500 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class94.method740(var4, var8, class96.field1409 + var5);
        } else if (arg3 == 32) {
            return class94.method740(class96.field1409 + var4, var8, class96.field1409 + var5);
        } else if (arg3 == 64) {
            return class94.method740(class96.field1409 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class94.method740(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)V")
    public static final void method2510(int arg0) {
        class408.field5573 = null;
        if (arg0 != 11) {
            field5752 = 13;
        }
        class487.field6924 = false;
        class133.field1822 = null;
        class601.field8919 = null;
        field5756++;
        class496.field7055 = null;
        class482.field6883 = null;
    }
}

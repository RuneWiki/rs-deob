import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class81 extends class28 {

    @OriginalMember(owner = "client!cba", name = "x", descriptor = "[B")
    public byte[] field1109;

    @OriginalMember(owner = "client!cba", name = "v", descriptor = "Z")
    public static boolean field1107 = false;

    @OriginalMember(owner = "client!cba", name = "u", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!cba", name = "w", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!cba", name = "y", descriptor = "Lsga;")
    public static class547 field1110;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIII)Z", line = 10)
    public static final boolean method632(int arg0, int arg1, int arg2, int arg3) {
        if (!class207.method1332(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class291.field3760;
        int var5 = arg2 << class291.field3760;
        int var6 = class392.field4997[arg0].method668(arg1, arg2) - 1;
        int var7 = var6 - (0x78 << class291.field3760 - 7);
        int var8 = var6 - (0xE6 << class291.field3760 - 7);
        int var9 = var6 - (0xEE << class291.field3760 - 7);
        if (arg3 == 1) {
            if (var4 > class77.field1049) {
                if (!class239.method1510(var4, var6, var5)) {
                    return false;
                }
                if (!class239.method1510(var4, var6, class57.field768 + var5)) {
                    return false;
                }
                if (!class239.method1510(var4, var6, class688.field9414 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class239.method1510(var4, var7, var5)) {
                    return false;
                }
                if (!class239.method1510(var4, var7, class57.field768 + var5)) {
                    return false;
                }
                if (!class239.method1510(var4, var7, class688.field9414 + var5)) {
                    return false;
                }
            }
            if (!class239.method1510(var4, var8, var5)) {
                return false;
            } else if (class239.method1510(var4, var8, class57.field768 + var5)) {
                return class239.method1510(var4, var8, class688.field9414 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class323.field4198) {
                if (!class239.method1510(var4, var6, class688.field9414 + var5)) {
                    return false;
                }
                if (!class239.method1510(class57.field768 + var4, var6, class688.field9414 + var5)) {
                    return false;
                }
                if (!class239.method1510(class688.field9414 + var4, var6, class688.field9414 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class239.method1510(var4, var7, class688.field9414 + var5)) {
                    return false;
                }
                if (!class239.method1510(class57.field768 + var4, var7, class688.field9414 + var5)) {
                    return false;
                }
                if (!class239.method1510(class688.field9414 + var4, var7, class688.field9414 + var5)) {
                    return false;
                }
            }
            if (!class239.method1510(var4, var8, class688.field9414 + var5)) {
                return false;
            } else if (class239.method1510(class57.field768 + var4, var8, class688.field9414 + var5)) {
                return class239.method1510(class688.field9414 + var4, var8, class688.field9414 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class77.field1049) {
                if (!class239.method1510(class688.field9414 + var4, var6, var5)) {
                    return false;
                }
                if (!class239.method1510(class688.field9414 + var4, var6, class57.field768 + var5)) {
                    return false;
                }
                if (!class239.method1510(class688.field9414 + var4, var6, class688.field9414 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class239.method1510(class688.field9414 + var4, var7, var5)) {
                    return false;
                }
                if (!class239.method1510(class688.field9414 + var4, var7, class57.field768 + var5)) {
                    return false;
                }
                if (!class239.method1510(class688.field9414 + var4, var7, class688.field9414 + var5)) {
                    return false;
                }
            }
            if (!class239.method1510(class688.field9414 + var4, var8, var5)) {
                return false;
            } else if (class239.method1510(class688.field9414 + var4, var8, class57.field768 + var5)) {
                return class239.method1510(class688.field9414 + var4, var8, class688.field9414 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class323.field4198) {
                if (!class239.method1510(var4, var6, var5)) {
                    return false;
                }
                if (!class239.method1510(class57.field768 + var4, var6, var5)) {
                    return false;
                }
                if (!class239.method1510(class688.field9414 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class239.method1510(var4, var7, var5)) {
                    return false;
                }
                if (!class239.method1510(class57.field768 + var4, var7, var5)) {
                    return false;
                }
                if (!class239.method1510(class688.field9414 + var4, var7, var5)) {
                    return false;
                }
            }
            if (!class239.method1510(var4, var8, var5)) {
                return false;
            } else if (class239.method1510(class57.field768 + var4, var8, var5)) {
                return class239.method1510(class688.field9414 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class239.method1510(class57.field768 + var4, var9, class57.field768 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class239.method1510(var4, var8, class688.field9414 + var5);
        } else if (arg3 == 32) {
            return class239.method1510(class688.field9414 + var4, var8, class688.field9414 + var5);
        } else if (arg3 == 64) {
            return class239.method1510(class688.field9414 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class239.method1510(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)V", line = 227)
    public static final void method633(byte arg0) {
        field1106++;
        class359.field4658.method2934((byte) -59);
        class414.field5327 = null;
        if (arg0 != -122) {
            method632(120, 117, 19, -121);
        }
        class426.field5523 = 1;
    }

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "(I)V", line = 244)
    public static void method634(int arg0) {
        field1110 = null;
        if (arg0 != 1) {
            field1110 = null;
        }
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "([B)V", line = 253)
    public class81(byte[] arg0) {
        this.field1109 = arg0;
    }
}

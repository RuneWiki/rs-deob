import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class519 {

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "Lgm;")
    public class393 field7690 = new class393();

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "Z")
    public boolean field7693 = false;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public static int field7687;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public static int field7688;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field7689;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    public int field7691;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    public int field7692;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method3110(byte arg0, String arg1) {
        field7687++;
        if (arg0 > 73) {
            System.out.println("Error: " + class421.method2689("\n", arg1, "%0a", (byte) -40));
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIII)Z")
    public static final boolean method3111(int arg0, int arg1, int arg2, int arg3) {
        if (!class216.method1591(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class56.field908;
        int var5 = arg2 << class56.field908;
        int var6 = class53.field732[arg0].method688(arg1, arg2) - 1;
        int var7 = var6 - (0x78 << class56.field908 - 7);
        int var8 = var6 - (0xE6 << class56.field908 - 7);
        int var9 = var6 - (0xEE << class56.field908 - 7);
        if (arg3 == 1) {
            if (var4 > class329.field5178) {
                if (!class31.method200(var4, var6, var5)) {
                    return false;
                }
                if (!class31.method200(var4, var6, class376.field5781 + var5)) {
                    return false;
                }
                if (!class31.method200(var4, var6, class42.field454 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class31.method200(var4, var7, var5)) {
                    return false;
                }
                if (!class31.method200(var4, var7, class376.field5781 + var5)) {
                    return false;
                }
                if (!class31.method200(var4, var7, class42.field454 + var5)) {
                    return false;
                }
            }
            if (!class31.method200(var4, var8, var5)) {
                return false;
            } else if (class31.method200(var4, var8, class376.field5781 + var5)) {
                return class31.method200(var4, var8, class42.field454 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class32.field331) {
                if (!class31.method200(var4, var6, class42.field454 + var5)) {
                    return false;
                }
                if (!class31.method200(class376.field5781 + var4, var6, class42.field454 + var5)) {
                    return false;
                }
                if (!class31.method200(class42.field454 + var4, var6, class42.field454 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class31.method200(var4, var7, class42.field454 + var5)) {
                    return false;
                }
                if (!class31.method200(class376.field5781 + var4, var7, class42.field454 + var5)) {
                    return false;
                }
                if (!class31.method200(class42.field454 + var4, var7, class42.field454 + var5)) {
                    return false;
                }
            }
            if (!class31.method200(var4, var8, class42.field454 + var5)) {
                return false;
            } else if (class31.method200(class376.field5781 + var4, var8, class42.field454 + var5)) {
                return class31.method200(class42.field454 + var4, var8, class42.field454 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class329.field5178) {
                if (!class31.method200(class42.field454 + var4, var6, var5)) {
                    return false;
                }
                if (!class31.method200(class42.field454 + var4, var6, class376.field5781 + var5)) {
                    return false;
                }
                if (!class31.method200(class42.field454 + var4, var6, class42.field454 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class31.method200(class42.field454 + var4, var7, var5)) {
                    return false;
                }
                if (!class31.method200(class42.field454 + var4, var7, class376.field5781 + var5)) {
                    return false;
                }
                if (!class31.method200(class42.field454 + var4, var7, class42.field454 + var5)) {
                    return false;
                }
            }
            if (!class31.method200(class42.field454 + var4, var8, var5)) {
                return false;
            } else if (class31.method200(class42.field454 + var4, var8, class376.field5781 + var5)) {
                return class31.method200(class42.field454 + var4, var8, class42.field454 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class32.field331) {
                if (!class31.method200(var4, var6, var5)) {
                    return false;
                }
                if (!class31.method200(class376.field5781 + var4, var6, var5)) {
                    return false;
                }
                if (!class31.method200(class42.field454 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class31.method200(var4, var7, var5)) {
                    return false;
                }
                if (!class31.method200(class376.field5781 + var4, var7, var5)) {
                    return false;
                }
                if (!class31.method200(class42.field454 + var4, var7, var5)) {
                    return false;
                }
            }
            if (!class31.method200(var4, var8, var5)) {
                return false;
            } else if (class31.method200(class376.field5781 + var4, var8, var5)) {
                return class31.method200(class42.field454 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class31.method200(class376.field5781 + var4, var9, class376.field5781 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class31.method200(var4, var8, class42.field454 + var5);
        } else if (arg3 == 32) {
            return class31.method200(class42.field454 + var4, var8, class42.field454 + var5);
        } else if (arg3 == 64) {
            return class31.method200(class42.field454 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class31.method200(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
    public static final void method3112(int arg0) {
        field7689++;
        if (arg0 != -15537) {
            return;
        }
        if (class148.field1994 == 6) {
            class496.method3034(true, false);
        } else {
            class457.field7053 = class338.field5281;
            class338.field5281 = null;
            class89.method610(12, (byte) -52);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIB)I")
    public static final int method3113(int arg0, int arg1, int arg2, byte arg3) {
        field7688++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 1023 - arg0;
        } else if (arg3 == -73) {
            return var4 == 2 ? 1023 - arg1 : arg0;
        } else {
            return 108;
        }
    }
}

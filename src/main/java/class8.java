import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class8 {

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "[I")
    public static int[] field154 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "Lrd;")
    private static class173 field153 = class133.method843("The server is being updated)3", 87);

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Lrd;")
    public static class173 field149 = field153;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "Llc;")
    public static class112 field150 = new class112(32);

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "J")
    public static long field155 = 0L;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "La;")
    public static class1 field156;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static final void method54(int arg0) {
        field151++;
        class182.field3571.method53(-51);
        int var1 = -110 % ((27 - arg0) / 50);
        class216.field4185.method53(-51);
        class30.field605.method53(-51);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIZ)I")
    public static final int method55(int arg0, int arg1, boolean arg2) {
        field148++;
        if (arg0 == -1) {
            return 12345678;
        } else if (arg2) {
            int var3 = (arg0 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        } else {
            return 40;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public static void method56(byte arg0) {
        int var1 = -68 / ((21 - arg0) / 59);
        field149 = null;
        field153 = null;
        field156 = null;
        field154 = null;
        field150 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIII)Z")
    public static final boolean method57(int arg0, int arg1, int arg2, int arg3) {
        if (!class212.method1394(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class124.field2328[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class98.field1791) {
                    if (!class89.method570(var4, var6, var5)) {
                        return false;
                    }
                    if (!class89.method570(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class89.method570(var4, var7, var5)) {
                        return false;
                    }
                    if (!class89.method570(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class89.method570(var4, var8, var5)) {
                    return false;
                }
                if (!class89.method570(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class161.field2998) {
                    if (!class89.method570(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class89.method570(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class89.method570(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class89.method570(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class89.method570(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class89.method570(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class98.field1791) {
                    if (!class89.method570(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class89.method570(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class89.method570(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class89.method570(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class89.method570(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class89.method570(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class161.field2998) {
                    if (!class89.method570(var4, var6, var5)) {
                        return false;
                    }
                    if (!class89.method570(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class89.method570(var4, var7, var5)) {
                        return false;
                    }
                    if (!class89.method570(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class89.method570(var4, var8, var5)) {
                    return false;
                }
                if (!class89.method570(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class89.method570(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class89.method570(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class89.method570(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class89.method570(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class89.method570(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIILjava/awt/Component;Lna;)Lhi;")
    public static final class79 method58(int arg0, int arg1, int arg2, Component arg3, class130 arg4) {
        field152++;
        if (class52.field1072 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class79 var5 = (class79) Class.forName("uh").getDeclaredConstructor().newInstance();
                var5.field1563 = arg1;
                var5.field1542 = new int[(class125.field2344 ? 2 : 1) * 256];
                var5.method479(arg3);
                var5.field1571 = (arg1 & 0xFFFFFC00) + 1024;
                if (var5.field1571 > 16384) {
                    var5.field1571 = 16384;
                }
                var5.method493(var5.field1571);
                if (class204.field4003 > 0 && class195.field3788 == null) {
                    class195.field3788 = new class204();
                    class195.field3788.field3996 = arg4;
                    arg4.method835(class204.field4003, -24542, class195.field3788);
                }
                if (class195.field3788 != null) {
                    if (class195.field3788.field4004[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class195.field3788.field4004[arg2] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    if (arg0 != 27865) {
                        field153 = null;
                    }
                    class201 var6 = new class201(arg4, arg2);
                    var6.field1563 = arg1;
                    var6.field1542 = new int[(class125.field2344 ? 2 : 1) * 256];
                    var6.method479(arg3);
                    var6.field1571 = 16384;
                    var6.method493(var6.field1571);
                    if (class204.field4003 > 0 && class195.field3788 == null) {
                        class195.field3788 = new class204();
                        class195.field3788.field3996 = arg4;
                        arg4.method835(class204.field4003, -24542, class195.field3788);
                    }
                    if (class195.field3788 != null) {
                        if (class195.field3788.field4004[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class195.field3788.field4004[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class79();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}

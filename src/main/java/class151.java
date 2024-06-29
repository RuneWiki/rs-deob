import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class151 {

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "[I")
    public int[] field1883;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "[I")
    public static int[] field1882 = new int[256];

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "Ltja;")
    public static class288 field1886;

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "J")
    public static long field1891;

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "[I")
    public static int[] field1890;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "I")
    public static int field1889;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1882[var0] = var1;
        }
        field1886 = new class288(4);
        field1891 = 1L;
        field1890 = new int[32];
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZLes;)V", line = 7)
    private final void method1081(boolean arg0, class403 arg1) {
        if (arg0) {
            field1886 = null;
        }
        field1888++;
        while (true) {
            int var3;
            do {
                var3 = arg1.method2396((byte) 66);
                if (var3 == 0) {
                    return;
                }
            } while (var3 != 1);
            int var4 = arg1.method2396((byte) 43);
            this.field1883 = new int[var4];
            for (int var5 = 0; var5 < this.field1883.length; var5++) {
                this.field1883[var5] = arg1.method2396((byte) 42);
            }
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Ld;IZILbt;Ljava/awt/Canvas;)Lha;", line = 61)
    public static final class66 method1082(class162 arg0, int arg1, boolean arg2, int arg3, class48 arg4, Canvas arg5) {
        if (arg2) {
            method1085(12, -36, -107, 92, -90, 114);
        }
        field1884++;
        int var6 = 0;
        int var7 = 0;
        if (arg5 != null) {
            Dimension var8 = arg5.getSize();
            var7 = var8.height;
            var6 = var8.width;
        }
        return class66.method618(var6, arg0, arg4, arg1, arg3, var7, arg5, (byte) 99);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(III)I", line = 84)
    public static final int method1083(int arg0, int arg1, int arg2) {
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        if (arg1 != 65408) {
            method1082(null, -21, true, 12, null, null);
        }
        field1885++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Z)V", line = 107)
    public static void method1084(boolean arg0) {
        field1886 = null;
        field1882 = null;
        field1890 = null;
        if (arg0) {
            method1082(null, -96, true, -56, null, null);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIIII)V", line = 119)
    public static final void method1085(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1887++;
        int var6 = arg4 - arg0;
        int var7 = arg2 - arg1;
        if (var6 == 0) {
            if (var7 != 0) {
                class390.method2287(arg0, arg2, arg1, arg3 - 2, arg5);
            }
        } else if (var7 == 0) {
            class501.method2972(1000, arg5, arg1, arg4, arg0);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg1 - (arg0 * var8 >> 12);
            if (arg3 == -1) {
                int var10;
                int var11;
                if (arg4 < class471.field6572) {
                    var10 = class471.field6572;
                    var11 = (class471.field6572 * var8 >> 12) + var9;
                } else if (arg4 > class223.field2604) {
                    var11 = (class223.field2604 * var8 >> 12) + var9;
                    var10 = class223.field2604;
                } else {
                    var10 = arg4;
                    var11 = arg2;
                }
                int var12;
                int var13;
                if (arg0 < class471.field6572) {
                    var13 = var9 + (class471.field6572 * var8 >> 12);
                    var12 = class471.field6572;
                } else if (class223.field2604 >= arg0) {
                    var12 = arg0;
                    var13 = arg1;
                } else {
                    var13 = var9 + (class223.field2604 * var8 >> 12);
                    var12 = class223.field2604;
                }
                if (class187.field2268 > var13) {
                    var12 = (class187.field2268 - var9 << 12) / var8;
                    var13 = class187.field2268;
                } else if (class461.field6480 < var13) {
                    var13 = class461.field6480;
                    var12 = (class461.field6480 - var9 << 12) / var8;
                }
                if (var11 < class187.field2268) {
                    var10 = (class187.field2268 - var9 << 12) / var8;
                    var11 = class187.field2268;
                } else if (var11 > class461.field6480) {
                    var11 = class461.field6480;
                    var10 = (class461.field6480 - var9 << 12) / var8;
                }
                class639.method3588(arg5, var12, var11, var13, var10, (byte) -116);
            }
        }
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lbt;)V", line = 251)
    public class151(class48 arg0) {
        byte[] var2 = arg0.method453(6, 11040);
        this.method1081(false, new class403(var2));
        if (this.field1883 == null) {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "()V", line = 267)
    protected class151() {
        this.field1883 = new int[0];
    }
}

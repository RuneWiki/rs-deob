import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class481 {

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public int field6662;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "Ldia;")
    private class246 field6663;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "[I")
    public static int[] field6657 = new int[256];

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field6656;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field6658;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field6659;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "Luu;")
    public static class303 field6661;

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
            field6657[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!td", name = "finalize", descriptor = "()V", line = 8)
    protected final void finalize() throws Throwable {
        field6659++;
        this.field6663.method1585(this.field6662, (byte) -112);
        super.finalize();
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V", line = 17)
    public static void method2800(int arg0) {
        field6657 = null;
        if (arg0 != -1) {
            method2801(116, -68, 26);
        }
        field6661 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)Z", line = 37)
    public static final boolean method2801(int arg0, int arg1, int arg2) {
        field6656++;
        if (arg1 != -545) {
            field6657 = null;
        }
        return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(III)I", line = 48)
    public static final int method2802(int arg0, int arg1, int arg2) {
        field6658++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg0 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            if (arg1 > -106) {
                field6657 = null;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIBIIIIIII)V", line = 84)
    public static final void method2803(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg4 < 62) {
            method2800(84);
        }
        field6660++;
        if (!class768.method4253(-3, arg8)) {
            return;
        }
        if (class376.field5492[arg8] == null) {
            client.method2015(class111.field1528[arg8], -1, arg6, arg2, arg3, arg9, arg0, arg10, arg5, arg1, arg7, arg11);
        } else {
            client.method2015(class376.field5492[arg8], -1, arg6, arg2, arg3, arg9, arg0, arg10, arg5, arg1, arg7, arg11);
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Ldia;II)V", line = 129)
    public class481(class246 arg0, int arg1, int arg2) {
        this.field6662 = arg2;
        this.field6663 = arg0;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class164 extends class338 {

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "S")
    public short field2092;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field2093 = -1;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "[I")
    public static int[] field2090 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "J")
    public static long field2095 = 0L;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "[I")
    public static int[] field2097 = new int[4];

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)V", line = 5)
    public static void method875(int arg0) {
        int var1 = -2 / ((-arg0 - 39) / 57);
        field2097 = null;
        field2090 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIII)V", line = 27)
    public static final void method876(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2094++;
        int var6 = class104.method556(class335.field4462, arg0 ^ 0x803, arg5, class6.field42);
        int var7 = class104.method556(class335.field4462, 2048, arg4, class6.field42);
        int var8 = class104.method556(class322.field4306, 2048, arg1, class310.field4183);
        int var9 = class104.method556(class322.field4306, 2048, arg3, class310.field4183);
        if (arg0 == 3) {
            for (int var10 = var6; var10 <= var7; var10++) {
                class296.method1740(var8, class153.field1932[var10], (byte) 81, arg2, var9);
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)I", line = 56)
    public static final int method877(byte arg0, int arg1) {
        if (arg0 == -65) {
            field2091++;
            return arg1 >>> 8;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V", line = 66)
    public class164() {
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(S)V", line = 68)
    public class164(short arg0) {
        this.field2092 = arg0;
    }
}

import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class137 extends class213 {

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
    private int field1867 = 0;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
    private int field1870 = -1;

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "I")
    private int field1877;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "[I")
    public static int[] field1869 = new int[32];

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "I")
    public static volatile int field1871;

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "Ljava/lang/String;")
    public static String field1876;

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "Lll;")
    public static class54 field1874;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(BI)V", line = 8)
    public static final void method1032(byte arg0, int arg1) {
        field1865++;
        int var2 = 25 % ((28 - arg0) / 57);
        class82.method611((byte) -83);
        class242.method1718(false);
        int var3 = class292.method2002((byte) -110, arg1).field2820;
        if (var3 == 0) {
            return;
        }
        int var4 = class208.field2956[arg1];
        if (var3 == 9) {
            class333.field5140 = var4;
        }
        if (var3 == 5) {
            class233.field3342 = var4;
        }
        if (var3 == 6) {
            class239.field3479 = var4;
        }
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V", line = 38)
    public static void method1033(int arg0) {
        if (arg0 < -21) {
            field1876 = null;
            field1874 = null;
            field1869 = null;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1869[var1] = var0 - 1;
            var0 += var0;
        }
        field1871 = 0;
        field1876 = null;
        field1874 = new class54();
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(IIIIII)V", line = 63)
    public static final void method1034(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg3; var6 <= (arg3 + arg4); var6++) {
            for (int var7 = arg0; var7 <= (arg0 + arg2); var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class169.field2356[arg1][var7][var6] = 127;
                }
            }
        }
        for (int var8 = arg3; var8 < (arg3 + arg4); var8++) {
            for (int var9 = arg0; var9 < arg0 + arg2; var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class74.field978[arg1][var9][var8] = arg1 > 0 ? class74.field978[arg1 - 1][var9][var8] : 0;
                }
            }
        }
        field1875++;
        if (~arg0 < arg5 && arg0 < 104) {
            for (int var10 = arg3 + 1; var10 < (arg3 + arg4); var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class74.field978[arg1][arg0][var10] = class74.field978[arg1][arg0 - 1][var10];
                }
            }
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var11 = arg0 + 1; var11 < arg0 + arg2; var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class74.field978[arg1][var11][arg3] = class74.field978[arg1][var11][arg3 - 1];
                }
            }
        }
        if (arg0 < 0 || arg3 < 0 || arg0 >= 104 || arg3 >= 104) {
            return;
        }
        if (arg1 == 0) {
            if (arg0 > 0 && class74.field978[arg1][arg0 - 1][arg3] != 0) {
                class74.field978[arg1][arg0][arg3] = class74.field978[arg1][arg0 - 1][arg3];
            } else if (arg3 > 0 && class74.field978[arg1][arg0][arg3 - 1] != 0) {
                class74.field978[arg1][arg0][arg3] = class74.field978[arg1][arg0][arg3 - 1];
            } else if (arg0 > 0 && arg3 > 0 && class74.field978[arg1][arg0 - 1][arg3 - 1] != 0) {
                class74.field978[arg1][arg0][arg3] = class74.field978[arg1][arg0 - 1][arg3 - 1];
            }
        } else if (arg0 > 0 && class74.field978[arg1][arg0 - 1][arg3] != class74.field978[arg1 - 1][arg0 - 1][arg3]) {
            class74.field978[arg1][arg0][arg3] = class74.field978[arg1][arg0 - 1][arg3];
        } else if (arg3 > 0 && class74.field978[arg1 - 1][arg0][arg3 - 1] != class74.field978[arg1][arg0][arg3 - 1]) {
            class74.field978[arg1][arg0][arg3] = class74.field978[arg1][arg0][arg3 - 1];
        } else if (arg0 > 0 && arg3 > 0 && class74.field978[arg1][arg0 - 1][arg3 - 1] != class74.field978[arg1 - 1][arg0 - 1][arg3 - 1]) {
            class74.field978[arg1][arg0][arg3] = class74.field978[arg1][arg0 - 1][arg3 - 1];
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(I)V", line = 286)
    public class137(int arg0) {
        GL var2 = class47.field592;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field1870 = var3[0];
        this.field1877 = class298.field4320;
        class47.method357(this.field1870);
        int var4 = class350.field5463[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class298.field4318 += var6.limit() - this.field1867;
        this.field1867 = var6.limit();
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZILfd;)Ljava/lang/String;", line = 197)
    public static final String method1035(boolean arg0, int arg1, class299 arg2) {
        field1872++;
        try {
            if (!arg0) {
                field1873 = -42;
            }
            int var3 = arg2.method2046((byte) 98);
            if (arg1 < var3) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg2.field4351 += class279.field3976.method1541(0, arg2.field4351, 125, arg2.field4350, var4, var3);
            return class181.method1328(0, var4, false, var3);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!qd", name = "finalize", descriptor = "()V", line = 233)
    protected final void finalize() throws Throwable {
        if (this.field1870 != -1) {
            class298.method2037(this.field1870, this.field1867, this.field1877);
            this.field1867 = 0;
            this.field1870 = -1;
        }
        super.finalize();
        field1866++;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)I", line = 249)
    public static final int method1036(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 31 & arg1 + arg2;
        field1864++;
        return ((arg0 >>> 31) + arg0) % arg2 + var3;
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V", line = 258)
    public final void method1037(int arg0) {
        field1868++;
        int var2 = class353.method2454((byte) 117);
        if ((var2 & arg0) == 0) {
            class47.method357(this.field1870);
        }
        if ((var2 & 0x2) == 0) {
            class47.method354(0);
        }
        if ((var2 & 0x4) == 0) {
            class47.method364(0);
        }
    }
}

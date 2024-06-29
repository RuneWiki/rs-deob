import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class111 extends class74 {

    @OriginalMember(owner = "client!fi", name = "Q", descriptor = "I")
    private int field1749 = 204;

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "I")
    private int field1751 = 1;

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "I")
    private int field1753 = 1;

    @OriginalMember(owner = "client!fi", name = "P", descriptor = "[I")
    public static int[] field1748 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "Ljava/lang/String;")
    public static String field1745 = " ";

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!fi", name = "T", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!fi", name = "V", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!fi", name = "W", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!fi", name = "O", descriptor = "Luf;")
    public static class176 field1747;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fi", name = "X", descriptor = "Ljava/lang/Class;")
    public static Class field1756;

    @OriginalMember(owner = "client!fi", name = "N", descriptor = "[Ldi;")
    public static class179[] field1746;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIILbf;IJZ)Z")
    public static final boolean method821(int arg0, int arg1, int arg2, int arg3, int arg4, class205 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        } else {
            int var10 = arg1 - arg4;
            int var11 = arg2 - arg4;
            int var12 = arg1 + arg4;
            int var13 = arg2 + arg4;
            if (arg8) {
                if (arg6 > 640 && arg6 < 1408) {
                    var13 += 128;
                }
                if (arg6 > 1152 && arg6 < 1920) {
                    var12 += 128;
                }
                if (arg6 > 1664 || arg6 < 384) {
                    var11 -= 128;
                }
                if (arg6 > 128 && arg6 < 896) {
                    var10 -= 128;
                }
            }
            int var14 = var10 / 128;
            int var15 = var11 / 128;
            int var16 = var12 / 128;
            int var17 = var13 / 128;
            return class66.method521(arg0, var14, var15, var16 - var14 + 1, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        if (arg0 != -79) {
            this.field1749 = 55;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field1749 = arg1.method293(-12);
                }
            } else {
                this.field1753 = arg1.method333((byte) -59);
            }
        } else {
            this.field1751 = arg1.method333((byte) -59);
        }
        ++field1752;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)[I")
    public final int[] method448(int arg0, int arg1) {
        int[] var3 = super.field1254.method1328((byte) -108, arg1);
        if (arg0 != 4) {
            field1747 = null;
        }
        ++field1755;
        if (super.field1254.field3118) {
            for (int var4 = 0; class178.field2662 > var4; ++var4) {
                int var5 = class224.field3522[var4];
                int var6 = this.field1751 * var5 >> 12;
                int var7 = class207.field3212[arg1];
                int var8 = var5 % (4096 / this.field1751) * this.field1751;
                int var9 = var7 % (4096 / this.field1753) * this.field1753;
                int var10 = this.field1753 * var7 >> 12;
                if (~this.field1749 < ~var9) {
                    for (var6 -= var10; ~var6 > -1; var6 += 4) {
                    }
                    while (~var6 < -4) {
                        var6 -= 4;
                    }
                    if (~var6 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var8 > ~this.field1749) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field1749 < ~var8) {
                    int var11;
                    for (var11 = var6 - var10; ~var11 > -1; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(Z)V")
    public static void method822(boolean arg0) {
        field1748 = null;
        field1747 = null;
        field1746 = null;
        field1745 = null;
        if (!arg0) {
            method824(19, -14);
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
    public class111() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)V")
    public static final void method823(int arg0) {
        ++field1750;
        try {
            Method var1 = (field1756 != null ? field1756 : (field1756 = method825("java.lang.Runtime"))).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class64.field1024 = 1 + (int) (var3 / 1048576L);
                } catch (Throwable var4) {
                }
            }
            if (arg0 != -10224) {
                method821(-11, -72, 118, -63, -11, (class205) null, 120, 66L, true);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)I")
    public static final int method824(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method825(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

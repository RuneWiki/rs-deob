import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class310 extends class371 {

    @OriginalMember(owner = "client!lm", name = "I", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!lm", name = "J", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!lm", name = "K", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!lm", name = "L", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!lm", name = "M", descriptor = "I")
    public static int field4514;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lm", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field4515;

    // $FF: synthetic method
    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1904(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IBLps;)V", line = 4)
    public final void method81(int arg0, byte arg1, class428 arg2) {
        if (~arg0 == -1) {
            super.field5360 = arg2.method2561((byte) 119) == 1;
        }
        ++field4513;
        int var4 = 82 % ((-15 - arg1) / 39);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BI)[[I", line = 17)
    public final int[][] method78(byte arg0, int arg1) {
        ++field4512;
        int[][] var3 = super.field5364.method3064(1, arg1);
        if (arg0 != 36) {
            method1903(14, -103, (String) null);
        }
        if (super.field5364.field7632) {
            int[][] var4 = this.method2263((byte) -113, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class41.field455 > var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V", line = 72)
    public static final void method1902(byte arg0) {
        try {
            if (arg0 < 27) {
                return;
            }
            Method var1 = (field4515 != null ? field4515 : (field4515 = method1904("java.lang.Runtime"))).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class56.field692 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        ++field4511;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILjava/lang/String;)V", line = 100)
    public static final void method1903(int arg0, int arg1, String arg2) {
        ++field4510;
        class621 var3 = class442.method2691(arg0, 2, true);
        if (arg1 != 0) {
            method1902((byte) 54);
        }
        var3.method3592((byte) 115);
        var3.field9072 = arg2;
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "()V", line = 114)
    public class310() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(BI)[I", line = 118)
    public final int[] method79(byte arg0, int arg1) {
        ++field4514;
        int[] var3 = super.field5378.method1451(63, arg1);
        if (arg0 > -80) {
            return null;
        } else {
            if (super.field5378.field3254) {
                int[] var4 = this.method2260((byte) -117, arg1, 0);
                for (int var5 = 0; var5 < class41.field455; ++var5) {
                    var3[var5] = 4096 - var4[var5];
                }
            }
            return var3;
        }
    }
}

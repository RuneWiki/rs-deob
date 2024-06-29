import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qja")
public abstract class class326 {

    @OriginalMember(owner = "client!qja", name = "d", descriptor = "Z")
    public static boolean field4562 = true;

    @OriginalMember(owner = "client!qja", name = "e", descriptor = "Z")
    public static boolean field4563 = false;

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!qja", name = "b", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!qja", name = "c", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(ILha;)V", line = 12)
    public static final void method2088(int arg0, class65 arg1) {
        field4560++;
        if (arg0 < 106) {
            method2088(-55, null);
        }
        if (class626.field8777) {
            class36.method286(arg1, false);
        } else {
            class732.method4094(arg1, -100);
        }
    }

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(IIIIIZ)V", line = 29)
    public static final void method2089(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field4559++;
        if (arg3 == arg4) {
            class558.method3303(27315, arg1, arg2, arg0, arg3);
            return;
        }
        if (arg5) {
            method2090(null, true);
        }
        if (class618.field8645 <= arg0 - arg3 && class463.field6533 >= arg0 + arg3 && arg2 - arg4 >= class734.field10153 && arg2 + arg4 <= class407.field5535) {
            class121.method927(5026, arg2, arg0, arg1, arg4, arg3);
        } else {
            class191.method1337(arg2, arg3, (byte) 42, arg0, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(Ljava/lang/String;Z)I", line = 65)
    public static final int method2090(String arg0, boolean arg1) {
        field4561++;
        if (!class767.field10554.field6674) {
            return -1;
        } else if (class123.field1921.containsKey(arg0)) {
            return 100;
        } else {
            String var2 = class731.method4090(-5633, arg0);
            if (var2 == null) {
                return -1;
            }
            String var3 = class145.field2120 + var2;
            if (!class604.field8447.method4341("", var3, (byte) 105)) {
                return -1;
            } else if (class604.field8447.method4337(0, var3)) {
                byte[] var4 = class604.field8447.method4362("", var3, (byte) 18);
                if (!arg1) {
                    field4562 = false;
                }
                Object var5 = null;
                File var6;
                try {
                    var6 = class655.method3747(var2, 0);
                } catch (RuntimeException var10) {
                    return -1;
                }
                if (var4 == null || var6 == null) {
                    return -1;
                }
                boolean var7 = true;
                byte[] var8 = class687.method3877(true, var6);
                if (var8 != null && var4.length == var8.length) {
                    for (int var9 = 0; var9 < var8.length; var9++) {
                        if (var4[var9] != var8[var9]) {
                            var7 = false;
                            break;
                        }
                    }
                } else {
                    var7 = false;
                }
                try {
                    if (!var7) {
                        class767.field10554.method2849(false, var6, var4);
                    }
                } catch (Throwable var11) {
                    return -1;
                }
                class516.method3109(var6, arg0, (byte) 20);
                return 100;
            } else {
                return class604.field8447.method4334((byte) 113, var3);
            }
        }
    }

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(III)V")
    public abstract void method1878(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(I)V")
    public abstract void method1868(int arg0);

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(IIIIII)V")
    public abstract void method1870(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qja", name = "b", descriptor = "(I)V")
    public abstract void method1895(int arg0);

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(Lqja;)V")
    public abstract void method1884(class326 arg0);

    @OriginalMember(owner = "client!qja", name = "c", descriptor = "(I)V")
    public abstract void method1871(int arg0);

    @OriginalMember(owner = "client!qja", name = "d", descriptor = "(I)V")
    public abstract void method1882(int arg0);

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "()Lqja;")
    public abstract class326 method1872();

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "(III[I)V")
    public abstract void method1899(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qja", name = "b", descriptor = "(III[I)V")
    public abstract void method1890(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qja", name = "a", descriptor = "([I)V")
    public abstract void method1896(int[] arg0);

    @OriginalMember(owner = "client!qja", name = "b", descriptor = "(III)V")
    public abstract void method1869(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qja", name = "e", descriptor = "(I)V")
    public abstract void method1877(int arg0);

    @OriginalMember(owner = "client!qja", name = "b", descriptor = "()V")
    public abstract void method1873();

    @OriginalMember(owner = "client!qja", name = "f", descriptor = "(I)V")
    public abstract void method1888(int arg0);

    @OriginalMember(owner = "client!qja", name = "c", descriptor = "(III[I)V")
    public abstract void method1885(int arg0, int arg1, int arg2, int[] arg3);
}

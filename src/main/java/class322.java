import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class322 implements Runnable {

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "[Lbp;")
    public volatile class216[] field5033 = new class216[2];

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "Z")
    public volatile boolean field5035 = false;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "Z")
    public volatile boolean field5030 = false;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field5031 = 0;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "Lap;")
    public class279 field5037;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "[I")
    public static int[] field5032;

    @OriginalMember(owner = "client!nd", name = "run", descriptor = "()V")
    public final void run() {
        field5034++;
        this.field5030 = true;
        try {
            while (!this.field5035) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class216 var2 = this.field5033[var1];
                    if (var2 != null) {
                        var2.method1543(125);
                    }
                }
                class84.method517((byte) 117, 10L);
                class422.method2625((Object) null, 91, this.field5037);
            }
        } catch (Exception var9) {
            class272.method1845(var9, 124, (String) null);
        } finally {
            Object var6 = null;
            this.field5030 = false;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static void method2137(int arg0) {
        if (arg0 != -6980) {
            method2138(-104, -79, 32, -116, 115, 25, -90, -117);
        }
        field5032 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5036++;
        if (arg3 == arg5) {
            class321.method2127(arg7, arg4, arg1, arg2, arg0 ^ 0x51, arg6, arg5);
            return;
        }
        if (arg0 != 2) {
            method2137(-81);
        }
        if ((arg6 - arg5) >= class406.field6033 && class185.field3005 >= arg5 + arg6 && class99.field1378 <= arg1 - arg3 && arg1 + arg3 <= class396.field5925) {
            class133.method972(arg4, arg2, arg5, arg3, arg1, 49, arg7, arg6);
        } else {
            class155.method1093(arg3, arg4, -15, arg7, arg2, arg1, arg5, arg6);
        }
    }
}

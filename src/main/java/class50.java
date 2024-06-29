import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class50 extends class154 {

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "Ljava/lang/String;")
    public String field712;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public static int field711 = 0;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "Lim;")
    public static class178 field713 = null;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V")
    public static void method307(int arg0) {
        field713 = null;
        int var1 = -47 % ((arg0 + 11) / 51);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIII)Z")
    public static final boolean method308(int arg0, int arg1, int arg2, int arg3) {
        if (class57.method358(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class272.method1772(var4 + 1, class185.field2812[arg0][arg1][arg2] + arg3, var5 + 1) && class272.method1772(var4 + 128 - 1, class185.field2812[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class272.method1772(var4 + 128 - 1, class185.field2812[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class272.method1772(var4 + 1, class185.field2812[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIILsk;JZ)V")
    public static final void method309(int arg0, int arg1, int arg2, int arg3, class202 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class308 var8 = new class308();
        var8.field4953 = arg4;
        var8.field4956 = arg1 * 128 + 64;
        var8.field4946 = arg2 * 128 + 64;
        var8.field4945 = arg3;
        var8.field4950 = arg5;
        if (class246.field3856[arg0][arg1][arg2] == null) {
            class246.field3856[arg0][arg1][arg2] = new class91(arg0, arg1, arg2);
        }
        class246.field3856[arg0][arg1][arg2].field1323 = var8;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
    public class50() {
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class50(String arg0) {
        this.field712 = arg0;
    }
}

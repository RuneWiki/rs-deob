import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class220 {

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "Lmq;")
    private class472 field2846 = new class472(256);

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "Lfa;")
    private class212 field2844;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "Lifa;")
    private class393 field2845;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2850 = "";

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V")
    public final void method1329(byte arg0) {
        this.field2846.method2776(false);
        if (arg0 > 95) {
            field2847++;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public final void method1330(int arg0) {
        if (arg0 <= 73) {
            field2850 = null;
        }
        field2840++;
        this.field2846.method2777(5, 51);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)V")
    public static final void method1331(int arg0, int arg1, int arg2) {
        field2848++;
        if (class188.field2297 == 1) {
            class397.method2402(arg1, -31964, class115.field1496, arg0);
        } else if (class188.field2297 == 2) {
            class25.method369(arg0, arg1, 125);
        }
        class188.field2297 = 0;
        class115.field1496 = null;
        if (arg2 <= 3) {
            method1331(-29, -107, 48);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIII)V")
    public static final void method1332(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2843++;
        int var9 = arg4 + 1;
        class359.method2018(class678.field9722[arg4], arg0, 111, arg5, arg1);
        if (arg2 != 0) {
            method1331(-118, 43, 122);
        }
        int var8 = arg3 - 1;
        class359.method2018(class678.field9722[arg3], arg0, -87, arg5, arg1);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class678.field9722[var6];
            var7[arg1] = var7[arg0] = arg5;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BI)Lco;")
    public final class103 method1333(byte arg0, int arg1) {
        field2841++;
        Object var3 = this.field2846.method2766(-126, (long) arg1);
        if (var3 != null) {
            return (class103) var3;
        } else if (this.field2844.method395(arg1, 28576)) {
            class352 var4 = this.field2844.method397(arg1, (byte) -127);
            int var5 = var4.field4708 ? 64 : this.field2845.field5536;
            class103 var7;
            if (var4.field4702 && this.field2845.method237()) {
                float[] var6 = this.field2844.method393(arg1, false, var5, 0.7F, -23825, var5);
                var7 = this.field2845.method2377(var5, var6, true, var4.field4710 != 0, class391.field5229, var5);
            } else {
                int[] var8 = !var4.field4712 && class642.method3650(arg0 ^ 0xF08, var4.field4707) ? this.field2844.method400(var5, true, var5, (byte) -73, arg1, 0.7F) : this.field2844.method392(false, var5, arg1, var5, 80, 0.7F);
                var7 = this.field2845.method2307(var5, var4.field4710 != 0, var8, var5, 0);
            }
            var7.method757(var4.field4701, var4.field4698, -81);
            this.field2846.method2772(var7, true, (long) arg1);
            if (arg0 != -50) {
                this.field2845 = null;
            }
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lifa;Lfa;)V")
    public class220(class393 arg0, class212 arg1) {
        this.field2844 = arg1;
        this.field2845 = arg0;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
    public static void method1334(int arg0) {
        if (arg0 <= 52) {
            method1334(-79);
        }
        field2850 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILjava/net/Socket;I)Lob;")
    public static final class685 method1335(int arg0, Socket arg1, int arg2) throws IOException {
        field2842++;
        if (arg2 > -81) {
            field2850 = null;
        }
        return new class318(arg1, arg0);
    }
}

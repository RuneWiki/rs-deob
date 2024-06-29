import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class697 extends OutputStream {

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "Lej;")
    public static class694 field9582 = new class694();

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field9581;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field9583;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field9584;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field9586;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public static int field9587;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "Lrf;")
    public static class157 field9585;

    @OriginalMember(owner = "client!rj", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field9584++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIII)V")
    public static final void method3797(int arg0, int arg1, int arg2, int arg3) {
        field9587++;
        class159.field1994 = new byte[arg1][arg2][arg0];
        if (arg3 != 11) {
            method3801(-36, (byte) 108);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V")
    public static void method3798(boolean arg0) {
        if (arg0) {
            field9585 = null;
            field9582 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIILtc;)V")
    public static final void method3799(int arg0, int arg1, int arg2, class477 arg3) {
        if (class499.field6560) {
            class428 var4 = class203.field2642 == -1 ? null : class191.field2445.method1075((byte) -65, class203.field2642);
            if (client.method696(arg3).method1148(6207) && (class345.field4410 & 0x20) != 0 && (var4 == null || arg3.method2638(class203.field2642, var4.field5546, false) != var4.field5546)) {
                class47.method433(arg3.field6234, class542.field7044 + " -> " + arg3.field6315, 0L, class295.field3842, 50, arg3.field6321, false, class368.field4752, arg3.field6221, true, (byte) -87);
                class134.field1764++;
            }
        }
        field9583++;
        for (int var5 = 9; var5 >= 5; var5--) {
            String var9 = class178.method1199(var5, -65536, arg3);
            if (var9 != null) {
                class545.field7075++;
                class47.method433(arg3.field6234, arg3.field6315, (long) (var5 + 1), var9, 1003, arg3.field6321, false, class107.method787(arg3, var5, -1), arg3.field6221, true, (byte) -115);
            }
        }
        String var6 = class355.method2043((byte) -100, arg3);
        if (var6 != null) {
            class677.field9339++;
            class47.method433(arg3.field6234, arg3.field6315, 0L, var6, 5, arg3.field6321, false, arg3.field6276, arg3.field6221, true, (byte) 124);
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = class178.method1199(var7, -65536, arg3);
            if (var8 != null) {
                class47.method433(arg3.field6234, arg3.field6315, (long) (var7 + 1), var8, 15, arg3.field6321, false, class107.method787(arg3, var7, -1), arg3.field6221, true, (byte) -18);
                class545.field7075++;
            }
        }
        if (arg0 <= 7) {
            method3800(null, -63);
        }
        if (!client.method696(arg3).method1145((byte) 126)) {
            return;
        }
        class135.field1776++;
        if (arg3.field6275 == null) {
            class47.method433(arg3.field6234, "", 0L, class604.field8133.method3280((byte) -107, class144.field1890), 11, arg3.field6321, false, -1, arg3.field6221, true, (byte) 125);
        } else {
            class47.method433(arg3.field6234, "", 0L, arg3.field6275, 11, arg3.field6321, false, -1, arg3.field6221, true, (byte) 122);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method3800(String arg0, int arg1) {
        field9586++;
        if (class612.field8281 == null) {
            class412.method2330(0);
        }
        String[] var2 = class420.method2420('\n', arg1 ^ 0x1E, arg0);
        if (arg1 != 1) {
            method3801(59, (byte) -47);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class5.field36; var4 > 0; var4--) {
                class612.field8281[var4] = class612.field8281[var4 - 1];
            }
            class612.field8281[0] = var2[var3];
            if (class612.field8281.length - 1 > class5.field36) {
                class5.field36++;
                if (class377.field4834 > 0) {
                    class377.field4834++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IB)[B")
    public static final byte[] method3801(int arg0, byte arg1) {
        field9581++;
        class81 var2 = (class81) class642.field8930.method3880((long) arg0, -37);
        int var3 = 103 % ((arg1 - 35) / 55);
        if (var2 == null) {
            byte[] var4 = new byte[512];
            Random var5 = new Random((long) arg0);
            for (int var6 = 0; var6 < 255; var6++) {
                var4[var6] = (byte) var6;
            }
            for (int var7 = 0; var7 < 255; var7++) {
                int var8 = 255 - var7;
                int var9 = class562.method3002((byte) -14, var5, var8);
                byte var10 = var4[var9];
                var4[var9] = var4[var8];
                var4[var8] = var4[511 - var7] = var10;
            }
            var2 = new class81(var4);
            class642.field8930.method3881((long) arg0, (byte) -80, var2);
        }
        return var2.field1109;
    }
}

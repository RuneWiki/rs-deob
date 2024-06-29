import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class345 extends OutputStream {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Z")
    public static boolean field4970;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Lew;")
    public static class270 field4975;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZLat;I)V")
    public static final void method2078(boolean arg0, class444 arg1, int arg2) {
        field4971++;
        int var3 = arg1.field6511 == 0 ? arg1.field6470 : arg1.field6511;
        int var4 = arg1.field6506 == arg2 ? arg1.field6453 : arg1.field6506;
        class416.method2463(var3, var4, arg1.field6469, 255, arg0, class505.field7387[arg1.field6469 >> 16]);
        if (arg1.field6491 != null) {
            class416.method2463(var3, var4, arg1.field6469, 255, arg0, arg1.field6491);
        }
        class91 var5 = (class91) class425.field6168.method1592((byte) -25, (long) arg1.field6469);
        if (var5 != null) {
            class153.method1103(var3, var5.field1460, arg2 - 106, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!u", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field4973++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILat;)Lat;")
    public static final class444 method2079(int arg0, class444 arg1) {
        field4974++;
        if (arg1.field6515 != -1) {
            return class22.method138(arg0 ^ 0x104719A5, arg1.field6515);
        }
        int var2 = arg1.field6469 >>> 16;
        class510 var3 = new class510(class425.field6168);
        if (arg0 != -273095166) {
            field4975 = null;
        }
        for (class91 var4 = (class91) var3.method3024((byte) -73); var4 != null; var4 = (class91) var3.method3027(arg0 ^ 0xEFB8C592)) {
            if (var4.field1460 == var2) {
                return class22.method138(-75, (int) var4.field6883);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
    public static void method2080(boolean arg0) {
        field4975 = null;
        if (!arg0) {
            method2078(false, null, -26);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I[BIIIZII[B)V")
    public static final void method2081(int arg0, byte[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, byte[] arg8) {
        field4972++;
        int var9 = -(arg7 >> 2);
        int var10 = -(arg7 & 0x3);
        if (arg5) {
            return;
        }
        for (int var11 = -arg3; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg0++;
                arg8[var10001] += arg1[arg2++];
                int var14 = arg0++;
                arg8[var14] += arg1[arg2++];
                int var15 = arg0++;
                arg8[var15] += arg1[arg2++];
                int var16 = arg0++;
                arg8[var16] += arg1[arg2++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg0++;
                arg8[var10001] += arg1[arg2++];
            }
            arg2 += arg6;
            arg0 += arg4;
        }
    }

    static {
        new class157(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
        field4970 = false;
        field4975 = new class270(8);
    }
}

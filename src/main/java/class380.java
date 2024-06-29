import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class380 {

    @OriginalMember(owner = "client!at", name = "a", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!at", name = "c", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!at", name = "d", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!at", name = "b", descriptor = "Lrl;")
    public static class724 field4847;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V")
    public static void method2167(int arg0) {
        field4847 = null;
        if (arg0 != -21827) {
            method2169(-22, 15, 6, 127);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Lsl;B)V")
    public static final void method2168(class461 arg0, byte arg1) {
        field4846++;
        if (arg1 > -117) {
            method2168(null, (byte) 66);
        }
        byte[] var2 = new byte[24];
        if (class605.field8418 != null) {
            try {
                class605.field8418.method4163(0L, 0);
                class605.field8418.method4167(45, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method2614(3, 0, var2, 24);
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IIII)Z")
    public static final boolean method2169(int arg0, int arg1, int arg2, int arg3) {
        field4848++;
        class422.field5360.method606(arg3, arg1, arg0, class176.field2464);
        int var4 = class176.field2464[2];
        if (var4 < 50) {
            return false;
        }
        class176.field2464[2] = var4;
        class176.field2464[0] = class176.field2464[0] * class307.field4056 / var4 + class52.field738;
        if (arg2 == 24) {
            class176.field2464[1] = class176.field2464[1] * class453.field5992 / var4 + class533.field7396;
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(BLjava/io/File;)[B")
    public static final byte[] method2170(byte arg0, File arg1) {
        if (arg0 == -12) {
            field4849++;
            return class258.method1565(arg1, true, (int) arg1.length());
        } else {
            return null;
        }
    }
}

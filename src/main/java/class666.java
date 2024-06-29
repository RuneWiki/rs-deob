import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public abstract class class666 extends class4 {

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "Z")
    public volatile boolean field9191 = true;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
    public static int field9189;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "Z")
    public boolean field9190;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "Z")
    public boolean field9192;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIII)V", line = 8)
    public static final void method3766(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9189++;
        class596[] var7 = class653.field8740;
        int var8 = 0;
        if (arg6 != -1277774527) {
            return;
        }
        while (var8 < var7.length) {
            class596 var9 = var7[var8];
            if (var9 != null && var9.field8081 == 2) {
                class404.method2536(var9.field8080, var9.field8086, var9.field8083 * 2, arg5 >> 1, arg1, arg4, var9.field8090, arg3 >> 1, (byte) 60);
                if (class185.field2530[0] > -1 && class483.field6741 % 20 < 10) {
                    class298 var10 = class577.field7930[var9.field8077];
                    int var11 = class185.field2530[0] + arg2 - 12;
                    int var12 = arg0 + class185.field2530[1] - 28;
                    var10.method1970(var11, var12);
                    class483.method2944(var10.method1963() + var11, var12 + var10.method1961(), var11, var12, -1);
                }
            }
            var8++;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)I")
    public abstract int method212(int arg0);

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)[B")
    public abstract byte[] method214(byte arg0);
}

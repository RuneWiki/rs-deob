import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class186 extends class329 {

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "[B")
    public byte[] field2357;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "Ltb;")
    public static class450 field2355 = new class450(128, 4);

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "Lrca;")
    public static class34 field2359 = new class34();

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "Ljda;")
    public static class300 field2358;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIILkp;Lf;IBLua;)V", line = 4)
    public static final void method1146(int arg0, int arg1, int arg2, class507 arg3, class536 arg4, int arg5, byte arg6, class600 arg7) {
        field2354++;
        if (arg4 == null) {
            return;
        }
        int var8;
        if (class296.field3661 == 4) {
            var8 = (int) class331.field4223 & 0x3FFF;
        } else {
            var8 = (int) class331.field4223 + class411.field5135 & 0x3FFF;
        }
        int var9 = Math.max(arg3.field6793 / 2, arg3.field6700 / 2) + 10;
        int var10 = arg1 * arg1 + arg2 * arg2;
        if ((var9 * var9) < var10) {
            return;
        }
        int var11 = class453.field5810[var8];
        int var12 = class453.field5811[var8];
        int var13 = -58 / ((9 - arg6) / 63);
        if (class296.field3661 != 4) {
            var12 = var12 * 256 / (class354.field4510 + 256);
            var11 = var11 * 256 / (class354.field4510 + 256);
        }
        int var14 = arg1 * var11 + arg2 * var12 >> 14;
        int var15 = arg1 * var12 - (arg2 * var11) >> 14;
        arg4.method153(arg3.field6793 / 2 + var14 + arg5 - (arg4.method160() / 2), -var15 + arg0 + arg3.field6700 / 2 + -(arg4.method166() / 2), arg7, arg5, arg0);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V", line = 47)
    public static void method1147(int arg0) {
        field2355 = null;
        field2359 = null;
        if (arg0 != 16383) {
            method1147(125);
        }
        field2358 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)Z", line = 65)
    public static final boolean method1148(int arg0, int arg1, int arg2) {
        field2356++;
        if (arg0 != -998559250) {
            method1148(-81, -66, -88);
        }
        return client.method3817((byte) 83, arg2, arg1) || class105.method593(arg2, arg1, true);
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "([B)V", line = 77)
    public class186(byte[] arg0) {
        this.field2357 = arg0;
    }
}

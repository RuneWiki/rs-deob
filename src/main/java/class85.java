import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class85 {

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field1291 = -2;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "Z")
    public static boolean field1294 = false;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIIIII)V", line = 5)
    public static final void method568(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1293++;
        if (arg7 >= -9) {
            method568(-44, -75, -124, 122, -89, -88, 24, 84);
        }
        if (class186.method1226(arg5, 0)) {
            client.method771(class256.field4376[arg5], -1, arg4, arg0, arg3, arg2, arg6, arg1);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IBII)I", line = 21)
    public static final int method569(int arg0, byte arg1, int arg2, int arg3) {
        field1290++;
        if (arg0 == arg3) {
            return arg3;
        }
        if (arg1 != -71) {
            method570(-52);
        }
        int var4 = 128 - arg2;
        int var5 = (arg0 & 0xFF00FF) * arg2 + (arg3 & 0xFF00FF) * var4 & 0xFF00FF00;
        int var6 = ((-16711936 & arg3) >>> 7) * var4 + ((arg0 >>> 7 & 0x1FE01FE) * arg2) & 0xFF00FF00;
        return (var5 >> 7) + var6;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V", line = 56)
    public static final void method570(int arg0) {
        field1292++;
        class217.method1465();
        for (int var1 = 0; var1 < 4; var1++) {
            class242.field4031[var1].method375(-8823);
        }
        if (arg0 != -5) {
            method569(-54, (byte) -20, -89, 47);
        }
        System.gc();
    }
}

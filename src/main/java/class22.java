import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class22 {

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "Lsl;")
    public static class318 field242 = new class318(22, 4);

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "J")
    public static long field243 = 0L;

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "[I")
    public static int[] field245 = new int[1];

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lcw;B)V", line = 8)
    public static final void method189(class120 arg0, byte arg1) {
        for (int var2 = 0; var2 < class293.field4221; var2++) {
            int var3 = class8.field92[var2];
            class364 var4 = class384.field5647[var3];
            int var5 = arg0.method577(255);
            if ((var5 & 0x4) != 0) {
                var5 += arg0.method577(255) << 8;
            }
            if ((var5 & 0x2000) != 0) {
                var5 += arg0.method577(255) << 16;
            }
            class200.method1406(var5, arg0, var3, 2, var4);
        }
        if (arg1 > -119) {
            field244 = -3;
        }
        field241++;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V", line = 43)
    public static void method190(int arg0) {
        field245 = null;
        field242 = null;
        if (arg0 != 22) {
            method190(80);
        }
    }
}

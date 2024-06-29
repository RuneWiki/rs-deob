import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class394 {

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "Z")
    public static boolean field5938 = false;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "[S")
    public static short[] field5939 = new short[256];

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "J")
    public static long field5942 = 0L;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    public static int field5940;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIZ)Z", line = 4)
    public static final boolean method2391(int arg0, int arg1, boolean arg2) {
        field5941++;
        if (!arg2) {
            field5938 = false;
        }
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)V", line = 19)
    public static final void method2392(int arg0, int arg1, int arg2) {
        class518 var3 = class108.field1553[arg0][arg1][arg2];
        if (var3 != null && var3.field7550 != null) {
            var3.field7550 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BB)V", line = 28)
    public static final void method2393(byte arg0, byte arg1) {
        field5940++;
        if (class1.field5 == null) {
            class1.field5 = new byte[4][class30.field323][class182.field2661];
        }
        int var2 = 0;
        if (arg1 < 37) {
            method2393((byte) -115, (byte) -99);
        }
        while (var2 < 4) {
            for (int var3 = 0; var3 < class30.field323; var3++) {
                for (int var4 = 0; var4 < class182.field2661; var4++) {
                    class1.field5[var2][var3][var4] = arg0;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V", line = 79)
    public static void method2394(byte arg0) {
        field5939 = null;
        int var1 = 46 / ((arg0 - 4) / 54);
    }
}

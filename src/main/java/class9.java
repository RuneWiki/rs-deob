import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class9 {

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "Z")
    public static boolean field280 = false;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "[Lmi;")
    public static class300[] field283 = new class300[14];

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "Ljava/lang/String;")
    public static String field285 = "shake:";

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "[I")
    public static int[] field284;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "[[B")
    public static byte[][] field281;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V", line = 7)
    public static void method98(byte arg0) {
        field281 = (byte[][]) null;
        if (arg0 >= 82) {
            field283 = null;
            field284 = null;
            field285 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "()V", line = 27)
    public static final void method99() {
        for (int var0 = 0; var0 < class201.field3383; var0++) {
            class278 var1 = class172.field2842[var0];
            class134.method947(var1);
            class172.field2842[var0] = null;
        }
        class201.field3383 = 0;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)V", line = 44)
    public static final void method100(int arg0, int arg1) {
        field282++;
        class300.field4865.method896(arg0, (byte) -88);
        if (arg1 != 0) {
            method98((byte) -83);
        }
        class97.field1764.method896(arg0, (byte) -114);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class79 {

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "[I")
    public static int[] field935 = new int[256];

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field934 = 0;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field938 = 0;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field940 = 0;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Ljava/lang/String;")
    public static String field941;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static volatile int field942;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static final void method475(int arg0) {
        if (arg0 != 1) {
            field942 = 23;
        }
        field937++;
        class260.field3785.method67((byte) -123);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
    public static void method476(boolean arg0) {
        if (!arg0) {
            field941 = null;
        }
        field935 = null;
        field941 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZIIILbc;II)V")
    public static final void method477(boolean arg0, int arg1, int arg2, int arg3, class282 arg4, int arg5, int arg6) {
        field939++;
        class117.field1645 = arg4;
        class188.field2692 = arg6;
        class296.field4676 = arg1;
        class110.field1475 = arg3;
        class226.field3176 = arg5;
        class177.field2517 = arg0;
        class99.field1331 = arg2;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field935[var0] = var1;
        }
        field941 = "Loaded fonts";
        field942 = 0;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class165 extends class153 {

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "[I")
    public int[] field2297;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "[I")
    public int[] field2301;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "[I")
    public static int[] field2296 = new int[256];

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field2299 = 0;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "[I")
    public static int[] field2300 = new int[14];

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "[Ljp;")
    public static class49[] field2302 = new class49[4];

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "Lwl;")
    public static class452 field2303;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Lgp;")
    public static class405 field2298;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    public static void method991(int arg0) {
        field2303 = null;
        field2302 = null;
        field2296 = null;
        field2300 = null;
        field2298 = null;
        if (arg0 != 0) {
            field2298 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
    public static final void method992(int arg0) {
        field2295++;
        class241 var1 = class136.field1828;
        synchronized (class136.field1828) {
            if (arg0 != 2198) {
                field2302 = null;
            }
            class136.field1828.method1482((byte) -100);
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(II[I[I)V")
    public class165(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field2297 = arg3;
        this.field2301 = arg2;
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
            field2296[var0] = var1;
        }
        field2303 = new class452(11, -1);
    }
}

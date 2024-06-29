import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class394 extends class184 {

    @OriginalMember(owner = "client!pp", name = "u", descriptor = "Ljava/lang/String;")
    public String field5928;

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "I")
    public static int field5923 = 0;

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
    public static int field5922 = -1;

    @OriginalMember(owner = "client!pp", name = "s", descriptor = "Z")
    public static boolean field5926 = false;

    @OriginalMember(owner = "client!pp", name = "v", descriptor = "Z")
    public static boolean field5929 = false;

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "[I")
    public static int[] field5920 = new int[8];

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!pp", name = "r", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!pp", name = "t", descriptor = "I")
    public static int field5927;

    @OriginalMember(owner = "client!pp", name = "q", descriptor = "Lqe;")
    public static class469 field5924;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V", line = 4)
    public static void method2519(byte arg0) {
        field5920 = null;
        field5924 = null;
        if (arg0 >= -5) {
            method2519((byte) -23);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V", line = 16)
    public static final void method2520(int arg0) {
        field5925++;
        for (int var1 = 0; var1 < class441.field6552; var1++) {
            int var2 = class338.field4921[var1];
            class432 var3 = (class432) class497.field7067.method2287((long) var2, (byte) -117);
            if (var3 != null) {
                class282 var4 = var3.field6439;
                class10.method70(var4.field4008.field5053, var4, (byte) -38);
            }
        }
        if (arg0 != 11383) {
            method2522(null, 123);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IBI)Z", line = 53)
    public static final boolean method2521(int arg0, byte arg1, int arg2) {
        field5921++;
        int var3 = 82 % ((64 - arg1) / 49);
        if ((class41.method293(arg0, arg2, -19909) | (arg2 & 0x10000) != 0) || class582.method3379(arg0, arg2, 0)) {
            return true;
        } else {
            return (arg0 & 0x37) == 0 && class530.method3099(arg2, -114, arg0);
        }
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "()V", line = 74)
    public class394() {
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 77)
    public static final void method2522(String arg0, int arg1) {
        field5927++;
        if (arg1 != 55) {
            method2521(-79, (byte) -83, -14);
        }
        System.out.println("Error: " + class35.method182("%0a", "\n", arg0, arg1 ^ 0x5F));
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 94)
    public class394(String arg0, int arg1) {
        this.field5928 = arg0;
    }
}

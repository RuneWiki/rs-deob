import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class30 {

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "[B")
    public static byte[] field548 = new byte[32896];

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "Z")
    public static boolean field554;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "[I")
    public static int[] field552;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "Loa;")
    public static class99 field555;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "[I")
    public static int[] field557;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)I")
    public static final int method253(int arg0, int arg1, boolean arg2) {
        field550++;
        if (!arg2) {
            return -92;
        }
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg1 >>= 0x1;
            arg0 *= arg0;
        }
        if (arg1 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILoa;Z)V")
    public static final void method254(int arg0, class99 arg1, boolean arg2) {
        field549++;
        class65 var3 = class152.method1010(arg0, 2, (byte) -24);
        if (arg2) {
            field555 = null;
        }
        var3.method433(32);
        var3.field1091 = arg1;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILgi;)I")
    public static final int method255(int arg0, class156 arg1) {
        field546++;
        class257 var2 = arg1.field2793;
        if (var2.field4491 != null) {
            var2 = var2.method1667(-109);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field4444;
        if (arg1.field1308 == arg1.field1282) {
            var3 = var2.field4478;
        } else if (arg1.field1333 == arg1.field1282) {
            var3 = var2.field4439;
        }
        if (arg0 < 30) {
            field548 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static void method256(int arg0) {
        field555 = null;
        field552 = null;
        if (arg0 != 1) {
            field556 = -20;
        }
        field548 = null;
        field557 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V")
    public static final void method257(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field545++;
        class131.field2277.field4587 = 0;
        class131.field2277.method1691(25, (byte) 53);
        class131.field2277.method1691(arg3, (byte) 53);
        class131.field2277.method1691(arg0, (byte) 53);
        class131.field2277.method1745(arg4, (byte) 5);
        class131.field2277.method1745(arg2, (byte) 5);
        class98.field1643 = 0;
        if (arg1 != 26534) {
            method253(-7, -40, true);
        }
        class118.field2099 = -3;
        class234.field4031 = 0;
        class236.field4073 = 1;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public static final void method258(boolean arg0) {
        field547++;
        if (arg0) {
            field552 = null;
        }
        class249.field4294.method1813(-1);
        class247.field4250.method1813(-1);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field548[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + (var1 * var1 + 65535)) / 65535.0F))));
            }
        }
        field554 = false;
        field552 = new int[128];
        field555 = class221.method1463(2844, "rouge:");
        field553 = -1;
        field556 = 0;
    }
}

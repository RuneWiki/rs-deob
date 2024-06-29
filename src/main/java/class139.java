import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class139 extends class30 {

    @OriginalMember(owner = "client!o", name = "N", descriptor = "I")
    public int field2595 = 0;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "Laf;")
    public static class7 field2592 = new class7(64);

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
    public static int field2598 = -1;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "[I")
    public static int[] field2599 = new int[256];

    @OriginalMember(owner = "client!o", name = "T", descriptor = "I")
    public static int field2601 = 0;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "[I")
    public static int[] field2597 = new int[32768];

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "[Ldh;")
    public static class39[] field2600;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BLmb;)V")
    public final void method865(byte arg0, class121 arg1) {
        if (arg0 != 107) {
            return;
        }
        while (true) {
            int var3 = arg1.method751((byte) -42);
            if (var3 == 0) {
                field2594++;
                return;
            }
            this.method868(arg1, (byte) -55, var3);
        }
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(I)V")
    public static void method866(int arg0) {
        if (arg0 < -49) {
            field2599 = null;
            field2600 = null;
            field2592 = null;
            field2597 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lrd;I)V")
    public static final void method867(class173 arg0, int arg1) {
        field2596++;
        if (class64.field1264.field2465 == null) {
            return;
        }
        try {
            class173 var2 = class129.field2440.method1126(class64.field1264.field2465, (byte) 89);
            class173 var3 = class100.field1838.method1126(class64.field1264.field2465, (byte) 48);
            class173 var4 = class173.method1158(-3, new class173[] { var2, class184.field3603, arg0, class94.field1756, var3 });
            class173 var5;
            if (arg1 == ~arg0.method1153((byte) -128)) {
                var5 = class173.method1158(-3, new class173[] { var4, class129.field2446 });
            } else {
                var5 = class173.method1158(-3, new class173[] { var4, class105.field1967, class13.method96(class97.method599(5) + 94608000000L, 13), class199.field3881, class151.method989(94608000L, (byte) 118) });
            }
            class173.method1158(-3, new class173[] { class42.field869, var5, class186.field3634 }).method1121(class64.field1264.field2465, (byte) -1);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lmb;BI)V")
    private final void method868(class121 arg0, byte arg1, int arg2) {
        if (arg2 == 2) {
            this.field2595 = arg0.method755((byte) -125);
        }
        field2593++;
        int var4 = -49 % ((arg1 + 11) / 34);
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
            field2599[var0] = var1;
        }
    }
}

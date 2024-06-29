import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public abstract class class272 extends class1 {

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "Z")
    public volatile boolean field4091 = true;

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "I")
    public static int field4090 = 0;

    @OriginalMember(owner = "client!mg", name = "I", descriptor = "Ltk;")
    public static class53 field4089 = new class53();

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "I")
    public static int field4096 = -1;

    @OriginalMember(owner = "client!mg", name = "H", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!mg", name = "G", descriptor = "Z")
    public boolean field4087;

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "Z")
    public boolean field4094;

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "[[[B")
    public static byte[][][] field4093;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "()V")
    public static final void method1805() {
        if (class72.field1152 != null) {
            for (int var0 = 0; var0 < class72.field1152.length; var0++) {
                for (int var1 = 0; var1 < class197.field2997; var1++) {
                    for (int var2 = 0; var2 < class92.field1448; var2++) {
                        class72.field1152[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class63.field997 != null) {
            for (int var3 = 0; var3 < class63.field997.length; var3++) {
                for (int var4 = 0; var4 < class197.field2997; var4++) {
                    for (int var5 = 0; var5 < class92.field1448; var5++) {
                        class63.field997[var3][var4][var5] = null;
                    }
                }
            }
        }
        class80.field1291 = 0;
        if (class268.field4044 != null) {
            for (int var6 = 0; var6 < class80.field1291; var6++) {
                class268.field4044[var6] = null;
            }
        }
        if (class173.field2627 != null) {
            for (int var7 = 0; var7 < class97.field1525; var7++) {
                class173.field2627[var7] = null;
            }
            class97.field1525 = 0;
        }
        if (class200.field3044 != null) {
            for (int var8 = 0; var8 < class200.field3044.length; var8++) {
                class200.field3044[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)I")
    public abstract int method112(int arg0);

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "(B)[B")
    public abstract byte[] method111(byte arg0);

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "(B)V")
    public static void method1806(byte arg0) {
        if (arg0 != 57) {
            field4089 = null;
        }
        field4093 = null;
        field4089 = null;
    }
}

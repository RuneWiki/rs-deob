import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class145 {

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field3332 = 127;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field3330 = 0;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "Lod;")
    public static class101 field3331 = class46.method335(67, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field3335 = 0;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "Lod;")
    public static class101 field3336 = class46.method335(-101, ":");

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field3338 = 0;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
    public static void method1148(byte arg0) {
        if (arg0 >= 63) {
            field3331 = null;
            field3336 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1149(byte[] arg0, int arg1) {
        field3334++;
        if (arg1 < 68) {
            method1149(null, -13);
        }
        class138 var2 = new class138(arg0);
        int var3 = var2.method1055(124);
        int var4 = var2.method1062(1809568712);
        if (var4 < 0 || class26.field681 != 0 && class26.field681 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method1076(var4, 16711680, 0, var7);
            return var7;
        } else {
            int var5 = var2.method1062(1809568712);
            if (var5 < 0 || class26.field681 != 0 && var5 > class26.field681) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class139.method1111(var6, var5, arg0, var4, 9);
            } else {
                class129.field2950.method252(10, var6, var2);
            }
            return var6;
        }
    }
}

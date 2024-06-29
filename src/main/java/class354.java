import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class354 {

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "Lhda;")
    public static class752 field4986 = new class752(40, -1);

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4992 = null;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "[I")
    public static int[] field4991 = new int[4096];

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "Lkaa;")
    public static class47 field4990 = new class47(61, -1);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public int field4982;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public int field4984;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public int field4987;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public int field4989;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V", line = 6)
    public static void method2116(byte arg0) {
        field4990 = null;
        field4991 = null;
        if (arg0 >= -105) {
            method2116((byte) -9);
        }
        field4992 = null;
        field4986 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)Z", line = 24)
    public static final boolean method2117(int arg0, byte arg1) {
        int var2 = 9 / ((12 - arg1) / 63);
        field4983++;
        return arg0 == 0 || arg0 == 1 || arg0 == 2;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Lel;", line = 35)
    public static final class548 method2118(int arg0, int arg1) {
        if (arg1 < 81) {
            method2117(89, (byte) 77);
        }
        field4988++;
        class548[] var2 = class760.method4229((byte) 114);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class548 var4 = var2[var3];
            if (var4.field7244 == arg0) {
                return var4;
            }
        }
        return null;
    }
}

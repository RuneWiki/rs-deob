import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class702 {

    @OriginalMember(owner = "client!gba", name = "j", descriptor = "I")
    public int field9780;

    @OriginalMember(owner = "client!gba", name = "e", descriptor = "J")
    public long field9775;

    @OriginalMember(owner = "client!gba", name = "d", descriptor = "Ljava/lang/String;")
    public String field9774;

    @OriginalMember(owner = "client!gba", name = "f", descriptor = "Ljava/lang/String;")
    public String field9776;

    @OriginalMember(owner = "client!gba", name = "g", descriptor = "I")
    public int field9777;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "[C")
    private static char[] field9771 = new char[64];

    @OriginalMember(owner = "client!gba", name = "h", descriptor = "Lju;")
    public static class102 field9778;

    @OriginalMember(owner = "client!gba", name = "i", descriptor = "Lqk;")
    public static class148 field9779;

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "I")
    public static int field9772;

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "I")
    public static int field9773;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Z)V")
    public static void method3954(boolean arg0) {
        if (arg0) {
            method3955(-73, null);
        }
        field9779 = null;
        field9778 = null;
        field9771 = null;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(ILep;)V")
    public static final void method3955(int arg0, class371 arg1) {
        field9772++;
        if (class573.field8105 == null) {
            class350 var2 = new class350();
            byte[] var3 = var2.method1995(128, 16, 128, 115);
            class573.field8105 = class192.method1273(false, -124, var3);
        }
        if (class264.field3594 == null) {
            class558 var4 = new class558();
            byte[] var5 = var4.method3345(128, 16, arg0 ^ 0x60EB, 128);
            class264.field3594 = class192.method1273(false, -103, var5);
        }
        class290 var6 = arg1.field4948;
        if (arg0 == 128 && var6.method1712(arg0 ^ 0xF8) && class475.field6489 == null) {
            byte[] var7 = class295.method1729(16.0F, 128, 4.0F, 8, 128, 0.6F, 0.5F, 16, 4.0F, 104, new class431(419684));
            class475.field6489 = class192.method1273(false, arg0 - 255, var7);
        }
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
    public class702(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field9780 = arg2;
        this.field9775 = arg4;
        this.field9774 = arg3;
        this.field9776 = arg1;
        this.field9777 = arg0;
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field9771[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field9771[var1] = (char) (var1 + 71);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field9771[var2] = (char) (var2 + 48 - 52);
        }
        field9771[63] = '/';
        field9771[62] = '+';
        field9778 = new class102(77, -1);
        field9779 = new class148(12, 0);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class293 extends RuntimeException {

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "Ljava/lang/String;")
    public String field4734;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field4733;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field4732 = -1;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field4740 = 0;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "[C")
    public static char[] field4739 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "[I")
    public static int[] field4737;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILjava/lang/String;C)[Ljava/lang/String;", line = 10)
    public static final String[] method2114(int arg0, String arg1, char arg2) {
        int var3 = class330.method2321(arg1, arg2, (byte) 28);
        field4738++;
        String[] var4 = new String[var3 + 1];
        if (arg0 > -49) {
            method2116(-41);
        }
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var5; arg2 != arg1.charAt(var8); var8++) {
            }
            var4[var6++] = arg1.substring(var5, var8);
            var5 = var8 + 1;
        }
        var4[var3] = arg1.substring(var5);
        return var4;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 46)
    public static final void method2115(int arg0) {
        field4736++;
        if (arg0 < 11) {
            return;
        }
        for (int var1 = 0; var1 < class35.field508; var1++) {
            int var2 = class330.field5253[var1];
            class288 var3 = class165.field2621[var2];
            if (var3 != null) {
                class70.method598(var3.field4692.field2025, var3, 13402);
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V", line = 74)
    public static void method2116(int arg0) {
        field4739 = null;
        field4737 = null;
        if (arg0 < 61) {
            method2114(60, (String) null, (char) 65466);
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 88)
    public class293(Throwable arg0, String arg1) {
        this.field4734 = arg1;
        this.field4733 = arg0;
    }
}

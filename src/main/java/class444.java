import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class444 {

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "[I")
    public static int[] field6610 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "B")
    public byte field6603;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public int field6601;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field6602;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field6608;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "Ljava/lang/String;")
    public String field6600;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "Ljava/lang/String;")
    public String field6605;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "Ljava/lang/String;")
    public String field6606;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "Ljava/lang/String;")
    public String field6609;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method2665(int arg0, int arg1, boolean arg2) {
        field6604++;
        if (arg2) {
            return true;
        } else {
            return (arg0 & 0x10000) != 0;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILqs;)V")
    public static final void method2666(int arg0, class496 arg1) {
        if (arg0 != 63) {
            method2669(91, 55, -67, null);
        }
        class127.field2190 = arg1;
        field6602++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IJ)V")
    public static final void method2667(int arg0, long arg1) {
        if (arg0 != -28210) {
            return;
        }
        field6607++;
        if (arg1 <= 0L) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class64.method422(false, arg1 - 1L);
            class64.method422(false, 1L);
        } else {
            class64.method422(false, arg1);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
    public static void method2668(int arg0) {
        if (arg0 == 15250) {
            field6610 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III[B)Ljava/lang/String;")
    public static final String method2669(int arg0, int arg1, int arg2, byte[] arg3) {
        field6608++;
        char[] var4 = new char[arg1];
        int var5 = 0;
        if (arg0 != 4971) {
            field6610 = null;
        }
        for (int var6 = 0; var6 < arg1; var6++) {
            int var7 = arg3[arg2 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class362.field5643[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }
}

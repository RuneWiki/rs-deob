import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class369 {

    @OriginalMember(owner = "client!e", name = "a", descriptor = "[I")
    public static int[] field5523 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field5525 = 0;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field5526 = 0;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "[I")
    public static int[] field5524 = new int[25];

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "Lwf;")
    public static class88 field5528;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method2368(int arg0, String arg1) {
        field5527++;
        int var2 = arg1.length();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (var3 << 5) + (long) arg1.charAt(var5) - var3;
        }
        if (arg0 != 22788) {
            method2369(-101);
        }
        return var3;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    public static void method2369(int arg0) {
        field5524 = null;
        field5528 = null;
        field5523 = null;
        if (arg0 > -100) {
            field5528 = null;
        }
    }
}

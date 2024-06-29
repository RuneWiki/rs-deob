import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class146 {

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "[I")
    private int[] field2354;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2356 = "glow1:";

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2359 = "shake:";

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)I")
    public final int method998(int arg0, int arg1) {
        int var3 = (this.field2354.length >> 1) - 1;
        field2358++;
        if (arg0 != 30715) {
            return 84;
        }
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field2354[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field2354[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lhi;Z)Ljava/lang/String;")
    public static final String method999(class264 arg0, boolean arg1) {
        if (arg1) {
            field2360++;
            return class295.method1972(92, arg0, 32767);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    public static void method1000(byte arg0) {
        field2359 = null;
        if (arg0 > -55) {
            method1000((byte) 14);
        }
        field2356 = null;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "([I)V")
    public class146(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field2354 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field2354[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field2354[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field2354[var5 + var5] = arg0[var4];
            this.field2354[var5 + var5 + 1] = var4++;
        }
    }
}

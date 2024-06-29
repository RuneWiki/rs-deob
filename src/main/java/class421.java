import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class421 {

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
    public static int field5895 = 0;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "Ljava/lang/String;")
    public static String field5896 = "";

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "Ljava/lang/String;")
    public static String field5900 = "Loaded input handler";

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "[Lne;")
    public static class76[] field5894;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V")
    public static void method2594(int arg0) {
        int var1 = -48 / ((arg0 + 20) / 34);
        field5894 = null;
        field5900 = null;
        field5896 = null;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILrk;Lrk;)V")
    public static final void method2595(int arg0, class427 arg1, class427 arg2) {
        field5893++;
        class298.field4011 = arg1;
        class167.field2476 = arg2;
        if (arg0 != 0) {
            field5896 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V")
    public static final void method2596(int arg0) {
        field5898++;
        for (int var1 = arg0; var1 < class7.field57.length; var1++) {
            for (int var2 = 0; var2 < class7.field57[0].length; var2++) {
                for (int var3 = 0; var3 < class7.field57[0][0].length; var3++) {
                    class7.field57[var1][var2][var3] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IC)Z")
    public static final boolean method2597(int arg0, char arg1) {
        if (arg0 != 4963) {
            method2594(-114);
        }
        field5897++;
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }
}

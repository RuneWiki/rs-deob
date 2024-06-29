import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class111 {

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field1681 = 0;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field1680 = 0;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "Lrh;")
    public static class46 field1679 = new class46();

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field1683 = 0;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field1684 = 0;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "Llf;")
    public static class211 field1682 = new class211(30);

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field1686 = 0;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "[I")
    public static int[] field1685;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public static void method724(int arg0) {
        field1685 = null;
        int var1 = 16 / ((arg0 + 57) / 59);
        field1682 = null;
        field1679 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static final void method725(int arg0, String arg1, boolean arg2) {
        field1678++;
        boolean var3 = arg2;
        String var4 = class154.method1020(class31.method249(arg1, -19719), 107);
        for (int var5 = 0; var5 < class73.field1040; var5++) {
            class186 var6 = class153.field2277[class8.field117[var5]];
            if (var6 != null && var6.field2912 != null && var6.field2912.equalsIgnoreCase(var4)) {
                var3 = true;
                class283.method1894((byte) 118, class149.field2227.field1272[0], false, 0, 2, 0, var6.field1272[0], var6.field1257[0], 0, 1, class149.field2227.field1257[0], 1);
                if (arg0 == 1) {
                    class212.field3319++;
                    class13.field165.method892(196, (byte) -66);
                    class13.field165.method221(0, class8.field117[var5]);
                } else if (arg0 == 4) {
                    class218.field3549++;
                    class13.field165.method892(141, (byte) -14);
                    class13.field165.method178(128, class8.field117[var5]);
                } else if (arg0 == 5) {
                    class13.field165.method892(211, (byte) -41);
                    class13.field165.method221(0, class8.field117[var5]);
                    class85.field1330++;
                } else if (arg0 == 6) {
                    class13.field165.method892(154, (byte) -88);
                    class13.field165.method223(-1720191288, class8.field117[var5]);
                    class203.field3176++;
                } else if (arg0 == 7) {
                    class13.field165.method892(122, (byte) -118);
                    class64.field897++;
                    class13.field165.method221(0, class8.field117[var5]);
                }
                break;
            }
        }
        if (!var3) {
            class106.method693("", 0, class216.field3534 + var4, (byte) 64);
        }
    }
}

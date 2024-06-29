import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aja")
public class class99 implements class401 {

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!aja", name = "b", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!aja", name = "d", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!aja", name = "e", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!aja", name = "c", descriptor = "Lhb;")
    public static class755 field1257;

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(BI)J", line = 4)
    public static final long method693(byte arg0, int arg1) {
        if (arg0 == 111) {
            field1258++;
            return (long) (arg1 + 11745) * 86400000L;
        } else {
            return 124L;
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(B)V", line = 15)
    public static void method694(byte arg0) {
        int var1 = 10 / ((-arg0 - 37) / 62);
        field1257 = null;
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(JB[ILrh;)Ljava/lang/String;", line = 26)
    public final String method695(long arg0, byte arg1, int[] arg2, class275 arg3) {
        field1255++;
        if (class459.field6571 == arg3) {
            class3 var6 = class391.field5554.method237(arg2[0], 127);
            return var6.method13((int) arg0, (byte) 68);
        } else if (class614.field8671 == arg3 || class477.field6781 == arg3) {
            class501 var8 = class526.field7490.method3567((int) arg0, true);
            return var8.field7108;
        } else {
            int var7 = 77 / ((-arg1 - 71) / 52);
            return class201.field2949 == arg3 || class777.field10724 == arg3 || class610.field8617 == arg3 ? class391.field5554.method237(arg2[0], 127).method13((int) arg0, (byte) 86) : null;
        }
    }

    @OriginalMember(owner = "client!aja", name = "a", descriptor = "(ILcb;Lcb;Lcb;Lfa;Lhk;)Z", line = 55)
    public static final boolean method696(int arg0, class544 arg1, class544 arg2, class544 arg3, class243 arg4, class110 arg5) {
        class298.field4491 = arg4;
        class76.field1020 = arg5;
        class668.field9395 = new int[16];
        class633.field8937 = arg1;
        int var6 = 2 / ((-arg0 - 54) / 34);
        field1259++;
        class513.field7329 = arg3;
        class221.field3148 = arg2;
        for (int var7 = 0; var7 < 16; var7++) {
            class668.field9395[var7] = 255;
        }
        return true;
    }
}

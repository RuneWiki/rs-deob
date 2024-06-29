import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class235 {

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static volatile int field3323 = 0;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3326 = "Started 3d Library";

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3329 = "Ok";

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "Ltd;")
    public static class283 field3328;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "Ltd;")
    public static class283 field3332;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "[I")
    public static int[] field3331;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB[BI)I", line = 4)
    public static final int method1617(int arg0, byte arg1, byte[] arg2, int arg3) {
        field3327++;
        int var4 = -1;
        if (arg1 < 105) {
            return 83;
        } else {
            for (int var5 = arg3; var5 < arg0; var5++) {
                var4 = class326.field4929[(arg2[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
            }
            return ~var4;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZZ)I", line = 28)
    public static final int method1618(boolean arg0, boolean arg1) {
        long var2 = class29.method174(27763);
        field3324++;
        if (!arg0) {
            return 46;
        }
        for (class276 var4 = arg1 ? (class276) class7.field59.method110(0) : (class276) class7.field59.method115(0); var4 != null; var4 = (class276) class7.field59.method115(0)) {
            if ((var4.field4136 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field4136 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field2522;
                    class324.field4920[var5] = class273.field4083[var5];
                    var4.method1274((byte) -26);
                    return var5;
                }
                var4.method1274((byte) -26);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V", line = 71)
    public static void method1619(int arg0) {
        if (arg0 != -1) {
            method1617(-21, (byte) 113, (byte[]) null, 125);
        }
        field3331 = null;
        field3326 = null;
        field3328 = null;
        field3329 = null;
        field3332 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lkm;BI)Lpn;", line = 95)
    public static final class170 method1620(class133 arg0, byte arg1, int arg2) {
        if (arg1 > -57) {
            field3329 = (String) null;
        }
        field3325++;
        return class189.method1326(true, arg0, arg2) ? class246.method1688(-85) : null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI)V", line = 110)
    public static final void method1621(boolean arg0, int arg1) {
        class143 var2 = class163.method1176((byte) 110, arg1, 4);
        if (arg0) {
            field3332 = (class283) null;
        }
        field3330++;
        var2.method1038(0);
    }
}

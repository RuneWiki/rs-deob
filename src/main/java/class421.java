import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class421 implements class98 {

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "Z")
    public static boolean field5443 = true;

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "[Lmea;")
    public static class357[] field5440;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)Lcg;")
    public static final class11 method2423(int arg0) {
        field5445++;
        class11 var1 = class202.method1317(-18665);
        var1.field116 = null;
        int var2 = 59 / ((-arg0 - 45) / 47);
        var1.field113 = 0;
        var1.field114 = new class534(5000);
        return var1;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2424(int arg0, byte arg1, int arg2) {
        if (arg1 < 103) {
            method2423(67);
        }
        field5446++;
        return (arg0 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)V")
    public static void method2425(int arg0) {
        if (arg0 != 0) {
            field5444 = 101;
        }
        field5440 = null;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(BJLmv;[I)Ljava/lang/String;")
    public final String method738(byte arg0, long arg1, class297 arg2, int[] arg3) {
        field5442++;
        if (arg0 != -63) {
            field5444 = 87;
        }
        if (class604.field8190 == arg2) {
            class539 var6 = class359.field4656.method2333((byte) 27, arg3[0]);
            return var6.method2860((int) arg1, -4639);
        } else if (class150.field1925 == arg2 || class193.field2498 == arg2) {
            class696 var7 = class232.field3109.method1292(arg0 ^ 0xFFFFFFC1, (int) arg1);
            return var7.field9569;
        } else if (class432.field5577 == arg2 || class332.field4311 == arg2 || class608.field8214 == arg2) {
            return class359.field4656.method2333((byte) 39, arg3[0]).method2860((int) arg1, -4639);
        } else {
            return null;
        }
    }
}

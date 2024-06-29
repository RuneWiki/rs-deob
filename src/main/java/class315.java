import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public abstract class class315 {

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "Ljf;")
    public static class229 field5343 = class212.method1457((byte) 119, ")1 ");

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "Z")
    public static boolean field5347 = false;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "Ljf;")
    public static class229 field5341 = class212.method1457((byte) 60, "ondulation2:");

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "[[B")
    public static byte[][] field5336;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V", line = 12)
    public static final void method2136(int arg0) {
        int var1 = -1;
        int var2 = -99 % ((arg0 - 32) / 38);
        while (class132.field2323 > var1) {
            int var3;
            if (var1 == -1) {
                var3 = 2047;
            } else {
                var3 = class90.field1652[var1];
            }
            class33 var4 = class192.field3334[var3];
            if (var4 != null) {
                class236.method1689(var4, (byte) 82, var4.method299(true));
            }
            var1++;
        }
        field5339++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZS)Z", line = 52)
    public static final boolean method2137(boolean arg0, short arg1) {
        field5345++;
        if (arg1 == 13 || arg1 == 58 || arg1 == 3 || arg1 == 5 || arg1 == 17 || arg1 == 14 || arg1 == 2 || arg1 == 43) {
            return true;
        } else if (arg1 == 19 || arg1 == 45 || arg1 == 1007 || arg1 == 1005) {
            return true;
        } else if (!arg0) {
            return true;
        } else if (arg1 == 10 || arg1 == 33 || arg1 == 1 || arg1 == 15 || arg1 == 12) {
            return true;
        } else {
            return arg1 == 32 || arg1 == 44 || arg1 == 49 || arg1 == 38 || arg1 == 48 || arg1 == 47;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V", line = 89)
    public static final void method2138(byte arg0) {
        field5349++;
        class78 var1 = class217.field3720;
        synchronized (class217.field3720) {
            class128.field2293 = class66.field1122;
            class46.field851++;
            if (arg0 >= -55) {
                field5341 = (class229) null;
            }
            if (class130.field2303 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class84.field1613[var2] = false;
                }
                class130.field2303 = class130.field2309;
            } else {
                while (class130.field2309 != class130.field2303) {
                    int var3 = class16.field264[class130.field2309];
                    class130.field2309 = class130.field2309 + 1 & 0x7F;
                    if (var3 < 0) {
                        class84.field1613[~var3] = false;
                    } else {
                        class84.field1613[var3] = true;
                    }
                }
            }
            class66.field1122 = class188.field3286;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Z", line = 138)
    public static final boolean method2139(int arg0, int arg1) {
        if (arg1 != -11) {
            field5336 = (byte[][]) ((byte[][]) null);
        }
        field5344++;
        return (arg0 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V", line = 150)
    public static void method2140(byte arg0) {
        if (arg0 == -12) {
            field5336 = (byte[][]) null;
            field5343 = null;
            field5341 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)[B")
    public abstract byte[] method632(byte arg0);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B[B)V")
    public abstract void method633(byte arg0, byte[] arg1);
}

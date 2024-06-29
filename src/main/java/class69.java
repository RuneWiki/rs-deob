import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class69 extends class328 {

    @OriginalMember(owner = "client!qs", name = "E", descriptor = "Lpp;")
    public static class464 field1300 = new class464(32, -1);

    @OriginalMember(owner = "client!qs", name = "I", descriptor = "I")
    public static int field1304 = 0;

    @OriginalMember(owner = "client!qs", name = "H", descriptor = "[Ljava/lang/String;")
    public static String[] field1303 = new String[8];

    @OriginalMember(owner = "client!qs", name = "J", descriptor = "[I")
    public static int[] field1305 = new int[32];

    @OriginalMember(owner = "client!qs", name = "M", descriptor = "Z")
    public static boolean field1308 = true;

    @OriginalMember(owner = "client!qs", name = "C", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!qs", name = "D", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!qs", name = "F", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!qs", name = "L", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!qs", name = "G", descriptor = "Lcba;")
    public static class232 field1302;

    @OriginalMember(owner = "client!qs", name = "N", descriptor = "Lgp;")
    public static class561 field1309;

    @OriginalMember(owner = "client!qs", name = "K", descriptor = "Z")
    public static boolean field1306;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "(I)V")
    public static void method677(int arg0) {
        if (arg0 != 3) {
            return;
        }
        field1302 = null;
        field1303 = null;
        field1305 = null;
        field1300 = null;
        field1309 = null;
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "()V")
    public class69() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIIZ)V")
    public static final void method678(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class431.field6285 = arg3;
        class35.field484 = arg2;
        field1298++;
        class449.field6544 = arg1;
        if (arg4) {
            class536.field7487 = arg0;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "([BZ)Ljava/lang/String;")
    public static final String method679(byte[] arg0, boolean arg1) {
        field1307++;
        int var2 = arg0.length;
        char[] var3 = new char[var2];
        int var4 = 0;
        int var5 = 0;
        if (!arg1) {
            return null;
        }
        while (var2 > var5) {
            int var6 = arg0[var5] & 0xFF;
            if (var6 >= 128) {
                if (var6 < 194) {
                    throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var6);
                }
                if (var6 >= 224) {
                    label70: {
                        if (var6 >= 240) {
                            if (var6 >= 244) {
                                throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var6);
                            }
                            throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                        }
                        if ((var5 + 2) >= var2) {
                            throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                        }
                        var5++;
                        int var7 = arg0[var5] & 0xFF;
                        if (var7 >= 128 && var7 <= 191) {
                            var5++;
                            int var8 = arg0[var5] & 0xFF;
                            if (var8 >= 128 && var8 <= 191) {
                                var3[var4++] = (char) class188.method1258(class188.method1258(class424.method2540(-921600, var6 << 12), class424.method2540(var7, -129) << 6), class424.method2540(-129, var8));
                                break label70;
                            }
                            throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                        }
                        throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                    }
                } else if (var5 + 1 < var2) {
                    var5++;
                    int var9 = arg0[var5] & 0xFF;
                    if (var9 < 128 || var9 > 191) {
                        throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                    }
                    var3[var4++] = (char) class188.method1258(class424.method2540(var6, -193) << 6, class424.method2540(var9, -129));
                } else {
                    throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                }
            } else {
                var3[var4++] = (char) var6;
            }
            var5++;
        }
        return new String(var3, 0, var4);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        int var3 = -98 % ((48 - arg1) / 56);
        field1301++;
        return class206.field2924;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "([BI)Lah;")
    public static final class240 method680(byte[] arg0, int arg1) {
        field1299++;
        class240 var2 = new class240();
        class268 var3 = new class268(arg0);
        var3.field3913 = var3.field3952.length - 2;
        int var4 = var3.method1745(32132);
        int var5 = var3.field3952.length - var4 - 2 - 12;
        var3.field3913 = var5;
        int var6 = var3.method1748(-115);
        var2.field3496 = var3.method1745(32132);
        var2.field3484 = var3.method1745(32132);
        var2.field3488 = var3.method1745(32132);
        var2.field3485 = var3.method1745(32132);
        int var7 = var3.method1738(arg1 + 256);
        if (~var7 < arg1) {
            var2.field3490 = new class78[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method1745(32132);
                class78 var10 = new class78(class243.method1546(arg1 - 26366, var9));
                var2.field3490[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method1748(98);
                    int var12 = var3.method1748(116);
                    var10.method737((long) var11, (byte) 92, new class264(var12));
                }
            }
        }
        var3.field3913 = 0;
        var2.field3483 = var3.method1711(113);
        var2.field3492 = new String[var6];
        var2.field3493 = new int[var6];
        var2.field3495 = new int[var6];
        int var13 = 0;
        while (var5 > var3.field3913) {
            int var14 = var3.method1745(arg1 ^ 0xFFFF827B);
            if (var14 == 3) {
                var2.field3492[var13] = var3.method1752(false).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field3495[var13] = var3.method1738(255);
            } else {
                var2.field3495[var13] = var3.method1748(91);
            }
            var2.field3493[var13++] = var14;
        }
        return var2;
    }
}

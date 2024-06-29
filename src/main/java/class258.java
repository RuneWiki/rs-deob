import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public abstract class class258 {

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Loh;")
    public static class263 field4475 = class253.method1681(-126, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field4478 = 0;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Z")
    public static boolean field4479 = false;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field4481 = -1;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z[B)V")
    public abstract void method838(boolean arg0, byte[] arg1);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
    public static void method1704(boolean arg0) {
        field4475 = null;
        if (!arg0) {
            field4481 = 110;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLsi;)V")
    public static final void method1705(byte arg0, class194 arg1) {
        field4476++;
        int var2 = 90 / ((arg0 - 5) / 58);
        while (true) {
            while (arg1.field3497 < arg1.field3469.length) {
                int var3 = 0;
                boolean var4 = false;
                int var5 = 0;
                if (arg1.method1301(-8317) == 1) {
                    var4 = true;
                    var5 = arg1.method1301(-8317);
                    var3 = arg1.method1301(-8317);
                }
                int var6 = arg1.method1301(-8317);
                int var7 = arg1.method1301(-8317);
                int var8 = var6 * 64 - class54.field1146;
                int var9 = class116.field2163 + class112.field2110 - (var7 * 64) - 1;
                if (var8 >= 0 && (var9 - 63) >= 0 && class8.field149 > (var8 + 63) && class112.field2110 > var9) {
                    int var10 = var9 >> 6;
                    int var11 = var8 >> 6;
                    for (int var12 = 0; var12 < 64; var12++) {
                        for (int var13 = 0; var13 < 64; var13++) {
                            if (!var4 || var5 * 8 <= var12 && var5 * 8 + 8 > var12 && (var3 * 8) <= var13 && var3 * 8 + 8 > var13) {
                                byte var14 = arg1.method1281((byte) -40);
                                if (var14 != 0) {
                                    if (class144.field2641[var11][var10] == null) {
                                        class144.field2641[var11][var10] = new byte[4096];
                                    }
                                    class144.field2641[var11][var10][(63 - var13 << 6) + var12] = var14;
                                    byte var15 = arg1.method1281((byte) -76);
                                    if (class130.field2386[var11][var10] == null) {
                                        class130.field2386[var11][var10] = new byte[4096];
                                    }
                                    class130.field2386[var11][var10][(63 - var13 << 6) + var12] = var15;
                                }
                            }
                        }
                    }
                } else {
                    for (int var16 = 0; var16 < (var4 ? 64 : 4096); var16++) {
                        byte var17 = arg1.method1281((byte) 4);
                        if (var17 != 0) {
                            arg1.field3497++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIB)I")
    public static final int method1706(int arg0, int arg1, byte arg2) {
        if (arg2 != 54) {
            field4475 = null;
        }
        field4480++;
        int var3 = 0;
        while (arg1 > 0) {
            var3 = arg0 & 0x1 | var3 << 1;
            arg0 >>>= 0x1;
            arg1--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(Z)[B")
    public abstract byte[] method837(boolean arg0);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)V")
    public static final void method1707(int arg0, int arg1) {
        class252.field4384--;
        field4477++;
        if (class252.field4384 == arg0 || arg1 != -17919) {
            return;
        }
        class149.method975(class156.field2811, arg0 + 1, class156.field2811, arg0, class252.field4384 - arg0);
        class149.method975(class68.field1382, arg0 + 1, class68.field1382, arg0, class252.field4384 - arg0);
        class149.method980(class202.field3645, arg0 + 1, class202.field3645, arg0, class252.field4384 - arg0);
        class149.method981(class215.field3814, arg0 + 1, class215.field3814, arg0, class252.field4384 - arg0);
        class149.method979(class106.field2018, arg0 + 1, class106.field2018, arg0, class252.field4384 - arg0);
        class149.method979(class41.field918, arg0 + 1, class41.field918, arg0, class252.field4384 - arg0);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public abstract class class88 extends class121 {

    @OriginalMember(owner = "client!me", name = "Y", descriptor = "I")
    public int field2187 = 1000;

    @OriginalMember(owner = "client!me", name = "W", descriptor = "[J")
    public static long[] field2185 = new long[200];

    @OriginalMember(owner = "client!me", name = "X", descriptor = "Loc;")
    public static class99 field2186 = class48.method402((byte) -104, "Offline");

    @OriginalMember(owner = "client!me", name = "S", descriptor = "[I")
    public static int[] field2181 = new int[100];

    @OriginalMember(owner = "client!me", name = "ab", descriptor = "I")
    public static int field2189 = 78;

    @OriginalMember(owner = "client!me", name = "T", descriptor = "Loc;")
    private static class99 field2182 = class48.method402((byte) -104, "Bad session id)3");

    @OriginalMember(owner = "client!me", name = "U", descriptor = "Loc;")
    public static class99 field2183 = field2182;

    @OriginalMember(owner = "client!me", name = "R", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!me", name = "V", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!me", name = "Z", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!me", name = "bb", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!me", name = "cb", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!me", name = "db", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIIIII)V")
    public void method227(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2192++;
        class26 var10 = this.method276((byte) 19);
        if (var10 != null) {
            this.field2187 = var10.field2187;
            var10.method227(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(B)Ldd;")
    public class26 method276(byte arg0) {
        if (arg0 != 19) {
            field2184 = -17;
        }
        field2188++;
        return null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)Z")
    public static final boolean method742(int arg0, int arg1) {
        field2191++;
        if (arg1 <= 73) {
            field2182 = null;
        }
        if (!class35.method306((byte) 108, arg0)) {
            return false;
        }
        class54[] var2 = class132.field3230[arg0];
        boolean var3 = false;
        for (int var4 = 0; var4 < var2.length; var4++) {
            class54 var5 = var2[var4];
            if (var5 != null && var5.field1341 == 6) {
                if (var5.field1321 != -1 || var5.field1365 != -1) {
                    boolean var6 = class46.method388(var5, (byte) 31);
                    int var7;
                    if (var6) {
                        var7 = var5.field1365;
                    } else {
                        var7 = var5.field1321;
                    }
                    if (var7 != -1) {
                        class81 var8 = class142.method1163(-116, var7);
                        var5.field1280 += class143.field3566;
                        label57: while (true) {
                            do {
                                do {
                                    if (var8.field2016[var5.field1313] >= var5.field1280) {
                                        break label57;
                                    }
                                    var5.field1280 -= var8.field2016[var5.field1313];
                                    var5.field1313++;
                                    var3 = true;
                                } while (var5.field1313 < var8.field2026.length);
                                var5.field1313 -= var8.field2008;
                            } while (var5.field1313 >= 0 && var5.field1313 < var8.field2026.length);
                            var5.field1313 = 0;
                        }
                    }
                }
                if (var5.field1402 != 0 && !var5.field1374) {
                    var3 = true;
                    int var9 = var5.field1402 << 16 >> 16;
                    int var10 = var5.field1402 >> 16;
                    int var11 = class143.field3566 * var9;
                    var5.field1288 = var5.field1288 + var11 & 0x7FF;
                    int var12 = class143.field3566 * var10;
                    var5.field1398 = var5.field1398 + var12 & 0x7FF;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(II)Ld;")
    public static final class25 method743(int arg0, int arg1) {
        field2180++;
        class25 var2 = (class25) class37.field929.method997(-1, (long) arg0);
        if (var2 != null) {
            return var2;
        } else if (arg1 >= -74) {
            return null;
        } else {
            byte[] var3 = class138.field3444.method903(4, (byte) -128, arg0);
            class25 var4 = new class25();
            if (var3 != null) {
                var4.method223(0, new class57(var3), arg0);
            }
            var4.method221(-1);
            class37.field929.method993((byte) 100, (long) arg0, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(II)I")
    public static int method744(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V")
    public static void method745(int arg0) {
        field2181 = null;
        if (arg0 != 7396) {
            method743(-94, 28);
        }
        field2183 = null;
        field2186 = null;
        field2185 = null;
        field2182 = null;
    }
}

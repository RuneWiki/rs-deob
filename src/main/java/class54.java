import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class54 {

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field749 = 0;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "Lp;")
    public static class120 field753 = new class120(0, 0);

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "Z")
    public static boolean field755 = true;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "[Z")
    public static boolean[] field745;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "[[[I")
    public static int[][][] field754;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field747++;
        if (arg4 < 128 || arg0 < 128 || (class211.field2954 * 128 - 256) < arg4 || arg0 > (class290.field4061 * 128 - 256)) {
            class48.field682[0] = class48.field682[1] = -1;
            return;
        }
        int var9 = class285.method1858(arg4, class142.field2034, arg0, -117) - arg1;
        class335.field4613.method696(arg3, 0, 0);
        class64.field949.method126(class335.field4613);
        class64.field949.method115(arg4, var9, arg0, class48.field682);
        class335.field4613.method696(-arg3, 0, 0);
        if (arg5 != 15415) {
            field753 = null;
        }
        class64.field949.method126(class335.field4613);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BI)V")
    public static final void method442(byte arg0, int arg1) {
        field752++;
        if (arg0 <= 2) {
            field754 = null;
        }
        class239 var2 = class436.method2740(2, arg1, -323285792);
        var2.method1628(14478);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZ)Lrc;")
    public static final class318 method443(int arg0, boolean arg1) {
        if (arg1) {
            method441(-80, -54, 16, 3, -41, -14, -111, 72, -35);
        }
        field748++;
        class318 var2 = (class318) class161.field2245.method2637((long) arg0, 18620);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class397.field5676.method1745(arg0, (byte) 124, 1);
        } else {
            var3 = class124.field1717.method1745(arg0 & 0x7FFF, (byte) 77, 1);
        }
        class318 var4 = new class318();
        if (var3 != null) {
            var4.method2057(1, new class11(var3));
        }
        if (arg0 >= 32768) {
            var4.method2064(5);
        }
        class161.field2245.method2633((byte) -120, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)V")
    public static final void method444(int arg0, int arg1) {
        field746++;
        class107.field1482.method901(arg1, 12223);
        if (arg0 <= -87) {
            class46.field650.method901(arg1, 12223);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method445(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class14.field279[arg0][var8][var14] == -class328.field4548) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class375.field5354[arg0].method737(arg1, arg3) + arg5;
            if (!class181.method1184(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class181.method1184(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class181.method1184(var9, var11, var13)) {
                return false;
            } else if (class181.method1184(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class280.method1830(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class181.method1184(var6 + 1, class375.field5354[arg0].method737(arg1, arg3) + arg5, var7 + 1) && class181.method1184(var6 + 128 - 1, class375.field5354[arg0].method737(arg1 + 1, arg3) + arg5, var7 + 1) && class181.method1184(var6 + 128 - 1, class375.field5354[arg0].method737(arg1 + 1, arg3 + 1) + arg5, var7 + 128 - 1) && class181.method1184(var6 + 1, class375.field5354[arg0].method737(arg1, arg3 + 1) + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
    public static void method446(byte arg0) {
        field754 = null;
        field745 = null;
        field753 = null;
        if (arg0 != -50) {
            field745 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IBII)V")
    public static final void method447(int arg0, byte arg1, int arg2, int arg3) {
        field751++;
        String var4 = "tele " + arg2 + "," + (arg0 >> 6) + "," + (arg3 >> 6) + "," + (arg0 & 0x3F) + "," + (arg3 & 0x3F);
        System.out.println(var4);
        if (arg1 == 48) {
            class233.method1596(109, true, var4);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)Z")
    public static final boolean method448(int arg0) {
        field750++;
        if (arg0 != -29170) {
            field755 = true;
        }
        class87 var1 = (class87) class121.field1699.field1267.field5601;
        if (var1 == null || class121.field1699.field1267 == var1) {
            return false;
        } else {
            if (var1.field1217 >= 2000) {
                var1.field1217 -= 2000;
            }
            return var1.field1217 == 1002;
        }
    }
}

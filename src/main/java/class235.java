import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class235 {

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field3416 = 0;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3424 = "Select";

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "[I")
    public static int[] field3421 = new int[14];

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public int field3414;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
    public int field3430;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
    private int field3431;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "Lt;")
    public static class268 field3422;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "Lbh;")
    public static class288 field3428;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BIIII)V", line = 7)
    public static final void method1661(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 > arg4) {
            class279.method1997(arg2, arg0 ^ 0xCEDCE265, arg4, arg1, class206.field2886[arg3]);
        } else {
            class279.method1997(arg4, -824384948, arg2, arg1, class206.field2886[arg3]);
        }
        field3429++;
        if (arg0 != 41) {
            method1672((String) null, 1);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZI)Lkg;", line = 27)
    public static final class82 method1662(boolean arg0, int arg1) {
        class82 var2 = (class82) class40.field472.method1239((byte) -83, (long) arg1);
        field3426++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class78.field979.method1199(28815, 0, arg1);
        class82 var4 = new class82(var3);
        var4.method84(class79.field1009, (int[]) null);
        class40.field472.method1243(var4, (long) arg1, -29282);
        if (arg0) {
            field3421 = (int[]) null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(ZI)I", line = 47)
    public static final int method1663(boolean arg0, int arg1) {
        if (arg0) {
            field3425++;
            return arg1 & 0x7F;
        } else {
            return -126;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBLp;)V", line = 64)
    public final void method1664(int arg0, byte arg1, class107 arg2) {
        while (true) {
            int var4 = arg2.method661(-1);
            if (var4 == 0) {
                field3417++;
                int var5 = 36 / ((arg1 + 65) / 51);
                return;
            }
            this.method1665((byte) 94, arg2, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLp;II)V", line = 82)
    private final void method1665(byte arg0, class107 arg1, int arg2, int arg3) {
        if (arg0 != 94) {
            this.method1665((byte) 2, (class107) null, -27, 119);
        }
        if (arg2 == 1) {
            this.field3431 = arg1.method624(14612);
        } else if (arg2 == 2) {
            this.field3430 = arg1.method661(-1);
            this.field3414 = arg1.method661(-1);
        }
        field3415++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIII)V", line = 110)
    public static final void method1666(int arg0, int arg1, int arg2, int arg3) {
        class221.method1522(false, -1);
        class316.field4874 = arg2;
        class320.field4922 = arg0;
        field3418++;
        class332.method2288(arg1, (byte) -34);
        if (arg3 != 4) {
            field3416 = -21;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)Laf;", line = 125)
    public final class189 method1667(int arg0) {
        class189 var2 = (class189) class19.field248.method1239((byte) -52, (long) this.field3431);
        field3420++;
        if (var2 != null) {
            return var2;
        }
        class189 var3 = class36.method217(this.field3431, (byte) -99, class293.field4596, arg0);
        if (var3 != null) {
            class19.field248.method1243(var3, (long) this.field3431, arg0 ^ 0xFFFF8D9E);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V", line = 144)
    public static final void method1668(int arg0) {
        class311.field4809.method1237((byte) -104);
        int var1 = 54 % ((68 - arg0) / 38);
        field3412++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V", line = 159)
    public static void method1669(boolean arg0) {
        if (arg0) {
            field3424 = (String) null;
        }
        field3428 = null;
        field3422 = null;
        field3424 = null;
        field3421 = null;
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V", line = 178)
    public static final void method1670(int arg0) {
        field3419++;
        for (int var1 = -1; var1 < class204.field2864; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class180.field2612[var1];
            }
            class109 var3 = class328.field5009[var2];
            if (var3 != null) {
                class78.method464((byte) -83, var3.method748(false), var3);
            }
        }
        if (arg0 != 0) {
            method1670(-117);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZB)V", line = 211)
    public static final void method1671(boolean arg0, byte arg1) {
        field3427++;
        if (arg1 > -58) {
            field3424 = (String) null;
        }
        byte var2;
        byte[][] var3;
        if (class250.field3787 && arg0) {
            var2 = 1;
            var3 = class110.field1545;
        } else {
            var3 = class106.field1347;
            var2 = 4;
        }
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int[] var6 = null;
            byte[] var7 = var3[var5];
            int var8 = class120.field1694[var5] >> 8;
            int var9 = class120.field1694[var5] & 0xFF;
            int var10 = var8 * 64 - class142.field1992;
            int var11 = var9 * 64 - class118.field1668;
            if (var7 != null) {
                class239.method1713(31532);
                var6 = class78.method461(class149.field2072, class118.field1668, class142.field1992, arg0, var11, var10, var7, -99);
            }
            if (!arg0 && (class146.field2033 / 8) == var8 && (class328.field4999 / 8) == var9) {
                if (var6 == null) {
                    class289.field4528 = -1;
                } else {
                    class220.field3097 = var6[3];
                    class74.field949 = var6[2];
                    class179.field2603 = var6[1];
                    class289.field4528 = var6[0];
                    class337.field5200 = var6[4];
                }
            }
        }
        for (int var12 = 0; var12 < var4; var12++) {
            int var13 = (class120.field1694[var12] >> 8) * 64 - class142.field1992;
            int var14 = (class120.field1694[var12] & 0xFF) * 64 - class118.field1668;
            byte[] var15 = var3[var12];
            if (var15 == null && class328.field4999 < 800) {
                class239.method1713(31532);
                for (int var16 = 0; var16 < var2; var16++) {
                    class309.method2163((byte) -108, 64, var14, var13, 64, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 309)
    public static final int method1672(String arg0, int arg1) {
        field3423++;
        return arg1 == 10 ? class214.method1463(55, true, 10, arg0) : -103;
    }
}

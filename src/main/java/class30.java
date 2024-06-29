import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class30 extends class199 {

    @OriginalMember(owner = "client!gf", name = "A", descriptor = "[B")
    public byte[] field433;

    @OriginalMember(owner = "client!gf", name = "G", descriptor = "Lpg;")
    public static class320 field438 = new class320(64);

    @OriginalMember(owner = "client!gf", name = "I", descriptor = "I")
    public static int field439 = 0;

    @OriginalMember(owner = "client!gf", name = "J", descriptor = "I")
    public static int field440 = -1;

    @OriginalMember(owner = "client!gf", name = "K", descriptor = "Lpg;")
    public static class320 field441 = new class320(64);

    @OriginalMember(owner = "client!gf", name = "M", descriptor = "F")
    public static float field443 = 128.0F;

    @OriginalMember(owner = "client!gf", name = "B", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!gf", name = "C", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!gf", name = "D", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!gf", name = "F", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!gf", name = "L", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLib;)I", line = 5)
    public static final int method254(byte arg0, class313 arg1) {
        class206 var2 = arg1.field4859;
        field435++;
        if (arg0 != 74) {
            return 117;
        }
        if (var2.field3120 != null) {
            var2 = var2.method1465(arg0 ^ 0x3C);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field3137;
        class333 var4 = arg1.method888(arg0 - 74);
        if (arg1.field1872 == var4.field5206) {
            var3 = var2.field3119;
        } else if (arg1.field1872 == var4.field5180 || arg1.field1872 == var4.field5217 || arg1.field1872 == var4.field5187 || arg1.field1872 == var4.field5186) {
            var3 = var2.field3165;
        } else if (arg1.field1872 == var4.field5185 || arg1.field1872 == var4.field5178 || arg1.field1872 == var4.field5205 || arg1.field1872 == var4.field5196) {
            var3 = var2.field3156;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(Z)V", line = 44)
    public static void method255(boolean arg0) {
        if (arg0) {
            field438 = null;
            field441 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "([B)V", line = 53)
    public class30(byte[] arg0) {
        this.field433 = arg0;
    }

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "(I)V", line = 65)
    public static final void method256(int arg0) {
        if (arg0 < 39) {
            field441 = (class320) null;
        }
        if (class84.field1305 == 2) {
            if (class90.field1434 == class227.field3616 && class52.field870 == class22.field348) {
                class84.field1305 = 0;
                if (class12.field181 && class53.field902[81] && class301.field4706 > 2) {
                    class332.method2304(class301.field4706 - 2, (byte) -122);
                } else {
                    class332.method2304(class301.field4706 - 1, (byte) -122);
                }
            }
        } else if (class227.field3616 == class205.field3084 && class47.field776 == class22.field348) {
            class84.field1305 = 0;
            if (class12.field181 && class53.field902[81] && class301.field4706 > 2) {
                class332.method2304(class301.field4706 - 2, (byte) -122);
            } else {
                class332.method2304(class301.field4706 - 1, (byte) -122);
            }
        } else {
            class52.field870 = class47.field776;
            class90.field1434 = class205.field3084;
            class84.field1305 = 2;
        }
        field436++;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZ)V", line = 122)
    public static final void method257(int arg0, boolean arg1) {
        field434++;
        byte var2;
        byte[][] var3;
        if (class94.field1516 && arg1) {
            var2 = 1;
            var3 = class29.field430;
        } else {
            var3 = class303.field4723;
            var2 = 4;
        }
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int[] var6 = null;
            byte[] var7 = var3[var5];
            int var8 = class331.field5158[var5] & 0xFF;
            int var9 = class331.field5158[var5] >> 8;
            int var10 = var9 * 64 - class213.field3249;
            int var11 = var8 * 64 - class342.field5328;
            if (var7 != null) {
                class170.method1225((byte) -97);
                var6 = class304.method2077(var11, var7, var10, arg1, class224.field3570, class213.field3249, class342.field5328, -22893);
            }
            if (!arg1 && (class81.field1272 / 8) == var9 && class315.field4887 / 8 == var8) {
                if (var6 == null) {
                    field440 = -1;
                } else {
                    class341.field5318 = var6[2];
                    class278.field4282 = var6[4];
                    class117.field1791 = var6[1];
                    class163.field2451 = var6[3];
                    field440 = var6[0];
                }
            }
        }
        if (arg0 != 4) {
            method254((byte) -17, (class313) null);
        }
        for (int var12 = 0; var12 < var4; var12++) {
            int var13 = (class331.field5158[var12] >> 8) * 64 - class213.field3249;
            int var14 = (class331.field5158[var12] & 0xFF) * 64 - class342.field5328;
            byte[] var15 = var3[var12];
            if (var15 == null && class315.field4887 < 800) {
                class170.method1225((byte) -97);
                for (int var16 = 0; var16 < var2; var16++) {
                    class320.method2178(var13, var14, 64, 64, -29029, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IBIII)V", line = 215)
    public static final void method258(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field437++;
        if (arg4 > arg2) {
            for (int var5 = arg2; var5 < arg4; var5++) {
                class34.field525[var5][arg3] = arg0;
            }
        } else {
            for (int var6 = arg4; var6 < arg2; var6++) {
                class34.field525[var6][arg3] = arg0;
            }
        }
        if (arg1 != 40) {
            field439 = 69;
        }
    }
}

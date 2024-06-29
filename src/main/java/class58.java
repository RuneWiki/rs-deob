import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class58 {

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "Z")
    public static boolean field654 = false;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "[I")
    public static int[] field656 = new int[14];

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "Lem;")
    public static class206 field657 = new class206(21, 2);

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "Llh;")
    public static class487 field661 = new class487(63, 0);

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!qn", name = "j", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BFIFF)F", line = 3)
    public static final float method483(byte arg0, float arg1, int arg2, float arg3, float arg4) {
        field658++;
        float[] var5 = class689.field9830[arg2];
        if (arg0 >= -42) {
            method486(-78);
        }
        return var5[2] * arg3 + var5[1] * arg4 + var5[0] * arg1;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILjg;)I", line = 21)
    public static final int method484(int arg0, class309 arg1) {
        field660++;
        if (arg0 != 5120) {
            field661 = null;
        }
        if (class309.field4266 == arg1) {
            return 5120;
        } else if (class309.field4269 == arg1) {
            return 5122;
        } else if (class309.field4270 == arg1) {
            return 5124;
        } else if (class309.field4271 == arg1) {
            return 5121;
        } else if (class309.field4272 == arg1) {
            return 5123;
        } else if (class309.field4273 == arg1) {
            return 5125;
        } else if (class309.field4274 == arg1) {
            return 5131;
        } else if (class309.field4275 == arg1) {
            return 5126;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIZII)V", line = 71)
    public static final void method485(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (!arg3) {
            method483((byte) 47, 0.50910926F, 86, -0.90828645F, -2.0022728F);
        }
        if (arg5 <= class533.field7200 && arg1 >= class469.field6466) {
            boolean var6;
            if (arg0 < class128.field1831) {
                arg0 = class128.field1831;
                var6 = false;
            } else if (arg0 > class529.field7169) {
                arg0 = class529.field7169;
                var6 = false;
            } else {
                var6 = true;
            }
            boolean var7;
            if (class128.field1831 > arg2) {
                arg2 = class128.field1831;
                var7 = false;
            } else if (class529.field7169 < arg2) {
                var7 = false;
                arg2 = class529.field7169;
            } else {
                var7 = true;
            }
            if (arg5 >= class469.field6466) {
                class470.method2660(arg0, arg2, class344.field4599[arg5++], (byte) 11, arg4);
            } else {
                arg5 = class469.field6466;
            }
            if (class533.field7200 < arg1) {
                arg1 = class533.field7200;
            } else {
                class470.method2660(arg0, arg2, class344.field4599[arg1--], (byte) 11, arg4);
            }
            if (var6 && var7) {
                for (int var8 = arg5; var8 <= arg1; var8++) {
                    int[] var9 = class344.field4599[var8];
                    var9[arg0] = var9[arg2] = arg4;
                }
            } else if (var6) {
                for (int var11 = arg5; var11 <= arg1; var11++) {
                    class344.field4599[var11][arg0] = arg4;
                }
            } else if (var7) {
                for (int var10 = arg5; var10 <= arg1; var10++) {
                    class344.field4599[var10][arg2] = arg4;
                }
            }
        }
        field655++;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V", line = 176)
    public static void method486(int arg0) {
        field661 = null;
        int var1 = -104 / ((arg0 - 13) / 53);
        field656 = null;
        field657 = null;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BII)I", line = 194)
    public static final int method487(byte arg0, int arg1, int arg2) {
        if (arg0 != 102) {
            method487((byte) 80, 13, -55);
        }
        field662++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg2 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }
}

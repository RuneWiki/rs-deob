import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class175 extends class178 {

    @OriginalMember(owner = "client!qg", name = "cb", descriptor = "I")
    public int field3179 = 0;

    @OriginalMember(owner = "client!qg", name = "L", descriptor = "Loc;")
    private static class151 field3162 = class137.method873(2, "Unable to connect)3");

    @OriginalMember(owner = "client!qg", name = "W", descriptor = "Loc;")
    public static class151 field3173 = field3162;

    @OriginalMember(owner = "client!qg", name = "P", descriptor = "Loc;")
    public static class151 field3166 = field3162;

    @OriginalMember(owner = "client!qg", name = "X", descriptor = "Loc;")
    public static class151 field3174 = class137.method873(2, "Diese Welt ist voll)3");

    @OriginalMember(owner = "client!qg", name = "M", descriptor = "Loc;")
    public static class151 field3163 = class137.method873(2, "(Y");

    @OriginalMember(owner = "client!qg", name = "bb", descriptor = "Loc;")
    private static class151 field3178 = class137.method873(2, " has logged in)3");

    @OriginalMember(owner = "client!qg", name = "N", descriptor = "Loc;")
    public static class151 field3164 = class137.method873(2, "Ihr Spielkonto wird bereits benutzt)3");

    @OriginalMember(owner = "client!qg", name = "db", descriptor = "Loc;")
    public static class151 field3180 = field3178;

    @OriginalMember(owner = "client!qg", name = "Y", descriptor = "I")
    public static int field3175 = 0;

    @OriginalMember(owner = "client!qg", name = "K", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!qg", name = "O", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!qg", name = "R", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!qg", name = "S", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!qg", name = "T", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!qg", name = "V", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!qg", name = "Z", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!qg", name = "ab", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!qg", name = "fb", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!qg", name = "eb", descriptor = "Lnd;")
    public static class142 field3181;

    @OriginalMember(owner = "client!qg", name = "Q", descriptor = "[I")
    public static int[] field3167;

    @OriginalMember(owner = "client!qg", name = "U", descriptor = "[[[I")
    public static int[][][] field3171;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIII)V")
    public static final void method1113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3161++;
        if (arg0 != 28711) {
            return;
        }
        int var6 = arg2 * arg2;
        class55.method380(arg5, 110, class43.field887[arg1], arg4 + arg2, arg4 - arg2);
        int var7 = arg3;
        int var8 = 0;
        int var9 = var6 << 1;
        int var10 = arg3 << 1;
        int var11 = var6 << 2;
        int var12 = arg3 * arg3;
        int var13 = (arg3 - 1) * var11;
        int var14 = var12 << 1;
        int var15 = ((var8 << 1) + 3) * var14;
        int var16 = (1 - var10) * var6 + var14;
        int var17 = ((arg3 << 1) - 3) * var9;
        int var18 = var12 << 2;
        int var19 = var12 - (var10 - 1) * var9;
        int var20 = (var8 + 1) * var18;
        while (var7 > 0) {
            var7--;
            if (var16 < 0) {
                while (var16 < 0) {
                    var19 += var20;
                    var20 += var18;
                    var16 += var15;
                    var15 += var18;
                    var8++;
                }
            }
            if (var19 < 0) {
                var8++;
                var16 += var15;
                var19 += var20;
                var20 += var18;
                var15 += var18;
            }
            int var21 = arg1 + var7;
            var16 += -var13;
            int var22 = arg4 + var8;
            var13 -= var11;
            int var23 = arg1 - var7;
            int var24 = arg4 - var8;
            var19 += -var17;
            class55.method380(arg5, 103, class43.field887[var23], var22, var24);
            class55.method380(arg5, 119, class43.field887[var21], var22, var24);
            var17 -= var11;
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(B)V")
    public static void method1114(byte arg0) {
        field3167 = null;
        field3171 = null;
        field3181 = null;
        field3178 = null;
        field3163 = null;
        field3162 = null;
        if (arg0 <= 15) {
            return;
        }
        field3164 = null;
        field3174 = null;
        field3180 = null;
        field3166 = null;
        field3173 = null;
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(II)Lwd;")
    public static final class232 method1115(int arg0, int arg1) {
        int var2 = arg1 >> 16;
        if (arg0 != -22192) {
            return null;
        }
        field3172++;
        int var3 = arg1 & 0xFFFF;
        if (class115.field2067[var2] == null || class115.field2067[var2][var3] == null) {
            boolean var4 = class197.method1234(var2, arg0 + 22319);
            if (!var4) {
                return null;
            }
        }
        return class115.field2067[var2][var3];
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lwa;B)V")
    private final void method1116(class229 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1475(255);
            if (var3 == 0) {
                if (arg1 != -38) {
                    return;
                }
                field3165++;
                return;
            }
            this.method1120(arg0, var3, (byte) -43);
        }
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V")
    public static final void method1117(int arg0) {
        field3176++;
        if (arg0 <= 73) {
            return;
        }
        try {
            if (class218.field3799 == 1) {
                int var1 = class69.field1363.method778((byte) 86);
                if (var1 > 0 && class69.field1363.method808((byte) 118)) {
                    int var2 = var1 - class16.field387;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class69.field1363.method801(var2, true);
                } else {
                    class69.field1363.method779((byte) -124);
                    class69.field1363.method799(-69);
                    if (class68.field1331 == null) {
                        class218.field3799 = 0;
                    } else {
                        class218.field3799 = 2;
                    }
                    class16.field368 = null;
                    client.field700 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class69.field1363.method779((byte) -80);
            class218.field3799 = 0;
            class16.field368 = null;
            class68.field1331 = null;
            client.field700 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(II)I")
    public static final int method1118(int arg0, int arg1) {
        if (arg0 >= -10) {
            field3164 = null;
        }
        field3170++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)Lqg;")
    public static final class175 method1119(int arg0, byte arg1) {
        field3182++;
        class175 var2 = (class175) class13.field291.method1318((byte) -98, (long) arg0);
        if (arg1 != -93) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = client.field702.method1208(arg0, (byte) -105, 5);
            class175 var4 = new class175();
            if (var3 != null) {
                var4.method1116(new class229(var3), (byte) -38);
            }
            class13.field291.method1324(var4, 18373, (long) arg0);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lwa;IB)V")
    private final void method1120(class229 arg0, int arg1, byte arg2) {
        if (arg2 == -43) {
            field3177++;
            if (arg1 == 2) {
                this.field3179 = arg0.method1490((byte) 73);
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(IB)V")
    public static final void method1121(int arg0, byte arg1) {
        field3168++;
        int var2 = 27 / ((arg1 - 36) / 35);
        if (class197.method1234(arg0, 117)) {
            class95.method603(-1, (byte) 18, class115.field2067[arg0]);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZI)Loc;")
    public static final class151 method1122(boolean arg0, int arg1) {
        field3169++;
        if (!arg0) {
            field3175 = -43;
        }
        return arg1 < 999999999 ? class137.method874(arg1, !arg0) : class63.field1226;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class83 {

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "I")
    private int field1166 = -1;

    @OriginalMember(owner = "client!bt", name = "o", descriptor = "Z")
    private boolean field1176 = true;

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "I")
    private int field1171;

    @OriginalMember(owner = "client!bt", name = "w", descriptor = "I")
    private int field1184;

    @OriginalMember(owner = "client!bt", name = "p", descriptor = "I")
    private int field1177;

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "I")
    private int field1170;

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "[Lvr;")
    private class175[] field1167;

    @OriginalMember(owner = "client!bt", name = "k", descriptor = "Lvr;")
    private class175 field1172;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "[Lvr;")
    private class175[] field1162;

    @OriginalMember(owner = "client!bt", name = "q", descriptor = "[I")
    public static int[] field1178 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!bt", name = "n", descriptor = "I")
    public static int field1175 = 1;

    @OriginalMember(owner = "client!bt", name = "m", descriptor = "I")
    public static int field1174 = 0;

    @OriginalMember(owner = "client!bt", name = "u", descriptor = "F")
    public static float field1182 = 0.0F;

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "[I")
    public static int[] field1169 = new int[2048];

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
    private int field1164;

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!bt", name = "l", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!bt", name = "s", descriptor = "I")
    private int field1180;

    @OriginalMember(owner = "client!bt", name = "t", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!bt", name = "v", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "Ldp;")
    private class319 field1165;

    @OriginalMember(owner = "client!bt", name = "r", descriptor = "Lui;")
    public static class451 field1179;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V", line = 10)
    public final void method675(int arg0) {
        int var2 = -48 % ((arg0 + 42) / 47);
        if (this.field1167 != null) {
            for (int var3 = 0; var3 < this.field1167.length; var3++) {
                this.field1167[var3].method1199();
            }
        }
        field1168++;
        this.field1165 = null;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILtq;IIIIIIZI)V", line = 36)
    public final void method676(int arg0, class63 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        int var11 = arg3 + arg5 & 0x3FFF;
        field1163++;
        if (this.field1177 == -1) {
            arg1.method508(arg0, arg4, arg6, arg9, arg2, 0);
        } else {
            class85 var12 = class163.field2268.method1331(9386, this.field1177);
            if (this.field1165 == null && class163.field2268.method1335(this.field1177, (byte) 9)) {
                int[] var13 = var12.field1210 ? class163.field2268.method1332(false, this.field1180, this.field1177, this.field1180, 0.7F, false) : class163.field2268.method1333(74, false, 0.7F, this.field1180, this.field1180, this.field1177);
                this.field1165 = arg1.method536(var13, 0, this.field1180, this.field1180, this.field1180);
            }
            if (!var12.field1210) {
                arg1.method508(arg0, arg4, arg6, arg9, arg2, 0);
            }
            if (this.field1165 != null) {
                int var14 = var12.field1210 ? 0 : 1;
                int var15 = arg7 * arg9 / -4096;
                int var16;
                for (var16 = arg9 * var11 / 4096 + (arg6 - arg9) / 2; var16 > arg9; var16 -= arg9) {
                }
                while (arg9 < var15) {
                    var15 -= arg9;
                }
                while (var16 < 0) {
                    var16 += arg9;
                }
                while (var15 < 0) {
                    var15 += arg9;
                }
                for (int var17 = var16 - arg9; var17 < arg6; var17 += arg9) {
                    for (int var18 = var15 - arg9; var18 < arg9; var18 += arg9) {
                        this.field1165.method792(arg0 + var17, arg4 + var18, arg9, arg9, 0, 0, var14);
                    }
                }
            }
        }
        if (arg8) {
            field1182 = -0.60078114F;
        }
        for (int var19 = this.field1164 - 1; var19 >= 0; var19--) {
            this.field1162[var19].method1197(arg1, arg0, arg4, arg6, arg9, arg7, var11);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILtq;B)Z", line = 118)
    public final boolean method677(int arg0, class63 arg1, byte arg2) {
        field1173++;
        if (this.field1166 != arg0) {
            this.field1166 = arg0;
            int var4 = class158.method1078((byte) -79, arg0);
            if (var4 > arg0) {
                var4 = class183.method1257(23132, arg0);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field1180 != var4) {
                this.field1165 = null;
                this.field1180 = var4;
            }
            if (this.field1167 != null) {
                this.field1164 = 0;
                int[] var5 = new int[this.field1167.length];
                for (int var6 = 0; var6 < this.field1167.length; var6++) {
                    class175 var7 = this.field1167[var6];
                    if (var7.method1206(this.field1170, this.field1184, this.field1171, this.field1166)) {
                        var5[this.field1164] = var7.field2495;
                        this.field1162[this.field1164++] = var7;
                    }
                }
                class29.method251(this.field1164 - 1, this.field1162, var5, false, 0);
            }
            this.field1176 = true;
        }
        if (arg2 != 46) {
            return true;
        }
        boolean var8 = false;
        if (this.field1176) {
            this.field1176 = false;
            for (int var9 = this.field1164 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field1162[var9].method1201(arg1, this.field1172);
                var8 |= var10;
                this.field1176 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(I[Lvr;IIII)V", line = 302)
    public class83(int arg0, class175[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1171 = arg5;
        this.field1184 = arg4;
        this.field1177 = arg0;
        this.field1170 = arg3;
        this.field1167 = arg1;
        if (arg1 == null) {
            this.field1172 = null;
            this.field1162 = null;
        } else {
            this.field1162 = new class175[arg1.length];
            this.field1172 = arg2 < 0 ? null : arg1[arg2];
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V", line = 204)
    public static void method678(int arg0) {
        field1179 = null;
        field1169 = null;
        field1178 = null;
        if (arg0 <= 39) {
            field1175 = -47;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(BLjava/lang/String;)I", line = 221)
    public static final int method679(byte arg0, String arg1) {
        field1181++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + class156.method1065((byte) 46, arg1.charAt(var4)) - var3;
        }
        int var5 = 126 / (-arg0 / 49);
        return var3;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IILnd;)V", line = 257)
    public static final void method680(int arg0, int arg1, class484 arg2) {
        if (class63.field869) {
            arg0 = 0;
            class63.field869 = false;
        }
        field1183++;
        if (class446.field6323 == null || !class446.field6323.method2831(arg1 ^ 0x36EC, arg2)) {
            class446.field6323 = arg2;
            class1.field17 = class435.method2539(-10659);
            class28.field372 = arg0;
            class170.field2420 = arg0;
            if (class170.field2420 == 0) {
                class130.method901((byte) -74);
            } else {
                class8.field139 = class337.field5039;
                class205.field3109 = class72.field971;
                class69.field943 = class92.field1281;
                class250.field3604 = class286.field4371;
                class121.field1672 = class402.field5873;
                class82.field1159 = class58.field809;
                class111.field1570 = class345.field5252;
                class230.field3389 = class244.field3498;
                class92.field1282 = class360.field5460;
                class85.field1199 = class287.field4376;
            }
        }
        if (arg1 != -14061) {
            method678(73);
        }
    }
}

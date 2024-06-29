import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class76 extends class179 {

    @OriginalMember(owner = "client!om", name = "s", descriptor = "I")
    private int field1171 = 0;

    @OriginalMember(owner = "client!om", name = "u", descriptor = "I")
    private int field1173 = 0;

    @OriginalMember(owner = "client!om", name = "t", descriptor = "I")
    private int field1172 = -1;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "Z")
    public boolean field1167 = false;

    @OriginalMember(owner = "client!om", name = "J", descriptor = "I")
    private int field1188 = -32768;

    @OriginalMember(owner = "client!om", name = "w", descriptor = "I")
    public int field1175;

    @OriginalMember(owner = "client!om", name = "v", descriptor = "I")
    public int field1174;

    @OriginalMember(owner = "client!om", name = "z", descriptor = "I")
    private int field1178;

    @OriginalMember(owner = "client!om", name = "L", descriptor = "I")
    public int field1190;

    @OriginalMember(owner = "client!om", name = "y", descriptor = "I")
    public int field1177;

    @OriginalMember(owner = "client!om", name = "I", descriptor = "I")
    public int field1187;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "Lhn;")
    private class38 field1170;

    @OriginalMember(owner = "client!om", name = "H", descriptor = "I")
    public static int field1186 = 0;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1166 = "Loaded title screen";

    @OriginalMember(owner = "client!om", name = "x", descriptor = "Lwn;")
    public static class30 field1176 = new class30();

    @OriginalMember(owner = "client!om", name = "M", descriptor = "Ljava/lang/String;")
    public static String field1191 = "Loading sprites - ";

    @OriginalMember(owner = "client!om", name = "K", descriptor = "Ljava/lang/String;")
    public static String field1189 = "green:";

    @OriginalMember(owner = "client!om", name = "N", descriptor = "[I")
    public static int[] field1192 = new int[32768];

    @OriginalMember(owner = "client!om", name = "p", descriptor = "B")
    public static byte field1168;

    @OriginalMember(owner = "client!om", name = "A", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!om", name = "B", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!om", name = "C", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!om", name = "D", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!om", name = "E", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!om", name = "F", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!om", name = "G", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!om", name = "O", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!om", name = "P", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!om", name = "q", descriptor = "Lrb;")
    private class236 field1169;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIIIIIJILrb;)V", line = 15)
    public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class236 arg10) {
        field1182++;
        class94 var13 = this.method598(false);
        if (var13 != null) {
            var13.method117(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1169);
            this.field1188 = var13.method137();
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "()I", line = 36)
    public final int method137() {
        field1180++;
        return this.field1188;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(IIIIIII)V", line = 308)
    public class76(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1175 = arg6 + arg5;
        this.field1174 = arg3;
        this.field1178 = arg0;
        this.field1190 = arg2;
        this.field1177 = arg4;
        this.field1187 = arg1;
        int var8 = class52.method429(4618, this.field1178).field1135;
        if (var8 == -1) {
            this.field1167 = true;
        } else {
            this.field1167 = false;
            this.field1170 = class63.method503(var8, (byte) 116);
        }
        if (this.field1175 == arg6) {
            class28.method246(false, 255, this.field1171, this.field1190, this.field1170, this.field1174);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)Lie;", line = 57)
    private final class94 method598(boolean arg0) {
        field1179++;
        class74 var2 = class52.method429(4618, this.field1178);
        class94 var3;
        if (this.field1167) {
            var3 = var2.method586(-1, 0, (byte) -109, -1);
        } else {
            var3 = var2.method586(this.field1171, this.field1173, (byte) 110, this.field1172);
        }
        if (var3 == null) {
            return null;
        } else {
            if (arg0) {
                this.method598(false);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "([IIIIII)V", line = 80)
    public static final void method599(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class42 var6 = class34.field521[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class106 var7 = var6.field674;
        if (var7 != null) {
            int var8 = var7.field1746;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class127 var10 = var6.field669;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field2026;
        int var12 = var10.field2037;
        int var13 = var10.field2034;
        int var14 = var10.field2027;
        int[] var15 = class155.field2515[var11];
        int[] var16 = class144.field2341[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZI)V", line = 172)
    public final void method600(boolean arg0, int arg1) {
        if (!arg0) {
            field1192 = (int[]) null;
        }
        field1184++;
        if (this.field1167) {
            return;
        }
        this.field1173 += arg1;
        while (this.field1170.field568[this.field1171] < this.field1173) {
            this.field1173 -= this.field1170.field568[this.field1171];
            this.field1171++;
            if (this.field1170.field584.length <= this.field1171) {
                this.field1167 = true;
                break;
            }
        }
        if (!this.field1167) {
            class28.method246(false, 255, this.field1171, this.field1190, this.field1170, this.field1174);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V", line = 205)
    public static final void method601(int arg0) {
        field1194++;
        if (class55.field837 != null) {
            class55.field837.method2321((byte) -119);
        }
        if (class255.field3765 != null) {
            class255.field3765.method2321((byte) -119);
        }
        class93.method741(2, class60.field881, (byte) 89, 22050);
        if (arg0 > -50) {
            method603(-5);
        }
        class55.field837 = class343.method2383(22050, class92.field1484, 0, 112, class334.field5197);
        class55.field837.method2324((byte) 49, class2.field78);
        class255.field3765 = class343.method2383(2048, class92.field1484, 1, 117, class334.field5197);
        class255.field3765.method2324((byte) -99, class181.field2877);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZILtk;)V", line = 237)
    public static final void method602(boolean arg0, int arg1, class266 arg2) {
        int var3 = arg2.field4019 == arg1 ? arg2.field3941 : arg2.field4019;
        field1181++;
        int var4 = arg2.field4097 == 0 ? arg2.field3939 : arg2.field4097;
        class342.method2373(var3, arg0, class110.field1789[arg2.field4088 >> 16], arg1 - 28434, arg2.field4088, var4);
        if (arg2.field3994 != null) {
            class342.method2373(var3, arg0, arg2.field3994, -28434, arg2.field4088, var4);
        }
        class24 var5 = (class24) class158.field2584.method79((long) arg2.field4088, (byte) 0);
        if (var5 != null) {
            class52.method428(var5.field417, var4, var3, arg0, arg1 ^ 0xFFFFB2CB);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIII)V", line = 269)
    public final void method111(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1183++;
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V", line = 288)
    public static void method603(int arg0) {
        field1189 = null;
        field1192 = null;
        field1176 = null;
        field1166 = null;
        if (arg0 == -1) {
            field1191 = null;
        }
    }
}

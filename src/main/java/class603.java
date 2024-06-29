import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class603 {

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "B")
    public byte field8484;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "B")
    public byte field8488;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "[I")
    public int[] field8486;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "[I")
    public int[] field8478;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "[I")
    public int[] field8476;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "S")
    public short field8477;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "S")
    public short field8489;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "S")
    public short field8483;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "[S")
    public short[] field8480;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "S")
    public short field8487;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "[S")
    public short[] field8475;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "[S")
    public short[] field8481;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "[I")
    public static int[] field8473 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field8474;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field8479;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field8482;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public static int field8485;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lr;I)V", line = 11)
    public static final void method3371(class564 arg0, int arg1) {
        field8482++;
        int var2 = class200.field2357;
        int var3 = class376.field5112;
        int var4 = class598.field8426;
        int var5 = class361.field4841;
        int var6 = -10660793;
        arg0.method3206(var5, (byte) 105, var2, var3, var6, var4);
        arg0.method3206(16, (byte) 74, var2 + 1, var3 - -1, -16777216, var4 - 2);
        arg0.method3201(-16777216, var4 - 2, 6195, var5 - 19, var3 - -18, var2 + 1);
        class282.field3535.method2318(class198.field2309.method1195((byte) 62, class504.field7267), -1, var2 + 3, 0, var6, var3 + 14);
        int var7 = class108.field1166.method253(true);
        int var8 = class108.field1166.method252(7);
        int var9 = 0;
        for (class336 var10 = (class336) class694.field9730.method3434((byte) 2); var10 != null; var10 = (class336) class694.field9730.method3430(true)) {
            int var11 = var3 + ((-var9 + -1 + class661.field9266) * 16) + 31;
            short var12 = -1;
            if (var2 < var7 && var2 + var4 > var7 && var11 - 13 < var8 && var8 < (var11 + 3) && var10.field4233) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class151.method822(var10.field4231, false)) {
                var13 = class19.field153.method272((int) var10.field4226, -11824).field7033;
            } else if (var10.field4229 != -1) {
                var13 = class19.field153.method272(var10.field4229, arg1 ^ 0xFFFFB5E9).field7033;
            } else if (class231.method1388(arg1 ^ 0xFFFF9BBE, var10.field4231)) {
                class214 var16 = (class214) class274.field3433.method3669((long) ((int) var10.field4226), -1);
                if (var16 != null) {
                    class600 var17 = var16.field2601;
                    class210 var18 = var17.field8461;
                    if (var18.field2492 != null) {
                        var18 = var18.method1247((byte) 49, class628.field8859);
                    }
                    if (var18 != null) {
                        var13 = var18.field2504;
                    }
                }
            } else if (class638.method3598(var10.field4231, arg1 - 25657)) {
                Object var14 = null;
                class638 var15;
                if (var10.field4231 == 1011) {
                    var15 = class364.field4891.method2134((int) var10.field4226, true);
                } else {
                    var15 = class364.field4891.method2134((int) (var10.field4226 >>> 32 & 0x7FFFFFFFL), true);
                }
                if (var15.field8974 != null) {
                    var15 = var15.method3597(arg1 - 25658, class628.field8859);
                }
                if (var15 != null) {
                    var13 = var15.field8998;
                }
            }
            String var19 = class203.method1210(var10, 114);
            if (var13 != null) {
                var19 = var19 + class243.method1439(var13, 0);
            }
            class282.field3535.method2311(0, class587.field8315, (byte) 30, class420.field5596, var19, var12, var11, var2 + 3);
            if (var10.field4223) {
                class232.field2863.method3001(var2 + class488.field7097.method2657((byte) 62, var19) + 5, var11 + -12);
            }
            var9++;
        }
        if (arg1 == 25657) {
            class420.method2351(class200.field2357, class376.field5112, true, class361.field4841, class598.field8426);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIII)V", line = 127)
    public static final void method3372(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8485++;
        if (arg2 != 2) {
            method3374(false);
        }
        if (arg1 > arg3) {
            for (int var5 = arg3; var5 < arg1; var5++) {
                class557.field7954[var5][arg0] = arg4;
            }
        } else {
            for (int var6 = arg1; var6 < arg3; var6++) {
                class557.field7954[var6][arg0] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V", line = 162)
    public static final void method3373(int arg0, int arg1) {
        int var2 = 43 % ((-arg0 - 39) / 54);
        field8474++;
        class677.field9496 = arg1;
        class680.field9579.method88(53);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V", line = 173)
    public static void method3374(boolean arg0) {
        if (!arg0) {
            field8473 = null;
        }
        field8473 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZIIII)V", line = 184)
    public static final void method3375(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 > -116) {
            field8473 = null;
        }
        field8479++;
        long var6 = (long) (arg4 | (arg1 ? Integer.MIN_VALUE : 0));
        class628 var8 = (class628) class403.field5395.method3669(var6, -1);
        if (var8 == null) {
            var8 = new class628();
            class403.field5395.method3671(false, var8, var6);
        }
        if (var8.field8858.length <= arg3) {
            int[] var9 = new int[arg3 + 1];
            int[] var10 = new int[arg3 + 1];
            for (int var11 = 0; var11 < var8.field8858.length; var11++) {
                var9[var11] = var8.field8858[var11];
                var10[var11] = var8.field8850[var11];
            }
            for (int var12 = var8.field8858.length; var12 < arg3; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field8858 = var9;
            var8.field8850 = var10;
        }
        var8.field8858[arg3] = arg2;
        var8.field8850[arg3] = arg0;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V", line = 240)
    public class603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.field8484 = (byte) arg1;
        this.field8488 = (byte) arg0;
        this.field8486 = new int[4];
        this.field8478 = new int[4];
        this.field8476 = new int[4];
        this.field8486[2] = arg4;
        this.field8486[3] = arg5;
        this.field8486[0] = arg2;
        this.field8486[1] = arg3;
        this.field8478[3] = arg9;
        this.field8478[2] = arg8;
        this.field8478[0] = arg6;
        this.field8478[1] = arg7;
        this.field8477 = (short) (arg2 >> class559.field7984);
        this.field8476[0] = arg10;
        this.field8476[2] = arg12;
        this.field8476[1] = arg11;
        this.field8476[3] = arg13;
        this.field8489 = (short) (arg4 >> class559.field7984);
        this.field8483 = (short) (arg10 >> class559.field7984);
        this.field8480 = new short[4];
        this.field8487 = (short) (arg12 >> class559.field7984);
        this.field8475 = new short[4];
        this.field8481 = new short[4];
    }
}

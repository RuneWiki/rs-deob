import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class184 extends class102 {

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "I")
    public static int field3212 = 0;

    @OriginalMember(owner = "client!fh", name = "N", descriptor = "Lr;")
    public static class66 field3216 = class93.method641(43, ")4g");

    @OriginalMember(owner = "client!fh", name = "R", descriptor = "I")
    public static int field3220 = 0;

    @OriginalMember(owner = "client!fh", name = "S", descriptor = "[I")
    public static int[] field3221 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!fh", name = "O", descriptor = "I")
    public static int field3217 = -2;

    @OriginalMember(owner = "client!fh", name = "M", descriptor = "I")
    public static int field3215 = 0;

    @OriginalMember(owner = "client!fh", name = "T", descriptor = "J")
    public static long field3222 = 0L;

    @OriginalMember(owner = "client!fh", name = "U", descriptor = "[I")
    public static int[] field3223 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!fh", name = "Y", descriptor = "Lr;")
    public static class66 field3227 = class93.method641(43, "(U");

    @OriginalMember(owner = "client!fh", name = "X", descriptor = "[S")
    public static short[] field3226 = new short[256];

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!fh", name = "P", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!fh", name = "Q", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!fh", name = "W", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!fh", name = "V", descriptor = "Ltg;")
    private class215 field3224;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)V")
    public static void method1223(int arg0) {
        if (arg0 != -23562) {
            method1225(false, 72, 88, 47, (class63) null);
        }
        field3221 = null;
        field3216 = null;
        field3227 = null;
        field3223 = null;
        field3226 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILlh;)V")
    private final void method1224(int arg0, int arg1, class249 arg2) {
        if (arg0 == 249) {
            int var4 = arg2.method1677(-6677);
            if (this.field3224 == null) {
                int var5 = class62.method413(var4, -21189);
                this.field3224 = new class215(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method1677(arg1 ^ 0x1A11) == 1;
                int var8 = arg2.method1648((byte) -69);
                class80 var9;
                if (var7) {
                    var9 = new class134(arg2.method1637(127));
                } else {
                    var9 = new class49(arg2.method1652(-5528));
                }
                this.field3224.method1380((byte) 127, var9, (long) var8);
            }
        }
        if (arg1 != -6) {
            this.method1227(34, -83, -92);
        }
        field3219++;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZIIILha;)V")
    public static final void method1225(boolean arg0, int arg1, int arg2, int arg3, class63 arg4) {
        if (arg1 <= 9) {
            field3221 = null;
        }
        field3214++;
        int var5 = arg4.field1215;
        int var6 = arg4.field1196;
        if (arg4.field1102 == 0) {
            arg4.field1215 = arg4.field1096;
        } else if (arg4.field1102 == 1) {
            arg4.field1215 = arg3 - arg4.field1096;
        } else if (arg4.field1102 == 2) {
            arg4.field1215 = arg4.field1096 * arg3 >> 14;
        } else if (arg4.field1102 == 3) {
            if (arg4.field1219 == 2) {
                arg4.field1215 = (arg4.field1096 - 1) * arg4.field1208 + arg4.field1096 * 32;
            } else if (arg4.field1219 == 7) {
                arg4.field1215 = (arg4.field1096 - 1) * arg4.field1208 + arg4.field1096 * 115;
            }
        }
        if (arg4.field1134 == 0) {
            arg4.field1196 = arg4.field1222;
        } else if (arg4.field1134 == 1) {
            arg4.field1196 = arg2 - arg4.field1222;
        } else if (arg4.field1134 == 2) {
            arg4.field1196 = arg4.field1222 * arg2 >> 14;
        } else if (arg4.field1134 == 3) {
            if (arg4.field1219 == 2) {
                arg4.field1196 = (arg4.field1222 - 1) * arg4.field1169 + arg4.field1222 * 32;
            } else if (arg4.field1219 == 7) {
                arg4.field1196 = (arg4.field1222 - 1) * arg4.field1169 + arg4.field1222 * 12;
            }
        }
        if (arg4.field1102 == 4) {
            arg4.field1215 = arg4.field1196 * arg4.field1172 / arg4.field1091;
        }
        if (arg4.field1134 == 4) {
            arg4.field1196 = arg4.field1215 * arg4.field1091 / arg4.field1172;
        }
        if (class102.field1999 && (client.method592(arg4) != 0 || arg4.field1219 == 0)) {
            if (arg4.field1196 < 5 && arg4.field1215 < 5) {
                arg4.field1215 = 5;
                arg4.field1196 = 5;
            } else {
                if (arg4.field1215 <= 0) {
                    arg4.field1215 = 5;
                }
                if (arg4.field1196 <= 0) {
                    arg4.field1196 = 5;
                }
            }
        }
        if (arg4.field1131 == 1337) {
            class154.field2751 = arg4;
        }
        if (arg0 && arg4.field1125 != null && arg4.field1215 != var5 || arg4.field1196 != var6) {
            class237 var7 = new class237();
            var7.field4118 = arg4.field1125;
            var7.field4120 = arg4;
            class111.field2145.method866(var7, true);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILr;I)Lr;")
    public final class66 method1226(int arg0, class66 arg1, int arg2) {
        field3218++;
        if (this.field3224 == null) {
            return arg1;
        }
        class134 var4 = (class134) this.field3224.method1381((long) arg2, 73);
        if (arg0 == -1) {
            return var4 == null ? arg1 : var4.field2491;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)I")
    public final int method1227(int arg0, int arg1, int arg2) {
        field3225++;
        if (this.field3224 == null) {
            return arg0;
        } else if (arg1 == 9081) {
            class49 var4 = (class49) this.field3224.method1381((long) arg2, 74);
            return var4 == null ? arg0 : var4.field873;
        } else {
            return -34;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Llh;B)V")
    public final void method1228(class249 arg0, byte arg1) {
        if (arg1 > -91) {
            this.method1224(93, -71, (class249) null);
        }
        while (true) {
            int var3 = arg0.method1677(-6677);
            if (var3 == 0) {
                field3213++;
                return;
            }
            this.method1224(var3, -6, arg0);
        }
    }
}

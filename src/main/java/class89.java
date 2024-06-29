import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class89 implements class268 {

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "Lii;")
    private class227 field1106 = new class227(256);

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "Llc;")
    private class175 field1110;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Llc;")
    private class175 field1104;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "[Lua;")
    private class97[] field1107;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "Ldh;")
    public static class179 field1108 = new class179(64);

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field1113 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "Z")
    public static boolean field1119 = false;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "[I")
    public static int[] field1121 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "Lcc;")
    public static class263 field1114;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "Lbh;")
    public static class288 field1120;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "Lqd;")
    public static class50 field1115;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(BI)Lua;", line = 5)
    public final class97 method519(byte arg0, int arg1) {
        field1116++;
        int var3 = 91 / ((arg0 + 72) / 35);
        return this.field1107[arg1];
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIFZI)[I", line = 15)
    public final int[] method520(int arg0, int arg1, int arg2, float arg3, boolean arg4, int arg5) {
        field1117++;
        if (arg0 != 0) {
            field1114 = (class263) null;
        }
        return this.method378(arg5, false).method1361((byte) -113, this, this.field1107[arg5].field1266, arg1, this.field1104, arg4, (double) arg3, arg2);
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(IB)Z", line = 35)
    public final boolean method521(int arg0, byte arg1) {
        field1112++;
        if (arg1 != 110) {
            field1114 = (class263) null;
        }
        class198 var3 = this.method378(arg0, false);
        return var3 != null && var3.method1366(this, arg1 ^ 0x6F, this.field1104);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 53)
    public static void method522(int arg0) {
        if (arg0 != 2047) {
            return;
        }
        field1108 = null;
        field1120 = null;
        field1114 = null;
        field1121 = null;
        field1115 = null;
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Llc;Llc;Llc;)V", line = 179)
    public class89(class175 arg0, class175 arg1, class175 arg2) {
        this.field1110 = arg1;
        this.field1104 = arg2;
        class107 var4 = new class107(arg0.method1199(28815, 0, 0));
        int var5 = var4.method624(14612);
        this.field1107 = new class97[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method661(-1) == 1) {
                this.field1107[var6] = new class97();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field1107[var7] != null) {
                this.field1107[var7].field1257 = var4.method661(-1) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field1107[var8] != null) {
                this.field1107[var8].field1271 = var4.method661(-1) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field1107[var9] != null) {
                this.field1107[var9].field1261 = var4.method661(-1) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field1107[var10] != null) {
                this.field1107[var10].field1268 = var4.method661(-1) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field1107[var11] != null) {
                this.field1107[var11].field1275 = var4.method679(-3);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field1107[var12] != null) {
                this.field1107[var12].field1256 = var4.method679(-3);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field1107[var13] != null) {
                this.field1107[var13].field1264 = var4.method679(-3);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field1107[var14] != null) {
                this.field1107[var14].field1258 = var4.method679(-3);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field1107[var15] != null) {
                this.field1107[var15].field1272 = (short) var4.method624(14612);
            }
        }
        if (var4.field1400 < var4.field1388.length) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field1107[var16] != null) {
                    var4.method679(-3);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field1107[var17] != null) {
                    var4.method679(-3);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field1107[var18] != null) {
                    var4.method661(-1);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field1107[var19] != null) {
                    this.field1107[var19].field1266 = var4.method661(-1) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field1107[var20] != null) {
                    var4.method679(-3);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field1107[var21] != null) {
                    var4.method661(-1);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field1107[var22] != null) {
                    var4.method661(-1);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field1107[var23] != null) {
                    var4.method661(-1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 73)
    public static final void method523(Component arg0, int arg1) {
        if (arg1 > -32) {
            method523((Component) null, -68);
        }
        arg0.removeMouseListener(class184.field2662);
        field1109++;
        arg0.removeMouseMotionListener(class184.field2662);
        arg0.removeFocusListener(class184.field2662);
        class94.field1229 = 0;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIII)V", line = 89)
    public static final void method524(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg4 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        field1111++;
        int var9 = (class249.field3778 - class154.field2152) * var8 / 100 + class154.field2152;
        int var10 = arg2 * var9 >> 8;
        int var11 = 2048 - arg7 & 0x7FF;
        int var12 = 2048 - arg3 & 0x7FF;
        int var13 = 0;
        int var14 = var10;
        if (var11 != 0) {
            int var15 = class215.field3024[var11];
            int var16 = class215.field3017[var11];
            var13 = -var10 * var15 >> 16;
            var14 = var10 * var16 >> 16;
        }
        int var17 = 0;
        if (var12 != 0) {
            int var18 = class215.field3024[var12];
            int var19 = class215.field3017[var12];
            var17 = var14 * var18 >> 16;
            var14 = var14 * var19 >> 16;
        }
        class301.field4704 = arg0 - var13;
        if (arg5 == 17699) {
            class30.field380 = arg7;
            class109.field1506 = arg6 - var14;
            class130.field1792 = arg1 - var17;
            class323.field4975 = arg3;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)Lqe;", line = 150)
    public class198 method378(int arg0, boolean arg1) {
        field1103++;
        class104 var3 = this.field1106.method1562(0, (long) arg0);
        if (var3 != null) {
            return (class198) var3;
        }
        byte[] var4 = this.field1110.method1195(1, arg0);
        if (var4 == null) {
            return null;
        }
        class198 var5 = new class198(new class107(var4));
        if (arg1) {
            return (class198) null;
        } else {
            this.field1106.method1565((long) arg0, var5, (byte) -112);
            return var5;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZB)V", line = 387)
    public static final void method525(boolean arg0, byte arg1) {
        field1118++;
        if (class15.field215 == null) {
            class15.field215 = new byte[4][104][104];
        }
        if (arg0) {
            field1120 = (class288) null;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class15.field215[var2][var3][var4] = arg1;
                }
            }
        }
    }
}

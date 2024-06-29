import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class79 {

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "Lhf;")
    public static class195 field1255 = new class195(64);

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    public static int field1266 = 1;

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "[Z")
    public static boolean[] field1271 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "Lok;")
    public static class146 field1265 = class235.method1724(-12908, ":duelfriend:");

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "[Z")
    public static boolean[] field1270 = new boolean[100];

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "Lok;")
    public static class146 field1272 = class235.method1724(-12908, "Votre liste noire est pleine (X100 noms maximum(Y)3");

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public int field1260;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public int field1261;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public int field1262;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "Loh;")
    public static class15 field1273;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "Lbn;")
    public static class62 field1268;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lr;I)Z", line = 4)
    public static final boolean method565(class264 arg0, int arg1) {
        field1257++;
        if (arg0.field4443 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg0.field4443.length; var2++) {
            int var3 = class110.method746(var2, (byte) 124, arg0);
            int var4 = arg0.field4486[var2];
            if (arg0.field4443[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg0.field4443[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg0.field4443[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        if (arg1 != -12433) {
            method567(98, -123, -55, 39);
        }
        return true;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILwe;)V", line = 64)
    public final void method566(int arg0, class47 arg1) {
        while (true) {
            int var3 = arg1.method368(55);
            if (var3 == 0) {
                field1263++;
                int var4 = -68 / ((arg0 + 9) / 59);
                return;
            }
            this.method569(var3, false, arg1);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIII)I", line = 99)
    public static final int method567(int arg0, int arg1, int arg2, int arg3) {
        field1256++;
        if ((class46.field775[arg3][arg0][arg1] & 0x8) == 0) {
            if (arg2 != 2) {
                field1255 = (class195) null;
            }
            return arg3 <= 0 || (class46.field775[1][arg0][arg1] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V", line = 130)
    public static void method568(boolean arg0) {
        field1273 = null;
        field1271 = null;
        field1268 = null;
        field1255 = null;
        field1265 = null;
        if (!arg0) {
            field1272 = null;
            field1270 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZLwe;)V", line = 150)
    private final void method569(int arg0, boolean arg1, class47 arg2) {
        if (arg1) {
            field1273 = (class15) null;
        }
        if (arg0 == 1) {
            this.field1260 = arg2.method379(-2);
            this.field1261 = arg2.method368(67);
            this.field1262 = arg2.method368(27);
        }
        field1258++;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIZIILr;)V", line = 174)
    public static final void method570(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class264 arg6) {
        field1264++;
        if (arg3) {
            method568(true);
        }
        int var7 = arg0 * arg0 + arg1 * arg1;
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg6.field4393 / 2, arg6.field4381 / 2);
        if (var8 * var8 >= var7) {
            class190.method1468(arg2, arg1, arg6, arg4, arg0, 0, class46.field794[arg5]);
            return;
        }
        int var9 = class87.field1378 + class158.field2668 & 0x7FF;
        var8 -= 10;
        int var10 = class109.field1750[var9];
        int var11 = var10 * 256 / (class238.field3976 + 256);
        int var12 = class109.field1757[var9];
        int var13 = var12 * 256 / (class238.field3976 + 256);
        int var14 = arg1 * var13 - arg0 * var11 >> 16;
        int var15 = arg0 * var13 + arg1 * var11 >> 16;
        double var16 = Math.atan2((double) var15, (double) var14);
        int var18 = (int) (Math.sin(var16) * (double) var8);
        int var19 = (int) (Math.cos(var16) * (double) var8);
        if (class271.field4640) {
            ((class8) class195.field3250[arg5]).method55(240, 240, (arg6.field4393 / 2 + arg4 + var18) * 16, (arg6.field4381 / 2 + arg2 - var19) * 16, (int) (var16 * 10430.378D), 4096);
        } else {
            ((class307) class195.field3250[arg5]).method1706(arg6.field4393 / 2 + var18 + arg4 - 10, arg6.field4381 / 2 + -var19 + arg2 + -10, 20, 20, 15, 15, var16, 256);
        }
    }
}

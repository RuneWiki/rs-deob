import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class207 {

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Ljd;")
    private static class85 field3616 = class221.method1499("Please remove ", (byte) -72);

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Ljd;")
    public static class85 field3612 = class221.method1499("name_icons", (byte) 104);

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "Ljd;")
    public static class85 field3622 = field3616;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field3613 = 0;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Ljd;")
    public static class85 field3614 = class221.method1499(")1p", (byte) -108);

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "Ljd;")
    public static class85 field3623 = field3616;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "Ltd;")
    public static class70 field3618 = new class70(5000);

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "Ljava/awt/Frame;")
    public static Frame field3620;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I[Lkc;IBIIZ[B)V")
    public static final void method1414(int arg0, class264[] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6, byte[] arg7) {
        field3615++;
        if (!arg6) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if ((arg5 + var9) > 0 && (arg5 + var9) < 103 && arg2 + var10 > 0 && (arg2 + var10) < 103) {
                            arg1[var8].field4719[arg5 + var9][arg2 + var10] = class135.method899(arg1[var8].field4719[arg5 + var9][arg2 + var10], -16777217);
                        }
                    }
                }
            }
        }
        if (arg3 <= 99) {
            field3614 = null;
        }
        byte var11;
        if (arg6) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        class247 var12 = new class247(arg7);
        for (int var13 = 0; var13 < var11; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class144.method941(arg4, arg0, var12, 0, arg6, var14 + arg5, arg2 + var15, var13, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILdb;)I")
    public static final int method1415(int arg0, class17 arg1) {
        field3624++;
        class263 var2 = arg1.field247;
        if (var2.field4695 != null) {
            var2 = var2.method1794((byte) 104);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field4690;
        if (arg1.field1057 == arg1.field1014) {
            var3 = var2.field4656;
        } else if (arg1.field1057 == arg1.field1054) {
            var3 = var2.field4664;
        }
        if (arg0 != -1) {
            field3620 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)V")
    public static final void method1416(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3621++;
        int var5 = 0;
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = class144.method945(arg0 + arg4, class217.field3802, (byte) -116, class83.field1513);
        int var9 = -1;
        int var10 = class144.method945(arg4 - arg0, class217.field3802, (byte) -116, class83.field1513);
        class183.method1260(arg3, var10, -114, class146.field2488[arg1], var8);
        while (var6 > var5) {
            var9 += 2;
            var7 += var9;
            if (var7 > 0) {
                var6--;
                int var11 = arg1 - var6;
                var7 -= var6 << 1;
                int var12 = arg1 + var6;
                if (class34.field522 <= var12 && var11 <= class1.field6) {
                    int var13 = class144.method945(arg4 + var5, class217.field3802, (byte) -116, class83.field1513);
                    int var14 = class144.method945(arg4 - var5, class217.field3802, (byte) -116, class83.field1513);
                    if (var12 <= class1.field6) {
                        class183.method1260(arg3, var14, 5, class146.field2488[var12], var13);
                    }
                    if (class34.field522 <= var11) {
                        class183.method1260(arg3, var14, arg2 ^ 0xFFFFDFC1, class146.field2488[var11], var13);
                    }
                }
            }
            var5++;
            int var15 = arg1 - var5;
            int var16 = arg1 + var5;
            if (class34.field522 <= var16 && var15 <= class1.field6) {
                int var17 = class144.method945(arg4 + var6, class217.field3802, (byte) -116, class83.field1513);
                int var18 = class144.method945(arg4 - var6, class217.field3802, (byte) -116, class83.field1513);
                if (var16 <= class1.field6) {
                    class183.method1260(arg3, var18, -122, class146.field2488[var16], var17);
                }
                if (class34.field522 <= var15) {
                    class183.method1260(arg3, var18, arg2 + 8278, class146.field2488[var15], var17);
                }
            }
        }
        if (arg2 != -8259) {
            method1415(38, (class17) null);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)I")
    public static final int method1417(int arg0, boolean arg1) {
        field3625++;
        if (arg1) {
            field3614 = null;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZIJI)Ljd;")
    public static final class85 method1418(int arg0, boolean arg1, int arg2, long arg3, int arg4) {
        field3617++;
        class85 var6 = class58.method392(0, (byte) -30);
        if (arg3 < 0L) {
            arg3 = -arg3;
            var6.method638(class114.field2045, 0);
        }
        class85 var7 = class130.field2276;
        class85 var8 = class34.field531;
        if (arg0 == 1) {
            var7 = class34.field531;
            var8 = class130.field2276;
        }
        if (arg0 == 2) {
            var8 = class269.field4779;
            var7 = class34.field531;
        }
        class85 var9 = class58.method392(0, (byte) 95);
        class85 var10 = class58.method392(0, (byte) -22);
        for (int var11 = 0; var11 < arg4; var11++) {
            var10.method638(class68.method451((int) (arg3 % 10L), -12572), 0);
            arg3 /= 10L;
        }
        if (arg2 != -14502) {
            return null;
        }
        int var12 = 0;
        if (arg3 == 0L) {
            var9 = class235.field4070;
        }
        while (arg3 > 0L) {
            if (arg1 && var12 != 0 && var12 % 3 == 0) {
                var9.method638(var8, 0);
            }
            var9.method638(class68.method451((int) (arg3 % 10L), -12572), arg2 ^ 0xFFFFC75A);
            var12++;
            arg3 /= 10L;
        }
        if (var10.method586(true) > 0) {
            var10.method638(var7, 0);
        }
        return class172.method1150(new class85[] { var6, var9.method637(0), var10.method637(arg2 ^ 0xFFFFC75A) }, 0);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V")
    public static void method1419(boolean arg0) {
        field3622 = null;
        field3612 = null;
        field3618 = null;
        field3616 = null;
        field3620 = null;
        field3623 = null;
        if (!arg0) {
            method1417(96, false);
        }
        field3614 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lge;IILge;B)Lmf;")
    public static final class10 method1420(class68 arg0, int arg1, int arg2, class68 arg3, byte arg4) {
        int var5 = 102 / ((-arg4 - 16) / 60);
        field3619++;
        return class253.method1750(arg1, arg0, (byte) 123, arg2) ? class160.method1048(arg3.method464(-1, arg2, arg1), false) : null;
    }
}

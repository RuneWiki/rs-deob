import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class76 extends class107 {

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "Ldf;")
    public static class51 field1220 = class46.method233("Ablegen", 100);

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "[[I")
    public static int[][] field1219 = new int[104][104];

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "[I")
    public static int[] field1217 = new int[5];

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "[I")
    public static int[] field1218 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!oi", name = "H", descriptor = "Ldf;")
    public static class51 field1229 = class46.method233("Verbindung abgebrochen)3", 100);

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!oi", name = "A", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!oi", name = "B", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!oi", name = "C", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!oi", name = "D", descriptor = "I")
    public int field1225;

    @OriginalMember(owner = "client!oi", name = "E", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!oi", name = "F", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!oi", name = "G", descriptor = "I")
    public int field1228;

    @OriginalMember(owner = "client!oi", name = "I", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!oi", name = "J", descriptor = "I")
    public int field1231;

    @OriginalMember(owner = "client!oi", name = "K", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)I")
    public static final int method543(int arg0) {
        field1223++;
        if (arg0 >= -42) {
            field1218 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V")
    public static void method544(boolean arg0) {
        if (!arg0) {
            method547(106, (class51) null, false);
        }
        field1218 = null;
        field1229 = null;
        field1220 = null;
        field1217 = null;
        field1219 = null;
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)V")
    public static final void method545(int arg0) {
        class36 var1 = (class36) class66.field1085.method1720(true);
        if (arg0 != 0) {
            field1218 = null;
        }
        field1226++;
        while (var1 != null) {
            if (var1.field557 > 0) {
                var1.field557--;
            }
            if (var1.field557 != 0) {
                if (var1.field549 > 0) {
                    var1.field549--;
                }
                if (var1.field549 == 0 && var1.field543 >= 1 && var1.field552 >= 1 && var1.field543 <= 102 && var1.field552 <= 102 && (var1.field547 < 0 || class22.method119(var1.field558, var1.field547, -31512))) {
                    class184.method1307(var1.field544, var1.field551, var1.field552, var1.field548, (byte) 93, var1.field547, var1.field558, var1.field543);
                    var1.field549 = -1;
                    if (var1.field553 == var1.field547 && var1.field553 == -1) {
                        var1.method764((byte) -24);
                    } else if (var1.field553 == var1.field547 && var1.field544 == var1.field541 && var1.field558 == var1.field540) {
                        var1.method764((byte) -70);
                    }
                }
            } else if (var1.field553 < 0 || class22.method119(var1.field540, var1.field553, -31512)) {
                class184.method1307(var1.field541, var1.field551, var1.field552, var1.field548, (byte) 93, var1.field553, var1.field540, var1.field543);
                var1.method764((byte) -39);
            }
            var1 = (class36) class66.field1085.method1712((byte) 112);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lfi;I)I")
    public static final int method546(class103 arg0, int arg1) {
        int var2 = 92 % ((arg1 - 4) / 42);
        int var3 = arg0.field1720;
        field1227++;
        if (arg0.field4314 == arg0.field4304) {
            var3 = arg0.field1707;
        } else if (arg0.field4354 == arg0.field4314) {
            var3 = arg0.field1693;
        }
        return var3;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILdf;Z)V")
    public static final void method547(int arg0, class51 arg1, boolean arg2) {
        if (arg2) {
            try {
                class255.field4451.getAppletContext().showDocument(arg1.method281(class255.field4451.getCodeBase(), (byte) -123), "_blank");
            } catch (Exception var3) {
            }
        } else {
            try {
                class255.field4451.getAppletContext().showDocument(arg1.method281(class255.field4451.getCodeBase(), (byte) -121), "_top");
            } catch (Exception var4) {
            }
        }
        field1224++;
        if (arg0 != 64) {
            field1218 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I[BI[Lkf;BZII)V")
    public static final void method548(int arg0, byte[] arg1, int arg2, class170[] arg3, byte arg4, boolean arg5, int arg6, int arg7) {
        byte var8;
        if (arg5) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg5) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if ((arg6 + var10) > 0 && (arg6 + var10) < 103 && (arg0 + var11) > 0 && arg0 + var11 < 103) {
                            arg3[var9].field2787[arg6 + var10][arg0 + var11] = class191.method1366(arg3[var9].field2787[arg6 + var10][arg0 + var11], -16777217);
                        }
                    }
                }
            }
        }
        if (arg4 != 10) {
            return;
        }
        field1221++;
        class121 var12 = new class121(arg1);
        for (int var13 = 0; var13 < var8; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class161.method1142(arg0 + var15, arg5, (byte) 117, arg2, var14 + arg6, var12, 0, var13, arg7);
                }
            }
        }
    }
}

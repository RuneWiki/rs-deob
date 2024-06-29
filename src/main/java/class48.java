import java.awt.event.ActionEvent;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class48 extends class53 {

    @OriginalMember(owner = "client!gf", name = "tb", descriptor = "Lhe;")
    public static class54 field1151 = class6.method58("Art", false);

    @OriginalMember(owner = "client!gf", name = "qb", descriptor = "[Ld;")
    public static class22[] field1148 = new class22[2048];

    @OriginalMember(owner = "client!gf", name = "yb", descriptor = "I")
    public static int field1156 = 0;

    @OriginalMember(owner = "client!gf", name = "rb", descriptor = "Lhe;")
    private static class54 field1149 = class6.method58("World", false);

    @OriginalMember(owner = "client!gf", name = "Ab", descriptor = "Lhe;")
    public static class54 field1158 = class6.method58("::qa_op_test", false);

    @OriginalMember(owner = "client!gf", name = "Cb", descriptor = "Lhe;")
    public static class54 field1160 = class6.method58("Begeben Sie sich in ein freies Gebiet)1 um", false);

    @OriginalMember(owner = "client!gf", name = "ub", descriptor = "Lhe;")
    public static class54 field1152 = field1149;

    @OriginalMember(owner = "client!gf", name = "pb", descriptor = "I")
    public static int field1147 = 0;

    @OriginalMember(owner = "client!gf", name = "Gb", descriptor = "Lhe;")
    private static class54 field1164 = class6.method58("To create a new account you need to", false);

    @OriginalMember(owner = "client!gf", name = "Ib", descriptor = "Lhe;")
    public static class54 field1166 = field1149;

    @OriginalMember(owner = "client!gf", name = "Bb", descriptor = "Lhe;")
    public static class54 field1159 = field1164;

    @OriginalMember(owner = "client!gf", name = "Fb", descriptor = "Lhe;")
    public static class54 field1163 = class6.method58("Texturen geladen)3", false);

    @OriginalMember(owner = "client!gf", name = "sb", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!gf", name = "vb", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!gf", name = "wb", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!gf", name = "xb", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!gf", name = "zb", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!gf", name = "Eb", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!gf", name = "Kb", descriptor = "I")
    public int field1168;

    @OriginalMember(owner = "client!gf", name = "Lb", descriptor = "I")
    public int field1169;

    @OriginalMember(owner = "client!gf", name = "Mb", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!gf", name = "Db", descriptor = "Lef;")
    public static class35 field1161;

    @OriginalMember(owner = "client!gf", name = "Jb", descriptor = "[Lnc;")
    public static class93[] field1167;

    @OriginalMember(owner = "client!gf", name = "Hb", descriptor = "[[I")
    public static int[][] field1165;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "(I)V")
    public static void method343(int arg0) {
        field1165 = null;
        field1149 = null;
        field1158 = null;
        field1152 = null;
        field1159 = null;
        field1161 = null;
        field1164 = null;
        field1160 = null;
        field1148 = null;
        if (arg0 != -2) {
            method347((byte) 93, null, null);
        }
        field1167 = null;
        field1163 = null;
        field1166 = null;
        field1151 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZIIIBI)Lqb;")
    public static final class113 method344(boolean arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        long var6 = ((long) arg5 << 40) + ((long) arg2 << 16) + ((long) arg3 << 38) + (long) arg1;
        field1170++;
        if (!arg0) {
            class113 var8 = (class113) class15.field457.method991(var6, true);
            if (var8 != null) {
                return var8;
            }
        }
        class67 var9 = class141.method1088(arg1, (byte) -115);
        if (arg2 > 1 && var9.field1622 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg2 >= var9.field1658[var11] && var9.field1658[var11] != 0) {
                    var10 = var9.field1622[var11];
                }
            }
            if (var10 != -1) {
                var9 = class141.method1088(var10, (byte) -119);
            }
        }
        class98 var12 = var9.method519(arg4 + 86, 1);
        if (var12 == null) {
            return null;
        }
        class113 var13 = null;
        if (var9.field1647 != -1) {
            var13 = method344(true, var9.field1638, 10, 1, (byte) -97, 0);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class90.field2206;
        int var15 = class90.field2205;
        int var16 = class90.field2209;
        int[] var17 = new int[4];
        class90.method717(var17);
        class113 var18 = new class113(36, 32);
        class90.method715(var18.field2699, 36, 32);
        class90.method718();
        class152.method1152();
        class152.method1155(16, 16);
        class152.field3429 = false;
        int var19 = var9.field1644;
        if (arg0) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg3 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class152.field3416[var9.field1664] * var19 >> 16;
        int var21 = class152.field3420[var9.field1664] * var19 >> 16;
        var12.method777();
        var12.method768(0, var9.field1656, var9.field1637, var9.field1664, var9.field1626, var12.field1279 / 2 + var20 + var9.field1671, var9.field1671 + var21);
        if (arg3 >= 1) {
            var18.method870(1);
        }
        if (arg3 >= 2) {
            var18.method870(16777215);
        }
        if (arg5 != 0) {
            var18.method853(arg5);
        }
        class90.method715(var18.field2699, 36, 32);
        if (var9.field1647 != -1) {
            var13.method865(0, 0);
        }
        if (!arg0 && (var9.field1673 == 1 || arg2 != 1) && arg2 != -1) {
            class3.field50.method1189(class62.method491(arg2, -1), 0, 9, 16776960, 1);
        }
        if (arg4 != -97) {
            method347((byte) 64, null, null);
        }
        if (!arg0) {
            class15.field457.method990(true, var6, var18);
        }
        class90.method715(var14, var15, var16);
        class90.method712(var17);
        class152.method1152();
        class152.field3429 = true;
        return var18;
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(Z)Loa;")
    public final class98 method184(boolean arg0) {
        field1155++;
        if (arg0) {
            field1167 = null;
        }
        return class141.method1088(this.field1169, (byte) -117).method519(-11, this.field1168);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;)V")
    public static final void method345(Throwable arg0, int arg1, String arg2) {
        field1153++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class87.method696((byte) -24, arg0);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class150.field3402.field3349 != null) {
                if (arg1 >= -42) {
                    method345(null, 50, null);
                }
                class46 var8 = class150.field3402.method1122(-128, new URL(class150.field3402.field3349.getCodeBase(), "clienterror.ws?c=" + class44.field1130 + "&u=" + class50.field1208 + "&v1=" + class148.field3334 + "&v2=" + class148.field3343 + "&e=" + var7));
                while (var8.field1145 == 0) {
                    class50.method360(1L, 10);
                }
                if (var8.field1145 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field1143;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lcf;")
    public static final class21 method346(Throwable arg0, String arg1) {
        class21 var2;
        if (arg0 instanceof class21) {
            var2 = (class21) arg0;
            var2.field583 = var2.field583 + ' ' + arg1;
        } else {
            var2 = new class21(arg0, arg1);
        }
        field1150++;
        return var2;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLjava/lang/Object;Lvb;)V")
    public static final void method347(byte arg0, Object arg1, class148 arg2) {
        field1162++;
        if (arg2.field3338 == null || arg0 > -28) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field3338.peekEvent() != null; var3++) {
            class50.method360(1L, 10);
        }
        if (arg1 != null) {
            arg2.field3338.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}

import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class74 extends class7 {

    @OriginalMember(owner = "client!gh", name = "K", descriptor = "Lbg;")
    public class19 field1240 = new class19();

    @OriginalMember(owner = "client!gh", name = "L", descriptor = "Lsg;")
    public class201 field1241 = new class201();

    @OriginalMember(owner = "client!gh", name = "z", descriptor = "Lca;")
    private class24 field1229;

    @OriginalMember(owner = "client!gh", name = "C", descriptor = "I")
    public static int field1232 = 0;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "Lmb;")
    public static class132 field1223 = class166.method1092("Hidden)2", 125);

    @OriginalMember(owner = "client!gh", name = "B", descriptor = "Lmb;")
    public static class132 field1231 = class166.method1092("", 111);

    @OriginalMember(owner = "client!gh", name = "I", descriptor = "I")
    public static int field1238 = 0;

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "Lii;")
    public static class96 field1227 = null;

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "Lmb;")
    public static class132 field1239 = class166.method1092("Clientscript error )2 check log for details", 126);

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!gh", name = "v", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!gh", name = "A", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!gh", name = "D", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!gh", name = "E", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!gh", name = "F", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!gh", name = "G", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!gh", name = "H", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!gh", name = "M", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "[[[B")
    public static byte[][][] field1222;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lib;IB)V")
    private final void method444(class90 arg0, int arg1, byte arg2) {
        if ((this.field1229.field384[arg0.field1582] & 0x4) != 0 && arg0.field1584 < 0) {
            int var4 = this.field1229.field341[arg0.field1582] / class96.field1728;
            int var5 = (var4 + 1048575 - arg0.field1581) / var4;
            arg0.field1581 = arg1 * var4 + arg0.field1581 & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field1229.field350[arg0.field1582] == 0) {
                    arg0.field1596 = class223.method1417(arg0.field1577, arg0.field1596.method1407(), arg0.field1596.method1402(), arg0.field1596.method1425());
                } else {
                    arg0.field1596 = class223.method1417(arg0.field1577, arg0.field1596.method1407(), 0, arg0.field1596.method1425());
                    this.field1229.method183(arg0.field1597.field2681[arg0.field1587] < 0, (byte) 27, arg0);
                }
                if (arg0.field1597.field2681[arg0.field1587] < 0) {
                    arg0.field1596.method1430(-1);
                }
                arg1 = arg0.field1581 / var4;
            }
        }
        field1225++;
        arg0.field1596.method27(arg1);
        int var6 = -84 % ((arg2 + 3) / 51);
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V")
    public final void method27(int arg0) {
        this.field1241.method27(arg0);
        field1233++;
        for (class90 var2 = (class90) this.field1240.method119(true); var2 != null; var2 = (class90) this.field1240.method125((byte) -16)) {
            if (!this.field1229.method165(var2, -93)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1586) {
                        this.method444(var2, var3, (byte) -80);
                        var2.field1586 -= var3;
                        break;
                    }
                    this.method444(var2, var2.field1586, (byte) 97);
                    var3 -= var2.field1586;
                } while (!this.field1229.method166(23, var3, 0, var2, null));
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "()Laf;")
    public final class7 method24() {
        field1236++;
        class90 var1;
        do {
            var1 = (class90) this.field1240.method125((byte) -57);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1596 == null);
        return var1.field1596;
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "()I")
    public final int method26() {
        field1234++;
        return 0;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method445(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1224++;
        if (arg0 - arg5 >= class135.field2542 && class168.field3083 >= arg0 + arg5 && class169.field3161 <= arg1 - arg5 && class17.field254 >= arg1 + arg5) {
            class140.method943((byte) -109, arg3, arg5, arg1, arg0, arg2, arg4);
        } else {
            class96.method604(arg3, arg1, arg5, arg4, arg2, arg0, (byte) 122);
        }
        if (arg6 != 0) {
            method447(84L, false);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lib;[IIIBI)V")
    private final void method446(class90 arg0, int[] arg1, int arg2, int arg3, byte arg4, int arg5) {
        field1226++;
        if (arg4 > -58) {
            return;
        }
        if ((this.field1229.field384[arg0.field1582] & 0x4) != 0 && arg0.field1584 < 0) {
            int var7 = this.field1229.field341[arg0.field1582] / class96.field1728;
            while (true) {
                int var8 = (var7 + 1048575 - arg0.field1581) / var7;
                if (arg3 < var8) {
                    arg0.field1581 += arg3 * var7;
                    break;
                }
                arg0.field1596.method30(arg1, arg5, var8);
                int var9 = 262144 / var7;
                int var10 = class96.field1728 / 100;
                class223 var11 = arg0.field1596;
                arg3 -= var8;
                if (var9 < var10) {
                    var10 = var9;
                }
                arg0.field1581 += var7 * var8 - 1048576;
                if (this.field1229.field350[arg0.field1582] == 0) {
                    arg0.field1596 = class223.method1417(arg0.field1577, var11.method1407(), var11.method1402(), var11.method1425());
                } else {
                    arg0.field1596 = class223.method1417(arg0.field1577, var11.method1407(), 0, var11.method1425());
                    this.field1229.method183(arg0.field1597.field2681[arg0.field1587] < 0, (byte) 67, arg0);
                    arg0.field1596.method1401(var10, var11.method1402());
                }
                arg5 += var8;
                if (arg0.field1597.field2681[arg0.field1587] < 0) {
                    arg0.field1596.method1430(-1);
                }
                var11.method1405(var10);
                var11.method30(arg1, arg5, arg2 - arg5);
                if (var11.method1410()) {
                    this.field1241.method1267(var11);
                }
            }
        }
        arg0.field1596.method30(arg1, arg5, arg3);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(JZ)Lmb;")
    public static final class132 method447(long arg0, boolean arg1) {
        field1230++;
        class192.field3590.setTime(new Date(arg0));
        if (!arg1) {
            return null;
        }
        int var3 = class192.field3590.get(7);
        int var4 = class192.field3590.get(5);
        int var5 = class192.field3590.get(2);
        int var6 = class192.field3590.get(1);
        int var7 = class192.field3590.get(11);
        int var8 = class192.field3590.get(12);
        int var9 = class192.field3590.get(13);
        return class187.method1197(new class132[] { class78.field1347[var3 - 1], class162.field2931, class132.method889(var4 / 10, (byte) 96), class132.method889(var4 % 10, (byte) 124), class191.field3552, class59.field991[var5], class191.field3552, class132.method889(var6, (byte) 100), class161.field2922, class132.method889(var7 / 10, (byte) 121), class132.method889(var7 % 10, (byte) 116), class196.field3635, class132.method889(var8 / 10, (byte) 119), class132.method889(var8 % 10, (byte) 89), class196.field3635, class132.method889(var9 / 10, (byte) 103), class132.method889(var9 % 10, (byte) 91), class104.field1955 }, -96);
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "()Laf;")
    public final class7 method25() {
        field1242++;
        class90 var1 = (class90) this.field1240.method119(true);
        if (var1 == null) {
            return null;
        } else if (var1.field1596 == null) {
            return this.method24();
        } else {
            return var1.field1596;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)I")
    public static final int method448(int arg0, int arg1) {
        if (arg0 != 1048575) {
            method445(-28, -66, -124, 99, 57, -105, -107);
        }
        field1235++;
        return arg1 == 16711935 ? -1 : class110.method696(arg0 ^ 0xFFFF5, arg1);
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)V")
    public static void method449(int arg0) {
        field1223 = null;
        field1222 = null;
        if (arg0 != 0) {
            method445(-50, -87, -127, -71, -126, -12, -33);
        }
        field1239 = null;
        field1231 = null;
        field1227 = null;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "([III)V")
    public final void method30(int[] arg0, int arg1, int arg2) {
        this.field1241.method30(arg0, arg1, arg2);
        field1228++;
        for (class90 var4 = (class90) this.field1240.method119(true); var4 != null; var4 = (class90) this.field1240.method125((byte) -97)) {
            if (!this.field1229.method165(var4, -88)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field1586 >= var5) {
                        this.method446(var4, arg0, var5 + var6, var5, (byte) -110, var6);
                        var4.field1586 -= var5;
                        break;
                    }
                    this.method446(var4, arg0, var6 + var5, var4.field1586, (byte) -68, var6);
                    var6 += var4.field1586;
                    var5 -= var4.field1586;
                } while (!this.field1229.method166(50, var5, var6, var4, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lca;)V")
    public class74(class24 arg0) {
        this.field1229 = arg0;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class267 {

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field4296 = 0;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "Loj;")
    public static class246 field4298 = new class246();

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "[Z")
    public static boolean[] field4300 = new boolean[8];

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "Z")
    public static boolean field4299 = false;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
    public static int field4302 = 0;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "Ldk;")
    public static class251 field4303;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "[I")
    public static int[] field4305;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "[[[I")
    public static int[][][] field4304;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "[[[Llm;")
    public static class151[][][] field4301;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lbm;B)I")
    public static final int method1794(class131 arg0, byte arg1) {
        field4297++;
        class253 var2 = arg0.field2056;
        if (var2.field4062 != null) {
            var2 = var2.method1711(true);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg1 < 77) {
            field4299 = true;
        }
        int var3 = var2.field4063;
        class182 var4 = arg0.method292(-12);
        if (arg0.field682 == var4.field3006) {
            var3 = var2.field4071;
        } else if (arg0.field682 == var4.field2985 || arg0.field682 == var4.field2988 || arg0.field682 == var4.field2986 || arg0.field682 == var4.field2998) {
            var3 = var2.field4069;
        } else if (arg0.field682 == var4.field2987 || arg0.field682 == var4.field2981 || arg0.field682 == var4.field2994 || arg0.field682 == var4.field2996) {
            var3 = var2.field4042;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1795(byte[] arg0, int arg1) {
        field4295++;
        class162 var2 = new class162(arg0);
        if (arg1 != -25620) {
            method1796(-126);
        }
        int var3 = var2.method1133((byte) 53);
        int var4 = var2.method1157(65280);
        if (var4 < 0 || !(class201.field3218 == 0 || var4 <= class201.field3218)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method1136(var4, var5, arg1 ^ 0x6440, 0);
            return var5;
        } else {
            int var6 = var2.method1157(65280);
            if (var6 < 0 || !(class201.field3218 == 0 || var6 <= class201.field3218)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class202.method1415(var7, var6, arg0, var4, 9);
            } else {
                class17.field206.method744(var7, arg1 + 25579, var2);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V")
    public static void method1796(int arg0) {
        field4303 = null;
        int var1 = 120 % ((arg0 + 37) / 56);
        field4300 = null;
        field4298 = null;
        field4304 = null;
        field4301 = null;
        field4305 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BILbm;IIILbc;Lfc;I)V")
    public static final void method1797(byte arg0, int arg1, class131 arg2, int arg3, int arg4, int arg5, class299 arg6, class158 arg7, int arg8) {
        field4294++;
        if (arg0 >= -77) {
            method1794((class131) null, (byte) -122);
        }
        class107 var9 = new class107();
        var9.field1718 = arg5 * 128;
        var9.field1708 = arg4 * 128;
        var9.field1700 = arg3;
        if (arg7 != null) {
            var9.field1714 = arg7.field2517;
            int var11 = arg7.field2507;
            var9.field1694 = arg7.field2498;
            var9.field1691 = arg7.field2508;
            var9.field1703 = arg7;
            var9.field1698 = arg7.field2458 * 128;
            var9.field1717 = arg7.field2452;
            var9.field1707 = arg7.field2466;
            int var12 = arg7.field2487;
            if (arg1 == 1 || arg1 == 3) {
                var11 = arg7.field2487;
                var12 = arg7.field2507;
            }
            var9.field1704 = (arg5 + var11) * 128;
            var9.field1713 = (arg4 + var12) * 128;
            if (arg7.field2448 != null) {
                var9.field1705 = true;
                var9.method765(0);
            }
            if (var9.field1714 != null) {
                var9.field1712 = var9.field1691 + (int) (Math.random() * (double) (var9.field1717 - var9.field1691));
            }
            class237.field3809.method1646(true, var9);
            return;
        }
        if (arg2 != null) {
            var9.field1720 = arg2;
            class253 var10 = arg2.field2056;
            if (var10.field4062 != null) {
                var9.field1705 = true;
                var10 = var10.method1711(true);
            }
            if (var10 != null) {
                var9.field1713 = (var10.field4048 + arg4) * 128;
                var9.field1704 = (arg5 + var10.field4048) * 128;
                var9.field1707 = method1794(arg2, (byte) 97);
                var9.field1694 = var10.field4073;
                var9.field1698 = var10.field4032 * 128;
            }
            field4298.method1646(true, var9);
            return;
        }
        if (arg6 == null) {
            return;
        }
        var9.field1709 = arg6;
        var9.field1704 = (arg5 + arg6.method279(23397)) * 128;
        var9.field1713 = (arg6.method279(23397) + arg4) * 128;
        var9.field1707 = class74.method502(arg6, -39);
        var9.field1698 = arg6.field4788 * 128;
        var9.field1694 = arg6.field4771;
        class234.field3763.method1052((long) arg8, (byte) -65, var9);
        return;
    }
}

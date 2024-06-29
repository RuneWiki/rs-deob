import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class176 extends class271 {

    @OriginalMember(owner = "client!me", name = "O", descriptor = "[Lgd;")
    public class293[] field2966;

    @OriginalMember(owner = "client!me", name = "E", descriptor = "[I")
    public static int[] field2957 = new int[2];

    @OriginalMember(owner = "client!me", name = "L", descriptor = "I")
    public static int field2963 = 0;

    @OriginalMember(owner = "client!me", name = "I", descriptor = "Lre;")
    public static class262 field2960 = null;

    @OriginalMember(owner = "client!me", name = "R", descriptor = "[I")
    public static int[] field2969 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!me", name = "A", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!me", name = "F", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!me", name = "G", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!me", name = "J", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!me", name = "K", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!me", name = "M", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!me", name = "P", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!me", name = "Q", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!me", name = "N", descriptor = "Llb;")
    public static class199 field2965;

    @OriginalMember(owner = "client!me", name = "D", descriptor = "Lcb;")
    public static class267 field2956;

    @OriginalMember(owner = "client!me", name = "C", descriptor = "Lkm;")
    public static class308 field2955;

    @OriginalMember(owner = "client!me", name = "B", descriptor = "[[B")
    public static byte[][] field2954;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "(I)V", line = 5)
    public static final void method1294(int arg0) {
        field2953++;
        if (class124.field2080.toLowerCase().indexOf("microsoft") == -1) {
            class299.field5098[59] = 57;
            class299.field5098[61] = 27;
            class299.field5098[45] = 26;
            class299.field5098[91] = 42;
            class299.field5098[93] = 43;
            class299.field5098[44] = 71;
            class299.field5098[92] = 74;
            class299.field5098[47] = 73;
            if (class124.field2085 == null) {
                class299.field5098[192] = 58;
                class299.field5098[222] = 59;
            } else {
                class299.field5098[222] = 58;
                class299.field5098[520] = 59;
                class299.field5098[192] = 28;
            }
            class299.field5098[46] = 72;
        } else {
            class299.field5098[187] = 27;
            class299.field5098[186] = 57;
            class299.field5098[221] = 43;
            class299.field5098[188] = 71;
            class299.field5098[190] = 72;
            class299.field5098[189] = 26;
            class299.field5098[192] = 58;
            class299.field5098[219] = 42;
            class299.field5098[222] = 59;
            class299.field5098[220] = 74;
            class299.field5098[223] = 28;
            class299.field5098[191] = 73;
        }
        int var1 = -73 % ((arg0 + 32) / 43);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V", line = 62)
    public static void method1295(boolean arg0) {
        field2955 = null;
        if (!arg0) {
            return;
        }
        field2969 = null;
        field2956 = null;
        field2957 = null;
        field2965 = null;
        field2954 = (byte[][]) null;
        field2960 = null;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(III)V", line = 79)
    public static final void method1296(int arg0, int arg1, int arg2) {
        field2961++;
        if (class51.method375(arg2, -118)) {
            if (arg0 != 28) {
                field2954 = (byte[][]) ((byte[][]) null);
            }
            class40.method278(class249.field4198[arg2], arg0 ^ 0xFFFFFFE2, arg1);
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(III)V", line = 95)
    public static final void method1297(int arg0, int arg1, int arg2) {
        class156 var3 = class206.method1525(1, -32701, arg1);
        if (arg2 == 26) {
            var3.method1183(true);
            var3.field2665 = arg0;
            field2959++;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BLcl;)[Lrg;", line = 114)
    public static final class89[] method1298(byte arg0, class124 arg1) {
        if (arg0 != 122) {
            method1298((byte) 35, (class124) null);
        }
        field2968++;
        if (!arg1.method936((byte) -77)) {
            return new class89[0];
        }
        class77 var2 = arg1.method939(false);
        while (var2.field1330 == 0) {
            class235.method1708(67, 10L);
        }
        if (var2.field1330 == 2) {
            return new class89[0];
        }
        int[] var3 = (int[]) ((int[]) var2.field1329);
        class89[] var4 = new class89[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class89 var6 = new class89();
            var4[var5] = var6;
            var6.field1474 = var3[var5 << 2];
            var6.field1464 = var3[(var5 << 2) + 1];
            var6.field1463 = var3[(var5 << 2) + 2];
            var6.field1481 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIB)I", line = 156)
    public static final int method1299(int arg0, int arg1, byte arg2) {
        field2962++;
        class118 var3 = (class118) class310.field5269.method1007((long) arg0, -17004);
        if (arg2 >= -118) {
            method1294(21);
        }
        if (var3 == null) {
            return -1;
        } else if (arg1 >= 0 && var3.field1999.length > arg1) {
            return var3.field1999[arg1];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIII)V", line = 186)
    public static final void method1300(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2967++;
        class156 var5 = class206.method1525(8, -32701, arg2);
        if (arg1 == -7987) {
            var5.method1183(true);
            var5.field2680 = arg4;
            var5.field2674 = arg3;
            var5.field2665 = arg0;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IILcb;Lcb;I)Lie;", line = 210)
    public static final class80 method1301(int arg0, int arg1, class267 arg2, class267 arg3, int arg4) {
        field2964++;
        if (class281.method1994(arg0, (byte) -7, arg1, arg2)) {
            if (arg4 > -113) {
                method1301(81, 127, (class267) null, (class267) null, 66);
            }
            return class166.method1232(arg3.method1911(arg0, arg1, -70), false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(BI)Z", line = 227)
    public final boolean method1302(byte arg0, int arg1) {
        field2958++;
        return arg0 > -89 ? false : this.field2966[arg1].field5034;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lcb;Lcb;IZ)V", line = 244)
    public class176(class267 arg0, class267 arg1, int arg2, boolean arg3) {
        class170 var5 = new class170();
        int var6 = arg0.method1914(-100, arg2);
        this.field2966 = new class293[var6];
        int[] var7 = arg0.method1903(100, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            class116 var9 = null;
            byte[] var10 = arg0.method1911(arg2, var7[var8], -120);
            int var11 = (var10[0] & 0xFF) << 8 | var10[1] & 0xFF;
            for (class116 var12 = (class116) var5.method1250(true); var12 != null; var12 = (class116) var5.method1256((byte) -124)) {
                if (var12.field1961 == var11) {
                    var9 = var12;
                    break;
                }
            }
            if (var9 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1897((byte) 34, var11, 0);
                } else {
                    var13 = arg1.method1897((byte) -81, 0, var11);
                }
                var9 = new class116(var11, var13);
                var5.method1251(var9, -118);
            }
            this.field2966[var7[var8]] = new class293(var10, var9);
        }
    }
}

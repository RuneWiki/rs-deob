import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class482 {

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Lae;")
    private class283 field6662;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "Lae;")
    private class283 field6668;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "Laf;")
    public static class39 field6661 = new class39(10);

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public static int field6670 = 0;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field6663;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field6665;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field6666;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field6667;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field6671;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "Leb;")
    private class10 field6664;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([Ljava/lang/String;II[II)V", line = 7)
    public static final void method2861(String[] arg0, int arg1, int arg2, int[] arg3, int arg4) {
        if (arg4 < arg1) {
            int var5 = (arg4 + arg1) / 2;
            int var6 = arg4;
            String var7 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var7;
            int var8 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var8;
            for (int var9 = arg4; var9 < arg1; var9++) {
                if (var7 == null || arg0[var9] != null && (var9 & 0x1) > arg0[var9].compareTo(var7)) {
                    String var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    int var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg0[arg1] = arg0[var6];
            arg0[var6] = var7;
            arg3[arg1] = arg3[var6];
            arg3[var6] = var8;
            method2861(arg0, var6 - 1, 1, arg3, arg4);
            method2861(arg0, arg1, 1, arg3, var6 + 1);
        }
        if (arg2 != 1) {
            field6670 = 16;
        }
        field6671++;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lis;I)Lrd;", line = 67)
    public final class509 method2862(class117 arg0, int arg1) {
        field6667++;
        if (arg0 == null) {
            return null;
        }
        class475 var3 = arg0.method473(6);
        if (class181.field2287 == var3) {
            return new class142((class601) arg0);
        } else if (class538.field7430 == var3) {
            return new class184(this.method2866((byte) 111), (class389) arg0);
        } else if (class558.field7853 == var3) {
            return new class658(this.field6668, (class176) arg0);
        } else if (arg1 != -1) {
            return null;
        } else if (class463.field6467 == var3) {
            return new class376(this.field6668, (class229) arg0);
        } else if (class656.field9257 == var3) {
            return new class151(this.field6668, this.field6662, (class702) arg0);
        } else if (class227.field3443 == var3) {
            return new class244(this.field6668, this.field6662, (class713) arg0);
        } else if (class86.field1037 == var3) {
            return new class778(this.field6668, this.field6662, (class126) arg0);
        } else if (class132.field1692 == var3) {
            return new class513(this.field6668, this.field6662, (class524) arg0);
        } else if (class777.field10690 == var3) {
            return new class414(this.field6668, (class57) arg0);
        } else if (class696.field9705 == var3) {
            return new class62(this.field6668, this.field6662, (class708) arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 116)
    public static final void method2863(int arg0) {
        field6665++;
        class562.method3326((byte) -86, class688.field9602.field8516.method1707((byte) -98));
        int var1 = (class497.field6818 >> 12) + (class444.field6151 >> 3);
        int var2 = (class412.field5779 >> 12) + (class236.field3535 >> 3);
        class435.field6040 = class724.field10031.field3467 = 0;
        class724.field10031.method4019((byte) 36, 8, 8);
        byte var3 = 18;
        class370.field5341 = new byte[var3][];
        class452.field6305 = new byte[var3][];
        class611.field8607 = new int[var3];
        class476.field6609 = new int[var3];
        class734.field10130 = new int[var3];
        class725.field10032 = new int[var3][4];
        class86.field1038 = new int[var3];
        class404.field5702 = new int[var3];
        class380.field5444 = new byte[var3][];
        class448.field6279 = new byte[var3][];
        class175.field2217 = new byte[var3][];
        class372.field5355 = new int[var3];
        int var4 = 0;
        for (int var5 = (var1 - (class741.field10208 >> 4)) / 8; var5 <= (((class741.field10208 >> 4) + var1) / 8); var5++) {
            for (int var8 = (var2 - (class525.field7224 >> 4)) / 8; var8 <= ((class525.field7224 >> 4) + var2) / 8; var8++) {
                int var9 = (var5 << 8) + var8;
                class611.field8607[var4] = var9;
                class476.field6609[var4] = class604.field8480.method1839(-1, "m" + var5 + "_" + var8);
                class734.field10130[var4] = class604.field8480.method1839(-1, "l" + var5 + "_" + var8);
                class86.field1038[var4] = class604.field8480.method1839(-1, "n" + var5 + "_" + var8);
                class372.field5355[var4] = class604.field8480.method1839(-1, "um" + var5 + "_" + var8);
                class404.field5702[var4] = class604.field8480.method1839(-1, "ul" + var5 + "_" + var8);
                if (class86.field1038[var4] == -1) {
                    class476.field6609[var4] = -1;
                    class734.field10130[var4] = -1;
                    class372.field5355[var4] = -1;
                    class404.field5702[var4] = -1;
                }
                var4++;
            }
        }
        if (arg0 != -1851856253) {
            method2863(18);
        }
        for (int var6 = var4; var6 < class86.field1038.length; var6++) {
            class86.field1038[var6] = -1;
            class476.field6609[var6] = -1;
            class734.field10130[var6] = -1;
            class372.field5355[var6] = -1;
            class404.field5702[var6] = -1;
        }
        byte var7;
        if (class664.field9331 == 3) {
            var7 = 4;
        } else {
            var7 = 8;
        }
        class625.method3602(var1, false, var7, 7, var2);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V", line = 202)
    public static void method2864(byte arg0) {
        if (arg0 != 121) {
            field6661 = null;
        }
        field6661 = null;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V", line = 212)
    public static final void method2865(int arg0) {
        if (class32.field307 != null) {
            class32.field307.method1906(110);
        }
        if (arg0 != 23105) {
            field6661 = null;
        }
        field6666++;
        if (class607.field8497 != null) {
            class607.field8497.method1906(117);
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lae;Lae;)V", line = 228)
    public class482(class283 arg0, class283 arg1) {
        this.field6662 = arg1;
        this.field6668 = arg0;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)Leb;", line = 237)
    private final class10 method2866(byte arg0) {
        if (this.field6664 == null) {
            this.field6664 = new class10();
        }
        field6669++;
        if (arg0 != 111) {
            method2861(null, 90, 107, null, -123);
        }
        return this.field6664;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lee;Lhv;IIILsda;Lha;BI)V", line = 252)
    public static final void method2867(class506 arg0, class226 arg1, int arg2, int arg3, int arg4, class547 arg5, class473 arg6, byte arg7, int arg8) {
        field6663++;
        int var9 = arg3 - arg4 / 2 - 5;
        if (arg7 != -128) {
            field6661 = null;
        }
        int var10 = arg2 + 2;
        if (arg5.field7633 != 0) {
            arg6.method2822(arg2 + 1 - (-(arg0.method2950() * arg8) - -var10), arg4 + 10, var9, 1, var10, arg5.field7633);
        }
        if (arg5.field7602 != 0) {
            arg6.method2818(arg5.field7602, arg4 + 10, var9, (byte) 70, var10, arg2 + (arg8 * arg0.method2950() + 1) - var10);
        }
        int var11 = arg5.field7609;
        if (arg1.field3426 && arg5.field7627 != -1) {
            var11 = arg5.field7627;
        }
        for (int var12 = 0; var12 < arg8; var12++) {
            String var13 = class548.field7648[var12];
            if (arg8 - 1 > var12) {
                var13 = var13.substring(0, var13.length() - 4);
            }
            arg0.method2948(arg6, var13, arg3, arg2, var11, true);
            arg2 += arg0.method2950();
        }
    }
}

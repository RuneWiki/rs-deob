import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class432 extends class287 {

    @OriginalMember(owner = "client!bda", name = "m", descriptor = "Llu;")
    public static class610 field5785 = new class610(82, -1);

    @OriginalMember(owner = "client!bda", name = "o", descriptor = "[B")
    public static byte[] field5787 = new byte[2048];

    @OriginalMember(owner = "client!bda", name = "h", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!bda", name = "i", descriptor = "I")
    public int field5781;

    @OriginalMember(owner = "client!bda", name = "j", descriptor = "I")
    public static int field5782;

    @OriginalMember(owner = "client!bda", name = "k", descriptor = "I")
    public int field5783;

    @OriginalMember(owner = "client!bda", name = "l", descriptor = "I")
    public int field5784;

    @OriginalMember(owner = "client!bda", name = "p", descriptor = "I")
    public int field5788;

    @OriginalMember(owner = "client!bda", name = "q", descriptor = "I")
    public int field5789;

    @OriginalMember(owner = "client!bda", name = "r", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!bda", name = "s", descriptor = "I")
    public int field5791;

    @OriginalMember(owner = "client!bda", name = "n", descriptor = "Ljava/lang/String;")
    public String field5786;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(II[BI)[B", line = 5)
    public static final byte[] method2525(int arg0, int arg1, byte[] arg2, int arg3) {
        field5782++;
        byte[] var4 = new byte[arg0];
        if (arg3 < 18) {
            method2528((byte) -51);
        }
        class648.method3737(arg2, arg1, var4, 0, arg0);
        return var4;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lqa;Lbu;IIB)V", line = 20)
    public static final void method2526(class208 arg0, class19 arg1, int arg2, int arg3, byte arg4) {
        class227.field3313.method122((byte) 14);
        field5780++;
        if (class279.field3910) {
            return;
        }
        for (class101 var5 = (class101) arg1.method124((byte) 42); var5 != null; var5 = (class101) arg1.method120(64)) {
            class308 var6 = class339.field4665.method3058(var5.field1463, 0);
            if (class234.method1506(8, var6)) {
                boolean var7 = class396.method2350(arg0, var5, arg2, arg3, var6, (byte) -115);
                if (var7) {
                    class558.method3361(arg0, var5, (byte) -7, var6);
                }
            }
        }
        if (arg4 <= 87) {
            method2528((byte) 98);
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(B[[BLhf;)V", line = 56)
    public static final void method2527(byte arg0, byte[][] arg1, class335 arg2) {
        field5790++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = 0;
        if (arg0 != -81) {
            field5787 = null;
        }
        while (var4 < arg2.field4140) {
            class539.method3268(5);
            for (int var5 = 0; var5 < class146.field2125 >> 3; var5++) {
                for (int var6 = 0; var6 < (class410.field5609 >> 3); var6++) {
                    int var7 = class123.field1726[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg2.field4139 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = (var7 & 0x3FF9) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class340.field4706.length; var13++) {
                                if (class340.field4706[var13] == var12 && arg1[var13] != null) {
                                    class148 var14 = new class148(arg1[var13]);
                                    arg2.method1851(var6 * 8, var4, var10, var8, class127.field1774, var5 * 8, (byte) 44, var14, var9, var11);
                                    arg2.method2050(var10, var3[0] == -1 ? var3 : null, var8, var4, var11, var6 * 8, class99.field1445, var5 * 8, var14, arg0 + 202, var9);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            var4++;
        }
        if (var3[0] != -1) {
            class212.field3123 = class97.field1414.method3019(var3[0], var3[3], class351.field4786, var3[1], var3[2], (byte) 115);
            class2.field8 = var3[4];
        }
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(B)V", line = 151)
    public static void method2528(byte arg0) {
        field5787 = null;
        int var1 = 30 / ((-arg0 - 70) / 34);
        field5785 = null;
    }
}

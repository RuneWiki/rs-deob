import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class60 implements class422 {

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Ljava/lang/String;")
    private String field1144;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Lpu;")
    private class522 field1138;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field1143 = 0;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "[I")
    public static int[] field1140 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "Lff;")
    public static class9 field1145 = new class9(2, 4, 4, 0);

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "[Z")
    public static boolean[] field1141;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
    public static void method637(boolean arg0) {
        field1145 = null;
        if (!arg0) {
            method637(true);
        }
        field1141 = null;
        field1140 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)Lvj;")
    public final class405 method638(byte arg0) {
        int var2 = 1 / ((67 - arg0) / 45);
        field1142++;
        return class405.field5932;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method639(int arg0, String arg1, int arg2) {
        if (arg2 != 65535) {
            method639(-4, null, 13);
        }
        class376.method2265(arg0, 0, "", "", (byte) -119, "", arg1);
        field1139++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)I")
    public final int method640(int arg0) {
        if (arg0 == 11442) {
            field1147++;
            return this.field1138.method3006(this.field1144, (byte) -112) ? 100 : 0;
        } else {
            return 32;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lpu;Ljava/lang/String;)V")
    public class60(class522 arg0, String arg1) {
        this.field1144 = arg1;
        this.field1138 = arg0;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIBLde;Lqaa;)V")
    public static final void method641(int arg0, int arg1, byte arg2, class491 arg3, class26 arg4) {
        field1146++;
        byte var5 = -1;
        if ((arg1 & 0x10) != 0) {
            class208.field2924[arg0] = arg4.method3819((byte) -121);
        }
        if ((arg1 & 0x80) != 0) {
            int var6 = arg4.method3859((byte) 76);
            if (var6 == 65535) {
                var6 = -1;
            }
            arg3.field6171 = var6;
        }
        if ((arg1 & 0x8000) != 0) {
            var5 = arg4.method3827((byte) 92);
        }
        if ((arg1 & 0x40) != 0) {
            int var7 = arg4.method3847((byte) 118);
            int var8 = arg4.method3813((byte) 56);
            if (var7 == 65535) {
                var7 = -1;
            }
            int var9 = arg4.method3818((byte) 101);
            arg3.method2546(false, (byte) -119, var9, var8, var7);
        }
        if ((arg1 & 0x20000) != 0) {
            int var10 = class564.field7962;
            int var11 = arg4.method3815(-32768);
            int var12 = arg4.method3869(-128);
            arg3.method2556(var11, var12, var10, (byte) 94);
        }
        if ((arg1 & 0x2) != 0) {
            int var13 = arg4.method3826(false);
            byte[] var14 = new byte[var13];
            class695 var15 = new class695(var14);
            arg4.method3839(0, var13, -128, var14);
            class263.field3987[arg0] = var15;
            arg3.method2850(var15, 0);
        }
        if ((arg1 & 0x4000) != 0) {
            arg3.field6249 = arg4.method3819((byte) -74);
            arg3.field6187 = arg4.method3838(false);
            arg3.field6183 = arg4.method3827((byte) -73);
            arg3.field6178 = arg4.method3838(false);
            arg3.field6169 = arg4.method3847((byte) 118) + class564.field7962;
            arg3.field6203 = arg4.method3848(-1333735960) + class564.field7962;
            arg3.field6179 = arg4.method3818((byte) 87);
            if (arg3.field6975) {
                arg3.field6187 += arg3.field6963;
                arg3.field6249 += arg3.field6989;
                arg3.field6183 += arg3.field6989;
                arg3.field6178 += arg3.field6963;
                arg3.field6269 = 0;
            } else {
                arg3.field6178 += arg3.field6262[0];
                arg3.field6269 = 1;
                arg3.field6249 += arg3.field6271[0];
                arg3.field6183 += arg3.field6271[0];
                arg3.field6187 += arg3.field6262[0];
            }
            arg3.field6268 = 0;
        }
        if ((arg1 & 0x100) != 0) {
            int var16 = arg4.method3826(false);
            int[] var17 = new int[var16];
            int[] var18 = new int[var16];
            int[] var19 = new int[var16];
            for (int var20 = 0; var20 < var16; var20++) {
                int var21 = arg4.method3859((byte) 76);
                if (var21 == 65535) {
                    var21 = -1;
                }
                var17[var20] = var21;
                var18[var20] = arg4.method3826(false);
                var19[var20] = arg4.method3847((byte) 118);
            }
            class206.method1368(arg3, var18, var17, var19, (byte) -55);
        }
        if ((arg1 & 0x20) != 0) {
            int var22 = arg4.method3815(-32768);
            int var23 = arg4.method3869(-128);
            arg3.method2556(var22, var23, class564.field7962, (byte) 124);
            arg3.field6210 = class564.field7962 + 300;
            arg3.field6254 = arg4.method3818((byte) 79);
        }
        if ((arg1 & 0x1000) != 0) {
            arg3.field6999 = arg4.method3869(-128) == 1;
        }
        if ((arg1 & 0x400) != 0) {
            arg3.field6234 = arg4.method3836(false);
            if (arg3.field6234.charAt(0) == '~') {
                arg3.field6234 = arg3.field6234.substring(1);
                class376.method2265(2, 0, arg3.method2848(false, (byte) 91), arg3.field6949, (byte) -124, arg3.method2845(true, -14345), arg3.field6234);
            } else if (class648.field9106 == arg3) {
                class376.method2265(2, 0, arg3.method2848(false, (byte) 99), arg3.field6949, (byte) -119, arg3.method2845(true, -14345), arg3.field6234);
            }
            arg3.field6168 = 0;
            arg3.field6190 = 0;
            arg3.field6208 = 150;
        }
        if ((arg1 & 0x10000) != 0) {
            arg3.field6198 = arg4.method3844(112);
            arg3.field6215 = arg4.method3827((byte) 114);
            arg3.field6221 = arg4.method3827((byte) 26);
            arg3.field6252 = (byte) arg4.method3826(false);
            arg3.field6228 = class564.field7962 + arg4.method3847((byte) 118);
            arg3.field6185 = class564.field7962 + arg4.method3855(-2);
        }
        if ((arg1 & 0x2000) != 0) {
            int var24 = arg4.method3855(-2);
            int var25 = arg4.method3880(8);
            if (var24 == 65535) {
                var24 = -1;
            }
            int var26 = arg4.method3826(false);
            arg3.method2546(true, (byte) -127, var26, var25, var24);
        }
        int var27 = -28 / ((arg2 - 8) / 47);
        if ((arg1 & 0x1) != 0) {
            int[] var28 = new int[4];
            for (int var29 = 0; var29 < 4; var29++) {
                var28[var29] = arg4.method3847((byte) 118);
                if (var28[var29] == 65535) {
                    var28[var29] = -1;
                }
            }
            int var30 = arg4.method3869(-128);
            class599.method3392(var30, arg3, var28, (byte) -102);
        }
        if ((arg1 & 0x200) != 0) {
            int var31 = arg4.method3859((byte) 76);
            arg3.field6224 = arg4.method3851((byte) 30);
            arg3.field6238 = arg4.method3818((byte) 87);
            arg3.field6217 = (var31 & 0x8000) != 0;
            arg3.field6165 = var31 & 0x7FFF;
            arg3.field6204 = class564.field7962 + arg3.field6224 + arg3.field6165;
        }
        if ((arg1 & 0x4) != 0) {
            arg3.field6962 = arg4.method3847((byte) 118);
            if (arg3.field6269 == 0) {
                arg3.method2552(-50, arg3.field6962);
                arg3.field6962 = -1;
            }
        }
        if (!arg3.field6975) {
            return;
        }
        if (var5 == 127) {
            arg3.method2851(25661, arg3.field6963, arg3.field6989);
            return;
        }
        byte var32;
        if (var5 == -1) {
            var32 = class208.field2924[arg0];
        } else {
            var32 = var5;
        }
        arg3.method2846(var32, -23483, arg3.field6989, arg3.field6963);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class14 {

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public static int field262 = -1;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "Lcc;")
    private static class209 field258 = class95.method669(100, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "Lcc;")
    public static class209 field260 = field258;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "Lcc;")
    public static class209 field261 = class95.method669(106, ")4a=");

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "Lcc;")
    public static class209 field259 = class95.method669(112, "<col=ffff00>");

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public static int field263 = 0;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "Lcc;")
    public static class209 field265 = class95.method669(112, "(U2");

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "Lsj;")
    public static class49 field269;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "[I")
    public static int[] field255;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "[Lcc;")
    public static class209[] field264;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "[[[B")
    public static byte[][][] field266;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIZII)V")
    public static final void method104(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field256++;
        int var7 = 0;
        class56.method441(arg4, arg1);
        int var8 = arg1;
        int var9 = arg1 - arg3;
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = -arg1;
        int var11 = var9;
        int var12 = -var9;
        int var13 = -1;
        int var14 = -1;
        int var15 = arg5 + var9;
        int[] var16 = class252.field4543[arg2];
        int var17 = arg5 - var9;
        class176.method1215(arg5 - arg1, arg6, var16, var17, (byte) -5);
        class176.method1215(var17, arg0, var16, var15, (byte) -4);
        class176.method1215(var15, arg6, var16, arg5 + arg1, (byte) -77);
        while (var8 > var7) {
            var14 += 2;
            var13 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class122.field2408[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var8--;
                var10 -= var8 << 1;
                if (var9 > var8) {
                    int[] var18 = class252.field4543[arg2 + var8];
                    int[] var19 = class252.field4543[arg2 - var8];
                    int var20 = arg5 + var7;
                    int var21 = class122.field2408[var8];
                    int var22 = arg5 - var7;
                    int var23 = arg5 - var21;
                    int var24 = arg5 + var21;
                    class176.method1215(var22, arg6, var18, var23, (byte) 117);
                    class176.method1215(var23, arg0, var18, var24, (byte) 124);
                    class176.method1215(var24, arg6, var18, var20, (byte) 111);
                    class176.method1215(var22, arg6, var19, var23, (byte) 5);
                    class176.method1215(var23, arg0, var19, var24, (byte) -52);
                    class176.method1215(var24, arg6, var19, var20, (byte) 114);
                } else {
                    int[] var25 = class252.field4543[arg2 + var8];
                    int[] var26 = class252.field4543[arg2 - var8];
                    int var27 = arg5 + var7;
                    int var28 = arg5 - var7;
                    class176.method1215(var28, arg6, var25, var27, (byte) 116);
                    class176.method1215(var28, arg6, var26, var27, (byte) 114);
                }
            }
            int[] var29 = class252.field4543[arg2 + var7];
            int[] var30 = class252.field4543[arg2 - var7];
            int var31 = arg5 - var8;
            int var32 = arg5 + var8;
            if (var9 > var7) {
                int var33 = var7 <= var11 ? var11 : class122.field2408[var7];
                int var34 = arg5 + var33;
                int var35 = arg5 - var33;
                class176.method1215(var31, arg6, var29, var35, (byte) 115);
                class176.method1215(var35, arg0, var29, var34, (byte) 2);
                class176.method1215(var34, arg6, var29, var32, (byte) 116);
                class176.method1215(var31, arg6, var30, var35, (byte) -119);
                class176.method1215(var35, arg0, var30, var34, (byte) -66);
                class176.method1215(var34, arg6, var30, var32, (byte) 17);
            } else {
                class176.method1215(var31, arg6, var29, var32, (byte) 120);
                class176.method1215(var31, arg6, var30, var32, (byte) -89);
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
    public static void method105(byte arg0) {
        field260 = null;
        field261 = null;
        field255 = null;
        int var1 = 59 / ((-arg0 - 5) / 35);
        field269 = null;
        field259 = null;
        field258 = null;
        field266 = null;
        field264 = null;
        field265 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(III)V")
    public static final void method106(int arg0, int arg1, int arg2) {
        if (class258.field4662 != 0 && arg2 != -1) {
            class51.method391(class275.field4860, false, 0, arg2, true, class258.field4662);
            class94.field1865 = true;
        }
        field267++;
        int var3 = 6 % ((arg0 + 10) / 34);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IBIII)V")
    public static final void method107(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class200.field3580 = class59.field1194 * arg4 / arg2;
        class118.field2370 = class98.field1921 * arg0 / arg3;
        class49.field978 = -1;
        class279.field4919 = -1;
        class112.method801((byte) -78);
        field268++;
        if (arg1 > -58) {
            method106(85, -58, -114);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)I")
    public static final int method108(int arg0, int arg1) {
        field257++;
        int var2 = 73 / ((arg0 + 38) / 35);
        return arg1 >> 11 & 0x7F;
    }
}

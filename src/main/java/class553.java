import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class553 extends class81 {

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "Lmba;")
    public class77 field7766;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "Lus;")
    public static class328 field7768 = new class328(12, 8);

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field7770 = -50;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "[I")
    public static int[] field7771 = new int[1];

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    public static int field7772 = 0;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "F")
    public static float field7769;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field7764;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field7765;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field7767;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "J")
    public static long field7763;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V", line = 4)
    public static void method3146(byte arg0) {
        field7771 = null;
        field7768 = null;
        if (arg0 >= -23) {
            method3149(null, -112, 20);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILjava/lang/String;IIIIII)V", line = 18)
    public static final void method3147(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7765++;
        class241 var8 = new class241();
        var8.field3113 = arg4;
        var8.field3100 = class266.field3368 + arg5;
        if (arg2 != 27093) {
            method3147(-62, null, 55, -118, 92, 125, 71, 13);
        }
        var8.field3109 = arg1;
        var8.field3104 = arg6;
        var8.field3108 = arg3;
        var8.field3103 = arg7;
        var8.field3105 = arg0;
        class652.field8973.method1840(18, var8);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIIIII)V", line = 39)
    public static final void method3148(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg9 >= class108.field1334 && class592.field8242 >= arg9 && class108.field1334 <= arg1 && class592.field8242 >= arg1 && class108.field1334 <= arg6 && class592.field8242 >= arg6 && class108.field1334 <= arg4 && class592.field8242 >= arg4 && class112.field1386 <= arg5 && class328.field4190 >= arg5 && arg8 >= class112.field1386 && arg8 <= class328.field4190 && arg0 >= class112.field1386 && arg0 <= class328.field4190 && arg3 >= class112.field1386 && arg3 <= class328.field4190) {
            class377.method2288(arg4, arg0, arg3, arg8, arg2 - 383, arg7, arg5, arg6, arg1, arg9);
        } else {
            class340.method1992(arg4, arg9, arg3, arg0, arg6, arg1, arg2 - 129, arg8, arg5, arg7);
        }
        field7764++;
        if (arg2 != 255) {
            field7771 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ldfa;II)Z", line = 57)
    public static final boolean method3149(class757 arg0, int arg1, int arg2) {
        field7767++;
        int var3 = arg0.method4206(2, 121);
        if (var3 == 0) {
            if (arg0.method4206(1, -64) != 0) {
                method3149(arg0, -121, arg2);
            }
            int var4 = arg0.method4206(6, -69);
            int var5 = arg0.method4206(6, 118);
            boolean var6 = arg0.method4206(1, -118) == 1;
            if (var6) {
                class199.field2549[class2.field8++] = arg2;
            }
            if (class447.field6287[arg2] != null) {
                throw new RuntimeException("hr:lr");
            }
            class53 var7 = class16.field225[arg2];
            class546 var8 = class447.field6287[arg2] = new class546();
            var8.field354 = arg2;
            if (class576.field8042[arg2] != null) {
                var8.method3098((byte) -105, class576.field8042[arg2]);
            }
            var8.method270(79, var7.field776, true);
            var8.field407 = var7.field774;
            int var9 = var7.field777;
            int var10 = var9 >> 28;
            int var11 = var9 >> 14 & 0xFF;
            int var12 = var9 & 0xFF;
            int var13 = (var11 << 6) + var4 - class63.field851;
            var8.field7677 = var7.field778;
            int var14 = (var12 << 6) + var5 - class753.field10509;
            var8.field428[0] = class664.field9089[arg2];
            var8.field5779 = var8.field5792 = (byte) var10;
            if (class739.method4140((byte) 56, var14, var13)) {
                var8.field5792++;
            }
            var8.method3103(var14, var13, (byte) 7);
            var8.field7673 = false;
            class16.field225[arg2] = null;
            return true;
        } else if (var3 == 1) {
            int var15 = arg0.method4206(2, 103);
            int var16 = class16.field225[arg2].field777;
            class16.field225[arg2].field777 = ((var16 >> 28) + var15 & 0x3 << 28) + (var16 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var17 = arg0.method4206(5, 101);
            int var18 = var17 >> 3;
            int var19 = var17 & 0x7;
            int var20 = class16.field225[arg2].field777;
            int var21 = (var20 >> 28) + var18 & 0x3;
            int var22 = var20 >> 14 & 0xFF;
            int var23 = var20 & 0xFF;
            if (var19 == 0) {
                var23--;
                var22--;
            }
            if (var19 == 1) {
                var23--;
            }
            if (var19 == 2) {
                var23--;
                var22++;
            }
            if (var19 == 3) {
                var22--;
            }
            if (var19 == 4) {
                var22++;
            }
            if (var19 == 5) {
                var23++;
                var22--;
            }
            if (var19 == 6) {
                var23++;
            }
            if (var19 == 7) {
                var22++;
                var23++;
            }
            class16.field225[arg2].field777 = (var21 << 28) + (var22 << 14) + var23;
            return false;
        } else {
            int var24 = arg0.method4206(18, 96);
            int var25 = var24 >> 16;
            int var26 = var24 >> 8 & 0xFF;
            int var27 = var24 & 0xFF;
            int var28 = class16.field225[arg2].field777;
            int var29 = (var28 >> 28) + var25 & 0x3;
            int var30 = (var28 >> 14) + var26 & 0xFF;
            int var31 = -110 / ((arg1 + 43) / 56);
            int var32 = var27 + var28 & 0xFF;
            class16.field225[arg2].field777 = (var29 << 28) - (-(var30 << 14) - var32);
            return false;
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Leq;II[B)V", line = 225)
    public class553(class357 arg0, int arg1, int arg2, byte[] arg3) {
        this.field7766 = class714.method3957(arg2, (byte) 127, 6406, arg3, false, 6406, arg1, arg0);
        this.field7766.method1188(10242, false, false);
    }
}

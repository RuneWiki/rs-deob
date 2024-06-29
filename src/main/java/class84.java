import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class84 {

    @OriginalMember(owner = "client!si", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1077 = "Cancel";

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field1082 = -1;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "[I")
    public static int[] field1076 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    public static int field1085 = -1;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public int field1074;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public int field1075;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public int field1078;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public int field1079;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public int field1083;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public int field1086;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "I")
    public int field1089;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "Luj;")
    public static class158 field1088;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "Luj;")
    public static class158 field1090;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "[B")
    public byte[] field1084;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "[B")
    public byte[] field1087;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "[Lcl;")
    public static class18[] field1081;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IB)V", line = 14)
    public static final void method617(int arg0, byte arg1) {
        if (arg1 != -86) {
            field1090 = (class158) null;
        }
        field1080++;
        class312.field4584.method2264((byte) 123, arg0);
        class260.field3769.method2264((byte) 56, arg0);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lto;IIIIIIZ)V", line = 42)
    public static final void method618(class244 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field3556.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field3556[var9] - class181.field2479;
            int var11 = arg0.field3558[var9] - class125.field1659;
            int var12 = arg0.field3554[var9] - class338.field5269;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field3540 != null) {
                class244.field3559[var9] = var13;
                class244.field3551[var9] = var16;
                class244.field3542[var9] = var17;
            }
            class244.field3549[var9] = (var13 << 9) / var17 + class350.field5461;
            class244.field3555[var9] = (var16 << 9) / var17 + class350.field5464;
        }
        class350.field5469 = 0;
        int var19 = arg0.field3553.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field3553[var20];
            int var22 = arg0.field3552[var20];
            int var23 = arg0.field3560[var20];
            int var24 = class244.field3549[var21];
            int var25 = class244.field3549[var22];
            int var26 = class244.field3549[var23];
            int var27 = class244.field3555[var21];
            int var28 = class244.field3555[var22];
            int var29 = class244.field3555[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class95.field1242 && class49.method385(class350.field5461 + class32.field373, class350.field5464 + class102.field1325, var27, var28, var29, var24, var25, var26)) {
                    class327.field4773 = arg5;
                    class336.field5258 = arg6;
                }
                if (!class47.field623 && !arg7) {
                    class350.field5466 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class350.field5477 || var25 > class350.field5477 || var26 > class350.field5477) {
                        class350.field5466 = true;
                    }
                    if (arg0.field3540 == null || arg0.field3540[var20] == -1) {
                        if (arg0.field3546[var20] != 12345678) {
                            class350.method2426(var27, var28, var29, var24, var25, var26, arg0.field3546[var20], arg0.field3544[var20], arg0.field3543[var20]);
                        }
                    } else if (!class40.field506) {
                        int var30 = class350.field5467.method907(arg0.field3540[var20], 65535);
                        class350.method2426(var27, var28, var29, var24, var25, var26, class32.method201(var30, arg0.field3546[var20]), class32.method201(var30, arg0.field3544[var20]), class32.method201(var30, arg0.field3543[var20]));
                    } else if (arg0.field3548) {
                        class350.method2441(var27, var28, var29, var24, var25, var26, arg0.field3546[var20], arg0.field3544[var20], arg0.field3543[var20], class244.field3559[0], class244.field3559[1], class244.field3559[3], class244.field3551[0], class244.field3551[1], class244.field3551[3], class244.field3542[0], class244.field3542[1], class244.field3542[3], arg0.field3540[var20]);
                    } else {
                        class350.method2441(var27, var28, var29, var24, var25, var26, arg0.field3546[var20], arg0.field3544[var20], arg0.field3543[var20], class244.field3559[var21], class244.field3559[var22], class244.field3559[var23], class244.field3551[var21], class244.field3551[var22], class244.field3551[var23], class244.field3542[var21], class244.field3542[var22], class244.field3542[var23], arg0.field3540[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V", line = 160)
    public static void method619(int arg0) {
        field1076 = null;
        if (arg0 >= 50) {
            field1081 = null;
            field1077 = null;
            field1090 = null;
            field1088 = null;
        }
    }
}

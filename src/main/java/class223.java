import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class223 {

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field3927 = 0;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field3929 = 0;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field3925 = 0;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "[Lid;")
    public static class149[] field3933 = null;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field3931 = 0;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "Lid;")
    public static class149 field3934 = class60.method382(" weitere Optionen", (byte) 49);

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lid;")
    public static class149 field3935 = class60.method382("Chargement de la liste des serveurs", (byte) 122);

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "[Lek;")
    public static class164[] field3926 = new class164[14];

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field3932 = 0;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lal;IIILal;)Lmb;")
    public static final class160 method1500(class230 arg0, int arg1, int arg2, int arg3, class230 arg4) {
        if (arg3 != 0) {
            field3927 = -62;
        }
        field3930++;
        return class59.method371((byte) 77, arg2, arg1, arg0) ? class107.method744(arg4.method1562(-809612665, arg2, arg1), 174) : null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static void method1501(int arg0) {
        if (arg0 != 0) {
            method1500((class230) null, -47, -76, -127, (class230) null);
        }
        field3934 = null;
        field3935 = null;
        field3926 = null;
        field3933 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lal;BLal;Z)V")
    public static final void method1502(class230 arg0, byte arg1, class230 arg2, boolean arg3) {
        class259.field4555 = arg0;
        class40.field629 = arg3;
        if (arg1 != 58) {
            field3935 = null;
        }
        class74.field1310 = arg2;
        field3928++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lkb;IIIIIIZ)V")
    public static final void method1503(class53 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field949.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field949[var9] - class82.field1495;
            int var23 = arg0.field948[var9] - class37.field554;
            int var24 = arg0.field964[var9] - class226.field3971;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field956 != null) {
                class53.field966[var9] = var25;
                class53.field962[var9] = var28;
                class53.field963[var9] = var29;
            }
            class53.field967[var9] = (var25 << 9) / var29 + class235.field4117;
            class53.field951[var9] = (var28 << 9) / var29 + class235.field4113;
        }
        class235.field4116 = 0;
        int var10 = arg0.field960.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field960[var11];
            int var13 = arg0.field947[var11];
            int var14 = arg0.field955[var11];
            int var15 = class53.field967[var12];
            int var16 = class53.field967[var13];
            int var17 = class53.field967[var14];
            int var18 = class53.field951[var12];
            int var19 = class53.field951[var13];
            int var20 = class53.field951[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class246.field4317 && class43.method252(class273.field4911 + class235.field4117, class67.field1173 + class235.field4113, var18, var19, var20, var15, var16, var17)) {
                    class198.field3606 = arg5;
                    class39.field615 = arg6;
                }
                if (!arg7) {
                    class235.field4121 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class235.field4127 || var16 > class235.field4127 || var17 > class235.field4127) {
                        class235.field4121 = true;
                    }
                    if (arg0.field956 == null || arg0.field956[var11] == -1) {
                        if (arg0.field950[var11] != 12345678) {
                            class235.method1589(var18, var19, var20, var15, var16, var17, arg0.field950[var11], arg0.field952[var11], arg0.field961[var11]);
                        }
                    } else if (!class211.field3762) {
                        int var21 = class235.field4129.method123((byte) -125, arg0.field956[var11]);
                        class235.method1589(var18, var19, var20, var15, var16, var17, class158.method1141(var21, arg0.field950[var11]), class158.method1141(var21, arg0.field952[var11]), class158.method1141(var21, arg0.field961[var11]));
                    } else if (arg0.field953) {
                        class235.method1579(var18, var19, var20, var15, var16, var17, arg0.field950[var11], arg0.field952[var11], arg0.field961[var11], class53.field966[0], class53.field966[1], class53.field966[3], class53.field962[0], class53.field962[1], class53.field962[3], class53.field963[0], class53.field963[1], class53.field963[3], arg0.field956[var11]);
                    } else {
                        class235.method1579(var18, var19, var20, var15, var16, var17, arg0.field950[var11], arg0.field952[var11], arg0.field961[var11], class53.field966[var12], class53.field966[var13], class53.field966[var14], class53.field962[var12], class53.field962[var13], class53.field962[var14], class53.field963[var12], class53.field963[var13], class53.field963[var14], arg0.field956[var11]);
                    }
                }
            }
        }
    }
}

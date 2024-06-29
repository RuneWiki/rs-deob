import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class19 {

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "[I")
    public static int[] field179 = new int[5];

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field180 = -1;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "Lmh;")
    public static class62 field181 = class201.method1405(true, ")3runescape)3com)4l=");

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static volatile int field184 = 0;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field186 = 1;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lmh;BLhi;)Lli;", line = 11)
    public static final class226 method79(class62 arg0, byte arg1, class26 arg2) {
        field182++;
        if (arg1 != 78) {
            return (class226) null;
        }
        int var3 = arg2.method153((byte) 110, arg0);
        if (var3 == -1) {
            return new class226(0);
        }
        int[] var4 = arg2.method142(118, var3);
        class226 var5 = new class226(var4.length);
        for (int var6 = 0; var6 < var5.field3942; var6++) {
            class92 var7 = new class92(arg2.method157(var4[var6], var3, (byte) 19));
            var5.field3934[var6] = var7.method696((byte) 72);
            var5.field3935[var6] = var7.method743((byte) 15);
            var5.field3931[var6] = (short) var7.method721(118);
            var5.field3929[var6] = (short) var7.method721(80);
            var5.field3940[var6] = var7.method704(class290.method1975(arg1, 1509947870));
        }
        return var5;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)V", line = 47)
    public static final void method80(byte arg0, int arg1) {
        field187++;
        int var2 = 122 % ((arg0 + 13) / 34);
        class151 var3 = class165.method1194((byte) 1, 6, arg1);
        var3.method1081(128);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIBIIIIII)V", line = 72)
    public static final void method81(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        for (int var9 = 0; var9 < class252.field4270.field3942; var9++) {
            int var10 = class248.field4219 + class164.field2666 - class252.field4270.field3929[var9] - 1;
            int var11 = class252.field4270.field3931[var9] - class22.field239;
            int var12 = (arg8 - arg6) * (var11 - arg7) / (arg4 - arg7) + arg6;
            int var13 = class252.field4270.method1598(var9, (byte) -86);
            int var14 = (arg0 - arg3) * (var10 - arg5) / (arg1 - arg5) + arg3;
            int var15 = 16777215;
            class242 var16 = null;
            if (var13 == 0) {
                if ((double) class187.field2990 == 3.0D) {
                    var16 = class198.field3341;
                }
                if ((double) class187.field2990 == 4.0D) {
                    var16 = class241.field4107;
                }
                if ((double) class187.field2990 == 6.0D) {
                    var16 = class24.field271;
                }
                if ((double) class187.field2990 == 8.0D) {
                    var16 = class208.field3528;
                }
            }
            if (var13 == 1) {
                if ((double) class187.field2990 == 3.0D) {
                    var16 = class24.field271;
                }
                if ((double) class187.field2990 == 4.0D) {
                    var16 = class208.field3528;
                }
                if ((double) class187.field2990 == 6.0D) {
                    var16 = class97.field1595;
                }
                if ((double) class187.field2990 == 8.0D) {
                    var16 = class20.field192;
                }
            }
            if (var13 == 2) {
                if ((double) class187.field2990 == 3.0D) {
                    var16 = class97.field1595;
                }
                if ((double) class187.field2990 == 4.0D) {
                    var16 = class20.field192;
                }
                if ((double) class187.field2990 == 6.0D) {
                    var16 = class156.field2509;
                }
                var15 = 16755200;
                if ((double) class187.field2990 == 8.0D) {
                    var16 = class56.field830;
                }
            }
            if (class252.field4270.field3940[var9] != -1) {
                var15 = class252.field4270.field3940[var9];
            }
            if (var16 != null) {
                class62[] var17 = new class62[class252.field4270.field3934[var9].method423((byte) -24, 60) + 1];
                class125.field2097.method2031(class252.field4270.field3934[var9], (int[]) null, var17);
                int var18 = var17.length;
                int var19 = var14 - (var18 - 1) * var16.method1699() / 2;
                int var20 = var19 + var16.method1702() / 2;
                for (int var21 = 0; var21 < var18; var21++) {
                    class62 var22 = (var18 - 1) == var21 ? var17[var21] : var17[var21].method429(var17[var21].method439(arg2 - 139) - 4, 0, true);
                    var16.method1701(var22, var12, var20, var15, true);
                    var20 += var16.method1699();
                }
            }
        }
        if (arg2 != 50) {
            method82(-93);
        }
        field185++;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V", line = 186)
    public static void method82(int arg0) {
        field181 = null;
        field179 = null;
        if (arg0 != 6) {
            method80((byte) -109, 20);
        }
    }
}

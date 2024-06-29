import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class119 extends class86 {

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "I")
    public int field1998;

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2003 = Calendar.getInstance();

    @OriginalMember(owner = "client!oe", name = "C", descriptor = "I")
    public static int field2007 = 0;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "Lnh;")
    public static class107 field2009;

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "Lek;")
    public static class172 field2008;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V", line = 12)
    public static final void method762(int arg0, int arg1) {
        field2002++;
        if (class79.field1367 == null || arg0 > class79.field1367.length) {
            class79.field1367 = new int[arg0];
        }
        int var2 = 89 / ((50 - arg1) / 33);
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)Lbe;", line = 38)
    public static final class283 method763(int arg0, int arg1) {
        field2006++;
        if (arg0 < 100000) {
            return class299.method2022(new class283[] { class14.field151, class296.method2012(arg0, (byte) 115), class183.field3156 }, (byte) 117);
        } else if (arg0 < 10000000) {
            return class299.method2022(new class283[] { class245.field4165, class296.method2012(arg0 / 1000, (byte) -94), class237.field3967, class183.field3156 }, (byte) 51);
        } else {
            if (arg1 != 9) {
                method765((class229) null, 94);
            }
            return class299.method2022(new class283[] { class265.field4502, class296.method2012(arg0 / 1000000, (byte) 119), class222.field3734, class183.field3156 }, (byte) 39);
        }
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)V", line = 59)
    public static void method764(int arg0) {
        if (arg0 == -16274) {
            field2008 = null;
            field2009 = null;
            field2003 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V", line = 71)
    public class119() {
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lfe;I)Lwa;", line = 75)
    public static final class75 method765(class229 arg0, int arg1) {
        if (arg1 != 0) {
            field2001 = 112;
        }
        field2000++;
        return new class75(arg0.method1507(arg1 ^ 0x47), arg0.method1507(arg1 ^ 0x5E), arg0.method1507(arg1 + 108), arg0.method1507(114), arg0.method1551(arg1 ^ 0x7C), arg0.method1551(19), arg0.method1535((byte) 92));
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIIIII)V", line = 91)
    public static final void method766(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        for (int var9 = 0; var9 < class272.field4577.field5069; var9++) {
            int var10 = class272.field4577.field5059[var9] - class123.field2045;
            int var11 = class110.field1865 - (class272.field4577.field5054[var9] - (class134.field2254 - 1));
            int var12 = arg6 + ((arg5 - arg6) * (var11 - arg3) / (arg8 - arg3));
            int var13 = class272.field4577.method2025((byte) -39, var9);
            int var14 = (arg2 - arg0) * (var10 - arg1) / (arg4 - arg1) + arg0;
            int var15 = 16777215;
            class181 var16 = null;
            if (var13 == 0) {
                if ((double) class123.field2044 == 3.0D) {
                    var16 = class153.field2507;
                }
                if ((double) class123.field2044 == 4.0D) {
                    var16 = class66.field927;
                }
                if ((double) class123.field2044 == 6.0D) {
                    var16 = class217.field3673;
                }
                if ((double) class123.field2044 == 8.0D) {
                    var16 = class117.field1980;
                }
            }
            if (var13 == 1) {
                if ((double) class123.field2044 == 3.0D) {
                    var16 = class217.field3673;
                }
                if ((double) class123.field2044 == 4.0D) {
                    var16 = class117.field1980;
                }
                if ((double) class123.field2044 == 6.0D) {
                    var16 = class169.field2848;
                }
                if ((double) class123.field2044 == 8.0D) {
                    var16 = class187.field3209;
                }
            }
            if (var13 == 2) {
                var15 = 16755200;
                if ((double) class123.field2044 == 3.0D) {
                    var16 = class169.field2848;
                }
                if ((double) class123.field2044 == 4.0D) {
                    var16 = class187.field3209;
                }
                if ((double) class123.field2044 == 6.0D) {
                    var16 = class210.field3577;
                }
                if ((double) class123.field2044 == 8.0D) {
                    var16 = class208.field3565;
                }
            }
            if (class272.field4577.field5062[var9] != -1) {
                var15 = class272.field4577.field5062[var9];
            }
            if (var16 != null) {
                class283[] var17 = new class283[class272.field4577.field5066[var9].method1947(60, (byte) 62) + 1];
                class107.field1831.method1651(class272.field4577.field5066[var9], (int[]) null, var17);
                int var18 = var17.length;
                int var19 = var12 - (var18 - 1) * var16.method1196() / 2;
                int var20 = var19 + var16.method1194() / 2;
                for (int var21 = 0; var21 < var18; var21++) {
                    class283 var22 = var18 - 1 == var21 ? var17[var21] : var17[var21].method1936(arg7 + 12407, 0, var17[var21].method1925((byte) -44) - 4);
                    var16.method1198(var22, var14, var20, var15, true);
                    var20 += var16.method1196();
                }
            }
        }
        field2005++;
        if (arg7 != -12470) {
            method762(-78, 29);
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(I)V", line = 203)
    public class119(int arg0) {
        this.field1998 = arg0;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)Lib;", line = 221)
    public static final class88 method767(int arg0, byte arg1) {
        if (arg1 != -88) {
            field2003 = (Calendar) null;
        }
        field1999++;
        class88 var2 = (class88) class215.field3644.method1629(92, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class140.field2333.method1107(3, arg0, 126);
        class88 var4 = new class88();
        if (var3 != null) {
            var4.method574(new class229(var3), false);
        }
        class215.field3644.method1630(true, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lkf;IIIIIIZ)V", line = 263)
    public static final void method768(class211 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field3599.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field3599[var9] - class231.field3926;
            int var11 = arg0.field3600[var9] - class232.field3930;
            int var12 = arg0.field3605[var9] - class160.field2635;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field3601 != null) {
                class211.field3598[var9] = var13;
                class211.field3592[var9] = var16;
                class211.field3604[var9] = var17;
            }
            class211.field3589[var9] = (var13 << 9) / var17 + class139.field2325;
            class211.field3603[var9] = (var16 << 9) / var17 + class139.field2320;
        }
        class139.field2314 = 0;
        int var19 = arg0.field3590.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field3590[var20];
            int var22 = arg0.field3609[var20];
            int var23 = arg0.field3591[var20];
            int var24 = class211.field3589[var21];
            int var25 = class211.field3589[var22];
            int var26 = class211.field3589[var23];
            int var27 = class211.field3603[var21];
            int var28 = class211.field3603[var22];
            int var29 = class211.field3603[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0 && class34.field511 && class229.method1559(class36.field536 + class139.field2325, class197.field3358 + class139.field2320, var27, var28, var29, var24, var25, var26)) {
                class263.field4473 = arg5;
                class27.field411 = arg6;
            }
        }
    }
}

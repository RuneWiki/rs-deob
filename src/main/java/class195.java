import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class195 extends class99 {

    @OriginalMember(owner = "client!ab", name = "U", descriptor = "Lr;")
    public static class66 field3366 = null;

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "I")
    public static int field3362 = 0;

    @OriginalMember(owner = "client!ab", name = "V", descriptor = "I")
    public static int field3367 = 3353893;

    @OriginalMember(owner = "client!ab", name = "X", descriptor = "S")
    public static short field3369 = 1;

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!ab", name = "S", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!ab", name = "T", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!ab", name = "W", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(IZ)V")
    public static final void method1268(int arg0, boolean arg1) {
        for (class217 var2 = (class217) class259.field4539.method873((byte) 76); var2 != null; var2 = (class217) class259.field4539.method870((byte) 41)) {
            if (var2.field3722 != null) {
                class206.field3528.method1031(var2.field3722);
                var2.field3722 = null;
            }
            if (var2.field3731 != null) {
                class206.field3528.method1031(var2.field3731);
                var2.field3731 = null;
            }
            var2.method560(-17554);
        }
        field3365++;
        if (arg0 != 0 || !arg1) {
            return;
        }
        for (class217 var3 = (class217) class222.field3784.method873((byte) 76); var3 != null; var3 = (class217) class222.field3784.method870((byte) -127)) {
            if (var3.field3722 != null) {
                class206.field3528.method1031(var3.field3722);
                var3.field3722 = null;
            }
            var3.method560(-17554);
        }
        for (class217 var4 = (class217) class52.field921.method1382(-32642); var4 != null; var4 = (class217) class52.field921.method1386((byte) -105)) {
            if (var4.field3722 != null) {
                class206.field3528.method1031(var4.field3722);
                var4.field3722 = null;
            }
            var4.method560(-17554);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZIIIII)V")
    public static final void method1269(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class54.field942 = (short) arg1;
        field3364++;
        class194.field3352 = (short) arg3;
        if (arg4 >= -65) {
            field3369 = -98;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BI)[I")
    public final int[] method10(byte arg0, int arg1) {
        if (arg0 != -61) {
            field3366 = null;
        }
        field3368++;
        return class10.field120;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
    public class195() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(B)V")
    public static void method1270(byte arg0) {
        field3366 = null;
        if (arg0 != -57) {
            method1269(true, -90, -110, 25, 4, 82);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = 0;
        if (arg8 < 53) {
            return;
        }
        while (class178.field3122.field2163 > var9) {
            int var10 = class178.field3122.field2157[var9] - class73.field1439;
            int var11 = class89.field1727 - (1 - (class16.field208 - class178.field3122.field2160[var9]));
            int var12 = (arg5 - arg3) * (var10 - arg7) / (arg6 - arg7) + arg3;
            int var13 = arg1 + ((var11 - arg4) * (arg2 - arg1) / (arg0 - arg4));
            int var14 = 16777215;
            int var15 = class178.field3122.method764(-67, var9);
            class228 var16 = null;
            if (var15 == 0) {
                if ((double) class35.field527 == 3.0D) {
                    var16 = class69.field1398;
                }
                if ((double) class35.field527 == 4.0D) {
                    var16 = class49.field883;
                }
                if ((double) class35.field527 == 6.0D) {
                    var16 = class82.field1598;
                }
                if ((double) class35.field527 == 8.0D) {
                    var16 = class224.field3812;
                }
            }
            if (var15 == 1) {
                if ((double) class35.field527 == 3.0D) {
                    var16 = class82.field1598;
                }
                if ((double) class35.field527 == 4.0D) {
                    var16 = class224.field3812;
                }
                if ((double) class35.field527 == 6.0D) {
                    var16 = class263.field4621;
                }
                if ((double) class35.field527 == 8.0D) {
                    var16 = class145.field2643;
                }
            }
            if (var15 == 2) {
                var14 = 16755200;
                if ((double) class35.field527 == 3.0D) {
                    var16 = class263.field4621;
                }
                if ((double) class35.field527 == 4.0D) {
                    var16 = class145.field2643;
                }
                if ((double) class35.field527 == 6.0D) {
                    var16 = class189.field3280;
                }
                if ((double) class35.field527 == 8.0D) {
                    var16 = class240.field4169;
                }
            }
            if (class178.field3122.field2166[var9] != -1) {
                var14 = class178.field3122.field2166[var9];
            }
            if (var16 != null) {
                class66[] var17 = new class66[class178.field3122.field2161[var9].method466(60, 74) + 1];
                class176.field3103.method216(class178.field3122.field2161[var9], (int[]) null, var17);
                int var18 = var17.length;
                int var19 = var13 - var16.method1453() * (var18 - 1) / 2;
                int var20 = var19 + var16.method1455() / 2;
                for (int var21 = 0; var21 < var18; var21++) {
                    class66 var22 = var18 - 1 == var21 ? var17[var21] : var17[var21].method477(0, (byte) -74, var17[var21].method460((byte) -112) - 4);
                    var16.method1456(var22, var12, var20, var14, true);
                    var20 += var16.method1453();
                }
            }
            var9++;
        }
        field3363++;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V")
    public static final void method1272(boolean arg0) {
        if (arg0) {
            class30.field453 = class70.field1409;
            class110.field2124 = class215.field3707;
        } else {
            class30.field453 = class250.field4412;
            class110.field2124 = class158.field2858;
        }
        class131.field2449 = class110.field2124.length;
    }
}

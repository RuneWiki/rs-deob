import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class40 extends class162 {

    @OriginalMember(owner = "client!bn", name = "y", descriptor = "Lll;")
    public class54 field495 = new class54();

    @OriginalMember(owner = "client!bn", name = "K", descriptor = "Llo;")
    public class325 field505 = new class325();

    @OriginalMember(owner = "client!bn", name = "z", descriptor = "Lld;")
    private class207 field496;

    @OriginalMember(owner = "client!bn", name = "B", descriptor = "I")
    public static int field498 = 2;

    @OriginalMember(owner = "client!bn", name = "L", descriptor = "Z")
    public static boolean field506 = true;

    @OriginalMember(owner = "client!bn", name = "H", descriptor = "Z")
    public static boolean field503 = false;

    @OriginalMember(owner = "client!bn", name = "I", descriptor = "F")
    public static float field504;

    @OriginalMember(owner = "client!bn", name = "s", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!bn", name = "t", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!bn", name = "w", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!bn", name = "x", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!bn", name = "A", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!bn", name = "C", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!bn", name = "D", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!bn", name = "E", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!bn", name = "F", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!bn", name = "M", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!bn", name = "v", descriptor = "[[S")
    public static short[][] field492;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILf;)V", line = 6)
    public static final void method280(int arg0, class239 arg1) {
        int var2 = -6 / ((55 - arg0) / 53);
        field507++;
        class96 var3 = (class96) class169.field2344.method2279(class201.method1476(-121, arg1.field3475), 58);
        if (var3 == null) {
            class1.method2(128, (class219) null, arg1.field4842[0], (class169) null, arg1.field4936[0], arg1, 0, class56.field724);
        } else {
            var3.method693(-77);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZB)V", line = 23)
    public static final void method281(boolean arg0, byte arg1) {
        class82.field1061 = 0;
        class287.field4140 = null;
        class38.field474 = (byte[][][]) null;
        if (arg0 && class38.field458 != null) {
            class234.field3349 = class38.field458.field4548;
        } else {
            class234.field3349 = -1;
        }
        class23.field260 = null;
        class38.field482 = null;
        class38.field469 = (int[][][]) null;
        class38.field470 = (byte[][][]) null;
        class38.field478 = (byte[][][]) null;
        class38.field480 = (int[][][]) null;
        field489++;
        class38.field473 = (byte[][][]) null;
        if (arg1 != -93) {
            return;
        }
        class38.field477 = (byte[][][]) null;
        class38.field458 = null;
        class38.field457.method744(-15997);
        class288.field4163 = null;
        class74.field976 = null;
        class254.field3707 = null;
        class216.field3057 = null;
        class125.field1672 = null;
        class253.field3694 = null;
        class83.field1069 = -1;
        class38.field460 = null;
        class196.field2703 = null;
        class176.field2411 = null;
        class195.field2694 = null;
        class282.field4021 = null;
        class323.field4744 = -1;
        class65.method472(arg1 ^ 0x3A);
        class271.field3887 = null;
        class217.field3072 = null;
        class319.field4693 = null;
        class341.method2367(128, 64, -61);
        class229.method1641(64, (byte) 119);
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)V", line = 74)
    public final void method282(int arg0) {
        field500++;
        this.field505.method282(arg0);
        for (class122 var2 = (class122) this.field495.method413(1253231568); var2 != null; var2 = (class122) this.field495.method419(22)) {
            if (!this.field496.method1513(37, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field1626 >= var3) {
                        this.method287(-1, var3, var2);
                        var2.field1626 -= var3;
                        break;
                    }
                    this.method287(-1, var2.field1626, var2);
                    var3 -= var2.field1626;
                } while (!this.field496.method1528(var2, 0, var3, -109, (int[]) null));
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILej;I[IIB)V", line = 109)
    private final void method283(int arg0, class122 arg1, int arg2, int[] arg3, int arg4, byte arg5) {
        if ((this.field496.field2917[arg1.field1624] & 0x4) != 0 && arg1.field1609 < 0) {
            int var7 = this.field496.field2882[arg1.field1624] / class85.field1091;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field1615) / var7;
                if (arg0 < var8) {
                    arg1.field1615 += arg0 * var7;
                    break;
                }
                arg1.field1601.method286(arg3, arg2, var8);
                arg2 += var8;
                int var9 = 262144 / var7;
                class113 var10 = arg1.field1601;
                int var11 = class85.field1091 / 100;
                arg0 -= var8;
                if (var11 > var9) {
                    var11 = var9;
                }
                arg1.field1615 += var7 * var8 - 1048576;
                if (this.field496.field2902[arg1.field1624] == 0) {
                    arg1.field1601 = class113.method832(arg1.field1602, var10.method816(), var10.method829(), var10.method836());
                } else {
                    arg1.field1601 = class113.method832(arg1.field1602, var10.method816(), 0, var10.method836());
                    this.field496.method1524(arg1, (byte) 70, arg1.field1617.field3950[arg1.field1618] < 0);
                    arg1.field1601.method827(var11, var10.method829());
                }
                if (arg1.field1617.field3950[arg1.field1618] < 0) {
                    arg1.field1601.method807(-1);
                }
                var10.method808(var11);
                var10.method286(arg3, arg2, arg4 - arg2);
                if (var10.method820()) {
                    this.field505.method2250(var10);
                }
            }
        }
        field493++;
        if (arg5 < 50) {
            field506 = false;
        }
        arg1.field1601.method286(arg3, arg2, arg0);
    }

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "()Ltf;", line = 171)
    public final class162 method284() {
        field490++;
        class122 var1 = (class122) this.field495.method413(1253231568);
        if (var1 == null) {
            return null;
        } else if (var1.field1601 == null) {
            return this.method285();
        } else {
            return var1.field1601;
        }
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "()Ltf;", line = 187)
    public final class162 method285() {
        field501++;
        class122 var1;
        do {
            var1 = (class122) this.field495.method419(13);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1601 == null);
        return var1.field1601;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "([III)V", line = 208)
    public final void method286(int[] arg0, int arg1, int arg2) {
        field502++;
        this.field505.method286(arg0, arg1, arg2);
        for (class122 var4 = (class122) this.field495.method413(1253231568); var4 != null; var4 = (class122) this.field495.method419(108)) {
            if (!this.field496.method1513(102, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field1626 >= var6) {
                        this.method283(var6, var4, var5, arg0, var5 + var6, (byte) 127);
                        var4.field1626 -= var6;
                        break;
                    }
                    this.method283(var4.field1626, var4, var5, arg0, var5 + var6, (byte) 72);
                    var6 -= var4.field1626;
                    var5 += var4.field1626;
                } while (!this.field496.method1528(var4, var5, var6, -45, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILej;)V", line = 248)
    private final void method287(int arg0, int arg1, class122 arg2) {
        field491++;
        if (~(this.field496.field2917[arg2.field1624] & 0x4) != arg0 && arg2.field1609 < 0) {
            int var4 = this.field496.field2882[arg2.field1624] / class85.field1091;
            int var5 = (var4 + 1048575 - arg2.field1615) / var4;
            arg2.field1615 = arg1 * var4 + arg2.field1615 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field496.field2902[arg2.field1624] == 0) {
                    arg2.field1601 = class113.method832(arg2.field1602, arg2.field1601.method816(), arg2.field1601.method829(), arg2.field1601.method836());
                } else {
                    arg2.field1601 = class113.method832(arg2.field1602, arg2.field1601.method816(), 0, arg2.field1601.method836());
                    this.field496.method1524(arg2, (byte) 93, arg2.field1617.field3950[arg2.field1618] < 0);
                }
                if (arg2.field1617.field3950[arg2.field1618] < 0) {
                    arg2.field1601.method807(-1);
                }
                arg1 = arg2.field1615 / var4;
            }
        }
        arg2.field1601.method282(arg1);
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)V", line = 286)
    public static void method288(int arg0) {
        if (arg0 != 1970740129) {
            method281(false, (byte) 82);
        }
        field492 = (short[][]) null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "()I", line = 296)
    public final int method289() {
        field497++;
        return 0;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIIIII)V", line = 311)
    public static final void method290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field494++;
        int var8 = 0;
        int var9 = arg7;
        int var10 = arg5 - arg2;
        int var11 = arg0;
        int var12 = arg7 - arg2;
        int var13 = arg5 * arg5;
        int var14 = arg7 * arg7;
        int var15 = var10 * var10;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var16 << 1;
        int var19 = var13 << 1;
        int var20 = var15 << 1;
        int var21 = arg7 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var19);
        int var25 = (1 - var22) * var15 + var18;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var16 << 2;
        int var30 = var15 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var19;
        int var33 = var18 * 3;
        int var34 = var28;
        int var35 = (var22 - 3) * var20;
        int var36 = var29;
        int var37 = (arg7 - 1) * var27;
        int var38 = (var12 - 1) * var30;
        int[] var39 = class331.field4902[arg4];
        class96.method697((byte) 115, var39, arg3, arg1 - arg5, -var10 + arg1);
        class96.method697((byte) 115, var39, arg6, arg1 - var10, arg1 + var10);
        class96.method697((byte) 115, var39, arg3, arg1 + var10, arg1 - -arg5);
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var31 += var28;
                    var8++;
                    var24 += var34;
                    var34 += var28;
                }
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var34;
                var31 += var28;
                var8++;
                var34 += var28;
            }
            var23 += -var37;
            int var40 = arg1 - var8;
            boolean var41 = var12 >= var9;
            int var42 = arg1 + var8;
            var37 -= var27;
            var9--;
            var24 += -var32;
            int var43 = arg4 + var9;
            var32 -= var27;
            if (var41) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var11++;
                        var26 += var36;
                        var25 += var33;
                        var36 += var29;
                        var33 += var29;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var33 += var29;
                    var11++;
                    var26 += var36;
                    var36 += var29;
                }
                var26 += -var35;
                var25 += -var38;
                var38 -= var30;
                var35 -= var30;
            }
            int var44 = arg4 - var9;
            if (var41) {
                int var45 = arg1 - var11;
                class96.method697((byte) 115, class331.field4902[var44], arg3, var40, var45);
                int var46 = arg1 + var11;
                class96.method697((byte) 115, class331.field4902[var44], arg6, var45, var46);
                class96.method697((byte) 115, class331.field4902[var44], arg3, var46, var42);
                class96.method697((byte) 115, class331.field4902[var43], arg3, var40, var45);
                class96.method697((byte) 115, class331.field4902[var43], arg6, var45, var46);
                class96.method697((byte) 115, class331.field4902[var43], arg3, var46, var42);
            } else {
                class96.method697((byte) 115, class331.field4902[var44], arg3, var40, var42);
                class96.method697((byte) 115, class331.field4902[var43], arg3, var40, var42);
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lld;)V", line = 493)
    public class40(class207 arg0) {
        this.field496 = arg0;
    }
}

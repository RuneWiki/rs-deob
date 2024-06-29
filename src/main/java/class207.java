import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class207 {

    @OriginalMember(owner = "client!si", name = "C", descriptor = "I")
    private int field3573 = 0;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    private int field3553;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "I")
    private int field3563;

    @OriginalMember(owner = "client!si", name = "w", descriptor = "I")
    private int field3567;

    @OriginalMember(owner = "client!si", name = "v", descriptor = "[[I")
    public int[][] field3566;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "Lmb;")
    public static class96 field3562 = class243.method1708(" GMT", (byte) 95);

    @OriginalMember(owner = "client!si", name = "x", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3568 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!si", name = "G", descriptor = "Lmb;")
    public static class96 field3577 = class243.method1708(" )2> <col=ffff00>", (byte) 123);

    @OriginalMember(owner = "client!si", name = "F", descriptor = "Z")
    public static boolean field3576 = false;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!si", name = "t", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!si", name = "u", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!si", name = "y", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!si", name = "z", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!si", name = "B", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!si", name = "A", descriptor = "Ljava/awt/Frame;")
    public static Frame field3571;

    @OriginalMember(owner = "client!si", name = "E", descriptor = "Ljava/lang/String;")
    public static String field3575;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "[Lka;")
    public static class174[] field3560;

    @OriginalMember(owner = "client!si", name = "D", descriptor = "[[[I")
    public static int[][][] field3574;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILff;Lff;)V")
    public static final void method1425(int arg0, class3 arg1, class3 arg2) {
        class225.field3821 = arg1;
        field3555++;
        if (arg0 >= 23) {
            class192.field3317 = arg2;
            class91.field1511 = class192.field3317.method37(3, (byte) -106);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)I")
    public static final int method1426(int arg0) {
        field3564++;
        if (arg0 != 16) {
            method1442(7);
        }
        return 16;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IBI)V")
    public final void method1427(int arg0, byte arg1, int arg2) {
        field3561++;
        int var4 = arg0 - this.field3573;
        if (arg1 > 40) {
            int var5 = arg2 - this.field3563;
            this.field3566[var5][var4] = class45.method348(this.field3566[var5][var4], 262144);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V")
    public static final void method1428(boolean arg0) {
        field3546++;
        class1.field4.method1020(23608);
        int var1 = class1.field4.method1017((byte) 126, 8);
        if (var1 < class132.field2375) {
            for (int var2 = var1; var2 < class132.field2375; var2++) {
                class41.field693[class105.field1764++] = class222.field3797[var2];
            }
        }
        if (var1 > class132.field2375) {
            throw new RuntimeException("gnpov1");
        }
        class132.field2375 = 0;
        if (arg0) {
            return;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class222.field3797[var3];
            class197 var5 = class86.field1450[var4];
            int var6 = class1.field4.method1017((byte) 126, 1);
            if (var6 == 0) {
                class222.field3797[class132.field2375++] = var4;
                var5.field4510 = class236.field4053;
            } else {
                int var7 = class1.field4.method1017((byte) 124, 2);
                if (var7 == 0) {
                    class222.field3797[class132.field2375++] = var4;
                    var5.field4510 = class236.field4053;
                    class78.field1335[class157.field2745++] = var4;
                } else if (var7 == 1) {
                    class222.field3797[class132.field2375++] = var4;
                    var5.field4510 = class236.field4053;
                    int var8 = class1.field4.method1017((byte) 127, 3);
                    var5.method1794(-41, var8, false);
                    int var9 = class1.field4.method1017((byte) 124, 1);
                    if (var9 == 1) {
                        class78.field1335[class157.field2745++] = var4;
                    }
                } else if (var7 == 2) {
                    class222.field3797[class132.field2375++] = var4;
                    var5.field4510 = class236.field4053;
                    int var10 = class1.field4.method1017((byte) 124, 3);
                    var5.method1794(67, var10, true);
                    int var11 = class1.field4.method1017((byte) 127, 3);
                    var5.method1794(-15, var11, true);
                    int var12 = class1.field4.method1017((byte) 124, 1);
                    if (var12 == 1) {
                        class78.field1335[class157.field2745++] = var4;
                    }
                } else if (var7 == 3) {
                    class41.field693[class105.field1764++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V")
    public final void method1429(int arg0) {
        field3551++;
        if (arg0 >= -39) {
            field3574 = null;
        }
        for (int var2 = 0; var2 < this.field3553; var2++) {
            for (int var3 = 0; var3 < this.field3567; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field3553 - 5 || (this.field3567 - 5) <= var3) {
                    this.field3566[var2][var3] = 16777215;
                } else {
                    this.field3566[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/lang/Object;ILgd;)V")
    public static final void method1430(Object arg0, int arg1, class123 arg2) {
        if (arg1 <= 72) {
            field3560 = null;
        }
        field3549++;
        if (arg2.field2282 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field2282.peekEvent() != null; var3++) {
            class226.method1543(1L, -738);
        }
        if (arg0 != null) {
            arg2.field2282.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIIIIII)Z")
    private final boolean method1431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != -17236) {
            return true;
        }
        int var11 = arg5 + arg4;
        int var12 = arg6 + arg7;
        field3556++;
        int var13 = arg2 + arg8;
        int var14 = arg0 + arg1;
        if (arg8 >= arg6 && arg8 < var12) {
            if (arg0 == var11 && (arg9 & 0x4) == 0) {
                int var15 = arg8;
                int var16 = var13 > var12 ? var12 : var13;
                while (var15 < var16) {
                    if ((this.field3566[var15 - this.field3563][var11 - this.field3573 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg5 == var14 && (arg9 & 0x1) == 0) {
                int var17 = var13 > var12 ? var12 : var13;
                for (int var18 = arg8; var18 < var17; var18++) {
                    if ((this.field3566[var18 - this.field3563][arg5 - this.field3573] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg6 < var13 && var13 <= var12) {
            if (arg0 == var11 && (arg9 & 0x4) == 0) {
                for (int var19 = arg6; var19 < var13; var19++) {
                    if ((this.field3566[var19 - this.field3563][var11 - this.field3573 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg5 == var14 && (arg9 & 0x1) == 0) {
                for (int var20 = arg6; var20 < var13; var20++) {
                    if ((this.field3566[var20 - this.field3563][arg5 - this.field3573] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg0 <= arg5 && var14 > arg5) {
            if (arg6 == var13 && (arg9 & 0x8) == 0) {
                int var21 = arg5;
                int var22 = var14 >= var11 ? var11 : var14;
                while (var21 < var22) {
                    if ((this.field3566[var13 - this.field3563 - 1][var21 - this.field3573] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg8 == var12 && (arg9 & 0x2) == 0) {
                int var23 = arg5;
                int var24 = var11 > var14 ? var14 : var11;
                while (var23 < var24) {
                    if ((this.field3566[arg8 - this.field3563][var23 - this.field3573] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (var11 > arg0 && var11 <= var14) {
            if (arg6 == var13 && (arg9 & 0x8) == 0) {
                for (int var25 = arg0; var25 < var11; var25++) {
                    if ((this.field3566[var13 - this.field3563 - 1][var25 - this.field3573] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg8 == var12 && (arg9 & 0x2) == 0) {
                for (int var26 = arg0; var26 < var11; var26++) {
                    if ((this.field3566[arg8 - this.field3563][var26 - this.field3573] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)V")
    public final void method1432(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field3563;
        int var5 = arg1 - this.field3573;
        field3572++;
        this.field3566[var4][var5] = class130.method985(this.field3566[var4][var5], -262145);
        int var6 = 64 / ((-arg0 - 74) / 47);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIIIBI)Z")
    private final boolean method1433(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field3547++;
        if (arg0 + arg5 <= arg1 || arg5 >= (arg1 + arg4)) {
            return false;
        } else if (arg8 + arg6 > arg2 && arg8 < (arg2 + arg3)) {
            int var10 = -117 / ((-arg7 - 71) / 36);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIII)V")
    public static final void method1434(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3559++;
        for (class38 var5 = (class38) class217.field3726.method1811(2); var5 != null; var5 = (class38) class217.field3726.method1810(false)) {
            class134.method1004(arg4 - 159, arg0, var5, arg1, arg3, arg2);
        }
        for (class38 var6 = (class38) class248.field4296.method1811(arg4 ^ 0x42); var6 != null; var6 = (class38) class248.field4296.method1810(false)) {
            byte var10 = 1;
            if (var6.field642.field4573 == var6.field642.field4515) {
                var10 = 0;
            } else if (var6.field642.field4573 == var6.field642.field4555) {
                var10 = 2;
            }
            if (var6.field666 != var10) {
                int var11 = class27.method180((byte) 122, var6.field642);
                if (var6.field649 != var11) {
                    if (var6.field671 != null) {
                        class120.field2228.method1550(var6.field671);
                        var6.field671 = null;
                    }
                    var6.field649 = var11;
                }
                var6.field666 = var10;
            }
            var6.field647 = var6.field642.field4511;
            var6.field646 = var6.field642.field4511 + var6.field642.method366((byte) 95) * 64;
            var6.field663 = var6.field642.field4533;
            var6.field644 = var6.field642.field4533 + var6.field642.method366((byte) 95) * 64;
            class134.method1004(85, arg0, var6, arg1, arg3, arg2);
        }
        if (arg4 != 64) {
            return;
        }
        for (class38 var7 = (class38) class260.field4525.method1074(false); var7 != null; var7 = (class38) class260.field4525.method1087((byte) -123)) {
            byte var8 = 1;
            if (var7.field669.field4573 == var7.field669.field4515) {
                var8 = 0;
            } else if (var7.field669.field4573 == var7.field669.field4555) {
                var8 = 2;
            }
            if (var7.field666 != var8) {
                int var9 = class134.method1003(var7.field669, -56);
                if (var7.field649 != var9) {
                    if (var7.field671 != null) {
                        class120.field2228.method1550(var7.field671);
                        var7.field671 = null;
                    }
                    var7.field649 = var9;
                }
                var7.field666 = var8;
            }
            var7.field647 = var7.field669.field4511;
            var7.field646 = var7.field669.field4511 + (var7.field669.method366((byte) 95) * 64);
            var7.field663 = var7.field669.field4533;
            var7.field644 = var7.field669.field4533 + (var7.field669.method366((byte) 95) * 64);
            class134.method1004(-72, arg0, var7, arg1, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method1435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3569++;
        if (arg4 == 1) {
            if (arg1 == arg5 && arg0 == arg2) {
                return true;
            }
        } else if (arg5 >= arg1 && arg1 + arg4 - 1 >= arg5 && arg2 <= arg2 && arg2 <= arg2 + arg4 - 1) {
            return true;
        }
        int var9 = arg0 - this.field3573;
        int var10 = arg1 - this.field3563;
        int var11 = arg5 - this.field3563;
        int var12 = arg2 - this.field3573;
        if (arg3 != 6831) {
            return false;
        }
        if (arg4 == 1) {
            if (arg7 == 6 || arg7 == 7) {
                if (arg7 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field3566[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field3566[var10][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var11 - 1 == var10 && var9 == var12 && (this.field3566[var10][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field3566[var10][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var11 - 1) == var10 && var9 == var12 && (this.field3566[var10][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field3566[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var11 + 1) == var10 && var9 == var12 && (this.field3566[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field3566[var10][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 8) {
                if (var10 == var11 && var12 + 1 == var9 && (this.field3566[var10][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var12 - 1 == var9 && (this.field3566[var10][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var10 && var9 == var12 && (this.field3566[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var9 == var12 && (this.field3566[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 + arg4 - 1;
            int var14 = var10 + arg4 - 1;
            if (arg7 == 6 || arg7 == 7) {
                if (arg7 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if ((var11 + 1) == var10 && var12 >= var9 && var12 <= var13 && (this.field3566[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var14 && (var12 - arg4) == var9 && (this.field3566[var11][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var11 - arg4 == var10 && var12 >= var9 && var12 <= var13 && (this.field3566[var14][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var11 <= var14 && var12 - arg4 == var9 && (this.field3566[var11][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var11 - arg4 == var10 && var12 >= var9 && var12 <= var13 && (this.field3566[var14][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var14 >= var11 && (var12 + 1) == var9 && (this.field3566[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var11 + 1 == var10 && var12 >= var9 && var12 <= var13 && (this.field3566[var10][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var11 && var14 >= var11 && (var12 + 1) == var9 && (this.field3566[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 8) {
                if (var10 <= var11 && var14 >= var11 && var12 + 1 == var9 && (this.field3566[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 <= var11 && var11 <= var14 && (var12 - arg4) == var9 && (this.field3566[var11][var13] & 0x2) == 0) {
                    return true;
                }
                if (var11 - arg4 == var10 && var9 <= var12 && var12 <= var13 && (this.field3566[var14][var12] & 0x8) == 0) {
                    return true;
                }
                if (var11 + 1 == var10 && var9 <= var12 && var12 <= var13 && (this.field3566[var10][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IZII)V")
    private final void method1436(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            field3570++;
            this.field3566[arg3][arg2] = class130.method985(this.field3566[arg3][arg2], ~arg0);
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(IIIIIIII)Z")
    public final boolean method1437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3565++;
        if (arg0 == 1) {
            if (arg1 == arg7 && arg3 == arg5) {
                return true;
            }
        } else if (arg7 >= arg1 && arg0 + arg1 - 1 >= arg7 && arg3 >= arg3 && arg3 <= arg0 + arg3 - 1) {
            return true;
        }
        int var9 = arg3 - this.field3573;
        int var10 = arg7 - this.field3563;
        int var11 = arg1 - this.field3563;
        int var12 = arg5 - this.field3573;
        if (arg0 == arg4) {
            if (arg2 == 0) {
                if (arg6 == 0) {
                    if (var10 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field3566[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field3566[var11][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var10 == var11 && (var9 + 1) == var12) {
                        return true;
                    }
                    if (var10 - 1 == var11 && var9 == var12 && (this.field3566[var11][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field3566[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var10 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field3566[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field3566[var11][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 == var11 && (var9 - 1) == var12) {
                        return true;
                    }
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field3566[var11][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field3566[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg6 == 0) {
                    if ((var10 - 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field3566[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field3566[var11][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field3566[var11][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field3566[var11][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var10 - 1 == var11 && var9 == var12 && (this.field3566[var11][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field3566[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var10 - 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field3566[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field3566[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var10 == var11 && (var9 + 1) == var12 && (this.field3566[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var12 && (this.field3566[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var11 && var9 == var12 && (this.field3566[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var9 == var12 && (this.field3566[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg0 + var12 - 1;
            int var14 = arg0 + var11 - 1;
            if (arg2 == 0) {
                if (arg6 == 0) {
                    if (var10 - arg0 == var11 && var12 <= var9 && var13 >= var9) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var14 && var9 + 1 == var12 && (this.field3566[var10][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var14 && (var9 - arg0) == var12 && (this.field3566[var10][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var10 >= var11 && var14 >= var10 && var9 + 1 == var12) {
                        return true;
                    }
                    if ((var10 - arg0) == var11 && var9 >= var12 && var9 <= var13 && (this.field3566[var14][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 <= var9 && var9 <= var13 && (this.field3566[var11][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var10 + 1) == var11 && var9 >= var12 && var13 >= var9) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var14 && (var9 + 1) == var12 && (this.field3566[var10][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var14 && var9 - arg0 == var12 && (this.field3566[var10][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var10 >= var11 && var14 >= var10 && (var9 - arg0) == var12) {
                        return true;
                    }
                    if ((var10 - arg0) == var11 && var12 <= var9 && var9 <= var13 && (this.field3566[var14][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 <= var9 && var13 >= var9 && (this.field3566[var11][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg6 == 0) {
                    if ((var10 - arg0) == var11 && var9 >= var12 && var9 <= var13) {
                        return true;
                    }
                    if (var10 >= var11 && var14 >= var10 && var9 + 1 == var12) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 <= var9 && var9 <= var13 && (this.field3566[var11][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var14 && var9 - arg0 == var12 && (this.field3566[var10][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var10 - arg0) == var11 && var9 >= var12 && var13 >= var9 && (this.field3566[var14][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var14 >= var10 && (var9 + 1) == var12) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 >= var12 && var13 >= var9) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var14 && (var9 - arg0) == var12 && (this.field3566[var10][var13] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var10 - arg0) == var11 && var9 >= var12 && var9 <= var13 && (this.field3566[var14][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var14 && var9 + 1 == var12 && (this.field3566[var10][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 >= var12 && var9 <= var13) {
                        return true;
                    }
                    if (var10 >= var11 && var14 >= var10 && (var9 - arg0) == var12) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var10 - arg0) == var11 && var12 <= var9 && var13 >= var9) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var14 && (var9 + 1) == var12 && (this.field3566[var10][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 <= var9 && var13 >= var9 && (this.field3566[var11][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var14 >= var10 && var9 - arg0 == var12) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var11 <= var10 && var14 >= var10 && var9 + 1 == var12 && (this.field3566[var10][var12] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 >= var11 && var10 <= var14 && (var9 - arg0) == var12 && (this.field3566[var10][var13] & 0x12C0102) == 0) {
                    return true;
                }
                if ((var10 - arg0) == var11 && var12 <= var9 && var13 >= var9 && (this.field3566[var14][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if ((var10 + 1) == var11 && var9 >= var12 && var9 <= var13 && (this.field3566[var11][var9] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIZ)V")
    public final void method1438(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = 10 % ((arg2 + 30) / 38);
        int var8 = arg4 - this.field3573;
        int var9 = 256;
        if (arg5) {
            var9 += 131072;
        }
        int var10 = arg3 - this.field3563;
        field3554++;
        for (int var11 = var10; var11 < (arg1 + var10); var11++) {
            if (var11 >= 0 && var11 < this.field3553) {
                for (int var12 = var8; var12 < arg0 + var8; var12++) {
                    if (var12 >= 0 && this.field3567 > var12) {
                        this.method1444(var12, 16777215, var11, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIZIII)V")
    public final void method1439(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg4 - this.field3563;
        field3550++;
        int var8 = arg1 - this.field3573;
        if (arg5 == 0) {
            if (arg0 == 0) {
                this.method1436(128, false, var8, var7);
                this.method1436(8, false, var8, var7 - 1);
            }
            if (arg0 == 1) {
                this.method1436(2, false, var8, var7);
                this.method1436(32, false, var8 + 1, var7);
            }
            if (arg0 == 2) {
                this.method1436(8, false, var8, var7);
                this.method1436(128, false, var8, var7 + 1);
            }
            if (arg0 == 3) {
                this.method1436(32, false, var8, var7);
                this.method1436(2, false, var8 - 1, var7);
            }
        }
        if (arg3 != 779) {
            field3571 = null;
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg0 == 0) {
                this.method1436(1, false, var8, var7);
                this.method1436(16, false, var8 + 1, var7 + -1);
            }
            if (arg0 == 1) {
                this.method1436(4, false, var8, var7);
                this.method1436(64, false, var8 + 1, var7 + 1);
            }
            if (arg0 == 2) {
                this.method1436(16, false, var8, var7);
                this.method1436(1, false, var8 - 1, var7 - -1);
            }
            if (arg0 == 3) {
                this.method1436(64, false, var8, var7);
                this.method1436(4, false, var8 - 1, var7 + -1);
            }
        }
        if (arg5 == 2) {
            if (arg0 == 0) {
                this.method1436(130, false, var8, var7);
                this.method1436(8, false, var8, var7 - 1);
                this.method1436(32, false, var8 + 1, var7);
            }
            if (arg0 == 1) {
                this.method1436(10, false, var8, var7);
                this.method1436(32, false, var8 + 1, var7);
                this.method1436(128, false, var8, var7 + 1);
            }
            if (arg0 == 2) {
                this.method1436(40, false, var8, var7);
                this.method1436(128, false, var8, var7 + 1);
                this.method1436(2, false, var8 - 1, var7);
            }
            if (arg0 == 3) {
                this.method1436(160, false, var8, var7);
                this.method1436(2, false, var8 - 1, var7);
                this.method1436(8, false, var8, var7 - 1);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg5 == 0) {
            if (arg0 == 0) {
                this.method1436(65536, false, var8, var7);
                this.method1436(4096, false, var8, var7 - 1);
            }
            if (arg0 == 1) {
                this.method1436(1024, false, var8, var7);
                this.method1436(16384, false, var8 + 1, var7);
            }
            if (arg0 == 2) {
                this.method1436(4096, false, var8, var7);
                this.method1436(65536, false, var8, var7 + 1);
            }
            if (arg0 == 3) {
                this.method1436(16384, false, var8, var7);
                this.method1436(1024, false, var8 - 1, var7);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg0 == 0) {
                this.method1436(512, false, var8, var7);
                this.method1436(8192, false, var8 + 1, var7 + -1);
            }
            if (arg0 == 1) {
                this.method1436(2048, false, var8, var7);
                this.method1436(32768, false, var8 + 1, var7 + 1);
            }
            if (arg0 == 2) {
                this.method1436(8192, false, var8, var7);
                this.method1436(512, false, var8 - 1, var7 - -1);
            }
            if (arg0 == 3) {
                this.method1436(32768, false, var8, var7);
                this.method1436(2048, false, var8 - 1, var7 + -1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method1436(66560, false, var8, var7);
            this.method1436(4096, false, var8, var7 - 1);
            this.method1436(16384, false, var8 + 1, var7);
        }
        if (arg0 == 1) {
            this.method1436(5120, false, var8, var7);
            this.method1436(16384, false, var8 + 1, var7);
            this.method1436(65536, false, var8, var7 + 1);
        }
        if (arg0 == 2) {
            this.method1436(20480, false, var8, var7);
            this.method1436(65536, false, var8, var7 + 1);
            this.method1436(1024, false, var8 - 1, var7);
        }
        if (arg0 == 3) {
            this.method1436(81920, false, var8, var7);
            this.method1436(1024, false, var8 - 1, var7);
            this.method1436(4096, false, var8, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method1440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3557++;
        if (arg1 > 1) {
            return this.method1433(arg5, arg6, arg2, arg1, arg1, arg7, arg3, (byte) -108, arg0) ? true : this.method1431(arg0, arg3, arg1, -17236, arg1, arg2, arg7, arg5, arg6, arg4);
        }
        int var10 = arg7 + arg5 - 1;
        int var11 = arg0 + arg3 - 1;
        if (arg7 <= arg6 && var10 >= arg6 && arg0 <= arg2 && var11 >= arg2) {
            return true;
        } else if (arg7 - 1 == arg6 && arg2 >= arg0 && arg2 <= var11 && (this.field3566[arg6 - this.field3563][arg2 - this.field3573] & 0x8) == 0 && (arg4 & 0x8) == 0) {
            return true;
        } else if (arg8 + var10 == arg6 && arg0 <= arg2 && var11 >= arg2 && (this.field3566[arg6 - this.field3563][arg2 - this.field3573] & 0x80) == 0 && (arg4 & 0x2) == 0) {
            return true;
        } else if (arg0 - 1 == arg2 && arg6 >= arg7 && var10 >= arg6 && (this.field3566[arg6 - this.field3563][arg2 - this.field3573] & 0x2) == 0 && (arg4 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg2 && arg6 >= arg7 && var10 >= arg6 && (this.field3566[arg6 - this.field3563][arg2 - this.field3573] & 0x20) == 0 && (arg4 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(III)V")
    public final void method1441(int arg0, int arg1, int arg2) {
        field3545++;
        int var4 = arg0 - this.field3573;
        int var5 = arg1 - this.field3563;
        if (arg2 != 3) {
            field3576 = false;
        }
        this.field3566[var5][var4] = class45.method348(this.field3566[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(I)V")
    public static void method1442(int arg0) {
        field3571 = null;
        field3577 = null;
        field3575 = null;
        field3562 = null;
        field3568 = null;
        field3574 = null;
        field3560 = null;
        if (arg0 != 0) {
            method1426(-126);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BIZIIII)V")
    public final void method1443(byte arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg1 - this.field3573;
        field3552++;
        if (arg5 == 1 || arg5 == 3) {
            int var9 = arg6;
            arg6 = arg4;
            arg4 = var9;
        }
        int var10 = arg3 - this.field3563;
        int var11 = 256;
        if (arg2) {
            var11 += 131072;
        }
        if (arg0 != 69) {
            field3574 = null;
        }
        for (int var12 = var10; var12 < var10 + arg6; var12++) {
            if (var12 >= 0 && this.field3553 > var12) {
                for (int var13 = var8; var13 < (arg4 + var8); var13++) {
                    if (var13 >= 0 && this.field3567 > var13) {
                        this.method1436(var11, false, var13, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIII)V")
    private final void method1444(int arg0, int arg1, int arg2, int arg3) {
        this.field3566[arg2][arg0] = class45.method348(this.field3566[arg2][arg0], arg3);
        field3558++;
        if (arg1 != 16777215) {
            method1434(-121, -8, 46, -10, -63);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IZIIII)V")
    public final void method1445(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg4 - this.field3573;
        int var8 = arg5 - this.field3563;
        field3548++;
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method1444(var7, 16777215, var8, 128);
                this.method1444(var7, 16777215, var8 - 1, 8);
            }
            if (arg2 == 1) {
                this.method1444(var7, 16777215, var8, 2);
                this.method1444(var7 + 1, 16777215, var8, 32);
            }
            if (arg2 == 2) {
                this.method1444(var7, 16777215, var8, 8);
                this.method1444(var7, 16777215, var8 + 1, 128);
            }
            if (arg2 == 3) {
                this.method1444(var7, 16777215, var8, 32);
                this.method1444(var7 - 1, 16777215, var8, 2);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method1444(var7, 16777215, var8, 1);
                this.method1444(var7 + 1, 16777215, var8 - 1, 16);
            }
            if (arg2 == 1) {
                this.method1444(var7, 16777215, var8, 4);
                this.method1444(var7 + 1, 16777215, var8 + 1, 64);
            }
            if (arg2 == 2) {
                this.method1444(var7, 16777215, var8, 16);
                this.method1444(var7 - 1, 16777215, var8 + 1, 1);
            }
            if (arg2 == 3) {
                this.method1444(var7, 16777215, var8, 64);
                this.method1444(var7 - 1, 16777215, var8 - 1, 4);
            }
        }
        if (arg3 < 32) {
            this.field3553 = 9;
        }
        if (arg0 == 2) {
            if (arg2 == 0) {
                this.method1444(var7, 16777215, var8, 130);
                this.method1444(var7, 16777215, var8 - 1, 8);
                this.method1444(var7 + 1, 16777215, var8, 32);
            }
            if (arg2 == 1) {
                this.method1444(var7, 16777215, var8, 10);
                this.method1444(var7 + 1, 16777215, var8, 32);
                this.method1444(var7, 16777215, var8 + 1, 128);
            }
            if (arg2 == 2) {
                this.method1444(var7, 16777215, var8, 40);
                this.method1444(var7, 16777215, var8 + 1, 128);
                this.method1444(var7 - 1, 16777215, var8, 2);
            }
            if (arg2 == 3) {
                this.method1444(var7, 16777215, var8, 160);
                this.method1444(var7 - 1, 16777215, var8, 2);
                this.method1444(var7, 16777215, var8 - 1, 8);
            }
        }
        if (!arg1) {
            return;
        }
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method1444(var7, 16777215, var8, 65536);
                this.method1444(var7, 16777215, var8 - 1, 4096);
            }
            if (arg2 == 1) {
                this.method1444(var7, 16777215, var8, 1024);
                this.method1444(var7 + 1, 16777215, var8, 16384);
            }
            if (arg2 == 2) {
                this.method1444(var7, 16777215, var8, 4096);
                this.method1444(var7, 16777215, var8 + 1, 65536);
            }
            if (arg2 == 3) {
                this.method1444(var7, 16777215, var8, 16384);
                this.method1444(var7 - 1, 16777215, var8, 1024);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method1444(var7, 16777215, var8, 512);
                this.method1444(var7 + 1, 16777215, var8 - 1, 8192);
            }
            if (arg2 == 1) {
                this.method1444(var7, 16777215, var8, 2048);
                this.method1444(var7 + 1, 16777215, var8 + 1, 32768);
            }
            if (arg2 == 2) {
                this.method1444(var7, 16777215, var8, 8192);
                this.method1444(var7 - 1, 16777215, var8 + 1, 512);
            }
            if (arg2 == 3) {
                this.method1444(var7, 16777215, var8, 32768);
                this.method1444(var7 - 1, 16777215, var8 - 1, 2048);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method1444(var7, 16777215, var8, 66560);
            this.method1444(var7, 16777215, var8 - 1, 4096);
            this.method1444(var7 + 1, 16777215, var8, 16384);
        }
        if (arg2 == 1) {
            this.method1444(var7, 16777215, var8, 5120);
            this.method1444(var7 + 1, 16777215, var8, 16384);
            this.method1444(var7, 16777215, var8 + 1, 65536);
        }
        if (arg2 == 2) {
            this.method1444(var7, 16777215, var8, 20480);
            this.method1444(var7, 16777215, var8 + 1, 65536);
            this.method1444(var7 - 1, 16777215, var8, 1024);
        }
        if (arg2 == 3) {
            this.method1444(var7, 16777215, var8, 81920);
            this.method1444(var7 - 1, 16777215, var8, 1024);
            this.method1444(var7, 16777215, var8 - 1, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(II)V")
    public class207(int arg0, int arg1) {
        this.field3553 = arg0;
        this.field3563 = 0;
        this.field3567 = arg1;
        this.field3566 = new int[this.field3553][this.field3567];
        this.method1429(-95);
    }
}

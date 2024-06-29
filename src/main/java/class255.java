import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class255 {

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "Z")
    public boolean field3534 = true;

    @OriginalMember(owner = "client!ku", name = "p", descriptor = "I")
    private int field3547 = -1;

    @OriginalMember(owner = "client!ku", name = "h", descriptor = "Lef;")
    private class338 field3539;

    @OriginalMember(owner = "client!ku", name = "l", descriptor = "I")
    private int field3543;

    @OriginalMember(owner = "client!ku", name = "m", descriptor = "Lgb;")
    private class143 field3544;

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "I")
    private int field3537;

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "I")
    private int field3533;

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "Lrt;")
    private class151 field3536;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "Lgu;")
    private class409 field3532;

    @OriginalMember(owner = "client!ku", name = "n", descriptor = "Lml;")
    private class264 field3545;

    @OriginalMember(owner = "client!ku", name = "k", descriptor = "I")
    public static int field3542 = 12;

    @OriginalMember(owner = "client!ku", name = "q", descriptor = "I")
    public static int field3548 = 0;

    @OriginalMember(owner = "client!ku", name = "g", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!ku", name = "i", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!ku", name = "j", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!ku", name = "o", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!ku", name = "r", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "[Z")
    public static boolean[] field3535;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)V")
    private final void method1527(byte arg0) {
        field3549++;
        if (!this.field3534) {
            return;
        }
        this.field3534 = false;
        byte[] var2 = this.field3544.field2048;
        int var3 = -21 % ((-arg0 - 79) / 45);
        byte[] var4 = class64.field873;
        int var5 = 0;
        int var6 = this.field3544.field2053;
        int var7 = this.field3537 + (this.field3544.field2053 * this.field3543);
        for (int var8 = -128; var8 < 0; var8++) {
            var5 = (var5 << 8) - var5;
            for (int var14 = -128; var14 < 0; var14++) {
                if (var2[var7++] != 0) {
                    var5++;
                }
            }
            var7 += var6 - 128;
        }
        if (this.field3545 != null && this.field3547 == var5) {
            this.field3534 = false;
            return;
        }
        this.field3547 = var5;
        int var9 = this.field3543 * var6 + this.field3537;
        int var10 = 0;
        for (int var11 = -128; var11 < 0; var11++) {
            for (int var12 = -128; var12 < 0; var12++) {
                if (var2[var9] == 0) {
                    int var13 = 0;
                    if (var2[var9 - 1] != 0) {
                        var13++;
                    }
                    if (var2[var9 + 1] != 0) {
                        var13++;
                    }
                    if (var2[var9 - var6] != 0) {
                        var13++;
                    }
                    if (var2[var6 + var9] != 0) {
                        var13++;
                    }
                    var4[var10++] = (byte) (var13 * 17);
                } else {
                    var4[var10++] = 68;
                }
                var9++;
            }
            var9 += this.field3544.field2053 - 128;
        }
        if (this.field3545 == null) {
            this.field3545 = new class264(this.field3539, 3553, 6406, 128, 128, false, class64.field873, 6406, false);
            this.field3545.method1579(-6746, false, false);
            this.field3545.method335((byte) 51, true);
        } else {
            this.field3545.method1584(0, 0, 128, 6406, 128, 0, false, 0, class64.field873, 0);
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IBLrt;)V")
    private final void method1528(int arg0, byte arg1, class151 arg2) {
        field3538++;
        if (arg0 != 0) {
            this.method1527((byte) -128);
            this.field3539.method1996(2, this.field3545);
            this.field3539.method1981((byte) 58, arg0, 0, 4, arg2);
            int var4 = -117 % ((arg1 - 75) / 46);
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V")
    public static void method1529(int arg0) {
        if (arg0 != 28166) {
            field3548 = 40;
        }
        field3535 = null;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "([BIII)V")
    public final void method1530(byte[] arg0, int arg1, int arg2, int arg3) {
        field3541++;
        if (arg2 != 10483) {
            this.field3533 = -38;
        }
        this.field3532.method1016(arg1 * this.field3539.method1946(1, arg3), arg0, arg3, (byte) -87);
        this.method1528(arg1, (byte) 5, this.field3532);
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lvj;")
    public static final class306 method1531(Throwable arg0, String arg1) {
        field3540++;
        class306 var2;
        if (arg0 instanceof class306) {
            var2 = (class306) arg0;
            var2.field4172 = var2.field4172 + ' ' + arg1;
        } else {
            var2 = new class306(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(II)I")
    public static int method1532(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lef;Lgb;Leg;IIIII)V")
    public class255(class338 arg0, class143 arg1, class70 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field3539 = arg0;
        this.field3543 = arg7;
        this.field3544 = arg1;
        this.field3537 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field2037 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field969[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field3533 = var10;
        if (var10 <= 0) {
            this.field3545 = null;
        } else {
            class391 var14 = new class391(var10 * 2);
            if (this.field3539.field4772) {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field2037 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field969[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method2355(1686288168, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field2037 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field969[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method2310((byte) 74, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field3536 = this.field3539.method1941(var14.field5719, false, 0, var14.field5678, 5123);
            this.field3532 = new class409(this.field3539, 5123, null, 1);
        }
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)V")
    public final void method1533(int arg0) {
        if (arg0 == -1) {
            field3546++;
            this.method1528(this.field3533, (byte) 122, this.field3536);
        }
    }
}

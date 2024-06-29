import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class243 extends class237 {

    @OriginalMember(owner = "client!daa", name = "y", descriptor = "I")
    private int field3555 = -1;

    @OriginalMember(owner = "client!daa", name = "C", descriptor = "I")
    private int field3559 = 0;

    @OriginalMember(owner = "client!daa", name = "M", descriptor = "I")
    private int field3569 = 0;

    @OriginalMember(owner = "client!daa", name = "N", descriptor = "I")
    private int field3570 = 0;

    @OriginalMember(owner = "client!daa", name = "U", descriptor = "I")
    private int field3577 = -32768;

    @OriginalMember(owner = "client!daa", name = "T", descriptor = "Z")
    public boolean field3576 = false;

    @OriginalMember(owner = "client!daa", name = "E", descriptor = "I")
    public int field3561;

    @OriginalMember(owner = "client!daa", name = "L", descriptor = "I")
    private int field3568;

    @OriginalMember(owner = "client!daa", name = "I", descriptor = "I")
    private int field3565;

    @OriginalMember(owner = "client!daa", name = "x", descriptor = "Laba;")
    private class224 field3554;

    @OriginalMember(owner = "client!daa", name = "S", descriptor = "Lbf;")
    public static class229 field3575 = new class229();

    @OriginalMember(owner = "client!daa", name = "u", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!daa", name = "v", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!daa", name = "w", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!daa", name = "z", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!daa", name = "A", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!daa", name = "B", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!daa", name = "D", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!daa", name = "F", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!daa", name = "H", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!daa", name = "J", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!daa", name = "K", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!daa", name = "O", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!daa", name = "P", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!daa", name = "Q", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!daa", name = "R", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!daa", name = "G", descriptor = "Lqv;")
    private class96 field3563;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(ILqa;IIZLse;I)V")
    public final void method160(int arg0, class167 arg1, int arg2, int arg3, boolean arg4, class198 arg5, int arg6) {
        if (arg2 == -4) {
            ++field3571;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(ILqa;Lr;)V")
    private final void method1564(int arg0, class167 arg1, class520 arg2) {
        ++field3567;
        class26[] var4 = arg2.method1964();
        if (arg0 != 0) {
            this.method1567(-85);
        }
        class200[] var5 = arg2.method1970();
        if ((this.field3563 == null || this.field3563.field1183) && (var4 != null || var5 != null)) {
            this.field3563 = class96.method552(class576.field8505);
        }
        if (this.field3563 != null) {
            this.field3563.method547(arg1, (long) class576.field8505, var4, var5, false);
            this.field3563.method557(super.field3457, super.field3469, super.field3459, super.field3472, super.field3462);
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(II)V")
    public final void method1565(int arg0, int arg1) {
        ++field3562;
        if (arg1 >= -40) {
            this.field3569 = -95;
        }
        if (!this.field3576) {
            this.field3570 += arg0;
            while (~this.field3554.field3307[this.field3559] > ~this.field3570) {
                this.field3570 -= this.field3554.field3307[this.field3559];
                ++this.field3559;
                if (this.field3559 >= this.field3554.field3296.length) {
                    this.field3576 = true;
                    break;
                }
            }
            if (!this.field3576) {
                class295.method1830(this.field3559, super.field3463, (byte) 112, super.field3457, this.field3554, false, super.field3464);
            }
        }
    }

    @OriginalMember(owner = "client!daa", name = "e", descriptor = "(I)I")
    public final int method159(int arg0) {
        ++field3564;
        int var2 = -14 % ((arg0 - -30) / 50);
        return this.field3577;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(ILqa;)Llb;")
    public final class239 method169(int arg0, class167 arg1) {
        ++field3557;
        class520 var3 = this.method1566(2048 | (~this.field3569 == -1 ? 0 : 5), 11342, arg1, this.field3568);
        if (var3 == null) {
            return null;
        } else {
            if (this.field3569 != 0) {
                var3.method1979(this.field3569 * 2048);
            }
            class105 var4 = arg1.method1038();
            var4.method613(super.field3464, super.field3460, super.field3463);
            if (arg0 != -911932384) {
                return null;
            } else {
                if (this.field3563 == null) {
                    var3.method1965(var4, (class525) null, 0);
                } else {
                    class510 var5 = this.field3563.method550();
                    arg1.method1005(var3, var5, var4, (class525) null, 0);
                }
                this.field3577 = var3.method1954();
                this.method1564(0, arg1, var3);
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IILqa;I)Lr;")
    private final class520 method1566(int arg0, int arg1, class167 arg2, int arg3) {
        ++field3560;
        class465 var5 = class138.field1821.method2251(arg3, false);
        class543 var6 = class562.field8337[super.field3457];
        if (arg1 != 11342) {
            this.method157((byte) -31, (class167) null);
        }
        class543 var7 = this.field3565 >= 3 ? null : class562.field8337[this.field3565 - -1];
        return this.field3576 ? var5.method2759(arg2, arg0, 0, class470.field7205, var6, super.field3460, true, (byte) -29, super.field3464, -1, -1, var7, super.field3463) : var5.method2759(arg2, arg0, this.field3570, class470.field7205, var6, super.field3460, true, (byte) -29, super.field3464, this.field3559, this.field3555, var7, super.field3463);
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(ILqa;IB)Z")
    public final boolean method164(int arg0, class167 arg1, int arg2, byte arg3) {
        ++field3573;
        return arg3 != 77;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)V")
    public final void method1567(int arg0) {
        if (this.field3563 != null) {
            this.field3563.method556();
        }
        if (arg0 != -1601970589) {
            this.field3561 = 35;
        }
        ++field3558;
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class243(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field3561 = arg1 + arg2;
        this.field3569 = arg12;
        this.field3568 = arg0;
        this.field3565 = arg4;
        class465 var14 = class138.field1821.method2251(this.field3568, false);
        int var15 = var14.field6708;
        if (~var15 != 0) {
            this.field3554 = class470.field7205.method3498(false, var15);
            this.field3576 = false;
        } else {
            this.field3576 = true;
        }
        if (this.field3561 == arg2) {
            class295.method1830(this.field3559, super.field3463, (byte) 61, super.field3457, this.field3554, false, super.field3464);
        }
    }

    @OriginalMember(owner = "client!daa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field3563 != null) {
            this.field3563.method556();
        }
        ++field3574;
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(Z)Z")
    public final boolean method167(boolean arg0) {
        if (!arg0) {
            this.field3559 = -94;
        }
        ++field3566;
        return false;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(BLqa;)Led;")
    public final class115 method157(byte arg0, class167 arg1) {
        ++field3552;
        int var3 = -89 / ((arg0 - 14) / 48);
        return null;
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(B)V")
    public final void method165(byte arg0) {
        ++field3572;
        if (arg0 == -33) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(ZBI)V")
    public static final void method1568(boolean arg0, byte arg1, int arg2) {
        if (~arg2 == -1) {
            class379.field5558 = class167.method1062(0, class94.field1158.field285 * 2, class110.field1401, class646.field9378, class39.field441, 0);
        } else {
            if (arg0) {
                class379.field5558 = class167.method1062(arg1 + 115, 0, class110.field1401, class646.field9378, class39.field441, 0);
                class379.field5558.method321(0);
                class166 var3 = class510.method3046(class297.field4346, class644.field9347, 0, -6724);
                class262 var4 = class379.field5558.method998(var3, class610.method3547(class371.field5368, class297.field4346, 0), true);
                class162.method946((byte) 101, var4, true, class288.field4237.method2953(arg1 + 3296, class77.field889));
                class390.method2356((byte) 115);
                class379.field5558.method1061(121);
            }
            try {
                class379.field5558 = class167.method1062(0, class94.field1158.field285 * 2, class110.field1401, class646.field9378, class39.field441, arg2);
                if (class379.field5558.method1030()) {
                    boolean var5 = true;
                    try {
                        var5 = ~jagmisc.getTotalPhysicalMemory() < -268435457L;
                    } catch (Throwable var7) {
                    }
                    class425 var6;
                    if (var5) {
                        var6 = class379.field5558.method1013(146800640);
                    } else {
                        var6 = class379.field5558.method1013(104857600);
                    }
                    class379.field5558.method971(var6);
                }
            } catch (Throwable var8) {
                class379.field5558 = class167.method1062(0, 0, class110.field1401, class646.field9378, class39.field441, 0);
                arg2 = 0;
            }
        }
        ++field3553;
        class239.field3499 = arg2;
        class409.method2437(3053);
        if (!class379.field5558.method955()) {
            class218.field3235 = 1;
        }
        class379.field5558.method1044(class218.field3235);
        class379.field5558.method981(0);
        class379.field5558.method972(8);
        class385.field5628 = class379.field5558.method1020();
        class237.field3470 = class379.field5558.method1020();
        class19.method88((byte) 51);
        class379.field5558.method953(!class94.field1158.field266);
        if (class379.field5558.method984()) {
            class99.method579((byte) -119, class94.field1158.field297);
        }
        class248.method1579(class382.field5586 >> 3, class35.field399 >> 3, class379.field5558, (byte) 65);
        class598.method3496(111);
        if (arg1 != -115) {
            field3575 = null;
        }
        class393.field5714 = false;
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(I)V")
    public static void method1569(int arg0) {
        if (arg0 == 7368) {
            field3575 = null;
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IC)Z")
    public static final boolean method1570(int arg0, char arg1) {
        ++field3551;
        if (arg0 != 0) {
            method1569(61);
        }
        return arg1 >= '0' && ~arg1 >= -58 || ~arg1 <= -66 && ~arg1 >= -91 || ~arg1 <= -98 && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Lqa;Z)V")
    public final void method166(class167 arg0, boolean arg1) {
        ++field3556;
        class520 var3 = this.method1566(0, 11342, arg0, this.field3568);
        if (var3 != null) {
            this.method1564(0, arg0, var3);
        }
        if (!arg1) {
            this.field3554 = null;
        }
    }

    static {
        new class487("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
    }
}

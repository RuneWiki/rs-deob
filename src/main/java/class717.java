import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class717 extends class227 {

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "I")
    public static int field10056;

    @OriginalMember(owner = "client!qp", name = "s", descriptor = "I")
    public static int field10057;

    @OriginalMember(owner = "client!qp", name = "v", descriptor = "I")
    public static int field10060;

    @OriginalMember(owner = "client!qp", name = "y", descriptor = "I")
    public static int field10063;

    @OriginalMember(owner = "client!qp", name = "z", descriptor = "I")
    public static int field10064;

    @OriginalMember(owner = "client!qp", name = "B", descriptor = "I")
    public static int field10065;

    @OriginalMember(owner = "client!qp", name = "C", descriptor = "I")
    public static int field10066;

    @OriginalMember(owner = "client!qp", name = "E", descriptor = "I")
    public static int field10067;

    @OriginalMember(owner = "client!qp", name = "G", descriptor = "I")
    public static int field10069;

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "Lit;")
    private class34 field10054;

    @OriginalMember(owner = "client!qp", name = "t", descriptor = "Lit;")
    private class34 field10058;

    @OriginalMember(owner = "client!qp", name = "u", descriptor = "Lit;")
    private class34 field10059;

    @OriginalMember(owner = "client!qp", name = "w", descriptor = "Lit;")
    private class34 field10061;

    @OriginalMember(owner = "client!qp", name = "x", descriptor = "Lit;")
    private class34 field10062;

    @OriginalMember(owner = "client!qp", name = "F", descriptor = "Lit;")
    public class34 field10068;

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "[I")
    public static int[] field10055;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
    public final void method576(int arg0) {
        super.method576(arg0);
        ++field10066;
        class325 var2 = (class325) super.field3638;
        this.field10068 = class451.method2768(super.field3635, -121, var2.field4801);
        this.field10061 = class451.method2768(super.field3635, -73, var2.field4796);
        this.field10058 = class451.method2768(super.field3635, -28, var2.field4795);
        this.field10062 = class451.method2768(super.field3635, arg0 ^ 28822, var2.field4797);
        this.field10054 = class451.method2768(super.field3635, -118, var2.field4799);
        this.field10059 = class451.method2768(super.field3635, -54, var2.field4794);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IBIZ)V")
    public final void method821(int arg0, byte arg1, int arg2, boolean arg3) {
        ++field10069;
        int var5 = arg0 + this.field10058.method177();
        int var6 = super.field3638.field1076 + arg0 + -this.field10062.method177();
        int var7 = this.field10054.method184() + arg2;
        int var8 = super.field3638.field1078 + (arg2 - this.field10059.method184());
        int var9 = -var5 + var6;
        int var10 = -var7 + var8;
        int var11 = this.method1588(-1046) * var9 / 10000;
        int[] var12 = new int[4];
        class364.field5573.method331(var12);
        class364.field5573.method240(var5, var7, var5 + var11, var8);
        this.method3461(27656, var9, var5, var10, var7);
        class364.field5573.method240(var5 - -var11, var7, var6, var8);
        if (arg1 != -30) {
            this.method576(75);
        }
        this.field10061.method188(var5, var7, var9, var10);
        class364.field5573.method240(var12[0], var12[1], var12[2], var12[3]);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIII)V")
    public void method3461(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == 27656) {
            ++field10063;
            this.field10068.method188(arg2, arg4, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(III)V")
    public static final void method3957(int arg0, int arg1, int arg2) {
        if (!(class729.field10218 < class729.field10217)) {
            if (class729.field10218 > class729.field10217) {
                class729.field10218 = (float) ((double) class729.field10218 - (double) class729.field10218 / 30.0D);
                if (class729.field10218 < class729.field10217) {
                    class729.field10218 = class729.field10217;
                }
                class481.method2912((byte) 51);
                class729.field10213 = (int) class729.field10218 >> 1;
                class729.field10211 = class472.method2876((byte) 62, class729.field10213);
            }
        } else {
            class729.field10218 = (float) ((double) class729.field10218 / 30.0D + (double) class729.field10218);
            if (class729.field10218 > class729.field10217) {
                class729.field10218 = class729.field10217;
            }
            class481.method2912((byte) 91);
            class729.field10213 = (int) class729.field10218 >> 1;
            class729.field10211 = class472.method2876((byte) -125, class729.field10213);
        }
        ++field10057;
        if (arg2 != -9207) {
            method3958(true, (byte) 113);
        }
        if (class505.field7362 != -1 && class120.field1849 != -1) {
            int var3 = class505.field7362 - class187.field3121;
            if (~var3 > -3 || ~var3 < -3) {
                var3 /= 8;
            }
            int var4 = -class271.field4161 + class120.field1849;
            class187.field3121 += var3;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            if (~var3 == -1 && ~var4 == -1) {
                class120.field1849 = -1;
                class505.field7362 = -1;
            }
            class271.field4161 -= -var4;
            class481.method2912((byte) 55);
        }
        if (~class167.field2913 >= -1) {
            class214.field3547 = -1;
            class173.field2953 = -1;
        } else {
            --class511.field7416;
            if (class511.field7416 == 0) {
                --class167.field2913;
                class511.field7416 = 100;
            }
        }
        if (class604.field8544 && class508.field7390 != null) {
            for (class141 var5 = (class141) class508.field7390.method3463((byte) -50); var5 != null; var5 = (class141) class508.field7390.method3469((byte) 107)) {
                class277 var6 = class729.field10206.method2550(var5.field2201.field4601, -36);
                if (var5.method1102(arg0, arg1, -113)) {
                    if (var6.field4222 != null) {
                        if (var6.field4222[4] != null) {
                            class274.method1800(0, var6.field4249, true, (byte) -128, false, -1, var6.field4220, -1, (long) var5.field2201.field4601, false, var6.field4222[4], 1002, (long) var5.field2201.field4601);
                        }
                        if (var6.field4222[3] != null) {
                            class274.method1800(0, var6.field4249, true, (byte) 107, false, -1, var6.field4220, -1, (long) var5.field2201.field4601, false, var6.field4222[3], 1012, (long) var5.field2201.field4601);
                        }
                        if (var6.field4222[2] != null) {
                            class274.method1800(0, var6.field4249, true, (byte) -97, false, -1, var6.field4220, -1, (long) var5.field2201.field4601, false, var6.field4222[2], 1008, (long) var5.field2201.field4601);
                        }
                        if (var6.field4222[1] != null) {
                            class274.method1800(0, var6.field4249, true, (byte) -84, false, -1, var6.field4220, -1, (long) var5.field2201.field4601, false, var6.field4222[1], 1003, (long) var5.field2201.field4601);
                        }
                        if (var6.field4222[0] != null) {
                            class274.method1800(0, var6.field4249, true, (byte) -80, false, -1, var6.field4220, -1, (long) var5.field2201.field4601, false, var6.field4222[0], 1007, (long) var5.field2201.field4601);
                        }
                    }
                    if (!var5.field2201.field4602) {
                        var5.field2201.field4602 = true;
                        class464.method2851(class657.field9349, var5.field2201.field4601, var6.field4220);
                    }
                    if (var5.field2201.field4602) {
                        class464.method2851(class259.field4050, var5.field2201.field4601, var6.field4220);
                    }
                } else if (var5.field2201.field4602) {
                    var5.field2201.field4602 = false;
                    class464.method2851(class529.field7603, var5.field2201.field4601, var6.field4220);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZIZI)V")
    public final void method824(boolean arg0, int arg1, boolean arg2, int arg3) {
        ++field10065;
        if (arg2) {
            int[] var5 = new int[4];
            class364.field5573.method331(var5);
            class364.field5573.method240(arg1, arg3, arg1 - -super.field3638.field1076, arg3 - -super.field3638.field1078);
            int var6 = this.field10058.method177();
            int var7 = this.field10058.method184();
            int var8 = this.field10062.method177();
            int var9 = this.field10062.method184();
            this.field10058.method182(arg1, (super.field3638.field1078 - var7) / 2 + arg3);
            this.field10062.method182(arg1 - (-super.field3638.field1076 + var8), (-var9 + super.field3638.field1078) / 2 + arg3);
            class364.field5573.method240(arg1, arg3, arg1 - -super.field3638.field1076, arg3 + this.field10054.method184());
            this.field10054.method188(arg1 + var6, arg3, -var8 + super.field3638.field1076 - var6, super.field3638.field1078);
            int var10 = this.field10059.method184();
            class364.field5573.method240(arg1, arg3 - -super.field3638.field1078 + -var10, super.field3638.field1076 + arg1, super.field3638.field1078 + arg3);
            this.field10059.method188(arg1 + var6, -var10 + super.field3638.field1078 + arg3, super.field3638.field1076 - var6 + -var8, super.field3638.field1078);
            class364.field5573.method240(var5[0], var5[1], var5[2], var5[3]);
        }
        if (arg0) {
            this.field10068 = null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZB)I")
    public static final int method3958(boolean arg0, byte arg1) {
        ++field10067;
        if (arg1 != -51) {
            field10056 = 40;
        }
        int var2 = class554.field7897;
        if (var2 != 0) {
            if (var2 != 1) {
                return var2 == 2 ? 0 : 0;
            } else {
                return class26.field268;
            }
        } else {
            return !arg0 ? class26.field268 : 0;
        }
    }

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "(I)V")
    public static void method3959(int arg0) {
        int var1 = 7 / ((52 - arg0) / 52);
        field10055 = null;
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lla;Lla;Lor;)V")
    public class717(class422 arg0, class422 arg1, class325 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lraa;B)V")
    public static final void method3960(class353 arg0, byte arg1) {
        ++field10060;
        if (arg1 <= 34) {
            method3958(true, (byte) -108);
        }
        if (~class285.field4389 == ~arg0.field5239) {
            class6.field66[arg0.field5369] = true;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)Z")
    public final boolean method574(byte arg0) {
        ++field10064;
        if (!super.method574((byte) 114)) {
            return false;
        } else {
            class325 var2 = (class325) super.field3638;
            if (arg0 < 96) {
                return true;
            } else if (!super.field3635.method2621(var2.field4801, -28975)) {
                return false;
            } else if (!super.field3635.method2621(var2.field4796, -28975)) {
                return false;
            } else if (!super.field3635.method2621(var2.field4795, -28975)) {
                return false;
            } else if (!super.field3635.method2621(var2.field4797, -28975)) {
                return false;
            } else if (!super.field3635.method2621(var2.field4799, -28975)) {
                return false;
            } else {
                return super.field3635.method2621(var2.field4794, -28975);
            }
        }
    }
}

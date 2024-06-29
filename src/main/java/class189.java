import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class189 extends class435 {

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "Los;")
    public static class408 field3150 = new class408(3);

    @OriginalMember(owner = "client!sa", name = "bb", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!sa", name = "cb", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!sa", name = "db", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!sa", name = "eb", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!sa", name = "fb", descriptor = "Lwt;")
    public static class284 field3155;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IBLpt;)V", line = 3)
    public static final void method1520(int arg0, byte arg1, class491 arg2) {
        if (arg1 == -110) {
            ++field3152;
            if (class575.field8200) {
                class575.field8200 = false;
                arg0 = 0;
            }
            if (class529.field7718 == null || !class529.field7718.method3005(arg1 ^ -11439, arg2)) {
                class529.field7718 = arg2;
                class185.field3112 = class112.method1033(-11752);
                class34.field502 = arg0;
                class645.field9071 = arg0;
                if (~class645.field9071 == -1) {
                    class629.method3667((byte) -98);
                    return;
                }
                class226.field3633 = class127.field2071;
                class200.field3265 = class579.field8250;
                class529.field7717 = class81.field1008;
                class9.field161 = class493.field7209;
                class260.field4211 = class661.field9223;
                class62.field805 = class528.field7707;
                class327.field5079 = class39.field529;
                class112.field1782 = class466.field6946;
                class583.field8294 = class209.field3499;
                class91.field1116 = class641.field8990;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lol;I)I", line = 43)
    public static final int method1521(class260 arg0, int arg1) {
        ++field3153;
        if (~arg0.field4168 == -1) {
            return 0;
        } else {
            if (arg1 != -32768) {
                method1521((class260) null, 34);
            }
            if (arg0.field4206 != -1) {
                class260 var2 = null;
                if (~arg0.field4206 <= -32769) {
                    if (~arg0.field4206 <= -32769) {
                        var2 = class597.field8465[arg0.field4206 + -32768];
                    }
                } else {
                    class348 var3 = (class348) class592.field8395.method1558((long) arg0.field4206, (byte) -93);
                    if (var3 != null) {
                        var2 = var3.field5577;
                    }
                }
                if (var2 != null) {
                    int var4 = -var2.field9696 + arg0.field9696;
                    int var5 = -var2.field9705 + arg0.field9705;
                    if (~var4 != -1 || var5 != 0) {
                        arg0.method1835((int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 16383, arg1 ^ -32768);
                    }
                }
            }
            if (!(arg0 instanceof class304)) {
                if (arg0 instanceof class589) {
                    class589 var6 = (class589) arg0;
                    if (var6.field8358 != -1 && (~var6.field4267 == -1 || var6.field4262 > 0)) {
                        int var7 = -((-class612.field8702 + var6.field8358 + -class612.field8702) * 256) + var6.field9696;
                        int var8 = var6.field9705 - (-class626.field8855 + var6.field8377 + -class626.field8855) * 256;
                        if (~var7 != -1 || var8 != 0) {
                            var6.method1835((int) (2607.5945876176133D * Math.atan2((double) var7, (double) var8)) & 16383, arg1 + 32768);
                        }
                        var6.field8358 = -1;
                    }
                }
            } else {
                class304 var9 = (class304) arg0;
                if (~var9.field4743 != 0 && (var9.field4267 == 0 || var9.field4262 > 0)) {
                    var9.method1835(var9.field4743, arg1 ^ -32768);
                    var9.field4743 = -1;
                }
            }
            return arg0.method1843(22019);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIILjo;)Luda;", line = 122)
    public static final class417 method1522(int arg0, int arg1, int arg2, class307 arg3) {
        ++field3151;
        int var4 = arg0 << 10 | arg3.field4830;
        class417 var5 = (class417) class192.field3180.method1899(122, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        } else {
            if (arg2 <= 29) {
                field3150 = null;
            }
            byte[] var6 = class321.field5030.method952(79, class321.field5030.method946((byte) -105, var4));
            if (var6 != null) {
                if (~var6.length >= -2) {
                    return null;
                } else {
                    class417 var7;
                    try {
                        var7 = class434.method2761(var6, -22);
                    } catch (Exception var19) {
                        throw new RuntimeException(var19.getMessage() + " S: " + var4);
                    }
                    var7.field6384 = arg3;
                    class192.field3180.method1902(-19867, (long) var4 << 16, var7);
                    return var7;
                }
            } else {
                int var9 = arg1 - -65536 << 10 | arg3.field4830;
                class417 var10 = (class417) class192.field3180.method1899(-127, (long) var9 << 16);
                if (var10 != null) {
                    return var10;
                } else {
                    byte[] var11 = class321.field5030.method952(94, class321.field5030.method946((byte) -105, var9));
                    if (var11 != null) {
                        if (var11.length <= 1) {
                            return null;
                        } else {
                            class417 var12;
                            try {
                                var12 = class434.method2761(var11, -22);
                            } catch (Exception var20) {
                                throw new RuntimeException(var20.getMessage() + " S: " + var9);
                            }
                            var12.field6384 = arg3;
                            class192.field3180.method1902(-19867, (long) var9 << 16, var12);
                            return var12;
                        }
                    } else {
                        int var14 = arg3.field4830 | 67107840;
                        class417 var15 = (class417) class192.field3180.method1899(-29, (long) var14 << 16);
                        if (var15 != null) {
                            return var15;
                        } else {
                            byte[] var16 = class321.field5030.method952(63, class321.field5030.method946((byte) -105, var14));
                            if (var16 != null) {
                                if (~var16.length >= -2) {
                                    return null;
                                } else {
                                    class417 var17;
                                    try {
                                        var17 = class434.method2761(var16, -22);
                                    } catch (Exception var21) {
                                        throw new RuntimeException(var21.getMessage() + " S: " + var14);
                                    }
                                    var17.field6384 = arg3;
                                    class192.field3180.method1902(-19867, (long) var14 << 16, var17);
                                    return var17;
                                }
                            } else {
                                return null;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)[[I", line = 206)
    public final int[][] method4(int arg0, byte arg1) {
        ++field3154;
        int[][] var3 = super.field4931.method1345(arg0, 0);
        if (super.field4931.field2799 && this.method2764(-52)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field6616 * super.field6616;
            for (int var8 = 0; ~class81.field1009 < ~var8; ++var8) {
                int var9 = super.field6622[var8 % super.field6628 + var7];
                var6[var8] = class453.method2846(4080, var9 << 4);
                var5[var8] = class453.method2846(4080, var9 >> 4);
                var4[var8] = class453.method2846(16711680, var9) >> 12;
            }
        }
        if (arg1 < 68) {
            field3155 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "(I)V", line = 258)
    public static void method1523(int arg0) {
        field3155 = null;
        field3150 = null;
        if (arg0 > -31) {
            field3155 = null;
        }
    }
}

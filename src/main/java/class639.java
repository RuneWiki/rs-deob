import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class639 {

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "[I")
    public static int[] field8749 = new int[3];

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "I")
    public static int field8746;

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "I")
    public static int field8747;

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "I")
    public static int field8748;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)V", line = 8)
    public static void method3587(int arg0) {
        if (arg0 != 1240) {
            field8749 = null;
        }
        field8749 = null;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIIIB)V", line = 18)
    public static final void method3588(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field8747++;
        int var6 = arg2 - arg3;
        int var7 = arg4 - arg1;
        if (var7 == 0) {
            if (var6 != 0) {
                class248.method1492(arg2, arg1, true, arg3, arg0);
            }
        } else if (var6 == 0) {
            class218.method1354(arg0, arg1, arg3, 2, arg4);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg1;
                arg1 = arg3;
                int var10 = arg4;
                arg3 = var9;
                arg4 = arg2;
                arg2 = var10;
            }
            if (arg1 > arg4) {
                int var11 = arg1;
                arg1 = arg4;
                int var12 = arg3;
                arg3 = arg2;
                arg4 = var11;
                arg2 = var12;
            }
            int var13 = arg3;
            if (arg5 >= -69) {
                method3589(-45);
            }
            int var14 = arg4 - arg1;
            int var15 = arg2 - arg3;
            int var16 = -(var14 >> 1);
            int var17 = arg2 > arg3 ? 1 : -1;
            if (var15 < 0) {
                var15 = -var15;
            }
            if (var8) {
                for (int var18 = arg1; var18 <= arg4; var18++) {
                    var16 += var15;
                    class4.field49[var18][var13] = arg0;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            } else {
                for (int var19 = arg1; var19 <= arg4; var19++) {
                    class4.field49[var13][var19] = arg0;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "(I)V", line = 142)
    public static final void method3589(int arg0) {
        if (arg0 == 0) {
            if (class538.field7570 == 2) {
                class747.field10373[0].method2126(class468.field6545[0]);
                class747.field10373[1].method2126(class468.field6545[1]);
            } else if (class538.field7570 == 3) {
                class747.field10373[0].method2126(class468.field6545[0]);
                class747.field10373[1].method2126(class468.field6545[1]);
                class747.field10373[2].method2126(class468.field6545[2]);
            } else {
                class747.field10373[0].method2126(class468.field6545[0]);
                class747.field10373[1].method2126(class468.field6545[1]);
                class747.field10373[2].method2126(class468.field6545[2]);
                class747.field10373[3].method2126(class468.field6545[3]);
            }
        } else if (arg0 == 1) {
            if (class538.field7570 == 2) {
                class747.field10373[0].method2126(class468.field6545[2]);
            } else if (class538.field7570 == 3) {
                class747.field10373[0].method2126(class468.field6545[3]);
                class747.field10373[1].method2126(class468.field6545[4]);
            } else {
                class747.field10373[0].method2126(class468.field6545[4]);
                class747.field10373[1].method2126(class468.field6545[5]);
                class747.field10373[2].method2126(class468.field6545[6]);
            }
        } else if (arg0 == 2) {
            if (class538.field7570 == 2) {
                class747.field10373[0].method2126(class468.field6545[3]);
                return;
            }
            if (class538.field7570 == 3) {
                class747.field10373[0].method2126(class468.field6545[5]);
                return;
            }
            class747.field10373[0].method2126(class468.field6545[7]);
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Loaa;Lke;IIILha;)Z", line = 217)
    public static final boolean method3590(class305 arg0, class625 arg1, int arg2, int arg3, int arg4, class66 arg5) {
        field8748++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg0.field3644 != null) {
            var7 = (arg0.field3645 + arg1.field8574 - class9.field177) * (class9.field165 - class9.field163) / (class9.field170 - class9.field177) + class9.field163;
            var6 = (arg0.field3653 + arg1.field8574 - class9.field177) * (class9.field165 - class9.field163) / (class9.field170 - class9.field177) + class9.field163;
            var9 = class9.field171 - ((arg0.field3647 + arg1.field8572 - class9.field162) * (class9.field171 - class9.field164) / (class9.field169 - class9.field162));
            var8 = class9.field171 - ((arg0.field3664 + arg1.field8572 - class9.field162) * (class9.field171 - class9.field164) / (class9.field169 - class9.field162));
        }
        class312 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg0.field3666 != -1) {
            if (arg1.field8570 && arg0.field3672 != -1) {
                var10 = arg0.method1762(arg5, true, (byte) 53);
            } else {
                var10 = arg0.method1762(arg5, false, (byte) 92);
            }
            if (var10 != null) {
                var11 = arg1.field8576 - (var10.method1634() + 1 >> 1);
                var12 = arg1.field8576 + (var10.method1634() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                var13 = arg1.field8569 - (var10.method1636() + 1 >> 1);
                if (var12 > var7) {
                    var7 = var12;
                }
                var14 = arg1.field8569 + (var10.method1636() + 1 >> 1);
                if (var8 > var13) {
                    var8 = var13;
                }
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class143 var15 = null;
        int var16 = 0;
        if (arg2 > -104) {
            method3588(44, 53, -103, 76, 105, (byte) 85);
        }
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        if (arg0.field3641 != null) {
            var15 = class89.method813(arg0.field3676, (byte) -71);
            if (var15 != null) {
                var16 = class620.field8388.method1818(62, null, arg0.field3641, class264.field3128, null);
                var17 = arg1.field8576 + ((class9.field165 - class9.field163) * arg0.field3652 / (class9.field170 - class9.field177));
                int var24 = arg1.field8569 - (class9.field171 - class9.field164) * arg0.field3661 / (class9.field169 - class9.field162);
                if (var10 == null) {
                    var18 = var24 - var15.method1052() * var16 / 2;
                } else {
                    var18 = var24 - ((var10.method1636() >> 1) + var16 * var15.method1050());
                }
                for (int var25 = 0; var25 < var16; var25++) {
                    String var26 = class264.field3128[var25];
                    if (var25 < var16 - 1) {
                        var26 = var26.substring(0, var26.length() - 4);
                    }
                    int var27 = var15.method1047(var26);
                    if (var19 < var27) {
                        var19 = var27;
                    }
                }
                var20 = var17 + arg4 - (var19 / 2);
                if (var20 < var6) {
                    var6 = var20;
                }
                var21 = var19 / 2 + var17 + arg4;
                var22 = arg3 + var18;
                if (var21 > var7) {
                    var7 = var21;
                }
                var23 = var15.method1050() * var16 + arg3 + var18;
                if (var22 < var8) {
                    var8 = var22;
                }
                if (var9 < var23) {
                    var9 = var23;
                }
            }
        }
        if (var7 < class9.field163 || var6 > class9.field165 || var9 < class9.field164 || var8 > class9.field171) {
            return true;
        }
        class9.method159(arg5, arg1, arg0);
        if (var10 != null) {
            if (class446.field5988 > 0 && (class587.field7997 != -1 && class587.field7997 == arg1.field8567 || class137.field1713 != -1 && class137.field1713 == arg0.field3657)) {
                int var28;
                if (class720.field10105 > 50) {
                    var28 = 200 - (class720.field10105 * 2);
                } else {
                    var28 = class720.field10105 * 2;
                }
                int var29 = var28 << 24 | 0xFFFF00;
                arg5.method577((byte) 114, arg1.field8569, var29, arg1.field8576, var10.method1640() / 2 + 7);
                arg5.method577((byte) 114, arg1.field8569, var29, arg1.field8576, var10.method1640() / 2 + 5);
                arg5.method577((byte) 114, arg1.field8569, var29, arg1.field8576, var10.method1640() / 2 + 3);
                arg5.method577((byte) 114, arg1.field8569, var29, arg1.field8576, var10.method1640() / 2 + 1);
                arg5.method577((byte) 114, arg1.field8569, var29, arg1.field8576, var10.method1640() / 2);
            }
            var10.method1838(arg1.field8576 - (var10.method1634() >> 1), arg1.field8569 + -(var10.method1636() >> 1));
        }
        if (arg0.field3641 != null && var15 != null) {
            class210.method1325(var17, var16, var19, arg0, arg1, 0, arg5, var18, var15);
        }
        if (arg0.field3666 != -1 || arg0.field3641 != null) {
            class786 var30 = new class786(arg1);
            var30.field10850 = var22;
            var30.field10852 = var14;
            var30.field10843 = var23;
            var30.field10845 = var20;
            var30.field10848 = var11;
            var30.field10846 = var12;
            var30.field10847 = var21;
            var30.field10841 = var13;
            class476.field6612.method2732(var30, 21939);
        }
        return false;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(B)V", line = 406)
    public static final void method3591(byte arg0) {
        field8746++;
        class90.field1195.method2160((byte) -116);
        class613.method3469(arg0 ^ 0xFFFF8341);
        class322.field3995 = null;
        class742.field10346 = 0;
        class359.field4466 = 0;
        class185.field2245 = null;
        class583.field7964.field5262 = 0;
        class102.field1321 = null;
        class208.method1313((byte) -4);
        class614.field8250 = null;
        if (arg0 != -40) {
            field8749 = null;
        }
        class504.field7138 = null;
        class621.field8525 = null;
        class77.field1049 = null;
        class454.field6396 = 0;
        class651.field8992 = 0;
        class280.field3263 = 0;
    }
}

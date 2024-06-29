import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class131 extends class210 implements class113 {

    @OriginalMember(owner = "client!hi", name = "H", descriptor = "Lro;")
    public class2 field1660;

    @OriginalMember(owner = "client!hi", name = "W", descriptor = "Z")
    private boolean field1675;

    @OriginalMember(owner = "client!hi", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field1661 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!hi", name = "P", descriptor = "Liu;")
    public static class390 field1668 = new class390(44, 4);

    @OriginalMember(owner = "client!hi", name = "Z", descriptor = "J")
    public static long field1678 = -1L;

    @OriginalMember(owner = "client!hi", name = "C", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!hi", name = "D", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!hi", name = "E", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!hi", name = "G", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!hi", name = "J", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!hi", name = "K", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!hi", name = "L", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!hi", name = "N", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!hi", name = "O", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!hi", name = "Q", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!hi", name = "R", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!hi", name = "S", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!hi", name = "T", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!hi", name = "U", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!hi", name = "V", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!hi", name = "X", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!hi", name = "Y", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!hi", name = "ab", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!hi", name = "bb", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!hi", name = "cb", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!hi", name = "db", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!hi", name = "M", descriptor = "Lhe;")
    public static class239 field1665;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIILbp;IZLeq;)V")
    public final void method719(int arg0, int arg1, int arg2, class250 arg3, int arg4, boolean arg5, class134 arg6) {
        if (arg2 == -1) {
            ++field1662;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "(I)Z")
    public static final boolean method720(int arg0) {
        ++field1676;
        try {
            if (~class378.field5658 == -3) {
                if (class388.field5750 == null) {
                    class388.field5750 = class119.method678(class181.field2593, class376.field5626, class55.field857);
                    if (class388.field5750 == null) {
                        return false;
                    }
                }
                if (class66.field990 == null) {
                    class66.field990 = new class371(class234.field3289, class225.field3173);
                }
                if (class8.field133.method1496(class66.field990, 22050, class388.field5750, class212.field3008, (byte) -114)) {
                    class8.field133.method1495(1257);
                    class8.field133.method1525(true, class8.field139);
                    class8.field133.method1519((byte) 127, class388.field5750, class25.field424);
                    class378.field5658 = 0;
                    class66.field990 = null;
                    class181.field2593 = null;
                    class388.field5750 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class8.field133.method1505((byte) -7);
            class66.field990 = null;
            class388.field5750 = null;
            class181.field2593 = null;
            class378.field5658 = 0;
        }
        if (arg0 != 1) {
            method721(-99, 22, -93, -11, -10, -27, -78, 48);
        }
        return false;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method721(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1666;
        int var8 = 0;
        int var9 = arg5;
        int var10 = 0;
        int var11 = -arg1 + arg2;
        int var12 = arg5 - arg1;
        int var13 = arg2 * arg2;
        int var14 = arg5 * arg5;
        int var15 = var11 * var11;
        if (arg4 < 42) {
            method721(13, 106, -87, 38, -86, -33, 85, -104);
        }
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg5 << 1;
        int var22 = var12 << 1;
        int var23 = (-var21 + 1) * var13 + var17;
        int var24 = -((var21 + -1) * var18) + var14;
        int var25 = (-var22 + 1) * var15 - -var19;
        int var26 = -((var22 + -1) * var20) + var16;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 + -3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 + -3) * var20;
        int var35 = var28;
        int var36 = (arg5 + -1) * var27;
        int var37 = var30;
        int var38 = (var12 + -1) * var29;
        if (~arg3 <= ~class7.field131 && ~class92.field1252 <= ~arg3) {
            int[] var39 = class41.field629[arg3];
            int var40 = class372.method2266(class473.field6839, -20228, class63.field933, -arg2 + arg0);
            int var41 = class372.method2266(class473.field6839, -20228, class63.field933, arg0 - -arg2);
            int var42 = class372.method2266(class473.field6839, -20228, class63.field933, -var11 + arg0);
            int var43 = class372.method2266(class473.field6839, -20228, class63.field933, arg0 + var11);
            class238.method1440(var39, arg6, var42, var40, -14726);
            class238.method1440(var39, arg7, var43, var42, -14726);
            class238.method1440(var39, arg6, var41, var43, -14726);
        }
        while (~var9 < -1) {
            boolean var44 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var35 += var28;
                    ++var8;
                    var31 += var28;
                }
            }
            if (var44) {
                if (~var25 > -1) {
                    while (~var25 > -1) {
                        var26 += var37;
                        var25 += var33;
                        ++var10;
                        var37 += var30;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var33 += var30;
                    var37 += var30;
                    ++var10;
                }
                var25 += -var38;
                var26 += -var34;
                var38 -= var29;
                var34 -= var29;
            }
            if (~var24 > -1) {
                var24 += var35;
                var23 += var31;
                ++var8;
                var31 += var28;
                var35 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            --var9;
            var32 -= var27;
            var36 -= var27;
            int var45 = arg3 - var9;
            int var46 = arg3 + var9;
            if (~class7.field131 >= ~var46 && ~class92.field1252 <= ~var45) {
                int var47 = class372.method2266(class473.field6839, -20228, class63.field933, arg0 - -var8);
                int var48 = class372.method2266(class473.field6839, -20228, class63.field933, arg0 - var8);
                if (!var44) {
                    if (~class7.field131 >= ~var45) {
                        class238.method1440(class41.field629[var45], arg6, var47, var48, -14726);
                    }
                    if (class92.field1252 >= var46) {
                        class238.method1440(class41.field629[var46], arg6, var47, var48, -14726);
                    }
                } else {
                    int var49 = class372.method2266(class473.field6839, -20228, class63.field933, arg0 + var10);
                    int var50 = class372.method2266(class473.field6839, -20228, class63.field933, -var10 + arg0);
                    if (~var45 <= ~class7.field131) {
                        int[] var51 = class41.field629[var45];
                        class238.method1440(var51, arg6, var50, var48, -14726);
                        class238.method1440(var51, arg7, var49, var50, -14726);
                        class238.method1440(var51, arg6, var47, var49, -14726);
                    }
                    if (var46 <= class92.field1252) {
                        int[] var52 = class41.field629[var46];
                        class238.method1440(var52, arg6, var50, var48, -14726);
                        class238.method1440(var52, arg7, var49, var50, -14726);
                        class238.method1440(var52, arg6, var47, var49, -14726);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)Z")
    public final boolean method371(boolean arg0) {
        if (arg0) {
            method726(-67, -7, 46);
        }
        ++field1677;
        return this.field1660.method14((byte) 114);
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V")
    public final void method368(int arg0) {
        ++field1672;
        if (arg0 != 5894) {
            method725((class477) null, -0.24107838F, -102, 63, -0.52134734F, -67, 0.6729164F, -101, -26, -78, 82, (byte[]) null, 1.3709185F, -0.6255764F);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILeq;BI)Z")
    public final boolean method365(int arg0, class134 arg1, byte arg2, int arg3) {
        int var5 = -63 / ((arg2 - -23) / 38);
        ++field1670;
        class327 var6 = this.field1660.method16(super.field2966, -1, super.field2959, arg1, false, 131072, false);
        if (var6 == null) {
            return false;
        } else {
            class33 var7 = arg1.method830();
            var7.method278(super.field2959, super.field2970, super.field2966);
            return var6.method184(arg0, arg3, var7, false);
        }
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)V")
    public final void method722(int arg0) {
        ++field1679;
        if (arg0 != 0) {
            this.method360((class134) null, false);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(B)I")
    public final int method362(byte arg0) {
        ++field1664;
        return arg0 != -72 ? -31 : this.field1660.field9;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)I")
    public final int method359(int arg0) {
        if (arg0 != 13228) {
            return 1;
        } else {
            ++field1659;
            return this.field1660.field39;
        }
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Leq;Lhn;IIIIIZIIIIIII)V")
    public class131(class134 arg0, class486 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field7065 == 1, class447.method2614(20111, arg12, arg13));
        this.field1660 = new class2(arg0, arg1, arg12, arg13, super.field2956, arg3, arg4, arg6, arg7, arg14);
        this.field1675 = ~arg1.field7041 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Leq;I)V")
    public final void method361(class134 arg0, int arg1) {
        ++field1658;
        class327 var3 = this.field1660.method16(super.field2966, arg1, super.field2959, arg0, true, 262144, true);
        if (var3 != null) {
            this.field1660.method13(var3, -32533, super.field2975, super.field2962, false, super.field2972, arg0, super.field2957);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)I")
    public final int method369(byte arg0) {
        if (arg0 <= 24) {
            field1661 = null;
        }
        ++field1657;
        return this.field1660.field12;
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)Z")
    public final boolean method723(int arg0) {
        ++field1656;
        if (arg0 != 17774) {
            this.method723(-49);
        }
        return false;
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(B)I")
    public final int method724(byte arg0) {
        if (arg0 >= -30) {
            field1668 = null;
        }
        ++field1669;
        return this.field1660.method12((byte) -84);
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(Leq;Z)Lgl;")
    public final class408 method364(class134 arg0, boolean arg1) {
        ++field1673;
        class327 var3 = this.field1660.method16(super.field2966, -1, super.field2959, arg0, arg1, 2048, true);
        if (var3 == null) {
            return null;
        } else {
            class33 var4 = arg0.method830();
            var4.method278(super.field2959, super.field2970, super.field2966);
            class408 var5 = null;
            if (this.field1675) {
                var5 = class118.method675(-112, 1);
            }
            if (this.field1660.field15 != null) {
                class191 var6 = this.field1660.field15.method2005();
                arg0.method787(var3, var6, var4, var5 == null ? null : var5.field5983[0], 0);
            } else {
                var3.method191(var4, var5 != null ? var5.field5983[0] : null, 0);
            }
            this.field1660.method13(var3, -32533, super.field2975, super.field2962, true, super.field2972, arg0, super.field2957);
            return var5;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ldd;FIIFIFIIII[BFF)V")
    public static final void method725(class477 arg0, float arg1, int arg2, int arg3, float arg4, int arg5, float arg6, int arg7, int arg8, int arg9, int arg10, byte[] arg11, float arg12, float arg13) {
        ++field1667;
        int var14 = arg2 * arg9;
        float[] var15 = new float[var14];
        int var16 = 0;
        if (arg7 == -15674) {
            while (var16 < arg10) {
                arg0.method917(arg3, 0, arg6 / (float) arg9, (byte) -116, arg2, arg8, arg12 / (float) arg8, arg9, var15, arg1 / (float) arg2, arg13 * 127.0F);
                int var19 = arg5;
                arg1 *= 2.0F;
                arg13 = arg4 * arg13;
                arg12 *= 2.0F;
                for (int var20 = 0; var14 > var20; ++var20) {
                    arg11[var19] = (byte) ((int) ((float) arg11[var19] + var15[var20]));
                    ++var19;
                }
                arg6 *= 2.0F;
                ++var16;
            }
            int var17 = arg5;
            for (int var18 = 0; var18 < var14; ++var18) {
                arg11[var17] -= -127;
                ++var17;
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)I")
    public static final int method726(int arg0, int arg1, int arg2) {
        ++field1663;
        int var3 = -128 + class477.method2789(arg2 + 45365, arg1 - -91923, 126, 4) - (-(class477.method2789(arg2 - -10294, arg1 + 37821, 127, 2) + arg0 >> 1) + -(-128 + class477.method2789(arg2, arg1, 126, 1) >> 2));
        int var4 = (int) ((double) var3 * 0.3D) - -35;
        if (var4 < 10) {
            var4 = 10;
        } else if (~var4 < -61) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILeq;Z)Lva;")
    public final class327 method367(int arg0, class134 arg1, boolean arg2) {
        if (!arg2) {
            this.method372((byte) -100, (class134) null);
        }
        ++field1674;
        return this.field1660.method16(0, -1, 0, arg1, false, arg0, false);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Leq;Z)V")
    public final void method360(class134 arg0, boolean arg1) {
        if (arg1) {
            this.field1660.method4((byte) -61, arg0);
            ++field1680;
        }
    }

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "(I)V")
    public static void method727(int arg0) {
        field1665 = null;
        field1668 = null;
        field1661 = null;
        if (arg0 != 270646850) {
            field1678 = -31L;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLeq;)V")
    public final void method372(byte arg0, class134 arg1) {
        if (arg0 <= -49) {
            this.field1660.method7(arg1, (byte) 110);
            ++field1671;
        }
    }
}

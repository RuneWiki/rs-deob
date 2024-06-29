import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class27 extends class577 implements class231 {

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "Z")
    private boolean field292;

    @OriginalMember(owner = "client!uc", name = "eb", descriptor = "B")
    private byte field311;

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "Z")
    private boolean field290;

    @OriginalMember(owner = "client!uc", name = "kb", descriptor = "B")
    private byte field317;

    @OriginalMember(owner = "client!uc", name = "hb", descriptor = "Z")
    private boolean field314;

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "B")
    private byte field286;

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "S")
    private short field285;

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "Z")
    private boolean field294;

    @OriginalMember(owner = "client!uc", name = "fb", descriptor = "Lr;")
    public class159 field312;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "Lk;")
    private class485 field287;

    @OriginalMember(owner = "client!uc", name = "T", descriptor = "[[[I")
    public static int[][][] field300 = new int[2][][];

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!uc", name = "Q", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!uc", name = "R", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!uc", name = "S", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!uc", name = "U", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!uc", name = "V", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!uc", name = "W", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!uc", name = "X", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!uc", name = "Y", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!uc", name = "Z", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!uc", name = "ab", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!uc", name = "bb", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!uc", name = "cb", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!uc", name = "db", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!uc", name = "gb", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!uc", name = "ib", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!uc", name = "lb", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!uc", name = "mb", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!uc", name = "nb", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!uc", name = "jb", descriptor = "Lpl;")
    private class558 field316;

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lqa;Luh;IIIIIZIIIIIIZ)V")
    public class27(class208 arg0, class145 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field2038 == -2, class467.method2816(arg13, arg12, (byte) 92));
        this.field292 = ~arg1.field2056 != -1 && !arg7;
        this.field311 = (byte) arg12;
        this.field290 = arg14;
        this.field317 = (byte) arg13;
        this.field314 = arg7;
        this.field286 = (byte) arg3;
        this.field285 = (short) arg1.field2049;
        this.field294 = arg0.method457() && arg1.field2084 && !this.field314 && class56.field668.method2897(class526.field7533, 6373) != 0;
        int var16 = 2048;
        if (this.field290) {
            var16 |= 65536;
        }
        class429 var17 = this.method188(-23374, arg0, var16, this.field294);
        if (var17 != null) {
            this.field312 = var17.field5765;
            this.field287 = var17.field5763;
            if (this.field290) {
                this.field312 = this.field312.method94((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)I")
    public final int method170(int arg0) {
        if (arg0 > -120) {
            this.field312 = null;
        }
        ++field303;
        return this.field317;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILqa;IB)Z")
    public final boolean method171(int arg0, class208 arg1, int arg2, byte arg3) {
        ++field299;
        class159 var5 = this.method186((byte) 121, arg1, 131072);
        if (var5 != null) {
            class165 var6 = arg1.method428();
            var6.method353(super.field8496, super.field8502, super.field8500);
            return var5.method72(arg2, arg0, var6, false);
        } else {
            if (arg3 <= 44) {
                this.field285 = 25;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
    public final void method172(int arg0) {
        if (this.field312 != null) {
            this.field312.method55();
        }
        ++field291;
        if (arg0 <= 95) {
            field300 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)I")
    public final int method173(byte arg0) {
        ++field306;
        int var2 = 6 / ((arg0 - -43) / 49);
        return this.field311;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLqa;)V")
    public final void method174(byte arg0, class208 arg1) {
        ++field288;
        Object var3 = null;
        class485 var5;
        if (this.field287 == null && this.field294) {
            class429 var4 = this.method188(-23374, arg1, 262144, true);
            var5 = var4 != null ? var4.field5763 : null;
        } else {
            var5 = this.field287;
            this.field287 = null;
        }
        if (var5 != null) {
            class377.method2253(var5, this.field286, super.field8496, super.field8500, (boolean[]) null);
        }
        if (arg0 > -36) {
            method184((class328) null, true, (class328) null);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[FIIIIFIII)V")
    public static final void method175(int arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, float arg6, int arg7, int arg8, int arg9) {
        int var10 = arg0 - arg3;
        int var11 = arg5 - arg9;
        ++field307;
        int var12 = arg7 - arg8;
        float var13 = arg1[2] * (float) var12 + arg1[0] * (float) var10 + arg1[1] * (float) var11;
        if (arg2 != -2) {
            field300 = null;
        }
        float var14 = arg1[5] * (float) var12 + arg1[4] * (float) var11 + arg1[3] * (float) var10;
        float var15 = arg1[8] * (float) var12 + arg1[6] * (float) var10 + arg1[7] * (float) var11;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = arg6 + 0.5F + (float) Math.asin((double) (var14 / var16)) / 3.1415927F;
        if (arg4 != 1) {
            if (arg4 != 2) {
                if (arg4 == 3) {
                    float var19 = var17;
                    var17 = var18;
                    var18 = -var19;
                }
            } else {
                var18 = -var18;
                var17 = -var17;
            }
        } else {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        }
        class635.field9296 = var18;
        class505.field7144 = var17;
    }

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "(I)V")
    public static void method176(int arg0) {
        if (arg0 == 19686) {
            field300 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(B)I")
    public final int method177(byte arg0) {
        if (arg0 != 40) {
            this.method171(-43, (class208) null, 97, (byte) 70);
        }
        ++field319;
        return this.field312 == null ? 0 : this.field312.method86();
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(BLqa;)V")
    public final void method178(byte arg0, class208 arg1) {
        ++field293;
        Object var3 = null;
        class485 var5;
        if (this.field287 == null && this.field294) {
            class429 var4 = this.method188(arg0 ^ -23359, arg1, 262144, true);
            var5 = var4 != null ? var4.field5763 : null;
        } else {
            var5 = this.field287;
            this.field287 = null;
        }
        if (arg0 != 115) {
            this.field286 = 38;
        }
        if (var5 != null) {
            class46.method290(var5, this.field286, super.field8496, super.field8500, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)V")
    public final void method179(int arg0) {
        ++field302;
        if (arg0 == 1) {
            this.field290 = false;
            if (this.field312 != null) {
                this.field312.method79(-65537 & this.field312.method90());
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)Z")
    public final boolean method180(byte arg0) {
        if (arg0 != 58) {
            this.field317 = -107;
        }
        ++field304;
        return this.field290;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(ILqa;)Lin;")
    public final class77 method181(int arg0, class208 arg1) {
        ++field320;
        if (arg0 <= 0) {
            this.field311 = 99;
        }
        if (this.field312 == null) {
            return null;
        } else {
            class165 var3 = arg1.method428();
            var3.method353(super.field8496, super.field8502, super.field8500);
            class77 var4 = null;
            if (this.field292) {
                var4 = class450.method2725(1, 26728);
            }
            this.field312.method93(var3, var4 != null ? var4.field1022[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lqa;IZIILco;I)V")
    public final void method182(class208 arg0, int arg1, boolean arg2, int arg3, int arg4, class102 arg5, int arg6) {
        ++field289;
        if (arg5 instanceof class200) {
            class200 var8 = (class200) arg5;
            if (this.field312 != null && var8.field2940 != null) {
                this.field312.method78(var8.field2940, arg3, arg1, arg4, arg2);
            }
        } else if (arg5 instanceof class27) {
            class27 var9 = (class27) arg5;
            if (this.field312 != null && var9.field312 != null) {
                this.field312.method78(var9.field312, arg3, arg1, arg4, arg2);
            }
        }
        if (arg6 != 21130) {
            this.method178((byte) -23, (class208) null);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)I")
    public final int method183(int arg0) {
        if (arg0 != -19248) {
            return -25;
        } else {
            ++field318;
            return this.field285 & 65535;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lkda;ZLkda;)V")
    public static final void method184(class328 arg0, boolean arg1, class328 arg2) {
        ++field298;
        if (!arg1) {
            class369.field5093 = arg0;
            class234.field3390 = arg2;
        }
    }

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "(I)I")
    public final int method185(int arg0) {
        ++field296;
        if (arg0 != 8) {
            return -89;
        } else {
            return this.field312 == null ? 15 : this.field312.method62() / 4;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLqa;I)Lr;")
    private final class159 method186(byte arg0, class208 arg1, int arg2) {
        ++field308;
        if (this.field312 != null && ~arg1.method528(this.field312.method90(), arg2) == -1) {
            return this.field312;
        } else {
            int var4 = -24 % ((42 - arg0) / 54);
            class429 var5 = this.method188(-23374, arg1, arg2, false);
            return var5 != null ? var5.field5765 : null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILvp;)V")
    public static final void method187(int arg0, class162 arg1) {
        ++field284;
        if (class606.field9002) {
            if (arg1.field2560 != null) {
                class162 var2 = class372.method2217(class205.field3027, 100, class193.field2865);
                if (var2 != null) {
                    class518 var3 = new class518();
                    var3.field7384 = var2;
                    var3.field7383 = arg1.field2560;
                    var3.field7376 = arg1;
                    class98.method757(var3);
                }
            }
            if (arg0 <= 26) {
                field300 = null;
            }
            ++class148.field2164;
            class402.method2367(class193.field2859, (byte) 108);
            class112.field1589.method1058(602643080, arg1.field2456);
            class112.field1589.method1012(976668456, class193.field2865);
            class112.field1589.method1069(class205.field3027, 1440784936);
            class112.field1589.method1017(class626.field9224, 428082024);
            class112.field1589.method1017(arg1.field2434, 428082024);
            class112.field1589.method1012(976668456, arg1.field2415);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILqa;IZ)Lis;")
    private final class429 method188(int arg0, class208 arg1, int arg2, boolean arg3) {
        ++field313;
        class145 var5 = class216.field3172.method1505(-24044, 65535 & this.field285);
        if (arg0 != -23374) {
            this.method174((byte) 67, (class208) null);
        }
        class176 var6;
        class176 var7;
        if (this.field314) {
            var6 = class207.field3077[0];
            var7 = class114.field1609[this.field286];
        } else {
            if (this.field286 < 3) {
                var6 = class207.field3077[this.field286 - -1];
            } else {
                var6 = null;
            }
            var7 = class207.field3077[this.field286];
        }
        return var5.method997(super.field8496, ~this.field311 == -12 ? 10 : this.field311, 103, arg3, arg2, super.field8500, var6, var7, this.field311 != 11 ? this.field317 : 4 - -this.field317, arg1, super.field8502);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lqa;I)Lpl;")
    public final class558 method189(class208 arg0, int arg1) {
        if (arg1 != 31733) {
            return null;
        } else {
            ++field301;
            if (this.field316 == null) {
                this.field316 = class115.method826(this.method186((byte) -101, arg0, 0), super.field8496, 21979, super.field8500, super.field8502);
            }
            return this.field316;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BILqa;)Lr;")
    public final class159 method190(byte arg0, int arg1, class208 arg2) {
        if (arg0 < 40) {
            this.field290 = true;
        }
        ++field315;
        return this.method186((byte) 105, arg2, arg1);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IBZ)V")
    public static final void method191(int arg0, byte arg1, boolean arg2) {
        ++field305;
        class38 var3 = class487.method2920(arg2, 13993, arg0);
        int var4 = 18 / ((49 - arg1) / 37);
        if (var3 != null) {
            for (int var5 = 0; ~var5 > ~var3.field466.length; ++var5) {
                var3.field466[var5] = -1;
                var3.field465[var5] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)Z")
    public final boolean method192(byte arg0) {
        ++field297;
        if (arg0 != -41) {
            this.method185(45);
        }
        return this.field294;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZLkda;)V")
    public static final void method193(boolean arg0, class328 arg1) {
        ++field309;
        if (!arg0) {
            field300 = null;
        }
        class219.field3189 = arg1;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILqa;)V")
    public final void method194(int arg0, class208 arg1) {
        ++field295;
        if (arg0 != 0) {
            this.method180((byte) 85);
        }
    }
}

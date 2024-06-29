import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class43 extends class113 implements class231 {

    @OriginalMember(owner = "client!kaa", name = "K", descriptor = "Lel;")
    public class469 field516;

    @OriginalMember(owner = "client!kaa", name = "G", descriptor = "Z")
    private boolean field512;

    @OriginalMember(owner = "client!kaa", name = "v", descriptor = "I")
    public static int field501 = -2;

    @OriginalMember(owner = "client!kaa", name = "C", descriptor = "S")
    public static short field508 = 256;

    @OriginalMember(owner = "client!kaa", name = "p", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!kaa", name = "q", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!kaa", name = "r", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!kaa", name = "s", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!kaa", name = "t", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!kaa", name = "u", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!kaa", name = "w", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!kaa", name = "x", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!kaa", name = "y", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!kaa", name = "z", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!kaa", name = "A", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!kaa", name = "B", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!kaa", name = "D", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!kaa", name = "E", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!kaa", name = "F", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!kaa", name = "H", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!kaa", name = "I", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!kaa", name = "J", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!kaa", name = "L", descriptor = "Lpl;")
    private class558 field517;

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(I)I")
    public final int method170(int arg0) {
        if (arg0 > -120) {
            this.method179(-22);
        }
        ++field511;
        return this.field516.field6595;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lqa;IZIILco;I)V")
    public final void method182(class208 arg0, int arg1, boolean arg2, int arg3, int arg4, class102 arg5, int arg6) {
        if (arg6 != 21130) {
            field505 = 4;
        }
        ++field509;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(BLqa;)V")
    public final void method178(byte arg0, class208 arg1) {
        ++field495;
        if (arg0 != 115) {
            this.method182((class208) null, 21, false, -76, 34, (class102) null, -54);
        }
        this.field516.method2834(arg1, -21701);
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IIIIB[B[BII)V")
    public static final void method272(int arg0, int arg1, int arg2, int arg3, byte arg4, byte[] arg5, byte[] arg6, int arg7, int arg8) {
        ++field500;
        int var9 = -(arg8 >> 2);
        int var10 = -(3 & arg8);
        int var11 = -arg7;
        int var12 = -41 % ((arg4 - -62) / 54);
        while (~var11 > -1) {
            int var10001;
            for (int var13 = var9; ~var13 > -1; ++var13) {
                var10001 = arg2++;
                arg5[var10001] = (byte) (arg5[var10001] + -arg6[arg0++]);
                int var15 = arg2++;
                arg5[var15] = (byte) (arg5[var15] + -arg6[arg0++]);
                int var16 = arg2++;
                arg5[var16] = (byte) (arg5[var16] + -arg6[arg0++]);
                int var17 = arg2++;
                arg5[var17] = (byte) (arg5[var17] + -arg6[arg0++]);
            }
            for (int var14 = var10; var14 < 0; ++var14) {
                var10001 = arg2++;
                arg5[var10001] = (byte) (arg5[var10001] + -arg6[arg0++]);
            }
            arg0 += arg3;
            arg2 += arg1;
            ++var11;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(BLqa;)V")
    public final void method174(byte arg0, class208 arg1) {
        if (arg0 <= -36) {
            this.field516.method2836(arg1, -122);
            ++field499;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(BILqa;)Lr;")
    public final class159 method190(byte arg0, int arg1, class208 arg2) {
        if (arg0 < 40) {
            field505 = -12;
        }
        ++field506;
        return this.field516.method2828((byte) 58, false, 0, 0, arg2, arg1, false);
    }

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(ILqa;)Lin;")
    public final class77 method181(int arg0, class208 arg1) {
        ++field496;
        class159 var3 = this.field516.method2828((byte) 88, false, super.field1598, super.field1594, arg1, 2048, true);
        if (arg0 < 0) {
            this.method194(76, (class208) null);
        }
        if (var3 == null) {
            return null;
        } else {
            class165 var4 = arg1.method428();
            var4.method353(super.field1594, super.field1596, super.field1598);
            class77 var5 = null;
            if (this.field512) {
                var5 = class450.method2725(1, 26728);
            }
            if (this.field516.field6607 == null) {
                var3.method93(var4, var5 != null ? var5.field1022[0] : null, 0);
            } else {
                class283 var6 = this.field516.field6607.method1356();
                arg1.method511(var3, var6, var4, var5 == null ? null : var5.field1022[0], 0);
            }
            if (this.field517 == null) {
                this.field517 = class115.method826(var3, super.field1594, 21979, super.field1598, super.field1596);
            } else {
                class319.method1931(this.field517, super.field1598, super.field1594, -125, var3, super.field1596);
            }
            int var7 = super.field1594 >> 7;
            int var8 = super.field1598 >> 7;
            this.field516.method2829(var8, true, arg1, var8, (byte) 117, var3, var7, var7);
            return var5;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)I")
    public final int method183(int arg0) {
        ++field507;
        if (arg0 != -19248) {
            field508 = 66;
        }
        return this.field516.field6615;
    }

    @OriginalMember(owner = "client!kaa", name = "e", descriptor = "(I)V")
    public final void method179(int arg0) {
        ++field515;
        if (arg0 != 1) {
            field508 = 11;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILqa;)V")
    public final void method194(int arg0, class208 arg1) {
        if (arg0 == 0) {
            ++field503;
            class159 var3 = this.field516.method2828((byte) 35, true, super.field1598, super.field1594, arg1, 262144, true);
            if (var3 != null) {
                int var4 = super.field1594 >> 7;
                int var5 = super.field1598 >> 7;
                this.field516.method2829(var5, false, arg1, var5, (byte) 125, var3, var4, var4);
            }
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "([BZI)V")
    public static final void method273(byte[] arg0, boolean arg1, int arg2) {
        ++field513;
        if (arg2 == -16294) {
            if (client.field3640 == null) {
                client.field3640 = new class148(20000);
            }
            client.field3640.method1030(arg0, arg0.length, (byte) -3, 0);
            if (arg1) {
                class635.method3690(-1, client.field3640.field2146);
                class348.field4775 = new class187[class18.field172];
                int var3 = 0;
                for (int var4 = class169.field2637; ~var4 >= ~class561.field8337; ++var4) {
                    class187 var5 = class8.method37(var4, -92);
                    if (var5 != null) {
                        class348.field4775[var3++] = var5;
                    }
                }
                class155.field2315 = false;
                class136.field1930 = class598.method3538(true);
                client.field3640 = null;
            }
        }
    }

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "(B)Z")
    public final boolean method180(byte arg0) {
        ++field514;
        if (arg0 != 58) {
            method273((byte[]) null, true, -54);
        }
        return false;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lqa;I)Lpl;")
    public final class558 method189(class208 arg0, int arg1) {
        if (arg1 != 31733) {
            this.method172(68);
        }
        ++field498;
        return this.field517;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILqa;IB)Z")
    public final boolean method171(int arg0, class208 arg1, int arg2, byte arg3) {
        ++field504;
        if (arg3 < 44) {
            this.field517 = null;
        }
        class159 var5 = this.field516.method2828((byte) 78, false, super.field1598, super.field1594, arg1, 131072, false);
        if (var5 == null) {
            return false;
        } else {
            class165 var6 = arg1.method428();
            var6.method353(super.field1594, super.field1596, super.field1598);
            return var5.method72(arg2, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(B)I")
    public final int method173(byte arg0) {
        ++field497;
        int var2 = -128 % ((-43 - arg0) / 49);
        return this.field516.field6628;
    }

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "(I)V")
    public final void method172(int arg0) {
        ++field510;
        if (arg0 <= 95) {
            this.field512 = false;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(B)Z")
    public final boolean method192(byte arg0) {
        ++field502;
        return arg0 != -41 ? true : this.field516.method2831((byte) 126);
    }

    @OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Lqa;Luh;IIIIIZIII)V")
    public class43(class208 arg0, class145 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class260.method1649(arg8, arg9, true));
        this.field516 = new class469(arg0, arg1, arg8, arg9, arg2, arg3, super.field1594, super.field1598, arg7, arg10);
        this.field512 = ~arg1.field2056 != -1 && !arg7;
    }
}

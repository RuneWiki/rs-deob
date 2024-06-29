import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class724 extends class644 implements class324 {

    @OriginalMember(owner = "client!gu", name = "eb", descriptor = "Z")
    private boolean field10192;

    @OriginalMember(owner = "client!gu", name = "db", descriptor = "B")
    private byte field10191;

    @OriginalMember(owner = "client!gu", name = "jb", descriptor = "Z")
    private boolean field10197;

    @OriginalMember(owner = "client!gu", name = "S", descriptor = "S")
    private short field10180;

    @OriginalMember(owner = "client!gu", name = "fb", descriptor = "Z")
    private boolean field10193;

    @OriginalMember(owner = "client!gu", name = "O", descriptor = "Z")
    private boolean field10176;

    @OriginalMember(owner = "client!gu", name = "E", descriptor = "Lka;")
    private class282 field10166;

    @OriginalMember(owner = "client!gu", name = "I", descriptor = "Lr;")
    private class704 field10170;

    @OriginalMember(owner = "client!gu", name = "X", descriptor = "[I")
    public static int[] field10185 = new int[8];

    @OriginalMember(owner = "client!gu", name = "T", descriptor = "Z")
    public static boolean field10181 = false;

    @OriginalMember(owner = "client!gu", name = "D", descriptor = "I")
    public static int field10165;

    @OriginalMember(owner = "client!gu", name = "G", descriptor = "I")
    public static int field10168;

    @OriginalMember(owner = "client!gu", name = "H", descriptor = "I")
    public static int field10169;

    @OriginalMember(owner = "client!gu", name = "J", descriptor = "I")
    public static int field10171;

    @OriginalMember(owner = "client!gu", name = "K", descriptor = "I")
    public static int field10172;

    @OriginalMember(owner = "client!gu", name = "L", descriptor = "I")
    public static int field10173;

    @OriginalMember(owner = "client!gu", name = "M", descriptor = "I")
    public static int field10174;

    @OriginalMember(owner = "client!gu", name = "N", descriptor = "I")
    public static int field10175;

    @OriginalMember(owner = "client!gu", name = "P", descriptor = "I")
    public static int field10177;

    @OriginalMember(owner = "client!gu", name = "Q", descriptor = "I")
    public static int field10178;

    @OriginalMember(owner = "client!gu", name = "R", descriptor = "I")
    public static int field10179;

    @OriginalMember(owner = "client!gu", name = "U", descriptor = "I")
    public static int field10182;

    @OriginalMember(owner = "client!gu", name = "V", descriptor = "I")
    public static int field10183;

    @OriginalMember(owner = "client!gu", name = "W", descriptor = "I")
    public static int field10184;

    @OriginalMember(owner = "client!gu", name = "Y", descriptor = "I")
    public static int field10186;

    @OriginalMember(owner = "client!gu", name = "Z", descriptor = "I")
    public static int field10187;

    @OriginalMember(owner = "client!gu", name = "ab", descriptor = "I")
    public static int field10188;

    @OriginalMember(owner = "client!gu", name = "bb", descriptor = "I")
    public static int field10189;

    @OriginalMember(owner = "client!gu", name = "cb", descriptor = "I")
    public static int field10190;

    @OriginalMember(owner = "client!gu", name = "gb", descriptor = "I")
    public static int field10194;

    @OriginalMember(owner = "client!gu", name = "hb", descriptor = "I")
    public static int field10195;

    @OriginalMember(owner = "client!gu", name = "ib", descriptor = "I")
    public static int field10196;

    @OriginalMember(owner = "client!gu", name = "F", descriptor = "Lro;")
    private class522 field10167;

    @OriginalMember(owner = "client!gu", name = "C", descriptor = "Ljava/awt/Font;")
    public static Font field10164;

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(B)V")
    public final void method598(byte arg0) {
        if (arg0 >= -9) {
            field10181 = false;
        }
        if (this.field10166 != null) {
            this.field10166.method499();
        }
        ++field10165;
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)I")
    public final int method606(int arg0) {
        ++field10184;
        return arg0 >= -32 ? -94 : this.field10191;
    }

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "(I)V")
    public static void method4047(int arg0) {
        field10164 = null;
        if (arg0 == -4) {
            field10185 = null;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIIIII)V")
    public static final void method4048(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field10187;
        if (arg2 != 8 && arg2 != 16) {
            class375 var7 = class565.field8185[arg4][arg1][arg3];
            if (var7 == null) {
                var7 = new class375(arg4);
            }
            if (arg2 == 1) {
                var7.field5434 = (short) arg5;
                var7.field5426 = (short) arg0;
            } else if (~arg2 == -3) {
                var7.field5437 = (short) arg0;
                var7.field5436 = (short) arg5;
            }
            if (class704.field9921) {
                class749.method4175(127);
            }
        } else if (arg2 != 8) {
            int var8 = (arg1 << class639.field9095) + class150.field2190;
            int var9 = -class150.field2190 + var8;
            int var10 = arg3 << class639.field9095;
            int var11 = class150.field2190 + var10;
            int var12 = class491.field7079[arg4].method2087(122, arg1 - -1, arg3);
            int var13 = class491.field7079[arg4].method2087(103, arg1, arg3 + 1);
            class43.field733[class495.field7114++] = new class151(arg2, arg4, var8, var9, var9, var8, var12, var13, -arg5 + var13, -arg5 + var12, var10, var11, var11, var10);
        } else {
            int var14 = arg1 << class639.field9095;
            int var15 = var14 - -class150.field2190;
            int var16 = arg3 << class639.field9095;
            int var17 = class150.field2190 + var16;
            int var18 = class491.field7079[arg4].method2087(59, arg1, arg3);
            int var19 = class491.field7079[arg4].method2087(107, arg1 + 1, arg3 + 1);
            class43.field733[class495.field7114++] = new class151(arg2, arg4, var14, var15, var15, var14, var18, var19, -arg5 + var19, -arg5 + var18, var16, var17, var17, var16);
        }
        int var20 = -115 / ((12 - arg6) / 49);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IZZLha;)Lmg;")
    private final class495 method4049(int arg0, boolean arg1, boolean arg2, class543 arg3) {
        ++field10179;
        class482 var5 = class375.field5421.method2680(65535 & this.field10180, (byte) 109);
        if (arg2) {
            field10164 = null;
        }
        class339 var6;
        class339 var7;
        if (this.field10193) {
            var6 = class491.field7079[0];
            var7 = class25.field221[super.field3924];
        } else {
            if (~super.field3924 > -4) {
                var6 = class491.field7079[super.field3924 + 1];
            } else {
                var6 = null;
            }
            var7 = class491.field7079[super.field3924];
        }
        return var5.method2942(super.field3923, this.field10191, arg1, super.field3916, 22, arg0, arg3, super.field3922, (byte) 124, var7, var6);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)Z")
    public final boolean method611(int arg0) {
        ++field10189;
        return arg0 != 15795 ? false : this.field10176;
    }

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "(B)I")
    public final int method599(byte arg0) {
        ++field10175;
        if (arg0 > -4) {
            return -1;
        } else {
            return this.field10166 != null ? this.field10166.method507() : 0;
        }
    }

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "(B)Z")
    public final boolean method614(byte arg0) {
        ++field10173;
        int var2 = -5 / ((-38 - arg0) / 63);
        return this.field10166 != null ? this.field10166.method497() : false;
    }

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "(B)Z")
    public final boolean method607(byte arg0) {
        int var2 = 80 / ((27 - arg0) / 62);
        ++field10178;
        if (this.field10166 == null) {
            return true;
        } else {
            return !this.field10166.method504();
        }
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lha;Lrq;IIIIIZIZ)V")
    public class724(class543 arg0, class482 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, boolean arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field6957);
        this.field10192 = arg1.field6903 != 0 && !arg7;
        this.field10191 = (byte) arg8;
        this.field10197 = arg9;
        super.field3916 = arg6;
        this.field10180 = (short) arg1.field6965;
        this.field10193 = arg7;
        super.field3923 = arg4;
        this.field10176 = arg0.method365() && arg1.field6892 && !this.field10193 && ~class243.field3580.field8007.method435(false) != -1;
        int var11 = 2048;
        if (this.field10197) {
            var11 |= 65536;
        }
        class495 var12 = this.method4049(var11, this.field10176, false, arg0);
        if (var12 != null) {
            this.field10166 = var12.field7119;
            this.field10170 = var12.field7117;
            if (this.field10197) {
                this.field10166 = this.field10166.method509((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method594(int arg0, int arg1, int arg2, class543 arg3) {
        ++field10169;
        if (arg2 != 1) {
            this.field10176 = true;
        }
        class282 var5 = this.method4051(131072, arg3, false);
        if (var5 != null) {
            class121 var6 = arg3.method342();
            var6.method845(super.field3923, super.field3922, super.field3916);
            return !class100.field1447 ? var5.method496(arg1, arg0, var6, false, 0) : var5.method538(arg1, arg0, var6, false, 0, class680.field9660);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lha;Z)V")
    public final void method597(class543 arg0, boolean arg1) {
        ++field10182;
        Object var3 = null;
        class704 var5;
        if (this.field10170 == null && this.field10176) {
            class495 var4 = this.method4049(262144, true, false, arg0);
            var5 = var4 != null ? var4.field7117 : null;
        } else {
            var5 = this.field10170;
            this.field10170 = null;
        }
        if (arg1) {
            field10181 = false;
        }
        if (var5 != null) {
            class659.method3762(var5, super.field3924, super.field3923, super.field3916, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(BLha;)V")
    public final void method610(byte arg0, class543 arg1) {
        if (arg0 >= 51) {
            ++field10174;
        }
    }

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "(I)V")
    public final void method713(int arg0) {
        this.field10197 = false;
        if (arg0 == -16221) {
            ++field10194;
            if (this.field10166 != null) {
                this.field10166.method487(-65537 & this.field10166.method528());
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "(I)V")
    public static final void method4050(int arg0) {
        if (arg0 > 23) {
            class172.field2414 = 0;
            class308.field4177 = 0;
            ++class628.field8906;
            ++field10190;
            class662.method3774((byte) 109);
            class652.method3751(1375821763);
            class679.method3860(778);
            boolean var1 = false;
            for (int var2 = 0; ~var2 > ~class308.field4177; ++var2) {
                int var5 = class84.field1252[var2];
                class63 var6 = (class63) class389.field5608.method4020((long) var5, (byte) -99);
                class571 var7 = var6.field1004;
                if (class147.field2154 && class650.method3746(-118, var5)) {
                    class593.method3480(25387);
                }
                if (class628.field8906 != var7.field4548) {
                    if (var7.field8235.method3164(true)) {
                        class45.method447((byte) -81, var7);
                    }
                    var7.method3395((class521) null, 0);
                    var6.method2656((byte) 117);
                    var1 = true;
                }
            }
            if (var1) {
                class551.field8042 = class389.field5608.method4019(7);
                class389.field5608.method4017(class414.field5889, 97);
            }
            if (class322.field4395 != class352.field5213.field6864) {
                throw new RuntimeException("gnp1 pos:" + class352.field5213.field6864 + " psize:" + class322.field4395);
            } else {
                for (int var3 = 0; ~var3 > ~class619.field8816; ++var3) {
                    if (class389.field5608.method4020((long) class545.field7927[var3], (byte) -125) == null) {
                        throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class619.field8816);
                    }
                }
                if (~(-class619.field8816 + class551.field8042) != -1) {
                    throw new RuntimeException("gnp3 mis:" + (-class619.field8816 + class551.field8042));
                } else {
                    for (int var4 = 0; class551.field8042 > var4; ++var4) {
                        if (~class628.field8906 != ~class414.field5889[var4].field1004.field4548) {
                            throw new RuntimeException("gnp4 uk:" + class414.field5889[var4].field1004.field4592);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lha;I)V")
    public final void method608(class543 arg0, int arg1) {
        int var3 = -17 % ((68 - arg1) / 32);
        ++field10172;
        Object var4 = null;
        class704 var6;
        if (this.field10170 == null && this.field10176) {
            class495 var5 = this.method4049(262144, true, false, arg0);
            var6 = var5 == null ? null : var5.field7117;
        } else {
            var6 = this.field10170;
            this.field10170 = null;
        }
        if (var6 != null) {
            class667.method3808(var6, super.field3924, super.field3923, super.field3916, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "(I)I")
    public final int method595(int arg0) {
        if (arg0 != 32767) {
            return 61;
        } else {
            ++field10196;
            return this.field10166 == null ? 0 : this.field10166.method511();
        }
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(BLha;)Lro;")
    public final class522 method602(byte arg0, class543 arg1) {
        if (arg0 > -114) {
            field10185 = null;
        }
        if (this.field10167 == null) {
            this.field10167 = class222.method1551(this.method4051(0, arg1, false), super.field3923, super.field3922, super.field3916, 34);
        }
        ++field10195;
        return this.field10167;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(BLha;)Lqs;")
    public final class603 method613(byte arg0, class543 arg1) {
        ++field10186;
        if (this.field10166 == null) {
            return null;
        } else {
            class121 var3 = arg1.method342();
            var3.method845(super.field3923, super.field3922, super.field3916);
            if (arg0 <= 76) {
                method4048(-8, -2, -86, 72, -26, -67, -121);
            }
            class603 var4 = class6.method26(this.field10192, 119, 1);
            if (class100.field1447) {
                this.field10166.method503(var3, var4.field8543[0], class680.field9660, 0);
            } else {
                this.field10166.method533(var3, var4.field8543[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)I")
    public final int method604(byte arg0) {
        ++field10168;
        return arg0 != 94 ? 125 : 22;
    }

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "(I)Z")
    public final boolean method715(int arg0) {
        ++field10171;
        if (arg0 != -12888) {
            this.method614((byte) 90);
        }
        return this.field10197;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILha;Z)Lka;")
    private final class282 method4051(int arg0, class543 arg1, boolean arg2) {
        ++field10188;
        if (this.field10166 != null && arg1.method300(this.field10166.method528(), arg0) == 0) {
            return this.field10166;
        } else {
            class495 var4 = this.method4049(arg0, false, arg2, arg1);
            return var4 != null ? var4.field7119 : null;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)I")
    public final int method601(byte arg0) {
        ++field10177;
        if (arg0 <= 86) {
            this.method614((byte) -20);
        }
        return 65535 & this.field10180;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILjw;Lha;BIZI)V")
    public final void method711(int arg0, class280 arg1, class543 arg2, byte arg3, int arg4, boolean arg5, int arg6) {
        if (arg3 <= 28) {
            this.method598((byte) -55);
        }
        ++field10183;
        if (arg1 instanceof class724) {
            class724 var8 = (class724) arg1;
            if (this.field10166 != null && var8.field10166 != null) {
                this.field10166.method512(var8.field10166, arg0, arg4, arg6, arg5);
                return;
            }
        }
    }
}

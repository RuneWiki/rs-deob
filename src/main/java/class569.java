import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class569 extends class567 implements class310 {

    @OriginalMember(owner = "client!raa", name = "n", descriptor = "B")
    private byte field7159;

    @OriginalMember(owner = "client!raa", name = "z", descriptor = "Z")
    private boolean field7171;

    @OriginalMember(owner = "client!raa", name = "l", descriptor = "B")
    private byte field7157;

    @OriginalMember(owner = "client!raa", name = "v", descriptor = "B")
    private byte field7167;

    @OriginalMember(owner = "client!raa", name = "L", descriptor = "S")
    private short field7183;

    @OriginalMember(owner = "client!raa", name = "B", descriptor = "Z")
    private boolean field7173;

    @OriginalMember(owner = "client!raa", name = "j", descriptor = "Z")
    private boolean field7155;

    @OriginalMember(owner = "client!raa", name = "k", descriptor = "Z")
    private boolean field7156;

    @OriginalMember(owner = "client!raa", name = "J", descriptor = "Lw;")
    private class279 field7181;

    @OriginalMember(owner = "client!raa", name = "F", descriptor = "Lba;")
    public class359 field7177;

    @OriginalMember(owner = "client!raa", name = "w", descriptor = "[F")
    public static float[] field7168 = new float[16384];

    @OriginalMember(owner = "client!raa", name = "P", descriptor = "[F")
    public static float[] field7187 = new float[16384];

    @OriginalMember(owner = "client!raa", name = "i", descriptor = "I")
    public static int field7154;

    @OriginalMember(owner = "client!raa", name = "o", descriptor = "I")
    public static int field7160;

    @OriginalMember(owner = "client!raa", name = "p", descriptor = "I")
    public static int field7161;

    @OriginalMember(owner = "client!raa", name = "q", descriptor = "I")
    public static int field7162;

    @OriginalMember(owner = "client!raa", name = "r", descriptor = "I")
    public static int field7163;

    @OriginalMember(owner = "client!raa", name = "s", descriptor = "I")
    public static int field7164;

    @OriginalMember(owner = "client!raa", name = "t", descriptor = "I")
    public static int field7165;

    @OriginalMember(owner = "client!raa", name = "u", descriptor = "I")
    public static int field7166;

    @OriginalMember(owner = "client!raa", name = "x", descriptor = "I")
    public static int field7169;

    @OriginalMember(owner = "client!raa", name = "y", descriptor = "I")
    public static int field7170;

    @OriginalMember(owner = "client!raa", name = "A", descriptor = "I")
    public static int field7172;

    @OriginalMember(owner = "client!raa", name = "C", descriptor = "I")
    public static int field7174;

    @OriginalMember(owner = "client!raa", name = "D", descriptor = "I")
    public static int field7175;

    @OriginalMember(owner = "client!raa", name = "E", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!raa", name = "G", descriptor = "I")
    public static int field7178;

    @OriginalMember(owner = "client!raa", name = "H", descriptor = "I")
    public static int field7179;

    @OriginalMember(owner = "client!raa", name = "I", descriptor = "I")
    public static int field7180;

    @OriginalMember(owner = "client!raa", name = "K", descriptor = "I")
    public static int field7182;

    @OriginalMember(owner = "client!raa", name = "M", descriptor = "I")
    public static int field7184;

    @OriginalMember(owner = "client!raa", name = "N", descriptor = "I")
    public static int field7185;

    @OriginalMember(owner = "client!raa", name = "O", descriptor = "I")
    public static int field7186;

    @OriginalMember(owner = "client!raa", name = "Q", descriptor = "I")
    public static int field7188;

    @OriginalMember(owner = "client!raa", name = "m", descriptor = "Lqt;")
    private class595 field7158;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; ~var2 > -16385; ++var2) {
            field7187[var2] = (float) Math.sin((double) var2 * var0);
            field7168[var2] = (float) Math.cos((double) var2 * var0);
        }
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(B)I", line = 3)
    public final int method139(byte arg0) {
        ++field7180;
        return arg0 < 13 ? -32 : this.field7159;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(IBIIIIII)V", line = 15)
    public static final void method3013(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field7170;
        int var8 = arg7 - -arg5;
        int var9 = -arg5 + arg4;
        for (int var10 = arg7; var8 > var10; ++var10) {
            class390.method2223(arg2, arg3, class30.field364[var10], (byte) -105, arg6);
        }
        int var11 = arg2 + arg5;
        for (int var12 = arg4; ~var12 < ~var9; --var12) {
            class390.method2223(arg2, arg3, class30.field364[var12], (byte) -120, arg6);
        }
        if (arg1 > -11) {
            method3019(-52);
        }
        int var13 = arg6 - arg5;
        for (int var14 = var8; var9 >= var14; ++var14) {
            int[] var15 = class30.field364[var14];
            class390.method2223(arg2, arg3, var15, (byte) -96, var11);
            class390.method2223(var11, arg0, var15, (byte) -76, var13);
            class390.method2223(var13, arg3, var15, (byte) -75, arg6);
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Loa;B)V", line = 61)
    public final void method130(class650 arg0, byte arg1) {
        if (arg1 < -27) {
            ++field7176;
            Object var3 = null;
            class279 var5;
            if (this.field7181 == null && this.field7156) {
                class180 var4 = this.method3018(true, 262144, arg0, 3);
                var5 = var4 != null ? var4.field2118 : null;
            } else {
                var5 = this.field7181;
                this.field7181 = null;
            }
            if (var5 != null) {
                class157.method961(var5, this.field7157, super.field7102, super.field7104, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)I", line = 88)
    public final int method131(byte arg0) {
        if (arg0 != -97) {
            return 9;
        } else {
            ++field7178;
            return 65535 & this.field7183;
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Loa;BI)Lba;", line = 100)
    public final class359 method134(class650 arg0, byte arg1, int arg2) {
        if (arg1 < 80) {
            return null;
        } else {
            ++field7182;
            return this.method3014(arg2, -1, arg0);
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(BILoa;I)Z", line = 111)
    public final boolean method8(byte arg0, int arg1, class650 arg2, int arg3) {
        ++field7184;
        class359 var5 = this.method3014(131072, -1, arg2);
        if (var5 != null) {
            class396 var6 = arg2.method470();
            var6.method591(super.field7102, super.field7101, super.field7104);
            return var5.method2074(arg3, arg1, var6, false);
        } else {
            int var7 = 5 % ((77 - arg0) / 40);
            return false;
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(ZLoa;Lnt;IIII)V", line = 133)
    public final void method135(boolean arg0, class650 arg1, class209 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!(arg2 instanceof class569)) {
            if (arg2 instanceof class522) {
                class522 var8 = (class522) arg2;
                if (this.field7177 != null && var8.field6586 != null) {
                    this.field7177.method2057(var8.field6586, arg5, arg3, arg4, arg0);
                }
            }
        } else {
            class569 var9 = (class569) arg2;
            if (this.field7177 != null && var9.field7177 != null) {
                this.field7177.method2057(var9.field7177, arg5, arg3, arg4, arg0);
            }
        }
        if (arg6 == 12137) {
            ++field7160;
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Z)Z", line = 164)
    public final boolean method133(boolean arg0) {
        ++field7162;
        if (arg0) {
            this.method8((byte) 112, 81, (class650) null, 81);
        }
        return this.field7156;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(IILoa;)Lba;", line = 176)
    private final class359 method3014(int arg0, int arg1, class650 arg2) {
        ++field7166;
        if (this.field7177 != null && arg2.method493(this.field7177.method2075(), arg0) == 0) {
            return this.field7177;
        } else {
            class180 var4 = this.method3018(false, arg0, arg2, 3);
            if (arg1 != -1) {
                this.field7183 = 59;
            }
            return var4 == null ? null : var4.field2119;
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)V", line = 198)
    public final void method132(int arg0) {
        if (this.field7177 != null) {
            this.field7177.method2090();
        }
        ++field7188;
        if (arg0 != -13968) {
            method3017(105, -24, 127);
        }
    }

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(Loa;Lpg;IIIIZIIZ)V", line = 213)
    public class569(class650 arg0, class687 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class270.method1606(3, arg7, arg8));
        this.field7159 = (byte) arg8;
        this.field7171 = ~arg1.field9382 != -1 && !arg6;
        this.field7157 = (byte) arg2;
        this.field7167 = (byte) arg7;
        this.field7183 = (short) arg1.field9408;
        super.field7102 = arg3;
        this.field7173 = arg6;
        this.field7155 = arg9;
        super.field7104 = arg5;
        this.field7156 = arg0.method465() && arg1.field9433 && !this.field7173 && class611.field8310.method3598(-15929, class628.field8526) != 0;
        int var11 = 2048;
        if (this.field7155) {
            var11 |= 65536;
        }
        class180 var12 = this.method3018(this.field7156, var11, arg0, 3);
        if (var12 != null) {
            this.field7181 = var12.field2118;
            this.field7177 = var12.field2119;
            if (this.field7155) {
                this.field7177 = this.field7177.method951((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(Loa;B)V", line = 249)
    public final void method7(class650 arg0, byte arg1) {
        if (arg1 != 98) {
            field7168 = null;
        }
        ++field7185;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(IB)V", line = 261)
    public static final void method3015(int arg0, byte arg1) {
        if (arg1 != 58) {
            field7168 = null;
        }
        ++field7179;
        if (class409.method2299((byte) -43, arg0)) {
            class417.method2321(class325.field4062[arg0], -1, arg1 + 61);
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(ILoa;)Lww;", line = 275)
    public final class686 method11(int arg0, class650 arg1) {
        ++field7165;
        if (arg0 >= -89) {
            field7187 = null;
        }
        if (this.field7177 == null) {
            return null;
        } else {
            class396 var3 = arg1.method470();
            var3.method591(super.field7102, super.field7101, super.field7104);
            class686 var4 = null;
            if (this.field7171) {
                var4 = class458.method2520(0, 1);
            }
            this.field7177.method2049(var3, var4 == null ? null : var4.field9361[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Loa;I)V", line = 304)
    public final void method136(class650 arg0, int arg1) {
        ++field7175;
        Object var3 = null;
        class279 var5;
        if (this.field7181 == null && this.field7156) {
            class180 var4 = this.method3018(true, 262144, arg0, 3);
            var5 = var4 != null ? var4.field2118 : null;
        } else {
            var5 = this.field7181;
            this.field7181 = null;
        }
        if (var5 != null) {
            class350.method2017(var5, this.field7157, super.field7102, super.field7104, (boolean[]) null);
        }
        int var6 = -57 % ((arg1 - -78) / 37);
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(ZB)V", line = 337)
    public static final void method3016(boolean arg0, byte arg1) {
        if (arg0 && class604.field8107 != null) {
            class694.field9630 = class604.field8107.field5865;
        } else {
            class694.field9630 = -1;
        }
        ++field7186;
        class578.field7767 = null;
        class74.field986 = null;
        class394.field5023 = 0;
        class604.field8107 = null;
        class604.method3336();
        class604.field8112.method1913((byte) 53);
        class621.field8434 = null;
        class103.field1316 = -1;
        if (arg1 < 37) {
            field7187 = null;
        }
        class349.field4486 = null;
        class80.field1043 = -1;
        class26.field313 = null;
        class604.field8110 = null;
        class694.field9625 = null;
        class532.field6729 = null;
        class96.field1245 = null;
        class670.field9107 = null;
        class64.field784 = null;
        class683.field9309 = null;
        if (class604.field8104 != null) {
            class604.field8104.method96((byte) -16);
            class604.field8104.method94(128, (byte) 49, 64);
        }
        if (class604.field8108 != null) {
            class604.field8108.method1004(79, 64, 64);
        }
        if (class604.field8105 != null) {
            class604.field8105.method2359(64, (byte) 86);
        }
        class392.field5013.method1359(64, (byte) 90);
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(III)Z", line = 383)
    public static final boolean method3017(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method3019(57);
        }
        ++field7161;
        return (arg0 & 2048) != 0;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(ZILoa;I)Lm;", line = 394)
    private final class180 method3018(boolean arg0, int arg1, class650 arg2, int arg3) {
        ++field7174;
        if (arg3 != 3) {
            return null;
        } else {
            class687 var5 = class232.field3017.method2358(0, 65535 & this.field7183);
            class140 var6;
            class140 var7;
            if (this.field7173) {
                var6 = class252.field3250[0];
                var7 = class286.field3633[this.field7157];
            } else {
                if (this.field7157 >= 3) {
                    var6 = null;
                } else {
                    var6 = class252.field3250[this.field7157 + 1];
                }
                var7 = class252.field3250[this.field7157];
            }
            return var5.method3786(var6, super.field7104, this.field7159, true, super.field7102, arg1, var7, super.field7101, this.field7167, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(I)I", line = 429)
    public final int method138(int arg0) {
        if (arg0 != 8470) {
            this.method130((class650) null, (byte) -87);
        }
        ++field7172;
        return this.field7167;
    }

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "(I)Z", line = 441)
    public final boolean method137(int arg0) {
        ++field7164;
        if (arg0 > -30) {
            this.field7167 = 50;
        }
        return this.field7155;
    }

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "(B)V", line = 457)
    public final void method140(byte arg0) {
        ++field7163;
        this.field7155 = false;
        if (this.field7177 != null) {
            this.field7177.method2069(-65537 & this.field7177.method2075());
        }
        int var2 = -72 % ((arg0 - -16) / 40);
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(Loa;I)Lqt;", line = 474)
    public final class595 method6(class650 arg0, int arg1) {
        ++field7169;
        if (arg1 != -7459) {
            this.method133(true);
        }
        if (this.field7158 == null) {
            this.field7158 = class280.method1688(this.method3014(0, -1, arg0), super.field7104, -1, super.field7101, super.field7102);
        }
        return this.field7158;
    }

    @OriginalMember(owner = "client!raa", name = "e", descriptor = "(I)V", line = 489)
    public static void method3019(int arg0) {
        field7187 = null;
        field7168 = null;
        if (arg0 != 22260) {
            method3015(18, (byte) 57);
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(BLjava/io/File;)[B", line = 502)
    public static final byte[] method3020(byte arg0, File arg1) {
        ++field7154;
        if (arg0 != -120) {
            field7187 = null;
        }
        return class318.method1847(arg1, (int) arg1.length(), true);
    }
}

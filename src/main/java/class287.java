import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class287 {

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    private int field3950 = -1;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "Z")
    public boolean field3943 = true;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "Lcm;")
    private class760 field3944;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    private int field3942;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    private int field3951;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "Lsf;")
    private class551 field3953;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "Lgl;")
    private class627 field3952;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public int field3948;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    private int field3949;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    private int field3941;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "Lta;")
    private class226 field3956;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "Lvl;")
    public static class15 field3939 = new class15(18, -1);

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "[I")
    public static int[] field3961 = new int[128];

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "Lpja;")
    public static class43 field3962;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "I")
    public static int field3960;

    static {
        for (int var0 = 0; var0 < field3961.length; var0++) {
            field3961[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field3961[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field3961[var2] = var2 + 26 - 97;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field3961[var3] = var3 + 4;
        }
        field3961[45] = field3961[47] = 63;
        field3961[42] = field3961[43] = 62;
        field3962 = new class43(8);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V", line = 4)
    public final void method1831(boolean arg0) {
        if (!arg0) {
            this.field3951 = 16;
        }
        this.method1834(this.field3948, -16093, this.field3956);
        field3945++;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILjava/lang/String;)I", line = 15)
    public static final int method1832(int arg0, String arg1) {
        if (arg0 >= -93) {
            return 112;
        } else {
            field3959++;
            return class341.method2123(arg1, 10, true, -9105);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lhk;IIZII)Lvq;", line = 28)
    public static final class488 method1833(class111 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field3947++;
        if (arg3) {
            return null;
        } else if (!arg0.field1979 && (!class461.method2656(0, arg2) || !class461.method2656(0, arg1))) {
            return arg0.field1989 ? new class488(arg0, 34037, arg4, arg5, arg2, arg1, true) : new class488(arg0, arg4, arg5, arg2, arg1, class241.method1609((byte) -95, arg2), class241.method1609((byte) -78, arg1), true);
        } else {
            return new class488(arg0, 3553, arg4, arg5, arg2, arg1, true);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IILta;)V", line = 47)
    public final void method1834(int arg0, int arg1, class226 arg2) {
        field3955++;
        if (arg0 > 0) {
            this.method1840((byte) -86);
            this.field3953.method3090(this.field3952, (byte) 111);
            this.field3953.method830(this.field3949 + 1 - this.field3941, arg2, class501.field6860, (byte) -127, arg0, this.field3941, 0);
        }
        if (arg1 != -16093) {
            this.field3956 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([IZILwda;)V", line = 66)
    public static final void method1835(int[] arg0, boolean arg1, int arg2, class666 arg3) {
        if (arg3.field5214 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg3.field5214.length; var5++) {
                if (arg3.field5214[var5] != arg0[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg3.field5230 != -1) {
                class200 var6 = class108.field1696.method1279((byte) 92, arg3.field5230);
                int var7 = var6.field3031;
                if (var7 == 1) {
                    arg3.field5251 = 0;
                    arg3.field5242 = 1;
                    arg3.field5270 = 0;
                    arg3.field5296 = arg2;
                    arg3.field5238 = 0;
                    if (!arg3.field5229) {
                        class189.method1394(arg3, 256, var6, arg3.field5270);
                    }
                }
                if (var7 == 2) {
                    arg3.field5251 = 0;
                }
            }
        }
        field3946++;
        if (arg1) {
            return;
        }
        boolean var8 = true;
        for (int var9 = 0; var9 < arg0.length; var9++) {
            if (arg0[var9] != -1) {
                var8 = false;
            }
            if (arg3.field5214 == null || arg3.field5214[var9] == -1 || class108.field1696.method1279((byte) 92, arg0[var9]).field3038 >= class108.field1696.method1279((byte) 92, arg3.field5214[var9]).field3038) {
                arg3.field5214 = arg0;
                arg3.field5305 = arg3.field5307;
                arg3.field5296 = arg2;
            }
        }
        if (var8) {
            arg3.field5214 = arg0;
            arg3.field5296 = arg2;
            arg3.field5305 = arg3.field5307;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V", line = 154)
    public static final void method1836(byte arg0) {
        field3940++;
        if (arg0 >= -109) {
            method1838((byte) 17);
        }
        if (class70.field1043 == 0) {
            return;
        }
        try {
            if ((++class559.field7946) > 2000) {
                if (class193.field2948 != null) {
                    class193.field2948.method917(-78);
                    class193.field2948 = null;
                }
                if (class769.field10608 >= 2) {
                    class70.field1043 = 0;
                    class204.field3082 = -5;
                    return;
                }
                class659.field9122.method4171(-118);
                class70.field1043 = 1;
                class559.field7946 = 0;
                class769.field10608++;
            }
            if (class70.field1043 == 1) {
                class58.field816 = class659.field9122.method4168(class630.field8751, (byte) -119);
                class70.field1043 = 2;
            }
            if (class70.field1043 == 2) {
                if (class58.field816.field7412 == 2) {
                    throw new IOException();
                }
                if (class58.field816.field7412 != 1) {
                    return;
                }
                class193.field2948 = class203.method1455(-117, 7500, (Socket) class58.field816.field7416);
                class58.field816 = null;
                class149.method1191(84);
                class70.field1043 = 4;
            }
            if (class70.field1043 == 4 && class193.field2948.method921(true, 1)) {
                class193.field2948.method922(1, (byte) -65, class262.field3679.field1413, 0);
                int var1 = class262.field3679.field1413[0] & 0xFF;
                class70.field1043 = 0;
                class204.field3082 = var1;
                class193.field2948.method917(-110);
                class193.field2948 = null;
            }
        } catch (IOException var2) {
            if (class193.field2948 != null) {
                class193.field2948.method917(-25);
                class193.field2948 = null;
            }
            if (class769.field10608 >= 2) {
                class204.field3082 = -4;
                class70.field1043 = 0;
            } else {
                class659.field9122.method4171(117);
                class70.field1043 = 1;
                class559.field7946 = 0;
                class769.field10608++;
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB)Z", line = 256)
    public static final boolean method1837(int arg0, byte arg1) {
        if (arg1 <= 41) {
            return true;
        } else {
            field3954++;
            return arg0 == 4 || arg0 == 8 || arg0 == 11;
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)V", line = 268)
    public static void method1838(byte arg0) {
        if (arg0 != -15) {
            field3962 = null;
        }
        field3961 = null;
        field3962 = null;
        field3939 = null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lhga;I)V", line = 280)
    public static final void method1839(class186 arg0, int arg1) {
        field3960++;
        arg0.field2878 = null;
        int var2 = arg0.field2877.length;
        int var3 = 0;
        if (arg1 != 8792) {
            field3958 = 76;
        }
        while (var2 > var3) {
            arg0.field2877[var3].field2428 = false;
            var3++;
        }
        class239[] var4 = class485.field6557;
        synchronized (class485.field6557) {
            if (var2 < class485.field6557.length && class215.field3193[var2] < 200) {
                class485.field6557[var2].method1600(arg0, -3);
                int var10002 = class215.field3193[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lsf;Lcm;Lek;IIIII)V", line = 498)
    public class287(class551 arg0, class760 arg1, class535 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field3944 = arg1;
        this.field3942 = arg6;
        this.field3951 = arg7;
        this.field3953 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field4037 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field7269[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field3952 = null;
            this.field3948 = 0;
        } else {
            this.field3949 = Integer.MIN_VALUE;
            this.field3941 = Integer.MAX_VALUE;
            this.field3956 = this.field3953.method812(false, 69);
            this.field3956.method1546(var10, -13659);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field3956.method1545(true, -4450);
                if (var15 != null) {
                    Stream var16 = this.field3953.method3170((byte) 5, var15);
                    if (Stream.method3910()) {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field4037 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field7269[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (this.field3949 < var28) {
                                            this.field3949 = var28;
                                        }
                                        if (var28 < this.field3941) {
                                            this.field3941 = var28;
                                        }
                                        var16.method3912(var28);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field4037 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field7269[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (this.field3949 < var22) {
                                            this.field3949 = var22;
                                        }
                                        if (var22 < this.field3941) {
                                            this.field3941 = var22;
                                        }
                                        var16.method3903(var22);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3901();
                    if (this.field3956.method1544(91)) {
                        break;
                    }
                }
            }
            this.field3948 = var10 / 3;
        }
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(B)V", line = 322)
    private final void method1840(byte arg0) {
        field3957++;
        int var2 = 39 / ((5 - arg0) / 40);
        if (!this.field3943) {
            return;
        }
        this.field3943 = false;
        byte[] var3 = this.field3944.field10462;
        int var4 = 0;
        int var5 = this.field3944.field10472;
        int var6 = this.field3944.field10472 * this.field3951 + this.field3942;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var18 = -128; var18 < 0; var18++) {
                if (var3[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field3952 != null && this.field3950 == var4) {
            this.field3943 = false;
            return;
        }
        this.field3950 = var4;
        int var8 = this.field3951 * var5 + this.field3942;
        int var9 = 0;
        if (!this.field3953.method810(class497.field6799, true, class485.field6566)) {
            if (class72.field1063 == null) {
                class72.field1063 = new int[16384];
            }
            int[] var10 = class72.field1063;
            for (int var11 = -128; var11 < 0; var11++) {
                for (int var12 = -128; var12 < 0; var12++) {
                    if (var3[var8] == 0) {
                        int var13 = 0;
                        if (var3[var8 - 1] != 0) {
                            var13++;
                        }
                        if (var3[var8 + 1] != 0) {
                            var13++;
                        }
                        if (var3[var8 - var5] != 0) {
                            var13++;
                        }
                        if (var3[var5 + var8] != 0) {
                            var13++;
                        }
                        var10[var9++] = var13 * 17 << 24;
                    } else {
                        var10[var9++] = 1140850688;
                    }
                    var8++;
                }
                var8 += this.field3944.field10472 - 128;
            }
            if (this.field3952 == null) {
                this.field3952 = this.field3953.method3139(false, 128, false, 128, class72.field1063);
                this.field3952.method2679(false, false, -17383);
            } else {
                this.field3952.method2671(class72.field1063, 0, 9842, 0, 128, 0, 128, 128);
            }
            return;
        }
        if (class695.field9622 == null) {
            class695.field9622 = new byte[16384];
        }
        byte[] var14 = class695.field9622;
        for (int var15 = -128; var15 < 0; var15++) {
            for (int var16 = -128; var16 < 0; var16++) {
                if (var3[var8] == 0) {
                    int var17 = 0;
                    if (var3[var8 - 1] != 0) {
                        var17++;
                    }
                    if (var3[var8 + 1] != 0) {
                        var17++;
                    }
                    if (var3[var8 - var5] != 0) {
                        var17++;
                    }
                    if (var3[var5 + var8] != 0) {
                        var17++;
                    }
                    var14[var9++] = (byte) (var17 * 17);
                } else {
                    var14[var9++] = 68;
                }
                var8++;
            }
            var8 += this.field3944.field10472 - 128;
        }
        if (this.field3952 == null) {
            this.field3952 = this.field3953.method3154(class485.field6566, 128, (byte) 81, 128, class695.field9622, false);
            this.field3952.method2679(false, false, -17383);
        } else {
            this.field3952.method2672(class695.field9622, 0, 128, 0, class485.field6566, 32216, 0, 128, 128);
        }
    }
}

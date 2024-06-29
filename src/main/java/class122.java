import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public abstract class class122 extends class697 {

    @OriginalMember(owner = "client!vr", name = "B", descriptor = "S")
    public short field2222;

    @OriginalMember(owner = "client!vr", name = "G", descriptor = "S")
    public short field2227;

    @OriginalMember(owner = "client!vr", name = "z", descriptor = "S")
    public short field2220;

    @OriginalMember(owner = "client!vr", name = "J", descriptor = "S")
    public short field2230;

    @OriginalMember(owner = "client!vr", name = "D", descriptor = "Z")
    public boolean field2224;

    @OriginalMember(owner = "client!vr", name = "E", descriptor = "B")
    public byte field2225;

    @OriginalMember(owner = "client!vr", name = "A", descriptor = "[I")
    public static int[] field2221 = new int[2];

    @OriginalMember(owner = "client!vr", name = "F", descriptor = "Lsb;")
    public static class266 field2226 = new class266(24, 3);

    @OriginalMember(owner = "client!vr", name = "y", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!vr", name = "C", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!vr", name = "I", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!vr", name = "K", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!vr", name = "L", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!vr", name = "H", descriptor = "[I")
    public static int[] field2228;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "(B)Z")
    public final boolean method838(byte arg0) {
        ++field2231;
        return arg0 < 4 ? true : class36.method534(this.field2220, this.field2230, this.field2222, 100, this.method530(-70), super.field9804, this.field2227);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "([Lff;B)I")
    public final int method835(class9[] arg0, byte arg1) {
        ++field2232;
        int var3 = 0;
        label118: for (int var4 = this.field2220; ~this.field2227 <= ~var4; ++var4) {
            label116: for (int var5 = this.field2230; ~this.field2222 <= ~var5; ++var5) {
                long var6 = class335.field5016[super.field9814][var4][var5];
                long var8 = 0L;
                while (true) {
                    label111: while (true) {
                        if (var8 > 48L) {
                            continue label116;
                        }
                        int var10 = (int) (65535L & var6 >>> (int) var8);
                        if (~var10 >= -1) {
                            continue label116;
                        }
                        class682 var11 = class173.field2850[var10 + -1];
                        for (int var12 = 0; var3 > var12; ++var12) {
                            if (arg0[var12] == var11.field9658) {
                                var8 += 16L;
                                continue label111;
                            }
                        }
                        arg0[var3++] = var11.field9658;
                        if (~var3 == -5) {
                            break label118;
                        }
                        var8 += 16L;
                    }
                }
            }
        }
        if (arg1 <= 102) {
            return -119;
        } else {
            for (int var13 = var3; ~var13 > -5; ++var13) {
                arg0[var13] = null;
            }
            if (~this.field2225 != -1) {
                int var14 = -class547.field7768 + this.field2220;
                int var15 = -class318.field4685 + this.field2230;
                int var16;
                short var17;
                int var18;
                short var19;
                if (~this.field2225 == -2) {
                    if (var14 < var15) {
                        var16 = this.field2220 + 1;
                        var17 = this.field2230;
                        var18 = this.field2230 + -1;
                        var19 = this.field2220;
                    } else {
                        var17 = this.field2230;
                        var19 = this.field2220;
                        var18 = this.field2230 + 1;
                        var16 = this.field2220 - 1;
                    }
                } else if (-var14 >= var15) {
                    var16 = this.field2220 + 1;
                    var18 = this.field2230 - -1;
                    var17 = this.field2230;
                    var19 = this.field2220;
                } else {
                    var19 = this.field2220;
                    var16 = this.field2220 + -1;
                    var17 = this.field2230;
                    var18 = this.field2230 + -1;
                }
                label82: for (int var20 = 0; ~var20 > ~var3; ++var20) {
                    long var21 = class335.field5016[super.field9814][var19][var18];
                    while (~var21 != -1L) {
                        class682 var27 = class173.field2850[(int) ((var21 & 65535L) + -1L)];
                        var21 >>>= 16;
                        if (arg0[var20] == var27.field9658) {
                            continue label82;
                        }
                    }
                    long var23 = class335.field5016[super.field9814][var16][var17];
                    while (var23 != 0L) {
                        class682 var26 = class173.field2850[(int) ((65535L & var23) + -1L)];
                        var23 >>>= 16;
                        if (arg0[var20] == var26.field9658) {
                            continue label82;
                        }
                    }
                    for (int var25 = var20; ~var25 > ~(var3 + -1); ++var25) {
                        arg0[var25] = arg0[var25 + 1];
                    }
                    --var3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "(B)V")
    public static void method1056(byte arg0) {
        if (arg0 == -93) {
            field2226 = null;
            field2221 = null;
            field2228 = null;
        }
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(IIIIIIIIIZB)V")
    public class122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        this.field2222 = (short) arg8;
        super.field9814 = (byte) arg0;
        super.field9806 = arg2;
        this.field2227 = (short) arg6;
        this.field2220 = (short) arg5;
        super.field9804 = (byte) arg1;
        this.field2230 = (short) arg7;
        this.field2224 = arg9;
        super.field9809 = arg3;
        this.field2225 = arg10;
        super.field9815 = arg4;
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(Z)Z")
    public final boolean method836(boolean arg0) {
        ++field2219;
        if (!arg0) {
            this.method835((class9[]) null, (byte) -44);
        }
        for (int var2 = this.field2220; ~this.field2227 <= ~var2; ++var2) {
            for (int var3 = this.field2230; ~this.field2222 <= ~var3; ++var3) {
                int var4 = class643.field9239 + var2 + -class547.field7768;
                if (~var4 <= -1 && var4 < class224.field3361.length) {
                    int var5 = class643.field9239 + var3 + -class318.field4685;
                    if (var5 >= 0 && var5 < class224.field3361.length && class224.field3361[var4][var5]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "(I)V")
    public void method529(int arg0) {
        if (arg0 == -1) {
            ++field2229;
        }
    }
}

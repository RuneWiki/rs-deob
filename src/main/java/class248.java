import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class248 extends class161 {

    @OriginalMember(owner = "client!nd", name = "T", descriptor = "Z")
    public static boolean field4526 = false;

    @OriginalMember(owner = "client!nd", name = "W", descriptor = "Lhj;")
    public static class69 field4529 = class181.method1318("Stufe)2", (byte) -124);

    @OriginalMember(owner = "client!nd", name = "Z", descriptor = "Lhj;")
    public static class69 field4532 = class181.method1318("Versteckt", (byte) -128);

    @OriginalMember(owner = "client!nd", name = "S", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!nd", name = "V", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!nd", name = "X", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!nd", name = "Y", descriptor = "I")
    public int field4531;

    @OriginalMember(owner = "client!nd", name = "bb", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!nd", name = "cb", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!nd", name = "U", descriptor = "Lke;")
    public class105 field4527;

    @OriginalMember(owner = "client!nd", name = "ab", descriptor = "[B")
    public byte[] field4533;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)V")
    public static final void method1747(int arg0, int arg1) {
        if (arg0 == 15) {
            ++field4535;
            if (class200.field3625 == null || ~class200.field3625.length > ~arg1) {
                class200.field3625 = new int[arg1];
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILek;IIZ)V")
    public static final void method1748(int arg0, int arg1, class159 arg2, int arg3, int arg4, boolean arg5) {
        ++field4530;
        if (class229.field4200 < 50) {
            if (arg2.field2946 != null && arg2.field2946.length > arg4 && arg2.field2946[arg4] != null) {
                int var6 = arg2.field2946[arg4][0];
                int var7 = -80 % ((arg3 - 55) / 35);
                int var8 = var6 >> 4 & 7;
                int var9 = var6 >> 8;
                if (~arg2.field2946[arg4].length < -2) {
                    int var10 = (int) (Math.random() * (double) arg2.field2946[arg4].length);
                    if (~var10 < -1) {
                        var9 = arg2.field2946[arg4][var10];
                    }
                }
                int var11 = var6 & 15;
                if (var11 == 0) {
                    if (arg5) {
                        class255.method1768(-71, 0, var8, var9);
                    }
                } else if (class11.field105 != 0) {
                    class124.field2309[class229.field4200] = var9;
                    class220.field3956[class229.field4200] = var8;
                    int var12 = (arg0 + -64) / 128;
                    int var13 = (arg1 - 64) / 128;
                    class59.field1077[class229.field4200] = 0;
                    class83.field1592[class229.field4200] = null;
                    class114.field2191[class229.field4200] = (var13 << 16) + var11 - -(var12 << 8);
                    ++class229.field4200;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(Z)I")
    public final int method576(boolean arg0) {
        ++field4525;
        if (!arg0) {
            method1747(-68, -18);
        }
        return super.field2983 ? 0 : 100;
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)V")
    public static void method1749(int arg0) {
        int var1 = 59 / ((-42 - arg0) / 36);
        field4529 = null;
        field4532 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZILhj;)V")
    public static final void method1750(boolean arg0, int arg1, class69 arg2) {
        ++field4534;
        class69 var3 = arg2.method470((byte) 37);
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class23.field311; ++var6) {
            class205 var9 = class83.method585(var6, arg1 + 21576);
            if ((!arg0 || var9.field3751) && var9.field3703 == -1 && var9.field3732 == -1 && ~var9.field3700 == -1 && var9.field3741.method470((byte) 37).method481(0, var3) != -1) {
                if (~var5 <= -251) {
                    client.field2826 = -1;
                    class141.field2641 = null;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var5 > var11; ++var11) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class217.field3923 = 0;
        class141.field2641 = var4;
        client.field2826 = var5;
        class69[] var7 = new class69[client.field2826];
        if (arg1 == -21577) {
            for (int var8 = 0; ~var8 > ~client.field2826; ++var8) {
                var7[var8] = class83.method585(var4[var8], -1).field3741;
            }
            class134.method997(true, var7, class141.field2641);
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)[B")
    public final byte[] method579(int arg0) {
        if (arg0 != -874) {
            method1747(-87, 4);
        }
        ++field4528;
        if (super.field2983) {
            throw new RuntimeException();
        } else {
            return this.field4533;
        }
    }
}

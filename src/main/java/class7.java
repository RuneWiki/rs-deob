import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public abstract class class7 extends class108 {

    @OriginalMember(owner = "client!sda", name = "k", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!sda", name = "l", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!sda", name = "m", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method22(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method28(114, 48, 25, 23, true, null);
        }
        field65++;
        return (arg0 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(IIIIZ[B)Z", line = 25)
    public static final boolean method28(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5) {
        field64++;
        boolean var6 = arg4;
        class268 var7 = new class268(arg5);
        int var8 = -1;
        label70: while (true) {
            int var9 = var7.method1717(32767);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                int var15;
                class370 var18;
                do {
                    int var16;
                    int var17;
                    do {
                        do {
                            do {
                                do {
                                    while (var11) {
                                        int var19 = var7.method1749((byte) 80);
                                        if (var19 == 0) {
                                            continue label70;
                                        }
                                        var7.method1738(255);
                                    }
                                    int var12 = var7.method1749((byte) 104);
                                    if (var12 == 0) {
                                        continue label70;
                                    }
                                    var10 += var12 - 1;
                                    int var13 = var10 & 0x3F;
                                    int var14 = var10 >> 6 & 0x3F;
                                    var15 = var7.method1738(255) >> 2;
                                    var16 = arg2 + var14;
                                    var17 = arg0 + var13;
                                } while (var16 <= 0);
                            } while (var17 <= 0);
                        } while ((arg1 - 1) <= var16);
                    } while (var17 >= arg3 - 1);
                    var18 = class552.field7819.method2890(0, var8);
                } while (var15 == 22 && !class202.field2854.field7902 && var18.field5276 == 0 && var18.field5292 != 1 && !var18.field5336);
                if (!var18.method2244(false)) {
                    class583.field8317++;
                    var6 = false;
                }
                var11 = true;
            }
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "([BBI[BIIIII)V", line = 107)
    public static final void method29(byte[] arg0, byte arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field66++;
        int var9 = -(arg7 >> 2);
        int var10 = -(arg7 & 0x3);
        if (arg1 >= -106) {
            method29(null, (byte) 98, 112, null, 111, -109, -121, 54, 89);
        }
        for (int var11 = -arg5; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg2++;
                arg3[var10001] += arg0[arg8++];
                int var14 = arg2++;
                arg3[var14] += arg0[arg8++];
                int var15 = arg2++;
                arg3[var15] += arg0[arg8++];
                int var16 = arg2++;
                arg3[var16] += arg0[arg8++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg2++;
                arg3[var10001] += arg0[arg8++];
            }
            arg2 += arg4;
            arg8 += arg6;
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)I")
    public abstract int method23(int arg0);

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)J")
    public abstract long method24(int arg0);

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "(I)I")
    public abstract int method25(int arg0);

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(Z)I")
    public abstract int method26(boolean arg0);

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "(Z)I")
    public abstract int method27(boolean arg0);
}

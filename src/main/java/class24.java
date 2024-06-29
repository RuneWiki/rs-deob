import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public class class24 extends class172 {

    @OriginalMember(owner = "client!vha", name = "p", descriptor = "J")
    private long field221 = -1L;

    @OriginalMember(owner = "client!vha", name = "u", descriptor = "Ljava/lang/String;")
    private String field226 = null;

    @OriginalMember(owner = "client!vha", name = "v", descriptor = "Lqk;")
    public static class1 field227 = new class1(23, 11);

    @OriginalMember(owner = "client!vha", name = "o", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!vha", name = "q", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!vha", name = "r", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!vha", name = "s", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!vha", name = "t", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(BLhia;)V")
    public final void method100(byte arg0, class48 arg1) {
        if (arg0 == 71) {
            arg1.method396((byte) 125, this.field226, this.field221);
            field220++;
        }
    }

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "(I)V")
    public static void method101(int arg0) {
        field227 = null;
        int var1 = 97 % ((21 - arg0) / 40);
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(ILgga;)V")
    public final void method102(int arg0, class511 arg1) {
        if (arg1.method3013(arg0 - 2029) != 255) {
            arg1.field6962--;
            this.field221 = arg1.method3020(true);
        }
        field223++;
        this.field226 = arg1.method2998((byte) -120);
        if (class333.field4775) {
            System.out.println("memberhash:" + this.field221 + " membername:" + this.field226);
        }
        if (arg0 != 2048) {
            this.method102(-93, null);
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method103(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field225++;
        if (arg0 != 0) {
            method101(35);
        }
        for (int var6 = arg3; var6 <= arg2; var6++) {
            for (int var7 = arg5; var7 <= arg4; var7++) {
                if (class712.field9919[var6][var7] == arg1 && class356.field5138[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(ILns;Z)V")
    public static final void method104(int arg0, class654 arg1, boolean arg2) {
        field224++;
        class148 var3 = arg1.method3736((byte) 114);
        if (arg1.field9215 == 0) {
            class612.field8621 = -1;
            class742.field10221 = 0;
            arg1.field9218 = 0;
            return;
        }
        if (arg1.field9150 != -1 && arg1.field9135 == 0) {
            class73 var4 = class571.field8029.method3695(arg1.field9150, (byte) -122);
            if (arg1.field9216 > 0 && var4.field809 == 0) {
                class742.field10221 = 0;
                class612.field8621 = -1;
                arg1.field9218++;
                return;
            }
            if (arg1.field9216 <= 0 && var4.field825 == 0) {
                class612.field8621 = -1;
                arg1.field9218++;
                class742.field10221 = 0;
                return;
            }
        }
        for (int var5 = 0; var5 < arg1.field9154.length; var5++) {
            if (arg1.field9154[var5].field111 != -1 && class533.field7336 >= arg1.field9154[var5].field114) {
                class346 var20 = class576.field8094.method4137((byte) -117, arg1.field9154[var5].field111);
                if (var20.field5022 && var20.field5023 != -1) {
                    class73 var21 = class571.field8029.method3695(var20.field5023, (byte) -118);
                    if (arg1.field9216 > 0 && var21.field809 == 0) {
                        arg1.field9218++;
                        class742.field10221 = 0;
                        class612.field8621 = -1;
                        return;
                    }
                    if (arg1.field9216 <= 0 && var21.field825 == 0) {
                        class742.field10221 = 0;
                        arg1.field9218++;
                        class612.field8621 = -1;
                        return;
                    }
                }
            }
        }
        int var6 = arg1.field3470;
        int var7 = arg1.field3460;
        int var8 = arg1.field9219[arg1.field9215 - 1] * 512 + (arg1.method3744(1) * 256);
        if (arg0 != -4710) {
            field227 = null;
        }
        int var9 = arg1.field9214[arg1.field9215 - 1] * 512 + (arg1.method3744(1) * 256);
        if (var6 >= var8) {
            if (var6 <= var8) {
                if (var9 > var7) {
                    arg1.method3745(0, 8192);
                } else if (var7 > var9) {
                    arg1.method3745(0, 0);
                }
            } else if (var7 < var9) {
                arg1.method3745(0, 6144);
            } else if (var7 <= var9) {
                arg1.method3745(0, 4096);
            } else {
                arg1.method3745(0, 2048);
            }
        } else if (var9 > var7) {
            arg1.method3745(0, 10240);
        } else if (var7 > var9) {
            arg1.method3745(0, 14336);
        } else {
            arg1.method3745(0, 12288);
        }
        byte var10 = arg1.field9213[arg1.field9215 - 1];
        if (!arg2 && (var8 - var6) > 1024 || var8 - var6 < -1024 || var9 - var7 > 1024 || (var9 - var7) < -1024) {
            arg1.field3470 = var8;
            arg1.field3460 = var9;
            arg1.method3746(16383, arg1.field9171, false);
            arg1.field9215--;
            class742.field10221 = 0;
            if (arg1.field9216 > 0) {
                arg1.field9216--;
            }
            class612.field8621 = -1;
            return;
        }
        int var11 = 16;
        boolean var12 = true;
        if (arg1 instanceof class359) {
            var12 = ((class359) arg1).field5172.field8915;
        }
        if (var12) {
            int var13 = arg1.field9171 - arg1.field9128.field7662;
            if (var13 != 0 && arg1.field9137 == -1 && arg1.field9118 != 0) {
                var11 = 8;
            }
            if (!arg2 && arg1.field9215 > 2) {
                var11 = 24;
            }
            if (!arg2 && arg1.field9215 > 3) {
                var11 = 32;
            }
        } else {
            if (!arg2 && arg1.field9215 > 1) {
                var11 = 24;
            }
            if (!arg2 && arg1.field9215 > 2) {
                var11 = 32;
            }
        }
        if (arg1.field9218 > 0 && arg1.field9215 > 1) {
            var11 = 32;
            arg1.field9218--;
        }
        if (var10 == 2) {
            var11 <<= 0x1;
        } else if (var10 == 0) {
            var11 >>= 0x1;
        }
        if (var3.field1943 != -1) {
            int var14 = var11 << 9;
            if (arg1.field9215 == 1) {
                int var15 = arg1.field9217 * arg1.field9217;
                int var16 = (arg1.field3470 <= var8 ? var8 - arg1.field3470 : -var8 + arg1.field3470) << 9;
                int var17 = (var9 < arg1.field3460 ? arg1.field3460 - var9 : -arg1.field3460 + var9) << 9;
                int var18 = var16 > var17 ? var16 : var17;
                int var19 = var3.field1943 * 2 * var18;
                if (var19 < var15) {
                    arg1.field9217 /= 2;
                } else if (var18 < (var15 / 2)) {
                    arg1.field9217 -= var3.field1943;
                    if (arg1.field9217 < 0) {
                        arg1.field9217 = 0;
                    }
                } else if (arg1.field9217 < var14) {
                    arg1.field9217 += var3.field1943;
                    if (arg1.field9217 > var14) {
                        arg1.field9217 = var14;
                    }
                }
            } else if (arg1.field9217 < var14) {
                arg1.field9217 += var3.field1943;
                if (var14 < arg1.field9217) {
                    arg1.field9217 = var14;
                }
            } else if (arg1.field9217 > 0) {
                arg1.field9217 -= var3.field1943;
                if (arg1.field9217 < 0) {
                    arg1.field9217 = 0;
                }
            }
            var11 = arg1.field9217 >> 9;
            if (var11 < 1) {
                var11 = 1;
            }
        }
        class742.field10221 = 0;
        if (var6 == var8 && var7 == var9) {
            class612.field8621 = -1;
        } else {
            if (var6 < var8) {
                class742.field10221 |= 0x4;
                arg1.field3470 += var11;
                if (var8 < arg1.field3470) {
                    arg1.field3470 = var8;
                }
            } else if (var6 > var8) {
                class742.field10221 |= 0x8;
                arg1.field3470 -= var11;
                if (arg1.field3470 < var8) {
                    arg1.field3470 = var8;
                }
            }
            if (var11 < 32) {
                class612.field8621 = var10;
            } else {
                class612.field8621 = 2;
            }
            if (var9 > var7) {
                arg1.field3460 += var11;
                class742.field10221 |= 0x1;
                if (var9 < arg1.field3460) {
                    arg1.field3460 = var9;
                }
            } else if (var7 > var9) {
                arg1.field3460 -= var11;
                class742.field10221 |= 0x2;
                if (arg1.field3460 < var9) {
                    arg1.field3460 = var9;
                }
            }
        }
        if (arg1.field3470 != var8 || arg1.field3460 != var9) {
            return;
        }
        arg1.field9215--;
        if (arg1.field9216 > 0) {
            arg1.field9216--;
            return;
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(Ljava/lang/String;IC)[Ljava/lang/String;")
    public static final String[] method105(String arg0, int arg1, char arg2) {
        field222++;
        int var3 = class328.method2068(arg2, arg0, true);
        if (arg1 != 19478) {
            method105(null, 117, (char) 65456);
        }
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg2 != arg0.charAt(var8); var8++) {
            }
            var4[var5++] = arg0.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg0.substring(var6);
        return var4;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public class class510 {

    @OriginalMember(owner = "client!cia", name = "n", descriptor = "Z")
    public boolean field6515 = false;

    @OriginalMember(owner = "client!cia", name = "f", descriptor = "[I")
    public static int[] field6507 = new int[1];

    @OriginalMember(owner = "client!cia", name = "i", descriptor = "[Lis;")
    public static class350[] field6510 = new class350[14];

    @OriginalMember(owner = "client!cia", name = "l", descriptor = "I")
    public static int field6513 = 0;

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "I")
    public static int field6502;

    @OriginalMember(owner = "client!cia", name = "b", descriptor = "I")
    public static int field6503;

    @OriginalMember(owner = "client!cia", name = "c", descriptor = "I")
    public int field6504;

    @OriginalMember(owner = "client!cia", name = "d", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!cia", name = "e", descriptor = "I")
    public static int field6506;

    @OriginalMember(owner = "client!cia", name = "h", descriptor = "I")
    public static int field6509;

    @OriginalMember(owner = "client!cia", name = "j", descriptor = "I")
    public static int field6511;

    @OriginalMember(owner = "client!cia", name = "k", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!cia", name = "m", descriptor = "I")
    public int field6514;

    @OriginalMember(owner = "client!cia", name = "g", descriptor = "Lvf;")
    public class480 field6508;

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(IZI)Ljava/lang/String;", line = 3)
    public static final String method2815(int arg0, boolean arg1, int arg2) {
        field6502++;
        int var3 = arg2 - arg0;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else {
            if (arg1) {
                method2821(false);
            }
            if (var3 < -3) {
                return "<col=ff7000>";
            } else if (var3 < 0) {
                return "<col=ffb000>";
            } else if (var3 > 9) {
                return "<col=00ff00>";
            } else if (var3 > 6) {
                return "<col=40ff00>";
            } else if (var3 > 3) {
                return "<col=80ff00>";
            } else if (var3 > 0) {
                return "<col=c0ff00>";
            } else {
                return "<col=ffff00>";
            }
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(BLmc;I)V", line = 43)
    private final void method2816(byte arg0, class234 arg1, int arg2) {
        field6503++;
        if (arg2 == 1) {
            this.field6504 = arg1.method1553((byte) 58);
        } else if (arg2 == 2) {
            this.field6514 = arg1.method1500((byte) -116);
        } else if (arg2 == 3) {
            this.field6515 = true;
        } else if (arg2 == 4) {
            this.field6504 = -1;
        }
        if (arg0 >= -40) {
            this.method2816((byte) -52, null, 31);
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(Laa;Luaa;Lpu;IBIII)V", line = 71)
    public static final void method2817(class596 arg0, class391 arg1, class772 arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field6506++;
        if (arg2 == null) {
            return;
        }
        int var8;
        if (class507.field6476 == 4) {
            var8 = (int) class698.field9250 & 0x3FFF;
        } else {
            var8 = (int) class698.field9250 + class757.field10329 & 0x3FFF;
        }
        int var9 = Math.max(arg1.field5117 / 2, arg1.field5031 / 2) + 10;
        int var10 = arg5 * arg5 + arg6 * arg6;
        if (var10 > var9 * var9) {
            return;
        }
        int var11 = class541.field6805[var8];
        int var12 = class541.field6806[var8];
        if (class507.field6476 != 4) {
            var11 = var11 * 256 / (class718.field9432 + 256);
            var12 = var12 * 256 / (class718.field9432 + 256);
        }
        int var13 = arg5 * var12 + arg6 * var11 >> 14;
        int var14 = arg6 * var12 - (arg5 * var11) >> 14;
        arg2.method621(arg3 + var13 + (arg1.field5117 / 2 - arg2.method623() / 2), arg1.field5031 / 2 + arg7 + -var14 + -(arg2.method628() / 2), arg0, arg3, arg7);
        int var15 = -87 % ((arg4 + 51) / 33);
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "([Ljava/lang/String;III)Ljava/lang/String;", line = 114)
    public static final String method2818(String[] arg0, int arg1, int arg2, int arg3) {
        field6511++;
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            String var4 = arg0[arg1];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg2 + arg1;
            int var6 = 0;
            if (arg3 > -8) {
                return null;
            }
            for (int var7 = arg1; var7 < var5; var7++) {
                String var11 = arg0[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg1; var9 < var5; var9++) {
                String var10 = arg0[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(B)Z", line = 178)
    public final boolean method2819(byte arg0) {
        if (arg0 == -124) {
            field6505++;
            return this.field6508.field6202.method130(-2, this.field6504);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(Lha;IZB)Lpu;", line = 189)
    public final class772 method2820(class570 arg0, int arg1, boolean arg2, byte arg3) {
        field6512++;
        long var5 = (long) ((arg2 ? 262144 : 0) | this.field6504 | arg1 << 16 | arg0.field7205 << 19);
        if (arg3 != 64) {
            return null;
        }
        class772 var7 = (class772) this.field6508.field6218.method2931(var5, (byte) -102);
        if (var7 != null) {
            return var7;
        } else if (this.field6508.field6202.method130(-2, this.field6504)) {
            class388 var8 = class388.method2232(this.field6508.field6202, this.field6504, 0);
            if (var8 != null) {
                var8.field4952 = var8.field4948 = var8.field4953 = var8.field4945 = 0;
                if (arg2) {
                    var8.method2238();
                }
                for (int var9 = 0; var9 < arg1; var9++) {
                    var8.method2235();
                }
            }
            class772 var10 = arg0.method977(var8, true);
            if (var10 != null) {
                this.field6508.field6218.method2918(var5, var10, 119);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(Z)V", line = 231)
    public static void method2821(boolean arg0) {
        if (!arg0) {
            method2821(false);
        }
        field6510 = null;
        field6507 = null;
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(ILmc;)V", line = 243)
    public final void method2822(int arg0, class234 arg1) {
        while (true) {
            int var3 = arg1.method1509(true);
            if (var3 == 0) {
                if (arg0 != -771965842) {
                    this.method2816((byte) 52, null, -57);
                }
                field6509++;
                return;
            }
            this.method2816((byte) -96, arg1, var3);
        }
    }
}

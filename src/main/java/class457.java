import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class457 {

    @OriginalMember(owner = "client!st", name = "m", descriptor = "I")
    private int field6650 = 0;

    @OriginalMember(owner = "client!st", name = "g", descriptor = "I")
    private int field6656 = 0;

    @OriginalMember(owner = "client!st", name = "c", descriptor = "I")
    private int field6661 = 0;

    @OriginalMember(owner = "client!st", name = "h", descriptor = "Lffa;")
    private class197 field6651;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "Lbb;")
    private class351 field6648;

    @OriginalMember(owner = "client!st", name = "d", descriptor = "[Lmh;")
    private class657[] field6657;

    @OriginalMember(owner = "client!st", name = "e", descriptor = "Lqe;")
    public class493 field6659;

    @OriginalMember(owner = "client!st", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6662 = new String[] { method3492(method3491("}\t<59")), method3492(method3491("}\t<09")), method3492(method3491("`\b~\u001d")), method3492(method3491("uS<_l")), method3492(method3491("}\t<49")), method3492(method3491("}\t<39")), method3492(method3491("}\t<29")), method3492(method3491("}\t<Mx`\u0014fO9")) };

    @OriginalMember(owner = "client!st", name = "a", descriptor = "I")
    public static int field6649 = -1;

    @OriginalMember(owner = "client!st", name = "k", descriptor = "[I")
    public static int[] field6655 = new int[] { 1, 4, 1, 2 };

    @OriginalMember(owner = "client!st", name = "l", descriptor = "I")
    public static int field6652;

    @OriginalMember(owner = "client!st", name = "j", descriptor = "I")
    public static int field6653;

    @OriginalMember(owner = "client!st", name = "f", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!st", name = "i", descriptor = "I")
    public static int field6658;

    @OriginalMember(owner = "client!st", name = "n", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Lmw;II)Z", line = 4)
    public final boolean method3486(class517 arg0, int arg1, int arg2) {
        try {
            field6652++;
            if (arg2 < 10) {
                this.field6656 = -14;
            }
            if (this.field6661 == 0) {
                return false;
            } else {
                this.field6657[this.field6661 & Integer.MAX_VALUE].method4(arg1, (byte) 120, arg0);
                return true;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6662[1] + (arg0 == null ? field6662[2] : field6662[3]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(I)V", line = 24)
    public static void method3487(int arg0) {
        try {
            field6655 = null;
            if (arg0 != Integer.MAX_VALUE) {
                method3489(89);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6662[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lffa;)V", line = 176)
    public class457(class197 arg0) {
        try {
            this.field6651 = arg0;
            this.field6648 = new class351(arg0);
            this.field6657 = new class657[10];
            this.field6657[1] = new class312(arg0);
            this.field6657[2] = new class423(arg0, this.field6648);
            this.field6657[4] = new class570(arg0, this.field6648);
            this.field6657[5] = new class1(arg0, this.field6648);
            this.field6657[6] = new class663(arg0);
            this.field6657[7] = new class110(arg0);
            this.field6657[3] = this.field6659 = new class493(arg0);
            this.field6657[8] = new class286(arg0, this.field6648);
            this.field6657[9] = new class72(arg0, this.field6648);
            if (!this.field6657[8].method8(-116)) {
                this.field6657[8] = this.field6657[4];
            }
            if (!this.field6657[9].method8(105)) {
                this.field6657[9] = this.field6657[8];
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6662[7] + (arg0 == null ? field6662[2] : field6662[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(II)Z", line = 45)
    public final boolean method3488(int arg0, int arg1) {
        try {
            field6660++;
            if (arg0 != 7) {
                this.field6651 = null;
            }
            return this.field6657[arg1].method8(arg0 + 24);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6662[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I)V", line = 63)
    public static final void method3489(int arg0) {
        try {
            field6653++;
            if (arg0 != -28016) {
                method3487(71);
            }
            class236 var1 = null;
            try {
                var1 = class33.method223("2", (byte) 61);
                class163 var2 = new class163(class178.field2484 * 6 + 3);
                var2.method1428((byte) -24, 1);
                var2.method1406(class178.field2484, 380332136);
                for (int var3 = 0; var3 < class86.field960.length; var3++) {
                    if (class199.field3112[var3]) {
                        var2.method1406(var3, 380332136);
                        var2.method1412(true, class86.field960[var3]);
                    }
                }
                var1.method2012(0, var2.field2209, arg0 + 28017, var2.field2201);
            } catch (Exception var6) {
            }
            try {
                if (var1 != null) {
                    var1.method2011(-2968);
                }
            } catch (Exception var5) {
            }
            class683.field9904 = class430.method3299(76);
            class39.field457 = false;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field6662[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ZBIZII)V", line = 118)
    public final void method3490(boolean arg0, byte arg1, int arg2, boolean arg3, int arg4, int arg5) {
        try {
            boolean var9 = arg0 & this.field6651.method502();
            field6654++;
            if (!var9 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
                if (arg4 == 4) {
                    arg5 = arg2;
                }
                arg4 = 2;
            }
            if (arg4 != 0 && arg3) {
                arg4 |= Integer.MIN_VALUE;
            }
            if (this.field6661 != arg4) {
                if (this.field6661 != 0) {
                    this.field6657[this.field6661 & Integer.MAX_VALUE].method1(0);
                }
                if (arg4 != 0) {
                    this.field6657[arg4 & Integer.MAX_VALUE].method3(arg3, arg1 ^ 0xFFFFFFD8);
                    this.field6657[Integer.MAX_VALUE & arg4].method6((byte) 38, arg3);
                    this.field6657[arg4 & Integer.MAX_VALUE].method7(arg5, arg2, true);
                }
                this.field6650 = arg5;
                this.field6656 = arg2;
                this.field6661 = arg4;
            } else if (this.field6661 != 0) {
                this.field6657[this.field6661 & Integer.MAX_VALUE].method6((byte) 38, arg3);
                if (this.field6656 != arg2 || this.field6650 != arg5) {
                    this.field6657[Integer.MAX_VALUE & this.field6661].method7(arg5, arg2, true);
                    this.field6650 = arg5;
                    this.field6656 = arg2;
                }
            }
            if (arg1 != -39) {
                this.method3488(-110, -16);
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field6662[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!st", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3491(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x11);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!st", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3492(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 14;
                    break;
                case 1:
                    var10005 = 125;
                    break;
                case 2:
                    var10005 = 18;
                    break;
                case 3:
                    var10005 = 113;
                    break;
                default:
                    var10005 = 17;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}

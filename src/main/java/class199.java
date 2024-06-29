import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class199 {

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "Lti;")
    private class5 field3598 = new class5();

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "Lci;")
    private class230 field3602 = new class230();

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
    private int field3605;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    private int field3601;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "Lc;")
    private class103 field3599;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "Lhj;")
    public static class69 field3589 = class181.method1318("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", (byte) -127);

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "[Z")
    public static boolean[] field3588 = new boolean[5];

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field3597 = 0;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "Lkb;")
    public static class51 field3595 = new class51(5000);

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLtk;)Ltk;")
    public static final class50 method1445(byte arg0, class50 arg1) {
        if (arg0 < 10) {
            method1447(-34, -24, -54, 27, -58, (byte) 34, -6, -95, -77, 109);
        }
        class50 var2 = client.method1138(arg1);
        field3590++;
        if (var2 == null) {
            var2 = arg1.field751;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)Lbb;")
    public final class88 method1446(boolean arg0) {
        field3592++;
        return arg0 ? this.field3599.method760(-15725) : null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIBIIII)V")
    public static final void method1447(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 <= 34) {
            return;
        }
        field3586++;
        class272 var10 = null;
        for (class272 var11 = (class272) class38.field528.method1724(255); var11 != null; var11 = (class272) class38.field528.method1726(98)) {
            if (var11.field4817 == arg7 && var11.field4809 == arg0 && var11.field4808 == arg1 && var11.field4815 == arg8) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class272();
            var10.field4809 = arg0;
            var10.field4808 = arg1;
            var10.field4815 = arg8;
            var10.field4817 = arg7;
            class246.method1739(-26673, var10);
            class38.field528.method1727(-123, var10);
        }
        var10.field4811 = arg9;
        var10.field4824 = arg4;
        var10.field4823 = arg2;
        var10.field4812 = arg6;
        var10.field4822 = arg3;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(JB)Lti;")
    public final class5 method1448(long arg0, byte arg1) {
        if (arg1 != -40) {
            this.field3599 = null;
        }
        field3587++;
        class5 var4 = (class5) this.field3599.method769(true, arg0);
        if (var4 != null) {
            this.field3602.method1643(var4, 4096);
        }
        return var4;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)V")
    public static final void method1449(byte arg0, int arg1) {
        field3600++;
        if (arg0 == -52) {
            class135 var2 = class8.method38((byte) 113, 6, arg1);
            var2.method1012((byte) 45);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZIILtk;I)V")
    public static final void method1450(boolean arg0, int arg1, int arg2, class50 arg3, int arg4) {
        field3596++;
        int var5 = arg3.field727;
        if (arg3.field868 == 0) {
            arg3.field727 = arg3.field739;
        } else if (arg3.field868 == 1) {
            arg3.field727 = arg1 - arg3.field739;
        } else if (arg3.field868 == 2) {
            arg3.field727 = arg3.field739 * arg1 >> 14;
        } else if (arg3.field868 == 3) {
            if (arg3.field884 == 2) {
                arg3.field727 = (arg3.field739 - 1) * arg3.field872 + arg3.field739 * 32;
            } else if (arg3.field884 == 7) {
                arg3.field727 = (arg3.field739 - 1) * arg3.field872 + arg3.field739 * 12;
            }
        }
        int var6 = arg3.field798;
        if (arg3.field832 == 0) {
            arg3.field798 = arg3.field873;
        } else if (arg3.field832 == 1) {
            arg3.field798 = arg2 - arg3.field873;
        } else if (arg3.field832 == 2) {
            arg3.field798 = arg3.field873 * arg2 >> 14;
        } else if (arg3.field832 == 3) {
            if (arg3.field884 == 2) {
                arg3.field798 = (arg3.field873 - 1) * arg3.field837 + arg3.field873 * 32;
            } else if (arg3.field884 == 7) {
                arg3.field798 = arg3.field873 * 115 + ((arg3.field873 - 1) * arg3.field837);
            }
        }
        if (arg3.field832 == 4) {
            arg3.field798 = arg3.field789 * arg3.field727 / arg3.field767;
        }
        if (arg4 >= -121) {
            field3589 = null;
        }
        if (arg3.field868 == 4) {
            arg3.field727 = arg3.field798 * arg3.field767 / arg3.field789;
        }
        if (class88.field1684 && (client.method1141(arg3) != 0 || arg3.field884 == 0)) {
            if (arg3.field727 < 5 && arg3.field798 < 5) {
                arg3.field798 = 5;
                arg3.field727 = 5;
            } else {
                if (arg3.field798 <= 0) {
                    arg3.field798 = 5;
                }
                if (arg3.field727 <= 0) {
                    arg3.field727 = 5;
                }
            }
        }
        if (arg3.field828 == 1337) {
            class23.field328 = arg3;
        }
        if (arg0 && arg3.field892 != null && arg3.field798 != var6 || arg3.field727 != var5) {
            class58 var7 = new class58();
            var7.field1050 = arg3.field892;
            var7.field1048 = arg3;
            class89.field1694.method1727(-113, var7);
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(Z)V")
    public final void method1451(boolean arg0) {
        field3594++;
        if (arg0) {
            this.field3601 = -68;
        }
        this.field3602.method1638(64);
        this.field3599.method763(-70);
        this.field3598 = new class5();
        this.field3601 = this.field3605;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)Lbb;")
    public final class88 method1452(byte arg0) {
        if (arg0 <= 98) {
            field3595 = null;
        }
        field3604++;
        return this.field3599.method768((byte) 118);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILti;J)V")
    public final void method1453(int arg0, class5 arg1, long arg2) {
        if (this.field3601 == arg0) {
            class5 var5 = this.field3602.method1641(true);
            var5.method632(-8296);
            var5.method24(true);
            if (this.field3598 == var5) {
                class5 var6 = this.field3602.method1641(true);
                var6.method632(arg0 ^ 0xFFFFDF98);
                var6.method24(true);
            }
        } else {
            this.field3601--;
        }
        field3593++;
        this.field3599.method761(arg2, 0, arg1);
        this.field3602.method1643(arg1, arg0 + 4096);
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)V")
    public static void method1454(byte arg0) {
        field3589 = null;
        if (arg0 < 76) {
            method1449((byte) 78, -98);
        }
        field3595 = null;
        field3588 = null;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(I)V")
    public class199(int arg0) {
        this.field3605 = arg0;
        this.field3601 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3599 = new class103(var2);
    }
}

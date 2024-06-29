import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class93 extends class281 {

    @OriginalMember(owner = "client!ct", name = "s", descriptor = "Lft;")
    public class4 field1658 = new class4();

    @OriginalMember(owner = "client!ct", name = "z", descriptor = "Lgq;")
    public class340 field1665 = new class340();

    @OriginalMember(owner = "client!ct", name = "x", descriptor = "Lls;")
    private class88 field1663;

    @OriginalMember(owner = "client!ct", name = "y", descriptor = "I")
    public static int field1664 = 0;

    @OriginalMember(owner = "client!ct", name = "v", descriptor = "Lnd;")
    public static class366 field1661 = new class366(4, 14);

    @OriginalMember(owner = "client!ct", name = "B", descriptor = "Lrp;")
    public static class288 field1667;

    @OriginalMember(owner = "client!ct", name = "n", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!ct", name = "o", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!ct", name = "p", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!ct", name = "r", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!ct", name = "t", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!ct", name = "u", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!ct", name = "w", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!ct", name = "A", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!ct", name = "q", descriptor = "Z")
    public static boolean field1656;

    static {
        new class423("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
        field1667 = new class288(5);
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "([III)V", line = 4)
    public final void method643(int[] arg0, int arg1, int arg2) {
        field1660++;
        this.field1665.method643(arg0, arg1, arg2);
        for (class443 var4 = (class443) this.field1658.method8((byte) -98); var4 != null; var4 = (class443) this.field1658.method17((byte) 82)) {
            if (!this.field1663.method631(var4, -123)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field6838) {
                        this.method693(var5 + var6, var6, var5, arg0, var4, 1048575);
                        var4.field6838 -= var6;
                        break;
                    }
                    this.method693(var5 + var6, var4.field6838, var5, arg0, var4, 1048575);
                    var5 += var4.field6838;
                    var6 -= var4.field6838;
                } while (!this.field1663.method636(arg0, var6, -1673, var5, var4));
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "()I", line = 43)
    public final int method639() {
        field1666++;
        return 0;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILtq;)V", line = 51)
    public static final void method690(int arg0, class427 arg1) {
        if (arg1.field6197 == 5 && arg1.field6274 != -1) {
            class323.method2016(-47, class345.field5116, arg1);
        }
        field1662++;
        if (arg0 != 6895) {
            method692(72);
        }
    }

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "(I)V", line = 65)
    public final void method633(int arg0) {
        this.field1665.method633(arg0);
        field1653++;
        for (class443 var2 = (class443) this.field1658.method8((byte) -98); var2 != null; var2 = (class443) this.field1658.method17((byte) -128)) {
            if (!this.field1663.method631(var2, 101)) {
                int var3 = arg0;
                do {
                    if (var2.field6838 >= var3) {
                        this.method691(var2, (byte) -15, var3);
                        var2.field6838 -= var3;
                        break;
                    }
                    this.method691(var2, (byte) -15, var2.field6838);
                    var3 -= var2.field6838;
                } while (!this.field1663.method636(null, var3, -1673, 0, var2));
            }
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lpl;BI)V", line = 106)
    private final void method691(class443 arg0, byte arg1, int arg2) {
        if ((this.field1663.field1591[arg0.field6849] & 0x4) != 0 && arg0.field6832 < 0) {
            int var4 = this.field1663.field1566[arg0.field6849] / class170.field2646;
            int var5 = (var4 + 1048575 - arg0.field6845) / var4;
            arg0.field6845 = arg2 * var4 + arg0.field6845 & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field1663.field1570[arg0.field6849] == 0) {
                    arg0.field6853 = class464.method2768(arg0.field6846, arg0.field6853.method2781(), arg0.field6853.method2786(), arg0.field6853.method2774());
                } else {
                    arg0.field6853 = class464.method2768(arg0.field6846, arg0.field6853.method2781(), 0, arg0.field6853.method2774());
                    this.field1663.method647((byte) -98, arg0.field6851.field781[arg0.field6847] < 0, arg0);
                }
                if (arg0.field6851.field781[arg0.field6847] < 0) {
                    arg0.field6853.method2773(-1);
                }
                arg2 = arg0.field6845 / var4;
            }
        }
        field1657++;
        arg0.field6853.method633(arg2);
        if (arg1 != -15) {
            this.field1663 = null;
        }
    }

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "(I)V", line = 149)
    public static void method692(int arg0) {
        field1667 = null;
        field1661 = null;
        if (arg0 >= -20) {
            method690(18, null);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(III[ILpl;I)V", line = 160)
    private final void method693(int arg0, int arg1, int arg2, int[] arg3, class443 arg4, int arg5) {
        if (arg5 != 1048575) {
            this.field1665 = null;
        }
        field1659++;
        if ((this.field1663.field1591[arg4.field6849] & 0x4) != 0 && arg4.field6832 < 0) {
            int var7 = this.field1663.field1566[arg4.field6849] / class170.field2646;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field6845) / var7;
                if (var8 > arg1) {
                    arg4.field6845 += arg1 * var7;
                    break;
                }
                arg4.field6853.method643(arg3, arg2, var8);
                arg1 -= var8;
                arg4.field6845 += var7 * var8 - 1048576;
                arg2 += var8;
                int var9 = class170.field2646 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class464 var11 = arg4.field6853;
                if (this.field1663.field1570[arg4.field6849] == 0) {
                    arg4.field6853 = class464.method2768(arg4.field6846, var11.method2781(), var11.method2786(), var11.method2774());
                } else {
                    arg4.field6853 = class464.method2768(arg4.field6846, var11.method2781(), 0, var11.method2774());
                    this.field1663.method647((byte) -98, arg4.field6851.field781[arg4.field6847] < 0, arg4);
                    arg4.field6853.method2767(var9, var11.method2786());
                }
                if (arg4.field6851.field781[arg4.field6847] < 0) {
                    arg4.field6853.method2773(-1);
                }
                var11.method2801(var9);
                var11.method643(arg3, arg2, arg0 - arg2);
                if (var11.method2777()) {
                    this.field1665.method2097(var11);
                }
            }
        }
        arg4.field6853.method643(arg3, arg2, arg1);
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "()Lwg;", line = 221)
    public final class281 method652() {
        field1655++;
        class443 var1 = (class443) this.field1658.method8((byte) -98);
        if (var1 == null) {
            return null;
        } else if (var1.field6853 == null) {
            return this.method650();
        } else {
            return var1.field6853;
        }
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lls;)V", line = 272)
    public class93(class88 arg0) {
        this.field1663 = arg0;
    }

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "()Lwg;", line = 241)
    public final class281 method650() {
        field1654++;
        class443 var1;
        do {
            var1 = (class443) this.field1658.method17((byte) 76);
            if (var1 == null) {
                return null;
            }
        } while (var1.field6853 == null);
        return var1.field6853;
    }
}

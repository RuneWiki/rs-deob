import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class126 {

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "Lbk;")
    private class121 field1651 = new class121();

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "Lqp;")
    public static class586 field1658;

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "Lnj;")
    public static class487 field1662;

    @OriginalMember(owner = "client!gu", name = "o", descriptor = "Lqu;")
    public static class364 field1663;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "Lbk;")
    private class121 field1652;

    @OriginalMember(owner = "client!gu", name = "p", descriptor = "Ldda;")
    public static class597 field1664;

    static {
        new class487("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
        new class487(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
        field1658 = new class586(11, 7);
        field1662 = new class487("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");
        field1663 = new class364(63, -1);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)Z", line = 10)
    public final boolean method768(byte arg0) {
        field1660++;
        if (arg0 != -36) {
            this.field1651 = null;
        }
        return this.field1651.field1567 == this.field1651;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIILqa;BLn;)V", line = 24)
    public static final void method769(int arg0, int arg1, int arg2, int arg3, class167 arg4, byte arg5, class472 arg6) {
        if (class436.field6426 < 100) {
            class372.method2269(1493, arg6, arg4);
        }
        field1656++;
        arg4.method1022(arg3, arg0, arg1 + arg3, arg0 + arg2);
        if (class436.field6426 < 100) {
            byte var7 = 20;
            int var8 = arg1 / 2 + arg3;
            arg4.method980(arg3, arg0, arg1, arg2, -16777216, 0);
            int var9 = arg2 / 2 + arg0 - var7 - 18;
            arg4.method1032(var8 - 152, var9, 304, 34, class56.field686[class145.field1874].getRGB(), 0);
            arg4.method980(var8 - 150, var9 + 2, class436.field6426 * 3, 30, class347.field5042[class145.field1874].getRGB(), 0);
            class179.field2757.method1665(class647.field9384[class145.field1874].getRGB(), var8, false, class508.field7554.method2953(3181, class77.field889), -1, var7 + var9);
            return;
        }
        int var10 = class296.field4338 - (int) ((float) arg1 / class113.field1426);
        int var11 = (int) ((float) arg2 / class113.field1426) + class527.field7824;
        int var12 = (int) ((float) arg1 / class113.field1426) + class296.field4338;
        int var13 = class527.field7824 - ((int) ((float) arg2 / class113.field1426));
        class180.field2770 = (int) ((float) (arg2 * 2) / class113.field1426);
        class133.field1766 = class527.field7824 - ((int) ((float) arg2 / class113.field1426));
        class73.field848 = (int) ((float) (arg1 * 2) / class113.field1426);
        class429.field6299 = class296.field4338 - ((int) ((float) arg1 / class113.field1426));
        class113.method669(class113.field1445 + var10, class113.field1434 + var11, class113.field1445 + var12, class113.field1434 + var13, arg3, arg0, arg1 + arg3, arg0 + arg2 + 1);
        class113.method670(arg4);
        class419 var14 = class113.method677(arg4);
        int var15 = 99 / ((5 - arg5) / 57);
        class36.method186(-125, 0, 0, var14, arg4);
        if (class59.field710 > 0) {
            class181.field2785--;
            if (class181.field2785 == 0) {
                class59.field710--;
                class181.field2785 = 20;
            }
        }
        if (!class64.field740) {
            return;
        }
        int var16 = arg1 + arg3 - 5;
        int var17 = arg0 + arg2 - 8;
        class259.field3800.method1670("Fps:" + class553.field8230, var17, -1, 13891, 16776960, var16);
        int var21 = var17 - 15;
        Runtime var18 = Runtime.getRuntime();
        int var19 = (int) ((var18.totalMemory() - var18.freeMemory()) / 1024L);
        int var20 = 16776960;
        if (var19 > 65536) {
            var20 = 16711680;
        }
        class259.field3800.method1670("Mem:" + var19 + "k", var21, -1, 13891, var20, var16);
        var17 = var21 - 15;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILbk;)V", line = 107)
    public final void method770(int arg0, class121 arg1) {
        if (arg1.field1564 != null) {
            arg1.method736((byte) -127);
        }
        field1653++;
        arg1.field1567 = this.field1651;
        if (arg0 == -65537) {
            arg1.field1564 = this.field1651.field1564;
            arg1.field1564.field1567 = arg1;
            arg1.field1567.field1564 = arg1;
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)V", line = 124)
    public static void method771(byte arg0) {
        field1658 = null;
        if (arg0 < -109) {
            field1662 = null;
            field1664 = null;
            field1663 = null;
        }
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "()V", line = 290)
    public class126() {
        this.field1651.field1567 = this.field1651;
        this.field1651.field1564 = this.field1651;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)Lbk;", line = 142)
    public final class121 method772(int arg0) {
        field1661++;
        class121 var2 = this.field1651.field1567;
        if (arg0 != 0) {
            this.field1651 = null;
        }
        if (this.field1651 == var2) {
            this.field1652 = null;
            return null;
        } else {
            this.field1652 = var2.field1567;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)I", line = 162)
    public final int method773(boolean arg0) {
        field1650++;
        if (!arg0) {
            field1662 = null;
        }
        int var2 = 0;
        class121 var3 = this.field1651.field1567;
        while (this.field1651 != var3) {
            var3 = var3.field1567;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)Lbk;", line = 187)
    public final class121 method774(int arg0) {
        field1654++;
        if (arg0 != 3) {
            this.field1651 = null;
        }
        class121 var2 = this.field1651.field1567;
        if (this.field1651 == var2) {
            return null;
        } else {
            var2.method736((byte) -127);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)Lbk;", line = 207)
    public final class121 method775(int arg0) {
        field1649++;
        class121 var2 = this.field1652;
        if (this.field1651 == var2) {
            this.field1652 = null;
            return null;
        } else if (arg0 == 2) {
            this.field1652 = var2.field1567;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(BI)Z", line = 228)
    public static final boolean method776(byte arg0, int arg1) {
        if (arg0 >= -18) {
            field1663 = null;
        }
        field1655++;
        return arg1 == 3 || arg1 == 4;
    }

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "(I)Lbk;", line = 241)
    public final class121 method777(int arg0) {
        field1657++;
        if (arg0 < 110) {
            return null;
        }
        class121 var2 = this.field1651.field1564;
        if (this.field1651 == var2) {
            this.field1652 = null;
            return null;
        } else {
            this.field1652 = var2.field1564;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(B)V", line = 263)
    public final void method778(byte arg0) {
        field1659++;
        while (true) {
            class121 var2 = this.field1651.field1567;
            if (this.field1651 == var2) {
                int var3 = 0 / ((arg0 - 62) / 37);
                this.field1652 = null;
                return;
            }
            var2.method736((byte) -128);
        }
    }
}

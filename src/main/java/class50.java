import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class50 extends class73 implements class438 {

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "Lvf;")
    public class73 field585;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "Lqp;")
    public static class586 field588;

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "Lrk;")
    public static class419 field595;

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "Lnj;")
    public static class487 field596;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!ak", name = "L", descriptor = "Lbca;")
    public static class286 field597;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BILqa;)Lr;")
    public final class520 method161(byte arg0, int arg1, class167 arg2) {
        field581++;
        if (arg0 != -127) {
            field595 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lqa;Z)V")
    public final void method166(class167 arg0, boolean arg1) {
        field584++;
        if (!arg1) {
            this.method158(null, (byte) -70);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILqa;IB)Z")
    public final boolean method164(int arg0, class167 arg1, int arg2, byte arg3) {
        field594++;
        return arg3 != 77;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)I")
    public final int method170(int arg0) {
        if (arg0 != -5527) {
            this.method162(4);
        }
        field593++;
        return 0;
    }

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "(I)I")
    public final int method251(int arg0) {
        if (arg0 != 5530) {
            this.method173(29);
        }
        field589++;
        return 0;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;JIZ)V")
    public static final void method252(String arg0, long arg1, int arg2, boolean arg3) {
        field592++;
        if (arg3) {
            class15.method69((byte) -114);
            if (class201.field3009.equals("")) {
                class427.field6090 = 39;
                return;
            }
        }
        class428 var5 = new class428(576);
        var5.method2563(arg2 ^ 0xFA0A2DDC, 10);
        var5.method2608((int) (Math.random() * 65535.0D), (byte) 62);
        var5.method2583(false, arg1);
        var5.method2608(arg3 ? class385.field5632 : class555.field8240, (byte) 110);
        var5.method2576(true, (int) (Math.random() * (double) arg2));
        var5.method2580(arg0, 30127);
        var5.method2576(true, (int) (Math.random() * 9.9999999E7D));
        if (arg3) {
            var5.method2583(false, class273.method1727(0, class201.field3009));
            try {
                var5.method2583(false, Long.parseLong(class537.field7950));
            } catch (Exception var6) {
                class427.field6090 = 39;
                return;
            }
        } else {
            var5.method2576(true, (int) (Math.random() * 9.9999999E7D));
            var5.method2576(true, (int) (Math.random() * 9.9999999E7D));
            var5.method2576(true, (int) (Math.random() * 9.9999999E7D));
            var5.method2576(true, (int) (Math.random() * 9.9999999E7D));
        }
        var5.method2576(true, (int) (Math.random() * 9.9999999E7D));
        var5.method2586(class249.field3633, (byte) -116, class418.field6006);
        class221.field3268.field6221 = 0;
        class221.field3268.method2563(-13021, arg3 ? class538.field7969.field8954 : class538.field7966.field8954);
        class221.field3268.method2608(var5.field6221 + 28, (byte) 83);
        class221.field3268.method2608(607, (byte) 58);
        class221.field3268.method2563(arg2 ^ 0xFA0A2DDC, class77.field889);
        class221.field3268.method2563(-13021, class461.field6666.field8301);
        class117.method725(class221.field3268, false);
        class221.field3268.method2612(arg2 - 99976041, var5.field6221, var5.field6162, 0);
        class172.field2331 = 0;
        class567.field8413 = 0;
        class427.field6090 = -3;
        class304.field4433 = 1;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(Z)V")
    public static void method253(boolean arg0) {
        field595 = null;
        field596 = null;
        field588 = null;
        field597 = null;
        if (arg0) {
            method252(null, 79L, -2, true);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)Z")
    public final boolean method162(int arg0) {
        if (arg0 != -177) {
            this.method170(-99);
        }
        field579++;
        return false;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(IIIIILvf;)V")
    public class50(int arg0, int arg1, int arg2, int arg3, int arg4, class73 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class265.method1695(arg1, arg0, -18490));
        this.field585 = arg5;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lqa;B)V")
    public final void method158(class167 arg0, byte arg1) {
        field590++;
        if (arg1 > -76) {
            this.field585 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)I")
    public final int method173(int arg0) {
        if (arg0 <= 30) {
            this.field585 = null;
        }
        field587++;
        return 0;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)I")
    public final int method171(boolean arg0) {
        field586++;
        return arg0 ? 0 : -103;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILqa;)Llb;")
    public final class239 method169(int arg0, class167 arg1) {
        if (arg0 != -911932384) {
            this.method170(-118);
        }
        field583++;
        return null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
    public final void method154(byte arg0) {
        field591++;
        if (arg0 != -74) {
            field596 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLqa;)Led;")
    public final class115 method157(byte arg0, class167 arg1) {
        int var3 = -97 % ((arg0 - 14) / 48);
        field580++;
        return this.field585.method157((byte) -54, arg1);
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(Lqa;B)V")
    public final void method174(class167 arg0, byte arg1) {
        field582++;
        if (arg1 != 2) {
            this.method173(-32);
        }
    }

    static {
        new class487("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
        field588 = new class586(85, 8);
        field595 = new class419();
        field596 = new class487(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");
    }
}

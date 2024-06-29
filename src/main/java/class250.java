import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class250 {

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "Lng;")
    private class226 field3702 = new class226(64);

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "Lic;")
    private class491 field3707;

    @OriginalMember(owner = "client!wu", name = "k", descriptor = "I")
    public int field3708;

    @OriginalMember(owner = "client!wu", name = "m", descriptor = "Lki;")
    public static class498 field3710;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!wu", name = "l", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!wu", name = "n", descriptor = "[Lf;")
    public static class529[] field3711;

    static {
        new class475("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
        field3710 = new class498(67, -1);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IB)Lv;", line = 3)
    public final class407 method1668(int arg0, byte arg1) {
        field3709++;
        if (arg1 < 32) {
            return null;
        }
        class226 var3 = this.field3702;
        class407 var4;
        synchronized (this.field3702) {
            var4 = (class407) this.field3702.method1536((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3707.method2945(16, arg0, true);
        class407 var6 = new class407();
        if (var5 != null) {
            var6.method2445(new class209(var5), true);
        }
        class226 var7 = this.field3702;
        synchronized (this.field3702) {
            this.field3702.method1542(var6, (byte) 112, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V", line = 32)
    public final void method1669(int arg0) {
        field3703++;
        class226 var2 = this.field3702;
        synchronized (this.field3702) {
            if (arg0 == -9567) {
                this.field3702.method1539(arg0 + 9494);
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)V", line = 46)
    public static final void method1670(byte arg0) {
        field3705++;
        class91.field1367 = 0;
        class147.field2177 = 0;
        class214.field3122 = 0;
        class123.field1864 = 0;
        if (arg0 != -75) {
            field3710 = null;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZZLls;Z)V", line = 59)
    public static final void method1671(boolean arg0, boolean arg1, class92 arg2, boolean arg3) {
        field3706++;
        int var4 = arg2.field1378;
        int var5 = (int) arg2.field4736;
        arg2.method2049(-68);
        if (arg1) {
            class67.method399(0, var4);
        }
        class461.method2774(var4, 65535);
        class38 var6 = class149.method979((byte) -78, var5);
        if (var6 != null) {
            class350.method2203((byte) -119, var6);
        }
        class519.method3057(arg3);
        if (!arg0 && class6.field79 != -1) {
            class110.method677(1, arg3, class6.field79);
        }
        class293 var7 = new class293(class431.field6450);
        for (class92 var8 = (class92) var7.method1866((byte) 93); var8 != null; var8 = (class92) var7.method1868((byte) 125)) {
            if (!var8.method2050(1)) {
                var8 = (class92) var7.method1866((byte) 109);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field1376 == 3) {
                int var9 = (int) var8.field4736;
                if ((var9 >>> 16) == var4) {
                    method1671(arg0, true, var8, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IZ)V", line = 115)
    public final void method1672(int arg0, boolean arg1) {
        class226 var3 = this.field3702;
        synchronized (this.field3702) {
            this.field3702.method1534(0, arg0);
        }
        field3701++;
        if (arg1) {
            this.field3702 = null;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(BLqa;)V", line = 129)
    public static final void method1673(byte arg0, class162 arg1) {
        field3699++;
        if (arg0 < 1) {
            field3711 = null;
        }
        if (class207.field2963) {
            class170.method1176(0, arg1);
        } else {
            class163.method1133(arg1, 0);
        }
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)V", line = 146)
    public final void method1674(int arg0) {
        if (arg0 != -31740) {
            field3711 = null;
        }
        field3704++;
        class226 var2 = this.field3702;
        synchronized (this.field3702) {
            this.field3702.method1540(0);
        }
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(B)V", line = 165)
    public static void method1675(byte arg0) {
        if (arg0 != 40) {
            field3711 = null;
        }
        field3710 = null;
        field3711 = null;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(III)I", line = 177)
    public static final int method1676(int arg0, int arg1, int arg2) {
        field3698++;
        if (arg2 != -28708) {
            field3710 = null;
        }
        return arg1 == 4 || arg1 == 5 ? class426.field6398[arg0 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lai;ILic;)V", line = 197)
    public class250(class423 arg0, int arg1, class491 arg2) {
        this.field3707 = arg2;
        if (this.field3707 == null) {
            this.field3708 = 0;
        } else {
            this.field3708 = this.field3707.method2942(false, 16);
        }
    }
}

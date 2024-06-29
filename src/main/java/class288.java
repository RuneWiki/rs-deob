import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class288 {

    @OriginalMember(owner = "client!la", name = "f", descriptor = "Lgd;")
    public static class206 field3880 = new class206("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field3884 = 0;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "Lh;")
    public static class434 field3883 = new class434(63, -1);

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field3886 = 0;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public int field3875;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public int field3876;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public int field3882;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lbt;I)V", line = 3)
    public final void method1624(class32 arg0, int arg1) {
        if (arg1 != 15656) {
            method1627(-44, (class364) null, (class345) null, false, -87, -30, 26);
        }
        while (true) {
            int var3 = arg0.method201((byte) -111);
            if (var3 == 0) {
                field3878++;
                return;
            }
            this.method1625(2, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IILbt;)V", line = 25)
    private final void method1625(int arg0, int arg1, class32 arg2) {
        if (arg0 != 2) {
            method1626(42, -77, (byte[]) null, -16, -100, -110);
        }
        if (arg1 == 1) {
            this.field3882 = arg2.method215((byte) 110);
            this.field3875 = arg2.method201((byte) -108);
            this.field3876 = arg2.method201((byte) -111);
        }
        field3877++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II[BIII)Z", line = 50)
    public static final boolean method1626(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field3879++;
        boolean var6 = true;
        if (arg5 != 63) {
            field3884 = -58;
        }
        class32 var7 = new class32(arg2);
        int var8 = -1;
        label60: while (true) {
            int var9 = var7.method225((byte) -9);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method203((byte) -111);
                    if (var13 == 0) {
                        continue label60;
                    }
                    var10 += var13 - 1;
                    int var14 = var10 & 0x3F;
                    int var15 = (var10 & 0xFCD) >> 6;
                    int var16 = var7.method201((byte) -105) >> 2;
                    int var17 = arg1 + var15;
                    int var18 = arg0 + var14;
                    if (var17 > 0 && var18 > 0 && var17 < arg4 - 1 && (arg3 - 1) > var18) {
                        class88 var19 = class1.field23.method935(var8, (byte) -109);
                        if (var16 != 22 || class488.field6789.field6683 || var19.field1265 != 0 || var19.field1245 == 1 || var19.field1296) {
                            if (!var19.method570((byte) -25)) {
                                class2.field39++;
                                var6 = false;
                            }
                            var11 = true;
                        }
                    }
                }
                int var12 = var7.method203((byte) -75);
                if (var12 == 0) {
                    break;
                }
                var7.method201((byte) -118);
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILwm;Lur;ZIII)V", line = 136)
    public static final void method1627(int arg0, class364 arg1, class345 arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field3881++;
        if (arg3) {
            class49.field655.method836((class424.field5738 - class49.field655.method777()) / 2, (class72.field986 - class49.field655.method774()) / 2);
            class140.field2042.method836((class424.field5738 - class140.field2042.method777()) / 2, 18);
        }
        arg2.method2127((class404.field5538 == class343.field4601 ? class86.field1179 : class86.field1129).method1176(class110.field1676, (byte) -109), -1, true, class72.field986 / 2 - 26, arg0, class424.field5738 / 2);
        int var7 = class72.field986 / 2 - 18;
        arg1.method1973(class424.field5738 / 2 - 152, var7, 304, 34, arg5, 0);
        arg1.method1973(class424.field5738 / 2 - 151, var7 + 1, 302, 32, 0, 0);
        arg1.method2003(class424.field5738 / 2 - 150, var7 + 2, class30.field397 * 3, 30, arg6, 0);
        arg1.method2003(class424.field5738 / 2 - (150 - (class30.field397 * 3)), var7 + 2, 300 - class30.field397 * 3, 30, 0, 0);
        arg2.method2127(class458.field6215, -1, true, class72.field986 / 2 + 4, arg0, class424.field5738 / arg4);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V", line = 158)
    public static void method1628(int arg0) {
        field3883 = null;
        field3880 = null;
        int var1 = 125 / ((arg0 - 6) / 61);
    }
}

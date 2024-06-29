import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class169 {

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "Llh;")
    private class364 field2534 = new class364(64);

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "Lhh;")
    private class84 field2532;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field2537 = -1;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Lnc;")
    public static class21 field2539;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "Lgf;")
    public static class180 field2540;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "Lak;")
    public static class231 field2542;

    static {
        new class180("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
        field2539 = new class21(2);
        field2540 = new class180(" ", ": ", " ", " ");
        field2541 = 0;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V", line = 3)
    public final void method1196(int arg0) {
        class364 var2 = this.field2534;
        synchronized (this.field2534) {
            this.field2534.method2349(0);
        }
        if (arg0 != -8697) {
            this.method1199(63, (byte) 58);
        }
        field2528++;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V", line = 17)
    public final void method1197(int arg0, int arg1) {
        field2533++;
        class364 var3 = this.field2534;
        synchronized (this.field2534) {
            this.field2534.method2348(arg0, -31);
            if (arg1 != -3685) {
                this.field2532 = null;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[FB)[F", line = 30)
    public static final float[] method1198(int arg0, float[] arg1, byte arg2) {
        field2530++;
        if (arg2 >= -95) {
            method1203((byte) 120);
        }
        float[] var3 = new float[arg0];
        class486.method2903(arg1, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)Ltq;", line = 46)
    public final class441 method1199(int arg0, byte arg1) {
        field2536++;
        class364 var3 = this.field2534;
        class441 var4;
        synchronized (this.field2534) {
            var4 = (class441) this.field2534.method2339(arg1 - 56, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2532.method683(32, arg0, arg1 + 45);
        class441 var6 = new class441();
        if (var5 != null) {
            var6.method2678((byte) -114, new class303(var5));
        }
        class364 var7 = this.field2534;
        synchronized (this.field2534) {
            this.field2534.method2342((long) arg0, var6, -54);
            if (arg1 != -40) {
                this.field2532 = null;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V", line = 74)
    public static final void method1200(String arg0, Throwable arg1, byte arg2) {
        field2529++;
        if (arg2 != -113) {
            return;
        }
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class288.method1795(78, arg1);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class239.method1554((byte) 126, var3);
            String var4 = class36.method286(":", var3, "%3a", 0);
            String var5 = class36.method286("@", var4, "%40", 0);
            String var6 = class36.method286("&", var5, "%26", arg2 ^ 0xFFFFFF8F);
            String var7 = class36.method286("#", var6, "%23", arg2 + 113);
            if (class401.field5879.field4458 != null) {
                class100 var8 = class401.field5879.method1954(new URL(class401.field5879.field4458.getCodeBase(), "clienterror.ws?c=" + class432.field6301 + "&u=" + class488.field7124 + "&v1=" + class312.field4475 + "&v2=" + class312.field4470 + "&e=" + var7), 116);
                while (var8.field1604 == 0) {
                    class185.method1285(arg2 ^ 0xFFFFFFFA, 1L);
                }
                if (var8.field1604 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field1608;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V", line = 128)
    public final void method1201(byte arg0) {
        class364 var2 = this.field2534;
        synchronized (this.field2534) {
            int var3 = 68 / ((53 - arg0) / 45);
            this.field2534.method2350((byte) 112);
        }
        field2531++;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([J[IB)V", line = 145)
    public static final void method1202(long[] arg0, int[] arg1, byte arg2) {
        field2538++;
        class366.method2359(arg0.length - 1, arg0, (byte) -122, arg1, 0);
        if (arg2 != -97) {
            method1202(null, null, (byte) 2);
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V", line = 158)
    public static void method1203(byte arg0) {
        if (arg0 != 108) {
            field2542 = null;
        }
        field2540 = null;
        field2542 = null;
        field2539 = null;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lmt;ILhh;)V", line = 172)
    public class169(class271 arg0, int arg1, class84 arg2) {
        this.field2532 = arg2;
        this.field2532.method656((byte) 122, 32);
    }
}

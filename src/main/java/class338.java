import java.awt.datatransfer.Clipboard;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public abstract class class338 extends class242 {

    @OriginalMember(owner = "client!mu", name = "k", descriptor = "Z")
    public boolean field4312 = false;

    @OriginalMember(owner = "client!mu", name = "o", descriptor = "Z")
    public boolean field4316 = false;

    @OriginalMember(owner = "client!mu", name = "p", descriptor = "I")
    public int field4317;

    @OriginalMember(owner = "client!mu", name = "m", descriptor = "I")
    public int field4314;

    @OriginalMember(owner = "client!mu", name = "i", descriptor = "I")
    public int field4310;

    @OriginalMember(owner = "client!mu", name = "n", descriptor = "I")
    public static int field4315 = 0;

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "[I")
    public static int[] field4313 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "Loi;")
    public static class169 field4311 = new class169("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!mu", name = "t", descriptor = "Loi;")
    public static class169 field4321;

    @OriginalMember(owner = "client!mu", name = "w", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!mu", name = "v", descriptor = "Loi;")
    public static class169 field4323;

    @OriginalMember(owner = "client!mu", name = "x", descriptor = "Lhl;")
    public static class232 field4325;

    @OriginalMember(owner = "client!mu", name = "z", descriptor = "Laj;")
    public static class205 field4327;

    @OriginalMember(owner = "client!mu", name = "q", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!mu", name = "r", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!mu", name = "s", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!mu", name = "u", descriptor = "Ldn;")
    public static class201 field4322;

    @OriginalMember(owner = "client!mu", name = "y", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field4326;

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(B)V")
    public static void method1993(byte arg0) {
        field4322 = null;
        field4326 = null;
        field4313 = null;
        field4327 = null;
        field4325 = null;
        if (arg0 <= 33) {
            field4315 = 68;
        }
        field4323 = null;
        field4321 = null;
        field4311 = null;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I[S)[S")
    public static final short[] method1994(int arg0, short[] arg1) {
        field4319++;
        if (arg1 == null) {
            return null;
        } else if (arg0 == 21603) {
            short[] var2 = new short[arg1.length];
            class526.method3110(arg1, 0, var2, 0, arg1.length);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Z[Ljava/lang/String;[S)V")
    public static final void method1995(boolean arg0, String[] arg1, short[] arg2) {
        class113.method738((byte) 43, arg1, arg1.length - 1, 0, arg2);
        field4320++;
        if (!arg0) {
            field4324 = -53;
        }
    }

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(B)V")
    public static final void method1996(byte arg0) {
        field4318++;
        if (class407.field5455 == 0) {
            return;
        }
        try {
            if ((++class227.field2925) > 2000) {
                if (class286.field3643 != null) {
                    class286.field3643.method1003(1);
                    class286.field3643 = null;
                }
                if (class221.field2857 >= 1) {
                    class82.field1020 = -5;
                    class407.field5455 = 0;
                    return;
                }
                class221.field2857++;
                if (class531.field7821 == class116.field1631) {
                    class116.field1631 = class385.field5067;
                } else {
                    class116.field1631 = class531.field7821;
                }
                class407.field5455 = 1;
                class227.field2925 = 0;
            }
            if (class407.field5455 == 1) {
                class265.field3367 = class172.field2221.method2622(class385.field5066, class116.field1631, -1727);
                class407.field5455 = 2;
            }
            if (class407.field5455 == 2) {
                if (class265.field3367.field3542 == 2) {
                    throw new IOException();
                }
                if (class265.field3367.field3542 != 1) {
                    return;
                }
                class286.field3643 = new class144((Socket) class265.field3367.field3541, class172.field2221);
                class265.field3367 = null;
                class286.field3643.method1001(0, (byte) 55, class319.field4112.field1223, class319.field4112.field1176);
                class114.method741((byte) 106);
                int var1 = class286.field3643.method1000((byte) 29);
                class114.method741((byte) -128);
                if (var1 != 21) {
                    class82.field1020 = var1;
                    class407.field5455 = 0;
                    class286.field3643.method1003(1);
                    class286.field3643 = null;
                    return;
                }
                class407.field5455 = 3;
            }
            if (arg0 >= 97) {
                if (class407.field5455 == 3) {
                    if (class286.field3643.method1004(3) < 1) {
                        return;
                    }
                    class208.field2698 = new String[class286.field3643.method1000((byte) 29)];
                    class407.field5455 = 4;
                }
                if (class407.field5455 == 4 && class286.field3643.method1004(3) >= class208.field2698.length * 8) {
                    class109.field1514.field1176 = 0;
                    class286.field3643.method1006(class109.field1514.field1223, class208.field2698.length * 8, -26, 0);
                    for (int var2 = 0; var2 < class208.field2698.length; var2++) {
                        class208.field2698[var2] = class514.method3061(class109.field1514.method611(false), true);
                    }
                    class82.field1020 = 21;
                    class407.field5455 = 0;
                    class286.field3643.method1003(1);
                    class286.field3643 = null;
                }
            }
        } catch (IOException var3) {
            if (class286.field3643 != null) {
                class286.field3643.method1003(1);
                class286.field3643 = null;
            }
            if (class221.field2857 >= 1) {
                class407.field5455 = 0;
                class82.field1020 = -4;
            } else {
                if (class531.field7821 == class116.field1631) {
                    class116.field1631 = class385.field5067;
                } else {
                    class116.field1631 = class531.field7821;
                }
                class227.field2925 = 0;
                class221.field2857++;
                class407.field5455 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(IIIZZ)V")
    public class338(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field4317 = arg0;
        this.field4314 = arg2;
        this.field4316 = arg4;
        this.field4310 = arg1;
        this.field4312 = arg3;
    }

    static {
        new class169("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
        field4321 = new class169("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");
        field4324 = 12;
        field4323 = new class169("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");
        field4325 = new class232();
        field4327 = new class205(8192);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class385 extends class47 {

    @OriginalMember(owner = "client!lq", name = "J", descriptor = "I")
    public static int field5804 = 0;

    @OriginalMember(owner = "client!lq", name = "P", descriptor = "[I")
    public static int[] field5810;

    @OriginalMember(owner = "client!lq", name = "R", descriptor = "J")
    public static long field5812;

    @OriginalMember(owner = "client!lq", name = "S", descriptor = "I")
    public static int field5813;

    @OriginalMember(owner = "client!lq", name = "F", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!lq", name = "K", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!lq", name = "M", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!lq", name = "N", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!lq", name = "O", descriptor = "I")
    public static int field5809;

    @OriginalMember(owner = "client!lq", name = "Q", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!lq", name = "L", descriptor = "[B")
    private byte[] field5806;

    static {
        new class342("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
        field5810 = new int[32];
        field5812 = -1L;
        new class342(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
        field5813 = 0;
    }

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "(I)V", line = 4)
    public static void method2381(int arg0) {
        if (arg0 == 0) {
            field5810 = null;
        }
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "()V", line = 14)
    public class385() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(IIII)[B", line = 17)
    public final byte[] method2382(int arg0, int arg1, int arg2, int arg3) {
        field5803++;
        this.field5806 = new byte[arg2 * 2 * arg3 * arg1];
        if (arg0 <= 40) {
            return null;
        } else {
            this.method3004(arg3, arg1, 4, arg2);
            return this.field5806;
        }
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(Z)V", line = 36)
    public static final void method2383(boolean arg0) {
        class148.field2361 = 0;
        if (!arg0) {
            field5813 = -63;
        }
        class245.field3527 = new class150[50];
        field5807++;
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)V", line = 48)
    public static final void method2384(byte arg0) {
        class106.field1773.method1751(25916);
        field5809++;
        class43.field831.method2258(108);
        class217.field3125.method563(0);
        class319.field4807.method2875((byte) 53);
        class61.field1070.method498(3);
        class367.field5550.method1316((byte) -77);
        class431.field6419.method1135(-24676);
        class140.field2233.method2247((byte) 118);
        class419.field6271.method1388((byte) 58);
        class255.field3670.method2068((byte) -121);
        class203.field2969.method1242((byte) -104);
        class397.field5996.method1189(34);
        class160.field2479.method1810(124);
        class495.field7314.method976((byte) 68);
        class162.field2506.method600((byte) -115);
        class519.field7721.method1996(-50);
        class2.field93.method1538(true);
        class511.field7544.method2025(14724);
        class500.field7377.method1436((byte) -46);
        class365.field5521.method1441(84);
        class257.method1664((byte) 80);
        class150.method1149((byte) 121);
        class240.method1570(3);
        if (class446.field6661 != class423.field6322) {
            for (int var1 = 0; var1 < class271.field3918.length; var1++) {
                class271.field3918[var1] = null;
            }
            class494.field7306 = 0;
        }
        class355.method2253(-95);
        class83.method647((byte) 1);
        class213.method1428(false);
        class517.method3089(false);
        class407.method2482((byte) -122);
        class437.field6541.method488(-3);
        class4.field109.method278();
        class308.field4696.method2291(6893);
        class130.method974(64);
        class98.field1634.method132((byte) -1);
        class80.field1417.method132((byte) -1);
        class445.field6649.method132((byte) -1);
        class451.field6741.method132((byte) -1);
        class209.field3017.method132((byte) -1);
        class5.field122.method132((byte) -1);
        class84.field1455.method132((byte) -1);
        class474.field7088.method132((byte) -1);
        class151.field2407.method132((byte) -1);
        class109.field1800.method132((byte) -1);
        class268.field3857.method132((byte) -1);
        class285.field4069.method132((byte) -1);
        class201.field2946.method132((byte) -1);
        class76.field1270.method132((byte) -1);
        class260.field3788.method132((byte) -1);
        class50.field901.method132((byte) -1);
        class138.field2214.method132((byte) -1);
        class290.field4133.method132((byte) -1);
        class466.field6955.method132((byte) -1);
        class488.field7222.method132((byte) -1);
        class20.field333.method132((byte) -1);
        class368.field5571.method132((byte) -1);
        class352.field5394.method132((byte) -1);
        class407.field6109.method132((byte) -1);
        class56.field981.method132((byte) -1);
        int var2 = -4 / ((arg0 + 22) / 42);
        class457.field6853.method132((byte) -1);
        class419.field6273.method132((byte) -1);
        class57.field1008.method132((byte) -1);
        class100.field1641.method132((byte) -1);
        class42.field789.method132((byte) -1);
        class226.field3221.method488(-3);
        class268.field3851.method488(-3);
        class471.field7071.method488(-3);
        class171.field2647.method488(-3);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BBI)V", line = 136)
    public final void method448(byte arg0, byte arg1, int arg2) {
        if (arg0 != -24) {
            this.field5806 = null;
        }
        field5805++;
        int var4 = arg2 * 2;
        int var5 = arg1 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field5806[var10001] = (byte) (var5 * 3 >> 5);
        this.field5806[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BII)V", line = 158)
    public static final void method2385(byte arg0, int arg1, int arg2) {
        field5808++;
        if (class440.field6579 == 1) {
            class282.method1802(arg1, true, class446.field6663, arg2);
        } else if (class440.field6579 == 2) {
            class219.method1457(arg1, arg2, -125);
        }
        class440.field6579 = 0;
        if (arg0 < 95) {
            field5813 = 112;
        }
        class446.field6663 = null;
    }
}

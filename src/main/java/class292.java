import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public abstract class class292 {

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "F")
    public static float field4085;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4086;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "Z")
    public static boolean field4088;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public int field4082;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public int field4083;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "[I")
    public int[] field4080;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)I")
    public static final int method1933(int arg0, int arg1) {
        field4081++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        if (arg0 != -583426143) {
            method1937(-81);
        }
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg1;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public static final void method1934(byte arg0) {
        field4079++;
        if (!class12.method93(arg0 ^ 0xFFFFFF9D) && class422.field6035 != class129.field1570) {
            class50.method292((byte) 97, class384.field5422.field5677[0], class384.field5422.field5664[0], class153.field1896, false, class129.field1570, class291.field4066, false);
            return;
        }
        class203.method1347(class151.field1873, arg0 ^ 0xFFFFFFDC);
        if (arg0 != -100) {
            method1933(-102, 15);
        }
        if (class19.field228 != class129.field1570) {
            class440.method2745(-62);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method1645(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)V")
    public static void method1935(byte arg0) {
        field4086 = null;
        if (arg0 <= 5) {
            field4089 = -105;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIZIILjava/awt/Graphics;)V")
    public abstract void method1642(int arg0, int arg1, boolean arg2, int arg3, int arg4, Graphics arg5);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public abstract void method1639(Canvas arg0, int arg1);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)V")
    public static final void method1936(int arg0, byte arg1) {
        field4087++;
        if (arg0 == -1 || !class327.field4638[arg0]) {
            return;
        }
        class274.field3881.method2416(arg0, 25930);
        if (class98.field1194[arg0] == null) {
            return;
        }
        boolean var2 = true;
        if (arg1 >= -118) {
            method1936(97, (byte) -17);
        }
        for (int var3 = 0; var3 < class98.field1194[arg0].length; var3++) {
            if (class98.field1194[arg0][var3] != null) {
                if (class98.field1194[arg0][var3].field2524 == 2) {
                    var2 = false;
                } else {
                    class98.field1194[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class98.field1194[arg0] = null;
        }
        class327.field4638[arg0] = false;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static final void method1937(int arg0) {
        field4084++;
        class273.field3879.method1626((byte) 106);
        class161.field2126.method1626((byte) 106);
        if (arg0 != 0) {
            method1937(13);
        }
    }

    static {
        new class362("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
        field4085 = 1024.0F;
        field4086 = null;
        field4088 = false;
        field4089 = 0;
    }
}

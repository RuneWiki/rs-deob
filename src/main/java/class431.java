import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class431 extends Canvas {

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Ljava/awt/Component;")
    private Component field6036;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Z")
    public static boolean field6033 = false;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "Lus;")
    public static class1 field6037 = new class1(18, 6);

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "Lwf;")
    public static class79 field6041 = new class79(24, 2);

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field6043 = new String[100];

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "Lus;")
    public static class1 field6042 = new class1(87, 3);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field6031;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field6034;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "Lqq;")
    public static class306 field6044;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILme;)V")
    public static final void method2550(int arg0, class117 arg1) {
        if (arg0 != 0) {
            return;
        }
        if (arg1.field1486 != null) {
            arg1.field1486.field650 = 0;
        }
        field6034++;
        arg1.field1485 = false;
        for (class117 var2 = arg1.method72(); var2 != null; var2 = arg1.method48()) {
            method2550(arg0, var2);
        }
    }

    @OriginalMember(owner = "client!pb", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field6036.update(arg0);
        field6031++;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/awt/Component;I)Lwn;")
    public static final class469 method2551(Component arg0, int arg1) {
        if (arg1 < 82) {
            method2550(-32, (class117) null);
        }
        field6035++;
        return new class462(arg0);
    }

    @OriginalMember(owner = "client!pb", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field6040++;
        this.field6036.paint(arg0);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
    public static void method2552(byte arg0) {
        field6043 = null;
        field6037 = null;
        int var1 = -16 / ((-arg0 - 28) / 35);
        field6044 = null;
        field6041 = null;
        field6042 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6032++;
        int var7 = class156.method978(0, arg2, class485.field6827, class345.field5011);
        int var8 = class156.method978(0, arg4, class485.field6827, class345.field5011);
        int var9 = class156.method978(0, arg3, class94.field1209, class168.field2449);
        int var10 = class156.method978(0, arg0, class94.field1209, class168.field2449);
        int var11 = class156.method978(0, arg2 + arg6, class485.field6827, class345.field5011);
        if (arg5 != -4734) {
            field6044 = null;
        }
        int var12 = class156.method978(0, arg4 - arg6, class485.field6827, class345.field5011);
        for (int var13 = var7; var13 < var11; var13++) {
            class103.method579((byte) 115, var9, var10, arg1, class128.field1676[var13]);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class103.method579((byte) 115, var9, var10, arg1, class128.field1676[var14]);
        }
        int var15 = class156.method978(0, arg3 + arg6, class94.field1209, class168.field2449);
        int var16 = class156.method978(0, arg0 - arg6, class94.field1209, class168.field2449);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class128.field1676[var17];
            class103.method579((byte) 115, var9, var15, arg1, var18);
            class103.method579((byte) 115, var16, var10, arg1, var18);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static final void method2554(int arg0) {
        field6038++;
        if (class278.field4092 == 5) {
            class278.field4092 = 6;
            if (arg0 != 24) {
                method2553(-34, 54, 64, -116, -44, -128, 54);
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class431(Component arg0) {
        this.field6036 = arg0;
    }

    static {
        new class326("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
    }
}

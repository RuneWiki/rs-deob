import java.io.InputStream;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class269 extends InputStream {

    @OriginalMember(owner = "client!at", name = "a", descriptor = "Lwb;")
    public static class45 field3856 = new class45(32);

    @OriginalMember(owner = "client!at", name = "b", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!at", name = "c", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!at", name = "d", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!at", name = "f", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!at", name = "g", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!at", name = "e", descriptor = "Lks;")
    public static class182 field3860;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(B)V")
    public static final void method1627(byte arg0) {
        if (arg0 <= -124) {
            class81.method408();
            field3861++;
        }
    }

    @OriginalMember(owner = "client!at", name = "read", descriptor = "()I")
    public final int read() {
        field3859++;
        class85.method433(30000L, 93);
        return -1;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(II)[B")
    public static final byte[] method1628(int arg0, int arg1) {
        if (arg1 != 511) {
            method1629((class331) null, -95, -75);
        }
        field3857++;
        class80 var2 = (class80) class480.field6796.method1599((byte) 13, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class459.method2706(var7, var4, -30);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class80(var3);
            class480.field6796.method1597(var2, (long) arg0, -30892);
        }
        return var2.field955;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Lve;II)V")
    public static final void method1629(class331 arg0, int arg1, int arg2) {
        if (arg2 > -112) {
            method1628(11, 41);
        }
        class317.field4625 = false;
        field3858++;
        class468.field6579 = 0;
        class367.method2219(arg0, (byte) -121);
        class358.method2188(arg0, 118);
        if (class317.field4625) {
            System.out.println("---endgpp---");
        }
        if (arg0.field2206 != arg1) {
            throw new RuntimeException("gpi1 pos:" + arg0.field2206 + " psize:" + arg1);
        }
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(B)V")
    public static void method1630(byte arg0) {
        field3860 = null;
        if (arg0 == 94) {
            field3856 = null;
        }
    }

    static {
        new class40("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
    }
}

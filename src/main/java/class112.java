import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public class class112 {

    @OriginalMember(owner = "client!qha", name = "e", descriptor = "Z")
    public static boolean field1410 = false;

    @OriginalMember(owner = "client!qha", name = "h", descriptor = "Llja;")
    public static class744 field1413 = new class744(75, 3);

    @OriginalMember(owner = "client!qha", name = "i", descriptor = "Loh;")
    public static class425 field1414 = new class425("", 16);

    @OriginalMember(owner = "client!qha", name = "k", descriptor = "[[Ljava/lang/String;")
    public static String[][] field1416 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" } };

    @OriginalMember(owner = "client!qha", name = "j", descriptor = "F")
    public static float field1415;

    @OriginalMember(owner = "client!qha", name = "c", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!qha", name = "d", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!qha", name = "f", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!qha", name = "g", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "Lqha;")
    public class112 field1406;

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "Lqha;")
    public class112 field1407;

    @OriginalMember(owner = "client!qha", name = "d", descriptor = "(I)V", line = 8)
    public final void method892(int arg0) {
        field1409++;
        if (this.field1407 == null) {
            return;
        }
        this.field1407.field1406 = this.field1406;
        this.field1406.field1407 = this.field1407;
        if (arg0 == 50560) {
            this.field1406 = null;
            this.field1407 = null;
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(III)Z", line = 28)
    public static final boolean method893(int arg0, int arg1, int arg2) {
        field1412++;
        if (arg1 >= -65) {
            return false;
        } else {
            return (arg0 & 0xC580) != 0;
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(II)Z", line = 40)
    public static final boolean method894(int arg0, int arg1) {
        int var2 = 47 / ((arg0 - 86) / 37);
        field1408++;
        return arg1 == 3 || arg1 == 5 || arg1 == 6;
    }

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "(B)V", line = 55)
    public static void method895(byte arg0) {
        field1413 = null;
        if (arg0 <= -91) {
            field1416 = null;
            field1414 = null;
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(Ld;Ljava/awt/Canvas;IB)Lha;", line = 68)
    public static final class66 method896(class162 arg0, Canvas arg1, int arg2, byte arg3) {
        if (arg3 != -102) {
            field1413 = null;
        }
        field1411++;
        return new class700(arg1, arg0, arg2);
    }
}

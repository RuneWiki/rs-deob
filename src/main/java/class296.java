import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class296 extends InputStream {

    @OriginalMember(owner = "client!st", name = "a", descriptor = "Ljm;")
    public static class485 field4090 = new class485(25, 6);

    @OriginalMember(owner = "client!st", name = "e", descriptor = "[[I")
    public static int[][] field4094 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!st", name = "g", descriptor = "Llg;")
    public static class284 field4096;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!st", name = "c", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!st", name = "d", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!st", name = "f", descriptor = "Lvh;")
    public static class240 field4095;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(III)B")
    public static final byte method1701(int arg0, int arg1, int arg2) {
        field4091++;
        if (arg1 == 9) {
            return (byte) ((arg2 & arg0) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I)V")
    public static final void method1702(int arg0) {
        field4092++;
        if (arg0 >= -95) {
            method1703(false);
        }
        class8.field80 = null;
        class40.field542 = null;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Z)V")
    public static void method1703(boolean arg0) {
        field4096 = null;
        if (arg0) {
            field4090 = null;
        }
        field4095 = null;
        field4094 = null;
        field4090 = null;
    }

    @OriginalMember(owner = "client!st", name = "read", descriptor = "()I")
    public final int read() {
        field4093++;
        class496.method2931((byte) 122, 30000L);
        return -1;
    }

    static {
        new class83("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
        field4096 = new class284(2, 4);
    }
}

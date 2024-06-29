import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class447 {

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "[I")
    public static int[] field6105 = new int[8];

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field6106;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field6108;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
    public static void method2565(int arg0) {
        field6105 = null;
        if (arg0 < 28) {
            field6105 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([BZLmd;)V")
    public final void method2566(byte[] arg0, boolean arg1, class379 arg2) {
        field6107++;
        if (arg2.field5152[arg2.field5173] != 31 || arg2.field5152[arg2.field5173 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field6108 == null) {
            this.field6108 = new Inflater(true);
        }
        try {
            this.field6108.setInput(arg2.field5152, arg2.field5173 + 10, -arg2.field5173 + -18 + arg2.field5152.length);
            this.field6108.inflate(arg0);
        } catch (Exception var4) {
            this.field6108.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (!arg1) {
            this.field6108 = null;
        }
        this.field6108.reset();
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)I")
    public static final int method2567(int arg0, int arg1) {
        field6106++;
        if (arg0 != 1431) {
            field6105 = null;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
    public class447() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(III)V")
    private class447(int arg0, int arg1, int arg2) {
    }

    static {
        new class304("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
    }
}

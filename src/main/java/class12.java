import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public abstract class class12 extends class484 {

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "Z")
    public boolean field122 = false;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "Z")
    public boolean field127 = false;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
    public int field126;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "I")
    public int field120;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "S")
    public short field130;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
    public int field129;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
    public static int field121 = -1;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "Z")
    public static boolean field123 = false;

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
    public static int field131 = 0;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "[Lhg;")
    public static class363[] field128 = new class363[14];

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field133 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field132 = new String[100];

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "Lqu;")
    public static class219 field125 = new class219(41, 8);

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "Z")
    public static boolean field124;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(I)V")
    public static void method74(int arg0) {
        field133 = null;
        field128 = null;
        field125 = null;
        field132 = null;
        if (arg0 != 100) {
            method74(-105);
        }
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(IIIIZZ)V")
    public class12(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        this.field126 = arg1;
        this.field127 = arg5;
        this.field120 = arg2;
        this.field130 = (short) arg3;
        this.field129 = arg0;
        this.field122 = arg4;
    }

    static {
        new class213("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
        field134 = 0;
    }
}

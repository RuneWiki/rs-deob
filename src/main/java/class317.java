import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class317 {

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "Lfg;")
    public static class83 field4397;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4400;

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
    public class317() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)V")
    public static void method1802(boolean arg0) {
        field4397 = null;
        if (!arg0) {
            field4398 = 61;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "([BILlh;)V")
    public final void method1803(byte[] arg0, int arg1, class365 arg2) {
        field4399++;
        if (arg2.field5073[arg2.field5069] != 31 || arg2.field5073[arg2.field5069 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4400 == null) {
            this.field4400 = new Inflater(true);
        }
        try {
            this.field4400.setInput(arg2.field5073, arg2.field5069 + 10, -arg2.field5069 + -10 - (8 - arg2.field5073.length));
            this.field4400.inflate(arg0);
        } catch (Exception var4) {
            this.field4400.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4400.reset();
        if (arg1 != -20285) {
            this.field4400 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BIIIIII)I")
    public static final int method1804(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 41) {
            field4398 = -84;
        }
        field4396++;
        int var7 = arg4 & 0x3;
        if ((arg1 & 0x1) == 1) {
            int var8 = arg3;
            arg3 = arg6;
            arg6 = var8;
        }
        if (var7 == 0) {
            return arg2;
        } else if (var7 == 1) {
            return arg5;
        } else if (var7 == 2) {
            return 7 + 1 - arg2 - arg3;
        } else {
            return 7 + 1 - arg5 - arg6;
        }
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(III)V")
    private class317(int arg0, int arg1, int arg2) {
    }

    static {
        new class83(" days.", " Tage.", " jours.", " dias.");
        field4398 = 0;
        field4397 = new class83("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");
    }
}

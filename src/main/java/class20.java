import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public abstract class class20 {

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "I")
    public int field216;

    @OriginalMember(owner = "client!kba", name = "g", descriptor = "I")
    public int field222;

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "I")
    public int field217;

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "Lra;")
    public static class361 field218 = new class361(52, -2);

    @OriginalMember(owner = "client!kba", name = "e", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field220 = new Rectangle[100];

    @OriginalMember(owner = "client!kba", name = "i", descriptor = "Lrba;")
    public static class101 field224;

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!kba", name = "f", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!kba", name = "h", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(III)V")
    public abstract void method111(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Z)V")
    public static void method112(boolean arg0) {
        field220 = null;
        field218 = null;
        if (arg0) {
            field218 = null;
        }
        field224 = null;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IZI)Z")
    public static final boolean method113(int arg0, boolean arg1, int arg2) {
        field219++;
        if (!arg1) {
            method112(true);
        }
        return (arg2 & 0x40000) != 0 | class420.method2422(false, arg2, arg0) || class314.method1832(arg0, arg2, arg1);
    }

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "(III)V")
    public abstract void method114(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "(III)V")
    public abstract void method115(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(III)V")
    public class20(int arg0, int arg1, int arg2) {
        this.field216 = arg2;
        this.field222 = arg1;
        this.field217 = arg0;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(BLfd;)Lrk;")
    public static final class260 method116(byte arg0, class418 arg1) {
        field221++;
        int var2 = arg1.method2355(100);
        if (arg0 < 102) {
            field223 = 126;
        }
        return new class260(var2);
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field220[var0] = new Rectangle();
        }
        field224 = new class101("", 11);
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class92 {

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "J")
    private long field1291;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    private int field1296;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "Z")
    public static boolean field1294 = false;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "[[I")
    public static int[][] field1289;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Luia;")
    public final class382 method722(int arg0, int arg1) {
        int var3 = 2 / ((46 - arg1) / 59);
        field1288++;
        return class382.method2375(this.method725(arg0, true), 71);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILuia;)V")
    private final void method723(int arg0, class382 arg1) {
        this.field1291 |= (arg1.field5549 << class382.field5555 * this.field1296++);
        field1297++;
        if (arg0 <= 72) {
            this.method726(-3);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)Lho;")
    public static final class160 method724(int arg0) {
        field1295++;
        try {
            return (class160) Class.forName("jn").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            if (arg0 != 1) {
                field1289 = null;
            }
            return new class20();
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZ)I")
    private final int method725(int arg0, boolean arg1) {
        if (arg1) {
            field1293++;
            return (int) (this.field1291 >> class382.field5555 * arg0) & 0xF;
        } else {
            return -73;
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Luia;)V")
    public class92(class382 arg0) {
        this.field1291 = arg0.field5549;
        this.field1296 = 1;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "([Luia;)V")
    public class92(class382[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method723(94, arg0[var2]);
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)I")
    public final int method726(int arg0) {
        field1290++;
        int var2 = 76 / ((arg0 + 15) / 59);
        return this.field1296;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
    public static void method727(byte arg0) {
        if (arg0 < 48) {
            method724(-29);
        }
        field1289 = null;
    }
}

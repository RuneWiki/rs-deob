import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class486 {

    @OriginalMember(owner = "client!fw", name = "m", descriptor = "I")
    public int field7372 = 128;

    @OriginalMember(owner = "client!fw", name = "n", descriptor = "I")
    public int field7373 = 128;

    @OriginalMember(owner = "client!fw", name = "h", descriptor = "I")
    public int field7367;

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "I")
    public int field7362;

    @OriginalMember(owner = "client!fw", name = "j", descriptor = "I")
    public int field7369;

    @OriginalMember(owner = "client!fw", name = "g", descriptor = "I")
    public int field7366;

    @OriginalMember(owner = "client!fw", name = "l", descriptor = "I")
    public static int field7371 = 0;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "I")
    public int field7360;

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "I")
    public int field7361;

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "I")
    public int field7363;

    @OriginalMember(owner = "client!fw", name = "e", descriptor = "I")
    public static int field7364;

    @OriginalMember(owner = "client!fw", name = "f", descriptor = "I")
    public static int field7365;

    @OriginalMember(owner = "client!fw", name = "i", descriptor = "I")
    public int field7368;

    @OriginalMember(owner = "client!fw", name = "k", descriptor = "I")
    public static int field7370;

    @OriginalMember(owner = "client!fw", name = "o", descriptor = "I")
    public static int field7374;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(III)Z")
    public static final boolean method2982(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            field7371 = -113;
        }
        field7374++;
        return (arg1 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(BI)Z")
    public static final boolean method2983(byte arg0, int arg1) {
        field7365++;
        if (arg0 < 25) {
            return true;
        } else {
            return arg1 == 2 || arg1 == 3 || arg1 == 4 || arg1 == 5;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lfw;I)V")
    public final void method2984(class486 arg0, int arg1) {
        field7370++;
        this.field7369 = arg0.field7369;
        this.field7362 = arg0.field7362;
        this.field7367 = arg0.field7367;
        this.field7372 = arg0.field7372;
        if (arg1 != -17044) {
            this.field7361 = -124;
        }
        this.field7366 = arg0.field7366;
        this.field7373 = arg0.field7373;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Z)Lfw;")
    public final class486 method2985(boolean arg0) {
        field7364++;
        if (arg0) {
            this.field7367 = 112;
        }
        return new class486(this.field7367, this.field7373, this.field7372, this.field7369, this.field7362, this.field7366);
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(I)V")
    public class486(int arg0) {
        this.field7367 = arg0;
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(IIIIII)V")
    private class486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7362 = arg4;
        this.field7372 = arg2;
        this.field7367 = arg0;
        this.field7369 = arg3;
        this.field7373 = arg1;
        this.field7366 = arg5;
    }
}

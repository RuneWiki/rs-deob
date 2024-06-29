import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public abstract class class648 {

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "Lgi;")
    public class583 field9395;

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "Loca;")
    public static class221 field9396 = new class221(1, 2, 2, 0);

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
    public static int field9397;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "Lao;")
    public static class240 field9398;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "[I")
    public static int[] field9399;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(BLmw;I)V")
    public abstract void method942(byte arg0, class418 arg1, int arg2);

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)Z")
    public abstract boolean method946(int arg0);

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IZ)V")
    public abstract void method947(int arg0, boolean arg1);

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIBI)I")
    public static final int method3728(int arg0, int arg1, byte arg2, int arg3) {
        field9397++;
        if ((class80.field1299[arg1][arg3][arg0] & 0x8) == 0) {
            if (arg2 < 34) {
                method3729(102);
            }
            return arg1 <= 0 || (class80.field1299[1][arg3][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)V")
    public abstract void method941(int arg0);

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lgi;)V")
    public class648(class583 arg0) {
        this.field9395 = arg0;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(BZ)V")
    public abstract void method944(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "(I)V")
    public static void method3729(int arg0) {
        field9396 = null;
        int var1 = 34 % ((arg0 - 16) / 43);
        field9398 = null;
        field9399 = null;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(III)V")
    public abstract void method945(int arg0, int arg1, int arg2);
}

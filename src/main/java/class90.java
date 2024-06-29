import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public abstract class class90 extends class352 {

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Ld;")
    public static class242 field1445 = new class242(8);

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public int field1450;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public int field1451;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public int field1452;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Z")
    public boolean field1446;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V")
    public final void method108(int arg0) {
        int var2 = -101 / ((arg0 - 48) / 37);
        field1447++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lza;IIILps;IZ)V")
    public final void method102(class299 arg0, int arg1, int arg2, int arg3, class352 arg4, int arg5, boolean arg6) {
        if (arg3 == -750) {
            field1449++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method778(int arg0) {
        if (arg0 <= -105) {
            field1445 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(B)Z")
    public final boolean method107(byte arg0) {
        if (arg0 == -88) {
            field1448++;
            return false;
        } else {
            return false;
        }
    }
}

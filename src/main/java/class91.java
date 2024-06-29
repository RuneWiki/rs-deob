import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public abstract class class91 {

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field1366 = -1;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public static int field1367 = 0;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "[[I")
    public static int[][] field1369 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "Lwa;")
    public static class433 field1371 = new class433(8);

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "Lws;")
    public static class238 field1368;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "Llg;")
    public static class284 field1370;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V", line = 17)
    public static final void method528(int arg0) {
        field1365++;
        int var1 = -52 % ((arg0 + 55) / 50);
        class33.field345.method1111(((float) class426.field6401.field1024 * 0.1F + 0.7F) * 1.1523438F);
        class33.field345.method1049(class241.field3562, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
        class33.field345.method1052(class26.field279, -1, 256);
        class33.field345.method1083(class251.field3732);
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V", line = 38)
    public static void method530(int arg0) {
        if (arg0 != 1) {
            method530(1);
        }
        field1370 = null;
        field1368 = null;
        field1369 = null;
        field1371 = null;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(III)[B")
    public abstract byte[] method527(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "([BZ)V")
    public abstract void method529(byte[] arg0, boolean arg1);

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(I)[B")
    public abstract byte[] method531(int arg0);
}

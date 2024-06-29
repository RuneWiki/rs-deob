import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class129 {

    @OriginalMember(owner = "client!g", name = "f", descriptor = "Luca;")
    private class287 field1859;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "J")
    public long field1854;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "Lnfa;")
    public static class661 field1856 = new class661(128);

    @OriginalMember(owner = "client!g", name = "e", descriptor = "F")
    public static float field1858;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IZI)I", line = 5)
    public static final int method918(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method921(18, 119);
        }
        field1860++;
        return arg2 == 1 || arg2 == 3 ? class268.field3509[arg0 & 0x3] : class610.field8813[arg0 & 0x3];
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIZI)V", line = 20)
    public static final void method919(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        if (arg1 != 27700) {
            field1856 = null;
        }
        field1855++;
        if ((arg6 ? class335.field4872.field9479 : class335.field4872.field9495) != 0 && arg3 != 0 && class380.field5732 < 50 && arg0 != -1) {
            class141.field2038[class380.field5732++] = new class268((byte) (arg6 ? 3 : 2), arg0, arg3, arg7, arg4, arg5, arg2, null);
        }
    }

    @OriginalMember(owner = "client!g", name = "finalize", descriptor = "()V", line = 43)
    protected final void finalize() throws Throwable {
        field1861++;
        this.field1859.method1757(127, this.field1854);
        super.finalize();
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V", line = 52)
    public static void method920(int arg0) {
        field1856 = null;
        if (arg0 != 7749) {
            method918(119, false, -7);
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Luca;JI)V", line = 66)
    public class129(class287 arg0, long arg1, int arg2) {
        this.field1859 = arg0;
        this.field1854 = arg1;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Lnp;", line = 78)
    public static final class154 method921(int arg0, int arg1) {
        field1857++;
        if (arg0 < 39) {
            return null;
        } else if (arg1 >= 0 && arg1 < 100) {
            return class401.field6039[arg1];
        } else {
            return null;
        }
    }
}

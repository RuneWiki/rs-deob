import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public abstract class class308 {

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "Luw;")
    public static class208 field3864 = new class208(76, 3);

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "Ltba;")
    public static class339 field3865;

    static {
        new class582("", 76);
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(I)V", line = 3)
    public static void method1813(int arg0) {
        field3865 = null;
        int var1 = -17 % ((-arg0 - 18) / 55);
        field3864 = null;
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(IB)Z")
    public abstract boolean method1814(int arg0, byte arg1) throws IOException;

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "(I)V")
    public abstract void method1815(int arg0);

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "([BIII)V")
    public abstract void method1816(byte[] arg0, int arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!rga", name = "c", descriptor = "(I)V")
    public abstract void method1817(int arg0);

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(IB[BI)I")
    public abstract int method1818(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException;
}

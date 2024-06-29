import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public abstract class class324 {

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "[S")
    public static short[] field4672 = new short[256];

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "Liu;")
    public static class517 field4671 = new class517(80, -1);

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)Z")
    public abstract boolean method1611(int arg0);

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)I")
    public abstract int method1614(byte arg0);

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(I)V")
    public abstract void method1606(int arg0);

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(B)V")
    public abstract void method1615(byte arg0);

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Z)Z")
    public abstract boolean method1612(boolean arg0);

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "(B)I")
    public abstract int method1607(byte arg0);

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "(I)Z")
    public final boolean method2009(int arg0) {
        field4673++;
        if (arg0 != -1) {
            this.method1607((byte) 0);
        }
        return this.method1613(arg0) || this.method1611(arg0) || this.method1612(false);
    }

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "(I)V")
    public static void method2010(int arg0) {
        field4671 = null;
        if (arg0 == 256) {
            field4672 = null;
        }
    }

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "(I)Lsda;")
    public abstract class7 method1618(int arg0);

    @OriginalMember(owner = "client!nu", name = "f", descriptor = "(I)Z")
    public abstract boolean method1613(int arg0);
}

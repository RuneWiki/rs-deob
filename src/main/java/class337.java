import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public abstract class class337 {

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(I[B)V")
    public abstract void method1221(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lmo;Z)Z")
    public static final boolean method1974(class361 arg0, boolean arg1) {
        field4546++;
        if (!arg1) {
            field4545 = -81;
        }
        return class28.field411 == arg0 || class392.field5250 == arg0 || class85.field1021 == arg0 || class538.field7388 == arg0;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(III)[B")
    public abstract byte[] method1222(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)[B")
    public abstract byte[] method1223(byte arg0);

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Ljd;BI)V")
    public static final void method1975(class537 arg0, byte arg1, int arg2) {
        field4547++;
        class421.field5526 = false;
        class564.field7691 = 0;
        class609.method3380(arg0, true);
        class12.method71(0, arg0);
        if (class421.field5526) {
            System.out.println("---endgpp---");
        }
        int var3 = -12 % ((arg1 + 14) / 49);
        if (arg0.field2219 != arg2) {
            throw new RuntimeException("gpi1 pos:" + arg0.field2219 + " psize:" + arg2);
        }
    }
}

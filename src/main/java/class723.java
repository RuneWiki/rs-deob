import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public abstract class class723 {

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "I")
    public static int field10187;

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "I")
    public static int field10188;

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(III[I)V")
    public abstract void method861(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "(III[I)V")
    public abstract void method872(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "()Luha;")
    public abstract class723 method859();

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(III)V")
    public abstract void method848(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(I)V")
    public abstract void method846(int arg0);

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(II)V")
    public static final void method4052(int arg0, int arg1) {
        class748.field10428 = arg1;
        field10187++;
        class555.field7836.method3210(false);
        if (arg0 == -18815) {
            ;
        }
    }

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "(III)V")
    public abstract void method851(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "(I)V")
    public abstract void method847(int arg0);

    @OriginalMember(owner = "client!uha", name = "c", descriptor = "(I)V")
    public abstract void method873(int arg0);

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(IIIII)V")
    public static final void method4053(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 >= class675.field9512 && class395.field5484 >= arg2) {
            int var5 = class325.method1901(arg4, class490.field6592, class116.field1628, true);
            int var6 = class325.method1901(arg0, class490.field6592, class116.field1628, true);
            class271.method1656(var5, var6, arg2, (byte) -1, arg1);
        }
        field10188++;
        if (arg3 == 25531) {
            ;
        }
    }

    @OriginalMember(owner = "client!uha", name = "b", descriptor = "()V")
    public abstract void method860();

    @OriginalMember(owner = "client!uha", name = "d", descriptor = "(I)V")
    public abstract void method866(int arg0);

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "([I)V")
    public abstract void method870(int[] arg0);

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(Luha;)V")
    public abstract void method864(class723 arg0);

    @OriginalMember(owner = "client!uha", name = "e", descriptor = "(I)V")
    public abstract void method843(int arg0);

    @OriginalMember(owner = "client!uha", name = "a", descriptor = "(IIIIII)V")
    public abstract void method853(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!uha", name = "c", descriptor = "(III[I)V")
    public abstract void method871(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!uha", name = "f", descriptor = "(I)V")
    public abstract void method844(int arg0);
}

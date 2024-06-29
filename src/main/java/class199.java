import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public abstract class class199 {

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lsj;I)I", line = 5)
    public static final int method1412(class511 arg0, int arg1) {
        if (arg1 != 26582) {
            return -95;
        }
        field3098++;
        int var2 = arg0.field7456;
        class477 var3 = arg0.method3101(arg1 ^ 0xFFFF9829);
        if (arg0.field7596) {
            var2 = arg0.field7472;
        } else if (arg0.field7590 == var3.field6978 || arg0.field7590 == var3.field6983 || arg0.field7590 == var3.field6997 || arg0.field7590 == var3.field7019) {
            var2 = arg0.field7443;
        } else if (arg0.field7590 == var3.field6975 || arg0.field7590 == var3.field7017 || arg0.field7590 == var3.field6981 || arg0.field7590 == var3.field7004) {
            var2 = arg0.field7454;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I[B)V")
    public abstract void method1026(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1028(int arg0);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZI)[B")
    public abstract byte[] method1027(int arg0, boolean arg1, int arg2);
}

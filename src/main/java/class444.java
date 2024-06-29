import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public abstract class class444 extends class366 {

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "Z")
    public volatile boolean field6348 = true;

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "[I")
    public static int[] field6342 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!qc", name = "E", descriptor = "I")
    public static int field6344 = 0;

    @OriginalMember(owner = "client!qc", name = "G", descriptor = "Z")
    public static boolean field6346 = false;

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!qc", name = "D", descriptor = "I")
    public static int field6343;

    @OriginalMember(owner = "client!qc", name = "F", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!qc", name = "H", descriptor = "Z")
    public boolean field6347;

    @OriginalMember(owner = "client!qc", name = "J", descriptor = "Z")
    public boolean field6349;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILtj;Ltj;)V", line = 13)
    public static final void method2768(int arg0, class108 arg1, class108 arg2) {
        class86.field1119 = arg2;
        class407.field5735 = arg1;
        field6341++;
        class86.field1119.method651(0, arg0);
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(Z)V", line = 46)
    public static void method2769(boolean arg0) {
        field6342 = null;
        if (!arg0) {
            method2769(false);
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(Z)I")
    public abstract int method453(boolean arg0);

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)[B")
    public abstract byte[] method448(int arg0);
}

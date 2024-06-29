import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class97 {

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "Lkga;")
    private class506 field1311;

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "J")
    public long field1312;

    @OriginalMember(owner = "client!bba", name = "f", descriptor = "Ljk;")
    public static class585 field1316 = new class585(40, -1);

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!bba", name = "d", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!bba", name = "e", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!bba", name = "g", descriptor = "Lil;")
    public static class7 field1317;

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIILeba;I)V")
    public static final void method736(int arg0, int arg1, int arg2, class543 arg3, int arg4) {
        arg3.field7872.method2233((byte) -54, arg0);
        if (arg2 != 40) {
            method738(null, null, 126);
        }
        field1315++;
        arg3.field7872.method2226(arg1, (byte) -58);
        arg3.field7872.method2256(arg4, 2);
    }

    @OriginalMember(owner = "client!bba", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field1311.method3005(0, this.field1312);
        field1313++;
        super.finalize();
    }

    @OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(Lkga;JI)V")
    public class97(class506 arg0, long arg1, int arg2) {
        this.field1311 = arg0;
        this.field1312 = arg1;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)V")
    public static void method737(int arg0) {
        field1317 = null;
        field1316 = null;
        if (arg0 != 40) {
            method738(null, null, -39);
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lsj;Lsj;I)V")
    public static final void method738(class426 arg0, class426 arg1, int arg2) {
        field1314++;
        if (arg1.field6112 != null) {
            arg1.method2564((byte) 2);
        }
        arg1.field6117 = arg0;
        arg1.field6112 = arg0.field6112;
        arg1.field6112.field6117 = arg1;
        int var3 = -35 % ((73 - arg2) / 51);
        arg1.field6117.field6112 = arg1;
    }
}

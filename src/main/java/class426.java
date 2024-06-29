import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class426 {

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public int field5995;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "Lmc;")
    private class120 field5997;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field5994 = 0;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field5996;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field5999;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V", line = 9)
    public static final void method2415(byte arg0) {
        field6002++;
        int[] var1 = new int[class648.field9184.field7533];
        int var2 = 0;
        for (int var3 = 0; var3 < class648.field9184.field7533; var3++) {
            class257 var6 = class648.field9184.method3064(var3, -11);
            if (var6.field3631 >= 0 || var6.field3632 >= 0) {
                var1[var2++] = var3;
            }
        }
        int var4 = 107 / ((arg0 + 45) / 48);
        class41.field523 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            class41.field523[var5] = var1[var5];
        }
    }

    @OriginalMember(owner = "client!ch", name = "finalize", descriptor = "()V", line = 43)
    protected final void finalize() throws Throwable {
        this.field5997.method858((byte) -105, this.field5995);
        field5998++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IB)V", line = 59)
    public static final void method2416(int arg0, byte arg1) {
        field6001++;
        class679 var2 = class669.method3708(16, arg0, 1403048928);
        if (arg1 != 24) {
            field5996 = -52;
        }
        var2.method3749(arg1 - 109);
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lmc;II)V", line = 72)
    public class426(class120 arg0, int arg1, int arg2) {
        this.field5995 = arg2;
        this.field5997 = arg0;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class651 extends class321 {

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "Luca;")
    private class287 field9321;

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "I")
    public int field9322;

    @OriginalMember(owner = "client!gj", name = "y", descriptor = "J")
    private long field9325;

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "Z")
    public static boolean field9324 = false;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "I")
    public static int field9320;

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "I")
    public static int field9323;

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "I")
    public static int field9326;

    @OriginalMember(owner = "client!gj", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        field9326++;
        this.method3688((byte) -11);
        super.finalize();
    }

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "(I)J", line = 15)
    public final long method3686(int arg0) {
        if (arg0 != 16) {
            this.method3688((byte) -43);
        }
        field9323++;
        return this.field9325;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lcaa;Z[[[BIB)Z", line = 31)
    public static final boolean method3687(class538 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class476.field6821) {
            return false;
        }
        int var5 = arg0.field7895 >> class125.field1831;
        int var6 = arg0.field7896 >> class125.field1831;
        if (var5 < class617.field8900 || var5 >= class656.field9373 || var6 < class181.field2501 || var6 >= class489.field6953) {
            return true;
        } else if ((arg2 == null || arg0.field7905 < arg3 || arg2[arg0.field7905][var5][var6] != arg4) && arg0.method1809(0) && !arg0.method1807(false)) {
            return false;
        } else {
            if (!arg1 && var5 >= class361.field5293 - 16 && var5 <= class361.field5293 + 16 && var6 >= class545.field8045 - 16 && var6 <= class545.field8045 + 16) {
                if (class96.field1479) {
                    class78.field1283[class641.field9197++].method2773(arg0, 121);
                    class641.field9197 %= class346.field5108;
                } else {
                    arg0.method259(class503.field7110, 11771);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V", line = 66)
    private final void method3688(byte arg0) {
        field9320++;
        if (arg0 == -11 && this.field9325 > 0L) {
            this.field9321.field3874.releasePbuffer(this.field9325);
            this.field9325 = 0L;
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Luca;II)V", line = 87)
    public class651(class287 arg0, int arg1, int arg2) {
        this.field9321 = arg0;
        this.field9322 = arg1 * arg2;
        this.field9325 = this.field9321.field3874.createPbuffer(arg1, arg2);
    }
}

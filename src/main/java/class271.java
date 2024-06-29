import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class271 implements class95 {

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public int field3881;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field3880 = 1;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class271(String arg0, int arg1) {
        this.field3881 = arg1;
    }

    @OriginalMember(owner = "client!kg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3883++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)I")
    public static final int method1797(int arg0, int arg1) {
        field3884++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        if (arg0 != 2864) {
            field3882 = -43;
        }
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg1;
    }
}

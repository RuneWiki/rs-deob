import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class186 extends class90 {

    @OriginalMember(owner = "client!hga", name = "k", descriptor = "Lcja;")
    public static class46 field2881 = new class46(8);

    @OriginalMember(owner = "client!hga", name = "l", descriptor = "J")
    public static long field2882 = 0L;

    @OriginalMember(owner = "client!hga", name = "i", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!hga", name = "h", descriptor = "Lcn;")
    public class543 field2878;

    @OriginalMember(owner = "client!hga", name = "j", descriptor = "Z")
    public boolean field2880;

    @OriginalMember(owner = "client!hga", name = "g", descriptor = "[Leea;")
    public class144[] field2877;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)V", line = 3)
    public static void method1379(int arg0) {
        int var1 = 76 / ((arg0 - 31) / 54);
        field2881 = null;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(ILha;II)Z", line = 14)
    public final boolean method1380(int arg0, class66 arg1, int arg2, int arg3) {
        field2879++;
        int var5 = this.field2878.method1461((byte) -115);
        if (arg2 != 0) {
            field2881 = null;
        }
        if (this.field2877 != null) {
            for (int var6 = 0; var6 < this.field2877.length; var6++) {
                this.field2877[var6].field2432 <<= var5;
                if (this.field2877[var6].method1162(arg3, arg0) && this.field2878.method908(arg1, arg3, 131072, arg0)) {
                    this.field2877[var6].field2432 >>= var5;
                    return true;
                }
                this.field2877[var6].field2432 >>= var5;
            }
        }
        return false;
    }
}

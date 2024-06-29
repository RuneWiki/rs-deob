import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class387 extends class670 {

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "Lqfa;")
    public static class98 field5479 = new class98(19, -2);

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "Z")
    public static boolean field5485 = false;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "Lkba;")
    public class105 field5483;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "Ljava/awt/Frame;")
    public static Frame field5484;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "Z")
    public boolean field5480;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "[Lfn;")
    public class137[] field5482;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILha;BI)Z", line = 4)
    public final boolean method2439(int arg0, class58 arg1, byte arg2, int arg3) {
        field5481++;
        int var5 = this.field5483.method747(77);
        if (arg2 != -122) {
            return false;
        }
        if (this.field5482 != null) {
            for (int var6 = 0; var6 < this.field5482.length; var6++) {
                this.field5482[var6].field1988 <<= var5;
                if (this.field5482[var6].method972(arg3, arg0) && this.field5483.method752(arg1, 0, arg0, arg3)) {
                    this.field5482[var6].field1988 >>= var5;
                    return true;
                }
                this.field5482[var6].field1988 >>= var5;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V", line = 40)
    public static void method2440(int arg0) {
        int var1 = -7 / ((arg0 - 48) / 53);
        field5484 = null;
        field5479 = null;
    }
}

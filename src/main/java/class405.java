import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class405 extends class115 {

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    public static int field6098;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
    public static int field6099;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
    public static int field6103;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "J")
    public long field6102;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "Ltm;")
    public class405 field6100;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "Ltm;")
    public class405 field6101;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "[I")
    public static int[] field6097;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)Z")
    public final boolean method2438(boolean arg0) {
        field6098++;
        if (arg0) {
            return this.field6101 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)V")
    public static void method2439(int arg0) {
        if (arg0 != -21617) {
            field6097 = null;
        }
        field6097 = null;
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)V")
    public final void method2440(int arg0) {
        field6103++;
        if (this.field6101 == null) {
            return;
        }
        if (arg0 > -32) {
            this.field6100 = null;
        }
        this.field6101.field6100 = this.field6100;
        this.field6100.field6101 = this.field6101;
        this.field6101 = null;
        this.field6100 = null;
    }
}

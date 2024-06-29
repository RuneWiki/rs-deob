import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class25 extends class107 {

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "I")
    public static int field375 = 0;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "Ldf;")
    public static class51 field371 = class46.method233("Mem:", 100);

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "J")
    public long field374;

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "Lsc;")
    public static class229 field376;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "Llj;")
    public class25 field373;

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "Llj;")
    public class25 field379;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V")
    public final void method134(int arg0) {
        int var2 = -53 % ((arg0 - 13) / 39);
        field372++;
        if (this.field379 != null) {
            this.field379.field373 = this.field373;
            this.field373.field379 = this.field379;
            this.field379 = null;
            this.field373 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lwc;I)V")
    public static final void method135(class213 arg0, int arg1) {
        if (class248.field4366 == arg0.field3613) {
            class213.field3705[arg0.field3680] = true;
        }
        field377++;
        if (arg1 != -28014) {
            field371 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)V")
    public static void method136(int arg0) {
        field376 = null;
        if (arg0 == 0) {
            field371 = null;
        }
    }
}

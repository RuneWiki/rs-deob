import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class69 {

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "I")
    public int field1081;

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "[I")
    public int[] field1080;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "[I")
    public int[] field1079;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field1078;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
    public static void method403(int arg0) {
        field1078 = null;
        int var1 = -16 % ((-arg0 - 59) / 54);
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(I)V")
    public class69(int arg0) {
        this.field1081 = arg0;
        this.field1080 = new int[this.field1081];
        this.field1079 = new int[this.field1081];
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)V")
    public static final void method404(int arg0) {
        class322.method2003(0, 11);
        field1077++;
        class573.method3295(126);
        if (arg0 == -31369) {
            System.gc();
        }
    }
}

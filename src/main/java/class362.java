import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class362 {

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public int field5531;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "[I")
    public int[] field5522;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "[I")
    public int[] field5523;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5527 = "Loaded world list data";

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "Ljava/lang/String;")
    public static String field5530 = "Allocated memory";

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "[I")
    public static int[] field5529 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "Lal;")
    public static class52 field5525 = new class52(64);

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "Lfi;")
    public static class330 field5528;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "[I")
    public static int[] field5524;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public static void method2344(int arg0) {
        field5528 = null;
        field5527 = null;
        field5524 = null;
        field5525 = null;
        field5530 = null;
        field5529 = null;
        if (arg0 != -1) {
            method2345(0, 8, -11);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)V")
    public static final void method2345(int arg0, int arg1, int arg2) {
        boolean var3 = class423.field6252[0][arg1][arg2] != null && class423.field6252[0][arg1][arg2].field3863 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class423.field6252[var4][arg1][arg2] == null) {
                class232 var5 = class423.field6252[var4][arg1][arg2] = new class232(var4, arg1, arg2);
                if (var3) {
                    var5.field3879++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(I)V")
    public class362(int arg0) {
        this.field5531 = arg0;
        this.field5522 = new int[this.field5531];
        this.field5523 = new int[this.field5531];
    }
}

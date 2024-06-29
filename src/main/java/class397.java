import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class397 {

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "I")
    public int field5001 = -1;

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "I")
    public int field5002 = -1;

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "Lmd;")
    public static class289 field5005;

    @OriginalMember(owner = "client!tv", name = "f", descriptor = "[I")
    public int[] field5006;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V")
    public static void method2127(int arg0) {
        field5005 = null;
        if (arg0 != 2) {
            field5005 = null;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Les;I)V")
    public final void method2128(class630 arg0, int arg1) {
        if (arg1 != 0) {
            this.field5001 = -77;
        }
        while (true) {
            int var3 = arg0.method3501(-9268);
            if (var3 == 0) {
                field5003++;
                return;
            }
            this.method2129(arg0, 0, var3);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Les;II)V")
    private final void method2129(class630 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method2129(null, 98, 48);
        }
        if (arg2 == 1) {
            this.field5001 = arg0.method3470(13111);
        } else if (arg2 == 2) {
            this.field5006 = new int[arg0.method3501(-9268)];
            for (int var4 = 0; var4 < this.field5006.length; var4++) {
                this.field5006[var4] = arg0.method3470(13111);
            }
        } else if (arg2 == 3) {
            this.field5002 = arg0.method3501(-9268);
        }
        field5004++;
    }
}

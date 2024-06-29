import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class412 {

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public int field5774 = -1;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public int field5779 = -1;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field5777 = 0;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field5780 = 0;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "[I")
    public int[] field5775;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILdga;I)V", line = 6)
    private final void method2415(int arg0, class138 arg1, int arg2) {
        if (arg0 != -4) {
            return;
        }
        if (arg2 == 1) {
            this.field5779 = arg1.method922((byte) -126);
        } else if (arg2 == 2) {
            this.field5775 = new int[arg1.method957((byte) -90)];
            for (int var4 = 0; var4 < this.field5775.length; var4++) {
                this.field5775[var4] = arg1.method922((byte) -124);
            }
        } else if (arg2 == 3) {
            this.field5774 = arg1.method957((byte) -95);
        }
        field5776++;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lsf;Lsf;I)V", line = 39)
    public static final void method2416(class28 arg0, class28 arg1, int arg2) {
        field5778++;
        if (arg0.field275 != null) {
            arg0.method175(30604);
        }
        arg0.field276 = arg1;
        arg0.field275 = arg1.field275;
        arg0.field275.field276 = arg0;
        if (arg2 != -1) {
            method2416(null, null, 120);
        }
        arg0.field276.field275 = arg0;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ldga;I)V", line = 59)
    public final void method2417(class138 arg0, int arg1) {
        field5773++;
        while (true) {
            int var3 = arg0.method957((byte) -107);
            if (var3 == 0) {
                if (arg1 >= -6) {
                    this.field5775 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method2415(-4, arg0, var3);
        }
    }
}

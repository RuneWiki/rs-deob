import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class521 {

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public int field7391 = -1;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public int field7393 = -1;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field7389;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field7390;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field7394;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "[I")
    public int[] field7392;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILnp;B)V", line = 5)
    private final void method2956(int arg0, class115 arg1, byte arg2) {
        if (arg2 <= 36) {
            return;
        }
        if (arg0 == 1) {
            this.field7393 = arg1.method643((byte) -77);
        } else if (arg0 == 2) {
            this.field7392 = new int[arg1.method620((byte) -14)];
            for (int var4 = 0; var4 < this.field7392.length; var4++) {
                this.field7392[var4] = arg1.method643((byte) -77);
            }
        } else if (arg0 == 3) {
            this.field7391 = arg1.method620((byte) -19);
        }
        field7394++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ltf;IIIZII)V", line = 39)
    public static final void method2957(class701 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class597.field8420 = arg3;
        class369.field5053 = arg2;
        class25.field217 = arg0;
        class258.field3249 = 1;
        class469.field6710 = arg6;
        class168.field1878 = arg5;
        class370.field5061 = arg4;
        int var7 = -33 / ((48 - arg1) / 33);
        field7389++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lnp;I)V", line = 64)
    public final void method2958(class115 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method620((byte) 61);
            if (var3 == 0) {
                if (arg1 != -1) {
                    this.field7392 = null;
                }
                field7390++;
                return;
            }
            this.method2956(var3, arg0, (byte) 73);
        }
    }
}

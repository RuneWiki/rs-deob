import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class310 extends class77 {

    @OriginalMember(owner = "client!a", name = "D", descriptor = "Lbb;")
    public class103 field4634;

    @OriginalMember(owner = "client!a", name = "y", descriptor = "J")
    public static volatile long field4629 = 0L;

    @OriginalMember(owner = "client!a", name = "w", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!a", name = "x", descriptor = "I")
    public int field4628;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "I")
    public int field4630;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!a", name = "B", descriptor = "I")
    public int field4632;

    @OriginalMember(owner = "client!a", name = "C", descriptor = "I")
    public int field4633;

    @OriginalMember(owner = "client!a", name = "E", descriptor = "I")
    public int field4635;

    @OriginalMember(owner = "client!a", name = "F", descriptor = "I")
    public int field4636;

    @OriginalMember(owner = "client!a", name = "G", descriptor = "I")
    public int field4637;

    @OriginalMember(owner = "client!a", name = "H", descriptor = "I")
    public int field4638;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIII)V", line = 6)
    public static final void method2179(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4627++;
        if (arg1 < 64) {
            field4629 = -55L;
        }
        if (arg4 > arg3) {
            for (int var5 = arg3; var5 < arg4; var5++) {
                class274.field4158[var5][arg0] = arg2;
            }
        } else {
            for (int var6 = arg4; var6 < arg3; var6++) {
                class274.field4158[var6][arg0] = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIZ)V", line = 58)
    public final void method2180(int arg0, int arg1, int arg2, boolean arg3) {
        this.field4628 = arg0;
        field4631++;
        this.field4635 = arg2;
        this.field4636 = arg1;
        if (!arg3) {
            method2181(-77, -53, -11);
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lbb;Lko;)V", line = 71)
    public class310(class103 arg0, class155 arg1) {
        this.field4634 = arg0;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(III)Lkm;", line = 82)
    public static final class94 method2181(int arg0, int arg1, int arg2) {
        class167 var3 = class302.field4502[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class94 var4 = var3.field2412;
            var3.field2412 = null;
            return var4;
        }
    }
}

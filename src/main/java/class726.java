import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class726 extends class601 {

    @OriginalMember(owner = "client!pea", name = "C", descriptor = "I")
    public static int field10092;

    @OriginalMember(owner = "client!pea", name = "D", descriptor = "I")
    public static int field10093;

    @OriginalMember(owner = "client!pea", name = "E", descriptor = "I")
    public static int field10094;

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(BI)[I")
    public final int[] method5(byte arg0, int arg1) {
        ++field10094;
        if (arg0 != -40) {
            field10093 = 89;
        }
        int[] var3 = super.field7902.method382(arg1, true);
        if (super.field7902.field704) {
            class335.method2021(var3, 0, class171.field2624, class250.field3446[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(JI)I")
    public static final int method4084(long arg0, int arg1) {
        ++field10092;
        class56.method376(arg0, -8474);
        int var3 = -48 % ((29 - arg1) / 43);
        return class132.field2151.get(1);
    }

    @OriginalMember(owner = "client!pea", name = "<init>", descriptor = "()V")
    public class726() {
        super(0, true);
    }
}

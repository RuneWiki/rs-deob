import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class719 extends class150 {

    @OriginalMember(owner = "client!jm", name = "C", descriptor = "I")
    public static int field10092;

    @OriginalMember(owner = "client!jm", name = "D", descriptor = "I")
    public static int field10093;

    @OriginalMember(owner = "client!jm", name = "E", descriptor = "I")
    public static int field10094;

    @OriginalMember(owner = "client!jm", name = "F", descriptor = "I")
    public static int field10095;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIII)V")
    public final void method1079(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field10095;
        if (arg4 == -27003) {
            int var6 = super.field1872.method1634();
            int var7 = ((class2) super.field5359).field35 * class136.method1007(arg4 + 20228) / 10 % var6;
            super.field1872.method1844(-var6 + arg3 + var7, arg2, arg0 + var6 + -var7, arg1);
        }
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lbt;Lbt;Lro;)V")
    public class719(class48 arg0, class48 arg1, class2 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IZ[B)[B")
    public static final byte[] method4069(int arg0, boolean arg1, byte[] arg2) {
        ++field10093;
        if (arg1) {
            field10094 = -90;
        }
        byte[] var3 = new byte[arg0];
        class211.method1330(arg2, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)I")
    public static final int method4070(byte arg0) {
        ++field10092;
        if (class727.field10184 == 1) {
            return class533.field7512;
        } else {
            if (arg0 <= 98) {
                field10094 = -111;
            }
            return 0;
        }
    }
}

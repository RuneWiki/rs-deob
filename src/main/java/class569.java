import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public abstract class class569 extends class214 {

    @OriginalMember(owner = "client!md", name = "z", descriptor = "S")
    public short field7762;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "S")
    public short field7765;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "I")
    public static int field7761;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "I")
    public static int field7763;

    @OriginalMember(owner = "client!md", name = "B", descriptor = "I")
    public static int field7764;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "I")
    public static int field7766;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "I")
    public static int field7767;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "I")
    public static int field7768;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILfq;BIILha;Z)V")
    public final void method129(int arg0, class214 arg1, byte arg2, int arg3, int arg4, class66 arg5, boolean arg6) {
        ++field7766;
        if (arg2 != -103) {
            this.method127(37);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lha;Z)Z")
    public final boolean method1389(class66 arg0, boolean arg1) {
        ++field7767;
        if (!arg1) {
            this.field7765 = -94;
        }
        return class769.method4235(super.field2809, super.field2802 >> class478.field6717, this.method774((byte) 115), (byte) 104, super.field2810 >> class478.field6717);
    }

    @OriginalMember(owner = "client!md", name = "f", descriptor = "(I)Z")
    public final boolean method1383(int arg0) {
        ++field7768;
        int var2 = -41 % ((arg0 - -48) / 41);
        return class408.field5778[(super.field2802 >> class478.field6717) - class130.field1787 + class278.field4025][(super.field2810 >> class478.field6717) + -class468.field6610 + class278.field4025];
    }

    @OriginalMember(owner = "client!md", name = "h", descriptor = "(I)V")
    public final void method127(int arg0) {
        if (arg0 == -13127) {
            ++field7761;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B[Luaa;)I")
    public final int method1388(byte arg0, class127[] arg1) {
        ++field7763;
        if (arg0 > -78) {
            this.method1388((byte) -60, (class127[]) null);
        }
        return this.method1385(super.field2810 >> class478.field6717, (byte) -116, arg1, super.field2802 >> class478.field6717);
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)Z")
    public final boolean method126(byte arg0) {
        ++field7764;
        if (arg0 != -34) {
            this.method126((byte) -101);
        }
        return false;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(IIIIIII)V")
    public class569(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super.field2813 = (byte) arg3;
        super.field2809 = (byte) arg4;
        super.field2802 = arg0;
        this.field7762 = (short) arg5;
        super.field2810 = arg2;
        super.field2815 = arg1;
        this.field7765 = (short) arg6;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class260 extends class425 {

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "I")
    private int field3844;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    public int field3837;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    private int field3835;

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "I")
    private int field3852;

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "I")
    private int field3847;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "I")
    public int field3846;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
    public int field3841;

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "I")
    public int field3851;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    private int field3836;

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "I")
    public static int field3843 = -1;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)Z")
    public final boolean method1795(int arg0, int arg1, int arg2) {
        field3842++;
        if (arg0 != 1) {
            this.field3851 = 71;
        }
        return this.field3846 <= arg1 && this.field3837 >= arg1 && arg2 >= this.field3841 && arg2 <= this.field3851;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II[II)V")
    public final void method1796(int arg0, int arg1, int[] arg2, int arg3) {
        arg2[arg1] = this.field3841 - (this.field3847 - arg3);
        arg2[0] = 0;
        field3839++;
        arg2[1] = arg0 + this.field3846 - this.field3852;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIII)Z")
    public final boolean method1797(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 >= -19) {
            return false;
        } else {
            field3840++;
            return this.field3836 == arg1 && arg3 >= this.field3852 && this.field3844 >= arg3 && this.field3847 <= arg0 && this.field3835 >= arg0;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "([IIIB)V")
    public final void method1798(int[] arg0, int arg1, int arg2, byte arg3) {
        arg0[0] = this.field3836;
        if (arg3 == 92) {
            arg0[1] = arg2 + this.field3852 - this.field3846;
            arg0[2] = this.field3847 + arg1 - this.field3841;
            field3850++;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BII)Z")
    public final boolean method1799(byte arg0, int arg1, int arg2) {
        field3848++;
        if (arg0 != -106) {
            this.field3844 = 49;
        }
        return this.field3852 <= arg1 && this.field3844 >= arg1 && this.field3847 <= arg2 && arg2 <= this.field3835;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field3844 = arg3;
        this.field3837 = arg7;
        this.field3835 = arg4;
        this.field3852 = arg1;
        this.field3847 = arg2;
        this.field3846 = arg5;
        this.field3841 = arg6;
        this.field3851 = arg8;
        this.field3836 = arg0;
    }
}

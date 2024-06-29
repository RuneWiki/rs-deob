import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class120 {

    @OriginalMember(owner = "client!km", name = "m", descriptor = "I")
    private int field1928;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "I")
    private int field1927;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    private int field1918;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "I")
    private int field1926;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    private int field1916;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    private int field1921;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    private int field1920;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "I")
    private int field1923;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "I")
    private int field1924;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    private int field1919;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIII)Z", line = 3)
    public final boolean method975(int arg0, int arg1, int arg2, int arg3) {
        field1922++;
        if (arg0 < this.field1921 || this.field1919 < arg0) {
            return false;
        }
        int var5 = 88 % ((69 - arg2) / 43);
        if (arg1 < this.field1920 || this.field1923 < arg1) {
            return false;
        } else if (arg3 >= this.field1924 && this.field1916 >= arg3) {
            int var6 = arg0 - this.field1918;
            int var7 = arg3 - this.field1926;
            return (var6 * var6 + (var7 * var7)) < this.field1928;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIIIIIIII)V", line = 32)
    public final void method976(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1927 = arg3;
        this.field1926 = arg4;
        field1917++;
        int var12 = 81 / ((arg0 + 22) / 58);
        this.field1918 = arg5;
        this.field1928 = arg10 * arg10;
        this.field1916 = this.field1926 + arg1;
        this.field1924 = this.field1926 + arg6;
        this.field1919 = this.field1918 + arg8;
        this.field1921 = this.field1918 + arg7;
        this.field1920 = this.field1927 + arg2;
        this.field1923 = this.field1927 + arg9;
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 60)
    public class120(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1928 = arg3 * arg3;
        this.field1927 = arg1;
        this.field1918 = arg0;
        this.field1926 = arg2;
        this.field1916 = this.field1926 + arg9;
        this.field1921 = this.field1918 + arg4;
        this.field1920 = this.field1927 + arg6;
        this.field1923 = this.field1927 + arg7;
        this.field1924 = this.field1926 + arg8;
        this.field1919 = this.field1918 + arg5;
    }
}

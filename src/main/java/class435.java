import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class435 {

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    private int field5917;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    private int field5921;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
    private int field5927;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    private int field5916;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
    public int field5924;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public int field5914;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
    public int field5926;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public int field5922;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public int field5919;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public int field5923;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "Lnf;")
    public static class604 field5918;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "Lgj;")
    public static class662 field5915;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "Lda;")
    public static class67 field5928;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIIIIII)V")
    public final void method2543(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field5925++;
        this.field5921 = arg0;
        this.field5917 = arg3 * arg3;
        this.field5927 = arg8;
        this.field5916 = arg10;
        this.field5922 = this.field5927 + arg1;
        if (arg5 != 5653) {
            return;
        }
        this.field5923 = this.field5921 + arg6;
        this.field5926 = this.field5916 + arg9;
        this.field5914 = this.field5927 + arg2;
        this.field5919 = this.field5921 + arg4;
        this.field5924 = this.field5916 + arg7;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public static void method2544(int arg0) {
        field5928 = null;
        field5918 = null;
        if (arg0 <= 110) {
            field5920 = -48;
        }
        field5915 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIII)Z")
    public final boolean method2545(int arg0, int arg1, int arg2, int arg3) {
        field5929++;
        if (this.field5922 > arg3 || this.field5914 < arg3) {
            return false;
        } else if (this.field5926 > arg2 || this.field5924 < arg2) {
            return false;
        } else if (arg0 >= this.field5923 && this.field5919 >= arg0) {
            int var5 = arg3 - this.field5927;
            if (arg1 != -30876) {
                this.field5922 = -57;
            }
            int var6 = arg0 - this.field5921;
            return var5 * var5 + (var6 * var6) < this.field5917;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field5917 = arg3 * arg3;
        this.field5921 = arg2;
        this.field5927 = arg0;
        this.field5916 = arg1;
        this.field5924 = this.field5916 + arg7;
        this.field5914 = this.field5927 + arg5;
        this.field5926 = this.field5916 + arg6;
        this.field5922 = this.field5927 + arg4;
        this.field5919 = this.field5921 + arg9;
        this.field5923 = this.field5921 + arg8;
    }
}

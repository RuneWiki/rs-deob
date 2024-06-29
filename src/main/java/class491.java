import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tja")
public class class491 {

    @OriginalMember(owner = "client!tja", name = "n", descriptor = "I")
    private int field6773;

    @OriginalMember(owner = "client!tja", name = "g", descriptor = "I")
    private int field6766;

    @OriginalMember(owner = "client!tja", name = "l", descriptor = "I")
    private int field6771;

    @OriginalMember(owner = "client!tja", name = "m", descriptor = "I")
    private int field6772;

    @OriginalMember(owner = "client!tja", name = "c", descriptor = "I")
    public int field6762;

    @OriginalMember(owner = "client!tja", name = "i", descriptor = "I")
    public int field6768;

    @OriginalMember(owner = "client!tja", name = "b", descriptor = "I")
    public int field6761;

    @OriginalMember(owner = "client!tja", name = "f", descriptor = "I")
    public int field6765;

    @OriginalMember(owner = "client!tja", name = "o", descriptor = "I")
    public int field6774;

    @OriginalMember(owner = "client!tja", name = "k", descriptor = "I")
    public int field6770;

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "Z")
    public static boolean field6760 = false;

    @OriginalMember(owner = "client!tja", name = "j", descriptor = "[I")
    public static int[] field6769 = new int[3];

    @OriginalMember(owner = "client!tja", name = "d", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!tja", name = "e", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!tja", name = "h", descriptor = "I")
    public static int field6767;

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(IIIIIIIIIII)V")
    public final void method2901(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field6772 = arg0;
        this.field6771 = arg2;
        field6763++;
        if (arg5 != 7418) {
            this.field6762 = -29;
        }
        this.field6766 = arg8 * arg8;
        this.field6773 = arg10;
        this.field6770 = this.field6771 + arg4;
        this.field6762 = this.field6773 + arg9;
        this.field6774 = this.field6772 + arg3;
        this.field6761 = this.field6772 + arg7;
        this.field6768 = this.field6771 + arg6;
        this.field6765 = this.field6773 + arg1;
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(I)V")
    public static void method2902(int arg0) {
        if (arg0 != 3) {
            field6769 = null;
        }
        field6769 = null;
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(IIIB)Z")
    public final boolean method2903(int arg0, int arg1, int arg2, byte arg3) {
        field6764++;
        if (arg0 < this.field6765 || this.field6762 < arg0) {
            return false;
        } else if (arg2 < this.field6768 || this.field6770 < arg2) {
            return false;
        } else if (arg1 >= this.field6774 && this.field6761 >= arg1) {
            int var5 = arg0 - this.field6773;
            if (arg3 != 4) {
                this.field6762 = 2;
            }
            int var6 = arg1 - this.field6772;
            return this.field6766 > var5 * var5 + (var6 * var6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tja", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field6773 = arg0;
        this.field6766 = arg3 * arg3;
        this.field6771 = arg1;
        this.field6772 = arg2;
        this.field6762 = this.field6773 + arg5;
        this.field6768 = this.field6771 + arg6;
        this.field6761 = this.field6772 + arg9;
        this.field6765 = this.field6773 + arg4;
        this.field6774 = this.field6772 + arg8;
        this.field6770 = this.field6771 + arg7;
    }

    @OriginalMember(owner = "client!tja", name = "a", descriptor = "(BI)V")
    public static final void method2904(byte arg0, int arg1) {
        field6767++;
        int var2 = 92 / ((arg0 + 6) / 56);
        if (class126.field1644 == null || arg1 > class126.field1644.length) {
            class126.field1644 = new int[arg1];
        }
    }
}

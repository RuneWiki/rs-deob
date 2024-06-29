import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class60 extends class25 {

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "F")
    public static float field819;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public int field813;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public int field814;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public int field820;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "Lgfa;")
    public class687 field817;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "[Lrc;")
    public class494[] field818;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)Z")
    public static final boolean method505(int arg0, int arg1, int arg2) {
        if (arg0 <= 116) {
            field819 = -0.62181115F;
        }
        field816++;
        return class280.method1700(-76, arg2, arg1) | (arg2 & 0x70000) != 0 || class578.method3166(arg2, arg1, 95);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIILoa;)Z")
    public final boolean method506(int arg0, int arg1, int arg2, class638 arg3) {
        field815++;
        if (arg0 != 0) {
            return false;
        }
        if (this.field818 != null) {
            for (int var5 = 0; var5 < this.field818.length; var5++) {
                if (this.field818[var5].method2766(arg1, arg2) && this.field817.method559(arg1, -8003, arg3, arg2)) {
                    return true;
                }
            }
        }
        return false;
    }
}

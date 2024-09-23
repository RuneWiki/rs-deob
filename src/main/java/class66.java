import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZJNSWWFY")
public class class66 extends class28 {

    @OriginalMember(owner = "ZJNSWWFY", name = "h", descriptor = "Z")
    private boolean field1683 = true;

    @OriginalMember(owner = "ZJNSWWFY", name = "j", descriptor = "I")
    public int field1685 = 1000;

    @OriginalMember(owner = "ZJNSWWFY", name = "k", descriptor = "Z")
    public static boolean field1686;

    @OriginalMember(owner = "ZJNSWWFY", name = "i", descriptor = "[LDZBHNAUV;")
    public class7[] field1684;

    @OriginalMember(owner = "ZJNSWWFY", name = "a", descriptor = "(IIIIIIIII)V")
    public void method181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class4 var10 = this.method187(true);
        if (var10 != null) {
            this.field1685 = var10.field1685;
            var10.method181(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "ZJNSWWFY", name = "a", descriptor = "(Z)LCSGBDGDY;")
    public class4 method187(boolean arg0) {
        if (!arg0) {
            this.field1683 = !this.field1683;
        }
        return null;
    }
}

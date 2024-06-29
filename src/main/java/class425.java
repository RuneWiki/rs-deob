import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class425 extends class88 {

    @OriginalMember(owner = "client!nq", name = "r", descriptor = "I")
    private int field5958 = 0;

    @OriginalMember(owner = "client!nq", name = "s", descriptor = "Lrg;")
    public static class596 field5959 = new class596(8, 16);

    @OriginalMember(owner = "client!nq", name = "t", descriptor = "I")
    public static int field5960;

    @OriginalMember(owner = "client!nq", name = "u", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!nq", name = "v", descriptor = "I")
    public static int field5962;

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)Lmk;")
    public static final class51 method2451(int arg0) {
        ++field5962;
        class51 var1 = (class51) class513.field7036.method2126(~arg0);
        if (var1 != null) {
            var1.method2340(-126);
            var1.method3301(arg0 + 72);
            return var1;
        } else if (arg0 != 0) {
            return null;
        } else {
            class51 var2;
            do {
                var2 = (class51) class564.field7622.method2126(-1);
                if (var2 == null) {
                    return null;
                }
                if (~var2.method403((byte) 45) < ~class577.method3295((byte) 15)) {
                    return null;
                }
                var2.method2340(arg0 ^ -123);
                var2.method3301(103);
            } while (~(var2.field8154 & Long.MIN_VALUE) == -1L);
            return var2;
        }
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lsea;Lob;)V")
    public class425(class648 arg0, class687 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)V")
    public static void method2452(byte arg0) {
        int var1 = -61 % ((23 - arg0) / 54);
        field5959 = null;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(III)Z")
    public static final boolean method2453(int arg0, int arg1, int arg2) {
        ++field5961;
        if (arg1 != 8) {
            return true;
        } else {
            return (arg2 & 32) != 0;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZZ)V")
    public final void method647(boolean arg0, boolean arg1) {
        ++field5960;
        int var3 = super.field1272.field3851.method3361((byte) -127, super.field1268.method1660(), class178.field2581) - -super.field1272.field3849;
        int var4 = super.field1272.field3850.method59(1, super.field1268.method1661(), class157.field2277) + super.field1272.field3857;
        if (arg1) {
            super.field1268.method3929((float) (var3 - -(super.field1268.method1660() / 2)), (float) (var4 - -(super.field1268.method1661() / 2)), 4096, this.field5958);
            this.field5958 += ((class687) super.field1272).field9805;
        }
    }
}

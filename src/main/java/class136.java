import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public abstract class class136 extends class164 {

    @OriginalMember(owner = "client!as", name = "w", descriptor = "I")
    public int field1730;

    @OriginalMember(owner = "client!as", name = "v", descriptor = "Lbe;")
    public class35 field1729;

    @OriginalMember(owner = "client!as", name = "u", descriptor = "Ljk;")
    public static class585 field1728 = new class585(67, 3);

    @OriginalMember(owner = "client!as", name = "x", descriptor = "I")
    public static int field1731 = 0;

    @OriginalMember(owner = "client!as", name = "t", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!as", name = "y", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(B)[Lhj;", line = 3)
    public static final class527[] method903(byte arg0) {
        int var1 = -10 % ((60 - arg0) / 46);
        field1727++;
        return new class527[] { class238.field3274, class238.field3276, class238.field3277, class238.field3278, class238.field3279, class238.field3280, class238.field3281, class238.field3282, class238.field3283, class238.field3284, class238.field3285, class238.field3286, class238.field3287, class238.field3288 };
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I[Ln;I)V", line = 21)
    public static final void method905(int arg0, class17[] arg1, int arg2) {
        field1732++;
        for (int var3 = arg0; var3 < arg1.length; var3++) {
            class17 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field379 == 0) {
                    if (var4.field429 != null) {
                        method905(0, var4.field429, arg2);
                    }
                    class21 var5 = (class21) class113.field1442.method3678((long) var4.field465, -123);
                    if (var5 != null) {
                        class534.method3137(arg2, var5.field540, 2);
                    }
                }
                if (arg2 == 0 && var4.field462 != null) {
                    class143 var6 = new class143();
                    var6.field1786 = var4.field462;
                    var6.field1789 = var4;
                    class545.method3204(var6);
                }
                if (arg2 == 1 && var4.field378 != null) {
                    if (var4.field485 >= 0) {
                        class17 var7 = class400.method2420((byte) -105, var4.field465);
                        if (var7 == null || var7.field429 == null || var4.field485 >= var7.field429.length || var7.field429[var4.field485] != var4) {
                            continue;
                        }
                    }
                    class143 var8 = new class143();
                    var8.field1786 = var4.field378;
                    var8.field1789 = var4;
                    class545.method3204(var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!as", name = "f", descriptor = "(I)V", line = 92)
    public static void method907(int arg0) {
        field1728 = null;
        if (arg0 != 0) {
            method905(-76, null, 115);
        }
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lbe;I)V", line = 102)
    public class136(class35 arg0, int arg1) {
        this.field1730 = arg1;
        this.field1729 = arg0;
    }

    @OriginalMember(owner = "client!as", name = "d", descriptor = "(B)Z")
    public abstract boolean method904(byte arg0);

    @OriginalMember(owner = "client!as", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method906(int arg0);
}

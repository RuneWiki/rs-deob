import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public abstract class class698 extends class381 {

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field9829;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    public static final void method3920(int arg0) {
        field9829++;
        for (class285 var1 = (class285) class556.field8164.method1904(false); var1 != null; var1 = (class285) class556.field8164.method1901(102)) {
            if (var1.field3797 == -1) {
                var1.field3795 = 0;
                if (var1.field3808 >= 0 && var1.field3802 >= 0 && class72.field1144 > var1.field3808 && var1.field3802 < class668.field9444) {
                    class588.method3356(var1, 5);
                }
            } else {
                var1.method2360((byte) 66);
            }
        }
        if (arg0 == 0) {
            ;
        }
    }
}

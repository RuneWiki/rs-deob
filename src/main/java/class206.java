import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class206 extends class329 {

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "Lac;")
    public class307 field2618;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "Z")
    public static boolean field2617 = true;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)V", line = 4)
    public static final void method1243(int arg0, int arg1) {
        field2619++;
        if (!class525.method2860((byte) 111, arg1)) {
            return;
        }
        class507[] var2 = class103.field1390[arg1];
        if (arg0 >= -87) {
            method1243(-9, 6);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class507 var4 = var2[var3];
            if (var4 != null) {
                var4.field6742 = 0;
                var4.field6820 = 1;
                var4.field6717 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lac;)V", line = 43)
    public class206(class307 arg0) {
        this.field2618 = arg0;
    }
}

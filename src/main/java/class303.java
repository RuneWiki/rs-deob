import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class303 {

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIII)V")
    public static final void method1941(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class75.field1161; var5++) {
            Rectangle var6 = class60.field840[var5];
            if (arg2 < var6.x + var6.width && (arg2 + arg4) > var6.x && arg0 < (var6.y + var6.height) && (arg0 + arg1) > var6.y) {
                class296.field4100[var5] = true;
            }
        }
        field4177++;
        if (arg3 == 1372) {
            ;
        }
    }
}

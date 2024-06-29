import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class468 extends class416 {

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field6947;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    public static int field6950;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field6951;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "Lpn;")
    public class692 field6949;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "[Lb;")
    public class306[] field6948;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIILr;)Z", line = 3)
    public final boolean method2908(int arg0, int arg1, int arg2, class167 arg3) {
        if (arg0 != 0) {
            return false;
        }
        field6947++;
        if (this.field6948 != null) {
            for (int var5 = 0; var5 < this.field6948.length; var5++) {
                if (this.field6948[var5].method2120(arg2, arg1) && this.field6949.method392(false, arg1, arg3, arg2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZIII)V", line = 29)
    public static final void method2909(boolean arg0, int arg1, int arg2, int arg3) {
        field6951++;
        class413 var4 = class674.method3852(11, arg1, 127);
        var4.method2633(16777215);
        var4.field6337 = arg3;
        var4.field6333 = arg2;
        if (arg0) {
            method2909(false, -125, -119, -5);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)Z", line = 45)
    public static final boolean method2910(int arg0, int arg1, int arg2, int arg3) {
        field6950++;
        class694.field9727.method502(arg0, arg2, arg1, class110.field1769);
        int var4 = class110.field1769[2];
        if (var4 < 50) {
            return false;
        } else {
            class110.field1769[0] = class110.field1769[0] * class527.field7692 / var4 + class651.field9125;
            class110.field1769[1] = class110.field1769[1] * class443.field6735 / var4 + class220.field3584;
            class110.field1769[arg3] = var4;
            return true;
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class307 extends class57 {

    @OriginalMember(owner = "client!b", name = "W", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!b", name = "X", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!b", name = "Y", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(II)[[I")
    public final int[][] method442(int arg0, int arg1) {
        ++field4546;
        int[][] var3 = super.field8320.method1504(arg1, -2);
        if (super.field8320.field3295 && this.method673(true)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field1321 * super.field1321;
            for (int var8 = 0; var8 < class540.field7555; ++var8) {
                int var9 = super.field1323[var7 - -(var8 % super.field1324)];
                var6[var8] = class481.method2919(255, var9) << 4;
                var5[var8] = class481.method2919(var9, 65280) >> 4;
                var4[var8] = class481.method2919(var9 >> 12, 4080);
            }
        }
        if (arg0 > -116) {
            field4544 = 3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lha;III[Z)Z")
    public static final boolean method2011(class54 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class697.field9813 != class485.field6947) {
            int var6 = class185.field2987[arg1].method552(1, arg2, arg3);
            for (int var7 = 0; var7 <= arg1; ++var7) {
                class37 var8 = class185.field2987[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method552(1, arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method538(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method537(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }
}

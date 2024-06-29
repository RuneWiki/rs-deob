import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class219 {

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIII)V")
    public static final void method1534(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3763++;
        if (arg0 != -13210) {
            method1534(114, -47, 77, -108, 87);
        }
        class100 var5 = (class100) class166.field2750.method992((byte) 125, (long) arg3);
        if (var5 == null) {
            var5 = new class100();
            class166.field2750.method986(var5, (long) arg3, arg0 + 13209);
        }
        if (arg2 >= var5.field1552.length) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var8 < var5.field1552.length; var8++) {
                var6[var8] = var5.field1552[var8];
                var7[var8] = var5.field1553[var8];
            }
            for (int var9 = var5.field1552.length; var9 < arg2; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field1552 = var6;
            var5.field1553 = var7;
        }
        var5.field1552[arg2] = arg4;
        var5.field1553[arg2] = arg1;
    }
}

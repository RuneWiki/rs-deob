import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class384 {

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "Lbn;")
    public static class160 field5623 = new class160(53, 8);

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)V", line = 4)
    public static void method2426(boolean arg0) {
        if (!arg0) {
            field5623 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIIII)V", line = 23)
    public static final void method2427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 < 58) {
            return;
        }
        class99[] var7 = class331.field4910;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class99 var9 = var7[var8];
            if (var9 != null && var9.field1223 == 2) {
                class189.method1289(arg0, 0, (var9.field1221 - class134.field1846 << 7) + var9.field1219, (-class28.field399 + var9.field1225 << 7) + var9.field1226, var9.field1228 * 2, var9.field1234, arg4, arg2 >> 1, arg6 >> 1);
                if (class18.field296[0] > -1 && class388.field5665 % 20 < 10) {
                    class369.field5353[var9.field1231].method1915(class18.field296[0] + arg1 - 12, arg5 + -28 - -class18.field296[1]);
                }
            }
        }
        field5621++;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lct;II)Lhi;", line = 58)
    public static final class365 method2428(class104 arg0, int arg1, int arg2) {
        field5622++;
        byte[] var3 = arg0.method733(0, arg2);
        int var4 = -119 % ((-arg1 - 24) / 49);
        return var3 == null ? null : new class365(var3);
    }
}

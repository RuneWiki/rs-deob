import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class226 extends class382 {

    @OriginalMember(owner = "client!cs", name = "E", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!cs", name = "P", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!cs", name = "Q", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!cs", name = "S", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!cs", name = "R", descriptor = "[Ll;")
    public static class16[] field3305;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(BI)[[I", line = 7)
    public final int[][] method272(byte arg0, int arg1) {
        ++field3303;
        int[][] var3 = super.field1952.method3127((byte) 94, arg1);
        if (super.field1952.field7770 && this.method2331(-1121128860)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field5630 * super.field5630;
            for (int var8 = 0; class467.field6889 > var8; ++var8) {
                int var9 = super.field5632[var8 % super.field5622 + var7];
                var6[var8] = class345.method2089(var9 << 4, 4080);
                var5[var8] = class345.method2089(var9, 65280) >> 4;
                var4[var8] = class345.method2089(var9 >> 12, 4080);
            }
        }
        if (arg0 < 33) {
            field3304 = -102;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "(Z)V", line = 53)
    public static void method1532(boolean arg0) {
        field3305 = null;
        if (!arg0) {
            method1533(89, -13, 30, 99, -18, 64, -91, 8, -57, -49);
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIIIIIII)V", line = 64)
    public static final void method1533(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field3306;
        if (class518.method3081(-98, arg3)) {
            if (arg4 != 29474) {
                field3304 = -20;
            }
            if (class335.field4671[arg3] == null) {
                client.method1381(class123.field1803[arg3], -1, arg0, arg5, arg2, arg7, arg6, arg1, arg9, arg8);
            } else {
                client.method1381(class335.field4671[arg3], -1, arg0, arg5, arg2, arg7, arg6, arg1, arg9, arg8);
            }
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class386 extends class346 {

    @OriginalMember(owner = "client!oc", name = "bb", descriptor = "Lo;")
    public static class332 field5699 = new class332("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!oc", name = "cb", descriptor = "[I")
    public static int[] field5700 = new int[32];

    @OriginalMember(owner = "client!oc", name = "db", descriptor = "[Lun;")
    public static class110[] field5701 = new class110[14];

    @OriginalMember(owner = "client!oc", name = "fb", descriptor = "S")
    public static short field5703 = 256;

    @OriginalMember(owner = "client!oc", name = "eb", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!oc", name = "gb", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)[[I", line = 9)
    public final int[][] method212(int arg0, int arg1) {
        ++field5704;
        int[][] var3 = super.field6468.method1090(-2, arg1);
        if (arg0 != 0) {
            method2339(-32);
        }
        if (super.field6468.field2227 && this.method2132(arg0 ^ 85)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field5271 * super.field5271;
            for (int var8 = 0; var8 < class156.field2169; ++var8) {
                int var9 = super.field5276[var8 % super.field5273 + var7];
                var6[var8] = class412.method2463(var9 << 4, 4080);
                var5[var8] = class412.method2463(var9, 65280) >> 4;
                var4[var8] = class412.method2463(var9 >> 12, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "(I)V", line = 68)
    public static void method2339(int arg0) {
        field5701 = null;
        if (arg0 > 3) {
            field5700 = null;
            field5699 = null;
        }
    }
}

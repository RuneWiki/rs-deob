import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class128 extends class143 {

    @OriginalMember(owner = "client!mh", name = "lb", descriptor = "I")
    public static int field2277 = 0;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!mh", name = "kb", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!mh", name = "mb", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!mh", name = "nb", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!mh", name = "ob", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!mh", name = "pb", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!mh", name = "qb", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZI)I", line = 13)
    public static final int method929(boolean arg0, int arg1) {
        if (arg0) {
            field2277 = -108;
        }
        field2280++;
        return arg1 == 16711935 ? -1 : class135.method964(arg1, 217);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BI)[[I", line = 31)
    public final int[][] method286(byte arg0, int arg1) {
        if (arg0 <= 34) {
            field2277 = -57;
        }
        int[][] var3 = this.field4095.method1797(arg1, -111);
        if (this.field4095.field4355 && this.method1020(-1)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int var7 = arg1 % this.field2514 * this.field2514;
            for (int var8 = 0; var8 < class169.field2936; var8++) {
                int var9 = this.field2508[var7 + (var8 % this.field2506)];
                var5[var8] = class224.method1614(var9 << 4, 4080);
                var6[var8] = class224.method1614(4080, var9 >> 4);
                var4[var8] = class224.method1614(var9 >> 12, 4080);
            }
        }
        field2275++;
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([BB)Lqg;", line = 89)
    public static final class231 method930(byte[] arg0, byte arg1) {
        if (arg1 != -103) {
            method931(87, -70, -19, -38, -92);
        }
        field2279++;
        if (arg0 == null) {
            return null;
        } else {
            class231 var2 = new class231(arg0, class234.field3959, class251.field4365, class223.field3811, class310.field5263, class58.field969);
            class251.method1803(-1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIII)V", line = 116)
    public static final void method931(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class299 var5 = class158.method1135(arg1, -103, 10);
        if (arg2 > -26) {
            field2277 = 9;
        }
        var5.method2091(55);
        var5.field5152 = arg4;
        field2278++;
        var5.field5157 = arg3;
        var5.field5153 = arg0;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(JI)V", line = 137)
    public static final void method932(long arg0, int arg1) {
        if (arg1 != 381662980) {
            method931(-127, 5, -109, 72, 84);
        }
        class17.field353.field281 = 0;
        field2276++;
        class17.field353.method130(-1, 216);
        class17.field353.method161((byte) -107, arg0);
        class99.field1792 = 1;
        class261.field4486 = 0;
        class269.field4649 = 0;
        class138.field2456 = -3;
    }
}

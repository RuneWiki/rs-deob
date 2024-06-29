import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class249 extends class45 {

    @OriginalMember(owner = "client!vg", name = "eb", descriptor = "I")
    public static int field4191 = 0;

    @OriginalMember(owner = "client!vg", name = "db", descriptor = "Li;")
    public static class203 field4190 = new class203(64);

    @OriginalMember(owner = "client!vg", name = "gb", descriptor = "[Lwa;")
    public static class75[] field4193 = new class75[1000];

    @OriginalMember(owner = "client!vg", name = "kb", descriptor = "Lwa;")
    public static class75 field4197 = class66.method560(" ", false);

    @OriginalMember(owner = "client!vg", name = "jb", descriptor = "[S")
    public static short[] field4196 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!vg", name = "bb", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!vg", name = "cb", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!vg", name = "hb", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!vg", name = "ib", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!vg", name = "fb", descriptor = "Lcb;")
    public static class267 field4192;

    @OriginalMember(owner = "client!vg", name = "mb", descriptor = "Lcb;")
    public static class267 field4199;

    @OriginalMember(owner = "client!vg", name = "lb", descriptor = "[[Lre;")
    public static class262[][] field4198;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)[[I", line = 7)
    public final int[][] method66(int arg0, int arg1) {
        field4194++;
        int var3 = 48 % ((76 - arg1) / 42);
        int[][] var4 = this.field882.method874(false, arg0);
        if (this.field882.field1935 && this.method302((byte) -99)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = arg0 % this.field735 * this.field735;
            for (int var9 = 0; var9 < class269.field4644; var9++) {
                int var10 = this.field731[var9 % this.field729 + var8];
                var7[var9] = class235.method1710(var10 << 4, 4080);
                var6[var9] = class235.method1710(4080, var10 >> 4);
                var5[var9] = class235.method1710(var10, 16711680) >> 12;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BLcb;Lcb;)V", line = 53)
    public static final void method1795(byte arg0, class267 arg1, class267 arg2) {
        class155.field2657 = arg1;
        if (arg0 != -61) {
            method1796(-113);
        }
        field4189++;
        class132.field2282 = arg2;
    }

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "(I)V", line = 88)
    public static void method1796(int arg0) {
        int var1 = -89 % ((arg0 - 31) / 57);
        field4196 = null;
        field4199 = null;
        field4190 = null;
        field4192 = null;
        field4193 = null;
        field4198 = (class262[][]) null;
        field4197 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIBI)I", line = 120)
    public static final int method1797(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg1 / arg0;
        int var5 = arg0 - 1 & arg1;
        field4188++;
        int var6 = arg3 / arg0;
        if (arg2 >= -21) {
            return 100;
        }
        int var7 = arg0 - 1 & arg3;
        int var8 = class55.method398(true, var6, var4);
        int var9 = class55.method398(true, var6, var4 + 1);
        int var10 = class55.method398(true, var6 + 1, var4);
        int var11 = class55.method398(true, var6 + 1, var4 - -1);
        int var12 = class283.method2005(16, var8, var5, arg0, var9);
        int var13 = class283.method2005(16, var10, var5, arg0, var11);
        return class283.method2005(16, var12, var7, arg0, var13);
    }
}

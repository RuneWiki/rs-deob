import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class261 extends class329 {

    @OriginalMember(owner = "client!f", name = "M", descriptor = "I")
    public static int field3947 = 127;

    @OriginalMember(owner = "client!f", name = "I", descriptor = "[S")
    public static short[] field3946 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!f", name = "gb", descriptor = "I")
    public static int field3953 = 0;

    @OriginalMember(owner = "client!f", name = "fb", descriptor = "I")
    public static int field3952 = 500;

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!f", name = "cb", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!f", name = "hb", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!f", name = "ib", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!f", name = "db", descriptor = "Llc;")
    public static class175 field3950;

    @OriginalMember(owner = "client!f", name = "eb", descriptor = "Llc;")
    public static class175 field3951;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(II)V", line = 13)
    public static final void method1878(int arg0, int arg1) {
        field3954++;
        class310.field4794--;
        if (class310.field4794 == arg1) {
            return;
        }
        class86.method508(class221.field3124, arg1 + 1, class221.field3124, arg1, class310.field4794 - arg1);
        class86.method508(class148.field2061, arg1 + 1, class148.field2061, arg1, class310.field4794 - arg1);
        class86.method513(class76.field968, arg0 + arg1, class76.field968, arg1, class310.field4794 - arg1);
        class86.method506(class30.field371, arg1 + 1, class30.field371, arg1, class310.field4794 - arg1);
        class86.method507(class223.field3149, arg1 + 1, class223.field3149, arg1, class310.field4794 - arg1);
        class86.method513(class168.field2332, arg1 + 1, class168.field2332, arg1, class310.field4794 - arg1);
        class86.method513(class121.field1702, arg1 + 1, class121.field1702, arg1, class310.field4794 - arg1);
    }

    @OriginalMember(owner = "client!f", name = "j", descriptor = "(I)V", line = 36)
    public static void method1879(int arg0) {
        field3950 = null;
        field3951 = null;
        field3946 = null;
        if (arg0 != 65280) {
            method1878(-68, -104);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)[[I", line = 51)
    public final int[][] method102(int arg0, int arg1) {
        if (arg1 != 5110) {
            return (int[][]) ((int[][]) null);
        }
        field3949++;
        int[][] var3 = this.field1755.method875(111, arg0);
        if (this.field1755.field1815 && this.method2274(65280)) {
            int[] var4 = var3[2];
            int var5 = arg0 % this.field5018 * this.field5018;
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            for (int var8 = 0; var8 < class10.field141; var8++) {
                int var9 = this.field5032[var8 % this.field5034 + var5];
                var4[var8] = class229.method1613(255, var9) << 4;
                var7[var8] = class229.method1613(65280, var9) >> 4;
                var6[var8] = class229.method1613(16711680, var9) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(IB)I", line = 104)
    public static final int method1880(int arg0, byte arg1) {
        if (arg1 != 34) {
            field3947 = -63;
        }
        field3948++;
        return arg0 >>> 8;
    }
}

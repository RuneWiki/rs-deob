import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class338 extends class96 {

    @OriginalMember(owner = "client!al", name = "W", descriptor = "[I")
    public static int[] field5217 = new int[128];

    @OriginalMember(owner = "client!al", name = "cb", descriptor = "Ljava/lang/String;")
    public static String field5223 = "wave2:";

    @OriginalMember(owner = "client!al", name = "gb", descriptor = "I")
    public static int field5227 = -1;

    @OriginalMember(owner = "client!al", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field5221 = "shake:";

    @OriginalMember(owner = "client!al", name = "P", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!al", name = "Y", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!al", name = "db", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!al", name = "eb", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!al", name = "fb", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!al", name = "X", descriptor = "[I")
    public static int[] field5218;

    @OriginalMember(owner = "client!al", name = "Z", descriptor = "[Leg;")
    public static class317[] field5220;

    @OriginalMember(owner = "client!al", name = "bb", descriptor = "[[B")
    public static byte[][] field5222;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIIB)V", line = 4)
    public static final void method2349(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        class117.field1894 = arg4;
        class332.field5185 = arg0;
        class124.field2006 = arg1;
        class331.field5160 = arg3;
        if (arg5 != 75) {
            field5220 = (class317[]) null;
        }
        class77.field1213 = arg2;
        field5226++;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)[[I", line = 29)
    public final int[][] method172(int arg0, byte arg1) {
        if (arg1 != 63) {
            return (int[][]) ((int[][]) null);
        }
        field5225++;
        int[][] var3 = this.field4767.method1141(-1677, arg0);
        if (this.field4767.field2480 && this.method780(-9757)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % this.field1542 * this.field1542;
            for (int var8 = 0; var8 < class31.field491; var8++) {
                int var9 = this.field1543[var7 + (var8 % this.field1549)];
                var6[var8] = class164.method1234(255, var9) << 4;
                var5[var8] = class164.method1234(var9 >> 4, 4080);
                var4[var8] = class164.method1234(16711680, var9) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!al", name = "h", descriptor = "(I)V", line = 88)
    public static void method2350(int arg0) {
        if (arg0 != 1) {
            method2350(-16);
        }
        field5222 = (byte[][]) null;
        field5223 = null;
        field5218 = null;
        field5220 = null;
        field5217 = null;
        field5221 = null;
    }
}

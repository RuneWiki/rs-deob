import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class143 extends class4 {

    @OriginalMember(owner = "client!ma", name = "cb", descriptor = "I")
    public static int field2043 = 0;

    @OriginalMember(owner = "client!ma", name = "bb", descriptor = "I")
    public static int field2042 = 0;

    @OriginalMember(owner = "client!ma", name = "fb", descriptor = "[I")
    public static int[] field2046 = new int[200];

    @OriginalMember(owner = "client!ma", name = "jb", descriptor = "I")
    public static int field2050 = -2;

    @OriginalMember(owner = "client!ma", name = "hb", descriptor = "Z")
    public static boolean field2048 = false;

    @OriginalMember(owner = "client!ma", name = "gb", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!ma", name = "ib", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!ma", name = "eb", descriptor = "[I")
    public static int[] field2045;

    @OriginalMember(owner = "client!ma", name = "db", descriptor = "[[[B")
    public static byte[][][] field2044;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "(B)V")
    public static void method924(byte arg0) {
        field2044 = null;
        if (arg0 > -120) {
            method924((byte) -111);
        }
        field2045 = null;
        field2046 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)[[I")
    public final int[][] method8(byte arg0, int arg1) {
        if (arg0 != 5) {
            field2048 = true;
        }
        int[][] var3 = super.field2053.method1542(127, arg1);
        if (super.field2053.field3408 && this.method24(true)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field49 * super.field49;
            for (int var8 = 0; class104.field1411 > var8; ++var8) {
                int var9 = super.field51[var7 - -(var8 % super.field45)];
                var6[var8] = class5.method26(255, var9) << 4;
                var5[var8] = class5.method26(var9, 65280) >> 4;
                var4[var8] = class5.method26(4080, var9 >> 12);
            }
        }
        ++field2047;
        return var3;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILbc;)V")
    public static final void method925(int arg0, class282 arg1) {
        ++field2049;
        if (arg0 != -13466) {
            field2045 = null;
        }
    }
}

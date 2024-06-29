import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class644 extends class372 {

    @OriginalMember(owner = "client!haa", name = "W", descriptor = "[[I")
    public int[][] field9116 = new int[32][512];

    @OriginalMember(owner = "client!haa", name = "X", descriptor = "[[I")
    public int[][] field9117 = new int[2200][64];

    @OriginalMember(owner = "client!haa", name = "Z", descriptor = "[I")
    public int[] field9119 = new int[12];

    @OriginalMember(owner = "client!haa", name = "bb", descriptor = "[I")
    public int[] field9121 = new int[class115.field1443];

    @OriginalMember(owner = "client!haa", name = "ab", descriptor = "[[I")
    public int[][] field9120 = new int[12][class115.field1446 + 8191];

    @OriginalMember(owner = "client!haa", name = "cb", descriptor = "[I")
    public int[] field9122 = new int[2200];

    @OriginalMember(owner = "client!haa", name = "nb", descriptor = "[I")
    public int[] field9133 = new int[class115.field1446 + 8191];

    @OriginalMember(owner = "client!haa", name = "gb", descriptor = "[I")
    public int[] field9126 = new int[class115.field1446 + 8191];

    @OriginalMember(owner = "client!haa", name = "ob", descriptor = "[I")
    public int[] field9134 = new int[32];

    @OriginalMember(owner = "client!haa", name = "fb", descriptor = "[I")
    public int[] field9125 = new int[12];

    @OriginalMember(owner = "client!haa", name = "eb", descriptor = "Lce;")
    public class295 field9124;

    @OriginalMember(owner = "client!haa", name = "db", descriptor = "Ljj;")
    public static class398 field9123 = new class398(22, 2);

    @OriginalMember(owner = "client!haa", name = "jb", descriptor = "I")
    public static int field9129 = -1;

    @OriginalMember(owner = "client!haa", name = "mb", descriptor = "[Ljava/awt/Color;")
    public static Color[] field9132 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!haa", name = "Y", descriptor = "I")
    public static int field9118;

    @OriginalMember(owner = "client!haa", name = "hb", descriptor = "I")
    public static int field9127;

    @OriginalMember(owner = "client!haa", name = "kb", descriptor = "I")
    public static int field9130;

    @OriginalMember(owner = "client!haa", name = "lb", descriptor = "I")
    public static int field9131;

    @OriginalMember(owner = "client!haa", name = "ib", descriptor = "[[[Laf;")
    public static class651[][][] field9128;

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lkb;)V")
    public class644(class633 arg0) {
        super(arg0);
        this.field9124 = new class295(arg0);
        super.field5353 = new class591(super.field5334);
        super.field5354 = new class591(super.field5334);
        super.field5346 = new class591(super.field5334);
        super.field5375 = new class591(super.field5334);
        super.field5361 = new class591(super.field5334);
        super.field5362 = new class591(super.field5334);
        super.field5363 = new class591(super.field5334);
        super.field5356 = new class591(super.field5334);
        super.field5369 = new class591(super.field5334);
        super.field5348 = new class591(super.field5334);
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(I)V")
    public static void method3583(int arg0) {
        field9132 = null;
        field9123 = null;
        field9128 = null;
        if (arg0 != 512) {
            field9129 = -41;
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(II[BB)[B")
    public static final byte[] method3584(int arg0, int arg1, byte[] arg2, byte arg3) {
        int var4 = -3 % ((arg3 - 60) / 49);
        ++field9118;
        byte[] var5 = new byte[arg0];
        class657.method3639(arg2, arg1, var5, 0, arg0);
        return var5;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(BII)Z")
    public static final boolean method3585(byte arg0, int arg1, int arg2) {
        if (arg0 < 94) {
            method3586(-118, -43);
        }
        ++field9127;
        return ~(arg1 & 540800) != -1;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)V")
    public final void method2276(int arg0) {
        if (arg0 >= -106) {
            field9123 = null;
        }
        ++field9131;
        this.field9124 = new class295(super.field5334);
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(II)I")
    public static final int method3586(int arg0, int arg1) {
        int var2 = ((-1431655765 & arg1) >>> 1) + (arg1 & 1431655765);
        ++field9130;
        int var3 = ((arg0 & var2) >>> 2) + (858993459 & var2);
        int var4 = (var3 >>> 4) + var3 & 252645135;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 255;
    }
}

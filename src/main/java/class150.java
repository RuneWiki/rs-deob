import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class150 {

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    private int field2117 = 0;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    private int field2122 = -1;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "Ldc;")
    private class302 field2119 = new class302();

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "Z")
    public boolean field2131 = false;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    private int field2116;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
    private int field2128;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "[Lri;")
    private class412[] field2125;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "[[[I")
    private int[][][] field2121;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "[I")
    public static int[] field2118;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)[[I")
    public final int[][] method1068(int arg0, int arg1) {
        field2123++;
        if (arg0 != 0) {
            return null;
        } else if (this.field2128 == this.field2116) {
            this.field2131 = this.field2125[arg1] == null;
            this.field2125[arg1] = class466.field6717;
            return this.field2121[arg1];
        } else if (this.field2128 == 1) {
            this.field2131 = this.field2122 != arg1;
            this.field2122 = arg1;
            return this.field2121[0];
        } else {
            class412 var3 = this.field2125[arg1];
            if (var3 == null) {
                this.field2131 = true;
                if (this.field2128 <= this.field2117) {
                    class412 var4 = (class412) this.field2119.method1906((byte) 111);
                    var3 = new class412(arg1, var4.field6117);
                    this.field2125[var4.field6115] = null;
                    var4.method2360((byte) 66);
                } else {
                    var3 = new class412(arg1, this.field2117);
                    this.field2117++;
                }
                this.field2125[arg1] = var3;
            } else {
                this.field2131 = false;
            }
            this.field2119.method1908(0, var3);
            return this.field2121[var3.field6117];
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IB)V")
    public static final void method1069(int arg0, byte arg1) {
        class425.field6217 = -1;
        class19.field375 = arg0;
        field2127++;
        class425.field6217 = -1;
        class103.method734((byte) 79);
        if (arg1 != 94) {
            field2129 = 123;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
    public final void method1070(int arg0) {
        int var2 = -76 / ((-arg0 - 62) / 58);
        field2124++;
        for (int var3 = 0; var3 < this.field2128; var3++) {
            this.field2121[var3][0] = null;
            this.field2121[var3][1] = null;
            this.field2121[var3][2] = null;
            this.field2121[var3] = null;
        }
        this.field2125 = null;
        this.field2121 = null;
        this.field2119.method1905(0);
        this.field2119 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lmv;I)V")
    public static final void method1071(class295 arg0, int arg1) {
        class48.field757 = arg0;
        int var2 = 73 % (-arg1 / 44);
        field2130++;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V")
    public static void method1072(int arg0) {
        int var1 = -120 / ((-arg0 - 31) / 35);
        field2118 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)[[[I")
    public final int[][][] method1073(byte arg0) {
        field2126++;
        if (this.field2128 != this.field2116) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 72 % ((-arg0 - 10) / 61);
        for (int var3 = 0; var3 < this.field2128; var3++) {
            this.field2125[var3] = class466.field6717;
        }
        return this.field2121;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(III)V")
    public class150(int arg0, int arg1, int arg2) {
        this.field2116 = arg1;
        this.field2128 = arg0;
        this.field2125 = new class412[this.field2116];
        this.field2121 = new int[this.field2128][3][arg2];
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class166 {

    @OriginalMember(owner = "client!efa", name = "e", descriptor = "I")
    private int field2030 = -1;

    @OriginalMember(owner = "client!efa", name = "j", descriptor = "I")
    private int field2035 = 0;

    @OriginalMember(owner = "client!efa", name = "d", descriptor = "Loe;")
    private class183 field2029 = new class183();

    @OriginalMember(owner = "client!efa", name = "p", descriptor = "Z")
    public boolean field2041 = false;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "I")
    private int field2026;

    @OriginalMember(owner = "client!efa", name = "f", descriptor = "I")
    private int field2031;

    @OriginalMember(owner = "client!efa", name = "n", descriptor = "[Lada;")
    private class147[] field2039;

    @OriginalMember(owner = "client!efa", name = "h", descriptor = "[[[I")
    private int[][][] field2033;

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!efa", name = "i", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!efa", name = "k", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!efa", name = "l", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!efa", name = "m", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!efa", name = "o", descriptor = "Ljn;")
    public static class668 field2040;

    @OriginalMember(owner = "client!efa", name = "g", descriptor = "Z")
    public static boolean field2032;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(B[S)[S", line = 3)
    public static final short[] method1049(byte arg0, short[] arg1) {
        field2027++;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class252.method1543(arg1, 0, var2, 0, arg1.length);
            int var3 = 77 % ((arg0 - 45) / 47);
            return var2;
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(BII)Z", line = 22)
    public static final boolean method1050(byte arg0, int arg1, int arg2) {
        field2038++;
        if (arg0 != -29) {
            field2040 = null;
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(ZI)V", line = 36)
    public static final void method1051(boolean arg0, int arg1) {
        class100.field1341 = arg1;
        field2037++;
        class472 var2 = class277.field3783;
        synchronized (class277.field3783) {
            class277.field3783.method2776(arg0);
        }
        class472 var3 = class230.field2993;
        synchronized (class230.field2993) {
            class230.field2993.method2776(arg0);
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)[[[I", line = 54)
    public final int[][][] method1052(int arg0) {
        field2034++;
        if (this.field2031 != this.field2026) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        int var3 = -114 / ((arg0 + 57) / 33);
        while (this.field2031 > var2) {
            this.field2039[var2] = class443.field6315;
            var2++;
        }
        return this.field2033;
    }

    @OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(III)V", line = 200)
    public class166(int arg0, int arg1, int arg2) {
        this.field2026 = arg1;
        this.field2031 = arg0;
        this.field2039 = new class147[this.field2026];
        this.field2033 = new int[this.field2031][3][arg2];
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(B)V", line = 80)
    public final void method1053(byte arg0) {
        for (int var2 = 0; var2 < this.field2031; var2++) {
            this.field2033[var2][0] = null;
            this.field2033[var2][1] = null;
            this.field2033[var2][2] = null;
            this.field2033[var2] = null;
        }
        if (arg0 != 30) {
            method1051(true, 62);
        }
        field2028++;
        this.field2039 = null;
        this.field2033 = null;
        this.field2029.method1131((byte) -93);
        this.field2029 = null;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(II)[[I", line = 106)
    public final int[][] method1054(int arg0, int arg1) {
        field2036++;
        if (arg1 != 16257) {
            this.field2030 = 119;
        }
        if (this.field2031 == this.field2026) {
            this.field2041 = this.field2039[arg0] == null;
            this.field2039[arg0] = class443.field6315;
            return this.field2033[arg0];
        } else if (this.field2031 == 1) {
            this.field2041 = this.field2030 != arg0;
            this.field2030 = arg0;
            return this.field2033[0];
        } else {
            class147 var3 = this.field2039[arg0];
            if (var3 == null) {
                this.field2041 = true;
                if (this.field2031 <= this.field2035) {
                    class147 var4 = (class147) this.field2029.method1140(arg1 + 245887);
                    var3 = new class147(arg0, var4.field1797);
                    this.field2039[var4.field1795] = null;
                    var4.method3045(true);
                } else {
                    var3 = new class147(arg0, this.field2035);
                    this.field2035++;
                }
                this.field2039[arg0] = var3;
            } else {
                this.field2041 = false;
            }
            this.field2029.method1133(var3, -127);
            return this.field2033[var3.field1797];
        }
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(Z)V", line = 179)
    public static void method1055(boolean arg0) {
        field2040 = null;
        if (arg0) {
            method1049((byte) 78, null);
        }
    }
}

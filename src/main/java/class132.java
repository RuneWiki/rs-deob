import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class132 {

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    private int field1803 = 0;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
    private int field1808 = -1;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "Lan;")
    private class337 field1805 = new class337();

    @OriginalMember(owner = "client!jn", name = "p", descriptor = "Z")
    public boolean field1815 = false;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    private int field1801;

    @OriginalMember(owner = "client!jn", name = "o", descriptor = "[Lle;")
    private class259[] field1814;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "I")
    private int field1810;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "[[[I")
    private int[][][] field1800;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "Lp;")
    public static class107 field1806 = new class107(new byte[5000]);

    @OriginalMember(owner = "client!jn", name = "n", descriptor = "[I")
    public static int[] field1813 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "Lan;")
    public static class337 field1809 = new class337();

    @OriginalMember(owner = "client!jn", name = "r", descriptor = "I")
    public static int field1817 = 0;

    @OriginalMember(owner = "client!jn", name = "s", descriptor = "I")
    public static int field1818 = 0;

    @OriginalMember(owner = "client!jn", name = "q", descriptor = "[I")
    public static int[] field1816 = new int[200];

    @OriginalMember(owner = "client!jn", name = "t", descriptor = "Z")
    public static boolean field1819 = false;

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "F")
    public static float field1811;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)[[I", line = 7)
    public final int[][] method875(int arg0, int arg1) {
        if (arg0 <= 31) {
            return (int[][]) ((int[][]) null);
        }
        field1804++;
        if (this.field1810 == this.field1801) {
            this.field1815 = this.field1814[arg1] == null;
            this.field1814[arg1] = class163.field2256;
            return this.field1800[arg1];
        } else if (this.field1810 == 1) {
            this.field1815 = this.field1808 != arg1;
            this.field1808 = arg1;
            return this.field1800[0];
        } else {
            class259 var3 = this.field1814[arg1];
            if (var3 == null) {
                this.field1815 = true;
                if (this.field1803 < this.field1810) {
                    var3 = new class259(arg1, this.field1803);
                    this.field1803++;
                } else {
                    class259 var4 = (class259) this.field1805.method2328(0);
                    var3 = new class259(arg1, var4.field3935);
                    this.field1814[var4.field3932] = null;
                    var4.method2285(true);
                }
                this.field1814[arg1] = var3;
            } else {
                this.field1815 = false;
            }
            this.field1805.method2330(var3, (byte) -19);
            return this.field1800[var3.field3935];
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)[[[I", line = 74)
    public final int[][][] method876(boolean arg0) {
        field1807++;
        if (this.field1810 != this.field1801) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field1810; var2++) {
            this.field1814[var2] = class163.field2256;
        }
        if (!arg0) {
            this.method877((byte) 80);
        }
        return this.field1800;
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(III)V", line = 218)
    public class132(int arg0, int arg1, int arg2) {
        this.field1801 = arg1;
        this.field1814 = new class259[this.field1801];
        this.field1810 = arg0;
        this.field1800 = new int[this.field1810][3][arg2];
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V", line = 118)
    public final void method877(byte arg0) {
        for (int var2 = 0; var2 < this.field1810; var2++) {
            this.field1800[var2][0] = null;
            this.field1800[var2][1] = null;
            this.field1800[var2][2] = null;
            this.field1800[var2] = (int[][]) null;
        }
        if (arg0 >= -61) {
            this.field1815 = true;
        }
        field1802++;
        this.field1800 = (int[][][]) null;
        this.field1814 = null;
        this.field1805.method2333(3393);
        this.field1805 = null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V", line = 143)
    public static final void method878(int arg0) {
        field1812++;
        class14.method99(arg0 - 4, 5);
        class243.method1750(5, arg0 - 62);
        class153.method1019(5, arg0 ^ 0xFFFFFF9F);
        class177.method1216(5, arg0 ^ 0xFFFFFF80);
        class133.method887(-128, 5);
        class170.method1108(5, true);
        class7.method24(5, arg0 ^ 0x1C14);
        class120.method816(5, false);
        class284.method2030(5, 255);
        class307.method2157(5, arg0 ^ 0x4D);
        class150.method1007(0, 5);
        class186.method1292(-84, 5);
        class262.method1887(5, false);
        class149.method1005((byte) -47, 5);
        class22.method147(5, true);
        class323.method2247((byte) 69, 5);
        class321.method2234(104, 5);
        class47.method278(50, 255);
        class304.method2129((byte) 104, 5);
        class309.method2168((byte) 0, 5);
        class137.field1900.method1236(-495037017, arg0);
        class40.field472.method1236(arg0 - 495037022, 5);
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)V", line = 172)
    public static void method879(int arg0) {
        field1816 = null;
        field1813 = null;
        field1809 = null;
        field1806 = null;
        if (arg0 != 3725) {
            field1818 = -32;
        }
    }
}

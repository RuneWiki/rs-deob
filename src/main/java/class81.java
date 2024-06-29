import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class81 extends class9 {

    @OriginalMember(owner = "client!le", name = "y", descriptor = "[J")
    private long[] field1870 = new long[10];

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    private int field1861 = 1;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "I")
    private int field1867 = 256;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    private int field1862 = 0;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "J")
    private long field1879 = class52.method408((byte) -109);

    @OriginalMember(owner = "client!le", name = "o", descriptor = "Lec;")
    public static class32 field1860 = class73.method594("Ihr Spielkonto wird bereits benutzt)3", true);

    @OriginalMember(owner = "client!le", name = "n", descriptor = "Lec;")
    public static class32 field1859 = class73.method594("Fertigkeit)2", true);

    @OriginalMember(owner = "client!le", name = "s", descriptor = "[Z")
    public static boolean[] field1864 = new boolean[100];

    @OriginalMember(owner = "client!le", name = "x", descriptor = "[I")
    public static int[] field1869 = new int[256];

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public static int field1857 = 0;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "Lec;")
    private static class32 field1865 = class73.method594("Error connecting to server)3", true);

    @OriginalMember(owner = "client!le", name = "m", descriptor = "Lec;")
    public static class32 field1858 = field1865;

    @OriginalMember(owner = "client!le", name = "G", descriptor = "Lec;")
    private static class32 field1878 = class73.method594("Press (Wchange your password(W on front page)3", true);

    @OriginalMember(owner = "client!le", name = "u", descriptor = "Lec;")
    private static class32 field1866 = class73.method594("You have only just left another world)3", true);

    @OriginalMember(owner = "client!le", name = "C", descriptor = "Lec;")
    public static class32 field1874 = field1866;

    @OriginalMember(owner = "client!le", name = "F", descriptor = "Lec;")
    public static class32 field1877 = field1878;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!le", name = "w", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!le", name = "z", descriptor = "I")
    private int field1871;

    @OriginalMember(owner = "client!le", name = "A", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!le", name = "D", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!le", name = "E", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!le", name = "B", descriptor = "Lbc;")
    public static class11 field1873;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
    public static void method638(boolean arg0) {
        field1859 = null;
        field1873 = null;
        field1864 = null;
        field1866 = null;
        field1865 = null;
        field1858 = null;
        if (!arg0) {
            field1865 = null;
        }
        field1877 = null;
        field1878 = null;
        field1860 = null;
        field1869 = null;
        field1874 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(III)I")
    public final int method58(int arg0, int arg1, int arg2) {
        field1868++;
        int var4 = this.field1867;
        this.field1867 = 300;
        int var5 = this.field1861;
        this.field1861 = arg1;
        this.field1879 = class52.method408((byte) -109);
        if (this.field1870[this.field1871] == 0L) {
            this.field1867 = var4;
            this.field1861 = var5;
        } else if (this.field1879 > this.field1870[this.field1871]) {
            this.field1867 = (int) ((long) (arg0 * 2560) / (this.field1879 - this.field1870[this.field1871]));
        }
        if (this.field1867 < 25) {
            this.field1867 = 25;
        }
        if (this.field1867 > 256) {
            this.field1867 = 256;
            this.field1861 = (int) ((long) arg0 - (this.field1879 - this.field1870[this.field1871]) / 10L);
        }
        if (this.field1861 > arg0) {
            this.field1861 = arg0;
        }
        this.field1870[this.field1871] = this.field1879;
        this.field1871 = (this.field1871 + 1) % 10;
        if (this.field1861 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field1870[var6] != 0L) {
                    this.field1870[var6] += this.field1861;
                }
            }
        }
        if (arg2 > this.field1861) {
            this.field1861 = arg2;
        }
        class54.method427((long) this.field1861, -27166);
        int var7 = 0;
        while (this.field1862 < 256) {
            this.field1862 += this.field1867;
            var7++;
        }
        this.field1862 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(B)Lh;")
    public static final class49 method639(byte arg0) {
        field1863++;
        if (arg0 != -120) {
            method639((byte) 28);
        }
        class49 var1 = new class49();
        var1.field1139 = class152.field3508;
        var1.field1143 = class34.field720[0];
        var1.field1144 = class74.field1747[0];
        var1.field1142 = class126.field2927[0];
        byte[] var2 = class147.field3346[0];
        int var3 = var1.field1143 * var1.field1142;
        var1.field1140 = class70.field1639[0];
        var1.field1145 = new int[var3];
        var1.field1141 = class128.field2967;
        for (int var4 = 0; var4 < var3; var4++) {
            var1.field1145[var4] = class31.field616[class41.method326(255, var2[var4])];
        }
        class70.method580((byte) 29);
        return var1;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
    public class81() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1870[var1] = this.field1879;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public final void method57(int arg0) {
        int var2 = 0;
        if (arg0 <= 110) {
            this.method58(-69, -51, -73);
        }
        while (var2 < 10) {
            this.field1870[var2] = 0L;
            var2++;
        }
        field1875++;
    }
}

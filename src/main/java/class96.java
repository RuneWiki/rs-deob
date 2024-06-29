import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class96 {

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    private int field1873 = 0;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    private int field1878 = -1;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Lmf;")
    private class291 field1869 = new class291();

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "Z")
    public boolean field1884 = false;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    private int field1877;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    private int field1879;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "[Lln;")
    private class259[] field1874;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "[[[I")
    private int[][][] field1872;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "[F")
    public static float[] field1871 = new float[16384];

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "[F")
    public static float[] field1875 = new float[16384];

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "Ls;")
    public static class186 field1882;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "[[B")
    public static byte[][] field1883;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field1871[var2] = (float) Math.sin((double) var2 * var0);
            field1875[var2] = (float) Math.cos((double) var2 * var0);
        }
        field1882 = new class186(80, 6);
        new class208("", 76);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)[[[I", line = 8)
    public final int[][][] method858(byte arg0) {
        field1880++;
        if (this.field1879 != this.field1877) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field1879; var2++) {
            this.field1874[var2] = class353.field5215;
        }
        return arg0 > -95 ? null : this.field1872;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)[[I", line = 30)
    public final int[][] method859(int arg0, int arg1) {
        field1870++;
        int var3 = -47 / ((85 - arg1) / 39);
        if (this.field1879 == this.field1877) {
            this.field1884 = this.field1874[arg0] == null;
            this.field1874[arg0] = class353.field5215;
            return this.field1872[arg0];
        } else if (this.field1879 == 1) {
            this.field1884 = this.field1878 != arg0;
            this.field1878 = arg0;
            return this.field1872[0];
        } else {
            class259 var4 = this.field1874[arg0];
            if (var4 == null) {
                this.field1884 = true;
                if (this.field1879 > this.field1873) {
                    var4 = new class259(arg0, this.field1873);
                    this.field1873++;
                } else {
                    class259 var5 = (class259) this.field1869.method1884((byte) -30);
                    var4 = new class259(arg0, var5.field3964);
                    this.field1874[var5.field3960] = null;
                    var5.method1676(true);
                }
                this.field1874[arg0] = var4;
            } else {
                this.field1884 = false;
            }
            this.field1869.method1887((byte) 126, var4);
            return this.field1872[var4.field3964];
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 98)
    public final void method860(int arg0) {
        field1876++;
        for (int var2 = 0; var2 < this.field1879; var2++) {
            this.field1872[var2][0] = null;
            this.field1872[var2][1] = null;
            this.field1872[var2][2] = null;
            this.field1872[var2] = null;
        }
        this.field1872 = null;
        if (arg0 == 1) {
            this.field1874 = null;
            this.field1869.method1891(-3);
            this.field1869 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V", line = 128)
    public static void method861(boolean arg0) {
        field1875 = null;
        field1883 = null;
        field1871 = null;
        if (arg0) {
            method862(37);
        }
        field1882 = null;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(III)V", line = 202)
    public class96(int arg0, int arg1, int arg2) {
        this.field1877 = arg1;
        this.field1879 = arg0;
        this.field1874 = new class259[this.field1877];
        this.field1872 = new int[this.field1879][3][arg2];
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V", line = 154)
    public static final void method862(int arg0) {
        if (arg0 != 3) {
            method862(112);
        }
        class28.field457 = null;
        class196.field3148 = null;
        field1881++;
    }
}

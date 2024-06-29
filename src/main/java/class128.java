import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class128 extends class522 {

    @OriginalMember(owner = "client!pq", name = "G", descriptor = "[I")
    private int[] field1867 = new int[this.field7718];

    @OriginalMember(owner = "client!pq", name = "z", descriptor = "Lvj;")
    public static class304 field1860 = new class304("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

    @OriginalMember(owner = "client!pq", name = "B", descriptor = "Z")
    public static boolean field1862 = false;

    @OriginalMember(owner = "client!pq", name = "I", descriptor = "I")
    public static int field1869 = 1;

    @OriginalMember(owner = "client!pq", name = "E", descriptor = "Lff;")
    public static class9 field1865 = new class9(42, 12);

    @OriginalMember(owner = "client!pq", name = "K", descriptor = "I")
    public static int field1871 = 0;

    @OriginalMember(owner = "client!pq", name = "v", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!pq", name = "w", descriptor = "I")
    private int field1857;

    @OriginalMember(owner = "client!pq", name = "x", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!pq", name = "y", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!pq", name = "A", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!pq", name = "C", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!pq", name = "D", descriptor = "I")
    private int field1864;

    @OriginalMember(owner = "client!pq", name = "F", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!pq", name = "H", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!pq", name = "L", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!pq", name = "J", descriptor = "[B")
    private byte[] field1870;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)V", line = 3)
    public final void method917(int arg0) {
        this.field1864 = 0;
        if (arg0 < 49) {
            this.method921((byte) 58);
        }
        ++field1856;
        this.field1857 = 0;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILsq;II)V", line = 18)
    public static final void method918(int arg0, class117 arg1, int arg2, int arg3) {
        if (arg3 > 108) {
            if (~arg1.field6185 == ~arg2 && arg2 != -1) {
                class5 var4 = class423.field5791.method1601(arg2, (byte) -118);
                int var5 = var4.field126;
                if (var5 == 1) {
                    arg1.field6226 = 1;
                    arg1.field6248 = arg0;
                    arg1.field6204 = 0;
                    arg1.field6244 = 0;
                    arg1.field6175 = 0;
                    class291.method1711(var4, arg1.field6204, arg1.field574, -52, arg1.field573, arg1.field584, false);
                }
                if (~var5 == -3) {
                    arg1.field6244 = 0;
                }
            } else if (arg2 == -1 || ~arg1.field6185 == 0 || ~class423.field5791.method1601(arg2, (byte) -113).field135 <= ~class423.field5791.method1601(arg1.field6185, (byte) -115).field135) {
                arg1.field6259 = arg1.field6257;
                arg1.field6244 = 0;
                arg1.field6175 = 0;
                arg1.field6248 = arg0;
                arg1.field6226 = 1;
                arg1.field6204 = 0;
                arg1.field6185 = arg2;
                if (~arg1.field6185 != 0) {
                    class291.method1711(class423.field5791.method1601(arg1.field6185, (byte) -122), arg1.field6204, arg1.field574, -26, arg1.field573, arg1.field584, false);
                }
            }
            ++field1863;
        }
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(I)V", line = 76)
    public static void method919(int arg0) {
        field1860 = null;
        field1865 = null;
        if (arg0 < 100) {
            method919(-106);
        }
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(IIIIIF)V", line = 96)
    public class128(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~var7 > ~super.field7718; ++var7) {
            this.field1867[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(III)V", line = 117)
    public final void method920(int arg0, int arg1, int arg2) {
        this.field1864 += this.field1867[arg0] * arg2 >> 12;
        ++field1859;
        if (arg1 != 1) {
            field1862 = false;
        }
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(B)V", line = 134)
    public final void method921(byte arg0) {
        this.field1864 = Math.abs(this.field1864);
        ++field1866;
        if (this.field1864 >= 4096) {
            this.field1864 = 4095;
        }
        this.method922(true, this.field1857++, (byte) (this.field1864 >> 4));
        this.field1864 = 0;
        if (arg0 <= 92) {
            this.method922(false, 68, (byte) 107);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZIB)V", line = 152)
    public void method922(boolean arg0, int arg1, byte arg2) {
        this.field1870[this.field1857++] = (byte) ((class494.method2839(arg2, 255) >> 1) + 127);
        if (!arg0) {
            method919(-108);
        }
        ++field1858;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class116 extends class297 {

    @OriginalMember(owner = "client!sf", name = "V", descriptor = "I")
    private int field1890 = -1;

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "I")
    public static int field1880 = -1;

    @OriginalMember(owner = "client!sf", name = "R", descriptor = "Ljava/lang/String;")
    public static String field1886 = "flash3:";

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "I")
    public static int field1885 = 99;

    @OriginalMember(owner = "client!sf", name = "W", descriptor = "Ljava/lang/String;")
    public static String field1891 = "yellow:";

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "I")
    private int field1883;

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!sf", name = "S", descriptor = "I")
    private int field1887;

    @OriginalMember(owner = "client!sf", name = "T", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!sf", name = "U", descriptor = "Lwd;")
    public static class88 field1889;

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "[I")
    private int[] field1877;

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "[[B")
    public static byte[][] field1878;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)I", line = 4)
    public final int method915(int arg0) {
        field1879++;
        if (arg0 != 0) {
            this.method172(0, (byte) 43);
        }
        return this.field1890;
    }

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)Z", line = 16)
    private final boolean method916(int arg0) {
        field1882++;
        if (this.field1877 != null) {
            return true;
        } else if (this.field1890 >= 0) {
            int var2 = class164.field2670;
            int var3 = class31.field491;
            int var4 = class73.field1115.method241(this.field1890, 5).field228 ? 64 : 128;
            this.field1877 = class73.field1115.method242(var4, this.field1890, false, var4, 0, 1.0F);
            this.field1883 = var4;
            this.field1887 = var4;
            class244.method1719(var2, var3, 128);
            return this.field1877 != null;
        } else {
            if (arg0 != 4080) {
                this.method916(15);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(Z)V", line = 47)
    public static void method917(boolean arg0) {
        field1889 = null;
        field1878 = (byte[][]) null;
        field1886 = null;
        if (!arg0) {
            field1889 = (class88) null;
        }
        field1891 = null;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V", line = 65)
    public final void method779(int arg0) {
        super.method779(arg0);
        this.field1877 = null;
        field1881++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILaj;)V", line = 78)
    public final void method169(int arg0, int arg1, class1 arg2) {
        if (arg0 == 0) {
            this.field1890 = arg2.method56(19612);
        }
        if (arg1 == 255) {
            field1884++;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)[[I", line = 100)
    public final int[][] method172(int arg0, byte arg1) {
        field1888++;
        if (arg1 != 63) {
            this.method915(9);
        }
        int[][] var3 = this.field4767.method1141(-1677, arg0);
        if (this.field4767.field2480 && this.method916(arg1 + 4017)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field1883 * (class164.field2670 == this.field1887 ? arg0 : this.field1887 * arg0 / class164.field2670);
            if (class31.field491 == this.field1883) {
                for (int var11 = 0; var11 < class31.field491; var11++) {
                    int var12 = this.field1877[var7++];
                    var6[var11] = class164.method1234(var12 << 4, 4080);
                    var5[var11] = class164.method1234(4080, var12 >> 4);
                    var4[var11] = class164.method1234(16711680, var12) >> 12;
                }
            } else {
                for (int var8 = 0; var8 < class31.field491; var8++) {
                    int var9 = this.field1883 * var8 / class31.field491;
                    int var10 = this.field1877[var7 + var9];
                    var6[var8] = class164.method1234(var10 << 4, 4080);
                    var5[var8] = class164.method1234(var10 >> 4, 4080);
                    var4[var8] = class164.method1234(4080, var10 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V", line = 170)
    public class116() {
        super(0, false);
    }
}

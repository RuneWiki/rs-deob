import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class126 extends class185 {

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "I")
    private int field1886;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    private int field1883;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
    private int field1880;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
    private int field1876;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    public static int field1879 = 0;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "Z")
    public static boolean field1885 = true;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field1877 = 0;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
    public static int field1887 = 0;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "F")
    public static float field1882;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIB)V", line = 5)
    public final void method718(int arg0, int arg1, byte arg2) {
        field1881++;
        int var4 = this.field1883 * arg0 >> 12;
        int var5 = this.field1876 * arg0 >> 12;
        int var6 = -35 % ((arg2 + 39) / 61);
        int var7 = this.field1880 * arg1 >> 12;
        int var8 = this.field1886 * arg1 >> 12;
        class202.method1477(var7, 3, this.field2973, this.field2972, var4, var8, this.field2974, var5);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V", line = 34)
    public final void method721(int arg0, int arg1, int arg2) {
        field1878++;
        int var4 = this.field1883 * arg0 >> 12;
        int var5 = this.field1876 * arg0 >> 12;
        int var6 = this.field1880 * arg2 >> 12;
        if (arg1 != -1) {
            field1887 = -46;
        }
        int var7 = this.field1886 * arg2 >> 12;
        class36.method231(124, var4, var6, this.field2973, var7, var5, this.field2974);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILim;)V", line = 55)
    public static final void method868(int arg0, class192 arg1) {
        field1888++;
        if (arg0 != -18581) {
            field1885 = true;
        }
        byte[] var2 = new byte[24];
        if (class145.field2178 != null) {
            try {
                class145.field2178.method1420(0L, -123);
                class145.field2178.method1422(var2, -120);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg1.method1367(24, 0, var2, 504526352);
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(IIIIIII)V", line = 104)
    public class126(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1886 = arg3;
        this.field1883 = arg0;
        this.field1880 = arg1;
        this.field1876 = arg2;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBI)V", line = 116)
    public final void method717(int arg0, byte arg1, int arg2) {
        field1884++;
        int var4 = this.field1883 * arg2 >> 12;
        int var5 = this.field1880 * arg0 >> 12;
        int var6 = this.field1886 * arg0 >> 12;
        int var7 = this.field1876 * arg2 >> 12;
        if (arg1 > 43) {
            class15.method96(var5, true, var6, var7, var4, this.field2972);
        }
    }
}

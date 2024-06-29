import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class91 extends class64 {

    @OriginalMember(owner = "client!kb", name = "U", descriptor = "[Luc;")
    public static class182[] field1944 = new class182[32768];

    @OriginalMember(owner = "client!kb", name = "X", descriptor = "I")
    public static int field1947 = 0;

    @OriginalMember(owner = "client!kb", name = "T", descriptor = "Lsa;")
    public static class162 field1943 = new class162(64);

    @OriginalMember(owner = "client!kb", name = "ab", descriptor = "Lcd;")
    private static class23 field1950 = class54.method414("Loaded fonts", -1);

    @OriginalMember(owner = "client!kb", name = "Y", descriptor = "Lcd;")
    public static class23 field1948 = field1950;

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!kb", name = "S", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!kb", name = "V", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!kb", name = "W", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!kb", name = "bb", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!kb", name = "Z", descriptor = "Lfa;")
    public static class47 field1949;

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "[I")
    public static int[] field1939;

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
    public class91() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)V")
    public static void method590(int arg0) {
        field1944 = null;
        field1939 = null;
        field1950 = null;
        field1943 = null;
        if (arg0 != 1) {
            field1949 = null;
        }
        field1949 = null;
        field1948 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method36(int arg0, boolean arg1) {
        if (!arg1) {
            return null;
        } else {
            ++field1940;
            int[][] var3 = super.field1508.method846(7287, arg0);
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            if (super.field1508.field2757) {
                for (int var7 = 0; ~var7 > ~class168.field3367; ++var7) {
                    this.method591(arg0, 0, var7);
                    int[][] var8 = this.method482(0, class9.field176, (byte) -126);
                    var4[var7] = var8[0][class85.field1831];
                    var5[var7] = var8[1][class85.field1831];
                    var6[var7] = var8[2][class85.field1831];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BILva;)V")
    public final void method37(byte arg0, int arg1, class189 arg2) {
        int var4 = -77 / ((arg0 - 7) / 43);
        if (arg1 == 0) {
            super.field1510 = arg2.method1202(-94) == 1;
        }
        ++field1942;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(III)V")
    private final void method591(int arg0, int arg1, int arg2) {
        ++field1946;
        int var4 = class95.field1995[arg0];
        int var5 = class174.field3475[arg2];
        float var6 = (float) Math.atan2((double) (var5 + -2048), (double) (var4 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class9.field176 = arg0;
            class85.field1831 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class9.field176 = arg2;
            class85.field1831 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class9.field176 = arg2;
            class85.field1831 = -arg0 + class168.field3367;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class9.field176 = -arg0 + class2.field24;
            class85.field1831 = arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class9.field176 = -arg0 + class2.field24;
            class85.field1831 = class168.field3367 - arg2;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class85.field1831 = -arg0 + class168.field3367;
            class9.field176 = -arg2 + class2.field24;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class9.field176 = class2.field24 - arg2;
            class85.field1831 = arg0;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class85.field1831 = class168.field3367 - arg2;
            class9.field176 = arg0;
        }
        class9.field176 &= class81.field1760;
        if (arg1 == 0) {
            class85.field1831 &= class163.field3266;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field1941;
        if (arg1 != -9421) {
            return null;
        } else {
            int[] var3 = super.field1513.method1033(-63, arg0);
            if (super.field1513.field3368) {
                for (int var4 = 0; ~var4 > ~class168.field3367; ++var4) {
                    this.method591(arg0, 0, var4);
                    int[] var5 = this.method479(arg1 + 9420, class9.field176, 0);
                    var3[var4] = var5[class85.field1831];
                }
            }
            return var3;
        }
    }
}

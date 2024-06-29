import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class109 extends class12 {

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "I")
    private int field1967 = 32768;

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "Lnd;")
    public static class127 field1968 = new class127(64);

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "I")
    public static int field1971 = 0;

    @OriginalMember(owner = "client!ld", name = "X", descriptor = "Ltg;")
    private static class184 field1973 = class135.method812("Prepared visibility map", 3);

    @OriginalMember(owner = "client!ld", name = "W", descriptor = "Ltg;")
    public static class184 field1972 = field1973;

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "Lka;")
    public static class97 field1970 = new class97(new byte[5000]);

    @OriginalMember(owner = "client!ld", name = "ab", descriptor = "I")
    public static volatile int field1976 = -1;

    @OriginalMember(owner = "client!ld", name = "Y", descriptor = "Ltg;")
    private static class184 field1974 = class135.method812("Loaded interfaces", 3);

    @OriginalMember(owner = "client!ld", name = "Z", descriptor = "Ltg;")
    public static class184 field1975 = class135.method812("rot:", 3);

    @OriginalMember(owner = "client!ld", name = "cb", descriptor = "Ltg;")
    public static class184 field1978 = class135.method812("Zu viele Verbindungen von Ihrer Adresse)3", 3);

    @OriginalMember(owner = "client!ld", name = "bb", descriptor = "Ltg;")
    public static class184 field1977 = field1974;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
    public class109() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIII)I")
    public static final int method677(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != -40021268) {
            field1973 = null;
        }
        ++field1963;
        int var5 = -class23.field434[arg0 * 1024 / arg3] + 65536 >> 1;
        return ((-var5 + 65536) * arg1 >> 16) + (arg2 * var5 >> 16);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        ++field1965;
        if (!arg2) {
            if (arg1 != 0) {
                if (~arg1 == -2) {
                    super.field211 = ~arg0.method588((byte) -41) == -2;
                }
            } else {
                this.field1967 = arg0.method611(false) << 4;
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
    public final void method78(byte arg0) {
        ++field1966;
        if (arg0 == 57) {
            class90.method527((byte) 97);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)[I")
    public final int[] method62(int arg0, byte arg1) {
        ++field1969;
        int[] var3 = super.field224.method7((byte) -123, arg0);
        if (arg1 != 17) {
            this.method62(73, (byte) 73);
        }
        if (super.field224.field53) {
            int[] var4 = this.method77(1, arg0, -121);
            int[] var5 = this.method77(2, arg0, -121);
            for (int var6 = 0; class201.field3889 > var6; ++var6) {
                int var7 = 255 & var4[var6] >> 4;
                int var8 = var5[var6] * this.field1967 >> 12;
                int var9 = class67.field1304[var7] * var8 >> 12;
                int var10 = class136.field2474[var7] * var8 >> 12;
                int var11 = arg0 - -(var10 >> 12) & class173.field3274;
                int var12 = class51.field937 & (var9 >> 12) + var6;
                int[] var13 = this.method77(0, var11, arg1 + -143);
                var3[var6] = var13[var12];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "(I)V")
    public static void method678(int arg0) {
        field1974 = null;
        field1972 = null;
        field1975 = null;
        field1978 = null;
        field1968 = null;
        field1970 = null;
        if (arg0 != -1871881620) {
            field1971 = 63;
        }
        field1977 = null;
        field1973 = null;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        ++field1964;
        int var3 = -24 % ((arg1 - -58) / 34);
        int[][] var4 = super.field232.method673(arg0, 112);
        if (super.field232.field1962) {
            int[] var5 = this.method77(1, arg0, -127);
            int[] var6 = this.method77(2, arg0, -128);
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            for (int var10 = 0; var10 < class201.field3889; ++var10) {
                int var11 = var5[var10] * 255 >> 12 & 255;
                int var12 = var6[var10] * this.field1967 >> 12;
                int var13 = class136.field2474[var11] * var12 >> 12;
                int var14 = (var13 >> 12) + arg0 & class173.field3274;
                int var15 = class67.field1304[var11] * var12 >> 12;
                int var16 = (var15 >> 12) + var10 & class51.field937;
                int[][] var17 = this.method76(var14, 6218, 0);
                var7[var10] = var17[0][var16];
                var8[var10] = var17[1][var16];
                var9[var10] = var17[2][var16];
            }
        }
        return var4;
    }
}

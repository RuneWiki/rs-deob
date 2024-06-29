import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class246 extends class252 {

    @OriginalMember(owner = "client!mi", name = "T", descriptor = "Ljd;")
    public static class85 field4199 = class221.method1499("not yet implemented", (byte) 127);

    @OriginalMember(owner = "client!mi", name = "V", descriptor = "[I")
    public static int[] field4201 = new int[100];

    @OriginalMember(owner = "client!mi", name = "fb", descriptor = "Ljd;")
    public static class85 field4211 = class221.method1499("Lade Texturen )2 ", (byte) -75);

    @OriginalMember(owner = "client!mi", name = "eb", descriptor = "Ljd;")
    public static class85 field4210 = class221.method1499(":", (byte) 116);

    @OriginalMember(owner = "client!mi", name = "ab", descriptor = "Ljd;")
    public static class85 field4206 = class221.method1499("; version=1; path=)4; domain=", (byte) -68);

    @OriginalMember(owner = "client!mi", name = "Z", descriptor = "I")
    public static int field4205 = 0;

    @OriginalMember(owner = "client!mi", name = "W", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!mi", name = "X", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!mi", name = "Y", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!mi", name = "bb", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!mi", name = "cb", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!mi", name = "db", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!mi", name = "U", descriptor = "[I")
    public static int[] field4200;

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
    public class246() {
        super(1, true);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(JB)V")
    public static final void method1659(long arg0, byte arg1) {
        ++field4203;
        if (~arg0 != -1L) {
            class207.field3618.method483(-24260, 143);
            ++class43.field737;
            class207.field3618.method1674((byte) 101, arg0);
            if (arg1 <= 70) {
                method1661((byte) -27);
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(IB)[I")
    public final int[] method149(int arg0, byte arg1) {
        ++field4208;
        int[] var3 = super.field4356.method868(arg0, (byte) 106);
        if (arg1 != -55) {
            return null;
        } else {
            if (super.field4356.field2258) {
                int[][] var4 = this.method1737(0, arg1 + 58, arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                for (int var8 = 0; ~class5.field63 < ~var8; ++var8) {
                    var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIII)I")
    public static final int method1660(int arg0, int arg1, int arg2, int arg3) {
        ++field4209;
        int var4 = arg3 >> 7;
        int var5 = arg1 >> 7;
        if (var5 >= 0 && ~var4 <= -1 && ~var5 >= -104 && ~var4 >= -104) {
            int var6 = 127 & arg1;
            if (arg0 != 604124551) {
                return 120;
            } else {
                int var7 = arg2;
                if (arg2 < 3 && (2 & class228.field3952[1][var5][var4]) == 2) {
                    var7 = arg2 + 1;
                }
                int var8 = (-var6 + 128) * class245.field4193[var7][var5][var4] + class245.field4193[var7][var5 + 1][var4] * var6 >> 7;
                int var9 = arg3 & 127;
                int var10 = (-var6 + 128) * class245.field4193[var7][var5][var4 + 1] + class245.field4193[var7][var5 - -1][var4 + 1] * var6 >> 7;
                return (-var9 + 128) * var8 + var9 * var10 >> 7;
            }
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(B)V")
    public static void method1661(byte arg0) {
        field4199 = null;
        field4211 = null;
        field4206 = null;
        int var1 = -114 / ((-15 - arg0) / 63);
        field4210 = null;
        field4201 = null;
        field4200 = null;
    }
}

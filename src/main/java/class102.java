import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class102 extends class273 {

    @OriginalMember(owner = "client!qg", name = "bb", descriptor = "I")
    private int field1973 = 32768;

    @OriginalMember(owner = "client!qg", name = "Z", descriptor = "I")
    public static int field1971 = 0;

    @OriginalMember(owner = "client!qg", name = "cb", descriptor = "I")
    public static int field1974 = 0;

    @OriginalMember(owner = "client!qg", name = "eb", descriptor = "Ljd;")
    private static class86 field1976 = class122.method868(" from your ignore list first)3", true);

    @OriginalMember(owner = "client!qg", name = "V", descriptor = "Ljd;")
    public static class86 field1967 = field1976;

    @OriginalMember(owner = "client!qg", name = "S", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!qg", name = "T", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!qg", name = "U", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!qg", name = "W", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!qg", name = "X", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!qg", name = "Y", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!qg", name = "db", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!qg", name = "fb", descriptor = "Lbj;")
    public static class151 field1977;

    @OriginalMember(owner = "client!qg", name = "ab", descriptor = "[Lod;")
    public static class90[] field1972;

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
    public class102() {
        super(3, false);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BII[B)Ljd;")
    public static final class86 method733(byte arg0, int arg1, int arg2, byte[] arg3) {
        class86 var4 = new class86();
        var4.field1670 = new byte[arg1];
        ++field1969;
        int var5 = 91 / ((-52 - arg0) / 55);
        var4.field1704 = 0;
        for (int var6 = arg2; ~(arg1 + arg2) < ~var6; ++var6) {
            if (arg3[var6] != 0) {
                var4.field1670[var4.field1704++] = arg3[var6];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)[[I")
    public final int[][] method29(int arg0, byte arg1) {
        int var3 = -46 % ((arg1 - 12) / 58);
        int[][] var4 = super.field4787.method1657(arg0, (byte) -105);
        ++field1964;
        if (super.field4787.field4355) {
            int[] var5 = this.method1863(-128, 1, arg0);
            int[] var6 = this.method1863(-102, 2, arg0);
            int[] var7 = var4[1];
            int[] var8 = var4[0];
            int[] var9 = var4[2];
            for (int var10 = 0; ~var10 > ~class176.field3200; ++var10) {
                int var11 = 255 & var5[var10] * 255 >> 12;
                int var12 = var6[var10] * this.field1973 >> 12;
                int var13 = class237.field4277[var11] * var12 >> 12;
                int var14 = class205.field3698[var11] * var12 >> 12;
                int var15 = (var13 >> 12) + var10 & class90.field1844;
                int var16 = (var14 >> 12) + arg0 & class274.field4808;
                int[][] var17 = this.method1859(var16, 0, 3);
                var8[var10] = var17[0][var15];
                var7[var10] = var17[1][var15];
                var9[var10] = var17[2][var15];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        ++field1975;
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                super.field4778 = arg1.method1408((byte) -41) == 1;
            }
        } else {
            this.field1973 = arg1.method1410(-52) << 4;
        }
        if (arg2 > -16) {
            this.method31(-97, -98);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field1965;
        int[] var3 = super.field4800.method1224(arg1, 0);
        if (super.field4800.field3160) {
            int[] var4 = this.method1863(-108, 1, arg1);
            int[] var5 = this.method1863(-97, 2, arg1);
            for (int var6 = 0; var6 < class176.field3200; ++var6) {
                int var7 = 255 & var4[var6] >> 4;
                int var8 = var5[var6] * this.field1973 >> 12;
                int var9 = class237.field4277[var7] * var8 >> 12;
                int var10 = class205.field3698[var7] * var8 >> 12;
                int var11 = class274.field4808 & (var10 >> 12) + arg1;
                int var12 = (var9 >> 12) + var6 & class90.field1844;
                int[] var13 = this.method1863(-86, 0, var11);
                var3[var6] = var13[var12];
            }
        }
        if (arg0 != -7420) {
            field1967 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/awt/Component;BII)Lpc;")
    public static final class21 method734(Component arg0, byte arg1, int arg2, int arg3) {
        ++field1970;
        try {
            if (arg1 < 93) {
                method733((byte) -11, 44, -9, (byte[]) null);
            }
            Class var4 = Class.forName("ai");
            class21 var5 = (class21) var4.newInstance();
            var5.method160(arg0, 0, arg2, arg3);
            return var5;
        } catch (Throwable var7) {
            class114 var6 = new class114();
            var6.method160(arg0, 0, arg2, arg3);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "([SI[Ljd;)V")
    public static final void method735(short[] arg0, int arg1, class86[] arg2) {
        class275.method1871(arg2.length + -1, (byte) 66, 0, arg0, arg2);
        if (arg1 != -25020) {
            method734((Component) null, (byte) -81, -98, -103);
        }
        ++field1968;
    }

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "(I)V")
    public static void method736(int arg0) {
        field1967 = null;
        field1972 = null;
        if (arg0 != -2002479284) {
            field1971 = -70;
        }
        field1977 = null;
        field1976 = null;
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)V")
    public final void method84(int arg0) {
        class144.method1022((byte) -124);
        ++field1966;
        if (arg0 != 4095) {
            this.method29(116, (byte) 14);
        }
    }
}

import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class88 extends class102 {

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "I")
    private int field1673 = 32768;

    @OriginalMember(owner = "client!ia", name = "M", descriptor = "Lqe;")
    public static class179 field1669 = class206.method1380("<col=ffff00>*V", (byte) -126);

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "Lqe;")
    public static class179 field1676 = class206.method1380(":tradereq:", (byte) -33);

    @OriginalMember(owner = "client!ia", name = "W", descriptor = "Lqe;")
    public static class179 field1678 = class206.method1380("http:)4)4www)3runescape)3com)4l=", (byte) -128);

    @OriginalMember(owner = "client!ia", name = "Z", descriptor = "I")
    public static int field1681 = 0;

    @OriginalMember(owner = "client!ia", name = "ab", descriptor = "Lqe;")
    public static class179 field1682 = class206.method1380("Keine Antwort vom Anmelde)2Server)3", (byte) -127);

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!ia", name = "S", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!ia", name = "V", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!ia", name = "Y", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        ++field1675;
        if (arg2) {
            method584(113, -74, 49, -105);
        }
        if (~arg1 != -1) {
            if (arg1 == 1) {
                super.field1957 = ~arg0.method1243(3) == -2;
            }
        } else {
            this.field1673 = arg0.method1252(2) << 4;
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
    public class88() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII)V")
    public static final void method584(int arg0, int arg1, int arg2, int arg3) {
        ++field1677;
        class6 var4 = class227.method1485(arg3, arg2, (byte) 121);
        if (var4 != null && var4.field96 != null) {
            class19 var5 = new class19();
            var5.field491 = var4.field96;
            var5.field499 = var4;
            class102.method681(200000, var5);
        }
        class163.field2940 = true;
        class167.field3024 = arg3;
        class56.field1233 = arg2;
        field1679 = arg0;
        int var6 = -123 % ((81 - arg1) / 38);
        class139.method880(var4, 106);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
    public static final int method585(int arg0, KeyEvent arg1) {
        if (arg0 != -24794) {
            method587(9);
        }
        ++field1672;
        int var2 = arg1.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        if (arg1 != 64) {
            field1678 = null;
        }
        ++field1671;
        int[][] var3 = super.field1950.method598((byte) -107, arg0);
        if (super.field1950.field1724) {
            int[] var4 = this.method679(arg0, 1, (byte) -109);
            int[] var5 = this.method679(arg0, 2, (byte) -109);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class155.field2796; ++var9) {
                int var10 = (1045124 & var4[var9] * 255) >> 12;
                int var11 = var5[var9] * this.field1673 >> 12;
                int var12 = class40.field866[var10] * var11 >> 12;
                int var13 = class229.field4243[var10] * var11 >> 12;
                int var14 = class227.field4193 & (var13 >> 12) + var9;
                int var15 = class233.field4296 & (var12 >> 12) + arg0;
                int[][] var16 = this.method677(arg1 ^ 112, var15, 0);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIILrb;IJ)Z")
    public static final boolean method586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class186 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class239.method1548(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)[I")
    public final int[] method11(boolean arg0, int arg1) {
        int[] var3 = super.field1960.method699((byte) -74, arg1);
        if (super.field1960.field2007) {
            int[] var4 = this.method679(arg1, 1, (byte) -109);
            int[] var5 = this.method679(arg1, 2, (byte) -109);
            for (int var6 = 0; ~class155.field2796 < ~var6; ++var6) {
                int var7 = (4087 & var4[var6]) >> 4;
                int var8 = var5[var6] * this.field1673 >> 12;
                int var9 = class40.field866[var7] * var8 >> 12;
                int var10 = class229.field4243[var7] * var8 >> 12;
                int var11 = class227.field4193 & (var10 >> 12) + var6;
                int var12 = (var9 >> 12) + arg1 & class233.field4296;
                int[] var13 = this.method679(var12, 0, (byte) -109);
                var3[var6] = var13[var11];
            }
        }
        ++field1674;
        if (!arg0) {
            this.field1673 = 87;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
    public final void method191(int arg0) {
        ++field1670;
        class56.method390(-1);
        if (arg0 != 14005) {
            method584(84, 106, 91, 23);
        }
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V")
    public static void method587(int arg0) {
        field1682 = null;
        field1669 = null;
        field1676 = null;
        if (arg0 != -26232) {
            field1679 = -40;
        }
        field1678 = null;
    }
}

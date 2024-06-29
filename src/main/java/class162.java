import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class162 extends class478 {

    @OriginalMember(owner = "client!un", name = "G", descriptor = "I")
    private int field1806 = 4096;

    @OriginalMember(owner = "client!un", name = "C", descriptor = "I")
    public static int field1802 = 1;

    @OriginalMember(owner = "client!un", name = "J", descriptor = "Lcq;")
    public static class110 field1809 = new class110(111, 20);

    @OriginalMember(owner = "client!un", name = "L", descriptor = "[I")
    public static int[] field1811 = new int[14];

    @OriginalMember(owner = "client!un", name = "N", descriptor = "[I")
    public static int[] field1813 = new int[13];

    @OriginalMember(owner = "client!un", name = "O", descriptor = "Ljd;")
    public static class539 field1814 = new class539();

    @OriginalMember(owner = "client!un", name = "P", descriptor = "Lad;")
    public static class19 field1815 = new class19(4);

    @OriginalMember(owner = "client!un", name = "B", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!un", name = "D", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!un", name = "E", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!un", name = "F", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!un", name = "H", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!un", name = "I", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!un", name = "K", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!un", name = "M", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(Z)V", line = 7)
    public static void method877(boolean arg0) {
        field1814 = null;
        if (arg0) {
            field1813 = null;
        }
        field1811 = null;
        field1815 = null;
        field1809 = null;
        field1813 = null;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIII)I", line = 23)
    public static final int method878(int arg0, int arg1, int arg2, int arg3) {
        ++field1808;
        if ((class16.field131[arg0][arg2][arg1] & 8) != 0) {
            return 0;
        } else if (~arg0 < -1 && (class16.field131[1][arg2][arg1] & 2) != 0) {
            return arg0 + -1;
        } else {
            return arg3 != 1 ? -2 : arg0;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IZ)Z", line = 41)
    public static final boolean method879(int arg0, boolean arg1) {
        class664.field9290 = 65535 & arg0 + 1;
        if (arg1) {
            field1813 = null;
        }
        class105.field1131 = true;
        ++field1804;
        return true;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/awt/Component;Z)Lwi;", line = 56)
    public static final class540 method880(Component arg0, boolean arg1) {
        ++field1812;
        if (!arg1) {
            field1810 = 44;
        }
        return new class338(arg0);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ILnp;I)V", line = 73)
    public final void method33(int arg0, class115 arg1, int arg2) {
        ++field1803;
        if (arg0 == 255) {
            if (~arg2 == -1) {
                this.field1806 = arg1.method643((byte) -77);
            }
        }
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(I)Lpj;", line = 91)
    public static final class237 method881(int arg0) {
        ++field1805;
        class237 var1 = (class237) class170.field1898.method1665(-10300);
        if (var1 != null) {
            --class403.field5402;
            return var1;
        } else {
            return arg0 != 12918 ? null : new class237();
        }
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V", line = 188)
    public class162() {
        super(1, true);
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(II)[I", line = 119)
    public final int[] method35(int arg0, int arg1) {
        ++field1801;
        int[] var3 = super.field6886.method789(arg0, (byte) -66);
        if (super.field6886.field1592) {
            int[] var4 = this.method2752(class156.field1746 & arg0 + -1, arg1 + 11442, 0);
            int[] var5 = this.method2752(arg0, arg1 + 11450, 0);
            int[] var6 = this.method2752(arg0 + 1 & class156.field1746, -74, 0);
            for (int var7 = 0; ~var7 > ~class436.field6154; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field1806;
                int var9 = (var5[var7 + 1 & class204.field2414] + -var5[var7 - 1 & class204.field2414]) * this.field1806;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 + 4096 - -var13) / 4096.0F)));
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        if (arg1 != -11323) {
            method880((Component) null, false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(II)I", line = 172)
    public static final int method882(int arg0, int arg1) {
        if (arg0 != 255) {
            method881(21);
        }
        ++field1807;
        return 255 & arg1;
    }
}

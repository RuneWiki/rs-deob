import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class689 {

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "I")
    public int field9764;

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "Lqda;")
    public static class689 field9766 = new class689(1);

    @OriginalMember(owner = "client!qda", name = "f", descriptor = "Lqda;")
    public static class689 field9769 = new class689(2);

    @OriginalMember(owner = "client!qda", name = "g", descriptor = "Lqda;")
    public static class689 field9770 = new class689(4);

    @OriginalMember(owner = "client!qda", name = "h", descriptor = "Lqda;")
    public static class689 field9771 = new class689(1);

    @OriginalMember(owner = "client!qda", name = "i", descriptor = "Lqda;")
    public static class689 field9772 = new class689(2);

    @OriginalMember(owner = "client!qda", name = "j", descriptor = "Lqda;")
    public static class689 field9773 = new class689(4);

    @OriginalMember(owner = "client!qda", name = "k", descriptor = "Lqda;")
    public static class689 field9774 = new class689(2);

    @OriginalMember(owner = "client!qda", name = "l", descriptor = "Lqda;")
    public static class689 field9775 = new class689(4);

    @OriginalMember(owner = "client!qda", name = "m", descriptor = "[Lrba;")
    public static class102[] field9776 = new class102[16];

    @OriginalMember(owner = "client!qda", name = "n", descriptor = "Lqj;")
    public static class511 field9777 = new class511(3, 5);

    @OriginalMember(owner = "client!qda", name = "o", descriptor = "Lhp;")
    public static class329 field9778 = new class329();

    @OriginalMember(owner = "client!qda", name = "p", descriptor = "J")
    public static long field9779 = 0L;

    @OriginalMember(owner = "client!qda", name = "q", descriptor = "[I")
    public static int[] field9780 = new int[6];

    @OriginalMember(owner = "client!qda", name = "s", descriptor = "Leda;")
    public static class116 field9782 = new class116(68, 6);

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "I")
    public static int field9765;

    @OriginalMember(owner = "client!qda", name = "d", descriptor = "I")
    public static int field9767;

    @OriginalMember(owner = "client!qda", name = "e", descriptor = "I")
    public static int field9768;

    @OriginalMember(owner = "client!qda", name = "r", descriptor = "Lvo;")
    public static class345 field9781;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(B)V", line = 7)
    public static void method3881(byte arg0) {
        field9778 = null;
        field9777 = null;
        field9781 = null;
        field9770 = null;
        field9776 = null;
        field9775 = null;
        if (arg0 < 109) {
            field9770 = null;
        }
        field9769 = null;
        field9771 = null;
        field9780 = null;
        field9782 = null;
        field9772 = null;
        field9774 = null;
        field9766 = null;
        field9773 = null;
    }

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(B)V", line = 35)
    public static final void method3882(byte arg0) {
        if (arg0 != 86) {
            field9770 = null;
        }
        field9767++;
        if (class636.field9031 < 1024.0F) {
            class636.field9031 = 1024.0F;
        }
        if (class636.field9031 > 3072.0F) {
            class636.field9031 = 3072.0F;
        }
        while (class473.field6790 >= 16384.0F) {
            class473.field6790 -= 16384.0F;
        }
        while (class473.field6790 < 0.0F) {
            class473.field6790 += 16384.0F;
        }
        int var1 = class606.field8728 >> 9;
        int var2 = class392.field5704 >> 9;
        int var3 = class603.method3433(class392.field5704, class416.field5926, class606.field8728, arg0 ^ 0xFFFFFF8C);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < class430.field6136 - 4 && var2 < (class580.field8504 - 4)) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class416.field5926;
                    if (var7 < 3 && class151.method1151(var6, var5, (byte) -49)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class583.field8545.field1696 != null && class583.field8545.field1696[var7] != null) {
                        var8 = (class583.field8545.field1696[var7][var5][var6] & 0xFF) * 8;
                    }
                    if (class687.field9745 != null && class687.field9745[var7] != null) {
                        int var9 = var3 - (class687.field9745[var7].method3858(var6, var5, (byte) 15) - var8);
                        if (var4 < var9) {
                            var4 = var9;
                        }
                    }
                }
            }
        }
        int var10 = (var4 >> 2) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 > class487.field6964) {
            class487.field6964 += (var10 - class487.field6964) / 24;
        } else if (var10 < class487.field6964) {
            class487.field6964 += (var10 - class487.field6964) / 80;
        }
    }

    @OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(I)V", line = 125)
    private class689(int arg0) {
        this.field9764 = arg0;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIIIIIIIIB)V", line = 134)
    public static final void method3883(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        field9765++;
        if (arg9 != -85) {
            method3881((byte) -43);
        }
        if (!class56.method437((byte) 61, arg7)) {
            return;
        }
        if (class700.field9917[arg7] == null) {
            client.method696(class265.field3806[arg7], -1, arg4, arg0, arg5, arg3, arg6, arg2, arg8, arg1);
        } else {
            client.method696(class700.field9917[arg7], -1, arg4, arg0, arg5, arg3, arg6, arg2, arg8, arg1);
        }
    }

    @OriginalMember(owner = "client!qda", name = "toString", descriptor = "()Ljava/lang/String;", line = 156)
    public final String toString() {
        field9768++;
        throw new IllegalStateException();
    }
}

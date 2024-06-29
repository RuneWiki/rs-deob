import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public abstract class class414 {

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "[I")
    public static int[] field5998 = new int[100];

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "Lft;")
    public static class4 field5999 = new class4();

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "Lsk;")
    public static class423 field6002 = new class423("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "I")
    public static int field5995;

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "I")
    public static int field5996;

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(JB)V", line = 11)
    public static final void method2437(long arg0, byte arg1) {
        field6001++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class483.method2913(arg1 + 122, arg0 - 1L);
            class483.method2913(0, 1L);
        } else {
            class483.method2913(0, arg0);
        }
        if (arg1 != -122) {
            method2441(null, null, 87);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)Z", line = 35)
    public final boolean method2438(byte arg0) {
        field6000++;
        if (arg0 != -58) {
            field5999 = null;
        }
        return this.method1689((byte) 93) || this.method1696(-54) || this.method1682((byte) 38);
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIIIIII)V", line = 55)
    public static final void method2439(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 != 64) {
            return;
        }
        field5995++;
        if (arg0 >= class355.field5296 && class320.field4818 >= arg3 && arg6 >= class248.field3808 && class478.field7310 >= arg7) {
            class158.method1011(arg7, arg6, arg4, 2100062828, arg1, arg3, arg0, arg2);
        } else {
            class211.method1300(arg4, arg3, (byte) 102, arg2, arg1, arg7, arg0, arg6);
        }
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(B)V", line = 74)
    public static void method2440(byte arg0) {
        field5999 = null;
        field5998 = null;
        int var1 = 77 / ((17 - arg0) / 34);
        field6002 = null;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "([[BLq;I)V", line = 87)
    public static final void method2441(byte[][] arg0, class282 arg1, int arg2) {
        field5996++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg0.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg0[var5];
            if (var10 != null) {
                class40 var11 = new class40(var10);
                int var12 = class61.field1032[var5] >> 8;
                int var13 = class61.field1032[var5] & 0xFF;
                int var14 = var12 * 64 - class381.field5550;
                int var15 = var13 * 64 - class320.field4827;
                class233.method1400(false);
                arg1.method1729(var11, var14, var15, class91.field1641, class381.field5550, arg2 ^ 0x7, class320.field4827);
                arg1.method1720(class345.field5116, var11, var3, var15, -108, var14);
                if (!arg1.field4301 && class178.field2783 / 8 == var12 && class451.field6933 / 8 == var13 && var3[0] != -1) {
                    class96.field1741 = class466.field7155.method2552(var3[3], (byte) 87, class507.field7670, var3[1], var3[2], var3[0]);
                    class366.field5378 = var3[4];
                }
            }
        }
        for (int var6 = arg2; var6 < var4; var6++) {
            int var7 = (class61.field1032[var6] >> 8) * 64 - class381.field5550;
            int var8 = (class61.field1032[var6] & 0xFF) * 64 - class320.field4827;
            byte[] var9 = arg0[var6];
            if (var9 == null && class451.field6933 < 800) {
                class233.method1400(false);
                arg1.method1727(64, (byte) -9, 64, var8, var7);
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)I")
    public abstract int method1686(int arg0);

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)V")
    public abstract void method1693(int arg0);

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)Lei;")
    public abstract class112 method1684(int arg0);

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(B)V")
    public abstract void method1691(byte arg0);

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "(I)I")
    public abstract int method1690(int arg0);

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "(B)Z")
    public abstract boolean method1682(byte arg0);

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "(B)Z")
    public abstract boolean method1689(byte arg0);

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "(I)Z")
    public abstract boolean method1696(int arg0);
}

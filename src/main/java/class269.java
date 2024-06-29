import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class269 {

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    private int field4752 = 0;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "Ldk;")
    private class275 field4756;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "Lqk;")
    public static class207 field4753 = class24.method212(255, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "Lqk;")
    public static class207 field4765 = class24.method212(255, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "Z")
    public static boolean field4768 = true;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "Lqk;")
    public static class207 field4767 = class24.method212(255, "<)4col>");

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "Lqk;")
    public static class207 field4759 = class24.method212(255, "Konfig geladen)3");

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "Lij;")
    private class194 field4755;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
    public static void method1835(int arg0) {
        field4759 = null;
        field4767 = null;
        if (arg0 < 29) {
            field4757 = 76;
        }
        field4753 = null;
        field4765 = null;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)Lij;")
    public final class194 method1836(int arg0) {
        field4760++;
        this.field4752 = 0;
        if (arg0 != 10868) {
            method1838((byte) -16);
        }
        return this.method1841(96);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIBIII)V")
    public static final void method1837(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 >= -108) {
            method1838((byte) 94);
        }
        field4754++;
        if (arg1 > class204.field3602 || arg3 < class204.field3580) {
            return;
        }
        boolean var6;
        if (arg0 < class124.field2158) {
            var6 = false;
            arg0 = class124.field2158;
        } else if (arg0 <= class88.field1599) {
            var6 = true;
        } else {
            arg0 = class88.field1599;
            var6 = false;
        }
        boolean var7;
        if (arg5 < class124.field2158) {
            var7 = false;
            arg5 = class124.field2158;
        } else if (class88.field1599 < arg5) {
            var7 = false;
            arg5 = class88.field1599;
        } else {
            var7 = true;
        }
        if (class204.field3580 <= arg1) {
            class215.method1544(arg0, arg5, class15.field238[arg1++], arg4, 87);
        } else {
            arg1 = class204.field3580;
        }
        if (class204.field3602 >= arg3) {
            class215.method1544(arg0, arg5, class15.field238[arg3--], arg4, -15);
        } else {
            arg3 = class204.field3602;
        }
        if (var6 && var7) {
            for (int var8 = arg1; var8 <= arg3; var8++) {
                int[] var9 = class15.field238[var8];
                var9[arg0] = var9[arg5] = arg4;
            }
        } else if (var6) {
            for (int var11 = arg1; var11 <= arg3; var11++) {
                class15.field238[var11][arg0] = arg4;
            }
        } else if (var7) {
            for (int var10 = arg1; var10 <= arg3; var10++) {
                class15.field238[var10][arg5] = arg4;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V")
    public static final void method1838(byte arg0) {
        field4761++;
        class247 var1 = class70.field1244;
        synchronized (class70.field1244) {
            class41.field814 = class273.field4801;
            class78.field1426++;
            if (class219.field3863 >= 0) {
                while (class8.field109 != class219.field3863) {
                    int var2 = class127.field2193[class8.field109];
                    class8.field109 = class8.field109 + 1 & 0x7F;
                    if (var2 < 0) {
                        class165.field2920[~var2] = false;
                    } else {
                        class165.field2920[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class165.field2920[var3] = false;
                }
                class219.field3863 = class8.field109;
            }
            if (arg0 < 27) {
                method1835(78);
            }
            class273.field4801 = class14.field220;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BI)V")
    public static final void method1839(byte arg0, int arg1) {
        class176.field3180.method1383(-8052, arg1);
        field4766++;
        if (arg0 != 74) {
            method1838((byte) -11);
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Ldk;)V")
    public class269(class275 arg0) {
        this.field4756 = arg0;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIZIIIIII)V")
    public static final void method1840(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4763++;
        int var9 = arg5 - arg0;
        int var10 = (arg3 - arg4 << 16) / var9;
        if (arg2) {
            field4767 = null;
        }
        int var11 = arg1 - arg7;
        int var12 = (arg6 - arg8 << 16) / var11;
        class111.method794(arg0, var12, var10, 0, arg5, arg7, arg8, 0, arg4, 117, arg1);
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)Lij;")
    public final class194 method1841(int arg0) {
        field4758++;
        int var2 = 44 / ((10 - arg0) / 57);
        if (this.field4752 > 0 && this.field4756.field4824[this.field4752 - 1] != this.field4755) {
            class194 var3 = this.field4755;
            this.field4755 = var3.field3410;
            return var3;
        }
        while (this.field4752 < this.field4756.field4813) {
            class194 var4 = this.field4756.field4824[this.field4752++].field3410;
            if (this.field4756.field4824[this.field4752 - 1] != var4) {
                this.field4755 = var4.field3410;
                return var4;
            }
        }
        return null;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class452 extends class17 {

    @OriginalMember(owner = "client!bca", name = "p", descriptor = "I")
    private int field6510;

    @OriginalMember(owner = "client!bca", name = "l", descriptor = "I")
    private int field6506;

    @OriginalMember(owner = "client!bca", name = "j", descriptor = "I")
    private int field6504;

    @OriginalMember(owner = "client!bca", name = "m", descriptor = "I")
    private int field6507;

    @OriginalMember(owner = "client!bca", name = "i", descriptor = "I")
    public static int field6503 = 0;

    @OriginalMember(owner = "client!bca", name = "f", descriptor = "I")
    public static int field6500 = 0;

    @OriginalMember(owner = "client!bca", name = "g", descriptor = "I")
    public static int field6501;

    @OriginalMember(owner = "client!bca", name = "h", descriptor = "I")
    public static int field6502;

    @OriginalMember(owner = "client!bca", name = "k", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!bca", name = "n", descriptor = "I")
    public static int field6508;

    @OriginalMember(owner = "client!bca", name = "o", descriptor = "I")
    public static int field6509;

    @OriginalMember(owner = "client!bca", name = "q", descriptor = "I")
    public static int field6511;

    @OriginalMember(owner = "client!bca", name = "r", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lwe;Lvh;B)Lph;")
    public static final class699 method2630(class115 arg0, class125 arg1, byte arg2) {
        ++field6508;
        class699 var3 = class514.method3052((byte) -117);
        var3.field9909 = arg1;
        if (arg2 <= 120) {
            field6500 = 13;
        }
        var3.field9900 = arg1.field2054;
        if (var3.field9900 == -1) {
            var3.field9908 = new class373(260);
        } else if (var3.field9900 == -2) {
            var3.field9908 = new class373(10000);
        } else if (var3.field9900 <= 18) {
            var3.field9908 = new class373(20);
        } else if (~var3.field9900 >= -99) {
            var3.field9908 = new class373(100);
        } else {
            var3.field9908 = new class373(260);
        }
        var3.field9908.method2224(arg0, 1);
        var3.field9908.method2226(55, var3.field9909.method997((byte) 57));
        var3.field9901 = 0;
        return var3;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lla;)V")
    public static final void method2631(class395 arg0) {
        class662.field9307 = arg0;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2632(int arg0, String arg1) {
        ++field6511;
        if (arg1 != null) {
            if ((~class520.field7677 > -201 || class165.field2721) && class520.field7677 < 200) {
                String var3 = class57.method494(arg1, (byte) 71);
                if (var3 != null) {
                    for (int var4 = 0; var4 < class520.field7677; ++var4) {
                        String var10 = class57.method494(class437.field6290[var4], (byte) 80);
                        if (var10 != null && var10.equals(var3)) {
                            class300.method1846(4, arg1 + class343.field4787.method2059(class238.field3511, true), 0);
                            return;
                        }
                        if (class661.field9302[var4] != null) {
                            String var11 = class57.method494(class661.field9302[var4], (byte) 120);
                            if (var11 != null && var11.equals(var3)) {
                                class300.method1846(4, arg1 + class343.field4787.method2059(class238.field3511, true), 0);
                                return;
                            }
                        }
                    }
                    int var5 = 119 / ((-45 - arg0) / 34);
                    for (int var6 = 0; var6 < class90.field1333; ++var6) {
                        String var8 = class57.method494(class623.field8878[var6], (byte) 120);
                        if (var8 != null && var8.equals(var3)) {
                            class300.method1846(4, class343.field4792.method2059(class238.field3511, true) + arg1 + class343.field4793.method2059(class238.field3511, true), 0);
                            return;
                        }
                        if (class409.field5848[var6] != null) {
                            String var9 = class57.method494(class409.field5848[var6], (byte) 91);
                            if (var9 != null && var9.equals(var3)) {
                                class300.method1846(4, class343.field4792.method2059(class238.field3511, true) + arg1 + class343.field4793.method2059(class238.field3511, true), 0);
                                return;
                            }
                        }
                    }
                    if (class57.method494(class103.field1708.field3848, (byte) 74).equals(var3)) {
                        class300.method1846(4, class343.field4790.method2059(class238.field3511, true), 0);
                    } else {
                        ++class5.field42;
                        class699 var7 = method2630(class699.field9897, class577.field8446, (byte) 126);
                        var7.field9908.method2753((byte) 83, class252.method1609(0, arg1));
                        var7.field9908.method2703(false, arg1);
                        class149.method1134(var7, true);
                    }
                }
            } else {
                class300.method1846(4, class343.field4759.method2059(class238.field3511, true), 0);
                String var2 = class343.field4760.method2059(class238.field3511, true);
                if (var2 != null) {
                    class300.method1846(4, var2, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(IIZ)V")
    public final void method64(int arg0, int arg1, boolean arg2) {
        ++field6501;
        if (!arg2) {
            field6505 = -24;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(III)V")
    public final void method65(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method2633(99, (byte) -5);
        }
        ++field6512;
        int var4 = this.field6506 * arg2 >> 12;
        int var5 = this.field6510 * arg2 >> 12;
        int var6 = this.field6507 * arg0 >> 12;
        int var7 = this.field6504 * arg0 >> 12;
        class624.method3520(var5, var6, super.field259, super.field262, var7, (byte) -23, var4, super.field260);
    }

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "(III)V")
    public final void method66(int arg0, int arg1, int arg2) {
        ++field6509;
        if (arg0 != -1) {
            this.field6504 = 75;
        }
        int var4 = this.field6506 * arg1 >> 12;
        int var5 = this.field6510 * arg1 >> 12;
        int var6 = this.field6507 * arg2 >> 12;
        int var7 = this.field6504 * arg2 >> 12;
        class286.method1758(var7, var4, var5, arg0 + 1932, var6, super.field262);
    }

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(IIIIIII)V")
    public class452(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field6510 = arg2;
        this.field6506 = arg0;
        this.field6504 = arg3;
        this.field6507 = arg1;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(IB)Z")
    public static final boolean method2633(int arg0, byte arg1) {
        ++field6502;
        if (arg1 != 127) {
            method2630((class115) null, (class125) null, (byte) 27);
        }
        return (-arg0 & arg0) == arg0;
    }
}

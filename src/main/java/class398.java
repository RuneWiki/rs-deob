import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class398 extends class646 {

    @OriginalMember(owner = "client!wm", name = "I", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!wm", name = "J", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!wm", name = "K", descriptor = "I")
    private int field5757;

    @OriginalMember(owner = "client!wm", name = "M", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!wm", name = "N", descriptor = "I")
    private int field5760;

    @OriginalMember(owner = "client!wm", name = "O", descriptor = "I")
    private int field5761;

    @OriginalMember(owner = "client!wm", name = "P", descriptor = "I")
    public static int field5762;

    @OriginalMember(owner = "client!wm", name = "L", descriptor = "Lvo;")
    public static class345 field5758;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V")
    public static void method2419(byte arg0) {
        if (arg0 != 5) {
            field5758 = null;
        }
        field5758 = null;
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(I)V")
    private class398(int arg0) {
        super(0, false);
        this.method2421(-20279, arg0);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2420(int arg0, String arg1) {
        ++field5762;
        if (arg1 != null) {
            if (arg1.startsWith("*")) {
                arg1 = arg1.substring(1);
            }
            String var2 = class57.method494(arg1, (byte) 102);
            if (var2 != null) {
                for (int var3 = 0; var3 < class520.field7677; ++var3) {
                    String var4 = class437.field6290[var3];
                    if (var4.startsWith("*")) {
                        var4 = var4.substring(1);
                    }
                    String var5 = class57.method494(var4, (byte) 120);
                    if (var5 != null && var5.equals(var2)) {
                        --class520.field7677;
                        for (int var6 = var3; class520.field7677 > var6; ++var6) {
                            class437.field6290[var6] = class437.field6290[var6 + 1];
                            class661.field9302[var6] = class661.field9302[var6 + 1];
                            class311.field4318[var6] = class311.field4318[var6 + 1];
                            class418.field5954[var6] = class418.field5954[var6 + 1];
                            class351.field4937[var6] = class351.field4937[var6 + 1];
                            class412.field5874[var6] = class412.field5874[var6 + 1];
                        }
                        ++class434.field6247;
                        class419.field5960 = class330.field4562;
                        class699 var7 = class452.method2630(class699.field9897, class133.field2153, (byte) 121);
                        var7.field9908.method2753((byte) 52, class252.method1609(0, arg1));
                        var7.field9908.method2703(false, arg1);
                        class149.method1134(var7, true);
                        break;
                    }
                }
                if (arg0 != 1) {
                    field5758 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V")
    public class398() {
        this(0);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lek;IB)V")
    public final void method295(class465 arg0, int arg1, byte arg2) {
        if (arg2 >= 7) {
            ++field5755;
            if (~arg1 == -1) {
                this.method2421(-20279, arg0.method2714(true));
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)[[I")
    public final int[][] method298(int arg0, int arg1) {
        ++field5756;
        if (arg0 != -12424) {
            return null;
        } else {
            int[][] var3 = super.field9164.method1002(44, arg1);
            if (super.field9164.field2082) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; class89.field1330 > var7; ++var7) {
                    var4[var7] = this.field5757;
                    var5[var7] = this.field5761;
                    var6[var7] = this.field5760;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(II)V")
    private final void method2421(int arg0, int arg1) {
        this.field5757 = 4080 & arg1 >> 12;
        this.field5761 = (65280 & arg1) >> 4;
        ++field5759;
        if (arg0 == -20279) {
            this.field5760 = arg1 << 4 & 4080;
        }
    }
}

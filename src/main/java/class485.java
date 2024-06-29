import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public abstract class class485 implements class104 {

    @OriginalMember(owner = "client!um", name = "m", descriptor = "Lbf;")
    public class497 field6672;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "Lsea;")
    public class648 field6673;

    @OriginalMember(owner = "client!um", name = "l", descriptor = "Lsea;")
    private class648 field6671;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    private int field6661;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    public static int field6663;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "I")
    public static int field6664;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "I")
    public static int field6666;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "I")
    public static int field6667;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "I")
    public static int field6670;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "I")
    public static int field6674;

    @OriginalMember(owner = "client!um", name = "p", descriptor = "I")
    public static int field6675;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "J")
    private long field6665;

    @OriginalMember(owner = "client!um", name = "i", descriptor = "Lrt;")
    public static class208 field6668;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "Lla;")
    private class417 field6662;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(B)V")
    public static void method2756(byte arg0) {
        field6668 = null;
        if (arg0 != 23) {
            field6668 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)Z")
    public boolean method475(byte arg0) {
        if (arg0 != -90) {
            this.method475((byte) 10);
        }
        field6660++;
        boolean var2 = true;
        if (!this.field6673.method3623(-69, this.field6672.field6759)) {
            var2 = false;
        }
        if (!this.field6671.method3623(arg0 ^ 0x2, this.field6672.field6759)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
    public void method476(int arg0) {
        field6669++;
        if (arg0 != -12935) {
            this.field6665 = 88L;
        }
        class283 var2 = class699.method3918(this.field6672.field6759, -100, this.field6671);
        this.field6662 = class334.field4506.method129(var2, class168.method1190(this.field6673, this.field6672.field6759), true);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)V")
    public static final void method2757(boolean arg0) {
        field6670++;
        if (!arg0) {
            field6668 = null;
        }
        if (class450.field6175 < 0) {
            return;
        }
        long var1 = class577.method3295((byte) 15);
        class450.field6175 = (int) ((long) class450.field6175 - (var1 - class668.field9388));
        if (class450.field6175 <= 0) {
            class14.field151 = class318.field4362.field9822;
            class382.field5241 = class318.field4362.field9816;
            class328.field4448 = class318.field4362.field9810;
            class54.field612 = class318.field4362.field9820;
            class171.field2476 = class318.field4362.field9812;
            class284.field3907 = class318.field4362.field9821;
            class525.field7116 = class318.field4362.field9826;
            class529.field7167 = class318.field4362.field9829;
            class341.field4581 = class318.field4362.field9817;
            class454.field6292 = class318.field4362.field9814;
            class450.field6175 = -1;
        } else {
            int var3 = (class450.field6175 << 8) / class233.field3216;
            int var4 = 255 - var3;
            float var5 = (float) var3 / 255.0F;
            float var6 = 1.0F - var5;
            class525.field7116 = ((class27.field335 & 0xFF00FF) * var3 + (class318.field4362.field9826 & 0xFF00FF) * var4 & 0xFF00FF00) + ((class27.field335 & 0xFF00) * var3 + (class318.field4362.field9826 & 0xFF00) * var4 & 0xFF0000) >>> 8;
            class54.field612 = (class318.field4362.field9820 - class113.field1570) * var6 + class113.field1570;
            class341.field4581 = class354.field4705 * var3 + class318.field4362.field9817 * var4 >> 8;
            class328.field4448 = (class318.field4362.field9810 - class120.field1659) * var6 + class120.field1659;
            class14.field151 = ((class244.field3324 & 0xFF00) * var3 + (class318.field4362.field9822 & 0xFF00) * var4 & 0xFF0000) + ((class244.field3324 & 0xFF00FF) * var3 + (class318.field4362.field9822 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
            class171.field2476 = (class318.field4362.field9812 - class108.field1502) * var6 + class108.field1502;
            class454.field6292 = (class318.field4362.field9814 - class222.field3095) * var6 + class222.field3095;
            class382.field5241 = (class318.field4362.field9816 - class63.field730) * var6 + class63.field730;
            class529.field7167 = (class318.field4362.field9829 - class426.field5972) * var6 + class426.field5972;
            if (class239.field3285 != class318.field4362.field9821) {
                class284.field3907 = class610.field8463.method91(class239.field3285, class318.field4362.field9821, var6, class284.field3907);
            }
        }
        class668.field9388 = var1;
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(B)Lwp;")
    public static final class163 method2758(byte arg0) {
        field6675++;
        if (class510.field6985 == null || class586.field8249 == null) {
            return null;
        } else if (arg0 == -55) {
            for (class163 var1 = (class163) class586.field8249.method3764(-21495); var1 != null; var1 = (class163) class586.field8249.method3764(-21495)) {
                class165 var2 = class510.field6981.method3709((byte) 122, var1.field2338);
                if (var2 != null && var2.field2404 && var2.method1158(class510.field6978, arg0 ^ 0xFFFFFFA7)) {
                    return var1;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2759(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6663++;
        if (arg5 < 67) {
            field6668 = null;
        }
        if (!client.method1683(arg1, (byte) 103)) {
            return;
        }
        if (class165.field2412[arg1] == null) {
            client.method1685(class167.field2439[arg1], -1, arg2, arg3, arg6, arg9, arg4, arg0, arg8, arg7);
        } else {
            client.method1685(class165.field2412[arg1], -1, arg2, arg3, arg6, arg9, arg4, arg0, arg8, arg7);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZZ)V")
    public final void method647(boolean arg0, boolean arg1) {
        field6674++;
        if (!arg1) {
            this.field6671 = null;
        }
        int var3 = this.field6672.field6762.method3361((byte) -128, this.field6672.field6764, class178.field2581) + this.field6672.field6765;
        int var4 = this.field6672.field6763.method59(1, this.field6672.field6757, class157.field2277) + this.field6672.field6754;
        this.method481(var3, -128, arg0, var4);
        this.method480(arg0, var3, var4, (byte) 113);
        String var5 = class618.field8608.method277(-37);
        if ((class577.method3295((byte) 15) - this.field6665) > 10000L) {
            var5 = var5 + " (" + class618.field8608.method268(false).method3065((byte) -78) + ")";
        }
        this.field6662.method2418(false, -1, var5, this.field6672.field6760 + var4 + (this.field6672.field6757 / 2) + 4, this.field6672.field6758, var3 + (this.field6672.field6764 / 2));
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIZI)V")
    public abstract void method481(int arg0, int arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZIIB)V")
    public abstract void method480(boolean arg0, int arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lsea;Lsea;Lbf;)V")
    public class485(class648 arg0, class648 arg1, class497 arg2) {
        this.field6672 = arg2;
        this.field6673 = arg0;
        this.field6671 = arg1;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IZ)I")
    public static final int method2760(int arg0, boolean arg1) {
        if (arg1) {
            field6664 = -126;
        }
        field6667++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)I")
    public final int method2761(int arg0) {
        field6666++;
        int var2 = -98 / ((arg0 - 24) / 62);
        int var3 = class618.field8608.method273(13084);
        int var4 = var3 * 100;
        if (this.field6661 == var3 && var3 != 0) {
            int var5 = class618.field8608.method276((byte) 100);
            if (var3 < var5) {
                long var6 = this.field6665 - class618.field8608.method269(-1081028616);
                if (var6 > 0L) {
                    long var8 = var6 * 10000L / (long) var3 * (long) (var5 - var3);
                    long var10 = (class577.method3295((byte) 15) - this.field6665) * 10000L;
                    if (var8 <= var10) {
                        var4 = var5 * 100;
                    } else {
                        var4 = (int) (var10 * 100L * (long) (var5 - var3) / var8 + (long) (var3 * 100));
                    }
                }
            }
        } else {
            this.field6661 = var3;
            this.field6665 = class577.method3295((byte) 15);
        }
        return var4;
    }
}

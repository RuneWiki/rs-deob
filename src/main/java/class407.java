import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class407 extends class282 {

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "[I")
    private int[] field5573 = new int[this.field3803];

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    private int field5577;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    private int field5580;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
    public static int field5582;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "[B")
    private byte[] field5579;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
    public final void method1114(boolean arg0) {
        this.field5577 = Math.abs(this.field5577);
        ++field5582;
        if (this.field5577 >= 4096) {
            this.field5577 = 4095;
        }
        this.method2313(this.field5580++, (byte) (this.field5577 >> 4));
        if (arg0) {
            method2452((byte) -115);
        }
        this.field5577 = 0;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZLmr;)I")
    public static final int method2451(boolean arg0, class86 arg1) {
        ++field5576;
        if (!arg0) {
            return 16;
        } else if (~arg1.field1147 == -1) {
            return 0;
        } else {
            if (arg1.field1154 != -1) {
                class86 var2 = null;
                if (arg1.field1154 >= 32768) {
                    if (~arg1.field1154 <= -32769) {
                        var2 = class413.field5644[arg1.field1154 - 32768];
                    }
                } else {
                    var2 = class221.field2941[arg1.field1154];
                }
                if (var2 != null) {
                    int var3 = -var2.field6501 + arg1.field6501;
                    int var4 = -var2.field6507 + arg1.field6507;
                    if (~var3 != -1 || var4 != 0) {
                        arg1.method542((int) (2607.5945876176133D * Math.atan2((double) var3, (double) var4)) & 16383, 21);
                    }
                }
            }
            if (!(arg1 instanceof class487)) {
                if (arg1 instanceof class121) {
                    class121 var5 = (class121) arg1;
                    if (var5.field1793 != -1 && (var5.field1203 == 0 || var5.field1196 > 0)) {
                        int var6 = -((-class162.field2260 - class162.field2260 + var5.field1793) * 64) + var5.field6501;
                        int var7 = -((-class266.field3511 + var5.field1787 + -class266.field3511) * 64) + var5.field6507;
                        if (~var6 != -1 || ~var7 != -1) {
                            var5.method542((int) (Math.atan2((double) var6, (double) var7) * 2607.5945876176133D) & 16383, 117);
                        }
                        var5.field1793 = -1;
                    }
                }
            } else {
                class487 var8 = (class487) arg1;
                if (var8.field6751 != -1 && (var8.field1203 == 0 || var8.field1196 > 0)) {
                    var8.method542(var8.field6751, 40);
                    var8.field6751 = -1;
                }
            }
            return arg1.method544((byte) 75);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V")
    public final void method1116(int arg0, int arg1, int arg2) {
        ++field5578;
        this.field5577 += this.field5573[arg1] * arg2 >> 12;
        if (arg0 < 31) {
            this.field5579 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)V")
    public void method2313(int arg0, byte arg1) {
        ++field5581;
        this.field5579[this.field5580++] = (byte) (class99.method612(arg1 >> 1, 127) + 127);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
    public final void method1115(int arg0) {
        ++field5574;
        this.field5577 = 0;
        this.field5580 = 0;
        int var2 = -11 / ((arg0 - -63) / 36);
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)V")
    public static final void method2452(byte arg0) {
        ++field5575;
        if (arg0 < 39) {
            method2452((byte) -112);
        }
        class300.field4012.method495(-85);
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(IIIIIF)V")
    public class407(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < super.field3803; ++var7) {
            this.field5573[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }
}

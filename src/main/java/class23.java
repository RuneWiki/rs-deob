import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class23 extends class478 {

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "I")
    private int field175 = -1;

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "I")
    public int field171;

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "I")
    public int field177;

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "[I")
    public int[] field170;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)[[I", line = 3)
    public int[][] method104(boolean arg0, int arg1) {
        ++field176;
        int[][] var3 = super.field6889.method2091(-115, arg1);
        if (!arg0) {
            this.field175 = -45;
        }
        if (super.field6889.field4765 && this.method106((byte) -67)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (~class407.field5435 != ~this.field171 ? this.field171 * arg1 / class407.field5435 : arg1) * this.field177;
            if (~class436.field6154 == ~this.field177) {
                for (int var8 = 0; ~var8 > ~class436.field6154; ++var8) {
                    int var9 = this.field170[var7++];
                    var6[var8] = class105.method572(var9 << 4, 4080);
                    var5[var8] = class105.method572(var9 >> 4, 4080);
                    var4[var8] = class105.method572(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; class436.field6154 > var10; ++var10) {
                    int var11 = this.field177 * var10 / class436.field6154;
                    int var12 = this.field170[var7 - -var11];
                    var6[var10] = class105.method572(255, var12) << 4;
                    var5[var10] = class105.method572(var12, 65280) >> 4;
                    var4[var10] = class105.method572(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILwp;BI)V", line = 81)
    public static final void method105(int arg0, class452 arg1, byte arg2, int arg3) {
        ++field173;
        class247.field3065 = arg1;
        class73.field766 = arg3;
        int var4 = -56 / ((-57 - arg2) / 49);
        class91.field915 = arg0;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILnp;I)V", line = 93)
    public final void method33(int arg0, class115 arg1, int arg2) {
        ++field172;
        if (arg2 == 0) {
            this.field175 = arg1.method643((byte) -77);
        }
        if (arg0 != 255) {
            method105(124, (class452) null, (byte) -42, 8);
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V", line = 112)
    public class23() {
        super(0, false);
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)Z", line = 115)
    public final boolean method106(byte arg0) {
        if (arg0 != -67) {
            this.field171 = -79;
        }
        ++field169;
        if (this.field170 != null) {
            return true;
        } else if (~this.field175 <= -1) {
            class550 var2 = ~class16.field127 <= -1 ? class550.method3122(class407.field5434, class16.field127, this.field175) : class550.method3113(class407.field5434, this.field175);
            var2.method3118();
            this.field170 = var2.method3111();
            this.field171 = var2.field7872;
            this.field177 = var2.field7873;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(Z)V", line = 142)
    public final void method107(boolean arg0) {
        ++field174;
        super.method107(arg0);
        this.field170 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "()V", line = 155)
    public static final void method108() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class642.field9080.length; ++var1) {
                if (!class642.field9080[var1].method3323()) {
                    synchronized (class642.field9080[var1]) {
                        class642.field9080[var1].notify();
                    }
                    var0 = false;
                } else {
                    class180.field2020[var1] = class642.field9080[var1].method3324();
                }
            }
            if (var0) {
                class642.field9080[class642.field9080.length - 1].method3321();
                class600.method3357(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class642.field9080.length - 1; ++var4) {
                        if (!class642.field9080[var4].method3323()) {
                            synchronized (class642.field9080[var4]) {
                                class642.field9080[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class642.field9080.length - 2; ++var6) {
                            class642.field9080[var6].method3321();
                        }
                        class600.method3357(2);
                        while (!class642.field9080[0].method3323()) {
                            synchronized (class642.field9080[0]) {
                                class642.field9080[0].notify();
                            }
                            try {
                                class452.method2602(1L, (byte) -97);
                            } catch (Exception var9) {
                            }
                        }
                        class642.field9080[0].method3321();
                        return;
                    }
                    try {
                        class452.method2602(1L, (byte) -97);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class452.method2602(1L, (byte) -97);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)I", line = 250)
    public final int method109(int arg0) {
        if (arg0 != -1) {
            method105(-45, (class452) null, (byte) -21, -29);
        }
        ++field178;
        return this.field175;
    }
}

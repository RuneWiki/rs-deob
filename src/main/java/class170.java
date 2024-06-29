import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class170 extends class3 {

    @OriginalMember(owner = "client!he", name = "I", descriptor = "I")
    private int field2651 = 1;

    @OriginalMember(owner = "client!he", name = "O", descriptor = "I")
    private int field2656 = 0;

    @OriginalMember(owner = "client!he", name = "S", descriptor = "I")
    private int field2660 = 0;

    @OriginalMember(owner = "client!he", name = "G", descriptor = "[I")
    public static int[] field2650 = new int[2500];

    @OriginalMember(owner = "client!he", name = "T", descriptor = "I")
    public static int field2661 = 0;

    @OriginalMember(owner = "client!he", name = "F", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!he", name = "J", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!he", name = "L", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!he", name = "M", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!he", name = "N", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!he", name = "P", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!he", name = "Q", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!he", name = "R", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!he", name = "U", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lfh;IZ)V", line = 4)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        if (arg2) {
            field2661 = -60;
        }
        if (arg1 == 0) {
            this.field2660 = arg0.method2224(-121);
        } else if (arg1 == 1) {
            this.field2656 = arg0.method2224(-123);
        } else if (arg1 == 3) {
            this.field2651 = arg0.method2224(-128);
        }
        field2649++;
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(B)I", line = 51)
    public static final int method1173(byte arg0) {
        field2653++;
        return arg0 >= -14 ? -80 : 2;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ZII)I", line = 64)
    public static final int method1174(boolean arg0, int arg1, int arg2) {
        int var3 = class312.method2181(arg2 - 1, 200, arg1 - 1) + class312.method2181(arg2 + 1, 200, arg1 - 1) + (class312.method2181(arg2 + -1, 200, arg1 - -1) - -class312.method2181(arg2 + 1, 200, arg1 + 1));
        if (arg0) {
            method1178((class190) null, -65, (byte) -44);
        }
        field2655++;
        int var4 = class312.method2181(arg2 - 1, 200, arg1) + (class312.method2181(arg2 + 1, 200, arg1) - (-class312.method2181(arg2, 200, arg1 - 1) - class312.method2181(arg2, 200, arg1 + 1)));
        int var5 = class312.method2181(arg2, 200, arg1);
        return var4 / 8 + var3 / 16 + var5 / 4;
    }

    @OriginalMember(owner = "client!he", name = "f", descriptor = "(B)V", line = 86)
    public static void method1175(byte arg0) {
        if (arg0 == -24) {
            field2650 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V", line = 137)
    public class170() {
        super(0, true);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)I", line = 103)
    public static final int method1176(int arg0, boolean arg1) {
        field2659++;
        if (arg1) {
            method1178((class190) null, 45, (byte) 50);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lsi;I)Z", line = 114)
    public static final boolean method1177(class264 arg0, int arg1) {
        if (arg1 != 21325) {
            return true;
        }
        field2654++;
        if (arg0.field4233 == 205) {
            class308.field5013 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BI)[I", line = 143)
    public final int[] method25(byte arg0, int arg1) {
        field2658++;
        if (arg0 < 57) {
            return (int[]) null;
        }
        int[] var3 = this.field21.method1258(arg1, 0);
        if (this.field21.field2808) {
            int var4 = class159.field2546[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class326.field5342; var6++) {
                int var7 = class163.field2591[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (this.field2660 == 0) {
                    var11 = (var7 - var4) * this.field2651;
                } else {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field2651 * var10) * 3.141592653589793D);
                }
                int var12 = var11 - (var11 & 0xFFFFF000);
                if (this.field2656 == 0) {
                    var12 = class248.field3943[(var12 & 0xFF0) >> 4] + 4096 >> 1;
                } else if (this.field2656 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(B)V", line = 211)
    public final void method20(byte arg0) {
        class291.method2061(0);
        int var2 = -95 / ((-arg0 - 20) / 58);
        field2652++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lrm;IB)V", line = 222)
    public static final void method1178(class190 arg0, int arg1, byte arg2) {
        Object[] var3 = arg0.field2940;
        field2657++;
        int var4 = (Integer) var3[0];
        class280 var5 = class284.method2008(var4, true);
        if (var5 == null) {
            return;
        }
        class350.field5587 = new int[var5.field4616];
        int var6 = 0;
        int var7 = 0;
        class264.field4299 = new String[var5.field4606];
        int var8 = 1;
        if (arg2 != -24) {
            return;
        }
        while (var3.length > var8) {
            if ((var3[var8] instanceof Integer)) {
                int var10 = (Integer) var3[var8];
                if (var10 == -2147483647) {
                    var10 = arg0.field2950;
                }
                if (var10 == -2147483646) {
                    var10 = arg0.field2949;
                }
                if (var10 == -2147483645) {
                    var10 = arg0.field2937 == null ? -1 : arg0.field2937.field4204;
                }
                if (var10 == -2147483644) {
                    var10 = arg0.field2954;
                }
                if (var10 == -2147483643) {
                    var10 = arg0.field2937 == null ? -1 : arg0.field2937.field4240;
                }
                if (var10 == -2147483642) {
                    var10 = arg0.field2951 == null ? -1 : arg0.field2951.field4204;
                }
                if (var10 == -2147483641) {
                    var10 = arg0.field2951 == null ? -1 : arg0.field2951.field4240;
                }
                if (var10 == -2147483640) {
                    var10 = arg0.field2939;
                }
                if (var10 == -2147483639) {
                    var10 = arg0.field2953;
                }
                class350.field5587[var7++] = var10;
            } else if (var3[var8] instanceof String) {
                String var9 = (String) var3[var8];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field2947;
                }
                class264.field4299[var6++] = var9;
            }
            var8++;
        }
        class266.method1879(arg1, var5, 103);
    }
}

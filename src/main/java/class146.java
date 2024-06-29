import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class146 extends class200 {

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "[I")
    private int[] field2628 = new int[3];

    @OriginalMember(owner = "client!ab", name = "W", descriptor = "I")
    private int field2635 = 3216;

    @OriginalMember(owner = "client!ab", name = "X", descriptor = "I")
    private int field2636 = 3216;

    @OriginalMember(owner = "client!ab", name = "Z", descriptor = "I")
    private int field2638 = 4096;

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "Lid;")
    public static class149 field2626 = class60.method382(" )2> <col=ffff00>", (byte) 16);

    @OriginalMember(owner = "client!ab", name = "V", descriptor = "Lid;")
    public static class149 field2634 = class60.method382("Fermer", (byte) 102);

    @OriginalMember(owner = "client!ab", name = "T", descriptor = "[J")
    public static long[] field2632 = new long[32];

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!ab", name = "S", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!ab", name = "Y", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!ab", name = "ab", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!ab", name = "U", descriptor = "Lal;")
    public static class230 field2633;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    public final void method150(int arg0) {
        int var2 = 98 % ((arg0 - -60) / 62);
        this.method1006((byte) 36);
        ++field2630;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
    public static final Class method1003(int arg0, String arg1) throws ClassNotFoundException {
        ++field2629;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else {
            if (arg0 != 10990) {
                method1004(-92);
            }
            if (arg1.equals("S")) {
                return Short.TYPE;
            } else if (arg1.equals("J")) {
                return Long.TYPE;
            } else if (arg1.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else {
                return arg1.equals("C") ? Character.TYPE : Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)V")
    public static void method1004(int arg0) {
        field2633 = null;
        field2634 = null;
        if (arg0 != 1489062284) {
            field2632 = null;
        }
        field2632 = null;
        field2626 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.field2638 = 84;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field2635 = arg0.method485(-2386);
                }
            } else {
                this.field2636 = arg0.method485(-2386);
            }
        } else {
            this.field2638 = arg0.method485(-2386);
        }
        ++field2637;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(II)I")
    public static final int method1005(int arg0, int arg1) {
        ++field2631;
        if ((arg0 < 65 || ~arg0 < -91) && (~arg0 > -193 || ~arg0 < -223 || arg0 == 215)) {
            if (~arg0 == -160) {
                return 255;
            } else if (~arg0 == -141) {
                return 156;
            } else {
                if (arg1 < 99) {
                    field2626 = null;
                }
                return arg0;
            }
        } else {
            return arg0 + 32;
        }
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(B)V")
    private final void method1006(byte arg0) {
        double var2 = Math.cos((double) ((float) this.field2635 / 4096.0F));
        this.field2628[0] = (int) (var2 * Math.sin((double) ((float) this.field2636 / 4096.0F)) * 4096.0D);
        this.field2628[1] = (int) (var2 * Math.cos((double) ((float) this.field2636 / 4096.0F)) * 4096.0D);
        this.field2628[2] = (int) (4096.0D * Math.sin((double) ((float) this.field2635 / 4096.0F)));
        int var4 = 58 % ((arg0 - -69) / 55);
        ++field2639;
        int var5 = this.field2628[0] * this.field2628[0] >> 12;
        int var6 = this.field2628[1] * this.field2628[1] >> 12;
        int var7 = this.field2628[2] * this.field2628[2] >> 12;
        int var8 = (int) (4096.0D * Math.sqrt((double) (var6 + var7 + var5 >> 12)));
        if (~var8 != -1) {
            this.field2628[2] = (this.field2628[2] << 12) / var8;
            this.field2628[0] = (this.field2628[0] << 12) / var8;
            this.field2628[1] = (this.field2628[1] << 12) / var8;
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
    public class146() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)[I")
    public final int[] method26(int arg0, byte arg1) {
        ++field2627;
        int[] var3 = super.field3638.method1879(arg0, true);
        if (arg1 != 55) {
            this.method1006((byte) 56);
        }
        if (super.field3638.field4887) {
            int var4 = class165.field3069 * this.field2638 >> 12;
            int[] var5 = this.method1368(0, arg0 + -1 & class191.field3436, false);
            int[] var6 = this.method1368(0, arg0, false);
            int[] var7 = this.method1368(0, arg0 + 1 & class191.field3436, false);
            for (int var8 = 0; ~var8 > ~class137.field2515; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class261.field4667 & var8 + -1] + -var6[var8 - -1 & class261.field4667]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (~var11 > -1) {
                    var11 = -var11;
                }
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = class183.field3296[((var12 + 1) * var12 >> 1) + var11] & 255;
                int var14 = var10 * var13 >> 8;
                int var15 = this.field2628[0] * var14 >> 12;
                int var16 = var13 * 4096 >> 8;
                int var17 = var9 * var13 >> 8;
                int var18 = this.field2628[1] * var17 >> 12;
                int var19 = this.field2628[2] * var16 >> 12;
                var3[var8] = var15 + var18 + var19;
            }
        }
        return var3;
    }
}

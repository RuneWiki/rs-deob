import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class478 extends class136 {

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "I")
    private int field7032 = 0;

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "I")
    private int field7033 = 16;

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "I")
    private int field7036 = 0;

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "I")
    private int field7034 = 2000;

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "I")
    private int field7043 = 4096;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
    public static int field7040 = 0;

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "Lsl;")
    public static class318 field7038 = new class318(43, 2);

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "I")
    public static int field7035;

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
    public static int field7039;

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
    public static int field7041;

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "I")
    public static int field7042;

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "Ljb;")
    public static class340 field7044;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)V", line = 3)
    public static void method2888(int arg0) {
        if (arg0 == 255) {
            field7044 = null;
            field7038 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)[I", line = 17)
    public final int[] method82(int arg0, int arg1) {
        ++field7041;
        int var3 = 125 % ((arg0 - 67) / 50);
        int[] var4 = super.field1957.method2887((byte) -112, arg1);
        if (super.field1957.field7031) {
            int var5 = this.field7043 >> 1;
            int[][] var6 = super.field1957.method2885(10);
            Random var7 = new Random((long) this.field7032);
            for (int var8 = 0; var8 < this.field7034; ++var8) {
                int var9 = ~this.field7043 >= -1 ? this.field7036 : -var5 + this.field7036 + class245.method1609((byte) 94, var7, this.field7043);
                int var10 = 255 & var9 >> 4;
                int var11 = class245.method1609((byte) 94, var7, class467.field6889);
                int var12 = class245.method1609((byte) 94, var7, class227.field3310);
                int var13 = (class25.field297[var10] * this.field7033 >> 12) + var11;
                int var14 = (class489.field7187[var10] * this.field7033 >> 12) + var12;
                int var15 = -var12 + var14;
                int var16 = -var11 + var13;
                if (~var16 != -1 || ~var15 != -1) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var16 < 0) {
                        var16 = -var16;
                    }
                    boolean var17 = ~var16 > ~var15;
                    if (var17) {
                        int var18 = var11;
                        var11 = var12;
                        int var19 = var13;
                        var12 = var18;
                        var13 = var14;
                        var14 = var19;
                    }
                    if (~var11 < ~var13) {
                        int var20 = var11;
                        int var21 = var12;
                        var11 = var13;
                        var12 = var14;
                        var13 = var20;
                        var14 = var21;
                    }
                    int var22 = var12;
                    int var23 = -var11 + var13;
                    int var24 = var14 - var12;
                    int var25 = -var23 / 2;
                    int var26 = 2048 / var23;
                    int var27 = 1024 + -(class245.method1609((byte) 94, var7, 4096) >> 2);
                    int var28 = var14 > var12 ? 1 : -1;
                    if (~var24 > -1) {
                        var24 = -var24;
                    }
                    for (int var29 = var11; var29 < var13; ++var29) {
                        int var30 = var27 - -1024 - -((var29 - var11) * var26);
                        int var31 = class166.field2356 & var29;
                        int var32 = var22 & class519.field7637;
                        if (!var17) {
                            var6[var31][var32] = var30;
                        } else {
                            var6[var32][var31] = var30;
                        }
                        var25 += var24;
                        if (~var25 < -1) {
                            var25 += -var23;
                            var22 += var28;
                        }
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V", line = 150)
    public final void method269(boolean arg0) {
        class156.method1112(true);
        ++field7037;
        if (arg0) {
            field7044 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V", line = 198)
    public class478() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)Z", line = 179)
    public static final boolean method2889(int arg0, byte arg1) {
        ++field7035;
        if (arg0 != 11 && ~arg0 != -16 && arg0 != 21 && arg0 != 3 && ~arg0 != -51) {
            int var2 = -26 % ((arg1 - -47) / 58);
            return ~arg0 == -23 || arg0 == 1003;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;", line = 201)
    public static final Class method2890(String arg0, boolean arg1) throws ClassNotFoundException {
        ++field7042;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else {
            if (arg1) {
                method2889(-46, (byte) -82);
            }
            if (arg0.equals("I")) {
                return Integer.TYPE;
            } else if (arg0.equals("S")) {
                return Short.TYPE;
            } else if (arg0.equals("J")) {
                return Long.TYPE;
            } else if (arg0.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else {
                return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILiv;)V", line = 258)
    public final void method268(int arg0, int arg1, class65 arg2) {
        if (arg0 != 4) {
            this.field7036 = -83;
        }
        ++field7039;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 == 4) {
                            this.field7043 = arg2.method623((byte) -115);
                        }
                    } else {
                        this.field7036 = arg2.method623((byte) 118);
                    }
                } else {
                    this.field7033 = arg2.method577(arg0 ^ 251);
                }
            } else {
                this.field7034 = arg2.method623((byte) -112);
            }
        } else {
            this.field7032 = arg2.method577(arg0 + 251);
        }
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class97 extends class182 {

    @OriginalMember(owner = "client!rg", name = "Q", descriptor = "I")
    private int field1561 = 4096;

    @OriginalMember(owner = "client!rg", name = "O", descriptor = "[I")
    private int[] field1559 = new int[3];

    @OriginalMember(owner = "client!rg", name = "Y", descriptor = "I")
    private int field1569 = 4096;

    @OriginalMember(owner = "client!rg", name = "U", descriptor = "I")
    private int field1565 = 409;

    @OriginalMember(owner = "client!rg", name = "bb", descriptor = "I")
    private int field1572 = 4096;

    @OriginalMember(owner = "client!rg", name = "P", descriptor = "I")
    public static int field1560 = 0;

    @OriginalMember(owner = "client!rg", name = "ab", descriptor = "I")
    public static int field1571 = -1;

    @OriginalMember(owner = "client!rg", name = "V", descriptor = "Lqi;")
    public static class190 field1566 = new class190();

    @OriginalMember(owner = "client!rg", name = "cb", descriptor = "Luj;")
    public static class132 field1573 = new class132(16);

    @OriginalMember(owner = "client!rg", name = "db", descriptor = "Lpf;")
    public static class17 field1574 = new class17(50);

    @OriginalMember(owner = "client!rg", name = "R", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!rg", name = "S", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!rg", name = "T", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!rg", name = "W", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!rg", name = "X", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!rg", name = "Z", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V")
    public static void method683(boolean arg0) {
        field1574 = null;
        if (arg0) {
            field1560 = -25;
        }
        field1573 = null;
        field1566 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        ++field1567;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 == 4) {
                            int var5 = arg1.method1812((byte) 52);
                            this.field1559[0] = class15.method84(var5 << 4, 267386880);
                            this.field1559[2] = class15.method84(var5, 255) >> 12;
                            this.field1559[1] = class15.method84(65280, var5) >> 4;
                        }
                    } else {
                        this.field1572 = arg1.method1821((byte) 51);
                    }
                } else {
                    this.field1561 = arg1.method1821((byte) 51);
                }
            } else {
                this.field1569 = arg1.method1821((byte) 51);
            }
        } else {
            this.field1565 = arg1.method1821((byte) 51);
        }
        if (arg0) {
            this.method157((byte) 114, 99);
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
    public class97() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;")
    public static final Class method684(String arg0, boolean arg1) throws ClassNotFoundException {
        ++field1562;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
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
            if (arg1) {
                method685(-124, -110);
            }
            return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)I")
    public static final int method685(int arg0, int arg1) {
        ++field1570;
        if (arg1 < 0) {
            return 0;
        } else {
            class302 var2 = (class302) class21.field381.method987(-112, (long) arg1);
            if (var2 == null) {
                return class47.method299(5, arg1).field999;
            } else {
                int var3 = 0;
                if (arg0 < 60) {
                    method683(false);
                }
                for (int var4 = 0; ~var2.field4922.length < ~var4; ++var4) {
                    if (~var2.field4922[var4] == 0) {
                        ++var3;
                    }
                }
                return var3 + (class47.method299(5, arg1).field999 - var2.field4922.length);
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)[[I")
    public final int[][] method157(byte arg0, int arg1) {
        ++field1564;
        int var3 = -120 % ((-64 - arg0) / 49);
        int[][] var4 = super.field2905.method50(arg1, (byte) 111);
        if (super.field2905.field158) {
            int[][] var5 = this.method1327(0, 0, arg1);
            int[] var6 = var4[0];
            int[] var7 = var5[2];
            int[] var8 = var5[1];
            int[] var9 = var5[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class4.field116; ++var12) {
                int var13 = var9[var12];
                int var14 = var13 - this.field1559[0];
                if (var14 < 0) {
                    var14 = -var14;
                }
                if (var14 > this.field1565) {
                    var6[var12] = var13;
                    var10[var12] = var8[var12];
                    var11[var12] = var7[var12];
                } else {
                    int var15 = var8[var12];
                    int var16 = -this.field1559[1] + var15;
                    if (~var16 > -1) {
                        var16 = -var16;
                    }
                    if (~this.field1565 > ~var16) {
                        var6[var12] = var13;
                        var10[var12] = var15;
                        var11[var12] = var7[var12];
                    } else {
                        int var17 = var7[var12];
                        int var18 = -this.field1559[2] + var17;
                        if (~var18 > -1) {
                            var18 = -var18;
                        }
                        if (var18 > this.field1565) {
                            var6[var12] = var13;
                            var10[var12] = var15;
                            var11[var12] = var17;
                        } else {
                            var6[var12] = this.field1572 * var13 >> 12;
                            var10[var12] = this.field1561 * var15 >> 12;
                            var11[var12] = this.field1569 * var17 >> 12;
                        }
                    }
                }
            }
        }
        return var4;
    }
}

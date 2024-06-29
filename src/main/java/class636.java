import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class636 extends class314 {

    @OriginalMember(owner = "client!jca", name = "Q", descriptor = "I")
    private int field8941 = 0;

    @OriginalMember(owner = "client!jca", name = "V", descriptor = "I")
    private int field8946 = 20;

    @OriginalMember(owner = "client!jca", name = "T", descriptor = "I")
    private int field8944 = 0;

    @OriginalMember(owner = "client!jca", name = "X", descriptor = "I")
    private int field8948 = 1365;

    @OriginalMember(owner = "client!jca", name = "O", descriptor = "Z")
    public static volatile boolean field8939 = true;

    @OriginalMember(owner = "client!jca", name = "W", descriptor = "Lqaa;")
    public static class26 field8947 = new class26();

    @OriginalMember(owner = "client!jca", name = "L", descriptor = "I")
    public static int field8936;

    @OriginalMember(owner = "client!jca", name = "M", descriptor = "I")
    public static int field8937;

    @OriginalMember(owner = "client!jca", name = "N", descriptor = "I")
    public static int field8938;

    @OriginalMember(owner = "client!jca", name = "P", descriptor = "I")
    public static int field8940;

    @OriginalMember(owner = "client!jca", name = "S", descriptor = "I")
    public static int field8943;

    @OriginalMember(owner = "client!jca", name = "Y", descriptor = "I")
    public static int field8949;

    @OriginalMember(owner = "client!jca", name = "R", descriptor = "Ljb;")
    public static class458 field8942;

    @OriginalMember(owner = "client!jca", name = "U", descriptor = "[I")
    public static int[] field8945;

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(Z)V", line = 5)
    public static final void method3698(boolean arg0) {
        if (class78.field996 != null) {
            class78.field996.method1752((byte) 63);
        }
        ++field8940;
        if (class253.field4040 != null) {
            class253.field4040.method1752((byte) 63);
        }
        if (!arg0) {
            field8945 = null;
        }
    }

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(II)I", line = 22)
    public static final int method3699(int arg0, int arg1) {
        ++field8943;
        if (arg0 != 6976) {
            field8945 = null;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "(Z)V", line = 33)
    public static void method3700(boolean arg0) {
        if (arg0) {
            field8945 = null;
            field8942 = null;
            field8947 = null;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)[I", line = 45)
    public final int[] method6(int arg0, int arg1) {
        ++field8938;
        if (arg1 < 109) {
            field8947 = null;
        }
        int[] var3 = super.field4928.method534((byte) -76, arg0);
        if (super.field4928.field618) {
            for (int var4 = 0; var4 < class81.field1009; ++var4) {
                int var5 = (class328.field5091[var4] << 12) / this.field8948 + this.field8941;
                int var6 = (class657.field9166[arg0] << 12) / this.field8948 + this.field8944;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (~(var11 + var12) > -16385 && var13 < this.field8946) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var11 - -var7 + -var12;
                    ++var13;
                    var11 = var9 * var9 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = ~(this.field8946 + -1) >= ~var13 ? 0 : (var13 << 12) / this.field8946;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(BLie;I)V", line = 105)
    public final void method5(byte arg0, class6 arg1, int arg2) {
        ++field8937;
        if (arg0 <= -1) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (~arg2 != -3) {
                        if (arg2 == 3) {
                            this.field8944 = arg1.method67(12021);
                        }
                    } else {
                        this.field8941 = arg1.method67(12021);
                    }
                } else {
                    this.field8946 = arg1.method67(12021);
                }
            } else {
                this.field8948 = arg1.method67(12021);
            }
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "([BIILjava/lang/String;)I", line = 159)
    public static final int method3701(byte[] arg0, int arg1, int arg2, String arg3) {
        ++field8949;
        int var4 = arg2;
        int var5 = arg3.length();
        if (arg1 != -1) {
            method3700(false);
        }
        for (int var6 = 0; ~var5 < ~var6; var6 += 4) {
            int var7 = class376.method2469(arg3.charAt(var6), (byte) 29);
            int var8 = ~var5 < ~(var6 + 1) ? class376.method2469(arg3.charAt(var6 + 1), (byte) 29) : -1;
            int var9 = var5 <= var6 + 2 ? -1 : class376.method2469(arg3.charAt(var6 + 2), (byte) 29);
            int var10 = ~(var6 + 3) <= ~var5 ? -1 : class376.method2469(arg3.charAt(var6 - -3), (byte) 29);
            arg0[arg2++] = (byte) class81.method769(var8 >>> 4, var7 << 2);
            if (var9 == -1) {
                break;
            }
            arg0[arg2++] = (byte) class81.method769(class453.method2846(var8 << 4, 240), var9 >>> 2);
            if (~var10 == 0) {
                break;
            }
            arg0[arg2++] = (byte) class81.method769(var10, class453.method2846(var9, 3) << 6);
        }
        return -var4 + arg2;
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "()V", line = 349)
    public class636() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jca", name = "h", descriptor = "(I)I", line = 207)
    public static final int method3702(int arg0) {
        ++field8936;
        if (~class590.field8384 == -1) {
            class96.field1506.method913((byte) -128, new class250("jaclib"));
            if (~class96.field1506.method912(true).method1781(-77) != -101) {
                return 1;
            }
            if (!((class250) class96.field1506.method912(true)).method1780(-1)) {
                class157.field2684.method3496((byte) -118);
            }
            class590.field8384 = 1;
        }
        if (class590.field8384 == 1) {
            class31.field457 = class96.method911((byte) -77);
            class96.field1495.method913((byte) -128, new class329(class95.field1491));
            class96.field1507.method913((byte) -127, new class250("jaggl"));
            class96.field1508.method913((byte) -128, new class250("jagdx"));
            class96.field1509.method913((byte) -127, new class250("jagmisc"));
            class96.field1510.method913((byte) -128, new class250("sw3d"));
            class96.field1511.method913((byte) -127, new class250("hw3d"));
            class96.field1512.method913((byte) -127, new class329(class28.field436));
            class96.field1513.method913((byte) -127, new class329(class51.field688));
            class96.field1514.method913((byte) -128, new class329(class456.field6845));
            class96.field1515.method913((byte) -127, new class329(class422.field6434));
            class96.field1516.method913((byte) -127, new class329(class216.field3561));
            class96.field1517.method913((byte) -127, new class329(class132.field2157));
            class96.field1518.method913((byte) -127, new class329(class304.field4755));
            class96.field1519.method913((byte) -127, new class329(class286.field4546));
            class96.field1520.method913((byte) -128, new class329(class28.field434));
            class96.field1521.method913((byte) -128, new class329(class469.field6958));
            class96.field1522.method913((byte) -127, new class329(class292.field4604));
            class96.field1523.method913((byte) -127, new class329(class287.field4566));
            class96.field1524.method913((byte) -128, new class329(class275.field4424));
            class96.field1525.method913((byte) -127, new class329(class85.field1045));
            class96.field1526.method913((byte) -128, new class251(class258.field4122, "huffman"));
            class96.field1527.method913((byte) -127, new class329(class193.field3196));
            class96.field1528.method913((byte) -127, new class329(class321.field5030));
            class96.field1529.method913((byte) -127, new class329(class51.field682));
            class96.field1530.method913((byte) -128, new class549(class660.field9199, "details"));
            for (int var1 = 0; class31.field457.length > var1; ++var1) {
                if (class31.field457[var1].method912(true) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class96[] var3 = class31.field457;
            for (int var4 = 0; var3.length > var4; ++var4) {
                class96 var5 = var3[var4];
                int var6 = var5.method909(43);
                int var7 = var5.method912(true).method1781(-107);
                var2 += var6 * var7 / 100;
            }
            class673.field9484 = var2;
            class590.field8384 = 2;
        }
        if (class31.field457 == null) {
            return 100;
        } else {
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            if (arg0 < 92) {
                method3699(-5, 117);
            }
            class96[] var11 = class31.field457;
            for (int var12 = 0; var12 < var11.length; ++var12) {
                class96 var16 = var11[var12];
                int var17 = var16.method909(45);
                int var18 = var16.method912(true).method1781(106);
                var9 += var17 * var18 / 100;
                if (var18 < 100) {
                    var10 = false;
                }
                var8 += var17;
            }
            if (var10) {
                if (!((class250) class96.field1509.method912(true)).method1780(-1)) {
                    class157.field2684.method3488(-4744);
                }
                class31.field457 = null;
            }
            int var13 = var9 - class673.field9484;
            int var14 = var8 - class673.field9484;
            int var15 = ~var14 >= -1 ? 100 : var13 * 100 / var14;
            if (!var10 && ~var15 < -100) {
                var15 = 99;
            }
            return var15;
        }
    }
}

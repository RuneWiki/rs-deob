import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class427 extends class11 {

    @OriginalMember(owner = "client!qs", name = "L", descriptor = "I")
    private int field6256 = 4096;

    @OriginalMember(owner = "client!qs", name = "J", descriptor = "I")
    private int field6254 = 0;

    @OriginalMember(owner = "client!qs", name = "N", descriptor = "Ldi;")
    public static class83 field6258 = new class83(55, 0);

    @OriginalMember(owner = "client!qs", name = "P", descriptor = "Ldi;")
    public static class83 field6260 = new class83(77, 0);

    @OriginalMember(owner = "client!qs", name = "G", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!qs", name = "H", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!qs", name = "I", descriptor = "I")
    public static int field6253;

    @OriginalMember(owner = "client!qs", name = "K", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!qs", name = "M", descriptor = "I")
    public static int field6257;

    @OriginalMember(owner = "client!qs", name = "O", descriptor = "Lmg;")
    public static class101 field6259;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "(I)V")
    public static final void method2527(int arg0) {
        ++field6255;
        class483.method2838((byte) -115);
        class267.field3695 = null;
        class485.field7085 = null;
        class423.field6200 = null;
        if (arg0 != 6571) {
            field6260 = null;
        }
        class402.field5903 = null;
        class288.field3999 = null;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method2528(byte arg0, String arg1) {
        ++field6252;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var2 > var4; ++var4) {
            char var9 = arg1.charAt(var4);
            if (~var9 == -61 || var9 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        int var6 = 10 % ((arg0 - 40) / 59);
        for (int var7 = 0; var7 < var2; ++var7) {
            char var8 = arg1.charAt(var7);
            if (var8 == '<') {
                var5.append("<lt>");
            } else if (~var8 == -63) {
                var5.append("<gt>");
            } else {
                var5.append(var8);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(B)V")
    public static void method2529(byte arg0) {
        if (arg0 < 37) {
            field6260 = null;
        }
        field6258 = null;
        field6260 = null;
        field6259 = null;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lsi;II)V")
    public final void method43(class391 arg0, int arg1, int arg2) {
        ++field6251;
        if (arg1 >= -40) {
            method2529((byte) 45);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field167 = ~arg0.method2348(-2) == -2;
                }
            } else {
                this.field6256 = arg0.method2353((byte) 88);
            }
        } else {
            this.field6254 = arg0.method2353((byte) 112);
        }
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "()V")
    public class427() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        if (arg0 >= -42) {
            return null;
        } else {
            ++field6257;
            int[] var3 = super.field158.method1312(arg1, (byte) 74);
            if (super.field158.field2966) {
                int[] var4 = this.method48(arg1, 0, (byte) -69);
                for (int var5 = 0; ~class90.field1316 < ~var5; ++var5) {
                    int var6 = var4[var5];
                    if (~this.field6254 >= ~var6) {
                        if (var6 <= this.field6256) {
                            var3[var5] = var6;
                        } else {
                            var3[var5] = this.field6256;
                        }
                    } else {
                        var3[var5] = this.field6254;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)[[I")
    public final int[][] method41(int arg0, int arg1) {
        ++field6253;
        int var3 = -106 / ((arg0 - -75) / 49);
        int[][] var4 = super.field156.method1719(arg1, 3);
        if (super.field156.field4001) {
            int[][] var5 = this.method49(arg1, 0, 110);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; ~class90.field1316 < ~var12; ++var12) {
                int var13 = var6[var12];
                int var14 = var7[var12];
                int var15 = var8[var12];
                if (var13 >= this.field6254) {
                    if (var13 > this.field6256) {
                        var9[var12] = this.field6256;
                    } else {
                        var9[var12] = var13;
                    }
                } else {
                    var9[var12] = this.field6254;
                }
                if (~this.field6254 < ~var14) {
                    var10[var12] = this.field6254;
                } else if (~var14 >= ~this.field6256) {
                    var10[var12] = var14;
                } else {
                    var10[var12] = this.field6256;
                }
                if (this.field6254 > var15) {
                    var11[var12] = this.field6254;
                } else if (~this.field6256 <= ~var15) {
                    var11[var12] = var15;
                } else {
                    var11[var12] = this.field6256;
                }
            }
        }
        return var4;
    }
}

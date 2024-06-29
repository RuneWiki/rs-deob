import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class53 extends class107 {

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
    private int field784 = 4096;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
    private int field783 = 0;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field778 = new String[1000];

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "Lgi;")
    public static class164 field772;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "Lgi;")
    public static class164 field782;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "Ljava/awt/Frame;")
    public static Frame field776;

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    public class53() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(II)V")
    public static final void method330(int arg0, int arg1) {
        ++field777;
        class170.field2791.method1880(-97, arg1);
        if (arg0 == 0) {
            class202.field3279.method1880(-73, arg1);
            class72.field1156.method1880(-102, arg1);
        }
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)V")
    public static final void method331(int arg0) {
        int var1 = class229.field3584.method2087(8, (byte) 125);
        ++field781;
        if (class134.field2172 > var1) {
            for (int var2 = var1; ~class134.field2172 < ~var2; ++var2) {
                class75.field1214[class97.field1538++] = class111.field1708[var2];
            }
        }
        if (var1 > class134.field2172) {
            throw new RuntimeException("gppov1");
        } else {
            class134.field2172 = arg0;
            for (int var3 = 0; ~var3 > ~var1; ++var3) {
                int var4 = class111.field1708[var3];
                class12 var5 = class28.field494[var4];
                int var6 = class229.field3584.method2087(1, (byte) -102);
                if (~var6 == -1) {
                    class111.field1708[class134.field2172++] = var4;
                    var5.field907 = class274.field4472;
                } else {
                    int var7 = class229.field3584.method2087(2, (byte) 122);
                    if (var7 == 0) {
                        class111.field1708[class134.field2172++] = var4;
                        var5.field907 = class274.field4472;
                        class189.field3100[class57.field830++] = var4;
                    } else if (var7 == 1) {
                        class111.field1708[class134.field2172++] = var4;
                        var5.field907 = class274.field4472;
                        int var8 = class229.field3584.method2087(3, (byte) 126);
                        var5.method400(1, 32, var8);
                        int var9 = class229.field3584.method2087(1, (byte) -7);
                        if (~var9 == -2) {
                            class189.field3100[class57.field830++] = var4;
                        }
                    } else if (var7 == 2) {
                        class111.field1708[class134.field2172++] = var4;
                        var5.field907 = class274.field4472;
                        if (~class229.field3584.method2087(1, (byte) -47) == -2) {
                            int var10 = class229.field3584.method2087(3, (byte) 121);
                            var5.method400(2, 32, var10);
                            int var11 = class229.field3584.method2087(3, (byte) -94);
                            var5.method400(2, 32, var11);
                        } else {
                            int var12 = class229.field3584.method2087(3, (byte) -29);
                            var5.method400(0, 32, var12);
                        }
                        int var13 = class229.field3584.method2087(1, (byte) 127);
                        if (var13 == 1) {
                            class189.field3100[class57.field830++] = var4;
                        }
                    } else if (var7 == 3) {
                        class75.field1214[class97.field1538++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)[[I")
    public final int[][] method190(int arg0, byte arg1) {
        if (arg1 != -117) {
            method333(98);
        }
        ++field771;
        int[][] var3 = super.field1662.method1302(arg0, (byte) 26);
        if (super.field1662.field3063) {
            int[][] var4 = this.method759(0, -128, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class24.field443; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var12 < this.field783) {
                    var8[var11] = this.field783;
                } else if (~var12 < ~this.field784) {
                    var8[var11] = this.field784;
                } else {
                    var8[var11] = var12;
                }
                if (~var13 > ~this.field783) {
                    var9[var11] = this.field783;
                } else if (~this.field784 > ~var13) {
                    var9[var11] = this.field784;
                } else {
                    var9[var11] = var13;
                }
                if (~var14 <= ~this.field783) {
                    if (var14 <= this.field784) {
                        var10[var11] = var14;
                    } else {
                        var10[var11] = this.field784;
                    }
                } else {
                    var10[var11] = this.field783;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(III)Lmm;")
    public static final class240 method332(int arg0, int arg1, int arg2) {
        class116 var3 = class307.field4991[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class240 var4 = var3.field1776;
            var3.field1776 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        ++field779;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field1660 = arg1.method1849(arg2 ^ 227) == 1;
                }
            } else {
                this.field784 = arg1.method1837(252);
            }
        } else {
            this.field783 = arg1.method1837(arg2 + 224);
        }
        if (arg2 != 28) {
            this.field783 = -38;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)[I")
    public final int[] method189(int arg0, int arg1) {
        int[] var3 = super.field1661.method894(121, arg1);
        ++field780;
        if (super.field1661.field2115) {
            int[] var4 = this.method756(0, arg1, -29053);
            for (int var5 = 0; ~var5 > ~class24.field443; ++var5) {
                int var6 = var4[var5];
                if (this.field783 <= var6) {
                    if (~this.field784 <= ~var6) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field784;
                    }
                } else {
                    var3[var5] = this.field783;
                }
            }
        }
        int var7 = 112 / ((-34 - arg0) / 49);
        return var3;
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)V")
    public static final void method333(int arg0) {
        ++field775;
        class123 var1 = class149.field2381;
        synchronized (class149.field2381) {
            ++class50.field730;
            class90.field1400 = class265.field4316;
            class287.field4640 = class74.field1182;
            class55.field797 = class246.field3880;
            class295.field4805 = class109.field1691;
            class295.field4806 = class76.field1237;
            class16.field302 = class233.field3649;
            class117.field1801 = class277.field4525;
            class109.field1691 = arg0;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V")
    public static void method334(boolean arg0) {
        field778 = null;
        if (arg0) {
            field776 = null;
            field782 = null;
            field772 = null;
        }
    }
}

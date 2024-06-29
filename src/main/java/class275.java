import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class275 extends class198 {

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "I")
    private int field4550 = 0;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
    private int field4551 = 4096;

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "Z")
    public static boolean field4547 = false;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "Ljava/lang/String;")
    public static String field4552 = null;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "[I")
    public static int[] field4556 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "[I")
    public static int[] field4553 = new int[50];

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!ad", name = "V", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "Luj;")
    public static class304 field4558;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZI)[I")
    public final int[] method32(boolean arg0, int arg1) {
        ++field4549;
        if (!arg0) {
            return null;
        } else {
            int[] var3 = super.field3134.method36(arg1, 30672);
            if (super.field3134.field69) {
                int[] var4 = this.method1367((byte) -79, 0, arg1);
                for (int var5 = 0; ~var5 > ~class42.field590; ++var5) {
                    int var6 = var4[var5];
                    if (~var6 <= ~this.field4550) {
                        if (~this.field4551 <= ~var6) {
                            var3[var5] = var6;
                        } else {
                            var3[var5] = this.field4551;
                        }
                    } else {
                        var3[var5] = this.field4550;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)[[I")
    public final int[][] method200(int arg0, int arg1) {
        int[][] var3 = super.field3150.method642(arg0, 1);
        ++field4559;
        if (super.field3150.field1498) {
            int[][] var4 = this.method1372(0, arg0, (byte) 124);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class42.field590 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 >= this.field4550) {
                    if (var12 > this.field4551) {
                        var8[var11] = this.field4551;
                    } else {
                        var8[var11] = var12;
                    }
                } else {
                    var8[var11] = this.field4550;
                }
                if (var13 < this.field4550) {
                    var9[var11] = this.field4550;
                } else if (~var13 < ~this.field4551) {
                    var9[var11] = this.field4551;
                } else {
                    var9[var11] = var13;
                }
                if (var14 >= this.field4550) {
                    if (this.field4551 < var14) {
                        var10[var11] = this.field4551;
                    } else {
                        var10[var11] = var14;
                    }
                } else {
                    var10[var11] = this.field4550;
                }
            }
        }
        if (arg1 != -2) {
            field4558 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "(I)V")
    public static void method1914(int arg0) {
        field4558 = null;
        field4552 = null;
        field4553 = null;
        int var1 = -94 % ((75 - arg0) / 43);
        field4556 = null;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
    public class275() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(III)Z")
    public static final boolean method1915(int arg0, int arg1, int arg2) {
        ++field4548;
        if (arg1 != 9578) {
            method1917(true);
        }
        if (~arg0 == -12) {
            arg0 = 10;
        }
        class74 var3 = class216.method1510(0, arg2);
        if (~arg0 <= -6 && ~arg0 >= -9) {
            arg0 = 4;
        }
        return var3.method487(arg0, 65535);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLfa;)V")
    public static final void method1916(byte arg0, class273 arg1) {
        ++field4560;
        class171.field2649 = arg1;
        if (arg0 <= 57) {
            field4556 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(Z)V")
    public static final void method1917(boolean arg0) {
        if (arg0) {
            field4558 = null;
        }
        ++field4557;
        if (!class309.field5008) {
            class87.field1355 = true;
            class309.field5008 = true;
            if (class74.field1123) {
                class79.field1255 = (float) (-16 & (int) class79.field1255 + 47);
            } else {
                class295.field4847 += (12.0F - class295.field4847) / 2.0F;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        int var4 = -28 % ((60 - arg0) / 61);
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field3139 = ~arg1.method1420((byte) 0) == -2;
                }
            } else {
                this.field4551 = arg1.method1419(119);
            }
        } else {
            this.field4550 = arg1.method1419(84);
        }
        ++field4555;
    }
}

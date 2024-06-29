import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class446 extends class139 {

    @OriginalMember(owner = "client!vm", name = "J", descriptor = "I")
    private int field6174 = 0;

    @OriginalMember(owner = "client!vm", name = "M", descriptor = "I")
    private int field6177 = 4096;

    @OriginalMember(owner = "client!vm", name = "L", descriptor = "Ljava/lang/String;")
    public static String field6176 = null;

    @OriginalMember(owner = "client!vm", name = "K", descriptor = "Lwf;")
    public static class79 field6175 = new class79(14, 3);

    @OriginalMember(owner = "client!vm", name = "P", descriptor = "Lus;")
    public static class1 field6180 = new class1(49, 3);

    @OriginalMember(owner = "client!vm", name = "H", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!vm", name = "I", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!vm", name = "O", descriptor = "I")
    public static int field6179;

    @OriginalMember(owner = "client!vm", name = "N", descriptor = "Lse;")
    public static class154 field6178;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(Z)V")
    public static void method2606(boolean arg0) {
        field6178 = null;
        if (arg0) {
            field6178 = null;
        }
        field6180 = null;
        field6175 = null;
        field6176 = null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)[[I")
    public final int[][] method33(int arg0, int arg1) {
        ++field6179;
        int[][] var3 = super.field1835.method999((byte) 104, arg1);
        if (arg0 >= -67) {
            return null;
        } else {
            if (super.field1835.field2395) {
                int[][] var4 = this.method882(0, arg1, 1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class356.field5147; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var6[var11];
                    int var14 = var7[var11];
                    if (this.field6174 > var12) {
                        var8[var11] = this.field6174;
                    } else if (~this.field6177 > ~var12) {
                        var8[var11] = this.field6177;
                    } else {
                        var8[var11] = var12;
                    }
                    if (~this.field6174 < ~var13) {
                        var9[var11] = this.field6174;
                    } else if (this.field6177 >= var13) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field6177;
                    }
                    if (~var14 > ~this.field6174) {
                        var10[var11] = this.field6174;
                    } else if (~this.field6177 <= ~var14) {
                        var10[var11] = var14;
                    } else {
                        var10[var11] = this.field6177;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(Z)Z")
    public static final boolean method2607(boolean arg0) {
        for (int var1 = class346.field5020; var1 < class314.field4441; ++var1) {
            class88[][] var2 = class330.field4786[var1];
            for (int var3 = -class36.field463; var3 <= 0; ++var3) {
                int var4 = class58.field770 + var3;
                int var5 = class58.field770 - var3;
                if (var4 >= class398.field5653 || var5 < class3.field32) {
                    for (int var6 = -class36.field463; var6 <= 0; ++var6) {
                        int var7 = class214.field3218 + var6;
                        int var8 = class214.field3218 - var6;
                        if (var4 >= class398.field5653) {
                            if (var7 >= class120.field1505) {
                                class88 var9 = var2[var4][var7];
                                if (var9 != null && var9.field1084) {
                                    class427.field5976 = arg0;
                                    class405.field5702.method1050(0, var9);
                                    class405.field5702.method1047(-106);
                                }
                            }
                            if (var8 < class466.field6557) {
                                class88 var10 = var2[var4][var8];
                                if (var10 != null && var10.field1084) {
                                    class427.field5976 = arg0;
                                    class405.field5702.method1050(0, var10);
                                    class405.field5702.method1047(-120);
                                }
                            }
                        }
                        if (var5 < class3.field32) {
                            if (var7 >= class120.field1505) {
                                class88 var11 = var2[var5][var7];
                                if (var11 != null && var11.field1084) {
                                    class427.field5976 = arg0;
                                    class405.field5702.method1050(0, var11);
                                    class405.field5702.method1047(124);
                                }
                            }
                            if (var8 < class466.field6557) {
                                class88 var12 = var2[var5][var8];
                                if (var12 != null && var12.field1084) {
                                    class427.field5976 = arg0;
                                    class405.field5702.method1050(0, var12);
                                    class405.field5702.method1047(122);
                                }
                            }
                        }
                        if (class187.field2778 == 0) {
                            if (class30.field400) {
                                class405.field5702.method1052(1, 24);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        ++field6172;
        int[] var3 = super.field1844.method2176(arg0, arg1 ^ arg1);
        if (super.field1844.field5045) {
            int[] var4 = this.method879((byte) -29, arg0, 0);
            for (int var5 = 0; ~var5 > ~class356.field5147; ++var5) {
                int var6 = var4[var5];
                if (this.field6174 <= var6) {
                    if (~this.field6177 > ~var6) {
                        var3[var5] = this.field6177;
                    } else {
                        var3[var5] = var6;
                    }
                } else {
                    var3[var5] = this.field6174;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        ++field6173;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field1841 = ~arg0.method1701(-23121) == -2;
                }
            } else {
                this.field6177 = arg0.method1729(65280);
            }
        } else {
            this.field6174 = arg0.method1729(arg1 + 65325);
        }
        if (arg1 != -45) {
            field6175 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
    public class446() {
        super(1, false);
    }
}

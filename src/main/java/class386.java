import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class386 extends class56 {

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "I")
    private int field4964 = 0;

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "I")
    private int field4962 = 10;

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "I")
    private int field4970 = 2048;

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "Lcr;")
    public static class600 field4974;

    @OriginalMember(owner = "client!bc", name = "O", descriptor = "[I")
    private int[] field4971;

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "[I")
    private int[] field4972;

    @OriginalMember(owner = "client!bc", name = "Q", descriptor = "[[Z")
    public static boolean[][] field4973;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V", line = 4)
    public final void method493(byte arg0) {
        ++field4968;
        int var2 = -43 % ((arg0 - 37) / 62);
        this.method2264(1);
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V", line = 15)
    public static void method2262(int arg0) {
        field4973 = null;
        if (arg0 != -19324) {
            method2265(false, (String) null);
        }
        field4974 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BILes;)V", line = 27)
    public final void method144(byte arg0, int arg1, class403 arg2) {
        ++field4963;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field4964 = arg2.method2396((byte) 85);
                }
            } else {
                this.field4970 = arg2.method2390((byte) -108);
            }
        } else {
            this.field4962 = arg2.method2396((byte) 56);
        }
        if (arg0 >= -44) {
            method2263((byte) 10);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)[I", line = 70)
    public final int[] method145(int arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field4969;
            int[] var3 = super.field752.method1308(false, arg1);
            if (super.field752.field2441) {
                int var4 = class349.field4354[arg1];
                if (this.field4964 == 0) {
                    short var5 = 0;
                    for (int var6 = 0; ~var6 > ~this.field4962; ++var6) {
                        if (var4 >= this.field4971[var6] && this.field4971[var6 + 1] > var4) {
                            if (~this.field4972[var6] < ~var4) {
                                var5 = 4096;
                            }
                            break;
                        }
                    }
                    class211.method1333(var3, 0, class642.field8759, var5);
                } else {
                    for (int var7 = 0; var7 < class642.field8759; ++var7) {
                        int var8 = 0;
                        short var9 = 0;
                        int var10 = class648.field8837[var7];
                        int var11 = this.field4964;
                        if (var11 != 1) {
                            if (var11 != 2) {
                                if (~var11 == -4) {
                                    var8 = (-var4 + var10 >> 1) + 2048;
                                }
                            } else {
                                var8 = (var4 + var10 + -4096 >> 1) + 2048;
                            }
                        } else {
                            var8 = var10;
                        }
                        for (int var12 = 0; ~this.field4962 < ~var12; ++var12) {
                            if (var8 >= this.field4971[var12] && ~var8 > ~this.field4971[var12 + 1]) {
                                if (~this.field4972[var12] < ~var8) {
                                    var9 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var7] = var9;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V", line = 188)
    public class386() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V", line = 196)
    public static final void method2263(byte arg0) {
        ++field4965;
        if (arg0 > -50) {
            method2265(false, (String) null);
        }
        class615.field8271.method1690(0);
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V", line = 215)
    private final void method2264(int arg0) {
        ++field4967;
        this.field4972 = new int[this.field4962 + arg0];
        this.field4971 = new int[this.field4962 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field4962;
        int var4 = this.field4970 * var3 >> 12;
        for (int var5 = 0; ~this.field4962 < ~var5; ++var5) {
            this.field4971[var5] = var2;
            this.field4972[var5] = var2 + var4;
            var2 += var3;
        }
        this.field4971[this.field4962] = 4096;
        this.field4972[this.field4962] = this.field4972[0] + 4096;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;", line = 243)
    public static final String method2265(boolean arg0, String arg1) {
        ++field4966;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; ~var2 < ~var4; ++var4) {
            char var8 = arg1.charAt(var4);
            if (~var8 == -61 || ~var8 == -63) {
                var3 += 3;
            }
        }
        if (arg0) {
            method2265(false, (String) null);
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; ~var6 > ~var2; ++var6) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }
}

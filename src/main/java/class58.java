import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class58 extends class40 {

    @OriginalMember(owner = "client!jr", name = "K", descriptor = "[I")
    private int[] field768 = new int[3];

    @OriginalMember(owner = "client!jr", name = "O", descriptor = "I")
    private int field772 = 409;

    @OriginalMember(owner = "client!jr", name = "Q", descriptor = "I")
    private int field774 = 4096;

    @OriginalMember(owner = "client!jr", name = "U", descriptor = "I")
    private int field778 = 4096;

    @OriginalMember(owner = "client!jr", name = "Y", descriptor = "I")
    private int field782 = 4096;

    @OriginalMember(owner = "client!jr", name = "L", descriptor = "I")
    public static int field769 = 0;

    @OriginalMember(owner = "client!jr", name = "W", descriptor = "[[Z")
    public static boolean[][] field780 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!jr", name = "Z", descriptor = "Z")
    public static boolean field783 = false;

    @OriginalMember(owner = "client!jr", name = "M", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!jr", name = "N", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!jr", name = "R", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!jr", name = "S", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!jr", name = "T", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!jr", name = "V", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!jr", name = "X", descriptor = "Ltj;")
    public static class108 field781;

    @OriginalMember(owner = "client!jr", name = "P", descriptor = "[I")
    public static int[] field773;

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "(B)V", line = 5)
    public static void method377(byte arg0) {
        field773 = null;
        int var1 = 25 / ((-8 - arg0) / 59);
        field780 = null;
        field781 = null;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IILlf;)V", line = 16)
    public final void method43(int arg0, int arg1, class130 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 == 4) {
                            int var5 = arg2.method839((byte) -92);
                            this.field768[0] = class209.method1483(267386880, var5 << 4);
                            this.field768[1] = class209.method1483(var5, 65280) >> 4;
                            this.field768[2] = class209.method1483(255, var5) >> 12;
                        }
                    } else {
                        this.field778 = arg2.method798(false);
                    }
                } else {
                    this.field774 = arg2.method798(false);
                }
            } else {
                this.field782 = arg2.method798(false);
            }
        } else {
            this.field772 = arg2.method798(false);
        }
        ++field771;
        if (arg1 <= 79) {
            field769 = -114;
        }
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(IB)Lvi;", line = 83)
    public static final class319 method378(int arg0, byte arg1) {
        ++field779;
        class319 var2 = (class319) class419.field6005.method1972((long) arg0, 0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class16.field246.method643(11, arg0, true);
            class319 var4 = new class319();
            if (arg1 != 118) {
                field783 = true;
            }
            if (var3 != null) {
                var4.method2123(new class130(var3), -2);
            }
            class419.field6005.method1975(var4, (long) arg0, false);
            return var4;
        }
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(Z)V", line = 106)
    public static final void method379(boolean arg0) {
        ++field777;
        if (arg0) {
            method381(71, -18);
        }
        class15 var1 = class100.field1271;
        synchronized (class100.field1271) {
            class100.field1271.method102((byte) -113);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)[[I", line = 120)
    public final int[][] method112(int arg0, int arg1) {
        if (arg0 != 1) {
            field783 = true;
        }
        ++field770;
        int[][] var3 = super.field555.method2070(arg0 + -1, arg1);
        if (super.field555.field4489) {
            int[][] var4 = this.method261(0, arg0 + 28551, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class410.field5886; ++var11) {
                int var12 = var5[var11];
                int var13 = var12 - this.field768[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var13 > this.field772) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field768[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field772 < var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field768[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~this.field772 > ~var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field778 * var12 >> 12;
                            var9[var11] = this.field774 * var14 >> 12;
                            var10[var11] = this.field782 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "()V", line = 217)
    public class58() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IZIB)Ljava/lang/String;", line = 245)
    public static final String method380(int arg0, boolean arg1, int arg2, byte arg3) {
        ++field775;
        if (~arg0 <= -3 && arg0 <= 36) {
            if (arg1 && arg2 >= 0) {
                int var4 = 2;
                int var5 = arg2 / arg0;
                while (var5 != 0) {
                    var5 /= arg0;
                    ++var4;
                }
                char[] var6 = new char[var4];
                var6[0] = '+';
                int var7 = var4 + -1;
                if (arg3 != -101) {
                    method377((byte) 124);
                }
                while (var7 > 0) {
                    int var8 = arg2;
                    arg2 /= arg0;
                    int var9 = var8 - arg0 * arg2;
                    if (~var9 <= -11) {
                        var6[var7] = (char) (var9 + 87);
                    } else {
                        var6[var7] = (char) (var9 + 48);
                    }
                    --var7;
                }
                return new String(var6);
            } else {
                return Integer.toString(arg2, arg0);
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(II)I", line = 294)
    public static final int method381(int arg0, int arg1) {
        int var2 = -115 / ((arg0 - 75) / 34);
        ++field776;
        return (261749 & arg1) >> 11;
    }
}

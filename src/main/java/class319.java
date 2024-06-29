import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class319 extends class75 {

    @OriginalMember(owner = "client!t", name = "G", descriptor = "I")
    private int field4670 = 0;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "Lmp;")
    private class21 field4662 = new class21();

    @OriginalMember(owner = "client!t", name = "B", descriptor = "I")
    public static int field4665 = -1;

    @OriginalMember(owner = "client!t", name = "H", descriptor = "I")
    public static int field4671 = -13423323;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "Ljava/lang/String;")
    public static String field4660 = " from your ignore list first.";

    @OriginalMember(owner = "client!t", name = "C", descriptor = "I")
    public static int field4666 = -1;

    @OriginalMember(owner = "client!t", name = "E", descriptor = "I")
    public static int field4668 = 0;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!t", name = "z", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!t", name = "D", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!t", name = "I", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!t", name = "J", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!t", name = "K", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!t", name = "L", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!t", name = "M", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!t", name = "N", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!t", name = "F", descriptor = "Ljava/lang/String;")
    public static String field4669;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(BI)V")
    public final void method562(byte arg0, int arg1) {
        if (arg0 != -54) {
            this.method557(0.69124085F, -115, true, -49, (class351) null);
        }
        ++field4659;
        super.field1072[super.field1075] = (byte) arg1;
        ++super.field1075;
        if (super.field1075 >= 5000) {
            super.field1075 = 0;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
    public final void method556(byte arg0) {
        ++field4663;
        if (arg0 <= 7) {
            method2151(-95, '5');
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III)B")
    public static final byte method2147(int arg0, int arg1, int arg2) {
        ++field4664;
        if (arg2 != 9) {
            return 0;
        } else {
            return (byte) ((1 & arg0) != arg1 ? 2 : 1);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(FIZILck;)V")
    public final void method557(float arg0, int arg1, boolean arg2, int arg3, class351 arg4) {
        if (arg3 != 128) {
            this.field4670 = -86;
        }
        super.field1072[super.field1075] = (byte) (arg2 ? arg1 + 40 : arg1 + 30);
        ++field4676;
        super.field1076[super.field1075] = arg4;
        super.field1070[super.field1075] = arg0;
        ++super.field1075;
        if (~super.field1075 <= -5001) {
            super.field1075 = 0;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V")
    public final void method558(byte arg0) {
        while (super.field1080 != super.field1075) {
            this.method2149(104);
        }
        ++field4677;
        if (arg0 >= -30) {
            method2150(-75, -51, (int[]) null, (Object[]) null, 3);
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
    public static void method2148(int arg0) {
        field4660 = null;
        field4669 = null;
        if (arg0 < 49) {
            method2150(-25, 104, (int[]) null, (Object[]) null, -113);
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
    private final void method2149(int arg0) {
        ++field4675;
        int var2 = super.field1080++;
        int var3 = 77 / ((53 - arg0) / 35);
        if (~super.field1080 <= -5001) {
            super.field1080 = 0;
        }
        this.field4670 = super.field1072[var2];
        Object var4 = super.field1076[var2];
        super.field1076[var2] = null;
        if (~this.field4670 == -22) {
            class166.method1022(this.field4662, (class254) var4);
        } else if (~this.field4670 != -21) {
            if (~this.field4670 <= -31 && this.field4670 <= 33) {
                class296.field4257.method1737(3000.0F, super.field1070[var2] * 1.5F);
                ((class351) var4).method741(class104.field1491, class428.field6302, class264.field3838, class211.field2799, ~(this.field4670 + -30) == -1);
            } else if (~this.field4670 <= -41 && this.field4670 <= 43) {
                class296.field4257.method1737(3000.0F, super.field1070[var2] * 1.5F);
                ((class351) var4).method741(class104.field1491, class428.field6302, class264.field3838, class5.field67, ~(this.field4670 + -40) == -1);
            } else {
                if (~this.field4670 != -23) {
                    if (~this.field4670 == -24) {
                        class296.field4257.method1749();
                        return;
                    }
                    if (~this.field4670 == -25) {
                        class296.field4257.method1626(0, (class367[]) null);
                        return;
                    }
                } else {
                    class296.field4257.method1746(-1, 1583160, 40);
                }
            }
        } else {
            class254 var5 = (class254) var4;
            if (var5.field3510 != null) {
                var5.field3510.method103(123, class296.field4257);
            }
            if (var5.field3512 != null) {
                var5.field3512.method103(120, class296.field4257);
            }
            if (var5.field3519 != null) {
                var5.field3519.method103(116, class296.field4257);
            }
            if (var5.field3502 != null) {
                var5.field3502.method103(122, class296.field4257);
            }
            if (var5.field3527 != null) {
                var5.field3527.method103(104, class296.field4257);
            }
            for (class328 var6 = var5.field3515; var6 != null; var6 = var6.field4783) {
                var6.field4785.method103(127, class296.field4257);
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II[I[Ljava/lang/Object;I)V")
    public static final void method2150(int arg0, int arg1, int[] arg2, Object[] arg3, int arg4) {
        ++field4661;
        if (~arg4 < ~arg0) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg0;
            int var7 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var7;
            Object var8 = arg3[var5];
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var8;
            for (int var9 = arg0; ~var9 > ~arg4; ++var9) {
                if ((1 & var9) + var7 > arg2[var9]) {
                    int var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    Object var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg2[arg4] = arg2[var6];
            arg2[var6] = var7;
            arg3[arg4] = arg3[var6];
            arg3[var6] = var8;
            method2150(arg0, -1, arg2, arg3, var6 + -1);
            method2150(var6 - -1, -1, arg2, arg3, arg4);
        }
        if (arg1 != -1) {
            field4671 = 105;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(BI)V")
    public final void method552(byte arg0, int arg1) {
        if (arg0 > -98) {
            field4666 = -47;
        }
        ++field4674;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IC)Z")
    public static final boolean method2151(int arg0, char arg1) {
        if (arg0 < 80) {
            field4666 = -37;
        }
        ++field4673;
        return arg1 >= '0' && ~arg1 >= -58;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZLgk;)V")
    public final void method559(boolean arg0, class254 arg1) {
        if (!arg0) {
            this.method557(1.147414F, 99, true, 117, (class351) null);
        }
        super.field1072[super.field1075] = 20;
        ++field4672;
        super.field1076[super.field1075] = arg1;
        ++super.field1075;
        if (~super.field1075 <= -5001) {
            super.field1075 = 0;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lgk;Z)V")
    public final void method554(class254 arg0, boolean arg1) {
        ++field4658;
        --super.field1080;
        if (super.field1080 < 0) {
            super.field1080 = 4999;
        }
        super.field1072[super.field1080] = 21;
        super.field1076[super.field1080] = arg0;
        if (arg1) {
            method2147(-101, 125, 102);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lgk;B)V")
    public final void method560(class254 arg0, byte arg1) {
        if (arg1 == 48) {
            ++field4667;
            super.field1072[super.field1075] = 21;
            super.field1076[super.field1075] = arg0;
            ++super.field1075;
            if (super.field1075 >= 5000) {
                super.field1075 = 0;
            }
        }
    }
}

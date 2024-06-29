import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class374 {

    @OriginalMember(owner = "client!hea", name = "j", descriptor = "[Ljava/lang/String;")
    private String[] field4796 = new String[0];

    @OriginalMember(owner = "client!hea", name = "k", descriptor = "Z")
    private boolean field4797 = false;

    @OriginalMember(owner = "client!hea", name = "n", descriptor = "I")
    private int field4800 = -1;

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "I")
    private int field4789;

    @OriginalMember(owner = "client!hea", name = "d", descriptor = "[Lga;")
    public static class63[] field4790 = new class63[14];

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!hea", name = "e", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!hea", name = "f", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!hea", name = "g", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!hea", name = "h", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!hea", name = "i", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!hea", name = "l", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!hea", name = "m", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!hea", name = "o", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZI)V")
    private final void method2144(boolean arg0, int arg1) {
        field4795++;
        String[] var3 = new String[this.method2150(-1, arg1)];
        if (arg0) {
            class443.method2512(this.field4796, 0, var3, 0, this.field4796.length);
            this.field4796 = var3;
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(Ljava/lang/String;II)V")
    private final void method2145(String arg0, int arg1, int arg2) {
        int var4 = -22 / ((65 - arg1) / 35);
        field4791++;
        if (arg2 > this.field4800) {
            this.field4800 = arg2;
        }
        if (this.field4796.length <= arg2) {
            this.method2144(true, arg2);
        }
        this.field4796[arg2] = arg0;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(B)[Ljava/lang/String;")
    public final String[] method2146(byte arg0) {
        field4801++;
        if (arg0 > -3) {
            return null;
        } else {
            String[] var2 = new String[this.field4800 + 1];
            class443.method2512(this.field4796, 0, var2, 0, this.field4800 + 1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!hea", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4788++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field4800; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field4796[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(B)[Lmv;")
    public static final class297[] method2147(byte arg0) {
        field4792++;
        if (arg0 >= -116) {
            method2151(58);
        }
        return new class297[] { class604.field8190, class150.field1925, class258.field3473, class254.field3458, class432.field5577, class332.field4311, class217.field2849, class628.field8772, class193.field2498, class608.field8214, class604.field8189, class694.field9485, class429.field5556, class280.field3667 };
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method2148(int arg0, String arg1) {
        this.method2145(arg1, -57, this.field4800 + 1);
        int var3 = -116 % ((arg0 + 14) / 36);
        field4793++;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "([I[ILdg;B[I)V")
    public static final void method2149(int[] arg0, int[] arg1, class193 arg2, byte arg3, int[] arg4) {
        if (arg3 != 36) {
            return;
        }
        field4798++;
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg1[var5];
            int var8 = arg0[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg2.field2991.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg2.field2991[var9] = null;
                    } else {
                        class348 var10 = class552.field7163.method3031(46, var6);
                        int var11 = var10.field4447;
                        class71 var12 = arg2.field2991[var9];
                        if (var12 != null) {
                            if (var12.field968 == var6) {
                                if (var11 == 0) {
                                    var12 = arg2.field2991[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field967 = var8;
                                    var12.field969 = 0;
                                    var12.field964 = 0;
                                    var12.field960 = 1;
                                    var12.field962 = 0;
                                    class451.method2548(var10, arg2.field508, arg2.field503, arg2.field506, 255, class233.field3130 == arg2, 0);
                                } else if (var11 == 2) {
                                    var12.field964 = 0;
                                }
                            } else if (var10.field4466 >= class552.field7163.method3031(-65, var12.field968).field4466) {
                                var12 = arg2.field2991[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class71 var13 = arg2.field2991[var9] = new class71();
                            var13.field968 = var6;
                            var13.field967 = var8;
                            var13.field962 = 0;
                            var13.field960 = 1;
                            var13.field969 = 0;
                            var13.field964 = 0;
                            class451.method2548(var10, arg2.field508, arg2.field503, arg2.field506, 255, class233.field3130 == arg2, 0);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(II)I")
    private final int method2150(int arg0, int arg1) {
        if (arg0 != -1) {
            return 91;
        }
        field4787++;
        int var3 = this.field4796.length;
        while (arg1 >= var3) {
            if (!this.field4797) {
                var3 += this.field4789;
            } else if (var3 == 0) {
                var3 = 1;
            } else {
                var3 = this.field4789 * var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)V")
    public static void method2151(int arg0) {
        if (arg0 != 0) {
            field4794 = -38;
        }
        field4790 = null;
    }

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(IZ)V")
    public class374(int arg0, boolean arg1) {
        this.field4789 = arg0;
        this.field4797 = arg1;
    }
}

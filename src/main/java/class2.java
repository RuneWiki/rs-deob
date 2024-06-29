import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class2 {

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "Lkn;")
    private class233 field35 = new class233();

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    private int field41;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    private int field40;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "Lqo;")
    private class141 field31;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjava/lang/Object;Ldt;)V")
    public final void method14(int arg0, Object arg1, class431 arg2) {
        this.method24((byte) -53, arg2, arg1, 1);
        field38++;
        if (arg0 != -25264) {
            this.field41 = -14;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIII)I")
    public static final int method15(int arg0, int arg1, int arg2, int arg3) {
        field33++;
        int var4 = arg3 & 0x3;
        if (arg1 != 1126076368) {
            method15(-4, 61, 95, -18);
        }
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 1023 - arg2;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ldt;B)V")
    private final void method16(class431 arg0, byte arg1) {
        if (arg1 != 46) {
            return;
        }
        field28++;
        long var3 = arg0.method1565(88);
        for (class156 var5 = (class156) this.field31.method943(var3, arg1 ^ 0xFFFFFFD1); var5 != null; var5 = (class156) this.field31.method945((byte) -124)) {
            if (var5.field2268.method1567(23620, arg0)) {
                this.method21(var5, -26729);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public final void method17(int arg0) {
        field36++;
        this.field35.method1580(-5735);
        if (arg0 <= 82) {
            this.method16(null, (byte) -108);
        }
        this.field31.method937(0);
        this.field40 = this.field41;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)I")
    public final int method18(int arg0) {
        if (arg0 != -32241) {
            this.field35 = null;
        }
        field27++;
        return this.field41;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)V")
    public final void method19(int arg0, boolean arg1) {
        field34++;
        if (class11.field189 != null) {
            for (class156 var3 = (class156) this.field35.method1581((byte) 53); var3 != null; var3 = (class156) this.field35.method1585(-1)) {
                if (var3.method1005(true)) {
                    if (var3.method1006((byte) 2) == null) {
                        var3.method2785((byte) -120);
                        var3.method560((byte) -37);
                        this.field40 += var3.field2267;
                    }
                } else if (((long) arg0) < (++var3.field1173)) {
                    class156 var4 = class11.field189.method512(var3, 1);
                    this.field31.method940(var3.field6799, -106, var4);
                    class223.method1506(var4, var3, 0);
                    var3.method2785((byte) -120);
                    var3.method560((byte) -89);
                }
            }
        }
        if (arg1) {
            this.field31 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIILgl;)Lci;")
    public static final class479 method20(int arg0, int arg1, int arg2, class432 arg3) {
        field29++;
        int var4 = arg1 << 8 | arg3.field6407;
        class479 var5 = (class479) class193.field2736.method2211((long) var4 << 16, -128);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class501.field7486.method2638(true, class501.field7486.method2619(var4, true));
        if (var6 == null) {
            if (arg0 != 7035) {
                return null;
            }
            int var8 = arg2 + 65536 << 8 | arg3.field6407;
            class479 var9 = (class479) class193.field2736.method2211((long) var8 << 16, -128);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class501.field7486.method2638(true, class501.field7486.method2619(var8, true));
            if (var10 == null) {
                int var12 = arg3.field6407 | 0xFFFF00;
                class479 var13 = (class479) class193.field2736.method2211((long) var12 << 16, arg0 - 7163);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class501.field7486.method2638(true, class501.field7486.method2619(var12, true));
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class479 var15 = class403.method2474(var14, (byte) -56);
                    var15.field6995 = arg3;
                    class193.field2736.method2216(var15, (long) var12 << 16, -25431);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class479 var11 = class403.method2474(var10, (byte) -122);
                var11.field6995 = arg3;
                class193.field2736.method2216(var11, (long) var8 << 16, arg0 - 32466);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class479 var7 = class403.method2474(var6, (byte) -59);
            var7.field6995 = arg3;
            class193.field2736.method2216(var7, (long) var4 << 16, -25431);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lck;I)V")
    private final void method21(class156 arg0, int arg1) {
        if (arg0 != null) {
            arg0.method2785((byte) -120);
            arg0.method560((byte) 125);
            this.field40 += arg0.field2267;
        }
        if (arg1 == -26729) {
            field37++;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)I")
    public final int method22(boolean arg0) {
        field39++;
        if (arg0) {
            this.method19(-124, true);
        }
        return this.field40;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method23(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field30++;
        long var6 = (long) (arg2 | (arg5 ? Integer.MIN_VALUE : 0));
        class410 var8 = (class410) class353.field5477.method943(var6, arg1 - 2);
        if (var8 == null) {
            var8 = new class410();
            class353.field5477.method940(var6, -94, var8);
        }
        if (arg0 >= var8.field6169.length) {
            int[] var9 = new int[arg0 + 1];
            int[] var10 = new int[arg0 + 1];
            for (int var11 = 0; var11 < var8.field6169.length; var11++) {
                var9[var11] = var8.field6169[var11];
                var10[var11] = var8.field6166[var11];
            }
            for (int var12 = var8.field6169.length; var12 < arg0; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field6169 = var9;
            var8.field6166 = var10;
        }
        var8.field6169[arg0] = arg3;
        var8.field6166[arg0] = arg4;
        if (arg1 != 1) {
            method20(62, -122, -1, null);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLdt;Ljava/lang/Object;I)V")
    private final void method24(byte arg0, class431 arg1, Object arg2, int arg3) {
        field24++;
        if (this.field41 < arg3) {
            throw new IllegalStateException("s>cs");
        }
        this.method16(arg1, (byte) 46);
        this.field40 -= arg3;
        while (this.field40 < 0) {
            class156 var6 = (class156) this.field35.method1583(104);
            this.method21(var6, arg0 - 26676);
        }
        class530 var5 = new class530(arg1, arg2, arg3);
        if (arg0 != -53) {
            this.method19(-126, false);
        }
        this.field31.method940(arg1.method1565(70), -109, var5);
        this.field35.method1582(var5, arg0 + 52);
        var5.field1173 = 0L;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZLdt;)Ljava/lang/Object;")
    public final Object method25(boolean arg0, class431 arg1) {
        field25++;
        long var3 = arg1.method1565(81);
        if (!arg0) {
            return null;
        }
        for (class156 var5 = (class156) this.field31.method943(var3, -1); var5 != null; var5 = (class156) this.field31.method945((byte) -122)) {
            if (var5.field2268.method1567(23620, arg1)) {
                Object var6 = var5.method1006((byte) 2);
                if (var6 != null) {
                    if (var5.method1005(true)) {
                        class530 var7 = new class530(arg1, var6, var5.field2267);
                        this.field31.method940(var5.field6799, -126, var7);
                        this.field35.method1582(var7, -1);
                        var7.field1173 = 0L;
                        var5.method2785((byte) -120);
                        var5.method560((byte) 126);
                    } else {
                        this.field35.method1582(var5, -1);
                        var5.field1173 = 0L;
                    }
                    return var6;
                }
                var5.method2785((byte) -120);
                var5.method560((byte) -88);
                this.field40 += var5.field2267;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)V")
    public final void method26(int arg0) {
        if (arg0 != -1) {
            return;
        }
        for (class156 var2 = (class156) this.field35.method1581((byte) 53); var2 != null; var2 = (class156) this.field35.method1585(-1)) {
            if (var2.method1005(true)) {
                var2.method2785((byte) -120);
                var2.method560((byte) -123);
                this.field40 += var2.field2267;
            }
        }
        field26++;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BII)I")
    public static final int method27(byte arg0, int arg1, int arg2) {
        if (arg0 >= -34) {
            return -106;
        } else {
            field32++;
            int var3 = arg1 >> 31 & arg2 - 1;
            return ((arg1 >>> 31) + arg1) % arg2 + var3;
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(I)V")
    public class2(int arg0) {
        this.field41 = arg0;
        this.field40 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field31 = new class141(var2);
    }

    static {
        new class375("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
    }
}

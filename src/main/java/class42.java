import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class42 extends class34 {

    @OriginalMember(owner = "client!mj", name = "W", descriptor = "I")
    private int field744;

    @OriginalMember(owner = "client!mj", name = "P", descriptor = "Ljava/lang/String;")
    public static String field737 = " is already on your friend list.";

    @OriginalMember(owner = "client!mj", name = "U", descriptor = "I")
    public static int field742 = 0;

    @OriginalMember(owner = "client!mj", name = "Y", descriptor = "I")
    public static int field746 = 0;

    @OriginalMember(owner = "client!mj", name = "Q", descriptor = "Loe;")
    public static class9 field738 = new class9();

    @OriginalMember(owner = "client!mj", name = "R", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!mj", name = "S", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!mj", name = "X", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!mj", name = "Z", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!mj", name = "ab", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!mj", name = "bb", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!mj", name = "V", descriptor = "Lec;")
    public static class40 field743;

    @OriginalMember(owner = "client!mj", name = "T", descriptor = "Lni;")
    public static class52 field741;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(B)V")
    public static final void method343(byte arg0) {
        ++field745;
        if (~class73.field1190 == -6) {
            class73.field1190 = 6;
            if (arg0 != 25) {
                field746 = -114;
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(I)V")
    public class42(int arg0) {
        super(0, true);
        this.field744 = 4096;
        this.field744 = arg0;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lug;ILug;)V")
    public static final void method344(class181 arg0, int arg1, class181 arg2) {
        ++field740;
        if (arg2.field2635 != null) {
            arg2.method1193(116);
        }
        arg2.field2633 = arg0;
        arg2.field2635 = arg0.field2635;
        int var3 = -83 % ((arg1 - 47) / 60);
        arg2.field2635.field2633 = arg2;
        arg2.field2633.field2635 = arg2;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        if (~arg1 == -1) {
            this.field744 = (arg2.method407(arg0 ^ 249) << 12) / 255;
        }
        ++field747;
        if (arg0 != 6) {
            method344((class181) null, 98, (class181) null);
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
    public class42() {
        this(4096);
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(B)V")
    public static void method345(byte arg0) {
        int var1 = 81 / ((arg0 - -11) / 37);
        field738 = null;
        field737 = null;
        field741 = null;
        field743 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZILjava/lang/String;)I")
    public static final int method346(int arg0, boolean arg1, int arg2, String arg3) {
        ++field748;
        if (arg0 >= 2 && arg0 <= 36) {
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = arg3.length();
            if (arg2 != -14750) {
                return -84;
            } else {
                for (int var8 = 0; var8 < var7; ++var8) {
                    char var9 = arg3.charAt(var8);
                    if (~var8 == -1) {
                        if (var9 == '-') {
                            var4 = true;
                            continue;
                        }
                        if (var9 == '+' && arg1) {
                            continue;
                        }
                    }
                    int var11;
                    if (~var9 <= -49 && ~var9 >= -58) {
                        var11 = var9 - '0';
                    } else if (var9 >= 'A' && ~var9 >= -91) {
                        var11 = var9 - '7';
                    } else {
                        if (var9 < 'a' || var9 > 'z') {
                            throw new NumberFormatException();
                        }
                        var11 = var9 - 'W';
                    }
                    if (~arg0 >= ~var11) {
                        throw new NumberFormatException();
                    }
                    if (var4) {
                        var11 = -var11;
                    }
                    int var10 = arg0 * var6 + var11;
                    if (var10 / arg0 != var6) {
                        throw new NumberFormatException();
                    }
                    var6 = var10;
                    var5 = true;
                }
                if (!var5) {
                    throw new NumberFormatException();
                } else {
                    return var6;
                }
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        ++field749;
        int[] var3 = super.field610.method228(24856, arg1);
        if (arg0 < 75) {
            field738 = null;
        }
        if (super.field610.field597) {
            class41.method342(var3, 0, class226.field3527, this.field744);
        }
        return var3;
    }
}

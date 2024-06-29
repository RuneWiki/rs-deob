import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class44 extends class142 {

    @OriginalMember(owner = "client!ee", name = "X", descriptor = "I")
    private int field721;

    @OriginalMember(owner = "client!ee", name = "W", descriptor = "I")
    public static int field720 = 0;

    @OriginalMember(owner = "client!ee", name = "R", descriptor = "Lai;")
    public static class10 field715 = method278("k", -76);

    @OriginalMember(owner = "client!ee", name = "Z", descriptor = "I")
    public static int field723 = 0;

    @OriginalMember(owner = "client!ee", name = "bb", descriptor = "[I")
    public static int[] field725 = new int[1000];

    @OriginalMember(owner = "client!ee", name = "ab", descriptor = "B")
    public static byte field724;

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!ee", name = "S", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!ee", name = "Y", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!ee", name = "cb", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!ee", name = "db", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!ee", name = "V", descriptor = "Lqf;")
    public static class151 field719;

    @OriginalMember(owner = "client!ee", name = "U", descriptor = "Z")
    public static boolean field718;

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "[Lta;")
    public static class173[] field717;

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(I)V")
    private class44(int arg0) {
        super(0, true);
        this.field721 = 4096;
        this.field721 = arg0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[B)V")
    public static final void method275(int arg0, byte[] arg1) {
        ++field727;
        class114 var2 = new class114(arg1);
        var2.field2170 = arg1.length + -2;
        class37.field586 = var2.method762((byte) 117);
        class145.field2781 = new int[class37.field586];
        class87.field1547 = new int[class37.field586];
        class18.field263 = new int[class37.field586];
        class100.field1857 = new int[class37.field586];
        class189.field3615 = new byte[class37.field586][];
        var2.field2170 = arg1.length + -7 + -(class37.field586 * 8);
        class184.field3500 = var2.method762((byte) 124);
        class144.field2754 = var2.method762((byte) 99);
        int var3 = (var2.method767(true) & 255) - -1;
        for (int var4 = 0; ~var4 > ~class37.field586; ++var4) {
            class87.field1547[var4] = var2.method762((byte) 71);
        }
        for (int var5 = 0; var5 < class37.field586; ++var5) {
            class18.field263[var5] = var2.method762((byte) 120);
        }
        for (int var6 = 0; ~class37.field586 < ~var6; ++var6) {
            class100.field1857[var6] = var2.method762((byte) 74);
        }
        if (arg0 >= -123) {
            field720 = -48;
        }
        for (int var7 = 0; var7 < class37.field586; ++var7) {
            class145.field2781[var7] = var2.method762((byte) 90);
        }
        var2.field2170 = arg1.length + -(class37.field586 * 8) + -4 - var3 * 3;
        class140.field2639 = new int[var3];
        for (int var8 = 1; var8 < var3; ++var8) {
            class140.field2639[var8] = var2.method771(118);
            if (~class140.field2639[var8] == -1) {
                class140.field2639[var8] = 1;
            }
        }
        var2.field2170 = 0;
        for (int var9 = 0; ~var9 > ~class37.field586; ++var9) {
            int var10 = class100.field1857[var9];
            int var11 = class145.field2781[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class189.field3615[var9] = var13;
            int var14 = var2.method767(true);
            if (var14 == 0) {
                for (int var15 = 0; var12 > var15; ++var15) {
                    var13[var15] = var2.method759((byte) 127);
                }
            } else if (~var14 == -2) {
                for (int var16 = 0; var16 < var10; ++var16) {
                    for (int var17 = 0; var11 > var17; ++var17) {
                        var13[var10 * var17 + var16] = var2.method759((byte) 127);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V")
    public static final void method276(int arg0) {
        class101.field1882 = new class32(32);
        if (arg0 <= 106) {
            method278((String) null, 45);
        }
        ++field726;
    }

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)V")
    public static void method277(int arg0) {
        if (arg0 == 255) {
            field715 = null;
            field719 = null;
            field725 = null;
            field717 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/lang/String;I)Lai;")
    public static final class10 method278(String arg0, int arg1) {
        int var2 = 113 % ((43 - arg1) / 48);
        ++field714;
        byte[] var3 = arg0.getBytes();
        int var4 = var3.length;
        int var5 = 0;
        class10 var6 = new class10();
        var6.field160 = new byte[var4];
        while (~var4 < ~var5) {
            int var7 = 255 & var3[var5++];
            if (~var7 >= -46 && ~var7 <= -41) {
                if (var5 >= var4) {
                    break;
                }
                int var8 = 255 & var3[var5++];
                var6.field160[var6.field118++] = (byte) ((var7 - 40) * 43 + var8 + -48);
            } else if (var7 != 0) {
                var6.field160[var6.field118++] = (byte) var7;
            }
        }
        var6.method60((byte) -59);
        return var6.method69(0);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZI)[I")
    public final int[] method6(boolean arg0, int arg1) {
        int[] var3 = super.field2683.method1186((byte) -114, arg1);
        if (arg0) {
            return null;
        } else {
            if (super.field2683.field3516) {
                class12.method84(var3, 0, class133.field2499, this.field721);
            }
            ++field722;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
    public class44() {
        this(4096);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        if (arg2 > -34) {
            this.method78((class114) null, -86, (byte) -11);
        }
        ++field716;
        if (~arg1 == -1) {
            this.field721 = (arg0.method767(true) << 12) / 255;
        }
    }
}

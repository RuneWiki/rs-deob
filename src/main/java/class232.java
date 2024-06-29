import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class232 extends class424 {

    @OriginalMember(owner = "client!nn", name = "M", descriptor = "I")
    private int field3257 = 4096;

    @OriginalMember(owner = "client!nn", name = "Q", descriptor = "I")
    private int field3261 = 4096;

    @OriginalMember(owner = "client!nn", name = "R", descriptor = "I")
    private int field3262 = 4096;

    @OriginalMember(owner = "client!nn", name = "L", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!nn", name = "N", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!nn", name = "O", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!nn", name = "S", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!nn", name = "T", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!nn", name = "P", descriptor = "Lgf;")
    public static class202 field3260;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(II)V")
    public static final void method1512(int arg0, int arg1) {
        class63 var2 = class341.field4617[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; ++var3) {
            class63 var4 = class341.field4617[var3][arg0][arg1] = class341.field4617[var3 + 1][arg0][arg1];
            if (var4 != null) {
                --var4.field865;
                for (class48 var5 = var4.field853; var5 != null; var5 = var5.field608) {
                    class5 var6 = var5.field617;
                    if (var6.field52 == arg0 && var6.field55 == arg1) {
                        --var6.field42;
                    }
                }
            }
        }
        if (class341.field4617[0][arg0][arg1] == null) {
            class341.field4617[0][arg0][arg1] = new class63(0, arg0, arg1);
            class341.field4617[0][arg0][arg1].field851 = 1;
        }
        class341.field4617[0][arg0][arg1].field873 = var2;
        class341.field4617[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V")
    public class232() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILea;)V")
    public static final void method1513(int arg0, class58 arg1) {
        if (arg0 != -78) {
            method1514((byte) 13);
        }
        if (class317.field4324) {
            class174.method1234(arg1, (byte) -123);
        } else {
            class352.method2122(arg1, -10461);
        }
        ++field3256;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method21(int arg0, boolean arg1) {
        ++field3258;
        int[][] var3 = super.field5896.method693(arg1, arg0);
        if (super.field5896.field1228) {
            int[][] var4 = this.method2624(arg1, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class303.field4135 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && ~var13 == ~var14) {
                    var8[var11] = this.field3257 * var12 >> 12;
                    var9[var11] = this.field3262 * var13 >> 12;
                    var10[var11] = this.field3261 * var14 >> 12;
                } else {
                    var8[var11] = this.field3257;
                    var9[var11] = this.field3262;
                    var10[var11] = this.field3261;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "(B)V")
    public static final void method1514(byte arg0) {
        class387.method2383(false, false);
        int var1 = -84 / ((arg0 - 28) / 53);
        ++field3264;
        if (~class422.field5842 <= -1 && class422.field5842 != 0) {
            class90.method715(87, class422.field5842);
            class422.field5842 = -1;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lrg;BI)V")
    public final void method19(class366 arg0, byte arg1, int arg2) {
        ++field3259;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field3261 = arg0.method2297(13352);
                }
            } else {
                this.field3262 = arg0.method2297(arg1 ^ -13320);
            }
        } else {
            this.field3257 = arg0.method2297(13352);
        }
        if (arg1 != -48) {
            this.field3257 = 79;
        }
    }

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "(I)V")
    public static void method1515(int arg0) {
        int var1 = -78 / ((arg0 - -27) / 38);
        field3260 = null;
    }

    static {
        new class368((String) null, "Dieses System darf nicht missbraucht werden!", (String) null, (String) null);
    }
}

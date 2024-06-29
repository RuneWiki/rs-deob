import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class183 extends class262 {

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "I")
    private int field3055 = 4096;

    @OriginalMember(owner = "client!ka", name = "U", descriptor = "I")
    private int field3061 = 4096;

    @OriginalMember(owner = "client!ka", name = "Y", descriptor = "I")
    private int field3065 = 4096;

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "Lok;")
    public static class146 field3056 = class235.method1724(-12908, "::qa_op_test");

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "Z")
    public static boolean field3057 = false;

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "Lok;")
    public static class146 field3062 = class235.method1724(-12908, "Connexion perdue)3");

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "[I")
    public static int[] field3060 = new int[25];

    @OriginalMember(owner = "client!ka", name = "cb", descriptor = "Lok;")
    public static class146 field3069 = class235.method1724(-12908, ")1 ");

    @OriginalMember(owner = "client!ka", name = "bb", descriptor = "Lok;")
    private static class146 field3068 = class235.method1724(-12908, "Loaded world list data");

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "Lok;")
    public static class146 field3058 = field3068;

    @OriginalMember(owner = "client!ka", name = "W", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!ka", name = "X", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!ka", name = "Z", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!ka", name = "ab", descriptor = "Loh;")
    public static class15 field3067;

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "[I")
    public static int[] field3059;

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V", line = 13)
    public class183() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lwe;II)V", line = 28)
    public final void method40(class47 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field3061 = arg0.method379(-2);
        } else if (arg2 == 1) {
            this.field3065 = arg0.method379(-2);
        } else if (arg2 == 2) {
            this.field3055 = arg0.method379(arg1 - 2050);
        }
        field3064++;
        if (arg1 != 2048) {
            field3067 = (class15) null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)[[I", line = 77)
    public final int[][] method87(int arg0, int arg1) {
        field3063++;
        if (arg0 != 7) {
            field3068 = (class146) null;
        }
        int[][] var3 = this.field4347.method536(arg1, arg0 + 4089);
        if (this.field4347.field1202) {
            int[][] var4 = this.method1893(0, arg1, 106);
            int[] var5 = var4[1];
            int[] var6 = var3[0];
            int[] var7 = var4[2];
            int[] var8 = var4[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class98.field1598; var11++) {
                int var12 = var8[var11];
                int var13 = var7[var11];
                int var14 = var5[var11];
                if (var12 == var13 && var13 == var14) {
                    var6[var11] = this.field3061 * var12 >> 12;
                    var9[var11] = this.field3065 * var13 >> 12;
                    var10[var11] = this.field3055 * var14 >> 12;
                } else {
                    var6[var11] = this.field3061;
                    var9[var11] = this.field3065;
                    var10[var11] = this.field3055;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZLr;)V", line = 147)
    public static final void method1444(int arg0, boolean arg1, class264 arg2) {
        field3066++;
        if (arg0 != 25096) {
            return;
        }
        int var3 = arg2.field4490 == 0 ? arg2.field4393 : arg2.field4490;
        int var4 = arg2.field4513 == 0 ? arg2.field4381 : arg2.field4513;
        class21.method149(arg2.field4461, var4, class92.field1459[arg2.field4461 >> 16], arg1, var3, 255);
        if (arg2.field4402 != null) {
            class21.method149(arg2.field4461, var4, arg2.field4402, arg1, var3, 255);
        }
        class142 var5 = (class142) class135.field2266.method810((byte) -111, (long) arg2.field4461);
        if (var5 != null) {
            class194.method1497(arg1, var3, 17898, var5.field2370, var4);
        }
    }

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "(I)V", line = 184)
    public static void method1445(int arg0) {
        field3056 = null;
        field3067 = null;
        field3059 = null;
        field3058 = null;
        field3068 = null;
        int var1 = 123 / ((-arg0 - 65) / 53);
        field3069 = null;
        field3062 = null;
        field3060 = null;
    }
}

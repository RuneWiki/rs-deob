import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class530 {

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "J")
    public long field7731;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "Ljava/lang/String;")
    public String field7730;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public int field7725;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public int field7727;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "Ljava/lang/String;")
    public String field7732;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Z")
    public static boolean field7723 = false;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "Lrl;")
    public static class672 field7729 = new class672(37, 11);

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field7722;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field7724;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field7726;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "[[B")
    public static byte[][] field7728;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V", line = 8)
    public static void method3206(byte arg0) {
        if (arg0 >= -124) {
            method3207(-113);
        }
        field7729 = null;
        field7728 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 27)
    public static final void method3207(int arg0) {
        class505.field7382 = 0;
        field7726++;
        int var1 = (class567.field8141.field9696 >> 9) + class612.field8702;
        int var2 = (class567.field8141.field9705 >> 9) + class626.field8855;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class505.field7382 = 1;
        }
        int var3 = 65 / ((-arg0 - 39) / 52);
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class505.field7382 = 1;
        }
        if (class505.field7382 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class505.field7382 = 0;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZI[B)I", line = 52)
    public static final int method3208(boolean arg0, int arg1, byte[] arg2) {
        if (arg0) {
            return 93;
        } else {
            field7724++;
            return class475.method2946(0, arg1, arg2, 89);
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V", line = 69)
    public static final void method3209(int arg0) {
        field7722++;
        if (arg0 != -3140) {
            return;
        }
        int var1 = class99.field1607;
        int[] var2 = class359.field5700;
        for (int var3 = 0; var3 < var1; var3++) {
            class304 var4 = class597.field8465[var2[var3]];
            if (var4 != null) {
                class529.method3202(0, var4.method1841(20744), var4);
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V", line = 95)
    public class530(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field7731 = arg4;
        this.field7730 = arg1;
        this.field7725 = arg2;
        this.field7727 = arg0;
        this.field7732 = arg3;
    }
}

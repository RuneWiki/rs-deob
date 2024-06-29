import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class188 extends class2 {

    @OriginalMember(owner = "client!tp", name = "m", descriptor = "[I")
    public int[] field2529;

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "[I")
    public int[] field2523;

    @OriginalMember(owner = "client!tp", name = "l", descriptor = "I")
    public static int field2528 = 0;

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "Lcr;")
    public static class189 field2524 = new class189(64);

    @OriginalMember(owner = "client!tp", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2531 = "cyan:";

    @OriginalMember(owner = "client!tp", name = "p", descriptor = "I")
    public static int field2532 = 0;

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!tp", name = "j", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!tp", name = "n", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!tp", name = "k", descriptor = "Llm;")
    public static class347 field2527;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
    public static final void method1131(int arg0) {
        class307.field4523 = 0;
        if (arg0 != -15809) {
            field2528 = -6;
        }
        field2526++;
        int var1 = (class227.field2988.field740 >> 7) + class7.field138;
        int var2 = (class227.field2988.field734 >> 7) + class200.field2660;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class307.field4523 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class307.field4523 = 1;
        }
        if (class307.field4523 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class307.field4523 = 0;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(BLps;)Z")
    public static final boolean method1132(byte arg0, class394 arg1) {
        field2525++;
        if (arg0 >= -5) {
            field2532 = 116;
        }
        if (arg1.field5635 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field5635.length; var2++) {
            int var3 = class148.method938(-8, var2, arg1);
            int var4 = arg1.field5717[var2];
            if (arg1.field5635[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg1.field5635[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg1.field5635[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)V")
    public static void method1133(int arg0) {
        field2527 = null;
        int var1 = 11 / ((-arg0 - 62) / 62);
        field2531 = null;
        field2524 = null;
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(II[I[I)V")
    public class188(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field2529 = arg3;
        this.field2523 = arg2;
    }
}

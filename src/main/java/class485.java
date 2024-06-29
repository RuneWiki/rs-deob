import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class485 {

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "[I")
    public static int[] field6811 = new int[25];

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "I")
    public static int field6810;

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "I")
    public static int field6812;

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "I")
    public static int field6813;

    @OriginalMember(owner = "client!lda", name = "e", descriptor = "I")
    public static int field6814;

    @OriginalMember(owner = "client!lda", name = "f", descriptor = "[[[S")
    public static short[][][] field6815;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(B)V")
    public static final void method2904(byte arg0) {
        if (class220.field2882 != null) {
            class220.field2882.method2484(-8910);
        }
        int var1 = -4 % ((-arg0 - 26) / 49);
        field6814++;
        if (class503.field7209 != null) {
            class503.field7209.method2484(-8910);
        }
    }

    @OriginalMember(owner = "client!lda", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6813++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(I)V")
    public static final void method2905(int arg0) {
        field6812++;
        if (!class425.field5980) {
            return;
        }
        if (arg0 <= 96) {
            field6815 = null;
        }
        while (true) {
            while (class408.field5786 < class315.field4364.length) {
                class287 var1 = class315.field4364[class408.field5786];
                if (var1 != null && var1.field4064 == -1) {
                    if (class740.field10286 == null) {
                        class740.field10286 = class19.field291.method4080(var1.field4062, (byte) 54);
                    }
                    int var2 = class740.field10286.field6392;
                    if (var2 == -1) {
                        return;
                    }
                    class408.field5786++;
                    class740.field10286 = null;
                    var1.field4064 = var2;
                } else {
                    class408.field5786++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(I)V")
    public static final void method2906(int arg0) {
        field6810++;
        if (class457.field6447 == -1) {
            return;
        }
        int var1 = class530.field7470.method1094(-108);
        int var2 = class530.field7470.method1089((byte) -63);
        class382 var3 = (class382) class43.field528.method2765(arg0 ^ 0xFFFFD002);
        if (arg0 != 25) {
            field6811 = null;
        }
        if (var3 != null) {
            var1 = var3.method779((byte) -76);
            var2 = var3.method776(-121);
        }
        int var4 = 0;
        int var5 = 0;
        if (class589.field8295) {
            var4 = class171.method1102(arg0 + 5442);
            var5 = class575.method3288((byte) -126);
        }
        class349.method2252(var4, var5, class172.field2348 + var5, var5, var2, -1, var2 + var5, var4, var1 + var4, var4 - -class446.field6323, class457.field6447, var1);
        if (class230.field3104 != null) {
            class746.method4153(var2 + var5, 0, var1 + var4);
        }
    }

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "(I)V")
    public static void method2907(int arg0) {
        if (arg0 != 421) {
            method2905(76);
        }
        field6815 = null;
        field6811 = null;
    }
}

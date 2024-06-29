import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public abstract class class485 extends class132 {

    @OriginalMember(owner = "client!k", name = "y", descriptor = "I")
    public static int field6821 = class98.method703(1600, 0);

    @OriginalMember(owner = "client!k", name = "z", descriptor = "Z")
    public static boolean field6822 = false;

    @OriginalMember(owner = "client!k", name = "A", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!k", name = "B", descriptor = "[[[B")
    public static byte[][][] field6824;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(Z)V")
    public static void method2824(boolean arg0) {
        if (arg0) {
            method2824(false);
        }
        field6824 = null;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V")
    public static final void method2825(int arg0) {
        field6823++;
        int[] var1 = new int[class181.field2574.field2017];
        int var2 = 0;
        for (int var3 = 0; var3 < class181.field2574.field2017; var3++) {
            class621 var5 = class181.field2574.method866(var3, (byte) 79);
            if (var5.field8914 >= 0 || var5.field8918 >= 0) {
                var1[var2++] = var3;
            }
        }
        class524.field7358 = new int[var2];
        for (int var4 = arg0; var4 < var2; var4++) {
            class524.field7358[var4] = var1[var4];
        }
    }
}

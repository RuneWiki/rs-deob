import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class734 {

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "[I")
    public int[] field10178;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field10175 = 0;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "[I")
    public static int[] field10177 = new int[1000];

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field10176;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static void method4073(int arg0) {
        field10177 = null;
        if (arg0 != 0) {
            field10175 = -27;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLjp;)V")
    private final void method4074(byte arg0, class376 arg1) {
        field10176++;
        if (arg0 > -42) {
            return;
        }
        while (true) {
            int var3;
            do {
                var3 = arg1.method2398(-1372747256);
                if (var3 == 0) {
                    return;
                }
            } while (var3 != 1);
            int var4 = arg1.method2398(-1372747256);
            this.field10178 = new int[var4];
            for (int var5 = 0; var5 < this.field10178.length; var5++) {
                this.field10178[var5] = arg1.method2398(-1372747256);
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Laj;)V")
    public class734(class333 arg0) {
        byte[] var2 = arg0.method2114(6, false);
        this.method4074((byte) -76, new class376(var2));
        if (this.field10178 == null) {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
    protected class734() {
        this.field10178 = new int[0];
    }
}

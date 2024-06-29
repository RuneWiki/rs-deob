import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class442 {

    @OriginalMember(owner = "client!go", name = "b", descriptor = "[Lqv;")
    public class308[] field6426 = null;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "Ldw;")
    public class503 field6427 = null;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "Ldw;")
    public class503 field6429 = null;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "[Lqv;")
    public class308[] field6431 = null;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "Ldw;")
    public class503 field6425 = null;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "Z")
    public boolean field6430;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "I")
    public static int field6432 = 1;

    @OriginalMember(owner = "client!go", name = "j", descriptor = "I")
    public static int field6434;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "I")
    public static int field6435;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "Luf;")
    public static class310 field6433;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    public static int field6428;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)V")
    public static void method2634(boolean arg0) {
        field6433 = null;
        if (arg0) {
            field6433 = null;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V")
    public static final void method2635(byte arg0) {
        if (arg0 != 52) {
            field6433 = null;
        }
        field6428++;
        class378.field5322 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            class367.field5152[var1] = null;
            class324.field4454[var1] = 1;
            class26.field405[var1] = null;
        }
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lht;)V")
    public class442(class410 arg0) {
        this.field6430 = arg0.field5912;
        class512.method3004((byte) 112, arg0);
        if (this.field6430) {
            byte[] var6 = class103.method682(-2, false, class67.field939);
            this.field6429 = new class503(arg0, 6410, 128, 128, 16, var6, 6410);
            byte[] var7 = class103.method682(-2, false, class239.field3282);
            this.field6427 = new class503(arg0, 6410, 128, 128, 16, var7, 6410);
            class519 var8 = arg0.field5861;
            if (var8.method3057(35632)) {
                byte[] var9 = class103.method682(-2, false, class178.field2527);
                this.field6425 = new class503(arg0, 6408, 128, 128, 16);
                class503 var10 = new class503(arg0, 6409, 128, 128, 16, var9, 6409);
                if (var8.method3053(this.field6425, var10, 2.0F, -105)) {
                    this.field6425.method1127((byte) -63);
                } else {
                    this.field6425.method1131(100);
                    this.field6425 = null;
                }
                var10.method1131(100);
            }
        } else {
            this.field6431 = new class308[16];
            for (int var2 = 0; var2 < 16; var2++) {
                byte[] var5 = class12.method105(class67.field939, var2 * 128 * 2 * 128, -21478, 32768);
                this.field6431[var2] = new class308(arg0, 3553, 6410, 128, 128, true, var5, 6410, false);
            }
            this.field6426 = new class308[16];
            for (int var3 = 0; var3 < 16; var3++) {
                byte[] var4 = class12.method105(class239.field3282, var3 * 2 * 128 * 128, -21478, 32768);
                this.field6426[var3] = new class308(arg0, 3553, 6410, 128, 128, true, var4, 6410, false);
            }
        }
    }

    static {
        new class83("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
        field6434 = 0;
        field6435 = 104;
        field6433 = new class310(50, 6);
    }
}

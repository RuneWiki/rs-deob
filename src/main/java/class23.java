import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class23 implements Runnable {

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "Z")
    public boolean field230 = true;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field231 = new Object();

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "[I")
    public int[] field235 = new int[500];

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public int field236 = 0;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "[I")
    public int[] field237 = new int[500];

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field229 = -1;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)Lem;")
    public static final class123 method150(int arg0, boolean arg1) {
        field233++;
        class123 var2 = (class123) class251.field3396.method2049(-56, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (!arg1) {
            method151((byte) 39);
        }
        byte[] var3 = class375.field5483.method361(33, 72, arg0);
        class123 var4 = new class123();
        if (var3 != null) {
            var4.method696((byte) 12, new class211(var3), arg0);
        }
        class251.field3396.method2046((long) arg0, 0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ud", name = "run", descriptor = "()V")
    public final void run() {
        field232++;
        while (this.field230) {
            Object var1 = this.field231;
            synchronized (this.field231) {
                if (this.field236 < 500) {
                    this.field235[this.field236] = class57.field654;
                    this.field237[this.field236] = class48.field562;
                    this.field236++;
                }
            }
            class278.method1757(50L, 0);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)I")
    public static final int method151(byte arg0) {
        field234++;
        if (class223.field3042 == null) {
            if (arg0 >= -41) {
                field229 = -75;
            }
            return class364.field5294 ? 2 : 1;
        } else {
            return 3;
        }
    }
}

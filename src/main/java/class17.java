import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class17 extends class418 {

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public int field274;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public static int field276 = 0;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    public static int field279 = 0;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    public static volatile int field278 = 0;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
    public static int field280 = -1;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "[I")
    public static int[] field275 = new int[4096];

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V")
    public class17() {
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V")
    public static void method128(int arg0) {
        field275 = null;
        if (arg0 != -1) {
            method129((String) null, (byte) -110);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method129(String arg0, byte arg1) {
        field273++;
        if (class222.field3064 == null) {
            class264.method1765(-82);
        }
        if (arg1 != -5) {
            field279 = 10;
        }
        String[] var2 = class33.method260(-2892, '\n', arg0);
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class222.field3064.length - 1; var4 > 0; var4--) {
                class222.field3064[var4] = class222.field3064[var4 - 1];
            }
            class222.field3064[0] = var2[var3];
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIII)V")
    public static final void method130(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class312.field4602 = arg2;
        class136.field1769 = arg1;
        class240.field3368 = arg3;
        if (arg4 == -25111) {
            field277++;
            class157.field1981 = arg0;
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(I)V")
    public class17(int arg0) {
        this.field274 = arg0;
    }
}

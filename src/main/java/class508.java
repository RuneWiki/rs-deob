import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class508 {

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "[I")
    public int[] field7097 = new int[100];

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "[Llm;")
    public class425[] field7101 = new class425[100];

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "[Lrh;")
    public class223[] field7100 = new class223[8];

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "[I")
    public int[] field7094 = new int[3];

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "I")
    public int field7093;

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "I")
    public static int field7095;

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "I")
    public static int field7096;

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "I")
    public static int field7098;

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "Ljava/lang/Object;")
    public Object field7099;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V")
    public static final void method2938(int arg0) {
        field7095++;
        if (arg0 != -28654) {
            return;
        }
        if (class512.field7214 == null) {
            class148 var1 = new class148();
            byte[] var2 = var1.method982(128, 128, 16, 2);
            class512.field7214 = class552.method3137(var2, (byte) 64, false);
        }
        if (class148.field2278 == null) {
            class351 var3 = new class351();
            byte[] var4 = var3.method2106(16, 118, 128, 128);
            class148.field2278 = class552.method3137(var4, (byte) 21, false);
        }
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)V")
    public static final void method2939(int arg0) {
        field7096++;
        if (arg0 >= -65 || !class606.field8738) {
            return;
        }
        while (true) {
            while (class35.field749.length > class277.field3828) {
                class212 var1 = class35.field749[class277.field3828];
                if (var1 != null && var1.field2996 == -1) {
                    if (class472.field6635 == null) {
                        class472.field6635 = class314.field4235.method3599(var1.field2995, 26);
                    }
                    int var2 = class472.field6635.field3448;
                    if (var2 == -1) {
                        return;
                    }
                    class277.field3828++;
                    class472.field6635 = null;
                    var1.field2996 = var2;
                } else {
                    class277.field3828++;
                }
            }
            return;
        }
    }
}

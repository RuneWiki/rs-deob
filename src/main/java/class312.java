import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class312 extends InputStream {

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "[I")
    public static int[] field4196 = new int[50];

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "[Ltq;")
    public static class250[] field4194 = new class250[2048];

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4201 = "glow2:";

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "[Lsj;")
    public static class72[] field4198 = new class72[6];

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4195 = "flash3:";

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "Lam;")
    public static class286 field4202;

    @OriginalMember(owner = "client!wh", name = "read", descriptor = "()I")
    public final int read() {
        class370.method2235(30000L, 10);
        field4197++;
        return -1;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V")
    public static void method1817(boolean arg0) {
        field4198 = null;
        field4196 = null;
        field4201 = null;
        field4194 = null;
        if (!arg0) {
            field4202 = null;
            field4195 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Lek;")
    public static final class266 method1818(int arg0, int arg1) {
        field4204++;
        class266 var2 = (class266) class69.field722.method616(-66, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class370.field5181.method1687(arg0, arg1, 255);
        class266 var4 = new class266();
        if (var3 != null) {
            var4.method1482(arg0, 75, new class250(var3));
        }
        class69.field722.method615((byte) -126, (long) arg0, var4);
        return var4;
    }
}

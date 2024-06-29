import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class304 {

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
    private int field4470 = 0;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "Lqo;")
    private class141 field4471;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4469 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "Z")
    public static boolean field4475 = false;

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "Lvg;")
    private class467 field4476;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)Lvg;", line = 4)
    public final class467 method1949(byte arg0) {
        int var2 = 18 % ((88 - arg0) / 33);
        field4473++;
        if (this.field4470 > 0 && this.field4471.field2048[this.field4470 - 1] != this.field4476) {
            class467 var3 = this.field4476;
            this.field4476 = var3.field6797;
            return var3;
        }
        while (this.field4470 < this.field4471.field2050) {
            class467 var4 = this.field4471.field2048[this.field4470++].field6797;
            if (this.field4471.field2048[this.field4470 - 1] != var4) {
                this.field4476 = var4.field6797;
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lou;I)Z", line = 35)
    public static final boolean method1950(class196 arg0, int arg1) {
        field4472++;
        class130 var2 = class56.field755.method2031(-85, arg0.method50(25707));
        if (var2.field1838 == -1) {
            return true;
        } else {
            class498 var3 = class471.field6878.method329(var2.field1838, -23316);
            return var3.field7273 == arg1 ? true : var3.method2968(false);
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)Lvg;", line = 55)
    public final class467 method1951(int arg0) {
        if (arg0 != 140) {
            field4469 = null;
        }
        this.field4470 = 0;
        field4474++;
        return this.method1949((byte) -124);
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lqo;)V", line = 92)
    public class304(class141 arg0) {
        this.field4471 = arg0;
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)V", line = 82)
    public static void method1952(int arg0) {
        int var1 = 18 % ((arg0 - 28) / 38);
        field4469 = null;
    }
}

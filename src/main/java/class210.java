import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class210 {

    @OriginalMember(owner = "client!db", name = "a", descriptor = "Lnh;")
    public class525 field3052 = new class525();

    @OriginalMember(owner = "client!db", name = "e", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3056 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!db", name = "i", descriptor = "Z")
    public static boolean field3060 = false;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "Lnh;")
    private class525 field3058;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "[Llj;")
    public static class430[] field3063;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "[S")
    public static short[] field3061;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)I", line = 4)
    public final int method1471(int arg0) {
        field3055++;
        if (arg0 != -30828) {
            return -29;
        }
        int var2 = 0;
        for (class525 var3 = this.field3052.field7768; var3 != this.field3052; var3 = var3.field7768) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)Lnh;", line = 27)
    public final class525 method1472(int arg0) {
        if (arg0 != 27554) {
            field3063 = null;
        }
        field3054++;
        class525 var2 = this.field3058;
        if (this.field3052 == var2) {
            this.field3058 = null;
            return null;
        } else {
            this.field3058 = var2.field7768;
            return var2;
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)Lnh;", line = 51)
    public final class525 method1473(int arg0) {
        field3057++;
        class525 var2 = this.field3052.field7768;
        if (this.field3052 == var2) {
            this.field3058 = null;
            return null;
        } else {
            this.field3058 = var2.field7768;
            return arg0 == 16777215 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V", line = 73)
    public final void method1474(int arg0) {
        field3053++;
        if (arg0 != 26159) {
            return;
        }
        while (true) {
            class525 var2 = this.field3052.field7768;
            if (this.field3052 == var2) {
                this.field3058 = null;
                return;
            }
            var2.method3101(arg0 - 26159);
        }
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(I)V", line = 97)
    public static void method1475(int arg0) {
        field3063 = null;
        if (arg0 > 39) {
            field3056 = null;
            field3061 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V", line = 134)
    public class210() {
        this.field3052.field7772 = this.field3052;
        this.field3052.field7768 = this.field3052;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lnh;Z)V", line = 114)
    public final void method1476(class525 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field3059++;
        if (arg0.field7772 != null) {
            arg0.method3101(0);
        }
        arg0.field7768 = this.field3052;
        arg0.field7772 = this.field3052.field7772;
        arg0.field7772.field7768 = arg0;
        arg0.field7768.field7772 = arg0;
    }
}

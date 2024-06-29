import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class443 extends class418 {

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "[I")
    public static int[] field6398 = new int[1000];

    @OriginalMember(owner = "client!lo", name = "n", descriptor = "[Ljava/awt/Color;")
    public static Color[] field6401 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!lo", name = "m", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!lo", name = "p", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!lo", name = "r", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!lo", name = "t", descriptor = "I")
    public static int field6407;

    @OriginalMember(owner = "client!lo", name = "q", descriptor = "J")
    public long field6404;

    @OriginalMember(owner = "client!lo", name = "o", descriptor = "Llo;")
    public class443 field6402;

    @OriginalMember(owner = "client!lo", name = "s", descriptor = "Llo;")
    public class443 field6406;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)V")
    public static final void method2762(int arg0) {
        field6400++;
        if (class72.field1026 != arg0) {
            try {
                class177.method1170(88, "tbrefresh", class195.field2701);
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Ltj;I)V")
    public static final void method2763(class298 arg0, int arg1) {
        field6407++;
        if (arg1 == 16777215 && class94.field1279 != class268.field3973 && class106.field1405 != null && class299.method2026((byte) 114, arg0, class268.field3973)) {
            class94.field1279 = class268.field3973;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V")
    public final void method2764(byte arg0) {
        if (arg0 != 119) {
            this.field6406 = null;
        }
        field6405++;
        if (this.field6402 != null) {
            this.field6402.field6406 = this.field6406;
            this.field6406.field6402 = this.field6402;
            this.field6406 = null;
            this.field6402 = null;
        }
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(B)V")
    public static void method2765(byte arg0) {
        if (arg0 != 18) {
            field6401 = null;
        }
        field6401 = null;
        field6398 = null;
    }

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "(I)V")
    public static final void method2766(int arg0) {
        field6399++;
        class31.field507.method2825(67);
        class122.field1581.method1156(-7585);
        class203.field2801.method1156(-7585);
        if (arg0 != 2) {
            method2762(-105);
        }
    }

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "(B)Z")
    public final boolean method2767(byte arg0) {
        if (arg0 == -128) {
            field6403++;
            return this.field6402 != null;
        } else {
            return false;
        }
    }
}

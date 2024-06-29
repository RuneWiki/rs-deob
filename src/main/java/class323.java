import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class323 extends class439 {

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    public volatile int field4956 = -1;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "Ljava/lang/String;")
    public volatile String field4958;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "Lsv;")
    public static class467 field4953 = new class467(1, 2, 2, 0);

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "Lgf;")
    public static class180 field4959 = new class180("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "[I")
    public static int[] field4960 = new int[6];

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "[I")
    public static int[] field4961;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
    public static final void method2095(boolean arg0) {
        field4955++;
        if (!arg0) {
            field4960 = null;
        }
        if (class320.field4577 != null) {
            return;
        }
        Container var1;
        if (class409.field6029 == null) {
            var1 = class112.field1785.field4458;
        } else {
            var1 = class409.field6029;
        }
        class382.field5683 = var1.getSize().width;
        class183.field2752 = var1.getSize().height;
        if (class409.field6029 == var1) {
            Insets var2 = class409.field6029.getInsets();
            class382.field5683 -= var2.right + var2.left;
            class183.field2752 -= var2.top + var2.bottom;
        }
        if (class428.method2611(1) == 1) {
            class79.field1315 = (class382.field5683 - class7.field107) / 2;
            class112.field1780 = class7.field107;
            class381.field5677 = 0;
            class477.field7003 = class353.field5345;
        } else if (class445.field6538 < 96 && class399.field5865 == 0) {
            int var3 = class382.field5683 > 1024 ? 1024 : class382.field5683;
            class112.field1780 = var3;
            int var4 = class183.field2752 <= 768 ? class183.field2752 : 768;
            class79.field1315 = (class382.field5683 - var3) / 2;
            class381.field5677 = 0;
            class477.field7003 = var4;
        } else {
            class79.field1315 = 0;
            class477.field7003 = class183.field2752;
            class381.field5677 = 0;
            class112.field1780 = class382.field5683;
        }
        if (class502.field7371 != class108.field1683) {
            boolean var10000;
            if (class112.field1780 < 1024 && class477.field7003 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class31.field503.setSize(class112.field1780, class477.field7003);
        if (class394.field5821 != null) {
            class394.field5821.method533(class31.field503);
        }
        if (class409.field6029 == var1) {
            Insets var5 = class409.field6029.getInsets();
            class31.field503.setLocation(var5.left + class79.field1315, class381.field5677 + var5.top);
        } else {
            class31.field503.setLocation(class79.field1315, class381.field5677);
        }
        if (class341.field5207 != -1) {
            class31.method256(44, true);
        }
        class248.method1582((byte) -23);
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
    public static void method2096(int arg0) {
        field4961 = null;
        field4960 = null;
        if (arg0 < 13) {
            method2096(122);
        }
        field4953 = null;
        field4959 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)Z")
    public static final boolean method2097(int arg0, int arg1, int arg2) {
        field4954++;
        if (arg2 != 28927) {
            method2095(false);
        }
        return class91.method742((byte) -127, arg0, arg1) || class108.method805(arg0, -108, arg1);
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class323(String arg0) {
        this.field4958 = arg0;
    }

    static {
        new class180("Ok", "Okay", "OK", "Ok");
    }
}

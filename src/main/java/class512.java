import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class class512 {

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public int field7550;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public int field7552;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public int field7554;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "Lho;")
    public static class102 field7553 = new class102(6, 0, 4, 2);

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field7551;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field7555;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "Lfs;")
    public static class387 field7556;

    static {
        new class331("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V", line = 10)
    public static void method3047(byte arg0) {
        if (arg0 >= -70) {
            field7556 = null;
        }
        field7553 = null;
        field7556 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V", line = 22)
    public static final void method3048(boolean arg0) {
        field7551++;
        if (class149.field2112 != null) {
            return;
        }
        Container var1;
        if (class245.field3611 == null) {
            var1 = class498.field7404.field6180;
        } else {
            var1 = class245.field3611;
        }
        class248.field3674 = var1.getSize().width;
        class333.field4630 = var1.getSize().height;
        if (class245.field3611 == var1) {
            Insets var2 = class245.field3611.getInsets();
            class248.field3674 -= var2.right + var2.left;
            class333.field4630 -= var2.top + var2.bottom;
        }
        if (arg0) {
            method3048(false);
        }
        if (class114.method920((byte) -123) == 1) {
            class410.field6100 = class86.field1178;
            class94.field1278 = class128.field1862;
            class385.field5663 = (class248.field3674 - class128.field1862) / 2;
            class513.field7566 = 0;
        } else if (class352.field4882 < 96 && class65.field802 == 0) {
            int var3 = class248.field3674 > 1024 ? 1024 : class248.field3674;
            class94.field1278 = var3;
            int var4 = class333.field4630 <= 768 ? class333.field4630 : 768;
            class385.field5663 = (class248.field3674 - var3) / 2;
            class410.field6100 = var4;
            class513.field7566 = 0;
        } else {
            class410.field6100 = class333.field4630;
            class94.field1278 = class248.field3674;
            class513.field7566 = 0;
            class385.field5663 = 0;
        }
        if (class365.field5281 != class297.field4260) {
            boolean var10000;
            if (class94.field1278 < 1024 && class410.field6100 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class148.field2081.setSize(class94.field1278, class410.field6100);
        if (class225.field3300 != null) {
            class225.field3300.method338(class148.field2081);
        }
        if (class245.field3611 == var1) {
            Insets var5 = class245.field3611.getInsets();
            class148.field2081.setLocation(class385.field5663 + var5.left, var5.top - -class513.field7566);
        } else {
            class148.field2081.setLocation(class385.field5663, class513.field7566);
        }
        if (class64.field761 != -1) {
            class351.method2116((byte) -34, true);
        }
        class175.method1228((byte) 0);
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(III)V", line = 123)
    public class512(int arg0, int arg1, int arg2) {
        this.field7550 = arg1;
        this.field7552 = arg2;
        this.field7554 = arg0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)V")
    public abstract void method1249(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(III)V")
    public abstract void method1252(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(III)V")
    public abstract void method1251(int arg0, int arg1, int arg2);
}

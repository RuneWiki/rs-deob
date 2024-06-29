import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public abstract class class85 {

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "Lbf;")
    public static class372 field1157 = new class372(12, 4);

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "Lgk;")
    public static class331 field1160 = new class331(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "Lbg;")
    public static class324 field1162 = new class324(47, 20);

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "Lcw;")
    public static class120 field1163 = new class120(5000);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "Lfs;")
    public static class387 field1164;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BI)V")
    public static final void method755(byte arg0, int arg1) {
        if (arg0 > -9) {
            method761(null, null, false);
        }
        field1156++;
        if (class518.method3081(-98, arg1)) {
            class225.method1531(false, -1, class123.field1803[arg1]);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method756(byte arg0, Component arg1);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static final void method757(int arg0) {
        int var1 = -4 % ((44 - arg0) / 53);
        class402.field5970.method1105(false);
        field1159++;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public static void method758(byte arg0) {
        field1162 = null;
        field1157 = null;
        field1160 = null;
        field1164 = null;
        field1163 = null;
        if (arg0 != 51) {
            method761(null, null, true);
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)I")
    public abstract int method759(byte arg0);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method760(Component arg0, int arg1);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([Ljava/lang/Object;[IZ)V")
    public static final void method761(Object[] arg0, int[] arg1, boolean arg2) {
        if (!arg2) {
            field1161++;
            class360.method2162(arg1, arg1.length - 1, 0, arg0, -57);
        }
    }
}

import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public abstract class class68 {

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field949 = 0;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "[Lmb;")
    public static class160[] field954 = new class160[4];

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field957 = 0;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "Z")
    public static boolean field951 = false;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field956 = -1;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "[I")
    public static int[] field961 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Lvj;")
    public static class115 field953 = new class115(128);

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "Lrg;")
    public static class227 field958;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "Lhc;")
    public static class229 field959;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "[Lkj;")
    public static class145[] field952;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BLdl;Ldl;)V")
    public static final void method462(byte arg0, class123 arg1, class123 arg2) {
        class82.field1277 = arg2;
        class152.field2262 = arg1;
        if (arg0 <= 28) {
            method462((byte) 87, (class123) null, (class123) null);
        }
        field950++;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)I")
    public abstract int method463(int arg0);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
    public static void method464(byte arg0) {
        if (arg0 != -63) {
            method464((byte) 19);
        }
        field961 = null;
        field959 = null;
        field958 = null;
        field953 = null;
        field954 = null;
        field952 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method465(int arg0, Component arg1);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)V")
    public static final void method466(boolean arg0) {
        class227.field3674 = null;
        class287.field4551 = null;
        if (arg0) {
            method464((byte) 63);
        }
        class142.field2089 = null;
        field955++;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method467(Component arg0, byte arg1);
}

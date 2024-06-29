import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class63 extends class260 {

    @OriginalMember(owner = "client!ps", name = "k", descriptor = "I")
    public int field778;

    @OriginalMember(owner = "client!ps", name = "l", descriptor = "I")
    public int field779;

    @OriginalMember(owner = "client!ps", name = "m", descriptor = "I")
    public int field780;

    @OriginalMember(owner = "client!ps", name = "n", descriptor = "I")
    public int field781;

    @OriginalMember(owner = "client!ps", name = "o", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!ps", name = "p", descriptor = "I")
    public int field783;

    @OriginalMember(owner = "client!ps", name = "q", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!ps", name = "r", descriptor = "I")
    public int field785;

    @OriginalMember(owner = "client!ps", name = "t", descriptor = "I")
    public int field787;

    @OriginalMember(owner = "client!ps", name = "u", descriptor = "I")
    public int field788;

    @OriginalMember(owner = "client!ps", name = "v", descriptor = "I")
    public int field789;

    @OriginalMember(owner = "client!ps", name = "x", descriptor = "I")
    public int field791;

    @OriginalMember(owner = "client!ps", name = "y", descriptor = "I")
    public int field792;

    @OriginalMember(owner = "client!ps", name = "A", descriptor = "I")
    public int field794;

    @OriginalMember(owner = "client!ps", name = "B", descriptor = "I")
    public int field795;

    @OriginalMember(owner = "client!ps", name = "C", descriptor = "I")
    public int field796;

    @OriginalMember(owner = "client!ps", name = "E", descriptor = "I")
    public int field798;

    @OriginalMember(owner = "client!ps", name = "F", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!ps", name = "H", descriptor = "I")
    public int field801;

    @OriginalMember(owner = "client!ps", name = "I", descriptor = "I")
    public int field802;

    @OriginalMember(owner = "client!ps", name = "G", descriptor = "Lea;")
    public class382 field800;

    @OriginalMember(owner = "client!ps", name = "z", descriptor = "Lke;")
    public class423 field793;

    @OriginalMember(owner = "client!ps", name = "s", descriptor = "Lck;")
    public class452 field786;

    @OriginalMember(owner = "client!ps", name = "D", descriptor = "Lhn;")
    public class505 field797;

    @OriginalMember(owner = "client!ps", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field790;

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(I)V")
    public final void method512(int arg0) {
        if (arg0 != -5900) {
            this.field787 = 54;
        }
        this.field793 = null;
        this.field797 = null;
        field784++;
        this.field786 = null;
        this.field800 = null;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(BIIIIII)V")
    public static final void method513(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 > -98) {
            return;
        }
        class125.field1874 = arg6;
        class210.field2931 = arg1;
        class26.field347 = arg2;
        field782++;
        class451.field6651 = arg3;
        class309.field4199 = arg5;
        class274.field3762 = arg4;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)V")
    public static void method514(byte arg0) {
        field790 = null;
        int var1 = -128 / ((arg0 + 50) / 50);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Ljava/awt/Component;I)Ltj;")
    public static final class132 method515(Component arg0, int arg1) {
        field799++;
        if (arg1 != 26564) {
            field790 = null;
        }
        return new class448(arg0);
    }
}

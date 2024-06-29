import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public abstract class class48 {

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "Lec;")
    public static class32 field1130 = class73.method594("Zu viele Anmelde)2Versuche von Ihrer Adresse", true);

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "Lja;")
    public static class63 field1126 = new class63(50);

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "Lec;")
    public static class32 field1135 = class73.method594("Bitte geben Sie Ihren Benutzenamen ein)3", true);

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "Lec;")
    public static class32 field1133 = class73.method594(" )2> <col=ff9040>", true);

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public static int field1132 = 0;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "Lec;")
    private static class32 field1137 = class73.method594("Loading )2 please wait)3", true);

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "Lec;")
    public static class32 field1136 = field1137;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public int field1121;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public int field1123;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "Lea;")
    public static class30 field1134;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "Lf;")
    public static class36 field1124;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "Lh;")
    public static class49 field1138;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "Ljava/awt/Image;")
    public Image field1122;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "[I")
    public int[] field1125;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
    public final void method362(byte arg0) {
        if (arg0 < 45) {
            method363(-48);
        }
        field1129++;
        class141.method1054(this.field1125, this.field1121, this.field1123);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public abstract void method122(Graphics arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static void method363(int arg0) {
        field1130 = null;
        if (arg0 != -13532) {
            method363(91);
        }
        field1133 = null;
        field1136 = null;
        field1135 = null;
        field1124 = null;
        field1126 = null;
        field1137 = null;
        field1134 = null;
        field1138 = null;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
    protected class48() {
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method123(int arg0, int arg1, int arg2, Component arg3);

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)V")
    public static final void method364(boolean arg0) {
        field1128++;
        class37.field887.method491(38);
        if (arg0) {
            field1135 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public abstract void method124(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5);
}

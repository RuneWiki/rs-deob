import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public abstract class class87 {

    @OriginalMember(owner = "client!md", name = "i", descriptor = "Loa;")
    public static class98 field1992 = class38.method349(255, "VOLL");

    @OriginalMember(owner = "client!md", name = "b", descriptor = "Loa;")
    public static class98 field1985 = class38.method349(255, ")4lang)4de");

    @OriginalMember(owner = "client!md", name = "m", descriptor = "Loa;")
    public static class98 field1996 = class38.method349(255, "nicht hergestellt werden)3");

    @OriginalMember(owner = "client!md", name = "j", descriptor = "Loa;")
    public static class98 field1993 = class38.method349(255, "Zu viele Verbindungen von Ihrer Adresse)3");

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public static int field1999 = 5063219;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "Loa;")
    public static class98 field2000 = class38.method349(255, "::clientdrop");

    @OriginalMember(owner = "client!md", name = "f", descriptor = "Loa;")
    private static class98 field1989 = class38.method349(255, "Loading textures )2 ");

    @OriginalMember(owner = "client!md", name = "l", descriptor = "Loa;")
    public static class98 field1995 = field1989;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "Loa;")
    public static class98 field1987 = class38.method349(255, "");

    @OriginalMember(owner = "client!md", name = "t", descriptor = "Loa;")
    private static class98 field2003 = class38.method349(255, " from your friend list first");

    @OriginalMember(owner = "client!md", name = "c", descriptor = "Loa;")
    public static class98 field1986 = field2003;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "Loa;")
    private static class98 field2005 = class38.method349(255, "Your ignore list is full)3 Max of 100 hit");

    @OriginalMember(owner = "client!md", name = "h", descriptor = "Loa;")
    public static class98 field1991 = field2005;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "[I")
    public static int[] field2006 = new int[5];

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public int field1988;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    public int field2001;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "Ljava/awt/Image;")
    public Image field1998;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "[I")
    public int[] field1994;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "[Loc;")
    public static class100[] field1984;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public static void method711(byte arg0) {
        field1991 = null;
        field1987 = null;
        field1996 = null;
        field1992 = null;
        field2000 = null;
        field2005 = null;
        if (arg0 != 46) {
            method713(66, 124, 46, -84);
        }
        field1986 = null;
        field1993 = null;
        field1995 = null;
        field2006 = null;
        field1989 = null;
        field1984 = null;
        field2003 = null;
        field1985 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)Lib;")
    public static final class58 method712(int arg0, int arg1) {
        field2002++;
        class58 var2 = (class58) class4.field55.method730((byte) 35, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class135.field3304.method1058(arg0, arg0 + 6, arg1);
        class58 var4 = new class58();
        if (var3 != null) {
            var4.method469((byte) 112, arg1, new class8(var3));
        }
        var4.method466((byte) -117);
        class4.field55.method732(-1, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method406(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
    protected class87() {
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIII)I")
    public static final int method713(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > 179) {
            arg3 /= 2;
        }
        field1997++;
        if (arg1 > ~arg2) {
            arg3 /= 2;
        }
        if (arg2 > 217) {
            arg3 /= 2;
        }
        if (arg2 > 243) {
            arg3 /= 2;
        }
        return (arg3 / 32 << 7) + (arg0 / 4 << 10) + arg2 / 2;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public final void method714(int arg0) {
        int var2 = 15 / ((arg0 - 75) / 40);
        class7.method53(this.field1994, this.field2001, this.field1988);
        field2004++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public abstract void method407(Component arg0, int arg1, int arg2, int arg3);
}

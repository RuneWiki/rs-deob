import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class80 extends Canvas {

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "Ljava/awt/Component;")
    private Component field2003;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "Lic;")
    private static class59 field1980 = class59.method433(0, "Error loading your profile)3");

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "Lic;")
    public static class59 field1987 = field1980;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public static int field1995 = 0;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "Lic;")
    public static class59 field1988 = class59.method433(0, "Bitte geben Sie Ihren Benutzenamen ein)3");

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "Lic;")
    private static class59 field1983 = class59.method433(0, "To play on this world move to a free area first)3");

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "Lic;")
    public static class59 field1992 = class59.method433(0, "und die Schaltfl-=che (WSpielkonto erstellen(W am");

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "Lic;")
    public static class59 field1999 = class59.method433(0, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "Lic;")
    public static class59 field1996 = class59.method433(0, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "Lic;")
    private static class59 field1994 = class59.method433(0, "Unexpected loginserver response)3");

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "Lic;")
    public static class59 field2001 = field1994;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    public static int field1998 = 0;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "Lic;")
    private static class59 field1997 = class59.method433(0, "Try again in 60 secs)3)3)3");

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "Lic;")
    public static class59 field2002 = class59.method433(0, "auf der Hautpseite)3");

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "Lic;")
    public static class59 field1985 = field1997;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Lic;")
    public static class59 field1981 = field1983;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "Lwd;")
    public static class157 field2000;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "Ldd;")
    public static class26 field1990;

    @OriginalMember(owner = "client!ld", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field1991++;
        this.field2003.paint(arg0);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lmd;ZLpd;I)V")
    public static final void method658(class87 arg0, boolean arg1, class108 arg2, int arg3) {
        byte[] var4 = null;
        field1993++;
        class83 var5 = class152.field3301;
        synchronized (class152.field3301) {
            class52 var6 = (class52) class152.field3301.method682(0);
            if (arg1) {
                field1992 = null;
            }
            while (var6 != null) {
                if ((long) arg3 == var6.field2736 && var6.field1295 == arg2 && var6.field1290 == 0) {
                    var4 = var6.field1293;
                    break;
                }
                var6 = (class52) class152.field3301.method684((byte) -65);
            }
        }
        if (var4 == null) {
            byte[] var7 = arg2.method849(arg3, 127);
            arg0.method724(var7, true, (byte) -11, arg2, arg3);
        } else {
            arg0.method724(var4, true, (byte) -11, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!ld", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field2003.update(arg0);
        field1986++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static void method659(int arg0) {
        field2002 = null;
        field1983 = null;
        field1987 = null;
        field2000 = null;
        field1981 = null;
        field1990 = null;
        field1999 = null;
        field1992 = null;
        field1980 = null;
        if (arg0 < 19) {
            method659(33);
        }
        field1994 = null;
        field1988 = null;
        field1996 = null;
        field2001 = null;
        field1997 = null;
        field1985 = null;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class80(Component arg0) {
        this.field2003 = arg0;
    }
}

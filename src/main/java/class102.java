import java.awt.Component;
import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class102 extends class80 {

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "S")
    public static short field1985 = 1;

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "Lr;")
    public static class66 field1993 = class93.method641(43, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
    public static int field1991 = 0;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "[Lsg;")
    public static class247[] field1986 = new class247[256];

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "Z")
    public static boolean field1999 = false;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "Lr;")
    public static class66 field1996 = class93.method641(43, "(R");

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!pe", name = "H", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "J")
    public long field1990;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "Lpe;")
    public class102 field1992;

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "Lpe;")
    public class102 field1997;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "Lph;")
    public static class32 field1984;

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "[I")
    public static int[] field1995;

    @OriginalMember(owner = "client!pe", name = "D", descriptor = "[Lr;")
    public static class66[] field1998;

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "[[[B")
    public static byte[][][] field2000;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
    public static void method702(byte arg0) {
        field1984 = null;
        field1996 = null;
        field1986 = null;
        field1998 = null;
        if (arg0 > -13) {
            field1994 = 57;
        }
        field2000 = null;
        field1993 = null;
        field1995 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIIIIB)V")
    public static final void method703(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        field2002++;
        if (class164.method1107(arg4, (byte) -2)) {
            class89.field1722 = null;
            if (arg8 != -112) {
                field1995 = null;
            }
            class56.method372(arg2, -21644, arg1, class31.field466[arg4], arg7, arg5, arg0, arg3, -1, arg6);
            if (class89.field1722 != null) {
                class56.method372(arg2, -21644, arg1, class89.field1722, arg7, arg5, arg0, class255.field4483, -1412584499, class17.field234);
                class89.field1722 = null;
            }
        } else if (arg5 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class255.field4485[var9] = true;
            }
        } else {
            class255.field4485[arg5] = true;
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V")
    public final void method704(byte arg0) {
        field1988++;
        if (arg0 != 73) {
            method706((Component) null, true);
        }
        if (this.field1992 != null) {
            this.field1992.field1997 = this.field1997;
            this.field1997.field1992 = this.field1992;
            this.field1997 = null;
            this.field1992 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZLjava/awt/event/KeyEvent;)I")
    public static final int method705(boolean arg0, KeyEvent arg1) {
        if (!arg0) {
            return -15;
        }
        field1987++;
        int var2 = arg1.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public static final void method706(Component arg0, boolean arg1) {
        if (!arg1) {
            field1994 = -124;
        }
        field1989++;
        arg0.removeMouseListener(class9.field95);
        arg0.removeMouseMotionListener(class9.field95);
        arg0.removeFocusListener(class9.field95);
        client.field1640 = 0;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)Lcd;")
    public static final class153 method707(int arg0, int arg1) {
        field2001++;
        class153 var2 = (class153) class103.field2016.method1505((long) arg1, (byte) -76);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 21) {
            method705(true, (KeyEvent) null);
        }
        byte[] var3 = class95.field1832.method135(class76.method540(arg1, false), 0, class130.method906(arg1, 111));
        class153 var4 = new class153();
        if (var3 != null) {
            var4.method1038(0, new class249(var3));
        }
        class103.field2016.method1497((long) arg1, (byte) -116, var4);
        return var4;
    }
}

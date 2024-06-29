import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class111 {

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field1999 = -1;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "[I")
    public static int[] field2005 = new int[100];

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public int field1993;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public int field1994;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public int field1998;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public int field2001;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public int field2004;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public int field2006;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public int field2008;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "Lvh;")
    public static class108 field2003;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "[B")
    public byte[] field1995;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "[B")
    public byte[] field2002;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IBI)V")
    public static final void method769(int arg0, byte arg1, int arg2) {
        if (arg1 != 1) {
            field1999 = 4;
        }
        field2007++;
        int var3 = class50.field872 * arg0 >> 8;
        if (arg2 == -1 && !class175.field2874) {
            class17.method95(false);
        } else if (arg2 != -1 && (class155.field2590 != arg2 || !class206.method1376((byte) 38)) && var3 != 0 && !class175.field2874) {
            class52.method327(var3, (byte) -123, 2, 0, false, arg2, class56.field972);
        }
        class155.field2590 = arg2;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIZ)V")
    public static final void method770(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class191.field3084 = arg1;
        class277.field4439 = arg2;
        class151.field2536 = arg3;
        class4.field56 = new class109[arg0][class191.field3084][class277.field4439];
        class78.field1342 = new int[arg0][class191.field3084 + 1][class277.field4439 + 1];
        if (arg4) {
            class72.field1185 = new class109[1][class191.field3084][class277.field4439];
            class171.field2818 = new int[class191.field3084][class277.field4439];
            class31.field464 = new int[1][class191.field3084 + 1][class277.field4439 + 1];
        } else {
            class72.field1185 = null;
            class171.field2818 = null;
            class31.field464 = null;
        }
        class240.method1584(false);
        class291.field4648 = new class158[500];
        class165.field2701 = 0;
        class140.field2415 = new class158[500];
        class153.field2571 = 0;
        class178.field2936 = new int[arg0][class191.field3084 + 1][class277.field4439 + 1];
        class89.field1579 = new class173[5000];
        class211.field3561 = 0;
        class190.field3083 = new class173[100];
        class176.field2892 = new boolean[class151.field2536 + class151.field2536 + 1][class151.field2536 + class151.field2536 + 1];
        class75.field1235 = new boolean[class151.field2536 + class151.field2536 + 2][class151.field2536 + class151.field2536 + 2];
        class99.field1700 = new byte[arg0][class191.field3084][class277.field4439];
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method771(String arg0, int arg1) throws ClassNotFoundException {
        if (arg1 != 21674) {
            return null;
        }
        field2000++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method772(byte arg0, Component arg1) {
        int var2 = 37 / ((31 - arg0) / 60);
        arg1.removeKeyListener(class63.field1096);
        arg1.removeFocusListener(class63.field1096);
        class239.field3934 = -1;
        field1997++;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)V")
    public static final void method773(int arg0, int arg1) {
        class294.field4681 = arg1;
        field1996++;
        class248.field4084 = -1;
        class167.field2728 = -1;
        class27.method180((byte) -112);
        if (arg0 >= -50) {
            method773(-34, 122);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
    public static void method774(byte arg0) {
        if (arg0 == -82) {
            field2003 = null;
            field2005 = null;
        }
    }
}

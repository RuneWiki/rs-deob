import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class120 extends class92 {

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "Lve;")
    public static class255 field2001 = class87.method607(95, ")4p=");

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "Z")
    public static boolean field2009 = true;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "Lve;")
    private static class255 field2011 = class87.method607(79, "glow1:");

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "Lve;")
    public static class255 field1999 = field2011;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "Lve;")
    public static class255 field2008 = class87.method607(76, "1");

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "Lve;")
    public static class255 field2006 = field2011;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "Lrg;")
    public static class88 field2003;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIFIIIZ)[[I", line = 7)
    public static final int[][] method889(int arg0, int arg1, int arg2, int arg3, float arg4, int arg5, int arg6, int arg7, boolean arg8) {
        field2000++;
        int[][] var9 = new int[arg7][arg0];
        class114 var10 = new class114();
        var10.field1932 = arg6;
        var10.field1931 = arg8;
        var10.field1935 = (int) (arg4 * 4096.0F);
        var10.field1939 = arg1;
        var10.field1922 = arg5;
        var10.method111((byte) -57);
        class42.method257(arg0, arg7, arg2 ^ 0xFFFFFDCC);
        if (arg2 != 582) {
            method893((byte) -124);
        }
        for (int var11 = 0; var11 < arg7; var11++) {
            var10.method865(-86, var11, var9[var11]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V", line = 39)
    public static void method890(byte arg0) {
        field2001 = null;
        if (arg0 != -118) {
            field1999 = (class255) null;
        }
        field2011 = null;
        field2008 = null;
        field1999 = null;
        field2003 = null;
        field2006 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BII)V", line = 64)
    public static final void method891(byte arg0, int arg1, int arg2) {
        field2010++;
        class53 var3 = class303.method2112(-1155040160, arg2, 12);
        var3.method325((byte) 108);
        var3.field824 = arg1;
        if (arg0 != -111) {
            field2002 = -66;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 82)
    public static final void method892(Component arg0, boolean arg1) {
        arg0.addMouseListener(class107.field1810);
        arg0.addMouseMotionListener(class107.field1810);
        arg0.addFocusListener(class107.field1810);
        field2005++;
        if (arg1) {
            method890((byte) -99);
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)Z", line = 95)
    public static final boolean method893(byte arg0) {
        field2012++;
        if (class55.field864) {
            try {
                class24.field369.method1773(class221.field3728.field626, 0);
                return true;
            } catch (Throwable var2) {
            }
        }
        if (arg0 <= 98) {
            method890((byte) 26);
        }
        return false;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IB)Z", line = 118)
    public static final boolean method894(int arg0, byte arg1) {
        int var2 = 90 % ((arg1 - 20) / 39);
        field2007++;
        return (arg0 >> 28 & 0x1) != 0;
    }
}

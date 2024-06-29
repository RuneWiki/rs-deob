import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class51 {

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "S")
    public static short field867 = 205;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "Z")
    public static boolean field864 = true;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field866 = new String[100];

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public static int field865 = 0;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "Ljava/awt/Font;")
    public static Font field861;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BLgf;Lgf;)V")
    public static final void method326(byte arg0, class155 arg1, class155 arg2) {
        if (arg2.field2568 != null) {
            arg2.method1174(arg0 ^ 0xFFFF9B46);
        }
        arg2.field2569 = arg1.field2569;
        if (arg0 != 53) {
            method330((byte) -118);
        }
        arg2.field2568 = arg1;
        field863++;
        arg2.field2568.field2569 = arg2;
        arg2.field2569.field2568 = arg2;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V")
    public static final void method327(boolean arg0) {
        if (!arg0) {
            field869++;
            class263.field4388.method97(87);
            class123.field2056.method97(78);
            class261.field4377.method97(78);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "([BB)Z")
    public static final boolean method328(byte[] arg0, byte arg1) {
        field858++;
        int var2 = 75 / ((8 - arg1) / 51);
        class249 var3 = new class249(arg0);
        int var4 = var3.method1802((byte) -104);
        if (var4 != 1) {
            return false;
        }
        boolean var5 = var3.method1802((byte) -111) == 1;
        if (var5) {
            class9.method58(var3, true);
        }
        class61.method425(var3, (byte) -80);
        return true;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)V")
    public static final void method329(byte arg0, int arg1) {
        field868++;
        if (arg0 != -37) {
            field867 = 2;
        }
        class36 var2 = class136.method1013(4, arg1, (byte) -90);
        var2.method221(1);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public static void method330(byte arg0) {
        field861 = null;
        if (arg0 != 85) {
            method332(-68, 40, -35, (byte) -23);
        }
        field866 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)I")
    public static final int method331(int arg0, int arg1) {
        if (arg0 != -460789497) {
            field866 = null;
        }
        field859++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIB)V")
    public static final void method332(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -83) {
            field865 = 118;
        }
        field860++;
        class36 var4 = class136.method1013(11, arg2, (byte) -90);
        var4.method224(false);
        var4.field560 = arg0;
        var4.field577 = arg1;
    }
}

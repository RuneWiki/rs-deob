import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class718 {

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Z")
    public static boolean field10124 = false;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "Lqp;")
    public static class715 field10130 = new class715(8);

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field10132 = -1;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "F")
    public static float field10131;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field10125;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field10126;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field10128;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field10129;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "Ljava/applet/Applet;")
    public static Applet field10127;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([II)Ljava/lang/String;")
    public static final String method4032(int[] arg0, int arg1) {
        field10125++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class595.field8455;
        for (int var4 = arg1; var4 < arg0.length; var4++) {
            class12 var5 = class451.field6457.method1714(arg1 ^ 0x23, arg0[var4]);
            if (var5.field109 != -1) {
                class515 var6 = (class515) class405.field5767.method2216(0, (long) var5.field109);
                if (var6 == null) {
                    class676 var7 = class676.method3850(class603.field8548, var5.field109, 0);
                    if (var7 != null) {
                        var6 = class211.field3164.method202(var7, true);
                        class405.field5767.method2213((byte) -16, (long) var5.field109, var6);
                    }
                }
                if (var6 != null) {
                    class637.field9005[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static final void method4033(int arg0) {
        class42.field710 = 0;
        class455.field6488 = -1;
        field10126++;
        class545.field7931 = -1;
        if (arg0 != 0) {
            method4034(-63, -90, 116);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)Z")
    public static final boolean method4034(int arg0, int arg1, int arg2) {
        field10129++;
        if (arg2 > -71) {
            field10124 = false;
        }
        return (arg0 & 0x70000) != 0 | class163.method1149(arg1, (byte) -128, arg0) || class670.method3822(-1, arg1, arg0);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
    public static void method4035(byte arg0) {
        field10127 = null;
        int var1 = -110 / ((arg0 - 9) / 37);
        field10130 = null;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(III)Z")
    public static final boolean method4036(int arg0, int arg1, int arg2) {
        field10128++;
        if (arg0 <= 106) {
            field10131 = 1.1576825F;
        }
        return (arg2 & 0x800) != 0;
    }
}

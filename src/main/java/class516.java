import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class516 extends class320 {

    @OriginalMember(owner = "client!au", name = "q", descriptor = "[B")
    public byte[] field7588;

    @OriginalMember(owner = "client!au", name = "l", descriptor = "Lop;")
    public static class124 field7583 = new class124("WTQA", 2);

    @OriginalMember(owner = "client!au", name = "s", descriptor = "Lpi;")
    public static class342 field7590 = new class342("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

    @OriginalMember(owner = "client!au", name = "m", descriptor = "I")
    public static int field7584;

    @OriginalMember(owner = "client!au", name = "n", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!au", name = "o", descriptor = "I")
    public static int field7586;

    @OriginalMember(owner = "client!au", name = "p", descriptor = "I")
    public static int field7587;

    @OriginalMember(owner = "client!au", name = "r", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!au", name = "t", descriptor = "I")
    public static int field7591;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method3076(boolean arg0) {
        class66.method555(class443.field6623.field615, (byte) -88);
        field7584++;
        int var1 = (class40.field732 >> 10) + (class200.field2931 >> 3);
        class163.field2525 = class139.field2224.field6232 = 0;
        int var2 = (class405.field6075 >> 10) + (class403.field6059 >> 3);
        class139.field2224.method1655(8, -64, 8);
        byte var3 = 18;
        class295.field4195 = new byte[var3][];
        class87.field1520 = new byte[var3][];
        class464.field6941 = new byte[var3][];
        class451.field6746 = new int[var3][4];
        class148.field2364 = new int[var3];
        class381.field5776 = new int[var3];
        class438.field6549 = new int[var3];
        class339.field5128 = new int[var3];
        class322.field4920 = new byte[var3][];
        class343.field5170 = new byte[var3][];
        class325.field4945 = new int[var3];
        class373.field5657 = new int[var3];
        int var4 = 0;
        for (int var5 = (var1 - (class33.field662 >> 4)) / 8; var5 <= ((var1 + (class33.field662 >> 4)) / 8); var5++) {
            for (int var7 = (var2 - (class121.field1966 >> 4)) / 8; var7 <= (((class121.field1966 >> 4) + var2) / 8); var7++) {
                int var8 = (var5 << 8) + var7;
                class381.field5776[var4] = var8;
                class148.field2364[var4] = class5.field122.method136("m" + var5 + "_" + var7, 99);
                class438.field6549[var4] = class5.field122.method136("l" + var5 + "_" + var7, -125);
                class325.field4945[var4] = class5.field122.method136("n" + var5 + "_" + var7, 102);
                class373.field5657[var4] = class5.field122.method136("um" + var5 + "_" + var7, -98);
                class339.field5128[var4] = class5.field122.method136("ul" + var5 + "_" + var7, -127);
                if (class325.field4945[var4] == -1) {
                    class148.field2364[var4] = -1;
                    class438.field6549[var4] = -1;
                    class373.field5657[var4] = -1;
                    class339.field5128[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class325.field4945.length; var6++) {
            class325.field4945[var6] = -1;
            class148.field2364[var6] = -1;
            class438.field6549[var6] = -1;
            class373.field5657[var6] = -1;
            class339.field5128[var6] = -1;
        }
        class364.method2282(true, var1, arg0, var2, 7170);
    }

    @OriginalMember(owner = "client!au", name = "c", descriptor = "(I)V", line = 81)
    public static void method3077(int arg0) {
        if (arg0 != -489022006) {
            field7583 = null;
        }
        field7583 = null;
        field7590 = null;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Lm;ILjava/awt/Canvas;I)Lqa;", line = 104)
    public static final class162 method3078(class126 arg0, int arg1, Canvas arg2, int arg3) {
        field7585++;
        int var4 = -125 % ((14 - arg1) / 49);
        return new class24(arg3, arg2, arg0);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(III)I", line = 114)
    public static final int method3079(int arg0, int arg1, int arg2) {
        field7591++;
        int var3 = arg1 - 1 & arg2 >> 31;
        if (arg0 != -1387029345) {
            field7587 = 104;
        }
        return ((arg2 >>> 31) + arg2) % arg1 + var3;
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "([B)V", line = 126)
    public class516(byte[] arg0) {
        this.field7588 = arg0;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(CI)Z", line = 134)
    public static final boolean method3080(char arg0, int arg1) {
        field7586++;
        if (arg1 == -1) {
            return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(B)Z", line = 145)
    public static final boolean method3081(byte arg0) {
        field7589++;
        if (arg0 != -46) {
            return true;
        }
        class208 var1 = (class208) class339.field5122.field5929.field4906;
        if (var1 == null || class339.field5122.field5929 == var1) {
            return false;
        } else {
            if (var1.field3005 >= 2000) {
                var1.field3005 -= 2000;
            }
            return var1.field3005 == 1002;
        }
    }
}

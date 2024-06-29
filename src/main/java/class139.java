import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class139 extends class168 {

    @OriginalMember(owner = "client!vr", name = "o", descriptor = "I")
    public volatile int field1987 = -1;

    @OriginalMember(owner = "client!vr", name = "q", descriptor = "Ljava/lang/String;")
    public volatile String field1989;

    @OriginalMember(owner = "client!vr", name = "n", descriptor = "Lkg;")
    public static class275 field1986 = new class275(41, -1);

    @OriginalMember(owner = "client!vr", name = "r", descriptor = "Lfia;")
    public static class577 field1990 = new class577(4, 1, 1, 1);

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!vr", name = "l", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!vr", name = "m", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!vr", name = "p", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!vr", name = "s", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILnd;)I", line = 6)
    public static final int method1015(int arg0, class547 arg1) {
        field1988++;
        int var2 = arg0;
        if (arg1.method3154(class693.field9628, (byte) 98)) {
            var2 = arg0 + 1;
        }
        if (arg1.method3154(class760.field10601, (byte) 98)) {
            var2++;
        }
        if (arg1.method3154(class556.field7742, (byte) 98)) {
            var2++;
        }
        if (arg1.method3154(class577.field8097, (byte) 98)) {
            var2++;
        }
        if (arg1.method3154(class745.field10379, (byte) 98)) {
            var2++;
        }
        if (arg1.method3154(class26.field473, (byte) 98)) {
            var2++;
        }
        if (arg1.method3154(class416.field5304, (byte) 98)) {
            var2++;
        }
        if (arg1.method3154(class74.field1054, (byte) 98)) {
            var2++;
        }
        if (arg1.method3154(class58.field797, (byte) 98)) {
            var2++;
        }
        if (arg1.method3154(class151.field2084, (byte) 98)) {
            var2++;
        }
        if (arg1.method3154(class19.field348, (byte) 98)) {
            var2++;
        }
        if (arg1.method3154(class39.field605, (byte) 98)) {
            var2++;
        }
        if (arg1.method3154(class532.field7390, (byte) 98)) {
            var2++;
        }
        if (arg1.method3154(class443.field5880, (byte) 98)) {
            var2++;
        }
        if (arg1.method3154(class172.field2378, (byte) 98)) {
            var2++;
        }
        if (arg1.method3154(class121.field1754, (byte) 98)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lria;I)V", line = 73)
    public static final void method1016(class288 arg0, int arg1) {
        field1984++;
        class288 var2 = class645.method3618(arg0, -93);
        if (arg1 != 1) {
            method1019((byte) 38);
        }
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class466.field6263;
            var4 = class356.field4586;
        } else {
            var3 = var2.field3714;
            var4 = var2.field3617;
        }
        class408.method2276(arg1 ^ 0xFFFFFFD8, arg0, var3, false, var4);
        class707.method3957(var3, arg0, 50, var4);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIII)I", line = 101)
    public static final int method1017(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1982++;
        int var5 = arg2 & 0xF;
        int var6 = var5 >= 8 ? arg1 : arg0;
        int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg0 : arg3) : arg1;
        if (arg4 != 2) {
            method1019((byte) -112);
        }
        return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IILjava/awt/Canvas;Ld;ILnd;)Lha;", line = 120)
    public static final class60 method1018(int arg0, int arg1, Canvas arg2, class153 arg3, int arg4, class547 arg5) {
        field1985++;
        int var6 = 0;
        int var7 = 0;
        if (arg2 != null) {
            Dimension var8 = arg2.getSize();
            var7 = var8.height;
            var6 = var8.width;
        }
        if (arg0 > -24) {
            field1990 = null;
        }
        return class60.method538(arg3, arg5, arg2, (byte) 113, arg4, var6, var7, arg1);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)V", line = 146)
    public static void method1019(byte arg0) {
        if (arg0 < -77) {
            field1990 = null;
            field1986 = null;
        }
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 170)
    public class139(String arg0) {
        this.field1989 = arg0;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIZIILvl;I)V", line = 160)
    public static final void method1020(int arg0, int arg1, boolean arg2, int arg3, int arg4, class13 arg5, int arg6) {
        if (arg2) {
            field1983++;
            class694.method3884(false, arg5.field5797, 0, arg4, arg0, arg6, arg5.field5801, arg5.field5796, arg1, arg3);
        }
    }
}

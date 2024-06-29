import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class1 {

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public int field6;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public int field7;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "Lti;")
    public class1 field11;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "Lug;")
    public class118 field4;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "S")
    public static short field2 = 256;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "Z")
    public static boolean field10 = true;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "[Lrr;")
    public static class184[] field15 = new class184[0];

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    public int field14;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public int field5;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public int field9;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "Lir;")
    public static class185 field12;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "Lir;")
    public static class185 field8;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ti", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field17;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ti", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field18;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ti", name = "s", descriptor = "Ljava/lang/Class;")
    public static Class field19;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "[I")
    public static int[] field1;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method5(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)Ljava/lang/String;", line = 29)
    public static final String method1(int arg0, int arg1, int arg2) {
        if (arg1 != -4725) {
            method4((byte) -89);
        }
        field16++;
        int var3 = arg2 - arg0;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V", line = 72)
    public static void method2(byte arg0) {
        field1 = null;
        if (arg0 != -29) {
            field10 = true;
        }
        field15 = null;
        field12 = null;
        field8 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lwh;IILde;ZLjava/awt/Canvas;)Ltj;", line = 88)
    public static final class298 method3(class288 arg0, int arg1, int arg2, class364 arg3, boolean arg4, Canvas arg5) {
        field13++;
        if (arg4) {
            method1(36, -12, -14);
        }
        try {
            Class var6 = Class.forName("se");
            Constructor var7 = var6.getConstructor(field17 == null ? (field17 = method5("java.awt.Canvas")) : field17, field18 == null ? (field18 = method5("wh")) : field18, Integer.TYPE, Integer.TYPE, field19 == null ? (field19 = method5("de")) : field19);
            return (class298) var7.newInstance(arg5, arg0, Integer.valueOf(arg1), new Integer(arg2), arg3);
        } catch (Exception var8) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)V", line = 113)
    public static final void method4(byte arg0) {
        if (arg0 < 74) {
            field15 = null;
        }
        field3++;
        if (class362.field5367) {
            return;
        }
        class164.field2233 = true;
        if (class331.field4880) {
            class39.field588 = (float) ((int) class39.field588 - 17 & 0xFFFFFFF0);
        } else {
            class397.field5791 += (-class397.field5791 - 12.0F) / 2.0F;
        }
        class362.field5367 = true;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(II)V", line = 142)
    public class1(int arg0, int arg1) {
        this.field6 = arg1;
        this.field7 = arg0;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lti;I)V", line = 150)
    public class1(class1 arg0, int arg1) {
        this.field11 = arg0;
        this.field7 = this.field11.field7;
        this.field4 = this.field11.field4;
        this.field6 = this.field11.field6 + arg1;
    }
}

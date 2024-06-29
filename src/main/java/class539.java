import java.awt.Canvas;
import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public abstract class class539 extends class209 {

    @OriginalMember(owner = "client!uo", name = "v", descriptor = "I")
    public int field6809;

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "I")
    public int field6793;

    @OriginalMember(owner = "client!uo", name = "m", descriptor = "I")
    public int field6800;

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "I")
    public int field6798;

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "I")
    public int field6795;

    @OriginalMember(owner = "client!uo", name = "u", descriptor = "I")
    public int field6808;

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "I")
    public int field6802;

    @OriginalMember(owner = "client!uo", name = "l", descriptor = "D")
    public static double field6799 = -1.0D;

    @OriginalMember(owner = "client!uo", name = "q", descriptor = "[I")
    public static int[] field6804 = new int[5];

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "Lws;")
    public static class333 field6796 = new class333();

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "F")
    public static float field6794;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "I")
    public static int field6797;

    @OriginalMember(owner = "client!uo", name = "n", descriptor = "I")
    public static int field6801;

    @OriginalMember(owner = "client!uo", name = "p", descriptor = "I")
    public static int field6803;

    @OriginalMember(owner = "client!uo", name = "r", descriptor = "I")
    public static int field6805;

    @OriginalMember(owner = "client!uo", name = "s", descriptor = "I")
    public static int field6806;

    @OriginalMember(owner = "client!uo", name = "t", descriptor = "I")
    public static int field6807;

    // $FF: synthetic field
    @OriginalMember(owner = "client!uo", name = "w", descriptor = "Ljava/lang/Class;")
    public static Class field6810;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(Loa;I)V")
    public static final void method2894(class650 arg0, int arg1) {
        field6792++;
        if (class146.field1744.method1912(16) == 0) {
            return;
        }
        if (~class628.field8526 == arg1) {
            for (class295 var4 = (class295) class146.field1744.method1909(true); var4 != null; var4 = (class295) class146.field1744.method1916((byte) 114)) {
                class504.field6287.method1631(false, var4.field3742, arg0, arg0, var4.field3739, class711.field9937, false, var4.field3745, -118, var4.field3740, var4.field3744, var4.field3743 ? class67.field815.field4684 : null);
                var4.method1566(-99);
            }
            class377.method2172(100);
            return;
        }
        if (class211.field2491 == null) {
            Canvas var2 = new Canvas();
            var2.setSize(36, 32);
            class211.field2491 = class650.method3629(class594.field7964, arg1 ^ 0xFFFFC887, class292.field3706, 0, var2, 0);
            class176.field2066 = class211.field2491.method414(class692.method3823(class354.field4576, -31445, 0, class329.field4095), class495.method2699(class136.field1656, class354.field4576, 0), true);
        }
        for (class295 var3 = (class295) class146.field1744.method1909(true); var3 != null; var3 = (class295) class146.field1744.method1916((byte) 94)) {
            class504.field6287.method1631(false, var3.field3742, arg0, class211.field2491, var3.field3739, class176.field2066, false, var3.field3745, -127, var3.field3740, var3.field3744, var3.field3743 ? class67.field815.field4684 : null);
            var3.method1566(arg1 ^ 0x57);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZLoa;Lnt;IIII)V")
    public final void method135(boolean arg0, class650 arg1, class209 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != 12137) {
            this.field6802 = 88;
        }
        field6801++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(B)I")
    public abstract int method1858(byte arg0);

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(B)V")
    public final void method140(byte arg0) {
        int var2 = 36 % ((arg0 + 16) / 40);
        field6805++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IZLjava/awt/Component;)Lpf;")
    public static final class545 method2895(int arg0, boolean arg1, Component arg2) {
        field6806++;
        try {
            if (arg0 == -14069) {
                Constructor var3 = Class.forName("ru").getDeclaredConstructor(field6810 == null ? (field6810 = method2898("java.awt.Component")) : field6810, Boolean.TYPE);
                return (class545) var3.newInstance(arg2, Boolean.valueOf(arg1));
            } else {
                return null;
            }
        } catch (Throwable var4) {
            return new class564(arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(I)Z")
    public final boolean method137(int arg0) {
        if (arg0 >= -30) {
            this.method140((byte) 45);
        }
        field6797++;
        return false;
    }

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "(I)V")
    public static void method2896(int arg0) {
        field6796 = null;
        if (arg0 == 0) {
            field6804 = null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IB)I")
    public static final int method2897(int arg0, byte arg1) {
        if (arg1 == -57) {
            field6807++;
            return arg0 & 0xFF;
        } else {
            return -41;
        }
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(IIIIIII)V")
    public class539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6809 = arg6;
        this.field6793 = arg0;
        this.field6800 = arg4;
        this.field6798 = arg3;
        this.field6795 = arg5;
        this.field6808 = arg2;
        this.field6802 = arg1;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2898(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}

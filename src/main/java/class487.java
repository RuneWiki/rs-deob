import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class487 {

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field6786;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field6787;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public int field6788;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    private int field6789;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field6790;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field6791;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field6793;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public int field6795;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field6797;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field6798;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "Lab;")
    public class483 field6794;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field6799;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "[Lo;")
    public static class24[] field6796;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method2806(int arg0, String arg1) {
        field6791++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg1.length();
        if (arg0 != -23881) {
            return null;
        }
        while (var3 > var2 && class144.method897((byte) 102, arg1.charAt(var2))) {
            var2++;
        }
        while (var3 > var2 && class144.method897((byte) -111, arg1.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class36.method207(var7, (byte) -100)) {
                char var8 = class325.method1961(var7, 196);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)Z")
    public static final boolean method2807(int arg0, int arg1, int arg2) {
        if (arg2 > -112) {
            method2810(null, 108);
        }
        field6797++;
        return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLwm;)V")
    public final void method2808(byte arg0, class403 arg1) {
        field6790++;
        while (true) {
            int var3 = arg1.method2357((byte) 114);
            if (var3 == 0) {
                if (arg0 == 10) {
                    return;
                } else {
                    this.field6788 = 4;
                    return;
                }
            }
            this.method2812(arg1, arg0 - 9, var3);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static void method2809(int arg0) {
        field6796 = null;
        if (arg0 <= 14) {
            field6799 = null;
        }
        field6799 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lwm;I)Lwq;")
    public static final class116 method2810(class403 arg0, int arg1) {
        if (arg1 != 1) {
            method2810(null, -71);
        }
        field6793++;
        return new class116(arg0.method2371(7162), arg0.method2371(7162), arg0.method2371(7162), arg0.method2371(7162), arg0.method2371(arg1 + 7161), arg0.method2371(7162), arg0.method2371(7162), arg0.method2371(7162), arg0.method2323((byte) 111), arg0.method2357((byte) 127));
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)Ldd;")
    public final synchronized class506 method2811(byte arg0) {
        field6787++;
        class506 var2 = (class506) this.field6794.field6736.method1088((long) this.field6789, (byte) -110);
        if (var2 != null) {
            return var2;
        }
        class506 var3 = class506.method3018(this.field6794.field6732, this.field6789, 0);
        if (var3 != null) {
            this.field6794.field6736.method1097(19627, var3, (long) this.field6789);
        }
        return arg0 == 63 ? var3 : null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lwm;II)V")
    private final void method2812(class403 arg0, int arg1, int arg2) {
        if (arg1 == arg2) {
            this.field6789 = arg0.method2338(arg1 ^ 0x1);
        } else if (arg2 == 2) {
            this.field6788 = arg0.method2357((byte) 125);
            this.field6795 = arg0.method2357((byte) 117);
        }
        field6792++;
    }
}

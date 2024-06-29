import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class696 {

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "I")
    public int field9792;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
    public static int field9789;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "I")
    public static int field9790;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "I")
    public static int field9791;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "I")
    public static int field9793;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIII)Lvi;")
    public static final class302 method3910(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 30 % ((arg3 + 16) / 38);
        field9791++;
        class302 var5 = null;
        if (arg1 == 0) {
            var5 = class582.method3419(class229.field3350, (byte) 125, class626.field8901);
            class190.field2854++;
        }
        if (arg1 == 1) {
            var5 = class582.method3419(class48.field659, (byte) 127, class626.field8901);
            class335.field4768++;
        }
        var5.field4341.method2579(false, class681.field9656.method681((byte) 101, 82) ? 1 : 0);
        var5.field4341.method2541((byte) -118, class222.field3266 + arg2);
        var5.field4341.method2572(arg0 + class697.field9798, (byte) 70);
        class104.field1516 = arg0;
        class263.field3717 = arg2;
        class687.field9717 = false;
        class91.method779((byte) -71);
        return var5;
    }

    @OriginalMember(owner = "client!uo", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9793++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IBLlea;Ljava/lang/String;)Lhu;")
    public static final class702 method3911(int arg0, byte arg1, class573 arg2, String arg3) {
        field9790++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        OpenGL.glProgramStringARB(arg0, 34933, arg3);
        OpenGL.glGetIntegerv(34379, class517.field7110, 0);
        if (arg1 < 12) {
            method3911(-21, (byte) 96, null, null);
        }
        if (class517.field7110[0] == -1) {
            OpenGL.glBindProgramARB(arg0, 0);
            return new class702(arg2, arg0, var4);
        } else {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(II)V")
    public class696(int arg0, int arg1) {
        this.field9792 = arg0;
    }
}

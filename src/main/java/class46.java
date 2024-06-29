import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class46 extends class431 {

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "Ljava/lang/String;")
    public String field593;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "[I")
    public static int[] field596 = new int[4096];

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "[I")
    public static int[] field598 = new int[200];

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    public static int field594 = 1;

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "Lob;")
    public static class521 field599 = new class521(21, 8);

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "Ll;")
    public static class16 field601;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)Ljava/lang/String;")
    public static final String method472(int arg0, int arg1, int arg2) {
        if (arg0 != 2988) {
            method474(-103);
        }
        field600++;
        int var3 = arg1 - arg2;
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

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IBLjava/lang/String;Lkd;)Lrm;")
    public static final class284 method473(int arg0, byte arg1, String arg2, class188 arg3) {
        field597++;
        if (arg1 < 1) {
            return null;
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        OpenGL.glProgramStringARB(arg0, 34933, arg2);
        OpenGL.glGetIntegerv(34379, class112.field1562, 0);
        if (class112.field1562[0] == -1) {
            OpenGL.glBindProgramARB(arg0, 0);
            return new class284(arg3, arg0, var4);
        } else {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
    public class46() {
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public static void method474(int arg0) {
        int var1 = -80 / ((arg0 - 7) / 50);
        field599 = null;
        field598 = null;
        field596 = null;
        field601 = null;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class46(String arg0) {
        this.field593 = arg0;
    }
}

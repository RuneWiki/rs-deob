import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class594 {

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
    public int field8274;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "Lkq;")
    public static class594 field8271 = new class594(1);

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "Lkq;")
    public static class594 field8275 = new class594(2);

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "Lkq;")
    public static class594 field8276 = new class594(4);

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "Lkq;")
    public static class594 field8277 = new class594(1);

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "Lkq;")
    public static class594 field8278 = new class594(2);

    @OriginalMember(owner = "client!kq", name = "j", descriptor = "Lkq;")
    public static class594 field8279 = new class594(4);

    @OriginalMember(owner = "client!kq", name = "k", descriptor = "Lkq;")
    public static class594 field8280 = new class594(2);

    @OriginalMember(owner = "client!kq", name = "l", descriptor = "Lkq;")
    public static class594 field8281 = new class594(4);

    @OriginalMember(owner = "client!kq", name = "n", descriptor = "Lsba;")
    public static class218 field8283 = null;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
    public static int field8270;

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "I")
    public static int field8272;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
    public static int field8273;

    @OriginalMember(owner = "client!kq", name = "m", descriptor = "I")
    public static int field8282;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V", line = 5)
    public static final void method3289(int arg0) {
        field8273++;
        if (arg0 >= -86) {
            method3291(-36, -66, -17, -34);
        }
        class449.field6276 = new class227(class755.field10484.method4201(class723.field10095, (byte) 25), "", class553.field7817, 1012, -1, 0L, 0, 0, true, false, 0L, true);
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)V", line = 18)
    public static void method3290(int arg0) {
        field8276 = null;
        field8275 = null;
        field8277 = null;
        field8280 = null;
        field8279 = null;
        field8278 = null;
        field8283 = null;
        field8271 = null;
        int var1 = 62 / ((34 - arg0) / 51);
        field8281 = null;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIII)V", line = 35)
    public static final void method3291(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 1011) {
            class498.method2783(class358.field4753, arg3, arg2);
        } else if (arg1 == 1003) {
            class498.method2783(class387.field5468, arg3, arg2);
        } else if (arg1 == 1001) {
            class498.method2783(class506.field6858, arg3, arg2);
        } else if (arg1 == 1010) {
            class498.method2783(class589.field8230, arg3, arg2);
        } else if (arg1 == 1004) {
            class498.method2783(class659.field9185, arg3, arg2);
        }
        field8270++;
        if (arg0 != -1004) {
            field8281 = null;
        }
    }

    @OriginalMember(owner = "client!kq", name = "toString", descriptor = "()Ljava/lang/String;", line = 68)
    public final String toString() {
        field8272++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(I)V", line = 87)
    private class594(int arg0) {
        this.field8274 = arg0;
    }
}

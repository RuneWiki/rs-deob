import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public abstract class class194 {

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field3316 = 0;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field3313 = 0;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "Lbe;")
    public static class283 field3315 = class153.method941(127, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "[I")
    public static int[] field3317 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "Lbe;")
    public static class283 field3311 = class153.method941(-123, " loggt sich aus)3");

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "[I")
    public static int[] field3321 = new int[200];

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "J")
    public static volatile long field3322 = 0L;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field3319 = 1;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Lbe;")
    private static class283 field3318 = class153.method941(127, "Unable to find ");

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "Lbe;")
    public static class283 field3310 = field3318;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "Lbe;")
    public static class283 field3323 = class153.method941(-93, "www");

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V", line = 15)
    public static void method1249(byte arg0) {
        field3323 = null;
        field3315 = null;
        field3311 = null;
        field3318 = null;
        field3317 = null;
        if (arg0 != -49) {
            field3315 = (class283) null;
        }
        field3321 = null;
        field3310 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIZI)V", line = 32)
    public static final void method1250(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field3314++;
        if (class92.method588(arg0, -89) && arg1 == 1) {
            class13.method71(arg4, arg2, class122.field2036[arg0], arg3, -1, 46);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lle;I)V", line = 75)
    public static final void method1253(class231 arg0, int arg1) {
        if (arg1 == 21258) {
            class231.method1561(arg1 - 21231, arg0, 200000);
            field3312++;
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V", line = 108)
    protected class194() {
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIBLjava/awt/Graphics;I)V")
    public abstract void method1251(int arg0, int arg1, int arg2, byte arg3, Graphics arg4, int arg5);

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method1252(int arg0, int arg1, Graphics arg2, int arg3);
}

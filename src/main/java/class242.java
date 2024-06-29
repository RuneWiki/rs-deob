import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class242 extends class496 {

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "J")
    public long field3549;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Z")
    public static boolean field3546;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field3547;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V")
    public static final void method1561(String arg0, String arg1, byte arg2) {
        class621.field9066 = -1;
        if (arg2 != -12) {
            field3547 = null;
        }
        class322.field4782 = 1;
        field3550++;
        class18.method87(30245, false, arg0, arg1);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public static void method1562(int arg0) {
        if (arg0 != 1) {
            method1562(-46);
        }
        field3547 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI)Z")
    public static final boolean method1563(byte arg0, int arg1) {
        if (arg0 < 115) {
            method1563((byte) -14, -20);
        }
        field3548++;
        return arg1 == 6 || arg1 == 7 || arg1 == 8;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
    public class242() {
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(J)V")
    public class242(long arg0) {
        this.field3549 = arg0;
    }
}

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public abstract class class233 {

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field3498 = 0;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field3502 = 1;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "Ltd;")
    public static class192 field3497 = new class192(512);

    @OriginalMember(owner = "client!md", name = "j", descriptor = "Z")
    public static boolean field3506 = true;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V", line = 4)
    public static void method1603(byte arg0) {
        field3497 = null;
        int var1 = 115 / ((35 - arg0) / 40);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)I", line = 19)
    public static final int method1604(int arg0, int arg1) {
        field3499++;
        if (arg1 != 1) {
            method1604(-27, -39);
        }
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "()Z", line = 42)
    public boolean method564() {
        field3500++;
        return false;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(III)Lmd;", line = 51)
    public class233 method551(int arg0, int arg1, int arg2) {
        field3501++;
        return this;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lmd;IIIZ)V", line = 61)
    public void method558(class233 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3503++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "()I")
    public abstract int method115();

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIIIIJILbh;)V")
    public abstract void method111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class18 arg10);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIII)V")
    public abstract void method108(int arg0, int arg1, int arg2, int arg3, int arg4);
}

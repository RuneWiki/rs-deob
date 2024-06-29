import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class634 extends class421 implements class159 {

    @OriginalMember(owner = "client!fv", name = "l", descriptor = "I")
    private int field9229;

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "I")
    public static int field9222 = 0;

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "Luv;")
    public static class3 field9220 = new class3(52, 3);

    @OriginalMember(owner = "client!fv", name = "n", descriptor = "Lim;")
    public static class353 field9231 = new class353(39, 8);

    @OriginalMember(owner = "client!fv", name = "o", descriptor = "Z")
    public static boolean field9232 = false;

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "I")
    public static int field9221;

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "I")
    public static int field9223;

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
    public static int field9224;

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "I")
    public static int field9225;

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "I")
    public static int field9226;

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "I")
    public static int field9228;

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "Lfc;")
    public static class322 field9227;

    @OriginalMember(owner = "client!fv", name = "m", descriptor = "[[Z")
    public static boolean[][] field9230;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)I")
    public final int method865(int arg0) {
        if (arg0 != 17124) {
            field9231 = null;
        }
        ++field9226;
        return this.field9229;
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(B)V")
    public static void method3665(byte arg0) {
        int var1 = -16 % ((53 - arg0) / 57);
        field9220 = null;
        field9230 = null;
        field9231 = null;
        field9227 = null;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIII)V")
    public static final void method3666(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 0) {
            class118.method650(true, class106.field1375);
            ++class154.field2002;
        }
        ++field9225;
        if (arg0 > 45) {
            if (~arg1 == -2) {
                class118.method650(true, class263.field3356);
                ++class120.field1519;
            }
            class272.field3457.method3042(class525.field7310 + arg3, 118);
            class272.field3457.method3082(class58.field786 + arg2, 128);
            class272.field3457.method3080(-82, field9227.method2004((byte) -42, 82) ? 1 : 0);
            class64.field868 = arg2;
            class281.field3673 = arg3;
            class457.field6527 = false;
            class232.method1468((byte) 98);
        }
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Luq;I[BI)V")
    public class634(class313 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field9229 = arg1;
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Luq;ILjaclib/memory/Buffer;)V")
    public class634(class313 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field9229 = arg1;
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)J")
    public final long method867(int arg0) {
        if (arg0 != 6271) {
            return 15L;
        } else {
            ++field9228;
            return super.field5732.getAddress();
        }
    }

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "(I)Ljava/lang/String;")
    public static final String method3667(int arg0) {
        ++field9224;
        String var1 = "www";
        if (class602.field8701 != class509.field7089) {
            if (class602.field8701 != class2.field13) {
                if (class602.field8701 == class311.field3974) {
                    var1 = "www-wtwip";
                }
            } else {
                var1 = "www-wtqa";
            }
        } else {
            var1 = "www-wtrc";
        }
        String var2 = "";
        if (arg0 <= 18) {
            method3667(-7);
        }
        if (class418.field5715 != null) {
            var2 = "/p=" + class418.field5715;
        }
        return "http://" + var1 + "." + class26.field453.field7139 + ".com/l=" + class245.field3103 + "/a=" + class24.field428 + var2 + "/";
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I[BII)V")
    public final void method866(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 != -3211) {
            field9220 = null;
        }
        this.method2488(arg1, arg3);
        ++field9221;
        this.field9229 = arg2;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)I")
    public final int method868(byte arg0) {
        if (arg0 < 44) {
            return -82;
        } else {
            ++field9223;
            return 0;
        }
    }
}

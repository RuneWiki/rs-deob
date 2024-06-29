import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class563 implements class243 {

    @OriginalMember(owner = "client!k", name = "a", descriptor = "Lkda;")
    public class388 field8009;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public int field8018;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "Ljava/lang/String;")
    public String field8024;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    public int field8025;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public int field8013;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public int field8022;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public int field8014;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public int field8010;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public int field8012;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public int field8016;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public int field8019;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Lcu;")
    public class219 field8011;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public int field8020;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "Z")
    public static boolean field8021 = true;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "Lsq;")
    public static class178 field8023 = new class178(11, 0, 1, 2);

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field8015;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field8017;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "Lgh;")
    public static class546 field8027;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "Lha;")
    public static class58 field8026;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Loh;II)Lhu;", line = 7)
    public static final class131 method3280(class404 arg0, int arg1, int arg2) {
        field8015++;
        class131 var3 = (class131) class123.field1291.method3538((long) arg2, arg1);
        if (var3 == null) {
            if (class145.field1606) {
                var3 = class275.field3370.method434(class155.method960(arg0, arg2), true);
            } else {
                var3 = class631.method3620(arg0.method2472(false, arg2), arg1 + 128);
            }
            class123.field1291.method3537(108, (long) arg2, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)Lhs;", line = 39)
    public final class325 method777(int arg0) {
        field8017++;
        if (arg0 >= -8) {
            method3281(71);
        }
        return class294.field3621;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V", line = 52)
    public static void method3281(int arg0) {
        field8027 = null;
        if (arg0 != 11) {
            method3282(-115, null);
        }
        field8023 = null;
        field8026 = null;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Ljava/lang/String;Lkda;Lcu;IIIIIIIIII)V", line = 70)
    public class563(String arg0, class388 arg1, class219 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field8009 = arg1;
        this.field8018 = arg10;
        this.field8024 = arg0;
        this.field8025 = arg6;
        this.field8013 = arg3;
        this.field8022 = arg9;
        this.field8014 = arg12;
        this.field8010 = arg5;
        this.field8012 = arg7;
        this.field8016 = arg11;
        this.field8019 = arg4;
        this.field8011 = arg2;
        this.field8020 = arg8;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILs;)V", line = 90)
    public static final void method3282(int arg0, class278 arg1) {
        class504.field7120[arg0] = arg1;
    }
}

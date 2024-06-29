import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public abstract class class22 {

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "Z")
    public static boolean field432 = false;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "Lgh;")
    public static class24 field431 = new class24();

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field433 = 0;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLhg;)Lhg;")
    public abstract class172 method242(byte arg0, class172 arg1);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static void method243(int arg0) {
        if (arg0 == 0) {
            field431 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILeb;)Lij;")
    public static final class189 method244(int arg0, class230 arg1) {
        field430++;
        if (arg0 != 0) {
            return null;
        }
        for (class189 var2 = (class189) class124.field2189.method839(128); var2 != null; var2 = (class189) class124.field2189.method834((byte) 82)) {
            if (var2.field3321.method1585(arg1, arg0 + 60)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLeb;Lfk;)I")
    public static final int method245(byte arg0, class230 arg1, class14 arg2) {
        field429++;
        int var3 = 49 % ((arg0 + 4) / 39);
        int var4 = arg2.field318;
        arg2.method177(arg1.field3990, -103);
        arg2.field318 += class260.field4631.method1650(arg1.field3990, arg2.field318, arg1.field3988, arg2.field269, 24, 0);
        return arg2.field318 - var4;
    }
}

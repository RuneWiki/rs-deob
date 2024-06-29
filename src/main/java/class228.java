import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class228 {

    @OriginalMember(owner = "client!jda", name = "f", descriptor = "Lwu;")
    private class376 field3256;

    @OriginalMember(owner = "client!jda", name = "h", descriptor = "I")
    public int field3258;

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "I")
    public static int field3253 = 0;

    @OriginalMember(owner = "client!jda", name = "g", descriptor = "[I")
    public static int[] field3257 = new int[13];

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "Lhda;")
    public static class752 field3252 = new class752(65, -1);

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!jda", name = "d", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!jda", name = "e", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(B)V")
    public static void method1452(byte arg0) {
        if (arg0 == 115) {
            field3257 = null;
            field3252 = null;
        }
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(B)I")
    public static final int method1453(byte arg0) {
        field3254++;
        if (class403.field5625) {
            return 6;
        } else if (class218.field3147 == null) {
            return 0;
        } else {
            int var1 = class218.field3147.field5963;
            if (arg0 > -83) {
                field3255 = 101;
            }
            if (class127.method1007(var1, (byte) 99)) {
                return 1;
            } else if (class361.method2151(var1, 50)) {
                return 2;
            } else if (class84.method650(var1, (byte) -114)) {
                return 3;
            } else if (class410.method2392(-65, var1)) {
                return 4;
            } else {
                return 5;
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Lms;ILwu;)V")
    public class228(class763 arg0, int arg1, class376 arg2) {
        new class65(64);
        this.field3256 = arg2;
        this.field3258 = this.field3256.method2195(15, 0);
    }
}

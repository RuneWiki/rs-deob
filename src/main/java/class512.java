import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class512 {

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "Z")
    public static boolean field7236 = false;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "I")
    public static int field7233;

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "I")
    public static int field7235;

    @OriginalMember(owner = "client!lda", name = "e", descriptor = "I")
    public static int field7237;

    @OriginalMember(owner = "client!lda", name = "f", descriptor = "I")
    public static int field7238;

    @OriginalMember(owner = "client!lda", name = "g", descriptor = "Lbt;")
    public static class48 field7239;

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "[Z")
    public static boolean[] field7234;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(III)Z", line = 14)
    public static final boolean method3074(int arg0, int arg1, int arg2) {
        field7237++;
        if (arg2 != 1) {
            method3074(-87, 37, 36);
        }
        return class370.method2156(arg0, arg1, 540800) || class217.method1352(arg1, arg0, -93);
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Z)V", line = 26)
    public static void method3075(boolean arg0) {
        field7239 = null;
        if (arg0) {
            field7233 = -126;
        }
        field7234 = null;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Llja;Lkl;B)Luea;", line = 39)
    public static final class336 method3076(class744 arg0, class87 arg1, byte arg2) {
        field7235++;
        if (arg2 < 60) {
            return null;
        }
        class336 var3 = class329.method1954(0);
        var3.field4151 = arg0.field10362;
        var3.field4158 = arg0;
        if (var3.field4151 == -1) {
            var3.field4150 = new class468(260);
        } else if (var3.field4151 == -2) {
            var3.field4150 = new class468(10000);
        } else if (var3.field4151 <= 18) {
            var3.field4150 = new class468(20);
        } else if (var3.field4151 > 98) {
            var3.field4150 = new class468(260);
        } else {
            var3.field4150 = new class468(100);
        }
        var3.field4150.method2801(arg1, 18760);
        var3.field4150.method2810(103, var3.field4158.method4169((byte) -102));
        var3.field4153 = 0;
        return var3;
    }
}

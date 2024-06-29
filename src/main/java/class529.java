import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class529 {

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "Ljava/util/Random;")
    public static Random field7812 = new Random();

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "Lbh;")
    public static class301 field7814 = new class301(0, 0);

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "I")
    public static int field7810;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
    public static int field7811;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "I")
    public static int field7813;

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "I")
    public static int field7815;

    static {
        new class375(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
        new class375("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lns;BLqa;)V", line = 3)
    public static final void method3124(class438 arg0, byte arg1, class496 arg2) {
        field7810++;
        if (class437.field6478) {
            return;
        }
        arg2.method1053(0);
        class223.field3152 = arg2.method1117(class476.method2855(arg0, class23.field350), true);
        class223.field3152.method1332((class7.field112 - class223.field3152.method209()) / 2, (class486.field7136 - class223.field3152.method219()) / 2);
        if (arg1 > 45) {
            class328.field5023 = arg2.method1117(class476.method2855(arg0, class322.field4952), true);
            class328.field5023.method1332((class7.field112 - class328.field5023.method209()) / 2, 18);
            class437.field6478 = true;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Z)V", line = 41)
    public static void method3125(boolean arg0) {
        field7812 = null;
        if (!arg0) {
            field7811 = -37;
        }
        field7814 = null;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(BI)Lwi;", line = 52)
    public static final class340 method3126(byte arg0, int arg1) {
        field7813++;
        class340[] var2 = class197.method1384(-1214668628);
        int var3 = 0;
        if (arg0 > -116) {
            field7812 = null;
        }
        while (var2.length > var3) {
            if (var2[var3].field5375 == arg1) {
                return var2[var3];
            }
            var3++;
        }
        return null;
    }
}

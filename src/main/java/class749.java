import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class749 {

    @OriginalMember(owner = "client!dw", name = "k", descriptor = "I")
    public int field10337 = 128;

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "I")
    public int field10330 = 128;

    @OriginalMember(owner = "client!dw", name = "r", descriptor = "I")
    public int field10344;

    @OriginalMember(owner = "client!dw", name = "p", descriptor = "I")
    public int field10342;

    @OriginalMember(owner = "client!dw", name = "m", descriptor = "I")
    public int field10339;

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "I")
    public int field10328;

    @OriginalMember(owner = "client!dw", name = "s", descriptor = "I")
    public static int field10345 = 0;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "I")
    public int field10327;

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "I")
    public int field10329;

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "I")
    public static int field10331;

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "I")
    public static int field10332;

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "I")
    public int field10334;

    @OriginalMember(owner = "client!dw", name = "i", descriptor = "I")
    public static int field10335;

    @OriginalMember(owner = "client!dw", name = "j", descriptor = "I")
    public static int field10336;

    @OriginalMember(owner = "client!dw", name = "l", descriptor = "I")
    public int field10338;

    @OriginalMember(owner = "client!dw", name = "n", descriptor = "I")
    public static int field10340;

    @OriginalMember(owner = "client!dw", name = "o", descriptor = "I")
    public int field10341;

    @OriginalMember(owner = "client!dw", name = "q", descriptor = "I")
    public static int field10343;

    @OriginalMember(owner = "client!dw", name = "g", descriptor = "Z")
    public static boolean field10333;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(II)Z")
    public static final boolean method4156(int arg0, int arg1) {
        field10331++;
        if (arg0 != 8) {
            method4159(10);
        }
        return arg1 >= 4 && arg1 <= 8;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)Ldw;")
    public final class749 method4157(byte arg0) {
        field10336++;
        if (arg0 < 6) {
            this.field10344 = 50;
        }
        return new class749(this.field10344, this.field10337, this.field10330, this.field10328, this.field10339, this.field10342);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Ldw;I)V")
    public final void method4158(class749 arg0, int arg1) {
        this.field10342 = arg0.field10342;
        this.field10330 = arg0.field10330;
        this.field10344 = arg0.field10344;
        this.field10337 = arg0.field10337;
        if (arg1 != 0) {
            this.method4158(null, 81);
        }
        field10332++;
        this.field10339 = arg0.field10339;
        this.field10328 = arg0.field10328;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V")
    public static final void method4159(int arg0) {
        if (class366.method2233(-15233)) {
            if (class238.field3400 == null) {
                class552.method3175((byte) 84);
            }
            class276.field3828 = 0;
            class761.field10485 = true;
        }
        if (arg0 == 0) {
            field10343++;
        }
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lfca;I)Lgha;")
    public static final class367 method4160(class93 arg0, int arg1) {
        field10335++;
        int var2 = -31 / ((30 - arg1) / 58);
        return new class367(arg0.method774(-4), arg0.method774(-4), arg0.method774(-4), arg0.method774(-4), arg0.method767((byte) -122), arg0.method767((byte) -128), arg0.method793((byte) 28));
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(I)V")
    public class749(int arg0) {
        this.field10344 = arg0;
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(IIIIII)V")
    private class749(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field10330 = arg2;
        this.field10342 = arg5;
        this.field10337 = arg1;
        this.field10339 = arg4;
        this.field10344 = arg0;
        this.field10328 = arg3;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method4161(String arg0, boolean arg1) {
        field10340++;
        if (!arg1) {
            field10345 = 7;
        }
        for (int var2 = 0; var2 < class657.field9094.length; var2++) {
            if (class657.field9094[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }
}

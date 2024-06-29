import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class36 {

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public int field423 = 128;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public int field426 = 128;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public int field431;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public int field428;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public int field425;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public int field424;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field422 = 0;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "[Ldi;")
    public static class109[] field427 = new class109[128];

    @OriginalMember(owner = "client!i", name = "m", descriptor = "Llu;")
    public static class610 field432 = new class610(69, 3);

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Lee;")
    public static class582 field433 = new class582();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)Li;")
    public final class36 method220(byte arg0) {
        if (arg0 >= -111) {
            this.field423 = -13;
        }
        field429++;
        return new class36(this.field431, this.field423, this.field426, this.field425, this.field424, this.field428);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)Lgg;")
    public static final class151 method221(int arg0, byte arg1) {
        field430++;
        if (arg1 != -83) {
            field433 = null;
        }
        class151 var2 = (class151) class3.field17.method842(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class219.field3189.method1966(arg0, 0, true);
        class151 var4 = new class151();
        if (var3 != null) {
            var4.method1112(5, arg0, new class148(var3));
        }
        class3.field17.method835((byte) 124, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static void method222(int arg0) {
        field427 = null;
        if (arg0 != 0) {
            method225(111, 93, -116);
        }
        field433 = null;
        field432 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IBII)I")
    public static final int method223(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 50) {
            return 71;
        }
        field421++;
        if (arg2 >= arg3) {
            return arg0 >= arg2 ? arg2 : arg0;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BLi;)V")
    public final void method224(byte arg0, class36 arg1) {
        if (arg0 < 79) {
            method222(97);
        }
        this.field425 = arg1.field425;
        this.field426 = arg1.field426;
        this.field431 = arg1.field431;
        this.field428 = arg1.field428;
        this.field424 = arg1.field424;
        this.field423 = arg1.field423;
        field420++;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III)Lhu;")
    public static final class113 method225(int arg0, int arg1, int arg2) {
        class205 var3 = class420.field5697[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3037;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(I)V")
    public class36(int arg0) {
        this.field431 = arg0;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(IIIIII)V")
    private class36(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field423 = arg1;
        this.field431 = arg0;
        this.field428 = arg5;
        this.field425 = arg3;
        this.field424 = arg4;
        this.field426 = arg2;
    }
}

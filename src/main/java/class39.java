import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class39 extends class529 {

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public int field384 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public int field387 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public int field391 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public int field389 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "I")
    public int field396 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "I")
    public int field392 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!p", name = "w", descriptor = "I")
    public int field395 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "I")
    public int field397 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "Lho;")
    public class224 field390;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "[I")
    public static int[] field393 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "Lsc;")
    public static class29 field386;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public static void method231(byte arg0) {
        field393 = null;
        field386 = null;
        if (arg0 != -19) {
            field385 = 82;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BII)Z")
    public final boolean method232(byte arg0, int arg1, int arg2) {
        field394++;
        if (this.field392 <= arg2 && this.field391 >= arg2 && arg1 >= this.field396 && arg1 <= this.field384) {
            return true;
        } else if (arg0 < 2) {
            return false;
        } else {
            return this.field397 <= arg2 && this.field395 >= arg2 && this.field387 <= arg1 && this.field389 >= arg1;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IILgi;I)V")
    public static final void method233(int arg0, int arg1, class437 arg2, int arg3) {
        field388++;
        if (class477.field7309 != null || class409.field6204 || arg2 == null || class322.method2152(arg2, (byte) -105) == null) {
            return;
        }
        class477.field7309 = arg2;
        class326.field5117 = class322.method2152(arg2, (byte) -115);
        class361.field5593 = false;
        class7.field87 = arg3;
        if (arg0 != 2) {
            field385 = 69;
        }
        class38.field383 = arg1;
        class479.field7322 = 0;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lho;)V")
    public class39(class224 arg0) {
        this.field390 = arg0;
    }
}

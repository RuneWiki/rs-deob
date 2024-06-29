import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class666 implements class702 {

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public int field9377;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field9378;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field9380;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field9381;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public static int field9382;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field9383;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "J")
    public static long field9379;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILija;)Z", line = 8)
    public static final boolean method3793(int arg0, class362 arg1) {
        field9382++;
        if (arg0 > -59) {
            field9381 = -101;
        }
        class322 var2 = class496.field7061.method319(-127, arg1.method650(90));
        if (var2.field4769 == -1) {
            return true;
        } else {
            class427 var3 = class386.field5496.method3215((byte) 93, var2.field4769);
            return var3.field6014 == -1 ? true : var3.method2544(-87);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)Lve;", line = 31)
    public final class527 method606(int arg0) {
        field9383++;
        return arg0 == 0 ? class572.field8106 : null;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(I)V", line = 42)
    public class666(int arg0) {
        this.field9377 = arg0;
    }
}

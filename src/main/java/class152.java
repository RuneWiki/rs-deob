import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public abstract class class152 {

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "Z")
    public static boolean field2018 = false;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "Lmn;")
    public static class162 field2017;

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "[S")
    public static short[] field2019;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
    public abstract void method924(int arg0);

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)V")
    public abstract void method925(byte arg0);

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)Lct;")
    public abstract class369 method926(int arg0);

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(II)Z")
    public abstract boolean method927(int arg0, int arg1);

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "(I)V")
    public static void method928(int arg0) {
        field2019 = null;
        if (arg0 != -13531) {
            method929(35, -28, -42);
        }
        field2017 = null;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(III)V")
    public static final void method929(int arg0, int arg1, int arg2) {
        class409 var3 = class217.field3699[arg0][arg1][arg2];
        if (var3 != null && var3.field6176 != null) {
            var3.field6176 = null;
        }
    }
}

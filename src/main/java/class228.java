import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class228 {

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public final int field3942;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public final int field3944;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public final int field3947;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "Lpc;")
    public final class296 field3943;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "Lde;")
    public static class226 field3945;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)Lw;", line = 6)
    public static final class124 method1625(int arg0, int arg1) {
        class124 var2 = (class124) class159.field2751.method2175((long) arg1, 3008);
        field3940++;
        if (arg0 != 10415) {
            return (class124) null;
        } else if (var2 == null) {
            byte[] var3 = class217.field3766.method1577(1, arg1, -29569);
            class124 var4 = new class124();
            if (var3 != null) {
                var4.method850(new class153(var3), (byte) 4, arg1);
            }
            class159.field2751.method2169(var4, (long) arg1, (byte) 94);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V", line = 36)
    public static void method1626(byte arg0) {
        if (arg0 >= -91) {
            method1627(-55, 0, -17);
        }
        field3945 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V", line = 64)
    public static final void method1627(int arg0, int arg1, int arg2) {
        class65.field1020++;
        if (arg0 != 532) {
            method1626((byte) 79);
        }
        class61.field957.method1504(113, arg0 ^ 0xFFFFFDEB);
        class61.field957.method1102((byte) -69, arg2);
        class61.field957.method1053(arg1, (byte) 86);
        field3941++;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(IIII)V", line = 99)
    public class228(int arg0, int arg1, int arg2, int arg3) {
        class296 var5 = class306.method2113(92, arg0);
        this.field3942 = arg1;
        this.field3944 = arg3;
        this.field3947 = arg2;
        if (class147.field2485 || var5.field5003 == -1) {
            this.field3943 = var5;
        } else {
            this.field3943 = class306.method2113(121, var5.field5003);
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lpc;III)V", line = 115)
    public class228(class296 arg0, int arg1, int arg2, int arg3) {
        this.field3944 = arg3;
        this.field3942 = arg1;
        this.field3947 = arg2;
        this.field3943 = arg0;
    }
}

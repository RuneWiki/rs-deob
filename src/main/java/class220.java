import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class220 extends class334 {

    @OriginalMember(owner = "client!kg", name = "E", descriptor = "Lvc;")
    public class100 field3730;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "Lab;")
    public class444 field3720;

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "[I")
    public static int[] field3721 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!kg", name = "D", descriptor = "[I")
    public static int[] field3729 = new int[32];

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "F")
    public static float field3718;

    @OriginalMember(owner = "client!kg", name = "A", descriptor = "F")
    public static float field3726;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
    public int field3719;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
    public int field3722;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!kg", name = "B", descriptor = "I")
    public int field3727;

    @OriginalMember(owner = "client!kg", name = "C", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!kg", name = "F", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!kg", name = "G", descriptor = "I")
    public int field3732;

    @OriginalMember(owner = "client!kg", name = "H", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!kg", name = "I", descriptor = "I")
    public int field3734;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method1606(String arg0, byte arg1) {
        field3728++;
        String var2 = class315.method2106(26759, class335.method2229(arg0, 37));
        if (var2 == null) {
            var2 = "";
        }
        if (arg1 > -54) {
            method1608(31);
        }
        return var2;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)Z")
    public static final boolean method1607(int arg0, int arg1, int arg2) {
        int var3 = -11 / ((-arg0 - 7) / 47);
        field3733++;
        return (arg1 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
    public static void method1608(int arg0) {
        if (arg0 != 11983) {
            field3729 = null;
        }
        field3721 = null;
        field3729 = null;
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)V")
    public final void method1609(int arg0) {
        field3731++;
        this.field3727 = this.field3730.field1430;
        this.field3719 = this.field3730.field1428;
        this.field3722 = this.field3730.field1442;
        if (this.field3730.field1441 != null) {
            this.field3730.field1441.method153(this.field3720.field6890, this.field3720.field6886, this.field3720.field6902, class207.field3154);
        }
        this.field3734 = class207.field3154[0];
        this.field3732 = class207.field3154[2];
        int var2 = -118 % ((arg0 + 11) / 42);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1610(int arg0, byte arg1, int arg2) {
        field3725++;
        if (arg1 == -108) {
            return (arg0 & 0x580) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Li;III[Z)V")
    public static final void method1611(class521 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class53.field732 == class103.field1520) {
            return;
        }
        int var5 = class244.field3956[arg1].method692(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class223 var7 = class244.field3956[var6];
                if (var7 != null) {
                    var7.method685(arg0, arg2, var5 - var7.method692(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lvc;Lbn;)V")
    public class220(class100 arg0, class356 arg1) {
        this.field3730 = arg0;
        this.field3720 = this.field3730.method678((byte) -82);
        this.method1609(65);
    }
}

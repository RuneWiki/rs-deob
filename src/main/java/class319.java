import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class319 extends class258 {

    @OriginalMember(owner = "client!hga", name = "n", descriptor = "Luw;")
    public static class208 field3975 = new class208(128, 0);

    @OriginalMember(owner = "client!hga", name = "o", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!hga", name = "p", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!hga", name = "q", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!hga", name = "r", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!hga", name = "m", descriptor = "Ljava/lang/String;")
    private String field3974;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(III)Z")
    public static final boolean method1860(int arg0, int arg1, int arg2) {
        if (arg2 == 55) {
            field3978++;
            return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Lim;B)V")
    public final void method547(class652 arg0, byte arg1) {
        arg0.field8315 = this.field3974;
        if (arg1 <= 123) {
            method1861(-43);
        }
        field3976++;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)V")
    public static void method1861(int arg0) {
        if (arg0 == 27778) {
            field3975 = null;
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIILcda;Lcda;)V")
    public static final void method1862(int arg0, int arg1, int arg2, class121 arg3, class121 arg4) {
        class766 var5 = class196.method1355(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field10432 = arg3;
        var5.field10430 = arg4;
        int var6 = class735.field9973 == class116.field1542 ? 1 : 0;
        if (!arg3.method743((byte) -80)) {
            arg3.field2890 = class640.field8187[var6];
            class640.field8187[var6] = arg3;
        } else if (arg3.method738(true)) {
            arg3.field2890 = class336.field4089[var6];
            class336.field4089[var6] = arg3;
        } else {
            arg3.field2890 = class177.field2327[var6];
            class177.field2327[var6] = arg3;
            class689.field8852 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method743((byte) -125)) {
            if (arg4.method738(true)) {
                arg4.field2890 = class336.field4089[var6];
                class336.field4089[var6] = arg4;
                return;
            }
            arg4.field2890 = class177.field2327[var6];
            class177.field2327[var6] = arg4;
            class689.field8852 = true;
            return;
        }
        arg4.field2890 = class640.field8187[var6];
        class640.field8187[var6] = arg4;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(BLmc;)V")
    public final void method546(byte arg0, class234 arg1) {
        field3977++;
        this.field3974 = arg1.method1540((byte) -108);
        int var3 = 74 / ((7 - arg0) / 41);
        arg1.method1497((byte) 113);
    }
}

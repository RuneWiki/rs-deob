import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public abstract class class545 {

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "[C")
    public static char[] field6854 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "[I")
    public static int[] field6858 = new int[1000];

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field6855;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field6856;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field6857;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V", line = 3)
    public static void method2918(int arg0) {
        field6858 = null;
        if (arg0 != 27085) {
            field6854 = null;
        }
        field6854 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BZ)V", line = 14)
    public static final void method2919(byte arg0, boolean arg1) {
        if (arg0 != 24) {
            method2919((byte) -106, true);
        }
        field6855++;
        class428.method2354(arg0 - 6355);
        if (!class671.method3724(class470.field5804, 12)) {
            return;
        }
        class299.field3800++;
        if (class299.field3800 < 50 && !arg1) {
            return;
        }
        class299.field3800 = 0;
        if (!class384.field4931 && class335.field4139 != null) {
            class491.field6131++;
            class124 var2 = class336.method1924(class289.field3653, class636.field8620, (byte) 3);
            class197.method1156((byte) 98, var2);
            try {
                class605.method3355(-54);
            } catch (IOException var3) {
                class384.field4931 = true;
            }
        }
        class428.method2354(-6331);
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(B)V", line = 59)
    public static final void method2920(byte arg0) {
        field6856++;
        if (arg0 <= 25) {
            return;
        }
        for (class589 var1 = (class589) class26.field303.method1909(true); var1 != null; var1 = (class589) class26.field303.method1916((byte) 121)) {
            if (var1.field7908 > 0) {
                var1.field7908--;
            }
            if (var1.field7908 != 0) {
                if (var1.field7916 > 0) {
                    var1.field7916--;
                }
                if (var1.field7916 == 0 && var1.field7904 >= 1 && var1.field7910 >= 1 && var1.field7904 <= (class85.field1090 - 2) && class656.field8932 - 2 >= var1.field7910 && (var1.field7902 < 0 || class560.method2978(var1.field7912, 1, var1.field7902))) {
                    class38.method247(var1.field7904, (byte) -96, var1.field7912, var1.field7910, var1.field7902, var1.field7915, -1, var1.field7906, var1.field7903);
                    var1.field7916 = -1;
                    if (var1.field7913 == var1.field7902 && var1.field7913 == -1) {
                        var1.method1566(-61);
                    } else if (var1.field7913 == var1.field7902 && var1.field7909 == var1.field7903 && var1.field7918 == var1.field7912) {
                        var1.method1566(-67);
                    }
                }
            } else if (var1.field7913 < 0 || class560.method2978(var1.field7918, 1, var1.field7913)) {
                class38.method247(var1.field7904, (byte) -96, var1.field7918, var1.field7910, var1.field7913, var1.field7915, -1, var1.field7906, var1.field7909);
                var1.method1566(-59);
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)Z", line = 120)
    public final boolean method2921(boolean arg0) {
        if (arg0) {
            field6854 = null;
        }
        field6857++;
        return this.method1072(-51) || this.method1076((byte) -108) || this.method1068(14057);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)I")
    public abstract int method1074(byte arg0);

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)Z")
    public abstract boolean method1076(byte arg0);

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)I")
    public abstract int method1078(byte arg0);

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
    public abstract void method1070(int arg0);

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)Lwk;")
    public abstract class132 method1079(int arg0);

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)V")
    public abstract void method1069(int arg0);

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)Z")
    public abstract boolean method1068(int arg0);

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "(I)Z")
    public abstract boolean method1072(int arg0);
}

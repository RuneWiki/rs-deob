import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class425 extends class90 {

    @OriginalMember(owner = "client!hr", name = "w", descriptor = "Lhd;")
    public class200 field6078;

    @OriginalMember(owner = "client!hr", name = "u", descriptor = "Lo;")
    public static class332 field6076 = new class332("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!hr", name = "A", descriptor = "I")
    public static int field6082 = 0;

    @OriginalMember(owner = "client!hr", name = "s", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!hr", name = "v", descriptor = "I")
    public static int field6077;

    @OriginalMember(owner = "client!hr", name = "x", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!hr", name = "y", descriptor = "I")
    public static int field6080;

    @OriginalMember(owner = "client!hr", name = "z", descriptor = "I")
    public static int field6081;

    @OriginalMember(owner = "client!hr", name = "t", descriptor = "Lui;")
    public static class451 field6075;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "(I)[Leh;", line = 6)
    public static final class169[] method2503(int arg0) {
        if (arg0 != 2) {
            method2505(22, (class271) null, 103, 11, -120);
        }
        field6081++;
        return new class169[] { class109.field1532, class109.field1534, class109.field1536, class109.field1539, class109.field1541, class109.field1542, class109.field1543, class109.field1544, class109.field1545, class109.field1546 };
    }

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "(I)V", line = 20)
    public static void method2504(int arg0) {
        if (arg0 != 21661) {
            method2505(-37, (class271) null, 102, 115, 30);
        }
        field6076 = null;
        field6075 = null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILvc;III)V", line = 32)
    public static final void method2505(int arg0, class271 arg1, int arg2, int arg3, int arg4) {
        field6079++;
        int var5 = -31 / ((arg3 + 12) / 46);
        for (class43 var6 = (class43) class390.field5742.method2456(32101); var6 != null; var6 = (class43) class390.field5742.method2461(301)) {
            if (var6.field575 == arg2 && (arg4 * 128) == var6.field583 && arg0 * 128 == var6.field585 && var6.field579.field4043 == arg1.field4043) {
                if (var6.field580 != null) {
                    class452.field6419.method2415(var6.field580);
                    var6.field580 = null;
                }
                if (var6.field584 != null) {
                    class452.field6419.method2415(var6.field584);
                    var6.field584 = null;
                }
                var6.method283(2);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lhd;)V", line = 71)
    public class425(class200 arg0) {
        this.field6078 = arg0;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIIIII)V", line = 80)
    public static final void method2506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6074++;
        for (class6 var7 = (class6) class322.field4845.method1594(16); var7 != null; var7 = (class6) class322.field4845.method1596(true)) {
            if (class452.field6418 >= var7.field104) {
                var7.method1847(true);
            } else {
                class439.method2551(arg0, (var7.field105 << 7) + 64, arg5, var7.field98, -30226, arg4 >> 1, var7.field101 * 2, (var7.field99 << 7) + 64, arg1 >> 1);
                class462.field6513.method1494(0, var7.field108 | 0xFF000000, class429.field6114[0] + arg3, (byte) 51, var7.field94, class429.field6114[1] + arg2);
            }
        }
        if (arg6 != 360664001) {
            field6082 = -104;
        }
    }
}

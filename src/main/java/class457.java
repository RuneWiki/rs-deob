import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public abstract class class457 {

    @OriginalMember(owner = "client!og", name = "d", descriptor = "Lef;")
    public class338 field6706;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "Lrm;")
    public static class282 field6708 = new class282(0);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field6703;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field6704;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field6707;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field6709;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public static int field6713;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "Ll;")
    public static class16 field6711;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "Lhf;")
    public static class271 field6710;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "[[Z")
    public static boolean[][] field6712;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIII)V", line = 4)
    public static final void method2678(int arg0, int arg1, int arg2, int arg3) {
        field6703++;
        class97 var4 = class348.method2064(arg3, arg0, arg0 - 91);
        var4.method712((byte) -108);
        var4.field1471 = arg2;
        var4.field1468 = arg1;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V", line = 20)
    public static final void method2679(int arg0) {
        field6713++;
        if (class188.field2723 == -1) {
            return;
        }
        int var1 = class518.field7668.method1813(arg0);
        int var2 = class518.field7668.method1822(126);
        class528 var3 = (class528) class391.field5737.method2818((byte) 105);
        if (var3 != null) {
            var1 = var3.method2749(-2257);
            var2 = var3.method2747(5);
        }
        class111.method806(class117.field1754, class27.field359, 0, 0, class188.field2723, 0, 0, var1, arg0 + 24294, var2);
        if (class68.field931 != null) {
            class531.method3140(var2, -100, var1);
        }
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V", line = 50)
    public static void method2680(int arg0) {
        field6712 = null;
        field6711 = null;
        field6708 = null;
        field6710 = null;
        if (arg0 < 92) {
            method2678(104, 116, -55, -122);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lsi;B)Lql;", line = 68)
    public static final class515 method2681(class391 arg0, byte arg1) {
        if (arg1 < 115) {
            method2680(105);
        }
        field6707++;
        class515 var2 = new class515();
        var2.field7614 = arg0.method2353((byte) 97);
        var2.field7616 = class224.field3195.method1560(var2.field7614, -2621);
        return var2;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lef;)V", line = 82)
    public class457(class338 arg0) {
        this.field6706 = arg0;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)Z", line = 91)
    public static final boolean method2682(int arg0, int arg1, int arg2) {
        field6709++;
        if (arg0 != 29521) {
            method2680(98);
        }
        return (arg1 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(I)V", line = 103)
    public static final void method2683(int arg0) {
        if (arg0 == 0) {
            class268.field3704.method1490(true);
            field6705++;
            class250.field3451.method1490(true);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIZ)V")
    public abstract void method430(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)Z")
    public abstract boolean method429(int arg0);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZ)V")
    public abstract void method434(int arg0, boolean arg1);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZB)V")
    public abstract void method435(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
    public abstract void method433(byte arg0);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lmk;II)V")
    public abstract void method431(class40 arg0, int arg1, int arg2);
}

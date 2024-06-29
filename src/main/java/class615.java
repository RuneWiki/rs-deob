import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class615 extends class293 {

    @OriginalMember(owner = "client!naa", name = "u", descriptor = "I")
    public int field8863 = -1;

    @OriginalMember(owner = "client!naa", name = "I", descriptor = "I")
    public int field8877 = -1;

    @OriginalMember(owner = "client!naa", name = "E", descriptor = "I")
    public static int field8873 = 0;

    @OriginalMember(owner = "client!naa", name = "D", descriptor = "[Lcm;")
    public static class530[] field8872 = new class530[100];

    @OriginalMember(owner = "client!naa", name = "y", descriptor = "[Liq;")
    public static class190[] field8867 = new class190[6];

    @OriginalMember(owner = "client!naa", name = "H", descriptor = "I")
    public static int field8876 = 0;

    @OriginalMember(owner = "client!naa", name = "t", descriptor = "I")
    public static int field8862;

    @OriginalMember(owner = "client!naa", name = "v", descriptor = "I")
    public static int field8864;

    @OriginalMember(owner = "client!naa", name = "w", descriptor = "I")
    public int field8865;

    @OriginalMember(owner = "client!naa", name = "x", descriptor = "I")
    public static int field8866;

    @OriginalMember(owner = "client!naa", name = "z", descriptor = "I")
    public static int field8868;

    @OriginalMember(owner = "client!naa", name = "A", descriptor = "I")
    public int field8869;

    @OriginalMember(owner = "client!naa", name = "C", descriptor = "I")
    public static int field8871;

    @OriginalMember(owner = "client!naa", name = "F", descriptor = "I")
    public int field8874;

    @OriginalMember(owner = "client!naa", name = "G", descriptor = "I")
    public int field8875;

    @OriginalMember(owner = "client!naa", name = "B", descriptor = "Lkr;")
    public static class329 field8870;

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(ILqa;)Lud;")
    public final class119 method58(int arg0, class167 arg1) {
        ++field8866;
        int var3 = -112 / ((arg0 - 4) / 47);
        return null;
    }

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(Lqa;I)V")
    public final void method66(class167 arg0, int arg1) {
        ++field8871;
        if (arg1 != 0) {
            field8870 = null;
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(ILn;Ljava/awt/Canvas;)Lqa;")
    public static final class167 method3527(int arg0, class473 arg1, Canvas arg2) {
        ++field8864;
        int var3 = 75 / ((-32 - arg0) / 50);
        return new class328(arg2, arg1);
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(IILqa;I)Z")
    public final boolean method63(int arg0, int arg1, class167 arg2, int arg3) {
        if (arg3 > -35) {
            return false;
        } else {
            ++field8862;
            class105 var5 = arg2.method964();
            var5.method361(super.field3816, super.field3814, super.field3820);
            class521 var6 = class98.field1307.method3391(0, this.field8869).method2640(true, (class534) null, 131072, (class320) null, -1, 0, 0, arg2, this.field8865);
            if (var6 != null && var6.method1598(arg0, arg1, var5, true)) {
                return true;
            } else {
                if (this.field8877 != -1) {
                    class521 var7 = class98.field1307.method3391(0, this.field8877).method2640(true, (class534) null, 131072, (class320) null, -1, 0, 0, arg2, this.field8874);
                    if (var7 != null && var7.method1598(arg0, arg1, var5, true)) {
                        return true;
                    }
                }
                if (this.field8863 != -1) {
                    class521 var8 = class98.field1307.method3391(0, this.field8863).method2640(true, (class534) null, 131072, (class320) null, -1, 0, 0, arg2, this.field8875);
                    if (var8 != null && var8.method1598(arg0, arg1, var5, true)) {
                        return true;
                    }
                }
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(BLqa;)Lqba;")
    public final class541 method59(byte arg0, class167 arg1) {
        ++field8868;
        class105 var3 = arg1.method964();
        var3.method361(super.field3816, super.field3814 + -10, super.field3820);
        class541 var4 = class296.method1818(16711680, 3);
        if (this.field8863 != -1) {
            class521 var5 = class98.field1307.method3391(0, this.field8863).method2640(true, (class534) null, 2048, (class320) null, -1, 0, 0, arg1, this.field8875);
            if (var5 != null) {
                var5.method1595(var3, var4.field7564[2], 0);
            }
        }
        if (~this.field8877 != 0) {
            class521 var6 = class98.field1307.method3391(0, this.field8877).method2640(true, (class534) null, 2048, (class320) null, -1, 0, 0, arg1, this.field8874);
            if (var6 != null) {
                var6.method1595(var3, var4.field7564[1], 0);
            }
        }
        class521 var7 = class98.field1307.method3391(0, this.field8869).method2640(true, (class534) null, 2048, (class320) null, -1, 0, 0, arg1, this.field8865);
        int var8 = 29 / ((arg0 - -30) / 63);
        if (var7 != null) {
            var7.method1595(var3, var4.field7564[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(I)V")
    public static void method3528(int arg0) {
        field8872 = null;
        field8867 = null;
        if (arg0 == 0) {
            field8870 = null;
        }
    }
}

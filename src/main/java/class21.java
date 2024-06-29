import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class21 extends class190 {

    @OriginalMember(owner = "client!ci", name = "B", descriptor = "I")
    public static int field251 = 0;

    @OriginalMember(owner = "client!ci", name = "I", descriptor = "I")
    public static int field257 = 0;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
    public static int field248 = 0;

    @OriginalMember(owner = "client!ci", name = "A", descriptor = "Lqe;")
    public static class168 field250 = class66.method448(")2", -111);

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
    public int field245;

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!ci", name = "C", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!ci", name = "E", descriptor = "I")
    public int field253;

    @OriginalMember(owner = "client!ci", name = "F", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!ci", name = "G", descriptor = "I")
    public int field255;

    @OriginalMember(owner = "client!ci", name = "J", descriptor = "Lrd;")
    public static class207 field258;

    @OriginalMember(owner = "client!ci", name = "H", descriptor = "[[B")
    public static byte[][] field256;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(B)V")
    public static void method109(byte arg0) {
        int var1 = -66 / ((arg0 - 64) / 41);
        field256 = null;
        field250 = null;
        field258 = null;
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(B)V")
    public static final void method110(byte arg0) {
        field252++;
        class234 var1 = class165.field2816;
        synchronized (class165.field2816) {
            class74.field1121++;
            class221.field3798 = class6.field73;
            if (class104.field1678 >= 0) {
                while (field248 != class104.field1678) {
                    int var2 = class143.field2515[field248];
                    field248 = field248 + 1 & 0x7F;
                    if (var2 < 0) {
                        class190.field3306[~var2] = false;
                    } else {
                        class190.field3306[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class190.field3306[var3] = false;
                }
                class104.field1678 = field248;
            }
            if (arg0 != 111) {
                field250 = null;
            }
            class6.field73 = class82.field1242;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZLoe;)V")
    public static final void method111(boolean arg0, class256 arg1) {
        if (!arg0) {
            return;
        }
        field247++;
        class187.field3289 = arg1.method1705(class93.field1468, -1);
        class163.field2798 = arg1.method1705(class175.field3070, -1);
        class148.field2582 = arg1.method1705(class92.field1449, -1);
        class213.field3673 = arg1.method1705(class211.field3655, -1);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)I")
    public static final int method112(int arg0, int arg1, int arg2) {
        if (arg0 >= -111) {
            return 110;
        }
        field249++;
        int var3 = class76.method512(arg2 + 45365, 4, (byte) -98, arg1 + 91923) + (class76.method512(arg2 + 10294, 2, (byte) -114, arg1 + 37821) - 128 >> 1) + (class76.method512(arg2, 1, (byte) -100, arg1) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }
}

import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public abstract class class249 {

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "D")
    public static double field3584 = -1.0D;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field3575 = 0;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "Lkm;")
    public static class133 field3577;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "Lkm;")
    public static class133 field3579;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "Lpn;")
    public static class170 field3576;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "[[[B")
    public static byte[][][] field3583;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)Ltj;", line = 5)
    public static final class258 method1698(byte arg0) {
        if (arg0 > -41) {
            method1698((byte) -11);
        }
        field3578++;
        class258 var1 = new class258(class154.field2136, class194.field2674, class209.field3002[0], class274.field4115[0], class323.field4903[0], class288.field4281[0], class209.field3012[0], class235.field3331);
        class236.method1624(79);
        return var1;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V", line = 23)
    public static void method1699(boolean arg0) {
        field3577 = null;
        field3579 = null;
        if (!arg0) {
            method1698((byte) 123);
        }
        field3583 = (byte[][][]) null;
        field3576 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)V", line = 63)
    public static final void method1703(int arg0, int arg1, int arg2) {
        field3581++;
        class157 var3 = class100.method729(arg0, (byte) -128);
        int var4 = var3.field2163;
        int var5 = var3.field2166;
        int var6 = var3.field2174;
        int var7 = class237.field3354[var6 - var5];
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        if (arg1 != 19558) {
            method1699(false);
        }
        class266.method1810(var8 & arg2 << var5 | class273.field4083[var4] & ~var8, -19014, var4);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method1700(Component arg0, byte arg1);

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)I")
    public abstract int method1701(int arg0);

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method1702(int arg0, Component arg1);
}

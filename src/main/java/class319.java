import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public abstract class class319 extends class329 {

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "Lqj;")
    public class548 field4079;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public static int field4074 = 0;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "Z")
    public boolean field4078;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "[[B")
    public static byte[][] field4080;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lpm;ZILpm;)V")
    public abstract void method1462(class133 arg0, boolean arg1, int arg2, class133 arg3);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)I")
    public int method1453(int arg0) {
        if (arg0 != 1) {
            method1833(null, 96);
        }
        field4075++;
        return 0;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)I")
    public final int method1832(int arg0) {
        field4083++;
        if (arg0 != 1) {
            this.field4078 = true;
        }
        return 1;
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)V")
    public abstract void method1455(int arg0);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Les;I)Luba;")
    public static final class685 method1833(class630 arg0, int arg1) {
        int var2 = -123 % ((arg1 + 19) / 47);
        field4077++;
        return new class685(arg0.method3510(66), arg0.method3510(96), arg0.method3510(49), arg0.method3510(94), arg0.method3517(-1), arg0.method3501(-9268));
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)Z")
    public final boolean method1834(byte arg0) {
        field4081++;
        return arg0 < 14 ? false : false;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)V")
    public abstract void method1454(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "(I)Z")
    public abstract boolean method1458(int arg0);

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "(I)Z")
    public final boolean method1835(int arg0) {
        if (arg0 != -16056) {
            field4080 = null;
        }
        field4076++;
        return this.field4078;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lqj;)V")
    public class319(class548 arg0) {
        this.field4079 = arg0;
    }

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "(I)V")
    public static void method1836(int arg0) {
        field4080 = null;
        if (arg0 != 1) {
            field4080 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)V")
    public abstract void method1459(int arg0, int arg1);

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "(I)Z")
    public abstract boolean method1461(int arg0);
}

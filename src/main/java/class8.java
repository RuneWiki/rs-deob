import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!e")
public class class8 {

    @OriginalMember(owner = "mapview!e", name = "d", descriptor = "Lna;")
    public static class26 field80 = class33.method219("Chainmail Shop", 95);

    @OriginalMember(owner = "mapview!e", name = "f", descriptor = "I")
    public static volatile int field82 = 0;

    @OriginalMember(owner = "mapview!e", name = "g", descriptor = "[I")
    public static int[] field83 = new int[128];

    @OriginalMember(owner = "mapview!e", name = "b", descriptor = "Lna;")
    public static class26 field78 = class33.method219("fonts", 85);

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "mapview!e", name = "e", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "mapview!e", name = "c", descriptor = "[[Lta;")
    public static class38[][] field79;

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "([Lna;I)Lna;", line = 4)
    public static final class26 method38(class26[] arg0, int arg1) {
        if (arg1 != 0) {
            field82 = -96;
        }
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class11.method54(0, -23132, arg0.length, arg0);
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(Ljava/awt/Component;III)Lc;", line = 44)
    public static final class4 method39(Component arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg3 == 2) {
                Class var4 = Class.forName("ua");
                class4 var5 = (class4) var4.getDeclaredConstructor().newInstance();
                var5.method25(arg0, (byte) 85, arg1, arg2);
                return var5;
            } else {
                return (class4) null;
            }
        } catch (Throwable var8) {
            class33 var7 = new class33();
            var7.method25(arg0, (byte) 101, arg1, arg2);
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(Z)V", line = 64)
    public static void method40(boolean arg0) {
        field83 = null;
        if (arg0) {
            field80 = null;
            field78 = null;
            field79 = null;
        }
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(I)V", line = 77)
    public static final void method41(int arg0) {
        if (arg0 == 26273 && class10.field95 != null) {
            class30 var1 = class10.field95;
            synchronized (class10.field95) {
                class10.field95 = null;
            }
        }
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(Lna;ILna;Lp;)[Lea;", line = 101)
    public static final class9[] method42(class26 arg0, int arg1, class26 arg2, class29 arg3) {
        if (arg1 != 13715) {
            method40(true);
        }
        int var4 = arg3.method207(arg0, -19661);
        int var5 = arg3.method201(arg1 ^ 0xFFFFCA6C, var4, arg2);
        return class30.method208(true, var5, arg3, var4);
    }
}

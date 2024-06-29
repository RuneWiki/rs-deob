import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!l")
public class class22 extends class31 {

    @OriginalMember(owner = "mapview!l", name = "o", descriptor = "Lu;")
    public static class39 field234 = new class39();

    @OriginalMember(owner = "mapview!l", name = "q", descriptor = "Lea;")
    public static class10 field236 = class3.method8("Find", 119);

    @OriginalMember(owner = "mapview!l", name = "t", descriptor = "[[[[B")
    public static byte[][][][] field239 = new byte[5][][][];

    @OriginalMember(owner = "mapview!l", name = "r", descriptor = "I")
    public static int field237 = 0;

    @OriginalMember(owner = "mapview!l", name = "v", descriptor = "Lea;")
    private static class10 field241 = class3.method8("map", -117);

    @OriginalMember(owner = "mapview!l", name = "w", descriptor = "Lea;")
    public static class10 field242 = class3.method8("50(U", -112);

    @OriginalMember(owner = "mapview!l", name = "p", descriptor = "Lea;")
    public static class10 field235 = class3.method8("Hunter Training", 104);

    @OriginalMember(owner = "mapview!l", name = "x", descriptor = "Lea;")
    public static class10 field243 = class3.method8("Clothes Shop", -113);

    @OriginalMember(owner = "mapview!l", name = "s", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "mapview!l", name = "u", descriptor = "J")
    public static long field240;

    @OriginalMember(owner = "mapview!l", name = "n", descriptor = "Lea;")
    public class10 field233;

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "(I)[Lea;", line = 10)
    public static final class10[] method149(int arg0) {
        if (arg0 != -25287) {
            field243 = null;
        }
        return new class10[] { class14.field158, class16.field179, class3.field21, class10.field79, class10.field72, class38.field495, class40.field516, class18.field189, class20.field213, class19.field198, class31.field433, field241, class2.field12, class20.field210 };
    }

    @OriginalMember(owner = "mapview!l", name = "c", descriptor = "(I)B", line = 22)
    public static final byte method150(int arg0) {
        if (arg0 == 0) {
            return class6.field47 == null ? 0 : class6.field47[field238];
        } else {
            return -44;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "d", descriptor = "(I)V", line = 55)
    public static void method151(int arg0) {
        field242 = null;
        if (arg0 != -9009) {
            field236 = null;
        }
        field239 = null;
        field241 = null;
        field243 = null;
        field235 = null;
        field234 = null;
        field236 = null;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(Ljava/lang/Object;ZI)[B", line = 75)
    public static final byte[] method152(Object arg0, boolean arg1, int arg2) {
        if (arg2 != 8353) {
            return (byte[]) null;
        } else if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg1 ? class38.method245(-21128, var3) : var3;
        } else if (arg0 instanceof class20) {
            class20 var4 = (class20) arg0;
            return var4.method135(5);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "mapview!l", name = "e", descriptor = "(I)Lsa;", line = 117)
    public static final class36 method153(int arg0) {
        try {
            return arg0 == -12283 ? (class36) Class.forName("ma").getDeclaredConstructor().newInstance() : (class36) null;
        } catch (Throwable var2) {
            return new class21();
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(II)Lea;", line = 176)
    public static final class10 method154(int arg0, int arg1) {
        class10 var2 = new class10();
        var2.field78 = new byte[arg1];
        if (arg0 != 5) {
            method150(-100);
        }
        var2.field83 = 0;
        return var2;
    }
}

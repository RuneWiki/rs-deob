import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public abstract class class111 {

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field1619 = 0;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "J")
    public static long field1621 = 0L;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "[I")
    public static int[] field1618;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIB)I", line = 5)
    public static final int method846(int arg0, int arg1, byte arg2) {
        int var3 = class93.method729(37, arg0 - 1, arg1 - 1) + class93.method729(119, arg0 - 1, arg1 + 1) + class93.method729(-106, arg0 + 1, arg1 + -1) + class93.method729(73, arg0 - -1, arg1 + 1);
        int var4 = -59 % ((arg2 + 31) / 36);
        field1615++;
        int var5 = class93.method729(-121, arg0, arg1 - 1) + class93.method729(46, arg0, arg1 + 1) + class93.method729(-106, arg0 - 1, arg1) + class93.method729(-122, arg0 + 1, arg1);
        int var6 = class93.method729(87, arg0, arg1);
        return var3 / 16 + (var5 / 8) + (var6 / 4);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IILuo;ZLuo;)I", line = 21)
    public static final int method847(int arg0, int arg1, class316 arg2, boolean arg3, class316 arg4) {
        field1617++;
        if (arg1 != -1) {
            method847(45, 44, (class316) null, false, (class316) null);
        }
        if (arg0 == 1) {
            int var5 = arg2.field4059;
            int var6 = arg4.field4059;
            if (!arg3) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var6 - var5;
        } else if (arg0 == 2) {
            return class333.method2346(class54.field789, arg4.method2203(arg1 ^ 0x0).field4882, -1, arg2.method2203(-1).field4882);
        } else if (arg0 == 3) {
            if (arg4.field4696.equals("-")) {
                if (arg2.field4696.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg2.field4696.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return class333.method2346(class54.field789, arg4.field4696, -1, arg2.field4696);
            }
        } else if (arg0 == 4) {
            return arg4.method1967(32) ? (arg2.method1967(32) ? 0 : 1) : (arg2.method1967(arg1 ^ 0xFFFFFFDF) ? -1 : 0);
        } else if (arg0 == 5) {
            return arg4.method1968(0) ? (arg2.method1968(0) ? 0 : 1) : (arg2.method1968(0) ? -1 : 0);
        } else if (arg0 == 6) {
            return arg4.method1969((byte) 91) ? (arg2.method1969((byte) -119) ? 0 : 1) : (arg2.method1969((byte) 106) ? -1 : 0);
        } else if (arg0 == 7) {
            return arg4.method1971(false) ? (arg2.method1971(false) ? 0 : 1) : (arg2.method1971(false) ? -1 : 0);
        } else {
            return arg4.field4686 - arg2.field4686;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lh;IIIZ)V", line = 94)
    public void method386(class111 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1620++;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(III)Lh;", line = 111)
    public class111 method404(int arg0, int arg1, int arg2) {
        field1614++;
        return this;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "()Z", line = 126)
    public boolean method390() {
        field1622++;
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V", line = 138)
    public static void method848(boolean arg0) {
        field1618 = null;
        if (!arg0) {
            method848(false);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "()I")
    public abstract int method371();

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIJILko;)V")
    public abstract void method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class155 arg10);

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIII)V")
    public abstract void method391(int arg0, int arg1, int arg2, int arg3, int arg4);
}

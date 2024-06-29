import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class89 {

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "Lqe;")
    public static class179 field1690 = class206.method1380("hint_headicons", (byte) -22);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "J")
    public long field1694;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "Lpc;")
    public static class166 field1685;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "Leh;")
    public static class52 field1689;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "Lib;")
    public class89 field1687;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "Lib;")
    public class89 field1691;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
    public static void method588(byte arg0) {
        field1689 = null;
        if (arg0 != -34) {
            method588((byte) 126);
        }
        field1690 = null;
        field1685 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)Z")
    public final boolean method589(int arg0) {
        field1683++;
        if (this.field1691 == null) {
            return false;
        } else if (arg0 == -1) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZLee;ILb;)V")
    public static final void method590(boolean arg0, class49 arg1, int arg2, class12 arg3) {
        byte[] var4 = null;
        field1688++;
        class36 var5 = class111.field2090;
        synchronized (class111.field2090) {
            for (class127 var6 = (class127) class111.field2090.method242(16711680); var6 != null; var6 = (class127) class111.field2090.method237(10)) {
                if ((long) arg2 == var6.field1694 && var6.field2325 == arg3 && var6.field2316 == 0) {
                    var4 = var6.field2317;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var7 = arg3.method85(arg2, -1127279480);
            arg1.method327(13512, arg2, arg3, var7, arg0);
        } else {
            arg1.method327(13512, arg2, arg3, var4, true);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lra;I)Lnj;")
    public static final class151 method591(class185 arg0, int arg1) {
        field1693++;
        if (arg1 != -1) {
            field1685 = null;
        }
        return new class151(arg0.method1225((byte) -77), arg0.method1225((byte) -77), arg0.method1225((byte) -77), arg0.method1225((byte) -77), arg0.method1244(-27523), arg0.method1244(-27523), arg0.method1243(3));
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V")
    public final void method592(byte arg0) {
        field1692++;
        if (this.field1691 == null) {
            return;
        }
        this.field1691.field1687 = this.field1687;
        this.field1687.field1691 = this.field1691;
        if (arg0 == -128) {
            this.field1687 = null;
            this.field1691 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Leh;B)V")
    public static final void method593(class52 arg0, byte arg1) {
        int var2 = 46 / ((arg1 - 43) / 61);
        field1686++;
        field1689 = arg0;
    }
}

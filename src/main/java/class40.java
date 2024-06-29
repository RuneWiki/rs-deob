import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class40 extends class110 {

    @OriginalMember(owner = "client!di", name = "fb", descriptor = "I")
    private int field880 = 0;

    @OriginalMember(owner = "client!di", name = "lb", descriptor = "I")
    private int field886 = 0;

    @OriginalMember(owner = "client!di", name = "ab", descriptor = "Z")
    public boolean field875 = false;

    @OriginalMember(owner = "client!di", name = "bb", descriptor = "I")
    public int field876;

    @OriginalMember(owner = "client!di", name = "kb", descriptor = "I")
    public int field885;

    @OriginalMember(owner = "client!di", name = "hb", descriptor = "I")
    public int field882;

    @OriginalMember(owner = "client!di", name = "Z", descriptor = "I")
    public int field874;

    @OriginalMember(owner = "client!di", name = "rb", descriptor = "I")
    public int field892;

    @OriginalMember(owner = "client!di", name = "jb", descriptor = "I")
    private int field884;

    @OriginalMember(owner = "client!di", name = "cb", descriptor = "Lfa;")
    private class52 field877;

    @OriginalMember(owner = "client!di", name = "nb", descriptor = "Ldd;")
    private static class35 field888 = class180.method1196((byte) -10, "Unexpected loginserver response)3");

    @OriginalMember(owner = "client!di", name = "gb", descriptor = "Ldd;")
    public static class35 field881 = field888;

    @OriginalMember(owner = "client!di", name = "ib", descriptor = "Lbi;")
    public static class20 field883 = new class20();

    @OriginalMember(owner = "client!di", name = "pb", descriptor = "I")
    public static int field890 = 0;

    @OriginalMember(owner = "client!di", name = "sb", descriptor = "Ldd;")
    public static class35 field893 = class180.method1196((byte) 126, "::autoshadow on");

    @OriginalMember(owner = "client!di", name = "tb", descriptor = "[[[B")
    public static byte[][][] field894 = new byte[4][104][104];

    @OriginalMember(owner = "client!di", name = "qb", descriptor = "Lld;")
    public static class111 field891 = new class111(64);

    @OriginalMember(owner = "client!di", name = "db", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!di", name = "eb", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!di", name = "mb", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!di", name = "ob", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!di", name = "Y", descriptor = "[I")
    public static int[] field873;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "(I)V")
    public static void method381(int arg0) {
        field873 = null;
        field891 = null;
        field888 = null;
        field881 = null;
        if (arg0 == 0) {
            field893 = null;
            field883 = null;
            field894 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(B)Lia;")
    public final class81 method205(byte arg0) {
        field879++;
        class17 var2 = class48.method434(39, this.field884);
        class81 var3;
        if (this.field875) {
            var3 = var2.method151(-1, (byte) -119);
        } else {
            var3 = var2.method151(this.field880, (byte) -116);
        }
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != -115) {
                method381(101);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(II)V")
    public final void method382(int arg0, int arg1) {
        if (arg0 != 0) {
            method381(-19);
        }
        field878++;
        if (this.field875) {
            return;
        }
        this.field886 += arg1;
        while (this.field886 > this.field877.field1159[this.field880]) {
            this.field886 -= this.field877.field1159[this.field880];
            this.field880++;
            if (this.field880 >= this.field877.field1184.length) {
                this.field875 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZII)V")
    public static final void method383(boolean arg0, int arg1, int arg2) {
        field887++;
        if (class59.field1469 < 2 && class128.field2765 == 0 && !class130.field2799) {
            return;
        }
        if (!arg0) {
            method381(-40);
        }
        class35 var3;
        if (class128.field2765 == 1 && class59.field1469 < 2) {
            var3 = class63.method529(new class35[] { class63.field1516, class78.field1817, class159.field3233, class56.field1401 }, (byte) 86);
        } else if (class130.field2799 && class59.field1469 < 2) {
            var3 = class63.method529(new class35[] { class125.field2736, class78.field1817, class165.field3343, class56.field1401 }, (byte) 81);
        } else {
            var3 = class110.method805(0, class59.field1469 - 1);
        }
        if (class59.field1469 > 2) {
            var3 = class63.method529(new class35[] { var3, class65.field1545, class3.method19(class59.field1469 - 2, -29578), class23.field460 }, (byte) 67);
        }
        int var4 = class122.field2673.method1324(var3, arg2 + 4, arg1 + 15, 16777215, 0, class174.field3540, class72.field1718);
        class209.method1377(15, var4 + class122.field2673.method1314(var3), 5488, arg2 + 4, arg1);
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(IIIIIII)V")
    public class40(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field876 = arg1;
        this.field885 = arg4;
        this.field882 = arg2;
        this.field874 = arg5 + arg6;
        this.field892 = arg3;
        this.field884 = arg0;
        int var8 = class48.method434(26, this.field884).field326;
        if (var8 == -1) {
            this.field875 = true;
        } else {
            this.field875 = false;
            this.field877 = class160.method1070((byte) -91, var8);
        }
    }
}

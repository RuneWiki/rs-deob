import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public abstract class class75 {

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILgp;Lgp;Lgp;Lgp;)V", line = 5)
    public static final void method717(int arg0, class561 arg1, class561 arg2, class561 arg3, class561 arg4) {
        if (arg0 != 2259880) {
            return;
        }
        class144.field2227 = arg2;
        class153.field2296 = arg1;
        field1391++;
        class448.field6526 = arg3;
        class148.field2260 = arg4;
        class177.field2593 = new class549[class448.field6526.method3185(-89)][];
        class408.field6063 = new boolean[class448.field6526.method3185(arg0 ^ 0xFFDD8430)];
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(JI)I", line = 23)
    public final int method718(long arg0, int arg1) {
        field1390++;
        if (arg1 >= -84) {
            return -126;
        }
        long var4 = this.method722(27);
        if (var4 > 0L) {
            class210.method1342(-77, var4);
        }
        return this.method716(true, arg0);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)I", line = 39)
    public static final int method719(int arg0, int arg1) {
        if (arg1 != 2259880) {
            method719(-61, 72);
        }
        field1389++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZJ)I")
    public abstract int method716(boolean arg0, long arg1);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V")
    public abstract void method720(boolean arg0);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)J")
    public abstract long method721(int arg0);

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)J")
    public abstract long method722(int arg0);
}

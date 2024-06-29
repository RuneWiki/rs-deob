import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class349 {

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "Lqr;")
    private class65 field4912 = new class65(64);

    @OriginalMember(owner = "client!afa", name = "f", descriptor = "Lwu;")
    private class376 field4917;

    @OriginalMember(owner = "client!afa", name = "g", descriptor = "Lwu;")
    private class376 field4918;

    @OriginalMember(owner = "client!afa", name = "d", descriptor = "[[Z")
    public static boolean[][] field4915 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "Lkg;")
    public static class275 field4914 = new class275(15, 0, 1, 0);

    @OriginalMember(owner = "client!afa", name = "h", descriptor = "I")
    public static int field4919 = 0;

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!afa", name = "e", descriptor = "Lha;")
    public static class59 field4916;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)V", line = 3)
    public static void method2095(int arg0) {
        field4914 = null;
        if (arg0 > 99) {
            field4915 = null;
            field4916 = null;
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(II)Lfba;", line = 17)
    public final class24 method2096(int arg0, int arg1) {
        field4913++;
        class24 var3 = (class24) this.field4912.method552(4, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field4918.method2218((byte) 127, 0, arg1);
        } else {
            var4 = this.field4917.method2218((byte) 122, 0, arg1 & 0x7FFF);
        }
        class24 var5 = new class24();
        if (arg0 != 15076) {
            return null;
        }
        if (var4 != null) {
            var5.method243(new class677(var4), (byte) -1);
        }
        if (arg1 >= 32768) {
            var5.method240((byte) -31);
        }
        this.field4912.method556((byte) 0, (long) arg1, var5);
        return var5;
    }

    @OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(ILwu;Lwu;)V", line = 83)
    public class349(int arg0, class376 arg1, class376 arg2) {
        this.field4917 = arg2;
        this.field4918 = arg1;
        if (this.field4918 != null) {
            this.field4918.method2195(0, 0);
        }
        if (this.field4917 != null) {
            this.field4917.method2195(0, 0);
        }
    }
}

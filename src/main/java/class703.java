import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class703 {

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "I")
    public int field9892 = 0;

    @OriginalMember(owner = "client!rw", name = "d", descriptor = "I")
    public int field9894 = 0;

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "Lvg;")
    private class49 field9893 = new class49(64);

    @OriginalMember(owner = "client!rw", name = "k", descriptor = "Lmn;")
    private class336 field9901 = null;

    @OriginalMember(owner = "client!rw", name = "j", descriptor = "Lri;")
    private class97 field9900;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "Lri;")
    private class97 field9891;

    @OriginalMember(owner = "client!rw", name = "i", descriptor = "[[I")
    public static int[][] field9899 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!rw", name = "e", descriptor = "I")
    public static int field9895;

    @OriginalMember(owner = "client!rw", name = "g", descriptor = "I")
    public static int field9897;

    @OriginalMember(owner = "client!rw", name = "h", descriptor = "I")
    public static int field9898;

    @OriginalMember(owner = "client!rw", name = "f", descriptor = "Ldh;")
    public static class295 field9896;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(JI[ILui;)Ljava/lang/String;", line = 7)
    public final String method3965(long arg0, int arg1, int[] arg2, class210 arg3) {
        field9898++;
        if (arg1 > -77) {
            this.field9901 = null;
        }
        if (this.field9901 != null) {
            String var6 = this.field9901.method467(arg3, -31656, arg0, arg2);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg0);
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IILpca;I)V", line = 32)
    public static final void method3966(int arg0, int arg1, class665 arg2, int arg3) {
        field9897++;
        if (class573.field8182 != null || class453.field6808 || arg2 == null || class579.method3397(arg2, (byte) 74) == null) {
            return;
        }
        class573.field8182 = arg2;
        class409.field6303 = class579.method3397(arg2, (byte) 74);
        class589.field8375 = arg1;
        class38.field520 = false;
        class426.field6477 = arg3;
        class406.field6259 = arg0;
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(ILri;Lri;Lmn;)V", line = 115)
    public class703(int arg0, class97 arg1, class97 arg2, class336 arg3) {
        this.field9901 = arg3;
        this.field9900 = arg2;
        this.field9891 = arg1;
        if (this.field9891 != null) {
            this.field9892 = this.field9891.method949(1, 0);
        }
        if (this.field9900 != null) {
            this.field9894 = this.field9900.method949(1, 0);
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)V", line = 62)
    public static void method3967(byte arg0) {
        field9899 = null;
        field9896 = null;
        if (arg0 != -7) {
            method3967((byte) 70);
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)Lgg;", line = 79)
    public final class159 method3968(int arg0, int arg1) {
        field9895++;
        class159 var3 = (class159) this.field9893.method560(false, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 < 32768) {
            var4 = this.field9891.method926(1, -128, arg0);
        } else {
            var4 = this.field9900.method926(1, -126, arg0 & 0x7FFF);
        }
        class159 var5 = new class159();
        var5.field2721 = this;
        if (var4 != null) {
            var5.method1305(new class6(var4), false);
        }
        if (arg0 >= 32768) {
            var5.method1304(32768);
        }
        this.field9893.method559(var5, (long) arg0, arg1);
        return var5;
    }
}
